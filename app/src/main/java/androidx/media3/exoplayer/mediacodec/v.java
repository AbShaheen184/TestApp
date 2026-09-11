package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import androidx.compose.ui.semantics.y;
import androidx.media3.common.i0;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false));
            }
            Collections.sort(arrayList, new y(new i(), 1));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(androidx.media3.common.r rVar) {
        Pair pairB;
        String str = rVar.o;
        String str2 = rVar.o;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = androidx.media3.common.util.f.b(rVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                androidx.media3.common.h hVar = rVar.E;
                if (hVar != null && hVar.c == 6 && hVar.b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            s sVar = new s(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(sVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(sVar, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListF.isEmpty();
            }
            a(str, arrayListF);
            h0 h0VarO = h0.o(arrayListF);
            map.put(sVar, h0VarO);
            return h0VarO;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    public static ArrayList f(s sVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar) throws t {
        String strD;
        String str;
        int i;
        s sVar2 = sVar;
        int i2 = lVar.y;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = sVar2.a;
            boolean z = sVar2.b;
            if (((MediaCodecInfo[]) lVar.z) == null) {
                lVar.z = new MediaCodecList(i2).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) lVar.z).length;
            int i3 = 0;
            while (i3 < length) {
                if (((MediaCodecInfo[]) lVar.z) == null) {
                    lVar.z = new MediaCodecList(i2).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) lVar.z)[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfo.isAlias()) {
                    int i5 = i3;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder() || (strD = d(mediaCodecInfo, name, str2)) == null) {
                        i = i5;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strD);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = sVar2.c;
                            if ((z2 || !zIsFeatureRequired) && (!z2 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z || !zIsFeatureRequired2) && (!z || zIsFeatureSupported2)) {
                                    boolean zIsVendor = true;
                                    boolean zIsHardwareAccelerated = i4 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !h(mediaCodecInfo, str2);
                                    i = i5;
                                    boolean zH = h(mediaCodecInfo, str2);
                                    boolean z3 = zIsHardwareAccelerated;
                                    if (i4 >= 29) {
                                        zIsVendor = mediaCodecInfo.isVendor();
                                    } else {
                                        String strW = com.google.common.base.b.w(mediaCodecInfo.getName());
                                        if (strW.startsWith("omx.google.") || strW.startsWith("c2.android.") || strW.startsWith("c2.google.")) {
                                            zIsVendor = false;
                                        }
                                    }
                                    if (z != zIsFeatureSupported2) {
                                        continue;
                                    } else {
                                        str = strD;
                                        try {
                                            arrayList.add(o.i(name, str2, str, capabilitiesForType, z3, zH, zIsVendor));
                                        } catch (Exception e) {
                                            e = e;
                                            androidx.media3.common.util.c.f("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i = i5;
                                }
                            } else {
                                i = i5;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = strD;
                        }
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
                sVar2 = sVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new t("Failed to query underlying media codecs", e3);
        }
    }

    public static a1 g(i iVar, androidx.media3.common.r rVar, boolean z, boolean z2) {
        List listB = iVar.b(rVar.o, z, z2);
        String strC = c(rVar);
        List listB2 = strC == null ? a1.B : iVar.b(strC, z, z2);
        d0 d0VarK = h0.k();
        d0VarK.c(listB);
        d0VarK.c(listB2);
        return d0VarK.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (i0.k(str)) {
            return true;
        }
        String strW = com.google.common.base.b.w(mediaCodecInfo.getName());
        if (strW.startsWith("arc.")) {
            return false;
        }
        if (strW.startsWith("omx.google.") || strW.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strW.startsWith("omx.sec.") && strW.contains(".sw.")) || strW.equals("omx.qcom.video.decoder.hevcswvdec") || strW.startsWith("c2.android.") || strW.startsWith("c2.google.")) {
            return true;
        }
        return (strW.startsWith("omx.") || strW.startsWith("c2.")) ? false : true;
    }
}
