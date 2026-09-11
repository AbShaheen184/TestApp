package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.appcompat.widget.c2;
import androidx.media3.common.h0;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements androidx.media3.exoplayer.upstream.p {
    public final q e;
    public final n y;
    public static final Pattern z = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern A = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern B = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern C = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern D = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern E = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern G = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern H = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern I = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern J = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern K = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern P = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern R = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern S = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern T = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern U = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern V = a("CAN-SKIP-DATERANGES");
    public static final Pattern W = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern X = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern Y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern Z = a("CAN-BLOCK-RELOAD");
    public static final Pattern a0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern b0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern c0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern d0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern e0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern f0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern g0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern h0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern i0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern j0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern k0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern l0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern o0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern p0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern q0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern r0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern x0 = a("AUTOSELECT");
    public static final Pattern y0 = a("DEFAULT");
    public static final Pattern z0 = a("FORCED");
    public static final Pattern A0 = a("INDEPENDENT");
    public static final Pattern B0 = a("GAP");
    public static final Pattern C0 = a("PRECISE");
    public static final Pattern D0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern J0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern K0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern L0 = a("END-ON-NEXT");
    public static final Pattern M0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern O0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern P0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern Q0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern S0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern U0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern V0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern W0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern X0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern Y0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern Z0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public t(q qVar, n nVar) {
        this.e = qVar;
        this.y = nVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static androidx.media3.common.m b(String str, androidx.media3.common.l[] lVarArr) {
        androidx.media3.common.l[] lVarArr2 = new androidx.media3.common.l[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            androidx.media3.common.l lVar = lVarArr[i];
            lVarArr2[i] = new androidx.media3.common.l(lVar.y, lVar.z, lVar.A, null);
        }
        return new androidx.media3.common.m(str, true, lVarArr2);
    }

    public static androidx.media3.common.l c(String str, String str2, HashMap map, androidx.media3.exoplayer.hls.e eVar) throws j0 {
        String strI = i(str, m0, "1", map, eVar);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = n0;
        if (zEquals) {
            String strK = k(str, pattern, map, eVar);
            return new androidx.media3.common.l(androidx.media3.common.g.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = androidx.media3.common.g.d;
            String str3 = androidx.media3.common.util.j0.a;
            return new androidx.media3.common.l(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strK2 = k(str, pattern, map, eVar);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = androidx.media3.common.g.e;
        return new androidx.media3.common.l(uuid2, null, "video/mp4", androidx.media3.extractor.mp4.q.a(uuid2, null, bArrDecode));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 47961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static androidx.media3.exoplayer.hls.playlist.n d(androidx.media3.exoplayer.hls.playlist.q r140, androidx.media3.exoplayer.hls.playlist.n r141, androidx.appcompat.widget.c2 r142, android.net.Uri r143, androidx.media3.exoplayer.hls.e r144) {
        /*
            Method dump skipped, instruction units count: 4796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.t.d(androidx.media3.exoplayer.hls.playlist.q, androidx.media3.exoplayer.hls.playlist.n, androidx.appcompat.widget.c2, android.net.Uri, androidx.media3.exoplayer.hls.e):androidx.media3.exoplayer.hls.playlist.n");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0256  */
    /* JADX WARN: Code duplicated, block: B:102:0x025c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0260  */
    /* JADX WARN: Code duplicated, block: B:107:0x026a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0287  */
    /* JADX WARN: Code duplicated, block: B:114:0x028e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0299  */
    /* JADX WARN: Code duplicated, block: B:118:0x029e  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:128:0x032a  */
    /* JADX WARN: Code duplicated, block: B:178:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:272:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x020a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0216  */
    /* JADX WARN: Code duplicated, block: B:90:0x0220  */
    /* JADX WARN: Code duplicated, block: B:92:0x0233  */
    /* JADX WARN: Code duplicated, block: B:94:0x0239  */
    /* JADX WARN: Code duplicated, block: B:99:0x0250  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [int] */
    /* JADX WARN: Type inference failed for: r5v74 */
    public static q e(c2 c2Var, Uri uri, androidx.media3.exoplayer.hls.e eVar) throws IOException {
        ?? r28;
        int i;
        ArrayList arrayList;
        p pVar;
        String strE;
        int i2;
        String str;
        p pVar2;
        String strE2;
        p pVar3;
        int i3;
        int i4;
        String str2;
        String str3;
        String strW;
        androidx.media3.common.h hVar;
        String strI;
        int i5;
        int i6;
        String strI2;
        float f;
        Uri uriR;
        Uri uri2;
        ArrayList arrayList2;
        int i7;
        int i8;
        int i9;
        androidx.media3.common.h hVarX;
        String[] strArrB0;
        StringBuilder sb;
        int length;
        int i10;
        androidx.media3.common.h hVar2;
        String str4;
        String string;
        String string2 = uri.toString();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean zL = c2Var.L();
            Pattern pattern = n0;
            ArrayList arrayList11 = arrayList7;
            boolean zContains = z2;
            Pattern pattern2 = s0;
            boolean z4 = z3;
            if (!zL) {
                ArrayList arrayList12 = arrayList8;
                ArrayList arrayList13 = arrayList10;
                ArrayList arrayList14 = arrayList4;
                ArrayList arrayList15 = arrayList5;
                ArrayList arrayList16 = arrayList6;
                ArrayList arrayList17 = arrayList9;
                ArrayList arrayList18 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    p pVar4 = (p) arrayList3.get(i11);
                    Uri uri3 = pVar4.a;
                    androidx.media3.common.r rVar = pVar4.b;
                    if (hashSet.add(uri3)) {
                        com.google.android.material.motion.a.q(rVar.l == null);
                        ArrayList arrayList19 = (ArrayList) map.get(pVar4.a);
                        arrayList19.getClass();
                        h0 h0Var = new h0(new androidx.media3.exoplayer.hls.t(null, null, arrayList19));
                        androidx.media3.common.q qVarA = rVar.a();
                        qVarA.k = h0Var;
                        arrayList18.add(new p(pVar4.a, new androidx.media3.common.r(qVarA), pVar4.c, pVar4.d, pVar4.e, pVar4.f, pVar4.g, pVar4.h));
                    }
                    i11++;
                    hashSet = hashSet;
                    map = map;
                }
                int i12 = 0;
                ArrayList arrayList20 = null;
                androidx.media3.common.r rVar2 = null;
                while (i12 < arrayList12.size()) {
                    ArrayList arrayList21 = arrayList12;
                    String str5 = (String) arrayList21.get(i12);
                    String strK = k(str5, u0, map2, eVar);
                    String strK2 = k(str5, pattern2, map2, eVar);
                    ArrayList arrayList22 = arrayList20;
                    ArrayList arrayList23 = arrayList18;
                    String strI3 = i(str5, N, null, map2, eVar);
                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                    androidx.media3.common.r rVar3 = rVar2;
                    qVar.a = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strK, ":", strK2);
                    qVar.b = strK2;
                    qVar.m = i0.p("application/x-mpegURL");
                    boolean zF = f(eVar, str5, y0);
                    if (f(eVar, str5, z0)) {
                        r28 = zF;
                        r28 = (zF ? 1 : 0) | 2;
                    }
                    r28 = zF;
                    qVar.e = f(eVar, str5, x0) ? r28 | 4 : r28;
                    int i13 = i12;
                    String strI4 = i(str5, v0, null, map2, eVar);
                    if (TextUtils.isEmpty(strI4)) {
                        arrayList12 = arrayList21;
                        i = 0;
                    } else {
                        String str6 = androidx.media3.common.util.j0.a;
                        String[] strArrSplit = strI4.split(",", -1);
                        i = androidx.media3.common.util.j0.m("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        arrayList12 = arrayList21;
                        if (androidx.media3.common.util.j0.m("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i |= 4096;
                        }
                        if (androidx.media3.common.util.j0.m("public.accessibility.describes-music-and-sound", strArrSplit)) {
                            i |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        if (androidx.media3.common.util.j0.m("public.easy-to-read", strArrSplit)) {
                            i |= 8192;
                        }
                    }
                    qVar.f = i;
                    qVar.d = i(str5, r0, null, map2, eVar);
                    String strI5 = i(str5, pattern, null, map2, eVar);
                    Uri uriR2 = strI5 == null ? null : androidx.media3.common.util.c.r(string2, strI5);
                    String str7 = string2;
                    Pattern pattern3 = pattern;
                    h0 h0Var2 = new h0(new androidx.media3.exoplayer.hls.t(strK, strK2, Collections.EMPTY_LIST));
                    switch (k(str5, p0, map2, eVar)) {
                        case "SUBTITLES":
                            arrayList = arrayList14;
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList3.size()) {
                                    pVar = (p) arrayList3.get(i14);
                                    if (!strK.equals(pVar.e)) {
                                        i14++;
                                    }
                                } else {
                                    pVar = null;
                                }
                            }
                            if (pVar != null) {
                                String strW2 = androidx.media3.common.util.j0.w(3, pVar.b.k);
                                qVar.j = strW2;
                                strE = i0.e(strW2);
                            } else {
                                strE = null;
                            }
                            if (strE == null) {
                                strE = "text/vtt";
                            }
                            qVar.n = i0.p(strE);
                            qVar.k = h0Var2;
                            if (uriR2 != null) {
                                arrayList16 = arrayList16;
                                arrayList16.add(new o(uriR2, new androidx.media3.common.r(qVar), strK2, strI3));
                            } else {
                                arrayList16 = arrayList16;
                                androidx.media3.common.util.c.t("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList20 = arrayList22;
                            rVar2 = rVar3;
                            break;
                        case "CLOSED-CAPTIONS":
                            ArrayList arrayList24 = arrayList15;
                            arrayList = arrayList14;
                            String strK3 = k(str5, w0, map2, eVar);
                            if (strK3.startsWith("CC")) {
                                i2 = Integer.parseInt(strK3.substring(2));
                                str = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strK3.substring(7));
                                str = "application/cea-708";
                            }
                            ArrayList arrayList25 = arrayList22 == null ? new ArrayList() : arrayList22;
                            qVar.n = i0.p(str);
                            qVar.K = i2;
                            arrayList25.add(new androidx.media3.common.r(qVar));
                            arrayList15 = arrayList24;
                            arrayList20 = arrayList25;
                            arrayList16 = arrayList16;
                            rVar2 = rVar3;
                            break;
                        case "AUDIO":
                            arrayList = arrayList14;
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList3.size()) {
                                    pVar2 = (p) arrayList3.get(i15);
                                    int i16 = i15;
                                    if (!strK.equals(pVar2.d)) {
                                        i15 = i16 + 1;
                                    }
                                } else {
                                    pVar2 = null;
                                }
                            }
                            if (pVar2 != null) {
                                String strW3 = androidx.media3.common.util.j0.w(1, pVar2.b.k);
                                qVar.j = strW3;
                                strE2 = i0.e(strW3);
                            } else {
                                strE2 = null;
                            }
                            p pVar5 = pVar2;
                            String strI6 = i(str5, F, null, map2, eVar);
                            if (strI6 != null) {
                                String str8 = androidx.media3.common.util.j0.a;
                                qVar.F = Integer.parseInt(strI6.split("/", 2)[0]);
                                if ("audio/eac3".equals(strE2) && strI6.endsWith("/JOC")) {
                                    qVar.j = "ec+3";
                                    strE2 = "audio/eac3-joc";
                                }
                            }
                            qVar.n = i0.p(strE2);
                            if (uriR2 == null) {
                                ArrayList arrayList26 = arrayList15;
                                if (pVar5 != null) {
                                    rVar2 = new androidx.media3.common.r(qVar);
                                    arrayList15 = arrayList26;
                                    arrayList16 = arrayList16;
                                    arrayList20 = arrayList22;
                                } else {
                                    arrayList15 = arrayList26;
                                }
                                break;
                            } else {
                                qVar.k = h0Var2;
                                arrayList15.add(new o(uriR2, new androidx.media3.common.r(qVar), strK2, strI3));
                            }
                            arrayList20 = arrayList22;
                            rVar2 = rVar3;
                            break;
                        case "VIDEO":
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList3.size()) {
                                    pVar3 = (p) arrayList3.get(i17);
                                    if (!strK.equals(pVar3.c)) {
                                        i17++;
                                    }
                                } else {
                                    pVar3 = null;
                                }
                            }
                            if (pVar3 != null) {
                                androidx.media3.common.r rVar4 = pVar3.b;
                                String strW4 = androidx.media3.common.util.j0.w(2, rVar4.k);
                                qVar.j = strW4;
                                qVar.n = i0.p(i0.e(strW4));
                                qVar.u = rVar4.v;
                                qVar.v = rVar4.w;
                                qVar.y = rVar4.z;
                            }
                            if (uriR2 != null) {
                                qVar.k = h0Var2;
                                arrayList = arrayList14;
                                arrayList.add(new o(uriR2, new androidx.media3.common.r(qVar), strK2, strI3));
                            }
                            arrayList20 = arrayList22;
                            rVar2 = rVar3;
                        default:
                            arrayList = arrayList14;
                            arrayList20 = arrayList22;
                            rVar2 = rVar3;
                            break;
                    }
                    i12 = i13 + 1;
                    arrayList14 = arrayList;
                    arrayList16 = arrayList16;
                    arrayList18 = arrayList23;
                    string2 = str7;
                    pattern = pattern3;
                }
                return new q(uri.toString(), arrayList13, arrayList18, arrayList14, arrayList15, arrayList16, arrayList11, rVar2, zContains ? Collections.EMPTY_LIST : arrayList20, z4, map2, arrayList17);
            }
            String strR = c2Var.R();
            ArrayList arrayList27 = arrayList6;
            if (strR.startsWith("#EXT")) {
                arrayList10.add(strR);
            }
            boolean zStartsWith = strR.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList28 = arrayList10;
            if (strR.startsWith("#EXT-X-DEFINE")) {
                String strI7 = i(strR, pattern2, null, map2, eVar);
                if (strI7 != null) {
                    m(strI7, map2);
                    map2.put(strI7, k(strR, D0, map2, eVar));
                } else {
                    String strK4 = k(strR, t0, map2, eVar);
                    m(strK4, map2);
                    String queryParameter = uri.getQueryParameter(strK4);
                    if (queryParameter == null) {
                        throw j0.b(null, "QUERYPARAM \"" + strK4 + "\" not found in playlist URI");
                    }
                    map2.put(strK4, queryParameter);
                }
            } else {
                if (strR.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList8 = arrayList8;
                    arrayList4 = arrayList4;
                    arrayList5 = arrayList5;
                    arrayList9 = arrayList9;
                    z2 = zContains;
                    z3 = true;
                } else if (strR.startsWith("#EXT-X-MEDIA")) {
                    arrayList8.add(strR);
                } else if (strR.startsWith("#EXT-X-SESSION-KEY")) {
                    androidx.media3.common.l lVarC = c(strR, i(strR, l0, "identity", map2, eVar), map2, eVar);
                    if (lVarC != null) {
                        String strK5 = k(strR, k0, map2, eVar);
                        arrayList9.add(new androidx.media3.common.m(("SAMPLE-AES-CENC".equals(strK5) || "SAMPLE-AES-CTR".equals(strK5)) ? "cenc" : "cbcs", true, lVarC));
                    }
                } else {
                    if (strR.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        zContains |= strR.contains("CLOSED-CAPTIONS=NONE");
                        int i18 = zStartsWith ? 16384 : 0;
                        int i19 = Integer.parseInt(k(strR, E, Collections.EMPTY_MAP, eVar));
                        Matcher matcherA = androidx.media3.exoplayer.hls.e.a(eVar, strR, z);
                        if (matcherA.find()) {
                            String strGroup = matcherA.group(1);
                            strGroup.getClass();
                            i3 = Integer.parseInt(strGroup);
                        } else {
                            i3 = -1;
                        }
                        String strI8 = i(strR, G, null, map2, eVar);
                        String strI9 = i(strR, H, null, map2, eVar);
                        String strI10 = i(strR, I, null, map2, eVar);
                        if (strI10 != null) {
                            String str9 = androidx.media3.common.util.j0.a;
                            String[] strArrSplit2 = strI10.split(",", 2)[0].split("/", -1);
                            str2 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str3 = strArrSplit2[1];
                                map = map;
                                i4 = 2;
                            } else {
                                i4 = 2;
                            }
                            strW = androidx.media3.common.util.j0.w(i4, strI9);
                            if (!i0.l(strW, str2) && (str2 == null || !(strI8 == null || str3 == null || ((strI8.equals("PQ") && !str3.equals("db1p")) || ((strI8.equals("SDR") && !str3.equals("db2g")) || (strI8.equals("HLG") && !str3.startsWith("db4"))))))) {
                                hVarX = androidx.media3.common.util.j0.x(strI9, str2, str3);
                                if (str2 == null) {
                                    str2 = strW;
                                }
                                strArrB0 = androidx.media3.common.util.j0.b0(strI9);
                                if (strArrB0.length == 0) {
                                    hVar2 = hVarX;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrB0.length;
                                    i10 = 0;
                                    while (i10 < length) {
                                        String[] strArr = strArrB0;
                                        str4 = strArr[i10];
                                        androidx.media3.common.h hVar3 = hVarX;
                                        int i20 = length;
                                        if (2 == i0.i(i0.e(str4))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str4);
                                        }
                                        i10++;
                                        strArrB0 = strArr;
                                        length = i20;
                                        hVarX = hVar3;
                                    }
                                    hVar2 = hVarX;
                                    string = sb.length() > 0 ? sb.toString() : null;
                                    if (string != null) {
                                        strI9 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str2, ",", string);
                                    } else {
                                        strI9 = str2;
                                    }
                                    hVar = hVar2;
                                }
                                if (string != null) {
                                    strI9 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str2, ",", string);
                                } else {
                                    strI9 = str2;
                                }
                                hVar = hVar2;
                            } else {
                                hVar = null;
                            }
                            strI = i(strR, J, null, map2, eVar);
                            if (strI != null) {
                                String[] strArrSplit3 = strI.split("x", -1);
                                i7 = Integer.parseInt(strArrSplit3[0]);
                                i8 = Integer.parseInt(strArrSplit3[1]);
                                if (i7 > 0 || i8 <= 0) {
                                    i8 = -1;
                                    i9 = -1;
                                } else {
                                    i9 = i7;
                                }
                                i6 = i8;
                                i5 = i9;
                            } else {
                                i5 = -1;
                                i6 = -1;
                            }
                            strI2 = i(strR, K, null, map2, eVar);
                            if (strI2 != null) {
                                f = Float.parseFloat(strI2);
                            } else {
                                f = -1.0f;
                            }
                            String strI11 = i(strR, L, null, map2, eVar);
                            String strI12 = i(strR, A, null, map2, eVar);
                            String strI13 = i(strR, B, null, map2, eVar);
                            String strI14 = i(strR, C, null, map2, eVar);
                            String strI15 = i(strR, D, null, map2, eVar);
                            String strI16 = i(strR, M, null, map2, eVar);
                            if (zStartsWith) {
                                uriR = androidx.media3.common.util.c.r(string2, k(strR, pattern, map2, eVar));
                            } else {
                                if (c2Var.L()) {
                                    throw j0.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriR = androidx.media3.common.util.c.r(string2, l(c2Var.R(), map2, eVar));
                            }
                            uri2 = uriR;
                            androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                            qVar2.a = Integer.toString(arrayList3.size());
                            qVar2.m = i0.p("application/x-mpegURL");
                            qVar2.j = strI9;
                            qVar2.h = i3;
                            qVar2.i = i19;
                            qVar2.u = i5;
                            qVar2.v = i6;
                            qVar2.y = f;
                            qVar2.f = i18;
                            qVar2.D = hVar;
                            arrayList3.add(new p(uri2, new androidx.media3.common.r(qVar2), strI12, strI13, strI14, strI15, strI11, strI16));
                            map = map;
                            arrayList2 = (ArrayList) map.get(uri2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                map.put(uri2, arrayList2);
                            }
                            arrayList2.add(new androidx.media3.exoplayer.hls.s(strI12, strI13, strI14, i3, strI15, i19));
                        } else {
                            i4 = 2;
                            str2 = null;
                        }
                        str3 = null;
                        strW = androidx.media3.common.util.j0.w(i4, strI9);
                        if (i0.l(strW, str2)) {
                            hVar = null;
                        } else {
                            hVarX = androidx.media3.common.util.j0.x(strI9, str2, str3);
                            if (str2 == null) {
                                str2 = strW;
                            }
                            strArrB0 = androidx.media3.common.util.j0.b0(strI9);
                            if (strArrB0.length == 0) {
                                hVar2 = hVarX;
                            } else {
                                sb = new StringBuilder();
                                length = strArrB0.length;
                                i10 = 0;
                                while (i10 < length) {
                                    String[] strArr2 = strArrB0;
                                    str4 = strArr2[i10];
                                    androidx.media3.common.h hVar4 = hVarX;
                                    int i21 = length;
                                    if (2 == i0.i(i0.e(str4))) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(str4);
                                    }
                                    i10++;
                                    strArrB0 = strArr2;
                                    length = i21;
                                    hVarX = hVar4;
                                }
                                hVar2 = hVarX;
                                if (sb.length() > 0) {
                                }
                                if (string != null) {
                                    strI9 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str2, ",", string);
                                } else {
                                    strI9 = str2;
                                }
                                hVar = hVar2;
                            }
                            if (string != null) {
                                strI9 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str2, ",", string);
                            } else {
                                strI9 = str2;
                            }
                            hVar = hVar2;
                        }
                        strI = i(strR, J, null, map2, eVar);
                        if (strI != null) {
                            String[] strArrSplit4 = strI.split("x", -1);
                            i7 = Integer.parseInt(strArrSplit4[0]);
                            i8 = Integer.parseInt(strArrSplit4[1]);
                            if (i7 > 0) {
                                i8 = -1;
                                i9 = -1;
                            } else {
                                i8 = -1;
                                i9 = -1;
                            }
                            i6 = i8;
                            i5 = i9;
                        } else {
                            i5 = -1;
                            i6 = -1;
                        }
                        strI2 = i(strR, K, null, map2, eVar);
                        if (strI2 != null) {
                            f = Float.parseFloat(strI2);
                        } else {
                            f = -1.0f;
                        }
                        String strI17 = i(strR, L, null, map2, eVar);
                        String strI18 = i(strR, A, null, map2, eVar);
                        String strI19 = i(strR, B, null, map2, eVar);
                        String strI110 = i(strR, C, null, map2, eVar);
                        String strI111 = i(strR, D, null, map2, eVar);
                        String strI112 = i(strR, M, null, map2, eVar);
                        if (zStartsWith) {
                            uriR = androidx.media3.common.util.c.r(string2, k(strR, pattern, map2, eVar));
                        } else {
                            if (c2Var.L()) {
                                throw j0.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriR = androidx.media3.common.util.c.r(string2, l(c2Var.R(), map2, eVar));
                        }
                        uri2 = uriR;
                        androidx.media3.common.q qVar3 = new androidx.media3.common.q();
                        qVar3.a = Integer.toString(arrayList3.size());
                        qVar3.m = i0.p("application/x-mpegURL");
                        qVar3.j = strI9;
                        qVar3.h = i3;
                        qVar3.i = i19;
                        qVar3.u = i5;
                        qVar3.v = i6;
                        qVar3.y = f;
                        qVar3.f = i18;
                        qVar3.D = hVar;
                        arrayList3.add(new p(uri2, new androidx.media3.common.r(qVar3), strI18, strI19, strI110, strI111, strI17, strI112));
                        map = map;
                        arrayList2 = (ArrayList) map.get(uri2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            map.put(uri2, arrayList2);
                        }
                        arrayList2.add(new androidx.media3.exoplayer.hls.s(strI18, strI19, strI110, i3, strI111, i19));
                    }
                    z2 = zContains;
                    z3 = z4;
                }
                arrayList7 = arrayList11;
                arrayList6 = arrayList27;
                arrayList10 = arrayList28;
                arrayList9 = arrayList9;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                arrayList8 = arrayList8;
            }
            arrayList9 = arrayList9;
            z2 = zContains;
            z3 = z4;
            arrayList7 = arrayList11;
            arrayList6 = arrayList27;
            arrayList10 = arrayList28;
            arrayList9 = arrayList9;
            arrayList5 = arrayList5;
            arrayList4 = arrayList4;
            arrayList8 = arrayList8;
        }
    }

    public static boolean f(androidx.media3.exoplayer.hls.e eVar, String str, Pattern pattern) {
        Matcher matcherA = androidx.media3.exoplayer.hls.e.a(eVar, str, pattern);
        if (matcherA.find()) {
            return "YES".equals(matcherA.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d, androidx.media3.exoplayer.hls.e eVar) {
        Matcher matcherA = androidx.media3.exoplayer.hls.e.a(eVar, str, pattern);
        if (!matcherA.find()) {
            return d;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(androidx.media3.exoplayer.hls.e eVar, String str, Pattern pattern) {
        Matcher matcherA = androidx.media3.exoplayer.hls.e.a(eVar, str, pattern);
        if (!matcherA.find()) {
            return -1L;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map, androidx.media3.exoplayer.hls.e eVar) {
        Matcher matcherA = androidx.media3.exoplayer.hls.e.a(eVar, str, pattern);
        if (matcherA.find()) {
            str2 = matcherA.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map, eVar);
    }

    public static String k(String str, Pattern pattern, Map map, androidx.media3.exoplayer.hls.e eVar) throws j0 {
        String strI = i(str, pattern, null, map, eVar);
        if (strI != null) {
            return strI;
        }
        throw j0.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(String str, Map map, androidx.media3.exoplayer.hls.e eVar) {
        Matcher matcherA = androidx.media3.exoplayer.hls.e.a(eVar, str, Y0);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcherA.find()) {
            String strGroup = matcherA.group(1);
            if (map.containsKey(strGroup)) {
                matcherA.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcherA.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void m(String str, HashMap map) throws j0 {
        if (map.containsKey(str)) {
            throw j0.b(null, "duplicate variable name \"" + str + "\"");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x002b, B:10:0x0034, B:32:0x0074, B:34:0x007a, B:37:0x0085, B:39:0x008d, B:44:0x009f, B:46:0x00a7, B:48:0x00af, B:50:0x00b7, B:52:0x00bf, B:54:0x00c7, B:56:0x00cf, B:58:0x00d7, B:61:0x00e0, B:62:0x00e4, B:67:0x0102, B:68:0x0108, B:13:0x003b, B:15:0x0041, B:19:0x004a, B:22:0x0053, B:24:0x005c, B:26:0x0062, B:28:0x0068, B:29:0x006d), top: B:71:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[Catch: all -> 0x009d, LOOP:2: B:17:0x0047->B:22:0x0053, LOOP_END, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x002b, B:10:0x0034, B:32:0x0074, B:34:0x007a, B:37:0x0085, B:39:0x008d, B:44:0x009f, B:46:0x00a7, B:48:0x00af, B:50:0x00b7, B:52:0x00bf, B:54:0x00c7, B:56:0x00cf, B:58:0x00d7, B:61:0x00e0, B:62:0x00e4, B:67:0x0102, B:68:0x0108, B:13:0x003b, B:15:0x0041, B:19:0x004a, B:22:0x0053, B:24:0x005c, B:26:0x0062, B:28:0x0068, B:29:0x006d), top: B:71:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:90:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0052 A[SYNTHETIC] */
    @Override // androidx.media3.exoplayer.upstream.p
    public final Object j(Uri uri, androidx.media3.datasource.j jVar) throws j0 {
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        androidx.media3.exoplayer.hls.e eVar = new androidx.media3.exoplayer.hls.e(16, 0.75f, true, 1);
        try {
            int i2 = bufferedReader.read();
            boolean zO = false;
            if (i2 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i2 = bufferedReader.read();
                    while (i2 != -1) {
                        i2 = bufferedReader.read();
                    }
                    i = 0;
                    while (true) {
                        if (i < 7) {
                            while (i2 != -1) {
                                i2 = bufferedReader.read();
                            }
                            zO = androidx.media3.common.util.j0.O(i2);
                            break;
                        }
                        if (i2 != "#EXTM3U".charAt(i)) {
                            break;
                            break;
                        }
                        i2 = bufferedReader.read();
                        i++;
                    }
                }
            } else {
                while (i2 != -1 && Character.isWhitespace(i2)) {
                    i2 = bufferedReader.read();
                }
                i = 0;
                while (true) {
                    if (i < 7) {
                        while (i2 != -1 && Character.isWhitespace(i2) && !androidx.media3.common.util.j0.O(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zO = androidx.media3.common.util.j0.O(i2);
                        break;
                    }
                    if (i2 != "#EXTM3U".charAt(i)) {
                        break;
                    }
                    i2 = bufferedReader.read();
                    i++;
                }
            }
            if (!zO) {
                throw j0.b(null, "Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    androidx.media3.common.util.j0.h(bufferedReader);
                    throw j0.b(null, "Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        q qVarE = e(new c2(arrayDeque, bufferedReader), uri, eVar);
                        androidx.media3.common.util.j0.h(bufferedReader);
                        return qVarE;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    n nVarD = d(this.e, this.y, new c2(arrayDeque, bufferedReader), uri, eVar);
                    androidx.media3.common.util.j0.h(bufferedReader);
                    return nVarD;
                }
            }
        } catch (Throwable th) {
            androidx.media3.common.util.j0.h(bufferedReader);
            throw th;
        }
    }
}
