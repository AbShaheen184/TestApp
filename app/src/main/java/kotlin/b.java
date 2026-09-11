package kotlin;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements kotlin.coroutines.d {
    public kotlinx.serialization.json.internal.k e;
    public kotlin.coroutines.d y;
    public Object z;

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.i getContext() {
        return kotlin.coroutines.j.e;
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        this.y = null;
        this.z = obj;
    }
}
