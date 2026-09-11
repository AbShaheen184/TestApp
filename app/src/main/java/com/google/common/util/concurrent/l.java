package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ boolean a(Unsafe unsafe, r rVar, long j, q qVar, q qVar2) {
        while (!unsafe.compareAndSwapObject(rVar, j, qVar, qVar2)) {
            if (unsafe.getObject(rVar, j) != qVar) {
                return false;
            }
        }
        return true;
    }
}
