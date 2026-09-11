package androidx.media3.common.util;

import android.app.UiModeManager;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.q0;
import com.app.mlounge.emulator.LibretroCore;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static final String a;
    public static final byte[] b;
    public static final long[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static HashMap h;
    public static final String[] i;
    public static final String[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;

    static {
        int i2 = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        a = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i2, ", ", sb);
        b = new byte[0];
        c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f = Pattern.compile("%([A-Fa-f0-9]{2})");
        g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, Token.ASSIGN_MOD, Token.INC, Token.ELSE, Token.DOT, Token.ASSIGN_ADD, Token.ASSIGN_URSH, 98, Token.ASSIGN_LOGICAL_OR, 72, 79, 70, 65, 84, 83, 90, 93, LibretroCore.SCREEN_HEIGHT, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, Token.LABEL, Token.TYPEOFNAME, Token.COLONCOLON, Token.SETPROP_OP, 140, Token.VOID, 130, Token.BREAK, Token.CONST, Token.COMMENT, Token.SET, Token.XMLATTR, 180, Token.YIELD_STAR, Token.QUESTION_DOT, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, Token.TAGGED_TEMPLATE_LITERAL, Token.GENEXPR, 185, 190, Token.ARRAYCOMP, Token.LETEXPR, Token.GET, Token.XMLEND, Token.BLOCK, Token.WITH, Token.DEFAULT, Token.CONTINUE, Token.EXPR_VOID, Token.EXPR_RESULT, Token.DOTDOT, Token.SETELEM_OP, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, Token.ASSIGN_DIV, Token.ASSIGN_LOGICAL_AND, 97, Token.ASSIGN_BITXOR, Token.HOOK, Token.COLON, Token.IF, Token.FUNCTION, Token.CATCH, Token.COMPUTED_PROPERTY, Token.VAR, 128, Token.JSR, Token.LOOP, Token.LOCAL_BLOCK, Token.SET_REF_OP, Token.METHOD, Token.TEMPLATE_LITERAL_SUBST, 191, Token.DOTDOTDOT, Token.WITHEXPR, 170, Token.TO_OBJECT, Token.TO_DOUBLE, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, Context.VERSION_ES6, 221, 218, 211, 212, Token.ASSIGN_LSH, 110, Token.ASSIGN_BITAND, 96, Token.OR, 114, Token.EXPORT, Token.IMPORT, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Token.AND, Token.ASSIGN_EXP, 120, 127, Token.ASSIGN_RSH, Token.ASSIGN_SUB, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, Token.DEBUGGER, Token.SETCONST, 160, Token.LET, Token.ARROW, Token.TEMPLATE_CHARS, 188, Token.LAST_TOKEN, 150, Token.TARGET, Token.USE_STACK, Token.XML, Token.FINALLY, Token.EMPTY, Token.FOR, Token.DO, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, Context.VERSION_ECMASCRIPT, 253, 244, 243};
    }

    public static int A(String str) {
        String[] strArrSplit;
        int length;
        int i2 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static long B(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
    }

    public static long C(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j2;
    }

    public static int D(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long E(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / ((double) f2));
    }

    public static String F(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long jAbs = (Math.abs(j2) + 500) / 1000;
        long j3 = jAbs % 60;
        long j4 = (jAbs / 60) % 60;
        long j5 = jAbs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String G(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            c.g("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String H(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? androidx.privacysandbox.ads.adservices.java.internal.a.p("custom (", i2, ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039 A[RETURN] */
    public static boolean I(q0 q0Var) {
        boolean z = false;
        if (q0Var == null) {
            return false;
        }
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
        int iQ = c0Var.q();
        if (iQ != 1 || !c0Var.u(2)) {
            if (iQ == 4 && c0Var.u(4)) {
                c0Var.F(-9223372036854775807L, c0Var.h(), false);
            }
            if (c0Var.u(1)) {
                return z;
            }
            c0Var.M(true);
            return true;
        }
        c0Var.C();
        z = true;
        if (c0Var.u(1)) {
            return z;
        }
        c0Var.M(true);
        return true;
    }

    public static boolean J(w wVar, w wVar2, Inflater inflater) {
        if (wVar.a() == 0) {
            return false;
        }
        if (wVar2.a.length < wVar.a()) {
            wVar2.c(wVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(wVar.a, wVar.b, wVar.a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = wVar2.a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (inflater.finished()) {
                    wVar2.L(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    byte[] bArr2 = wVar2.a;
                    if (iInflate == bArr2.length) {
                        wVar2.c(bArr2.length * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    public static void K(int i2) {
        Integer.toString(i2, 36);
    }

    public static boolean L(int i2) {
        return i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1879048192;
    }

    public static boolean M(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1879048192;
    }

    public static boolean N(android.content.Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (com.google.common.base.b.h(str, "moto g(20)") || com.google.common.base.b.h(str, "rmx3231")) {
                return true;
            }
        }
        return i2 == 34 && com.google.common.base.b.h(Build.MODEL, "sm-x200");
    }

    public static boolean O(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean P(android.content.Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long Q(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static String R(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strW = com.google.common.base.b.w(str);
        int i2 = 0;
        String str2 = strW.split("-", 2)[0];
        if (h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = i;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                map.put(strArr[i3], strArr[i3 + 1]);
            }
            h = map;
        }
        String str4 = (String) h.get(str2);
        if (str4 != null) {
            strW = str4.concat(strW.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strW;
        }
        while (true) {
            String[] strArr2 = j;
            if (i2 >= strArr2.length) {
                return strW;
            }
            if (strW.startsWith(strArr2[i2])) {
                return strArr2[i2 + 1] + strW.substring(strArr2[i2].length());
            }
            i2 += 2;
        }
    }

    public static Object[] S(int i2, Object[] objArr) {
        com.google.android.material.motion.a.f(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static long T(String str) throws androidx.media3.common.j0 {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw androidx.media3.common.j0.a(null, "Invalid date/time format: " + str);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int i3 = Integer.parseInt(matcher.group(12)) * 60;
            String strGroup = matcher.group(13);
            i2 = strGroup != null ? Integer.parseInt(strGroup) + i3 : i3;
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (((long) i2) * 60000) : timeInMillis;
    }

    public static void U(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void V(ArrayList arrayList, int i2, int i3) {
        if (i2 < 0 || i3 > arrayList.size() || i2 > i3) {
            net.luminis.tls.engine.impl.c.a();
        } else if (i2 != i3) {
            arrayList.subList(i2, i3).clear();
        }
    }

    public static long W(int i2, long j2) {
        return Y(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static void X(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jF = com.google.common.base.b.f(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = com.google.common.base.b.f(jArr[i2], jF, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jF2 = com.google.common.base.b.f(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = com.google.common.base.b.t(jArr[i2], jF2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = com.google.common.base.b.f(1000000L, com.google.common.base.b.f(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = Z(j4, 1000000L, j3, roundingMode);
                } else {
                    jArr[i3] = com.google.common.base.b.t(1000000L, com.google.common.base.b.f(j4, j2, RoundingMode.UNNECESSARY));
                }
                j3 = j2;
            } else {
                j3 = j2;
            }
            i3++;
            j2 = j3;
        }
    }

    public static long Y(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3 && j4 % j3 == 0) {
            return com.google.common.base.b.f(j2, com.google.common.base.b.f(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return com.google.common.base.b.t(j2, com.google.common.base.b.f(j3, j4, RoundingMode.UNNECESSARY));
        }
        if (j4 < j2 || j4 % j2 != 0) {
            return (j4 >= j2 || j2 % j4 != 0) ? Z(j2, j3, j4, roundingMode) : com.google.common.base.b.t(j3, com.google.common.base.b.f(j2, j4, RoundingMode.UNNECESSARY));
        }
        return com.google.common.base.b.f(j3, com.google.common.base.b.f(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x00ff, please report this as an issue */
    public static long Z(long j2, long j3, long j4, RoundingMode roundingMode) {
        double dRint;
        long j5;
        boolean z;
        long jT = com.google.common.base.b.t(j2, j3);
        if (jT != Long.MAX_VALUE && jT != Long.MIN_VALUE) {
            return com.google.common.base.b.f(jT, j4, roundingMode);
        }
        long jK = com.google.common.base.b.k(Math.abs(j3), Math.abs(j4));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jF = com.google.common.base.b.f(j3, jK, roundingMode2);
        long jF2 = com.google.common.base.b.f(j4, jK, roundingMode2);
        long jK2 = com.google.common.base.b.k(Math.abs(j2), Math.abs(jF2));
        long jF3 = com.google.common.base.b.f(j2, jK2, roundingMode2);
        long jF4 = com.google.common.base.b.f(jF2, jK2, roundingMode2);
        long jT2 = com.google.common.base.b.t(jF3, jF);
        if (jT2 != Long.MAX_VALUE && jT2 != Long.MIN_VALUE) {
            return com.google.common.base.b.f(jT2, jF4, roundingMode);
        }
        double d2 = jF3 * (jF / jF4);
        if (d2 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i2 = com.google.common.math.c.a;
        if (!com.google.android.material.sidesheet.b.u(d2)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (com.google.common.math.b.a[roundingMode.ordinal()]) {
            case 1:
                com.google.common.base.c.f(com.google.common.math.c.a(d2));
                dRint = d2;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 2:
                if (d2 >= 0.0d || com.google.common.math.c.a(d2)) {
                    dRint = d2;
                } else {
                    j5 = ((long) d2) - 1;
                    dRint = j5;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 3:
                if (d2 <= 0.0d || com.google.common.math.c.a(d2)) {
                    dRint = d2;
                } else {
                    j5 = ((long) d2) + 1;
                    dRint = j5;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 4:
                dRint = d2;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 5:
                if (com.google.common.math.c.a(d2)) {
                    dRint = d2;
                } else {
                    dRint = ((long) d2) + ((long) (d2 > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d2);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d2);
                if (Math.abs(d2 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d2) + d2;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d2);
                if (Math.abs(d2 - dRint) == 0.5d) {
                    dRint = d2;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            default:
                throw new AssertionError();
        }
    }

    public static long a(long j2, long j3) {
        long j4 = j2 + j3;
        long j5 = (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) < 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j5 != Long.MIN_VALUE || j4 == Long.MIN_VALUE) && (j5 != Long.MAX_VALUE || j4 == Long.MAX_VALUE)) {
            return j5;
        }
        return Long.MAX_VALUE;
    }

    public static boolean a0(q0 q0Var, boolean z) {
        if (q0Var != null) {
            androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var.p() && c0Var.q() != 1 && c0Var.q() != 4 && (!z || c0Var.r() == 0 || c0Var.r() == 4)) {
                return false;
            }
        }
        return true;
    }

    public static int b(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i2 = iBinarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            iBinarySearch = i2;
        }
        return z ? iBinarySearch : i2;
    }

    public static String[] b0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int c(androidx.compose.ui.input.pointer.util.c cVar, long j2) {
        int i2 = cVar.b - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (cVar.d(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < cVar.b && cVar.d(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static String c0(int i2) {
        return new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII);
    }

    public static int d(List list, Long l2, boolean z) {
        int i2;
        int iBinarySearch = Collections.binarySearch(list, l2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l2) != 0) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static long d0(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static int e(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static int f(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float i(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int j(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long k(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean l(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static boolean m(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                return false;
            }
        }
        return true;
    }

    public static int o(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iHashCode = 17;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
        }
        return iHashCode;
    }

    public static int p(int i2, byte[] bArr, int i3, int i4) {
        while (i2 < i3) {
            i4 = k[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler q(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, callback);
    }

    public static String r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int s(int i2) {
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int t(int i2) {
        if (i2 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i2 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i2 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                switch (i2) {
                    case 12:
                        return 743676;
                    case 13:
                        return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                    case 14:
                        return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                    default:
                        return 0;
                }
        }
    }

    public static int u(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    if (i2 == 1879048192) {
                                        return 8;
                                    }
                                    net.luminis.tls.engine.impl.c.a();
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int v(int i2, String str) {
        int i3 = 0;
        for (String str2 : b0(str)) {
            if (i2 == androidx.media3.common.i0.i(androidx.media3.common.i0.e(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String w(int i2, String str) {
        String[] strArrB0 = b0(str);
        if (strArrB0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrB0) {
            if (i2 == androidx.media3.common.i0.i(androidx.media3.common.i0.e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    public static androidx.media3.common.h x(String str, String str2, String str3) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (str == null || !androidx.media3.common.i0.l(str, str2)) {
            return null;
        }
        if (!str.startsWith("dvhe") && !str.startsWith("dvh1") && !str.startsWith("dav1")) {
            if (str3 != null) {
                i2 = 2;
                if (!str3.equals("db1p")) {
                    if (str3.startsWith("db4")) {
                        i3 = 7;
                        i4 = 2;
                        i5 = 6;
                    } else {
                        i5 = -1;
                        i4 = -1;
                        i3 = -1;
                    }
                }
            } else {
                i5 = -1;
                i4 = -1;
                i3 = -1;
            }
            if (i5 == -1) {
                return null;
            }
            return new androidx.media3.common.h(i5, i4, i3, null, -1, -1);
        }
        i2 = 1;
        i4 = i2;
        i5 = 6;
        i3 = 6;
        if (i5 == -1) {
            return null;
        }
        return new androidx.media3.common.h(i5, i4, i3, null, -1, -1);
    }

    public static Point y(android.content.Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && P(context)) {
            String strG = Build.VERSION.SDK_INT < 28 ? G("sys.display-size") : G("vendor.display-size");
            if (!TextUtils.isEmpty(strG)) {
                try {
                    String[] strArrSplit = strG.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                c.f("Util", "Invalid display size: " + strG);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int z(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }
}
