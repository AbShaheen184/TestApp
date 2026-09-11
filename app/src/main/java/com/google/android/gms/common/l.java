package com.google.android.gms.common;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends com.google.android.gms.internal.base.b implements IInterface {
    public final int e;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        x.b(bArr.length == 25);
        this.e = Arrays.hashCode(bArr);
    }

    public static byte[] J(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            net.luminis.tls.engine.impl.c.m(e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.base.b
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            com.google.android.gms.dynamic.a aVarI = I();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.g.b(parcel2, aVarI);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.e);
        return true;
    }

    public abstract byte[] H();

    public final com.google.android.gms.dynamic.a I() {
        return new com.google.android.gms.dynamic.b(H());
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.dynamic.a aVarI;
        if (obj instanceof l) {
            try {
                l lVar = (l) obj;
                if (lVar.e == this.e && (aVarI = lVar.I()) != null) {
                    return Arrays.equals(H(), (byte[]) com.google.android.gms.dynamic.b.I(aVarI));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
