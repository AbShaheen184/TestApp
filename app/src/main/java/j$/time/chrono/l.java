package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface l extends Comparable {
    b A(int i, int i2);

    j$.time.temporal.s G(j$.time.temporal.a aVar);

    List H();

    m J(int i);

    int L(m mVar, int i);

    b P(TemporalAccessor temporalAccessor);

    b V();

    b a0(int i, int i2, int i3);

    b c0(Map map, j$.time.format.e0 e0Var);

    ChronoZonedDateTime d0(Instant instant, ZoneId zoneId);

    boolean equals(Object obj);

    boolean h0(long j);

    int hashCode();

    b p(long j);

    String q();

    String toString();

    String y();

    static l s(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.b(j$.time.temporal.q.b);
        s sVar = s.c;
        if (lVar != null) {
            return lVar;
        }
        Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    static l of(String str) {
        ConcurrentHashMap concurrentHashMap = a.a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = a.a;
            l lVar = (l) concurrentHashMap2.get(str);
            if (lVar == null) {
                lVar = (l) a.b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (l lVar2 : ServiceLoader.load(l.class)) {
                    if (str.equals(lVar2.q()) || str.equals(lVar2.y())) {
                        return lVar2;
                    }
                }
                j$.nio.file.k.h("Unknown chronology: ".concat(str));
                return null;
            }
            o oVar = o.l;
            oVar.getClass();
            a.I(oVar, "Hijrah-umalqura");
            v vVar = v.c;
            vVar.getClass();
            a.I(vVar, "Japanese");
            a0 a0Var = a0.c;
            a0Var.getClass();
            a.I(a0Var, "Minguo");
            g0 g0Var = g0.c;
            g0Var.getClass();
            a.I(g0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.q().equals("ISO")) {
                        a.I(aVar, aVar.q());
                    }
                }
                s sVar = s.c;
                sVar.getClass();
                a.I(sVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    default e Q(LocalDateTime localDateTime) {
        try {
            return P(localDateTime).U(j$.time.i.O(localDateTime));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }
}
