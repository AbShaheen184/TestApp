package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.collection.u;
import androidx.collection.y0;
import androidx.compose.foundation.lazy.grid.t;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final u a = new u(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final y0 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new y0(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((d) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static g b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceM;
        u uVar = a;
        com.google.android.gms.dynamite.g.g("getFontSync");
        try {
            Typeface typeface = (Typeface) uVar.h(str);
            if (typeface != null) {
                g gVar = new g(typeface);
                Trace.endSection();
                return gVar;
            }
            try {
                t tVarA = c.a(context, list);
                List list2 = tVarA.b;
                int i3 = tVarA.a;
                if (i3 == 0) {
                    i[] iVarArr = (i[]) list2.get(0);
                    if (iVarArr == null || iVarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = iVarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = iVarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    g gVar2 = new g(i2);
                    Trace.endSection();
                    return gVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    i[] iVarArr2 = (i[]) list2.get(0);
                    _COROUTINE.a aVar = androidx.core.graphics.f.a;
                    com.google.android.gms.dynamite.g.g("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceM = androidx.core.graphics.f.a.m(context, iVarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    _COROUTINE.a aVar2 = androidx.core.graphics.f.a;
                    com.google.android.gms.dynamite.g.g("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceM = androidx.core.graphics.f.a.n(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceM == null) {
                    g gVar3 = new g(-3);
                    Trace.endSection();
                    return gVar3;
                }
                uVar.l(str, typefaceM);
                g gVar4 = new g(typefaceM);
                Trace.endSection();
                return gVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                g gVar5 = new g(-1);
                Trace.endSection();
                return gVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
