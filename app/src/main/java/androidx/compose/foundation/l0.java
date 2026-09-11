package androidx.compose.foundation;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements FlowCollector {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.emit(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r1.emit(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(int[] r14, kotlin.coroutines.d r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.A
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.z
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r2 = r13.y
            kotlin.jvm.internal.z r2 = (kotlin.jvm.internal.z) r2
            boolean r3 = r15 instanceof androidx.room.b0
            if (r3 == 0) goto L1f
            r3 = r15
            androidx.room.b0 r3 = (androidx.room.b0) r3
            int r4 = r3.A
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.A = r4
            goto L24
        L1f:
            androidx.room.b0 r3 = new androidx.room.b0
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.y
            int r4 = r3.A
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 == r6) goto L38
            if (r4 != r5) goto L31
            goto L38
        L31:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r14)
            r14 = 0
            return r14
        L38:
            int[] r14 = r3.e
            kotlin.a.e(r15)
            goto L99
        L3e:
            kotlin.a.e(r15)
            java.lang.Object r15 = r2.e
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r15 != 0) goto L56
            java.util.Set r15 = kotlin.collections.n.W(r0)
            r3.e = r14
            r3.A = r6
            java.lang.Object r15 = r1.emit(r15, r3)
            if (r15 != r4) goto L99
            goto L98
        L56:
            java.lang.Object r15 = r13.B
            int[] r15 = (int[]) r15
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r7) goto L84
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.e
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r15[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r6.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r14 = "Required value was null."
            net.luminis.tls.engine.impl.c.r(r14)
            r14 = 0
            return r14
        L84:
            boolean r15 = r6.isEmpty()
            if (r15 != 0) goto L99
            java.util.Set r15 = kotlin.collections.o.o0(r6)
            r3.e = r14
            r3.A = r5
            java.lang.Object r15 = r1.emit(r15, r3)
            if (r15 != r4) goto L99
        L98:
            return r4
        L99:
            r2.e = r14
            kotlin.y r14 = kotlin.y.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.l0.a(int[], kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.A;
                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) this.z;
                kotlin.jvm.internal.x xVar3 = (kotlin.jvm.internal.x) this.y;
                boolean z = true;
                if (jVar instanceof androidx.compose.foundation.interaction.m) {
                    xVar3.e++;
                } else if ((jVar instanceof androidx.compose.foundation.interaction.n) || (jVar instanceof androidx.compose.foundation.interaction.l)) {
                    xVar3.e--;
                } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                    xVar2.e++;
                } else if (jVar instanceof androidx.compose.foundation.interaction.i) {
                    xVar2.e--;
                } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                    xVar.e++;
                } else if (jVar instanceof androidx.compose.foundation.interaction.e) {
                    xVar.e--;
                }
                int i = xVar3.e;
                boolean z2 = false;
                boolean z3 = i > 0;
                boolean z4 = xVar2.e > 0;
                boolean z5 = xVar.e > 0;
                m0 m0Var = (m0) this.B;
                if (m0Var.M != z3) {
                    m0Var.M = z3;
                    z2 = true;
                }
                if (m0Var.N != z4) {
                    m0Var.N = z4;
                    z2 = true;
                }
                if (m0Var.O != z5) {
                    m0Var.O = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    androidx.compose.ui.node.k.j(m0Var);
                }
                return kotlin.y.a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.foundation.text.selection.c1 c1Var = (androidx.compose.foundation.text.selection.c1) this.A;
                androidx.compose.foundation.text.r0 r0Var = (androidx.compose.foundation.text.r0) this.y;
                if (zBooleanValue && r0Var.b()) {
                    androidx.compose.foundation.text.n0.s((androidx.compose.ui.text.input.y) this.z, r0Var, c1Var.n(), (androidx.compose.ui.text.input.k) this.B, c1Var.b);
                } else {
                    androidx.compose.foundation.text.n0.k(r0Var);
                }
                return kotlin.y.a;
            default:
                return a((int[]) obj, dVar);
        }
    }
}
