package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements kotlin.jvm.internal.g {
    public final /* synthetic */ kotlin.jvm.internal.r e;

    public y(kotlin.jvm.internal.r rVar) {
        this.e = rVar;
    }

    public final float a() {
        return ((Number) this.e.invoke()).floatValue();
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        return this.e.equals(((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
