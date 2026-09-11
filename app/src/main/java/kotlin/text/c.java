package kotlin.text;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements kotlin.sequences.h {
    public final CharSequence a;
    public final int b;
    public final kotlin.jvm.functions.p c;

    public c(CharSequence charSequence, int i, kotlin.jvm.functions.p pVar) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = pVar;
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        return new b(this);
    }
}
