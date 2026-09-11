package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements q {
    public final AutofillValue a;

    public g(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final Boolean a() {
        if (this.a.isToggle()) {
            return Boolean.valueOf(this.a.getToggleValue());
        }
        return null;
    }

    public final CharSequence b() {
        if (this.a.isText()) {
            return this.a.getTextValue();
        }
        return null;
    }
}
