package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class je {
    public final Uri a;
    public final yb b;
    public final com.google.common.base.p c;
    public final com.google.common.collect.h0 d;

    public je(Uri uri, yb ybVar, com.google.common.base.p pVar, com.google.common.collect.h0 h0Var) {
        this.a = uri;
        this.b = ybVar;
        this.c = pVar;
        this.d = h0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof je)) {
            return false;
        }
        je jeVar = (je) obj;
        if (!this.a.equals(jeVar.a) || !this.b.equals(jeVar.b) || !this.c.equals(jeVar.c) || !this.d.equals(jeVar.d)) {
            return false;
        }
        Object obj2 = f1.z;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ f1.z.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        int length2 = string2.length();
        f1 f1Var = f1.z;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String string3 = f1Var.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, ", handler=", strValueOf, ", migrations=", strValueOf2);
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(sb, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
