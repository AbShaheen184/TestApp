package androidx.compose.runtime;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.a3;
import java.io.Serializable;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(coil3.intercept.f fVar, coil3.request.g gVar, Object obj, coil3.request.n nVar, coil3.f fVar2, coil3.memory.a aVar, coil3.intercept.i iVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 3;
        this.B = fVar;
        this.C = gVar;
        this.z = obj;
        this.A = nVar;
        this.D = fVar2;
        this.E = aVar;
        this.F = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                q2 q2Var = new q2((kotlin.jvm.functions.a) this.F, dVar);
                q2Var.E = obj;
                return q2Var;
            case 1:
                q2 q2Var2 = new q2((ContentResolver) this.C, (Uri) this.D, (a3) this.E, (Channel) this.A, (Context) this.F, dVar);
                q2Var2.z = obj;
                return q2Var2;
            case 2:
                return new q2((coil3.intercept.f) this.B, (kotlin.jvm.internal.z) this.C, (kotlin.jvm.internal.z) this.A, (coil3.request.g) this.D, this.z, (kotlin.jvm.internal.z) this.E, (coil3.f) this.F, dVar, 2);
            case 3:
                return new q2((coil3.intercept.f) this.B, (coil3.request.g) this.C, this.z, (coil3.request.n) this.A, (coil3.f) this.D, (coil3.memory.a) this.E, (coil3.intercept.i) this.F, dVar);
            default:
                return new q2((com.app.mlounge.ui.viewmodel.a0) this.B, (String) this.C, (String) this.A, (String) this.D, (String) this.z, (String) this.E, (com.app.mlounge.ui.screens.livetv.h) this.F, dVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.e) {
            case 0:
                ((q2) create((FlowCollector) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 1:
                return ((q2) create((FlowCollector) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((q2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((q2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((q2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:194:0x0414 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0416 A[Catch: all -> 0x047a, LOOP:1: B:179:0x03ce->B:195:0x0416, LOOP_END, TryCatch #14 {all -> 0x047a, blocks: (B:187:0x03ff, B:203:0x042b, B:206:0x043a, B:210:0x0454, B:212:0x045d, B:191:0x040a, B:195:0x0416), top: B:263:0x03ff }] */
    /* JADX WARN: Code duplicated, block: B:269:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x02c3 -> B:118:0x0252). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x0475 -> B:218:0x0476). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.q2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(ContentResolver contentResolver, Uri uri, a3 a3Var, Channel channel, Context context, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 1;
        this.C = contentResolver;
        this.D = uri;
        this.E = a3Var;
        this.A = channel;
        this.F = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(Object obj, Serializable serializable, Serializable serializable2, Object obj2, Object obj3, Serializable serializable3, Object obj4, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
        this.C = serializable;
        this.A = serializable2;
        this.D = obj2;
        this.z = obj3;
        this.E = serializable3;
        this.F = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(kotlin.jvm.functions.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 0;
        this.F = aVar;
    }
}
