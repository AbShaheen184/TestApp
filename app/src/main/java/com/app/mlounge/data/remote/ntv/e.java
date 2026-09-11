package com.app.mlounge.data.remote.ntv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.room.z;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.v;
import kotlin.o;
import kotlin.y;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ String A;
    public final /* synthetic */ z B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ Context z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, String str, z zVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = context;
        this.A = str;
        this.B = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new e(this.z, this.A, this.B, dVar, 0);
            default:
                return new e(this.z, this.A, this.B, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        switch (i) {
            case 0:
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                this.y = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(this), 1);
                cancellableContinuationImpl.initCancellability();
                v vVar = new v();
                Handler handler = new Handler(Looper.getMainLooper());
                WebView webView = new WebView(this.z);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                webView.getSettings().setMixedContentMode(0);
                webView.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                webView.setWebChromeClient(new a());
                webView.setWebViewClient(new c(this.B, vVar, cancellableContinuationImpl));
                cancellableContinuationImpl.invokeOnCancellation(new d(0, vVar, handler, webView));
                o oVar = com.app.mlounge.util.a.a;
                webView.loadUrl(this.A);
                Object result = cancellableContinuationImpl.getResult();
                return result == aVar ? aVar : result;
            default:
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                e eVar = new e(this.z, this.A, this.B, null, 0);
                this.y = 1;
                Object objWithContext = BuildersKt.withContext(main, eVar, this);
                return objWithContext == aVar ? aVar : objWithContext;
        }
    }
}
