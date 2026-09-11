package androidx.navigation.compose;

import androidx.compose.animation.core.h1;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements kotlin.jvm.functions.r {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ Object z;

    public t(h1 h1Var, androidx.navigation.i iVar, androidx.compose.runtime.saveable.e eVar, y0 y0Var, t2 t2Var) {
        this.z = h1Var;
        this.A = iVar;
        this.B = eVar;
        this.y = y0Var;
        this.C = t2Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v14 java.lang.Object, still in use, count: 2, list:
          (r0v14 java.lang.Object) from 0x0186: PHI (r0 I:??) = (r0v12 java.lang.Object), (r0v14 java.lang.Object) binds: [B:63:0x0185, B:73:0x0186] A[DONT_GENERATE, DONT_INLINE]
          (r0v14 java.lang.Object) from 0x017c: CHECK_CAST (androidx.navigation.i) (r0v14 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.r
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.t.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public t(List list, com.app.mlounge.ui.viewmodel.p pVar, y0 y0Var, kotlin.jvm.functions.s sVar, y yVar) {
        this.z = list;
        this.A = pVar;
        this.y = y0Var;
        this.B = sVar;
        this.C = yVar;
    }
}
