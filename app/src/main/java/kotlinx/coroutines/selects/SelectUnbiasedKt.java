package kotlinx.coroutines.selects;

import kotlin.coroutines.d;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectUnbiasedKt {
    public static final <R> Object selectUnbiased(l lVar, d<? super R> dVar) {
        UnbiasedSelectImplementation unbiasedSelectImplementation = new UnbiasedSelectImplementation(dVar.getContext());
        lVar.invoke(unbiasedSelectImplementation);
        return unbiasedSelectImplementation.doSelect(dVar);
    }

    private static final <R> Object selectUnbiased$$forInline(l lVar, d<? super R> dVar) {
        throw null;
    }
}
