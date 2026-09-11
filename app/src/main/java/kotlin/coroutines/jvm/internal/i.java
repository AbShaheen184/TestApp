package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c implements kotlin.jvm.internal.h {
    private final int arity;

    public i(int i, kotlin.coroutines.d dVar) {
        super(dVar);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        a0.a.getClass();
        return b0.a(this);
    }
}
