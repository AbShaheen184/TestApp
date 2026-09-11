package androidx.compose.foundation.text;

import android.content.Context;
import androidx.compose.runtime.t2;
import com.appsalt.internal.c2;
import com.appsalt.internal.c3;
import com.appsalt.internal.g5;
import com.appsalt.internal.n4;
import com.appsalt.internal.w4;
import java.io.File;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                u0 u0Var = new u0((androidx.compose.ui.input.pointer.y) this.z, (x0) this.A, dVar, 0);
                u0Var.y = obj;
                return u0Var;
            case 1:
                return new u0((androidx.compose.runtime.y0) this.y, (androidx.navigation.compose.o) this.z, (androidx.compose.runtime.snapshots.q) this.A, dVar, 1);
            case 2:
                return new u0((com.app.mlounge.data.music.c) this.y, (String) this.z, (String) this.A, dVar, 2);
            case 3:
                u0 u0Var2 = new u0((String) this.z, (com.app.mlounge.data.remote.ntv.l) this.A, dVar, 3);
                u0Var2.y = obj;
                return u0Var2;
            case 4:
                return new u0((com.app.mlounge.ui.viewmodel.c) this.y, (androidx.compose.runtime.y0) this.z, (t2) this.A, dVar, 4);
            case 5:
                return new u0((String) this.y, (Context) this.z, (androidx.activity.compose.t) this.A, dVar, 5);
            case 6:
                return new u0((androidx.compose.runtime.y0) this.y, (Context) this.z, (kotlin.jvm.functions.a) this.A, dVar, 6);
            case 7:
                return new u0((androidx.compose.ui.focus.y) this.y, (androidx.compose.ui.focus.y) this.z, (androidx.compose.runtime.y0) this.A, dVar, 7);
            case 8:
                return new u0((okhttp3.j0) this.y, (File) this.z, (com.app.mlounge.ui.viewmodel.s) this.A, dVar, 8);
            case 9:
                return new u0((String) this.y, (JSONObject) this.z, (com.app.mlounge.ui.viewmodel.k1) this.A, dVar, 9);
            case 10:
                return new u0((c3) this.y, (com.appsalt.internal.y0) this.z, (w4) this.A, dVar, 10);
            case 11:
                u0 u0Var3 = new u0((g5) this.z, (n4) this.A, dVar, 11);
                u0Var3.y = obj;
                return u0Var3;
            case 12:
                u0 u0Var4 = new u0((androidx.compose.runtime.internal.c) this.z, (String) this.A, dVar, 12);
                u0Var4.y = obj;
                return u0Var4;
            default:
                u0 u0Var5 = new u0((androidx.datastore.preferences.core.d) this.z, (Long) this.A, dVar, 13);
                u0Var5.y = obj;
                return u0Var5;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.e) {
            case 0:
                return ((u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                u0 u0Var = (u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar = kotlin.y.a;
                u0Var.invokeSuspend(yVar);
                return yVar;
            case 2:
                return ((u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                u0 u0Var2 = (u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar2 = kotlin.y.a;
                u0Var2.invokeSuspend(yVar2);
                return yVar2;
            case 5:
                u0 u0Var3 = (u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar3 = kotlin.y.a;
                u0Var3.invokeSuspend(yVar3);
                return yVar3;
            case 6:
                u0 u0Var4 = (u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar4 = kotlin.y.a;
                u0Var4.invokeSuspend(yVar4);
                return yVar4;
            case 7:
                u0 u0Var5 = (u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar5 = kotlin.y.a;
                u0Var5.invokeSuspend(yVar5);
                return yVar5;
            case 8:
                u0 u0Var6 = (u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar6 = kotlin.y.a;
                u0Var6.invokeSuspend(yVar6);
                return yVar6;
            case 9:
                u0 u0Var7 = (u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar7 = kotlin.y.a;
                u0Var7.invokeSuspend(yVar7);
                return yVar7;
            case 10:
                u0 u0Var8 = (u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar8 = kotlin.y.a;
                u0Var8.invokeSuspend(yVar8);
                return yVar8;
            case 11:
                u0 u0Var9 = (u0) create((c2) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar9 = kotlin.y.a;
                u0Var9.invokeSuspend(yVar9);
                return yVar9;
            case 12:
                return ((u0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                u0 u0Var10 = (u0) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar10 = kotlin.y.a;
                u0Var10.invokeSuspend(yVar10);
                return yVar10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x0319  */
    /* JADX WARN: Code duplicated, block: B:133:0x0346  */
    /* JADX WARN: Code duplicated, block: B:135:0x0356  */
    /* JADX WARN: Code duplicated, block: B:136:0x0359  */
    /* JADX WARN: Code duplicated, block: B:137:0x035c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v11 java.lang.Object, still in use, count: 2, list:
          (r4v11 java.lang.Object) from 0x02e9: PHI (r4 I:??) = (r4v3 java.lang.Object), (r4v11 java.lang.Object) binds: [B:121:0x02e8, B:174:0x02e9] A[DONT_GENERATE, DONT_INLINE]
          (r4v11 java.lang.Object) from 0x02db: CHECK_CAST (okhttp3.m) (r4v11 java.lang.Object)
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
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
    }
}
