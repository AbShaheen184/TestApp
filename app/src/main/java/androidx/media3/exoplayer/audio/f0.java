package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.common.collect.a1;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements q {
    public final Context a;
    public final o0 b;
    public final j0 c;
    public final com.google.firebase.platforminfo.c d;
    public final float e;
    public androidx.media3.common.util.p f;
    public androidx.media3.common.util.e0 g;
    public b h;
    public e i;
    public Looper j;
    public Context k;

    public f0(e0 e0Var) {
        Context context = e0Var.a;
        this.a = context;
        j0 j0Var = e0Var.b;
        j0Var.getClass();
        this.c = j0Var;
        this.b = e0Var.c;
        this.h = e0Var.d;
        this.d = context == null ? null : new com.google.firebase.platforminfo.c(this);
        this.e = e0Var.e;
        this.g = androidx.media3.common.util.e0.a;
    }

    public final d0 a(p pVar) throws n {
        Context context;
        Context context2;
        try {
            int i = pVar.h;
            int i2 = pVar.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.k;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.k = context2.createDeviceContext(i2);
                }
                context = this.k;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(pVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : pVar.g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(pVar.b).setChannelMask(pVar.c).setEncoding(pVar.a).build()).setTransferMode(1).setBufferSizeInBytes(pVar.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(pVar.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new d0(audioTrackBuild, pVar, this.d, this.e, this.g);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new n();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new n(e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new n(e);
        }
    }

    public final m b(k kVar) {
        e(kVar);
        androidx.media3.common.r rVar = kVar.a;
        androidx.media3.common.e eVar = kVar.b;
        h hVarA = ((androidx.dynamicanimation.animation.b) this.c).a(eVar, rVar);
        l lVar = new l();
        String str = rVar.o;
        int i = rVar.I;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(eVar, rVar) != null : i == 2) {
            i2 = 2;
        }
        lVar.a = i2;
        lVar.b = hVarA.a;
        lVar.c = hVarA.b;
        lVar.d = hVarA.c;
        return lVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x0177  */
    public final p c(k kVar) throws j {
        int iIntValue;
        int iU;
        boolean z;
        char c;
        boolean z2;
        int i;
        int iMax;
        int minBufferSize;
        boolean z3;
        double d;
        boolean z4;
        int iJ;
        int iJ2;
        boolean z5;
        int i2;
        int iJ3;
        boolean z6;
        boolean z7;
        boolean z8;
        androidx.media3.common.r rVar = kVar.a;
        boolean z9 = kVar.d;
        androidx.media3.common.e eVar = kVar.b;
        e(kVar);
        String str = rVar.o;
        int i3 = rVar.H;
        int iIntValue2 = rVar.I;
        int i4 = rVar.G;
        if (!Objects.equals(str, "audio/raw")) {
            h hVarA = z9 ? ((androidx.dynamicanimation.animation.b) this.c).a(eVar, rVar) : h.d;
            if (z9 && hVarA.a) {
                str.getClass();
                int iD = androidx.media3.common.i0.d(str, rVar.k);
                int iT = androidx.media3.common.util.j0.t(i4);
                boolean z10 = hVarA.b;
                iIntValue2 = iD;
                iIntValue = iT;
                z = z10;
                iU = -1;
                c = 1;
                z2 = true;
            } else {
                Pair pairC = this.h.c(eVar, rVar);
                if (pairC == null) {
                    throw new j("Unable to configure passthrough for: " + rVar);
                }
                iIntValue2 = ((Integer) pairC.first).intValue();
                iIntValue = ((Integer) pairC.second).intValue();
                iU = -1;
                z = false;
                c = 2;
            }
            i = rVar.j;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i == -1) {
                i = 768000;
            }
            iMax = kVar.h;
            if (iMax != -1) {
                z4 = true;
            } else {
                minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
                if (minBufferSize != -2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                com.google.android.material.motion.a.q(z3);
                if (iU == -1) {
                    iU = 1;
                }
                if (z2) {
                    d = this.e;
                } else {
                    d = 1.0d;
                }
                this.b.getClass();
                if (c != 0) {
                    d = d;
                    z4 = true;
                    long j = i3;
                    long j2 = iU;
                    iJ = androidx.media3.common.util.j0.j(minBufferSize * 4, kotlin.collections.a0.c(((((long) 250000) * j) * j2) / 1000000), kotlin.collections.a0.c(((((long) 750000) * j) * j2) / 1000000));
                } else if (c != 1) {
                    z4 = true;
                    if (c == 2) {
                        net.luminis.tls.engine.impl.c.a();
                        return null;
                    }
                    if (iIntValue2 == 5) {
                        i2 = 500000;
                    } else if (iIntValue2 == 8) {
                        i2 = 1000000;
                    } else {
                        i2 = 250000;
                    }
                    if (i != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iJ3 = com.google.android.material.textfield.p.j(i, 8);
                    } else {
                        iJ3 = androidx.media3.extractor.b.j(iIntValue2);
                        if (iJ3 != -2147483647) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        com.google.android.material.motion.a.q(z6);
                    }
                    iJ = kotlin.collections.a0.c((((long) i2) * ((long) iJ3)) / 1000000);
                } else {
                    z4 = true;
                    iJ2 = androidx.media3.extractor.b.j(iIntValue2);
                    if (iJ2 != -2147483647) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    com.google.android.material.motion.a.q(z5);
                    iJ = kotlin.collections.a0.c((((long) 50000000) * ((long) iJ2)) / 1000000);
                }
                iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + iU) - 1) / iU) * iU;
            }
            o oVar = new o();
            androidx.media3.common.e eVar2 = androidx.media3.common.e.b;
            oVar.i = -1;
            oVar.b = i3;
            oVar.c = iIntValue;
            oVar.a = iIntValue2;
            oVar.f = iMax;
            oVar.h = kVar.e;
            oVar.g = eVar;
            z7 = z4;
            if (c == z7) {
                z8 = z7;
            } else {
                z8 = false;
            }
            oVar.e = z8;
            oVar.d = kVar.g;
            oVar.j = z2;
            oVar.k = z;
            oVar.i = kVar.f;
            return new p(oVar);
        }
        com.google.android.material.motion.a.f(androidx.media3.common.util.j0.M(iIntValue2));
        iIntValue = androidx.media3.common.util.j0.t(i4);
        iU = androidx.media3.common.util.j0.u(iIntValue2) * i4;
        z = false;
        c = 0;
        z2 = false;
        i = rVar.j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i = 768000;
        }
        iMax = kVar.h;
        if (iMax != -1) {
            z4 = true;
        } else {
            minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.google.android.material.motion.a.q(z3);
            if (iU == -1) {
                iU = 1;
            }
            if (z2) {
                d = this.e;
            } else {
                d = 1.0d;
            }
            this.b.getClass();
            if (c != 0) {
                d = d;
                z4 = true;
                long j3 = i3;
                long j4 = iU;
                iJ = androidx.media3.common.util.j0.j(minBufferSize * 4, kotlin.collections.a0.c(((((long) 250000) * j3) * j4) / 1000000), kotlin.collections.a0.c(((((long) 750000) * j3) * j4) / 1000000));
            } else if (c != 1) {
                z4 = true;
                if (c == 2) {
                    net.luminis.tls.engine.impl.c.a();
                    return null;
                }
                if (iIntValue2 == 5) {
                    i2 = 500000;
                } else if (iIntValue2 == 8) {
                    i2 = 1000000;
                } else {
                    i2 = 250000;
                }
                if (i != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iJ3 = com.google.android.material.textfield.p.j(i, 8);
                } else {
                    iJ3 = androidx.media3.extractor.b.j(iIntValue2);
                    if (iJ3 != -2147483647) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    com.google.android.material.motion.a.q(z6);
                }
                iJ = kotlin.collections.a0.c((((long) i2) * ((long) iJ3)) / 1000000);
            } else {
                z4 = true;
                iJ2 = androidx.media3.extractor.b.j(iIntValue2);
                if (iJ2 != -2147483647) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                com.google.android.material.motion.a.q(z5);
                iJ = kotlin.collections.a0.c((((long) 50000000) * ((long) iJ2)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + iU) - 1) / iU) * iU;
        }
        o oVar2 = new o();
        androidx.media3.common.e eVar3 = androidx.media3.common.e.b;
        oVar2.i = -1;
        oVar2.b = i3;
        oVar2.c = iIntValue;
        oVar2.a = iIntValue2;
        oVar2.f = iMax;
        oVar2.h = kVar.e;
        oVar2.g = eVar;
        z7 = z4;
        if (c == z7) {
            z8 = z7;
        } else {
            z8 = false;
        }
        oVar2.e = z8;
        oVar2.d = kVar.g;
        oVar2.j = z2;
        oVar2.k = z;
        oVar2.i = kVar.f;
        return new p(oVar2);
    }

    public final void d() {
        androidx.media3.exoplayer.util.d dVar;
        androidx.media3.common.util.p pVar = this.f;
        if (pVar != null) {
            pVar.d();
        }
        e eVar = this.i;
        if (eVar != null) {
            Context context = eVar.a;
            if (eVar.k) {
                eVar.h = null;
                androidx.media3.common.audio.h.l(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.g) != null) {
                    dVar.e();
                    eVar.g = null;
                }
                context.unregisterReceiver(eVar.e);
                d dVar2 = eVar.f;
                if (dVar2 != null) {
                    dVar2.a.unregisterContentObserver(dVar2);
                }
                eVar.k = false;
            }
        }
    }

    public final void e(k kVar) {
        Context context;
        b bVarB;
        AudioDeviceInfo audioDeviceInfo = kVar.c;
        androidx.media3.common.e eVar = kVar.b;
        f();
        e eVar2 = this.i;
        if (eVar2 == null && (context = this.a) != null) {
            e eVar3 = new e(context, new androidx.activity.y(this, 16), eVar, audioDeviceInfo);
            this.i = eVar3;
            if (eVar3.k) {
                bVarB = eVar3.h;
                bVarB.getClass();
            } else {
                eVar3.k = true;
                d dVar = eVar3.f;
                if (dVar != null) {
                    dVar.a.registerContentObserver(dVar.b, false, dVar);
                }
                Context context2 = eVar3.a;
                AudioManager audioManagerL = androidx.media3.common.audio.h.l(context2);
                c cVar = eVar3.d;
                Handler handler = eVar3.c;
                audioManagerL.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar3.g == null) {
                    eVar3.g = new androidx.media3.exoplayer.util.d(context2, new androidx.activity.l(eVar3, 17), Boolean.valueOf(androidx.media3.common.util.j0.P(context2)));
                }
                bVarB = b.b(context2, context2.registerReceiver(eVar3.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar3.j, eVar3.i, eVar3.a());
                eVar3.h = bVarB;
            }
            this.h = bVarB;
        } else if (eVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar2.i)) {
                eVar2.i = audioDeviceInfo;
                Context context3 = eVar2.a;
                androidx.media3.common.e eVar4 = eVar2.j;
                List listA = eVar2.a();
                a1 a1Var = b.e;
                eVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar4, audioDeviceInfo, listA));
            }
            e eVar5 = this.i;
            if (!Objects.equals(eVar, eVar5.j)) {
                eVar5.j = eVar;
                Context context4 = eVar5.a;
                AudioDeviceInfo audioDeviceInfo2 = eVar5.i;
                List listA2 = eVar5.a();
                a1 a1Var2 = b.e;
                eVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, audioDeviceInfo2, listA2));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.j;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.j = looperMyLooper;
        } else {
            net.luminis.tls.engine.impl.c.r(com.google.android.material.resources.b.p("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
