package org.jsoup.helper;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j {
    public final Matcher a;

    public i(Matcher matcher) {
        this.a = matcher;
    }

    @Override // org.jsoup.helper.j
    public final boolean a() {
        return this.a.find();
    }
}
