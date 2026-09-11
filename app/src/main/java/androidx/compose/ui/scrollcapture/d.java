package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.foundation.text.input.internal.m;
import androidx.compose.runtime.h1;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.platform.u;
import androidx.compose.ui.semantics.p;
import androidx.compose.ui.unit.k;
import java.util.function.Consumer;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ScrollCaptureCallback {
    public final p a;
    public final k b;
    public final i c;
    public final u d;
    public final CoroutineScope e;
    public final g f;

    public d(p pVar, k kVar, CoroutineScope coroutineScope, i iVar, u uVar) {
        this.a = pVar;
        this.b = kVar;
        this.c = iVar;
        this.d = uVar;
        this.e = CoroutineScopeKt.plus(coroutineScope, e.e);
        this.f = new g(kVar.b(), new c(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r10 == r5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.scrollcapture.d r12, android.view.ScrollCaptureSession r13, androidx.compose.ui.unit.k r14, kotlin.coroutines.jvm.internal.c r15) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.d.a(androidx.compose.ui.scrollcapture.d, android.view.ScrollCaptureSession, androidx.compose.ui.unit.k, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        BuildersKt__Builders_commonKt.launch$default(this.e, NonCancellable.INSTANCE, null, new androidx.activity.compose.p(this, runnable, null, 19), 2, null);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new androidx.compose.animation.core.f(this, scrollCaptureSession, rect, consumer, null, 4), 3, null);
        jobLaunch$default.invokeOnCompletion(new androidx.compose.animation.e(cancellationSignal, 20));
        cancellationSignal.setOnCancelListener(new m(jobLaunch$default, 1));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(a0.w(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((h1) this.c.b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
