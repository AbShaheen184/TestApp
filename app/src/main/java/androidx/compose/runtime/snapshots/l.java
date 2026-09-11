package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable, kotlin.jvm.internal.markers.a {
    public static final l B = new l(0, 0, 0, null);
    public final long[] A;
    public final long e;
    public final long y;
    public final long z;

    public l(long j, long j2, long j3, long[] jArr) {
        this.e = j;
        this.y = j2;
        this.z = j3;
        this.A = jArr;
    }

    public final l b(l lVar) {
        l lVarC;
        long[] jArr;
        l lVar2 = B;
        if (lVar == lVar2) {
            return this;
        }
        if (this == lVar2) {
            return lVar2;
        }
        long j = lVar.z;
        long j2 = lVar.z;
        long[] jArr2 = lVar.A;
        long j3 = lVar.y;
        long j4 = lVar.e;
        long j5 = this.z;
        if (j == j5 && jArr2 == (jArr = this.A)) {
            return new l(this.e & (~j4), this.y & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            lVarC = this;
            for (long j6 : jArr2) {
                lVarC = lVarC.c(j6);
            }
        } else {
            lVarC = this;
        }
        long j7 = 0;
        if (j3 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j3) != j7) {
                    lVarC = lVarC.c(((long) i) + j2);
                }
                i++;
                j7 = j7;
            }
        }
        long j8 = j7;
        if (j4 != j8) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != j8) {
                    lVarC = lVarC.c(((long) i2) + j2 + ((long) 64));
                }
            }
        }
        return lVarC;
    }

    public final l c(long j) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j2 = j - this.z;
        long j3 = 0;
        if (kotlin.jvm.internal.l.c(j2, j3) >= 0 && kotlin.jvm.internal.l.c(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.y;
            if ((j5 & j4) != 0) {
                return new l(this.e, j5 & (~j4), this.z, this.A);
            }
        } else if (kotlin.jvm.internal.l.c(j2, 64) >= 0 && kotlin.jvm.internal.l.c(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.e;
            if ((j7 & j6) != 0) {
                return new l(j7 & (~j6), this.y, this.z, this.A);
            }
        } else if (kotlin.jvm.internal.l.c(j2, j3) < 0 && (jArr = this.A) != null && (iC = r.c(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iC > 0) {
                    kotlin.collections.n.F(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i) {
                    kotlin.collections.n.F(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new l(this.e, this.y, this.z, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.z;
        long j3 = 0;
        if (kotlin.jvm.internal.l.c(j2, j3) >= 0 && kotlin.jvm.internal.l.c(j2, 64) < 0) {
            return ((1 << ((int) j2)) & this.y) != 0;
        }
        if (kotlin.jvm.internal.l.c(j2, 64) < 0 || kotlin.jvm.internal.l.c(j2, 128) >= 0) {
            return kotlin.jvm.internal.l.c(j2, j3) <= 0 && (jArr = this.A) != null && r.c(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) - 64)) & this.e) != 0;
    }

    public final l e(l lVar) {
        l lVarF;
        l lVarF2;
        long[] jArr;
        l lVar2 = B;
        if (lVar == lVar2) {
            return this;
        }
        if (this == lVar2) {
            return lVar;
        }
        long j = lVar.z;
        long j2 = lVar.z;
        long[] jArr2 = lVar.A;
        long j3 = lVar.y;
        long j4 = lVar.e;
        long j5 = this.z;
        long j6 = this.y;
        long j7 = this.e;
        if (j == j5 && jArr2 == (jArr = this.A)) {
            return new l(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.A;
        if (jArr3 != null) {
            if (jArr2 != null) {
                lVarF = this;
                for (long j8 : jArr2) {
                    lVarF = lVarF.f(j8);
                }
            } else {
                lVarF = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        lVarF = lVarF.f(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        lVarF = lVarF.f(((long) i) + j2 + ((long) 64));
                    }
                    i++;
                }
            }
            return lVarF;
        }
        if (jArr3 != null) {
            lVarF2 = lVar;
            for (long j9 : jArr3) {
                lVarF2 = lVarF2.f(j9);
            }
        } else {
            lVarF2 = lVar;
        }
        long j10 = this.z;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    lVarF2 = lVarF2.f(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    lVarF2 = lVarF2.f(((long) i) + j10 + ((long) 64));
                }
                i++;
            }
        }
        return lVarF2;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0170  */
    public final l f(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        char c;
        long[] jArr3;
        androidx.collection.b0 b0Var;
        long j5 = this.z;
        long j6 = j - j5;
        long j7 = 0;
        int iC = kotlin.jvm.internal.l.c(j6, j7);
        long j8 = this.y;
        char c2 = '@';
        if (iC < 0 || kotlin.jvm.internal.l.c(j6, 64) >= 0) {
            long j9 = 64;
            int iC2 = kotlin.jvm.internal.l.c(j6, j9);
            long j10 = this.e;
            if (iC2 < 0 || kotlin.jvm.internal.l.c(j6, 128) >= 0) {
                long j11 = 128;
                int iC3 = kotlin.jvm.internal.l.c(j6, j11);
                long[] jArr4 = this.A;
                if (iC3 < 0) {
                    if (jArr4 == null) {
                        return new l(this.e, this.y, this.z, new long[]{j});
                    }
                    int iC4 = r.c(jArr4, j);
                    if (iC4 < 0) {
                        int i = -(iC4 + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        kotlin.collections.n.F(jArr4, jArr5, 0, 0, i);
                        kotlin.collections.n.F(jArr4, jArr5, i + 1, i, length);
                        jArr5[i] = j;
                        return new l(this.e, this.y, this.z, jArr5);
                    }
                } else if (!d(j)) {
                    long j12 = 1;
                    long j13 = ((j + j12) / j9) * j9;
                    if (kotlin.jvm.internal.l.c(j13, j7) < 0) {
                        j13 = (Long.MAX_VALUE - j11) + j12;
                    }
                    long j14 = j5;
                    long j15 = j10;
                    com.google.firebase.platforminfo.c cVar = null;
                    while (true) {
                        if (kotlin.jvm.internal.l.c(j14, j13) >= 0) {
                            j2 = j8;
                            j3 = j14;
                            jArr = null;
                            break;
                        }
                        if (j8 != 0) {
                            if (cVar == null) {
                                cVar = new com.google.firebase.platforminfo.c();
                                if (jArr4 != null) {
                                    long[] jArrCopyOf = Arrays.copyOf(jArr4, jArr4.length);
                                    jArr3 = null;
                                    b0Var = new androidx.collection.b0(jArrCopyOf.length);
                                    int i2 = b0Var.b;
                                    if (i2 < 0) {
                                        com.google.gson.b.n("");
                                        throw null;
                                    }
                                    j4 = j13;
                                    if (jArrCopyOf.length != 0) {
                                        int length2 = jArrCopyOf.length + i2;
                                        long[] jArr6 = b0Var.a;
                                        if (jArr6.length < length2) {
                                            b0Var.a = Arrays.copyOf(jArr6, Math.max(length2, (jArr6.length * 3) / 2));
                                        }
                                        long[] jArr7 = b0Var.a;
                                        int i3 = b0Var.b;
                                        if (i2 != i3) {
                                            kotlin.collections.n.F(jArr7, jArr7, jArrCopyOf.length + i2, i2, i3);
                                        }
                                        kotlin.collections.n.F(jArrCopyOf, jArr7, i2, 0, jArrCopyOf.length);
                                        b0Var.b += jArrCopyOf.length;
                                    }
                                } else {
                                    j4 = j13;
                                    jArr3 = null;
                                    b0Var = new androidx.collection.b0(16);
                                }
                                cVar.e = b0Var;
                            } else {
                                j4 = j13;
                                j14 = j14;
                                jArr3 = null;
                            }
                            c = '@';
                            for (int i4 = 0; i4 < 64; i4++) {
                                if (((1 << i4) & j8) != 0) {
                                    ((androidx.collection.b0) cVar.e).a(j14 + ((long) i4));
                                }
                            }
                        } else {
                            j4 = j13;
                            j14 = j14;
                            c = c2;
                            jArr3 = null;
                        }
                        if (j15 == 0) {
                            jArr = jArr3;
                            j3 = j4;
                            j2 = 0;
                            break;
                        }
                        j14 += j9;
                        c2 = c;
                        j8 = j15;
                        j13 = j4;
                        j15 = 0;
                    }
                    if (cVar == null) {
                        jArr2 = jArr4;
                    } else {
                        androidx.collection.b0 b0Var2 = (androidx.collection.b0) cVar.e;
                        int i5 = b0Var2.b;
                        if (i5 != 0) {
                            jArr = new long[i5];
                            long[] jArr8 = b0Var2.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr[i6] = jArr8[i6];
                            }
                        }
                        long[] jArr9 = jArr;
                        if (jArr9 == null) {
                            jArr2 = jArr4;
                        } else {
                            jArr2 = jArr9;
                        }
                    }
                    return new l(j15, j2, j3, jArr2).f(j);
                }
            } else {
                long j16 = 1 << (((int) j6) - 64);
                if ((j10 & j16) == 0) {
                    return new l(j10 | j16, this.y, this.z, this.A);
                }
            }
        } else {
            long j17 = 1 << ((int) j6);
            if ((j8 & j17) == 0) {
                return new l(this.e, j8 | j17, this.z, this.A);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return com.google.android.material.resources.g.g(new k(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
