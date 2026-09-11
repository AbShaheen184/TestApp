package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.lazy.layout.c0;
import androidx.compose.foundation.lazy.layout.d0;
import androidx.compose.foundation.lazy.layout.f0;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.m1;
import androidx.compose.ui.layout.r0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements c0 {
    public final /* synthetic */ x a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ kotlin.jvm.functions.a c;
    public final /* synthetic */ c d;
    public final /* synthetic */ androidx.compose.foundation.layout.g e;
    public final /* synthetic */ CoroutineScope f;
    public final /* synthetic */ f0 g;

    public m(x xVar, m0 m0Var, kotlin.reflect.h hVar, c cVar, androidx.compose.foundation.layout.g gVar, androidx.compose.foundation.layout.e eVar, CoroutineScope coroutineScope, androidx.compose.ui.graphics.y yVar, f0 f0Var) {
        this.a = xVar;
        this.b = m0Var;
        this.c = hVar;
        this.d = cVar;
        this.e = gVar;
        this.f = coroutineScope;
        this.g = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x034f  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:151:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:152:0x0400  */
    /* JADX WARN: Code duplicated, block: B:154:0x0407  */
    /* JADX WARN: Code duplicated, block: B:155:0x040a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0418  */
    /* JADX WARN: Code duplicated, block: B:161:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x045a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0472  */
    /* JADX WARN: Code duplicated, block: B:171:0x0475  */
    /* JADX WARN: Code duplicated, block: B:173:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x050a  */
    /* JADX WARN: Code duplicated, block: B:214:0x052a  */
    /* JADX WARN: Code duplicated, block: B:217:0x0534  */
    /* JADX WARN: Code duplicated, block: B:218:0x0537  */
    /* JADX WARN: Code duplicated, block: B:221:0x0540  */
    /* JADX WARN: Code duplicated, block: B:223:0x054e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:243:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:244:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:246:0x05ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:251:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:253:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x060d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0617  */
    /* JADX WARN: Code duplicated, block: B:265:0x061a  */
    /* JADX WARN: Code duplicated, block: B:267:0x061d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:272:0x062d A[LOOP:12: B:271:0x062b->B:272:0x062d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x0641  */
    /* JADX WARN: Code duplicated, block: B:277:0x0647  */
    /* JADX WARN: Code duplicated, block: B:280:0x064e  */
    /* JADX WARN: Code duplicated, block: B:283:0x065c A[LOOP:13: B:282:0x065a->B:283:0x065c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x066d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0680 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x0682 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:300:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:302:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:306:0x06e8 A[LOOP:17: B:303:0x06cf->B:306:0x06e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:309:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:311:0x0709 A[LOOP:19: B:310:0x0707->B:311:0x0709, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:315:0x0722 A[LOOP:20: B:314:0x0720->B:315:0x0722, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x0751  */
    /* JADX WARN: Code duplicated, block: B:320:0x0756  */
    /* JADX WARN: Code duplicated, block: B:322:0x076c  */
    /* JADX WARN: Code duplicated, block: B:324:0x0773 A[LOOP:16: B:323:0x0771->B:324:0x0773, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:328:0x07ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:331:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:378:0x06ec A[EDGE_INSN: B:378:0x06ec->B:307:0x06ec BREAK  A[LOOP:17: B:303:0x06cf->B:306:0x06e8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x05fc A[ADDED_TO_REGION, EDGE_INSN: B:383:0x05fc->B:257:0x05fc BREAK  A[LOOP:21: B:250:0x05db->B:256:0x05f1], REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.foundation.lazy.layout.c0
    public final r0 a(d0 d0Var, long j) throws Throwable {
        androidx.compose.foundation.text.input.internal.o oVar;
        int iG;
        int iD;
        x xVar;
        boolean z;
        int i;
        int i2;
        float f;
        int i3;
        p pVar;
        int i4;
        int i5;
        int size;
        ArrayList arrayList;
        int i6;
        k kVar;
        List list;
        int i7;
        p pVar2;
        ArrayList arrayList2;
        List list2;
        int size2;
        int i8;
        int i9;
        List list3;
        int iB;
        int i10;
        int i11;
        int i12;
        p pVar3;
        int iH;
        int iF;
        List listX;
        boolean z2;
        int size3;
        int i13;
        int length;
        ArrayList arrayList3;
        d0 d0Var2;
        int i14;
        int size4;
        int size5;
        int i15;
        int i16;
        int size6;
        int i17;
        o[] oVarArrA;
        int length2;
        int i18;
        int i19;
        int i20;
        List list4;
        int i21;
        boolean z3;
        n nVar;
        int iF2;
        int size7;
        int i22;
        int size8;
        int[] iArr;
        int i23;
        int[] iArr2;
        int i24;
        int iIntValue;
        List list5;
        int i25;
        k kVar2;
        o oVar2;
        int iIntValue2;
        k kVar3;
        u uVar;
        o[] oVarArr;
        o oVar3;
        boolean zA = androidx.compose.ui.unit.l.a(0L, 0L);
        m1 m1Var = d0Var.y;
        x xVar2 = this.a;
        y0 y0Var = xVar2.s;
        androidx.compose.foundation.lazy.v vVar = xVar2.d;
        y0Var.getValue();
        boolean z4 = xVar2.b || m1Var.U();
        k1 k1Var = k1.e;
        androidx.compose.foundation.s.h(j, k1Var);
        androidx.compose.ui.unit.m layoutDirection = m1Var.getLayoutDirection();
        m0 m0Var = this.b;
        int iG0 = m1Var.g0(m0Var.a(layoutDirection));
        int iG1 = m1Var.g0(m0Var.b(m1Var.getLayoutDirection()));
        int iG2 = m1Var.g0(m0Var.b);
        int iG3 = m1Var.g0(m0Var.d) + iG2;
        int i26 = iG1 + iG0;
        int i27 = iG3 - iG2;
        long jI = androidx.compose.ui.unit.b.i(-i26, -iG3, j);
        i iVar = (i) this.c.invoke();
        u uVar2 = iVar.b.b;
        c cVar = this.d;
        if (cVar.d != null && androidx.compose.ui.unit.a.b(cVar.b, jI) && cVar.c == m1Var.a()) {
            oVar = cVar.d;
            oVar.getClass();
        } else {
            cVar.b = jI;
            cVar.c = m1Var.a();
            androidx.compose.foundation.text.input.internal.o oVar4 = (androidx.compose.foundation.text.input.internal.o) cVar.a.invoke(d0Var, new androidx.compose.ui.unit.a(jI));
            cVar.d = oVar4;
            oVar = oVar4;
        }
        int length3 = ((int[]) oVar.y).length;
        if (length3 != uVar2.f) {
            uVar2.f = length3;
            ArrayList arrayList4 = uVar2.a;
            arrayList4.clear();
            arrayList4.add(new r(0, 0));
            uVar2.b = 0;
            uVar2.c = 0;
            uVar2.d = 0;
            uVar2.e = -1;
            ((ArrayList) uVar2.h).clear();
        }
        androidx.compose.foundation.layout.g gVar = this.e;
        if (gVar == null) {
            androidx.compose.foundation.internal.b.b("null verticalArrangement when isVertical == true");
            com.google.gson.b.b();
            return null;
        }
        int iG4 = m1Var.g0(gVar.a());
        int iA = iVar.a();
        int iG5 = androidx.compose.ui.unit.a.g(j) - iG3;
        m1 m1Var2 = m1Var;
        k kVar4 = new k(iVar, d0Var, iG4, this.a, iG2, i27, (((long) iG0) << 32) | (((long) iG2) & 4294967295L));
        l lVar = new l(oVar, iA, iG4, kVar4, uVar2);
        int i28 = iA;
        u uVar3 = (u) lVar.f;
        androidx.activity.compose.h hVar = new androidx.activity.compose.h(15, uVar2, lVar);
        androidx.activity.compose.g gVar2 = new androidx.activity.compose.g(uVar2, 10);
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        ArrayList arrayList5 = null;
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        u uVar4 = uVar3;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            int iG6 = xVar2.g();
            int i29 = androidx.compose.foundation.lazy.layout.m.i(iVar, vVar.e, iG6);
            if (iG6 != i29) {
                vVar.b.h(i29);
                vVar.f.b(iG6);
            }
            if (i29 < i28 || i28 <= 0) {
                int iD2 = uVar2.d(i29);
                iG = vVar.c.g();
                iD = iD2;
            } else {
                iD = uVar2.d(i28 - 1);
                iG = 0;
            }
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            List listG = androidx.compose.foundation.lazy.layout.m.g(iVar, xVar2.q, xVar2.n);
            float fFloatValue = (m1Var2.U() || !z4) ? xVar2.g : ((Number) xVar2.v.b.y.getValue()).floatValue();
            androidx.compose.foundation.lazy.layout.v vVar2 = xVar2.m;
            boolean zU = m1Var2.U();
            n nVar2 = xVar2.c;
            y0 y0Var2 = xVar2.r;
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v5 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2074
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.m.a(androidx.compose.foundation.lazy.layout.d0, long):androidx.compose.ui.layout.r0");
        }
    }
