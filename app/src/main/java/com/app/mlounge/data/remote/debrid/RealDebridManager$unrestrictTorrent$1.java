package com.app.mlounge.data.remote.debrid;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.debrid.RealDebridManager", f = "RealDebridManager.kt", l = {Token.TO_DOUBLE, Token.LET, 170, Token.GENEXPR, Token.ARROW, Token.TEMPLATE_CHARS, Token.TEMPLATE_LITERAL_SUBST, 188}, m = "unrestrictTorrent", v = 2)
final class RealDebridManager$unrestrictTorrent$1 extends c {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
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
    final /* synthetic */ RealDebridManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDebridManager$unrestrictTorrent$1(RealDebridManager realDebridManager, c cVar) {
        super(cVar);
        this.this$0 = realDebridManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(null, null, this);
    }
}
