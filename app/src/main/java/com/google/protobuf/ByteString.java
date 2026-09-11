package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new p(u0.a);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final l byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    static {
        byteArrayCopier = d.a() ? new j(1) : new j(0);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new h();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i < 1) {
            Locale locale = Locale.ROOT;
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.p("length (", i, ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Index > length: ", i, ", ", i2));
            }
            throw new ArrayIndexOutOfBoundsException(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Index < 0: "));
        }
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            com.google.gson.b.n(androidx.privacysandbox.ads.adservices.java.internal.a.p("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Beginning index larger than ending index: ", i, ", ", i2));
            return 0;
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("End index: ", i2, " >= ", i3));
        return 0;
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? EMPTY : balancedConcat(iterable.iterator(), size);
    }

    public static ByteString copyFromUtf8(String str) {
        return str.isEmpty() ? EMPTY : new p(str.getBytes(StandardCharsets.UTF_8));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i) {
        int iHexDigit = hexDigit(str.charAt(i));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        sbX.append(str.charAt(i));
        sbX.append(" at index ");
        sbX.append(i);
        throw new NumberFormatException(sbX.toString());
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Invalid hexString ", str, " of length ");
            sbX.append(str.length());
            sbX.append(" must be even.");
            throw new NumberFormatException(sbX.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (extractHexDigit(str, i2 + 1) | (extractHexDigit(str, i2) << 4));
        }
        return new p(bArr);
    }

    private static int hexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return c - 'W';
    }

    public static n newCodedBuilder(int i) {
        return new n(i);
    }

    public static q newOutput() {
        return new q(128);
    }

    private static ByteString readChunk(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString chunk = readChunk(inputStream, i);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i = Math.min(i * 2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean subArrayEquals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        checkRange(i, i4, bArr.length);
        checkRange(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b) {
        return b & 255;
    }

    private String truncateAndEscapeForDisplay() {
        return size() <= 50 ? com.google.common.base.i.f(toByteArray()) : com.google.common.base.i.f(substringNoCopy(0, 47).toByteArray()).concat("...");
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer, boolean z) throws x0 {
        boolean zN;
        if (byteBuffer.remaining() == 0) {
            return EMPTY;
        }
        if (z) {
            com.google.android.material.resources.b bVar = o2.a;
            int iPosition = byteBuffer.position();
            int iRemaining = byteBuffer.remaining() + iPosition;
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                zN = bVar.m(byteBuffer.array(), iPosition + iArrayOffset, iArrayOffset + iRemaining);
            } else if (byteBuffer.isDirect()) {
                zN = bVar.o(byteBuffer, iPosition, iRemaining);
            } else {
                bVar.getClass();
                zN = com.google.android.material.resources.b.n(byteBuffer, iPosition, iRemaining);
            }
            if (!zN) {
                throw x0.b();
            }
        }
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byte[] bArr = new byte[byteBufferSlice.remaining()];
        byteBufferSlice.get(bArr);
        return new p(bArr);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() < byteString.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
        }
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size = byteString.size() + size();
        if (size < 128) {
            int size2 = size();
            int size3 = byteString.size();
            byte[] bArr = new byte[size2 + size3];
            copyTo(bArr, 0, 0, size2);
            byteString.copyTo(bArr, 0, size2, size3);
            return wrap(bArr);
        }
        if (this instanceof z1) {
            z1 z1Var = (z1) this;
            ByteString byteString2 = z1Var.z;
            int size4 = byteString.size() + byteString2.size();
            ByteString byteString3 = z1Var.y;
            if (size4 < 128) {
                int size5 = byteString2.size();
                int size6 = byteString.size();
                byte[] bArr2 = new byte[size5 + size6];
                byteString2.copyTo(bArr2, 0, 0, size5);
                byteString.copyTo(bArr2, 0, size5, size6);
                return new z1(byteString3, wrap(bArr2));
            }
            if (byteString3.getTreeDepth() > byteString2.getTreeDepth() && z1Var.B > byteString.getTreeDepth()) {
                return new z1(byteString3, new z1(byteString2, byteString));
            }
        }
        if (size >= z1.b(Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1)) {
            return new z1(this, byteString);
        }
        f1 f1Var = new f1(2);
        f1Var.a(this);
        f1Var.a(byteString);
        ArrayDeque arrayDeque = (ArrayDeque) f1Var.a;
        ByteString z1Var2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            z1Var2 = new z1((ByteString) arrayDeque.pop(), z1Var2);
        }
        return z1Var2;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substringNoCopy(size() - byteString.size()).equals(byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        int size = size();
        if (size != byteString.size()) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsInternal(byteString);
        }
        return false;
    }

    public abstract boolean equalsInternal(ByteString byteString);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new g(this);
    }

    public abstract t newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substringNoCopy(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public abstract ByteString substring(int i, int i2);

    public final ByteString substringNoCopy(int i) {
        return substringNoCopy(i, size());
    }

    public abstract ByteString substringNoCopy(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return u0.a;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strTruncateAndEscapeForDisplay = truncateAndEscapeForDisplay();
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, strTruncateAndEscapeForDisplay, "\">");
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(StandardCharsets.UTF_8);
    }

    public abstract void writeTo(f fVar);

    public abstract void writeTo(OutputStream outputStream);

    public final void writeTo(OutputStream outputStream, int i, int i2) {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2);

    public abstract void writeToReverse(f fVar);

    public static q newOutput(int i) {
        return new q(i);
    }

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public static ByteString readFrom(InputStream inputStream, int i) {
        return readFrom(inputStream, i, i);
    }

    public static ByteString readFrom(InputStream inputStream) {
        return readFrom(inputStream, 256, MAX_READ_FROM_CHUNK_SIZE);
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2, boolean z) throws x0 {
        if (i2 == 0) {
            return EMPTY;
        }
        checkRange(i, i + i2, bArr.length);
        byte[] bArrA = byteArrayCopier.a(bArr, i, i2);
        if (z && !o2.a.m(bArrA, 0, bArrA.length)) {
            throw x0.b();
        }
        return new p(bArrA);
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public final String toString(Charset charset) {
        return isEmpty() ? "" : toStringInternal(charset);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        if (i == 0) {
            return EMPTY;
        }
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new p(bArr);
    }

    @Deprecated
    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    @Deprecated
    public static ByteString copyFrom(String str, String str2) {
        return str.isEmpty() ? EMPTY : new p(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return str.isEmpty() ? EMPTY : new p(str.getBytes(charset));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        try {
            return copyFrom(bArr, i, i2, false);
        } catch (x0 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        try {
            return wrap(byteBuffer, false);
        } catch (x0 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static ByteString wrap(byte[] bArr, int i, int i2, boolean z) throws x0 {
        if (z) {
            if (!o2.a.m(bArr, i, i + i2)) {
                throw x0.b();
            }
        }
        return new k(bArr, i, i2);
    }

    public static ByteString wrap(byte[] bArr) {
        try {
            return wrap(bArr, false);
        } catch (x0 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static ByteString wrap(byte[] bArr, boolean z) throws x0 {
        if (bArr.length == 0) {
            return EMPTY;
        }
        if (z && !o2.a.m(bArr, 0, bArr.length)) {
            throw x0.b();
        }
        return new p(bArr);
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        try {
            return wrap(bArr, i, i2, false);
        } catch (x0 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }
}
