package androidx.activity;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.media3.common.f1;
import androidx.media3.common.t0;
import androidx.media3.common.util.g0;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.m0;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.audio.f0;
import androidx.media3.exoplayer.c1;
import androidx.media3.exoplayer.g1;
import androidx.media3.exoplayer.h0;
import androidx.media3.exoplayer.source.o0;
import com.google.common.collect.a1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0395  */
    /* JADX WARN: Code duplicated, block: B:175:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:176:0x03be  */
    /* JADX WARN: Code duplicated, block: B:177:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:182:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:184:0x03d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        long j;
        boolean z;
        androidx.media3.exoplayer.audio.e eVar;
        int i = 8;
        long j2 = -9223372036854775807L;
        boolean z2 = true;
        boolean z3 = false;
        z3 = false;
        switch (this.e) {
            case 0:
                p pVar = (p) this.y;
                pVar.getLifecycle().a(new e(z3 ? 1 : 0, (c0) this.z, pVar));
                return;
            case 1:
                androidx.compose.ui.contentcapture.b.a((androidx.compose.ui.contentcapture.f) this.y, (LongSparseArray) this.z);
                return;
            case 2:
                ((androidx.core.content.res.b) this.y).f((Typeface) this.z);
                return;
            case 3:
                Context context = (Context) this.y;
                androidx.media3.common.util.h hVar = (androidx.media3.common.util.h) this.z;
                androidx.media3.common.audio.h.a = (AudioManager) context.getSystemService("audio");
                hVar.c();
                return;
            case 4:
                androidx.appcompat.widget.o oVar = (androidx.appcompat.widget.o) this.y;
                Object objApply = ((androidx.media3.exoplayer.w) this.z).apply(oVar.f);
                oVar.f = objApply;
                androidx.media3.common.util.d dVar = new androidx.media3.common.util.d(oVar, objApply, z3 ? 1 : 0);
                g0 g0Var = (g0) oVar.c;
                if (g0Var.a.getLooper().getThread().isAlive()) {
                    g0Var.d(dVar);
                    return;
                }
                return;
            case 5:
                androidx.media3.common.util.u uVar = (androidx.media3.common.util.u) this.y;
                Context context2 = (Context) this.z;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new androidx.media3.common.util.t(uVar, z3 ? 1 : 0), intentFilter);
                return;
            case 6:
                androidx.media3.common.util.t tVar = (androidx.media3.common.util.t) this.y;
                Context context3 = (Context) this.z;
                androidx.media3.common.util.u uVar2 = (androidx.media3.common.util.u) tVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type == 6) {
                                i = 5;
                            } else if (type == 9) {
                                i = 7;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i != 5) {
                    uVar2.c(i);
                    return;
                } else {
                    androidx.media3.common.util.r.a(context3, uVar2);
                    return;
                }
            case 7:
                m0 m0Var = (m0) this.y;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.z;
                androidx.media3.common.util.b bVar = (androidx.media3.common.util.b) m0Var.d;
                bVar.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new c(i, bVar, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 8:
                androidx.media3.common.util.b bVar2 = (androidx.media3.common.util.b) this.y;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.z;
                synchronized (bVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar2.z) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 9:
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) this.y;
                h0 h0Var = (h0) this.z;
                int i2 = c0Var.I - h0Var.b;
                c0Var.I = i2;
                if (h0Var.d) {
                    c0Var.J = h0Var.e;
                    c0Var.K = true;
                }
                if (i2 == 0) {
                    v0 v0Var = ((c1) h0Var.f).a;
                    int iH = -1;
                    if (!c0Var.n0.a.p() && v0Var.p()) {
                        c0Var.o0 = -1;
                        c0Var.p0 = 0L;
                    }
                    if (!v0Var.p()) {
                        List listAsList = Arrays.asList(((g1) v0Var).h);
                        com.google.android.material.motion.a.q(listAsList.size() == c0Var.p.size());
                        for (int i3 = 0; i3 < listAsList.size(); i3++) {
                            ((androidx.media3.exoplayer.z) c0Var.p.get(i3)).b = (v0) listAsList.get(i3);
                        }
                    }
                    if (c0Var.K) {
                        byte b = ((c1) h0Var.f).a.p() && c0Var.n0.a.p();
                        boolean zEquals = ((c1) h0Var.f).b.equals(c0Var.n0.b);
                        byte b2 = ((c1) h0Var.f).d == c0Var.n0.s;
                        if (b != false || (zEquals && b2 != false)) {
                            z2 = false;
                        }
                        if (z2) {
                            iH = c0Var.h();
                            if (v0Var.p() || ((c1) h0Var.f).b.b()) {
                                j2 = ((c1) h0Var.f).d;
                            } else {
                                c1 c1Var = (c1) h0Var.f;
                                androidx.media3.exoplayer.source.v vVar = c1Var.b;
                                long j3 = c1Var.d;
                                Object obj = vVar.a;
                                t0 t0Var = c0Var.o;
                                v0Var.g(obj, t0Var);
                                j2 = j3 + t0Var.e;
                            }
                        }
                        j = j2;
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    int i4 = iH;
                    c0Var.K = false;
                    c0Var.T((c1) h0Var.f, 1, z, c0Var.J, j, i4, false);
                    return;
                }
                return;
            case 10:
                ((androidx.media3.exoplayer.analytics.j) this.y).d.reportTrackChangeEvent((TrackChangeEvent) this.z);
                return;
            case 11:
                ((androidx.media3.exoplayer.analytics.j) this.y).d.reportNetworkEvent((NetworkEvent) this.z);
                return;
            case 12:
                ((androidx.media3.exoplayer.analytics.j) this.y).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.z);
                return;
            case 13:
                ((androidx.media3.exoplayer.analytics.j) this.y).d.reportPlaybackMetrics((PlaybackMetrics) this.z);
                return;
            case 14:
                ((androidx.media3.exoplayer.analytics.j) this.y).d.reportPlaybackStateEvent((PlaybackStateEvent) this.z);
                return;
            case 15:
                androidx.media3.exoplayer.audio.t tVar2 = (androidx.media3.exoplayer.audio.t) this.y;
                androidx.media3.exoplayer.b bVar3 = (androidx.media3.exoplayer.b) this.z;
                androidx.media3.exoplayer.x xVar = tVar2.b;
                String str = j0.a;
                androidx.media3.common.util.b.k(xVar.e.E, bVar3);
                return;
            case 16:
                androidx.media3.exoplayer.audio.t tVar3 = (androidx.media3.exoplayer.audio.t) this.y;
                synchronized (((androidx.media3.exoplayer.c) this.z)) {
                }
                androidx.media3.exoplayer.x xVar2 = tVar3.b;
                String str2 = j0.a;
                androidx.media3.exoplayer.analytics.g gVar = xVar2.e.r;
                gVar.M(gVar.J((androidx.media3.exoplayer.source.v) gVar.A.e), 1013, new androidx.media3.exoplayer.analytics.d(z3 ? 1 : 0));
                return;
            case 17:
                com.google.firebase.messaging.o oVar2 = (com.google.firebase.messaging.o) this.y;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.z).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) oVar2.A).post(new c(18, oVar2, routedDevice));
                    return;
                }
                return;
            case 18:
                com.google.firebase.messaging.o oVar3 = (com.google.firebase.messaging.o) this.y;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.z;
                if (((androidx.media3.exoplayer.audio.z) oVar3.B) == null || (eVar = ((f0) ((com.google.firebase.platforminfo.c) oVar3.z).e).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context4 = eVar.a;
                androidx.media3.common.e eVar2 = eVar.j;
                List listA = eVar.a();
                a1 a1Var = androidx.media3.exoplayer.audio.b.e;
                eVar.b(androidx.media3.exoplayer.audio.b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar2, audioDeviceInfo, listA));
                return;
            case 19:
                androidx.media3.exoplayer.hls.r rVar = (androidx.media3.exoplayer.hls.r) this.y;
                androidx.media3.exoplayer.hls.k kVar = (androidx.media3.exoplayer.hls.k) this.z;
                androidx.media3.exoplayer.hls.c cVar = rVar.z;
                Uri uri = kVar.J;
                androidx.media3.exoplayer.hls.playlist.d dVar2 = (androidx.media3.exoplayer.hls.playlist.d) ((androidx.media3.exoplayer.hls.l) cVar.e).y.A.get(uri);
                if (dVar2 != null) {
                    androidx.media3.exoplayer.hls.playlist.d.b(dVar2, uri, true);
                    return;
                }
                return;
            case 20:
                androidx.media3.exoplayer.hls.playlist.c cVar2 = (androidx.media3.exoplayer.hls.playlist.c) this.y;
                Uri uri2 = (Uri) this.z;
                cVar2.G = false;
                cVar2.b(uri2);
                return;
            case 21:
                androidx.media3.exoplayer.mediacodec.b bVar4 = (androidx.media3.exoplayer.mediacodec.b) this.y;
                c cVar3 = (c) this.z;
                bVar4.c.v();
                androidx.media3.exoplayer.mediacodec.e eVar3 = bVar4.b;
                synchronized (eVar3.a) {
                    eVar3.b();
                    cVar3.run();
                    break;
                }
                return;
            case 22:
                androidx.media3.exoplayer.mediacodec.r rVar2 = (androidx.media3.exoplayer.mediacodec.r) this.y;
                rVar2.a0.set(rVar2.y((androidx.media3.common.util.b) this.z, rVar2.U, 0));
                return;
            case 23:
                ((androidx.media3.common.util.i) this.y).accept(this.z);
                return;
            case 24:
                o0 o0Var = (o0) this.y;
                androidx.media3.extractor.a0 a0Var = (androidx.media3.extractor.a0) this.z;
                o0Var.X = o0Var.O == null ? a0Var : new androidx.media3.extractor.s(-9223372036854775807L);
                o0Var.Y = a0Var.g();
                if (!o0Var.g0 && a0Var.g() == -9223372036854775807L) {
                    z3 = true;
                }
                o0Var.Z = z3;
                o0Var.a0 = z3 ? 7 : 1;
                if (o0Var.T) {
                    o0Var.D.u(o0Var.Y, a0Var, z3);
                    return;
                } else {
                    o0Var.A();
                    return;
                }
            case 25:
                ((androidx.media3.exoplayer.video.c) ((androidx.media3.common.util.b) this.y).z).h.a((f1) this.z);
                return;
            case 26:
                androidx.media3.exoplayer.audio.t tVar4 = (androidx.media3.exoplayer.audio.t) this.y;
                androidx.media3.exoplayer.c cVar4 = (androidx.media3.exoplayer.c) this.z;
                synchronized (cVar4) {
                }
                androidx.media3.exoplayer.x xVar3 = tVar4.b;
                String str3 = j0.a;
                androidx.media3.exoplayer.analytics.g gVar2 = xVar3.e.r;
                androidx.media3.exoplayer.analytics.a aVarJ = gVar2.J((androidx.media3.exoplayer.source.v) gVar2.A.e);
                gVar2.M(aVarJ, 1020, new y(aVarJ, cVar4, 14));
                return;
            case 27:
                androidx.media3.exoplayer.audio.t tVar5 = (androidx.media3.exoplayer.audio.t) this.y;
                androidx.media3.exoplayer.b bVar5 = (androidx.media3.exoplayer.b) this.z;
                androidx.media3.exoplayer.x xVar4 = tVar5.b;
                String str4 = j0.a;
                androidx.media3.common.util.b.k(xVar4.e.F, bVar5);
                return;
            case 28:
                androidx.media3.exoplayer.audio.t tVar6 = (androidx.media3.exoplayer.audio.t) this.y;
                f1 f1Var = (f1) this.z;
                androidx.media3.exoplayer.x xVar5 = tVar6.b;
                String str5 = j0.a;
                androidx.media3.exoplayer.c0 c0Var2 = xVar5.e;
                c0Var2.i0 = f1Var;
                c0Var2.m.e(25, new androidx.media3.exoplayer.v(f1Var));
                return;
            default:
                androidx.media3.exoplayer.video.spherical.k kVar2 = (androidx.media3.exoplayer.video.spherical.k) this.y;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.z;
                SurfaceTexture surfaceTexture2 = kVar2.D;
                Surface surface = kVar2.E;
                Surface surface2 = new Surface(surfaceTexture);
                kVar2.D = surfaceTexture;
                kVar2.E = surface2;
                Iterator it = kVar2.e.iterator();
                while (it.hasNext()) {
                    ((androidx.media3.exoplayer.x) it.next()).e.P(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
        }
    }
}
