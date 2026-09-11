package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static final g0 b = new g0(1);
    public final Object a;

    public f1(int i) {
        j1 j1Var;
        switch (i) {
            case 2:
                this.a = new ArrayDeque();
                break;
            default:
                Class cls = d.a;
                try {
                    j1Var = (j1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    j1Var = b;
                }
                j1[] j1VarArr = {g0.b, j1Var};
                e1 e1Var = new e1();
                e1Var.a = j1VarArr;
                byte[] bArr = u0.a;
                this.a = e1Var;
                break;
        }
    }

    public void a(ByteString byteString) {
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof z1)) {
                androidx.core.graphics.b.b(byteString.getClass(), "Has a new type of ByteString been created? Found ");
                return;
            }
            z1 z1Var = (z1) byteString;
            a(z1Var.y);
            a(z1Var.z);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(z1.C, byteString.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iB = z1.b(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iB) {
            arrayDeque.push(byteString);
            return;
        }
        int iB2 = z1.b(iBinarySearch);
        ByteString z1Var2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iB2) {
            z1Var2 = new z1((ByteString) arrayDeque.pop(), z1Var2);
        }
        z1 z1Var3 = new z1(z1Var2, byteString);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(z1.C, z1Var3.e);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= z1.b(iBinarySearch2 + 1)) {
                break;
            } else {
                z1Var3 = new z1((ByteString) arrayDeque.pop(), z1Var3);
            }
        }
        arrayDeque.push(z1Var3);
    }

    public void b(int i, Object obj, a2 a2Var) {
        w wVar = (w) this.a;
        wVar.v(i, 3);
        a2Var.e((b) obj, this);
        wVar.v(i, 4);
    }

    public void c(int i, Object obj, a2 a2Var) {
        b bVar = (b) obj;
        w wVar = (w) this.a;
        wVar.v(i, 2);
        wVar.x(bVar.getSerializedSize(a2Var));
        a2Var.e(bVar, this);
    }

    public f1(w wVar) {
        byte[] bArr = u0.a;
        if (wVar != null) {
            this.a = wVar;
            wVar.a = this;
        } else {
            com.google.gson.b.h("output");
            throw null;
        }
    }
}
