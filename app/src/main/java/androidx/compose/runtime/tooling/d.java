package androidx.compose.runtime.tooling;

import androidx.compose.runtime.changelist.k0;
import androidx.compose.runtime.r;
import com.google.android.gms.common.internal.k;
import java.util.List;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k0, kotlin.coroutines.g {
    public static final k y = new k(2);
    public final r e;

    public d(r rVar) {
        this.e = rVar;
    }

    @Override // kotlin.coroutines.i
    public final /* bridge */ Object fold(Object obj, p pVar) {
        return com.google.android.material.resources.g.d(this, obj, pVar);
    }

    @Override // kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.g get(kotlin.coroutines.h hVar) {
        return com.google.android.material.resources.g.f(this, hVar);
    }

    @Override // kotlin.coroutines.g
    public final kotlin.coroutines.h getKey() {
        return y;
    }

    @Override // androidx.compose.runtime.changelist.k0
    public final List h(Integer num) {
        return this.e.J();
    }

    @Override // kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.i minusKey(kotlin.coroutines.h hVar) {
        return com.google.android.material.resources.g.h(this, hVar);
    }

    @Override // kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.i plus(kotlin.coroutines.i iVar) {
        return com.google.android.material.resources.g.k(iVar, this);
    }
}
