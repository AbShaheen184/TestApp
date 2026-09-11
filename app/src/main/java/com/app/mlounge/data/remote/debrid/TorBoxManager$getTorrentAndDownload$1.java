package com.app.mlounge.data.remote.debrid;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.debrid.TorBoxManager", f = "TorBoxManager.kt", l = {130, Token.BLOCK}, m = "getTorrentAndDownload", v = 2)
final class TorBoxManager$getTorrentAndDownload$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TorBoxManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TorBoxManager$getTorrentAndDownload$1(TorBoxManager torBoxManager, c cVar) {
        super(cVar);
        this.this$0 = torBoxManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, 0, null, this);
    }
}
