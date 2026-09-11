package com.app.mlounge.data.remote.trakt;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.trakt.TraktManager", f = "TraktManager.kt", l = {Token.REF_MEMBER, Token.REF_NS_MEMBER}, m = "ensureValidToken", v = 2)
final class TraktManager$ensureValidToken$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TraktManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraktManager$ensureValidToken$1(TraktManager traktManager, c cVar) {
        super(cVar);
        this.this$0 = traktManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
