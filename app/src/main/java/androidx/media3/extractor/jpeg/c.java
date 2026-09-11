package androidx.media3.extractor.jpeg;

import androidx.compose.foundation.gestures.y2;
import androidx.media3.common.j0;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static y2 a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!androidx.media3.common.util.c.n(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw j0.a(null, "Couldn't find xmp metadata");
        }
        e0 e0Var = h0.y;
        a1 a1VarB = a1.B;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (androidx.media3.common.util.c.n(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strI = androidx.media3.common.util.c.i(xmlPullParserNewPullParser, a[i2]);
                    if (strI != null) {
                        if (Integer.parseInt(strI) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strI2 = androidx.media3.common.util.c.i(xmlPullParserNewPullParser, b[i3]);
                                if (strI2 != null) {
                                    j = Long.parseLong(strI2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                e0 e0Var2 = h0.y;
                                a1VarB = a1.B;
                                break;
                            }
                            String strI3 = androidx.media3.common.util.c.i(xmlPullParserNewPullParser, c[i]);
                            if (strI3 != null) {
                                a1VarB = h0.t(new b(0L, 0L, "image/jpeg"), new b(Long.parseLong(strI3), 0L, "video/mp4"));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (androidx.media3.common.util.c.n(xmlPullParserNewPullParser, "Container:Directory")) {
                a1VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (androidx.media3.common.util.c.n(xmlPullParserNewPullParser, "GContainer:Directory")) {
                a1VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!androidx.media3.common.util.c.l(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (a1VarB.isEmpty()) {
            break loop0;
        }
        return new y2(j, a1VarB, 4);
        return null;
    }

    public static a1 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        d0 d0VarK = h0.k();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.c.n(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strI = androidx.media3.common.util.c.i(xmlPullParser, strConcat3);
                String strI2 = androidx.media3.common.util.c.i(xmlPullParser, strConcat4);
                String strI3 = androidx.media3.common.util.c.i(xmlPullParser, strConcat5);
                String strI4 = androidx.media3.common.util.c.i(xmlPullParser, strConcat6);
                if (strI == null || strI2 == null) {
                    return a1.B;
                }
                d0VarK.b(new b(strI3 != null ? Long.parseLong(strI3) : 0L, strI4 != null ? Long.parseLong(strI4) : 0L, strI));
            }
        } while (!androidx.media3.common.util.c.l(xmlPullParser, strConcat2));
        return d0VarK.g();
    }
}
