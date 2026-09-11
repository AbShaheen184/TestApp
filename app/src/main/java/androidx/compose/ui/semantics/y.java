package androidx.compose.ui.semantics;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Comparator {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ y(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((Number) ((kotlin.jvm.functions.p) this.y).invoke(obj, obj2)).intValue();
            case 1:
                androidx.media3.exoplayer.mediacodec.u uVar = (androidx.media3.exoplayer.mediacodec.u) this.y;
                return uVar.a(obj2) - uVar.a(obj);
            case 2:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.y;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.L).compareTo(Boolean.valueOf(materialButton2.L));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                for (kotlin.jvm.functions.l lVar : (kotlin.jvm.functions.l[]) this.y) {
                    int iF = com.google.android.material.resources.c.f((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
                    if (iF != 0) {
                        return iF;
                    }
                }
                return 0;
        }
    }
}
