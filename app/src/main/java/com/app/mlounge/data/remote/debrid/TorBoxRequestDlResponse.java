package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TorBoxRequestDlResponse {
    public static final int $stable = 0;

    @b("data")
    private final String data;

    @b("detail")
    private final String detail;

    @b("error")
    private final String error;

    @b("success")
    private final boolean success;

    public final String a() {
        return this.data;
    }

    public final boolean b() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TorBoxRequestDlResponse)) {
            return false;
        }
        TorBoxRequestDlResponse torBoxRequestDlResponse = (TorBoxRequestDlResponse) obj;
        return this.success == torBoxRequestDlResponse.success && l.a(this.detail, torBoxRequestDlResponse.detail) && l.a(this.error, torBoxRequestDlResponse.error) && l.a(this.data, torBoxRequestDlResponse.data);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.detail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.data;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.success;
        String str = this.detail;
        String str2 = this.error;
        String str3 = this.data;
        StringBuilder sb = new StringBuilder("TorBoxRequestDlResponse(success=");
        sb.append(z);
        sb.append(", detail=");
        sb.append(str);
        sb.append(", error=");
        return c.l(sb, str2, ", data=", str3, ")");
    }
}
