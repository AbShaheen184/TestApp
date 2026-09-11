package androidx.compose.foundation;

import androidx.compose.foundation.gestures.l2;
import androidx.compose.foundation.gestures.m2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, long j, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
        this.z = j;
        this.C = obj2;
        this.A = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new d((j) this.C, this.z, (androidx.compose.foundation.interaction.k) this.A, dVar, 0);
            case 1:
                return new d((Job) this.C, this.z, (androidx.compose.foundation.interaction.k) this.A, dVar, 1);
            case 2:
                d dVar2 = new d((m2) this.C, this.z, (kotlin.jvm.internal.w) this.A, dVar, 2);
                dVar2.B = obj;
                return dVar2;
            case 3:
                return new d((androidx.compose.runtime.y0) this.C, this.z, (androidx.compose.foundation.interaction.k) this.A, dVar, 3);
            case 4:
                return new d((androidx.compose.foundation.text.contextmenu.modifier.g) this.B, this.z, (androidx.compose.foundation.text.contextmenu.provider.f) this.C, (androidx.compose.foundation.text.contextmenu.modifier.f) this.A, dVar, 4);
            default:
                return new d((String) this.B, this.z, (com.app.mlounge.ui.screens.player.z0) this.C, (com.app.mlounge.ui.screens.player.b1) this.A, dVar, 5);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((d) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((d) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((d) create((l2) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((d) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((d) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((d) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r13) == r3) goto L10;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, long j, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.C = obj;
        this.z = j;
        this.A = obj2;
    }
}
