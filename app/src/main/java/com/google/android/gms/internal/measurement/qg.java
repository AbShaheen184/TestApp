package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class qg implements hg {
    public final hg a;
    public final Object b;

    public qg(hg hgVar, Object obj) {
        this.a = hgVar;
        e1.c(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj;
        return this.a.equals(qgVar.a) && this.b.equals(qgVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb.append("' }");
        return sb.toString();
    }
}
