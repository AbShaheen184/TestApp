package com.app.mlounge.ui;

import androidx.compose.runtime.y0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.navigation.y A;
    public final /* synthetic */ y0 B;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z, String str, String str2, androidx.navigation.y yVar, y0 y0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = z;
        this.y = str;
        this.z = str2;
        this.A = yVar;
        this.B = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new d0(this.e, this.y, this.z, this.A, this.B, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        d0Var.invokeSuspend(yVar);
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.a.e(obj);
        boolean z = this.e;
        String str = this.z;
        if (z) {
            this.B.setValue(Boolean.TRUE);
            this.A.a(str, new q(15));
        } else {
            com.app.mlounge.ui.navigation.k kVar = com.app.mlounge.ui.navigation.k.g;
            if (kotlin.jvm.internal.l.a(this.y, kVar.a) && !kotlin.jvm.internal.l.a(str, kVar.a)) {
                this.B.setValue(Boolean.TRUE);
                this.A.a(str, new q(15));
            }
        }
        return kotlin.y.a;
    }
}
