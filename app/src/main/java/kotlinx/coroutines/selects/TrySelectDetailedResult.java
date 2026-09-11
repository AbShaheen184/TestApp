package kotlinx.coroutines.selects;

import com.google.android.material.shape.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum TrySelectDetailedResult {
    SUCCESSFUL,
    REREGISTER,
    CANCELLED,
    ALREADY_SELECTED;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = k.I(values());

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }
}
