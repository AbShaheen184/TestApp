package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends ByteString {
    public static final int[] C = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Token.LABEL, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int A;
    public final int B;
    public final int e;
    public final ByteString y;
    public final ByteString z;

    public z1(ByteString byteString, ByteString byteString2) {
        this.y = byteString;
        this.z = byteString2;
        int size = byteString.size();
        this.A = size;
        this.e = byteString2.size() + size;
        this.B = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int b(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return C[i];
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        o oVar;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.B);
        arrayDeque.push(this);
        ByteString byteString = this.y;
        while (byteString instanceof z1) {
            z1 z1Var = (z1) byteString;
            arrayDeque.push(z1Var);
            byteString = z1Var.y;
        }
        o oVar2 = (o) byteString;
        while (true) {
            if (!(oVar2 != null)) {
                return arrayList;
            }
            if (oVar2 == null) {
                org.mozilla.javascript.typedarrays.c.a();
                return null;
            }
            do {
                if (arrayDeque.isEmpty()) {
                    oVar = null;
                    break;
                }
                ByteString byteString2 = ((z1) arrayDeque.pop()).z;
                while (byteString2 instanceof z1) {
                    z1 z1Var2 = (z1) byteString2;
                    arrayDeque.push(z1Var2);
                    byteString2 = z1Var2.y;
                }
                oVar = (o) byteString2;
            } while (oVar.isEmpty());
            arrayList.add(oVar2.asReadOnlyByteBuffer());
            oVar2 = oVar;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.e);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.y.copyTo(byteBuffer);
        this.z.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            byteString.copyToInternal(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.z;
        if (i >= i5) {
            byteString2.copyToInternal(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.copyToInternal(bArr, i, i2, i6);
        byteString2.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equalsInternal(ByteString byteString) {
        o oVarB;
        x1 x1Var = new x1(this);
        o oVarB2 = x1Var.next();
        x1 x1Var2 = new x1(byteString);
        o oVarB3 = x1Var2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = oVarB2.size() - i;
            int size2 = oVarB3.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? oVarB2.b(oVarB3, i2, iMin) : oVarB3.b(oVarB2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.e;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                org.mozilla.javascript.c.a();
                return false;
            }
            if (iMin == size) {
                oVarB = x1Var.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                oVarB2 = oVarB2;
                oVarB2 = oVarB;
                oVarB3 = x1Var2.next();
                i2 = 0;
            } else {
                oVarB2 = oVarB2;
                oVarB2 = oVarB;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return this.B;
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        int i2 = this.A;
        return i < i2 ? this.y.internalByteAt(i) : this.z.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return this.e >= b(this.B);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        o oVar;
        ArrayDeque arrayDeque = new ArrayDeque(this.B);
        arrayDeque.push(this);
        ByteString byteString = this.y;
        while (byteString instanceof z1) {
            z1 z1Var = (z1) byteString;
            arrayDeque.push(z1Var);
            byteString = z1Var.y;
        }
        o oVar2 = (o) byteString;
        while (true) {
            if (!(oVar2 != null)) {
                return true;
            }
            if (oVar2 == null) {
                org.mozilla.javascript.typedarrays.c.a();
                return false;
            }
            do {
                if (arrayDeque.isEmpty()) {
                    oVar = null;
                    break;
                }
                ByteString byteString2 = ((z1) arrayDeque.pop()).z;
                while (byteString2 instanceof z1) {
                    z1 z1Var2 = (z1) byteString2;
                    arrayDeque.push(z1Var2);
                    byteString2 = z1Var2.y;
                }
                oVar = (o) byteString2;
            } while (oVar.isEmpty());
            if (!oVar2.isValidUtf8()) {
                byte[] byteArray = toByteArray();
                return o2.a.m(byteArray, 0, byteArray.length);
            }
            oVar2 = oVar;
        }
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new w1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final t newCodedInput() {
        List listAsReadOnlyByteBufferList = asReadOnlyByteBufferList();
        y0 y0Var = new y0();
        ArrayList<ByteBuffer> arrayList = (ArrayList) listAsReadOnlyByteBufferList;
        y0Var.e = arrayList.iterator();
        y0Var.z = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            y0Var.z++;
        }
        y0Var.A = -1;
        if (!y0Var.a()) {
            y0Var.y = u0.b;
            y0Var.B = 0;
            y0Var.F = 0L;
        }
        return t.g(y0Var);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new y1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            return byteString.partialHash(i, i2, i3);
        }
        ByteString byteString2 = this.z;
        if (i2 >= i5) {
            return byteString2.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialHash(byteString.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.e;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        return substringNoCopy(i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substringNoCopy(int i, int i2) {
        int i3 = this.e;
        int iCheckRange = ByteString.checkRange(i, i2, i3);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == i3) {
            return this;
        }
        ByteString byteString = this.y;
        int i4 = this.A;
        if (i2 <= i4) {
            return byteString.substring(i, i2);
        }
        ByteString byteString2 = this.z;
        return i >= i4 ? byteString2.substring(i - i4, i2 - i4) : new z1(byteString.substring(i), byteString2.substring(0, i2 - i4));
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        this.y.writeTo(outputStream);
        this.z.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        ByteString byteString = this.y;
        int i4 = this.A;
        if (i3 <= i4) {
            byteString.writeToInternal(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.z;
        if (i >= i4) {
            byteString2.writeToInternal(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        byteString.writeToInternal(outputStream, i, i5);
        byteString2.writeToInternal(outputStream, 0, i2 - i5);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(f fVar) {
        this.z.writeToReverse(fVar);
        this.y.writeToReverse(fVar);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new w1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(f fVar) {
        this.y.writeTo(fVar);
        this.z.writeTo(fVar);
    }
}
