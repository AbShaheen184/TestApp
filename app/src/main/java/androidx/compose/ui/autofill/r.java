package androidx.compose.ui.autofill;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final Object a;

    public /* synthetic */ r(Object obj) {
        this.a = obj;
    }

    public void a() {
        ((AutofillManager) this.a).commit();
    }

    public ApplicationInfo b(int i, String str) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(int i, String str) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        String nameForUid;
        Context context = (Context) this.a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return com.google.android.gms.common.wrappers.a.e(context);
        }
        if (!com.google.android.gms.common.util.b.a() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public void e(u uVar, int i, AutofillValue autofillValue) {
        ((AutofillManager) this.a).notifyValueChanged(uVar, i, autofillValue);
    }

    public void f(u uVar, int i, Rect rect) {
        ((AutofillManager) this.a).notifyViewEntered(uVar, i, rect);
    }

    public void g(u uVar, int i) {
        ((AutofillManager) this.a).notifyViewExited(uVar, i);
    }

    public void h(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            j.a(view, (AutofillManager) this.a, i, z);
        }
    }

    public void i(u uVar, int i, Rect rect) {
        ((AutofillManager) this.a).requestAutofill(uVar, i, rect);
    }

    public AutofillId j() {
        return androidx.compose.ui.graphics.a.e(this.a);
    }
}
