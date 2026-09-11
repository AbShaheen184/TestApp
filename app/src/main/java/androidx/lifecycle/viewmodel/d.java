package androidx.lifecycle.viewmodel;

import androidx.appcompat.widget.x;
import androidx.compose.foundation.gestures.z1;
import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.app.mlounge.MainActivity;
import com.app.mlounge.h;
import com.app.mlounge.j;
import com.google.common.collect.f1;
import com.google.common.collect.q;
import dagger.hilt.android.internal.lifecycle.g;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x013d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0141  */
    /* JADX WARN: Code duplicated, block: B:22:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.lifecycle.s0
    public final q0 b(Class cls, e eVar) {
        f fVar;
        l lVar;
        q0 q0Var;
        Closeable closeable;
        androidx.lifecycle.viewmodel.internal.d dVar;
        q0 q0Var2 = null;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.e eVarA = a0.a(cls);
                f[] fVarArr = (f[]) this.b;
                f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
                int length = fVarArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        fVar = fVarArr2[i];
                        if (!fVar.a.equals(eVarA)) {
                            i++;
                        }
                    } else {
                        fVar = null;
                    }
                }
                q0 q0Var3 = (fVar == null || (lVar = fVar.b) == null) ? null : (q0) lVar.invoke(eVar);
                if (q0Var3 != null) {
                    return q0Var3;
                }
                net.luminis.tls.engine.impl.c.n(eVarA.b(), "No initializer set for given class ");
                return null;
            case 1:
                final g gVar = new g();
                coil3.memory.c cVar = (coil3.memory.c) this.b;
                j jVar = new j((h) cVar.y, (com.app.mlounge.f) cVar.z, l0.b(eVar));
                j jVar2 = (j) ((dagger.hilt.android.internal.lifecycle.d) com.google.android.material.resources.g.e(jVar, dagger.hilt.android.internal.lifecycle.d.class));
                jVar2.getClass();
                q.f(17, "expectedSize");
                x xVar = new x(17);
                xVar.q("com.app.mlounge.ui.viewmodel.c", jVar2.b);
                xVar.q("com.app.mlounge.ui.viewmodel.g", jVar2.c);
                xVar.q("com.app.mlounge.ui.viewmodel.k", jVar2.d);
                xVar.q("com.app.mlounge.ui.viewmodel.p", jVar2.e);
                xVar.q("com.app.mlounge.ui.viewmodel.s", jVar2.f);
                xVar.q("com.app.mlounge.ui.viewmodel.t", jVar2.g);
                xVar.q("com.app.mlounge.ui.viewmodel.a0", jVar2.h);
                xVar.q("com.app.mlounge.ui.viewmodel.e0", jVar2.i);
                xVar.q("com.app.mlounge.ui.viewmodel.h0", jVar2.j);
                xVar.q("com.app.mlounge.ui.viewmodel.i0", jVar2.k);
                xVar.q("com.app.mlounge.ui.screens.player.z0", jVar2.l);
                xVar.q("com.app.mlounge.ui.viewmodel.y0", jVar2.m);
                xVar.q("com.app.mlounge.ui.viewmodel.e1", jVar2.n);
                xVar.q("com.app.mlounge.ui.viewmodel.k1", jVar2.o);
                xVar.q("com.app.mlounge.ui.viewmodel.r1", jVar2.p);
                xVar.q("com.app.mlounge.ui.viewmodel.x1", jVar2.q);
                xVar.q("com.app.mlounge.ui.viewmodel.z1", jVar2.r);
                javax.inject.a aVar = (javax.inject.a) xVar.e(true).get(cls.getName());
                l lVar2 = (l) eVar.a.get(dagger.hilt.android.internal.lifecycle.e.d);
                ((dagger.hilt.android.internal.lifecycle.d) com.google.android.material.resources.g.e(jVar, dagger.hilt.android.internal.lifecycle.d.class)).getClass();
                Object obj = f1.D.get(cls);
                if (obj == null) {
                    if (lVar2 != null) {
                        com.google.gson.b.f(cls.getName(), " does not have an assisted factory specified in @HiltViewModel.", "Found creation callback but class ");
                    } else if (aVar != null) {
                        q0Var = (q0) aVar.get();
                        q0Var2 = q0Var;
                        closeable = new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.b
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                gVar.a();
                            }
                        };
                        q0Var2.getClass();
                        dVar = q0Var2.a;
                        if (dVar != null) {
                            if (dVar.d) {
                                androidx.lifecycle.viewmodel.internal.d.a(closeable);
                            } else {
                                synchronized (dVar.a) {
                                    dVar.c.add(closeable);
                                }
                            }
                        }
                    } else {
                        com.google.gson.b.f(cls.getName(), " to be available in the multi-binding of @HiltViewModelMap but none was found.", "Expected the @HiltViewModel-annotated class ");
                    }
                } else {
                    if (aVar != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (lVar2 != null) {
                        q0Var = (q0) lVar2.invoke(obj);
                        q0Var2 = q0Var;
                        closeable = new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.b
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                gVar.a();
                            }
                        };
                        q0Var2.getClass();
                        dVar = q0Var2.a;
                        if (dVar != null) {
                            if (dVar.d) {
                                androidx.lifecycle.viewmodel.internal.d.a(closeable);
                            } else {
                                synchronized (dVar.a) {
                                    dVar.c.add(closeable);
                                }
                            }
                        }
                    } else {
                        com.google.gson.b.f(cls.getName(), " using @AssistedInject but no creation callback was provided in CreationExtras.", "Found @HiltViewModel-annotated class ");
                    }
                }
                return q0Var2;
            default:
                return new dagger.hilt.android.internal.managers.d(new com.app.mlounge.f(((h) ((dagger.hilt.android.internal.managers.c) com.google.android.material.resources.g.e(com.google.android.material.shape.e.e(((MainActivity) this.b).getApplicationContext()), dagger.hilt.android.internal.managers.c.class))).b), new z1(eVar));
        }
    }
}
