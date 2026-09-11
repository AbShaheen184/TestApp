package com.appsalt.internal;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public final net.luminis.quic.impl.i a;
    public final kotlin.coroutines.i b;
    public final Channel c;
    public final Channel d;

    public y0(net.luminis.quic.impl.i iVar, kotlin.coroutines.i iVar2) {
        this.a = iVar;
        this.b = iVar2;
        Channel channelChannel$default = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.c = channelChannel$default;
        this.d = channelChannel$default;
        iVar.W.h = new x0(this, 0);
    }
}
