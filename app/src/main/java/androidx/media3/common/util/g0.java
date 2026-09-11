package androidx.media3.common.util;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public g0(Handler handler) {
        this.a = handler;
    }

    public static f0 c() {
        f0 f0Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                f0Var = arrayList.isEmpty() ? new f0() : (f0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return f0Var;
    }

    public final f0 a(int i) {
        f0 f0VarC = c();
        f0VarC.a = this.a.obtainMessage(i);
        return f0VarC;
    }

    public final f0 b(int i, Object obj) {
        f0 f0VarC = c();
        f0VarC.a = this.a.obtainMessage(i, obj);
        return f0VarC;
    }

    public final void d(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void e(int i) {
        com.google.android.material.motion.a.f(i != 0);
        this.a.removeMessages(i);
    }

    public final void f(int i) {
        this.a.sendEmptyMessage(i);
    }
}
