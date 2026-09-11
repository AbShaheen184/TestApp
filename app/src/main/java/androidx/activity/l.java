package androidx.activity;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.c2;
import androidx.collection.y0;
import androidx.compose.animation.b1;
import androidx.media3.common.util.g0;
import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.audio.n0;
import androidx.media3.exoplayer.audio.q0;
import androidx.media3.exoplayer.e1;
import androidx.media3.exoplayer.k0;
import androidx.media3.ui.h0;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ l(k0 k0Var, int i) {
        this.e = 14;
        this.y = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005b A[Catch: all -> 0x0021, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001b, B:15:0x0026, B:19:0x002c, B:25:0x0038, B:27:0x003c, B:29:0x0042, B:31:0x004c, B:33:0x0056, B:35:0x0067, B:34:0x005b, B:36:0x0069, B:38:0x007d, B:40:0x0085), top: B:48:0x0017 }] */
    private final void a() {
        String strX;
        TelephonyManager telephonyManager;
        androidx.media3.common.util.s sVar = (androidx.media3.common.util.s) this.y;
        androidx.media3.exoplayer.upstream.e eVar = (androidx.media3.exoplayer.upstream.e) sVar.a.get();
        if (eVar != null) {
            int iB = sVar.c.b();
            androidx.media3.exoplayer.upstream.f fVar = eVar.a;
            synchronized (fVar) {
                int i = fVar.n;
                if (i == 0 || fVar.e) {
                    if (i != iB || fVar.o == null) {
                        fVar.n = iB;
                        if (iB != 1 && iB != 0 && iB != 8) {
                            if (fVar.o == null) {
                                Context context = fVar.a;
                                String str = j0.a;
                                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                    strX = com.google.common.base.b.x(Locale.getDefault().getCountry());
                                } else {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        strX = com.google.common.base.b.x(Locale.getDefault().getCountry());
                                    } else {
                                        strX = com.google.common.base.b.x(networkCountryIso);
                                    }
                                }
                                fVar.o = strX;
                            }
                            fVar.l = fVar.a(iB);
                            fVar.d.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            fVar.b(fVar.i, fVar.l, fVar.g > 0 ? (int) (jElapsedRealtime - fVar.h) : 0);
                            fVar.h = jElapsedRealtime;
                            fVar.i = 0L;
                            fVar.k = 0L;
                            fVar.j = 0L;
                            androidx.media3.exoplayer.upstream.s sVar2 = fVar.f;
                            sVar2.a.clear();
                            sVar2.c = -1;
                            sVar2.d = 0;
                            sVar2.e = 0;
                        }
                    }
                }
            }
        }
    }

    private final void b() {
        e1 e1Var = (e1) this.y;
        try {
            synchronized (e1Var) {
            }
            try {
                e1Var.a.d(e1Var.c, e1Var.d);
            } finally {
                e1Var.a(true);
            }
        } catch (androidx.media3.exoplayer.j e) {
            androidx.media3.common.util.c.g("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            net.luminis.tls.engine.impl.c.k(e);
        }
    }

    private final void c() {
        androidx.media3.exoplayer.mediacodec.e eVar = (androidx.media3.exoplayer.mediacodec.e) this.y;
        synchronized (eVar.a) {
            try {
                if (eVar.m) {
                    return;
                }
                long j = eVar.l - 1;
                eVar.l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    eVar.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (eVar.a) {
                    eVar.n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:172:0x02df  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:182:0x0314  */
    /* JADX WARN: Code duplicated, block: B:184:0x031e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0355  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:196:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:200:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ee A[LOOP:2: B:198:0x03e2->B:202:0x03ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0407  */
    /* JADX WARN: Code duplicated, block: B:208:0x040d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0413  */
    /* JADX WARN: Code duplicated, block: B:298:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:302:0x05d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x05d4 A[Catch: all -> 0x05fd, LOOP:6: B:289:0x0572->B:303:0x05d4, LOOP_END, TryCatch #8 {all -> 0x05fd, blocks: (B:286:0x0564, B:289:0x0572, B:291:0x0582, B:293:0x058f, B:295:0x0598, B:297:0x05a7, B:299:0x05c8, B:303:0x05d4, B:304:0x05d7, B:306:0x05e9, B:312:0x0600, B:313:0x0603, B:305:0x05dc), top: B:342:0x0564, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:350:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x05d7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.h] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        androidx.dynamicanimation.animation.f fVar;
        float f3;
        float f4;
        float f5;
        androidx.dynamicanimation.animation.f fVar2;
        long j5;
        boolean z2;
        long j6;
        ArrayList arrayList;
        androidx.dynamicanimation.animation.c cVarB;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        int size;
        Object obj;
        long j7 = 0;
        int i2 = 1;
        switch (this.e) {
            case 0:
                m mVar = (m) this.y;
                Runnable runnable = mVar.y;
                if (runnable != null) {
                    runnable.run();
                    mVar.y = null;
                    return;
                }
                return;
            case 1:
                r.a((r) this.y);
                return;
            case 2:
                ActionMode actionMode = ((androidx.compose.foundation.text.contextmenu.internal.i) this.y).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 3:
                androidx.compose.material.ripple.e.setRippleState$lambda$1((androidx.compose.material.ripple.e) this.y);
                return;
            case 4:
                androidx.compose.ui.contentcapture.f fVar3 = (androidx.compose.ui.contentcapture.f) this.y;
                boolean zE = fVar3.e();
                androidx.compose.ui.platform.u uVar = fVar3.e;
                if (zE) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        uVar.u(true);
                        androidx.collection.z zVar = fVar3.I;
                        int[] iArr = zVar.b;
                        long[] jArr = zVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j8 = jArr[i3];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8;
                                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                                    long j9 = j8;
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((255 & j9) < 128) {
                                            int i7 = iArr[(i3 << 3) + i6];
                                            if (!fVar3.d().a(i7)) {
                                                fVar3.A.add(new androidx.compose.ui.contentcapture.g(i7, fVar3.H, androidx.compose.ui.contentcapture.h.y, null));
                                                fVar3.E.mo28trySendJP2dKIU(kotlin.y.a);
                                            }
                                        }
                                        j9 >>= i4;
                                        i6++;
                                        i4 = i4;
                                    }
                                    if (i5 == i4) {
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                } else if (i3 != length) {
                                    i3++;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            fVar3.h(uVar.getSemanticsOwner().a(), fVar3.J);
                            Trace.endSection();
                            fVar3.c(fVar3.d());
                            fVar3.l();
                            fVar3.K = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                return;
            case 5:
                androidx.compose.ui.platform.a0 a0Var = (androidx.compose.ui.platform.a0) this.y;
                Trace.beginSection("measureAndLayout");
                try {
                    a0Var.A.u(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        a0Var.n();
                        Trace.endSection();
                        a0Var.g0 = false;
                        return;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            case 6:
                androidx.compose.ui.text.input.a0 a0Var2 = (androidx.compose.ui.text.input.a0) this.y;
                c2 c2Var = a0Var2.b;
                a0Var2.n = null;
                androidx.compose.runtime.collection.b bVar = a0Var2.m;
                View view = a0Var2.a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    bVar.g();
                    return;
                }
                Object[] objArr = bVar.e;
                int i8 = bVar.z;
                Boolean bool = null;
                Boolean boolValueOf = null;
                for (int i9 = 0; i9 < i8; i9++) {
                    androidx.compose.ui.text.input.z zVar2 = (androidx.compose.ui.text.input.z) objArr[i9];
                    int iOrdinal = zVar2.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            coil3.g.a();
                            return;
                        } else if (!kotlin.jvm.internal.l.a(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(zVar2 == androidx.compose.ui.text.input.z.z);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                bVar.g();
                if (kotlin.jvm.internal.l.a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c2Var.z.getValue()).restartInput((View) c2Var.y);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((androidx.core.view.a0) ((com.google.firebase.platforminfo.c) c2Var.A).e).b();
                    } else {
                        ((androidx.core.view.a0) ((com.google.firebase.platforminfo.c) c2Var.A).e).a();
                    }
                }
                if (kotlin.jvm.internal.l.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c2Var.z.getValue()).restartInput((View) c2Var.y);
                    return;
                }
                return;
            case 7:
                androidx.dynamicanimation.animation.c cVar = (androidx.dynamicanimation.animation.c) ((androidx.dynamicanimation.animation.c) this.y).c.e;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = cVar.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    androidx.dynamicanimation.animation.e eVar = (androidx.dynamicanimation.animation.e) arrayList3.get(i10);
                    if (eVar == null) {
                        jUptimeMillis = jUptimeMillis;
                        arrayList3 = arrayList3;
                        j5 = jUptimeMillis2;
                        j6 = j7;
                    } else {
                        y0 y0Var = cVar.a;
                        Long l = (Long) y0Var.get(eVar);
                        if (l == null) {
                            j = eVar.f;
                            if (j == j7) {
                                eVar.f = jUptimeMillis;
                                eVar.c(eVar.b);
                                jUptimeMillis = jUptimeMillis;
                                arrayList3 = arrayList3;
                                j5 = jUptimeMillis2;
                                j6 = j7;
                            } else {
                                j2 = jUptimeMillis - j;
                                eVar.f = jUptimeMillis;
                                f = androidx.dynamicanimation.animation.e.b().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = eVar.l;
                                f2 = eVar.k;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        eVar.j.i = f2;
                                        eVar.k = Float.MAX_VALUE;
                                    }
                                    eVar.b = (float) eVar.j.i;
                                    eVar.a = 0.0f;
                                    eVar.l = false;
                                    jUptimeMillis = jUptimeMillis;
                                    arrayList3 = arrayList3;
                                    j5 = jUptimeMillis2;
                                } else {
                                    fVar = eVar.j;
                                    f3 = eVar.b;
                                    f4 = eVar.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j10 = j4 / 2;
                                        b1 b1VarA = fVar.a(f3, f4, j10);
                                        androidx.dynamicanimation.animation.f fVar4 = eVar.j;
                                        fVar4.i = eVar.k;
                                        eVar.k = Float.MAX_VALUE;
                                        b1 b1VarA2 = fVar4.a(b1VarA.a, b1VarA.b, j10);
                                        eVar.b = b1VarA2.a;
                                        eVar.a = b1VarA2.b;
                                    } else {
                                        b1 b1VarA3 = fVar.a(f3, f4, j4);
                                        eVar.b = b1VarA3.a;
                                        eVar.a = b1VarA3.b;
                                    }
                                    float fMax = Math.max(eVar.b, -3.4028235E38f);
                                    eVar.b = fMax;
                                    float fMin = Math.min(fMax, Float.MAX_VALUE);
                                    eVar.b = fMin;
                                    f5 = eVar.a;
                                    fVar2 = eVar.j;
                                    fVar2.getClass();
                                    j5 = jUptimeMillis2;
                                    if (Math.abs(f5) < fVar2.e) {
                                    }
                                    z2 = false;
                                    float fMin2 = Math.min(eVar.b, Float.MAX_VALUE);
                                    eVar.b = fMin2;
                                    float fMax2 = Math.max(fMin2, -3.4028235E38f);
                                    eVar.b = fMax2;
                                    eVar.c(fMax2);
                                    if (z2) {
                                        arrayList = eVar.h;
                                        eVar.e = false;
                                        cVarB = androidx.dynamicanimation.animation.e.b();
                                        cVarB.a.remove(eVar);
                                        arrayList2 = cVarB.b;
                                        iIndexOf = arrayList2.indexOf(eVar);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            cVarB.f = true;
                                        }
                                        j6 = 0;
                                        eVar.f = 0L;
                                        for (i = 0; i < arrayList.size(); i++) {
                                            if (arrayList.get(i) == null) {
                                                arrayList.get(i).getClass();
                                                androidx.transition.k.i();
                                                return;
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        j6 = 0;
                                    }
                                }
                                z2 = true;
                                float fMin3 = Math.min(eVar.b, Float.MAX_VALUE);
                                eVar.b = fMin3;
                                float fMax3 = Math.max(fMin3, -3.4028235E38f);
                                eVar.b = fMax3;
                                eVar.c(fMax3);
                                if (z2) {
                                    arrayList = eVar.h;
                                    eVar.e = false;
                                    cVarB = androidx.dynamicanimation.animation.e.b();
                                    cVarB.a.remove(eVar);
                                    arrayList2 = cVarB.b;
                                    iIndexOf = arrayList2.indexOf(eVar);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        cVarB.f = true;
                                    }
                                    j6 = 0;
                                    eVar.f = 0L;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) == null) {
                                            arrayList.get(i).getClass();
                                            androidx.transition.k.i();
                                            return;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    j6 = 0;
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            y0Var.remove(eVar);
                            j = eVar.f;
                            if (j == j7) {
                                eVar.f = jUptimeMillis;
                                eVar.c(eVar.b);
                                jUptimeMillis = jUptimeMillis;
                                arrayList3 = arrayList3;
                                j5 = jUptimeMillis2;
                                j6 = j7;
                            } else {
                                j2 = jUptimeMillis - j;
                                eVar.f = jUptimeMillis;
                                f = androidx.dynamicanimation.animation.e.b().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = eVar.l;
                                f2 = eVar.k;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        eVar.j.i = f2;
                                        eVar.k = Float.MAX_VALUE;
                                    }
                                    eVar.b = (float) eVar.j.i;
                                    eVar.a = 0.0f;
                                    eVar.l = false;
                                    jUptimeMillis = jUptimeMillis;
                                    arrayList3 = arrayList3;
                                    j5 = jUptimeMillis2;
                                } else {
                                    fVar = eVar.j;
                                    f3 = eVar.b;
                                    f4 = eVar.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j11 = j4 / 2;
                                        b1 b1VarA4 = fVar.a(f3, f4, j11);
                                        androidx.dynamicanimation.animation.f fVar5 = eVar.j;
                                        fVar5.i = eVar.k;
                                        eVar.k = Float.MAX_VALUE;
                                        b1 b1VarA5 = fVar5.a(b1VarA4.a, b1VarA4.b, j11);
                                        eVar.b = b1VarA5.a;
                                        eVar.a = b1VarA5.b;
                                    } else {
                                        b1 b1VarA6 = fVar.a(f3, f4, j4);
                                        eVar.b = b1VarA6.a;
                                        eVar.a = b1VarA6.b;
                                    }
                                    float fMax4 = Math.max(eVar.b, -3.4028235E38f);
                                    eVar.b = fMax4;
                                    float fMin4 = Math.min(fMax4, Float.MAX_VALUE);
                                    eVar.b = fMin4;
                                    f5 = eVar.a;
                                    fVar2 = eVar.j;
                                    fVar2.getClass();
                                    j5 = jUptimeMillis2;
                                    if (Math.abs(f5) < fVar2.e || Math.abs(fMin4 - ((float) fVar2.i)) >= fVar2.d) {
                                        z2 = false;
                                    } else {
                                        eVar.b = (float) eVar.j.i;
                                        eVar.a = 0.0f;
                                    }
                                    float fMin5 = Math.min(eVar.b, Float.MAX_VALUE);
                                    eVar.b = fMin5;
                                    float fMax5 = Math.max(fMin5, -3.4028235E38f);
                                    eVar.b = fMax5;
                                    eVar.c(fMax5);
                                    if (z2) {
                                        arrayList = eVar.h;
                                        eVar.e = false;
                                        cVarB = androidx.dynamicanimation.animation.e.b();
                                        cVarB.a.remove(eVar);
                                        arrayList2 = cVarB.b;
                                        iIndexOf = arrayList2.indexOf(eVar);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            cVarB.f = true;
                                        }
                                        j6 = 0;
                                        eVar.f = 0L;
                                        while (i < arrayList.size()) {
                                            if (arrayList.get(i) == null) {
                                                arrayList.get(i).getClass();
                                                androidx.transition.k.i();
                                                return;
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        j6 = 0;
                                    }
                                }
                                z2 = true;
                                float fMin6 = Math.min(eVar.b, Float.MAX_VALUE);
                                eVar.b = fMin6;
                                float fMax6 = Math.max(fMin6, -3.4028235E38f);
                                eVar.b = fMax6;
                                eVar.c(fMax6);
                                if (z2) {
                                    arrayList = eVar.h;
                                    eVar.e = false;
                                    cVarB = androidx.dynamicanimation.animation.e.b();
                                    cVarB.a.remove(eVar);
                                    arrayList2 = cVarB.b;
                                    iIndexOf = arrayList2.indexOf(eVar);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        cVarB.f = true;
                                    }
                                    j6 = 0;
                                    eVar.f = 0L;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) == null) {
                                            arrayList.get(i).getClass();
                                            androidx.transition.k.i();
                                            return;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    j6 = 0;
                                }
                            }
                        } else {
                            jUptimeMillis = jUptimeMillis;
                            arrayList3 = arrayList3;
                            j5 = jUptimeMillis2;
                            j6 = j7;
                        }
                    }
                    i10++;
                    j7 = j6;
                    jUptimeMillis2 = j5;
                    arrayList3 = arrayList3;
                    jUptimeMillis = jUptimeMillis;
                }
                ArrayList arrayList4 = arrayList3;
                if (cVar.f) {
                    for (int size2 = arrayList4.size() - 1; size2 >= 0; size2--) {
                        if (arrayList4.get(size2) == null) {
                            arrayList4.remove(size2);
                        }
                    }
                    if (arrayList4.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        cVar.h.b();
                    }
                    cVar.f = false;
                }
                if (arrayList4.size() > 0) {
                    ((Choreographer) cVar.e.y).postFrameCallback(new androidx.compose.ui.text.input.c0(1, cVar.d));
                    return;
                }
                return;
            case 8:
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.y;
                synchronized (tVar.d) {
                    try {
                        if (tVar.h == null) {
                            return;
                        }
                        try {
                            androidx.core.provider.i iVarC = tVar.c();
                            int i11 = iVarC.f;
                            if (i11 == 2) {
                                synchronized (tVar.d) {
                                }
                            }
                            if (i11 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                            }
                            try {
                                int i12 = androidx.core.os.e.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                com.google.android.gms.common.internal.k kVar = tVar.c;
                                Context context = tVar.a;
                                kVar.getClass();
                                androidx.core.provider.i[] iVarArr = {iVarC};
                                _COROUTINE.a aVar = androidx.core.graphics.f.a;
                                com.google.android.gms.dynamite.g.g("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceM = androidx.core.graphics.f.a.m(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferZ = _COROUTINE.b.z(tVar.a, iVarC.a);
                                    if (mappedByteBufferZ == null || typefaceM == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.o oVar = new com.google.firebase.messaging.o(typefaceM, _COROUTINE.a.F(mappedByteBufferZ));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (tVar.d) {
                                            try {
                                                okhttp3.internal.platform.android.g gVar = tVar.h;
                                                if (gVar != null) {
                                                    gVar.C(oVar);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                            break;
                                        }
                                        tVar.b();
                                        return;
                                    } catch (Throwable th5) {
                                        int i13 = androidx.core.os.e.a;
                                        Trace.endSection();
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    Trace.endSection();
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                int i14 = androidx.core.os.e.a;
                                Trace.endSection();
                                throw th7;
                            }
                            break;
                        } catch (Throwable th8) {
                            synchronized (tVar.d) {
                                try {
                                    okhttp3.internal.platform.android.g gVar2 = tVar.h;
                                    if (gVar2 != null) {
                                        gVar2.B(th8);
                                    }
                                    tVar.b();
                                    return;
                                } catch (Throwable th9) {
                                    throw th9;
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            case 9:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.y;
                androidx.lifecycle.x xVar = e0Var.C;
                if (e0Var.y == 0) {
                    e0Var.z = true;
                    xVar.e(androidx.lifecycle.n.ON_PAUSE);
                }
                if (e0Var.e == 0 && e0Var.z) {
                    xVar.e(androidx.lifecycle.n.ON_STOP);
                    e0Var.A = true;
                    return;
                }
                return;
            case 10:
                androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) this.y;
                ((Context) b1Var.y).unregisterReceiver((androidx.media3.common.audio.a) b1Var.z);
                return;
            case 11:
                androidx.media3.common.audio.a aVar2 = (androidx.media3.common.audio.a) this.y;
                if (aVar2.c.e) {
                    aVar2.a.e.S(3, false);
                    return;
                }
                return;
            case 12:
                a();
                return;
            case 13:
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) this.y;
                androidx.appcompat.widget.o oVar2 = c0Var.B;
                Context context2 = c0Var.e;
                String str = j0.a;
                int iGenerateAudioSessionId = androidx.media3.common.audio.h.l(context2).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                oVar2.getClass();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == ((g0) oVar2.c).a.getLooper()) {
                    obj = oVar2.e;
                } else {
                    com.google.android.material.motion.a.q(looperMyLooper == ((g0) oVar2.b).a.getLooper());
                    obj = oVar2.f;
                }
                if (((Integer) obj).intValue() != iGenerateAudioSessionId) {
                    Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                    oVar2.f = numValueOf;
                    androidx.media3.common.util.d dVar = new androidx.media3.common.util.d(oVar2, numValueOf, i2);
                    g0 g0Var = (g0) oVar2.c;
                    if (g0Var.a.getLooper().getThread().isAlive()) {
                        g0Var.d(dVar);
                    }
                    c0Var.J(1, 10, Integer.valueOf(iGenerateAudioSessionId));
                    c0Var.J(2, 10, Integer.valueOf(iGenerateAudioSessionId));
                    return;
                }
                return;
            case 14:
                androidx.media3.exoplayer.analytics.g gVar3 = ((k0) this.y).T;
                gVar3.M(gVar3.H(), 1034, new androidx.media3.exoplayer.o(15));
                return;
            case 15:
                b();
                return;
            case 16:
                androidx.media3.exoplayer.analytics.g gVar4 = (androidx.media3.exoplayer.analytics.g) this.y;
                gVar4.M(gVar4.H(), 1028, new androidx.media3.exoplayer.o(24));
                gVar4.C.d();
                return;
            case 17:
                ((androidx.media3.exoplayer.audio.e) this.y).c();
                return;
            case 18:
                androidx.media3.common.util.p pVar = (androidx.media3.common.util.p) this.y;
                pVar.getClass();
                if (Thread.currentThread() == pVar.a) {
                    pVar.e(-1, new androidx.media3.exoplayer.analytics.d(25));
                    return;
                }
                return;
            case 19:
                n0 n0Var = (n0) this.y;
                if (n0Var.a0 >= 300000) {
                    ((q0) n0Var.n.y).q1 = true;
                    n0Var.a0 = 0L;
                    return;
                }
                return;
            case 20:
                ((androidx.media3.exoplayer.hls.c) this.y).B();
                return;
            case 21:
                c();
                return;
            case 22:
                ((androidx.media3.exoplayer.trackselection.o) this.y).i();
                return;
            case 23:
                ((androidx.media3.exoplayer.video.c) this.y).h.d();
                return;
            case 24:
                ((androidx.media3.exoplayer.video.s) this.y).m--;
                return;
            case 25:
                androidx.media3.exoplayer.video.a0 a0Var3 = (androidx.media3.exoplayer.video.a0) this.y;
                a0Var3.e.postVsyncCallback(a0Var3);
                return;
            case 26:
                androidx.media3.exoplayer.video.spherical.k kVar2 = (androidx.media3.exoplayer.video.spherical.k) this.y;
                Surface surface = kVar2.E;
                if (surface != null) {
                    Iterator it = kVar2.e.iterator();
                    while (it.hasNext()) {
                        ((androidx.media3.exoplayer.x) it.next()).e.P(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar2.D;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar2.D = null;
                kVar2.E = null;
                return;
            case 27:
                ((androidx.media3.ui.g) this.y).d(false);
                return;
            case 28:
                ((androidx.media3.ui.v) this.y).s();
                return;
            default:
                ((h0) this.y).invalidate();
                return;
        }
    }

    public /* synthetic */ l(k0 k0Var, e1 e1Var) {
        this.e = 15;
        this.y = e1Var;
    }

    public /* synthetic */ l(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }
}
