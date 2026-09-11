package com.app.mlounge.data.providers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public static final int $stable = 0;
    private final String title;
    private final Integer year;

    public i1(Integer num, String str) {
        this.title = str;
        this.year = num;
    }

    public final String a() {
        return this.title;
    }

    public final Integer b() {
        return this.year;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return kotlin.jvm.internal.l.a(this.title, i1Var.title) && kotlin.jvm.internal.l.a(this.year, i1Var.year);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.year;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TmdbDetails(title=" + this.title + ", year=" + this.year + ")";
    }
}
