package androidx.compose.ui.unit;

import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {
    public final float e;
    public final float y;
    public final androidx.compose.ui.unit.fontscaling.a z;

    public e(float f, float f2, androidx.compose.ui.unit.fontscaling.a aVar) {
        this.e = f;
        this.y = f2;
        this.z = aVar;
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.y;
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.e, eVar.e) == 0 && Float.compare(this.y, eVar.y) == 0 && this.z.equals(eVar.z);
    }

    public final int hashCode() {
        return this.z.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.y, Float.hashCode(this.e) * 31, 31);
    }

    @Override // androidx.compose.ui.unit.c
    public final long n(float f) {
        return h1.u(this.z.a(f), 4294967296L);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        if (p.a(o.b(j), 4294967296L)) {
            return this.z.b(o.c(j));
        }
        net.luminis.tls.engine.impl.c.r("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.e + ", fontScale=" + this.y + ", converter=" + this.z + ')';
    }
}
