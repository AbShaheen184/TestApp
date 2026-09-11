package com.app.mlounge.data.remote.trakt;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.trakt.TraktSyncManager", f = "TraktSyncManager.kt", l = {Token.OR, 120, 130, Token.DO, Token.COMPUTED_PROPERTY}, m = "syncWatchlistFromTrakt", v = 2)
final class TraktSyncManager$syncWatchlistFromTrakt$1 extends c {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TraktSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraktSyncManager$syncWatchlistFromTrakt$1(TraktSyncManager traktSyncManager, c cVar) {
        super(cVar);
        this.this$0 = traktSyncManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(this);
    }
}
