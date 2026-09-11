package org.jsoup.parser;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum x extends b0 {
    public x() {
        super("InBody", 6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:345:0x0562  */
    /* JADX WARN: Code duplicated, block: B:710:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:742:0x0b5f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v6 org.jsoup.nodes.j, still in use, count: 2, list:
          (r12v6 org.jsoup.nodes.j) from 0x022e: INVOKE (r12v6 org.jsoup.nodes.j) STATIC call: org.jsoup.parser.b.P(org.jsoup.nodes.j):boolean A[MD:(org.jsoup.nodes.j):boolean (m), WRAPPED] (LINE:559)
          (r12v6 org.jsoup.nodes.j) from 0x0236: PHI (r12 I:??) = (r12v2 org.jsoup.nodes.j), (r12v6 org.jsoup.nodes.j) binds: [B:151:0x0235, B:834:0x0236] A[DONT_GENERATE, DONT_INLINE]
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
    @Override // org.jsoup.parser.b0
    public final boolean f(org.jsoup.parser.r0 r31, org.jsoup.parser.b r32) {
        /*
            Method dump skipped, instruction units count: 3720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.x.f(org.jsoup.parser.r0, org.jsoup.parser.b):boolean");
    }

    public final boolean g(r0 r0Var, b bVar) {
        r0Var.getClass();
        String str = ((m0) r0Var).e;
        ArrayList arrayList = bVar.e;
        if (bVar.C(str) == null) {
            bVar.z(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) arrayList.get(size);
            if (jVar.s(str)) {
                bVar.A(str);
                if (!bVar.c(str)) {
                    bVar.z(this);
                }
                bVar.T(str);
                return true;
            }
            if (b.P(jVar)) {
                bVar.z(this);
                return false;
            }
        }
        return true;
    }
}
