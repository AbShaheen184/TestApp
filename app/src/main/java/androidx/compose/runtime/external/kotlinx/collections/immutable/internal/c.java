package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.compose.runtime.r;
import androidx.compose.ui.res.e;
import androidx.media3.common.util.j0;
import com.google.android.material.shape.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static void A(int i, int i2, int i3, int i4, int i5) {
        j0.K(i);
        j0.K(i2);
        j0.K(i3);
        j0.K(i4);
        j0.K(i5);
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static e a(String str) {
        androidx.compose.ui.internal.a.c(str);
        return new e(10);
    }

    public static ClassCastException b(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object c(HashMap map, Uri uri, Uri uri2) {
        com.google.android.material.motion.a.q(map.containsKey(uri));
        return map.get(uri2);
    }

    public static String d(int i, String str) {
        return i + str;
    }

    public static String e(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String f(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String g(String str, long j) {
        return str + j;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String k(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder m(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static List p(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        Objects.requireNonNull(obj);
        arrayList.add(obj2);
        return Collections.unmodifiableList(arrayList2);
    }

    public static g q(String str, int i, String str2, String str3) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str2);
        matcher.getClass();
        return k.C(matcher, i, str3);
    }

    public static void r(int i, int i2, int i3, int i4, int i5) {
        androidx.compose.ui.input.key.c.a(i);
        androidx.compose.ui.input.key.c.a(i2);
        androidx.compose.ui.input.key.c.a(i3);
        androidx.compose.ui.input.key.c.a(i4);
        androidx.compose.ui.input.key.c.a(i5);
    }

    public static void s(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(Cursor cursor) throws Exception {
        boolean zIsTerminated;
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (!(cursor instanceof ExecutorService)) {
            if (cursor instanceof TypedArray) {
                ((TypedArray) cursor).recycle();
                return;
            }
            if (cursor instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cursor).release();
                return;
            } else if (cursor instanceof MediaDrm) {
                ((MediaDrm) cursor).release();
                return;
            } else {
                net.luminis.tls.engine.impl.c.a();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) cursor;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void u(r rVar, boolean z, boolean z2, boolean z3) {
        rVar.p(z);
        rVar.p(z2);
        rVar.p(z3);
    }

    public static /* synthetic */ void v(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                net.luminis.tls.engine.impl.c.a();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void w(String str, int i, String str2) {
        androidx.media3.common.util.c.t(str2, str + i);
    }

    public static void x(String str, String str2, String str3) {
        androidx.media3.common.util.c.t(str3, str + str2);
    }

    public static void y(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void z(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }
}
