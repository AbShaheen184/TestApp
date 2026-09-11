package org.schabi.newpipe.extractor.services.youtube;

import androidx.core.view.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.schabi.newpipe.extractor.services.youtube.extractors.p;
import org.schabi.newpipe.extractor.services.youtube.extractors.s;
import org.schabi.newpipe.extractor.services.youtube.extractors.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends w0 {
    public static final List A;
    public static final List B;

    static {
        ArrayList arrayList = new ArrayList();
        String str = new String[]{"en-GB"}[0];
        arrayList.add((org.schabi.newpipe.extractor.localization.c) org.schabi.newpipe.extractor.utils.a.c(str).map(new androidx.media3.exoplayer.audio.f(16)).orElseThrow(new org.jsoup.internal.g(str, 1)));
        A = Collections.unmodifiableList(arrayList);
        String[] strArr = {"DZ", "AR", "AU", "AT", "AZ", "BH", "BD", "BY", "BE", "BO", "BA", "BR", "BG", "KH", "CA", "CL", "CO", "CR", "HR", "CY", "CZ", "DK", "DO", "EC", "EG", "SV", "EE", "FI", "FR", "GE", "DE", "GH", "GR", "GT", "HN", "HK", "HU", "IS", "IN", "ID", "IQ", "IE", "IL", "IT", "JM", "JP", "JO", "KZ", "KE", "KW", "LA", "LV", "LB", "LY", "LI", "LT", "LU", "MY", "MT", "MX", "ME", "MA", "NP", "NL", "NZ", "NI", "NG", "MK", "NO", "OM", "PK", "PA", "PG", "PY", "PE", "PH", "PL", "PT", "PR", "QA", "RO", "RU", "SA", "SN", "RS", "SG", "SK", "SI", "ZA", "KR", "ES", "LK", "SE", "CH", "TW", "TZ", "TH", "TN", "TR", "UG", "UA", "AE", "GB", "US", "UY", "VE", "VN", "YE", "ZW"};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 109; i++) {
            arrayList2.add(new org.schabi.newpipe.extractor.localization.a(strArr[i]));
        }
        B = Collections.unmodifiableList(arrayList2);
    }

    public final org.schabi.newpipe.extractor.playlist.a P(org.schabi.newpipe.extractor.linkhandler.e eVar) {
        List list = eVar.A;
        return (list.isEmpty() || !((String) list.get(0)).startsWith("music_")) ? new s(this, eVar) : new org.schabi.newpipe.extractor.services.youtube.extractors.k(this, eVar);
    }

    @Override // androidx.core.view.w0
    public final org.schabi.newpipe.extractor.linkhandler.c b() {
        return org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b;
    }

    @Override // androidx.core.view.w0
    public final org.schabi.newpipe.extractor.playlist.a d(org.schabi.newpipe.extractor.linkhandler.b bVar) {
        String str = bVar.z;
        String str2 = i.a;
        return str.startsWith("RD") ? new org.schabi.newpipe.extractor.services.youtube.extractors.h(this, bVar) : new p(this, bVar);
    }

    @Override // androidx.core.view.w0
    public final org.schabi.newpipe.extractor.linkhandler.c e() {
        return org.schabi.newpipe.extractor.services.youtube.linkHandler.b.c;
    }

    @Override // androidx.core.view.w0
    public final org.schabi.newpipe.extractor.f f(org.schabi.newpipe.extractor.linkhandler.a aVar) {
        y yVar = new y(this, aVar);
        yVar.n = -1;
        return yVar;
    }

    @Override // androidx.core.view.w0
    public final com.google.common.base.b g() {
        return org.schabi.newpipe.extractor.services.youtube.linkHandler.c.c;
    }

    @Override // androidx.core.view.w0
    public final List h() {
        return B;
    }

    @Override // androidx.core.view.w0
    public final List j() {
        return A;
    }
}
