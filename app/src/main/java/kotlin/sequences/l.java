package kotlin.sequences;

import androidx.collection.m0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements h, d {
    public final h a;
    public final int b;
    public final int c;

    public l(h hVar, int i, int i2) {
        hVar.getClass();
        this.a = hVar;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("endIndex should be not less than startIndex, but was ", i2, " < ", i));
        throw null;
    }

    @Override // kotlin.sequences.d
    public final h a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? e.a : new l(this.a, i3 + i, i2);
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        return new m0(this);
    }

    @Override // kotlin.sequences.d
    public final h take() {
        int i = this.c;
        int i2 = this.b;
        if (5 >= i - i2) {
            return this;
        }
        return new l(this.a, i2, i2 + 5);
    }
}
