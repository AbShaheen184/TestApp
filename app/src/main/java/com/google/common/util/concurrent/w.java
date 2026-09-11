package com.google.common.util.concurrent;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends com.google.android.material.resources.c {
    @Override // com.google.android.material.resources.c
    public final void e(c0 c0Var, Set set) {
        synchronized (c0Var) {
            try {
                if (c0Var.E == null) {
                    c0Var.E = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.material.resources.c
    public final int g(c0 c0Var) {
        int i;
        synchronized (c0Var) {
            i = c0Var.F - 1;
            c0Var.F = i;
        }
        return i;
    }
}
