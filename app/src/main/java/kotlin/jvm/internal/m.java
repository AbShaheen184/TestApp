package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements h, Serializable {
    public final int e;

    public m(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.e;
    }

    public final String toString() {
        a0.a.getClass();
        return b0.a(this);
    }
}
