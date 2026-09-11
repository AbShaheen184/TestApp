package com.google.android.gms.common.internal;

import android.content.Context;
import android.graphics.Path;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.view.Surface;
import com.caverock.androidsvg.y1;
import com.google.android.gms.internal.measurement.k3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.appcompat.view.menu.o, kotlin.coroutines.h, androidx.compose.ui.text.font.p, androidx.lifecycle.viewmodel.b, androidx.media3.exoplayer.upstream.p, androidx.media3.exoplayer.mediacodec.k, androidx.media3.exoplayer.source.chunk.l, androidx.media3.extractor.g, androidx.media3.extractor.ogg.g, androidx.media3.extractor.text.j, com.google.android.datatransport.runtime.time.a, com.google.android.gms.dynamite.c, com.google.android.gms.dynamite.d, com.google.android.gms.measurement.internal.y {
    public static k y;
    public static final /* synthetic */ k z = new k(29);
    public final /* synthetic */ int e;

    public /* synthetic */ k(int i) {
        this.e = i;
    }

    public static final float s(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static MediaCodec t(y1 y1Var) throws IOException {
        String str = ((androidx.media3.exoplayer.mediacodec.o) y1Var.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static Path u(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static boolean v(androidx.emoji2.viewsintegration.b bVar, Editable editable, int i, int i2, boolean z2) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z2) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z3) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z3) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z3 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z4 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z4) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z4) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z4 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                androidx.emoji2.text.z[] zVarArr = (androidx.emoji2.text.z[]) editable.getSpans(selectionStart, iMin, androidx.emoji2.text.z.class);
                if (zVarArr != null && zVarArr.length > 0) {
                    for (androidx.emoji2.text.z zVar : zVarArr) {
                        int spanStart = editable.getSpanStart(zVar);
                        int spanEnd = editable.getSpanEnd(zVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.y
    public Object a() {
        return new Boolean(((Boolean) k3.a.get()).booleanValue());
    }

    @Override // com.google.android.gms.dynamite.c
    public int c(Context context, String str, boolean z2) {
        return com.google.android.gms.dynamite.e.d(context, str, z2);
    }

    @Override // com.google.android.gms.dynamite.c
    public int d(Context context, String str) {
        return com.google.android.gms.dynamite.e.a(context, str);
    }

    @Override // androidx.media3.extractor.text.j
    public int e(androidx.media3.common.r rVar) {
        String str = rVar.o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // androidx.media3.extractor.ogg.g
    public long f(androidx.media3.extractor.o oVar) {
        return -1L;
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long h() {
        return SystemClock.elapsedRealtime();
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public long i() {
        throw new NoSuchElementException();
    }

    @Override // androidx.media3.exoplayer.upstream.p
    public Object j(Uri uri, androidx.media3.datasource.j jVar) {
        return Long.valueOf(androidx.media3.common.util.j0.T(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public long k() {
        throw new NoSuchElementException();
    }

    @Override // androidx.media3.extractor.ogg.g
    public androidx.media3.extractor.a0 l() {
        return new androidx.media3.extractor.s(-9223372036854775807L);
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean m(androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // com.google.android.gms.dynamite.d
    public androidx.media3.container.j n(Context context, String str, com.google.android.gms.dynamite.c cVar) {
        int iC;
        androidx.media3.container.j jVar = new androidx.media3.container.j();
        int iD = cVar.d(context, str);
        jVar.a = iD;
        int i = 1;
        int i2 = 0;
        if (iD != 0) {
            iC = cVar.c(context, str, false);
            jVar.b = iC;
        } else {
            iC = cVar.c(context, str, true);
            jVar.b = iC;
        }
        int i3 = jVar.a;
        if (i3 == 0) {
            if (iC == 0) {
                i = 0;
            }
            jVar.c = i;
            return jVar;
        }
        i2 = i3;
        if (i2 >= iC) {
            i = -1;
        }
        jVar.c = i;
        return jVar;
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public boolean next() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // androidx.media3.exoplayer.mediacodec.k
    public androidx.media3.exoplayer.mediacodec.l o(y1 y1Var) throws Throwable {
        MediaCodec mediaCodecT = null;
        try {
            mediaCodecT = t(y1Var);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) y1Var.d;
            mediaCodecT.configure((MediaFormat) y1Var.b, surface, (MediaCrypto) y1Var.e, (surface == null && ((androidx.media3.exoplayer.mediacodec.o) y1Var.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecT.start();
            Trace.endSection();
            return new androidx.media3.exoplayer.mediacodec.w(mediaCodecT, (androidx.media3.exoplayer.mediacodec.j) y1Var.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodecT != null) {
                mediaCodecT.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecT != null) {
                mediaCodecT.release();
            }
            throw e;
        }
    }

    @Override // androidx.media3.extractor.text.j
    public androidx.media3.extractor.text.l p(androidx.media3.common.r rVar) {
        String str = rVar.o;
        List list = rVar.r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new androidx.media3.extractor.text.dvb.h(list);
                case "application/pgs":
                    return new com.google.firebase.messaging.o(14);
                case "application/x-mp4-vtt":
                    return new androidx.media3.exoplayer.dash.manifest.t(9);
                case "text/vtt":
                    return new androidx.media3.extractor.text.webvtt.i();
                case "application/x-quicktime-tx3g":
                    return new androidx.media3.extractor.text.tx3g.a(list);
                case "text/x-ssa":
                    return new androidx.media3.extractor.text.ssa.a(list);
                case "application/vobsub":
                    return new androidx.media3.extractor.text.vobsub.b(list);
                case "application/x-subrip":
                    return new androidx.media3.extractor.text.subrip.a();
                case "application/ttml+xml":
                    return new androidx.media3.extractor.text.ttml.e();
            }
        }
        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Unsupported MIME type: ", str));
        return null;
    }

    @Override // androidx.media3.extractor.text.j
    public boolean r(androidx.media3.common.r rVar) {
        String str = rVar.o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k(Object obj, int i) {
        this.e = i;
    }

    @Override // androidx.media3.extractor.g
    public long g(long j) {
        return j;
    }

    @Override // androidx.media3.extractor.ogg.g
    public void q(long j) {
    }

    @Override // androidx.appcompat.view.menu.o
    public void b(androidx.appcompat.view.menu.j jVar, boolean z2) {
    }
}
