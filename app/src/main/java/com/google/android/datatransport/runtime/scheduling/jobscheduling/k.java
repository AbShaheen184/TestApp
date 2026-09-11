package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.appcompat.widget.q2;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.compose.ui.platform.t1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.o;
import com.google.firebase.messaging.x;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import net.luminis.quic.impl.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ k(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                o oVar = (o) this.y;
                ((com.google.android.datatransport.runtime.scheduling.persistence.g) oVar.B).L(new l(oVar, 0));
                return;
            case 1:
                MaterialButton.a((MaterialButton) this.y);
                return;
            case 2:
                ((CarouselLayoutManager) this.y).m0();
                return;
            case 3:
                t1 t1Var = (t1) this.y;
                t1Var.b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) t1Var.e;
                androidx.customview.widget.d dVar = sideSheetBehavior.i;
                if (dVar != null && dVar.f()) {
                    t1Var.a(t1Var.c);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(t1Var.c);
                        return;
                    }
                    return;
                }
            case 4:
                ((com.google.android.material.textfield.c) this.y).s(true);
                return;
            case 5:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) this.y;
                boolean zIsPopupShowing = kVar.h.isPopupShowing();
                kVar.s(zIsPopupShowing);
                kVar.m = zIsPopupShowing;
                return;
            case 6:
                ((TextInputLayout) this.y).B.requestLayout();
                return;
            case 7:
                b1 b1Var = (b1) this.y;
                Map mapUnmodifiableMap = null;
                ((AtomicReference) b1Var.z).set(null);
                synchronized (b1Var) {
                    if (((AtomicMarkableReference) b1Var.y).isMarked()) {
                        com.google.firebase.crashlytics.internal.metadata.e eVar = (com.google.firebase.crashlytics.internal.metadata.e) ((AtomicMarkableReference) b1Var.y).getReference();
                        synchronized (eVar) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) b1Var.y;
                        atomicMarkableReference.set((com.google.firebase.crashlytics.internal.metadata.e) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    q2 q2Var = (q2) b1Var.A;
                    ((com.google.firebase.crashlytics.internal.metadata.h) q2Var.a).h((String) q2Var.c, mapUnmodifiableMap, b1Var.e);
                    return;
                }
                return;
            case 8:
                androidx.compose.runtime.internal.c cVar = (androidx.compose.runtime.internal.c) this.y;
                synchronized (((ArrayDeque) cVar.A)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.e).edit();
                    String str = (String) cVar.y;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.A).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) cVar.z);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
            case 9:
                x xVar = (x) this.y;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + xVar.a.getAction() + " finishing.");
                xVar.b.d(null);
                return;
            case 10:
                net.luminis.quic.impl.d dVar2 = (net.luminis.quic.impl.d) this.y;
                if (dVar2.f) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (dVar2.e.longValue() + dVar2.b < jCurrentTimeMillis) {
                        if ((((long) dVar2.d.getAsInt()) * 3) + dVar2.e.longValue() < jCurrentTimeMillis) {
                            dVar2.a.shutdown();
                            net.luminis.quic.impl.i iVar = dVar2.c;
                            iVar.W.a();
                            iVar.T.i();
                            net.luminis.quic.log.a aVar = iVar.z;
                            iVar.toString();
                            aVar.getClass();
                            System.currentTimeMillis();
                            iVar.l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                androidx.compose.foundation.lazy.grid.l lVar = (androidx.compose.foundation.lazy.grid.l) this.y;
                net.luminis.quic.send.k kVar2 = (net.luminis.quic.send.k) lVar.d;
                n nVar = ((net.luminis.quic.impl.o) lVar.c).a;
                kVar2.i[androidx.constraintlayout.core.g.e(4)].a(new net.luminis.quic.frame.m(), new net.luminis.quic.impl.j(0));
                ((net.luminis.quic.send.k) lVar.d).j();
                lVar.d();
                return;
            case 12:
                net.luminis.quic.receive.b bVar = (net.luminis.quic.receive.b) this.y;
                while (!bVar.g) {
                    try {
                        DatagramPacket datagramPacket = new DatagramPacket(new byte[1500], 1500);
                        try {
                            bVar.a.receive(datagramPacket);
                            if (bVar.d.test(datagramPacket)) {
                                bVar.f.add(new net.luminis.quic.receive.a(datagramPacket, Long.valueOf(System.currentTimeMillis())));
                            }
                        } catch (SocketException e) {
                            throw e;
                        } catch (SocketTimeoutException unused) {
                        }
                    } catch (IOException e2) {
                        boolean z = bVar.g;
                        net.luminis.quic.log.a aVar2 = bVar.b;
                        if (z) {
                            aVar2.getClass();
                            return;
                        } else {
                            aVar2.f("IOException while receiving datagrams", e2);
                            bVar.c.accept(e2);
                            return;
                        }
                    } catch (Throwable th) {
                        bVar.b.f("IOException while receiving datagrams", th);
                        bVar.c.accept(th);
                        return;
                    }
                }
                bVar.b.getClass();
                return;
            default:
                net.luminis.quic.recovery.g gVar = (net.luminis.quic.recovery.g) this.y;
                try {
                    gVar.e();
                    return;
                } catch (Exception e3) {
                    gVar.e.f("Runtime exception occurred while running loss detection timeout handler", e3);
                    return;
                }
        }
    }
}
