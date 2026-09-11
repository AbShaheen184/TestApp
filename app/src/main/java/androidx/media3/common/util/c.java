package androidx.media3.common.util;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.collect.a1;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static ExecutorService a;
    public static final Object b = new Object();

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (b) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbD = androidx.constraintlayout.core.g.d(str, "\n  ");
        sbD.append(strReplace.replace("\n", "\n  "));
        sbD.append('\n');
        return sbD.toString();
    }

    public static void b() throws k {
        StringBuilder sb = new StringBuilder();
        com.google.common.collect.q.f(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i2 = i + 1;
            int iE = com.google.common.collect.a0.e(objArrCopyOf.length, i2);
            if (iE > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
            }
            objArrCopyOf[i] = numValueOf;
            z = true;
            i = i2;
        }
        if (z) {
            throw new k(sb.toString(), com.google.common.collect.h0.j(i, objArrCopyOf));
        }
    }

    public static void c(String str, boolean z) throws k {
        if (z) {
            return;
        }
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        throw new k(str, a1.B);
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void e(String str, String str2) {
        synchronized (b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void f(String str, String str2) {
        synchronized (b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void g(String str, String str2, Throwable th) {
        synchronized (b) {
            Log.e(str, a(str2, th));
        }
    }

    public static synchronized Executor h() {
        try {
            if (a == null) {
                String str = j0.a;
                a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:BackgroundExecutor", 1));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static String i(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static int[] j(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void k(String str, String str2) {
        synchronized (b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean m(String str) throws k {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        c("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        c("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new k("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(iEglGetError), com.google.common.collect.h0.s(Integer.valueOf(iEglGetError)));
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void o(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static String p(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static String q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrJ = j(str2);
        if (iArrJ[0] != -1) {
            sb.append(str2);
            p(sb, iArrJ[1], iArrJ[2]);
            return sb.toString();
        }
        int[] iArrJ2 = j(str);
        if (iArrJ[3] == 0) {
            sb.append((CharSequence) str, 0, iArrJ2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrJ[2] == 0) {
            sb.append((CharSequence) str, 0, iArrJ2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrJ[1];
        if (i != 0) {
            int i2 = iArrJ2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return p(sb, iArrJ[1] + i2, i2 + iArrJ[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrJ2[1]);
            sb.append(str2);
            int i3 = iArrJ2[1];
            return p(sb, i3, iArrJ[2] + i3);
        }
        int i4 = iArrJ2[0] + 2;
        int i5 = iArrJ2[1];
        if (i4 >= i5 || i5 != iArrJ2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrJ2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrJ2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return p(sb, iArrJ2[1], i6 + iArrJ[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrJ2[1];
        return p(sb, i7, iArrJ[2] + i7 + 1);
    }

    public static Uri r(String str, String str2) {
        return Uri.parse(q(str, str2));
    }

    public static void s(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void t(String str, String str2) {
        synchronized (b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void u(String str, String str2, Throwable th) {
        synchronized (b) {
            Log.w(str, a(str2, th));
        }
    }
}
