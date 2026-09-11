package androidx.datastore.preferences;

import androidx.compose.foundation.text.selection.w;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z0;
import androidx.transition.k;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends t {
    private static final d DEFAULT_INSTANCE;
    private static volatile p0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private g0 preferences_ = g0.y;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        t.j(d.class, dVar);
    }

    public static g0 l(d dVar) {
        g0 g0Var = dVar.preferences_;
        if (!g0Var.e) {
            dVar.preferences_ = g0Var.b();
        }
        return dVar.preferences_;
    }

    public static b n() {
        return (b) ((r) DEFAULT_INSTANCE.c(5));
    }

    public static d o(FileInputStream fileInputStream) throws x {
        d dVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        l lVarA = l.a();
        t tVarI = dVar.i();
        try {
            r0 r0Var = r0.c;
            r0Var.getClass();
            u0 u0VarA = r0Var.a(tVarI.getClass());
            w wVar = (w) hVar.z;
            if (wVar == null) {
                wVar = new w(hVar);
            }
            u0VarA.i(tVarI, wVar, lVarA);
            u0VarA.b(tVarI);
            if (t.f(tVarI, true)) {
                return (d) tVarI;
            }
            throw new x(new z0().getMessage());
        } catch (x e) {
            if (e.e) {
                throw new x(e.getMessage(), e);
            }
            throw e;
        } catch (z0 e2) {
            throw new x(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof x) {
                throw ((x) e3.getCause());
            }
            throw new x(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof x) {
                throw ((x) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t
    public final Object c(int i) {
        p0 sVar;
        switch (androidx.constraintlayout.core.g.e(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new t0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", c.a});
            case 3:
                return new d();
            case 4:
                return new b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p0 p0Var = PARSER;
                if (p0Var != null) {
                    return p0Var;
                }
                synchronized (d.class) {
                    try {
                        sVar = PARSER;
                        if (sVar == null) {
                            sVar = new s();
                            PARSER = sVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return sVar;
            default:
                k.n();
                return null;
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
