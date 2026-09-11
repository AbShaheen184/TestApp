package kotlinx.serialization.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements kotlinx.serialization.descriptors.e {
    public final kotlinx.serialization.descriptors.e a;

    public e0(kotlinx.serialization.descriptors.e eVar) {
        this.a = eVar;
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
        net.luminis.tls.engine.impl.c.o(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final com.google.android.material.shape.e e() {
        return kotlinx.serialization.descriptors.h.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.l.a(this.a, e0Var.a) && kotlin.jvm.internal.l.a(a(), e0Var.a());
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return 1;
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
        androidx.media3.exoplayer.hls.playlist.a.l(androidx.privacysandbox.ads.adservices.java.internal.a.v("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        if (i >= 0) {
            return this.a;
        }
        androidx.media3.exoplayer.hls.playlist.a.l(androidx.privacysandbox.ads.adservices.java.internal.a.v("Illegal index ", i, ", "), a(), " expects only non-negative indices");
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
        androidx.media3.exoplayer.hls.playlist.a.l(androidx.privacysandbox.ads.adservices.java.internal.a.v("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
