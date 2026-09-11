package com.app.mlounge.ui.screens.games;

import androidx.compose.runtime.h0;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.ui.viewmodel.s;
import kotlin.jvm.functions.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int e;
    public final /* synthetic */ s y;

    public /* synthetic */ b(s sVar, int i) {
        this.e = i;
        this.y = sVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((h0) obj).getClass();
                return new androidx.activity.compose.d(this.y, 13);
            case 1:
                GamePlatform gamePlatform = (GamePlatform) obj;
                gamePlatform.getClass();
                this.y.g(gamePlatform);
                return y.a;
            case 2:
                s sVar = this.y;
                sVar.C.setValue((String) obj);
                sVar.f();
                return y.a;
            default:
                s sVar2 = this.y;
                sVar2.E.setValue((String) obj);
                sVar2.f();
                return y.a;
        }
    }
}
