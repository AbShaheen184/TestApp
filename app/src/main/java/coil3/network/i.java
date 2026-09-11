package coil3.network;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.j implements kotlin.jvm.functions.l {
    public static final i e = new i(1, g.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && org.jsoup.helper.n.e(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new f(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return e.a;
    }
}
