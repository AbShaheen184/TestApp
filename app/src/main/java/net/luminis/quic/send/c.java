package net.luminis.quic.send;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Consumer {
    public final /* synthetic */ androidx.emoji2.text.f a;
    public final /* synthetic */ int b;

    public /* synthetic */ c(androidx.emoji2.text.f fVar, int i) {
        this.a = fVar;
        this.b = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((g[]) this.a.b)[androidx.constraintlayout.core.g.e(com.google.android.datatransport.runtime.backends.c.d(this.b))] = null;
    }
}
