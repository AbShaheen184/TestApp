package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends ContentObserver {
    public final /* synthetic */ Channel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Channel channel, Handler handler) {
        super(handler);
        this.a = channel;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.mo28trySendJP2dKIU(kotlin.y.a);
    }
}
