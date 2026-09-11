package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.z;
import androidx.transition.k;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends t {
    private static final f DEFAULT_INSTANCE;
    private static volatile p0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private u strings_ = s0.A;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        t.j(f.class, fVar);
    }

    public static void l(f fVar, Iterable iterable) {
        u uVar = fVar.strings_;
        if (!((s0) uVar).e) {
            s0 s0Var = (s0) uVar;
            int i = s0Var.z;
            fVar.strings_ = s0Var.d(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = fVar.strings_;
        Charset charset = v.a;
        if (iterable instanceof z) {
            List listG = ((z) iterable).g();
            if (randomAccess != null) {
                k.i();
                return;
            }
            ((s0) randomAccess).getClass();
            Iterator it = listG.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.f) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.f.d(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof q0) {
            ((s0) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((s0) randomAccess).z);
        }
        s0 s0Var2 = (s0) randomAccess;
        int i2 = s0Var2.z;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (s0Var2.z - i2) + " is null.";
                for (int i3 = s0Var2.z - 1; i3 >= i2; i3--) {
                    s0Var2.remove(i3);
                }
                com.google.gson.b.h(str);
                return;
            }
            s0Var2.add(obj);
        }
    }

    public static f m() {
        return DEFAULT_INSTANCE;
    }

    public static e o() {
        return (e) ((r) DEFAULT_INSTANCE.c(5));
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
                return new t0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new f();
            case 4:
                return new e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p0 p0Var = PARSER;
                if (p0Var != null) {
                    return p0Var;
                }
                synchronized (f.class) {
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

    public final u n() {
        return this.strings_;
    }
}
