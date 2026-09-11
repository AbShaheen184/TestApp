package com.google.gson.internal.sql;

import com.google.gson.f;
import com.google.gson.n;
import com.google.gson.o;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c implements o {
    @Override // com.google.gson.o
    public final n a(f fVar, com.google.gson.reflect.a aVar) {
        if (aVar.a() != Timestamp.class) {
            return null;
        }
        fVar.getClass();
        return new d(fVar.e(new com.google.gson.reflect.a(Date.class)));
    }
}
