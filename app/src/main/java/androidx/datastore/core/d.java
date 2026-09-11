package androidx.datastore.core;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Serializable e;
    public Iterator y;
    public /* synthetic */ Object z;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.A |= Integer.MIN_VALUE;
        return kotlin.math.a.c(null, null, this);
    }
}
