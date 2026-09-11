package androidx.privacysandbox.ads.adservices.java.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.activity.compose.p;
import androidx.compose.animation.b0;
import androidx.compose.animation.core.c1;
import androidx.privacysandbox.ads.adservices.measurement.e;
import androidx.privacysandbox.ads.adservices.measurement.f;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.coroutines.d;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.internal.platform.android.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    public ListenableFuture a(androidx.privacysandbox.ads.adservices.measurement.a aVar) {
        throw null;
    }

    public ListenableFuture b() {
        return kotlin.math.a.e(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new c1(this, null, 13), 3, null));
    }

    public ListenableFuture c(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return kotlin.math.a.e(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new b0(this, uri, inputEvent, (d) null, 20), 3, null));
    }

    public ListenableFuture d(androidx.privacysandbox.ads.adservices.measurement.d dVar) {
        throw null;
    }

    public ListenableFuture e(Uri uri) {
        uri.getClass();
        return kotlin.math.a.e(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new p(this, uri, null, 27), 3, null));
    }

    public ListenableFuture f(e eVar) {
        throw null;
    }

    public ListenableFuture g(f fVar) {
        throw null;
    }
}
