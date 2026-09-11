package kotlinx.serialization.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements kotlinx.serialization.descriptors.e {
    public final String a;
    public final kotlinx.serialization.descriptors.d b;

    public s0(String str, kotlinx.serialization.descriptors.d dVar) {
        dVar.getClass();
        this.a = str;
        this.b = dVar;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final com.google.android.material.shape.e e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.a.equals(s0Var.a) && kotlin.jvm.internal.l.a(this.b, s0Var.b);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        return kotlin.collections.u.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
