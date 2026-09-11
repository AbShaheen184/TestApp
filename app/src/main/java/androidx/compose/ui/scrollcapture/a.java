package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.unit.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ d C;
    public int D;
    public Object e;
    public k y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.C = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return d.a(this.C, null, null, this);
    }
}
