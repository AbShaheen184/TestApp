package androidx.compose.animation.core;

import com.app.mlounge.data.remote.model.SportsMatch;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.app.mlounge.ui.viewmodel.a0 a0Var, SportsMatch sportsMatch, String str, String str2, String str3, kotlin.jvm.functions.q qVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 4;
        this.A = a0Var;
        this.z = sportsMatch;
        this.B = str;
        this.C = str2;
        this.D = str3;
        this.E = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                g gVar = new g((Channel) this.B, (d) this.C, (androidx.compose.runtime.y0) this.D, (androidx.compose.runtime.y0) this.E, dVar, 0);
                gVar.z = obj;
                return gVar;
            case 1:
                g gVar2 = new g((androidx.compose.ui.input.pointer.y) this.A, (kotlin.jvm.functions.q) this.B, (kotlin.jvm.functions.l) this.C, (kotlin.jvm.functions.l) this.D, (kotlin.jvm.functions.l) this.E, dVar);
                gVar2.z = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((List) this.D, (ArrayList) this.E, dVar);
                gVar3.C = obj;
                return gVar3;
            case 3:
                g gVar4 = new g((kotlin.jvm.internal.z) this.B, (coil3.network.n) this.C, (kotlin.jvm.internal.z) this.D, (coil3.network.p) this.E, dVar, 3);
                gVar4.z = obj;
                return gVar4;
            default:
                return new g((com.app.mlounge.ui.viewmodel.a0) this.A, (SportsMatch) this.z, (String) this.B, (String) this.C, (String) this.D, (kotlin.jvm.functions.q) this.E, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((g) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((g) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((g) create(obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((g) create((coil3.network.q) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((g) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02af -> B:104:0x028c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01f8 -> B:78:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0223 -> B:78:0x01d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.compose.ui.input.pointer.y yVar, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 1;
        this.A = yVar;
        this.B = qVar;
        this.C = lVar;
        this.D = lVar2;
        this.E = lVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, ArrayList arrayList, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 2;
        this.D = list;
        this.E = arrayList;
    }
}
