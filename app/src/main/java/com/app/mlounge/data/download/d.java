package com.app.mlounge.data.download;

import android.content.Context;
import androidx.compose.runtime.y0;
import androidx.navigation.y;
import androidx.room.z;
import com.app.mlounge.data.local.dao.m;
import com.app.mlounge.ui.h0;
import com.app.mlounge.ui.i0;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.o;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.text.k;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements p {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Map D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ int e = 1;
    public int y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Context context, String str2, String str3, String str4, Map map, y yVar, String str5, String str6, int i, int i2, int i3, y0 y0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = str;
        this.J = context;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.D = map;
        this.K = yVar;
        this.E = str5;
        this.F = str6;
        this.G = i;
        this.H = i2;
        this.I = i3;
        this.L = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new d(this.D, (h) this.J, this.z, this.A, this.B, this.C, this.E, this.F, (String) this.K, (String) this.L, this.G, this.H, this.I, dVar);
            default:
                return new d(this.z, (Context) this.J, this.A, this.B, this.C, this.D, (y) this.K, this.E, this.F, this.G, this.H, this.I, (y0) this.L, dVar);
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
        return ((d) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Set setEntrySet;
        Object objWithContext;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        Object obj2 = this.K;
        String str = this.z;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        Object obj3 = this.L;
        Object obj4 = this.J;
        ?? R = 0;
        R = 0;
        switch (i) {
            case 0:
                h hVar = (h) obj4;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    Map map = this.D;
                    if (map != null && (setEntrySet = map.entrySet()) != null) {
                        R = o.R(setEntrySet, "\n", null, null, new z(6), 30);
                    }
                    hVar.getClass();
                    Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
                    patternCompile.getClass();
                    String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
                    strReplaceAll.getClass();
                    Pattern patternCompile2 = Pattern.compile("\\s+");
                    patternCompile2.getClass();
                    String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(" ");
                    strReplaceAll2.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    com.app.mlounge.data.local.entity.a aVar2 = new com.app.mlounge.data.local.entity.a(0L, this.A, k.y0(org.mozilla.javascript.Context.VERSION_ES6, k.A0(strReplaceAll2).toString()), this.B, this.C, this.E, this.F, (String) obj2, (String) obj3, "pending", 0, 0L, 0L, null, R, jCurrentTimeMillis, null, this.G, this.H, this.I, null);
                    com.app.mlounge.data.local.dao.g gVar = hVar.b;
                    this.y = 1;
                    objA = com.google.android.gms.dynamite.g.A(gVar.a, this, new com.app.mlounge.data.local.dao.a(gVar, aVar2, 0), false, true);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objA = obj;
                }
                long jLongValue = ((Number) objA).longValue();
                kotlin.o oVar = com.app.mlounge.util.a.a;
                hVar.k(jLongValue);
                return yVar;
            default:
                y0 y0Var = (y0) obj3;
                String str2 = this.A;
                int i3 = this.y;
                long j = 0;
                try {
                    if (i3 == 0) {
                        kotlin.a.e(obj);
                        if (str != null && !k.d0(str)) {
                            Context applicationContext = ((Context) obj4).getApplicationContext();
                            applicationContext.getClass();
                            m mVarB = ((com.app.mlounge.h) ((i0) com.google.android.material.resources.g.e(com.google.android.material.shape.e.e(applicationContext.getApplicationContext()), i0.class))).b();
                            if (!k.d0(str2)) {
                                CoroutineDispatcher io2 = Dispatchers.getIO();
                                androidx.room.coroutines.f fVar = new androidx.room.coroutines.f(mVarB, str2, R, 5);
                                this.y = 1;
                                objWithContext = BuildersKt.withContext(io2, fVar, this);
                                if (objWithContext == aVar) {
                                    return aVar;
                                }
                            }
                            h0.d((Context) obj4, this.B, this.C, this.D, this.z, j);
                            y0Var.setValue(Boolean.FALSE);
                            return yVar;
                        }
                        h0.f((y) obj2, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.A);
                        return yVar;
                    }
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objWithContext = obj;
                    com.app.mlounge.data.local.entity.e eVar = (com.app.mlounge.data.local.entity.e) objWithContext;
                    if (eVar != null && eVar.b()) {
                        j = eVar.b;
                    }
                    h0.d((Context) obj4, this.B, this.C, this.D, this.z, j);
                    y0Var.setValue(Boolean.FALSE);
                    return yVar;
                } catch (Exception e) {
                    com.app.mlounge.util.a.b("CinemaHQ", "Playback launch failed", e);
                    y0Var.setValue(Boolean.FALSE);
                    return yVar;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Map map, h hVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = map;
        this.J = hVar;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.E = str5;
        this.F = str6;
        this.K = str7;
        this.L = str8;
        this.G = i;
        this.H = i2;
        this.I = i3;
    }
}
