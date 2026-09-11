package androidx.media3.common.util;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ u c;

    public s(u uVar, androidx.media3.exoplayer.upstream.e eVar, Executor executor) {
        this.c = uVar;
        this.a = new WeakReference(eVar);
        this.b = executor;
    }
}
