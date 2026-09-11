package com.google.android.material.shape;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Looper;
import androidx.media3.extractor.h0;
import com.google.android.gms.internal.measurement.k3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class g implements androidx.compose.ui.text.font.q, androidx.compose.ui.input.nestedscroll.a, androidx.core.view.x, androidx.lifecycle.viewmodel.b, androidx.media3.extractor.p, androidx.media3.extractor.text.j, androidx.profileinstaller.b, kotlin.coroutines.h, com.google.android.datatransport.runtime.time.a, com.google.android.gms.dynamite.d, com.google.android.gms.measurement.internal.y {
    public static final /* synthetic */ g e = new g();

    public static Typeface d(String str, androidx.compose.ui.text.font.l lVar, int i) {
        if (i == 0 && kotlin.jvm.internal.l.a(lVar, androidx.compose.ui.text.font.l.z) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iN = _COROUTINE.b.n(lVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iN) : Typeface.create(str, iN);
    }

    public static androidx.compose.ui.graphics.e0 l(List list, float f, float f2, int i) {
        return new androidx.compose.ui.graphics.e0(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L));
    }

    public static final boolean q() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // com.google.android.gms.measurement.internal.y
    public Object a() {
        return new Boolean(((Boolean) k3.b.get()).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    @Override // androidx.compose.ui.text.font.q
    public Typeface b(androidx.compose.ui.text.font.n nVar, androidx.compose.ui.text.font.l lVar, int i) {
        String str;
        nVar.getClass();
        int i2 = lVar.e / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 <= i2 && i2 < 4) {
            str = "sans-serif-light";
        } else if (i2 == 4) {
            str = "sans-serif";
        } else if (i2 == 5) {
            str = "sans-serif-medium";
        } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
            str = "sans-serif-black";
        } else {
            str = "sans-serif";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface typefaceD = d(str, lVar, i);
            if (!kotlin.jvm.internal.l.a(typefaceD, Typeface.create(Typeface.DEFAULT, _COROUTINE.b.n(lVar, i))) && !kotlin.jvm.internal.l.a(typefaceD, d(null, lVar, i))) {
                typeface = typefaceD;
            }
        }
        return typeface == null ? d("sans-serif", lVar, i) : typeface;
    }

    @Override // androidx.compose.ui.text.font.q
    public Typeface c(androidx.compose.ui.text.font.l lVar, int i) {
        return d(null, lVar, i);
    }

    @Override // androidx.media3.extractor.text.j
    public int e(androidx.media3.common.r rVar) {
        return 1;
    }

    public Signature[] f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // androidx.media3.extractor.p
    public void g(androidx.media3.extractor.a0 a0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long h() {
        return System.currentTimeMillis();
    }

    public boolean k(CharSequence charSequence) {
        return false;
    }

    @Override // com.google.android.gms.dynamite.d
    public androidx.media3.container.j n(Context context, String str, com.google.android.gms.dynamite.c cVar) {
        androidx.media3.container.j jVar = new androidx.media3.container.j();
        int iD = cVar.d(context, str);
        jVar.a = iD;
        if (iD != 0) {
            jVar.c = -1;
            return jVar;
        }
        int iC = cVar.c(context, str, true);
        jVar.b = iC;
        if (iC != 0) {
            jVar.c = 1;
        }
        return jVar;
    }

    @Override // androidx.media3.extractor.p
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.extractor.text.j
    public androidx.media3.extractor.text.l p(androidx.media3.common.r rVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // androidx.media3.extractor.text.j
    public boolean r(androidx.media3.common.r rVar) {
        return false;
    }

    @Override // androidx.media3.extractor.p
    public h0 u(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.profileinstaller.b
    public void i() {
    }

    @Override // androidx.profileinstaller.b
    public void j(int i, Object obj) {
    }

    @Override // androidx.core.view.x
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // androidx.core.view.x
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
