package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class sc implements com.google.android.gms.common.api.internal.h {
    public static volatile com.google.common.collect.f1 A;
    public static final Object z = new Object();
    public final /* synthetic */ int e;
    public final String y;

    public sc(Context context, tc tcVar) {
        this.e = 0;
        this.y = tcVar.v() ? la.b(context, tcVar.u()) : tcVar.u();
    }

    @Override // com.google.android.gms.common.api.internal.h
    public void accept(Object obj, Object obj2) {
        int i = this.e;
        String str = this.y;
        com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) obj2;
        ba baVar = (ba) obj;
        switch (i) {
            case 1:
                int i2 = z9.j;
                x9 x9Var = new x9(jVar);
                aa aaVar = (aa) baVar.t();
                Parcel parcelH = aaVar.h();
                o5.c(parcelH, x9Var);
                parcelH.writeString(str);
                parcelH.writeString("");
                parcelH.writeString(null);
                aaVar.G(parcelH, 11);
                break;
            default:
                int i3 = z9.j;
                x9 x9Var2 = new x9(jVar);
                aa aaVar2 = (aa) baVar.t();
                Parcel parcelH2 = aaVar2.h();
                o5.c(parcelH2, x9Var2);
                parcelH2.writeString(str);
                aaVar2.G(parcelH2, 5);
                break;
        }
    }

    public /* synthetic */ sc(String str, int i) {
        this.e = i;
        this.y = str;
    }
}
