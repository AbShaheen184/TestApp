package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.c {
    public String A;
    public /* synthetic */ Object B;
    public final /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l C;
    public int D;
    public kotlin.b e;
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l y;
    public LinkedHashMap z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
        this.C = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l.a(this.C, null, this);
    }
}
