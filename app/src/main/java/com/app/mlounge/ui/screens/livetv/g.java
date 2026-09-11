package com.app.mlounge.ui.screens.livetv;

import android.content.Context;
import android.widget.Toast;
import kotlin.y;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;

    public /* synthetic */ g(Context context, int i) {
        this.e = i;
        this.y = context;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                Toast.makeText(this.y, (String) obj, 0).show();
                break;
            case 1:
                Toast.makeText(this.y, (String) obj, 0).show();
                break;
            default:
                Toast.makeText(this.y, "Download started: " + ((String) obj), 0).show();
                break;
        }
        return y.a;
    }
}
