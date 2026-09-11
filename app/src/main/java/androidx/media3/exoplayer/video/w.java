package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final k a;
    public final b0 b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public androidx.media3.common.util.e0 l = androidx.media3.common.util.e0.a;
    public final boolean o = true;

    public w(Context context, k kVar, long j) {
        this.a = kVar;
        this.c = j;
        this.b = new b0(context);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:113:0x0205  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:115:0x020b  */
    /* JADX WARN: Code duplicated, block: B:119:0x021f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0238  */
    /* JADX WARN: Code duplicated, block: B:127:0x023b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0253  */
    /* JADX WARN: Code duplicated, block: B:132:0x025d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0265  */
    /* JADX WARN: Code duplicated, block: B:135:0x0268  */
    /* JADX WARN: Code duplicated, block: B:137:0x026c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0270  */
    /* JADX WARN: Code duplicated, block: B:140:0x0277  */
    /* JADX WARN: Code duplicated, block: B:144:0x0287  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0184  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, v vVar) {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        b0 b0Var;
        long j8;
        int i3;
        long j9;
        y yVar;
        long j10;
        boolean z4;
        long j11;
        int i4;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long jAbs;
        long j18;
        long j19;
        long j20;
        long j21;
        float f;
        float f2;
        long j22;
        e eVar;
        long j23;
        d dVar;
        long j24;
        vVar.a = -9223372036854775807L;
        vVar.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            b0 b0Var2 = this.b;
            j5 = -9223372036854775807L;
            long j25 = b0Var2.n;
            if (j25 != -1) {
                b0Var2.q = j25;
                b0Var2.r = b0Var2.o;
                b0Var2.s = b0Var2.p;
                b0Var2.k = b0Var2.l;
            }
            b0Var2.m++;
            e eVar2 = b0Var2.a;
            j6 = 1000;
            long j26 = j * 1000;
            eVar2.a.b(j26);
            if (eVar2.a.a()) {
                eVar2.c = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (eVar2.d != -9223372036854775807L) {
                    if (eVar2.c) {
                        d dVar2 = eVar2.b;
                        long j27 = dVar2.d;
                        if (j27 == 0 ? false : dVar2.g[(int) ((j27 - 1) % 15)]) {
                            eVar2.b.c();
                            eVar2.b.b(eVar2.d);
                        }
                    } else {
                        eVar2.b.c();
                        eVar2.b.b(eVar2.d);
                    }
                    eVar2.c = true;
                    eVar2.b.b(j26);
                }
            }
            if (eVar2.c && eVar2.b.a()) {
                d dVar3 = eVar2.a;
                eVar2.a = eVar2.b;
                eVar2.b = dVar3;
                eVar2.c = false;
            }
            eVar2.d = j26;
            eVar2.e = eVar2.a.a() ? 0 : eVar2.e + 1;
            b0Var2.c();
            this.h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long jQ = (long) ((j - j2) / ((double) this.k));
        if (this.d) {
            this.l.getClass();
            jQ -= j0.Q(SystemClock.elapsedRealtime()) - j3;
        }
        vVar.a = jQ;
        if (!z || z2) {
            if (this.m || !this.o) {
                if (!this.o) {
                    this.n = true;
                }
                int i5 = 2;
                if (this.i == j5 || this.j) {
                    int i6 = this.e;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            i = 3;
                            i2 = 5;
                        } else if (i6 == 2) {
                            i = 3;
                            i2 = 5;
                            if (j2 >= j4) {
                            }
                        } else {
                            if (i6 != 3) {
                                org.mozilla.javascript.c.a();
                                return 0;
                            }
                            this.l.getClass();
                            i = 3;
                            i2 = 5;
                            long jQ2 = j0.Q(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j28 = this.f;
                                if (j28 == j5 || j28 == j2 || jQ >= -30000 || jQ2 <= 100000) {
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        i = 3;
                        i2 = 5;
                        z3 = this.d;
                    }
                    if (z3) {
                        return 0;
                    }
                    if (this.d && j2 != this.f) {
                        this.l.getClass();
                        long jNanoTime = System.nanoTime();
                        b0Var = this.b;
                        j8 = (vVar.a * j6) + jNanoTime;
                        if (b0Var.q != -1) {
                            if (b0Var.a.a.a()) {
                                eVar = b0Var.a;
                                if (eVar.a.a()) {
                                    dVar = eVar.a;
                                    j9 = -30000;
                                    j24 = dVar.e;
                                    i3 = 1;
                                    if (j24 == j7) {
                                        j23 = j7;
                                    } else {
                                        j23 = dVar.f / j24;
                                    }
                                } else {
                                    i3 = 1;
                                    j9 = -30000;
                                    j23 = j5;
                                }
                                f = (b0Var.m - b0Var.q) * j23;
                                f2 = b0Var.i;
                            } else {
                                i3 = 1;
                                j9 = -30000;
                                f = (j - b0Var.s) * j6;
                                f2 = b0Var.i;
                            }
                            j22 = b0Var.r + ((long) (f / f2));
                            if (Math.abs(j8 - j22) <= 20000000) {
                                j8 = j22;
                            } else {
                                b0Var.b();
                            }
                        } else {
                            i3 = 1;
                            j9 = -30000;
                            i5 = 2;
                        }
                        b0Var.n = b0Var.m;
                        b0Var.o = j8;
                        b0Var.p = j;
                        yVar = b0Var.c;
                        if (yVar != null) {
                            j12 = yVar.z;
                            j13 = b0Var.c.A;
                            if (j12 != j5 && j13 != j5) {
                                j14 = (((j8 - j12) / j13) * j13) + j12;
                                if (j8 <= j14) {
                                    j15 = j14 - j13;
                                } else {
                                    j14 += j13;
                                    j15 = j14;
                                }
                                j16 = j14 - j8;
                                j17 = j8 - j15;
                                jAbs = Math.abs(j16 - j17);
                                if (jAbs < j13 / 2) {
                                    j19 = j13;
                                    j20 = j19 / 4;
                                    if (jAbs < j20) {
                                        j18 = j15;
                                        j21 = b0Var.k;
                                        if (j21 != j7) {
                                            b0Var.l = j21;
                                        } else {
                                            if (j16 < j17) {
                                                j20 = -j20;
                                            }
                                            b0Var.l = j20;
                                        }
                                    } else {
                                        j18 = j15;
                                        b0Var.l = j7;
                                    }
                                } else {
                                    j18 = j15;
                                    j19 = j13;
                                    b0Var.l = b0Var.k;
                                }
                                if (j16 + b0Var.l >= j17) {
                                    j14 = j18;
                                }
                                j8 = j14 - ((j19 * 80) / 100);
                            }
                        }
                        vVar.b = j8;
                        j10 = (j8 - jNanoTime) / j6;
                        vVar.a = j10;
                        if (this.i != j5 || this.j) {
                            z4 = 0;
                        } else {
                            z4 = i3;
                        }
                        if (this.a.P0(j10, j2, z2, z4)) {
                            return 4;
                        }
                        j11 = vVar.a;
                        if (j11 < j9 || z2) {
                            i4 = 0;
                        } else {
                            i4 = i3;
                        }
                        if (i4 != 0) {
                            if (z4 != 0) {
                                return i;
                            }
                            return i5;
                        }
                        if (j11 > 50000) {
                            return i3;
                        }
                    }
                    return i2;
                }
                i = 3;
                i2 = 5;
                z3 = false;
                if (z3) {
                    return 0;
                }
                if (this.d) {
                    this.l.getClass();
                    long jNanoTime2 = System.nanoTime();
                    b0Var = this.b;
                    j8 = (vVar.a * j6) + jNanoTime2;
                    if (b0Var.q != -1) {
                        if (b0Var.a.a.a()) {
                            eVar = b0Var.a;
                            if (eVar.a.a()) {
                                dVar = eVar.a;
                                j9 = -30000;
                                j24 = dVar.e;
                                i3 = 1;
                                if (j24 == j7) {
                                    j23 = j7;
                                } else {
                                    j23 = dVar.f / j24;
                                }
                            } else {
                                i3 = 1;
                                j9 = -30000;
                                j23 = j5;
                            }
                            f = (b0Var.m - b0Var.q) * j23;
                            f2 = b0Var.i;
                        } else {
                            i3 = 1;
                            j9 = -30000;
                            f = (j - b0Var.s) * j6;
                            f2 = b0Var.i;
                        }
                        j22 = b0Var.r + ((long) (f / f2));
                        if (Math.abs(j8 - j22) <= 20000000) {
                            j8 = j22;
                        } else {
                            b0Var.b();
                        }
                    } else {
                        i3 = 1;
                        j9 = -30000;
                        i5 = 2;
                    }
                    b0Var.n = b0Var.m;
                    b0Var.o = j8;
                    b0Var.p = j;
                    yVar = b0Var.c;
                    if (yVar != null) {
                        j12 = yVar.z;
                        j13 = b0Var.c.A;
                        if (j12 != j5) {
                            j14 = (((j8 - j12) / j13) * j13) + j12;
                            if (j8 <= j14) {
                                j15 = j14 - j13;
                            } else {
                                j14 += j13;
                                j15 = j14;
                            }
                            j16 = j14 - j8;
                            j17 = j8 - j15;
                            jAbs = Math.abs(j16 - j17);
                            if (jAbs < j13 / 2) {
                                j19 = j13;
                                j20 = j19 / 4;
                                if (jAbs < j20) {
                                    j18 = j15;
                                    j21 = b0Var.k;
                                    if (j21 != j7) {
                                        b0Var.l = j21;
                                    } else {
                                        if (j16 < j17) {
                                            j20 = -j20;
                                        }
                                        b0Var.l = j20;
                                    }
                                } else {
                                    j18 = j15;
                                    b0Var.l = j7;
                                }
                            } else {
                                j18 = j15;
                                j19 = j13;
                                b0Var.l = b0Var.k;
                            }
                            if (j16 + b0Var.l >= j17) {
                                j14 = j18;
                            }
                            j8 = j14 - ((j19 * 80) / 100);
                        }
                    }
                    vVar.b = j8;
                    j10 = (j8 - jNanoTime2) / j6;
                    vVar.a = j10;
                    if (this.i != j5) {
                        z4 = 0;
                    } else {
                        z4 = 0;
                    }
                    if (this.a.P0(j10, j2, z2, z4)) {
                        return 4;
                    }
                    j11 = vVar.a;
                    if (j11 < j9) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        if (z4 != 0) {
                            return i;
                        }
                        return i5;
                    }
                    if (j11 > 50000) {
                        return i3;
                    }
                }
                return i2;
            }
            if (this.a.P0(jQ, j2, z2, true)) {
                return 4;
            }
            if (!this.d || vVar.a >= 30000) {
                this.n = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.n && (!this.m || !this.o)))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.j = z;
        long j = this.c;
        if (j > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = j0.Q(SystemClock.elapsedRealtime());
        b0 b0Var = this.b;
        b0Var.d = true;
        b0Var.b();
        DisplayManager displayManager = (DisplayManager) b0Var.b.getSystemService("display");
        y a0Var = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                a0Var = Build.VERSION.SDK_INT >= 33 ? new a0(choreographer, displayManager) : new z(choreographer, displayManager);
            } catch (RuntimeException e) {
                androidx.media3.common.util.c.u("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        b0Var.c = a0Var;
        if (a0Var != null) {
            a0Var.a();
        }
        b0Var.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                org.mozilla.javascript.c.a();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f) {
        b0 b0Var = this.b;
        b0Var.f = f;
        e eVar = b0Var.a;
        eVar.a.c();
        eVar.b.c();
        eVar.c = false;
        eVar.d = -9223372036854775807L;
        eVar.e = 0;
        b0Var.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        b0 b0Var = this.b;
        if (b0Var.e != surface) {
            b0Var.a();
            b0Var.e = surface;
            b0Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        com.google.android.material.motion.a.f(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        b0 b0Var = this.b;
        b0Var.i = f;
        b0Var.d(false);
    }
}
