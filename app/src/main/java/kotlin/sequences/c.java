package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h, d {
    public final h a;
    public final int b;

    public c(h hVar, int i) {
        hVar.getClass();
        this.a = hVar;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // kotlin.sequences.d
    public final h a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new c(this, i) : new c(this.a, i2);
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        return new y(this);
    }

    @Override // kotlin.sequences.d
    public final h take() {
        int i = this.b;
        int i2 = i + 5;
        return i2 < 0 ? new m(this) : new l(this.a, i, i2);
    }
}
