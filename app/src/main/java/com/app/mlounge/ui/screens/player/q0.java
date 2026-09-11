package com.app.mlounge.ui.screens.player;

import android.content.Context;
import android.graphics.Color;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.remote.model.ChqStream;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ z0 y;

    public /* synthetic */ q0(z0 z0Var, int i) {
        this.e = i;
        this.y = z0Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Object value;
        androidx.media3.common.util.b bVar;
        Object value2;
        String strK;
        String strK2;
        String strK3;
        Object value3;
        StringBuilder sbW;
        Object value4;
        Object value5;
        o0 o0Var;
        float fFloatValue;
        int iIntValue;
        int iIntValue2;
        boolean zBooleanValue;
        Boolean bool;
        switch (this.e) {
            case 0:
                com.app.mlounge.data.repository.g0 g0Var = (com.app.mlounge.data.repository.g0) obj;
                z0 z0Var = this.y;
                MutableStateFlow mutableStateFlow = z0Var.e;
                if (g0Var instanceof com.app.mlounge.data.repository.d0) {
                    do {
                        value4 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value4, o0.a((o0) value4, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, "Finding sources...", null, false, false, false, 0, -268435457, 3)));
                } else if (g0Var instanceof com.app.mlounge.data.repository.f0) {
                    do {
                        value3 = mutableStateFlow.getValue();
                        com.app.mlounge.data.repository.f0 f0Var = (com.app.mlounge.data.repository.f0) g0Var;
                        int i = f0Var.a;
                        int i2 = f0Var.b;
                        String str = f0Var.c;
                        sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Trying Source ", "/", i, ": ", i2);
                        sbW.append(str);
                    } while (!mutableStateFlow.compareAndSet(value3, o0.a((o0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, sbW.toString(), null, false, false, false, 0, -268435457, 3)));
                } else if (g0Var instanceof com.app.mlounge.data.repository.e0) {
                    com.app.mlounge.data.repository.e0 e0Var = (com.app.mlounge.data.repository.e0) g0Var;
                    String str2 = e0Var.b;
                    ChqStream chqStream = e0Var.a;
                    okhttp3.y yVarB = n0.b(str2, chqStream.e());
                    z0Var.r = yVarB;
                    Context context = z0Var.d;
                    boolean z = kotlin.text.k.T(str2, ".m3u8", false) || ((strK3 = chqStream.k()) != null && kotlin.text.k.T(strK3, "mpegurl", true));
                    boolean z2 = (kotlin.text.k.T(str2, ".mkv", true) || ((strK2 = chqStream.k()) != null && kotlin.text.k.T(strK2, "matroska", true))) && (kotlin.text.k.T(str2, "googleusercontent.com", false) || kotlin.text.k.T(str2, "googleapis.com", false));
                    if (z2) {
                        context.getClass();
                        bVar = n0.a.d(context, yVarB);
                    } else {
                        bVar = new androidx.media3.common.util.b(context, new androidx.media3.common.util.b(yVarB));
                    }
                    z0Var.p = bVar;
                    kotlin.coroutines.d dVar2 = null;
                    androidx.transition.k kVar = z2 ? new androidx.transition.k(10) : null;
                    z0Var.q = kVar;
                    context.getClass();
                    boolean z3 = z;
                    androidx.media3.exoplayer.source.a aVarA = n0.a(context, str2, z3, bVar, null, chqStream.k(), kVar);
                    boolean z4 = kotlin.jvm.internal.l.a(z0Var.n, "music") && !z3 && ((strK = chqStream.k()) == null || !kotlin.text.k.T(strK, "video", true));
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, o0.a((o0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, z4, 0, -1, 2)));
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new androidx.compose.foundation.text.input.internal.k(z0Var, aVarA, dVar2, 10), dVar);
                    if (objWithContext == kotlin.coroutines.intrinsics.a.e) {
                        return objWithContext;
                    }
                } else if (g0Var instanceof com.app.mlounge.data.repository.c0) {
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, o0.a((o0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, ((com.app.mlounge.data.repository.c0) g0Var).a, null, false, false, null, null, false, false, false, 0, -142606337, 3)));
                }
                return kotlin.y.a;
            default:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
                Long l = (Long) aVar.c(y1.F0);
                long jLongValue = l != null ? l.longValue() : 30000L;
                z0 z0Var2 = this.y;
                z0Var2.o = jLongValue;
                MutableStateFlow mutableStateFlow2 = z0Var2.e;
                do {
                    value5 = mutableStateFlow2.getValue();
                    o0Var = (o0) value5;
                    Float f = (Float) aVar.c(y1.H0);
                    fFloatValue = f != null ? f.floatValue() : 16.0f;
                    Integer num = (Integer) aVar.c(y1.I0);
                    iIntValue = num != null ? num.intValue() : -1;
                    Integer num2 = (Integer) aVar.c(y1.J0);
                    iIntValue2 = num2 != null ? num2.intValue() : Color.argb(128, 0, 0, 0);
                    Boolean bool2 = (Boolean) aVar.c(y1.D0);
                    zBooleanValue = bool2 != null ? bool2.booleanValue() : true;
                    bool = (Boolean) aVar.c(y1.E0);
                } while (!mutableStateFlow2.compareAndSet(value5, o0.a(o0Var, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, fFloatValue, iIntValue, iIntValue2, 0L, null, false, false, null, null, null, false, false, null, null, zBooleanValue, bool != null ? bool.booleanValue() : false, false, 0, 1073512447, 3)));
                return kotlin.y.a;
        }
    }
}
