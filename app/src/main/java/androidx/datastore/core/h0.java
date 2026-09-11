package androidx.datastore.core;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.c {
    public File e;
    public /* synthetic */ Object y;
    public int z;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.z |= Integer.MIN_VALUE;
        return _COROUTINE.a.g(null, null, this);
    }
}
