package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {
    public final byte[] e;
    public final int y;
    public final int z;

    public k(byte[] bArr, int i, int i2) {
        ByteString.checkRange(i, i + i2, bArr.length);
        this.e = bArr;
        this.y = i;
        this.z = i2;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.e, this.y, this.z).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.o
    public final boolean b(ByteString byteString, int i, int i2) {
        if (i2 > byteString.size()) {
            throw new IllegalArgumentException("Length too large: " + i2 + this.z);
        }
        int i3 = i + i2;
        if (i3 > byteString.size()) {
            StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Ran off end of other: ", ", ", i, ", ", i2);
            sbW.append(byteString.size());
            throw new IllegalArgumentException(sbW.toString());
        }
        boolean z = byteString instanceof p;
        byte[] bArr = this.e;
        int i4 = this.y;
        if (z) {
            return ByteString.subArrayEquals(bArr, i4, ((p) byteString).e, i, i2);
        }
        if (!(byteString instanceof k)) {
            return byteString.substringNoCopy(i, i3).equals(substringNoCopy(i4, i2 + i4));
        }
        k kVar = (k) byteString;
        return ByteString.subArrayEquals(bArr, i4, kVar.e, kVar.y + i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.z);
        return this.e[this.y + i];
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.e, this.y, this.z);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.e, this.y + i, bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equalsInternal(ByteString byteString) {
        return ((byteString instanceof p) || (byteString instanceof k)) ? b(byteString, 0, this.z) : byteString.equalsInternal(this);
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        return this.e[this.y + i];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int i = this.z;
        int i2 = this.y;
        return o2.a.m(this.e, i2, i + i2);
    }

    @Override // com.google.protobuf.ByteString
    public final t newCodedInput() {
        return t.f(this.e, this.y, this.z, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.e, this.y, this.z);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        return u0.b(i, this.e, this.y + i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.z;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, this.z);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        return new k(this.e, this.y + i, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substringNoCopy(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, this.z);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        return new k(this.e, this.y + i, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.e, this.y, this.z, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(f fVar) {
        fVar.a(this.e, this.y, this.z);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.e, this.y + i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }
}
