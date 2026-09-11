package androidx.core.graphics;

import androidx.media3.common.o0;
import androidx.media3.common.util.m;
import com.google.common.base.t;
import com.google.common.collect.f1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements t, m {
    public static /* synthetic */ void b(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void d(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    @Override // com.google.common.base.t
    public Object get() {
        return new androidx.media3.exoplayer.g(new androidx.media3.exoplayer.upstream.d(), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, -1, false, true, f1.D);
    }

    @Override // androidx.media3.common.util.m
    public void invoke(Object obj) {
        ((o0) obj).B(new androidx.media3.exoplayer.j(2, new androidx.compose.ui.res.e("Player release timed out.", 1), 1003));
    }
}
