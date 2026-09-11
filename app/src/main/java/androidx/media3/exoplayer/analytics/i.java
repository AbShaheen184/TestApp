package androidx.media3.exoplayer.analytics;

import androidx.media3.common.t0;
import androidx.media3.common.u0;
import androidx.media3.common.util.j0;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.source.v;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final d h = new d(20);
    public static final Random i = new Random();
    public j d;
    public String f;
    public final u0 a = new u0();
    public final t0 b = new t0();
    public final HashMap c = new HashMap();
    public v0 e = v0.a;
    public long g = -1;

    public final void a(h hVar) {
        long j = hVar.c;
        if (j != -1 && hVar.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final h b(int i2, v vVar) {
        long j;
        long j2;
        long j3;
        HashMap map = this.c;
        h hVar = null;
        long j4 = Long.MAX_VALUE;
        for (h hVar2 : map.values()) {
            long j5 = hVar2.c;
            v vVar2 = hVar2.d;
            if (j5 == -1 && i2 == hVar2.b && vVar != null) {
                long j6 = vVar.d;
                i iVar = hVar2.g;
                j = -1;
                h hVar3 = (h) iVar.c.get(iVar.f);
                if (hVar3 != null) {
                    j3 = hVar3.c;
                    if (j3 == -1) {
                        j3 = iVar.g + 1;
                    }
                } else {
                    j3 = iVar.g + 1;
                }
                if (j6 >= j3) {
                    hVar2.c = j6;
                }
            } else {
                j = -1;
            }
            if (vVar != null) {
                long j7 = vVar.d;
                if (j7 != j) {
                    if (vVar2 == null) {
                        if (!vVar.b() && j7 == hVar2.c) {
                            j2 = hVar2.c;
                            if (j2 != j || j2 < j4) {
                                hVar = hVar2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = j0.a;
                                if (hVar.d != null && vVar2 != null) {
                                    hVar = hVar2;
                                }
                            }
                        }
                    } else if (j7 == vVar2.d && vVar.b == vVar2.b && vVar.c == vVar2.c) {
                        j2 = hVar2.c;
                        if (j2 != j) {
                        }
                        hVar = hVar2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == hVar2.b) {
                j2 = hVar2.c;
                if (j2 != j) {
                }
                hVar = hVar2;
                j4 = j2;
            }
        }
        if (hVar != null) {
            return hVar;
        }
        String str2 = (String) h.get();
        h hVar4 = new h(this, str2, i2, vVar);
        map.put(str2, hVar4);
        return hVar4;
    }

    public final synchronized String c(v0 v0Var, v vVar) {
        return b(v0Var.g(vVar.a, this.b).c, vVar).a;
    }

    public final void d(a aVar) {
        v vVar;
        v0 v0Var = aVar.b;
        int i2 = aVar.c;
        v vVar2 = aVar.d;
        boolean zP = v0Var.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                h hVar = (h) map.get(str);
                hVar.getClass();
                a(hVar);
                return;
            }
            return;
        }
        h hVar2 = (h) map.get(str);
        this.f = b(i2, vVar2).a;
        e(aVar);
        if (vVar2 != null) {
            long j = vVar2.d;
            if (vVar2.b()) {
                if (hVar2 != null && hVar2.c == j && (vVar = hVar2.d) != null && vVar.b == vVar2.b && vVar.c == vVar2.c) {
                    return;
                }
                b(i2, new v(j, vVar2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0057, B:34:0x0063, B:35:0x0067, B:37:0x006c, B:39:0x0072, B:41:0x0089, B:42:0x00b6, B:44:0x00ba, B:45:0x00c1, B:47:0x00cb, B:49:0x00cf), top: B:54:0x0001 }] */
    public final synchronized void e(a aVar) {
        long j;
        this.d.getClass();
        if (aVar.b.p()) {
            return;
        }
        v vVar = aVar.d;
        if (vVar != null) {
            long j2 = vVar.d;
            if (j2 != -1) {
                h hVar = (h) this.c.get(this.f);
                if (hVar != null) {
                    j = hVar.c;
                    if (j == -1) {
                        j = this.g + 1;
                    }
                } else {
                    j = this.g + 1;
                }
                if (j2 < j) {
                    return;
                }
            }
            h hVar2 = (h) this.c.get(this.f);
            if (hVar2 != null && hVar2.c == -1 && hVar2.b != aVar.c) {
                return;
            }
        }
        h hVarB = b(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = hVarB.a;
        }
        v vVar2 = aVar.d;
        if (vVar2 != null && vVar2.b()) {
            v vVar3 = aVar.d;
            h hVarB2 = b(aVar.c, new v(vVar3.a, vVar3.d, vVar3.b));
            if (!hVarB2.e) {
                hVarB2.e = true;
                aVar.b.g(aVar.d.a, this.b);
                this.b.d(aVar.d.b);
                Math.max(0L, j0.d0(0L) + j0.d0(this.b.e));
                this.d.getClass();
            }
        }
        if (!hVarB.e) {
            hVarB.e = true;
            this.d.getClass();
        }
        if (hVarB.a.equals(this.f) && !hVarB.f) {
            hVarB.f = true;
            this.d.l(aVar, hVarB.a);
        }
    }
}
