package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static /* synthetic */ boolean a(Unsafe unsafe, r rVar, long j, f fVar, f fVar2) {
        while (!unsafe.compareAndSwapObject(rVar, j, fVar, fVar2)) {
            if (unsafe.getObject(rVar, j) != fVar) {
                return false;
            }
        }
        return true;
    }
}
