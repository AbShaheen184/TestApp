package androidx.compose.ui.text.platform;

import androidx.compose.runtime.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.emoji2.text.h {
    public final /* synthetic */ h1 e;
    public final /* synthetic */ com.google.firebase.platforminfo.c y;

    public h(h1 h1Var, com.google.firebase.platforminfo.c cVar) {
        this.e = h1Var;
        this.y = cVar;
    }

    @Override // androidx.emoji2.text.h
    public final void a() {
        this.y.e = k.a;
    }

    @Override // androidx.emoji2.text.h
    public final void b() {
        this.e.setValue(Boolean.TRUE);
        this.y.e = new l(true);
    }
}
