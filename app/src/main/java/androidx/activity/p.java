package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.room.r;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends androidx.core.app.b implements w0, androidx.lifecycle.j, androidx.savedstate.g, e0, androidx.navigationevent.d, androidx.activity.result.i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final i Companion = new i();
    private v0 _viewModelStore;
    private final androidx.activity.result.h activityResultRegistry;
    private int contentLayoutId;
    private final kotlin.h defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final kotlin.h fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final AtomicInteger nextLocalRequestCode;
    private final kotlin.h onBackPressedDispatcher$delegate;
    private final kotlin.h onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<androidx.core.util.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final k reportFullyDrawnExecutor;
    private final androidx.savedstate.f savedStateRegistryController;
    private final androidx.activity.contextaware.a contextAwareHelper = new androidx.activity.contextaware.a();
    private final androidx.core.view.m menuHostHelper = new androidx.core.view.m(new b(this, 0));

    public p() {
        androidx.savedstate.f fVar = new androidx.savedstate.f(new androidx.savedstate.internal.a(this, new androidx.room.coroutines.d(this, 2)));
        this.savedStateRegistryController = fVar;
        this.reportFullyDrawnExecutor = new m(this);
        this.fullyDrawnReporter$delegate = new kotlin.o(new d(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new o(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new kotlin.o(new d(this, 2));
        if (getLifecycle() == null) {
            net.luminis.tls.engine.impl.c.r("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i = 0;
        getLifecycle().a(new androidx.lifecycle.t(this) { // from class: androidx.activity.f
            public final /* synthetic */ p y;

            {
                this.y = this;
            }

            @Override // androidx.lifecycle.t
            public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        if (nVar == androidx.lifecycle.n.ON_STOP && (window = this.y.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        p.e(this.y, vVar, nVar);
                        break;
                }
            }
        });
        final int i2 = 1;
        getLifecycle().a(new androidx.lifecycle.t(this) { // from class: androidx.activity.f
            public final /* synthetic */ p y;

            {
                this.y = this;
            }

            @Override // androidx.lifecycle.t
            public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                Window window;
                View viewPeekDecorView;
                switch (i2) {
                    case 0:
                        if (nVar == androidx.lifecycle.n.ON_STOP && (window = this.y.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        p.e(this.y, vVar, nVar);
                        break;
                }
            }
        });
        getLifecycle().a(new androidx.savedstate.b(this, i2));
        fVar.a();
        l0.c(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new g(this, 0));
        addOnContextAvailableListener(new androidx.activity.contextaware.b() { // from class: androidx.activity.h
            @Override // androidx.activity.contextaware.b
            public final void a(p pVar) {
                p.g(this.a, pVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = new kotlin.o(new d(this, 3));
        this.onBackPressedDispatcher$delegate = new kotlin.o(new d(this, 4));
    }

    public static final void access$ensureViewModelStore(p pVar) {
        if (pVar._viewModelStore == null) {
            j jVar = (j) pVar.getLastNonConfigurationInstance();
            if (jVar != null) {
                pVar._viewModelStore = jVar.b;
            }
            if (pVar._viewModelStore == null) {
                pVar._viewModelStore = new v0();
            }
        }
    }

    public static Bundle b(p pVar) {
        Bundle bundle = new Bundle();
        androidx.activity.result.h hVar = pVar.activityResultRegistry;
        hVar.getClass();
        LinkedHashMap linkedHashMap = hVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(hVar.g));
        return bundle;
    }

    public static void c(c0 c0Var, p pVar, androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = pVar.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            c0Var.c(onBackInvokedDispatcher);
        }
    }

    public static s d(p pVar) {
        return new s(pVar.reportFullyDrawnExecutor, new d(pVar, 0));
    }

    public static void e(p pVar, androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            pVar.contextAwareHelper.b = null;
            if (!pVar.isChangingConfigurations()) {
                pVar.getViewModelStore().a();
            }
            m mVar = (m) pVar.reportFullyDrawnExecutor;
            p pVar2 = mVar.A;
            pVar2.getWindow().getDecorView().removeCallbacks(mVar);
            pVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mVar);
        }
    }

    public static void f(p pVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!kotlin.jvm.internal.l.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!kotlin.jvm.internal.l.a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public static void g(p pVar, Context context) {
        context.getClass();
        Bundle bundleA = pVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            androidx.activity.result.h hVar = pVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = hVar.b;
            LinkedHashMap linkedHashMap2 = hVar.a;
            Bundle bundle = hVar.g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                hVar.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        kotlin.jvm.internal.c0.b(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                hVar.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((m) kVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(androidx.core.view.n nVar, androidx.lifecycle.v vVar) {
        nVar.getClass();
        vVar.getClass();
        androidx.core.view.m mVar = this.menuHostHelper;
        mVar.b.add(nVar);
        mVar.a.run();
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        HashMap map = mVar.c;
        androidx.core.view.l lVar = (androidx.core.view.l) map.remove(nVar);
        if (lVar != null) {
            lVar.a.b(lVar.b);
            lVar.b = null;
        }
        map.put(nVar, new androidx.core.view.l(lifecycle, new e(1, mVar, nVar)));
    }

    public final void addOnConfigurationChangedListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(androidx.activity.contextaware.b bVar) {
        bVar.getClass();
        androidx.activity.contextaware.a aVar = this.contextAwareHelper;
        aVar.getClass();
        p pVar = aVar.b;
        if (pVar != null) {
            bVar.a(pVar);
        }
        aVar.a.add(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnPictureInPictureUiStateChangedListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(androidx.core.app.l lVar) {
        throw null;
    }

    @Override // androidx.activity.result.i
    public final androidx.activity.result.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.j
    public androidx.lifecycle.viewmodel.c getDefaultViewModelCreationExtras() {
        androidx.lifecycle.viewmodel.e eVar = new androidx.lifecycle.viewmodel.e(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.a;
        if (application != null) {
            linkedHashMap.put(r0.d, getApplication());
        }
        linkedHashMap.put(l0.a, this);
        linkedHashMap.put(l0.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(l0.c, extras);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.j
    public s0 getDefaultViewModelProviderFactory() {
        return (s0) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public s getFullyDrawnReporter() {
        return (s) this.fullyDrawnReporter$delegate.getValue();
    }

    @kotlin.c
    public Object getLastCustomNonConfigurationInstance() {
        j jVar = (j) getLastNonConfigurationInstance();
        if (jVar != null) {
            return jVar.a;
        }
        return null;
    }

    @Override // androidx.core.app.b, androidx.lifecycle.v
    public androidx.lifecycle.p getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.navigationevent.d
    public androidx.navigationevent.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // androidx.activity.e0
    public final c0 getOnBackPressedDispatcher() {
        return (c0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.g
    public final androidx.savedstate.e getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // androidx.lifecycle.w0
    public v0 getViewModelStore() {
        if (getApplication() == null) {
            net.luminis.tls.engine.impl.c.r("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this._viewModelStore = jVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new v0();
            }
        }
        v0 v0Var = this._viewModelStore;
        v0Var.getClass();
        return v0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @kotlin.c
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @kotlin.c
    public void onBackPressed() {
        ((androidx.navigationevent.a) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        androidx.activity.contextaware.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.b = this;
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            ((androidx.activity.contextaware.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = h0.y;
        f0.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        androidx.core.view.m mVar = this.menuHostHelper;
        getMenuInflater();
        Iterator it = mVar.b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.f) ((androidx.core.view.n) it.next())).a.o();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<androidx.core.util.a> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.c(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.f) ((androidx.core.view.n) it.next())).a.s();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<androidx.core.util.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.k(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        com.google.android.gms.common.internal.k kVarB = androidx.compose.ui.text.android.i.b(pictureInPictureUiState);
        Iterator<androidx.core.util.a> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(kVarB);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.f) ((androidx.core.view.n) it.next())).a.u();
        }
        return true;
    }

    @Override // android.app.Activity
    @kotlin.c
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @kotlin.c
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        v0 v0Var = this._viewModelStore;
        if (v0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            v0Var = jVar.b;
        }
        if (v0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.a = objOnRetainCustomNonConfigurationInstance;
        jVar2.b = v0Var;
        return jVar2;
    }

    @Override // androidx.core.app.b, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof androidx.lifecycle.x) {
            androidx.lifecycle.p lifecycle = getLifecycle();
            lifecycle.getClass();
            androidx.lifecycle.x xVar = (androidx.lifecycle.x) lifecycle;
            xVar.d("setCurrentState");
            xVar.f(androidx.lifecycle.o.z);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<androidx.core.util.a> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(final androidx.activity.result.contract.a aVar, final androidx.activity.result.h hVar, final androidx.activity.result.b bVar) {
        aVar.getClass();
        hVar.getClass();
        bVar.getClass();
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = hVar.c;
        androidx.lifecycle.p lifecycle = getLifecycle();
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) lifecycle;
        if (xVar.d.compareTo(androidx.lifecycle.o.A) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            androidx.lifecycle.o oVar = xVar.d;
            sb.append(" is attempting to register while current state is ");
            sb.append(oVar);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        hVar.c(str);
        androidx.activity.result.f fVar = (androidx.activity.result.f) linkedHashMap.get(str);
        if (fVar == null) {
            fVar = new androidx.activity.result.f(lifecycle);
        }
        androidx.lifecycle.t tVar = new androidx.lifecycle.t() { // from class: androidx.activity.result.d
            @Override // androidx.lifecycle.t
            public final void g(v vVar, n nVar) {
                h hVar2 = hVar;
                LinkedHashMap linkedHashMap2 = hVar2.e;
                n nVar2 = n.ON_START;
                String str2 = str;
                if (nVar2 != nVar) {
                    if (n.ON_STOP == nVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (n.ON_DESTROY == nVar) {
                            hVar2.d(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = hVar2.g;
                LinkedHashMap linkedHashMap3 = hVar2.f;
                androidx.activity.result.contract.a aVar2 = aVar;
                b bVar2 = bVar;
                linkedHashMap2.put(str2, new e(aVar2, bVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.c(obj);
                }
                a aVar3 = (a) r.n(str2, bundle);
                if (aVar3 != null) {
                    bundle.remove(str2);
                    bVar2.c(aVar2.c(aVar3.y, aVar3.e));
                }
            }
        };
        fVar.a.a(tVar);
        fVar.b.add(tVar);
        linkedHashMap.put(str, fVar);
        return new androidx.activity.result.g(hVar, str, aVar, 0);
    }

    public void removeMenuProvider(androidx.core.view.n nVar) {
        nVar.getClass();
        this.menuHostHelper.b(nVar);
    }

    public final void removeOnConfigurationChangedListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(androidx.activity.contextaware.b bVar) {
        bVar.getClass();
        androidx.activity.contextaware.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.a.remove(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(androidx.core.util.a aVar) {
        aVar.getClass();
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (com.google.android.gms.dynamite.g.w()) {
                com.google.android.gms.dynamite.g.g("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            s fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    Iterator it = fullyDrawnReporter.c.iterator();
                    while (it.hasNext()) {
                        ((kotlin.jvm.functions.a) it.next()).invoke();
                    }
                    fullyDrawnReporter.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((m) kVar).a(decorView);
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(androidx.core.app.l lVar) {
        throw null;
    }

    @Override // android.app.Activity
    @kotlin.c
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @kotlin.c
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @kotlin.c
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @kotlin.c
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((m) kVar).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((m) kVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @kotlin.c
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<androidx.core.util.a> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.c(z));
        }
    }

    @Override // android.app.Activity
    @kotlin.c
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<androidx.core.util.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.k(z));
        }
    }

    public void addMenuProvider(androidx.core.view.n nVar) {
        nVar.getClass();
        androidx.core.view.m mVar = this.menuHostHelper;
        mVar.b.add(nVar);
        mVar.a.run();
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(androidx.core.view.n nVar, androidx.lifecycle.v vVar, androidx.lifecycle.o oVar) {
        nVar.getClass();
        vVar.getClass();
        oVar.getClass();
        androidx.core.view.m mVar = this.menuHostHelper;
        mVar.getClass();
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        HashMap map = mVar.c;
        androidx.core.view.l lVar = (androidx.core.view.l) map.remove(nVar);
        if (lVar != null) {
            lVar.a.b(lVar.b);
            lVar.b = null;
        }
        map.put(nVar, new androidx.core.view.l(lifecycle, new androidx.core.view.k(mVar, oVar, nVar, 0)));
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(androidx.activity.result.contract.a aVar, androidx.activity.result.b bVar) {
        aVar.getClass();
        bVar.getClass();
        return registerForActivityResult(aVar, this.activityResultRegistry, bVar);
    }
}
