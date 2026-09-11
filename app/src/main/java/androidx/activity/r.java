package androidx.activity;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends Dialog implements androidx.lifecycle.v, e0, androidx.navigationevent.d, androidx.savedstate.g {
    public final kotlin.o A;
    public androidx.lifecycle.x e;
    public final androidx.savedstate.f y;
    public final kotlin.o z;

    public r(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.y = new androidx.savedstate.f(new androidx.savedstate.internal.a(this, new androidx.room.coroutines.d(this, 2)));
        final int i = 0;
        this.z = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.activity.q
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        androidx.navigationevent.a aVar = new androidx.navigationevent.a();
                        this.y.getNavigationEventDispatcher().b(aVar);
                        return aVar;
                    default:
                        return new c0(new l(this.y, 1));
                }
            }
        });
        final int i2 = 1;
        this.A = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.activity.q
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        androidx.navigationevent.a aVar = new androidx.navigationevent.a();
                        this.y.getNavigationEventDispatcher().b(aVar);
                        return aVar;
                    default:
                        return new c0(new l(this.y, 1));
                }
            }
        });
    }

    public static void a(r rVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.x b() {
        androidx.lifecycle.x xVar = this.e;
        if (xVar != null) {
            return xVar;
        }
        androidx.lifecycle.x xVar2 = new androidx.lifecycle.x(this, true);
        this.e = xVar2;
        return xVar2;
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.p getLifecycle() {
        return b();
    }

    @Override // androidx.navigationevent.d
    public final androidx.navigationevent.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // androidx.activity.e0
    public final c0 getOnBackPressedDispatcher() {
        return (c0) this.A.getValue();
    }

    @Override // androidx.savedstate.g
    public final androidx.savedstate.e getSavedStateRegistry() {
        return this.y.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((androidx.navigationevent.a) this.z.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            c0 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.c(onBackInvokedDispatcher);
        }
        this.y.b(bundle);
        b().e(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.y.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().e(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        b().e(androidx.lifecycle.n.ON_DESTROY);
        this.e = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
