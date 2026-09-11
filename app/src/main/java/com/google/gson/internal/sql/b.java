package com.google.gson.internal.sql;

import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public class a implements o {
        @Override // com.google.gson.o
        public final n a(f fVar, com.google.gson.reflect.a aVar) {
            if (aVar.a() == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    private b() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        Time time;
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(strL0).getTime());
                    this.a.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new i(8, "Failed parsing '" + strL0 + "' as SQL Time; at path " + aVar.Z(), e);
                }
            } catch (Throwable th) {
                this.a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.Y();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        bVar.h0(str);
    }

    public /* synthetic */ b(int i) {
        this();
    }
}
