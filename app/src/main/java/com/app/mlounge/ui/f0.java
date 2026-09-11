package com.app.mlounge.ui;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.y0;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.Map;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements FlowCollector {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ y0 F;
    public final /* synthetic */ y0 G;
    public final /* synthetic */ kotlin.jvm.functions.w e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public f0(kotlin.jvm.functions.w wVar, String str, String str2, int i, int i2, int i3, String str3, Context context, y0 y0Var, y0 y0Var2) {
        this.e = wVar;
        this.y = str;
        this.z = str2;
        this.A = i;
        this.B = i2;
        this.C = i3;
        this.D = str3;
        this.E = context;
        this.F = y0Var;
        this.G = y0Var2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        com.app.mlounge.data.repository.g0 g0Var = (com.app.mlounge.data.repository.g0) obj;
        boolean z = g0Var instanceof com.app.mlounge.data.repository.d0;
        y0 y0Var = this.F;
        if (z) {
            y0Var.setValue("Finding sources...");
        } else if (g0Var instanceof com.app.mlounge.data.repository.f0) {
            com.app.mlounge.data.repository.f0 f0Var = (com.app.mlounge.data.repository.f0) g0Var;
            int i = f0Var.a;
            int i2 = f0Var.b;
            String str = f0Var.c;
            StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Trying Source ", "/", i, ": ", i2);
            sbW.append(str);
            y0Var.setValue(sbW.toString());
        } else {
            boolean z2 = g0Var instanceof com.app.mlounge.data.repository.e0;
            y0 y0Var2 = this.G;
            if (z2) {
                y0Var2.setValue(Boolean.FALSE);
                com.app.mlounge.data.repository.e0 e0Var = (com.app.mlounge.data.repository.e0) g0Var;
                ChqStream chqStream = e0Var.a;
                String str2 = e0Var.b;
                Map mapE = chqStream.e();
                String strK = chqStream.k();
                if (strK == null) {
                    strK = "mp4";
                }
                this.e.b(str2, this.y, mapE, this.z, strK, new Integer(this.A), new Integer(this.B), new Integer(this.C), this.D);
            } else if (g0Var instanceof com.app.mlounge.data.repository.c0) {
                y0Var2.setValue(Boolean.FALSE);
                Toast.makeText(this.E, ((com.app.mlounge.data.repository.c0) g0Var).a, 0).show();
            }
        }
        return kotlin.y.a;
    }
}
