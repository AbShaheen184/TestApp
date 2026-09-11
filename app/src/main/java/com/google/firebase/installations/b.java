package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.common.util.concurrent.g0;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ c y;

    public /* synthetic */ b(c cVar, int i) {
        this.e = i;
        this.y = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.installations.local.b bVarY;
        com.google.firebase.installations.local.b bVarG;
        switch (this.e) {
            case 0:
                this.y.a();
                return;
            case 1:
                this.y.a();
                return;
            default:
                c cVar = this.y;
                Object obj = c.m;
                synchronized (obj) {
                    try {
                        com.google.firebase.g gVar = cVar.a;
                        gVar.a();
                        g0 g0VarI = g0.i(gVar.a);
                        try {
                            bVarY = cVar.c.y();
                            if (g0VarI != null) {
                                g0VarI.A();
                            }
                        } catch (Throwable th) {
                            if (g0VarI != null) {
                                g0VarI.A();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i = bVarY.b;
                    if (i == 5) {
                        bVarG = cVar.g(bVarY);
                    } else {
                        if (i == 3) {
                            bVarG = cVar.g(bVarY);
                        } else if (!cVar.d.a(bVarY)) {
                            return;
                        } else {
                            bVarG = cVar.b(bVarY);
                        }
                    }
                    synchronized (obj) {
                        try {
                            com.google.firebase.g gVar2 = cVar.a;
                            gVar2.a();
                            g0 g0VarI2 = g0.i(gVar2.a);
                            try {
                                cVar.c.t(bVarG);
                                if (g0VarI2 != null) {
                                    g0VarI2.A();
                                }
                            } catch (Throwable th3) {
                                if (g0VarI2 != null) {
                                    g0VarI2.A();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.k.size() != 0 && !TextUtils.equals(bVarY.a, bVarG.a)) {
                                Iterator it = cVar.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (bVarG.b == 4) {
                        String str = bVarG.a;
                        synchronized (cVar) {
                            cVar.j = str;
                        }
                    }
                    int i2 = bVarG.b;
                    if (i2 == 5) {
                        cVar.h(new e());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(bVarG);
                        return;
                    }
                } catch (e e) {
                    cVar.h(e);
                    return;
                }
        }
    }
}
