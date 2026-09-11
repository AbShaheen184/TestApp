package com.app.mlounge.data.remote.ntv;

import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import com.app.mlounge.ui.viewmodel.g1;
import com.app.mlounge.ui.viewmodel.k1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a0;
import kotlin.jvm.internal.v;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                if (!((v) this.y).e) {
                    ((Handler) this.z).post(new b((WebView) this.A, 1));
                }
                return y.a;
            case 1:
                if (!((v) this.y).e) {
                    ((Handler) this.z).post(new b((WebView) this.A, 2));
                }
                return y.a;
            default:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent.getClass();
                y0 y0Var = (y0) this.A;
                if (((String) y0Var.getValue()) == null || keyEvent.getAction() != 0) {
                    z = false;
                } else {
                    int keyCode = keyEvent.getKeyCode();
                    z = true;
                    kotlin.coroutines.d dVar = null;
                    if (keyCode == 4) {
                        y0Var.setValue(null);
                    } else {
                        LinkedHashMap linkedHashMapI = a0.I((Map) this.y);
                        String str = (String) y0Var.getValue();
                        str.getClass();
                        linkedHashMapI.put(str, Integer.valueOf(keyCode));
                        String string = new JSONObject(a0.H(linkedHashMapI)).toString();
                        string.getClass();
                        k1 k1Var = (k1) this.z;
                        BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var), null, null, new g1(k1Var, string, dVar, 4), 3, null);
                        y0Var.setValue(null);
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
