package com.google.gson.internal.sql;

import com.google.gson.n;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n {
    public static final c b = new c();
    public final n a;

    public d(n nVar) {
        this.a = nVar;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) {
        Date date = (Date) this.a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) {
        this.a.c(bVar, (Timestamp) obj);
    }
}
