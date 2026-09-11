package com.app.mlounge;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity y;
    public final /* synthetic */ SharedPreferences z;

    public /* synthetic */ l(MainActivity mainActivity, SharedPreferences sharedPreferences, int i) {
        this.e = i;
        this.y = mainActivity;
        this.z = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0203  */
    /* JADX WARN: Code duplicated, block: B:65:0x0220  */
    /* JADX WARN: Code duplicated, block: B:72:0x021b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v7 java.lang.Object, still in use, count: 2, list:
          (r7v7 java.lang.Object) from 0x01f1: PHI (r7 I:??) = (r7v2 java.lang.Object), (r7v7 java.lang.Object) binds: [B:52:0x01f0, B:70:0x01f1] A[DONT_GENERATE, DONT_INLINE]
          (r7v7 java.lang.Object) from 0x01dd: CHECK_CAST (com.app.mlounge.ui.theme.a) (r7v7 java.lang.Object)
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
    @Override // kotlin.jvm.functions.p
    public final java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.l.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
