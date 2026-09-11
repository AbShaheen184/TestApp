package coil3.map;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import coil3.m;
import coil3.request.n;
import coil3.w;
import java.io.File;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public final w a(Object obj, n nVar) {
        switch (this.a) {
            case 0:
                return m.i(((Uri) obj).toString());
            case 1:
                return m.a(((File) obj).getPath());
            case 2:
                return m.a(((x) obj).e.u());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = nVar.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return m.i("android.resource://" + context.getPackageName() + "/" + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return m.i((String) obj);
        }
    }
}
