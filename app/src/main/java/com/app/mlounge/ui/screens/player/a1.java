package com.app.mlounge.ui.screens.player;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements androidx.media3.extractor.n {
    public long a;
    public final androidx.media3.extractor.mkv.e b = new androidx.media3.extractor.mkv.e(new com.google.android.gms.common.internal.k(20), 1);
    public androidx.media3.extractor.a0 c;
    public androidx.media3.extractor.p d;

    public a1(long j) {
        this.a = j;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        return this.b.a(oVar);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.b.b(j, j2);
    }

    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) {
        oVar.getClass();
        rVar.getClass();
        if (this.a <= 0 && oVar.getLength() > 0) {
            this.a = oVar.getLength();
            kotlin.o oVar2 = com.app.mlounge.util.a.a;
            androidx.media3.extractor.a0 a0Var = this.c;
            androidx.media3.extractor.p pVar = this.d;
            if (a0Var != null && !a0Var.c() && a0Var.g() != -9223372036854775807L && pVar != null) {
                pVar.g(new c(a0Var.g(), this.a));
            }
        }
        return this.b.c(oVar, rVar);
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        pVar.getClass();
        this.d = pVar;
        this.b.d(new coil3.memory.c(7, pVar, this));
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        this.b.getClass();
    }
}
