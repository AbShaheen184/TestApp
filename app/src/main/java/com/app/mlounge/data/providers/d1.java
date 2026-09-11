package com.app.mlounge.data.providers;

import android.webkit.CookieManager;
import android.webkit.WebView;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = e1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new d1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        boolean zBooleanValue = false;
        WebView webView = null;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                WebView webView2 = new WebView(this.this$0.appContext);
                webView2.getSettings().setJavaScriptEnabled(true);
                webView2.getSettings().setDomStorageEnabled(true);
                webView2.getSettings().setAllowContentAccess(true);
                webView2.getSettings().setLoadWithOverviewMode(true);
                webView2.getSettings().setUseWideViewPort(true);
                webView2.setBackgroundColor(0);
                webView2.setVisibility(8);
                try {
                    CookieManager.getInstance().setAcceptCookie(true);
                    webView2.setWebViewClient(new b1(completableDeferredCompletableDeferred$default, this.this$0));
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    webView2.loadUrl("https://noodlemagazine.com");
                    c1 c1Var = new c1(completableDeferredCompletableDeferred$default, null);
                    this.L$0 = null;
                    this.L$1 = webView2;
                    this.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(15000L, c1Var, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar) {
                        return aVar;
                    }
                    webView = webView2;
                } catch (Exception e) {
                    e = e;
                    webView = webView2;
                    com.app.mlounge.util.a.b("NoodleMag", "warmupWithWebView failed", e);
                    if (webView != null) {
                        webView.destroy();
                    }
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                webView = (WebView) this.L$1;
                kotlin.a.e(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool == null && webView != null) {
                webView.destroy();
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } catch (Exception e2) {
            e = e2;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
