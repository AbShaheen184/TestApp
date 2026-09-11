package kotlinx.serialization.internal;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements kotlinx.serialization.descriptors.e, j {
    public final kotlinx.serialization.descriptors.e a;
    public final String b;
    public final Set c;

    public u0(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        this.a = eVar;
        this.b = eVar.a() + '?';
        this.c = m0.b(eVar);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.j
    public final Set b() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final com.google.android.material.shape.e e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            return kotlin.jvm.internal.l.a(this.a, ((u0) obj).a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return this.a.f();
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        return this.a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
