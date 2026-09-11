package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends h {
    final /* synthetic */ e0 this$0;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class a extends h {
        final /* synthetic */ e0 this$0;

        public a(e0 e0Var) {
            this.this$0 = e0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            e0 e0Var = this.this$0;
            int i = e0Var.e + 1;
            e0Var.e = i;
            if (i == 1 && e0Var.A) {
                e0Var.C.e(n.ON_START);
                e0Var.A = false;
            }
        }
    }

    public d0(e0 e0Var) {
        this.this$0 = e0Var;
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = h0.y;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((h0) fragmentFindFragmentByTag).e = this.this$0.E;
        }
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        e0 e0Var = this.this$0;
        int i = e0Var.y - 1;
        e0Var.y = i;
        if (i == 0) {
            Handler handler = e0Var.B;
            handler.getClass();
            handler.postDelayed(e0Var.D, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        c0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        e0 e0Var = this.this$0;
        int i = e0Var.e - 1;
        e0Var.e = i;
        if (i == 0 && e0Var.z) {
            e0Var.C.e(n.ON_STOP);
            e0Var.A = true;
        }
    }
}
