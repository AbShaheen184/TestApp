package androidx.compose.ui.semantics;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.collection.o0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.u1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final androidx.compose.ui.geometry.c a = new androidx.compose.ui.geometry.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    public static final p a(f0 f0Var, boolean z) {
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) f0Var.d0.g;
        androidx.compose.ui.node.i iVar = null;
        if ((qVar.A & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.z & 8) == 0) {
                    if ((qVar.A & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.C;
                } else {
                    androidx.compose.ui.q qVarE = qVar;
                    androidx.compose.runtime.collection.b bVar = null;
                    while (qVarE != null) {
                        if (qVarE instanceof u1) {
                            iVar = qVarE;
                            break loop0;
                        }
                        if ((qVarE.z & 8) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                            int i = 0;
                            for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                if ((qVar2.z & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        qVarE = qVar2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                        }
                                        if (qVarE != null) {
                                            bVar.b(qVarE);
                                            qVarE = null;
                                        }
                                        bVar.b(qVar2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        qVarE = androidx.compose.ui.node.k.e(bVar);
                    }
                    if ((qVar.A & 8) != 0) {
                        break;
                    }
                    qVar = qVar.C;
                }
            }
        }
        iVar.getClass();
        androidx.compose.ui.q qVar3 = ((androidx.compose.ui.q) ((u1) iVar)).e;
        l lVarX = f0Var.x();
        if (lVarX == null) {
            lVarX = new l();
        }
        return new p(qVar3, z, f0Var, lVarX);
    }

    public static final androidx.collection.z b(r rVar, kotlin.jvm.functions.l lVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            p pVarA = rVar.a();
            f0 f0Var = pVarA.c;
            if (f0Var.I() && f0Var.H()) {
                androidx.collection.z zVar = new androidx.collection.z(48);
                com.app.mlounge.data.music.e eVar = new com.app.mlounge.data.music.e(19);
                androidx.compose.ui.unit.k kVarU = androidx.room.r.u(pVarA.g());
                ((Region) eVar.y).set(kVarU.a, kVarU.b, kVarU.c, kVarU.d);
                c(eVar, pVarA, zVar, lVar, pVarA, new com.app.mlounge.data.music.e(19));
                return zVar;
            }
            androidx.collection.z zVar2 = androidx.collection.o.a;
            zVar2.getClass();
            return zVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(com.app.mlounge.data.music.e eVar, p pVar, androidx.collection.z zVar, kotlin.jvm.functions.l lVar, p pVar2, com.app.mlounge.data.music.e eVar2) {
        androidx.compose.ui.geometry.c cVarO1;
        f0 f0Var;
        p pVar3 = pVar;
        int i = pVar3.g;
        com.app.mlounge.data.music.e eVar3 = eVar2;
        Region region = (Region) eVar3.y;
        f0 f0Var2 = pVar2.c;
        int i2 = pVar2.g;
        boolean z = (f0Var2.I() && f0Var2.H()) ? false : true;
        com.app.mlounge.data.music.e eVar4 = eVar;
        Region region2 = (Region) eVar4.y;
        if (!region2.isEmpty() || i2 == i) {
            if (!z || pVar2.e) {
                androidx.compose.ui.node.i iVarF = pVar2.f();
                if (iVarF == null) {
                    cVarO1 = ((androidx.compose.ui.node.r) f0Var2.d0.d).o1();
                } else {
                    androidx.compose.ui.q qVar = ((androidx.compose.ui.q) iVarF).e;
                    Object objG = pVar2.d.e.g(k.b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z2 = objG != null;
                    if (!qVar.e.K) {
                        cVarO1 = androidx.compose.ui.geometry.c.e;
                    } else if (z2) {
                        cVarO1 = androidx.compose.ui.node.k.r(qVar, 8).o1();
                    } else {
                        d1 d1VarR = androidx.compose.ui.node.k.r(qVar, 8);
                        cVarO1 = androidx.compose.ui.layout.a0.g(d1VarR).s(d1VarR, true);
                    }
                }
                androidx.compose.ui.unit.k kVarU = androidx.room.r.u(cVarO1);
                region.set(kVarU.a, kVarU.b, kVarU.c, kVarU.d);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (pVar2.e) {
                        p pVarL = pVar2.l();
                        zVar.h(i2, new q(pVar2, androidx.room.r.u((pVarL == null || (f0Var = pVarL.c) == null || !f0Var.I()) ? a : pVarL.g())));
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            zVar.h(i2, new q(pVar2, new androidx.compose.ui.unit.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                zVar.h(i2, new q(pVar2, new androidx.compose.ui.unit.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = p.j(4, pVar2);
                int size = listJ.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) lVar.invoke(listJ.get(size))).booleanValue()) {
                        c(eVar4, pVar3, zVar, lVar, (p) listJ.get(size), eVar3);
                    }
                    size--;
                    eVar4 = eVar;
                    pVar3 = pVar;
                    eVar3 = eVar2;
                }
                if (f(pVar2)) {
                    region2.op(kVarU.a, kVarU.b, kVarU.c, kVarU.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(l lVar, w wVar) {
        Object objG = lVar.e.g(wVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(p pVar) {
        d1 d1VarD = pVar.d();
        o0 o0Var = pVar.d.e;
        return (d1VarD != null ? d1VarD.b1() : false) || o0Var.c(t.p) || o0Var.c(t.o);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean f(p pVar) {
        if (!e(pVar)) {
            l lVar = pVar.d;
            if (lVar.z) {
                return true;
            }
            o0 o0Var = lVar.e;
            Object[] objArr = o0Var.b;
            Object[] objArr2 = o0Var.c;
            long[] jArr = o0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((w) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }
}
