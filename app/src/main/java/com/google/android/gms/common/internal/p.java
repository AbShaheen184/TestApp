package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements DialogInterface.OnClickListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Intent y;
    public final /* synthetic */ Object z;

    public /* synthetic */ p(Intent intent, Object obj, int i) {
        this.e = i;
        this.y = intent;
        this.z = obj;
    }

    public final void a() {
        switch (this.e) {
            case 0:
                Intent intent = this.y;
                if (intent != null) {
                    ((GoogleApiActivity) this.z).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.y;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.y) this.z).startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
