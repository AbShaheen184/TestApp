package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements TemporalAccessor {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ j$.time.chrono.l c;
    public final /* synthetic */ ZoneId d;

    public x(j$.time.chrono.b bVar, TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.a = bVar;
        this.b = temporalAccessor;
        this.c = lVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.h(pVar);
        }
        return this.b.h(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.l(pVar);
        }
        return this.b.l(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.i(pVar);
        }
        return this.b.i(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(j$.time.d dVar) {
        if (dVar == j$.time.temporal.q.b) {
            return this.c;
        }
        if (dVar == j$.time.temporal.q.a) {
            return this.d;
        }
        if (dVar == j$.time.temporal.q.c) {
            return this.b.b(dVar);
        }
        return dVar.k(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
