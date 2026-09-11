package androidx.compose.ui.text.android;

import android.app.PictureInPictureUiState;
import android.os.Build;
import android.text.StaticLayout;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static com.google.android.gms.common.internal.k b(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new com.google.android.gms.common.internal.k(6);
        }
        if (i < 31) {
            return new com.google.android.gms.common.internal.k(6);
        }
        pictureInPictureUiState.isStashed();
        return new com.google.android.gms.common.internal.k(6);
    }

    public static void c(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
