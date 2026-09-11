package com.app.mlounge.data.remote.api;

import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class VavooResolveResponse {
    public static final int $stable = 8;
    private final Map<String, String> headers;
    private final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VavooResolveResponse)) {
            return false;
        }
        VavooResolveResponse vavooResolveResponse = (VavooResolveResponse) obj;
        return l.a(this.url, vavooResolveResponse.url) && l.a(this.headers, vavooResolveResponse.headers);
    }

    public final int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.headers;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "VavooResolveResponse(url=" + this.url + ", headers=" + this.headers + ")";
    }
}
