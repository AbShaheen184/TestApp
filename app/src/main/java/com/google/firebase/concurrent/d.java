package com.google.firebase.concurrent;

import com.google.android.material.shape.c0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ c0 A;
    public final /* synthetic */ int e;
    public final /* synthetic */ f y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ d(f fVar, Runnable runnable, c0 c0Var, int i) {
        this.e = i;
        this.y = fVar;
        this.z = runnable;
        this.A = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ExecutorService executorService = this.y.e;
                final int i = 0;
                final Runnable runnable = this.z;
                final c0 c0Var = this.A;
                executorService.execute(new Runnable() { // from class: com.google.firebase.concurrent.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) c0Var.e).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((h) c0Var.e).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) c0Var.e;
                                try {
                                    runnable2.run();
                                    hVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    hVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.y.e;
                final int i2 = 2;
                final Runnable runnable2 = this.z;
                final c0 c0Var2 = this.A;
                executorService2.execute(new Runnable() { // from class: com.google.firebase.concurrent.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) c0Var2.e).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((h) c0Var2.e).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                h hVar = (h) c0Var2.e;
                                try {
                                    runnable3.run();
                                    hVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    hVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.y.e;
                final int i3 = 1;
                final Runnable runnable3 = this.z;
                final c0 c0Var3 = this.A;
                executorService3.execute(new Runnable() { // from class: com.google.firebase.concurrent.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) c0Var3.e).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((h) c0Var3.e).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                h hVar = (h) c0Var3.e;
                                try {
                                    runnable4.run();
                                    hVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    hVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
