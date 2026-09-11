package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.extractor.h0;
import com.app.mlounge.emulator.LibretroCore;
import java.util.Arrays;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public h0 h;
    public h0 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public h0 v;
    public long w;
    public final androidx.media3.common.util.v b = new androidx.media3.common.util.v(new byte[7], 7);
    public final androidx.media3.common.util.w c = new androidx.media3.common.util.w(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = LibretroCore.SCREEN_WIDTH;

    public e(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = LibretroCore.SCREEN_WIDTH;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.w wVar) {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.h.getClass();
        String str = j0.a;
        while (wVar.a() > 0) {
            int i7 = this.j;
            byte b2 = -1;
            androidx.media3.common.util.w wVar2 = this.c;
            int i8 = 3;
            androidx.media3.common.util.v vVar = this.b;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = wVar.a;
                int i12 = wVar.b;
                int i13 = wVar.c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        int i16 = bArr[i12];
                        int i17 = i16 & 255;
                        if (this.l == 512 && (((65280 | ((((byte) i17) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i18 = i12 - 1;
                                wVar.M(i12);
                                byte[] bArr2 = vVar.b;
                                if (wVar.a() < i11) {
                                    b = -1;
                                } else {
                                    wVar.k(bArr2, i9, i11);
                                    vVar.m(i10);
                                    int iG = vVar.g(i11);
                                    int i19 = this.o;
                                    if (i19 == -1 || iG == i19) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = vVar.b;
                                            if (wVar.a() >= i11) {
                                                wVar.k(bArr3, i9, i11);
                                                vVar.m(2);
                                                i4 = 4;
                                                if (vVar.g(4) != this.p) {
                                                    b = -1;
                                                } else {
                                                    wVar.M(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = vVar.b;
                                        if (wVar.a() >= i4) {
                                            wVar.k(bArr4, i9, i4);
                                            vVar.m(14);
                                            int iG2 = vVar.g(13);
                                            if (iG2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = wVar.a;
                                                int i20 = wVar.c;
                                                int i21 = i18 + iG2;
                                                if (i21 < i20) {
                                                    byte b3 = bArr5[i21];
                                                    b = -1;
                                                    if (b3 == -1) {
                                                        int i22 = i21 + 1;
                                                        if (i22 != i20) {
                                                            int i23 = bArr5[i22];
                                                            if ((((65280 | ((i23 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((i23 & 8) >> 3) == iG) {
                                                            }
                                                        }
                                                    } else if (b3 == 73 && ((i5 = i21 + 1) == i20 || (bArr5[i5] == 68 && ((i6 = i21 + 2) == i20 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.q = (i16 & 8) >> 3;
                            this.m = (i16 & 1) == 0;
                            if (this.n) {
                                this.j = i15;
                                this.k = 0;
                            } else {
                                this.j = 1;
                                this.k = 0;
                            }
                            wVar.M(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i24 = this.l;
                        int i25 = i17 | i24;
                        if (i25 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 768;
                        } else if (i25 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 512;
                        } else if (i25 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        } else if (i25 != 1075) {
                            c = 256;
                            if (i24 != 256) {
                                this.l = LibretroCore.SCREEN_WIDTH;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            wVar2.M(0);
                            wVar.M(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        wVar.M(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = wVar2.a;
                    int iMin = Math.min(wVar.a(), 10 - this.k);
                    wVar.k(bArr6, this.k, iMin);
                    int i26 = this.k + iMin;
                    this.k = i26;
                    if (i26 == 10) {
                        this.i.f(10, wVar2);
                        wVar2.M(6);
                        h0 h0Var = this.i;
                        int iY = wVar2.y() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = h0Var;
                        this.w = 0L;
                        this.t = iY;
                    }
                } else if (i7 == 3) {
                    int i27 = this.m ? 7 : 5;
                    byte[] bArr7 = vVar.b;
                    int iMin2 = Math.min(wVar.a(), i27 - this.k);
                    wVar.k(bArr7, this.k, iMin2);
                    int i28 = this.k + iMin2;
                    this.k = i28;
                    if (i28 == i27) {
                        vVar.m(0);
                        if (this.r) {
                            vVar.o(10);
                        } else {
                            int iG3 = vVar.g(2) + 1;
                            if (iG3 != 2) {
                                androidx.media3.common.util.c.t("AdtsReader", "Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = 2;
                            }
                            vVar.o(5);
                            int iG4 = vVar.g(3);
                            int i29 = this.p;
                            byte[] bArr8 = {(byte) (((iG3 << 3) & 248) | ((i29 >> 1) & 7)), (byte) (((iG4 << 3) & 120) | ((i29 << 7) & 128))};
                            androidx.media3.extractor.a aVarN = androidx.media3.extractor.b.n(new androidx.media3.common.util.v(bArr8, 2), false);
                            androidx.media3.common.q qVar = new androidx.media3.common.q();
                            qVar.a = this.g;
                            qVar.m = i0.p(this.f);
                            qVar.n = i0.p("audio/mp4a-latm");
                            qVar.j = aVarN.a;
                            qVar.F = aVarN.c;
                            qVar.G = aVarN.b;
                            qVar.q = Collections.singletonList(bArr8);
                            qVar.d = this.d;
                            qVar.f = this.e;
                            androidx.media3.common.r rVar = new androidx.media3.common.r(qVar);
                            this.s = 1024000000 / ((long) rVar.H);
                            this.h.e(rVar);
                            this.r = true;
                        }
                        vVar.o(4);
                        int iG5 = vVar.g(13);
                        int i30 = iG5 - 7;
                        if (this.m) {
                            i30 = iG5 - 9;
                        }
                        h0 h0Var2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = h0Var2;
                        this.w = j;
                        this.t = i30;
                    }
                } else {
                    if (i7 != 4) {
                        org.mozilla.javascript.c.a();
                        return;
                    }
                    int iMin3 = Math.min(wVar.a(), this.t - this.k);
                    this.v.f(iMin3, wVar);
                    int i31 = this.k + iMin3;
                    this.k = i31;
                    if (i31 == this.t) {
                        com.google.android.material.motion.a.q(this.u != -9223372036854775807L);
                        this.v.g(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = LibretroCore.SCREEN_WIDTH;
                    }
                }
            } else if (wVar.a() != 0) {
                vVar.b[0] = wVar.a[wVar.b];
                vVar.m(2);
                int iG6 = vVar.g(4);
                int i32 = this.p;
                if (i32 == -1 || iG6 == i32) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = iG6;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = LibretroCore.SCREEN_WIDTH;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        this.u = j;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.g = e0Var.e;
        e0Var.b();
        h0 h0VarU = pVar.u(e0Var.d, 1);
        this.h = h0VarU;
        this.v = h0VarU;
        if (!this.a) {
            this.i = new androidx.media3.extractor.m();
            return;
        }
        e0Var.a();
        e0Var.b();
        h0 h0VarU2 = pVar.u(e0Var.d, 5);
        this.i = h0VarU2;
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        e0Var.b();
        qVar.a = e0Var.e;
        qVar.m = i0.p(this.f);
        qVar.n = i0.p("application/id3");
        h0VarU2.e(new androidx.media3.common.r(qVar));
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
    }
}
