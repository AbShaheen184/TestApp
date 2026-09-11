package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l3 implements androidx.compose.ui.graphics.u, kotlin.jvm.internal.g {
    public final /* synthetic */ androidx.compose.foundation.lazy.o e;

    public l3(androidx.compose.foundation.lazy.o oVar) {
        this.e = oVar;
    }

    @Override // androidx.compose.ui.graphics.u
    public final /* synthetic */ long a() {
        return ((androidx.compose.ui.graphics.t) this.e.invoke()).a;
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof androidx.compose.ui.graphics.u) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return this.e.equals(((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
