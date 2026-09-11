package com.app.mlounge.data.remote.ntv;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.room.z;
import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.v;
import kotlin.o;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends WebViewClient {
    public final /* synthetic */ z a;
    public final /* synthetic */ v b;
    public final /* synthetic */ CancellableContinuationImpl c;

    public c(z zVar, v vVar, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = zVar;
        this.b = vVar;
        this.c = cancellableContinuationImpl;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        o oVar = com.app.mlounge.util.a.a;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null || !((Boolean) this.a.invoke(string)).booleanValue()) {
            return null;
        }
        v vVar = this.b;
        if (vVar.e) {
            return null;
        }
        vVar.e = true;
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders == null) {
            requestHeaders = kotlin.collections.v.e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = requestHeaders.get("Origin");
        if (str != null) {
            linkedHashMap.put("Origin", str);
        } else {
            String str2 = (String) l.b.get("Origin");
            if (str2 != null) {
                linkedHashMap.put("Origin", str2);
            }
        }
        String str3 = requestHeaders.get("Referer");
        if (str3 != null) {
            linkedHashMap.put("Referer", str3);
        } else {
            String str4 = (String) l.b.get("Referer");
            if (str4 != null) {
                linkedHashMap.put("Referer", str4);
            }
        }
        String str5 = requestHeaders.get("User-Agent");
        if (str5 == null) {
            str5 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36";
        }
        linkedHashMap.put("User-Agent", str5);
        o oVar = com.app.mlounge.util.a.a;
        linkedHashMap.toString();
        this.c.resumeWith(new m(string, linkedHashMap));
        if (webView != null) {
            webView.post(new b(webView, 0));
        }
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
