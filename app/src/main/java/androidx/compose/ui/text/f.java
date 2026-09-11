package androidx.compose.ui.text;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {
    public final /* synthetic */ int e;

    public /* synthetic */ f(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                break;
        }
        return com.google.android.material.resources.c.f(Integer.valueOf(((e) obj).b), Integer.valueOf(((e) obj2).b));
    }
}
