package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements kotlin.sequences.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(kotlin.jvm.functions.p pVar) {
        this.a = 1;
        this.b = (kotlin.coroutines.jvm.internal.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.coroutines.jvm.internal.h, kotlin.jvm.functions.p] */
    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((Iterable) this.b).iterator();
            case 1:
                return com.google.android.material.resources.g.g((kotlin.coroutines.jvm.internal.h) this.b);
            case 2:
                return (Iterator) this.b;
            default:
                return new kotlin.text.e((CharSequence) this.b);
        }
    }

    public /* synthetic */ s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
