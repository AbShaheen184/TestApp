package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o {
    public final byte[] e;

    public p(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.e).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.o
    public final boolean b(ByteString byteString, int i, int i2) {
        int size = byteString.size();
        byte[] bArr = this.e;
        if (i2 > size) {
            throw new IllegalArgumentException("Length too large: " + i2 + bArr.length);
        }
        int i3 = i + i2;
        if (i3 > byteString.size()) {
            StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Ran off end of other: ", ", ", i, ", ", i2);
            sbW.append(byteString.size());
            throw new IllegalArgumentException(sbW.toString());
        }
        if (byteString instanceof p) {
            return ByteString.subArrayEquals(bArr, 0, ((p) byteString).e, i, i2);
        }
        if (!(byteString instanceof k)) {
            return byteString.substringNoCopy(i, i3).equals(substringNoCopy(0, i2));
        }
        k kVar = (k) byteString;
        return ByteString.subArrayEquals(bArr, 0, kVar.e, kVar.y + i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        return this.e[i];
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.e);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.e, i, bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equalsInternal(ByteString byteString) {
        boolean z = byteString instanceof p;
        byte[] bArr = this.e;
        if (z) {
            return Arrays.equals(bArr, ((p) byteString).e);
        }
        return byteString instanceof k ? b(byteString, 0, bArr.length) : byteString.equalsInternal(this);
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        return this.e[i];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        com.google.android.material.resources.b bVar = o2.a;
        byte[] bArr = this.e;
        return bVar.m(bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.ByteString
    public final t newCodedInput() {
        byte[] bArr = this.e;
        return t.f(bArr, 0, bArr.length, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        byte[] bArr = this.e;
        return new ByteArrayInputStream(bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        return u0.b(i, this.e, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.e.length;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        byte[] bArr = this.e;
        int iCheckRange = ByteString.checkRange(i, i2, bArr.length);
        return iCheckRange == 0 ? ByteString.EMPTY : new k(bArr, i, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substringNoCopy(int i, int i2) {
        byte[] bArr = this.e;
        int iCheckRange = ByteString.checkRange(i, i2, bArr.length);
        return iCheckRange == 0 ? ByteString.EMPTY : new k(bArr, i, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.e, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(f fVar) {
        byte[] bArr = this.e;
        fVar.a(bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.e, i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }
}
