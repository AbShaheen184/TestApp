package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlinx.coroutines.DebugKt;
import org.mozilla.javascript.Token;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {
    public androidx.appcompat.widget.c2 a;
    public v0 b;
    public boolean c;
    public int d;
    public boolean e;
    public g2 f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x0270  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:235:0x037d  */
    /* JADX WARN: Code duplicated, block: B:311:0x0491  */
    /* JADX WARN: Code duplicated, block: B:345:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:390:0x0588  */
    /* JADX WARN: Code duplicated, block: B:445:0x0650  */
    public static void C(r0 r0Var, String str, String str2) {
        com.google.firebase.messaging.o oVar;
        Boolean bool;
        int i;
        int i2;
        String strG;
        d0 d0VarS;
        String strSubstring;
        d0 d0VarS2;
        int i3;
        int i4;
        d0 d0VarD;
        d0[] d0VarArr;
        int i5;
        int i6;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = f2.a(str).ordinal();
        if (iOrdinal == 1) {
            if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str2) && str2.startsWith("rect(")) {
                androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(str2.substring(5));
                eVar.R();
                d0 d0VarU = u(eVar);
                eVar.Q();
                d0 d0VarU2 = u(eVar);
                eVar.Q();
                d0 d0VarU3 = u(eVar);
                eVar.Q();
                d0 d0VarU4 = u(eVar);
                eVar.R();
                if (eVar.m(')') || eVar.q()) {
                    oVar = new com.google.firebase.messaging.o(18, false);
                    oVar.y = d0VarU;
                    oVar.z = d0VarU2;
                    oVar.A = d0VarU3;
                    oVar.B = d0VarU4;
                } else {
                    oVar = null;
                }
            } else {
                oVar = null;
            }
            r0Var.M = oVar;
            if (oVar != null) {
                r0Var.e |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            r0Var.U = r(str2);
            r0Var.e |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            r0Var.h0 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            r0Var.e |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                r0Var.H = n(str2);
                r0Var.e |= 4096;
                return;
            }
            if (iOrdinal == 8) {
                int i7 = str2.equals("ltr") ? 1 : !str2.equals("rtl") ? 0 : 2;
                r0Var.f0 = i7;
                if (i7 != 0) {
                    r0Var.e |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                r0Var.V = r(str2);
                r0Var.e |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                r0Var.G = v(str2);
                r0Var.e |= 2048;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                r0Var.L = bool;
                if (bool != null) {
                    r0Var.e |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                int i8 = str2.equals("none") ? 1 : !str2.equals("non-scaling-stroke") ? 0 : 2;
                r0Var.i0 = i8;
                if (i8 != 0) {
                    r0Var.e |= 34359738368L;
                    return;
                }
                return;
            }
            v vVar = v.e;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    r0Var.W = vVar;
                } else {
                    try {
                        r0Var.W = n(str2);
                    } catch (z1 e) {
                        Log.w("SVGParser", e.getMessage());
                        return;
                    }
                }
                r0Var.e |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                r0Var.X = v(str2);
                r0Var.e |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        i = 2;
                        break;
                    case "end":
                        i = 3;
                        break;
                    case "start":
                        i = 1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                r0Var.g0 = i;
                if (i != 0) {
                    r0Var.e |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        i2 = 4;
                        break;
                    case "underline":
                        i2 = 2;
                        break;
                    case "none":
                        i2 = 1;
                        break;
                    case "blink":
                        i2 = 5;
                        break;
                    case "overline":
                        i2 = 3;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                r0Var.e0 = i2;
                if (i2 != 0) {
                    r0Var.e |= 131072;
                    return;
                }
                return;
            }
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(Token.IMPORT) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            r0Var.Q = Boolean.valueOf(!str2.equals("none"));
                            r0Var.e |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    a1 a1VarW = w(str2);
                    r0Var.y = a1VarW;
                    if (a1VarW != null) {
                        r0Var.e |= 1;
                    }
                    break;
                case 16:
                    int i9 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    r0Var.a0 = i9;
                    if (i9 != 0) {
                        r0Var.e |= 2;
                    }
                    break;
                case 17:
                    Float fV = v(str2);
                    r0Var.z = fV;
                    if (fV != null) {
                        r0Var.e |= 4;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        androidx.compose.ui.text.android.selection.e eVar2 = new androidx.compose.ui.text.android.selection.e(str2);
                        Integer num = null;
                        String str3 = null;
                        int i10 = 0;
                        while (true) {
                            strG = eVar2.G('/', false);
                            eVar2.R();
                            if (strG == null) {
                                break;
                            } else if (num == null || i10 == 0) {
                                if (!strG.equals("normal") && (num != null || (num = (Integer) d2.a.get(strG)) == null)) {
                                    if (i10 == 0) {
                                        switch (strG) {
                                            case "oblique":
                                                i10 = 3;
                                                break;
                                            case "italic":
                                                i10 = 2;
                                                break;
                                            case "normal":
                                                i10 = 1;
                                                break;
                                            default:
                                                i10 = 0;
                                                break;
                                        }
                                        if (i10 != 0) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strG.equals("small-caps")) {
                                        str3 = strG;
                                    }
                                }
                            }
                        }
                        try {
                            d0VarS = (d0) c2.a.get(strG);
                            if (d0VarS == null) {
                                d0VarS = s(strG);
                            }
                        } catch (z1 unused) {
                            d0VarS = null;
                        }
                        if (eVar2.m('/')) {
                            eVar2.R();
                            String strF = eVar2.F();
                            if (strF != null) {
                                s(strF);
                            }
                            eVar2.R();
                        }
                        if (eVar2.q()) {
                            strSubstring = null;
                        } else {
                            int i11 = eVar2.b;
                            eVar2.b = eVar2.c;
                            strSubstring = ((String) eVar2.d).substring(i11);
                        }
                        r0Var.I = q(strSubstring);
                        r0Var.J = d0VarS;
                        r0Var.K = Integer.valueOf(num == null ? 400 : num.intValue());
                        r0Var.d0 = i10 == 0 ? 1 : i10;
                        r0Var.e |= 122880;
                        break;
                    }
                    break;
                case 19:
                    ArrayList arrayListQ = q(str2);
                    r0Var.I = arrayListQ;
                    if (arrayListQ != null) {
                        r0Var.e |= 8192;
                    }
                    break;
                case 20:
                    try {
                        d0 d0Var = (d0) c2.a.get(str2);
                        d0VarS2 = d0Var == null ? s(str2) : d0Var;
                    } catch (z1 unused2) {
                        d0VarS2 = null;
                    }
                    r0Var.J = d0VarS2;
                    if (d0VarS2 != null) {
                        r0Var.e |= 16384;
                    }
                    break;
                case 21:
                    Integer num2 = (Integer) d2.a.get(str2);
                    r0Var.K = num2;
                    if (num2 != null) {
                        r0Var.e |= 32768;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i3 = 3;
                            break;
                        case "italic":
                            i3 = 2;
                            break;
                        case "normal":
                            i3 = 1;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    r0Var.d0 = i3;
                    if (i3 != 0) {
                        r0Var.e |= 65536;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    i4 = 2;
                                    break;
                                case "auto":
                                    i4 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i4 = 3;
                                    break;
                                default:
                                    i4 = 0;
                                    break;
                            }
                            r0Var.j0 = i4;
                            if (i4 != 0) {
                                r0Var.e |= 137438953472L;
                            }
                            break;
                        case 28:
                            String strR = r(str2);
                            r0Var.N = strR;
                            r0Var.O = strR;
                            r0Var.P = strR;
                            r0Var.e |= 14680064;
                            break;
                        case 29:
                            r0Var.N = r(str2);
                            r0Var.e |= 2097152;
                            break;
                        case 30:
                            r0Var.O = r(str2);
                            r0Var.e |= 4194304;
                            break;
                        case 31:
                            r0Var.P = r(str2);
                            r0Var.e |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case Token.CATCH_SCOPE /* 62 */:
                                    if (str2.equals("currentColor")) {
                                        r0Var.S = vVar;
                                    } else {
                                        try {
                                            r0Var.S = n(str2);
                                        } catch (z1 e2) {
                                            Log.w("SVGParser", e2.getMessage());
                                            return;
                                        }
                                    }
                                    r0Var.e |= 67108864;
                                    break;
                                case Token.ENUM_INIT_KEYS /* 63 */:
                                    r0Var.T = v(str2);
                                    r0Var.e |= 134217728;
                                    break;
                                case Token.ENUM_INIT_VALUES /* 64 */:
                                    a1 a1VarW2 = w(str2);
                                    r0Var.A = a1VarW2;
                                    if (a1VarW2 != null) {
                                        r0Var.e |= 8;
                                    }
                                    break;
                                case Token.ENUM_INIT_ARRAY /* 65 */:
                                    if (!"none".equals(str2)) {
                                        androidx.compose.ui.text.android.selection.e eVar3 = new androidx.compose.ui.text.android.selection.e(str2);
                                        eVar3.R();
                                        if (eVar3.q() || (d0VarD = eVar3.D()) == null || d0VarD.f()) {
                                            d0VarArr = null;
                                        } else {
                                            float f = d0VarD.e;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(d0VarD);
                                            while (true) {
                                                if (!eVar3.q()) {
                                                    eVar3.Q();
                                                    d0 d0VarD2 = eVar3.D();
                                                    if (d0VarD2 != null && !d0VarD2.f()) {
                                                        arrayList.add(d0VarD2);
                                                        f += d0VarD2.e;
                                                    }
                                                } else if (f != 0.0f) {
                                                    d0VarArr = (d0[]) arrayList.toArray(new d0[arrayList.size()]);
                                                }
                                                d0VarArr = null;
                                            }
                                        }
                                        r0Var.E = d0VarArr;
                                        if (d0VarArr != null) {
                                            r0Var.e |= 512;
                                        }
                                    } else {
                                        r0Var.E = null;
                                        r0Var.e |= 512;
                                    }
                                    break;
                                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                    r0Var.F = s(str2);
                                    r0Var.e |= 1024;
                                    break;
                                case Token.ENUM_NEXT /* 67 */:
                                    if ("butt".equals(str2)) {
                                        i5 = 1;
                                    } else if ("round".equals(str2)) {
                                        i5 = 2;
                                    } else {
                                        i5 = "square".equals(str2) ? 3 : 0;
                                    }
                                    r0Var.b0 = i5;
                                    if (i5 != 0) {
                                        r0Var.e |= 64;
                                    }
                                    break;
                                case Token.ENUM_ID /* 68 */:
                                    if ("miter".equals(str2)) {
                                        i6 = 1;
                                    } else if ("round".equals(str2)) {
                                        i6 = 2;
                                    } else {
                                        i6 = "bevel".equals(str2) ? 3 : 0;
                                    }
                                    r0Var.c0 = i6;
                                    if (i6 != 0) {
                                        r0Var.e |= 128;
                                    }
                                    break;
                                case Token.THISFN /* 69 */:
                                    r0Var.D = Float.valueOf(p(str2));
                                    r0Var.e |= 256;
                                    break;
                                case Token.RETURN_RESULT /* 70 */:
                                    Float fV2 = v(str2);
                                    r0Var.B = fV2;
                                    if (fV2 != null) {
                                        r0Var.e |= 16;
                                    }
                                    break;
                                case Token.ARRAYLIT /* 71 */:
                                    r0Var.C = s(str2);
                                    r0Var.e |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case Token.REF_NS_NAME /* 88 */:
                                            if (str2.equals("currentColor")) {
                                                r0Var.Y = vVar;
                                            } else {
                                                try {
                                                    r0Var.Y = n(str2);
                                                } catch (z1 e3) {
                                                    Log.w("SVGParser", e3.getMessage());
                                                    return;
                                                }
                                            }
                                            r0Var.e |= 8589934592L;
                                            break;
                                        case 89:
                                            r0Var.Z = v(str2);
                                            r0Var.e |= 17179869184L;
                                            break;
                                        case Token.TRY /* 90 */:
                                            if (str2.indexOf(Token.IMPORT) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    r0Var.R = Boolean.valueOf(str2.equals("visible"));
                                                    r0Var.e |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (z1 unused3) {
        }
    }

    public static int b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = f % 360.0f;
        if (f < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return b(e(f10, f9, f6 - 2.0f) * 256.0f) | (b(e(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f6) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return ((f2 - f) * f3) + f;
        }
        if (f3 < 3.0f) {
            return f2;
        }
        if (f3 >= 4.0f) {
            return f;
        }
        return ((4.0f - f3) * (f2 - f)) + f;
    }

    public static void f(t0 t0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iC = coil3.compose.internal.f.c(attributes, i);
            if (iC != 73) {
                switch (iC) {
                    case Token.SHNE /* 52 */:
                        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!eVar.q()) {
                            String strF = eVar.F();
                            if (strF.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strF.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            eVar.R();
                        }
                        t0Var.e(hashSet);
                        break;
                    case Token.REGEXP /* 53 */:
                        t0Var.h(strTrim);
                        break;
                    case Token.BINDNAME /* 54 */:
                        androidx.compose.ui.text.android.selection.e eVar2 = new androidx.compose.ui.text.android.selection.e(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!eVar2.q()) {
                            hashSet2.add(eVar2.F());
                            eVar2.R();
                        }
                        t0Var.i(hashSet2);
                        break;
                    case Token.THROW /* 55 */:
                        ArrayList arrayListQ = q(strTrim);
                        t0Var.g(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                        break;
                }
            } else {
                androidx.compose.ui.text.android.selection.e eVar3 = new androidx.compose.ui.text.android.selection.e(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!eVar3.q()) {
                    String strF2 = eVar3.F();
                    int iIndexOf = strF2.indexOf(45);
                    if (iIndexOf != -1) {
                        strF2 = strF2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strF2, "", "").getLanguage());
                    eVar3.R();
                }
                t0Var.j(hashSet3);
            }
        }
    }

    public static void g(x0 x0Var, Attributes attributes) throws z1 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                x0Var.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    x0Var.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new z1(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    x0Var.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(y yVar, Attributes attributes) throws z1 {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iC = coil3.compose.internal.f.c(attributes, i2);
            if (iC == 23) {
                yVar.j = z(strTrim);
            } else if (iC != 24) {
                if (iC != 26) {
                    if (iC == 60) {
                        if (strTrim != null) {
                            try {
                                if (strTrim.equals("pad")) {
                                    i = 1;
                                } else if (strTrim.equals("reflect")) {
                                    i = 2;
                                } else if (strTrim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    net.luminis.tls.engine.impl.c.o("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(strTrim));
                                }
                                yVar.k = i;
                            } catch (IllegalArgumentException unused) {
                                throw new z1(androidx.privacysandbox.ads.adservices.java.internal.a.q("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                            }
                        } else {
                            com.google.gson.b.h("Name is null");
                        }
                        i = 0;
                        yVar.k = i;
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    yVar.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                yVar.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    androidx.transition.k.o("Invalid value for attribute gradientUnits");
                    return;
                }
                yVar.i = Boolean.TRUE;
            }
        }
    }

    public static void i(m0 m0Var, Attributes attributes, String str) throws z1 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (f2.a(attributes.getLocalName(i)) == f2.y) {
                androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                eVar.R();
                while (!eVar.q()) {
                    float fC = eVar.C();
                    if (Float.isNaN(fC)) {
                        throw new z1(androidx.privacysandbox.ads.adservices.java.internal.a.q("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    eVar.Q();
                    float fC2 = eVar.C();
                    if (Float.isNaN(fC2)) {
                        throw new z1(androidx.privacysandbox.ads.adservices.java.internal.a.q("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    eVar.Q();
                    arrayList.add(Float.valueOf(fC));
                    arrayList.add(Float.valueOf(fC2));
                }
                m0Var.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    m0Var.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void j(x0 x0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iC = coil3.compose.internal.f.c(attributes, i);
                if (iC == 0) {
                    c cVar = new c(strTrim);
                    ArrayList arrayList = null;
                    while (!cVar.q()) {
                        String strF = cVar.F();
                        if (strF != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strF);
                            cVar.R();
                        }
                    }
                    x0Var.g = arrayList;
                } else if (iC != 72) {
                    if (x0Var.e == null) {
                        x0Var.e = new r0();
                    }
                    C(x0Var.e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strG = eVar.G(':', false);
                        eVar.R();
                        if (!eVar.m(':')) {
                            break;
                        }
                        eVar.R();
                        String strG2 = eVar.G(';', true);
                        if (strG2 == null) {
                            break;
                        }
                        eVar.R();
                        if (eVar.q() || eVar.m(';')) {
                            if (x0Var.f == null) {
                                x0Var.f = new r0();
                            }
                            C(x0Var.f, strG, strG2);
                            eVar.R();
                        }
                    }
                }
            }
        }
    }

    public static void k(m1 m1Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iC = coil3.compose.internal.f.c(attributes, i);
            if (iC == 9) {
                m1Var.p = t(strTrim);
            } else if (iC == 10) {
                m1Var.q = t(strTrim);
            } else if (iC == 82) {
                m1Var.n = t(strTrim);
            } else if (iC == 83) {
                m1Var.o = t(strTrim);
            }
        }
    }

    public static void l(b0 b0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (f2.a(attributes.getLocalName(i)) == f2.z) {
                b0Var.k(z(attributes.getValue(i)));
            }
        }
    }

    public static void m(d1 d1Var, Attributes attributes) throws z1 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iC = coil3.compose.internal.f.c(attributes, i);
            if (iC == 48) {
                x(d1Var, strTrim);
            } else if (iC != 80) {
                continue;
            } else {
                androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(strTrim);
                eVar.R();
                float fC = eVar.C();
                eVar.Q();
                float fC2 = eVar.C();
                eVar.Q();
                float fC3 = eVar.C();
                eVar.Q();
                float fC4 = eVar.C();
                if (Float.isNaN(fC) || Float.isNaN(fC2) || Float.isNaN(fC3) || Float.isNaN(fC4)) {
                    androidx.transition.k.o("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (fC3 < 0.0f) {
                    androidx.transition.k.o("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (fC4 < 0.0f) {
                        androidx.transition.k.o("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    d1Var.o = new androidx.compose.ui.geometry.a(fC, fC2, fC3, fC4);
                }
            }
        }
    }

    public static u n(String str) throws z1 {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            androidx.media3.exoplayer.upstream.h hVar = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j2 * 16;
                                i = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j2 * 16;
                                i = cCharAt - 'a';
                            }
                            j2 = j + ((long) i) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j2 <= 4294967295L) {
                            i2++;
                        }
                    }
                    if (i2 != 1) {
                        hVar = new androidx.media3.exoplayer.upstream.h(j2, i2);
                    }
                }
            }
            if (hVar == null) {
                throw new z1("Bad hex colour value: ".concat(str));
            }
            long j3 = hVar.b;
            int i3 = hVar.a;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new u(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new u(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new z1("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new u((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new u((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(str.substring(zStartsWith ? 5 : 4));
            eVar.R();
            float fC = eVar.C();
            if (!Float.isNaN(fC) && eVar.m('%')) {
                fC = (fC * 256.0f) / 100.0f;
            }
            float fK = eVar.k(fC);
            if (!Float.isNaN(fK) && eVar.m('%')) {
                fK = (fK * 256.0f) / 100.0f;
            }
            float fK2 = eVar.k(fK);
            if (!Float.isNaN(fK2) && eVar.m('%')) {
                fK2 = (fK2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                eVar.R();
                if (Float.isNaN(fK2) || !eVar.m(')')) {
                    throw new z1("Bad rgb() colour value: ".concat(str));
                }
                return new u((b(fC) << 16) | (-16777216) | (b(fK) << 8) | b(fK2));
            }
            float fK3 = eVar.k(fK2);
            eVar.R();
            if (Float.isNaN(fK3) || !eVar.m(')')) {
                throw new z1("Bad rgba() colour value: ".concat(str));
            }
            return new u((b(fK3 * 256.0f) << 24) | (b(fC) << 16) | (b(fK) << 8) | b(fK2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) b2.a.get(lowerCase);
            if (num != null) {
                return new u(num.intValue());
            }
            throw new z1("Invalid colour keyword: ".concat(lowerCase));
        }
        androidx.compose.ui.text.android.selection.e eVar2 = new androidx.compose.ui.text.android.selection.e(str.substring(zStartsWith2 ? 5 : 4));
        eVar2.R();
        float fC2 = eVar2.C();
        float fK4 = eVar2.k(fC2);
        if (!Float.isNaN(fK4)) {
            eVar2.m('%');
        }
        float fK5 = eVar2.k(fK4);
        if (!Float.isNaN(fK5)) {
            eVar2.m('%');
        }
        if (!zStartsWith2) {
            eVar2.R();
            if (Float.isNaN(fK5) || !eVar2.m(')')) {
                throw new z1("Bad hsl() colour value: ".concat(str));
            }
            return new u(d(fC2, fK4, fK5) | (-16777216));
        }
        float fK6 = eVar2.k(fK5);
        eVar2.R();
        if (Float.isNaN(fK6) || !eVar2.m(')')) {
            throw new z1("Bad hsla() colour value: ".concat(str));
        }
        return new u((b(fK6 * 256.0f) << 24) | d(fC2, fK4, fK5));
    }

    public static float o(int i, String str) throws z1 {
        float fA = new p().a(0, i, str);
        if (Float.isNaN(fA)) {
            throw new z1(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Invalid float value: ", str));
        }
        return fA;
    }

    public static float p(String str) throws z1 {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        androidx.transition.k.o("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList q(String str) {
        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(str);
        ArrayList arrayList = null;
        do {
            String strE = eVar.E();
            if (strE == null) {
                strE = eVar.G(',', true);
            }
            if (strE == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strE);
            eVar.Q();
        } while (!eVar.q());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static d0 s(String str) throws z1 {
        int iM;
        if (str.length() == 0) {
            androidx.transition.k.o("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iM = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iM = coil3.compose.internal.f.m(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new z1("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iM = 1;
        }
        try {
            return new d0(iM, o(length, str));
        } catch (NumberFormatException e) {
            throw new z1("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList t(String str) throws z1 {
        if (str.length() == 0) {
            androidx.transition.k.o("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(str);
        eVar.R();
        while (!eVar.q()) {
            float fC = eVar.C();
            if (Float.isNaN(fC)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) eVar.d;
                int i = eVar.b;
                while (!eVar.q() && !androidx.compose.ui.text.android.selection.e.z(str2.charAt(eVar.b))) {
                    eVar.b++;
                }
                String strSubstring = str2.substring(i, eVar.b);
                eVar.b = i;
                sb.append(strSubstring);
                throw new z1(sb.toString());
            }
            int iH = eVar.H();
            if (iH == 0) {
                iH = 1;
            }
            arrayList.add(new d0(iH, fC));
            eVar.Q();
        }
        return arrayList;
    }

    public static d0 u(androidx.compose.ui.text.android.selection.e eVar) {
        return eVar.n(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) ? new d0(0.0f) : eVar.D();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f = 0.0f;
            if (fP < 0.0f) {
                fP = f;
            } else {
                f = 1.0f;
                if (fP > 1.0f) {
                    fP = f;
                }
            }
            return Float.valueOf(fP);
        } catch (z1 unused) {
            return null;
        }
    }

    public static a1 w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        a1 a1VarN = u.z;
        v vVar = v.e;
        a1 a1Var = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return a1VarN;
            }
            if (str.equals("currentColor")) {
                return vVar;
            }
            try {
                return n(str);
            } catch (z1 unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new i0(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    a1VarN = vVar;
                } else {
                    try {
                        a1VarN = n(strTrim2);
                    } catch (z1 unused2) {
                        a1VarN = null;
                    }
                }
            }
            a1Var = a1VarN;
        }
        return new i0(strTrim, a1Var);
    }

    public static void x(b1 b1Var, String str) throws z1 {
        int i;
        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(str);
        eVar.R();
        String strF = eVar.F();
        if ("defer".equals(strF)) {
            eVar.R();
            strF = eVar.F();
        }
        q qVar = (q) a2.a.get(strF);
        eVar.R();
        if (eVar.q()) {
            i = 0;
        } else {
            String strF2 = eVar.F();
            strF2.getClass();
            if (strF2.equals("meet")) {
                i = 1;
            } else {
                if (!strF2.equals("slice")) {
                    throw new z1("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        b1Var.n = new r(qVar, i);
    }

    public static HashMap y(androidx.compose.ui.text.android.selection.e eVar) {
        HashMap map = new HashMap();
        eVar.R();
        String strG = eVar.G('=', false);
        while (strG != null) {
            eVar.m('=');
            map.put(strG, eVar.E());
            eVar.R();
            strG = eVar.G('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws z1 {
        Matrix matrix = new Matrix();
        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(str);
        eVar.R();
        while (!eVar.q()) {
            String str2 = (String) eVar.d;
            String strSubstring = null;
            if (!eVar.q()) {
                int i = eVar.b;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = eVar.h();
                    }
                }
                int i2 = eVar.b;
                while (androidx.compose.ui.text.android.selection.e.z(iCharAt)) {
                    iCharAt = eVar.h();
                }
                if (iCharAt == 40) {
                    eVar.b++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    eVar.b = i;
                }
            }
            if (strSubstring == null) {
                throw new z1("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    eVar.R();
                    float fC = eVar.C();
                    eVar.Q();
                    float fC2 = eVar.C();
                    eVar.Q();
                    float fC3 = eVar.C();
                    eVar.Q();
                    float fC4 = eVar.C();
                    eVar.Q();
                    float fC5 = eVar.C();
                    eVar.Q();
                    float fC6 = eVar.C();
                    eVar.R();
                    if (Float.isNaN(fC6) || !eVar.m(')')) {
                        throw new z1("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fC, fC3, fC5, fC2, fC4, fC6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    eVar.R();
                    float fC7 = eVar.C();
                    float fM = eVar.M();
                    float fM2 = eVar.M();
                    eVar.R();
                    if (Float.isNaN(fC7) || !eVar.m(')')) {
                        throw new z1("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fM)) {
                        matrix.preRotate(fC7);
                    } else {
                        if (Float.isNaN(fM2)) {
                            throw new z1("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fC7, fM, fM2);
                    }
                    break;
                    break;
                case "scale":
                    eVar.R();
                    float fC8 = eVar.C();
                    float fM3 = eVar.M();
                    eVar.R();
                    if (Float.isNaN(fC8) || !eVar.m(')')) {
                        throw new z1("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM3)) {
                        matrix.preScale(fC8, fM3);
                    } else {
                        matrix.preScale(fC8, fC8);
                    }
                    break;
                    break;
                case "skewX":
                    eVar.R();
                    float fC9 = eVar.C();
                    eVar.R();
                    if (Float.isNaN(fC9) || !eVar.m(')')) {
                        throw new z1("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fC9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    eVar.R();
                    float fC10 = eVar.C();
                    eVar.R();
                    if (Float.isNaN(fC10) || !eVar.m(')')) {
                        throw new z1("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fC10)));
                    break;
                    break;
                case "translate":
                    eVar.R();
                    float fC11 = eVar.C();
                    float fM4 = eVar.M();
                    eVar.R();
                    if (Float.isNaN(fC11) || !eVar.m(')')) {
                        throw new z1("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM4)) {
                        matrix.preTranslate(fC11, fM4);
                    } else {
                        matrix.preTranslate(fC11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new z1(androidx.privacysandbox.ads.adservices.java.internal.a.q("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (eVar.q()) {
                return matrix;
            }
            eVar.Q();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws z1 {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            e2 e2Var = new e2(this);
            xMLReader.setContentHandler(e2Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", e2Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new z1("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new z1("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new z1("SVG parse error", e3);
        }
    }

    public final void B(InputStream inputStream) throws z1 {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                h2 h2Var = new h2();
                h2Var.a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        D();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(xmlPullParserNewPullParser.getText());
                        String strF = eVar.F();
                        y(eVar);
                        strF.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((s0) this.a.y) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        E(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, h2Var);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        G(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        F(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e) {
                throw new z1("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new z1("XML parser problem", e2);
        }
    }

    public final void D() {
        androidx.appcompat.widget.c2 c2Var = new androidx.appcompat.widget.c2(26, false);
        c2Var.y = null;
        c2Var.z = new m(0);
        c2Var.A = new HashMap();
        this.a = c2Var;
    }

    /* JADX WARN: Code duplicated, block: B:455:0x0912  */
    /* JADX WARN: Code duplicated, block: B:458:0x0919  */
    /* JADX WARN: Code duplicated, block: B:827:0x0955 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:834:0x0939 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void E(String str, String str2, String str3, Attributes attributes) throws z1 {
        int i;
        int iIntValue;
        float fC;
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        char cCharAt;
        boolean z;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            g2 g2Var = (g2) g2.B.get(str2.length() > 0 ? str2 : str3);
            if (g2Var == null) {
                g2Var = g2.A;
            }
            int i3 = 0;
            switch (g2Var.ordinal()) {
                case 0:
                    s0 s0Var = new s0();
                    s0Var.a = this.a;
                    s0Var.b = this.b;
                    g(s0Var, attributes);
                    j(s0Var, attributes);
                    f(s0Var, attributes);
                    m(s0Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim = attributes.getValue(i3).trim();
                        int iC = coil3.compose.internal.f.c(attributes, i3);
                        if (iC == 25) {
                            d0 d0VarS = s(strTrim);
                            s0Var.s = d0VarS;
                            if (d0VarS.f()) {
                                androidx.transition.k.o("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (iC != 79) {
                            switch (iC) {
                                case Token.EXP /* 81 */:
                                    d0 d0VarS2 = s(strTrim);
                                    s0Var.r = d0VarS2;
                                    if (d0VarS2.f()) {
                                        androidx.transition.k.o("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case Token.DEFAULTNAMESPACE /* 82 */:
                                    s0Var.p = s(strTrim);
                                    break;
                                case Token.ESCXMLATTR /* 83 */:
                                    s0Var.q = s(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                    }
                    v0 v0Var = this.b;
                    if (v0Var == null) {
                        this.a.y = s0Var;
                    } else {
                        v0Var.b(s0Var);
                    }
                    this.b = s0Var;
                    return;
                case 1:
                case 7:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    a0 a0Var = new a0();
                    a0Var.a = this.a;
                    a0Var.b = this.b;
                    g(a0Var, attributes);
                    j(a0Var, attributes);
                    l(a0Var, attributes);
                    f(a0Var, attributes);
                    this.b.b(a0Var);
                    this.b = a0Var;
                    return;
                case 2:
                    v0 v0Var2 = this.b;
                    if (v0Var2 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    s sVar = new s();
                    sVar.a = this.a;
                    sVar.b = v0Var2;
                    g(sVar, attributes);
                    j(sVar, attributes);
                    l(sVar, attributes);
                    f(sVar, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim2 = attributes.getValue(i3).trim();
                        int iC2 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC2 == 6) {
                            sVar.o = s(strTrim2);
                        } else if (iC2 == 7) {
                            sVar.p = s(strTrim2);
                        } else if (iC2 != 49) {
                            continue;
                        } else {
                            d0 d0VarS3 = s(strTrim2);
                            sVar.q = d0VarS3;
                            if (d0VarS3.f()) {
                                androidx.transition.k.o("Invalid <circle> element. r cannot be negative");
                                return;
                            }
                        }
                        i3++;
                    }
                    this.b.b(sVar);
                    return;
                case 3:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    t tVar = new t();
                    tVar.a = this.a;
                    tVar.b = this.b;
                    g(tVar, attributes);
                    j(tVar, attributes);
                    l(tVar, attributes);
                    f(tVar, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim3 = attributes.getValue(i3).trim();
                        if (coil3.compose.internal.f.c(attributes, i3) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                tVar.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    androidx.transition.k.o("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                tVar.o = Boolean.TRUE;
                            }
                        }
                        i3++;
                    }
                    this.b.b(tVar);
                    this.b = tVar;
                    return;
                case 4:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    w wVar = new w();
                    wVar.a = this.a;
                    wVar.b = this.b;
                    g(wVar, attributes);
                    j(wVar, attributes);
                    l(wVar, attributes);
                    this.b.b(wVar);
                    this.b = wVar;
                    return;
                case 5:
                case 26:
                    this.e = true;
                    this.f = g2Var;
                    return;
                case 6:
                    v0 v0Var3 = this.b;
                    if (v0Var3 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    x xVar = new x();
                    xVar.a = this.a;
                    xVar.b = v0Var3;
                    g(xVar, attributes);
                    j(xVar, attributes);
                    l(xVar, attributes);
                    f(xVar, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim4 = attributes.getValue(i3).trim();
                        int iC3 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC3 == 6) {
                            xVar.o = s(strTrim4);
                        } else if (iC3 == 7) {
                            xVar.p = s(strTrim4);
                        } else if (iC3 == 56) {
                            d0 d0VarS4 = s(strTrim4);
                            xVar.q = d0VarS4;
                            if (d0VarS4.f()) {
                                androidx.transition.k.o("Invalid <ellipse> element. rx cannot be negative");
                                return;
                            }
                        } else if (iC3 != 57) {
                            continue;
                        } else {
                            d0 d0VarS5 = s(strTrim4);
                            xVar.r = d0VarS5;
                            if (d0VarS5.f()) {
                                androidx.transition.k.o("Invalid <ellipse> element. ry cannot be negative");
                                return;
                            }
                        }
                        i3++;
                    }
                    this.b.b(xVar);
                    return;
                case 8:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    c0 c0Var = new c0();
                    c0Var.a = this.a;
                    c0Var.b = this.b;
                    g(c0Var, attributes);
                    j(c0Var, attributes);
                    l(c0Var, attributes);
                    f(c0Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim5 = attributes.getValue(i3).trim();
                        int iC4 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC4 == 25) {
                            d0 d0VarS6 = s(strTrim5);
                            c0Var.s = d0VarS6;
                            if (d0VarS6.f()) {
                                androidx.transition.k.o("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iC4 != 26) {
                            if (iC4 != 48) {
                                switch (iC4) {
                                    case Token.EXP /* 81 */:
                                        d0 d0VarS7 = s(strTrim5);
                                        c0Var.r = d0VarS7;
                                        if (d0VarS7.f()) {
                                            androidx.transition.k.o("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case Token.DEFAULTNAMESPACE /* 82 */:
                                        c0Var.p = s(strTrim5);
                                        break;
                                    case Token.ESCXMLATTR /* 83 */:
                                        c0Var.q = s(strTrim5);
                                        break;
                                }
                            } else {
                                x(c0Var, strTrim5);
                            }
                        } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            c0Var.o = strTrim5;
                        }
                        i3++;
                    }
                    this.b.b(c0Var);
                    this.b = c0Var;
                    return;
                case 9:
                    v0 v0Var4 = this.b;
                    if (v0Var4 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    e0 e0Var = new e0();
                    e0Var.a = this.a;
                    e0Var.b = v0Var4;
                    g(e0Var, attributes);
                    j(e0Var, attributes);
                    l(e0Var, attributes);
                    f(e0Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim6 = attributes.getValue(i3).trim();
                        switch (coil3.compose.internal.f.c(attributes, i3)) {
                            case Token.ESCXMLTEXT /* 84 */:
                                e0Var.o = s(strTrim6);
                                break;
                            case Token.REF_MEMBER /* 85 */:
                                e0Var.p = s(strTrim6);
                                break;
                            case Token.REF_NS_MEMBER /* 86 */:
                                e0Var.q = s(strTrim6);
                                break;
                            case Token.REF_NAME /* 87 */:
                                e0Var.r = s(strTrim6);
                                break;
                        }
                        i3++;
                    }
                    this.b.b(e0Var);
                    return;
                case 10:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    y0 y0Var = new y0();
                    y0Var.a = this.a;
                    y0Var.b = this.b;
                    g(y0Var, attributes);
                    j(y0Var, attributes);
                    h(y0Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim7 = attributes.getValue(i3).trim();
                        switch (coil3.compose.internal.f.c(attributes, i3)) {
                            case Token.ESCXMLTEXT /* 84 */:
                                y0Var.m = s(strTrim7);
                                break;
                            case Token.REF_MEMBER /* 85 */:
                                y0Var.n = s(strTrim7);
                                break;
                            case Token.REF_NS_MEMBER /* 86 */:
                                y0Var.o = s(strTrim7);
                                break;
                            case Token.REF_NAME /* 87 */:
                                y0Var.p = s(strTrim7);
                                break;
                        }
                        i3++;
                    }
                    this.b.b(y0Var);
                    this.b = y0Var;
                    return;
                case 11:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    f0 f0Var = new f0();
                    f0Var.a = this.a;
                    f0Var.b = this.b;
                    g(f0Var, attributes);
                    j(f0Var, attributes);
                    f(f0Var, attributes);
                    m(f0Var, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim8 = attributes.getValue(i4).trim();
                        int iC5 = coil3.compose.internal.f.c(attributes, i4);
                        if (iC5 != 41) {
                            if (iC5 == 50) {
                                f0Var.q = s(strTrim8);
                            } else if (iC5 != 51) {
                                switch (iC5) {
                                    case 32:
                                        d0 d0VarS8 = s(strTrim8);
                                        f0Var.t = d0VarS8;
                                        if (d0VarS8.f()) {
                                            androidx.transition.k.o("Invalid <marker> element. markerHeight cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case Token.GETPROP /* 33 */:
                                        if ("strokeWidth".equals(strTrim8)) {
                                            f0Var.p = false;
                                        } else {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                androidx.transition.k.o("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                            f0Var.p = true;
                                        }
                                        break;
                                    case Token.GETPROPNOWARN /* 34 */:
                                        d0 d0VarS9 = s(strTrim8);
                                        f0Var.s = d0VarS9;
                                        if (d0VarS9.f()) {
                                            androidx.transition.k.o("Invalid <marker> element. markerWidth cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                }
                            } else {
                                f0Var.r = s(strTrim8);
                            }
                        } else if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(strTrim8)) {
                            f0Var.u = Float.valueOf(Float.NaN);
                        } else {
                            f0Var.u = Float.valueOf(p(strTrim8));
                        }
                    }
                    this.b.b(f0Var);
                    this.b = f0Var;
                    return;
                case 12:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    g0 g0Var = new g0();
                    g0Var.a = this.a;
                    g0Var.b = this.b;
                    g(g0Var, attributes);
                    j(g0Var, attributes);
                    f(g0Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim9 = attributes.getValue(i3).trim();
                        int iC6 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC6 == 25) {
                            d0 d0VarS10 = s(strTrim9);
                            g0Var.q = d0VarS10;
                            if (d0VarS10.f()) {
                                androidx.transition.k.o("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (iC6 != 36) {
                            if (iC6 != 37) {
                                switch (iC6) {
                                    case Token.EXP /* 81 */:
                                        d0 d0VarS11 = s(strTrim9);
                                        g0Var.p = d0VarS11;
                                        if (d0VarS11.f()) {
                                            androidx.transition.k.o("Invalid <mask> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case Token.DEFAULTNAMESPACE /* 82 */:
                                        s(strTrim9);
                                        break;
                                    case Token.ESCXMLATTR /* 83 */:
                                        s(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                g0Var.n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    androidx.transition.k.o("Invalid value for attribute maskUnits");
                                    return;
                                }
                                g0Var.n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            g0Var.o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                androidx.transition.k.o("Invalid value for attribute maskContentUnits");
                                return;
                            }
                            g0Var.o = Boolean.TRUE;
                        }
                        i3++;
                    }
                    this.b.b(g0Var);
                    this.b = g0Var;
                    return;
                case 13:
                    v0 v0Var5 = this.b;
                    if (v0Var5 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    j0 j0Var = new j0();
                    j0Var.a = this.a;
                    j0Var.b = v0Var5;
                    g(j0Var, attributes);
                    j(j0Var, attributes);
                    l(j0Var, attributes);
                    f(j0Var, attributes);
                    int i5 = 0;
                    int i6 = 0;
                    while (i6 < attributes.getLength()) {
                        String strTrim10 = attributes.getValue(i6).trim();
                        int iC7 = coil3.compose.internal.f.c(attributes, i6);
                        float f5 = 0.0f;
                        if (iC7 == 13) {
                            androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(strTrim10);
                            androidx.compose.ui.text.android.selection.e eVar2 = new androidx.compose.ui.text.android.selection.e(6, (byte) 0);
                            eVar2.b = i5;
                            eVar2.c = i5;
                            eVar2.d = new byte[8];
                            eVar2.e = new float[16];
                            if (!eVar.q() && ((iIntValue = eVar.B().intValue()) == 77 || iIntValue == 109)) {
                                float f6 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                float f9 = 0.0f;
                                float f10 = 0.0f;
                                float f11 = 0.0f;
                                while (true) {
                                    eVar.R();
                                    int i7 = Token.ASSIGN_ADD;
                                    float f12 = f5;
                                    switch (iIntValue) {
                                        case Token.ENUM_INIT_ARRAY /* 65 */:
                                        case Token.RP /* 97 */:
                                            i = i6;
                                            float fC2 = eVar.C();
                                            float fK = eVar.k(fC2);
                                            float f13 = f8;
                                            float fK2 = eVar.k(fK);
                                            Boolean boolJ = eVar.j(Float.valueOf(fK2));
                                            Boolean boolJ2 = eVar.j(boolJ);
                                            if (boolJ2 == null) {
                                                fC = Float.NaN;
                                            } else {
                                                eVar.Q();
                                                fC = eVar.C();
                                            }
                                            float f14 = fC;
                                            float fK3 = eVar.k(f14);
                                            if (Float.isNaN(fK3) || fC2 < f12 || fK < f12) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 97) {
                                                    f = f14 + f6;
                                                    fK3 += f13;
                                                } else {
                                                    f = f14;
                                                }
                                                boolean zBooleanValue = boolJ.booleanValue();
                                                boolean zBooleanValue2 = boolJ2.booleanValue();
                                                float f15 = f;
                                                float f16 = fK3;
                                                eVar2.d(fC2, fK, fK2, zBooleanValue, zBooleanValue2, f15, f16);
                                                f6 = f15;
                                                f7 = f6;
                                                f8 = f16;
                                                f9 = f8;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c && (((cCharAt = ((String) eVar.d).charAt(i2)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.ENUM_NEXT /* 67 */:
                                        case 99:
                                            i = i6;
                                            float fC3 = eVar.C();
                                            float fK4 = eVar.k(fC3);
                                            float fK5 = eVar.k(fK4);
                                            float fK6 = eVar.k(fK5);
                                            float fK7 = eVar.k(fK6);
                                            float fK8 = eVar.k(fK7);
                                            if (Float.isNaN(fK8)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 99) {
                                                    fK7 += f6;
                                                    fK8 += f8;
                                                    fC3 += f6;
                                                    fK4 += f8;
                                                    fK5 += f6;
                                                    fK6 += f8;
                                                }
                                                float f17 = fC3;
                                                f2 = fK5;
                                                f3 = fK8;
                                                f9 = fK6;
                                                float f18 = fK4;
                                                f4 = fK7;
                                                eVar2.c(f17, f18, f2, f9, f4, f3);
                                                f7 = f2;
                                                f6 = f4;
                                                f8 = f3;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.OBJECTLIT /* 72 */:
                                        case Token.ASSIGN_LOGICAL_AND /* 104 */:
                                            i = i6;
                                            float fC4 = eVar.C();
                                            if (Float.isNaN(fC4)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 104) {
                                                    fC4 += f6;
                                                }
                                                f6 = fC4;
                                                eVar2.e(f6, f8);
                                                f7 = f6;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.REF_CALL /* 76 */:
                                        case Token.ASSIGN_ADD /* 108 */:
                                            i = i6;
                                            float fC5 = eVar.C();
                                            float fK9 = eVar.k(fC5);
                                            if (Float.isNaN(fK9)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 108) {
                                                    fC5 += f6;
                                                    fK9 += f8;
                                                }
                                                f6 = fC5;
                                                f8 = fK9;
                                                eVar2.e(f6, f8);
                                                f7 = f6;
                                                f9 = f8;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.REF_SPECIAL /* 77 */:
                                        case Token.ASSIGN_SUB /* 109 */:
                                            i = i6;
                                            float fC6 = eVar.C();
                                            float fK10 = eVar.k(fC6);
                                            if (Float.isNaN(fK10)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 109 && eVar2.b != 0) {
                                                    fC6 += f6;
                                                    fK10 += f8;
                                                }
                                                f6 = fC6;
                                                f8 = fK10;
                                                eVar2.b(f6, f8);
                                                if (iIntValue != 109) {
                                                    i7 = 76;
                                                }
                                                f7 = f6;
                                                f10 = f7;
                                                f9 = f8;
                                                f11 = f9;
                                                iIntValue = i7;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.EXP /* 81 */:
                                        case Token.ASSIGN_EXP /* 113 */:
                                            i = i6;
                                            float fC7 = eVar.C();
                                            float fK11 = eVar.k(fC7);
                                            float fK12 = eVar.k(fK11);
                                            float fK13 = eVar.k(fK12);
                                            if (Float.isNaN(fK13)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 113) {
                                                    fK12 += f6;
                                                    fK13 += f8;
                                                    fC7 += f6;
                                                    fK11 += f8;
                                                }
                                                f6 = fK12;
                                                f8 = fK13;
                                                eVar2.a(fC7, fK11, f6, f8);
                                                f7 = fC7;
                                                f9 = fK11;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.ESCXMLATTR /* 83 */:
                                        case Token.HOOK /* 115 */:
                                            float f19 = (f6 * 2.0f) - f7;
                                            float f20 = (2.0f * f8) - f9;
                                            float fC8 = eVar.C();
                                            float fK14 = eVar.k(fC8);
                                            i = i6;
                                            float fK15 = eVar.k(fK14);
                                            float fK16 = eVar.k(fK15);
                                            if (Float.isNaN(fK16)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 115) {
                                                    fK15 += f6;
                                                    fK16 += f8;
                                                    fC8 += f6;
                                                    fK14 += f8;
                                                }
                                                f2 = fC8;
                                                f9 = fK14;
                                                f3 = fK16;
                                                f4 = fK15;
                                                eVar2.c(f19, f20, f2, f9, f4, f3);
                                                f7 = f2;
                                                f6 = f4;
                                                f8 = f3;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.ESCXMLTEXT /* 84 */:
                                        case Token.COLON /* 116 */:
                                            f7 = (f6 * 2.0f) - f7;
                                            f9 = (2.0f * f8) - f9;
                                            float fC9 = eVar.C();
                                            float fK17 = eVar.k(fC9);
                                            if (Float.isNaN(fK17)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                i = i6;
                                            } else {
                                                if (iIntValue == 116) {
                                                    fC9 += f6;
                                                    fK17 += f8;
                                                }
                                                f6 = fC9;
                                                f8 = fK17;
                                                eVar2.a(f7, f9, f6, f8);
                                                i = i6;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.REF_NS_MEMBER /* 86 */:
                                        case Token.AND /* 118 */:
                                            float fC10 = eVar.C();
                                            if (Float.isNaN(fC10)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                i = i6;
                                            } else {
                                                if (iIntValue == 118) {
                                                    fC10 += f8;
                                                }
                                                f8 = fC10;
                                                eVar2.e(f6, f8);
                                                i = i6;
                                                f9 = f8;
                                                eVar.Q();
                                                if (eVar.q()) {
                                                    i2 = eVar.b;
                                                    if (i2 != eVar.c) {
                                                        iIntValue = eVar.B().intValue();
                                                    }
                                                    f5 = f12;
                                                    i6 = i;
                                                }
                                            }
                                            break;
                                        case Token.TRY /* 90 */:
                                        case Token.FUNCTION /* 122 */:
                                            eVar2.close();
                                            i = i6;
                                            f6 = f10;
                                            f7 = f6;
                                            f8 = f11;
                                            f9 = f8;
                                            eVar.Q();
                                            if (eVar.q()) {
                                                i2 = eVar.b;
                                                if (i2 != eVar.c) {
                                                    iIntValue = eVar.B().intValue();
                                                }
                                                f5 = f12;
                                                i6 = i;
                                            }
                                            break;
                                        default:
                                            i = i6;
                                            break;
                                    }
                                }
                            } else {
                                i = i6;
                            }
                            j0Var.o = eVar2;
                        } else {
                            if (iC7 == 43 && p(strTrim10) < 0.0f) {
                                androidx.transition.k.o("Invalid <path> element. pathLength cannot be negative");
                                return;
                            }
                            i = i6;
                        }
                        i6 = i + 1;
                        i5 = 0;
                    }
                    this.b.b(j0Var);
                    return;
                case 14:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    l0 l0Var = new l0();
                    l0Var.a = this.a;
                    l0Var.b = this.b;
                    g(l0Var, attributes);
                    j(l0Var, attributes);
                    f(l0Var, attributes);
                    m(l0Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim11 = attributes.getValue(i3).trim();
                        int iC8 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC8 == 25) {
                            d0 d0VarS12 = s(strTrim11);
                            l0Var.v = d0VarS12;
                            if (d0VarS12.f()) {
                                androidx.transition.k.o("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (iC8 != 26) {
                            switch (iC8) {
                                case Token.NAME /* 44 */:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        l0Var.q = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            androidx.transition.k.o("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                        l0Var.q = Boolean.TRUE;
                                    }
                                    break;
                                case Token.NUMBER /* 45 */:
                                    l0Var.r = z(strTrim11);
                                    break;
                                case Token.STRING /* 46 */:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        l0Var.p = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            androidx.transition.k.o("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                        l0Var.p = Boolean.TRUE;
                                    }
                                    break;
                                default:
                                    switch (iC8) {
                                        case Token.EXP /* 81 */:
                                            d0 d0VarS13 = s(strTrim11);
                                            l0Var.u = d0VarS13;
                                            if (d0VarS13.f()) {
                                                androidx.transition.k.o("Invalid <pattern> element. width cannot be negative");
                                                return;
                                            }
                                            break;
                                            break;
                                        case Token.DEFAULTNAMESPACE /* 82 */:
                                            l0Var.s = s(strTrim11);
                                            break;
                                        case Token.ESCXMLATTR /* 83 */:
                                            l0Var.t = s(strTrim11);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            l0Var.w = strTrim11;
                        }
                        i3++;
                    }
                    this.b.b(l0Var);
                    this.b = l0Var;
                    return;
                case 15:
                    v0 v0Var6 = this.b;
                    if (v0Var6 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    n0 n0Var = new n0();
                    n0Var.a = this.a;
                    n0Var.b = v0Var6;
                    g(n0Var, attributes);
                    j(n0Var, attributes);
                    l(n0Var, attributes);
                    f(n0Var, attributes);
                    i(n0Var, attributes, "polygon");
                    this.b.b(n0Var);
                    return;
                case 16:
                    v0 v0Var7 = this.b;
                    if (v0Var7 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    m0 m0Var = new m0();
                    m0Var.a = this.a;
                    m0Var.b = v0Var7;
                    g(m0Var, attributes);
                    j(m0Var, attributes);
                    l(m0Var, attributes);
                    f(m0Var, attributes);
                    i(m0Var, attributes, "polyline");
                    this.b.b(m0Var);
                    return;
                case 17:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    c1 c1Var = new c1();
                    c1Var.a = this.a;
                    c1Var.b = this.b;
                    g(c1Var, attributes);
                    j(c1Var, attributes);
                    h(c1Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim12 = attributes.getValue(i3).trim();
                        int iC9 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC9 == 6) {
                            c1Var.m = s(strTrim12);
                        } else if (iC9 == 7) {
                            c1Var.n = s(strTrim12);
                        } else if (iC9 == 11) {
                            c1Var.p = s(strTrim12);
                        } else if (iC9 == 12) {
                            c1Var.q = s(strTrim12);
                        } else if (iC9 != 49) {
                            continue;
                        } else {
                            d0 d0VarS14 = s(strTrim12);
                            c1Var.o = d0VarS14;
                            if (d0VarS14.f()) {
                                androidx.transition.k.o("Invalid <radialGradient> element. r cannot be negative");
                                return;
                            }
                        }
                        i3++;
                    }
                    this.b.b(c1Var);
                    this.b = c1Var;
                    return;
                case 18:
                    v0 v0Var8 = this.b;
                    if (v0Var8 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    o0 o0Var = new o0();
                    o0Var.a = this.a;
                    o0Var.b = v0Var8;
                    g(o0Var, attributes);
                    j(o0Var, attributes);
                    l(o0Var, attributes);
                    f(o0Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim13 = attributes.getValue(i3).trim();
                        int iC10 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC10 == 25) {
                            d0 d0VarS15 = s(strTrim13);
                            o0Var.r = d0VarS15;
                            if (d0VarS15.f()) {
                                androidx.transition.k.o("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (iC10 == 56) {
                            d0 d0VarS16 = s(strTrim13);
                            o0Var.s = d0VarS16;
                            if (d0VarS16.f()) {
                                androidx.transition.k.o("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (iC10 != 57) {
                            switch (iC10) {
                                case Token.EXP /* 81 */:
                                    d0 d0VarS17 = s(strTrim13);
                                    o0Var.q = d0VarS17;
                                    if (d0VarS17.f()) {
                                        androidx.transition.k.o("Invalid <rect> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case Token.DEFAULTNAMESPACE /* 82 */:
                                    o0Var.o = s(strTrim13);
                                    break;
                                case Token.ESCXMLATTR /* 83 */:
                                    o0Var.p = s(strTrim13);
                                    break;
                            }
                        } else {
                            d0 d0VarS18 = s(strTrim13);
                            o0Var.t = d0VarS18;
                            if (d0VarS18.f()) {
                                androidx.transition.k.o("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                        i3++;
                    }
                    this.b.b(o0Var);
                    return;
                case 19:
                    v0 v0Var9 = this.b;
                    if (v0Var9 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    p0 p0Var = new p0();
                    p0Var.a = this.a;
                    p0Var.b = v0Var9;
                    g(p0Var, attributes);
                    j(p0Var, attributes);
                    this.b.b(p0Var);
                    this.b = p0Var;
                    return;
                case 20:
                    v0 v0Var10 = this.b;
                    if (v0Var10 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(v0Var10 instanceof y)) {
                        androidx.transition.k.o("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    q0 q0Var = new q0();
                    q0Var.a = this.a;
                    q0Var.b = v0Var10;
                    g(q0Var, attributes);
                    j(q0Var, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim14 = attributes.getValue(i8).trim();
                        if (coil3.compose.internal.f.c(attributes, i8) == 39) {
                            if (strTrim14.length() == 0) {
                                androidx.transition.k.o("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = strTrim14.length();
                            if (strTrim14.charAt(strTrim14.length() - 1) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float fO = o(length, strTrim14);
                                float f21 = 100.0f;
                                if (z) {
                                    fO /= 100.0f;
                                }
                                if (fO < 0.0f) {
                                    f21 = 0.0f;
                                } else if (fO <= 100.0f) {
                                    f21 = fO;
                                }
                                q0Var.h = Float.valueOf(f21);
                            } catch (NumberFormatException e) {
                                throw new z1("Invalid offset value in <stop>: ".concat(strTrim14), e);
                            }
                        }
                    }
                    this.b.b(q0Var);
                    this.b = q0Var;
                    return;
                case 21:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    while (i3 < attributes.getLength()) {
                        String strTrim15 = attributes.getValue(i3).trim();
                        int iC11 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC11 == 38) {
                            str4 = strTrim15;
                        } else if (iC11 == 77) {
                            zEquals = strTrim15.equals("text/css");
                        }
                        i3++;
                    }
                    if (zEquals) {
                        c cVar = new c(str4);
                        cVar.R();
                        for (d dVar : androidx.media3.common.audio.e.c(cVar)) {
                            if (dVar == d.e || dVar == d.y) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 22:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    e1 e1Var = new e1();
                    e1Var.a = this.a;
                    e1Var.b = this.b;
                    g(e1Var, attributes);
                    j(e1Var, attributes);
                    l(e1Var, attributes);
                    f(e1Var, attributes);
                    this.b.b(e1Var);
                    this.b = e1Var;
                    return;
                case 23:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    f1 f1Var = new f1();
                    f1Var.a = this.a;
                    f1Var.b = this.b;
                    g(f1Var, attributes);
                    j(f1Var, attributes);
                    f(f1Var, attributes);
                    m(f1Var, attributes);
                    this.b.b(f1Var);
                    this.b = f1Var;
                    return;
                case 24:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    i1 i1Var = new i1();
                    i1Var.a = this.a;
                    i1Var.b = this.b;
                    g(i1Var, attributes);
                    j(i1Var, attributes);
                    l(i1Var, attributes);
                    f(i1Var, attributes);
                    k(i1Var, attributes);
                    this.b.b(i1Var);
                    this.b = i1Var;
                    return;
                case 25:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    l1 l1Var = new l1();
                    l1Var.a = this.a;
                    l1Var.b = this.b;
                    g(l1Var, attributes);
                    j(l1Var, attributes);
                    f(l1Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim16 = attributes.getValue(i3).trim();
                        int iC12 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC12 != 26) {
                            if (iC12 == 61) {
                                l1Var.o = s(strTrim16);
                            }
                        } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            l1Var.n = strTrim16;
                        }
                        i3++;
                    }
                    this.b.b(l1Var);
                    this.b = l1Var;
                    v0 v0Var11 = l1Var.b;
                    if (v0Var11 instanceof i1) {
                        l1Var.p = (i1) v0Var11;
                        return;
                    } else {
                        l1Var.p = ((j1) v0Var11).d();
                        return;
                    }
                case 27:
                    v0 v0Var12 = this.b;
                    if (v0Var12 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(v0Var12 instanceof k1)) {
                        androidx.transition.k.o("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    g1 g1Var = new g1();
                    g1Var.a = this.a;
                    g1Var.b = this.b;
                    g(g1Var, attributes);
                    j(g1Var, attributes);
                    f(g1Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim17 = attributes.getValue(i3).trim();
                        if (coil3.compose.internal.f.c(attributes, i3) == 26 && ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3)))) {
                            g1Var.n = strTrim17;
                        }
                        i3++;
                    }
                    this.b.b(g1Var);
                    v0 v0Var13 = g1Var.b;
                    if (v0Var13 instanceof i1) {
                        g1Var.o = (i1) v0Var13;
                        return;
                    } else {
                        g1Var.o = ((j1) v0Var13).d();
                        return;
                    }
                case 28:
                    v0 v0Var14 = this.b;
                    if (v0Var14 == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(v0Var14 instanceof k1)) {
                        androidx.transition.k.o("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    h1 h1Var = new h1();
                    h1Var.a = this.a;
                    h1Var.b = this.b;
                    g(h1Var, attributes);
                    j(h1Var, attributes);
                    f(h1Var, attributes);
                    k(h1Var, attributes);
                    this.b.b(h1Var);
                    this.b = h1Var;
                    v0 v0Var15 = h1Var.b;
                    if (v0Var15 instanceof i1) {
                        h1Var.r = (i1) v0Var15;
                        return;
                    } else {
                        h1Var.r = ((j1) v0Var15).d();
                        return;
                    }
                case 29:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    o1 o1Var = new o1();
                    o1Var.a = this.a;
                    o1Var.b = this.b;
                    g(o1Var, attributes);
                    j(o1Var, attributes);
                    l(o1Var, attributes);
                    f(o1Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim18 = attributes.getValue(i3).trim();
                        int iC13 = coil3.compose.internal.f.c(attributes, i3);
                        if (iC13 == 25) {
                            d0 d0VarS19 = s(strTrim18);
                            o1Var.s = d0VarS19;
                            if (d0VarS19.f()) {
                                androidx.transition.k.o("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iC13 != 26) {
                            switch (iC13) {
                                case Token.EXP /* 81 */:
                                    d0 d0VarS20 = s(strTrim18);
                                    o1Var.r = d0VarS20;
                                    if (d0VarS20.f()) {
                                        androidx.transition.k.o("Invalid <use> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case Token.DEFAULTNAMESPACE /* 82 */:
                                    o1Var.p = s(strTrim18);
                                    break;
                                case Token.ESCXMLATTR /* 83 */:
                                    o1Var.q = s(strTrim18);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            o1Var.o = strTrim18;
                        }
                        i3++;
                    }
                    this.b.b(o1Var);
                    this.b = o1Var;
                    return;
                case 30:
                    if (this.b == null) {
                        androidx.transition.k.o("Invalid document. Root element must be <svg>");
                        return;
                    }
                    p1 p1Var = new p1();
                    p1Var.a = this.a;
                    p1Var.b = this.b;
                    g(p1Var, attributes);
                    f(p1Var, attributes);
                    m(p1Var, attributes);
                    this.b.b(p1Var);
                    this.b = p1Var;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void F(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof k1) {
            a(str);
        }
    }

    public final void G(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.b instanceof k1) {
            a(new String(cArr, i, i2));
        }
    }

    public final void a(String str) {
        u0 u0Var = (u0) this.b;
        int size = u0Var.i.size();
        z0 z0Var = size == 0 ? null : (z0) u0Var.i.get(size - 1);
        if (z0Var instanceof n1) {
            n1 n1Var = (n1) z0Var;
            n1Var.c = androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), n1Var.c, str);
        } else {
            v0 v0Var = this.b;
            n1 n1Var2 = new n1();
            n1Var2.c = str;
            v0Var.b(n1Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            g2 g2Var = (g2) g2.B.get(str2);
            if (g2Var == null) {
                g2Var = g2.A;
            }
            switch (g2Var.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((z0) this.b).b;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        g2 g2Var2 = this.f;
                        if (g2Var2 == g2.z || g2Var2 == g2.e) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        androidx.media3.common.audio.e eVar = new androidx.media3.common.audio.e(1);
                        androidx.appcompat.widget.c2 c2Var = this.a;
                        c cVar = new c(string);
                        cVar.R();
                        ((m) c2Var.z).c(eVar.e(cVar));
                        this.i.setLength(0);
                    }
                    break;
            }
        }
    }
}
