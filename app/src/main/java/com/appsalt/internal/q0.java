package com.appsalt.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.cd;
import com.google.android.gms.internal.measurement.hc;
import com.google.android.gms.internal.measurement.ic;
import com.google.android.gms.internal.measurement.na;
import com.google.android.gms.internal.measurement.pc;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements net.luminis.quic.log.a {
    public volatile Object e;
    public Object y;

    public String a() {
        return ((SimpleDateFormat) this.e).format(Long.valueOf(System.currentTimeMillis()));
    }

    public pc b(final na naVar) {
        final hc hcVar = (hc) this.e;
        hc hcVar2 = pc.j;
        if (hcVar != hcVar2) {
            com.google.android.gms.internal.measurement.s5 s5Var = pc.i;
            s5Var.getClass();
            final androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0();
            n0Var.e = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) s5Var.y;
            Context context = naVar.b;
            String str = hcVar.d;
            if (str == null) {
                str = (String) hcVar.a.apply(context);
                hcVar.d = str;
            }
            ic icVar = (ic) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: com.google.android.gms.internal.measurement.oc
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    ic icVar2 = new ic(new pc(naVar, hcVar));
                    n0Var.e = true;
                    return icVar2;
                }
            });
            if (n0Var.e) {
                cd.a(naVar.b, new com.google.android.gms.internal.measurement.s5(s5Var, 13));
            }
            this.y = icVar.a;
            this.e = hcVar2;
        }
        return (pc) this.y;
    }

    @Override // net.luminis.quic.log.a
    public void d(String str) {
        a();
        ((g4) ((coil3.memory.c) this.y).y).getClass();
    }

    @Override // net.luminis.quic.log.a
    public void f(String str, Throwable th) {
        a();
        Objects.toString(th);
        ((g4) ((coil3.memory.c) this.y).y).getClass();
    }

    @Override // net.luminis.quic.log.a
    public com.google.android.gms.measurement.internal.e0 i() {
        return new com.google.android.gms.measurement.internal.e0(15);
    }

    @Override // net.luminis.quic.log.a
    public void j() {
        synchronized (this) {
        }
    }
}
