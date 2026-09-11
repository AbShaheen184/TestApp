package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h, d {
    public final h a;

    public m(h hVar) {
        this.a = hVar;
    }

    @Override // kotlin.sequences.d
    public final h a(int i) {
        return i >= 5 ? e.a : new l(this.a, i, 5);
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        return new y(this);
    }

    @Override // kotlin.sequences.d
    public final h take() {
        return this;
    }
}
