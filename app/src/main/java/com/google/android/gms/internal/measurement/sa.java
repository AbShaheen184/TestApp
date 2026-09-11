package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sa {
    public static final s5 a;

    static {
        Object qVar;
        ((i) d.a).getClass();
        AtomicReference atomicReference = m.f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            o oVar = (o) atomicReference.get();
            qVar = new q("Phlogger", oVar.a, oVar.b, oVar.c);
        } else {
            for (int i = 7; i >= 0; i--) {
                char cCharAt = "Phlogger".charAt(i);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', '.');
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            m mVar = new m(strReplace);
            if (m.c || m.d) {
                mVar.b = new p(strReplace);
            } else if (m.e) {
                o oVar2 = q.h;
                mVar.b = new q(strReplace, Level.OFF, oVar2.b, oVar2.c);
            } else {
                mVar.b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = k.a;
            concurrentLinkedQueue.offer(mVar);
            qVar = mVar;
            if (atomicReference.get() != null) {
                while (true) {
                    m mVar2 = (m) concurrentLinkedQueue.poll();
                    if (mVar2 == null) {
                        break;
                    }
                    o oVar3 = (o) atomicReference.get();
                    mVar2.b = new q((String) mVar2.a, oVar3.a, oVar3.b, oVar3.c);
                }
                m.m();
                qVar = mVar;
            }
        }
        a = new s5(qVar, 2);
    }
}
