package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends p {
    public final boolean b;
    public androidx.arch.core.internal.a c;
    public o d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final MutableStateFlow j;

    public x(v vVar, boolean z) {
        this.a = new u0();
        this.b = z;
        this.c = new androidx.arch.core.internal.a();
        o oVar = o.y;
        this.d = oVar;
        this.i = new ArrayList();
        this.e = new WeakReference(vVar);
        this.j = StateFlowKt.MutableStateFlow(oVar);
    }

    @Override // androidx.lifecycle.p
    public final void a(u uVar) {
        t b0Var;
        Object obj;
        v vVar;
        n nVar;
        uVar.getClass();
        d("addObserver");
        o oVar = this.d;
        o oVar2 = o.e;
        if (oVar != oVar2) {
            oVar2 = o.y;
        }
        w wVar = new w();
        HashMap map = y.a;
        boolean z = uVar instanceof t;
        boolean z2 = uVar instanceof f;
        int i = 0;
        if (z && z2) {
            b0Var = new androidx.activity.b0((f) uVar, (t) uVar);
        } else if (z2) {
            b0Var = new androidx.activity.b0((f) uVar, (t) null);
        } else if (z) {
            b0Var = (t) uVar;
        } else {
            Class<?> cls = uVar.getClass();
            if (y.b(cls) == 2) {
                Object obj2 = y.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    y.a((Constructor) list.get(0), uVar);
                    throw null;
                }
                int size = list.size();
                i[] iVarArr = new i[size];
                if (size > 0) {
                    y.a((Constructor) list.get(0), uVar);
                    throw null;
                }
                b0Var = new e(iVarArr, i);
            } else {
                b0Var = new androidx.activity.b0(uVar);
            }
        }
        wVar.b = b0Var;
        wVar.a = oVar2;
        androidx.arch.core.internal.a aVar = this.c;
        androidx.arch.core.internal.c cVarB = aVar.b(uVar);
        if (cVarB != null) {
            obj = cVarB.y;
        } else {
            HashMap map2 = aVar.B;
            androidx.arch.core.internal.c cVar = new androidx.arch.core.internal.c(uVar, wVar);
            aVar.A++;
            androidx.arch.core.internal.c cVar2 = aVar.y;
            if (cVar2 == null) {
                aVar.e = cVar;
                aVar.y = cVar;
            } else {
                cVar2.z = cVar;
                cVar.A = cVar2;
                aVar.y = cVar;
            }
            map2.put(uVar, cVar);
            obj = null;
        }
        if (((w) obj) == null && (vVar = (v) this.e.get()) != null) {
            i = (this.f != 0 || this.g) ? 1 : 0;
            o oVarC = c(uVar);
            this.f++;
            while (wVar.a.compareTo(oVarC) < 0 && this.c.B.containsKey(uVar)) {
                o oVar3 = wVar.a;
                ArrayList arrayList = this.i;
                arrayList.add(oVar3);
                l lVar = n.Companion;
                o oVar4 = wVar.a;
                lVar.getClass();
                oVar4.getClass();
                int iOrdinal = oVar4.ordinal();
                if (iOrdinal == 1) {
                    nVar = n.ON_CREATE;
                } else if (iOrdinal != 2) {
                    nVar = iOrdinal != 3 ? null : n.ON_RESUME;
                } else {
                    nVar = n.ON_START;
                }
                if (nVar == null) {
                    com.google.gson.b.s(wVar.a, "no event up from ");
                    return;
                } else {
                    wVar.a(vVar, nVar);
                    arrayList.remove(arrayList.size() - 1);
                    oVarC = c(uVar);
                }
            }
            if (i == 0) {
                g();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.p
    public final void b(u uVar) {
        uVar.getClass();
        d("removeObserver");
        this.c.c(uVar);
    }

    public final o c(u uVar) {
        HashMap map = this.c.B;
        androidx.arch.core.internal.c cVar = map.containsKey(uVar) ? ((androidx.arch.core.internal.c) map.get(uVar)).A : null;
        o oVar = cVar != null ? ((w) cVar.y).a : null;
        ArrayList arrayList = this.i;
        o oVar2 = arrayList.isEmpty() ? null : (o) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayList);
        o oVar3 = this.d;
        oVar3.getClass();
        if (oVar == null || oVar.compareTo(oVar3) >= 0) {
            oVar = oVar3;
        }
        return (oVar2 == null || oVar2.compareTo(oVar) >= 0) ? oVar : oVar2;
    }

    public final void d(String str) {
        if (this.b) {
            androidx.arch.core.executor.b.O().l.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            net.luminis.tls.engine.impl.c.c(androidx.privacysandbox.ads.adservices.java.internal.a.q("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(n nVar) {
        nVar.getClass();
        d("handleLifecycleEvent");
        f(nVar.a());
    }

    public final void f(o oVar) {
        if (this.d == oVar) {
            return;
        }
        v vVar = (v) this.e.get();
        o oVar2 = this.d;
        oVar2.getClass();
        oVar.getClass();
        o oVar3 = o.y;
        o oVar4 = o.e;
        if (oVar2 == oVar3 && oVar == oVar4) {
            throw new IllegalStateException(("State must be at least '" + o.z + "' to be moved to '" + oVar + "' in component " + vVar).toString());
        }
        if (oVar2 == oVar4 && oVar2 != oVar) {
            throw new IllegalStateException(("State is '" + oVar4 + "' and cannot be moved to `" + oVar + "` in component " + vVar).toString());
        }
        this.d = oVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        g();
        this.g = false;
        if (this.d == oVar4) {
            this.c = new androidx.arch.core.internal.a();
        }
    }

    public final void g() {
        n nVar;
        n nVar2;
        v vVar = (v) this.e.get();
        if (vVar == null) {
            net.luminis.tls.engine.impl.c.r("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            androidx.arch.core.internal.a aVar = this.c;
            if (aVar.A != 0) {
                androidx.arch.core.internal.c cVar = aVar.e;
                cVar.getClass();
                o oVar = ((w) cVar.y).a;
                androidx.arch.core.internal.c cVar2 = this.c.y;
                cVar2.getClass();
                o oVar2 = ((w) cVar2.y).a;
                if (oVar == oVar2 && this.d == oVar2) {
                    break;
                }
                this.h = false;
                o oVar3 = this.d;
                androidx.arch.core.internal.c cVar3 = this.c.e;
                cVar3.getClass();
                int iCompareTo = oVar3.compareTo(((w) cVar3.y).a);
                ArrayList arrayList = this.i;
                if (iCompareTo < 0) {
                    androidx.arch.core.internal.a aVar2 = this.c;
                    androidx.arch.core.internal.b bVar = new androidx.arch.core.internal.b(aVar2.y, aVar2.e, 1);
                    aVar2.z.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        entry.getClass();
                        u uVar = (u) entry.getKey();
                        w wVar = (w) entry.getValue();
                        while (wVar.a.compareTo(this.d) > 0 && !this.h && this.c.B.containsKey(uVar)) {
                            l lVar = n.Companion;
                            o oVar4 = wVar.a;
                            lVar.getClass();
                            oVar4.getClass();
                            int iOrdinal = oVar4.ordinal();
                            if (iOrdinal == 2) {
                                nVar2 = n.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                nVar2 = iOrdinal != 4 ? null : n.ON_PAUSE;
                            } else {
                                nVar2 = n.ON_STOP;
                            }
                            if (nVar2 == null) {
                                com.google.gson.b.s(wVar.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(nVar2.a());
                                wVar.a(vVar, nVar2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                androidx.arch.core.internal.c cVar4 = this.c.y;
                if (!this.h && cVar4 != null && this.d.compareTo(((w) cVar4.y).a) > 0) {
                    androidx.arch.core.internal.a aVar3 = this.c;
                    aVar3.getClass();
                    androidx.arch.core.internal.d dVar = new androidx.arch.core.internal.d(aVar3);
                    aVar3.z.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        u uVar2 = (u) entry2.getKey();
                        w wVar2 = (w) entry2.getValue();
                        while (wVar2.a.compareTo(this.d) < 0 && !this.h && this.c.B.containsKey(uVar2)) {
                            arrayList.add(wVar2.a);
                            l lVar2 = n.Companion;
                            o oVar5 = wVar2.a;
                            lVar2.getClass();
                            oVar5.getClass();
                            int iOrdinal2 = oVar5.ordinal();
                            if (iOrdinal2 == 1) {
                                nVar = n.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                nVar = iOrdinal2 != 3 ? null : n.ON_RESUME;
                            } else {
                                nVar = n.ON_START;
                            }
                            if (nVar == null) {
                                com.google.gson.b.s(wVar2.a, "no event up from ");
                                return;
                            } else {
                                wVar2.a(vVar, nVar);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
        this.j.setValue(this.d);
    }
}
