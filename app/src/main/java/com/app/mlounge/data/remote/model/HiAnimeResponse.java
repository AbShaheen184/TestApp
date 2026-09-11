package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeResponse<T> {
    public static final int $stable = 0;
    private final T data;
    private final Integer status = Integer.valueOf(Context.VERSION_ES6);

    /* JADX WARN: Multi-variable type inference failed */
    public HiAnimeResponse(Object obj) {
        this.data = obj;
    }

    public final Object a() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeResponse)) {
            return false;
        }
        HiAnimeResponse hiAnimeResponse = (HiAnimeResponse) obj;
        return l.a(this.status, hiAnimeResponse.status) && l.a(this.data, hiAnimeResponse.data);
    }

    public final int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        T t = this.data;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeResponse(status=" + this.status + ", data=" + this.data + ")";
    }
}
