package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class zb {
    public final mb a;
    public final androidx.core.view.r b;

    public zb(mb mbVar, androidx.core.view.r rVar) {
        this.a = mbVar;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        mb mbVar = zbVar.a;
        mb mbVar2 = this.a;
        if (mbVar2 == null) {
            if (mbVar != null) {
                return false;
            }
        } else if (!mbVar2.equals(mbVar)) {
            return false;
        }
        return this.b.equals(zbVar.b);
    }

    public final int hashCode() {
        mb mbVar = this.a;
        return (((mbVar == null ? 0 : mbVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }
}
