package kotlinx.serialization.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements kotlinx.serialization.descriptors.e {
    public final kotlinx.serialization.descriptors.e a;
    public final kotlinx.serialization.descriptors.e b;

    public c0(kotlinx.serialization.descriptors.e eVar, kotlinx.serialization.descriptors.e eVar2) {
        eVar.getClass();
        eVar2.getClass();
        this.a = eVar;
        this.b = eVar2;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        Integer numQ = kotlin.text.r.Q(str);
        if (numQ != null) {
            return numQ.intValue();
        }
        net.luminis.tls.engine.impl.c.o(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final com.google.android.material.shape.e e() {
        return kotlinx.serialization.descriptors.h.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.l.a(this.a, c0Var.a) && kotlin.jvm.internal.l.a(this.b, c0Var.b);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        return kotlin.collections.u.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        if (i >= 0) {
            return kotlin.collections.u.e;
        }
        net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        net.luminis.tls.engine.impl.c.r("Unreached");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
