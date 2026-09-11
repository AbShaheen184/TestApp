package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.app.mlounge.data.music.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.a0;
import kotlin.collections.p;
import kotlin.collections.v;
import kotlin.k;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // androidx.activity.result.contract.a
    public final Intent a(Context context, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 1:
                Uri uri = (Uri) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent;
            case 2:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 3:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            default:
                Intent intent2 = (Intent) obj;
                intent2.getClass();
                return intent2;
        }
    }

    @Override // androidx.activity.result.contract.a
    public e b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                ((String[]) obj).getClass();
                return null;
            case 1:
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new e(v.e, 1);
                }
                for (String str : strArr) {
                    if (n.e(context, str) != 0) {
                        return null;
                    }
                }
                int iU = a0.u(strArr.length);
                if (iU < 16) {
                    iU = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new e(linkedHashMap, 1);
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                if (n.e(context, str3) == 0) {
                    return new e(Boolean.TRUE, 1);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override // androidx.activity.result.contract.a
    public final Object c(Intent intent, int i) {
        switch (this.a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 2:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListN = kotlin.collections.n.N(stringArrayExtra);
                        Iterator it = arrayListN.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(p.y(arrayListN, 10), p.y(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new k(it.next(), it2.next()));
                        }
                        return a0.G(arrayList2);
                    }
                }
                return v.e;
            case 3:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra2 != null) {
                    for (int i3 : intArrayExtra2) {
                        if (i3 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new androidx.activity.result.a(intent, i);
        }
    }
}
