package androidx.compose.foundation.text.handwriting;

import androidx.appcompat.widget.x;
import androidx.compose.foundation.text.selection.q0;
import androidx.compose.foundation.text.x0;
import androidx.compose.ui.input.pointer.k0;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements p {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 1;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x xVar, q0 q0Var, x0 x0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = xVar;
        this.B = q0Var;
        this.C = x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                c cVar = new c((d) this.C, dVar);
                cVar.z = obj;
                return cVar;
            default:
                c cVar2 = new c((x) this.A, (q0) this.B, (x0) this.C, dVar);
                cVar2.z = obj;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((c) create(k0Var, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:105:0x0207  */
    /* JADX WARN: Code duplicated, block: B:198:0x0352  */
    /* JADX WARN: Code duplicated, block: B:208:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01de A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0141 A[PHI: r9
  0x0141: PHI (r9v1 kotlin.coroutines.intrinsics.a) = (r9v0 kotlin.coroutines.intrinsics.a), (r9v2 kotlin.coroutines.intrinsics.a) binds: [B:59:0x013f, B:84:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4 A[PHI: r2 r9 r10 r11 r12
  0x01b4: PHI (r2v6 androidx.compose.ui.input.pointer.n) = (r2v5 androidx.compose.ui.input.pointer.n), (r2v28 androidx.compose.ui.input.pointer.n) binds: [B:84:0x01b1, B:56:0x0113] A[DONT_GENERATE, DONT_INLINE]
  0x01b4: PHI (r9v3 kotlin.coroutines.intrinsics.a) = (r9v2 kotlin.coroutines.intrinsics.a), (r9v0 kotlin.coroutines.intrinsics.a) binds: [B:84:0x01b1, B:56:0x0113] A[DONT_GENERATE, DONT_INLINE]
  0x01b4: PHI (r10v4 androidx.compose.ui.input.pointer.v) = (r10v3 androidx.compose.ui.input.pointer.v), (r10v11 androidx.compose.ui.input.pointer.v) binds: [B:84:0x01b1, B:56:0x0113] A[DONT_GENERATE, DONT_INLINE]
  0x01b4: PHI (r11v20 androidx.compose.ui.input.pointer.k0) = (r11v19 androidx.compose.ui.input.pointer.k0), (r11v25 androidx.compose.ui.input.pointer.k0) binds: [B:84:0x01b1, B:56:0x0113] A[DONT_GENERATE, DONT_INLINE]
  0x01b4: PHI (r12v3 java.lang.Object) = (r12v2 java.lang.Object), (r12v16 java.lang.Object) binds: [B:84:0x01b1, B:56:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x0318 -> B:183:0x031c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01b1 -> B:86:0x01b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.C = dVar;
    }
}
