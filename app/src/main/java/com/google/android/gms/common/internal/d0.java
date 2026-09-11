package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends s {
    public final IBinder g;
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e eVar, int i, IBinder iBinder, Bundle bundle) {
        super(eVar, i, bundle);
        this.h = eVar;
        this.g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.s
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            x.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.h;
            if (!eVar.u().equals(interfaceDescriptor)) {
                String strU = eVar.u();
                Log.w("GmsClient", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder(strU.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strU, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceN = eVar.n(iBinder);
            if (iInterfaceN == null || !(eVar.x(2, 4, iInterfaceN) || eVar.x(3, 4, iInterfaceN))) {
                return false;
            }
            eVar.Q = null;
            b bVar = eVar.L;
            if (bVar == null) {
                return true;
            }
            bVar.h();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.s
    public final void b(com.google.android.gms.common.b bVar) {
        c cVar = this.h.M;
        if (cVar != null) {
            cVar.d(bVar);
        }
        System.currentTimeMillis();
    }
}
