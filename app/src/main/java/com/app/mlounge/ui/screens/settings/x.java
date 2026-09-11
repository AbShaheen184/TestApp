package com.app.mlounge.ui.screens.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.y0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ x(Context context, y0 y0Var, int i) {
        this.e = i;
        this.y = context;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        boolean z;
        switch (this.e) {
            case 0:
                Context context = this.y;
                try {
                    File cacheDir = context.getCacheDir();
                    boolean zY = cacheDir != null ? kotlin.io.j.y(cacheDir) : true;
                    File externalCacheDir = context.getExternalCacheDir();
                    z = zY && (externalCacheDir != null ? kotlin.io.j.y(externalCacheDir) : true);
                    break;
                } catch (Exception unused) {
                }
                this.z.setValue(e0.u(context));
                Toast.makeText(context, z ? "Cache Cleared" : "There was an error clearing the cache", 0).show();
                break;
            default:
                Context context2 = this.y;
                this.z.setValue(Boolean.FALSE);
                try {
                    Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                    intent.setData(Uri.parse("package:" + context2.getPackageName()));
                    context2.startActivity(intent);
                } catch (Exception unused2) {
                    context2.startActivity(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
                }
                break;
        }
        return kotlin.y.a;
    }
}
