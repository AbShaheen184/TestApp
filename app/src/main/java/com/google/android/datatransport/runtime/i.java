package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.appcompat.widget.c2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;
    public final byte[] b;
    public final com.google.android.datatransport.d c;

    public i(String str, byte[] bArr, com.google.android.datatransport.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static c2 a() {
        c2 c2Var = new c2(28, false);
        c2Var.A = com.google.android.datatransport.d.e;
        return c2Var;
    }

    public final i b(com.google.android.datatransport.d dVar) {
        c2 c2VarA = a();
        c2VarA.Y(this.a);
        if (dVar == null) {
            com.google.gson.b.h("Null priority");
            return null;
        }
        c2VarA.A = dVar;
        c2VarA.z = this.b;
        return c2VarA.q();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.a.equals(iVar.a) && Arrays.equals(this.b, iVar.b) && this.c.equals(iVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, strEncodeToString, ")");
    }
}
