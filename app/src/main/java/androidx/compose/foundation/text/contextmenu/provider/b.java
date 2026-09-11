package androidx.compose.foundation.text.contextmenu.provider;

import kotlin.y;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.compose.foundation.text.contextmenu.data.g {
    public final e a;
    public final Channel b = ChannelKt.Channel$default(0, null, null, 7, null);

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // androidx.compose.foundation.text.contextmenu.data.g
    public final void close() {
        this.b.mo28trySendJP2dKIU(y.a);
    }
}
