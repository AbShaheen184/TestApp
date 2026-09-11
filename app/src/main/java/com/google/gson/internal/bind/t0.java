package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class t0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        aVar.g();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (aVar.n0() == 4) {
                aVar.L();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
            String strH0 = aVar.h0();
            int iF0 = aVar.f0();
            strH0.getClass();
            switch (strH0) {
                case "dayOfMonth":
                    i3 = iF0;
                    break;
                case "minute":
                    i5 = iF0;
                    break;
                case "second":
                    i6 = iF0;
                    break;
                case "year":
                    i = iF0;
                    break;
                case "month":
                    i2 = iF0;
                    break;
                case "hourOfDay":
                    i4 = iF0;
                    break;
            }
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            bVar.Y();
            return;
        }
        bVar.m();
        bVar.N("year");
        bVar.e0(calendar.get(1));
        bVar.N("month");
        bVar.e0(calendar.get(2));
        bVar.N("dayOfMonth");
        bVar.e0(calendar.get(5));
        bVar.N("hourOfDay");
        bVar.e0(calendar.get(11));
        bVar.N("minute");
        bVar.e0(calendar.get(12));
        bVar.N("second");
        bVar.e0(calendar.get(13));
        bVar.L();
    }
}
