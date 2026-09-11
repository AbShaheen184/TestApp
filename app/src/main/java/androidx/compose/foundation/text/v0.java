package androidx.compose.foundation.text;

import android.R;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum v0 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(androidx.compose.foundation.text.contextmenu.data.e.a, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(androidx.compose.foundation.text.contextmenu.data.e.b, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(androidx.compose.foundation.text.contextmenu.data.e.c, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(androidx.compose.foundation.text.contextmenu.data.e.d, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(androidx.compose.foundation.text.contextmenu.data.e.e, Build.VERSION.SDK_INT <= 26 ? com.app.mlounge.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);

    public final Object e;
    public final int y;
    public final int z;

    v0(Object obj, int i, int i2) {
        this.e = obj;
        this.y = i;
        this.z = i2;
    }
}
