package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements k, ViewTreeObserver.OnDrawListener, Runnable {
    public final /* synthetic */ p A;
    public final long e = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable y;
    public boolean z;

    public m(p pVar) {
        this.A = pVar;
    }

    public final void a(View view) {
        if (this.z) {
            return;
        }
        this.z = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.y = runnable;
        View decorView = this.A.getWindow().getDecorView();
        decorView.getClass();
        if (!this.z) {
            decorView.postOnAnimation(new l(this, 0));
        } else if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.y;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.e) {
                this.z = false;
                this.A.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.y = null;
        s fullyDrawnReporter = this.A.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.a) {
            z = fullyDrawnReporter.b;
        }
        if (z) {
            this.z = false;
            this.A.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
