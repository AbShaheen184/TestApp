package androidx.navigation;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 {
    public final Class k;

    public g0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            com.google.gson.b.e(cls, " does not implement Serializable.");
            throw null;
        }
        try {
            this.k = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            net.luminis.tls.engine.impl.c.k(e);
            throw null;
        }
    }

    @Override // androidx.navigation.i0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        return (Serializable[]) bundle.get(str);
    }

    @Override // androidx.navigation.i0
    public final String b() {
        return this.k.getName();
    }

    @Override // androidx.navigation.i0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // androidx.navigation.i0
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r4 = (Serializable[]) obj;
        str.getClass();
        this.k.cast(r4);
        bundle.putSerializable(str, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !g0.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.k, ((g0) obj).k);
    }

    @Override // androidx.navigation.i0
    public final boolean f(Object obj, Object obj2) {
        return kotlin.collections.n.B((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
