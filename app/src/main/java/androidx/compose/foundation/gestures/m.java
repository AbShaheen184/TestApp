package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements p1 {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    @Override // androidx.compose.foundation.gestures.p1
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        n nVar = this.a;
        float fFloatValue = ((Number) nVar.a.invoke(Float.valueOf(f))).floatValue();
        nVar.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        nVar.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
