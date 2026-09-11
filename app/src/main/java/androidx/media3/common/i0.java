package androidx.media3.common;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        androidx.core.view.r rVarG;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "application/vnd.dvb.ait":
            case "application/x-icy":
            case "application/x-camera-motion":
            case "application/id3":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "application/meta":
            case "audio/ac3":
            case "audio/raw":
            case "application/x-media3-cues":
            case "application/x-itut-t35":
            case "application/x-emsg":
            case "video/apv":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "application/x-scte35":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (rVarG = g(str2)) == null || (iA = rVarG.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : androidx.media3.common.util.j0.b0(str)) {
            String strE = e(str2);
            if (strE != null && k(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrB0 = androidx.media3.common.util.j0.b0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrB0) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        androidx.core.view.r rVarG;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (rVarG = g(str2)) == null) {
                    return 0;
                }
                return rVarG.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        androidx.core.view.r rVarG;
        String strF = null;
        if (str != null) {
            String strW = com.google.common.base.b.w(str.trim());
            if (strW.startsWith("avc1") || strW.startsWith("avc3")) {
                return "video/avc";
            }
            if (strW.startsWith("hev1") || strW.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strW.startsWith("vvc1") || strW.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (strW.startsWith("dvav") || strW.startsWith("dva1") || strW.startsWith("dvhe") || strW.startsWith("dvh1") || strW.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (strW.startsWith("av01")) {
                return "video/av01";
            }
            if (strW.startsWith("vp9") || strW.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strW.startsWith("vp8") || strW.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strW.startsWith("mp4a")) {
                if (strW.startsWith("mp4a.") && (rVarG = g(strW)) != null) {
                    strF = f(rVarG.a);
                }
                return strF == null ? "audio/mp4a-latm" : strF;
            }
            if (strW.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strW.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strW.startsWith("ac-3") || strW.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strW.startsWith("ec-3") || strW.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strW.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strW.startsWith("ac-4") || strW.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strW.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strW.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strW.startsWith("dtsh") || strW.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strW.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strW.startsWith("opus")) {
                return "audio/opus";
            }
            if (strW.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strW.startsWith("flac")) {
                return "audio/flac";
            }
            if (strW.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strW.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strW.contains("cea708")) {
                return "application/cea-708";
            }
            if (strW.contains("eia608") || strW.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                androidx.transition.k.i();
                return null;
            }
        }
        return null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case Token.LP /* 96 */:
            case Token.RP /* 97 */:
            case Token.COMMA /* 98 */:
            case 99:
            case 100:
            case Token.ASSIGN_LOGICAL_OR /* 101 */:
                return "video/mpeg2";
            case Token.ASSIGN_BITXOR /* 102 */:
            case Token.ASSIGN_BITAND /* 103 */:
            case Token.ASSIGN_LOGICAL_AND /* 104 */:
                return "audio/mp4a-latm";
            case Token.ASSIGN_LSH /* 105 */:
            case Token.ASSIGN_URSH /* 107 */:
                return "audio/mpeg";
            case Token.ASSIGN_RSH /* 106 */:
                return "video/mpeg";
            case Token.ASSIGN_ADD /* 108 */:
                return "image/jpeg";
            default:
                switch (i) {
                    case Token.SETCONST /* 169 */:
                    case Token.LETEXPR /* 172 */:
                        return "audio/vnd.dts";
                    case 170:
                    case Token.ARRAYCOMP /* 171 */:
                        return "audio/vnd.dts.hd";
                    case Token.WITHEXPR /* 173 */:
                        return "audio/opus";
                    case Token.DEBUGGER /* 174 */:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static androidx.core.view.r g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new androidx.core.view.r(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (o(str)) {
            return 2;
        }
        if (n(str)) {
            return 3;
        }
        if (m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        androidx.transition.k.i();
        return 0;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : androidx.media3.common.util.j0.b0(str)) {
            String strE = e(str2);
            if (strE != null && o(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean m(String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean n(String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean o(String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        String strW = com.google.common.base.b.w(str);
        strW.getClass();
        switch (strW) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strW;
        }
    }
}
