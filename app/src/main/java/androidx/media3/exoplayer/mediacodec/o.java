package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = i0.o(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(j0.g(i, widthAlignment) * widthAlignment, j0.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public static o i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z4 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        return new o(str, str2, str3, codecCapabilities, z, z2, z3, z5, z6, z4);
    }

    public final androidx.media3.exoplayer.d b(androidx.media3.common.r rVar, androidx.media3.common.r rVar2) {
        androidx.media3.common.r rVar3;
        androidx.media3.common.r rVar4;
        int i;
        String str = rVar.o;
        androidx.media3.common.h hVar = rVar.E;
        String str2 = rVar2.o;
        androidx.media3.common.h hVar2 = rVar2.E;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (rVar.A != rVar2.A) {
                i2 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            boolean z = (rVar.v == rVar2.v && rVar.w == rVar2.w) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!androidx.media3.common.h.e(hVar) || !androidx.media3.common.h.e(hVar2)) && !Objects.equals(hVar, hVar2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !rVar.b(rVar2)) {
                i2 |= 2;
            }
            int i3 = rVar.x;
            if (i3 != -1 && (i = rVar.y) != -1 && i3 == rVar2.x && i == rVar2.y && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(rVar2.o, "video/dolby-vision")) {
                Pair pairB = androidx.media3.common.util.f.b(rVar);
                Pair pairB2 = androidx.media3.common.util.f.b(rVar2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new androidx.media3.exoplayer.d(this.a, rVar, rVar2, rVar.b(rVar2) ? 3 : 2, 0);
            }
            rVar3 = rVar;
            rVar4 = rVar2;
        } else {
            rVar3 = rVar;
            rVar4 = rVar2;
            if (rVar3.G != rVar4.G) {
                i2 |= 4096;
            }
            if (rVar3.H != rVar4.H) {
                i2 |= 8192;
            }
            if (rVar3.I != rVar4.I) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairB3 = androidx.media3.common.util.f.b(rVar3);
                Pair pairB4 = androidx.media3.common.util.f.b(rVar4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new androidx.media3.exoplayer.d(this.a, rVar3, rVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new androidx.media3.exoplayer.d(this.a, rVar3, rVar4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new androidx.media3.exoplayer.d(this.a, rVar3, rVar4, 3, 0);
            }
            if (!rVar3.b(rVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new androidx.media3.exoplayer.d(this.a, rVar3, rVar4, 1, 0);
            }
        }
        return new androidx.media3.exoplayer.d(this.a, rVar3, rVar4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[PHI: r2
  0x00c0: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v14 android.util.Pair) binds: [B:3:0x000e, B:5:0x0016, B:10:0x002a, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean c(Context context, androidx.media3.common.r rVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pair;
        String strA;
        Pair pairB = androidx.media3.common.util.f.b(rVar);
        String str = rVar.o;
        String str2 = this.c;
        if (str != null && str.equals("video/mv-hevc")) {
            String strP = i0.p(str2);
            if (strP.equals("video/mv-hevc")) {
                return true;
            }
            if (strP.equals("video/hevc")) {
                HashMap map = v.a;
                List list = rVar.r;
                int i = 0;
                loop0: while (true) {
                    if (i >= list.size()) {
                        pair = null;
                        strA = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        d0 d0VarK = h0.k();
                        int i2 = 0;
                        while (i2 < bArr.length) {
                            int iC = androidx.media3.container.r.c(bArr, i2, bArr.length, zArr);
                            if (iC != bArr.length) {
                                d0VarK.b(Integer.valueOf(iC));
                            }
                            i2 = iC + 3;
                        }
                        a1 a1VarG = d0VarK.g();
                        for (int i3 = 0; i3 < a1VarG.A; i3++) {
                            if (((Integer) a1VarG.get(i3)).intValue() + 3 < length) {
                                androidx.media3.container.v vVar = new androidx.media3.container.v(bArr, ((Integer) a1VarG.get(i3)).intValue() + 3, length);
                                androidx.media3.container.j jVarH = androidx.media3.container.r.h(vVar);
                                if (jVarH.a == 33 && jVarH.b == 0) {
                                    vVar.j(4);
                                    int iE = vVar.e(3);
                                    vVar.i();
                                    pair = null;
                                    androidx.media3.container.k kVarI = androidx.media3.container.r.i(vVar, true, iE, null);
                                    strA = androidx.media3.common.util.f.a(kVarI.a, kVarI.b, kVarI.c, kVarI.d, kVarI.e, kVarI.f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i++;
                }
                if (strA == null) {
                    pairB = pair;
                } else {
                    String strTrim = strA.trim();
                    String str3 = j0.a;
                    pairB = androidx.media3.common.util.f.c(strA, strTrim.split("\\.", -1), rVar.E);
                }
            }
        }
        if (pairB == null) {
            return true;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.b;
        if (zEquals) {
            str4.getClass();
            switch (str4) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.i && !str4.equals("audio/ac4") && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
            int i4 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
            codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{v.b(1026, i4)} : new MediaCodecInfo.CodecProfileLevel[]{v.b(257, i4), v.b(513, i4), v.b(514, i4), v.b(1026, i4), v.b(1028, i4)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == iIntValue && (codecProfileLevel.level >= iIntValue2 || !z)) {
                if (!"video/hevc".equals(str4) || 2 != iIntValue) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        h("codec.profileLevel, " + rVar.k + ", " + str2);
        return false;
    }

    public final boolean d(androidx.media3.common.r rVar) {
        return (Objects.equals(rVar.o, "audio/flac") && rVar.I == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, androidx.media3.common.r rVar) {
        int i;
        int i2;
        String str = rVar.o;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(v.c(rVar))) || !c(context, rVar, true) || !d(rVar)) {
            return false;
        }
        if (this.i) {
            int i3 = rVar.v;
            if (i3 > 0 && (i2 = rVar.w) > 0) {
                return g(i3, i2, rVar.z);
            }
        } else {
            int i4 = rVar.H;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    h("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = rVar.G;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    androidx.media3.common.util.c.t("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    h("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(androidx.media3.common.r rVar) {
        if (this.i) {
            return this.e;
        }
        Pair pairB = androidx.media3.common.util.f.b(rVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    public final boolean g(int i, int i2, double d) {
        String str;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int iB = (i3 < 29 || ((bool = android.support.v4.media.session.b.l) != null && bool.booleanValue())) ? 0 : androidx.compose.ui.platform.coreshims.b.b(videoCapabilities, i, i2, d);
            if (iB != 2) {
                if (iB == 1) {
                    StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("sizeAndRate.cover, ", "x", i, "@", i2);
                    sbW.append(d);
                    h(sbW.toString());
                    return false;
                }
                if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbW2 = androidx.privacysandbox.ads.adservices.java.internal.a.w("sizeAndRate.rotated, ", "x", i, "@", i2);
                            sbW2.append(d);
                            StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("AssumedSupport [", sbW2.toString(), "] [", str, ", ");
                            sbO.append(this.b);
                            sbO.append("] [");
                            sbO.append(j0.a);
                            sbO.append("]");
                            androidx.media3.common.util.c.e("MediaCodecInfo", sbO.toString());
                            return true;
                        }
                        StringBuilder sbW3 = androidx.privacysandbox.ads.adservices.java.internal.a.w("sizeAndRate.rotated, ", "x", i, "@", i2);
                        sbW3.append(d);
                        StringBuilder sbO2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("AssumedSupport [", sbW3.toString(), "] [", str, ", ");
                        sbO2.append(this.b);
                        sbO2.append("] [");
                        sbO2.append(j0.a);
                        sbO2.append("]");
                        androidx.media3.common.util.c.e("MediaCodecInfo", sbO2.toString());
                        return true;
                    }
                    StringBuilder sbW4 = androidx.privacysandbox.ads.adservices.java.internal.a.w("sizeAndRate.support, ", "x", i, "@", i2);
                    sbW4.append(d);
                    h(sbW4.toString());
                    return false;
                }
            }
        } else if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder sbW5 = androidx.privacysandbox.ads.adservices.java.internal.a.w("sizeAndRate.rotated, ", "x", i, "@", i2);
                    sbW5.append(d);
                    StringBuilder sbO3 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("AssumedSupport [", sbW5.toString(), "] [", str, ", ");
                    sbO3.append(this.b);
                    sbO3.append("] [");
                    sbO3.append(j0.a);
                    sbO3.append("]");
                    androidx.media3.common.util.c.e("MediaCodecInfo", sbO3.toString());
                    return true;
                }
            }
            StringBuilder sbW6 = androidx.privacysandbox.ads.adservices.java.internal.a.w("sizeAndRate.support, ", "x", i, "@", i2);
            sbW6.append(d);
            h(sbW6.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("NoSupport [", str, "] [");
        sbX.append(this.a);
        sbX.append(", ");
        sbX.append(this.b);
        sbX.append("] [");
        sbX.append(j0.a);
        sbX.append("]");
        androidx.media3.common.util.c.e("MediaCodecInfo", sbX.toString());
    }

    public final String toString() {
        return this.a;
    }
}
