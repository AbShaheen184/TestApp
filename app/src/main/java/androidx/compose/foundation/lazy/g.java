package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.compose.foundation.lazy.layout.q {
    public final z a;

    public g(z zVar) {
        this.a = zVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final int a() {
        return this.a.i().n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final int b() {
        return Math.min(a() - 1, ((u) kotlin.collections.o.S(this.a.i().k)).a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final int c() {
        int i;
        z zVar = this.a;
        int size = 0;
        if (zVar.i().k.isEmpty()) {
            return 0;
        }
        t tVarI = zVar.i();
        int iG = (int) (tVarI.o == k1.e ? tVarI.g() & 4294967295L : tVarI.g() >> 32);
        t tVarI2 = zVar.i();
        ?? r3 = tVarI2.k;
        if (!r3.isEmpty()) {
            int size2 = r3.size();
            int i2 = 0;
            while (size < size2) {
                i2 += ((u) r3.get(size)).m;
                size++;
            }
            size = (i2 / r3.size()) + tVarI2.q;
        }
        if (size != 0 && (i = iG / size) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final boolean d() {
        return !this.a.i().k.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final int e() {
        return Math.max(0, this.a.g());
    }
}
