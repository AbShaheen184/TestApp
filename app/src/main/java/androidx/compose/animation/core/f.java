package androidx.compose.animation.core;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.GamePlatform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.google.firebase.sessions.settings.d dVar, Map map, com.app.mlounge.ui.viewmodel.w1 w1Var, androidx.compose.runtime.t1 t1Var, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.e = 22;
        this.B = dVar;
        this.z = map;
        this.A = w1Var;
        this.C = t1Var;
    }

    private final Object d(Object obj) {
        MutableStateFlow mutableStateFlow;
        com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.B;
        MutableStateFlow mutableStateFlow2 = cVar.u;
        int i = this.y;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                mutableStateFlow2.setValue(Boolean.TRUE);
                mutableStateFlow = cVar.s;
                com.app.mlounge.data.repository.r rVar = cVar.b;
                com.app.mlounge.data.repository.a aVar = (com.app.mlounge.data.repository.a) this.A;
                String str = (String) this.C;
                this.z = mutableStateFlow;
                this.y = 1;
                rVar.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.c(0, aVar, rVar, str, null), this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableStateFlow = (MutableStateFlow) this.z;
                kotlin.a.e(obj);
            }
            mutableStateFlow.setValue(obj);
        } catch (Exception e) {
            cVar.m.setValue(e.getMessage());
        } finally {
            mutableStateFlow2.setValue(Boolean.FALSE);
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14) == r13) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.f.e(java.lang.Object):java.lang.Object");
    }

    private final Object f(Object obj) {
        String str = (String) this.B;
        com.app.mlounge.ui.viewmodel.r1 r1Var = (com.app.mlounge.ui.viewmodel.r1) this.z;
        String str2 = r1Var.u;
        int i = this.y;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                Intent intent = new Intent("android.intent.action.VIEW");
                String str3 = (String) this.A;
                ChqStream chqStream = (ChqStream) this.C;
                intent.setDataAndType(Uri.parse(str3), "video/*");
                intent.setPackage(str);
                intent.addFlags(268435456);
                intent.putExtra("title", str2);
                intent.putExtra("name", str2);
                Map mapE = chqStream.e();
                if (mapE != null) {
                    Set<Map.Entry> setEntrySet = mapE.entrySet();
                    ArrayList arrayList = new ArrayList(kotlin.collections.p.y(setEntrySet, 10));
                    for (Map.Entry entry : setEntrySet) {
                        arrayList.add(entry.getKey() + ": " + entry.getValue());
                    }
                    intent.putExtra("headers", (String[]) arrayList.toArray(new String[0]));
                    intent.putExtra("com.dv.adm.extra.HEADERS", new HashMap(mapE));
                }
                r1Var.b.startActivity(intent);
                this.y = 1;
                Object objEmit = r1Var.y.emit("Opening in " + str + "...", this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objEmit == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Failed to launch external downloader: ", e.getMessage(), "SourcesViewModel");
            r1Var.n.setValue(new com.app.mlounge.ui.viewmodel.m("Could not open external downloader. Is it installed?", null, null, null, 61));
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r10.invoke(r1, r9) == r6) goto L29;
     */
    /* JADX WARN: Type inference failed for: r10v10, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.y r0 = kotlin.y.a
            java.lang.Object r1 = r9.A
            com.appsalt.internal.k0 r1 = (com.appsalt.internal.k0) r1
            int r2 = r9.y
            r3 = 0
            r4 = 2
            r5 = 1
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            if (r2 == 0) goto L2c
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1a
            java.lang.Object r0 = r9.z
            kotlin.a.e(r10)
            goto L80
        L1a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r10)
            r10 = 0
            return r10
        L21:
            java.lang.Object r0 = r9.B
            r1 = r0
            com.appsalt.internal.k0 r1 = (com.appsalt.internal.k0) r1
            java.lang.Object r0 = r9.z
            kotlin.a.e(r10)
            goto L6e
        L2c:
            kotlin.a.e(r10)
            java.lang.Object r10 = r9.z
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            java.lang.Object r10 = r9.C
            byte[] r10 = (byte[]) r10
            java.net.Socket r2 = r1.g     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L53
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L53
            com.appsalt.internal.o0 r7 = r1.b     // Catch: java.lang.Throwable -> L51
            int r8 = r10.length     // Catch: java.lang.Throwable -> L51
            com.appsalt.internal.g4 r7 = r7.a     // Catch: java.lang.Throwable -> L51
            r7.getClass()     // Catch: java.lang.Throwable -> L51
            r2.write(r10)     // Catch: java.lang.Throwable -> L51
            r2.flush()     // Catch: java.lang.Throwable -> L51
            r10 = r0
            goto L5b
        L51:
            r10 = move-exception
            goto L55
        L53:
            r10 = r3
            goto L5b
        L55:
            kotlin.l r2 = new kotlin.l
            r2.<init>(r10)
            r10 = r2
        L5b:
            java.lang.Throwable r2 = kotlin.m.a(r10)
            if (r2 == 0) goto L7f
            r9.z = r10
            r9.B = r1
            r9.y = r5
            r1.d(r2)
            if (r0 != r6) goto L6d
            goto L7e
        L6d:
            r0 = r10
        L6e:
            kotlin.coroutines.jvm.internal.i r10 = r1.f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r9.z = r0
            r9.B = r3
            r9.y = r4
            java.lang.Object r10 = r10.invoke(r1, r9)
            if (r10 != r6) goto L80
        L7e:
            return r6
        L7f:
            r0 = r10
        L80:
            kotlin.m r10 = new kotlin.m
            r10.<init>(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.f.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f(this.z, (d) this.B, (androidx.compose.runtime.y0) this.A, (androidx.compose.runtime.y0) this.C, dVar, 0);
            case 1:
                f fVar = new f((androidx.compose.runtime.y0) this.A, (k0) this.C, dVar, 1);
                fVar.z = obj;
                return fVar;
            case 2:
                f fVar2 = new f((kotlin.jvm.functions.l) this.B, (androidx.compose.foundation.text.input.internal.c) this.A, (androidx.compose.foundation.text.input.internal.q) this.C, dVar, 2);
                fVar2.z = obj;
                return fVar2;
            case 3:
                f fVar3 = new f((kotlin.jvm.functions.l) this.B, (AtomicReference) this.A, (kotlin.jvm.functions.p) this.C, dVar);
                fVar3.z = obj;
                return fVar3;
            case 4:
                return new f((androidx.compose.ui.scrollcapture.d) this.z, (ScrollCaptureSession) this.B, (Rect) this.A, (Consumer) this.C, dVar, 4);
            case 5:
                f fVar4 = new f((h1) this.B, (androidx.navigation.i) this.A, (e2) this.C, dVar, 5);
                fVar4.z = obj;
                return fVar4;
            case 6:
                f fVar5 = new f((androidx.room.q) this.B, (CancellableContinuationImpl) this.A, (androidx.activity.compose.p) this.C, dVar, 6);
                fVar5.z = obj;
                return fVar5;
            case 7:
                f fVar6 = new f((androidx.room.i0) this.B, (int[]) this.A, (String[]) this.C, dVar, 7);
                fVar6.z = obj;
                return fVar6;
            case 8:
                f fVar7 = new f((com.app.mlounge.data.providers.k0) this.B, (String) this.A, (Integer) this.C, dVar, 8);
                fVar7.z = obj;
                return fVar7;
            case 9:
                f fVar8 = new f((List) this.B, (String) this.A, (Integer) this.C, dVar, 9);
                fVar8.z = obj;
                return fVar8;
            case 10:
                return new f((com.app.mlounge.data.repository.r) this.B, (String) this.A, (Integer) this.C, dVar, 10);
            case 11:
                f fVar9 = new f((com.app.mlounge.data.repository.r) this.B, (String) this.A, (ProducerScope) this.C, dVar, 11);
                fVar9.z = obj;
                return fVar9;
            case 12:
                return new f((String) this.z, (kotlin.jvm.functions.a) this.B, (androidx.compose.runtime.y0) this.A, (androidx.compose.runtime.y0) this.C, dVar, 12);
            case 13:
                return new f((androidx.compose.foundation.lazy.grid.x) this.z, (com.app.mlounge.ui.viewmodel.s) this.B, (androidx.compose.runtime.t2) this.A, (androidx.compose.runtime.t2) this.C, dVar, 13);
            case 14:
                return new f((com.app.mlounge.ui.viewmodel.e0) this.z, (TmdbMovieDetailResponse) this.B, (kotlin.jvm.functions.p) this.A, (Context) this.C, dVar, 14);
            case 15:
                return new f((com.app.mlounge.ui.screens.player.z0) this.z, (Float) this.B, (Integer) this.A, (Integer) this.C, dVar, 15);
            case 16:
                return new f((com.app.mlounge.ui.viewmodel.c) this.B, (com.app.mlounge.data.repository.a) this.A, (String) this.C, dVar, 16);
            case 17:
                return new f((com.app.mlounge.ui.viewmodel.s) this.z, (GamePlatform) this.B, (String) this.A, (a) this.C, dVar, 17);
            case 18:
                return new f((com.app.mlounge.ui.viewmodel.h0) this.z, (String) this.B, (String) this.A, (String) this.C, dVar, 18);
            case 19:
                return new f((com.app.mlounge.ui.viewmodel.r1) this.z, (String) this.B, (String) this.A, (ChqStream) this.C, dVar, 19);
            case 20:
                f fVar10 = new f((com.appsalt.internal.k0) this.A, (byte[]) this.C, dVar, 20);
                fVar10.z = obj;
                return fVar10;
            case 21:
                return new f((com.appsalt.internal.f) this.z, (String) this.B, (com.appsalt.internal.a) this.A, (com.appsalt.internal.d1) this.C, dVar, 21);
            default:
                return new f((com.google.firebase.sessions.settings.d) this.B, (Map) this.z, (com.app.mlounge.ui.viewmodel.w1) this.A, (androidx.compose.runtime.t1) this.C, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 2:
                ((f) create((androidx.compose.ui.platform.o0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 3:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                ((f) create((FlowCollector) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 8:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 11:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 12:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 13:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 14:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 15:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 17:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 18:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 19:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 21:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:430:0x08cf A[PHI: r12 r13
  0x08cf: PHI (r12v2 kotlin.jvm.internal.w) = 
  (r12v0 kotlin.jvm.internal.w)
  (r12v1 kotlin.jvm.internal.w)
  (r12v1 kotlin.jvm.internal.w)
  (r12v4 kotlin.jvm.internal.w)
 binds: [B:429:0x08bd, B:436:0x0905, B:438:0x091f, B:426:0x089c] A[DONT_GENERATE, DONT_INLINE]
  0x08cf: PHI (r13v2 kotlinx.coroutines.CoroutineScope) = 
  (r13v0 kotlinx.coroutines.CoroutineScope)
  (r13v1 kotlinx.coroutines.CoroutineScope)
  (r13v1 kotlinx.coroutines.CoroutineScope)
  (r13v4 kotlinx.coroutines.CoroutineScope)
 binds: [B:429:0x08bd, B:436:0x0905, B:438:0x091f, B:426:0x089c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:432:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:435:0x0900 A[PHI: r12 r13
  0x0900: PHI (r12v1 kotlin.jvm.internal.w) = (r12v2 kotlin.jvm.internal.w), (r12v3 kotlin.jvm.internal.w) binds: [B:433:0x08fd, B:428:0x08af] A[DONT_GENERATE, DONT_INLINE]
  0x0900: PHI (r13v1 kotlinx.coroutines.CoroutineScope) = (r13v2 kotlinx.coroutines.CoroutineScope), (r13v3 kotlinx.coroutines.CoroutineScope) binds: [B:433:0x08fd, B:428:0x08af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:437:0x0907  */
    /* JADX WARN: Code duplicated, block: B:440:0x0923  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:436:0x0905 -> B:430:0x08cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:438:0x091f -> B:430:0x08cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 2474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.B = obj2;
        this.A = obj3;
        this.C = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
        this.A = obj2;
        this.C = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.C = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(kotlin.jvm.functions.l lVar, AtomicReference atomicReference, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 3;
        this.B = (kotlin.jvm.internal.m) lVar;
        this.A = atomicReference;
        this.C = pVar;
    }
}
