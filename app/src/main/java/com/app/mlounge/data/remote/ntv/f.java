package com.app.mlounge.data.remote.ntv;

import android.os.Handler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.jvm.internal.v;
import kotlin.o;
import kotlin.text.r;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ValueCallback {
    public final /* synthetic */ v a;
    public final /* synthetic */ CancellableContinuationImpl b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ g d;
    public final /* synthetic */ WebView e;

    public f(v vVar, CancellableContinuationImpl cancellableContinuationImpl, Handler handler, g gVar, WebView webView) {
        this.a = vVar;
        this.b = cancellableContinuationImpl;
        this.c = handler;
        this.d = gVar;
        this.e = webView;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String string;
        String str = (String) obj;
        String strL0 = (str == null || (string = kotlin.text.k.A0(str).toString()) == null) ? null : kotlin.text.k.l0(string);
        Handler handler = this.c;
        if (strL0 == null || kotlin.text.k.d0(strL0) || strL0.equals("null") || !r.O(strL0, "http", false)) {
            handler.postDelayed(this.d, 1000L);
            return;
        }
        v vVar = this.a;
        if (vVar.e) {
            return;
        }
        vVar.e = true;
        o oVar = com.app.mlounge.util.a.a;
        this.b.resumeWith(new m(strL0, l.b));
        handler.post(new b(this.e, 2));
    }
}
