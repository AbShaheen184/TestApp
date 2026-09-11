package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements androidx.media3.common.util.m, com.google.android.datatransport.runtime.synchronization.b {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ t(int i, androidx.media3.common.p0 p0Var, androidx.media3.common.p0 p0Var2) {
        this.e = i;
        this.y = p0Var;
        this.z = p0Var2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object h() {
        com.appsalt.internal.j0 j0Var = (com.appsalt.internal.j0) this.y;
        ((com.google.android.datatransport.runtime.scheduling.jobscheduling.c) j0Var.d).t((com.google.android.datatransport.runtime.i) this.z, this.e + 1, false);
        return null;
    }

    @Override // androidx.media3.common.util.m
    public void invoke(Object obj) {
        androidx.media3.common.p0 p0Var = (androidx.media3.common.p0) this.y;
        androidx.media3.common.p0 p0Var2 = (androidx.media3.common.p0) this.z;
        androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj;
        o0Var.getClass();
        o0Var.c(this.e, p0Var, p0Var2);
    }

    public /* synthetic */ t(com.appsalt.internal.j0 j0Var, com.google.android.datatransport.runtime.i iVar, int i) {
        this.y = j0Var;
        this.z = iVar;
        this.e = i;
    }
}
