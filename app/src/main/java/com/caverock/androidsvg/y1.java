package com.caverock.androidsvg;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.compose.animation.core.u2;
import com.app.mlounge.R;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.fe;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.ka;
import com.google.android.gms.internal.measurement.rc;
import com.google.android.gms.internal.measurement.rf;
import com.google.android.gms.internal.measurement.ud;
import com.google.android.gms.internal.measurement.ue;
import com.google.android.gms.internal.measurement.ve;
import com.google.android.gms.internal.measurement.xc;
import com.google.android.gms.internal.measurement.xd;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements com.google.firebase.components.c {
    public static HashSet g;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public y1(int i) {
        switch (i) {
            case 11:
                this.a = new AtomicBoolean(false);
                this.b = new CountDownLatch(1);
                this.f = "PublicSuffixDatabase.list";
                break;
            default:
                this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public static void C(y yVar, String str) {
        x0 x0VarW = yVar.a.W(str);
        if (x0VarW == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(x0VarW instanceof y)) {
            z("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (x0VarW == yVar) {
            z("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        y yVar2 = (y) x0VarW;
        if (yVar.i == null) {
            yVar.i = yVar2.i;
        }
        if (yVar.j == null) {
            yVar.j = yVar2.j;
        }
        if (yVar.k == 0) {
            yVar.k = yVar2.k;
        }
        if (yVar.h.isEmpty()) {
            yVar.h = yVar2.h;
        }
        try {
            if (yVar instanceof y0) {
                y0 y0Var = (y0) yVar;
                y0 y0Var2 = (y0) x0VarW;
                if (y0Var.m == null) {
                    y0Var.m = y0Var2.m;
                }
                if (y0Var.n == null) {
                    y0Var.n = y0Var2.n;
                }
                if (y0Var.o == null) {
                    y0Var.o = y0Var2.o;
                }
                if (y0Var.p == null) {
                    y0Var.p = y0Var2.p;
                }
            } else {
                D((c1) yVar, (c1) x0VarW);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = yVar2.l;
        if (str2 != null) {
            C(yVar, str2);
        }
    }

    public static void D(c1 c1Var, c1 c1Var2) {
        if (c1Var.m == null) {
            c1Var.m = c1Var2.m;
        }
        if (c1Var.n == null) {
            c1Var.n = c1Var2.n;
        }
        if (c1Var.o == null) {
            c1Var.o = c1Var2.o;
        }
        if (c1Var.p == null) {
            c1Var.p = c1Var2.p;
        }
        if (c1Var.q == null) {
            c1Var.q = c1Var2.q;
        }
    }

    public static void E(l0 l0Var, String str) {
        x0 x0VarW = l0Var.a.W(str);
        if (x0VarW == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(x0VarW instanceof l0)) {
            z("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (x0VarW == l0Var) {
            z("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        l0 l0Var2 = (l0) x0VarW;
        if (l0Var.p == null) {
            l0Var.p = l0Var2.p;
        }
        if (l0Var.q == null) {
            l0Var.q = l0Var2.q;
        }
        if (l0Var.r == null) {
            l0Var.r = l0Var2.r;
        }
        if (l0Var.s == null) {
            l0Var.s = l0Var2.s;
        }
        if (l0Var.t == null) {
            l0Var.t = l0Var2.t;
        }
        if (l0Var.u == null) {
            l0Var.u = l0Var2.u;
        }
        if (l0Var.v == null) {
            l0Var.v = l0Var2.v;
        }
        if (l0Var.i.isEmpty()) {
            l0Var.i = l0Var2.i;
        }
        if (l0Var.o == null) {
            l0Var.o = l0Var2.o;
        }
        if (l0Var.n == null) {
            l0Var.n = l0Var2.n;
        }
        String str2 = l0Var2.w;
        if (str2 != null) {
            E(l0Var, str2);
        }
    }

    public static androidx.media3.exoplayer.source.v F(androidx.media3.common.q0 q0Var, com.google.common.collect.h0 h0Var, androidx.media3.exoplayer.source.v vVar, androidx.media3.common.t0 t0Var) {
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
        androidx.media3.common.v0 v0VarL = c0Var.l();
        int i = c0Var.i();
        Object objL = v0VarL.p() ? null : v0VarL.l(i);
        int iB = (c0Var.x() || v0VarL.p()) ? -1 : v0VarL.f(i, t0Var, false).b(androidx.media3.common.util.j0.Q(c0Var.j()) - t0Var.e);
        for (int i2 = 0; i2 < h0Var.size(); i2++) {
            androidx.media3.exoplayer.source.v vVar2 = (androidx.media3.exoplayer.source.v) h0Var.get(i2);
            if (P(vVar2, objL, c0Var.x(), c0Var.f(), c0Var.g(), iB)) {
                return vVar2;
            }
        }
        if (h0Var.isEmpty() && vVar != null && P(vVar, objL, c0Var.x(), c0Var.f(), c0Var.g(), iB)) {
            return vVar;
        }
        return null;
    }

    public static LayerDrawable M(androidx.appcompat.widget.t1 t1Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = t1Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = t1Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean P(androidx.media3.exoplayer.source.v vVar, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = vVar.a;
        int i4 = vVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && vVar.c == i2) {
            return true;
        }
        return !z && i4 == -1 && vVar.e == i3;
    }

    public static boolean Q(r0 r0Var, long j) {
        return (r0Var.e & j) != 0;
    }

    public static Path U(m0 m0Var) {
        Path path = new Path();
        float[] fArr = m0Var.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = m0Var.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (m0Var instanceof n0) {
            path.close();
        }
        if (m0Var.h == null) {
            m0Var.h = m(path);
        }
        return path;
    }

    public static void h(androidx.media3.datasource.cache.i iVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = iVar.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static void i(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, k0 k0Var) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            k0Var.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = d26 / dSqrt3;
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (d27 < -1.0d ? 3.141592653589793d : d27 > 1.0d ? 0.0d : Math.acos(d27));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d28 = dAcos2 % 6.283185307179586d;
        double d29 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d28) * 2.0d) / 3.141592653589793d);
        double d30 = d28 / ((double) iCeil);
        double d31 = d30 / 2.0d;
        double dSin2 = (Math.sin(d31) * 1.3333333333333333d) / (Math.cos(d31) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d32 = d29;
            double d33 = (((double) i2) * d30) + d32;
            double dCos2 = Math.cos(d33);
            double dSin3 = Math.sin(d33);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d34 = d33 + d30;
            double dCos3 = Math.cos(d34);
            double dSin4 = Math.sin(d34);
            fArr[i5 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i5 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i5 + 4] = (float) dCos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) dSin4;
            i2 = i4 + 1;
            d29 = d32;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            k0Var.c(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static boolean k(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void k0(w1 w1Var, boolean z, a1 a1Var) {
        int i;
        r0 r0Var = w1Var.a;
        float fFloatValue = (z ? r0Var.z : r0Var.B).floatValue();
        if (a1Var instanceof u) {
            i = ((u) a1Var).e;
        } else if (!(a1Var instanceof v)) {
            return;
        } else {
            i = w1Var.a.H.e;
        }
        int iS = s(i, fFloatValue);
        if (z) {
            w1Var.d.setColor(iS);
        } else {
            w1Var.e.setColor(iS);
        }
    }

    public static void l0(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = androidx.appcompat.widget.s.b;
        }
        drawableMutate.setColorFilter(androidx.appcompat.widget.s.b(i, mode));
    }

    public static androidx.compose.ui.geometry.a m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new androidx.compose.ui.geometry.a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix o(androidx.compose.ui.geometry.a r9, androidx.compose.ui.geometry.a r10, com.caverock.androidsvg.r r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            com.caverock.androidsvg.q r1 = r11.a
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r9.e
            float r4 = r10.e
            float r3 = r3 / r4
            float r4 = r10.b
            float r4 = -r4
            float r5 = r10.c
            float r5 = -r5
            com.caverock.androidsvg.r r6 = com.caverock.androidsvg.r.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.b
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.d
            float r2 = r2 / r11
            float r3 = r9.e
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.d
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.d
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.e
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.y1.o(androidx.compose.ui.geometry.a, androidx.compose.ui.geometry.a, com.caverock.androidsvg.r):android.graphics.Matrix");
    }

    public static Typeface r(String str, Integer num, int i) {
        int i2;
        boolean z = i == 2;
        if (num.intValue() > 500) {
            i2 = z ? 3 : 1;
        } else {
            i2 = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int s(int i, float f) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static ColorStateList t(Context context, int i) {
        int iC = androidx.appcompat.widget.y1.c(context, R.attr.colorControlHighlight);
        int iB = androidx.appcompat.widget.y1.b(context, R.attr.colorButtonNormal);
        int[] iArr = androidx.appcompat.widget.y1.b;
        int[] iArr2 = androidx.appcompat.widget.y1.d;
        int iB2 = androidx.core.graphics.a.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, androidx.appcompat.widget.y1.c, androidx.appcompat.widget.y1.f}, new int[]{iB, iB2, androidx.core.graphics.a.b(iC, i), i});
    }

    public static void z(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public void A(k1 k1Var, StringBuilder sb) {
        Iterator it = k1Var.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            if (z0Var instanceof k1) {
                A((k1) z0Var, sb);
            } else if (z0Var instanceof n1) {
                sb.append(q0(((n1) z0Var).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public Uri A0() {
        String strK;
        String str = (String) this.b;
        String str2 = (String) this.c;
        Account account = ud.a;
        Account account2 = (Account) this.d;
        ka.e(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        ka.e(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        ka.e(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (ud.a.equals(account2)) {
            strK = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strK = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.e;
        StringBuilder sb = new StringBuilder(strK.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "/", str, "/", str2);
        String strL = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(sb, "/", strK, "/", str5);
        com.google.common.collect.a1 a1VarG = ((com.google.common.collect.d0) this.f).g();
        Pattern pattern = fe.a;
        return new Uri.Builder().scheme("android").authority((String) this.a).path(strL).encodedFragment(a1VarG.isEmpty() ? null : "transform=".concat(new androidx.media3.container.a("+").d(a1VarG))).build();
    }

    public com.google.android.gms.tasks.q B(com.google.android.gms.tasks.q qVar) {
        return qVar.j(new androidx.arch.core.executor.a(2), new com.google.firebase.components.s(this, 23));
    }

    public com.google.common.util.concurrent.r B0(int i) {
        com.google.common.util.concurrent.d0 d0Var;
        AtomicLong atomicLong = (AtomicLong) this.b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            com.google.common.util.concurrent.o0 o0Var = com.google.common.util.concurrent.o0.E;
            return o0Var != null ? o0Var : new com.google.common.util.concurrent.o0();
        }
        ve veVar = new ve(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.c;
            ve veVar2 = (ve) atomicReference.get();
            if (veVar2 != null && veVar2.E > i) {
                com.google.common.util.concurrent.o0 o0Var2 = com.google.common.util.concurrent.o0.E;
                return o0Var2 != null ? o0Var2 : new com.google.common.util.concurrent.o0();
            }
            do {
                if (atomicReference.compareAndSet(veVar2, veVar)) {
                    if (((int) (atomicLong.get() >>> 32)) > i) {
                        veVar.cancel(true);
                        while (!atomicReference.compareAndSet(veVar, null) && atomicReference.get() == veVar) {
                        }
                        return veVar;
                    }
                    rc rcVar = (rc) this.a;
                    com.google.common.util.concurrent.y yVar = (com.google.common.util.concurrent.y) rcVar.y;
                    if (yVar == null || (d0Var = (com.google.common.util.concurrent.d0) rcVar.z) == null) {
                        veVar.n((com.google.common.util.concurrent.y0) this.f);
                        return veVar;
                    }
                    j5 j5VarA = rf.a(yVar);
                    com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1();
                    a1Var.F = new com.google.common.util.concurrent.z0(a1Var, j5VarA);
                    d0Var.execute(a1Var);
                    veVar.n(a1Var);
                    return veVar;
                }
            } while (atomicReference.get() == veVar2);
        }
    }

    public w1 G(x0 x0Var) {
        w1 w1Var = new w1();
        t0(w1Var, r0.a());
        H(x0Var, w1Var);
        return w1Var;
    }

    public void H(z0 z0Var, w1 w1Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (z0Var instanceof x0) {
                arrayList.add(0, (x0) z0Var);
            }
            Object obj = z0Var.b;
            if (obj == null) {
                break;
            } else {
                z0Var = (z0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u0(w1Var, (x0) it.next());
        }
        w1 w1Var2 = (w1) this.c;
        w1Var.g = w1Var2.g;
        w1Var.f = w1Var2.f;
    }

    public androidx.media3.datasource.cache.g I(String str) {
        return (androidx.media3.datasource.cache.g) ((HashMap) this.a).get(str);
    }

    public int J() {
        int i;
        r0 r0Var = ((w1) this.c).a;
        if (r0Var.f0 == 1 || (i = r0Var.g0) == 2) {
            return r0Var.g0;
        }
        return i == 1 ? 3 : 1;
    }

    public com.google.firebase.components.p K(Class cls) {
        return g(com.google.firebase.components.r.a(cls));
    }

    public androidx.media3.datasource.cache.g L(String str) {
        HashMap map = (HashMap) this.a;
        androidx.media3.datasource.cache.g gVar = (androidx.media3.datasource.cache.g) map.get(str);
        if (gVar != null) {
            return gVar;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        androidx.media3.datasource.cache.g gVar2 = new androidx.media3.datasource.cache.g(iKeyAt, str, androidx.media3.datasource.cache.i.c);
        map.put(str, gVar2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((androidx.compose.material.ripple.g) this.e).f(gVar2);
        return gVar2;
    }

    public ColorStateList N(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return org.jsoup.helper.n.t(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return org.jsoup.helper.n.t(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return t(context, androidx.appcompat.widget.y1.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return t(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return t(context, androidx.appcompat.widget.y1.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return org.jsoup.helper.n.t(context, R.color.abc_tint_spinner);
            }
            if (k(i, (int[]) this.b)) {
                return androidx.appcompat.widget.y1.d(context, R.attr.colorControlNormal);
            }
            if (k(i, (int[]) this.e)) {
                return org.jsoup.helper.n.t(context, R.color.abc_tint_default);
            }
            if (k(i, (int[]) this.f)) {
                return org.jsoup.helper.n.t(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return org.jsoup.helper.n.t(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = androidx.appcompat.widget.y1.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = androidx.appcompat.widget.y1.b;
            iArr2[0] = androidx.appcompat.widget.y1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = androidx.appcompat.widget.y1.e;
            iArr2[1] = androidx.appcompat.widget.y1.c(context, R.attr.colorControlActivated);
            iArr[2] = androidx.appcompat.widget.y1.f;
            iArr2[2] = androidx.appcompat.widget.y1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = androidx.appcompat.widget.y1.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = androidx.appcompat.widget.y1.e;
            iArr2[1] = androidx.appcompat.widget.y1.c(context, R.attr.colorControlActivated);
            iArr[2] = androidx.appcompat.widget.y1.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void O(long j) {
        androidx.compose.material.ripple.g gVar;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        androidx.compose.material.ripple.g gVar2 = (androidx.compose.material.ripple.g) this.e;
        gVar2.getClass();
        androidx.compose.material.ripple.g gVar3 = (androidx.compose.material.ripple.g) this.f;
        if (gVar3 != null) {
            gVar3.getClass();
        }
        if (gVar2.b() || (gVar = (androidx.compose.material.ripple.g) this.f) == null || !gVar.b()) {
            gVar2.e(map, sparseArray);
        } else {
            ((androidx.compose.material.ripple.g) this.f).e(map, sparseArray);
            gVar2.j(map);
        }
        androidx.compose.material.ripple.g gVar4 = (androidx.compose.material.ripple.g) this.f;
        if (gVar4 != null) {
            androidx.media3.common.util.b bVar = (androidx.media3.common.util.b) gVar4.d;
            ((File) bVar.y).delete();
            ((File) bVar.z).delete();
            this.f = null;
        }
    }

    public okio.r R() throws IOException {
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        Object obj = okhttp3.internal.platform.e.a;
        okhttp3.internal.platform.d dVar = obj != null ? (okhttp3.internal.platform.d) obj : null;
        Context contextB = dVar != null ? dVar.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.f);
            inputStreamOpen.getClass();
            return okio.b.e(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            net.luminis.tls.engine.impl.c.t("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        net.luminis.tls.engine.impl.c.t("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public Path S(s sVar) {
        d0 d0Var = sVar.o;
        float fD = d0Var != null ? d0Var.d(this) : 0.0f;
        d0 d0Var2 = sVar.p;
        float fE = d0Var2 != null ? d0Var2.e(this) : 0.0f;
        float fA = sVar.q.a(this);
        float f = fD - fA;
        float f2 = fE - fA;
        float f3 = fD + fA;
        float f4 = fE + fA;
        if (sVar.h == null) {
            float f5 = 2.0f * fA;
            sVar.h = new androidx.compose.ui.geometry.a(f, f2, f5, f5);
        }
        float f6 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f6;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f6;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    public Path T(x xVar) {
        d0 d0Var = xVar.o;
        float fD = d0Var != null ? d0Var.d(this) : 0.0f;
        d0 d0Var2 = xVar.p;
        float fE = d0Var2 != null ? d0Var2.e(this) : 0.0f;
        float fD2 = xVar.q.d(this);
        float fE2 = xVar.r.e(this);
        float f = fD - fD2;
        float f2 = fE - fE2;
        float f3 = fD + fD2;
        float f4 = fE + fE2;
        if (xVar.h == null) {
            xVar.h = new androidx.compose.ui.geometry.a(f, f2, fD2 * 2.0f, 2.0f * fE2);
        }
        float f5 = fD2 * 0.5522848f;
        float f6 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f5;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f5;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public Path V(o0 o0Var) {
        float fD;
        float fE;
        float fMin;
        d0 d0Var;
        float fD2;
        d0 d0Var2;
        float fE2;
        float fD3;
        float fE3;
        float f;
        float f2;
        Path path;
        d0 d0Var3 = o0Var.s;
        if (d0Var3 == null && o0Var.t == null) {
            fD = 0.0f;
        } else {
            d0 d0Var4 = o0Var.t;
            if (d0Var3 != null) {
                if (d0Var4 == null) {
                    fD = d0Var3.d(this);
                } else {
                    fD = d0Var3.d(this);
                    fE = o0Var.t.e(this);
                }
                fMin = Math.min(fD, o0Var.q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, o0Var.r.e(this) / 2.0f);
                d0Var = o0Var.o;
                if (d0Var != null) {
                    fD2 = d0Var.d(this);
                } else {
                    fD2 = 0.0f;
                }
                d0Var2 = o0Var.p;
                if (d0Var2 != null) {
                    fE2 = d0Var2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = o0Var.q.d(this);
                fE3 = o0Var.r.e(this);
                if (o0Var.h == null) {
                    o0Var.h = new androidx.compose.ui.geometry.a(fD2, fE2, fD3, fE3);
                }
                f = fD3 + fD2;
                f2 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f, fE2);
                    path.lineTo(f, f2);
                    path.lineTo(fD2, f2);
                    path.lineTo(fD2, fE2);
                } else {
                    float f3 = fMin * 0.5522848f;
                    float f4 = 0.5522848f * fMin2;
                    float f5 = fE2 + fMin2;
                    path.moveTo(fD2, f5);
                    float f6 = f5 - f4;
                    float f7 = fD2 + fMin;
                    float f8 = f7 - f3;
                    path.cubicTo(fD2, f6, f8, fE2, f7, fE2);
                    float f9 = f - fMin;
                    path.lineTo(f9, fE2);
                    float f10 = f9 + f3;
                    path.cubicTo(f10, fE2, f, f6, f, f5);
                    float f11 = f2 - fMin2;
                    path.lineTo(f, f11);
                    float f12 = f11 + f4;
                    path.cubicTo(f, f12, f10, f2, f9, f2);
                    path.lineTo(f7, f2);
                    float f13 = fD2;
                    path.cubicTo(f8, f2, f13, f12, fD2, f11);
                    path.lineTo(f13, f5);
                }
                path.close();
                return path;
            }
            fD = d0Var4.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, o0Var.q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, o0Var.r.e(this) / 2.0f);
        d0Var = o0Var.o;
        if (d0Var != null) {
            fD2 = d0Var.d(this);
        } else {
            fD2 = 0.0f;
        }
        d0Var2 = o0Var.p;
        if (d0Var2 != null) {
            fE2 = d0Var2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = o0Var.q.d(this);
        fE3 = o0Var.r.e(this);
        if (o0Var.h == null) {
            o0Var.h = new androidx.compose.ui.geometry.a(fD2, fE2, fD3, fE3);
        }
        f = fD3 + fD2;
        f2 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    public androidx.compose.ui.geometry.a W(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        float fD = d0Var != null ? d0Var.d(this) : 0.0f;
        float fE = d0Var2 != null ? d0Var2.e(this) : 0.0f;
        w1 w1Var = (w1) this.c;
        androidx.compose.ui.geometry.a aVar = w1Var.g;
        if (aVar == null) {
            aVar = w1Var.f;
        }
        return new androidx.compose.ui.geometry.a(fD, fE, d0Var3 != null ? d0Var3.d(this) : aVar.d, d0Var4 != null ? d0Var4.e(this) : aVar.e);
    }

    public void X(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap map = (HashMap) this.a;
        androidx.media3.datasource.cache.g gVar = (androidx.media3.datasource.cache.g) map.get(str);
        if (gVar != null && gVar.c.isEmpty() && gVar.d.isEmpty()) {
            map.remove(str);
            int i = gVar.a;
            boolean z = sparseBooleanArray.get(i);
            ((androidx.compose.material.ripple.g) this.e).a = true;
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public Path Y(w0 w0Var, boolean z) {
        Path path;
        Path pathY;
        Path pathL;
        ((Stack) this.d).push((w1) this.c);
        w1 w1Var = new w1((w1) this.c);
        this.c = w1Var;
        u0(w1Var, w0Var);
        if (!v() || !w0()) {
            this.c = (w1) ((Stack) this.d).pop();
            return null;
        }
        if (w0Var instanceof o1) {
            if (!z) {
                z("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            o1 o1Var = (o1) w0Var;
            x0 x0VarW = w0Var.a.W(o1Var.o);
            if (x0VarW == null) {
                z("Use reference '%s' not found", o1Var.o);
                this.c = (w1) ((Stack) this.d).pop();
                return null;
            }
            if (!(x0VarW instanceof w0)) {
                this.c = (w1) ((Stack) this.d).pop();
                return null;
            }
            pathY = Y((w0) x0VarW, false);
            if (pathY != null) {
                if (o1Var.h == null) {
                    o1Var.h = m(pathY);
                }
                Matrix matrix = o1Var.n;
                if (matrix != null) {
                    pathY.transform(matrix);
                }
                if (((w1) this.c).a.U != null && (pathL = l(w0Var, w0Var.h)) != null) {
                    pathY.op(pathL, Path.Op.INTERSECT);
                }
                this.c = (w1) ((Stack) this.d).pop();
                return pathY;
            }
            return null;
        }
        if (w0Var instanceof z) {
            z zVar = (z) w0Var;
            if (w0Var instanceof j0) {
                s1 s1Var = new s1(((j0) w0Var).o);
                androidx.compose.ui.geometry.a aVar = w0Var.h;
                Path path2 = s1Var.a;
                if (aVar == null) {
                    w0Var.h = m(path2);
                }
                path = path2;
            } else if (w0Var instanceof o0) {
                path = V((o0) w0Var);
            } else if (w0Var instanceof s) {
                path = S((s) w0Var);
            } else if (w0Var instanceof x) {
                path = T((x) w0Var);
            } else {
                path = w0Var instanceof m0 ? U((m0) w0Var) : null;
            }
            if (path != null) {
                if (zVar.h == null) {
                    zVar.h = m(path);
                }
                Matrix matrix2 = zVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((w1) this.c).a.h0;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(w0Var instanceof i1)) {
            z("Invalid %s element found in clipPath definition", w0Var.n());
            return null;
        }
        i1 i1Var = (i1) w0Var;
        ArrayList arrayList = i1Var.n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((d0) i1Var.n.get(0)).d(this);
        ArrayList arrayList2 = i1Var.o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((d0) i1Var.o.get(0)).e(this);
        ArrayList arrayList3 = i1Var.p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((d0) i1Var.p.get(0)).d(this);
        ArrayList arrayList4 = i1Var.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((d0) i1Var.q.get(0)).e(this);
        }
        if (((w1) this.c).a.g0 != 1) {
            float fN = n(i1Var);
            if (((w1) this.c).a.g0 == 2) {
                fN /= 2.0f;
            }
            fD -= fN;
        }
        if (i1Var.h == null) {
            v1 v1Var = new v1(this, fD, fE2);
            y(i1Var, v1Var);
            RectF rectF = (RectF) v1Var.r;
            i1Var.h = new androidx.compose.ui.geometry.a(rectF.left, rectF.top, rectF.width(), ((RectF) v1Var.r).height());
        }
        path = new Path();
        y(i1Var, new v1(this, fD + fD2, fE2 + fE, path));
        Matrix matrix3 = i1Var.r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        int i2 = ((w1) this.c).a.h0;
        path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        pathY = path;
        if (((w1) this.c).a.U != null) {
            pathY.op(pathL, Path.Op.INTERSECT);
        }
        this.c = (w1) ((Stack) this.d).pop();
        return pathY;
    }

    public void Z(androidx.compose.ui.geometry.a aVar) {
        Canvas canvas = (Canvas) this.a;
        if (((w1) this.c).a.V != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            g0 g0Var = (g0) ((androidx.appcompat.widget.c2) this.b).W(((w1) this.c).a.V);
            h0(g0Var, aVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            h0(g0Var, aVar);
            canvas.restore();
            canvas.restore();
        }
        n0();
    }

    @Override // com.google.firebase.components.c
    public Object a(Class cls) {
        if (!((Set) this.a).contains(com.google.firebase.components.r.a(cls))) {
            com.google.firebase.components.s.a(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objA = ((com.google.firebase.components.c) this.f).a(cls);
        if (!cls.equals(com.google.firebase.events.b.class)) {
            return objA;
        }
        return new com.google.firebase.components.t();
    }

    public boolean a0() {
        x0 x0VarW;
        int i = 0;
        if (((w1) this.c).a.G.floatValue() >= 1.0f && ((w1) this.c).a.V == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.a;
        int iFloatValue = (int) (((w1) this.c).a.G.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.d).push((w1) this.c);
        w1 w1Var = new w1((w1) this.c);
        this.c = w1Var;
        String str = w1Var.a.V;
        if (str != null && ((x0VarW = ((androidx.appcompat.widget.c2) this.b).W(str)) == null || !(x0VarW instanceof g0))) {
            z("Mask reference '%s' not found", ((w1) this.c).a.V);
            ((w1) this.c).a.V = null;
        }
        return true;
    }

    @Override // com.google.firebase.components.c
    public com.google.firebase.inject.b b(com.google.firebase.components.r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).b(rVar);
        }
        com.google.firebase.components.s.a(rVar, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    public void b0() {
        try {
            okio.b0 b0Var = new okio.b0(R());
            try {
                okio.i iVarK = b0Var.k(b0Var.readInt());
                okio.i iVarK2 = b0Var.k(b0Var.readInt());
                b0Var.close();
                synchronized (this) {
                    iVarK.getClass();
                    this.c = iVarK;
                    iVarK2.getClass();
                    this.d = iVarK2;
                }
                ((CountDownLatch) this.b).countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.b.d(b0Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ((CountDownLatch) this.b).countDown();
            throw th3;
        }
    }

    @Override // com.google.firebase.components.c
    public com.google.firebase.inject.b c(Class cls) {
        return b(com.google.firebase.components.r.a(cls));
    }

    public void c0(s0 s0Var, androidx.compose.ui.geometry.a aVar, androidx.compose.ui.geometry.a aVar2, r rVar) {
        if (aVar.d == 0.0f || aVar.e == 0.0f) {
            return;
        }
        if (rVar == null && (rVar = s0Var.n) == null) {
            rVar = r.d;
        }
        u0((w1) this.c, s0Var);
        if (v()) {
            w1 w1Var = (w1) this.c;
            w1Var.f = aVar;
            if (!w1Var.a.L.booleanValue()) {
                androidx.compose.ui.geometry.a aVar3 = ((w1) this.c).f;
                i0(aVar3.b, aVar3.c, aVar3.d, aVar3.e);
            }
            p(s0Var, ((w1) this.c).f);
            Canvas canvas = (Canvas) this.a;
            w1 w1Var2 = (w1) this.c;
            if (aVar2 != null) {
                canvas.concat(o(w1Var2.f, aVar2, rVar));
                ((w1) this.c).g = s0Var.o;
            } else {
                androidx.compose.ui.geometry.a aVar4 = w1Var2.f;
                canvas.translate(aVar4.b, aVar4.c);
            }
            boolean zA0 = a0();
            v0();
            e0(s0Var, true);
            if (zA0) {
                Z(s0Var.h);
            }
            s0(s0Var);
        }
    }

    @Override // com.google.firebase.components.c
    public Set d(com.google.firebase.components.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).d(rVar);
        }
        com.google.firebase.components.s.a(rVar, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d0(z0 z0Var) {
        d0 d0Var;
        String str;
        int iIndexOf;
        Set setA;
        d0 d0Var2;
        Boolean bool;
        if (z0Var instanceof h0) {
            return;
        }
        o0();
        if ((z0Var instanceof x0) && (bool = ((x0) z0Var).d) != null) {
            ((w1) this.c).h = bool.booleanValue();
        }
        if (z0Var instanceof s0) {
            s0 s0Var = (s0) z0Var;
            c0(s0Var, W(s0Var.p, s0Var.q, s0Var.r, s0Var.s), s0Var.o, s0Var.n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (z0Var instanceof o1) {
                o1 o1Var = (o1) z0Var;
                Canvas canvas = (Canvas) this.a;
                d0 d0Var3 = o1Var.r;
                if ((d0Var3 == null || !d0Var3.g()) && ((d0Var2 = o1Var.s) == null || !d0Var2.g())) {
                    u0((w1) this.c, o1Var);
                    if (v()) {
                        z0 z0VarW = o1Var.a.W(o1Var.o);
                        if (z0VarW == null) {
                            z("Use reference '%s' not found", o1Var.o);
                        } else {
                            Matrix matrix = o1Var.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            d0 d0Var4 = o1Var.p;
                            float fD = d0Var4 != null ? d0Var4.d(this) : 0.0f;
                            d0 d0Var5 = o1Var.q;
                            canvas.translate(fD, d0Var5 != null ? d0Var5.e(this) : 0.0f);
                            p(o1Var, o1Var.h);
                            boolean zA0 = a0();
                            ((Stack) this.e).push(o1Var);
                            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
                            if (z0VarW instanceof s0) {
                                s0 s0Var2 = (s0) z0VarW;
                                androidx.compose.ui.geometry.a aVarW = W(null, null, o1Var.r, o1Var.s);
                                o0();
                                c0(s0Var2, aVarW, s0Var2.o, s0Var2.n);
                                n0();
                            } else if (z0VarW instanceof f1) {
                                d0 d0Var6 = o1Var.r;
                                if (d0Var6 == null) {
                                    d0Var6 = new d0(9, 100.0f);
                                }
                                d0 d0Var7 = o1Var.s;
                                if (d0Var7 == null) {
                                    d0Var7 = new d0(9, 100.0f);
                                }
                                androidx.compose.ui.geometry.a aVarW2 = W(null, null, d0Var6, d0Var7);
                                o0();
                                f1 f1Var = (f1) z0VarW;
                                if (aVarW2.d != 0.0f && aVarW2.e != 0.0f) {
                                    r rVar = f1Var.n;
                                    if (rVar == null) {
                                        rVar = r.d;
                                    }
                                    u0((w1) this.c, f1Var);
                                    w1 w1Var = (w1) this.c;
                                    w1Var.f = aVarW2;
                                    if (!w1Var.a.L.booleanValue()) {
                                        androidx.compose.ui.geometry.a aVar = ((w1) this.c).f;
                                        i0(aVar.b, aVar.c, aVar.d, aVar.e);
                                    }
                                    androidx.compose.ui.geometry.a aVar2 = f1Var.o;
                                    w1 w1Var2 = (w1) this.c;
                                    if (aVar2 != null) {
                                        canvas.concat(o(w1Var2.f, aVar2, rVar));
                                        ((w1) this.c).g = f1Var.o;
                                    } else {
                                        androidx.compose.ui.geometry.a aVar3 = w1Var2.f;
                                        canvas.translate(aVar3.b, aVar3.c);
                                    }
                                    boolean zA1 = a0();
                                    e0(f1Var, true);
                                    if (zA1) {
                                        Z(f1Var.h);
                                    }
                                    s0(f1Var);
                                }
                                n0();
                            } else {
                                d0(z0VarW);
                            }
                            ((Stack) this.e).pop();
                            ((Stack) this.f).pop();
                            if (zA0) {
                                Z(o1Var.h);
                            }
                            s0(o1Var);
                        }
                    }
                }
            } else if (z0Var instanceof e1) {
                e1 e1Var = (e1) z0Var;
                u0((w1) this.c, e1Var);
                if (v()) {
                    Matrix matrix2 = e1Var.n;
                    if (matrix2 != null) {
                        ((Canvas) this.a).concat(matrix2);
                    }
                    p(e1Var, e1Var.h);
                    boolean zA2 = a0();
                    String language = Locale.getDefault().getLanguage();
                    for (z0 z0Var2 : e1Var.i) {
                        if (z0Var2 instanceof t0) {
                            t0 t0Var = (t0) z0Var2;
                            if (t0Var.c() == null && ((setA = t0Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                Set setF = t0Var.f();
                                if (setF != null) {
                                    if (g == null) {
                                        synchronized (y1.class) {
                                            HashSet hashSet = new HashSet();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (setF.isEmpty() || !g.containsAll(setF)) {
                                    }
                                }
                                Set setL = t0Var.l();
                                if (setL == null) {
                                    Set setM = t0Var.m();
                                    if (setM == null) {
                                        d0(z0Var2);
                                        break;
                                    }
                                    setM.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zA2) {
                        Z(e1Var.h);
                    }
                    s0(e1Var);
                }
            } else if (z0Var instanceof a0) {
                a0 a0Var = (a0) z0Var;
                u0((w1) this.c, a0Var);
                if (v()) {
                    Matrix matrix3 = a0Var.n;
                    if (matrix3 != null) {
                        ((Canvas) this.a).concat(matrix3);
                    }
                    p(a0Var, a0Var.h);
                    boolean zA3 = a0();
                    e0(a0Var, true);
                    if (zA3) {
                        Z(a0Var.h);
                    }
                    s0(a0Var);
                }
            } else if (z0Var instanceof c0) {
                c0 c0Var = (c0) z0Var;
                Canvas canvas2 = (Canvas) this.a;
                d0 d0Var8 = c0Var.r;
                if (d0Var8 != null && !d0Var8.g() && (d0Var = c0Var.s) != null && !d0Var.g() && (str = c0Var.o) != null) {
                    r rVar2 = c0Var.n;
                    if (rVar2 == null) {
                        rVar2 = r.d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        androidx.compose.ui.geometry.a aVar4 = new androidx.compose.ui.geometry.a(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        u0((w1) this.c, c0Var);
                        if (v() && w0()) {
                            Matrix matrix4 = c0Var.t;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            d0 d0Var9 = c0Var.p;
                            float fD2 = d0Var9 != null ? d0Var9.d(this) : 0.0f;
                            d0 d0Var10 = c0Var.q;
                            float fE2 = d0Var10 != null ? d0Var10.e(this) : 0.0f;
                            float fD3 = c0Var.r.d(this);
                            float fD4 = c0Var.s.d(this);
                            w1 w1Var3 = (w1) this.c;
                            w1Var3.f = new androidx.compose.ui.geometry.a(fD2, fE2, fD3, fD4);
                            if (!w1Var3.a.L.booleanValue()) {
                                androidx.compose.ui.geometry.a aVar5 = ((w1) this.c).f;
                                i0(aVar5.b, aVar5.c, aVar5.d, aVar5.e);
                            }
                            c0Var.h = ((w1) this.c).f;
                            s0(c0Var);
                            p(c0Var, c0Var.h);
                            boolean zA4 = a0();
                            v0();
                            canvas2.save();
                            canvas2.concat(o(((w1) this.c).f, aVar4, rVar2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((w1) this.c).a.j0 != 3 ? 2 : 0));
                            canvas2.restore();
                            if (zA4) {
                                Z(c0Var.h);
                            }
                        }
                    }
                }
            } else if (z0Var instanceof j0) {
                j0 j0Var = (j0) z0Var;
                if (j0Var.o != null) {
                    u0((w1) this.c, j0Var);
                    if (v() && w0()) {
                        w1 w1Var4 = (w1) this.c;
                        if (w1Var4.c || w1Var4.b) {
                            Matrix matrix5 = j0Var.n;
                            if (matrix5 != null) {
                                ((Canvas) this.a).concat(matrix5);
                            }
                            Path path = new s1(j0Var.o).a;
                            if (j0Var.h == null) {
                                j0Var.h = m(path);
                            }
                            s0(j0Var);
                            q(j0Var);
                            p(j0Var, j0Var.h);
                            boolean zA5 = a0();
                            w1 w1Var5 = (w1) this.c;
                            if (w1Var5.b) {
                                int i = w1Var5.a.a0;
                                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                w(j0Var, path);
                            }
                            if (((w1) this.c).c) {
                                x(path);
                            }
                            g0(j0Var);
                            if (zA5) {
                                Z(j0Var.h);
                            }
                        }
                    }
                }
            } else if (z0Var instanceof o0) {
                o0 o0Var = (o0) z0Var;
                d0 d0Var11 = o0Var.q;
                if (d0Var11 != null && o0Var.r != null && !d0Var11.g() && !o0Var.r.g()) {
                    u0((w1) this.c, o0Var);
                    if (v() && w0()) {
                        Matrix matrix6 = o0Var.n;
                        if (matrix6 != null) {
                            ((Canvas) this.a).concat(matrix6);
                        }
                        Path pathV = V(o0Var);
                        s0(o0Var);
                        q(o0Var);
                        p(o0Var, o0Var.h);
                        boolean zA6 = a0();
                        if (((w1) this.c).b) {
                            w(o0Var, pathV);
                        }
                        if (((w1) this.c).c) {
                            x(pathV);
                        }
                        if (zA6) {
                            Z(o0Var.h);
                        }
                    }
                }
            } else if (z0Var instanceof s) {
                s sVar = (s) z0Var;
                d0 d0Var12 = sVar.q;
                if (d0Var12 != null && !d0Var12.g()) {
                    u0((w1) this.c, sVar);
                    if (v() && w0()) {
                        Matrix matrix7 = sVar.n;
                        if (matrix7 != null) {
                            ((Canvas) this.a).concat(matrix7);
                        }
                        Path pathS = S(sVar);
                        s0(sVar);
                        q(sVar);
                        p(sVar, sVar.h);
                        boolean zA7 = a0();
                        if (((w1) this.c).b) {
                            w(sVar, pathS);
                        }
                        if (((w1) this.c).c) {
                            x(pathS);
                        }
                        if (zA7) {
                            Z(sVar.h);
                        }
                    }
                }
            } else if (z0Var instanceof x) {
                x xVar = (x) z0Var;
                d0 d0Var13 = xVar.q;
                if (d0Var13 != null && xVar.r != null && !d0Var13.g() && !xVar.r.g()) {
                    u0((w1) this.c, xVar);
                    if (v() && w0()) {
                        Matrix matrix8 = xVar.n;
                        if (matrix8 != null) {
                            ((Canvas) this.a).concat(matrix8);
                        }
                        Path pathT = T(xVar);
                        s0(xVar);
                        q(xVar);
                        p(xVar, xVar.h);
                        boolean zA8 = a0();
                        if (((w1) this.c).b) {
                            w(xVar, pathT);
                        }
                        if (((w1) this.c).c) {
                            x(pathT);
                        }
                        if (zA8) {
                            Z(xVar.h);
                        }
                    }
                }
            } else if (z0Var instanceof e0) {
                e0 e0Var = (e0) z0Var;
                u0((w1) this.c, e0Var);
                if (v() && w0() && ((w1) this.c).c) {
                    Matrix matrix9 = e0Var.n;
                    if (matrix9 != null) {
                        ((Canvas) this.a).concat(matrix9);
                    }
                    d0 d0Var14 = e0Var.o;
                    float fD5 = d0Var14 == null ? 0.0f : d0Var14.d(this);
                    d0 d0Var15 = e0Var.p;
                    float fE3 = d0Var15 == null ? 0.0f : d0Var15.e(this);
                    d0 d0Var16 = e0Var.q;
                    float fD6 = d0Var16 == null ? 0.0f : d0Var16.d(this);
                    d0 d0Var17 = e0Var.r;
                    fE = d0Var17 != null ? d0Var17.e(this) : 0.0f;
                    if (e0Var.h == null) {
                        e0Var.h = new androidx.compose.ui.geometry.a(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD5, fE3);
                    path2.lineTo(fD6, fE);
                    s0(e0Var);
                    q(e0Var);
                    p(e0Var, e0Var.h);
                    boolean zA9 = a0();
                    x(path2);
                    g0(e0Var);
                    if (zA9) {
                        Z(e0Var.h);
                    }
                }
            } else if (z0Var instanceof n0) {
                n0 n0Var = (n0) z0Var;
                u0((w1) this.c, n0Var);
                if (v() && w0()) {
                    w1 w1Var6 = (w1) this.c;
                    if (w1Var6.c || w1Var6.b) {
                        Matrix matrix10 = n0Var.n;
                        if (matrix10 != null) {
                            ((Canvas) this.a).concat(matrix10);
                        }
                        if (n0Var.o.length >= 2) {
                            Path pathU = U(n0Var);
                            s0(n0Var);
                            q(n0Var);
                            p(n0Var, n0Var.h);
                            boolean zA10 = a0();
                            if (((w1) this.c).b) {
                                w(n0Var, pathU);
                            }
                            if (((w1) this.c).c) {
                                x(pathU);
                            }
                            g0(n0Var);
                            if (zA10) {
                                Z(n0Var.h);
                            }
                        }
                    }
                }
            } else if (z0Var instanceof m0) {
                m0 m0Var = (m0) z0Var;
                u0((w1) this.c, m0Var);
                if (v() && w0()) {
                    w1 w1Var7 = (w1) this.c;
                    if (w1Var7.c || w1Var7.b) {
                        Matrix matrix11 = m0Var.n;
                        if (matrix11 != null) {
                            ((Canvas) this.a).concat(matrix11);
                        }
                        if (m0Var.o.length >= 2) {
                            Path pathU2 = U(m0Var);
                            s0(m0Var);
                            int i2 = ((w1) this.c).a.a0;
                            pathU2.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            q(m0Var);
                            p(m0Var, m0Var.h);
                            boolean zA11 = a0();
                            if (((w1) this.c).b) {
                                w(m0Var, pathU2);
                            }
                            if (((w1) this.c).c) {
                                x(pathU2);
                            }
                            g0(m0Var);
                            if (zA11) {
                                Z(m0Var.h);
                            }
                        }
                    }
                }
            } else if (z0Var instanceof i1) {
                i1 i1Var = (i1) z0Var;
                u0((w1) this.c, i1Var);
                if (v()) {
                    Matrix matrix12 = i1Var.r;
                    if (matrix12 != null) {
                        ((Canvas) this.a).concat(matrix12);
                    }
                    ArrayList arrayList = i1Var.n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((d0) i1Var.n.get(0)).d(this);
                    ArrayList arrayList2 = i1Var.o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((d0) i1Var.o.get(0)).e(this);
                    ArrayList arrayList3 = i1Var.p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((d0) i1Var.p.get(0)).d(this);
                    ArrayList arrayList4 = i1Var.q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((d0) i1Var.q.get(0)).e(this);
                    }
                    int iJ = J();
                    if (iJ != 1) {
                        float fN = n(i1Var);
                        if (iJ == 2) {
                            fN /= 2.0f;
                        }
                        fD7 -= fN;
                    }
                    if (i1Var.h == null) {
                        v1 v1Var = new v1(this, fD7, fE4);
                        y(i1Var, v1Var);
                        RectF rectF = (RectF) v1Var.r;
                        i1Var.h = new androidx.compose.ui.geometry.a(rectF.left, rectF.top, rectF.width(), ((RectF) v1Var.r).height());
                    }
                    s0(i1Var);
                    q(i1Var);
                    p(i1Var, i1Var.h);
                    boolean zA12 = a0();
                    y(i1Var, new u1(this, fD7 + fD8, fE4 + fE));
                    if (zA12) {
                        Z(i1Var.h);
                    }
                }
            }
        }
        n0();
    }

    @Override // com.google.firebase.components.c
    public com.google.firebase.inject.b e(com.google.firebase.components.r rVar) {
        if (((Set) this.e).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).e(rVar);
        }
        com.google.firebase.components.s.a(rVar, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    public void e0(u0 u0Var, boolean z) {
        if (z) {
            ((Stack) this.e).push(u0Var);
            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
        }
        Iterator it = u0Var.i.iterator();
        while (it.hasNext()) {
            d0((z0) it.next());
        }
        if (z) {
            ((Stack) this.e).pop();
            ((Stack) this.f).pop();
        }
    }

    @Override // com.google.firebase.components.c
    public Object f(com.google.firebase.components.r rVar) {
        if (((Set) this.a).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).f(rVar);
        }
        com.google.firebase.components.s.a(rVar, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    public void f0(f0 f0Var, r1 r1Var) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        Canvas canvas = (Canvas) this.a;
        o0();
        Float f4 = f0Var.u;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = r1Var.c;
            if (f6 == 0.0f && r1Var.d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(r1Var.d, f6));
            }
        } else {
            fFloatValue = f0Var.u.floatValue();
        }
        float fC = f0Var.p ? 1.0f : ((w1) this.c).a.C.c();
        this.c = G(f0Var);
        Matrix matrix = new Matrix();
        matrix.preTranslate(r1Var.a, r1Var.b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fC, fC);
        d0 d0Var = f0Var.q;
        float fD = d0Var != null ? d0Var.d(this) : 0.0f;
        d0 d0Var2 = f0Var.r;
        float fE = d0Var2 != null ? d0Var2.e(this) : 0.0f;
        d0 d0Var3 = f0Var.s;
        float fD2 = d0Var3 != null ? d0Var3.d(this) : 3.0f;
        d0 d0Var4 = f0Var.t;
        float fE2 = d0Var4 != null ? d0Var4.e(this) : 3.0f;
        androidx.compose.ui.geometry.a aVar = f0Var.o;
        if (aVar != null) {
            float fMax = fD2 / aVar.d;
            float f7 = fE2 / aVar.e;
            r rVar = f0Var.n;
            if (rVar == null) {
                rVar = r.d;
            }
            boolean zEquals = rVar.equals(r.c);
            q qVar = rVar.a;
            if (!zEquals) {
                fMax = rVar.b == 2 ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f7);
            canvas.concat(matrix);
            androidx.compose.ui.geometry.a aVar2 = f0Var.o;
            float f8 = aVar2.d * fMax;
            float f9 = aVar2.e * f7;
            int iOrdinal = qVar.ordinal();
            if (iOrdinal == 2) {
                f = (fD2 - f8) / 2.0f;
                f2 = 0.0f - f;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f2 = 0.0f;
                                }
                            }
                        }
                    }
                    f = (fD2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                }
                f = fD2 - f8;
                f2 = 0.0f - f;
            }
            switch (qVar.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f3 = (fE2 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                    if (!((w1) this.c).a.L.booleanValue()) {
                        i0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f3 = fE2 - f9;
                    f5 = 0.0f - f3;
                    if (!((w1) this.c).a.L.booleanValue()) {
                        i0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((w1) this.c).a.L.booleanValue()) {
                        i0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!((w1) this.c).a.L.booleanValue()) {
                i0(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zA0 = a0();
        e0(f0Var, false);
        if (zA0) {
            Z(f0Var.h);
        }
        n0();
    }

    @Override // com.google.firebase.components.c
    public com.google.firebase.components.p g(com.google.firebase.components.r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).g(rVar);
        }
        com.google.firebase.components.s.a(rVar, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    public void g0(z zVar) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        r0 r0Var = ((w1) this.c).a;
        String str = r0Var.N;
        if (str == null && r0Var.O == null && r0Var.P == null) {
            return;
        }
        if (str == null) {
            f0Var = null;
        } else {
            x0 x0VarW = zVar.a.W(str);
            if (x0VarW != null) {
                f0Var = (f0) x0VarW;
            } else {
                z("Marker reference '%s' not found", ((w1) this.c).a.N);
                f0Var = null;
            }
        }
        String str2 = ((w1) this.c).a.O;
        if (str2 == null) {
            f0Var2 = null;
        } else {
            x0 x0VarW2 = zVar.a.W(str2);
            if (x0VarW2 != null) {
                f0Var2 = (f0) x0VarW2;
            } else {
                z("Marker reference '%s' not found", ((w1) this.c).a.O);
                f0Var2 = null;
            }
        }
        String str3 = ((w1) this.c).a.P;
        if (str3 == null) {
            f0Var3 = null;
        } else {
            x0 x0VarW3 = zVar.a.W(str3);
            if (x0VarW3 != null) {
                f0Var3 = (f0) x0VarW3;
            } else {
                z("Marker reference '%s' not found", ((w1) this.c).a.P);
                f0Var3 = null;
            }
        }
        float f4 = 0.0f;
        if (zVar instanceof j0) {
            arrayList = new q1(this, ((j0) zVar).o).a;
            f2 = 0.0f;
            i = 1;
        } else if (zVar instanceof e0) {
            e0 e0Var = (e0) zVar;
            d0 d0Var = e0Var.o;
            float fD = d0Var != null ? d0Var.d(this) : 0.0f;
            d0 d0Var2 = e0Var.p;
            float fE = d0Var2 != null ? d0Var2.e(this) : 0.0f;
            d0 d0Var3 = e0Var.q;
            float fD2 = d0Var3 != null ? d0Var3.d(this) : 0.0f;
            d0 d0Var4 = e0Var.r;
            float fE2 = d0Var4 != null ? d0Var4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f5 = fD2 - fD;
            i = 1;
            float f6 = fE2 - fE;
            arrayList2.add(new r1(fD, fE, f5, f6));
            arrayList2.add(new r1(fD2, fE2, f5, f6));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            m0 m0Var = (m0) zVar;
            int length = m0Var.o.length;
            if (length < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = m0Var.o;
                r1 r1Var = new r1(fArr[0], fArr[1], 0.0f, 0.0f);
                int i2 = 2;
                float f7 = 0.0f;
                float f8 = 0.0f;
                while (true) {
                    f = r1Var.b;
                    f2 = f4;
                    f3 = r1Var.a;
                    if (i2 >= length) {
                        break;
                    }
                    float[] fArr2 = m0Var.o;
                    float f9 = fArr2[i2];
                    float f10 = fArr2[i2 + 1];
                    r1Var.a(f9, f10);
                    arrayList3.add(r1Var);
                    r1Var = new r1(f9, f10, f9 - f3, f10 - f);
                    i2 += 2;
                    f8 = f10;
                    f7 = f9;
                    f4 = f2;
                }
                if (m0Var instanceof n0) {
                    float[] fArr3 = m0Var.o;
                    float f11 = fArr3[0];
                    if (f7 != f11) {
                        float f12 = fArr3[1];
                        if (f8 != f12) {
                            r1Var.a(f11, f12);
                            arrayList3.add(r1Var);
                            r1 r1Var2 = new r1(f11, f12, f11 - f3, f12 - f);
                            r1Var2.b((r1) arrayList3.get(0));
                            arrayList3.add(r1Var2);
                            arrayList3.set(0, r1Var2);
                        }
                    }
                } else {
                    arrayList3.add(r1Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        r0 r0Var2 = ((w1) this.c).a;
        r0Var2.P = null;
        r0Var2.O = null;
        r0Var2.N = null;
        if (f0Var != null) {
            f0(f0Var, (r1) arrayList.get(0));
        }
        if (f0Var2 != null && arrayList.size() > 2) {
            r1 r1Var3 = (r1) arrayList.get(0);
            r1 r1Var4 = (r1) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                r1 r1Var5 = (r1) arrayList.get(i3);
                if (r1Var4.e) {
                    float f13 = r1Var4.c;
                    float f14 = r1Var4.d;
                    float f15 = r1Var4.a;
                    float f16 = f15 - r1Var3.a;
                    float f17 = r1Var4.b;
                    float f18 = ((f17 - r1Var3.b) * f14) + (f16 * f13);
                    if (f18 == f2) {
                        f18 = ((r1Var5.a - f15) * f13) + ((r1Var5.b - f17) * f14);
                    }
                    if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                        r1Var4.c = -f13;
                        r1Var4.d = -f14;
                    }
                }
                f0(f0Var2, r1Var4);
                r1Var3 = r1Var4;
                r1Var4 = r1Var5;
            }
        }
        if (f0Var3 != null) {
            f0(f0Var3, (r1) arrayList.get(size - 1));
        }
    }

    public void h0(g0 g0Var, androidx.compose.ui.geometry.a aVar) {
        float fD;
        float fE;
        Canvas canvas = (Canvas) this.a;
        Boolean bool = g0Var.n;
        if (bool == null || !bool.booleanValue()) {
            d0 d0Var = g0Var.p;
            float fB = d0Var != null ? d0Var.b(this, 1.0f) : 1.2f;
            d0 d0Var2 = g0Var.q;
            float fB2 = d0Var2 != null ? d0Var2.b(this, 1.0f) : 1.2f;
            fD = fB * aVar.d;
            fE = fB2 * aVar.e;
        } else {
            d0 d0Var3 = g0Var.p;
            fD = d0Var3 != null ? d0Var3.d(this) : aVar.d;
            d0 d0Var4 = g0Var.q;
            fE = d0Var4 != null ? d0Var4.e(this) : aVar.e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        o0();
        w1 w1VarG = G(g0Var);
        this.c = w1VarG;
        w1VarG.a.G = Float.valueOf(1.0f);
        boolean zA0 = a0();
        canvas.save();
        Boolean bool2 = g0Var.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(aVar.b, aVar.c);
            canvas.scale(aVar.d, aVar.e);
        }
        e0(g0Var, false);
        canvas.restore();
        if (zA0) {
            Z(aVar);
        }
        n0();
    }

    public void i0(float f, float f2, float f3, float f4) {
        float fD = f3 + f;
        float fE = f4 + f2;
        com.google.firebase.messaging.o oVar = ((w1) this.c).a.M;
        if (oVar != null) {
            f += ((d0) oVar.B).d(this);
            f2 += ((d0) ((w1) this.c).a.M.y).e(this);
            fD -= ((d0) ((w1) this.c).a.M.z).d(this);
            fE -= ((d0) ((w1) this.c).a.M.A).e(this);
        }
        ((Canvas) this.a).clipRect(f, f2, fD, fE);
    }

    public void j(androidx.appcompat.widget.x xVar, androidx.media3.exoplayer.source.v vVar, androidx.media3.common.v0 v0Var) {
        if (vVar == null) {
            return;
        }
        if (v0Var.b(vVar.a) != -1) {
            xVar.q(vVar, v0Var);
            return;
        }
        androidx.media3.common.v0 v0Var2 = (androidx.media3.common.v0) ((com.google.common.collect.f1) this.c).get(vVar);
        if (v0Var2 != null) {
            xVar.q(vVar, v0Var2);
        }
    }

    public void j0(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zE;
        int i2;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        com.google.firebase.g gVar = (com.google.firebase.g) this.a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.c.b);
        androidx.compose.runtime.snapshots.j jVar = (androidx.compose.runtime.snapshots.j) this.b;
        synchronized (jVar) {
            try {
                if (jVar.a == 0 && (packageInfoD = jVar.d("com.google.android.gms")) != null) {
                    jVar.a = packageInfoD.versionCode;
                }
                i = jVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((androidx.compose.runtime.snapshots.j) this.b).b());
        androidx.compose.runtime.snapshots.j jVar2 = (androidx.compose.runtime.snapshots.j) this.b;
        synchronized (jVar2) {
            try {
                if (((String) jVar2.e) == null) {
                    jVar2.f();
                }
                str3 = (String) jVar2.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        com.google.firebase.g gVar2 = (com.google.firebase.g) this.a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((com.google.firebase.installations.a) kotlin.math.a.f(((com.google.firebase.installations.c) ((com.google.firebase.installations.d) this.f)).d())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) kotlin.math.a.f(((com.google.firebase.installations.c) ((com.google.firebase.installations.d) this.f)).c()));
        bundle.putString("cliv", "fcm-25.0.1");
        com.google.firebase.heartbeatinfo.g gVar3 = (com.google.firebase.heartbeatinfo.g) ((com.google.firebase.inject.b) this.e).get();
        com.google.firebase.platforminfo.b bVar = (com.google.firebase.platforminfo.b) ((com.google.firebase.inject.b) this.d).get();
        if (gVar3 == null || bVar == null) {
            return;
        }
        com.google.firebase.heartbeatinfo.d dVar = (com.google.firebase.heartbeatinfo.d) gVar3;
        synchronized (dVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.google.firebase.heartbeatinfo.h hVar = (com.google.firebase.heartbeatinfo.h) dVar.a.get();
            synchronized (hVar) {
                zE = hVar.e(com.google.firebase.heartbeatinfo.h.b, jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (hVar) {
                    hVar.a.a(new androidx.datastore.core.t0(20, hVar, hVar.b(System.currentTimeMillis())));
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(androidx.constraintlayout.core.g.e(i2)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public Path l(w0 w0Var, androidx.compose.ui.geometry.a aVar) {
        Path pathY;
        x0 x0VarW = w0Var.a.W(((w1) this.c).a.U);
        if (x0VarW == null) {
            z("ClipPath reference '%s' not found", ((w1) this.c).a.U);
            return null;
        }
        t tVar = (t) x0VarW;
        ((Stack) this.d).push((w1) this.c);
        this.c = G(tVar);
        Boolean bool = tVar.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(aVar.b, aVar.c);
            matrix.preScale(aVar.d, aVar.e);
        }
        Matrix matrix2 = tVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (z0 z0Var : tVar.i) {
            if ((z0Var instanceof w0) && (pathY = Y((w0) z0Var, true)) != null) {
                path.op(pathY, Path.Op.UNION);
            }
        }
        if (((w1) this.c).a.U != null) {
            if (tVar.h == null) {
                tVar.h = m(path);
            }
            Path pathL = l(tVar, tVar.h);
            if (pathL != null) {
                path.op(pathL, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = (w1) ((Stack) this.d).pop();
        return path;
    }

    public com.google.android.gms.tasks.q m0(String str, String str2, Bundle bundle) {
        int i;
        try {
            j0(str, str2, bundle);
            com.google.android.gms.cloudmessaging.b bVar = (com.google.android.gms.cloudmessaging.b) this.c;
            com.google.android.gms.cloudmessaging.h hVar = com.google.android.gms.cloudmessaging.h.z;
            u2 u2Var = bVar.c;
            if (u2Var.w() >= 12000000) {
                com.google.android.gms.cloudmessaging.n nVarP = com.google.android.gms.cloudmessaging.n.p(bVar.b);
                synchronized (nVarP) {
                    i = nVarP.e;
                    nVarP.e = i + 1;
                }
                return nVarP.q(new com.google.android.gms.cloudmessaging.m(i, 1, bundle, 1)).j(hVar, com.google.android.gms.cloudmessaging.d.y);
            }
            if (u2Var.x() != 0) {
                return bVar.a(bundle).d(hVar, new coil3.memory.c(15, bVar, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            com.google.android.gms.tasks.q qVar = new com.google.android.gms.tasks.q();
            qVar.m(iOException);
            return qVar;
        } catch (InterruptedException | ExecutionException e) {
            com.google.android.gms.tasks.q qVar2 = new com.google.android.gms.tasks.q();
            qVar2.m(e);
            return qVar2;
        }
    }

    public float n(k1 k1Var) {
        x1 x1Var = new x1(this);
        y(k1Var, x1Var);
        return x1Var.n;
    }

    public void n0() {
        ((Canvas) this.a).restore();
        this.c = (w1) ((Stack) this.d).pop();
    }

    public void o0() {
        ((Canvas) this.a).save();
        ((Stack) this.d).push((w1) this.c);
        this.c = new w1((w1) this.c);
    }

    public void p(w0 w0Var, androidx.compose.ui.geometry.a aVar) {
        Path pathL;
        if (((w1) this.c).a.U == null || (pathL = l(w0Var, aVar)) == null) {
            return;
        }
        ((Canvas) this.a).clipPath(pathL);
    }

    public void p0() {
        androidx.compose.material.ripple.g gVar = (androidx.compose.material.ripple.g) this.e;
        HashMap map = (HashMap) this.a;
        if (gVar.a) {
            gVar.j(map);
        }
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public void q(w0 w0Var) {
        a1 a1Var = ((w1) this.c).a.y;
        if (a1Var instanceof i0) {
            u(true, w0Var.h, (i0) a1Var);
        }
        a1 a1Var2 = ((w1) this.c).a.A;
        if (a1Var2 instanceof i0) {
            u(false, w0Var.h, (i0) a1Var2);
        }
    }

    public String q0(String str, boolean z, boolean z2) {
        if (((w1) this.c).h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public void r0(androidx.media3.common.v0 v0Var) {
        com.google.common.collect.h0 h0Var;
        androidx.appcompat.widget.x xVarA = com.google.common.collect.f1.a();
        if (((com.google.common.collect.h0) this.b).isEmpty()) {
            j(xVarA, (androidx.media3.exoplayer.source.v) this.e, v0Var);
            if (!Objects.equals((androidx.media3.exoplayer.source.v) this.f, (androidx.media3.exoplayer.source.v) this.e)) {
                j(xVarA, (androidx.media3.exoplayer.source.v) this.f, v0Var);
            }
            if (!Objects.equals((androidx.media3.exoplayer.source.v) this.d, (androidx.media3.exoplayer.source.v) this.e) && !Objects.equals((androidx.media3.exoplayer.source.v) this.d, (androidx.media3.exoplayer.source.v) this.f)) {
                j(xVarA, (androidx.media3.exoplayer.source.v) this.d, v0Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((com.google.common.collect.h0) this.b).size();
                h0Var = (com.google.common.collect.h0) this.b;
                if (i >= size) {
                    break;
                }
                j(xVarA, (androidx.media3.exoplayer.source.v) h0Var.get(i), v0Var);
                i++;
            }
            if (!h0Var.contains((androidx.media3.exoplayer.source.v) this.d)) {
                j(xVarA, (androidx.media3.exoplayer.source.v) this.d, v0Var);
            }
        }
        this.c = xVarA.e(true);
    }

    public void s0(w0 w0Var) {
        if (w0Var.b == null || w0Var.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f).peek()).invert(matrix)) {
            androidx.compose.ui.geometry.a aVar = w0Var.h;
            float f = aVar.b;
            float f2 = aVar.c;
            float fC = aVar.c();
            androidx.compose.ui.geometry.a aVar2 = w0Var.h;
            float f3 = aVar2.c;
            float fC2 = aVar2.c();
            float fD = w0Var.h.d();
            androidx.compose.ui.geometry.a aVar3 = w0Var.h;
            float[] fArr = {f, f2, fC, f3, fC2, fD, aVar3.b, aVar3.d()};
            matrix.preConcat(((Canvas) this.a).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            w0 w0Var2 = (w0) ((Stack) this.e).peek();
            androidx.compose.ui.geometry.a aVar4 = w0Var2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (aVar4 == null) {
                w0Var2.h = new androidx.compose.ui.geometry.a(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < aVar4.b) {
                aVar4.b = f8;
            }
            if (f9 < aVar4.c) {
                aVar4.c = f9;
            }
            if (f8 + f10 > aVar4.c()) {
                aVar4.d = (f8 + f10) - aVar4.b;
            }
            if (f9 + f11 > aVar4.d()) {
                aVar4.e = (f9 + f11) - aVar4.c;
            }
        }
    }

    public void t0(w1 w1Var, r0 r0Var) {
        if (Q(r0Var, 4096L)) {
            w1Var.a.H = r0Var.H;
        }
        if (Q(r0Var, 2048L)) {
            w1Var.a.G = r0Var.G;
        }
        boolean zQ = Q(r0Var, 1L);
        u uVar = u.z;
        if (zQ) {
            w1Var.a.y = r0Var.y;
            a1 a1Var = r0Var.y;
            w1Var.b = (a1Var == null || a1Var == uVar) ? false : true;
        }
        if (Q(r0Var, 4L)) {
            w1Var.a.z = r0Var.z;
        }
        if (Q(r0Var, 6149L)) {
            k0(w1Var, true, w1Var.a.y);
        }
        if (Q(r0Var, 2L)) {
            w1Var.a.a0 = r0Var.a0;
        }
        if (Q(r0Var, 8L)) {
            w1Var.a.A = r0Var.A;
            a1 a1Var2 = r0Var.A;
            w1Var.c = (a1Var2 == null || a1Var2 == uVar) ? false : true;
        }
        if (Q(r0Var, 16L)) {
            w1Var.a.B = r0Var.B;
        }
        if (Q(r0Var, 6168L)) {
            k0(w1Var, false, w1Var.a.A);
        }
        if (Q(r0Var, 34359738368L)) {
            w1Var.a.i0 = r0Var.i0;
        }
        if (Q(r0Var, 32L)) {
            r0 r0Var2 = w1Var.a;
            d0 d0Var = r0Var.C;
            r0Var2.C = d0Var;
            w1Var.e.setStrokeWidth(d0Var.a(this));
        }
        if (Q(r0Var, 64L)) {
            r0 r0Var3 = w1Var.a;
            Paint paint = w1Var.e;
            r0Var3.b0 = r0Var.b0;
            int iE = androidx.constraintlayout.core.g.e(r0Var.b0);
            if (iE == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iE == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iE == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Q(r0Var, 128L)) {
            r0 r0Var4 = w1Var.a;
            Paint paint2 = w1Var.e;
            r0Var4.c0 = r0Var.c0;
            int iE2 = androidx.constraintlayout.core.g.e(r0Var.c0);
            if (iE2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iE2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iE2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Q(r0Var, 256L)) {
            w1Var.a.D = r0Var.D;
            w1Var.e.setStrokeMiter(r0Var.D.floatValue());
        }
        if (Q(r0Var, 512L)) {
            w1Var.a.E = r0Var.E;
        }
        if (Q(r0Var, 1024L)) {
            w1Var.a.F = r0Var.F;
        }
        Typeface typefaceR = null;
        if (Q(r0Var, 1536L)) {
            r0 r0Var5 = w1Var.a;
            Paint paint3 = w1Var.e;
            d0[] d0VarArr = r0Var5.E;
            if (d0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = d0VarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float fA = r0Var5.E[i2 % length].a(this);
                    fArr[i2] = fA;
                    f += fA;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = r0Var5.F.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (Q(r0Var, 16384L)) {
            float textSize = ((w1) this.c).d.getTextSize();
            w1Var.a.J = r0Var.J;
            w1Var.d.setTextSize(r0Var.J.b(this, textSize));
            w1Var.e.setTextSize(r0Var.J.b(this, textSize));
        }
        if (Q(r0Var, 8192L)) {
            w1Var.a.I = r0Var.I;
        }
        if (Q(r0Var, 32768L)) {
            if (r0Var.K.intValue() == -1 && w1Var.a.K.intValue() > 100) {
                r0 r0Var6 = w1Var.a;
                r0Var6.K = Integer.valueOf(r0Var6.K.intValue() - 100);
            } else if (r0Var.K.intValue() != 1 || w1Var.a.K.intValue() >= 900) {
                w1Var.a.K = r0Var.K;
            } else {
                r0 r0Var7 = w1Var.a;
                r0Var7.K = Integer.valueOf(r0Var7.K.intValue() + 100);
            }
        }
        if (Q(r0Var, 65536L)) {
            w1Var.a.d0 = r0Var.d0;
        }
        if (Q(r0Var, 106496L)) {
            r0 r0Var8 = w1Var.a;
            ArrayList arrayList = r0Var8.I;
            if (arrayList != null && ((androidx.appcompat.widget.c2) this.b) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceR = r((String) it.next(), r0Var8.K, r0Var8.d0)) == null) {
                }
            }
            if (typefaceR == null) {
                typefaceR = r("serif", r0Var8.K, r0Var8.d0);
            }
            w1Var.d.setTypeface(typefaceR);
            w1Var.e.setTypeface(typefaceR);
        }
        if (Q(r0Var, 131072L)) {
            r0 r0Var9 = w1Var.a;
            Paint paint4 = w1Var.e;
            Paint paint5 = w1Var.d;
            r0Var9.e0 = r0Var.e0;
            paint5.setStrikeThruText(r0Var.e0 == 4);
            paint5.setUnderlineText(r0Var.e0 == 2);
            paint4.setStrikeThruText(r0Var.e0 == 4);
            paint4.setUnderlineText(r0Var.e0 == 2);
        }
        if (Q(r0Var, 68719476736L)) {
            w1Var.a.f0 = r0Var.f0;
        }
        if (Q(r0Var, 262144L)) {
            w1Var.a.g0 = r0Var.g0;
        }
        if (Q(r0Var, 524288L)) {
            w1Var.a.L = r0Var.L;
        }
        if (Q(r0Var, 2097152L)) {
            w1Var.a.N = r0Var.N;
        }
        if (Q(r0Var, 4194304L)) {
            w1Var.a.O = r0Var.O;
        }
        if (Q(r0Var, 8388608L)) {
            w1Var.a.P = r0Var.P;
        }
        if (Q(r0Var, 16777216L)) {
            w1Var.a.Q = r0Var.Q;
        }
        if (Q(r0Var, 33554432L)) {
            w1Var.a.R = r0Var.R;
        }
        if (Q(r0Var, 1048576L)) {
            w1Var.a.M = r0Var.M;
        }
        if (Q(r0Var, 268435456L)) {
            w1Var.a.U = r0Var.U;
        }
        if (Q(r0Var, 536870912L)) {
            w1Var.a.h0 = r0Var.h0;
        }
        if (Q(r0Var, 1073741824L)) {
            w1Var.a.V = r0Var.V;
        }
        if (Q(r0Var, 67108864L)) {
            w1Var.a.S = r0Var.S;
        }
        if (Q(r0Var, 134217728L)) {
            w1Var.a.T = r0Var.T;
        }
        if (Q(r0Var, 8589934592L)) {
            w1Var.a.Y = r0Var.Y;
        }
        if (Q(r0Var, 17179869184L)) {
            w1Var.a.Z = r0Var.Z;
        }
        if (Q(r0Var, 137438953472L)) {
            w1Var.a.j0 = r0Var.j0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009d A[PHI: r11 r12 r15 r17
  0x009d: PHI (r11v17 float) = (r11v14 float), (r11v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r12v17 float) = (r12v15 float), (r12v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r15v17 float) = (r15v15 float), (r15v32 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void u(boolean z, androidx.compose.ui.geometry.a aVar, i0 i0Var) {
        float fB;
        float f;
        float fB2;
        float f2;
        float fB3;
        float fB4;
        float fB5;
        float fB6;
        x0 x0VarW = ((androidx.appcompat.widget.c2) this.b).W(i0Var.e);
        int i = 0;
        int i2 = 0;
        if (x0VarW == null) {
            z("%s reference '%s' not found", z ? "Fill" : "Stroke", i0Var.e);
            a1 a1Var = i0Var.y;
            w1 w1Var = (w1) this.c;
            if (a1Var != null) {
                k0(w1Var, z, a1Var);
                return;
            } else if (z) {
                w1Var.b = false;
                return;
            } else {
                w1Var.c = false;
                return;
            }
        }
        boolean z2 = x0VarW instanceof y0;
        u uVar = u.y;
        if (z2) {
            y0 y0Var = (y0) x0VarW;
            String str = y0Var.l;
            if (str != null) {
                C(y0Var, str);
            }
            Boolean bool = y0Var.i;
            byte b = bool != null && bool.booleanValue();
            w1 w1Var2 = (w1) this.c;
            Paint paint = z ? w1Var2.d : w1Var2.e;
            if (b == true) {
                androidx.compose.ui.geometry.a aVar2 = w1Var2.g;
                if (aVar2 == null) {
                    aVar2 = w1Var2.f;
                }
                d0 d0Var = y0Var.m;
                fB3 = d0Var != null ? d0Var.d(this) : 0.0f;
                d0 d0Var2 = y0Var.n;
                fB4 = d0Var2 != null ? d0Var2.e(this) : 0.0f;
                f2 = 0.0f;
                d0 d0Var3 = y0Var.o;
                fB5 = d0Var3 != null ? d0Var3.d(this) : aVar2.d;
                d0 d0Var4 = y0Var.p;
                if (d0Var4 != null) {
                    fB6 = d0Var4.e(this);
                } else {
                    fB6 = f2;
                }
            } else {
                f2 = 0.0f;
                d0 d0Var5 = y0Var.m;
                fB3 = d0Var5 != null ? d0Var5.b(this, 1.0f) : 0.0f;
                d0 d0Var6 = y0Var.n;
                fB4 = d0Var6 != null ? d0Var6.b(this, 1.0f) : 0.0f;
                d0 d0Var7 = y0Var.o;
                fB5 = d0Var7 != null ? d0Var7.b(this, 1.0f) : 1.0f;
                d0 d0Var8 = y0Var.p;
                if (d0Var8 != null) {
                    fB6 = d0Var8.b(this, 1.0f);
                } else {
                    fB6 = f2;
                }
            }
            float f3 = fB4;
            float f4 = fB5;
            float f5 = fB6;
            float f6 = fB3;
            o0();
            this.c = G(y0Var);
            Matrix matrix = new Matrix();
            if (b == false) {
                matrix.preTranslate(aVar.b, aVar.c);
                matrix.preScale(aVar.d, aVar.e);
            }
            Matrix matrix2 = y0Var.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = y0Var.h.size();
            if (size == 0) {
                n0();
                w1 w1Var3 = (w1) this.c;
                if (z) {
                    w1Var3.b = false;
                    return;
                } else {
                    w1Var3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = y0Var.h.iterator();
            int i3 = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                q0 q0Var = (q0) ((z0) it.next());
                Float f8 = q0Var.h;
                float fFloatValue = f8 != null ? f8.floatValue() : f2;
                if (i3 == 0 || fFloatValue >= f7) {
                    fArr[i3] = fFloatValue;
                    f7 = fFloatValue;
                } else {
                    fArr[i3] = f7;
                }
                o0();
                u0((w1) this.c, q0Var);
                r0 r0Var = ((w1) this.c).a;
                u uVar2 = (u) r0Var.S;
                if (uVar2 == null) {
                    uVar2 = uVar;
                }
                iArr[i3] = s(uVar2.e, r0Var.T.floatValue());
                i3++;
                n0();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                n0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i4 = y0Var.k;
            if (i4 != 0) {
                if (i4 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i4 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            n0();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((w1) this.c).a.z.floatValue() * 256.0f);
            if (iFloatValue >= 0) {
                i = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i);
            return;
        }
        if (!(x0VarW instanceof c1)) {
            if (x0VarW instanceof p0) {
                p0 p0Var = (p0) x0VarW;
                r0 r0Var2 = p0Var.e;
                if (z) {
                    if (Q(r0Var2, 2147483648L)) {
                        w1 w1Var4 = (w1) this.c;
                        r0 r0Var3 = w1Var4.a;
                        a1 a1Var2 = p0Var.e.W;
                        r0Var3.y = a1Var2;
                        w1Var4.b = a1Var2 != null;
                    }
                    if (Q(p0Var.e, 4294967296L)) {
                        ((w1) this.c).a.z = p0Var.e.X;
                    }
                    if (Q(p0Var.e, 6442450944L)) {
                        w1 w1Var5 = (w1) this.c;
                        k0(w1Var5, z, w1Var5.a.y);
                        return;
                    }
                    return;
                }
                if (Q(r0Var2, 2147483648L)) {
                    w1 w1Var6 = (w1) this.c;
                    r0 r0Var4 = w1Var6.a;
                    a1 a1Var3 = p0Var.e.W;
                    r0Var4.A = a1Var3;
                    w1Var6.c = a1Var3 != null;
                }
                if (Q(p0Var.e, 4294967296L)) {
                    ((w1) this.c).a.B = p0Var.e.X;
                }
                if (Q(p0Var.e, 6442450944L)) {
                    w1 w1Var7 = (w1) this.c;
                    k0(w1Var7, z, w1Var7.a.A);
                    return;
                }
                return;
            }
            return;
        }
        c1 c1Var = (c1) x0VarW;
        String str2 = c1Var.l;
        if (str2 != null) {
            C(c1Var, str2);
        }
        Boolean bool2 = c1Var.i;
        byte b2 = bool2 != null && bool2.booleanValue();
        w1 w1Var8 = (w1) this.c;
        Paint paint2 = z ? w1Var8.d : w1Var8.e;
        if (b2 == true) {
            d0 d0Var9 = new d0(9, 50.0f);
            d0 d0Var10 = c1Var.m;
            float fD = d0Var10 != null ? d0Var10.d(this) : d0Var9.d(this);
            d0 d0Var11 = c1Var.n;
            fB = d0Var11 != null ? d0Var11.e(this) : d0Var9.e(this);
            d0 d0Var12 = c1Var.o;
            fB2 = d0Var12 != null ? d0Var12.a(this) : d0Var9.a(this);
            f = fD;
        } else {
            d0 d0Var13 = c1Var.m;
            float fB7 = d0Var13 != null ? d0Var13.b(this, 1.0f) : 0.5f;
            d0 d0Var14 = c1Var.n;
            fB = d0Var14 != null ? d0Var14.b(this, 1.0f) : 0.5f;
            d0 d0Var15 = c1Var.o;
            f = fB7;
            fB2 = d0Var15 != null ? d0Var15.b(this, 1.0f) : 0.5f;
        }
        float f9 = fB;
        o0();
        this.c = G(c1Var);
        Matrix matrix3 = new Matrix();
        if (b2 == false) {
            matrix3.preTranslate(aVar.b, aVar.c);
            matrix3.preScale(aVar.d, aVar.e);
        }
        Matrix matrix4 = c1Var.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = c1Var.h.size();
        if (size2 == 0) {
            n0();
            w1 w1Var9 = (w1) this.c;
            if (z) {
                w1Var9.b = false;
                return;
            } else {
                w1Var9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = c1Var.h.iterator();
        int i5 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            q0 q0Var2 = (q0) ((z0) it2.next());
            Float f11 = q0Var2.h;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            if (i5 == 0 || fFloatValue2 >= f10) {
                fArr2[i5] = fFloatValue2;
                f10 = fFloatValue2;
            } else {
                fArr2[i5] = f10;
            }
            o0();
            u0((w1) this.c, q0Var2);
            r0 r0Var5 = ((w1) this.c).a;
            u uVar3 = (u) r0Var5.S;
            if (uVar3 == null) {
                uVar3 = uVar;
            }
            iArr2[i5] = s(uVar3.e, r0Var5.T.floatValue());
            i5++;
            n0();
        }
        if (fB2 == 0.0f || size2 == 1) {
            n0();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i6 = c1Var.k;
        if (i6 != 0) {
            if (i6 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i6 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        n0();
        RadialGradient radialGradient = new RadialGradient(f, f9, fB2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((w1) this.c).a.z.floatValue() * 256.0f);
        if (iFloatValue2 >= 0) {
            i2 = iFloatValue2 > 255 ? 255 : iFloatValue2;
        }
        paint2.setAlpha(i2);
    }

    public void u0(w1 w1Var, x0 x0Var) {
        boolean z = x0Var.b == null;
        r0 r0Var = w1Var.a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        r0Var.Q = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        r0Var.L = bool;
        r0Var.M = null;
        r0Var.U = null;
        r0Var.G = fValueOf;
        r0Var.S = u.y;
        r0Var.T = fValueOf;
        r0Var.V = null;
        r0Var.W = null;
        r0Var.X = fValueOf;
        r0Var.Y = null;
        r0Var.Z = fValueOf;
        r0Var.i0 = 1;
        r0 r0Var2 = x0Var.e;
        if (r0Var2 != null) {
            t0(w1Var, r0Var2);
        }
        ArrayList arrayList = ((m) ((androidx.appcompat.widget.c2) this.b).z).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (l lVar : ((m) ((androidx.appcompat.widget.c2) this.b).z).b) {
                if (androidx.media3.common.audio.e.g(lVar.a, x0Var)) {
                    t0(w1Var, lVar.b);
                }
            }
        }
        r0 r0Var3 = x0Var.f;
        if (r0Var3 != null) {
            t0(w1Var, r0Var3);
        }
    }

    public boolean v() {
        Boolean bool = ((w1) this.c).a.Q;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void v0() {
        int iS;
        r0 r0Var = ((w1) this.c).a;
        a1 a1Var = r0Var.Y;
        if (a1Var instanceof u) {
            iS = ((u) a1Var).e;
        } else if (!(a1Var instanceof v)) {
            return;
        } else {
            iS = r0Var.H.e;
        }
        Float f = r0Var.Z;
        if (f != null) {
            iS = s(iS, f.floatValue());
        }
        ((Canvas) this.a).drawColor(iS);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    public void w(w0 w0Var, Path path) {
        float fE;
        float fD;
        float fE2;
        float fD2;
        boolean z;
        boolean z2;
        Canvas canvas = (Canvas) this.a;
        a1 a1Var = ((w1) this.c).a.y;
        if (a1Var instanceof i0) {
            x0 x0VarW = ((androidx.appcompat.widget.c2) this.b).W(((i0) a1Var).e);
            if (x0VarW instanceof l0) {
                l0 l0Var = (l0) x0VarW;
                Boolean bool = l0Var.p;
                boolean z3 = bool != null && bool.booleanValue();
                String str = l0Var.w;
                if (str != null) {
                    E(l0Var, str);
                }
                d0 d0Var = l0Var.s;
                if (z3) {
                    fD = d0Var != null ? d0Var.d(this) : 0.0f;
                    d0 d0Var2 = l0Var.t;
                    fE2 = d0Var2 != null ? d0Var2.e(this) : 0.0f;
                    d0 d0Var3 = l0Var.u;
                    fD2 = d0Var3 != null ? d0Var3.d(this) : 0.0f;
                    d0 d0Var4 = l0Var.v;
                    fE = d0Var4 != null ? d0Var4.e(this) : 0.0f;
                } else {
                    float fB = d0Var != null ? d0Var.b(this, 1.0f) : 0.0f;
                    d0 d0Var5 = l0Var.t;
                    float fB2 = d0Var5 != null ? d0Var5.b(this, 1.0f) : 0.0f;
                    d0 d0Var6 = l0Var.u;
                    float fB3 = d0Var6 != null ? d0Var6.b(this, 1.0f) : 0.0f;
                    d0 d0Var7 = l0Var.v;
                    float fB4 = d0Var7 != null ? d0Var7.b(this, 1.0f) : 0.0f;
                    androidx.compose.ui.geometry.a aVar = w0Var.h;
                    float f = aVar.b;
                    float f2 = aVar.d;
                    float f3 = (fB * f2) + f;
                    float f4 = aVar.c;
                    float f5 = aVar.e;
                    float f6 = fB3 * f2;
                    fE = fB4 * f5;
                    fD = f3;
                    fE2 = (fB2 * f5) + f4;
                    fD2 = f6;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                r rVar = l0Var.n;
                if (rVar == null) {
                    rVar = r.d;
                }
                o0();
                canvas.clipPath(path);
                w1 w1Var = new w1();
                t0(w1Var, r0.a());
                w1Var.a.L = Boolean.FALSE;
                H(l0Var, w1Var);
                this.c = w1Var;
                androidx.compose.ui.geometry.a aVar2 = w0Var.h;
                Matrix matrix = l0Var.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (l0Var.r.invert(matrix2)) {
                        androidx.compose.ui.geometry.a aVar3 = w0Var.h;
                        float f7 = aVar3.b;
                        float f8 = aVar3.c;
                        float fC = aVar3.c();
                        z = true;
                        androidx.compose.ui.geometry.a aVar4 = w0Var.h;
                        z2 = false;
                        float f9 = aVar4.c;
                        float fC2 = aVar4.c();
                        float fD3 = w0Var.h.d();
                        androidx.compose.ui.geometry.a aVar5 = w0Var.h;
                        float[] fArr = {f7, f8, fC, f9, fC2, fD3, aVar5.b, aVar5.d()};
                        matrix2.mapPoints(fArr);
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        RectF rectF = new RectF(f10, f11, f10, f11);
                        for (int i = 2; i <= 6; i += 2) {
                            float f12 = fArr[i];
                            if (f12 < rectF.left) {
                                rectF.left = f12;
                            }
                            if (f12 > rectF.right) {
                                rectF.right = f12;
                            }
                            float f13 = fArr[i + 1];
                            if (f13 < rectF.top) {
                                rectF.top = f13;
                            }
                            if (f13 > rectF.bottom) {
                                rectF.bottom = f13;
                            }
                        }
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        aVar2 = new androidx.compose.ui.geometry.a(f14, f15, rectF.right - f14, rectF.bottom - f15);
                    } else {
                        z = true;
                        z2 = false;
                    }
                } else {
                    z = true;
                    z2 = false;
                }
                float fFloor = (((float) Math.floor((aVar2.b - fD) / fD2)) * fD2) + fD;
                float fC3 = aVar2.c();
                float fD4 = aVar2.d();
                androidx.compose.ui.geometry.a aVar6 = new androidx.compose.ui.geometry.a(0.0f, 0.0f, fD2, fE);
                boolean zA0 = a0();
                for (float fFloor2 = (((float) Math.floor((aVar2.c - fE2) / fE)) * fE) + fE2; fFloor2 < fD4; fFloor2 += fE) {
                    float f16 = fFloor;
                    while (f16 < fC3) {
                        aVar6.b = f16;
                        aVar6.c = fFloor2;
                        o0();
                        if (!((w1) this.c).a.L.booleanValue()) {
                            i0(aVar6.b, aVar6.c, aVar6.d, aVar6.e);
                        }
                        androidx.compose.ui.geometry.a aVar7 = l0Var.o;
                        if (aVar7 != null) {
                            canvas.concat(o(aVar6, aVar7, rVar));
                        } else {
                            Boolean bool2 = l0Var.q;
                            boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            canvas.translate(f16, fFloor2);
                            if (!z4) {
                                androidx.compose.ui.geometry.a aVar8 = w0Var.h;
                                canvas.scale(aVar8.d, aVar8.e);
                            }
                        }
                        Iterator it = l0Var.i.iterator();
                        while (it.hasNext()) {
                            d0((z0) it.next());
                        }
                        n0();
                        f16 += fD2;
                        fD4 = fD4;
                        fFloor = fFloor;
                    }
                }
                if (zA0) {
                    Z(l0Var.h);
                }
                n0();
                return;
            }
        }
        canvas.drawPath(path, ((w1) this.c).d);
    }

    public boolean w0() {
        Boolean bool = ((w1) this.c).a.R;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void x(Path path) {
        w1 w1Var = (w1) this.c;
        int i = w1Var.a.i0;
        Canvas canvas = (Canvas) this.a;
        if (i != 2) {
            canvas.drawPath(path, w1Var.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((w1) this.c).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((w1) this.c).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public com.google.common.util.concurrent.r x0() {
        AtomicLong atomicLong;
        long j;
        final int i;
        ListenableFuture listenableFutureA;
        com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
        com.google.common.util.concurrent.y0 y0Var = (com.google.common.util.concurrent.y0) this.f;
        if (y0Var.isDone()) {
            return y0Var;
        }
        do {
            atomicLong = (AtomicLong) this.b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) (((int) j) + 1)) & 4294967295L) | (((long) i) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.d;
        com.google.common.util.concurrent.y0 y0Var2 = new com.google.common.util.concurrent.y0();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(y0Var2);
        if (listenableFuture == null) {
            j5 j5VarA = rf.a(new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(this, i, 8));
            com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1();
            a1Var.F = new com.google.common.util.concurrent.z0(a1Var, j5VarA);
            d0Var.execute(a1Var);
            listenableFutureA = a1Var;
        } else {
            com.google.common.util.concurrent.z zVar = new com.google.common.util.concurrent.z() { // from class: com.google.android.gms.internal.measurement.te
                @Override // com.google.common.util.concurrent.z
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.a.B0(i);
                }
            };
            int i2 = rf.a;
            listenableFutureA = com.google.common.util.concurrent.n0.a(listenableFuture, Throwable.class, new xc(4, bf.a(), zVar), (com.google.common.util.concurrent.x0) this.e);
        }
        y0Var2.n(listenableFutureA);
        ue ueVar = new ue(this, i);
        y0Var2.a(new androidx.core.provider.m(3, this, y0Var2, ueVar), d0Var);
        return ueVar;
    }

    public void y(k1 k1Var, kotlin.math.a aVar) {
        float f;
        float fE;
        float fD;
        int iJ;
        if (v()) {
            Iterator it = k1Var.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                z0 z0Var = (z0) it.next();
                if (z0Var instanceof n1) {
                    aVar.A(q0(((n1) z0Var).c, z, !it.hasNext()));
                } else if (aVar.r((k1) z0Var)) {
                    float fE2 = 0.0f;
                    if (z0Var instanceof l1) {
                        o0();
                        l1 l1Var = (l1) z0Var;
                        u0((w1) this.c, l1Var);
                        if (v() && w0()) {
                            x0 x0VarW = l1Var.a.W(l1Var.n);
                            if (x0VarW == null) {
                                z("TextPath reference '%s' not found", l1Var.n);
                            } else {
                                j0 j0Var = (j0) x0VarW;
                                s1 s1Var = new s1(j0Var.o);
                                Matrix matrix = j0Var.n;
                                Path path = s1Var.a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                d0 d0Var = l1Var.o;
                                fE2 = d0Var != null ? d0Var.b(this, pathMeasure.getLength()) : 0.0f;
                                int iJ2 = J();
                                if (iJ2 != 1) {
                                    float fN = n(l1Var);
                                    if (iJ2 == 2) {
                                        fN /= 2.0f;
                                    }
                                    fE2 -= fN;
                                }
                                q(l1Var.p);
                                boolean zA0 = a0();
                                y(l1Var, new t1(this, path, fE2));
                                if (zA0) {
                                    Z(l1Var.h);
                                }
                            }
                        }
                        n0();
                    } else if (z0Var instanceof h1) {
                        o0();
                        h1 h1Var = (h1) z0Var;
                        u0((w1) this.c, h1Var);
                        if (v()) {
                            ArrayList arrayList = h1Var.n;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = aVar instanceof u1;
                            if (z3) {
                                float fD2 = !z2 ? ((u1) aVar).n : ((d0) h1Var.n.get(0)).d(this);
                                ArrayList arrayList2 = h1Var.o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((u1) aVar).o : ((d0) h1Var.o.get(0)).e(this);
                                ArrayList arrayList3 = h1Var.p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((d0) h1Var.p.get(0)).d(this);
                                ArrayList arrayList4 = h1Var.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((d0) h1Var.q.get(0)).e(this);
                                }
                                float f2 = fD2;
                                f = fE2;
                                fE2 = f2;
                            } else {
                                f = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z2 && (iJ = J()) != 1) {
                                float fN2 = n(h1Var);
                                if (iJ == 2) {
                                    fN2 /= 2.0f;
                                }
                                fE2 -= fN2;
                            }
                            q(h1Var.r);
                            if (z3) {
                                u1 u1Var = (u1) aVar;
                                u1Var.n = fE2 + fD;
                                u1Var.o = fE + f;
                            }
                            boolean zA1 = a0();
                            y(h1Var, aVar);
                            if (zA1) {
                                Z(h1Var.h);
                            }
                        }
                        n0();
                    } else if (z0Var instanceof g1) {
                        o0();
                        g1 g1Var = (g1) z0Var;
                        u0((w1) this.c, g1Var);
                        if (v()) {
                            q(g1Var.o);
                            x0 x0VarW2 = z0Var.a.W(g1Var.n);
                            if (x0VarW2 == null || !(x0VarW2 instanceof k1)) {
                                z("Tref reference '%s' not found", g1Var.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                A((k1) x0VarW2, sb);
                                if (sb.length() > 0) {
                                    aVar.A(sb.toString());
                                }
                            }
                        }
                        n0();
                    }
                }
                z = false;
            }
        }
    }

    public void y0(String str) {
        ka.e(xd.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        ka.e(!xd.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public void z0(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = xd.a;
        this.e = str;
    }

    public y1(com.google.common.util.concurrent.y yVar) {
        long j = Integer.MIN_VALUE;
        this.b = new AtomicLong((j & 4294967295L) | (j << 32));
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
        com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
        this.e = new com.google.common.util.concurrent.x0(d0Var);
        com.google.common.util.concurrent.y0 y0Var = new com.google.common.util.concurrent.y0();
        this.f = y0Var;
        rc rcVar = new rc();
        rcVar.y = yVar;
        rcVar.z = d0Var;
        this.a = rcVar;
        y0Var.a(rcVar, d0Var);
    }

    public y1(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = com.google.android.gms.signin.a.b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
    }

    public /* synthetic */ y1(Context context) {
        this.b = "files";
        this.c = "common";
        this.d = xd.b;
        this.e = "";
        this.f = com.google.common.collect.h0.k();
        ka.e(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public y1(androidx.media3.exoplayer.mediacodec.o oVar, MediaFormat mediaFormat, androidx.media3.common.r rVar, Surface surface, MediaCrypto mediaCrypto, androidx.media3.exoplayer.mediacodec.j jVar) {
        this.a = oVar;
        this.b = mediaFormat;
        this.c = rVar;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = jVar;
    }
}
