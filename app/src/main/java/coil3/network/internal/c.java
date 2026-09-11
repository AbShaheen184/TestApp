package coil3.network.internal;

import coil3.network.r;
import okio.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public r e;
    public f y;
    public /* synthetic */ Object z;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.A |= Integer.MIN_VALUE;
        return androidx.room.r.s(null, this);
    }
}
