package com.app.mlounge.data.remote.model;

import coil3.compose.internal.f;
import com.google.gson.annotations.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class EpornerSearchDetails {
    public static final int $stable = 8;
    private final Integer page;

    @b("per_page")
    private final Integer perPage;

    @b("total_count")
    private final Integer totalCount;

    @b("total_pages")
    private final Integer totalPages;
    private final List<EpornerVideo> videos;

    public EpornerSearchDetails(Integer num, Integer num2, Integer num3, Integer num4, ArrayList arrayList) {
        this.totalCount = num;
        this.totalPages = num2;
        this.page = num3;
        this.perPage = num4;
        this.videos = arrayList;
    }

    public final Integer a() {
        return this.page;
    }

    public final Integer b() {
        return this.totalPages;
    }

    public final List c() {
        return this.videos;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpornerSearchDetails)) {
            return false;
        }
        EpornerSearchDetails epornerSearchDetails = (EpornerSearchDetails) obj;
        return l.a(this.totalCount, epornerSearchDetails.totalCount) && l.a(this.totalPages, epornerSearchDetails.totalPages) && l.a(this.page, epornerSearchDetails.page) && l.a(this.perPage, epornerSearchDetails.perPage) && l.a(this.videos, epornerSearchDetails.videos);
    }

    public final int hashCode() {
        Integer num = this.totalCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.totalPages;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.page;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.perPage;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<EpornerVideo> list = this.videos;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.totalCount;
        Integer num2 = this.totalPages;
        Integer num3 = this.page;
        Integer num4 = this.perPage;
        List<EpornerVideo> list = this.videos;
        StringBuilder sb = new StringBuilder("EpornerSearchDetails(totalCount=");
        sb.append(num);
        sb.append(", totalPages=");
        sb.append(num2);
        sb.append(", page=");
        sb.append(num3);
        sb.append(", perPage=");
        sb.append(num4);
        sb.append(", videos=");
        return f.f(sb, list, ")");
    }
}
