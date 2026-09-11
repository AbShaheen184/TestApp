package com.app.mlounge.ui.screens.player;

import androidx.compose.foundation.gestures.x2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements PointerInputEventHandler {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kotlin.jvm.functions.l c;
    public final /* synthetic */ kotlin.jvm.functions.a d;

    public f0(long j, boolean z, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar) {
        this.a = j;
        this.b = z;
        this.c = lVar;
        this.d = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.y yVar, kotlin.coroutines.d dVar) {
        Object objD = x2.d(yVar, new androidx.compose.foundation.text.contextmenu.c(this.a, this.b, this.c, yVar, this.d), dVar);
        return objD == kotlin.coroutines.intrinsics.a.e ? objD : kotlin.y.a;
    }
}
