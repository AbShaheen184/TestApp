package com.app.mlounge.data.providers;

import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends WebViewClient {
    final /* synthetic */ CompletableDeferred<Boolean> $deferred;
    final /* synthetic */ e1 this$0;

    public b1(CompletableDeferred completableDeferred, e1 e1Var) {
        this.$deferred = completableDeferred;
        this.this$0 = e1Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        int iA0;
        if (this.$deferred.isCompleted()) {
            return;
        }
        kotlin.o oVar = com.app.mlounge.util.a.a;
        String cookie = CookieManager.getInstance().getCookie("https://noodlemagazine.com");
        if (cookie != null) {
            Iterator it = kotlin.text.k.p0(new String[]{";"}, cookie, 6).iterator();
            while (it.hasNext()) {
                String string = kotlin.text.k.A0((String) it.next()).toString();
                if (string.length() != 0 && (iA0 = kotlin.text.k.a0(string, '=', 0, 6)) >= 0) {
                    String strSubstring = string.substring(0, iA0);
                    String strSubstring2 = string.substring(iA0 + 1);
                    com.google.android.material.shape.a0 a0Var = new com.google.android.material.shape.a0(1);
                    a0Var.f(null, "https://noodlemagazine.com");
                    String str2 = strSubstring + "=" + strSubstring2 + "; path=/; domain=" + a0Var.c().d;
                    Pattern pattern = okhttp3.m.k;
                    com.google.android.material.shape.a0 a0Var2 = new com.google.android.material.shape.a0(1);
                    a0Var2.f(null, "https://noodlemagazine.com");
                    okhttp3.m mVarO = com.google.common.base.i.o(a0Var2.c(), str2);
                    if (mVarO != null) {
                        w0 w0Var = this.this$0.cookieJar;
                        com.google.android.material.shape.a0 a0Var3 = new com.google.android.material.shape.a0(1);
                        a0Var3.f(null, "https://noodlemagazine.com");
                        w0Var.g(a0Var3.c(), com.google.common.base.c.p(mVarO));
                    }
                }
            }
            kotlin.o oVar2 = com.app.mlounge.util.a.a;
        }
        if (webView != null) {
            webView.destroy();
        }
        this.$deferred.complete(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.$deferred.isCompleted()) {
            return;
        }
        kotlin.o oVar = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.f("NoodleMag", "warmupWithWebView: error " + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)));
        if (webView != null) {
            webView.destroy();
        }
        this.$deferred.complete(Boolean.FALSE);
    }
}
