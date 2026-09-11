package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.util.f0;
import androidx.media3.common.util.g0;
import androidx.media3.exoplayer.k0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final com.google.common.base.t a;
    public final Handler b;
    public k0 c;
    public androidx.media3.common.e d;
    public int f;
    public g h;
    public float g = 1.0f;
    public int e = 0;

    public d(Context context, Looper looper, k0 k0Var) {
        this.a = com.google.android.material.resources.c.n(new c(context, 0));
        this.c = k0Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        h.a((AudioManager) this.a.get(), this.h);
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        k0 k0Var = this.c;
        if (k0Var != null) {
            k0Var.E.f(34);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        e eVar;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                g gVar = this.h;
                if (gVar == null) {
                    if (gVar == null) {
                        eVar = new e();
                        eVar.c = androidx.media3.common.e.b;
                        eVar.a = i2;
                    } else {
                        e eVar2 = new e();
                        eVar2.a = gVar.a;
                        eVar2.c = gVar.d;
                        eVar = eVar2;
                    }
                    androidx.media3.common.e eVar3 = this.d;
                    eVar3.getClass();
                    eVar.c = eVar3;
                    eVar.b = true;
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.common.audio.b
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i4) {
                            d dVar = this.a;
                            dVar.getClass();
                            if (i4 == -3 || i4 == -2) {
                                if (i4 != -2) {
                                    dVar.b(4);
                                    return;
                                }
                                k0 k0Var = dVar.c;
                                if (k0Var != null) {
                                    g0 g0Var = k0Var.E;
                                    g0Var.getClass();
                                    f0 f0VarC = g0.c();
                                    f0VarC.a = g0Var.a.obtainMessage(33, 0, 0);
                                    f0VarC.b();
                                }
                                dVar.b(3);
                                return;
                            }
                            if (i4 == -1) {
                                k0 k0Var2 = dVar.c;
                                if (k0Var2 != null) {
                                    g0 g0Var2 = k0Var2.E;
                                    g0Var2.getClass();
                                    f0 f0VarC2 = g0.c();
                                    f0VarC2.a = g0Var2.a.obtainMessage(33, -1, 0);
                                    f0VarC2.b();
                                }
                                dVar.a();
                                dVar.b(1);
                                return;
                            }
                            if (i4 != 1) {
                                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unknown focus change type: ", i4, "AudioFocusManager");
                                return;
                            }
                            dVar.b(2);
                            k0 k0Var3 = dVar.c;
                            if (k0Var3 != null) {
                                g0 g0Var3 = k0Var3.E;
                                g0Var3.getClass();
                                f0 f0VarC3 = g0.c();
                                f0VarC3.a = g0Var3.a.obtainMessage(33, 1, 0);
                                f0VarC3.b();
                            }
                        }
                    };
                    Handler handler = this.b;
                    handler.getClass();
                    this.h = new g(eVar.a, onAudioFocusChangeListener, handler, (androidx.media3.common.e) eVar.c, eVar.b);
                }
                int iR = h.r((AudioManager) this.a.get(), this.h);
                if (iR == 1 || iR == 2) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
