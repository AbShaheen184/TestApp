package androidx.constraintlayout.core.widgets.analyzer;

import androidx.compose.foundation.s0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.room.coroutines.s;
import androidx.room.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.a0;
import kotlin.collections.u;
import kotlin.collections.v;
import kotlin.text.r;
import kotlin.y;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public e(androidx.room.a aVar, androidx.emoji2.text.g gVar, s0 s0Var) {
        int i;
        Object gVar2;
        this.a = 1;
        p pVar = aVar.f;
        com.google.firebase.heartbeatinfo.e eVar = aVar.c;
        androidx.sqlite.b bVar = aVar.o;
        String str = aVar.b;
        this.d = aVar;
        this.e = gVar;
        Object obj = aVar.e;
        this.f = obj == null ? u.e : obj;
        if (bVar != null) {
            this.h = null;
            if (bVar.C()) {
                gVar2 = new s(new androidx.media3.common.util.b(this, bVar), str == null ? ":memory:" : str, s0Var);
            } else if (str == null) {
                gVar2 = new androidx.room.coroutines.g(new androidx.media3.common.util.b(this, bVar));
            } else {
                androidx.media3.common.util.b bVar2 = new androidx.media3.common.util.b(this, bVar);
                int iOrdinal = pVar.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        com.google.gson.b.v(pVar, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int iOrdinal2 = pVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    com.google.gson.b.v(pVar, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                gVar2 = new androidx.room.coroutines.g(bVar2, str, i);
            }
            this.g = gVar2;
        } else {
            if (eVar == null) {
                net.luminis.tls.engine.impl.c.o("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            androidx.sqlite.db.framework.g gVar3 = new androidx.sqlite.db.framework.g(aVar.a, str, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(this, gVar.a));
            this.h = gVar3;
            this.g = new s(new t(gVar3), str == null ? ":memory:" : str, s0Var);
        }
        boolean z = pVar == p.y;
        androidx.sqlite.db.a aVar2 = (androidx.sqlite.db.a) this.h;
        if (aVar2 != null) {
            aVar2.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(e eVar, androidx.sqlite.a aVar) throws Throwable {
        Object lVar;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) eVar.e;
        f(aVar);
        androidx.room.a aVar2 = (androidx.room.a) eVar.d;
        p pVar = aVar2.f;
        p pVar2 = p.y;
        if (pVar == pVar2) {
            h1.l(aVar, "PRAGMA journal_mode = WAL");
        } else {
            h1.l(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.f == pVar2) {
            h1.l(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            h1.l(aVar, "PRAGMA synchronous = FULL");
        }
        androidx.sqlite.c cVarU = aVar.U("PRAGMA user_version");
        try {
            cVarU.Q();
            int i = (int) cVarU.getLong(0);
            com.google.common.base.i.c(cVarU, null);
            int i2 = gVar.a;
            if (i != i2) {
                h1.l(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        eVar.j(aVar);
                    } else {
                        eVar.k(aVar, i, i2);
                    }
                    h1.l(aVar, "PRAGMA user_version = " + i2);
                    lVar = y.a;
                } catch (Throwable th) {
                    lVar = new kotlin.l(th);
                }
                if (!(lVar instanceof kotlin.l)) {
                    h1.l(aVar, "END TRANSACTION");
                }
                Throwable thA = kotlin.m.a(lVar);
                if (thA != null) {
                    h1.l(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            eVar.l(aVar);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                com.google.common.base.i.c(cVarU, th2);
                throw th3;
            }
        }
    }

    public static void f(androidx.sqlite.a aVar) {
        androidx.sqlite.c cVarU = aVar.U("PRAGMA busy_timeout");
        try {
            cVarU.Q();
            long j = cVarU.getLong(0);
            com.google.common.base.i.c(cVarU, null);
            if (j < 3000) {
                h1.l(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.i.c(cVarU, th);
                throw th2;
            }
        }
    }

    public void b(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.d;
        l lVar2 = oVar.c;
        f fVar2 = oVar.i;
        f fVar3 = oVar.h;
        if (lVar2 == null) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) this.d;
            if (oVar == eVar.d || oVar == eVar.e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.a = null;
                lVar.b = new ArrayList();
                lVar.a = oVar;
                arrayList.add(lVar);
            }
            oVar.c = lVar;
            lVar.b.add(oVar);
            for (d dVar : fVar3.k) {
                if (dVar instanceof f) {
                    b((f) dVar, i, arrayList, lVar);
                }
            }
            for (d dVar2 : fVar2.k) {
                if (dVar2 instanceof f) {
                    b((f) dVar2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                for (d dVar3 : ((m) oVar).k.k) {
                    if (dVar3 instanceof f) {
                        b((f) dVar3, i, arrayList, lVar);
                    }
                }
            }
            Iterator it = fVar3.l.iterator();
            while (it.hasNext()) {
                b((f) it.next(), i, arrayList, lVar);
            }
            Iterator it2 = fVar2.l.iterator();
            while (it2.hasNext()) {
                b((f) it2.next(), i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).k.l.iterator();
                while (it3.hasNext()) {
                    b((f) it3.next(), i, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0303  */
    /* JADX WARN: Code duplicated, block: B:149:0x0315  */
    /* JADX WARN: Code duplicated, block: B:150:0x0328  */
    /* JADX WARN: Code duplicated, block: B:156:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0226 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0268 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4 A[ADDED_TO_REGION] */
    public void c(androidx.constraintlayout.core.widgets.e eVar) {
        int i;
        int iN;
        int iK;
        int iK2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f;
        int i14;
        int i15;
        ArrayList<androidx.constraintlayout.core.widgets.d> arrayList = eVar.p0;
        int[] iArr = eVar.o0;
        for (androidx.constraintlayout.core.widgets.d dVar : arrayList) {
            int[] iArr2 = dVar.o0;
            androidx.constraintlayout.core.widgets.c[] cVarArr = dVar.P;
            androidx.constraintlayout.core.widgets.c cVar = dVar.K;
            androidx.constraintlayout.core.widgets.c cVar2 = dVar.I;
            androidx.constraintlayout.core.widgets.c cVar3 = dVar.J;
            androidx.constraintlayout.core.widgets.c cVar4 = dVar.H;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            if (dVar.f0 == 8) {
                dVar.a = true;
            } else {
                float f2 = dVar.v;
                if (f2 < 1.0f && i16 == 3) {
                    dVar.q = 2;
                }
                float f3 = dVar.y;
                if (f3 < 1.0f && i17 == 3) {
                    dVar.r = 2;
                }
                if (dVar.V > 0.0f) {
                    if (i16 == 3 && (i17 == 2 || i17 == 1)) {
                        dVar.q = 3;
                    } else if (i17 == 3 && (i16 == 2 || i16 == 1)) {
                        dVar.r = 3;
                    } else if (i16 == 3 && i17 == 3) {
                        if (dVar.q == 0) {
                            dVar.q = 3;
                        }
                        if (dVar.r == 0) {
                            dVar.r = 3;
                        }
                    }
                }
                if (i16 == 3 && dVar.q == 1 && (cVar4.f == null || cVar3.f == null)) {
                    i16 = 2;
                }
                if (i17 == 3 && dVar.r == 1 && (cVar2.f == null || cVar.f == null)) {
                    i17 = 2;
                }
                k kVar = dVar.d;
                kVar.d = i16;
                int i18 = dVar.q;
                kVar.a = i18;
                m mVar = dVar.e;
                mVar.d = i17;
                int i19 = dVar.r;
                mVar.a = i19;
                if (i16 == 4 || i16 == 1) {
                    if (i17 == 4) {
                        if (i17 != 1) {
                            i3 = 2;
                            if (i17 != 2) {
                                if (i16 != 3) {
                                    i4 = i17;
                                    i5 = 1;
                                } else if (i17 == i3 && i17 != 1) {
                                    i4 = i17;
                                    i6 = 3;
                                    i5 = 1;
                                    if (i4 != i6) {
                                        i7 = i4;
                                        i8 = i3;
                                        i9 = 1;
                                        i10 = i16;
                                    } else if (i16 == i3 && i16 != i5) {
                                        i11 = i6;
                                        i7 = i4;
                                        i8 = i3;
                                        i9 = 1;
                                        i10 = i16;
                                        if (i10 != i11 && i7 == i11) {
                                            if (i18 == i9 || i19 == i9) {
                                                h(i8, 0, i8, 0, dVar);
                                                dVar.d.e.m = dVar.n();
                                                dVar.e.e.m = dVar.k();
                                            } else if (i19 == 2 && i18 == 2 && iArr[0] == i5 && iArr[i9] == i5) {
                                                h(i5, (int) ((f2 * eVar.n()) + 0.5f), i5, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                                dVar.d.e.d(dVar.n());
                                                dVar.e.e.d(dVar.k());
                                                dVar.a = true;
                                            }
                                        }
                                    } else if (i19 == i6) {
                                        if (i16 == i3) {
                                            h(i3, 0, i3, 0, dVar);
                                        }
                                        int iN2 = dVar.n();
                                        f = dVar.V;
                                        if (dVar.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        h(i5, iN2, i5, (int) ((iN2 * f) + 0.5f), dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    } else {
                                        i7 = i4;
                                        i5 = i5;
                                        i12 = i3;
                                        if (i19 == 1) {
                                            h(i16, 0, i12, 0, dVar);
                                            dVar.e.e.m = dVar.k();
                                        } else {
                                            i10 = i16;
                                            if (i19 == 2) {
                                                i13 = iArr[1];
                                                if (i13 != i5 || i13 == 4) {
                                                    h(i10, dVar.n(), i5, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                                    dVar.d.e.d(dVar.n());
                                                    dVar.e.e.d(dVar.k());
                                                    dVar.a = true;
                                                } else {
                                                    i8 = i12;
                                                    i9 = 1;
                                                }
                                            } else if (cVarArr[2].f != null || cVarArr[3].f == null) {
                                                h(i12, 0, i7, 0, dVar);
                                                dVar.d.e.d(dVar.n());
                                                dVar.e.e.d(dVar.k());
                                                dVar.a = true;
                                            } else {
                                                i8 = i12;
                                                i9 = 1;
                                            }
                                        }
                                    }
                                    i11 = 3;
                                    if (i10 != i11) {
                                    }
                                } else if (i18 == 3) {
                                    if (i17 == i3) {
                                        h(i3, 0, i3, 0, dVar);
                                    }
                                    int iK3 = dVar.k();
                                    h(1, (int) ((iK3 * dVar.V) + 0.5f), 1, iK3, dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                } else {
                                    i14 = i3;
                                    if (i18 == 1) {
                                        h(i14, 0, i17, 0, dVar);
                                        dVar.d.e.m = dVar.n();
                                    } else {
                                        i3 = i14;
                                        if (i18 == 2) {
                                            i15 = iArr[0];
                                            if (i15 != 1 || i15 == 4) {
                                                h(1, (int) ((f2 * eVar.n()) + 0.5f), i17, dVar.k(), dVar);
                                                dVar.d.e.d(dVar.n());
                                                dVar.e.e.d(dVar.k());
                                                dVar.a = true;
                                            } else {
                                                i5 = 1;
                                                i4 = i17;
                                            }
                                        } else {
                                            i5 = 1;
                                            i4 = i17;
                                            if (cVarArr[0].f != null || cVarArr[1].f == null) {
                                                h(i3, 0, i4, 0, dVar);
                                                dVar.d.e.d(dVar.n());
                                                dVar.e.e.d(dVar.k());
                                                dVar.a = true;
                                            }
                                        }
                                    }
                                }
                                i6 = 3;
                                if (i4 != i6) {
                                    if (i16 == i3) {
                                    }
                                    if (i19 == i6) {
                                        if (i16 == i3) {
                                            h(i3, 0, i3, 0, dVar);
                                        }
                                        int iN3 = dVar.n();
                                        f = dVar.V;
                                        if (dVar.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        h(i5, iN3, i5, (int) ((iN3 * f) + 0.5f), dVar);
                                        dVar.d.e.d(dVar.n());
                                        dVar.e.e.d(dVar.k());
                                        dVar.a = true;
                                    } else {
                                        i7 = i4;
                                        i5 = i5;
                                        i12 = i3;
                                        if (i19 == 1) {
                                            h(i16, 0, i12, 0, dVar);
                                            dVar.e.e.m = dVar.k();
                                        } else {
                                            i10 = i16;
                                            if (i19 == 2) {
                                                i13 = iArr[1];
                                                if (i13 != i5) {
                                                }
                                                h(i10, dVar.n(), i5, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                                dVar.d.e.d(dVar.n());
                                                dVar.e.e.d(dVar.k());
                                                dVar.a = true;
                                            } else {
                                                if (cVarArr[2].f != null) {
                                                }
                                                h(i12, 0, i7, 0, dVar);
                                                dVar.d.e.d(dVar.n());
                                                dVar.e.e.d(dVar.k());
                                                dVar.a = true;
                                            }
                                        }
                                    }
                                } else {
                                    i7 = i4;
                                    i8 = i3;
                                    i9 = 1;
                                    i10 = i16;
                                }
                                i11 = 3;
                                if (i10 != i11) {
                                }
                            }
                        } else {
                            i = 1;
                        }
                        iN = dVar.n();
                        if (i16 == 4) {
                            iN = (eVar.n() - cVar4.g) - cVar3.g;
                            i16 = i;
                        }
                        iK = dVar.k();
                        if (i17 == 4) {
                            iK2 = (eVar.k() - cVar2.g) - cVar.g;
                            i2 = i;
                        } else {
                            iK2 = iK;
                            i2 = i17;
                        }
                        h(i16, iN, i2, iK2, dVar);
                        dVar.d.e.d(dVar.n());
                        dVar.e.e.d(dVar.k());
                        dVar.a = true;
                    }
                    i = 1;
                    iN = dVar.n();
                    if (i16 == 4) {
                        iN = (eVar.n() - cVar4.g) - cVar3.g;
                        i16 = i;
                    }
                    iK = dVar.k();
                    if (i17 == 4) {
                        iK2 = (eVar.k() - cVar2.g) - cVar.g;
                        i2 = i;
                    } else {
                        iK2 = iK;
                        i2 = i17;
                    }
                    h(i16, iN, i2, iK2, dVar);
                    dVar.d.e.d(dVar.n());
                    dVar.e.e.d(dVar.k());
                    dVar.a = true;
                } else {
                    i3 = 2;
                    if (i16 == 2) {
                        if (i17 == 4) {
                            if (i17 != 1) {
                                i3 = 2;
                                if (i17 != 2) {
                                }
                            } else {
                                i = 1;
                            }
                            iN = dVar.n();
                            if (i16 == 4) {
                                iN = (eVar.n() - cVar4.g) - cVar3.g;
                                i16 = i;
                            }
                            iK = dVar.k();
                            if (i17 == 4) {
                                iK2 = (eVar.k() - cVar2.g) - cVar.g;
                                i2 = i;
                            } else {
                                iK2 = iK;
                                i2 = i17;
                            }
                            h(i16, iN, i2, iK2, dVar);
                            dVar.d.e.d(dVar.n());
                            dVar.e.e.d(dVar.k());
                            dVar.a = true;
                        }
                        i = 1;
                        iN = dVar.n();
                        if (i16 == 4) {
                            iN = (eVar.n() - cVar4.g) - cVar3.g;
                            i16 = i;
                        }
                        iK = dVar.k();
                        if (i17 == 4) {
                            iK2 = (eVar.k() - cVar2.g) - cVar.g;
                            i2 = i;
                        } else {
                            iK2 = iK;
                            i2 = i17;
                        }
                        h(i16, iN, i2, iK2, dVar);
                        dVar.d.e.d(dVar.n());
                        dVar.e.e.d(dVar.k());
                        dVar.a = true;
                    }
                    if (i16 != 3) {
                        if (i17 == i3) {
                        }
                        if (i18 == 3) {
                            if (i17 == i3) {
                                h(i3, 0, i3, 0, dVar);
                            }
                            int iK4 = dVar.k();
                            h(1, (int) ((iK4 * dVar.V) + 0.5f), 1, iK4, dVar);
                            dVar.d.e.d(dVar.n());
                            dVar.e.e.d(dVar.k());
                            dVar.a = true;
                        } else {
                            i14 = i3;
                            if (i18 == 1) {
                                h(i14, 0, i17, 0, dVar);
                                dVar.d.e.m = dVar.n();
                            } else {
                                i3 = i14;
                                if (i18 == 2) {
                                    i15 = iArr[0];
                                    if (i15 != 1) {
                                    }
                                    h(1, (int) ((f2 * eVar.n()) + 0.5f), i17, dVar.k(), dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                } else {
                                    i5 = 1;
                                    i4 = i17;
                                    if (cVarArr[0].f != null) {
                                    }
                                    h(i3, 0, i4, 0, dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                }
                            }
                        }
                    } else {
                        i4 = i17;
                        i5 = 1;
                    }
                    i6 = 3;
                    if (i4 != i6) {
                        if (i16 == i3) {
                        }
                        if (i19 == i6) {
                            if (i16 == i3) {
                                h(i3, 0, i3, 0, dVar);
                            }
                            int iN4 = dVar.n();
                            f = dVar.V;
                            if (dVar.W == -1) {
                                f = 1.0f / f;
                            }
                            h(i5, iN4, i5, (int) ((iN4 * f) + 0.5f), dVar);
                            dVar.d.e.d(dVar.n());
                            dVar.e.e.d(dVar.k());
                            dVar.a = true;
                        } else {
                            i7 = i4;
                            i5 = i5;
                            i12 = i3;
                            if (i19 == 1) {
                                h(i16, 0, i12, 0, dVar);
                                dVar.e.e.m = dVar.k();
                            } else {
                                i10 = i16;
                                if (i19 == 2) {
                                    i13 = iArr[1];
                                    if (i13 != i5) {
                                    }
                                    h(i10, dVar.n(), i5, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                } else {
                                    if (cVarArr[2].f != null) {
                                    }
                                    h(i12, 0, i7, 0, dVar);
                                    dVar.d.e.d(dVar.n());
                                    dVar.e.e.d(dVar.k());
                                    dVar.a = true;
                                }
                            }
                        }
                    } else {
                        i7 = i4;
                        i8 = i3;
                        i9 = 1;
                        i10 = i16;
                    }
                    i11 = 3;
                    if (i10 != i11) {
                    }
                }
            }
        }
    }

    public void d() {
        androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList<o> arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        androidx.constraintlayout.core.widgets.e eVar2 = (androidx.constraintlayout.core.widgets.e) this.e;
        eVar2.d.f();
        eVar2.e.f();
        arrayList2.add(eVar2.d);
        arrayList2.add(eVar2.e);
        HashSet hashSet = null;
        for (androidx.constraintlayout.core.widgets.d dVar : eVar2.p0) {
            if (dVar instanceof androidx.constraintlayout.core.widgets.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.e.f();
                iVar.f = ((androidx.constraintlayout.core.widgets.h) dVar).t0;
                arrayList2.add(iVar);
            } else {
                if (dVar.u()) {
                    if (dVar.b == null) {
                        dVar.b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.b);
                } else {
                    arrayList2.add(dVar.d);
                }
                if (dVar.v()) {
                    if (dVar.c == null) {
                        dVar.c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.c);
                } else {
                    arrayList2.add(dVar.e);
                }
                if (dVar instanceof androidx.constraintlayout.core.widgets.i) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
        for (o oVar : arrayList2) {
            if (oVar.b != eVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        g(eVar.d, 0, arrayList);
        g(eVar.e, 1, arrayList);
        this.b = false;
    }

    public int e(androidx.constraintlayout.core.widgets.e eVar, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            o oVar = ((l) arrayList2.get(i3)).a;
            if (!(oVar instanceof c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f != i) {
                f fVar = (i == 0 ? eVar.d : eVar.e).h;
                f fVar2 = (i == 0 ? eVar.d : eVar.e).i;
                f fVar3 = oVar.h;
                f fVar4 = oVar.i;
                boolean zContains = fVar3.l.contains(fVar);
                boolean zContains2 = fVar4.l.contains(fVar2);
                long j4 = oVar.j();
                if (zContains && zContains2) {
                    long jB = l.b(fVar3, j3);
                    long jA = l.a(fVar4, j3);
                    long j5 = jB - j4;
                    int i4 = fVar4.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = fVar3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    androidx.constraintlayout.core.widgets.d dVar = oVar.b;
                    if (i == 0) {
                        f = dVar.c0;
                    } else if (i == 1) {
                        f = dVar.d0;
                    } else {
                        dVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) fVar3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) fVar4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (zContains) {
                        j = Math.max(l.b(fVar3, fVar3.f), ((long) fVar3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-l.a(fVar4, fVar4.f), ((long) (-fVar4.f)) + j4);
                    } else {
                        j = (oVar.j() + ((long) fVar3.f)) - ((long) fVar4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                j = j3;
            }
            jMax = Math.max(jMax, j);
            i3++;
            arrayList2 = arrayList;
            size = i2;
            j3 = 0;
        }
        return (int) jMax;
    }

    public void g(o oVar, int i, ArrayList arrayList) {
        f fVar = oVar.h;
        f fVar2 = oVar.i;
        for (d dVar : fVar.k) {
            if (dVar instanceof f) {
                b((f) dVar, i, arrayList, null);
            } else if (dVar instanceof o) {
                b(((o) dVar).h, i, arrayList, null);
            }
        }
        for (d dVar2 : fVar2.k) {
            if (dVar2 instanceof f) {
                b((f) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof o) {
                b(((o) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((m) oVar).k.k) {
                if (dVar3 instanceof f) {
                    b((f) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public void h(int i, int i2, int i3, int i4, androidx.constraintlayout.core.widgets.d dVar) {
        b bVar = (b) this.i;
        bVar.a = i;
        bVar.b = i3;
        bVar.c = i2;
        bVar.d = i4;
        ((androidx.constraintlayout.widget.f) this.h).b(dVar, bVar);
        dVar.J(bVar.e);
        dVar.G(bVar.f);
        dVar.D = bVar.h;
        dVar.D(bVar.g);
    }

    public void i() {
        a aVar;
        for (androidx.constraintlayout.core.widgets.d dVar : ((androidx.constraintlayout.core.widgets.e) this.d).p0) {
            if (!dVar.a) {
                int[] iArr = dVar.o0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = dVar.q;
                int i4 = dVar.r;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                g gVar = dVar.d.e;
                boolean z3 = gVar.j;
                g gVar2 = dVar.e.e;
                boolean z4 = gVar2.j;
                boolean z5 = z2;
                if (z3 && z4) {
                    h(1, gVar.g, 1, gVar2.g, dVar);
                    dVar.a = true;
                } else if (z3 && z) {
                    h(1, gVar.g, 2, gVar2.g, dVar);
                    m mVar = dVar.e;
                    if (i2 == 3) {
                        mVar.e.m = dVar.k();
                    } else {
                        mVar.e.d(dVar.k());
                        dVar.a = true;
                    }
                } else if (z4 && z5) {
                    h(2, gVar.g, 1, gVar2.g, dVar);
                    k kVar = dVar.d;
                    if (i == 3) {
                        kVar.e.m = dVar.n();
                    } else {
                        kVar.e.d(dVar.n());
                        dVar.a = true;
                    }
                }
                if (dVar.a && (aVar = dVar.e.l) != null) {
                    aVar.d(dVar.Z);
                }
            }
        }
    }

    public void j(androidx.sqlite.a aVar) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.e;
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cVarU.Q() && cVarU.getLong(0) == 0) {
                z = true;
            }
            com.google.common.base.i.c(cVarU, null);
            gVar.c(aVar);
            if (!z) {
                androidx.room.t tVarZ = gVar.z(aVar);
                if (!tVarZ.c) {
                    androidx.media3.exoplayer.hls.playlist.a.h(tVarZ.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            m(aVar);
            gVar.v(aVar);
            Iterator it = ((List) this.f).iterator();
            while (it.hasNext()) {
                ((androidx.room.o) it.next()).getClass();
                if (aVar instanceof androidx.sqlite.driver.a) {
                    ((androidx.sqlite.driver.a) aVar).e.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.i.c(cVarU, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[LOOP:4: B:10:0x002a->B:137:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    public void k(androidx.sqlite.a aVar, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        kotlin.k kVar;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.e;
        aVar.getClass();
        androidx.room.a aVar2 = (androidx.room.a) this.d;
        androidx.collection.internal.b bVar = aVar2.d;
        bVar.getClass();
        if (i == i2) {
            iterable = u.e;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z2) {
                    if (i3 < i2) {
                        linkedHashMap = bVar.a;
                        if (z2) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                kVar = null;
                            } else {
                                kVar = new kotlin.k(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                kVar = null;
                            } else {
                                kVar = new kotlin.k(treeMap, treeMap.keySet());
                            }
                        }
                        if (kVar == null) {
                            Map map = (Map) kVar.e;
                            it = ((Iterable) kVar.y).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z2) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = bVar.a;
                    if (z2) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            kVar = null;
                        } else {
                            kVar = new kotlin.k(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            kVar = null;
                        } else {
                            kVar = new kotlin.k(treeMap, treeMap.keySet());
                        }
                    }
                    if (kVar == null) {
                        Map map2 = (Map) kVar.e;
                        it = ((Iterable) kVar.y).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        if (iterable != null) {
            gVar.y(aVar);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((com.app.mlounge.data.local.a) it2.next()).getClass();
                if (!(aVar instanceof androidx.sqlite.driver.a)) {
                    throw new kotlin.j("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                androidx.sqlite.db.framework.b bVar2 = ((androidx.sqlite.driver.a) aVar).e;
                bVar2.getClass();
                bVar2.m("CREATE TABLE IF NOT EXISTS `iptv_channels` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `name` TEXT NOT NULL, \n    `url` TEXT NOT NULL, \n    `logo` TEXT, \n    `groupName` TEXT, \n    `provider` TEXT NOT NULL, \n    `tvgId` TEXT\n)");
                bVar2.m("CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider` ON `iptv_channels` (`provider`)");
                bVar2.m("CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider_groupName` ON `iptv_channels` (`provider`, `groupName`)");
                bVar2.m("CREATE INDEX IF NOT EXISTS `index_iptv_channels_name` ON `iptv_channels` (`name`)");
            }
            androidx.room.t tVarZ = gVar.z(aVar);
            if (!tVarZ.c) {
                androidx.media3.exoplayer.hls.playlist.a.h(tVarZ.b, "Migration didn't properly handle: ");
                return;
            } else {
                gVar.x(aVar);
                m(aVar);
                return;
            }
        }
        aVar2.getClass();
        boolean z3 = false;
        if (i <= i2 || !aVar2.j) {
            Set set = aVar2.k;
            if (aVar2.i && (set == null || !set.contains(Integer.valueOf(i)))) {
                z3 = true;
            }
        }
        if (z3) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (aVar2.n) {
            androidx.sqlite.c cVarU = aVar.U("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
                while (cVarU.Q()) {
                    String strF = cVarU.F(0);
                    if (!r.O(strF, "sqlite_", false) && !strF.equals("android_metadata")) {
                        bVarH.add(new kotlin.k(strF, Boolean.valueOf(kotlin.jvm.internal.l.a(cVarU.F(1), "view"))));
                    }
                }
                kotlin.collections.builders.b bVarC = com.google.common.base.c.c(bVarH);
                com.google.common.base.i.c(cVarU, null);
                ListIterator listIterator = bVarC.listIterator(0);
                while (true) {
                    androidx.compose.runtime.snapshots.u uVar = (androidx.compose.runtime.snapshots.u) listIterator;
                    if (!uVar.hasNext()) {
                        break;
                    }
                    kotlin.k kVar2 = (kotlin.k) uVar.next();
                    String str = (String) kVar2.e;
                    if (((Boolean) kVar2.y).booleanValue()) {
                        h1.l(aVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        h1.l(aVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.i.c(cVarU, th);
                    throw th2;
                }
            }
        } else {
            gVar.e(aVar);
        }
        Iterator it3 = ((List) this.f).iterator();
        while (it3.hasNext()) {
            ((androidx.room.o) it3.next()).getClass();
            if (aVar instanceof androidx.sqlite.driver.a) {
                ((androidx.sqlite.driver.a) aVar).e.getClass();
            }
        }
        gVar.c(aVar);
    }

    public void l(androidx.sqlite.a aVar) throws Throwable {
        Object lVar;
        aVar.getClass();
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.e;
        androidx.sqlite.c cVarU = aVar.U("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = cVarU.Q() && cVarU.getLong(0) != 0;
            com.google.common.base.i.c(cVarU, null);
            if (z) {
                androidx.sqlite.c cVarU2 = aVar.U("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strF = cVarU2.Q() ? cVarU2.F(0) : null;
                    com.google.common.base.i.c(cVarU2, null);
                    if (!((String) gVar.b).equals(strF) && !((String) gVar.c).equals(strF)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) gVar.b) + ", found: " + strF).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.google.common.base.i.c(cVarU2, th);
                        throw th2;
                    }
                }
            } else {
                h1.l(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    androidx.room.t tVarZ = gVar.z(aVar);
                    if (!tVarZ.c) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + tVarZ.b).toString());
                    }
                    gVar.x(aVar);
                    m(aVar);
                    lVar = y.a;
                    if (!(lVar instanceof kotlin.l)) {
                        h1.l(aVar, "END TRANSACTION");
                    }
                    Throwable thA = kotlin.m.a(lVar);
                    if (thA != null) {
                        h1.l(aVar, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    lVar = new kotlin.l(th3);
                }
            }
            gVar.w(aVar);
            for (androidx.room.o oVar : (List) this.f) {
                oVar.getClass();
                if (aVar instanceof androidx.sqlite.driver.a) {
                    androidx.sqlite.db.framework.b bVar = ((androidx.sqlite.driver.a) aVar).e;
                    bVar.getClass();
                    oVar.a.invoke(bVar);
                }
            }
            this.b = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                com.google.common.base.i.c(cVarU, th4);
                throw th5;
            }
        }
    }

    public void m(androidx.sqlite.a aVar) {
        h1.l(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        h1.l(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((androidx.emoji2.text.g) this.e).b) + "')");
    }

    public String toString() {
        switch (this.a) {
            case 2:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return kotlin.collections.o.R(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e(androidx.room.a aVar, androidx.compose.ui.text.y yVar, s0 s0Var) {
        this.a = 1;
        this.d = aVar;
        this.e = new androidx.room.n("", -1, "");
        List list = aVar.e;
        u uVar = u.e;
        this.f = list == null ? uVar : list;
        kotlin.collections.o.W(list == null ? uVar : list, new androidx.room.o(new androidx.compose.ui.text.font.e(this, 6)));
        aVar.d.getClass();
        throw new kotlin.j(0);
    }

    public /* synthetic */ e() {
        this.a = 0;
    }

    public e(boolean z, boolean z2, x xVar, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = 2;
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = xVar;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = a0.H(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, boolean z2, x xVar, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, xVar, l, l2, l3, l4, v.e);
        this.a = 2;
    }
}
