package com.app.mlounge.data.remote.ntv;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.measurement.internal.a1;
import com.google.android.gms.measurement.internal.x2;
import java.util.Map;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g(a1 a1Var, int i, Exception exc, byte[] bArr, Map map) {
        this.z = a1Var;
        this.y = i;
        this.A = exc;
        this.B = bArr;
        this.C = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.e) {
            case 0:
                v vVar = (v) this.z;
                if (!vVar.e && (i = this.y) <= 20) {
                    this.y = i + 1;
                    WebView webView = (WebView) this.A;
                    webView.evaluateJavascript("(function() {   var s = document.getElementById('source');   return s ? s.src : null; })();", new f(vVar, (CancellableContinuationImpl) this.B, (Handler) this.C, this, webView));
                    break;
                }
                break;
            default:
                a1 a1Var = (a1) this.z;
                ((x2) a1Var.C).a(a1Var.A, this.y, (Exception) this.A, (byte[]) this.B, (Map) this.C);
                break;
        }
    }

    public g(Handler handler, WebView webView, v vVar, CancellableContinuationImpl cancellableContinuationImpl) {
        this.z = vVar;
        this.A = webView;
        this.B = cancellableContinuationImpl;
        this.C = handler;
    }
}
