package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends a2 {
    public String A;
    public long z;

    public final String A() {
        x();
        return this.A;
    }

    @Override // com.google.android.gms.measurement.internal.a2
    public final boolean w() {
        Calendar calendar = Calendar.getInstance();
        this.z = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.A = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long z() {
        x();
        return this.z;
    }
}
