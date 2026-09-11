package com.app.mlounge.data.remote.ntv;

import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.v;
import kotlin.o;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends WebViewClient {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ v b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ CancellableContinuationImpl d;

    public h(Handler handler, WebView webView, v vVar, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = handler;
        this.b = vVar;
        this.c = webView;
        this.d = cancellableContinuationImpl;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        o oVar = com.app.mlounge.util.a.a;
        Handler handler = this.a;
        handler.postDelayed(new g(handler, this.c, this.b, this.d), 2000L);
    }
}
