package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import coil3.compose.internal.f;
import com.google.gson.annotations.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class EpornerVideoDetail {
    public static final int $stable = 8;
    private final String added;

    @b("default_thumb")
    private final EpornerThumb defaultThumb;
    private final String id;
    private final String keywords;

    @b("length_min")
    private final String lengthMin;
    private final String rate;
    private final List<EpornerThumb> thumbs;
    private final String title;
    private final Long views;

    public EpornerVideoDetail(String str, String str2, String str3, Long l, String str4, String str5, String str6, EpornerThumb epornerThumb, ArrayList arrayList) {
        this.id = str;
        this.title = str2;
        this.keywords = str3;
        this.views = l;
        this.rate = str4;
        this.added = str5;
        this.lengthMin = str6;
        this.defaultThumb = epornerThumb;
        this.thumbs = arrayList;
    }

    public final String a() {
        return this.added;
    }

    public final EpornerThumb b() {
        return this.defaultThumb;
    }

    public final String c() {
        return this.id;
    }

    public final String d() {
        return this.keywords;
    }

    public final String e() {
        return this.lengthMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpornerVideoDetail)) {
            return false;
        }
        EpornerVideoDetail epornerVideoDetail = (EpornerVideoDetail) obj;
        return l.a(this.id, epornerVideoDetail.id) && l.a(this.title, epornerVideoDetail.title) && l.a(this.keywords, epornerVideoDetail.keywords) && l.a(this.views, epornerVideoDetail.views) && l.a(this.rate, epornerVideoDetail.rate) && l.a(this.added, epornerVideoDetail.added) && l.a(this.lengthMin, epornerVideoDetail.lengthMin) && l.a(this.defaultThumb, epornerVideoDetail.defaultThumb) && l.a(this.thumbs, epornerVideoDetail.thumbs);
    }

    public final String f() {
        return this.rate;
    }

    public final List g() {
        return this.thumbs;
    }

    public final String h() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.keywords;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.views;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.rate;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.added;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lengthMin;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EpornerThumb epornerThumb = this.defaultThumb;
        int iHashCode8 = (iHashCode7 + (epornerThumb == null ? 0 : epornerThumb.hashCode())) * 31;
        List<EpornerThumb> list = this.thumbs;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final Long i() {
        return this.views;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.keywords;
        Long l = this.views;
        String str4 = this.rate;
        String str5 = this.added;
        String str6 = this.lengthMin;
        EpornerThumb epornerThumb = this.defaultThumb;
        List<EpornerThumb> list = this.thumbs;
        StringBuilder sbO = c.o("EpornerVideoDetail(id=", str, ", title=", str2, ", keywords=");
        sbO.append(str3);
        sbO.append(", views=");
        sbO.append(l);
        sbO.append(", rate=");
        c.y(sbO, str4, ", added=", str5, ", lengthMin=");
        sbO.append(str6);
        sbO.append(", defaultThumb=");
        sbO.append(epornerThumb);
        sbO.append(", thumbs=");
        return f.f(sbO, list, ")");
    }
}
