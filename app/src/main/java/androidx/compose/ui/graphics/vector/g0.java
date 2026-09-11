package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, kotlin.jvm.internal.markers.a {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final List F;
    public final List G;
    public final String e;
    public final float y;
    public final float z;

    public g0(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.e = str;
        this.y = f;
        this.z = f2;
        this.A = f3;
        this.B = f4;
        this.C = f5;
        this.D = f6;
        this.E = f7;
        this.F = list;
        this.G = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return kotlin.jvm.internal.l.a(this.e, g0Var.e) && this.y == g0Var.y && this.z == g0Var.z && this.A == g0Var.A && this.B == g0Var.B && this.C == g0Var.C && this.D == g0Var.D && this.E == g0Var.E && kotlin.jvm.internal.l.a(this.F, g0Var.F) && kotlin.jvm.internal.l.a(this.G, g0Var.G);
        }
        return false;
    }

    public final int hashCode() {
        return this.G.hashCode() + ((this.F.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.E, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.D, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.C, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.B, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.A, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.z, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.y, this.e.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f(this);
    }
}
