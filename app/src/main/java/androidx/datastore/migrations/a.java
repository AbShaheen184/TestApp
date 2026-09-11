package androidx.datastore.migrations;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ String y;
    public final /* synthetic */ Context z;

    public /* synthetic */ a(Context context, String str) {
        this.z = context;
        this.y = str;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                SharedPreferences sharedPreferences = this.z.getSharedPreferences(this.y, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            default:
                this.z.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.y)));
                return y.a;
        }
    }

    public /* synthetic */ a(String str, Context context) {
        this.y = str;
        this.z = context;
    }
}
