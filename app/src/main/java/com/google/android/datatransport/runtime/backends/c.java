package com.google.android.datatransport.runtime.backends;

import com.google.android.gms.internal.measurement.r1;
import com.google.android.gms.internal.measurement.z0;
import com.google.gson.internal.j;
import com.google.protobuf.w;
import java.io.IOException;
import kotlinx.coroutines.flow.FlowKt;
import org.jsoup.helper.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static final boolean a(int i) {
        return i == 4 || i == 5 || i == 6 || i == 7;
    }

    public static Number b(int i, com.google.gson.stream.a aVar) throws IOException {
        if (i == 1) {
            return Double.valueOf(aVar.e0());
        }
        if (i == 2) {
            return new j(aVar.l0());
        }
        if (i == 3) {
            String strL0 = aVar.l0();
            if (strL0.indexOf(46) >= 0) {
                return c(strL0, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(strL0));
            } catch (NumberFormatException unused) {
                return c(strL0, aVar);
            }
        }
        String strL1 = aVar.l0();
        try {
            return com.google.gson.internal.h.i(strL1);
        } catch (NumberFormatException e) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Cannot parse ", strL1, "; at path ");
            sbX.append(aVar.Z());
            throw new androidx.compose.ui.res.e(8, sbX.toString(), e);
        }
    }

    public static Double c(String str, com.google.gson.stream.a aVar) throws com.google.gson.stream.c {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                boolean z = true;
                if (aVar.L != 1) {
                    z = false;
                }
                if (!z) {
                    throw new com.google.gson.stream.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.Z());
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Cannot parse ", str, "; at path ");
            sbX.append(aVar.Z());
            throw new androidx.compose.ui.res.e(8, sbX.toString(), e);
        }
    }

    public static final int d(int i) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 0) {
            return 1;
        }
        if (iE != 1) {
            return iE != 2 ? 0 : 4;
        }
        return 3;
    }

    public static final int e(int i) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 0) {
            return 1;
        }
        if (iE != 1) {
            if (iE == 2) {
                return 2;
            }
            if (iE != 3) {
                return 0;
            }
        }
        return 3;
    }

    public static String f(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String g(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ int h(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        net.luminis.tls.engine.impl.c.m("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static int i(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ boolean j(int i) {
        switch (i) {
            case 1:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
            case 7:
            case 8:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int k(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int l(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int m(int i, int i2, int i3) {
        return z0.a(i) + i2 + i3;
    }

    public static int n(int i, int i2, int i3, int i4) {
        return z0.a(i) + i2 + i3 + i4;
    }

    public static int o(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static androidx.compose.ui.res.e p() {
        FlowKt.noImpl();
        return new androidx.compose.ui.res.e(10);
    }

    public static r1 q(r1 r1Var) {
        int size = r1Var.size();
        return r1Var.L(size + size);
    }

    public static /* synthetic */ String r(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (str.length() > 33554431) {
            throw new OutOfMemoryError("Repeating " + str.length() + " bytes String 64 times will produce a String exceeding maximum size.");
        }
        StringBuilder sb = new StringBuilder(length * 64);
        for (int i = 0; i < 64; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String s(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static /* synthetic */ void t(int i, String str) {
        if (i == 0) {
            throw new o(androidx.privacysandbox.ads.adservices.java.internal.a.q("The parameter '", str, "' must not be null."));
        }
    }

    public static int u(int i, int i2, int i3, int i4) {
        return w.f(i) + i2 + i3 + i4;
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "Initial";
        }
        if (i == 2) {
            return "ZeroRTT";
        }
        if (i == 3) {
            return "Handshake";
        }
        if (i == 4) {
            return "App";
        }
        throw null;
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "Initial";
        }
        if (i == 2) {
            return "ZeroRTT";
        }
        if (i != 3) {
            return i != 4 ? "null" : "App";
        }
        return "Handshake";
    }

    public static /* synthetic */ int z(String str) {
        if (str == null) {
            com.google.gson.b.h("Name is null");
            return 0;
        }
        if (str.equals("GET")) {
            return 1;
        }
        if (str.equals("POST")) {
            return 2;
        }
        if (str.equals("PUT")) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("PATCH")) {
            return 5;
        }
        if (str.equals("HEAD")) {
            return 6;
        }
        if (str.equals("OPTIONS")) {
            return 7;
        }
        if (str.equals("TRACE")) {
            return 8;
        }
        net.luminis.tls.engine.impl.c.o("No enum constant org.jsoup.Connection.Method.".concat(str));
        return 0;
    }
}
