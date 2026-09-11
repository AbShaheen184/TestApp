package com.google.android.material.elevation;

import android.content.Context;
import android.util.TypedValue;
import com.app.mlounge.R;
import com.google.android.material.resources.b;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public a(Context context) {
        TypedValue typedValueU = b.u(context, R.attr.elevationOverlayEnabled);
        boolean z = (typedValueU == null || typedValueU.type != 18 || typedValueU.data == 0) ? false : true;
        int iR = n.r(context, R.attr.elevationOverlayColor, 0);
        int iR2 = n.r(context, R.attr.elevationOverlayAccentColor, 0);
        int iR3 = n.r(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = iR;
        this.c = iR2;
        this.d = iR3;
        this.e = f2;
    }
}
