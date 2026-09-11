package androidx.compose.ui.scrollcapture;

import android.content.ClipData;
import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.s;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.platform.u;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.semantics.y;
import androidx.compose.ui.unit.k;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.core.view.c, androidx.core.view.e {
    public final /* synthetic */ int a;
    public Object b;

    public i(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = LogSessionId.LOG_SESSION_ID_NONE;
                break;
            default:
                this.b = s.r(Boolean.FALSE);
                break;
        }
    }

    @Override // androidx.core.view.c
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // androidx.core.view.c
    public void b(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // androidx.core.view.c
    public androidx.core.view.f build() {
        return new androidx.core.view.f(new i(((ContentInfo.Builder) this.b).build()));
    }

    @Override // androidx.core.view.e
    public int c() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // androidx.core.view.e
    public ClipData d() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // androidx.core.view.e
    public int e() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // androidx.core.view.e
    public ContentInfo f() {
        return (ContentInfo) this.b;
    }

    public void g(u uVar, r rVar, kotlin.coroutines.i iVar, Consumer consumer) {
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new j[16]);
        coil3.network.g.C(rVar.a(), 0, new h(1, 8, androidx.compose.runtime.collection.b.class, bVar, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(bVar.e, 0, bVar.z, new y(new l[]{b.A, b.B}, 3));
        int i = bVar.z;
        j jVar = (j) (i == 0 ? null : bVar.e[i - 1]);
        if (jVar == null) {
            return;
        }
        k kVar = jVar.c;
        d dVar = new d(jVar.a, kVar, CoroutineScopeKt.CoroutineScope(iVar), this, uVar);
        d1 d1Var = jVar.d;
        androidx.compose.ui.geometry.c cVarS = a0.g(d1Var).s(d1Var, true);
        long j = (((long) kVar.a) << 32) | (((long) kVar.b) & 4294967295L);
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(uVar, androidx.compose.ui.graphics.a0.w(androidx.room.r.u(cVarS)), new Point((int) (j >> 32), (int) (j & 4294967295L)), dVar);
        scrollCaptureTarget.setScrollBounds(androidx.compose.ui.graphics.a0.w(kVar));
        consumer.accept(scrollCaptureTarget);
    }

    public void h(LogSessionId logSessionId) {
        com.google.android.material.motion.a.q(((LogSessionId) this.b).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.b = logSessionId;
    }

    @Override // androidx.core.view.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public i(ContentInfo contentInfo) {
        this.a = 2;
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public i(ClipData clipData, int i) {
        this.a = 1;
        this.b = androidx.core.graphics.e.b(clipData, i);
    }
}
