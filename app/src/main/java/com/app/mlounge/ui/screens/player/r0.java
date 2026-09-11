package com.app.mlounge.ui.screens.player;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ z0 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(String str, int i, z0 z0Var, int i2, int i3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = str;
        this.z = i;
        this.A = z0Var;
        this.B = i2;
        this.C = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new r0(this.y, this.z, this.A, this.B, this.C, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i;
        String str;
        Object value2;
        String str2;
        Integer numQ;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = this.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                String str3 = this.y;
                Pattern patternCompile = Pattern.compile("\\s+S\\d+E\\d+.*", 66);
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(str3).replaceAll("");
                strReplaceAll.getClass();
                Pattern patternCompile2 = Pattern.compile("\\s+-\\s+Episode\\s+\\d+.*", 66);
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
                strReplaceAll2.getClass();
                String string = kotlin.text.k.A0(strReplaceAll2).toString();
                if (this.z > 1 || !kotlin.text.k.T(this.y, "Episode", true)) {
                    i = this.z;
                } else {
                    Pattern patternCompile3 = Pattern.compile("Episode\\s+(\\d+)", 66);
                    patternCompile3.getClass();
                    String str4 = this.y;
                    Matcher matcher = patternCompile3.matcher(str4);
                    matcher.getClass();
                    int iIntValue = 0;
                    kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, str4);
                    if (gVarC != null && (str2 = (String) ((kotlin.collections.b0) gVarC.a()).get(1)) != null && (numQ = kotlin.text.r.Q(str2)) != null) {
                        iIntValue = numQ.intValue();
                    }
                    i = iIntValue + 1;
                }
                int i3 = i;
                if (kotlin.jvm.internal.l.a(this.A.n, "anime")) {
                    str = string + " - Episode " + i3;
                } else {
                    str = string + " S" + this.B + "E" + i3;
                }
                String str5 = str;
                MutableStateFlow mutableStateFlow = this.A.e;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, o0.a((o0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, true, "Finding sources...", str5, false, false, false, 0, -939524097, 3)));
                this.A.f();
                androidx.media3.exoplayer.c0 c0Var = this.A.g;
                String strX0 = null;
                if (c0Var != null) {
                    c0Var.V();
                    c0Var.Q(null);
                    com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
                    long j = c0Var.n0.s;
                    c0Var.d0 = new androidx.media3.common.text.c(a1Var);
                }
                if (kotlin.jvm.internal.l.a(this.A.n, "anime")) {
                    String str6 = this.A.m;
                    strX0 = kotlin.text.k.x0(kotlin.text.k.q0(str6, "anime:", str6), "-ep-");
                }
                z0 z0Var = this.A;
                com.app.mlounge.data.repository.r rVar = z0Var.c;
                String str7 = z0Var.n;
                String strValueOf = String.valueOf(this.C);
                int i4 = this.B;
                rVar.getClass();
                str7.getClass();
                strValueOf.getClass();
                string.getClass();
                Flow flowChannelFlow = FlowKt.channelFlow(new com.app.mlounge.data.repository.o(rVar, str7, strValueOf, i4, i3, strX0, string, null));
                q0 q0Var = new q0(this.A, 0);
                this.e = 1;
                if (flowChannelFlow.collect(q0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
        } catch (Exception e) {
            MutableStateFlow mutableStateFlow2 = this.A.e;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, o0.a((o0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Failed to load next episode: ", e.getMessage()), null, false, false, null, null, false, false, false, 0, -142606337, 3)));
        }
        return kotlin.y.a;
    }
}
