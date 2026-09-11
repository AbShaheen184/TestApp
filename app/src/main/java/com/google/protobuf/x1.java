package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements Iterator {
    public final ArrayDeque e;
    public o y;

    public x1(ByteString byteString) {
        if (!(byteString instanceof z1)) {
            this.e = null;
            this.y = (o) byteString;
            return;
        }
        z1 z1Var = (z1) byteString;
        ArrayDeque arrayDeque = new ArrayDeque(z1Var.B);
        this.e = arrayDeque;
        arrayDeque.push(z1Var);
        ByteString byteString2 = z1Var.y;
        while (byteString2 instanceof z1) {
            z1 z1Var2 = (z1) byteString2;
            this.e.push(z1Var2);
            byteString2 = z1Var2.y;
        }
        this.y = (o) byteString2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o next() {
        o oVar;
        o oVar2 = this.y;
        if (oVar2 == null) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        do {
            ArrayDeque arrayDeque = this.e;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                oVar = null;
                break;
            }
            ByteString byteString = ((z1) arrayDeque.pop()).z;
            while (byteString instanceof z1) {
                z1 z1Var = (z1) byteString;
                arrayDeque.push(z1Var);
                byteString = z1Var.y;
            }
            oVar = (o) byteString;
        } while (oVar.isEmpty());
        this.y = oVar;
        return oVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
