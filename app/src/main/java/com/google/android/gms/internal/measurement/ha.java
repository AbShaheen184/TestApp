package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ha {
    public final Context a;
    public final com.google.common.base.t b;

    public ha(Context context, com.google.common.base.t tVar) {
        this.a = context;
        this.b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ha)) {
            return false;
        }
        ha haVar = (ha) obj;
        if (!this.a.equals(haVar.a)) {
            return false;
        }
        com.google.common.base.t tVar = haVar.b;
        com.google.common.base.t tVar2 = this.b;
        if (tVar2 == null) {
            return tVar == null;
        }
        return tVar2.equals(tVar);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        com.google.common.base.t tVar = this.b;
        return (iHashCode * 1000003) ^ (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
