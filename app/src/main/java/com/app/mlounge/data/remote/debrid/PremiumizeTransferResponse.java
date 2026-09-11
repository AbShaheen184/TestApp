package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class PremiumizeTransferResponse {
    public static final int $stable = 0;

    @b("id")
    private final String id;

    @b("message")
    private final String message;

    @b("name")
    private final String name;

    @b("status")
    private final String status;

    public final String a() {
        return this.id;
    }

    public final boolean b() {
        return l.a(this.status, "success");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumizeTransferResponse)) {
            return false;
        }
        PremiumizeTransferResponse premiumizeTransferResponse = (PremiumizeTransferResponse) obj;
        return l.a(this.status, premiumizeTransferResponse.status) && l.a(this.id, premiumizeTransferResponse.id) && l.a(this.name, premiumizeTransferResponse.name) && l.a(this.message, premiumizeTransferResponse.message);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.status;
        String str2 = this.id;
        return c.l(c.o("PremiumizeTransferResponse(status=", str, ", id=", str2, ", name="), this.name, ", message=", this.message, ")");
    }
}
