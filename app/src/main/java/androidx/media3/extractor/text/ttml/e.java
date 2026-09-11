package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import android.text.TextUtils;
import androidx.core.view.r;
import androidx.media3.common.util.i;
import androidx.media3.common.util.j0;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.l;
import com.google.common.collect.h1;
import com.google.common.collect.k0;
import com.google.common.collect.k1;
import com.google.common.collect.l1;
import com.google.common.collect.n1;
import com.google.common.collect.q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l {
    public final XmlPullParserFactory e;
    public static final Pattern y = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern z = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern B = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern C = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern D = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern E = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d F = new d(30.0f, 1, 1);

    public e() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.e = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = E.matcher(attributeValue);
        if (!matcher.matches()) {
            androidx.media3.common.util.c.t("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z2 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z2 = false;
            }
            com.google.android.material.motion.a.b(i, i2, "Invalid cell resolution %s %s", z2);
            return i2;
        } catch (NumberFormatException unused) {
            androidx.media3.common.util.c.t("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) throws androidx.media3.extractor.text.f {
        Matcher matcher;
        String str2 = j0.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = A;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new androidx.media3.extractor.text.f(androidx.privacysandbox.ads.adservices.java.internal.a.m(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            androidx.media3.common.util.c.t("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new androidx.media3.extractor.text.f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.j = 3;
                break;
            case "em":
                gVar.j = 2;
                break;
            case "px":
                gVar.j = 1;
                break;
            default:
                throw new androidx.media3.extractor.text.f(androidx.privacysandbox.ads.adservices.java.internal.a.q("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.k = Float.parseFloat(strGroup2);
    }

    public static d e(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = j0.a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            com.google.android.material.motion.a.e("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        d dVar = F;
        int i2 = dVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = dVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new d(i * f, i2, i3);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, androidx.core.view.r r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.e.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, androidx.core.view.r, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap map, d dVar) throws androidx.media3.extractor.text.f {
        long j;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        g gVarH = h(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jI = -9223372036854775807L;
        long jI2 = -9223372036854775807L;
        long jI3 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jI3 = i(attributeValue, dVar);
                    break;
                case "end":
                    jI2 = i(attributeValue, dVar);
                    break;
                case "begin":
                    jI = i(attributeValue, dVar);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = j0.a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j2 = cVar.d;
            if (j2 != -9223372036854775807L) {
                if (jI != -9223372036854775807L) {
                    jI += j2;
                }
                if (jI2 != -9223372036854775807L) {
                    jI2 += j2;
                }
            }
        }
        if (jI2 != -9223372036854775807L) {
            j = jI2;
        } else {
            if (jI3 != -9223372036854775807L) {
                jI2 = jI + jI3;
            } else if (cVar != null) {
                long j3 = cVar.e;
                if (j3 != -9223372036854775807L) {
                    j = j3;
                }
            }
            j = jI2;
        }
        return new c(xmlPullParser.getName(), null, jI, j, gVarH, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x021f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0233  */
    /* JADX WARN: Code duplicated, block: B:156:0x0241  */
    /* JADX WARN: Code duplicated, block: B:159:0x024f  */
    /* JADX WARN: Code duplicated, block: B:164:0x026e  */
    /* JADX WARN: Code duplicated, block: B:166:0x027f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0285  */
    /* JADX WARN: Code duplicated, block: B:172:0x028f  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:178:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:184:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    public static g h(XmlPullParser xmlPullParser, g gVar) {
        byte b;
        int i;
        l1 l1VarN;
        l1 l1VarN2;
        l1 l1VarN3;
        String str;
        int iHashCode;
        String str2;
        int iHashCode2;
        int i2;
        b bVar;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        g gVarA = gVar;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            String attributeName = xmlPullParser.getAttributeName(i3);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b = 0;
                    break;
                case "extent":
                    b = 1;
                    break;
                case "fontFamily":
                    b = 2;
                    break;
                case "textAlign":
                    b = 3;
                    break;
                case "origin":
                    b = 4;
                    break;
                case "textDecoration":
                    b = 5;
                    break;
                case "fontWeight":
                    b = 6;
                    break;
                case "id":
                    b = 7;
                    break;
                case "ruby":
                    b = 8;
                    break;
                case "color":
                    b = 9;
                    break;
                case "shear":
                    b = 10;
                    break;
                case "textCombine":
                    b = 11;
                    break;
                case "fontSize":
                    b = 12;
                    break;
                case "textEmphasis":
                    b = 13;
                    break;
                case "rubyPosition":
                    b = 14;
                    break;
                case "backgroundColor":
                    b = 15;
                    break;
                case "multiRowAlign":
                    b = 16;
                    break;
                default:
                    b = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b) {
                case 0:
                    gVarA = a(gVarA);
                    gVarA.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    gVarA = a(gVarA);
                    gVarA.u = attributeValue;
                    break;
                case 2:
                    gVarA = a(gVarA);
                    gVarA.a = attributeValue;
                    break;
                case 3:
                    gVarA = a(gVarA);
                    String strW = com.google.common.base.b.w(attributeValue);
                    strW.getClass();
                    switch (strW) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    gVarA.o = alignment;
                    break;
                case 4:
                    gVarA = a(gVarA);
                    gVarA.t = attributeValue;
                    break;
                case 5:
                    String strW2 = com.google.common.base.b.w(attributeValue);
                    strW2.getClass();
                    switch (strW2) {
                        case "nounderline":
                            gVarA = a(gVarA);
                            gVarA.g = 0;
                            break;
                        case "underline":
                            gVarA = a(gVarA);
                            gVarA.g = 1;
                            break;
                        case "nolinethrough":
                            gVarA = a(gVarA);
                            gVarA.f = 0;
                            break;
                        case "linethrough":
                            gVarA = a(gVarA);
                            gVarA.f = 1;
                            break;
                    }
                    break;
                case 6:
                    gVarA = a(gVarA);
                    gVarA.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVarA = a(gVarA);
                        gVarA.l = attributeValue;
                    }
                    break;
                case 8:
                    String strW3 = com.google.common.base.b.w(attributeValue);
                    strW3.getClass();
                    switch (strW3) {
                        case "baseContainer":
                        case "base":
                            gVarA = a(gVarA);
                            gVarA.m = 2;
                            break;
                        case "container":
                            gVarA = a(gVarA);
                            gVarA.m = 1;
                            break;
                        case "delimiter":
                            gVarA = a(gVarA);
                            gVarA.m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            gVarA = a(gVarA);
                            gVarA.m = 3;
                            break;
                    }
                    break;
                case 9:
                    gVarA = a(gVarA);
                    try {
                        gVarA.b = androidx.media3.common.util.g.a(attributeValue, false);
                        gVarA.c = true;
                    } catch (IllegalArgumentException unused) {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.x("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    g gVarA2 = a(gVarA);
                    Matcher matcher = B.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            androidx.media3.common.util.c.u("TtmlParser", "Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.x("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    gVarA2.s = fMin;
                    gVarA = gVarA2;
                    break;
                case 11:
                    String strW4 = com.google.common.base.b.w(attributeValue);
                    strW4.getClass();
                    if (strW4.equals("all")) {
                        gVarA = a(gVarA);
                        gVarA.q = 1;
                    } else if (strW4.equals("none")) {
                        gVarA = a(gVarA);
                        gVarA.q = 0;
                    }
                    break;
                case 12:
                    try {
                        gVarA = a(gVarA);
                        d(attributeValue, gVarA);
                    } catch (androidx.media3.extractor.text.f unused2) {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.x("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    gVarA = a(gVarA);
                    Pattern pattern = b.d;
                    if (attributeValue == null) {
                        bVar = null;
                    } else {
                        String strW5 = com.google.common.base.b.w(attributeValue.trim());
                        if (strW5.isEmpty()) {
                            bVar = null;
                        } else {
                            String[] strArrSplit = TextUtils.split(strW5, b.d);
                            int length = strArrSplit.length;
                            k0 k0VarK = length != 0 ? length != 1 ? k0.k(strArrSplit.length, (Object[]) strArrSplit.clone()) : new n1(strArrSplit[0]) : h1.G;
                            String str4 = (String) q.j(q.n(b.h, k0VarK), "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i = -2;
                                }
                                l1VarN = q.n(b.e, k0VarK);
                                if (l1VarN.isEmpty()) {
                                    l1VarN2 = q.n(b.g, k0VarK);
                                    l1VarN3 = q.n(b.f, k0VarK);
                                    if (l1VarN2.isEmpty() || !l1VarN3.isEmpty()) {
                                        str = (String) q.j(l1VarN2, "filled");
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i4 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            str2 = (String) q.j(l1VarN3, "circle");
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i2 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i2 = 3;
                                                }
                                                bVar = new b(i2, i4, i);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i2 = 1;
                                            bVar = new b(i2, i4, i);
                                        } else {
                                            str.equals("filled");
                                        }
                                        str2 = (String) q.j(l1VarN3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            bVar = new b(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        bVar = new b(i2, i4, i);
                                    } else {
                                        bVar = new b(-1, 0, i);
                                    }
                                } else {
                                    str3 = (String) new k1(l1VarN).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i5 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        bVar = new b(i5, 0, i);
                                    } else {
                                        str3.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                                    }
                                    bVar = new b(i5, 0, i);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i = 1;
                            l1VarN = q.n(b.e, k0VarK);
                            if (l1VarN.isEmpty()) {
                                str3 = (String) new k1(l1VarN).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    bVar = new b(i5, 0, i);
                                } else {
                                    str3.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                                }
                                bVar = new b(i5, 0, i);
                            } else {
                                l1VarN2 = q.n(b.g, k0VarK);
                                l1VarN3 = q.n(b.f, k0VarK);
                                if (l1VarN2.isEmpty()) {
                                    str = (String) q.j(l1VarN2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) q.j(l1VarN3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            bVar = new b(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        bVar = new b(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) q.j(l1VarN3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        bVar = new b(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    bVar = new b(i2, i4, i);
                                } else {
                                    str = (String) q.j(l1VarN2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) q.j(l1VarN3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            bVar = new b(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        bVar = new b(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) q.j(l1VarN3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        bVar = new b(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    bVar = new b(i2, i4, i);
                                }
                            }
                        }
                    }
                    gVarA.r = bVar;
                    break;
                case 14:
                    String strW6 = com.google.common.base.b.w(attributeValue);
                    strW6.getClass();
                    if (strW6.equals("before")) {
                        gVarA = a(gVarA);
                        gVarA.n = 1;
                    } else if (strW6.equals("after")) {
                        gVarA = a(gVarA);
                        gVarA.n = 2;
                    }
                    break;
                case 15:
                    gVarA = a(gVarA);
                    try {
                        gVarA.d = androidx.media3.common.util.g.a(attributeValue, false);
                        gVarA.e = true;
                    } catch (IllegalArgumentException unused3) {
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.x("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 16:
                    gVarA = a(gVarA);
                    String strW7 = com.google.common.base.b.w(attributeValue);
                    strW7.getClass();
                    switch (strW7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    gVarA.p = alignment;
                    break;
            }
        }
        return gVarA;
    }

    public static long i(String str, d dVar) throws androidx.media3.extractor.text.f {
        double d;
        double d2;
        Matcher matcher = y.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d3 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d4 = d3 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d5 = d4 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / dVar.a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) dVar.b)) / ((double) dVar.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = z.matcher(str);
        if (!matcher2.matches()) {
            throw new androidx.media3.extractor.text.f(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d8 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d = dVar.a;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = dVar.c;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            case "ms":
                d = 1000.0d;
                d8 /= d;
                return (long) (d8 * 1000000.0d);
            default:
                return (long) (d8 * 1000000.0d);
        }
        d8 *= d2;
        return (long) (d8 * 1000000.0d);
    }

    public static r j(XmlPullParser xmlPullParser) {
        String strI = androidx.media3.common.util.c.i(xmlPullParser, "extent");
        if (strI == null) {
            return null;
        }
        Matcher matcher = D.matcher(strI);
        if (!matcher.matches()) {
            androidx.media3.common.util.c.t("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strI));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new r(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            androidx.media3.common.util.c.t("TtmlParser", "Ignoring malformed tts extent: ".concat(strI));
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.l
    public final void k(byte[] bArr, int i, int i2, k kVar, i iVar) {
        com.google.firebase.b.I(o(bArr, i, i2), kVar, iVar);
    }

    @Override // androidx.media3.extractor.text.l
    public final androidx.media3.extractor.text.d o(byte[] bArr, int i, int i2) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.e.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            r rVarJ = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVarE = F;
            int i3 = 0;
            int iC = 15;
            androidx.compose.runtime.internal.c cVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar2 = (c) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVarE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            rVarJ = j(xmlPullParserNewPullParser);
                        }
                        d dVar = dVarE;
                        r rVar = rVarJ;
                        int i4 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                f(xmlPullParserNewPullParser, map, i4, rVar, map2, map3);
                            } else {
                                try {
                                    c cVarG = g(xmlPullParserNewPullParser, cVar2, map2, dVar);
                                    arrayDeque.push(cVarG);
                                    if (cVar2 != null) {
                                        if (cVar2.m == null) {
                                            cVar2.m = new ArrayList();
                                        }
                                        cVar2.m.add(cVarG);
                                    }
                                } catch (androidx.media3.extractor.text.f e) {
                                    androidx.media3.common.util.c.u("TtmlParser", "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            iC = i4;
                            rVarJ = rVar;
                            dVarE = dVar;
                        } else {
                            androidx.media3.common.util.c.k("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i3++;
                        iC = i4;
                        rVarJ = rVar;
                        dVarE = dVar;
                    } else if (eventType == 4) {
                        cVar2.getClass();
                        c cVarA = c.a(xmlPullParserNewPullParser.getText());
                        if (cVar2.m == null) {
                            cVar2.m = new ArrayList();
                        }
                        cVar2.m.add(cVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            c cVar3 = (c) arrayDeque.peek();
                            cVar3.getClass();
                            cVar = new androidx.compose.runtime.internal.c(cVar3, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            cVar.getClass();
            return cVar;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // androidx.media3.extractor.text.l
    public final int z() {
        return 1;
    }
}
