package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.PremiumizeManager;
import com.app.mlounge.data.remote.debrid.PremiumizeUserInfo;
import com.app.mlounge.data.remote.debrid.TorBoxManager;
import com.app.mlounge.data.remote.debrid.TorBoxUserInfo;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ e1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i, e1 e1Var, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = i;
        this.z = e1Var;
        this.A = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new a1(0, this.z, this.A, dVar);
            default:
                return new a1(1, this.z, this.A, dVar);
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
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                e1 e1Var = this.z;
                MutableStateFlow mutableStateFlow = e1Var.i;
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    mutableStateFlow.setValue(k0.a((k0) mutableStateFlow.getValue(), true, null, null, 5));
                    PremiumizeManager premiumizeManager = e1Var.c;
                    this.y = 1;
                    obj = premiumizeManager.h(this.A, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                PremiumizeUserInfo premiumizeUserInfo = (PremiumizeUserInfo) obj;
                if (premiumizeUserInfo != null) {
                    mutableStateFlow.setValue(new k0(premiumizeUserInfo, 10));
                } else {
                    mutableStateFlow.setValue(k0.a((k0) mutableStateFlow.getValue(), false, null, "Invalid API key. Please check and try again.", 5));
                }
                return kotlin.y.a;
            default:
                e1 e1Var2 = this.z;
                MutableStateFlow mutableStateFlow2 = e1Var2.k;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    mutableStateFlow2.setValue(s1.a((s1) mutableStateFlow2.getValue(), true, null, null, 5));
                    TorBoxManager torBoxManager = e1Var2.d;
                    this.y = 1;
                    obj = torBoxManager.i(this.A, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                TorBoxUserInfo torBoxUserInfo = (TorBoxUserInfo) obj;
                if (torBoxUserInfo != null) {
                    mutableStateFlow2.setValue(new s1(torBoxUserInfo, 10));
                } else {
                    mutableStateFlow2.setValue(s1.a((s1) mutableStateFlow2.getValue(), false, null, "Invalid API key. Please check and try again.", 5));
                }
                return kotlin.y.a;
        }
    }
}
