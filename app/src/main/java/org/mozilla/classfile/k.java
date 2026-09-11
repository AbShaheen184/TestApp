package org.mozilla.classfile;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;
    public boolean f;
    public boolean g;

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    public static boolean c(int[] iArr, int[] iArr2, int i, h hVar) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            int iA = iArr2[i2];
            if (i3 == iA) {
                iA = i3;
            } else {
                int i4 = i3 & 255;
                int i5 = iA & 255;
                boolean z2 = i4 == 7;
                boolean z3 = i5 == 7;
                if (z2 && iA == 5) {
                    iA = i3;
                } else if (i4 == 0 || i5 == 0) {
                    iA = 0;
                } else if (i3 != 5 || !z3) {
                    if (z2 && z3) {
                        String strP = com.google.android.material.sidesheet.b.p(i3, hVar);
                        String strP2 = com.google.android.material.sidesheet.b.p(iA, hVar);
                        String str = (String) hVar.k(2);
                        String str2 = (String) hVar.k(4);
                        if (strP.equals(str)) {
                            strP = str2;
                        }
                        if (strP2.equals(str)) {
                            strP2 = str2;
                        }
                        try {
                            Class<?> cls = Class.forName(strP.replace('/', '.'));
                            try {
                                Class<?> cls2 = Class.forName(strP2.replace('/', '.'));
                                if (cls.isAssignableFrom(cls2)) {
                                    iA = i3;
                                } else if (!cls2.isAssignableFrom(cls)) {
                                    if (cls2.isInterface() || cls.isInterface()) {
                                        iA = com.google.android.material.sidesheet.b.a(hVar.a("java/lang/Object"));
                                    } else {
                                        Class<? super Object> superclass = cls2.getSuperclass();
                                        while (true) {
                                            if (superclass != null) {
                                                if (superclass.isAssignableFrom(cls)) {
                                                    String name = superclass.getName();
                                                    int i6 = ClassFileWriter.E;
                                                    iA = com.google.android.material.sidesheet.b.a(hVar.a(name.replace('.', '/')));
                                                    break;
                                                }
                                                superclass = superclass.getSuperclass();
                                            }
                                        }
                                    }
                                }
                            } catch (ClassNotFoundException e) {
                                net.luminis.tls.engine.impl.c.k(e);
                                return false;
                            }
                        } catch (ClassNotFoundException e2) {
                            net.luminis.tls.engine.impl.c.k(e2);
                            return false;
                        }
                    }
                    net.luminis.tls.engine.impl.c.o(coil3.compose.internal.f.e("bad merge attempt between ", com.google.android.material.sidesheet.b.A(i3, hVar), " and ", com.google.android.material.sidesheet.b.A(iA, hVar)));
                    return false;
                }
            }
            iArr[i2] = iA;
            if (i3 != iA) {
                z = true;
            }
        }
        return z;
    }

    public final int[] a() {
        int[] iArr = this.d;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0 && !com.google.android.material.sidesheet.b.x(iArr[length - 1])) {
            length--;
        }
        int i = length + 1;
        int i2 = 0;
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            if (com.google.android.material.sidesheet.b.x(iArr[i4])) {
                i3--;
            }
        }
        int[] iArr2 = new int[i3];
        int i5 = 0;
        while (i2 < i3) {
            iArr2[i2] = iArr[i5];
            if (com.google.android.material.sidesheet.b.x(iArr[i5])) {
                i5++;
            }
            i2++;
            i5++;
        }
        return iArr2;
    }

    public final boolean b(int[] iArr, int i, int[] iArr2, int i2, h hVar) {
        boolean z = this.f;
        int[] iArr3 = this.d;
        if (z) {
            if (iArr3.length == i && this.e.length == i2) {
                return c(iArr3, iArr, i, hVar) || c(this.e, iArr2, i2, hVar);
            }
            net.luminis.tls.engine.impl.c.o("bad merge attempt");
            return false;
        }
        System.arraycopy(iArr, 0, iArr3, 0, i);
        int[] iArr4 = new int[i2];
        this.e = iArr4;
        System.arraycopy(iArr2, 0, iArr4, 0, i2);
        this.f = true;
        return true;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.l(this.a, "sb ");
    }
}
