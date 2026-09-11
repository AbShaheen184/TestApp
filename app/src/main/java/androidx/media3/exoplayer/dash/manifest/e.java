package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.platform.t1;
import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.common.w;
import com.app.mlounge.emulator.LibretroCore;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Token;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends DefaultHandler implements androidx.media3.exoplayer.upstream.p {
    public final XmlPullParserFactory e;
    public static final Pattern y = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern z = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] B = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] C = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public e() {
        try {
            this.e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = j0.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new q(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0093 A[PHI: r13
  0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01a3, B:120:0x0190, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    public static int c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 5;
        byte b = 4;
        int i2 = 0;
        int i3 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount > 0 && iBitCount < 33) {
                    i3 = iBitCount;
                    break;
                }
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int i4 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & i4) == 0) {
                        iBitCount = 0;
                        while (true) {
                            int[] iArr = B;
                            if (i2 < iArr.length) {
                                iBitCount += ((i4 >> i2) & 1) * iArr[i2];
                                i2++;
                            } else if (iBitCount != 0) {
                                i3 = iBitCount;
                            }
                        }
                    } else {
                        String[] strArrB0 = j0.b0(str);
                        if (strArrB0.length != 0) {
                            List listD = t1.b('.').d(com.google.common.base.b.w(strArrB0[0].trim()));
                            if (listD.size() == 4 && ((String) listD.get(0)).equals("ac-4")) {
                                String str2 = (String) listD.get(3);
                                str2.getClass();
                                if (str2.equals("03")) {
                                    i3 = 18;
                                } else if (str2.equals("04")) {
                                    i3 = 21;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
                if (attributeValue4 != null) {
                    i3 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
                if (attributeValue5 != null) {
                    String strW = com.google.common.base.b.w(attributeValue5);
                    strW.getClass();
                    switch (strW.hashCode()) {
                        case 1596796:
                            b = !strW.equals("4000") ? (byte) -1 : (byte) 0;
                            break;
                        case 2937391:
                            b = !strW.equals("a000") ? (byte) -1 : (byte) 1;
                            break;
                        case 3094034:
                            b = !strW.equals("f800") ? (byte) -1 : (byte) 2;
                            break;
                        case 3094035:
                            b = !strW.equals("f801") ? (byte) -1 : (byte) 3;
                            break;
                        case 3133436:
                            if (!strW.equals("fa01")) {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i = 6;
                            break;
                        case 4:
                            i = 8;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = -1;
                }
                i3 = i;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
                int i5 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (i5 >= 0) {
                    int[] iArr2 = C;
                    if (i5 < iArr2.length) {
                        i3 = iArr2[i5];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue7 = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
                if (attributeValue7 != null && (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue7, 16))) != 0) {
                    i3 = iBitCount;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!androidx.media3.common.util.c.l(xmlPullParser, "AudioChannelConfiguration"));
        return i3;
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z2) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z2 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!androidx.media3.common.util.c.l(xmlPullParser, "BaseURL"));
        if (text != null && androidx.media3.common.util.c.j(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return com.google.common.collect.q.p(new b(text, i, attributeValue3, i2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            b bVar = (b) arrayList.get(i3);
            String strQ = androidx.media3.common.util.c.q(bVar.a, text);
            String str = attributeValue3 == null ? strQ : attributeValue3;
            if (z2) {
                i = bVar.c;
                i2 = bVar.d;
                str = bVar.b;
            }
            arrayList2.add(new b(strQ, i, str, i2));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x013f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static Pair f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? A2;
        UUID uuid3;
        String attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strW = com.google.common.base.b.w(attributeValue3);
            strW.getClass();
            switch (strW) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = androidx.media3.common.g.c;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A2 = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = androidx.media3.common.g.e;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A2 = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = androidx.media3.common.g.d;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A2 = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            attributeValue2 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue2 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue2) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue2)) {
                        String[] strArrSplit = attributeValue2.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            uuidArr[i2] = UUID.fromString(strArrSplit[i2]);
                        }
                        uuid = androidx.media3.common.g.b;
                        text = 0;
                        A2 = androidx.media3.extractor.mp4.q.a(uuid, uuidArr, null);
                        break;
                    } else {
                        androidx.media3.common.util.c.t("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        A2 = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    A2 = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            A2 = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((androidx.media3.common.util.c.n(xmlPullParser, "clearkey:Laurl") || androidx.media3.common.util.c.n(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                A2 = A2;
                text = xmlPullParser.getText();
            } else if (androidx.media3.common.util.c.n(xmlPullParser, "ms:laurl")) {
                A2 = A2;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (A2 == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    t tVarH = androidx.media3.extractor.mp4.q.h(bArrDecode);
                    UUID uuid4 = tVarH == null ? null : (UUID) tVarH.y;
                    if (uuid4 == null) {
                        androidx.media3.common.util.c.t("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        A2 = 0;
                        text = text;
                    } else {
                        UUID uuid5 = uuid4;
                        A2 = bArrDecode;
                        uuid = uuid5;
                        text = text;
                    }
                } else if (A2 == 0) {
                    uuid3 = androidx.media3.common.g.e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        A2 = A2;
                        text = text;
                    } else {
                        b(xmlPullParser);
                        A2 = A2;
                        text = text;
                    }
                } else {
                    b(xmlPullParser);
                    A2 = A2;
                    text = text;
                }
            } else if (A2 == 0) {
                uuid3 = androidx.media3.common.g.e;
                if (!uuid3.equals(uuid) && androidx.media3.common.util.c.n(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    A2 = androidx.media3.extractor.mp4.q.a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    b(xmlPullParser);
                    A2 = A2;
                    text = text;
                }
            } else {
                b(xmlPullParser);
                A2 = A2;
                text = text;
            }
        } while (!androidx.media3.common.util.c.l(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new androidx.media3.common.l(uuid, text, "video/mp4", A2) : null);
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, ES6Iterator.VALUE_PROPERTY);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!androidx.media3.common.util.c.l(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = j0.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static float k(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = y.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
            }
        }
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:299:0x091b  */
    /* JADX WARN: Code duplicated, block: B:301:0x0922  */
    /* JADX WARN: Code duplicated, block: B:303:0x0928  */
    /* JADX WARN: Code duplicated, block: B:304:0x092d  */
    /* JADX WARN: Code duplicated, block: B:309:0x093a  */
    /* JADX WARN: Code duplicated, block: B:312:0x0948  */
    /* JADX WARN: Code duplicated, block: B:314:0x0954  */
    /* JADX WARN: Code duplicated, block: B:315:0x0957  */
    /* JADX WARN: Code duplicated, block: B:318:0x0960  */
    /* JADX WARN: Code duplicated, block: B:321:0x096c  */
    /* JADX WARN: Code duplicated, block: B:323:0x0982  */
    /* JADX WARN: Code duplicated, block: B:325:0x098a  */
    /* JADX WARN: Code duplicated, block: B:334:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:336:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:339:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:341:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:342:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:344:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:348:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:350:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:352:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:353:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:364:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:366:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:371:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:377:0x0a72 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:378:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:382:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:390:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:393:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:394:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:397:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:398:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:401:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:404:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:405:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:406:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:407:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:408:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:409:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:414:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:416:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:418:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:429:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:430:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:433:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:434:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:437:0x0b84  */
    /* JADX WARN: Code duplicated, block: B:438:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:440:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:441:0x0ba4  */
    /* JADX WARN: Code duplicated, block: B:443:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:445:0x0bb4  */
    /* JADX WARN: Code duplicated, block: B:448:0x0bbc  */
    /* JADX WARN: Code duplicated, block: B:450:0x0bce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:456:0x0bf5  */
    /* JADX WARN: Code duplicated, block: B:458:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:461:0x0c05  */
    /* JADX WARN: Code duplicated, block: B:463:0x0c17 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:469:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:471:0x0c3f  */
    /* JADX WARN: Code duplicated, block: B:473:0x0c45  */
    /* JADX WARN: Code duplicated, block: B:476:0x0c50  */
    /* JADX WARN: Code duplicated, block: B:477:0x0c53  */
    /* JADX WARN: Code duplicated, block: B:480:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0c73  */
    /* JADX WARN: Code duplicated, block: B:486:0x0c8b  */
    /* JADX WARN: Code duplicated, block: B:488:0x0c8f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:489:0x0c91  */
    /* JADX WARN: Code duplicated, block: B:490:0x0c93  */
    /* JADX WARN: Code duplicated, block: B:493:0x0cb8 A[LOOP:11: B:252:0x06b7->B:493:0x0cb8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:527:0x0e74  */
    /* JADX WARN: Code duplicated, block: B:532:0x0e8f  */
    /* JADX WARN: Code duplicated, block: B:535:0x0e9b  */
    /* JADX WARN: Code duplicated, block: B:538:0x0eae  */
    /* JADX WARN: Code duplicated, block: B:541:0x0eb6  */
    /* JADX WARN: Code duplicated, block: B:550:0x0edf  */
    /* JADX WARN: Code duplicated, block: B:553:0x0ee7  */
    /* JADX WARN: Code duplicated, block: B:558:0x0f0e  */
    /* JADX WARN: Code duplicated, block: B:562:0x0f21  */
    /* JADX WARN: Code duplicated, block: B:565:0x0f2c  */
    /* JADX WARN: Code duplicated, block: B:568:0x0f34  */
    /* JADX WARN: Code duplicated, block: B:585:0x0f72  */
    /* JADX WARN: Code duplicated, block: B:588:0x0f8c  */
    /* JADX WARN: Code duplicated, block: B:589:0x0f94  */
    /* JADX WARN: Code duplicated, block: B:591:0x0f98  */
    /* JADX WARN: Code duplicated, block: B:596:0x0fdf A[LOOP:5: B:159:0x0411->B:596:0x0fdf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:708:0x1391  */
    /* JADX WARN: Code duplicated, block: B:710:0x1395  */
    /* JADX WARN: Code duplicated, block: B:712:0x1399 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:714:0x139c  */
    /* JADX WARN: Code duplicated, block: B:718:0x13aa  */
    /* JADX WARN: Code duplicated, block: B:720:0x13ba  */
    /* JADX WARN: Code duplicated, block: B:722:0x13c1 A[LOOP:1: B:45:0x00cd->B:722:0x13c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:724:0x0b1c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x0fae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x138d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x0e63 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x0ed5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x0f67 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x0915 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x099f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:0x0a12 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x0a09 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x0a36 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:0x0b3a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x0b35 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:0x0c3b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x0bf0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:0x0c3b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:0x0c38 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static c l(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        int i;
        boolean z2;
        int i2;
        int i3;
        long j;
        long j2;
        long j3;
        ArrayList arrayList;
        String str;
        String str2;
        ArrayList arrayList2;
        long j4;
        String str3;
        long j5;
        long j6;
        String str4;
        long j7;
        ByteArrayOutputStream byteArrayOutputStream;
        String str5;
        String str6;
        ByteArrayOutputStream byteArrayOutputStream2;
        ArrayList arrayList3;
        long j8;
        String str7;
        ArrayList arrayList4;
        String str8;
        String str9;
        String str10;
        long j9;
        String str11;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j10;
        String str12;
        int i4;
        int i5;
        String str13;
        int i6;
        float f;
        int i7;
        String str14;
        long j11;
        long j12;
        long j13;
        ArrayList arrayList7;
        long j14;
        ArrayList arrayList8;
        s sVarR;
        int i8;
        String str15;
        String strE;
        String str16;
        ArrayList arrayList9;
        String str17;
        androidx.media3.common.h hVar;
        int i9;
        int i10;
        ArrayList arrayList10;
        int i11;
        int iN;
        int i12;
        int i13;
        ArrayList arrayList11;
        int i14;
        ArrayList arrayList12;
        Pair pairCreate;
        androidx.media3.common.q qVar;
        int iIntValue;
        int iIntValue2;
        int i15;
        int i16;
        int i17;
        String str18;
        int i18;
        int i19;
        String str19;
        s rVar;
        ArrayList arrayList13;
        int i20;
        int i21;
        boolean z3;
        f fVar;
        String str20;
        String[] strArrSplit;
        f fVar2;
        int i22;
        String str21;
        String str22;
        int i23;
        int iN2;
        f fVar3;
        f fVar4;
        String str23;
        int i24;
        String str24;
        int i25;
        int i26;
        String str25;
        ArrayList arrayList14;
        int i27;
        ArrayList arrayList15;
        androidx.media3.common.q qVarA;
        String str26;
        String str27;
        ArrayList arrayList16;
        long j15;
        String str28;
        ArrayList arrayList17;
        androidx.media3.common.r rVar2;
        h0 h0Var;
        s sVar;
        m kVar;
        int i28;
        String str29;
        int i29;
        androidx.media3.common.l lVar;
        int size;
        androidx.media3.common.l lVar2;
        int i30;
        androidx.media3.common.l lVar3;
        androidx.media3.common.l lVar4;
        long j16;
        int i31 = 0;
        String[] strArrSplit2 = new String[0];
        String str30 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit2 = attributeValue.split(",");
        }
        int length = strArrSplit2.length;
        int i32 = 0;
        while (true) {
            i = 1;
            if (i32 >= length) {
                z2 = false;
                break;
            }
            if (strArrSplit2[i32].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z2 = true;
                break;
            }
            i32++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j17 = -9223372036854775807L;
        long jT = attributeValue2 == null ? -9223372036854775807L : j0.T(attributeValue2);
        long jI = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jI2 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jI3 = zEquals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jI4 = zEquals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jI5 = zEquals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long jT2 = attributeValue3 == null ? -9223372036854775807L : j0.T(attributeValue3);
        long jD = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListP = com.google.common.collect.q.p(new b(uri.toString(), z2 ? 1 : Integer.MIN_VALUE, uri.toString(), 1));
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        long j18 = zEquals ? -9223372036854775807L : 0L;
        int i33 = 0;
        int i34 = 0;
        i iVar = null;
        u uVar = null;
        Uri uriR = null;
        w wVar = null;
        while (true) {
            xmlPullParser.next();
            String str31 = "BaseURL";
            if (androidx.media3.common.util.c.n(xmlPullParser, "BaseURL")) {
                if (i33 == 0) {
                    jD = d(xmlPullParser, jD);
                    i33 = i;
                }
                arrayList19.addAll(e(xmlPullParser, arrayListP, z2));
                arrayListP = arrayListP;
                arrayList19 = arrayList19;
                j18 = j18;
                i2 = i31;
                i3 = i;
                j2 = j17;
            } else {
                i2 = i31;
                i3 = i;
                String str32 = "lang";
                if (androidx.media3.common.util.c.n(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str30, "moreInformationURL");
                    String str33 = attributeValue4 == null ? str30 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str30, "lang");
                    String str34 = attributeValue5 == null ? str30 : attributeValue5;
                    String strNextText = str30;
                    String strNextText2 = strNextText;
                    String strNextText3 = strNextText2;
                    while (true) {
                        xmlPullParser.next();
                        long j19 = j17;
                        if (androidx.media3.common.util.c.n(xmlPullParser, "Title")) {
                            strNextText = xmlPullParser.nextText();
                        } else if (androidx.media3.common.util.c.n(xmlPullParser, "Source")) {
                            strNextText2 = xmlPullParser.nextText();
                        } else if (androidx.media3.common.util.c.n(xmlPullParser, "Copyright")) {
                            strNextText3 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str35 = strNextText;
                        String str36 = strNextText2;
                        String str37 = strNextText3;
                        if (androidx.media3.common.util.c.l(xmlPullParser, "ProgramInformation")) {
                            arrayListP = arrayListP;
                            iVar = new i(str35, str36, str37, str33, str34);
                            j2 = j19;
                            j = jI4;
                        } else {
                            strNextText = str35;
                            strNextText2 = str36;
                            strNextText3 = str37;
                            j17 = j19;
                        }
                    }
                } else {
                    long j20 = j17;
                    if (androidx.media3.common.util.c.n(xmlPullParser, "UTCTiming")) {
                        uVar = new u(xmlPullParser.getAttributeValue(str30, "schemeIdUri"), xmlPullParser.getAttributeValue(str30, ES6Iterator.VALUE_PROPERTY));
                    } else {
                        if (androidx.media3.common.util.c.n(xmlPullParser, "Location")) {
                            uriR = androidx.media3.common.util.c.r(uri.toString(), xmlPullParser.nextText());
                        } else if (androidx.media3.common.util.c.n(xmlPullParser, "ServiceDescription")) {
                            float f2 = -3.4028235E38f;
                            float f3 = -3.4028235E38f;
                            long j21 = j20;
                            long j22 = j21;
                            long j23 = j22;
                            while (true) {
                                xmlPullParser.next();
                                if (androidx.media3.common.util.c.n(xmlPullParser, "Latency")) {
                                    arrayListP = arrayListP;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j21 = attributeValue6 == null ? j20 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j22 = attributeValue7 == null ? j20 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j23 = attributeValue8 == null ? j20 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayListP = arrayListP;
                                    if (androidx.media3.common.util.c.n(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f2 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f3 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j24 = j21;
                                long j25 = jD;
                                long j26 = j22;
                                long j27 = jI4;
                                long j28 = j23;
                                if (androidx.media3.common.util.c.l(xmlPullParser, "ServiceDescription")) {
                                    w wVar2 = new w();
                                    wVar2.a = j24;
                                    wVar2.b = j26;
                                    wVar2.c = j28;
                                    wVar2.d = f2;
                                    wVar2.e = f3;
                                    wVar = wVar2;
                                    jD = j25;
                                    j = j27;
                                    j2 = j20;
                                } else {
                                    j23 = j28;
                                    jI4 = j27;
                                    arrayListP = arrayListP;
                                    j22 = j26;
                                    jD = j25;
                                    j21 = j24;
                                }
                            }
                        } else {
                            arrayListP = arrayListP;
                            long j29 = jD;
                            long j30 = jI4;
                            if (androidx.media3.common.util.c.n(xmlPullParser, "Period") && i34 == 0) {
                                ArrayList arrayList20 = !arrayList19.isEmpty() ? arrayList19 : arrayListP;
                                String str38 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long jI6 = i(xmlPullParser, "start", j18);
                                String str39 = "duration";
                                String str40 = "schemeIdUri";
                                long j31 = jT != j20 ? jT + jI6 : j20;
                                long jI7 = i(xmlPullParser, "duration", j20);
                                ArrayList arrayList21 = new ArrayList();
                                ArrayList arrayList22 = new ArrayList();
                                ArrayList arrayList23 = new ArrayList();
                                long j32 = j20;
                                String str41 = ES6Iterator.VALUE_PROPERTY;
                                Object obj = "Period";
                                int i35 = i2;
                                long jD2 = j29;
                                s sVarR2 = null;
                                while (true) {
                                    xmlPullParser.next();
                                    if (androidx.media3.common.util.c.n(xmlPullParser, str31)) {
                                        if (i35 == 0) {
                                            jD2 = d(xmlPullParser, jD2);
                                            i35 = i3;
                                        }
                                        arrayList23.addAll(e(xmlPullParser, arrayList20, z2));
                                        arrayList = arrayList20;
                                        str4 = str38;
                                        str31 = str31;
                                        str = str39;
                                        str3 = str40;
                                        z2 = z2;
                                        j3 = jD2;
                                        str2 = str32;
                                        j = j30;
                                        j5 = j31;
                                        arrayList21 = arrayList21;
                                        arrayList22 = arrayList22;
                                        j2 = -9223372036854775807L;
                                        arrayList2 = arrayList23;
                                        arrayList19 = arrayList19;
                                        j29 = j29;
                                        j6 = jI7;
                                        j4 = j18;
                                    } else {
                                        j3 = jD2;
                                        String str42 = "SegmentTemplate";
                                        if (androidx.media3.common.util.c.n(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList23.isEmpty()) {
                                                arrayList3 = arrayList20;
                                                arrayList = arrayList3;
                                            } else {
                                                arrayList = arrayList20;
                                                arrayList3 = arrayList23;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str38);
                                            long j33 = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int iG = g(xmlPullParser);
                                            String str43 = "AdaptationSet";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            arrayList2 = arrayList23;
                                            arrayList19 = arrayList19;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            j4 = j18;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            str = str39;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "width");
                                            int i36 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            String str44 = str40;
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "height");
                                            int i37 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            float fK = k(xmlPullParser, -1.0f);
                                            String str45 = "SegmentList";
                                            String str46 = "SegmentBase";
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int i38 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, str32);
                                            String str47 = "audioSamplingRate";
                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList24 = new ArrayList();
                                            String str48 = attributeValue21;
                                            ArrayList arrayList25 = new ArrayList();
                                            ArrayList arrayList26 = arrayList24;
                                            ArrayList arrayList27 = new ArrayList();
                                            ArrayList arrayList28 = new ArrayList();
                                            float f4 = fK;
                                            ArrayList arrayList29 = new ArrayList();
                                            String str49 = "height";
                                            ArrayList arrayList30 = new ArrayList();
                                            String str50 = "width";
                                            ArrayList arrayList31 = new ArrayList();
                                            String str51 = "scte214:supplementalProfiles";
                                            ArrayList arrayList32 = new ArrayList();
                                            ArrayList arrayList33 = new ArrayList();
                                            String str52 = str38;
                                            String str53 = "mimeType";
                                            String str54 = "codecs";
                                            int i39 = i2;
                                            s sVarR3 = sVarR2;
                                            long j34 = j32;
                                            long jD3 = j3;
                                            String str55 = attributeValue20;
                                            int iC = -1;
                                            String str56 = "scte214:supplementalCodecs";
                                            int i40 = iG;
                                            String str57 = null;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (androidx.media3.common.util.c.n(xmlPullParser, str31)) {
                                                    if (i39 == 0) {
                                                        jD3 = d(xmlPullParser, jD3);
                                                        i39 = i3;
                                                    }
                                                    j8 = jD3;
                                                    arrayList33.addAll(e(xmlPullParser, arrayList3, z2));
                                                } else {
                                                    j8 = jD3;
                                                    if (androidx.media3.common.util.c.n(xmlPullParser, "ContentProtection")) {
                                                        Pair pairF = f(xmlPullParser);
                                                        Object obj2 = pairF.first;
                                                        if (obj2 != null) {
                                                            str57 = (String) obj2;
                                                        }
                                                        Object obj3 = pairF.second;
                                                        if (obj3 != null) {
                                                            arrayList25.add((androidx.media3.common.l) obj3);
                                                        }
                                                    } else if (androidx.media3.common.util.c.n(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue22 = xmlPullParser.getAttributeValue(null, str32);
                                                        if (str55 == null) {
                                                            str55 = attributeValue22;
                                                        } else if (attributeValue22 != null) {
                                                            com.google.android.material.motion.a.q(str55.equals(attributeValue22));
                                                        }
                                                        int iG2 = g(xmlPullParser);
                                                        if (i40 == -1) {
                                                            i40 = iG2;
                                                        } else if (iG2 != -1) {
                                                            com.google.android.material.motion.a.q(i40 == iG2 ? i3 : i2);
                                                        }
                                                        arrayList30 = arrayList30;
                                                        str55 = str55;
                                                        i4 = i40;
                                                        arrayList33 = arrayList33;
                                                        str12 = str32;
                                                        str42 = str42;
                                                        str8 = str56;
                                                        str9 = str54;
                                                        str10 = str53;
                                                        arrayList4 = arrayList31;
                                                        j9 = jI7;
                                                        str11 = attributeValue14;
                                                        arrayList5 = arrayList29;
                                                        j = j30;
                                                        arrayList19 = arrayList19;
                                                        arrayList6 = arrayList27;
                                                        j29 = j29;
                                                        j4 = j4;
                                                    } else {
                                                        if (androidx.media3.common.util.c.n(xmlPullParser, "Role")) {
                                                            arrayList29.add(h(xmlPullParser, "Role"));
                                                        } else {
                                                            String str58 = "AudioChannelConfiguration";
                                                            if (androidx.media3.common.util.c.n(xmlPullParser, "AudioChannelConfiguration")) {
                                                                iC = c(xmlPullParser, attributeValue14);
                                                                str55 = str55;
                                                                i4 = i40;
                                                                arrayList33 = arrayList33;
                                                                str12 = str32;
                                                                str42 = str42;
                                                                str8 = str56;
                                                                str9 = str54;
                                                                str10 = str53;
                                                                arrayList4 = arrayList31;
                                                                j9 = jI7;
                                                                str11 = attributeValue14;
                                                                arrayList5 = arrayList29;
                                                                j = j30;
                                                                arrayList19 = arrayList19;
                                                                arrayList6 = arrayList27;
                                                                j29 = j29;
                                                                j4 = j4;
                                                            } else {
                                                                String str59 = "ContentProtection";
                                                                if (androidx.media3.common.util.c.n(xmlPullParser, "Accessibility")) {
                                                                    arrayList28.add(h(xmlPullParser, "Accessibility"));
                                                                } else if (androidx.media3.common.util.c.n(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList30.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    arrayList25 = arrayList25;
                                                                    if (androidx.media3.common.util.c.n(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList31.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        arrayList28 = arrayList28;
                                                                        str12 = str32;
                                                                        j31 = j31;
                                                                        arrayList21 = arrayList21;
                                                                        arrayList22 = arrayList22;
                                                                        str42 = str42;
                                                                        str7 = str43;
                                                                        arrayList2 = arrayList2;
                                                                        str = str;
                                                                        str44 = str44;
                                                                        str45 = str45;
                                                                        str46 = str46;
                                                                        arrayList26 = arrayList26;
                                                                        f4 = f4;
                                                                        str50 = str50;
                                                                        str51 = str51;
                                                                        str52 = str52;
                                                                        j10 = j34;
                                                                        arrayList33 = arrayList33;
                                                                        arrayList4 = arrayList31;
                                                                        str8 = str56;
                                                                        str9 = str54;
                                                                        str10 = str53;
                                                                        j9 = jI7;
                                                                        str11 = attributeValue14;
                                                                        arrayList5 = arrayList29;
                                                                        j = j30;
                                                                        arrayList19 = arrayList19;
                                                                        arrayList6 = arrayList27;
                                                                        j29 = j29;
                                                                        j4 = j4;
                                                                        j9 = j9;
                                                                        j34 = j10;
                                                                        i4 = i40;
                                                                        str43 = str7;
                                                                    } else {
                                                                        String str60 = str32;
                                                                        String str61 = "Representation";
                                                                        arrayList28 = arrayList28;
                                                                        if (androidx.media3.common.util.c.n(xmlPullParser, "Representation")) {
                                                                            arrayList3 = arrayList3;
                                                                            ArrayList arrayList34 = !arrayList33.isEmpty() ? arrayList33 : arrayList3;
                                                                            String str62 = "SupplementalProperty";
                                                                            String str63 = str52;
                                                                            String str64 = "EssentialProperty";
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, str63);
                                                                            str52 = str63;
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue24 == null) {
                                                                                str13 = str53;
                                                                                i5 = -1;
                                                                            } else {
                                                                                String str65 = str53;
                                                                                i5 = Integer.parseInt(attributeValue24);
                                                                                str13 = str65;
                                                                            }
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str13);
                                                                            String str66 = str54;
                                                                            str10 = str13;
                                                                            String str67 = attributeValue25 == null ? attributeValue13 : attributeValue25;
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str66);
                                                                            String str68 = str56;
                                                                            str9 = str66;
                                                                            String str69 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str68);
                                                                            String str70 = str51;
                                                                            str8 = str68;
                                                                            String str71 = attributeValue27 == null ? attributeValue15 : attributeValue27;
                                                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str70);
                                                                            String str72 = str50;
                                                                            str51 = str70;
                                                                            str50 = str72;
                                                                            String str73 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str50);
                                                                            if (attributeValue29 == null) {
                                                                                str49 = str49;
                                                                                i6 = i36;
                                                                            } else {
                                                                                str49 = str49;
                                                                                i6 = Integer.parseInt(attributeValue29);
                                                                            }
                                                                            String attributeValue30 = xmlPullParser.getAttributeValue(null, str49);
                                                                            if (attributeValue30 == null) {
                                                                                f = f4;
                                                                                i7 = i37;
                                                                            } else {
                                                                                f = f4;
                                                                                i7 = Integer.parseInt(attributeValue30);
                                                                            }
                                                                            String str74 = "InbandEventStream";
                                                                            float fK2 = k(xmlPullParser, f);
                                                                            String str75 = str47;
                                                                            String attributeValue31 = xmlPullParser.getAttributeValue(null, str75);
                                                                            int i41 = attributeValue31 == null ? i38 : Integer.parseInt(attributeValue31);
                                                                            str47 = str75;
                                                                            ArrayList arrayList35 = new ArrayList();
                                                                            ArrayList arrayList36 = new ArrayList();
                                                                            ArrayList arrayList37 = new ArrayList(arrayList30);
                                                                            ArrayList arrayList38 = new ArrayList(arrayList31);
                                                                            ArrayList arrayList39 = new ArrayList();
                                                                            arrayList30 = arrayList30;
                                                                            int i42 = i41;
                                                                            str11 = attributeValue14;
                                                                            int i43 = i40;
                                                                            int i44 = i2;
                                                                            s sVar2 = sVarR3;
                                                                            long j35 = j34;
                                                                            int iC2 = iC;
                                                                            long jD4 = j8;
                                                                            String str76 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (androidx.media3.common.util.c.n(xmlPullParser, str31)) {
                                                                                    if (i44 == 0) {
                                                                                        jD4 = d(xmlPullParser, jD4);
                                                                                        i44 = i3;
                                                                                    }
                                                                                    f4 = f;
                                                                                    arrayList39.addAll(e(xmlPullParser, arrayList34, z2));
                                                                                } else {
                                                                                    f4 = f;
                                                                                    if (androidx.media3.common.util.c.n(xmlPullParser, str58)) {
                                                                                        iC2 = c(xmlPullParser, str69);
                                                                                    } else {
                                                                                        String str77 = str46;
                                                                                        if (androidx.media3.common.util.c.n(xmlPullParser, str77)) {
                                                                                            str14 = str77;
                                                                                            sVarR = p(xmlPullParser, (r) sVar2);
                                                                                            str15 = str76;
                                                                                            j13 = jD4;
                                                                                            arrayList4 = arrayList31;
                                                                                            j12 = jI7;
                                                                                            arrayList7 = arrayList35;
                                                                                            j = j30;
                                                                                            j14 = j35;
                                                                                            arrayList8 = arrayList37;
                                                                                            i8 = iC2;
                                                                                            j11 = j31;
                                                                                        } else {
                                                                                            str58 = str58;
                                                                                            String str78 = str45;
                                                                                            if (androidx.media3.common.util.c.n(xmlPullParser, str78)) {
                                                                                                arrayList33 = arrayList33;
                                                                                                str31 = str31;
                                                                                                long jD5 = d(xmlPullParser, j35);
                                                                                                str45 = str78;
                                                                                                str14 = str77;
                                                                                                str55 = str55;
                                                                                                str69 = str69;
                                                                                                long j36 = j31;
                                                                                                long j37 = jI7;
                                                                                                arrayList21 = arrayList21;
                                                                                                arrayList22 = arrayList22;
                                                                                                str43 = str43;
                                                                                                str = str;
                                                                                                str44 = str44;
                                                                                                str50 = str50;
                                                                                                arrayList32 = arrayList32;
                                                                                                i5 = i5;
                                                                                                str59 = str59;
                                                                                                str52 = str52;
                                                                                                i43 = i43;
                                                                                                i42 = i42;
                                                                                                ArrayList arrayList40 = arrayList31;
                                                                                                arrayList39 = arrayList39;
                                                                                                long j38 = j30;
                                                                                                str49 = str49;
                                                                                                str64 = str64;
                                                                                                j12 = j37;
                                                                                                j14 = jD5;
                                                                                                j13 = jD4;
                                                                                                arrayList34 = arrayList34;
                                                                                                str42 = str42;
                                                                                                arrayList4 = arrayList40;
                                                                                                j11 = j36;
                                                                                                z2 = z2;
                                                                                                str61 = str61;
                                                                                                str74 = str74;
                                                                                                sVarR = q(xmlPullParser, (o) sVar2, j36, j37, jD4, jD5, j38);
                                                                                                arrayList8 = arrayList37;
                                                                                                arrayList38 = arrayList38;
                                                                                                i8 = iC2;
                                                                                                j = j38;
                                                                                                str15 = str76;
                                                                                                arrayList7 = arrayList35;
                                                                                            } else {
                                                                                                str45 = str78;
                                                                                                str14 = str77;
                                                                                                str55 = str55;
                                                                                                arrayList33 = arrayList33;
                                                                                                str31 = str31;
                                                                                                str69 = str69;
                                                                                                j11 = j31;
                                                                                                arrayList21 = arrayList21;
                                                                                                arrayList22 = arrayList22;
                                                                                                str43 = str43;
                                                                                                str = str;
                                                                                                str44 = str44;
                                                                                                str50 = str50;
                                                                                                arrayList32 = arrayList32;
                                                                                                i5 = i5;
                                                                                                str59 = str59;
                                                                                                str52 = str52;
                                                                                                i43 = i43;
                                                                                                i42 = i42;
                                                                                                ArrayList arrayList41 = arrayList31;
                                                                                                arrayList39 = arrayList39;
                                                                                                str49 = str49;
                                                                                                str64 = str64;
                                                                                                long j39 = j30;
                                                                                                long j40 = jD4;
                                                                                                j12 = jI7;
                                                                                                String str79 = str42;
                                                                                                if (androidx.media3.common.util.c.n(xmlPullParser, str79)) {
                                                                                                    j = j39;
                                                                                                    long jD6 = d(xmlPullParser, j35);
                                                                                                    z2 = z2;
                                                                                                    arrayList34 = arrayList34;
                                                                                                    str42 = str79;
                                                                                                    j13 = j40;
                                                                                                    arrayList4 = arrayList41;
                                                                                                    j14 = jD6;
                                                                                                    sVarR = r(xmlPullParser, (p) sVar2, arrayList41, j11, j12, j13, jD6, j);
                                                                                                    arrayList7 = arrayList35;
                                                                                                } else {
                                                                                                    z2 = z2;
                                                                                                    arrayList4 = arrayList41;
                                                                                                    j = j39;
                                                                                                    arrayList34 = arrayList34;
                                                                                                    str42 = str79;
                                                                                                    j13 = j40;
                                                                                                    if (androidx.media3.common.util.c.n(xmlPullParser, str59)) {
                                                                                                        Pair pairF2 = f(xmlPullParser);
                                                                                                        Object obj4 = pairF2.first;
                                                                                                        if (obj4 != null) {
                                                                                                            str76 = (String) obj4;
                                                                                                        }
                                                                                                        Object obj5 = pairF2.second;
                                                                                                        if (obj5 != null) {
                                                                                                            arrayList7 = arrayList35;
                                                                                                            arrayList7.add((androidx.media3.common.l) obj5);
                                                                                                        } else {
                                                                                                            arrayList7 = arrayList35;
                                                                                                        }
                                                                                                        j14 = j35;
                                                                                                        sVarR = sVar2;
                                                                                                    } else {
                                                                                                        str74 = str74;
                                                                                                        arrayList7 = arrayList35;
                                                                                                        if (androidx.media3.common.util.c.n(xmlPullParser, str74)) {
                                                                                                            j14 = j35;
                                                                                                            arrayList36.add(h(xmlPullParser, str74));
                                                                                                            arrayList8 = arrayList37;
                                                                                                        } else {
                                                                                                            j14 = j35;
                                                                                                            ArrayList arrayList42 = arrayList36;
                                                                                                            if (androidx.media3.common.util.c.n(xmlPullParser, str64)) {
                                                                                                                arrayList36 = arrayList42;
                                                                                                                arrayList8 = arrayList37;
                                                                                                                arrayList8.add(h(xmlPullParser, str64));
                                                                                                            } else {
                                                                                                                arrayList36 = arrayList42;
                                                                                                                str62 = str62;
                                                                                                                arrayList8 = arrayList37;
                                                                                                                if (androidx.media3.common.util.c.n(xmlPullParser, str62)) {
                                                                                                                    j11 = j11;
                                                                                                                    arrayList38 = arrayList38;
                                                                                                                    arrayList38.add(h(xmlPullParser, str62));
                                                                                                                } else {
                                                                                                                    j11 = j11;
                                                                                                                    arrayList38 = arrayList38;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                            }
                                                                                                            str62 = str62;
                                                                                                            str61 = str61;
                                                                                                            sVarR = sVar2;
                                                                                                        }
                                                                                                        arrayList38 = arrayList38;
                                                                                                        str62 = str62;
                                                                                                        str61 = str61;
                                                                                                        sVarR = sVar2;
                                                                                                    }
                                                                                                    i8 = iC2;
                                                                                                    str15 = str76;
                                                                                                }
                                                                                                arrayList8 = arrayList37;
                                                                                                arrayList38 = arrayList38;
                                                                                                i8 = iC2;
                                                                                                str15 = str76;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (androidx.media3.common.util.c.l(xmlPullParser, str61)) {
                                                                                        if (i0.k(str67)) {
                                                                                            strE = i0.b(str69);
                                                                                        } else {
                                                                                            if (i0.o(str67)) {
                                                                                                strE = i0.j(str69);
                                                                                            } else if (i0.n(str67) && !i0.m(str67)) {
                                                                                                str16 = str67;
                                                                                                if ("application/mp4".equals(str16)) {
                                                                                                    strE = i0.e(str69);
                                                                                                    if ("text/vtt".equals(strE)) {
                                                                                                        strE = "application/x-mp4-vtt";
                                                                                                    }
                                                                                                } else {
                                                                                                    strE = null;
                                                                                                }
                                                                                            } else {
                                                                                                strE = str67;
                                                                                                str16 = strE;
                                                                                            }
                                                                                            if ("audio/eac3".equals(strE)) {
                                                                                                i25 = i2;
                                                                                                while (true) {
                                                                                                    if (i25 < arrayList38.size()) {
                                                                                                        f fVar5 = (f) arrayList38.get(i25);
                                                                                                        i26 = i25;
                                                                                                        str25 = fVar5.a;
                                                                                                        String str80 = fVar5.b;
                                                                                                        arrayList9 = arrayList38;
                                                                                                        if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str25) || !"JOC".equals(str80)) && !("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str25) && "ec+3".equals(str80))) {
                                                                                                            i25 = i26 + 1;
                                                                                                            arrayList38 = arrayList9;
                                                                                                        } else {
                                                                                                            strE = "audio/eac3-joc";
                                                                                                        }
                                                                                                    } else {
                                                                                                        arrayList9 = arrayList38;
                                                                                                        strE = "audio/eac3";
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3-joc".equals(strE)) {
                                                                                                    str17 = "ec+3";
                                                                                                }
                                                                                                if (i0.l(str17, str71)) {
                                                                                                    androidx.media3.common.h hVarX = j0.x(str17, str71, str73);
                                                                                                    if (str71 != 0) {
                                                                                                        str24 = str71;
                                                                                                    } else {
                                                                                                        str24 = str17;
                                                                                                    }
                                                                                                    hVar = hVarX;
                                                                                                    strE = "video/dolby-vision";
                                                                                                    str17 = str24;
                                                                                                } else {
                                                                                                    hVar = null;
                                                                                                }
                                                                                                i9 = i2;
                                                                                                i10 = i9;
                                                                                                while (true) {
                                                                                                    j9 = j12;
                                                                                                    if (i9 < arrayList29.size()) {
                                                                                                        ArrayList arrayList43 = arrayList29;
                                                                                                        fVar4 = (f) arrayList43.get(i9);
                                                                                                        String str81 = str16;
                                                                                                        if (!com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar4.a)) {
                                                                                                            str23 = fVar4.b;
                                                                                                            if (str23 == null && (str23.equals("forced_subtitle") || str23.equals("forced-subtitle"))) {
                                                                                                                i24 = 2;
                                                                                                            } else {
                                                                                                                i24 = i2;
                                                                                                            }
                                                                                                            i10 |= i24;
                                                                                                        }
                                                                                                        i9++;
                                                                                                        str16 = str81;
                                                                                                        arrayList29 = arrayList43;
                                                                                                        j12 = j9;
                                                                                                    } else {
                                                                                                        arrayList10 = arrayList29;
                                                                                                        String str82 = str16;
                                                                                                        i11 = i2;
                                                                                                        iN = i11;
                                                                                                        while (i11 < arrayList10.size()) {
                                                                                                            fVar3 = (f) arrayList10.get(i11);
                                                                                                            ArrayList arrayList44 = arrayList10;
                                                                                                            if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                                iN |= n(fVar3.b);
                                                                                                            }
                                                                                                            i11++;
                                                                                                            arrayList10 = arrayList44;
                                                                                                        }
                                                                                                        ArrayList arrayList45 = arrayList10;
                                                                                                        i12 = i2;
                                                                                                        i13 = i12;
                                                                                                        while (i12 < arrayList28.size()) {
                                                                                                            ArrayList arrayList46 = arrayList28;
                                                                                                            int i45 = i12;
                                                                                                            fVar2 = (f) arrayList46.get(i12);
                                                                                                            i22 = i13;
                                                                                                            str21 = fVar2.a;
                                                                                                            int i46 = iN;
                                                                                                            str22 = fVar2.b;
                                                                                                            if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", str21)) {
                                                                                                                iN2 = n(str22);
                                                                                                            } else {
                                                                                                                if (com.google.common.base.b.h("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.a)) {
                                                                                                                    i13 = i22;
                                                                                                                } else if (str22 == null) {
                                                                                                                    switch (str22.hashCode()) {
                                                                                                                        case Token.FALSE /* 49 */:
                                                                                                                            if (str22.equals("1")) {
                                                                                                                                i23 = i2;
                                                                                                                            } else {
                                                                                                                                i23 = -1;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case Token.TRUE /* 50 */:
                                                                                                                            if (str22.equals("2")) {
                                                                                                                                i23 = i3;
                                                                                                                            } else {
                                                                                                                                i23 = -1;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case Token.SHEQ /* 51 */:
                                                                                                                            if (str22.equals("3")) {
                                                                                                                                i23 = 2;
                                                                                                                            } else {
                                                                                                                                i23 = -1;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case Token.SHNE /* 52 */:
                                                                                                                            if (str22.equals("4")) {
                                                                                                                                i23 = 3;
                                                                                                                            } else {
                                                                                                                                i23 = -1;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case Token.REGEXP /* 53 */:
                                                                                                                        default:
                                                                                                                            i23 = -1;
                                                                                                                            break;
                                                                                                                        case Token.BINDNAME /* 54 */:
                                                                                                                            if (str22.equals("6")) {
                                                                                                                                i23 = 4;
                                                                                                                            } else {
                                                                                                                                i23 = -1;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    switch (i23) {
                                                                                                                        case 0:
                                                                                                                            iN2 = 512;
                                                                                                                            break;
                                                                                                                        case 1:
                                                                                                                            iN2 = 2048;
                                                                                                                            break;
                                                                                                                        case 2:
                                                                                                                            iN2 = 4;
                                                                                                                            break;
                                                                                                                        case 3:
                                                                                                                            iN2 = 8;
                                                                                                                            break;
                                                                                                                        case 4:
                                                                                                                            iN2 = i3;
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            iN2 = i2;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    iN2 = i2;
                                                                                                                }
                                                                                                                i12 = i45 + 1;
                                                                                                                arrayList28 = arrayList46;
                                                                                                                iN = i46;
                                                                                                            }
                                                                                                            i13 = i22 | iN2;
                                                                                                            i12 = i45 + 1;
                                                                                                            arrayList28 = arrayList46;
                                                                                                            iN = i46;
                                                                                                        }
                                                                                                        arrayList11 = arrayList28;
                                                                                                        int iO = iN | i13 | o(arrayList8) | o(arrayList9);
                                                                                                        i14 = i2;
                                                                                                        while (true) {
                                                                                                            if (i14 < arrayList8.size()) {
                                                                                                                fVar = (f) arrayList8.get(i14);
                                                                                                                arrayList12 = arrayList8;
                                                                                                                if ((com.google.common.base.b.h("http://dashif.org/thumbnail_tile", fVar.a) || com.google.common.base.b.h("http://dashif.org/guidelines/thumbnail_tile", fVar.a)) && (str20 = fVar.b) != null) {
                                                                                                                    String str83 = j0.a;
                                                                                                                    strArrSplit = str20.split("x", -1);
                                                                                                                    if (strArrSplit.length != 2) {
                                                                                                                        continue;
                                                                                                                    } else {
                                                                                                                        try {
                                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                                        } catch (NumberFormatException unused) {
                                                                                                                            continue;
                                                                                                                            i14++;
                                                                                                                            arrayList8 = arrayList12;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                i14++;
                                                                                                                arrayList8 = arrayList12;
                                                                                                            } else {
                                                                                                                arrayList12 = arrayList8;
                                                                                                                pairCreate = null;
                                                                                                            }
                                                                                                        }
                                                                                                        qVar = new androidx.media3.common.q();
                                                                                                        qVar.a = attributeValue23;
                                                                                                        qVar.m = i0.p(str82);
                                                                                                        qVar.n = i0.p(strE);
                                                                                                        qVar.j = str17;
                                                                                                        qVar.i = i5;
                                                                                                        qVar.e = i10;
                                                                                                        qVar.f = iO;
                                                                                                        qVar.D = hVar;
                                                                                                        String str84 = str55;
                                                                                                        qVar.d = str84;
                                                                                                        if (pairCreate != null) {
                                                                                                            iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                        } else {
                                                                                                            iIntValue = -1;
                                                                                                        }
                                                                                                        qVar.M = iIntValue;
                                                                                                        if (pairCreate != null) {
                                                                                                            iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                        } else {
                                                                                                            iIntValue2 = -1;
                                                                                                        }
                                                                                                        qVar.N = iIntValue2;
                                                                                                        if (i0.o(strE)) {
                                                                                                            qVar.u = i6;
                                                                                                            qVar.v = i7;
                                                                                                            qVar.y = fK2;
                                                                                                        } else {
                                                                                                            i15 = i6;
                                                                                                            i16 = i7;
                                                                                                            if (i0.k(strE)) {
                                                                                                                qVar.F = i8;
                                                                                                                qVar.G = i42;
                                                                                                            } else if (i0.n(strE)) {
                                                                                                                if ("application/cea-608".equals(strE)) {
                                                                                                                    i19 = i2;
                                                                                                                    while (true) {
                                                                                                                        if (i19 < arrayList11.size()) {
                                                                                                                            f fVar6 = (f) arrayList11.get(i19);
                                                                                                                            str19 = fVar6.a;
                                                                                                                            String str85 = fVar6.b;
                                                                                                                            if (!"urn:scte:dash:cc:cea-608:2015".equals(str19) && str85 != null) {
                                                                                                                                Matcher matcher = z.matcher(str85);
                                                                                                                                if (matcher.matches()) {
                                                                                                                                    i18 = Integer.parseInt(matcher.group(i3));
                                                                                                                                } else {
                                                                                                                                    androidx.media3.common.util.c.t("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str85));
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i19++;
                                                                                                                            i3 = 1;
                                                                                                                        } else {
                                                                                                                            i18 = -1;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else if ("application/cea-708".equals(strE)) {
                                                                                                                    i17 = i2;
                                                                                                                    while (true) {
                                                                                                                        if (i17 < arrayList11.size()) {
                                                                                                                            f fVar7 = (f) arrayList11.get(i17);
                                                                                                                            str18 = fVar7.a;
                                                                                                                            String str86 = fVar7.b;
                                                                                                                            if (!"urn:scte:dash:cc:cea-708:2015".equals(str18) && str86 != null) {
                                                                                                                                Matcher matcher2 = A.matcher(str86);
                                                                                                                                if (matcher2.matches()) {
                                                                                                                                    i18 = Integer.parseInt(matcher2.group(1));
                                                                                                                                } else {
                                                                                                                                    androidx.media3.common.util.c.t("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str86));
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i17++;
                                                                                                                        } else {
                                                                                                                            i18 = -1;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i18 = -1;
                                                                                                                }
                                                                                                                qVar.K = i18;
                                                                                                            } else if (i0.m(strE)) {
                                                                                                                qVar.u = i15;
                                                                                                                qVar.v = i16;
                                                                                                            }
                                                                                                        }
                                                                                                        androidx.media3.common.r rVar3 = new androidx.media3.common.r(qVar);
                                                                                                        if (sVarR != null) {
                                                                                                            rVar = sVarR;
                                                                                                        } else {
                                                                                                            rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                        }
                                                                                                        if (arrayList39.isEmpty()) {
                                                                                                            arrayList13 = arrayList34;
                                                                                                        } else {
                                                                                                            arrayList13 = arrayList39;
                                                                                                        }
                                                                                                        d dVar = new d(rVar3, arrayList13, rVar, str15, arrayList7, arrayList36, arrayList12, arrayList9);
                                                                                                        i20 = i0.i(rVar3.o);
                                                                                                        i21 = i43;
                                                                                                        if (i21 != -1) {
                                                                                                            if (i20 != -1) {
                                                                                                                if (i21 == i20) {
                                                                                                                    z3 = 1;
                                                                                                                } else {
                                                                                                                    z3 = i2;
                                                                                                                }
                                                                                                                com.google.android.material.motion.a.q(z3);
                                                                                                            }
                                                                                                            i20 = i21;
                                                                                                        }
                                                                                                        ArrayList arrayList47 = arrayList32;
                                                                                                        arrayList47.add(dVar);
                                                                                                        arrayList32 = arrayList47;
                                                                                                        str55 = str84;
                                                                                                        i4 = i20;
                                                                                                        arrayList28 = arrayList11;
                                                                                                        j31 = j11;
                                                                                                        arrayList5 = arrayList45;
                                                                                                        arrayList26 = arrayList26;
                                                                                                        arrayList6 = arrayList27;
                                                                                                        str12 = str60;
                                                                                                        str43 = str43;
                                                                                                        str45 = str45;
                                                                                                        str46 = str14;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                arrayList9 = arrayList38;
                                                                                            }
                                                                                            str17 = str69;
                                                                                            if (i0.l(str17, str71)) {
                                                                                                androidx.media3.common.h hVarX2 = j0.x(str17, str71, str73);
                                                                                                if (str71 != 0) {
                                                                                                    str24 = str71;
                                                                                                } else {
                                                                                                    str24 = str17;
                                                                                                }
                                                                                                hVar = hVarX2;
                                                                                                strE = "video/dolby-vision";
                                                                                                str17 = str24;
                                                                                            } else {
                                                                                                hVar = null;
                                                                                            }
                                                                                            i9 = i2;
                                                                                            i10 = i9;
                                                                                            while (true) {
                                                                                                j9 = j12;
                                                                                                if (i9 < arrayList29.size()) {
                                                                                                    ArrayList arrayList48 = arrayList29;
                                                                                                    fVar4 = (f) arrayList48.get(i9);
                                                                                                    String str87 = str16;
                                                                                                    if (!com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar4.a)) {
                                                                                                        str23 = fVar4.b;
                                                                                                        if (str23 == null) {
                                                                                                            i24 = i2;
                                                                                                        } else {
                                                                                                            i24 = 2;
                                                                                                        }
                                                                                                        i10 |= i24;
                                                                                                    }
                                                                                                    i9++;
                                                                                                    str16 = str87;
                                                                                                    arrayList29 = arrayList48;
                                                                                                    j12 = j9;
                                                                                                } else {
                                                                                                    arrayList10 = arrayList29;
                                                                                                    String str88 = str16;
                                                                                                    i11 = i2;
                                                                                                    iN = i11;
                                                                                                    while (i11 < arrayList10.size()) {
                                                                                                        fVar3 = (f) arrayList10.get(i11);
                                                                                                        ArrayList arrayList49 = arrayList10;
                                                                                                        if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                            iN |= n(fVar3.b);
                                                                                                        }
                                                                                                        i11++;
                                                                                                        arrayList10 = arrayList49;
                                                                                                    }
                                                                                                    ArrayList arrayList410 = arrayList10;
                                                                                                    i12 = i2;
                                                                                                    i13 = i12;
                                                                                                    while (i12 < arrayList28.size()) {
                                                                                                        ArrayList arrayList411 = arrayList28;
                                                                                                        int i47 = i12;
                                                                                                        fVar2 = (f) arrayList411.get(i12);
                                                                                                        i22 = i13;
                                                                                                        str21 = fVar2.a;
                                                                                                        int i48 = iN;
                                                                                                        str22 = fVar2.b;
                                                                                                        if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", str21)) {
                                                                                                            iN2 = n(str22);
                                                                                                        } else {
                                                                                                            if (com.google.common.base.b.h("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.a)) {
                                                                                                                i13 = i22;
                                                                                                            } else if (str22 == null) {
                                                                                                                switch (str22.hashCode()) {
                                                                                                                    case Token.FALSE /* 49 */:
                                                                                                                        if (str22.equals("1")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = i2;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.TRUE /* 50 */:
                                                                                                                        if (str22.equals("2")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = i3;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.SHEQ /* 51 */:
                                                                                                                        if (str22.equals("3")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 2;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.SHNE /* 52 */:
                                                                                                                        if (str22.equals("4")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 3;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.REGEXP /* 53 */:
                                                                                                                    default:
                                                                                                                        i23 = -1;
                                                                                                                        break;
                                                                                                                    case Token.BINDNAME /* 54 */:
                                                                                                                        if (str22.equals("6")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 4;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                switch (i23) {
                                                                                                                    case 0:
                                                                                                                        iN2 = 512;
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        iN2 = 2048;
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        iN2 = 4;
                                                                                                                        break;
                                                                                                                    case 3:
                                                                                                                        iN2 = 8;
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        iN2 = i3;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        iN2 = i2;
                                                                                                                        break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                iN2 = i2;
                                                                                                            }
                                                                                                            i12 = i47 + 1;
                                                                                                            arrayList28 = arrayList411;
                                                                                                            iN = i48;
                                                                                                        }
                                                                                                        i13 = i22 | iN2;
                                                                                                        i12 = i47 + 1;
                                                                                                        arrayList28 = arrayList411;
                                                                                                        iN = i48;
                                                                                                    }
                                                                                                    arrayList11 = arrayList28;
                                                                                                    int iO2 = iN | i13 | o(arrayList8) | o(arrayList9);
                                                                                                    i14 = i2;
                                                                                                    while (true) {
                                                                                                        if (i14 < arrayList8.size()) {
                                                                                                            fVar = (f) arrayList8.get(i14);
                                                                                                            arrayList12 = arrayList8;
                                                                                                            if (com.google.common.base.b.h("http://dashif.org/thumbnail_tile", fVar.a)) {
                                                                                                                String str89 = j0.a;
                                                                                                                strArrSplit = str20.split("x", -1);
                                                                                                                if (strArrSplit.length != 2) {
                                                                                                                    continue;
                                                                                                                } else {
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                                }
                                                                                                            } else {
                                                                                                                String str810 = j0.a;
                                                                                                                strArrSplit = str20.split("x", -1);
                                                                                                                if (strArrSplit.length != 2) {
                                                                                                                    continue;
                                                                                                                } else {
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                                }
                                                                                                            }
                                                                                                            i14++;
                                                                                                            arrayList8 = arrayList12;
                                                                                                        } else {
                                                                                                            arrayList12 = arrayList8;
                                                                                                            pairCreate = null;
                                                                                                        }
                                                                                                    }
                                                                                                    qVar = new androidx.media3.common.q();
                                                                                                    qVar.a = attributeValue23;
                                                                                                    qVar.m = i0.p(str88);
                                                                                                    qVar.n = i0.p(strE);
                                                                                                    qVar.j = str17;
                                                                                                    qVar.i = i5;
                                                                                                    qVar.e = i10;
                                                                                                    qVar.f = iO2;
                                                                                                    qVar.D = hVar;
                                                                                                    String str811 = str55;
                                                                                                    qVar.d = str811;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                    } else {
                                                                                                        iIntValue = -1;
                                                                                                    }
                                                                                                    qVar.M = iIntValue;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                    } else {
                                                                                                        iIntValue2 = -1;
                                                                                                    }
                                                                                                    qVar.N = iIntValue2;
                                                                                                    if (i0.o(strE)) {
                                                                                                        qVar.u = i6;
                                                                                                        qVar.v = i7;
                                                                                                        qVar.y = fK2;
                                                                                                    } else {
                                                                                                        i15 = i6;
                                                                                                        i16 = i7;
                                                                                                        if (i0.k(strE)) {
                                                                                                            qVar.F = i8;
                                                                                                            qVar.G = i42;
                                                                                                        } else if (i0.n(strE)) {
                                                                                                            if ("application/cea-608".equals(strE)) {
                                                                                                                i19 = i2;
                                                                                                                while (true) {
                                                                                                                    if (i19 < arrayList11.size()) {
                                                                                                                        f fVar8 = (f) arrayList11.get(i19);
                                                                                                                        str19 = fVar8.a;
                                                                                                                        String str812 = fVar8.b;
                                                                                                                        if (!"urn:scte:dash:cc:cea-608:2015".equals(str19)) {
                                                                                                                        }
                                                                                                                        i19++;
                                                                                                                        i3 = 1;
                                                                                                                    } else {
                                                                                                                        i18 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else if ("application/cea-708".equals(strE)) {
                                                                                                                i17 = i2;
                                                                                                                while (true) {
                                                                                                                    if (i17 < arrayList11.size()) {
                                                                                                                        f fVar9 = (f) arrayList11.get(i17);
                                                                                                                        str18 = fVar9.a;
                                                                                                                        String str813 = fVar9.b;
                                                                                                                        if (!"urn:scte:dash:cc:cea-708:2015".equals(str18)) {
                                                                                                                        }
                                                                                                                        i17++;
                                                                                                                    } else {
                                                                                                                        i18 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                i18 = -1;
                                                                                                            }
                                                                                                            qVar.K = i18;
                                                                                                        } else if (i0.m(strE)) {
                                                                                                            qVar.u = i15;
                                                                                                            qVar.v = i16;
                                                                                                        }
                                                                                                    }
                                                                                                    androidx.media3.common.r rVar4 = new androidx.media3.common.r(qVar);
                                                                                                    if (sVarR != null) {
                                                                                                        rVar = sVarR;
                                                                                                    } else {
                                                                                                        rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                    }
                                                                                                    if (arrayList39.isEmpty()) {
                                                                                                        arrayList13 = arrayList39;
                                                                                                    } else {
                                                                                                        arrayList13 = arrayList34;
                                                                                                    }
                                                                                                    d dVar2 = new d(rVar4, arrayList13, rVar, str15, arrayList7, arrayList36, arrayList12, arrayList9);
                                                                                                    i20 = i0.i(rVar4.o);
                                                                                                    i21 = i43;
                                                                                                    if (i21 != -1) {
                                                                                                        if (i20 != -1) {
                                                                                                            if (i21 == i20) {
                                                                                                                z3 = 1;
                                                                                                            } else {
                                                                                                                z3 = i2;
                                                                                                            }
                                                                                                            com.google.android.material.motion.a.q(z3);
                                                                                                        }
                                                                                                        i20 = i21;
                                                                                                    }
                                                                                                    ArrayList arrayList412 = arrayList32;
                                                                                                    arrayList412.add(dVar2);
                                                                                                    arrayList32 = arrayList412;
                                                                                                    str55 = str811;
                                                                                                    i4 = i20;
                                                                                                    arrayList28 = arrayList11;
                                                                                                    j31 = j11;
                                                                                                    arrayList5 = arrayList410;
                                                                                                    arrayList26 = arrayList26;
                                                                                                    arrayList6 = arrayList27;
                                                                                                    str12 = str60;
                                                                                                    str43 = str43;
                                                                                                    str45 = str45;
                                                                                                    str46 = str14;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        str16 = str67;
                                                                                        if ("audio/eac3".equals(strE)) {
                                                                                            i25 = i2;
                                                                                            while (true) {
                                                                                                if (i25 < arrayList38.size()) {
                                                                                                    f fVar10 = (f) arrayList38.get(i25);
                                                                                                    i26 = i25;
                                                                                                    str25 = fVar10.a;
                                                                                                    String str814 = fVar10.b;
                                                                                                    arrayList9 = arrayList38;
                                                                                                    if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str25)) {
                                                                                                        i25 = i26 + 1;
                                                                                                        arrayList38 = arrayList9;
                                                                                                    } else {
                                                                                                        i25 = i26 + 1;
                                                                                                        arrayList38 = arrayList9;
                                                                                                    }
                                                                                                    strE = "audio/eac3-joc";
                                                                                                } else {
                                                                                                    arrayList9 = arrayList38;
                                                                                                    strE = "audio/eac3";
                                                                                                }
                                                                                            }
                                                                                            if ("audio/eac3-joc".equals(strE)) {
                                                                                                str17 = "ec+3";
                                                                                            }
                                                                                            if (i0.l(str17, str71)) {
                                                                                                androidx.media3.common.h hVarX3 = j0.x(str17, str71, str73);
                                                                                                if (str71 != 0) {
                                                                                                    str24 = str71;
                                                                                                } else {
                                                                                                    str24 = str17;
                                                                                                }
                                                                                                hVar = hVarX3;
                                                                                                strE = "video/dolby-vision";
                                                                                                str17 = str24;
                                                                                            } else {
                                                                                                hVar = null;
                                                                                            }
                                                                                            i9 = i2;
                                                                                            i10 = i9;
                                                                                            while (true) {
                                                                                                j9 = j12;
                                                                                                if (i9 < arrayList29.size()) {
                                                                                                    ArrayList arrayList413 = arrayList29;
                                                                                                    fVar4 = (f) arrayList413.get(i9);
                                                                                                    String str815 = str16;
                                                                                                    if (!com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar4.a)) {
                                                                                                        str23 = fVar4.b;
                                                                                                        if (str23 == null) {
                                                                                                            i24 = i2;
                                                                                                        } else {
                                                                                                            i24 = 2;
                                                                                                        }
                                                                                                        i10 |= i24;
                                                                                                    }
                                                                                                    i9++;
                                                                                                    str16 = str815;
                                                                                                    arrayList29 = arrayList413;
                                                                                                    j12 = j9;
                                                                                                } else {
                                                                                                    arrayList10 = arrayList29;
                                                                                                    String str816 = str16;
                                                                                                    i11 = i2;
                                                                                                    iN = i11;
                                                                                                    while (i11 < arrayList10.size()) {
                                                                                                        fVar3 = (f) arrayList10.get(i11);
                                                                                                        ArrayList arrayList414 = arrayList10;
                                                                                                        if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                            iN |= n(fVar3.b);
                                                                                                        }
                                                                                                        i11++;
                                                                                                        arrayList10 = arrayList414;
                                                                                                    }
                                                                                                    ArrayList arrayList415 = arrayList10;
                                                                                                    i12 = i2;
                                                                                                    i13 = i12;
                                                                                                    while (i12 < arrayList28.size()) {
                                                                                                        ArrayList arrayList416 = arrayList28;
                                                                                                        int i49 = i12;
                                                                                                        fVar2 = (f) arrayList416.get(i12);
                                                                                                        i22 = i13;
                                                                                                        str21 = fVar2.a;
                                                                                                        int i410 = iN;
                                                                                                        str22 = fVar2.b;
                                                                                                        if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", str21)) {
                                                                                                            iN2 = n(str22);
                                                                                                        } else {
                                                                                                            if (com.google.common.base.b.h("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.a)) {
                                                                                                                i13 = i22;
                                                                                                            } else if (str22 == null) {
                                                                                                                switch (str22.hashCode()) {
                                                                                                                    case Token.FALSE /* 49 */:
                                                                                                                        if (str22.equals("1")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = i2;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.TRUE /* 50 */:
                                                                                                                        if (str22.equals("2")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = i3;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.SHEQ /* 51 */:
                                                                                                                        if (str22.equals("3")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 2;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.SHNE /* 52 */:
                                                                                                                        if (str22.equals("4")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 3;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.REGEXP /* 53 */:
                                                                                                                    default:
                                                                                                                        i23 = -1;
                                                                                                                        break;
                                                                                                                    case Token.BINDNAME /* 54 */:
                                                                                                                        if (str22.equals("6")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 4;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                switch (i23) {
                                                                                                                    case 0:
                                                                                                                        iN2 = 512;
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        iN2 = 2048;
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        iN2 = 4;
                                                                                                                        break;
                                                                                                                    case 3:
                                                                                                                        iN2 = 8;
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        iN2 = i3;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        iN2 = i2;
                                                                                                                        break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                iN2 = i2;
                                                                                                            }
                                                                                                            i12 = i49 + 1;
                                                                                                            arrayList28 = arrayList416;
                                                                                                            iN = i410;
                                                                                                        }
                                                                                                        i13 = i22 | iN2;
                                                                                                        i12 = i49 + 1;
                                                                                                        arrayList28 = arrayList416;
                                                                                                        iN = i410;
                                                                                                    }
                                                                                                    arrayList11 = arrayList28;
                                                                                                    int iO3 = iN | i13 | o(arrayList8) | o(arrayList9);
                                                                                                    i14 = i2;
                                                                                                    while (true) {
                                                                                                        if (i14 < arrayList8.size()) {
                                                                                                            fVar = (f) arrayList8.get(i14);
                                                                                                            arrayList12 = arrayList8;
                                                                                                            if (com.google.common.base.b.h("http://dashif.org/thumbnail_tile", fVar.a)) {
                                                                                                                String str817 = j0.a;
                                                                                                                strArrSplit = str20.split("x", -1);
                                                                                                                if (strArrSplit.length != 2) {
                                                                                                                    continue;
                                                                                                                } else {
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                                }
                                                                                                            } else {
                                                                                                                String str818 = j0.a;
                                                                                                                strArrSplit = str20.split("x", -1);
                                                                                                                if (strArrSplit.length != 2) {
                                                                                                                    continue;
                                                                                                                } else {
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                                }
                                                                                                            }
                                                                                                            i14++;
                                                                                                            arrayList8 = arrayList12;
                                                                                                        } else {
                                                                                                            arrayList12 = arrayList8;
                                                                                                            pairCreate = null;
                                                                                                        }
                                                                                                    }
                                                                                                    qVar = new androidx.media3.common.q();
                                                                                                    qVar.a = attributeValue23;
                                                                                                    qVar.m = i0.p(str816);
                                                                                                    qVar.n = i0.p(strE);
                                                                                                    qVar.j = str17;
                                                                                                    qVar.i = i5;
                                                                                                    qVar.e = i10;
                                                                                                    qVar.f = iO3;
                                                                                                    qVar.D = hVar;
                                                                                                    String str819 = str55;
                                                                                                    qVar.d = str819;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                    } else {
                                                                                                        iIntValue = -1;
                                                                                                    }
                                                                                                    qVar.M = iIntValue;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                    } else {
                                                                                                        iIntValue2 = -1;
                                                                                                    }
                                                                                                    qVar.N = iIntValue2;
                                                                                                    if (i0.o(strE)) {
                                                                                                        qVar.u = i6;
                                                                                                        qVar.v = i7;
                                                                                                        qVar.y = fK2;
                                                                                                    } else {
                                                                                                        i15 = i6;
                                                                                                        i16 = i7;
                                                                                                        if (i0.k(strE)) {
                                                                                                            qVar.F = i8;
                                                                                                            qVar.G = i42;
                                                                                                        } else if (i0.n(strE)) {
                                                                                                            if ("application/cea-608".equals(strE)) {
                                                                                                                i19 = i2;
                                                                                                                while (true) {
                                                                                                                    if (i19 < arrayList11.size()) {
                                                                                                                        f fVar11 = (f) arrayList11.get(i19);
                                                                                                                        str19 = fVar11.a;
                                                                                                                        String str8110 = fVar11.b;
                                                                                                                        if (!"urn:scte:dash:cc:cea-608:2015".equals(str19)) {
                                                                                                                        }
                                                                                                                        i19++;
                                                                                                                        i3 = 1;
                                                                                                                    } else {
                                                                                                                        i18 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else if ("application/cea-708".equals(strE)) {
                                                                                                                i17 = i2;
                                                                                                                while (true) {
                                                                                                                    if (i17 < arrayList11.size()) {
                                                                                                                        f fVar12 = (f) arrayList11.get(i17);
                                                                                                                        str18 = fVar12.a;
                                                                                                                        String str8111 = fVar12.b;
                                                                                                                        if (!"urn:scte:dash:cc:cea-708:2015".equals(str18)) {
                                                                                                                        }
                                                                                                                        i17++;
                                                                                                                    } else {
                                                                                                                        i18 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                i18 = -1;
                                                                                                            }
                                                                                                            qVar.K = i18;
                                                                                                        } else if (i0.m(strE)) {
                                                                                                            qVar.u = i15;
                                                                                                            qVar.v = i16;
                                                                                                        }
                                                                                                    }
                                                                                                    androidx.media3.common.r rVar5 = new androidx.media3.common.r(qVar);
                                                                                                    if (sVarR != null) {
                                                                                                        rVar = sVarR;
                                                                                                    } else {
                                                                                                        rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                    }
                                                                                                    if (arrayList39.isEmpty()) {
                                                                                                        arrayList13 = arrayList39;
                                                                                                    } else {
                                                                                                        arrayList13 = arrayList34;
                                                                                                    }
                                                                                                    d dVar3 = new d(rVar5, arrayList13, rVar, str15, arrayList7, arrayList36, arrayList12, arrayList9);
                                                                                                    i20 = i0.i(rVar5.o);
                                                                                                    i21 = i43;
                                                                                                    if (i21 != -1) {
                                                                                                        if (i20 != -1) {
                                                                                                            if (i21 == i20) {
                                                                                                                z3 = 1;
                                                                                                            } else {
                                                                                                                z3 = i2;
                                                                                                            }
                                                                                                            com.google.android.material.motion.a.q(z3);
                                                                                                        }
                                                                                                        i20 = i21;
                                                                                                    }
                                                                                                    ArrayList arrayList417 = arrayList32;
                                                                                                    arrayList417.add(dVar3);
                                                                                                    arrayList32 = arrayList417;
                                                                                                    str55 = str819;
                                                                                                    i4 = i20;
                                                                                                    arrayList28 = arrayList11;
                                                                                                    j31 = j11;
                                                                                                    arrayList5 = arrayList415;
                                                                                                    arrayList26 = arrayList26;
                                                                                                    arrayList6 = arrayList27;
                                                                                                    str12 = str60;
                                                                                                    str43 = str43;
                                                                                                    str45 = str45;
                                                                                                    str46 = str14;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            arrayList9 = arrayList38;
                                                                                        }
                                                                                        str17 = str69;
                                                                                        if (i0.l(str17, str71)) {
                                                                                            androidx.media3.common.h hVarX4 = j0.x(str17, str71, str73);
                                                                                            if (str71 != 0) {
                                                                                                str24 = str71;
                                                                                            } else {
                                                                                                str24 = str17;
                                                                                            }
                                                                                            hVar = hVarX4;
                                                                                            strE = "video/dolby-vision";
                                                                                            str17 = str24;
                                                                                        } else {
                                                                                            hVar = null;
                                                                                        }
                                                                                        i9 = i2;
                                                                                        i10 = i9;
                                                                                        while (true) {
                                                                                            j9 = j12;
                                                                                            if (i9 < arrayList29.size()) {
                                                                                                ArrayList arrayList418 = arrayList29;
                                                                                                fVar4 = (f) arrayList418.get(i9);
                                                                                                String str8112 = str16;
                                                                                                if (!com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar4.a)) {
                                                                                                    str23 = fVar4.b;
                                                                                                    if (str23 == null) {
                                                                                                        i24 = i2;
                                                                                                    } else {
                                                                                                        i24 = 2;
                                                                                                    }
                                                                                                    i10 |= i24;
                                                                                                }
                                                                                                i9++;
                                                                                                str16 = str8112;
                                                                                                arrayList29 = arrayList418;
                                                                                                j12 = j9;
                                                                                            } else {
                                                                                                arrayList10 = arrayList29;
                                                                                                String str8113 = str16;
                                                                                                i11 = i2;
                                                                                                iN = i11;
                                                                                                while (i11 < arrayList10.size()) {
                                                                                                    fVar3 = (f) arrayList10.get(i11);
                                                                                                    ArrayList arrayList419 = arrayList10;
                                                                                                    if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                        iN |= n(fVar3.b);
                                                                                                    }
                                                                                                    i11++;
                                                                                                    arrayList10 = arrayList419;
                                                                                                }
                                                                                                ArrayList arrayList4110 = arrayList10;
                                                                                                i12 = i2;
                                                                                                i13 = i12;
                                                                                                while (i12 < arrayList28.size()) {
                                                                                                    ArrayList arrayList4111 = arrayList28;
                                                                                                    int i411 = i12;
                                                                                                    fVar2 = (f) arrayList4111.get(i12);
                                                                                                    i22 = i13;
                                                                                                    str21 = fVar2.a;
                                                                                                    int i412 = iN;
                                                                                                    str22 = fVar2.b;
                                                                                                    if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", str21)) {
                                                                                                        iN2 = n(str22);
                                                                                                    } else {
                                                                                                        if (com.google.common.base.b.h("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.a)) {
                                                                                                            i13 = i22;
                                                                                                        } else if (str22 == null) {
                                                                                                            switch (str22.hashCode()) {
                                                                                                                case Token.FALSE /* 49 */:
                                                                                                                    if (str22.equals("1")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = i2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.TRUE /* 50 */:
                                                                                                                    if (str22.equals("2")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = i3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.SHEQ /* 51 */:
                                                                                                                    if (str22.equals("3")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.SHNE /* 52 */:
                                                                                                                    if (str22.equals("4")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.REGEXP /* 53 */:
                                                                                                                default:
                                                                                                                    i23 = -1;
                                                                                                                    break;
                                                                                                                case Token.BINDNAME /* 54 */:
                                                                                                                    if (str22.equals("6")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 4;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (i23) {
                                                                                                                case 0:
                                                                                                                    iN2 = 512;
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    iN2 = 2048;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    iN2 = 4;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    iN2 = 8;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    iN2 = i3;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    iN2 = i2;
                                                                                                                    break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iN2 = i2;
                                                                                                        }
                                                                                                        i12 = i411 + 1;
                                                                                                        arrayList28 = arrayList4111;
                                                                                                        iN = i412;
                                                                                                    }
                                                                                                    i13 = i22 | iN2;
                                                                                                    i12 = i411 + 1;
                                                                                                    arrayList28 = arrayList4111;
                                                                                                    iN = i412;
                                                                                                }
                                                                                                arrayList11 = arrayList28;
                                                                                                int iO4 = iN | i13 | o(arrayList8) | o(arrayList9);
                                                                                                i14 = i2;
                                                                                                while (true) {
                                                                                                    if (i14 < arrayList8.size()) {
                                                                                                        fVar = (f) arrayList8.get(i14);
                                                                                                        arrayList12 = arrayList8;
                                                                                                        if (com.google.common.base.b.h("http://dashif.org/thumbnail_tile", fVar.a)) {
                                                                                                            String str8114 = j0.a;
                                                                                                            strArrSplit = str20.split("x", -1);
                                                                                                            if (strArrSplit.length != 2) {
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                            }
                                                                                                        } else {
                                                                                                            String str8115 = j0.a;
                                                                                                            strArrSplit = str20.split("x", -1);
                                                                                                            if (strArrSplit.length != 2) {
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                            }
                                                                                                        }
                                                                                                        i14++;
                                                                                                        arrayList8 = arrayList12;
                                                                                                    } else {
                                                                                                        arrayList12 = arrayList8;
                                                                                                        pairCreate = null;
                                                                                                    }
                                                                                                }
                                                                                                qVar = new androidx.media3.common.q();
                                                                                                qVar.a = attributeValue23;
                                                                                                qVar.m = i0.p(str8113);
                                                                                                qVar.n = i0.p(strE);
                                                                                                qVar.j = str17;
                                                                                                qVar.i = i5;
                                                                                                qVar.e = i10;
                                                                                                qVar.f = iO4;
                                                                                                qVar.D = hVar;
                                                                                                String str8116 = str55;
                                                                                                qVar.d = str8116;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                } else {
                                                                                                    iIntValue = -1;
                                                                                                }
                                                                                                qVar.M = iIntValue;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                } else {
                                                                                                    iIntValue2 = -1;
                                                                                                }
                                                                                                qVar.N = iIntValue2;
                                                                                                if (i0.o(strE)) {
                                                                                                    qVar.u = i6;
                                                                                                    qVar.v = i7;
                                                                                                    qVar.y = fK2;
                                                                                                } else {
                                                                                                    i15 = i6;
                                                                                                    i16 = i7;
                                                                                                    if (i0.k(strE)) {
                                                                                                        qVar.F = i8;
                                                                                                        qVar.G = i42;
                                                                                                    } else if (i0.n(strE)) {
                                                                                                        if ("application/cea-608".equals(strE)) {
                                                                                                            i19 = i2;
                                                                                                            while (true) {
                                                                                                                if (i19 < arrayList11.size()) {
                                                                                                                    f fVar13 = (f) arrayList11.get(i19);
                                                                                                                    str19 = fVar13.a;
                                                                                                                    String str8117 = fVar13.b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-608:2015".equals(str19)) {
                                                                                                                    }
                                                                                                                    i19++;
                                                                                                                    i3 = 1;
                                                                                                                } else {
                                                                                                                    i18 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else if ("application/cea-708".equals(strE)) {
                                                                                                            i17 = i2;
                                                                                                            while (true) {
                                                                                                                if (i17 < arrayList11.size()) {
                                                                                                                    f fVar14 = (f) arrayList11.get(i17);
                                                                                                                    str18 = fVar14.a;
                                                                                                                    String str8118 = fVar14.b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(str18)) {
                                                                                                                    }
                                                                                                                    i17++;
                                                                                                                } else {
                                                                                                                    i18 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i18 = -1;
                                                                                                        }
                                                                                                        qVar.K = i18;
                                                                                                    } else if (i0.m(strE)) {
                                                                                                        qVar.u = i15;
                                                                                                        qVar.v = i16;
                                                                                                    }
                                                                                                }
                                                                                                androidx.media3.common.r rVar6 = new androidx.media3.common.r(qVar);
                                                                                                if (sVarR != null) {
                                                                                                    rVar = sVarR;
                                                                                                } else {
                                                                                                    rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                }
                                                                                                if (arrayList39.isEmpty()) {
                                                                                                    arrayList13 = arrayList39;
                                                                                                } else {
                                                                                                    arrayList13 = arrayList34;
                                                                                                }
                                                                                                d dVar4 = new d(rVar6, arrayList13, rVar, str15, arrayList7, arrayList36, arrayList12, arrayList9);
                                                                                                i20 = i0.i(rVar6.o);
                                                                                                i21 = i43;
                                                                                                if (i21 != -1) {
                                                                                                    if (i20 != -1) {
                                                                                                        if (i21 == i20) {
                                                                                                            z3 = 1;
                                                                                                        } else {
                                                                                                            z3 = i2;
                                                                                                        }
                                                                                                        com.google.android.material.motion.a.q(z3);
                                                                                                    }
                                                                                                    i20 = i21;
                                                                                                }
                                                                                                ArrayList arrayList4112 = arrayList32;
                                                                                                arrayList4112.add(dVar4);
                                                                                                arrayList32 = arrayList4112;
                                                                                                str55 = str8116;
                                                                                                i4 = i20;
                                                                                                arrayList28 = arrayList11;
                                                                                                j31 = j11;
                                                                                                arrayList5 = arrayList4110;
                                                                                                arrayList26 = arrayList26;
                                                                                                arrayList6 = arrayList27;
                                                                                                str12 = str60;
                                                                                                str43 = str43;
                                                                                                str45 = str45;
                                                                                                str46 = str14;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        arrayList37 = arrayList8;
                                                                                        arrayList38 = arrayList38;
                                                                                        long j41 = j12;
                                                                                        arrayList35 = arrayList7;
                                                                                        iC2 = i8;
                                                                                        str61 = str61;
                                                                                        jD4 = j13;
                                                                                        str74 = str74;
                                                                                        str59 = str59;
                                                                                        str11 = str11;
                                                                                        arrayList31 = arrayList4;
                                                                                        j35 = j14;
                                                                                        arrayList33 = arrayList33;
                                                                                        str58 = str58;
                                                                                        str49 = str49;
                                                                                        str76 = str15;
                                                                                        f = f4;
                                                                                        str31 = str31;
                                                                                        str69 = str69;
                                                                                        i43 = i43;
                                                                                        arrayList32 = arrayList32;
                                                                                        str55 = str55;
                                                                                        i42 = i42;
                                                                                        str44 = str44;
                                                                                        str = str;
                                                                                        str45 = str45;
                                                                                        str46 = str14;
                                                                                        str52 = str52;
                                                                                        i3 = 1;
                                                                                        str42 = str42;
                                                                                        arrayList19 = arrayList19;
                                                                                        arrayList2 = arrayList2;
                                                                                        arrayList34 = arrayList34;
                                                                                        str50 = str50;
                                                                                        sVar2 = sVarR;
                                                                                        arrayList21 = arrayList21;
                                                                                        str43 = str43;
                                                                                        str64 = str64;
                                                                                        arrayList39 = arrayList39;
                                                                                        arrayList22 = arrayList22;
                                                                                        i5 = i5;
                                                                                        long j42 = j;
                                                                                        arrayList29 = arrayList29;
                                                                                        z2 = z2;
                                                                                        jI7 = j41;
                                                                                        j30 = j42;
                                                                                        j31 = j11;
                                                                                        j4 = j4;
                                                                                        j29 = j29;
                                                                                    }
                                                                                }
                                                                                str14 = str46;
                                                                                sVarR = sVar2;
                                                                                str15 = str76;
                                                                                j13 = jD4;
                                                                                arrayList4 = arrayList31;
                                                                                j12 = jI7;
                                                                                arrayList7 = arrayList35;
                                                                                j = j30;
                                                                                j14 = j35;
                                                                                arrayList8 = arrayList37;
                                                                                i8 = iC2;
                                                                                j11 = j31;
                                                                                if (androidx.media3.common.util.c.l(xmlPullParser, str61)) {
                                                                                    if (i0.k(str67)) {
                                                                                        strE = i0.b(str69);
                                                                                    } else {
                                                                                        if (i0.o(str67)) {
                                                                                            strE = i0.j(str69);
                                                                                        } else if (i0.n(str67)) {
                                                                                            strE = str67;
                                                                                            str16 = strE;
                                                                                        } else {
                                                                                            str16 = str67;
                                                                                            if ("application/mp4".equals(str16)) {
                                                                                                strE = i0.e(str69);
                                                                                                if ("text/vtt".equals(strE)) {
                                                                                                    strE = "application/x-mp4-vtt";
                                                                                                }
                                                                                            } else {
                                                                                                strE = null;
                                                                                            }
                                                                                        }
                                                                                        if ("audio/eac3".equals(strE)) {
                                                                                            i25 = i2;
                                                                                            while (true) {
                                                                                                if (i25 < arrayList38.size()) {
                                                                                                    f fVar15 = (f) arrayList38.get(i25);
                                                                                                    i26 = i25;
                                                                                                    str25 = fVar15.a;
                                                                                                    String str8119 = fVar15.b;
                                                                                                    arrayList9 = arrayList38;
                                                                                                    if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str25)) {
                                                                                                        i25 = i26 + 1;
                                                                                                        arrayList38 = arrayList9;
                                                                                                    } else {
                                                                                                        i25 = i26 + 1;
                                                                                                        arrayList38 = arrayList9;
                                                                                                    }
                                                                                                    strE = "audio/eac3-joc";
                                                                                                } else {
                                                                                                    arrayList9 = arrayList38;
                                                                                                    strE = "audio/eac3";
                                                                                                }
                                                                                            }
                                                                                            if ("audio/eac3-joc".equals(strE)) {
                                                                                                str17 = "ec+3";
                                                                                            }
                                                                                            if (i0.l(str17, str71)) {
                                                                                                androidx.media3.common.h hVarX5 = j0.x(str17, str71, str73);
                                                                                                if (str71 != 0) {
                                                                                                    str24 = str71;
                                                                                                } else {
                                                                                                    str24 = str17;
                                                                                                }
                                                                                                hVar = hVarX5;
                                                                                                strE = "video/dolby-vision";
                                                                                                str17 = str24;
                                                                                            } else {
                                                                                                hVar = null;
                                                                                            }
                                                                                            i9 = i2;
                                                                                            i10 = i9;
                                                                                            while (true) {
                                                                                                j9 = j12;
                                                                                                if (i9 < arrayList29.size()) {
                                                                                                    ArrayList arrayList4113 = arrayList29;
                                                                                                    fVar4 = (f) arrayList4113.get(i9);
                                                                                                    String str81110 = str16;
                                                                                                    if (!com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar4.a)) {
                                                                                                        str23 = fVar4.b;
                                                                                                        if (str23 == null) {
                                                                                                            i24 = i2;
                                                                                                        } else {
                                                                                                            i24 = 2;
                                                                                                        }
                                                                                                        i10 |= i24;
                                                                                                    }
                                                                                                    i9++;
                                                                                                    str16 = str81110;
                                                                                                    arrayList29 = arrayList4113;
                                                                                                    j12 = j9;
                                                                                                } else {
                                                                                                    arrayList10 = arrayList29;
                                                                                                    String str81111 = str16;
                                                                                                    i11 = i2;
                                                                                                    iN = i11;
                                                                                                    while (i11 < arrayList10.size()) {
                                                                                                        fVar3 = (f) arrayList10.get(i11);
                                                                                                        ArrayList arrayList4114 = arrayList10;
                                                                                                        if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                            iN |= n(fVar3.b);
                                                                                                        }
                                                                                                        i11++;
                                                                                                        arrayList10 = arrayList4114;
                                                                                                    }
                                                                                                    ArrayList arrayList4115 = arrayList10;
                                                                                                    i12 = i2;
                                                                                                    i13 = i12;
                                                                                                    while (i12 < arrayList28.size()) {
                                                                                                        ArrayList arrayList4116 = arrayList28;
                                                                                                        int i413 = i12;
                                                                                                        fVar2 = (f) arrayList4116.get(i12);
                                                                                                        i22 = i13;
                                                                                                        str21 = fVar2.a;
                                                                                                        int i414 = iN;
                                                                                                        str22 = fVar2.b;
                                                                                                        if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", str21)) {
                                                                                                            iN2 = n(str22);
                                                                                                        } else {
                                                                                                            if (com.google.common.base.b.h("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.a)) {
                                                                                                                i13 = i22;
                                                                                                            } else if (str22 == null) {
                                                                                                                switch (str22.hashCode()) {
                                                                                                                    case Token.FALSE /* 49 */:
                                                                                                                        if (str22.equals("1")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = i2;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.TRUE /* 50 */:
                                                                                                                        if (str22.equals("2")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = i3;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.SHEQ /* 51 */:
                                                                                                                        if (str22.equals("3")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 2;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.SHNE /* 52 */:
                                                                                                                        if (str22.equals("4")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 3;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case Token.REGEXP /* 53 */:
                                                                                                                    default:
                                                                                                                        i23 = -1;
                                                                                                                        break;
                                                                                                                    case Token.BINDNAME /* 54 */:
                                                                                                                        if (str22.equals("6")) {
                                                                                                                            i23 = -1;
                                                                                                                        } else {
                                                                                                                            i23 = 4;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                switch (i23) {
                                                                                                                    case 0:
                                                                                                                        iN2 = 512;
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        iN2 = 2048;
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        iN2 = 4;
                                                                                                                        break;
                                                                                                                    case 3:
                                                                                                                        iN2 = 8;
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        iN2 = i3;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        iN2 = i2;
                                                                                                                        break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                iN2 = i2;
                                                                                                            }
                                                                                                            i12 = i413 + 1;
                                                                                                            arrayList28 = arrayList4116;
                                                                                                            iN = i414;
                                                                                                        }
                                                                                                        i13 = i22 | iN2;
                                                                                                        i12 = i413 + 1;
                                                                                                        arrayList28 = arrayList4116;
                                                                                                        iN = i414;
                                                                                                    }
                                                                                                    arrayList11 = arrayList28;
                                                                                                    int iO5 = iN | i13 | o(arrayList8) | o(arrayList9);
                                                                                                    i14 = i2;
                                                                                                    while (true) {
                                                                                                        if (i14 < arrayList8.size()) {
                                                                                                            fVar = (f) arrayList8.get(i14);
                                                                                                            arrayList12 = arrayList8;
                                                                                                            if (com.google.common.base.b.h("http://dashif.org/thumbnail_tile", fVar.a)) {
                                                                                                                String str81112 = j0.a;
                                                                                                                strArrSplit = str20.split("x", -1);
                                                                                                                if (strArrSplit.length != 2) {
                                                                                                                    continue;
                                                                                                                } else {
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                                }
                                                                                                            } else {
                                                                                                                String str81113 = j0.a;
                                                                                                                strArrSplit = str20.split("x", -1);
                                                                                                                if (strArrSplit.length != 2) {
                                                                                                                    continue;
                                                                                                                } else {
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                                }
                                                                                                            }
                                                                                                            i14++;
                                                                                                            arrayList8 = arrayList12;
                                                                                                        } else {
                                                                                                            arrayList12 = arrayList8;
                                                                                                            pairCreate = null;
                                                                                                        }
                                                                                                    }
                                                                                                    qVar = new androidx.media3.common.q();
                                                                                                    qVar.a = attributeValue23;
                                                                                                    qVar.m = i0.p(str81111);
                                                                                                    qVar.n = i0.p(strE);
                                                                                                    qVar.j = str17;
                                                                                                    qVar.i = i5;
                                                                                                    qVar.e = i10;
                                                                                                    qVar.f = iO5;
                                                                                                    qVar.D = hVar;
                                                                                                    String str81114 = str55;
                                                                                                    qVar.d = str81114;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                    } else {
                                                                                                        iIntValue = -1;
                                                                                                    }
                                                                                                    qVar.M = iIntValue;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                    } else {
                                                                                                        iIntValue2 = -1;
                                                                                                    }
                                                                                                    qVar.N = iIntValue2;
                                                                                                    if (i0.o(strE)) {
                                                                                                        qVar.u = i6;
                                                                                                        qVar.v = i7;
                                                                                                        qVar.y = fK2;
                                                                                                    } else {
                                                                                                        i15 = i6;
                                                                                                        i16 = i7;
                                                                                                        if (i0.k(strE)) {
                                                                                                            qVar.F = i8;
                                                                                                            qVar.G = i42;
                                                                                                        } else if (i0.n(strE)) {
                                                                                                            if ("application/cea-608".equals(strE)) {
                                                                                                                i19 = i2;
                                                                                                                while (true) {
                                                                                                                    if (i19 < arrayList11.size()) {
                                                                                                                        f fVar16 = (f) arrayList11.get(i19);
                                                                                                                        str19 = fVar16.a;
                                                                                                                        String str81115 = fVar16.b;
                                                                                                                        if (!"urn:scte:dash:cc:cea-608:2015".equals(str19)) {
                                                                                                                        }
                                                                                                                        i19++;
                                                                                                                        i3 = 1;
                                                                                                                    } else {
                                                                                                                        i18 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else if ("application/cea-708".equals(strE)) {
                                                                                                                i17 = i2;
                                                                                                                while (true) {
                                                                                                                    if (i17 < arrayList11.size()) {
                                                                                                                        f fVar17 = (f) arrayList11.get(i17);
                                                                                                                        str18 = fVar17.a;
                                                                                                                        String str81116 = fVar17.b;
                                                                                                                        if (!"urn:scte:dash:cc:cea-708:2015".equals(str18)) {
                                                                                                                        }
                                                                                                                        i17++;
                                                                                                                    } else {
                                                                                                                        i18 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                i18 = -1;
                                                                                                            }
                                                                                                            qVar.K = i18;
                                                                                                        } else if (i0.m(strE)) {
                                                                                                            qVar.u = i15;
                                                                                                            qVar.v = i16;
                                                                                                        }
                                                                                                    }
                                                                                                    androidx.media3.common.r rVar7 = new androidx.media3.common.r(qVar);
                                                                                                    if (sVarR != null) {
                                                                                                        rVar = sVarR;
                                                                                                    } else {
                                                                                                        rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                    }
                                                                                                    if (arrayList39.isEmpty()) {
                                                                                                        arrayList13 = arrayList39;
                                                                                                    } else {
                                                                                                        arrayList13 = arrayList34;
                                                                                                    }
                                                                                                    d dVar5 = new d(rVar7, arrayList13, rVar, str15, arrayList7, arrayList36, arrayList12, arrayList9);
                                                                                                    i20 = i0.i(rVar7.o);
                                                                                                    i21 = i43;
                                                                                                    if (i21 != -1) {
                                                                                                        if (i20 != -1) {
                                                                                                            if (i21 == i20) {
                                                                                                                z3 = 1;
                                                                                                            } else {
                                                                                                                z3 = i2;
                                                                                                            }
                                                                                                            com.google.android.material.motion.a.q(z3);
                                                                                                        }
                                                                                                        i20 = i21;
                                                                                                    }
                                                                                                    ArrayList arrayList4117 = arrayList32;
                                                                                                    arrayList4117.add(dVar5);
                                                                                                    arrayList32 = arrayList4117;
                                                                                                    str55 = str81114;
                                                                                                    i4 = i20;
                                                                                                    arrayList28 = arrayList11;
                                                                                                    j31 = j11;
                                                                                                    arrayList5 = arrayList4115;
                                                                                                    arrayList26 = arrayList26;
                                                                                                    arrayList6 = arrayList27;
                                                                                                    str12 = str60;
                                                                                                    str43 = str43;
                                                                                                    str45 = str45;
                                                                                                    str46 = str14;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            arrayList9 = arrayList38;
                                                                                        }
                                                                                        str17 = str69;
                                                                                        if (i0.l(str17, str71)) {
                                                                                            androidx.media3.common.h hVarX6 = j0.x(str17, str71, str73);
                                                                                            if (str71 != 0) {
                                                                                                str24 = str71;
                                                                                            } else {
                                                                                                str24 = str17;
                                                                                            }
                                                                                            hVar = hVarX6;
                                                                                            strE = "video/dolby-vision";
                                                                                            str17 = str24;
                                                                                        } else {
                                                                                            hVar = null;
                                                                                        }
                                                                                        i9 = i2;
                                                                                        i10 = i9;
                                                                                        while (true) {
                                                                                            j9 = j12;
                                                                                            if (i9 < arrayList29.size()) {
                                                                                                ArrayList arrayList4118 = arrayList29;
                                                                                                fVar4 = (f) arrayList4118.get(i9);
                                                                                                String str81117 = str16;
                                                                                                if (!com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar4.a)) {
                                                                                                    str23 = fVar4.b;
                                                                                                    if (str23 == null) {
                                                                                                        i24 = i2;
                                                                                                    } else {
                                                                                                        i24 = 2;
                                                                                                    }
                                                                                                    i10 |= i24;
                                                                                                }
                                                                                                i9++;
                                                                                                str16 = str81117;
                                                                                                arrayList29 = arrayList4118;
                                                                                                j12 = j9;
                                                                                            } else {
                                                                                                arrayList10 = arrayList29;
                                                                                                String str81118 = str16;
                                                                                                i11 = i2;
                                                                                                iN = i11;
                                                                                                while (i11 < arrayList10.size()) {
                                                                                                    fVar3 = (f) arrayList10.get(i11);
                                                                                                    ArrayList arrayList4119 = arrayList10;
                                                                                                    if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                        iN |= n(fVar3.b);
                                                                                                    }
                                                                                                    i11++;
                                                                                                    arrayList10 = arrayList4119;
                                                                                                }
                                                                                                ArrayList arrayList41110 = arrayList10;
                                                                                                i12 = i2;
                                                                                                i13 = i12;
                                                                                                while (i12 < arrayList28.size()) {
                                                                                                    ArrayList arrayList41111 = arrayList28;
                                                                                                    int i415 = i12;
                                                                                                    fVar2 = (f) arrayList41111.get(i12);
                                                                                                    i22 = i13;
                                                                                                    str21 = fVar2.a;
                                                                                                    int i416 = iN;
                                                                                                    str22 = fVar2.b;
                                                                                                    if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", str21)) {
                                                                                                        iN2 = n(str22);
                                                                                                    } else {
                                                                                                        if (com.google.common.base.b.h("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.a)) {
                                                                                                            i13 = i22;
                                                                                                        } else if (str22 == null) {
                                                                                                            switch (str22.hashCode()) {
                                                                                                                case Token.FALSE /* 49 */:
                                                                                                                    if (str22.equals("1")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = i2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.TRUE /* 50 */:
                                                                                                                    if (str22.equals("2")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = i3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.SHEQ /* 51 */:
                                                                                                                    if (str22.equals("3")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.SHNE /* 52 */:
                                                                                                                    if (str22.equals("4")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.REGEXP /* 53 */:
                                                                                                                default:
                                                                                                                    i23 = -1;
                                                                                                                    break;
                                                                                                                case Token.BINDNAME /* 54 */:
                                                                                                                    if (str22.equals("6")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 4;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (i23) {
                                                                                                                case 0:
                                                                                                                    iN2 = 512;
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    iN2 = 2048;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    iN2 = 4;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    iN2 = 8;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    iN2 = i3;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    iN2 = i2;
                                                                                                                    break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iN2 = i2;
                                                                                                        }
                                                                                                        i12 = i415 + 1;
                                                                                                        arrayList28 = arrayList41111;
                                                                                                        iN = i416;
                                                                                                    }
                                                                                                    i13 = i22 | iN2;
                                                                                                    i12 = i415 + 1;
                                                                                                    arrayList28 = arrayList41111;
                                                                                                    iN = i416;
                                                                                                }
                                                                                                arrayList11 = arrayList28;
                                                                                                int iO6 = iN | i13 | o(arrayList8) | o(arrayList9);
                                                                                                i14 = i2;
                                                                                                while (true) {
                                                                                                    if (i14 < arrayList8.size()) {
                                                                                                        fVar = (f) arrayList8.get(i14);
                                                                                                        arrayList12 = arrayList8;
                                                                                                        if (com.google.common.base.b.h("http://dashif.org/thumbnail_tile", fVar.a)) {
                                                                                                            String str81119 = j0.a;
                                                                                                            strArrSplit = str20.split("x", -1);
                                                                                                            if (strArrSplit.length != 2) {
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                            }
                                                                                                        } else {
                                                                                                            String str811110 = j0.a;
                                                                                                            strArrSplit = str20.split("x", -1);
                                                                                                            if (strArrSplit.length != 2) {
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                            }
                                                                                                        }
                                                                                                        i14++;
                                                                                                        arrayList8 = arrayList12;
                                                                                                    } else {
                                                                                                        arrayList12 = arrayList8;
                                                                                                        pairCreate = null;
                                                                                                    }
                                                                                                }
                                                                                                qVar = new androidx.media3.common.q();
                                                                                                qVar.a = attributeValue23;
                                                                                                qVar.m = i0.p(str81118);
                                                                                                qVar.n = i0.p(strE);
                                                                                                qVar.j = str17;
                                                                                                qVar.i = i5;
                                                                                                qVar.e = i10;
                                                                                                qVar.f = iO6;
                                                                                                qVar.D = hVar;
                                                                                                String str811111 = str55;
                                                                                                qVar.d = str811111;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                } else {
                                                                                                    iIntValue = -1;
                                                                                                }
                                                                                                qVar.M = iIntValue;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                } else {
                                                                                                    iIntValue2 = -1;
                                                                                                }
                                                                                                qVar.N = iIntValue2;
                                                                                                if (i0.o(strE)) {
                                                                                                    qVar.u = i6;
                                                                                                    qVar.v = i7;
                                                                                                    qVar.y = fK2;
                                                                                                } else {
                                                                                                    i15 = i6;
                                                                                                    i16 = i7;
                                                                                                    if (i0.k(strE)) {
                                                                                                        qVar.F = i8;
                                                                                                        qVar.G = i42;
                                                                                                    } else if (i0.n(strE)) {
                                                                                                        if ("application/cea-608".equals(strE)) {
                                                                                                            i19 = i2;
                                                                                                            while (true) {
                                                                                                                if (i19 < arrayList11.size()) {
                                                                                                                    f fVar18 = (f) arrayList11.get(i19);
                                                                                                                    str19 = fVar18.a;
                                                                                                                    String str811112 = fVar18.b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-608:2015".equals(str19)) {
                                                                                                                    }
                                                                                                                    i19++;
                                                                                                                    i3 = 1;
                                                                                                                } else {
                                                                                                                    i18 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else if ("application/cea-708".equals(strE)) {
                                                                                                            i17 = i2;
                                                                                                            while (true) {
                                                                                                                if (i17 < arrayList11.size()) {
                                                                                                                    f fVar19 = (f) arrayList11.get(i17);
                                                                                                                    str18 = fVar19.a;
                                                                                                                    String str811113 = fVar19.b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(str18)) {
                                                                                                                    }
                                                                                                                    i17++;
                                                                                                                } else {
                                                                                                                    i18 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i18 = -1;
                                                                                                        }
                                                                                                        qVar.K = i18;
                                                                                                    } else if (i0.m(strE)) {
                                                                                                        qVar.u = i15;
                                                                                                        qVar.v = i16;
                                                                                                    }
                                                                                                }
                                                                                                androidx.media3.common.r rVar8 = new androidx.media3.common.r(qVar);
                                                                                                if (sVarR != null) {
                                                                                                    rVar = sVarR;
                                                                                                } else {
                                                                                                    rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                }
                                                                                                if (arrayList39.isEmpty()) {
                                                                                                    arrayList13 = arrayList39;
                                                                                                } else {
                                                                                                    arrayList13 = arrayList34;
                                                                                                }
                                                                                                d dVar6 = new d(rVar8, arrayList13, rVar, str15, arrayList7, arrayList36, arrayList12, arrayList9);
                                                                                                i20 = i0.i(rVar8.o);
                                                                                                i21 = i43;
                                                                                                if (i21 != -1) {
                                                                                                    if (i20 != -1) {
                                                                                                        if (i21 == i20) {
                                                                                                            z3 = 1;
                                                                                                        } else {
                                                                                                            z3 = i2;
                                                                                                        }
                                                                                                        com.google.android.material.motion.a.q(z3);
                                                                                                    }
                                                                                                    i20 = i21;
                                                                                                }
                                                                                                ArrayList arrayList41112 = arrayList32;
                                                                                                arrayList41112.add(dVar6);
                                                                                                arrayList32 = arrayList41112;
                                                                                                str55 = str811111;
                                                                                                i4 = i20;
                                                                                                arrayList28 = arrayList11;
                                                                                                j31 = j11;
                                                                                                arrayList5 = arrayList41110;
                                                                                                arrayList26 = arrayList26;
                                                                                                arrayList6 = arrayList27;
                                                                                                str12 = str60;
                                                                                                str43 = str43;
                                                                                                str45 = str45;
                                                                                                str46 = str14;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str16 = str67;
                                                                                    if ("audio/eac3".equals(strE)) {
                                                                                        i25 = i2;
                                                                                        while (true) {
                                                                                            if (i25 < arrayList38.size()) {
                                                                                                f fVar110 = (f) arrayList38.get(i25);
                                                                                                i26 = i25;
                                                                                                str25 = fVar110.a;
                                                                                                String str81120 = fVar110.b;
                                                                                                arrayList9 = arrayList38;
                                                                                                if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str25)) {
                                                                                                    i25 = i26 + 1;
                                                                                                    arrayList38 = arrayList9;
                                                                                                } else {
                                                                                                    i25 = i26 + 1;
                                                                                                    arrayList38 = arrayList9;
                                                                                                }
                                                                                                strE = "audio/eac3-joc";
                                                                                            } else {
                                                                                                arrayList9 = arrayList38;
                                                                                                strE = "audio/eac3";
                                                                                            }
                                                                                        }
                                                                                        if ("audio/eac3-joc".equals(strE)) {
                                                                                            str17 = "ec+3";
                                                                                        }
                                                                                        if (i0.l(str17, str71)) {
                                                                                            androidx.media3.common.h hVarX7 = j0.x(str17, str71, str73);
                                                                                            if (str71 != 0) {
                                                                                                str24 = str71;
                                                                                            } else {
                                                                                                str24 = str17;
                                                                                            }
                                                                                            hVar = hVarX7;
                                                                                            strE = "video/dolby-vision";
                                                                                            str17 = str24;
                                                                                        } else {
                                                                                            hVar = null;
                                                                                        }
                                                                                        i9 = i2;
                                                                                        i10 = i9;
                                                                                        while (true) {
                                                                                            j9 = j12;
                                                                                            if (i9 < arrayList29.size()) {
                                                                                                ArrayList arrayList41113 = arrayList29;
                                                                                                fVar4 = (f) arrayList41113.get(i9);
                                                                                                String str811114 = str16;
                                                                                                if (!com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar4.a)) {
                                                                                                    str23 = fVar4.b;
                                                                                                    if (str23 == null) {
                                                                                                        i24 = i2;
                                                                                                    } else {
                                                                                                        i24 = 2;
                                                                                                    }
                                                                                                    i10 |= i24;
                                                                                                }
                                                                                                i9++;
                                                                                                str16 = str811114;
                                                                                                arrayList29 = arrayList41113;
                                                                                                j12 = j9;
                                                                                            } else {
                                                                                                arrayList10 = arrayList29;
                                                                                                String str811115 = str16;
                                                                                                i11 = i2;
                                                                                                iN = i11;
                                                                                                while (i11 < arrayList10.size()) {
                                                                                                    fVar3 = (f) arrayList10.get(i11);
                                                                                                    ArrayList arrayList41114 = arrayList10;
                                                                                                    if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                        iN |= n(fVar3.b);
                                                                                                    }
                                                                                                    i11++;
                                                                                                    arrayList10 = arrayList41114;
                                                                                                }
                                                                                                ArrayList arrayList41115 = arrayList10;
                                                                                                i12 = i2;
                                                                                                i13 = i12;
                                                                                                while (i12 < arrayList28.size()) {
                                                                                                    ArrayList arrayList41116 = arrayList28;
                                                                                                    int i417 = i12;
                                                                                                    fVar2 = (f) arrayList41116.get(i12);
                                                                                                    i22 = i13;
                                                                                                    str21 = fVar2.a;
                                                                                                    int i418 = iN;
                                                                                                    str22 = fVar2.b;
                                                                                                    if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", str21)) {
                                                                                                        iN2 = n(str22);
                                                                                                    } else {
                                                                                                        if (com.google.common.base.b.h("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.a)) {
                                                                                                            i13 = i22;
                                                                                                        } else if (str22 == null) {
                                                                                                            switch (str22.hashCode()) {
                                                                                                                case Token.FALSE /* 49 */:
                                                                                                                    if (str22.equals("1")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = i2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.TRUE /* 50 */:
                                                                                                                    if (str22.equals("2")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = i3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.SHEQ /* 51 */:
                                                                                                                    if (str22.equals("3")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.SHNE /* 52 */:
                                                                                                                    if (str22.equals("4")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case Token.REGEXP /* 53 */:
                                                                                                                default:
                                                                                                                    i23 = -1;
                                                                                                                    break;
                                                                                                                case Token.BINDNAME /* 54 */:
                                                                                                                    if (str22.equals("6")) {
                                                                                                                        i23 = -1;
                                                                                                                    } else {
                                                                                                                        i23 = 4;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (i23) {
                                                                                                                case 0:
                                                                                                                    iN2 = 512;
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    iN2 = 2048;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    iN2 = 4;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    iN2 = 8;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    iN2 = i3;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    iN2 = i2;
                                                                                                                    break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iN2 = i2;
                                                                                                        }
                                                                                                        i12 = i417 + 1;
                                                                                                        arrayList28 = arrayList41116;
                                                                                                        iN = i418;
                                                                                                    }
                                                                                                    i13 = i22 | iN2;
                                                                                                    i12 = i417 + 1;
                                                                                                    arrayList28 = arrayList41116;
                                                                                                    iN = i418;
                                                                                                }
                                                                                                arrayList11 = arrayList28;
                                                                                                int iO7 = iN | i13 | o(arrayList8) | o(arrayList9);
                                                                                                i14 = i2;
                                                                                                while (true) {
                                                                                                    if (i14 < arrayList8.size()) {
                                                                                                        fVar = (f) arrayList8.get(i14);
                                                                                                        arrayList12 = arrayList8;
                                                                                                        if (com.google.common.base.b.h("http://dashif.org/thumbnail_tile", fVar.a)) {
                                                                                                            String str811116 = j0.a;
                                                                                                            strArrSplit = str20.split("x", -1);
                                                                                                            if (strArrSplit.length != 2) {
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                            }
                                                                                                        } else {
                                                                                                            String str811117 = j0.a;
                                                                                                            strArrSplit = str20.split("x", -1);
                                                                                                            if (strArrSplit.length != 2) {
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                            }
                                                                                                        }
                                                                                                        i14++;
                                                                                                        arrayList8 = arrayList12;
                                                                                                    } else {
                                                                                                        arrayList12 = arrayList8;
                                                                                                        pairCreate = null;
                                                                                                    }
                                                                                                }
                                                                                                qVar = new androidx.media3.common.q();
                                                                                                qVar.a = attributeValue23;
                                                                                                qVar.m = i0.p(str811115);
                                                                                                qVar.n = i0.p(strE);
                                                                                                qVar.j = str17;
                                                                                                qVar.i = i5;
                                                                                                qVar.e = i10;
                                                                                                qVar.f = iO7;
                                                                                                qVar.D = hVar;
                                                                                                String str811118 = str55;
                                                                                                qVar.d = str811118;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                } else {
                                                                                                    iIntValue = -1;
                                                                                                }
                                                                                                qVar.M = iIntValue;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                } else {
                                                                                                    iIntValue2 = -1;
                                                                                                }
                                                                                                qVar.N = iIntValue2;
                                                                                                if (i0.o(strE)) {
                                                                                                    qVar.u = i6;
                                                                                                    qVar.v = i7;
                                                                                                    qVar.y = fK2;
                                                                                                } else {
                                                                                                    i15 = i6;
                                                                                                    i16 = i7;
                                                                                                    if (i0.k(strE)) {
                                                                                                        qVar.F = i8;
                                                                                                        qVar.G = i42;
                                                                                                    } else if (i0.n(strE)) {
                                                                                                        if ("application/cea-608".equals(strE)) {
                                                                                                            i19 = i2;
                                                                                                            while (true) {
                                                                                                                if (i19 < arrayList11.size()) {
                                                                                                                    f fVar111 = (f) arrayList11.get(i19);
                                                                                                                    str19 = fVar111.a;
                                                                                                                    String str811119 = fVar111.b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-608:2015".equals(str19)) {
                                                                                                                    }
                                                                                                                    i19++;
                                                                                                                    i3 = 1;
                                                                                                                } else {
                                                                                                                    i18 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else if ("application/cea-708".equals(strE)) {
                                                                                                            i17 = i2;
                                                                                                            while (true) {
                                                                                                                if (i17 < arrayList11.size()) {
                                                                                                                    f fVar112 = (f) arrayList11.get(i17);
                                                                                                                    str18 = fVar112.a;
                                                                                                                    String str8111110 = fVar112.b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(str18)) {
                                                                                                                    }
                                                                                                                    i17++;
                                                                                                                } else {
                                                                                                                    i18 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i18 = -1;
                                                                                                        }
                                                                                                        qVar.K = i18;
                                                                                                    } else if (i0.m(strE)) {
                                                                                                        qVar.u = i15;
                                                                                                        qVar.v = i16;
                                                                                                    }
                                                                                                }
                                                                                                androidx.media3.common.r rVar9 = new androidx.media3.common.r(qVar);
                                                                                                if (sVarR != null) {
                                                                                                    rVar = sVarR;
                                                                                                } else {
                                                                                                    rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                }
                                                                                                if (arrayList39.isEmpty()) {
                                                                                                    arrayList13 = arrayList39;
                                                                                                } else {
                                                                                                    arrayList13 = arrayList34;
                                                                                                }
                                                                                                d dVar7 = new d(rVar9, arrayList13, rVar, str15, arrayList7, arrayList36, arrayList12, arrayList9);
                                                                                                i20 = i0.i(rVar9.o);
                                                                                                i21 = i43;
                                                                                                if (i21 != -1) {
                                                                                                    if (i20 != -1) {
                                                                                                        if (i21 == i20) {
                                                                                                            z3 = 1;
                                                                                                        } else {
                                                                                                            z3 = i2;
                                                                                                        }
                                                                                                        com.google.android.material.motion.a.q(z3);
                                                                                                    }
                                                                                                    i20 = i21;
                                                                                                }
                                                                                                ArrayList arrayList41117 = arrayList32;
                                                                                                arrayList41117.add(dVar7);
                                                                                                arrayList32 = arrayList41117;
                                                                                                str55 = str811118;
                                                                                                i4 = i20;
                                                                                                arrayList28 = arrayList11;
                                                                                                j31 = j11;
                                                                                                arrayList5 = arrayList41115;
                                                                                                arrayList26 = arrayList26;
                                                                                                arrayList6 = arrayList27;
                                                                                                str12 = str60;
                                                                                                str43 = str43;
                                                                                                str45 = str45;
                                                                                                str46 = str14;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        arrayList9 = arrayList38;
                                                                                    }
                                                                                    str17 = str69;
                                                                                    if (i0.l(str17, str71)) {
                                                                                        androidx.media3.common.h hVarX8 = j0.x(str17, str71, str73);
                                                                                        if (str71 != 0) {
                                                                                            str24 = str71;
                                                                                        } else {
                                                                                            str24 = str17;
                                                                                        }
                                                                                        hVar = hVarX8;
                                                                                        strE = "video/dolby-vision";
                                                                                        str17 = str24;
                                                                                    } else {
                                                                                        hVar = null;
                                                                                    }
                                                                                    i9 = i2;
                                                                                    i10 = i9;
                                                                                    while (true) {
                                                                                        j9 = j12;
                                                                                        if (i9 < arrayList29.size()) {
                                                                                            ArrayList arrayList41118 = arrayList29;
                                                                                            fVar4 = (f) arrayList41118.get(i9);
                                                                                            String str8111111 = str16;
                                                                                            if (!com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar4.a)) {
                                                                                                str23 = fVar4.b;
                                                                                                if (str23 == null) {
                                                                                                    i24 = i2;
                                                                                                } else {
                                                                                                    i24 = 2;
                                                                                                }
                                                                                                i10 |= i24;
                                                                                            }
                                                                                            i9++;
                                                                                            str16 = str8111111;
                                                                                            arrayList29 = arrayList41118;
                                                                                            j12 = j9;
                                                                                        } else {
                                                                                            arrayList10 = arrayList29;
                                                                                            String str8111112 = str16;
                                                                                            i11 = i2;
                                                                                            iN = i11;
                                                                                            while (i11 < arrayList10.size()) {
                                                                                                fVar3 = (f) arrayList10.get(i11);
                                                                                                ArrayList arrayList41119 = arrayList10;
                                                                                                if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                    iN |= n(fVar3.b);
                                                                                                }
                                                                                                i11++;
                                                                                                arrayList10 = arrayList41119;
                                                                                            }
                                                                                            ArrayList arrayList411110 = arrayList10;
                                                                                            i12 = i2;
                                                                                            i13 = i12;
                                                                                            while (i12 < arrayList28.size()) {
                                                                                                ArrayList arrayList411111 = arrayList28;
                                                                                                int i419 = i12;
                                                                                                fVar2 = (f) arrayList411111.get(i12);
                                                                                                i22 = i13;
                                                                                                str21 = fVar2.a;
                                                                                                int i4110 = iN;
                                                                                                str22 = fVar2.b;
                                                                                                if (com.google.common.base.b.h("urn:mpeg:dash:role:2011", str21)) {
                                                                                                    iN2 = n(str22);
                                                                                                } else {
                                                                                                    if (com.google.common.base.b.h("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.a)) {
                                                                                                        i13 = i22;
                                                                                                    } else if (str22 == null) {
                                                                                                        switch (str22.hashCode()) {
                                                                                                            case Token.FALSE /* 49 */:
                                                                                                                if (str22.equals("1")) {
                                                                                                                    i23 = -1;
                                                                                                                } else {
                                                                                                                    i23 = i2;
                                                                                                                }
                                                                                                                break;
                                                                                                            case Token.TRUE /* 50 */:
                                                                                                                if (str22.equals("2")) {
                                                                                                                    i23 = -1;
                                                                                                                } else {
                                                                                                                    i23 = i3;
                                                                                                                }
                                                                                                                break;
                                                                                                            case Token.SHEQ /* 51 */:
                                                                                                                if (str22.equals("3")) {
                                                                                                                    i23 = -1;
                                                                                                                } else {
                                                                                                                    i23 = 2;
                                                                                                                }
                                                                                                                break;
                                                                                                            case Token.SHNE /* 52 */:
                                                                                                                if (str22.equals("4")) {
                                                                                                                    i23 = -1;
                                                                                                                } else {
                                                                                                                    i23 = 3;
                                                                                                                }
                                                                                                                break;
                                                                                                            case Token.REGEXP /* 53 */:
                                                                                                            default:
                                                                                                                i23 = -1;
                                                                                                                break;
                                                                                                            case Token.BINDNAME /* 54 */:
                                                                                                                if (str22.equals("6")) {
                                                                                                                    i23 = -1;
                                                                                                                } else {
                                                                                                                    i23 = 4;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                        switch (i23) {
                                                                                                            case 0:
                                                                                                                iN2 = 512;
                                                                                                                break;
                                                                                                            case 1:
                                                                                                                iN2 = 2048;
                                                                                                                break;
                                                                                                            case 2:
                                                                                                                iN2 = 4;
                                                                                                                break;
                                                                                                            case 3:
                                                                                                                iN2 = 8;
                                                                                                                break;
                                                                                                            case 4:
                                                                                                                iN2 = i3;
                                                                                                                break;
                                                                                                            default:
                                                                                                                iN2 = i2;
                                                                                                                break;
                                                                                                        }
                                                                                                    } else {
                                                                                                        iN2 = i2;
                                                                                                    }
                                                                                                    i12 = i419 + 1;
                                                                                                    arrayList28 = arrayList411111;
                                                                                                    iN = i4110;
                                                                                                }
                                                                                                i13 = i22 | iN2;
                                                                                                i12 = i419 + 1;
                                                                                                arrayList28 = arrayList411111;
                                                                                                iN = i4110;
                                                                                            }
                                                                                            arrayList11 = arrayList28;
                                                                                            int iO8 = iN | i13 | o(arrayList8) | o(arrayList9);
                                                                                            i14 = i2;
                                                                                            while (true) {
                                                                                                if (i14 < arrayList8.size()) {
                                                                                                    fVar = (f) arrayList8.get(i14);
                                                                                                    arrayList12 = arrayList8;
                                                                                                    if (com.google.common.base.b.h("http://dashif.org/thumbnail_tile", fVar.a)) {
                                                                                                        String str8111113 = j0.a;
                                                                                                        strArrSplit = str20.split("x", -1);
                                                                                                        if (strArrSplit.length != 2) {
                                                                                                            continue;
                                                                                                        } else {
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                        }
                                                                                                    } else {
                                                                                                        String str8111114 = j0.a;
                                                                                                        strArrSplit = str20.split("x", -1);
                                                                                                        if (strArrSplit.length != 2) {
                                                                                                            continue;
                                                                                                        } else {
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[i2])), Integer.valueOf(Integer.parseInt(strArrSplit[i3])));
                                                                                                        }
                                                                                                    }
                                                                                                    i14++;
                                                                                                    arrayList8 = arrayList12;
                                                                                                } else {
                                                                                                    arrayList12 = arrayList8;
                                                                                                    pairCreate = null;
                                                                                                }
                                                                                            }
                                                                                            qVar = new androidx.media3.common.q();
                                                                                            qVar.a = attributeValue23;
                                                                                            qVar.m = i0.p(str8111112);
                                                                                            qVar.n = i0.p(strE);
                                                                                            qVar.j = str17;
                                                                                            qVar.i = i5;
                                                                                            qVar.e = i10;
                                                                                            qVar.f = iO8;
                                                                                            qVar.D = hVar;
                                                                                            String str8111115 = str55;
                                                                                            qVar.d = str8111115;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                            } else {
                                                                                                iIntValue = -1;
                                                                                            }
                                                                                            qVar.M = iIntValue;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                            } else {
                                                                                                iIntValue2 = -1;
                                                                                            }
                                                                                            qVar.N = iIntValue2;
                                                                                            if (i0.o(strE)) {
                                                                                                qVar.u = i6;
                                                                                                qVar.v = i7;
                                                                                                qVar.y = fK2;
                                                                                            } else {
                                                                                                i15 = i6;
                                                                                                i16 = i7;
                                                                                                if (i0.k(strE)) {
                                                                                                    qVar.F = i8;
                                                                                                    qVar.G = i42;
                                                                                                } else if (i0.n(strE)) {
                                                                                                    if ("application/cea-608".equals(strE)) {
                                                                                                        i19 = i2;
                                                                                                        while (true) {
                                                                                                            if (i19 < arrayList11.size()) {
                                                                                                                f fVar113 = (f) arrayList11.get(i19);
                                                                                                                str19 = fVar113.a;
                                                                                                                String str8111116 = fVar113.b;
                                                                                                                if (!"urn:scte:dash:cc:cea-608:2015".equals(str19)) {
                                                                                                                }
                                                                                                                i19++;
                                                                                                                i3 = 1;
                                                                                                            } else {
                                                                                                                i18 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else if ("application/cea-708".equals(strE)) {
                                                                                                        i17 = i2;
                                                                                                        while (true) {
                                                                                                            if (i17 < arrayList11.size()) {
                                                                                                                f fVar114 = (f) arrayList11.get(i17);
                                                                                                                str18 = fVar114.a;
                                                                                                                String str8111117 = fVar114.b;
                                                                                                                if (!"urn:scte:dash:cc:cea-708:2015".equals(str18)) {
                                                                                                                }
                                                                                                                i17++;
                                                                                                            } else {
                                                                                                                i18 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i18 = -1;
                                                                                                    }
                                                                                                    qVar.K = i18;
                                                                                                } else if (i0.m(strE)) {
                                                                                                    qVar.u = i15;
                                                                                                    qVar.v = i16;
                                                                                                }
                                                                                            }
                                                                                            androidx.media3.common.r rVar10 = new androidx.media3.common.r(qVar);
                                                                                            if (sVarR != null) {
                                                                                                rVar = sVarR;
                                                                                            } else {
                                                                                                rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                            }
                                                                                            if (arrayList39.isEmpty()) {
                                                                                                arrayList13 = arrayList39;
                                                                                            } else {
                                                                                                arrayList13 = arrayList34;
                                                                                            }
                                                                                            d dVar8 = new d(rVar10, arrayList13, rVar, str15, arrayList7, arrayList36, arrayList12, arrayList9);
                                                                                            i20 = i0.i(rVar10.o);
                                                                                            i21 = i43;
                                                                                            if (i21 != -1) {
                                                                                                if (i20 != -1) {
                                                                                                    if (i21 == i20) {
                                                                                                        z3 = 1;
                                                                                                    } else {
                                                                                                        z3 = i2;
                                                                                                    }
                                                                                                    com.google.android.material.motion.a.q(z3);
                                                                                                }
                                                                                                i20 = i21;
                                                                                            }
                                                                                            ArrayList arrayList411112 = arrayList32;
                                                                                            arrayList411112.add(dVar8);
                                                                                            arrayList32 = arrayList411112;
                                                                                            str55 = str8111115;
                                                                                            i4 = i20;
                                                                                            arrayList28 = arrayList11;
                                                                                            j31 = j11;
                                                                                            arrayList5 = arrayList411110;
                                                                                            arrayList26 = arrayList26;
                                                                                            arrayList6 = arrayList27;
                                                                                            str12 = str60;
                                                                                            str43 = str43;
                                                                                            str45 = str45;
                                                                                            str46 = str14;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    arrayList37 = arrayList8;
                                                                                    arrayList38 = arrayList38;
                                                                                    long j43 = j12;
                                                                                    arrayList35 = arrayList7;
                                                                                    iC2 = i8;
                                                                                    str61 = str61;
                                                                                    jD4 = j13;
                                                                                    str74 = str74;
                                                                                    str59 = str59;
                                                                                    str11 = str11;
                                                                                    arrayList31 = arrayList4;
                                                                                    j35 = j14;
                                                                                    arrayList33 = arrayList33;
                                                                                    str58 = str58;
                                                                                    str49 = str49;
                                                                                    str76 = str15;
                                                                                    f = f4;
                                                                                    str31 = str31;
                                                                                    str69 = str69;
                                                                                    i43 = i43;
                                                                                    arrayList32 = arrayList32;
                                                                                    str55 = str55;
                                                                                    i42 = i42;
                                                                                    str44 = str44;
                                                                                    str = str;
                                                                                    str45 = str45;
                                                                                    str46 = str14;
                                                                                    str52 = str52;
                                                                                    i3 = 1;
                                                                                    str42 = str42;
                                                                                    arrayList19 = arrayList19;
                                                                                    arrayList2 = arrayList2;
                                                                                    arrayList34 = arrayList34;
                                                                                    str50 = str50;
                                                                                    sVar2 = sVarR;
                                                                                    arrayList21 = arrayList21;
                                                                                    str43 = str43;
                                                                                    str64 = str64;
                                                                                    arrayList39 = arrayList39;
                                                                                    arrayList22 = arrayList22;
                                                                                    i5 = i5;
                                                                                    long j44 = j;
                                                                                    arrayList29 = arrayList29;
                                                                                    z2 = z2;
                                                                                    jI7 = j43;
                                                                                    j30 = j44;
                                                                                    j31 = j11;
                                                                                    j4 = j4;
                                                                                    j29 = j29;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayList30 = arrayList30;
                                                                            arrayList3 = arrayList3;
                                                                            str31 = str31;
                                                                            z2 = z2;
                                                                            arrayList21 = arrayList21;
                                                                            arrayList22 = arrayList22;
                                                                            str42 = str42;
                                                                            str7 = str43;
                                                                            str = str;
                                                                            str44 = str44;
                                                                            String str90 = str45;
                                                                            String str91 = str46;
                                                                            f4 = f4;
                                                                            str50 = str50;
                                                                            str51 = str51;
                                                                            str52 = str52;
                                                                            arrayList33 = arrayList33;
                                                                            arrayList4 = arrayList31;
                                                                            ArrayList arrayList50 = arrayList29;
                                                                            j = j30;
                                                                            arrayList19 = arrayList19;
                                                                            str8 = str56;
                                                                            str9 = str54;
                                                                            str10 = str53;
                                                                            j9 = jI7;
                                                                            str11 = attributeValue14;
                                                                            int i50 = i40;
                                                                            long j45 = j31;
                                                                            arrayList2 = arrayList2;
                                                                            j29 = j29;
                                                                            j4 = j4;
                                                                            if (androidx.media3.common.util.c.n(xmlPullParser, str91)) {
                                                                                sVarR3 = p(xmlPullParser, (r) sVarR3);
                                                                                str46 = str91;
                                                                                str55 = str55;
                                                                                i4 = i50;
                                                                                j31 = j45;
                                                                                arrayList5 = arrayList50;
                                                                                arrayList26 = arrayList26;
                                                                                arrayList6 = arrayList27;
                                                                                str12 = str60;
                                                                                str43 = str7;
                                                                                str45 = str90;
                                                                            } else {
                                                                                str45 = str90;
                                                                                if (androidx.media3.common.util.c.n(xmlPullParser, str45)) {
                                                                                    long jD7 = d(xmlPullParser, j34);
                                                                                    str46 = str91;
                                                                                    str55 = str55;
                                                                                    arrayList5 = arrayList50;
                                                                                    sVarR3 = q(xmlPullParser, (o) sVarR3, j45, j9, j8, jD7, j);
                                                                                    j = j;
                                                                                    j9 = j9;
                                                                                    j34 = jD7;
                                                                                    arrayList6 = arrayList27;
                                                                                    str12 = str60;
                                                                                    i4 = i50;
                                                                                    str43 = str7;
                                                                                    j31 = j45;
                                                                                    arrayList26 = arrayList26;
                                                                                } else {
                                                                                    str46 = str91;
                                                                                    str55 = str55;
                                                                                    i40 = i50;
                                                                                    arrayList5 = arrayList50;
                                                                                    long j46 = j34;
                                                                                    if (androidx.media3.common.util.c.n(xmlPullParser, str42)) {
                                                                                        long jD8 = d(xmlPullParser, j46);
                                                                                        sVarR3 = r(xmlPullParser, (p) sVarR3, arrayList4, j45, j9, j8, jD8, j);
                                                                                        j9 = j9;
                                                                                        j31 = j45;
                                                                                        j34 = jD8;
                                                                                        arrayList26 = arrayList26;
                                                                                        arrayList6 = arrayList27;
                                                                                        str12 = str60;
                                                                                    } else {
                                                                                        j31 = j45;
                                                                                        if (androidx.media3.common.util.c.n(xmlPullParser, "InbandEventStream")) {
                                                                                            j9 = j9;
                                                                                            arrayList6 = arrayList27;
                                                                                            arrayList6.add(h(xmlPullParser, "InbandEventStream"));
                                                                                            j10 = j46;
                                                                                            arrayList26 = arrayList26;
                                                                                            str12 = str60;
                                                                                        } else {
                                                                                            arrayList6 = arrayList27;
                                                                                            if (androidx.media3.common.util.c.n(xmlPullParser, "Label")) {
                                                                                                j9 = j9;
                                                                                                str12 = str60;
                                                                                                String attributeValue32 = xmlPullParser.getAttributeValue(null, str12);
                                                                                                String text = "";
                                                                                                while (true) {
                                                                                                    xmlPullParser.next();
                                                                                                    j10 = j46;
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        text = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                    if (androidx.media3.common.util.c.l(xmlPullParser, "Label")) {
                                                                                                        arrayList26 = arrayList26;
                                                                                                        arrayList26.add(new androidx.media3.common.t(attributeValue32, text));
                                                                                                    } else {
                                                                                                        j46 = j10;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                j10 = j46;
                                                                                                arrayList26 = arrayList26;
                                                                                                str12 = str60;
                                                                                                if (xmlPullParser.getEventType() == 2) {
                                                                                                    j9 = j9;
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        j9 = j9;
                                                                                        j34 = j10;
                                                                                    }
                                                                                    i4 = i40;
                                                                                    str43 = str7;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList25 = arrayList25;
                                                        arrayList28 = arrayList28;
                                                        str12 = str32;
                                                        j31 = j31;
                                                        arrayList21 = arrayList21;
                                                        arrayList22 = arrayList22;
                                                        str42 = str42;
                                                        str7 = str43;
                                                        arrayList2 = arrayList2;
                                                        str = str;
                                                        str44 = str44;
                                                        str45 = str45;
                                                        str46 = str46;
                                                        arrayList26 = arrayList26;
                                                        f4 = f4;
                                                        str50 = str50;
                                                        str51 = str51;
                                                        str52 = str52;
                                                        j10 = j34;
                                                        arrayList33 = arrayList33;
                                                        arrayList4 = arrayList31;
                                                        str8 = str56;
                                                        str9 = str54;
                                                        str10 = str53;
                                                        j9 = jI7;
                                                        str11 = attributeValue14;
                                                        arrayList5 = arrayList29;
                                                        j = j30;
                                                        arrayList19 = arrayList19;
                                                        arrayList6 = arrayList27;
                                                        j29 = j29;
                                                        j4 = j4;
                                                        j9 = j9;
                                                        j34 = j10;
                                                        i4 = i40;
                                                        str43 = str7;
                                                    }
                                                    if (androidx.media3.common.util.c.l(xmlPullParser, str43)) {
                                                        arrayList14 = new ArrayList(arrayList32.size());
                                                        i27 = i2;
                                                        while (i27 < arrayList32.size()) {
                                                            arrayList15 = arrayList32;
                                                            d dVar9 = (d) arrayList15.get(i27);
                                                            qVarA = dVar9.a.a();
                                                            if (str48 == null && arrayList26.isEmpty()) {
                                                                str26 = str48;
                                                                qVarA.b = str26;
                                                            } else {
                                                                str26 = str48;
                                                                qVarA.c = h0.o(arrayList26);
                                                            }
                                                            str27 = dVar9.d;
                                                            if (str27 == null) {
                                                                str27 = str57;
                                                            }
                                                            arrayList16 = dVar9.e;
                                                            int i51 = i27;
                                                            arrayList16.addAll(arrayList25);
                                                            ArrayList arrayList51 = arrayList26;
                                                            if (arrayList16.isEmpty()) {
                                                                j15 = j31;
                                                                str28 = str12;
                                                                arrayList32 = arrayList15;
                                                            } else {
                                                                i28 = i2;
                                                                while (true) {
                                                                    if (i28 < arrayList16.size()) {
                                                                        lVar4 = (androidx.media3.common.l) arrayList16.get(i28);
                                                                        j15 = j31;
                                                                        if (androidx.media3.common.g.c.equals(lVar4.y) || (str29 = lVar4.z) == null) {
                                                                            i28++;
                                                                            j31 = j15;
                                                                        } else {
                                                                            arrayList16.remove(i28);
                                                                        }
                                                                    } else {
                                                                        j15 = j31;
                                                                        str29 = null;
                                                                    }
                                                                }
                                                                if (str29 != null) {
                                                                    i29 = i2;
                                                                    while (i29 < arrayList16.size()) {
                                                                        lVar = (androidx.media3.common.l) arrayList16.get(i29);
                                                                        String str92 = str12;
                                                                        if (!androidx.media3.common.g.b.equals(lVar.y) && lVar.z == null) {
                                                                            arrayList16.set(i29, new androidx.media3.common.l(androidx.media3.common.g.c, str29, lVar.A, lVar.B));
                                                                        }
                                                                        i29++;
                                                                        arrayList15 = arrayList15;
                                                                        str12 = str92;
                                                                    }
                                                                }
                                                                str28 = str12;
                                                                arrayList32 = arrayList15;
                                                                for (size = arrayList16.size() - 1; size >= 0; size--) {
                                                                    lVar2 = (androidx.media3.common.l) arrayList16.get(size);
                                                                    if (lVar2.B != null) {
                                                                        for (i30 = i2; i30 < arrayList16.size(); i30++) {
                                                                            lVar3 = (androidx.media3.common.l) arrayList16.get(i30);
                                                                            if (lVar3.B == null && lVar2.B == null) {
                                                                                UUID uuid = lVar2.y;
                                                                                lVar3.getClass();
                                                                                UUID uuid2 = androidx.media3.common.g.a;
                                                                                UUID uuid3 = lVar3.y;
                                                                                if (((uuid2.equals(uuid3) || uuid.equals(uuid3)) ? 1 : i2) != 0) {
                                                                                    arrayList16.remove(size);
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                qVarA.r = new androidx.media3.common.m(str27, arrayList16);
                                                            }
                                                            arrayList17 = dVar9.f;
                                                            arrayList17.addAll(arrayList6);
                                                            rVar2 = new androidx.media3.common.r(qVarA);
                                                            h0Var = dVar9.b;
                                                            sVar = dVar9.c;
                                                            if (sVar instanceof r) {
                                                                kVar = new l(rVar2, h0Var, (r) sVar, arrayList17);
                                                            } else {
                                                                if (sVar instanceof n) {
                                                                    net.luminis.tls.engine.impl.c.o("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                    return null;
                                                                }
                                                                kVar = new k(rVar2, h0Var, (n) sVar, arrayList17);
                                                            }
                                                            arrayList14.add(kVar);
                                                            i27 = i51 + 1;
                                                            str48 = str26;
                                                            j31 = j15;
                                                            arrayList26 = arrayList51;
                                                            str12 = str28;
                                                        }
                                                        str2 = str12;
                                                        i3 = 1;
                                                        arrayList21.add(new a(j33, i4, arrayList14, arrayList28, arrayList30, arrayList4));
                                                        j5 = j31;
                                                        j6 = j9;
                                                        str3 = str44;
                                                        str4 = str52;
                                                        j2 = -9223372036854775807L;
                                                    } else {
                                                        i3 = 1;
                                                        str43 = str43;
                                                        arrayList26 = arrayList26;
                                                        arrayList27 = arrayList6;
                                                        str46 = str46;
                                                        j4 = j4;
                                                        arrayList19 = arrayList19;
                                                        j29 = j29;
                                                        attributeValue14 = str11;
                                                        arrayList31 = arrayList4;
                                                        arrayList33 = arrayList33;
                                                        jD3 = j8;
                                                        arrayList28 = arrayList28;
                                                        arrayList30 = arrayList30;
                                                        f4 = f4;
                                                        str31 = str31;
                                                        arrayList21 = arrayList21;
                                                        arrayList22 = arrayList22;
                                                        str44 = str44;
                                                        str = str;
                                                        j30 = j;
                                                        str45 = str45;
                                                        str42 = str42;
                                                        arrayList29 = arrayList5;
                                                        z2 = z2;
                                                        jI7 = j9;
                                                        arrayList25 = arrayList25;
                                                        str52 = str52;
                                                        str32 = str12;
                                                        i40 = i4;
                                                        str53 = str10;
                                                        arrayList2 = arrayList2;
                                                        str54 = str9;
                                                        str56 = str8;
                                                        j31 = j31;
                                                        str51 = str51;
                                                        arrayList3 = arrayList3;
                                                        str55 = str55;
                                                        str50 = str50;
                                                    }
                                                }
                                                str55 = str55;
                                                i4 = i40;
                                                arrayList33 = arrayList33;
                                                str12 = str32;
                                                str42 = str42;
                                                str8 = str56;
                                                str9 = str54;
                                                str10 = str53;
                                                arrayList4 = arrayList31;
                                                j9 = jI7;
                                                str11 = attributeValue14;
                                                arrayList5 = arrayList29;
                                                j = j30;
                                                arrayList19 = arrayList19;
                                                arrayList6 = arrayList27;
                                                j29 = j29;
                                                j4 = j4;
                                                if (androidx.media3.common.util.c.l(xmlPullParser, str43)) {
                                                    arrayList14 = new ArrayList(arrayList32.size());
                                                    i27 = i2;
                                                    while (i27 < arrayList32.size()) {
                                                        arrayList15 = arrayList32;
                                                        d dVar10 = (d) arrayList15.get(i27);
                                                        qVarA = dVar10.a.a();
                                                        if (str48 == null) {
                                                            str26 = str48;
                                                            qVarA.c = h0.o(arrayList26);
                                                        } else {
                                                            str26 = str48;
                                                            qVarA.c = h0.o(arrayList26);
                                                        }
                                                        str27 = dVar10.d;
                                                        if (str27 == null) {
                                                            str27 = str57;
                                                        }
                                                        arrayList16 = dVar10.e;
                                                        int i52 = i27;
                                                        arrayList16.addAll(arrayList25);
                                                        ArrayList arrayList52 = arrayList26;
                                                        if (arrayList16.isEmpty()) {
                                                            i28 = i2;
                                                            while (true) {
                                                                if (i28 < arrayList16.size()) {
                                                                    lVar4 = (androidx.media3.common.l) arrayList16.get(i28);
                                                                    j15 = j31;
                                                                    if (androidx.media3.common.g.c.equals(lVar4.y)) {
                                                                    }
                                                                    i28++;
                                                                    j31 = j15;
                                                                } else {
                                                                    j15 = j31;
                                                                    str29 = null;
                                                                }
                                                            }
                                                            if (str29 != null) {
                                                                i29 = i2;
                                                                while (i29 < arrayList16.size()) {
                                                                    lVar = (androidx.media3.common.l) arrayList16.get(i29);
                                                                    String str93 = str12;
                                                                    if (!androidx.media3.common.g.b.equals(lVar.y)) {
                                                                    }
                                                                    i29++;
                                                                    arrayList15 = arrayList15;
                                                                    str12 = str93;
                                                                }
                                                            }
                                                            str28 = str12;
                                                            arrayList32 = arrayList15;
                                                            while (size >= 0) {
                                                                lVar2 = (androidx.media3.common.l) arrayList16.get(size);
                                                                if (lVar2.B != null) {
                                                                    while (i30 < arrayList16.size()) {
                                                                        lVar3 = (androidx.media3.common.l) arrayList16.get(i30);
                                                                        if (lVar3.B == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            qVarA.r = new androidx.media3.common.m(str27, arrayList16);
                                                        } else {
                                                            j15 = j31;
                                                            str28 = str12;
                                                            arrayList32 = arrayList15;
                                                        }
                                                        arrayList17 = dVar10.f;
                                                        arrayList17.addAll(arrayList6);
                                                        rVar2 = new androidx.media3.common.r(qVarA);
                                                        h0Var = dVar10.b;
                                                        sVar = dVar10.c;
                                                        if (sVar instanceof r) {
                                                            kVar = new l(rVar2, h0Var, (r) sVar, arrayList17);
                                                        } else {
                                                            if (sVar instanceof n) {
                                                                net.luminis.tls.engine.impl.c.o("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                return null;
                                                            }
                                                            kVar = new k(rVar2, h0Var, (n) sVar, arrayList17);
                                                        }
                                                        arrayList14.add(kVar);
                                                        i27 = i52 + 1;
                                                        str48 = str26;
                                                        j31 = j15;
                                                        arrayList26 = arrayList52;
                                                        str12 = str28;
                                                    }
                                                    str2 = str12;
                                                    i3 = 1;
                                                    arrayList21.add(new a(j33, i4, arrayList14, arrayList28, arrayList30, arrayList4));
                                                    j5 = j31;
                                                    j6 = j9;
                                                    str3 = str44;
                                                    str4 = str52;
                                                    j2 = -9223372036854775807L;
                                                } else {
                                                    i3 = 1;
                                                    str43 = str43;
                                                    arrayList26 = arrayList26;
                                                    arrayList27 = arrayList6;
                                                    str46 = str46;
                                                    j4 = j4;
                                                    arrayList19 = arrayList19;
                                                    j29 = j29;
                                                    attributeValue14 = str11;
                                                    arrayList31 = arrayList4;
                                                    arrayList33 = arrayList33;
                                                    jD3 = j8;
                                                    arrayList28 = arrayList28;
                                                    arrayList30 = arrayList30;
                                                    f4 = f4;
                                                    str31 = str31;
                                                    arrayList21 = arrayList21;
                                                    arrayList22 = arrayList22;
                                                    str44 = str44;
                                                    str = str;
                                                    j30 = j;
                                                    str45 = str45;
                                                    str42 = str42;
                                                    arrayList29 = arrayList5;
                                                    z2 = z2;
                                                    jI7 = j9;
                                                    arrayList25 = arrayList25;
                                                    str52 = str52;
                                                    str32 = str12;
                                                    i40 = i4;
                                                    str53 = str10;
                                                    arrayList2 = arrayList2;
                                                    str54 = str9;
                                                    str56 = str8;
                                                    j31 = j31;
                                                    str51 = str51;
                                                    arrayList3 = arrayList3;
                                                    str55 = str55;
                                                    str50 = str50;
                                                }
                                            }
                                        } else {
                                            arrayList = arrayList20;
                                            String str94 = str38;
                                            str31 = str31;
                                            str = str39;
                                            String str95 = str40;
                                            z2 = z2;
                                            str2 = str32;
                                            j = j30;
                                            long j47 = jI7;
                                            arrayList21 = arrayList21;
                                            arrayList22 = arrayList22;
                                            arrayList19 = arrayList19;
                                            long j48 = j31;
                                            arrayList2 = arrayList23;
                                            j29 = j29;
                                            j4 = j18;
                                            if (androidx.media3.common.util.c.n(xmlPullParser, "EventStream")) {
                                                str3 = str95;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, str3);
                                                String str96 = attributeValue33 == null ? "" : attributeValue33;
                                                String str97 = str41;
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, str97);
                                                String str98 = attributeValue34 == null ? "" : attributeValue34;
                                                String attributeValue35 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long j49 = attributeValue35 == null ? 1L : Long.parseLong(attributeValue35);
                                                String attributeValue36 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long j50 = attributeValue36 == null ? 0L : Long.parseLong(attributeValue36);
                                                ArrayList arrayList53 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (androidx.media3.common.util.c.n(xmlPullParser, "Event")) {
                                                        str6 = str94;
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, str6);
                                                        long j51 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        str5 = str;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, str5);
                                                        long j52 = attributeValue38 == null ? -9223372036854775807L : Long.parseLong(attributeValue38);
                                                        String attributeValue39 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long j53 = attributeValue39 == null ? 0L : Long.parseLong(attributeValue39);
                                                        String str99 = j0.a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long jY = j0.Y(j52, 1000L, j49, roundingMode);
                                                        long jY2 = j0.Y(j53 - j50, 1000000L, j49, roundingMode);
                                                        String attributeValue40 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue40 == null) {
                                                            attributeValue40 = null;
                                                        }
                                                        byteArrayOutputStream3.reset();
                                                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                                        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!androidx.media3.common.util.c.l(xmlPullParser, "Event")) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    j50 = j50;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    j50 = j50;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    xmlSerializerNewSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i53 = i2;
                                                                    while (i53 < xmlPullParser.getAttributeCount()) {
                                                                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i53), xmlPullParser.getAttributeName(i53), xmlPullParser.getAttributeValue(i53));
                                                                        i53++;
                                                                        byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                    }
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 3:
                                                                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 4:
                                                                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 5:
                                                                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 6:
                                                                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 7:
                                                                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 8:
                                                                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 9:
                                                                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 10:
                                                                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                default:
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                                            j50 = j50;
                                                        }
                                                        j7 = j50;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        xmlSerializerNewSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long lValueOf = Long.valueOf(jY2);
                                                        if (attributeValue40 != null) {
                                                            byteArray = attributeValue40.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        arrayList53.add(Pair.create(lValueOf, new androidx.media3.extractor.metadata.emsg.a(str96, str98, jY, j51, byteArray)));
                                                    } else {
                                                        j7 = j50;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        str5 = str;
                                                        str6 = str94;
                                                        b(xmlPullParser);
                                                    }
                                                    if (androidx.media3.common.util.c.l(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList53.size()];
                                                        androidx.media3.extractor.metadata.emsg.a[] aVarArr = new androidx.media3.extractor.metadata.emsg.a[arrayList53.size()];
                                                        for (int i54 = i2; i54 < arrayList53.size(); i54++) {
                                                            Pair pair = (Pair) arrayList53.get(i54);
                                                            jArr[i54] = ((Long) pair.first).longValue();
                                                            aVarArr[i54] = (androidx.media3.extractor.metadata.emsg.a) pair.second;
                                                        }
                                                        arrayList22.add(new g(str96, str98, jArr, aVarArr));
                                                        str = str5;
                                                        j5 = j48;
                                                        str41 = str97;
                                                        j6 = j47;
                                                        j2 = -9223372036854775807L;
                                                        str4 = str6;
                                                    } else {
                                                        str96 = str96;
                                                        str98 = str98;
                                                        str94 = str6;
                                                        str = str5;
                                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                                        str97 = str97;
                                                        j49 = j49;
                                                        j50 = j7;
                                                        str3 = str3;
                                                        arrayList21 = arrayList21;
                                                    }
                                                }
                                            } else {
                                                arrayList21 = arrayList21;
                                                String str100 = str41;
                                                str3 = str95;
                                                if (androidx.media3.common.util.c.n(xmlPullParser, "SegmentBase")) {
                                                    sVarR2 = p(xmlPullParser, null);
                                                    arrayList22 = arrayList22;
                                                    j5 = j48;
                                                    str41 = str100;
                                                    j6 = j47;
                                                    j2 = -9223372036854775807L;
                                                    str4 = str94;
                                                } else if (androidx.media3.common.util.c.n(xmlPullParser, "SegmentList")) {
                                                    j2 = -9223372036854775807L;
                                                    long jD9 = d(xmlPullParser, -9223372036854775807L);
                                                    arrayList22 = arrayList22;
                                                    str41 = str100;
                                                    str4 = str94;
                                                    sVarR2 = q(xmlPullParser, null, j48, j47, j3, jD9, j);
                                                    j = j;
                                                    j6 = j47;
                                                    j5 = j48;
                                                    j32 = jD9;
                                                } else {
                                                    j5 = j48;
                                                    str41 = str100;
                                                    j6 = j47;
                                                    j2 = -9223372036854775807L;
                                                    str4 = str94;
                                                    if (androidx.media3.common.util.c.n(xmlPullParser, str42)) {
                                                        arrayList22 = arrayList22;
                                                        long jD10 = d(xmlPullParser, -9223372036854775807L);
                                                        e0 e0Var = h0.y;
                                                        sVarR2 = r(xmlPullParser, null, a1.B, j5, j6, j3, jD10, j);
                                                        j32 = jD10;
                                                    } else if (androidx.media3.common.util.c.n(xmlPullParser, "AssetIdentifier")) {
                                                        arrayList22 = arrayList22;
                                                        h(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        arrayList22 = arrayList22;
                                                        b(xmlPullParser);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (androidx.media3.common.util.c.l(xmlPullParser, obj)) {
                                        Pair pairCreate2 = Pair.create(new h(attributeValue11, jI6, arrayList21, arrayList22), Long.valueOf(j6));
                                        h hVar2 = (h) pairCreate2.first;
                                        if (hVar2.b != j2) {
                                            long jLongValue = ((Long) pairCreate2.second).longValue();
                                            j16 = jLongValue == j2 ? j2 : jLongValue + hVar2.b;
                                            arrayList18 = arrayList18;
                                            arrayList18.add(hVar2);
                                        } else {
                                            if (!zEquals) {
                                                throw androidx.media3.common.j0.b(null, "Unable to determine start of period " + arrayList18.size());
                                            }
                                            arrayList18 = arrayList18;
                                            i34 = i3;
                                            j16 = j4;
                                        }
                                        j18 = j16;
                                    } else {
                                        obj = obj;
                                        jI7 = j6;
                                        j18 = j4;
                                        arrayList19 = arrayList19;
                                        j29 = j29;
                                        arrayList23 = arrayList2;
                                        arrayList20 = arrayList;
                                        str38 = str4;
                                        str32 = str2;
                                        str31 = str31;
                                        arrayList21 = arrayList21;
                                        arrayList22 = arrayList22;
                                        str39 = str;
                                        j31 = j5;
                                        j30 = j;
                                        z2 = z2;
                                        jD2 = j3;
                                        str40 = str3;
                                    }
                                }
                            } else {
                                z2 = z2;
                                j = j30;
                                j2 = j20;
                                arrayList19 = arrayList19;
                                j29 = j29;
                                j18 = j18;
                                arrayList18 = arrayList18;
                                b(xmlPullParser);
                            }
                            jD = j29;
                        }
                        if (androidx.media3.common.util.c.l(xmlPullParser, "MPD")) {
                            if (jI == j2) {
                                if (j18 != j2) {
                                    jI = j18;
                                } else if (!zEquals) {
                                    throw androidx.media3.common.j0.b(null, "Unable to determine duration of static manifest.");
                                }
                            }
                            if (arrayList18.isEmpty()) {
                                throw androidx.media3.common.j0.b(null, "No periods found.");
                            }
                            return new c(jT, jI, jI2, zEquals, jI3, j, jI5, jT2, iVar, uVar, wVar, uriR, arrayList18);
                        }
                        arrayList18 = arrayList18;
                        jI4 = j;
                        j17 = j2;
                        i31 = i2;
                        i = i3;
                        j18 = j18;
                        arrayList19 = arrayList19;
                        arrayListP = arrayListP;
                        z2 = z2;
                        str30 = null;
                    }
                    j2 = j20;
                }
                arrayList18 = arrayList18;
                if (androidx.media3.common.util.c.l(xmlPullParser, "MPD")) {
                    if (jI == j2) {
                        if (j18 != j2) {
                            jI = j18;
                        } else if (!zEquals) {
                            throw androidx.media3.common.j0.b(null, "Unable to determine duration of static manifest.");
                        }
                    }
                    if (arrayList18.isEmpty()) {
                        return new c(jT, jI, jI2, zEquals, jI3, j, jI5, jT2, iVar, uVar, wVar, uriR, arrayList18);
                    }
                    throw androidx.media3.common.j0.b(null, "No periods found.");
                }
                arrayList18 = arrayList18;
                jI4 = j;
                j17 = j2;
                i31 = i2;
                i = i3;
                j18 = j18;
                arrayList19 = arrayList19;
                arrayListP = arrayListP;
                z2 = z2;
                str30 = null;
            }
            j = jI4;
            if (androidx.media3.common.util.c.l(xmlPullParser, "MPD")) {
                if (jI == j2) {
                    if (j18 != j2) {
                        jI = j18;
                    } else if (!zEquals) {
                        throw androidx.media3.common.j0.b(null, "Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList18.isEmpty()) {
                    return new c(jT, jI, jI2, zEquals, jI3, j, jI5, jT2, iVar, uVar, wVar, uriR, arrayList18);
                }
                throw androidx.media3.common.j0.b(null, "No periods found.");
            }
            arrayList18 = arrayList18;
            jI4 = j;
            j17 = j2;
            i31 = i2;
            i = i3;
            j18 = j18;
            arrayList19 = arrayList19;
            arrayListP = arrayListP;
            z2 = z2;
            str30 = null;
        }
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new j(j, j2, attributeValue);
    }

    public static int n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return LibretroCore.SCREEN_WIDTH;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (com.google.common.base.b.h("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j = rVar != null ? rVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = rVar != null ? rVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = rVar != null ? rVar.d : 0L;
        long j6 = rVar != null ? rVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j5 = Long.parseLong(strArrSplit[0]);
            j6 = (Long.parseLong(strArrSplit[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        j jVarM = rVar != null ? rVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (androidx.media3.common.util.c.n(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarM;
            if (androidx.media3.common.util.c.l(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j2, j4, j8, j7);
            }
            jVarM = jVar;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6 = oVar != null ? oVar.b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = oVar != null ? oVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = oVar != null ? oVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = oVar != null ? oVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        j jVarM = null;
        List listS = null;
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.c.n(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (androidx.media3.common.util.c.n(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j7, j2);
            } else if (androidx.media3.common.util.c.n(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!androidx.media3.common.util.c.l(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarM == null) {
                jVarM = oVar.a;
            }
            if (listS == null) {
                listS = oVar.f;
            }
            if (arrayList == null) {
                arrayList = oVar.j;
            }
        }
        return new o(jVarM, j7, j9, j13, j11, listS, j15, arrayList, j0.Q(j5), j0.Q(j));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long j7 = pVar != null ? pVar.b : 1L;
        j jVarM = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = pVar != null ? pVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = pVar != null ? pVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = pVar != null ? pVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            f fVar = (f) list.get(i);
            if (com.google.common.base.b.h("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j6 = Long.parseLong(fVar.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        c2 c2VarT = t(xmlPullParser, "media", pVar != null ? pVar.k : null);
        c2 c2VarT2 = t(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List listS = null;
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.c.n(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (androidx.media3.common.util.c.n(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j8, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!androidx.media3.common.util.c.l(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarM == null) {
                jVarM = pVar.a;
            }
            if (listS == null) {
                listS = pVar.f;
            }
        }
        return new p(jVarM, j8, j10, j14, j15, j12, listS, j17, c2VarT2, c2VarT, j0.Q(j5), j0.Q(j));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j4 = -9223372036854775807L;
        boolean z2 = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.c.n(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j5 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z2) {
                    int i2 = i;
                    j3 = j5;
                    jA = a(arrayList, jA, j4, i2, j3);
                } else {
                    j3 = j5;
                }
                if (j3 != -9223372036854775807L) {
                    jA = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j4 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z2 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!androidx.media3.common.util.c.l(xmlPullParser, "SegmentTimeline"));
        if (z2) {
            String str = j0.a;
            a(arrayList, jA, j4, i, j0.Y(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00fc. Please report as an issue. */
    public static c2 t(XmlPullParser xmlPullParser, String str, c2 c2Var) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return c2Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i);
                String strSubstring2 = attributeValue.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            net.luminis.tls.engine.impl.c.o("Invalid template: ".concat(attributeValue));
                            return null;
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new c2(17, arrayList, arrayList2, arrayList3);
    }

    @Override // androidx.media3.exoplayer.upstream.p
    public final Object j(Uri uri, androidx.media3.datasource.j jVar) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.e.newPullParser();
            xmlPullParserNewPullParser.setInput(jVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return l(xmlPullParserNewPullParser, uri);
            }
            throw androidx.media3.common.j0.b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            if (e.getDetail() instanceof IOException) {
                throw ((IOException) e.getDetail());
            }
            throw androidx.media3.common.j0.b(e, null);
        }
    }
}
