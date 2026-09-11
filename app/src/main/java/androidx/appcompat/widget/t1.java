package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.app.mlounge.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    public static t1 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public com.caverock.androidsvg.y1 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final s1 h = new s1(6);

    public static synchronized t1 b() {
        try {
            if (g == null) {
                g = new t1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        s1 s1Var = h;
        s1Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) s1Var.h(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    public final Drawable a(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableM;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            androidx.collection.s sVar = (androidx.collection.s) this.b.get(context);
            obj = null;
            if (sVar != null && (weakReference = (WeakReference) sVar.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    sVar.f(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e == null) {
            layerDrawableM = null;
        } else if (i == R.drawable.abc_cab_background_top_material) {
            layerDrawableM = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        } else if (i == R.drawable.abc_ratingbar_material) {
            layerDrawableM = com.caverock.androidsvg.y1.M(this, context, R.dimen.abc_star_big);
        } else if (i == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableM = com.caverock.androidsvg.y1.M(this, context, R.dimen.abc_star_medium);
        } else if (i == R.drawable.abc_ratingbar_small_material) {
            layerDrawableM = com.caverock.androidsvg.y1.M(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableM = null;
        }
        if (layerDrawableM == null) {
            return layerDrawableM;
        }
        layerDrawableM.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableM;
                }
                androidx.collection.s sVar2 = (androidx.collection.s) this.b.get(context);
                if (sVar2 == null) {
                    sVar2 = new androidx.collection.s(obj);
                    this.b.put(context, sVar2);
                }
                sVar2.e(j, new WeakReference(constantState2));
                return layerDrawableM;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i);
    }

    public final synchronized Drawable d(Context context, int i) {
        Drawable drawableA;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = context.getDrawable(i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, drawableA);
            }
            if (drawableA != null) {
                t0.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        androidx.collection.z0 z0Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListN = null;
        colorStateList = (weakHashMap == null || (z0Var = (androidx.collection.z0) weakHashMap.get(context)) == null) ? null : (ColorStateList) z0Var.c(i);
        if (colorStateList == null) {
            com.caverock.androidsvg.y1 y1Var = this.e;
            if (y1Var != null) {
                colorStateListN = y1Var.N(context, i);
            }
            if (colorStateListN != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                androidx.collection.z0 z0Var2 = (androidx.collection.z0) this.a.get(context);
                if (z0Var2 == null) {
                    z0Var2 = new androidx.collection.z0(0);
                    this.a.put(context, z0Var2);
                }
                z0Var2.a(i, colorStateListN);
            }
            colorStateList = colorStateListN;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    public final Drawable g(Context context, int i, Drawable drawable) {
        int i2;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListF = f(context, i);
        if (colorStateListF != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            PorterDuff.Mode mode = null;
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = y1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = s.b;
                com.caverock.androidsvg.y1.l0(drawableFindDrawableByLayerId, iC, mode2);
                com.caverock.androidsvg.y1.l0(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), y1.c(context, R.attr.colorControlNormal), mode2);
                com.caverock.androidsvg.y1.l0(layerDrawable.findDrawableByLayerId(android.R.id.progress), y1.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = y1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = s.b;
                com.caverock.androidsvg.y1.l0(drawableFindDrawableByLayerId2, iB, mode3);
                com.caverock.androidsvg.y1.l0(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), y1.c(context, R.attr.colorControlActivated), mode3);
                com.caverock.androidsvg.y1.l0(layerDrawable2.findDrawableByLayerId(android.R.id.progress), y1.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        com.caverock.androidsvg.y1 y1Var = this.e;
        if (y1Var != null) {
            PorterDuff.Mode mode4 = s.b;
            boolean z = true;
            if (com.caverock.androidsvg.y1.k(i, (int[]) y1Var.a)) {
                i2 = R.attr.colorControlNormal;
            } else if (com.caverock.androidsvg.y1.k(i, (int[]) y1Var.c)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (com.caverock.androidsvg.y1.k(i, (int[]) y1Var.d)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z = false;
                        i2 = 0;
                    }
                    if (z) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(s.b(y1.c(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                    }
                }
                i2 = 16842801;
            }
            iRound = -1;
            if (z) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(s.b(y1.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
            }
        }
        return drawable;
    }
}
