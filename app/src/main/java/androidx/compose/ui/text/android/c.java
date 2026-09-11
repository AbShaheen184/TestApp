package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.NamedParameterSpec;
import java.security.spec.XECPublicKeySpec;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    public static /* synthetic */ NamedParameterSpec b(String str) {
        return new NamedParameterSpec(str);
    }

    public static /* synthetic */ XECPublicKeySpec c(AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) {
        return new XECPublicKeySpec(algorithmParameterSpec, bigInteger);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}
