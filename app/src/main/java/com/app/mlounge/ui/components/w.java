package com.app.mlounge.ui.components;

import androidx.compose.runtime.y0;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.m1;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ k2 y;
    public final /* synthetic */ y0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(k2 k2Var, y0 y0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = k2Var;
        this.z = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new w(this.y, this.z, dVar, 0);
            case 1:
                return new w(this.y, this.z, dVar, 1);
            case 2:
                return new w(this.y, this.z, dVar, 2);
            case 3:
                return new w(this.y, this.z, dVar, 3);
            case 4:
                return new w(this.y, this.z, dVar, 4);
            case 5:
                return new w(this.y, this.z, dVar, 5);
            default:
                return new w(this.y, this.z, dVar, 6);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                w wVar = (w) create(coroutineScope, dVar);
                kotlin.y yVar = kotlin.y.a;
                wVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                w wVar2 = (w) create(coroutineScope, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                wVar2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                w wVar3 = (w) create(coroutineScope, dVar);
                kotlin.y yVar3 = kotlin.y.a;
                wVar3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                w wVar4 = (w) create(coroutineScope, dVar);
                kotlin.y yVar4 = kotlin.y.a;
                wVar4.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                w wVar5 = (w) create(coroutineScope, dVar);
                kotlin.y yVar5 = kotlin.y.a;
                wVar5.invokeSuspend(yVar5);
                return yVar5;
            case 5:
                w wVar6 = (w) create(coroutineScope, dVar);
                kotlin.y yVar6 = kotlin.y.a;
                wVar6.invokeSuspend(yVar6);
                return yVar6;
            default:
                w wVar7 = (w) create(coroutineScope, dVar);
                kotlin.y yVar7 = kotlin.y.a;
                wVar7.invokeSuspend(yVar7);
                return yVar7;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        k2 k2Var = this.y;
        y0 y0Var = this.z;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                if (((Boolean) y0Var.getValue()).booleanValue() && k2Var != null) {
                    ((m1) k2Var).b();
                }
                break;
            case 1:
                kotlin.a.e(obj);
                if (((Boolean) y0Var.getValue()).booleanValue() && k2Var != null) {
                    ((m1) k2Var).b();
                }
                break;
            case 2:
                kotlin.a.e(obj);
                if (((Boolean) y0Var.getValue()).booleanValue() && k2Var != null) {
                    ((m1) k2Var).b();
                }
                break;
            case 3:
                kotlin.a.e(obj);
                if (((Boolean) y0Var.getValue()).booleanValue() && k2Var != null) {
                    ((m1) k2Var).b();
                }
                break;
            case 4:
                kotlin.a.e(obj);
                if (((Boolean) y0Var.getValue()).booleanValue() && k2Var != null) {
                    ((m1) k2Var).b();
                }
                break;
            case 5:
                kotlin.a.e(obj);
                if (((Boolean) y0Var.getValue()).booleanValue() && k2Var != null) {
                    ((m1) k2Var).b();
                }
                break;
            default:
                kotlin.a.e(obj);
                List list = com.app.mlounge.ui.screens.settings.e0.a;
                if (((Boolean) y0Var.getValue()).booleanValue() && k2Var != null) {
                    ((m1) k2Var).b();
                }
                break;
        }
        return yVar;
    }
}
