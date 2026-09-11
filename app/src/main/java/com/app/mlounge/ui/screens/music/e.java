package com.app.mlounge.ui.screens.music;

import androidx.lifecycle.l0;
import com.app.mlounge.ui.viewmodel.f0;
import com.app.mlounge.ui.viewmodel.h0;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ h0 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h0 h0Var, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = h0Var;
        this.z = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new e(this.y, this.z, dVar, 0);
            case 1:
                return new e(this.y, this.z, dVar, 1);
            default:
                return new e(this.y, this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                e eVar = (e) create(coroutineScope, dVar);
                y yVar = y.a;
                eVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                e eVar2 = (e) create(coroutineScope, dVar);
                y yVar2 = y.a;
                eVar2.invokeSuspend(yVar2);
                return yVar2;
            default:
                e eVar3 = (e) create(coroutineScope, dVar);
                y yVar3 = y.a;
                eVar3.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                h0 h0Var = this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(h0Var), null, null, new f0(h0Var, this.z, null, 0), 3, null);
                break;
            case 1:
                kotlin.a.e(obj);
                h0 h0Var2 = this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(h0Var2), null, null, new f0(h0Var2, this.z, null, 0), 3, null);
                break;
            default:
                kotlin.a.e(obj);
                h0 h0Var3 = this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(h0Var3), null, null, new f0(h0Var3, this.z, null, 1), 3, null);
                break;
        }
        return y.a;
    }
}
