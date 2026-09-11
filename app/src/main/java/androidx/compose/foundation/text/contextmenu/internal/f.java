package androidx.compose.foundation.text.contextmenu.internal;

import kotlin.y;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.compose.foundation.text.contextmenu.data.g {
    public final Channel a = ChannelKt.Channel$default(0, null, null, 7, null);

    @Override // androidx.compose.foundation.text.contextmenu.data.g
    public final void close() {
        this.a.mo28trySendJP2dKIU(y.a);
    }
}
