package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {
    public final h a;
    public final boolean b;
    public final kotlin.jvm.functions.l c;

    public g(h hVar, boolean z, kotlin.jvm.functions.l lVar) {
        this.a = hVar;
        this.b = z;
        this.c = lVar;
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        return new f(this);
    }
}
