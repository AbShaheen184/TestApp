package net.luminis.quic.frame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final long a;
    public final long b;

    public o(long j, long j2) {
        if (j > j2) {
            net.luminis.tls.engine.impl.c.a();
            throw null;
        }
        this.a = j;
        this.b = j2;
    }

    public static void a(ArrayList arrayList, long j) {
        o oVar;
        o oVar2;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            o oVar3 = (o) it.next();
            long j2 = oVar3.a;
            long j3 = oVar3.b;
            if (j >= j2 && j <= j3) {
                return;
            }
            if (j == j2 - 1 || j == j3 + 1) {
                o oVar4 = it.hasNext() ? (o) it.next() : null;
                if (oVar4 != null) {
                    long j4 = oVar4.b;
                    long j5 = oVar4.a;
                    if (j == j5 - 1 || j == j4 + 1) {
                        o oVar5 = (o) arrayList.get(i);
                        long j6 = oVar5.b;
                        long j7 = oVar5.a;
                        if (j == j4 + 1 && j7 - 1 == j) {
                            oVar2 = new o(j5, j6);
                        } else {
                            if (j6 + 1 != j || j != j5 - 1) {
                                net.luminis.tls.engine.impl.c.a();
                                return;
                            }
                            oVar2 = new o(j7, j4);
                        }
                        arrayList.set(i, oVar2);
                        arrayList.remove(i + 1);
                        return;
                    }
                }
                o oVar6 = (o) arrayList.get(i);
                long j8 = oVar6.b;
                long j9 = j8 + 1;
                long j10 = oVar6.a;
                if (j == j9) {
                    oVar = new o(j10, j9);
                } else {
                    long j11 = j10 - 1;
                    if (j != j11) {
                        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Range cannot be extended with that number ", j));
                        return;
                    }
                    oVar = new o(j11, j8);
                }
                arrayList.set(i, oVar);
                return;
            }
            if (j3 < j) {
                arrayList.add(i, new o(j));
                return;
            }
            i++;
        }
        arrayList.add(i, new o(j));
    }

    public final boolean b(o oVar) {
        return this.a < oVar.a && this.b > oVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Long.valueOf(this.a).equals(Long.valueOf(oVar.a)) && Long.valueOf(this.b).equals(Long.valueOf(oVar.b));
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append("..");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.a, "]", sb);
    }

    public o(long j) {
        this.a = j;
        this.b = j;
    }
}
