package androidx.media3.datasource.cache;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        long j = oVar.C;
        long j2 = oVar2.C;
        if (j - j2 == 0) {
            return oVar.compareTo(oVar2);
        }
        return j < j2 ? -1 : 1;
    }
}
