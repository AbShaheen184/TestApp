package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static boolean b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int c(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return androidx.core.graphics.a.a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float d(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0120 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014b A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x014f A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    public static d g(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        int i2;
        ?? r4;
        long j;
        Throwable th;
        ?? r5;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            i(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.core.a.b);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.core.a.c);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            i(xmlResourceParser);
                        }
                        arrayList.add(new f(i5, i7, resourceId2, string7, string6, z));
                    } else {
                        i(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList.toArray(new f[0]));
        }
        List listH = h(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.core.a.d);
                    int i9 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r4 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                i(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r4 = typedArrayObtainAttributes3;
                            i2 = i9;
                            j = 1;
                            try {
                                androidx.core.provider.d dVar = new androidx.core.provider.d(string, string2, string8, listH, string9, string10);
                                if (r4 instanceof AutoCloseable) {
                                    ((AutoCloseable) r4).close();
                                } else if (r4 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r4;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService2.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r4.recycle();
                                }
                                arrayList2.add(dVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r4 = typedArrayObtainAttributes3;
                            j = 1;
                            th = th;
                            r5 = r4;
                            if (r5 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r5 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r5).close();
                                    throw th;
                                }
                                if (r5 instanceof ExecutorService) {
                                    r5.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r5;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r5 = r4;
                    if (r5 != 0) {
                        throw th;
                    }
                    if (!(r5 instanceof AutoCloseable)) {
                        ((AutoCloseable) r5).close();
                        throw th;
                    }
                    if (r5 instanceof ExecutorService) {
                        r5.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r5;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z3 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z3) {
                                executorService.shutdownNow();
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i2 = integer;
                i(xmlResourceParser);
                integer = i2;
                integer2 = integer2;
                string5 = string5;
                i = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i10 = integer2;
        String str = string5;
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new g(arrayList2, i11, i10, str);
        }
        if (string3 == null) {
            net.luminis.tls.engine.impl.c.o("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new androidx.core.provider.d(string, string2, string3, listH, null, null));
        if (string4 != null) {
            arrayList2.add(new androidx.core.provider.d(string, string2, string4, listH, null, null));
        }
        return new g(arrayList2, i11, i10, str);
    }

    public static List h(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static float j() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new androidx.compose.foundation.text.input.internal.d(this, i, 1));
    }

    public abstract void e(int i);

    public abstract void f(Typeface typeface);
}
