package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.u;
import androidx.collection.y0;
import androidx.compose.foundation.text.input.internal.o;
import androidx.core.provider.m;
import com.google.common.util.concurrent.l0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final _COROUTINE.a a;
    public static final u b;
    public static Paint c;

    static {
        com.google.android.gms.dynamite.g.g("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new l();
        } else if (i >= 29) {
            a = new k();
        } else if (i >= 28) {
            a = new j();
        } else if (i >= 26) {
            a = new i();
        } else {
            Method method = h.n;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new h();
            } else {
                a = new g();
            }
        }
        b = new u(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, androidx.core.content.res.d dVar, Resources resources, int i, String str, int i2, int i3, androidx.core.content.res.b bVar, boolean z) {
        Typeface typefaceL;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 2;
        int i5 = -3;
        if (dVar instanceof androidx.core.content.res.g) {
            androidx.core.content.res.g gVar = (androidx.core.content.res.g) dVar;
            String str2 = gVar.d;
            typefaceL = null;
            int i6 = 1;
            int i7 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = gVar.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i9 = 0;
                                while (true) {
                                    if (i9 < arrayList.size()) {
                                        androidx.core.provider.d dVar2 = (androidx.core.provider.d) arrayList.get(i9);
                                        if (i9 == arrayList.size() - 1 && TextUtils.isEmpty(dVar2.f)) {
                                            customFallbackBuilder.setSystemFallback(dVar2.e);
                                        } else {
                                            String str3 = dVar2.e;
                                            String str4 = dVar2.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + dVar2.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(e.a(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((androidx.core.provider.d) arrayList.get(i8)).e) != null) {
                                i8++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((androidx.core.provider.d) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.c(i4, bVar, typefaceBuild));
                }
                b.l(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z2 = !z ? bVar != null : gVar.c != 0;
            int i10 = z ? gVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            com.google.firebase.platforminfo.c cVar = new com.google.firebase.platforminfo.c();
            cVar.e = bVar;
            ArrayList arrayList2 = gVar.a;
            androidx.core.provider.l lVar = new androidx.core.provider.l(handler, 0);
            o oVar = new o(24, cVar, lVar);
            if (!z2) {
                String strA = androidx.core.provider.h.a(i3, arrayList2);
                Typeface typeface = (Typeface) androidx.core.provider.h.a.h(strA);
                if (typeface != null) {
                    lVar.execute(new l0(i4, cVar, typeface));
                    typefaceL = typeface;
                } else {
                    androidx.core.provider.f fVar = new androidx.core.provider.f(oVar, i7);
                    synchronized (androidx.core.provider.h.c) {
                        try {
                            y0 y0Var = androidx.core.provider.h.d;
                            ArrayList arrayList3 = (ArrayList) y0Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(fVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fVar);
                                y0Var.put(strA, arrayList4);
                                androidx.core.provider.e eVar = new androidx.core.provider.e(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = androidx.core.provider.h.b;
                                androidx.core.provider.f fVar2 = new androidx.core.provider.f(strA, i6);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                m mVar = new m();
                                mVar.y = eVar;
                                mVar.z = fVar2;
                                mVar.A = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    net.luminis.tls.engine.impl.c.o("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                androidx.core.provider.d dVar3 = (androidx.core.provider.d) arrayList2.get(0);
                u uVar = androidx.core.provider.h.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = androidx.core.provider.h.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) androidx.core.provider.h.a.h(strA2);
                if (typeface2 != null) {
                    lVar.execute(new l0(i4, cVar, typeface2));
                    typefaceL = typeface2;
                } else if (i10 == -1) {
                    Object[] objArr = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    androidx.core.provider.g gVarB = androidx.core.provider.h.b(strA2, context, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.p(obj2, arrayList6, obj2, arrayList6), i3);
                    oVar.p(gVarB);
                    typefaceL = gVarB.a;
                } else {
                    try {
                        try {
                            try {
                                androidx.core.provider.g gVar2 = (androidx.core.provider.g) androidx.core.provider.h.b.submit(new androidx.core.provider.e(strA2, context, dVar3, i3, 0)).get(i10, TimeUnit.MILLISECONDS);
                                oVar.p(gVar2);
                                typefaceL = gVar2.a;
                            } catch (ExecutionException e) {
                                throw new RuntimeException(e);
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused3) {
                        ((androidx.core.provider.l) oVar.z).execute(new androidx.core.provider.a((com.google.firebase.platforminfo.c) oVar.y, i5, i7));
                    }
                }
            }
        } else {
            typefaceL = a.l(context, (androidx.core.content.res.e) dVar, resources, i3);
            if (bVar != null) {
                if (typefaceL != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.c(i4, bVar, typefaceL));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (typefaceL != null) {
            b.l(b(resources, i, str, i2, i3), typefaceL);
        }
        return typefaceL;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
