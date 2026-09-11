package com.google.gson.internal.bind;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.google.gson.n {
    public static final e c = new e();
    public final f a;
    public final ArrayList b;

    public g() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = f.a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.internal.i.a >= 9) {
            arrayList.add(new SimpleDateFormat(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        Date dateB;
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        synchronized (this.b) {
            try {
                for (DateFormat dateFormat : this.b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strL0);
                            dateFormat.setTimeZone(timeZone);
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (Throwable th) {
                        dateFormat.setTimeZone(timeZone);
                        throw th;
                    }
                }
                try {
                    dateB = com.google.gson.internal.bind.util.a.b(strL0, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Failed parsing '", strL0, "' as Date; at path ");
                    sbX.append(aVar.Z());
                    throw new com.google.gson.i(8, sbX.toString(), e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a.getClass();
        return dateB;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.Y();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        bVar.h0(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
