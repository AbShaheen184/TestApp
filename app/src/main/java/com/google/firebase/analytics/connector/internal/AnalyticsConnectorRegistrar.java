package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.tasks.p;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.j;
import com.google.firebase.components.l;
import com.google.firebase.g;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.analytics.connector.a lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        com.google.firebase.events.c cVar2 = (com.google.firebase.events.c) cVar.a(com.google.firebase.events.c.class);
        x.g(gVar);
        x.g(context);
        x.g(cVar2);
        x.g(context.getApplicationContext());
        if (com.google.firebase.analytics.connector.b.c == null) {
            synchronized (com.google.firebase.analytics.connector.b.class) {
                try {
                    if (com.google.firebase.analytics.connector.b.c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.b)) {
                            ((l) cVar2).a(p.y, f0.F);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        com.google.firebase.analytics.connector.b.c = new com.google.firebase.analytics.connector.b(a7.c(context, bundle).b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return com.google.firebase.analytics.connector.b.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<com.google.firebase.components.b> getComponents() {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(com.google.firebase.analytics.connector.a.class);
        aVarB.a(j.b(g.class));
        aVarB.a(j.b(Context.class));
        aVarB.a(j.b(com.google.firebase.events.c.class));
        aVarB.f = e0.G;
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), com.google.android.material.textfield.p.i("fire-analytics", "23.2.0"));
    }
}
