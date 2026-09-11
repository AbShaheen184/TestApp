package androidx.core.app;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.collection.y0;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import com.app.mlounge.R;
import com.google.firebase.crashlytics.internal.model.t1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Activity implements v {
    private final y0 extraDataMap = new y0(0);
    private final x lifecycleRegistry = new x(this, true);

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zBooleanValue;
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (t1.l(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return superDispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!t1.i) {
                    try {
                        t1.j = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    t1.i = true;
                }
                Method method = t1.j;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = s0.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = r0.d;
            r0 r0Var = (r0) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (r0Var == null) {
                r0Var = new r0();
                r0Var.a = null;
                r0Var.b = null;
                r0Var.c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, r0Var);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = r0Var.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = r0.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (r0Var.a == null) {
                                r0Var.a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = r0.d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    r0Var.a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        r0Var.a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            View viewA = r0Var.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (r0Var.b == null) {
                        r0Var.b = new SparseArray();
                    }
                    r0Var.b.put(keyCode, new WeakReference(viewA));
                }
            }
            if (viewA != null) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (t1.l(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @kotlin.c
    public <T extends a> T getExtraData(Class<T> cls) {
        cls.getClass();
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        androidx.transition.k.i();
        return null;
    }

    public p getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = h0.y;
        f0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        x xVar = this.lifecycleRegistry;
        xVar.getClass();
        xVar.d("setCurrentState");
        xVar.f(o.z);
        super.onSaveInstanceState(bundle);
    }

    @kotlin.c
    public void putExtraData(a aVar) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z = true;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z = true;
                        }
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z = true;
                        }
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        z = true;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        z = true;
                    }
                    break;
            }
        }
        return !z;
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }
}
