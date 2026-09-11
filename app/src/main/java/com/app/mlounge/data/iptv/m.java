package com.app.mlounge.data.iptv;

import android.util.Xml;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final int $stable;
    public static final m INSTANCE = new m();
    private static final SimpleDateFormat sdfNoTz;
    private static final SimpleDateFormat sdfWithTz;

    static {
        Locale locale = Locale.US;
        sdfWithTz = new SimpleDateFormat("yyyyMMddHHmmss Z", locale);
        sdfNoTz = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        $stable = 8;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[PHI: r11 r12 r13 r17
  0x0063: PHI (r11v4 boolean) = 
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v2 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
 binds: [B:72:0x0112, B:93:0x014a, B:89:0x013f, B:88:0x013d, B:84:0x0132, B:85:0x0134, B:83:0x0130, B:79:0x0125, B:78:0x0123, B:75:0x011b, B:33:0x0084, B:51:0x00b5, B:47:0x00aa, B:43:0x009f, B:39:0x0094, B:36:0x008d, B:12:0x0049, B:26:0x006c, B:27:0x006e, B:28:0x0070, B:25:0x006a, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r12v4 java.lang.String) = 
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v1 java.lang.String)
  (r12v8 java.lang.String)
 binds: [B:72:0x0112, B:93:0x014a, B:89:0x013f, B:88:0x013d, B:84:0x0132, B:85:0x0134, B:83:0x0130, B:79:0x0125, B:78:0x0123, B:75:0x011b, B:33:0x0084, B:51:0x00b5, B:47:0x00aa, B:43:0x009f, B:39:0x0094, B:36:0x008d, B:12:0x0049, B:26:0x006c, B:27:0x006e, B:28:0x0070, B:25:0x006a, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r13v4 java.lang.String) = 
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v1 java.lang.String)
  (r13v8 java.lang.String)
  (r13v1 java.lang.String)
 binds: [B:72:0x0112, B:93:0x014a, B:89:0x013f, B:88:0x013d, B:84:0x0132, B:85:0x0134, B:83:0x0130, B:79:0x0125, B:78:0x0123, B:75:0x011b, B:33:0x0084, B:51:0x00b5, B:47:0x00aa, B:43:0x009f, B:39:0x0094, B:36:0x008d, B:12:0x0049, B:26:0x006c, B:27:0x006e, B:28:0x0070, B:25:0x006a, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r17v4 java.lang.String) = 
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
  (r17v5 java.lang.String)
  (r17v1 java.lang.String)
  (r17v1 java.lang.String)
 binds: [B:72:0x0112, B:93:0x014a, B:89:0x013f, B:88:0x013d, B:84:0x0132, B:85:0x0134, B:83:0x0130, B:79:0x0125, B:78:0x0123, B:75:0x011b, B:33:0x0084, B:51:0x00b5, B:47:0x00aa, B:43:0x009f, B:39:0x0094, B:36:0x008d, B:12:0x0049, B:26:0x006c, B:27:0x006e, B:28:0x0070, B:25:0x006a, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static LinkedHashMap a(InputStream inputStream) {
        String lowerCase;
        Object obj;
        String lowerCase2;
        String string;
        inputStream.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - 7200000;
        long j2 = jCurrentTimeMillis + 43200000;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            int eventType = xmlPullParserNewPullParser.getEventType();
            String str = null;
            String str2 = null;
            String attributeValue = null;
            String str3 = null;
            Long lB = null;
            Long lB2 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (eventType != 1) {
                long j3 = j2;
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (name != null) {
                            lowerCase2 = name.toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                        } else {
                            lowerCase2 = null;
                        }
                        if (lowerCase2 != null) {
                            switch (lowerCase2.hashCode()) {
                                case -968778980:
                                    if (lowerCase2.equals("programme")) {
                                        if (attributeValue != null && lB != null && lB2 != null && str != null && !kotlin.text.k.d0(str) && lB2.longValue() > j && lB.longValue() < j3) {
                                            Object arrayList = linkedHashMap.get(attributeValue);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                linkedHashMap.put(attributeValue, arrayList);
                                            }
                                            String str4 = str;
                                            String str5 = str2;
                                            n nVar = new n(attributeValue, str4, str5, lB.longValue(), lB2.longValue(), str3);
                                            str2 = str5;
                                            str = str4;
                                            ((List) arrayList).add(nVar);
                                        }
                                        obj = null;
                                        z = false;
                                        z2 = false;
                                        z3 = false;
                                        attributeValue = null;
                                    }
                                    break;
                                case 3079825:
                                    if (lowerCase2.equals("desc")) {
                                        obj = null;
                                        z2 = false;
                                    }
                                    break;
                                case 50511102:
                                    if (lowerCase2.equals("category")) {
                                        obj = null;
                                        z3 = false;
                                    }
                                    break;
                                case 110371416:
                                    if (lowerCase2.equals("title")) {
                                        obj = null;
                                        z = false;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    } else if (eventType == 4) {
                        String text = xmlPullParserNewPullParser.getText();
                        if (text == null || (string = kotlin.text.k.A0(text).toString()) == null) {
                            string = "";
                        }
                        if (z && str == null) {
                            str = string;
                        } else if (z2 && str2 == null) {
                            str2 = string;
                        } else if (z3 && str3 == null) {
                            str3 = string;
                        }
                    }
                    obj = null;
                } else {
                    String name2 = xmlPullParserNewPullParser.getName();
                    if (name2 != null) {
                        lowerCase = name2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        switch (lowerCase.hashCode()) {
                            case -968778980:
                                if (lowerCase.equals("programme")) {
                                    obj = null;
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "channel");
                                    lB = b(xmlPullParserNewPullParser.getAttributeValue(null, "start"));
                                    lB2 = b(xmlPullParserNewPullParser.getAttributeValue(null, "stop"));
                                    str = null;
                                    str2 = null;
                                    str3 = null;
                                } else {
                                    obj = null;
                                }
                                break;
                            case 3079825:
                                if (lowerCase.equals("desc") && attributeValue != null) {
                                    obj = null;
                                    z2 = true;
                                } else {
                                    obj = null;
                                }
                                break;
                            case 50511102:
                                if (lowerCase.equals("category") && attributeValue != null) {
                                    z3 = true;
                                }
                                obj = null;
                                break;
                            case 110371416:
                                if (lowerCase.equals("title") && attributeValue != null) {
                                    obj = null;
                                    z = true;
                                } else {
                                    obj = null;
                                }
                                break;
                            default:
                                obj = null;
                                break;
                        }
                    } else {
                        obj = null;
                    }
                }
                eventType = xmlPullParserNewPullParser.next();
                j2 = j3;
            }
        } catch (Exception unused) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.a0.u(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), kotlin.collections.o.f0((List) entry.getValue(), new androidx.constraintlayout.core.e(9)));
        }
        return linkedHashMap2;
    }

    public static Long b(String str) {
        if (str == null || kotlin.text.k.d0(str)) {
            return null;
        }
        String string = kotlin.text.k.A0(str).toString();
        try {
            try {
                Date date = sdfWithTz.parse(string);
                if (date != null) {
                    return Long.valueOf(date.getTime());
                }
                return null;
            } catch (Exception unused) {
                Date date2 = sdfNoTz.parse(kotlin.text.k.y0(14, string));
                if (date2 != null) {
                    return Long.valueOf(date2.getTime());
                }
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
        return null;
    }
}
