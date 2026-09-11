package androidx.media3.exoplayer.analytics;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.x;
import androidx.media3.common.b1;
import androidx.media3.common.c1;
import androidx.media3.common.j0;
import androidx.media3.common.k0;
import androidx.media3.common.m;
import androidx.media3.common.o;
import androidx.media3.common.q0;
import androidx.media3.common.r;
import androidx.media3.common.t0;
import androidx.media3.common.u0;
import androidx.media3.common.util.u;
import androidx.media3.common.v0;
import androidx.media3.common.y;
import androidx.media3.datasource.a0;
import androidx.media3.datasource.s;
import androidx.media3.datasource.t;
import androidx.media3.exoplayer.audio.w;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.mediacodec.n;
import androidx.media3.exoplayer.mediacodec.p;
import androidx.media3.exoplayer.source.v;
import com.google.common.collect.e0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements b {
    public int A;
    public boolean B;
    public final Context a;
    public final i c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public k0 o;
    public x p;
    public x q;
    public x r;
    public r s;
    public r t;
    public r u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = androidx.media3.common.util.c.h();
    public final u0 f = new u0();
    public final t0 g = new t0();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public j(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        i iVar = new i();
        this.c = iVar;
        iVar.d = this;
    }

    public static j g(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new j(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean f(x xVar) {
        String str;
        if (xVar == null) {
            return false;
        }
        String str2 = (String) xVar.A;
        i iVar = this.c;
        synchronized (iVar) {
            str = iVar.f;
        }
        return str2.equals(str);
    }

    public final void h() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new androidx.activity.c(13, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final LogSessionId i() {
        return this.d.getSessionId();
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    public final void j(v0 v0Var, v vVar) {
        Matcher matcher;
        String strGroup;
        int i;
        PlaybackMetrics.Builder builder = this.k;
        if (vVar == null) {
            return;
        }
        int iB = v0Var.b(vVar.a);
        if (iB == -1) {
            return;
        }
        t0 t0Var = this.g;
        int i2 = 0;
        v0Var.f(iB, t0Var, false);
        int i3 = t0Var.c;
        u0 u0Var = this.f;
        v0Var.n(i3, u0Var);
        y yVar = u0Var.c.b;
        if (yVar != null) {
            Uri uri = yVar.a;
            String str = yVar.b;
            if (str != null) {
                switch (str) {
                    case "application/x-mpegURL":
                        i2 = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        i2 = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        i2 = 3;
                        break;
                    default:
                        i2 = 4;
                        break;
                }
            } else {
                String scheme = uri.getScheme();
                if (scheme == null || !(com.google.common.base.b.h("rtsp", scheme) || com.google.common.base.b.h("rtspt", scheme))) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        i2 = 4;
                    } else {
                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (iLastIndexOf >= 0) {
                            String strW = com.google.common.base.b.w(lastPathSegment.substring(iLastIndexOf + 1));
                            strW.getClass();
                            switch (strW.hashCode()) {
                                case 104579:
                                    if (strW.equals("ism")) {
                                    }
                                    break;
                                case 108321:
                                    if (strW.equals("mpd")) {
                                    }
                                    break;
                                case 3242057:
                                    if (strW.equals("isml")) {
                                    }
                                    break;
                                case 3299913:
                                    if (strW.equals("m3u8")) {
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                */
                            /*
                                Method dump skipped, instruction units count: 392
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.j.j(androidx.media3.common.v0, androidx.media3.exoplayer.source.v):void");
                        }

                        /* JADX WARN: Code duplicated, block: B:253:0x046a  */
                        /* JADX WARN: Code duplicated, block: B:386:0x0611  */
                        /* JADX WARN: Code duplicated, block: B:389:0x063f  */
                        /* JADX WARN: Code duplicated, block: B:393:0x0653 A[Catch: all -> 0x0662, TryCatch #0 {all -> 0x0662, blocks: (B:391:0x064f, B:393:0x0653, B:396:0x0664, B:397:0x066e, B:399:0x0674, B:401:0x0681, B:403:0x0685), top: B:410:0x064f }] */
                        /* JADX WARN: Code duplicated, block: B:399:0x0674 A[Catch: all -> 0x0662, TryCatch #0 {all -> 0x0662, blocks: (B:391:0x064f, B:393:0x0653, B:396:0x0664, B:397:0x066e, B:399:0x0674, B:401:0x0681, B:403:0x0685), top: B:410:0x064f }] */
                        /* JADX WARN: Code duplicated, block: B:409:0x068f A[ORIG_RETURN, RETURN] */
                        /* JADX WARN: Code duplicated, block: B:410:0x064f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Multi-variable type inference failed */
                        public final void k(q0 q0Var, androidx.media3.common.util.b bVar) {
                            int i;
                            boolean z;
                            int i2;
                            int i3;
                            int i4;
                            int i5;
                            int i6;
                            int i7;
                            androidx.core.view.r rVar;
                            androidx.core.view.r rVar2;
                            int i8;
                            int i9;
                            int i10;
                            int i11;
                            androidx.core.view.r rVar3;
                            int i12;
                            int i13;
                            x xVar;
                            int i14;
                            int i15;
                            int i16;
                            boolean z2;
                            i iVar;
                            String str;
                            Iterator it;
                            h hVar;
                            j jVar;
                            r rVar4;
                            m mVar;
                            int i17;
                            if (((o) bVar.y).a.size() == 0) {
                                return;
                            }
                            int i18 = 0;
                            while (true) {
                                boolean z3 = true;
                                if (i18 >= ((o) bVar.y).a.size()) {
                                    break;
                                }
                                SparseBooleanArray sparseBooleanArray = ((o) bVar.y).a;
                                com.google.android.material.motion.a.j(i18, sparseBooleanArray.size());
                                int iKeyAt = sparseBooleanArray.keyAt(i18);
                                a aVar = (a) ((SparseArray) bVar.z).get(iKeyAt);
                                aVar.getClass();
                                i iVar2 = this.c;
                                if (iKeyAt == 0) {
                                    synchronized (iVar2) {
                                        try {
                                            iVar2.d.getClass();
                                            v0 v0Var = iVar2.e;
                                            iVar2.e = aVar.b;
                                            Iterator it2 = iVar2.c.values().iterator();
                                            while (it2.hasNext()) {
                                                h hVar2 = (h) it2.next();
                                                if (!hVar2.b(v0Var, iVar2.e) || hVar2.a(aVar)) {
                                                    it2.remove();
                                                    if (hVar2.a.equals(iVar2.f)) {
                                                        iVar2.a(hVar2);
                                                    }
                                                    if (hVar2.e) {
                                                        iVar2.d.m(aVar, hVar2.a);
                                                    }
                                                }
                                            }
                                            iVar2.d(aVar);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else if (iKeyAt == 11) {
                                    int i19 = this.l;
                                    synchronized (iVar2) {
                                        try {
                                            iVar2.d.getClass();
                                            if (i19 != 0) {
                                                z3 = false;
                                            }
                                            Iterator it3 = iVar2.c.values().iterator();
                                            while (it3.hasNext()) {
                                                h hVar3 = (h) it3.next();
                                                if (hVar3.a(aVar)) {
                                                    it3.remove();
                                                    boolean zEquals = hVar3.a.equals(iVar2.f);
                                                    if (zEquals) {
                                                        iVar2.a(hVar3);
                                                    }
                                                    if (hVar3.e) {
                                                        if (z3 && zEquals) {
                                                            boolean z4 = hVar3.f;
                                                        }
                                                        iVar2.d.m(aVar, hVar3.a);
                                                    }
                                                }
                                            }
                                            iVar2.d(aVar);
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                } else {
                                    iVar2.e(aVar);
                                }
                                i18++;
                            }
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (bVar.p(0)) {
                                a aVar2 = (a) ((SparseArray) bVar.z).get(0);
                                aVar2.getClass();
                                if (this.k != null) {
                                    j(aVar2.b, aVar2.d);
                                }
                            }
                            if (bVar.p(2) && this.k != null) {
                                e0 e0VarListIterator = ((c0) q0Var).m().a.listIterator(0);
                                loop3: while (true) {
                                    if (!e0VarListIterator.hasNext()) {
                                        mVar = null;
                                        break;
                                    }
                                    b1 b1Var = (b1) e0VarListIterator.next();
                                    for (int i20 = 0; i20 < b1Var.a; i20++) {
                                        if (b1Var.e[i20] && (mVar = b1Var.a(i20).s) != null) {
                                            break loop3;
                                        }
                                    }
                                }
                                if (mVar != null) {
                                    PlaybackMetrics.Builder builder = this.k;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= mVar.A) {
                                            i17 = 1;
                                            break;
                                        }
                                        UUID uuid = mVar.e[i21].y;
                                        if (uuid.equals(androidx.media3.common.g.d)) {
                                            i17 = 3;
                                            break;
                                        } else if (uuid.equals(androidx.media3.common.g.e)) {
                                            i17 = 2;
                                            break;
                                        } else {
                                            if (uuid.equals(androidx.media3.common.g.c)) {
                                                i17 = 6;
                                                break;
                                            }
                                            i21++;
                                        }
                                    }
                                    builder.setDrmType(i17);
                                }
                            }
                            if (bVar.p(1011)) {
                                this.A++;
                            }
                            k0 k0Var = this.o;
                            if (k0Var == null) {
                                i4 = 4;
                                i12 = 1;
                                i13 = 2;
                                i7 = 13;
                                i2 = 9;
                                i3 = 8;
                                i5 = 7;
                                i6 = 6;
                            } else {
                                int i22 = k0Var.e;
                                Context context = this.a;
                                boolean z5 = this.w == 4;
                                if (i22 == 1001) {
                                    rVar = new androidx.core.view.r(20, 0);
                                } else {
                                    if (k0Var instanceof androidx.media3.exoplayer.j) {
                                        androidx.media3.exoplayer.j jVar2 = (androidx.media3.exoplayer.j) k0Var;
                                        z = jVar2.z == 1;
                                        i = jVar2.D;
                                    } else {
                                        i = 0;
                                        z = false;
                                    }
                                    Throwable cause = k0Var.getCause();
                                    cause.getClass();
                                    int i23 = 27;
                                    if (cause instanceof IOException) {
                                        if (cause instanceof t) {
                                            rVar3 = new androidx.core.view.r(5, ((t) cause).z);
                                        } else {
                                            if ((cause instanceof s) || (cause instanceof j0)) {
                                                i8 = 7;
                                                i9 = 6;
                                                i10 = 4;
                                                i11 = 8;
                                                i2 = 9;
                                                rVar = new androidx.core.view.r(z5 ? 10 : 11, 0);
                                            } else {
                                                boolean z6 = cause instanceof androidx.media3.datasource.r;
                                                if (z6 || (cause instanceof a0)) {
                                                    i2 = 9;
                                                    if (u.a(context).b() == 1) {
                                                        rVar = new androidx.core.view.r(3, 0);
                                                    } else {
                                                        Throwable cause2 = cause.getCause();
                                                        if (cause2 instanceof UnknownHostException) {
                                                            rVar = new androidx.core.view.r(6, 0);
                                                            i6 = 6;
                                                            i7 = 13;
                                                            i3 = 8;
                                                            i4 = 4;
                                                            i5 = 7;
                                                        } else {
                                                            i9 = 6;
                                                            if (cause2 instanceof SocketTimeoutException) {
                                                                rVar = new androidx.core.view.r(7, 0);
                                                                i5 = 7;
                                                                i6 = 6;
                                                                i7 = 13;
                                                                i3 = 8;
                                                                i4 = 4;
                                                            } else {
                                                                i8 = 7;
                                                                if (z6 && ((androidx.media3.datasource.r) cause).y == 1) {
                                                                    rVar = new androidx.core.view.r(4, 0);
                                                                    i5 = 7;
                                                                    i6 = 6;
                                                                    i4 = 4;
                                                                    i7 = 13;
                                                                    i3 = 8;
                                                                } else {
                                                                    i10 = 4;
                                                                    i11 = 8;
                                                                    rVar = new androidx.core.view.r(8, 0);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (i22 == 1002) {
                                                    rVar = new androidx.core.view.r(21, 0);
                                                } else if (cause instanceof androidx.media3.exoplayer.drm.b) {
                                                    Throwable cause3 = cause.getCause();
                                                    cause3.getClass();
                                                    if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                                        int iA = androidx.media3.common.util.j0.A(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                                        switch (androidx.media3.common.util.j0.z(iA)) {
                                                            case 6002:
                                                                i23 = 24;
                                                                break;
                                                            case 6003:
                                                                i23 = 28;
                                                                break;
                                                            case 6004:
                                                                i23 = 25;
                                                                break;
                                                            case 6005:
                                                                i23 = 26;
                                                                break;
                                                        }
                                                        rVar3 = new androidx.core.view.r(i23, iA);
                                                    } else if (cause3 instanceof MediaDrmResetException) {
                                                        rVar = new androidx.core.view.r(27, 0);
                                                    } else if (cause3 instanceof NotProvisionedException) {
                                                        rVar = new androidx.core.view.r(24, 0);
                                                    } else if (cause3 instanceof DeniedByServerException) {
                                                        rVar = new androidx.core.view.r(29, 0);
                                                    } else if (cause3 instanceof androidx.media3.exoplayer.drm.i) {
                                                        rVar = new androidx.core.view.r(23, 0);
                                                    } else {
                                                        rVar = cause3 instanceof androidx.media3.exoplayer.drm.a ? new androidx.core.view.r(28, 0) : new androidx.core.view.r(30, 0);
                                                    }
                                                } else if ((cause instanceof androidx.media3.datasource.o) && (cause.getCause() instanceof FileNotFoundException)) {
                                                    Throwable cause4 = cause.getCause();
                                                    cause4.getClass();
                                                    Throwable cause5 = cause4.getCause();
                                                    rVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new androidx.core.view.r(32, 0) : new androidx.core.view.r(31, 0);
                                                } else {
                                                    i2 = 9;
                                                    rVar = new androidx.core.view.r(9, 0);
                                                }
                                                i7 = 13;
                                                i3 = 8;
                                                i4 = 4;
                                                i5 = 7;
                                                i6 = 6;
                                            }
                                            i5 = i8;
                                            i6 = i9;
                                            i4 = i10;
                                            i3 = i11;
                                            i7 = 13;
                                        }
                                        rVar = rVar3;
                                    } else {
                                        i2 = 9;
                                        i3 = 8;
                                        i4 = 4;
                                        i5 = 7;
                                        i6 = 6;
                                        if (z && (i == 0 || i == 1)) {
                                            rVar = new androidx.core.view.r(35, 0);
                                        } else if (z && i == 3) {
                                            rVar = new androidx.core.view.r(15, 0);
                                        } else if (z && i == 2) {
                                            rVar = new androidx.core.view.r(23, 0);
                                        } else {
                                            if (cause instanceof p) {
                                                i7 = 13;
                                                rVar2 = new androidx.core.view.r(13, androidx.media3.common.util.j0.A(((p) cause).A));
                                            } else {
                                                i7 = 13;
                                                if (cause instanceof n) {
                                                    rVar = new androidx.core.view.r(14, ((n) cause).e);
                                                } else if (cause instanceof OutOfMemoryError) {
                                                    rVar = new androidx.core.view.r(14, 0);
                                                } else if (cause instanceof androidx.media3.exoplayer.audio.v) {
                                                    rVar = new androidx.core.view.r(17, 0);
                                                } else if (cause instanceof w) {
                                                    rVar2 = new androidx.core.view.r(18, ((w) cause).e);
                                                } else if (cause instanceof MediaCodec.CryptoException) {
                                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                                    switch (androidx.media3.common.util.j0.z(errorCode)) {
                                                        case 6002:
                                                            i23 = 24;
                                                            break;
                                                        case 6003:
                                                            i23 = 28;
                                                            break;
                                                        case 6004:
                                                            i23 = 25;
                                                            break;
                                                        case 6005:
                                                            i23 = 26;
                                                            break;
                                                    }
                                                    rVar2 = new androidx.core.view.r(i23, errorCode);
                                                } else {
                                                    rVar = new androidx.core.view.r(22, 0);
                                                }
                                            }
                                            rVar = rVar2;
                                        }
                                        i7 = 13;
                                    }
                                    this.b.execute(new androidx.activity.c(12, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(rVar.a).setSubErrorCode(rVar.b).setException(k0Var).build()));
                                    i12 = 1;
                                    this.B = true;
                                    this.o = null;
                                    i13 = 2;
                                }
                                i7 = 13;
                                i2 = 9;
                                i3 = 8;
                                i4 = 4;
                                i5 = 7;
                                i6 = 6;
                                this.b.execute(new androidx.activity.c(12, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(rVar.a).setSubErrorCode(rVar.b).setException(k0Var).build()));
                                i12 = 1;
                                this.B = true;
                                this.o = null;
                                i13 = 2;
                            }
                            if (bVar.p(i13)) {
                                c1 c1VarM = ((c0) q0Var).m();
                                boolean zA = c1VarM.a(i13);
                                boolean zA2 = c1VarM.a(i12);
                                boolean zA3 = c1VarM.a(3);
                                if (zA || zA2 || zA3) {
                                    if (zA) {
                                        rVar4 = null;
                                    } else {
                                        rVar4 = null;
                                        if (!Objects.equals(this.s, null)) {
                                            int i24 = this.s == null ? 1 : 0;
                                            this.s = null;
                                            n(1, jElapsedRealtime, null, i24);
                                        }
                                    }
                                    if (!zA2 && !Objects.equals(this.t, rVar4)) {
                                        int i25 = this.t == null ? 1 : 0;
                                        this.t = rVar4;
                                        n(0, jElapsedRealtime, rVar4, i25);
                                    }
                                    if (!zA3 && !Objects.equals(this.u, rVar4)) {
                                        int i26 = this.u == null ? 1 : 0;
                                        this.u = rVar4;
                                        n(2, jElapsedRealtime, rVar4, i26);
                                    }
                                    xVar = rVar4;
                                } else {
                                    i4 = i4;
                                    xVar = 0;
                                }
                            } else {
                                i4 = i4;
                                xVar = 0;
                            }
                            if (f(this.p)) {
                                x xVar2 = this.p;
                                r rVar5 = (r) xVar2.z;
                                if (rVar5.w != -1) {
                                    int i27 = xVar2.y;
                                    if (!Objects.equals(this.s, rVar5)) {
                                        int i28 = (this.s == null && i27 == 0) ? 1 : i27;
                                        this.s = rVar5;
                                        n(1, jElapsedRealtime, rVar5, i28);
                                    }
                                    this.p = xVar;
                                }
                            }
                            if (f(this.q)) {
                                x xVar3 = this.q;
                                r rVar6 = (r) xVar3.z;
                                int i29 = xVar3.y;
                                if (!Objects.equals(this.t, rVar6)) {
                                    int i30 = (this.t == null && i29 == 0) ? 1 : i29;
                                    this.t = rVar6;
                                    n(0, jElapsedRealtime, rVar6, i30);
                                }
                                this.q = xVar;
                            }
                            if (f(this.r)) {
                                x xVar4 = this.r;
                                r rVar7 = (r) xVar4.z;
                                int i31 = xVar4.y;
                                if (!Objects.equals(this.u, rVar7)) {
                                    int i32 = (this.u == null && i31 == 0) ? 1 : i31;
                                    this.u = rVar7;
                                    n(2, jElapsedRealtime, rVar7, i32);
                                }
                                this.r = xVar;
                            }
                            switch (u.a(this.a).b()) {
                                case 0:
                                    i14 = 0;
                                    break;
                                case 1:
                                    i14 = i2;
                                    break;
                                case 2:
                                    i14 = 2;
                                    break;
                                case 3:
                                    i14 = i4;
                                    break;
                                case 4:
                                    i14 = 5;
                                    break;
                                case 5:
                                    i14 = i6;
                                    break;
                                case 6:
                                case 8:
                                default:
                                    i14 = 1;
                                    break;
                                case 7:
                                    i14 = 3;
                                    break;
                                case 9:
                                    i14 = i3;
                                    break;
                                case 10:
                                    i14 = i5;
                                    break;
                            }
                            if (i14 != this.n) {
                                this.n = i14;
                                this.b.execute(new androidx.activity.c(11, this, new NetworkEvent.Builder().setNetworkType(i14).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
                            }
                            c0 c0Var = (c0) q0Var;
                            if (c0Var.q() != 2) {
                                this.v = false;
                            }
                            c0Var.V();
                            if (c0Var.n0.f == null) {
                                this.x = false;
                                i15 = 10;
                            } else {
                                i15 = 10;
                                if (bVar.p(10)) {
                                    this.x = true;
                                }
                            }
                            int iQ = c0Var.q();
                            if (this.v) {
                                i16 = 5;
                            } else if (this.x) {
                                i16 = i7;
                            } else if (iQ == i4) {
                                i16 = 11;
                            } else {
                                i16 = 12;
                                if (iQ != 2) {
                                    if (iQ != 3) {
                                        z2 = true;
                                        if (iQ != 1 || this.m == 0) {
                                            i16 = this.m;
                                        }
                                    } else if (c0Var.p()) {
                                        i16 = c0Var.r() != 0 ? i2 : 3;
                                    } else {
                                        i16 = i4;
                                    }
                                    if (this.m != i16) {
                                        this.m = i16;
                                        this.B = z2;
                                        this.b.execute(new androidx.activity.c(14, this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
                                    }
                                    if (bVar.p(1028)) {
                                        iVar = this.c;
                                        a aVar3 = (a) ((SparseArray) bVar.z).get(1028);
                                        aVar3.getClass();
                                        synchronized (iVar) {
                                            try {
                                                str = iVar.f;
                                                if (str != null) {
                                                    h hVar4 = (h) iVar.c.get(str);
                                                    hVar4.getClass();
                                                    iVar.a(hVar4);
                                                }
                                                it = iVar.c.values().iterator();
                                                while (it.hasNext()) {
                                                    hVar = (h) it.next();
                                                    it.remove();
                                                    if (!hVar.e && (jVar = iVar.d) != null) {
                                                        jVar.m(aVar3, hVar.a);
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                                int i33 = this.m;
                                if (i33 == 0 || i33 == 2 || i33 == 12) {
                                    i16 = 2;
                                } else if (c0Var.p()) {
                                    i16 = c0Var.r() != 0 ? i15 : i6;
                                } else {
                                    i16 = i5;
                                }
                            }
                            z2 = true;
                            if (this.m != i16) {
                                this.m = i16;
                                this.B = z2;
                                this.b.execute(new androidx.activity.c(14, this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
                            }
                            if (bVar.p(1028)) {
                                iVar = this.c;
                                a aVar4 = (a) ((SparseArray) bVar.z).get(1028);
                                aVar4.getClass();
                                synchronized (iVar) {
                                    str = iVar.f;
                                    if (str != null) {
                                        h hVar5 = (h) iVar.c.get(str);
                                        hVar5.getClass();
                                        iVar.a(hVar5);
                                    }
                                    it = iVar.c.values().iterator();
                                    while (it.hasNext()) {
                                        hVar = (h) it.next();
                                        it.remove();
                                        if (!hVar.e) {
                                        }
                                    }
                                }
                            }
                        }

                        public final void l(a aVar, String str) {
                            v vVar = aVar.d;
                            if (vVar == null || !vVar.b()) {
                                h();
                                this.j = str;
                                this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
                                j(aVar.b, vVar);
                            }
                        }

                        public final void m(a aVar, String str) {
                            v vVar = aVar.d;
                            if ((vVar == null || !vVar.b()) && str.equals(this.j)) {
                                h();
                            }
                            this.h.remove(str);
                            this.i.remove(str);
                        }

                        public final void n(int i, long j, r rVar, int i2) {
                            int i3;
                            TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
                            if (rVar != null) {
                                timeSinceCreatedMillis.setTrackState(1);
                                if (i2 != 1) {
                                    i3 = 3;
                                    if (i2 != 2) {
                                        i3 = i2 != 3 ? 1 : 4;
                                    }
                                } else {
                                    i3 = 2;
                                }
                                timeSinceCreatedMillis.setTrackChangeReason(i3);
                                String str = rVar.n;
                                if (str != null) {
                                    timeSinceCreatedMillis.setContainerMimeType(str);
                                }
                                String str2 = rVar.o;
                                if (str2 != null) {
                                    timeSinceCreatedMillis.setSampleMimeType(str2);
                                }
                                String str3 = rVar.k;
                                if (str3 != null) {
                                    timeSinceCreatedMillis.setCodecName(str3);
                                }
                                int i4 = rVar.j;
                                if (i4 != -1) {
                                    timeSinceCreatedMillis.setBitrate(i4);
                                }
                                int i5 = rVar.v;
                                if (i5 != -1) {
                                    timeSinceCreatedMillis.setWidth(i5);
                                }
                                int i6 = rVar.w;
                                if (i6 != -1) {
                                    timeSinceCreatedMillis.setHeight(i6);
                                }
                                int i7 = rVar.G;
                                if (i7 != -1) {
                                    timeSinceCreatedMillis.setChannelCount(i7);
                                }
                                int i8 = rVar.H;
                                if (i8 != -1) {
                                    timeSinceCreatedMillis.setAudioSampleRate(i8);
                                }
                                String str4 = rVar.d;
                                if (str4 != null) {
                                    String str5 = androidx.media3.common.util.j0.a;
                                    String[] strArrSplit = str4.split("-", -1);
                                    Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                                    timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                                    Object obj = pairCreate.second;
                                    if (obj != null) {
                                        timeSinceCreatedMillis.setLanguageRegion((String) obj);
                                    }
                                }
                                float f = rVar.z;
                                if (f != -1.0f) {
                                    timeSinceCreatedMillis.setVideoFrameRate(f);
                                }
                            } else {
                                timeSinceCreatedMillis.setTrackState(0);
                            }
                            this.B = true;
                            this.b.execute(new androidx.activity.c(10, this, timeSinceCreatedMillis.build()));
                        }
                    }
