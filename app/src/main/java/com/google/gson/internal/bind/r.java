package com.google.gson.internal.bind;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements com.google.gson.o {
    public final /* synthetic */ int e;
    public final /* synthetic */ com.google.gson.n y;

    public /* synthetic */ r(com.google.gson.n nVar, int i) {
        this.e = i;
        this.y = nVar;
    }

    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        switch (this.e) {
            case 0:
                if (aVar.a() == Number.class) {
                    return (s) this.y;
                }
                return null;
            default:
                Class clsA = aVar.a();
                if (clsA == Calendar.class || clsA == GregorianCalendar.class) {
                    return (t0) this.y;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((t0) this.y) + "]";
            default:
                return super.toString();
        }
    }
}
