package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class EpornerThumb {
    public static final int $stable = 0;
    private final Integer height;
    private final String src;
    private final Integer width;

    public EpornerThumb(String str, Integer num, Integer num2) {
        this.src = str;
        this.width = num;
        this.height = num2;
    }

    public final String a() {
        return this.src;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpornerThumb)) {
            return false;
        }
        EpornerThumb epornerThumb = (EpornerThumb) obj;
        return l.a(this.src, epornerThumb.src) && l.a(this.width, epornerThumb.width) && l.a(this.height, epornerThumb.height);
    }

    public final int hashCode() {
        String str = this.src;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "EpornerThumb(src=" + this.src + ", width=" + this.width + ", height=" + this.height + ")";
    }
}
