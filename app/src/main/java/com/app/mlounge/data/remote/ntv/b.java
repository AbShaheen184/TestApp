package com.app.mlounge.data.remote.ntv;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ WebView y;

    public /* synthetic */ b(WebView webView, int i) {
        this.e = i;
        this.y = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                WebView webView = this.y;
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.destroy();
                break;
            case 1:
                WebView webView2 = this.y;
                webView2.stopLoading();
                webView2.loadUrl("about:blank");
                webView2.destroy();
                break;
            default:
                WebView webView3 = this.y;
                webView3.stopLoading();
                webView3.loadUrl("about:blank");
                webView3.destroy();
                break;
        }
    }
}
