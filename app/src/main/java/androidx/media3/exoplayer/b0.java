package androidx.media3.exoplayer;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final WeakReference a;
    public final a0 b;
    public final /* synthetic */ c0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.a0, java.util.function.IntConsumer] */
    public b0(c0 c0Var, Context context) {
        this.c = c0Var;
        this.a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: androidx.media3.exoplayer.a0
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                c0 c0Var2 = this.a.c;
                if (c0Var2.h0) {
                    return;
                }
                c0Var2.J(1, 19, Integer.valueOf(i));
            }
        };
        this.b = r0;
        context.registerDeviceIdChangeListener(new androidx.compose.ui.text.input.b0(c0Var.u.a(c0Var.s, null), 1), r0);
    }

    public static void a(b0 b0Var) {
        Context context = (Context) b0Var.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(b0Var.b);
    }
}
