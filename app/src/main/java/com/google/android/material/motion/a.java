package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.x;
import androidx.core.graphics.d;
import androidx.media3.exoplayer.p0;
import com.google.android.material.resources.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Stack;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.u;
import kotlin.jvm.internal.c0;
import kotlin.text.r;
import kotlinx.serialization.internal.m0;
import net.luminis.tls.engine.impl.c;
import okhttp3.internal.g;
import okhttp3.k;
import okhttp3.l0;
import okhttp3.q;
import okhttp3.z;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Token;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.utils.jsextractor.e;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static x A(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zO = r.O(str, "HTTP/1.", false);
        z zVar = z.HTTP_1_0;
        z zVar2 = z.HTTP_1_1;
        if (zO) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                zVar = zVar2;
            }
        } else if (r.O(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!r.O(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            zVar = zVar2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numQ = r.Q(str.substring(i, i2));
        if (numQ == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numQ.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new x(iIntValue, strSubstring, zVar, 15);
    }

    public static int B(Context context, int i, int i2) {
        TypedValue typedValueU = b.u(context, i);
        return (typedValueU == null || typedValueU.type != 16) ? i2 : typedValueU.data;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c A[Catch: NumberFormatException -> 0x014a, TryCatch #1 {NumberFormatException -> 0x014a, blocks: (B:44:0x00e9, B:47:0x0100, B:49:0x0106, B:53:0x0112, B:66:0x0136, B:68:0x013c, B:74:0x0152, B:77:0x0159, B:78:0x0165, B:79:0x016a, B:80:0x016b, B:81:0x0170), top: B:106:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152 A[Catch: NumberFormatException -> 0x014a, TryCatch #1 {NumberFormatException -> 0x014a, blocks: (B:44:0x00e9, B:47:0x0100, B:49:0x0106, B:53:0x0112, B:66:0x0136, B:68:0x013c, B:74:0x0152, B:77:0x0159, B:78:0x0165, B:79:0x016a, B:80:0x016b, B:81:0x0170), top: B:106:0x00e9 }] */
    public static TimeInterpolator C(Context context, int i, TimeInterpolator timeInterpolator) {
        int i2;
        String strTrim;
        int i3;
        float[] fArr;
        TypedValue typedValue = new TypedValue();
        int i4 = 1;
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            c.o("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!x(strValueOf, "cubic-bezier") && !x(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        int i5 = 0;
        if (x(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(w(strArrSplit, 0), w(strArrSplit, 1), w(strArrSplit, 2), w(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!x(strValueOf, "path")) {
            c.o("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        ArrayList arrayList = new ArrayList();
        int i6 = 1;
        int i7 = 0;
        while (i6 < strSubstring.length()) {
            while (i6 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i6);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = strSubstring.substring(i7, i6).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i5) != 'z' || strTrim.charAt(i5) == 'Z') {
                                i3 = i5;
                                fArr = new float[i3];
                            } else {
                                try {
                                    int length = strTrim.length();
                                    float[] fArr2 = new float[length];
                                    int length2 = strTrim.length();
                                    int i8 = i4;
                                    int i9 = i5;
                                    while (i8 < length2) {
                                        int i10 = i5;
                                        int i11 = i10;
                                        int i12 = i11;
                                        int i13 = i12;
                                        for (int i14 = i8; i14 < strTrim.length(); i14++) {
                                            char cCharAt2 = strTrim.charAt(i14);
                                            if (cCharAt2 == ' ') {
                                                i10 = 0;
                                                i12 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case Token.NAME /* 44 */:
                                                        i10 = 0;
                                                        i12 = 1;
                                                        break;
                                                    case Token.NUMBER /* 45 */:
                                                        if (i14 == i8 || i10 != 0) {
                                                            i10 = 0;
                                                        } else {
                                                            i10 = 0;
                                                            i12 = 1;
                                                            i13 = 1;
                                                        }
                                                        break;
                                                    case Token.STRING /* 46 */:
                                                        if (i11 == 0) {
                                                            i10 = 0;
                                                            i11 = 1;
                                                        } else {
                                                            i10 = 0;
                                                            i12 = 1;
                                                            i13 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i10 = 0;
                                                        break;
                                                }
                                            } else {
                                                i10 = 1;
                                            }
                                            if (i12 != 0) {
                                                if (i8 < i14) {
                                                    fArr2[i9] = Float.parseFloat(strTrim.substring(i8, i14));
                                                    i9++;
                                                }
                                                if (i13 != 0) {
                                                    i8 = i14;
                                                } else {
                                                    i8 = i14 + 1;
                                                }
                                                i5 = 0;
                                            }
                                        }
                                        if (i8 < i14) {
                                            fArr2[i9] = Float.parseFloat(strTrim.substring(i8, i14));
                                            i9++;
                                        }
                                        if (i13 != 0) {
                                            i8 = i14;
                                        } else {
                                            i8 = i14 + 1;
                                        }
                                        i5 = 0;
                                    }
                                    if (i9 < 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    if (length < 0) {
                                        throw new ArrayIndexOutOfBoundsException();
                                    }
                                    fArr = new float[i9];
                                    System.arraycopy(fArr2, 0, fArr, 0, Math.min(i9, length));
                                    i3 = 0;
                                } catch (NumberFormatException e) {
                                    androidx.media3.exoplayer.hls.playlist.a.j(androidx.privacysandbox.ads.adservices.java.internal.a.q("error in parsing \"", strTrim, "\""), e);
                                    return null;
                                }
                            }
                            arrayList.add(new d(strTrim.charAt(i3), fArr));
                        }
                        i7 = i6;
                        i5 = 0;
                        i6++;
                        i4 = 1;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i6++;
            }
            strTrim = strSubstring.substring(i7, i6).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i5) != 'z') {
                    i3 = i5;
                    fArr = new float[i3];
                } else {
                    i3 = i5;
                    fArr = new float[i3];
                }
                arrayList.add(new d(strTrim.charAt(i3), fArr));
            }
            i7 = i6;
            i5 = 0;
            i6++;
            i4 = 1;
        }
        if (i6 - i7 != 1 || i7 >= strSubstring.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new d(strSubstring.charAt(i7), new float[0]));
        }
        try {
            d.b((d[]) arrayList.toArray(new d[i2]), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            androidx.media3.exoplayer.hls.playlist.a.j("Error in parsing ".concat(strSubstring), e2);
            return null;
        }
    }

    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return b.p("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return b.p("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i2, "negative size: "));
        return null;
    }

    public static void b(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        c.o(b.p(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void c(int i, String str, boolean z) {
        if (z) {
            return;
        }
        c.o(b.p(str, Integer.valueOf(i)));
    }

    public static void d(String str, long j, boolean z) {
        if (z) {
            return;
        }
        c.o(b.p(str, Long.valueOf(j)));
    }

    public static void e(String str, boolean z) {
        if (z) {
            return;
        }
        c.o(str);
    }

    public static void f(boolean z) {
        if (z) {
            return;
        }
        c.a();
    }

    public static void g(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        c.o(b.p(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void h(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        c.o(b.p(str, obj));
    }

    public static void i(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        c.o(b.p(str, obj, comparable));
    }

    public static void j(int i, int i2) {
        String strP;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strP = b.p("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i2, "negative size: "));
                    return;
                }
                strP = b.p("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strP);
        }
    }

    public static void k(p0 p0Var) {
        p0Var.getClass();
    }

    public static void l(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        com.google.gson.b.h(b.p(str, obj));
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.gson.b.h(str);
    }

    public static void n(int i, int i2) {
        if (i < 0 || i > i2) {
            com.google.gson.b.n(a(i, i2, "index"));
        }
    }

    public static void o(int i, int i2, int i3) {
        String strA;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strA = a(i, i3, "start index");
            } else {
                strA = (i2 < 0 || i2 > i3) ? a(i2, i3, "end index") : b.p("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void p(String str, boolean z) {
        if (z) {
            return;
        }
        c.r(str);
    }

    public static void q(boolean z) {
        if (z) {
            return;
        }
        org.mozilla.javascript.c.a();
    }

    public static final void r(int i, int i2) {
        String strP;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                strP = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                strP = androidx.privacysandbox.ads.adservices.java.internal.a.p("size ", i, " must be greater than zero.");
            }
            c.p(strP);
        }
    }

    public static byte s(long j) {
        d("out of range: %s", j, (j >> 8) == 0);
        return (byte) j;
    }

    public static final void t(kotlinx.serialization.c cVar, kotlinx.serialization.encoding.a aVar, String str) {
        cVar.getClass();
        aVar.l().getClass();
        c0.e(1, null);
        m0.f(str, null);
        throw null;
    }

    public static q u(SSLSession sSLSession) throws IOException {
        Object objK;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            c.r("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            c.t("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        k kVarD = k.b.d(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            c.r("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            c.t("tlsVersion == NONE");
            return null;
        }
        l0.y.getClass();
        l0 l0VarE = okhttp3.b.e(protocol);
        try {
            objK = g.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objK = u.e;
        }
        return new q(l0VarE, kVarD, g.k(sSLSession.getLocalCertificates()), new androidx.room.coroutines.d(objK, 23));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class v(kotlin.reflect.c cVar) {
        cVar.getClass();
        Class clsA = ((kotlin.jvm.internal.d) cVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static float w(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static boolean x(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean y(byte b) {
        return b > -65;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:172:0x0253  */
    /* JADX WARN: Code duplicated, block: B:178:0x0268  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:201:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:204:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:215:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    public static String z(String str, String str2) throws f {
        boolean z;
        boolean z2;
        boolean z3;
        int iB;
        int iB2;
        int i;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        androidx.core.view.r rVar;
        androidx.core.view.r rVar2;
        androidx.core.view.r rVar3;
        boolean z7;
        boolean z8;
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf < 0) {
            org.mozilla.javascript.typedarrays.c.b("Start not found");
            return null;
        }
        String strSubstring = str.substring(str2.length() + iIndexOf);
        org.schabi.newpipe.extractor.utils.jsextractor.a aVar = new org.schabi.newpipe.extractor.utils.jsextractor.a(strSubstring);
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(15, false);
        androidx.core.view.r[] rVarArr = (androidx.core.view.r[]) bVar.e;
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        boolean z9 = false;
        while (true) {
            int iC = aVar.c();
            while (true) {
                if (iC == 3 || iC == 94) {
                    iC = aVar.c();
                } else {
                    if (iC == 20 || iC == 62) {
                        androidx.core.view.r rVar4 = rVarArr[0];
                        if (rVar4 != null) {
                            z = true;
                            int i3 = rVar4.a;
                            boolean z10 = true;
                            switch (i3) {
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 27:
                                case 28:
                                case 29:
                                case Token.GETPROPNOWARN /* 34 */:
                                case 35:
                                case Token.GETPROPNOWARN_SUPER /* 36 */:
                                case Token.SETELEM /* 41 */:
                                case Token.SETELEM_SUPER /* 42 */:
                                case Token.NAME /* 44 */:
                                case Token.NUMBER /* 45 */:
                                case Token.STRING /* 46 */:
                                case Token.NULL /* 47 */:
                                case Token.THIS /* 48 */:
                                case Token.FALSE /* 49 */:
                                case Token.TRUE /* 50 */:
                                case Token.SHEQ /* 51 */:
                                case Token.SHNE /* 52 */:
                                case Token.REGEXP /* 53 */:
                                case Token.BINDNAME /* 54 */:
                                case Token.THROW /* 55 */:
                                case Token.RETHROW /* 56 */:
                                case Token.IN /* 57 */:
                                case Token.INSTANCEOF /* 58 */:
                                case Token.LOCAL_LOAD /* 59 */:
                                case 60:
                                case 61:
                                case Token.CATCH_SCOPE /* 62 */:
                                case Token.ENUM_INIT_KEYS /* 63 */:
                                case Token.ENUM_INIT_VALUES /* 64 */:
                                case Token.ENUM_INIT_ARRAY /* 65 */:
                                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                case Token.ENUM_NEXT /* 67 */:
                                case Token.ENUM_ID /* 68 */:
                                case Token.THISFN /* 69 */:
                                case Token.RETURN_RESULT /* 70 */:
                                case Token.ARRAYLIT /* 71 */:
                                case Token.LC /* 94 */:
                                case Token.RC /* 95 */:
                                case Token.RP /* 97 */:
                                    z10 = false;
                                case 4:
                                case 24:
                                case 25:
                                case 26:
                                case 30:
                                case 31:
                                case 32:
                                case Token.GETPROP /* 33 */:
                                case Token.SETPROP /* 37 */:
                                case Token.SETPROP_SUPER /* 38 */:
                                case Token.GETELEM /* 39 */:
                                case Token.GETELEM_SUPER /* 40 */:
                                case Token.CALL /* 43 */:
                                case Token.OBJECTLIT /* 72 */:
                                case Token.GET_REF /* 73 */:
                                case Token.SET_REF /* 74 */:
                                case Token.DEL_REF /* 75 */:
                                case Token.REF_CALL /* 76 */:
                                case Token.REF_SPECIAL /* 77 */:
                                case Token.YIELD /* 78 */:
                                case Token.SUPER /* 79 */:
                                case Token.STRICT_SETNAME /* 80 */:
                                case Token.EXP /* 81 */:
                                case Token.DEFAULTNAMESPACE /* 82 */:
                                case Token.ESCXMLATTR /* 83 */:
                                case Token.ESCXMLTEXT /* 84 */:
                                case Token.REF_MEMBER /* 85 */:
                                case Token.REF_NS_MEMBER /* 86 */:
                                case Token.REF_NAME /* 87 */:
                                case Token.REF_NS_NAME /* 88 */:
                                case 89:
                                case Token.TRY /* 90 */:
                                case Token.SEMI /* 91 */:
                                case Token.LB /* 92 */:
                                case Token.RB /* 93 */:
                                case Token.LP /* 96 */:
                                    if (z10) {
                                        if (i3 == 31) {
                                            z2 = false;
                                        }
                                    } else if (i3 == 50 && (rVar4 instanceof e)) {
                                        z2 = ((e) rVar4).c.b;
                                    } else if (i3 == 48 && (rVar4 instanceof org.schabi.newpipe.extractor.utils.jsextractor.c)) {
                                        org.schabi.newpipe.extractor.utils.jsextractor.b bVar2 = ((org.schabi.newpipe.extractor.utils.jsextractor.c) rVar4).c;
                                        if (bVar2.a) {
                                            org.schabi.newpipe.extractor.utils.jsextractor.d dVar = bVar2.b;
                                            if (dVar != null) {
                                                z2 = !dVar.a;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                    } else if (!org.jsoup.parser.p0.b(i3) || i3 == 46) {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        int i4 = aVar.k;
                                        aVar.c = 0;
                                        if (iC == 62) {
                                            aVar.a(61);
                                            z3 = z;
                                        } else {
                                            if (iC != 20) {
                                                Kit.codeBug();
                                            }
                                            z3 = z;
                                            iB = aVar.b(z3, false);
                                            aVar.i(iB);
                                            if (iB == 42) {
                                                aVar.l = aVar.j - 1;
                                                org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                                return null;
                                            }
                                        }
                                        boolean z11 = false;
                                        while (true) {
                                            iB2 = aVar.b(z3, false);
                                            if (iB2 == 47 || z11) {
                                                if (iB2 != 10 || iB2 == -1) {
                                                    org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                                    return null;
                                                }
                                                if (iB2 == 92) {
                                                    aVar.a(iB2);
                                                    iB2 = aVar.b(true, false);
                                                    if (iB2 == 10 || iB2 == -1) {
                                                        org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                                        return null;
                                                    }
                                                } else if (iB2 == 91) {
                                                    z11 = true;
                                                } else if (iB2 == 93) {
                                                    z11 = false;
                                                }
                                                aVar.a(iB2);
                                                z3 = true;
                                            } else {
                                                while (true) {
                                                    int iB3 = aVar.b(z3, z3);
                                                    if ("gimysu".indexOf(iB3) != -1) {
                                                        aVar.a(iB3);
                                                        z3 = true;
                                                    } else if (iB3 > 90) {
                                                        if (97 <= iB3 && iB3 <= 122) {
                                                            org.mozilla.javascript.typedarrays.c.b("msg.invalid.re.flag");
                                                            return null;
                                                        }
                                                        aVar.j(iB3);
                                                        aVar.l = i4 + aVar.c + 2;
                                                        iC = 36;
                                                    } else {
                                                        if (65 <= iB3) {
                                                            org.mozilla.javascript.typedarrays.c.b("msg.invalid.re.flag");
                                                            return null;
                                                        }
                                                        aVar.j(iB3);
                                                        aVar.l = i4 + aVar.c + 2;
                                                        iC = 36;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    throw null;
                            }
                        } else {
                            z = true;
                        }
                        z2 = z;
                        if (z2) {
                            int i5 = aVar.k;
                            aVar.c = 0;
                            if (iC == 62) {
                                aVar.a(61);
                                z3 = z;
                            } else {
                                if (iC != 20) {
                                    Kit.codeBug();
                                }
                                z3 = z;
                                iB = aVar.b(z3, false);
                                aVar.i(iB);
                                if (iB == 42) {
                                    aVar.l = aVar.j - 1;
                                    org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                    return null;
                                }
                            }
                            boolean z12 = false;
                            while (true) {
                                iB2 = aVar.b(z3, false);
                                if (iB2 == 47) {
                                }
                                if (iB2 != 10) {
                                }
                                org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                return null;
                                aVar.a(iB2);
                                z3 = true;
                            }
                        }
                    }
                    int i6 = aVar.k;
                    int i7 = aVar.l;
                    if (org.jsoup.parser.p0.b(iC)) {
                        org.schabi.newpipe.extractor.utils.jsextractor.d dVar2 = null;
                        switch (androidx.constraintlayout.core.g.e(iC)) {
                            case Token.STRING /* 46 */:
                                androidx.core.view.r rVar5 = rVarArr[0];
                                if (rVar5 != null) {
                                    int iE = androidx.constraintlayout.core.g.e(rVar5.a);
                                    if (iE == 3 || iE == 39) {
                                        z4 = true;
                                        rVar2 = rVarArr[1];
                                        if (rVar2 != null || rVar2.b == aVar.g) {
                                            z6 = false;
                                        }
                                    } else {
                                        if (iE == 46 || iE == 48) {
                                            z6 = false;
                                        } else if (iE != 65) {
                                            if (iE == 77) {
                                                z6 = false;
                                            } else if (iE != 95) {
                                                z6 = !org.jsoup.parser.p0.a(rVarArr[0].a);
                                            } else {
                                                z4 = true;
                                                rVar2 = rVarArr[1];
                                                if (rVar2 != null) {
                                                }
                                                z6 = false;
                                            }
                                        } else if (stack.isEmpty() || !((org.schabi.newpipe.extractor.utils.jsextractor.b) stack.lastElement()).a) {
                                            z6 = false;
                                        } else {
                                            z6 = true;
                                        }
                                        z4 = true;
                                    }
                                    rVar = rVarArr[0];
                                    if ((rVar instanceof e) && rVar.a == 50) {
                                        dVar2 = ((e) rVar).c;
                                    }
                                    org.schabi.newpipe.extractor.utils.jsextractor.b bVar3 = new org.schabi.newpipe.extractor.utils.jsextractor.b(z6, dVar2);
                                    stack.push(bVar3);
                                    i = 47;
                                    bVar.z(new org.schabi.newpipe.extractor.utils.jsextractor.c(47, aVar.g, bVar3));
                                    if (iC == i) {
                                        z9 = z4;
                                    } else {
                                        if (z9) {
                                            if (stack.isEmpty() || !stack2.isEmpty()) {
                                                z5 = false;
                                            } else {
                                                z5 = z4;
                                            }
                                            if (z5) {
                                                return strSubstring.substring(0, i7);
                                            }
                                        }
                                        if (iC != 2) {
                                            org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                            return null;
                                        }
                                    }
                                } else {
                                    z4 = true;
                                }
                                z6 = z4;
                                rVar = rVarArr[0];
                                if (rVar instanceof e) {
                                    dVar2 = ((e) rVar).c;
                                }
                                org.schabi.newpipe.extractor.utils.jsextractor.b bVar4 = new org.schabi.newpipe.extractor.utils.jsextractor.b(z6, dVar2);
                                stack.push(bVar4);
                                i = 47;
                                bVar.z(new org.schabi.newpipe.extractor.utils.jsextractor.c(47, aVar.g, bVar4));
                                if (iC == i) {
                                    z9 = z4;
                                } else {
                                    if (z9) {
                                        if (stack.isEmpty()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            return strSubstring.substring(0, i7);
                                        }
                                    }
                                    if (iC != 2) {
                                        org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                        return null;
                                    }
                                }
                                break;
                            case Token.NULL /* 47 */:
                                if (stack.isEmpty()) {
                                    throw new f(androidx.privacysandbox.ads.adservices.java.internal.a.l(i6, "unmatched closing brace at "));
                                }
                                bVar.z(new org.schabi.newpipe.extractor.utils.jsextractor.c(48, aVar.g, (org.schabi.newpipe.extractor.utils.jsextractor.b) stack.pop()));
                                i = 47;
                                z4 = true;
                                if (iC == i) {
                                    z9 = z4;
                                } else {
                                    if (z9) {
                                        if (stack.isEmpty()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            return strSubstring.substring(0, i7);
                                        }
                                    }
                                    if (iC != 2) {
                                        org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                        return null;
                                    }
                                }
                                break;
                            case Token.THIS /* 48 */:
                                androidx.core.view.r rVar6 = rVarArr[0];
                                if (rVar6 == null || rVar6.a != 72) {
                                    androidx.core.view.r rVar7 = rVarArr[1];
                                    if (rVar7 != null && rVar7.a == 72 && (rVar3 = rVarArr[2]) != null) {
                                        int i8 = rVar3.a;
                                        z7 = org.jsoup.parser.p0.a(i8) || i8 == 4 || i8 == 78;
                                    }
                                } else {
                                    androidx.core.view.r rVar8 = rVarArr[1];
                                    if (rVar8 != null) {
                                        int i9 = rVar8.a;
                                        if (org.jsoup.parser.p0.a(i9) || i9 == 4 || i9 == 78) {
                                        }
                                    }
                                }
                                androidx.core.view.r rVar9 = rVarArr[0];
                                if (rVar9 == null) {
                                    z8 = false;
                                } else {
                                    int i10 = rVar9.a;
                                    if (i10 == 0) {
                                        throw null;
                                    }
                                    if (i10 == 75 || i10 == 82 || i10 == 80 || i10 == 86) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                }
                                org.schabi.newpipe.extractor.utils.jsextractor.d dVar3 = new org.schabi.newpipe.extractor.utils.jsextractor.d(z7, z8);
                                stack2.push(dVar3);
                                bVar.z(new e(49, aVar.g, dVar3));
                                i = 47;
                                z4 = true;
                                if (iC == i) {
                                    z9 = z4;
                                } else {
                                    if (z9) {
                                        if (stack.isEmpty()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            return strSubstring.substring(0, i7);
                                        }
                                    }
                                    if (iC != 2) {
                                        org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                        return null;
                                    }
                                }
                                break;
                            case Token.FALSE /* 49 */:
                                if (stack2.isEmpty()) {
                                    throw new f(androidx.privacysandbox.ads.adservices.java.internal.a.l(i6, "unmatched closing paren at "));
                                }
                                bVar.z(new e(50, aVar.g, (org.schabi.newpipe.extractor.utils.jsextractor.d) stack2.pop()));
                                i = 47;
                                z4 = true;
                                if (iC == i) {
                                    z9 = z4;
                                } else {
                                    if (z9) {
                                        if (stack.isEmpty()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            return strSubstring.substring(0, i7);
                                        }
                                    }
                                    if (iC != 2) {
                                        org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                        return null;
                                    }
                                }
                                break;
                            default:
                                i2 = 94;
                                i = 47;
                                z4 = true;
                                break;
                        }
                    } else {
                        i = 47;
                        z4 = true;
                        i2 = 94;
                    }
                    if (iC != i2) {
                        bVar.z(new androidx.core.view.r(iC, aVar.g));
                    }
                    if (iC == i) {
                        z9 = z4;
                    } else {
                        if (z9) {
                            if (stack.isEmpty()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                return strSubstring.substring(0, i7);
                            }
                        }
                        if (iC != 2) {
                            org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                            return null;
                        }
                    }
                }
            }
        }
    }
}
