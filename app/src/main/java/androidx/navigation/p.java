package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle y;

    public /* synthetic */ p(int i, Bundle bundle) {
        this.e = i;
        this.y = bundle;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean zContainsKey;
        String str = (String) obj;
        switch (this.e) {
            case 0:
                str.getClass();
                zContainsKey = this.y.containsKey(str);
                break;
            default:
                str.getClass();
                zContainsKey = this.y.containsKey(str);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
