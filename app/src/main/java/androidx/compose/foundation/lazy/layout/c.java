package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements c1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long E;
    public boolean C;
    public long D;
    public final View e;
    public boolean z;
    public final PriorityQueue y = new PriorityQueue(11, new a(0));
    public final Choreographer A = Choreographer.getInstance();
    public final b B = new b();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public c(View view) {
        float refreshRate;
        this.e = view;
        if (E == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            E = (long) (1000000000 / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.C = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.c1
    public final void a(a1 a1Var) {
        this.y.add(new f1(1, a1Var));
        if (this.z) {
            return;
        }
        this.z = true;
        this.e.post(this);
    }

    public final boolean b() {
        b bVar = this.B;
        long jA = bVar.a();
        androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.y;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((f1) objPeek).b.c(bVar)) {
                priorityQueue.poll();
                z = false;
            }
            bVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.C) {
            this.D = j;
            this.e.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.C = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C = false;
        this.e.removeCallbacks(this);
        this.A.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.y;
        if (!priorityQueue.isEmpty() && this.z && this.C) {
            View view = this.e;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (((long) 2) * E) + nanos;
                b bVar = this.B;
                bVar.a = z;
                bVar.b = Math.max(this.D, nanos) + E;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (bVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.A.postFrameCallback(this);
                } else {
                    this.z = false;
                }
                androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.z = false;
    }
}
