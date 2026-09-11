package androidx.datastore.core;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public final CoroutineScope a;
    public final androidx.activity.compose.p b;
    public final Channel c;
    public final com.google.firebase.platforminfo.c d;

    public c1(CoroutineScope coroutineScope, androidx.compose.ui.text.font.e eVar, androidx.compose.ui.text.x xVar, androidx.activity.compose.p pVar) {
        coroutineScope.getClass();
        this.a = coroutineScope;
        this.b = pVar;
        this.c = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.d = new com.google.firebase.platforminfo.c(22);
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            job.invokeOnCompletion(new androidx.compose.animation.core.a(11, eVar, this, xVar));
        }
    }
}
