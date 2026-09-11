package com.app.mlounge.ui.viewmodel;

import android.app.Application;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.appsalt.internal.c3;
import com.appsalt.internal.e3;
import com.appsalt.internal.g2;
import com.appsalt.internal.j4;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(int i, com.google.common.util.concurrent.g0 g0Var, com.i4studio.subslib.model.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 13;
        this.z = bVar;
        this.A = g0Var;
        this.y = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new w1((x1) this.z, (TmdbTvDetailResponse) this.A, dVar, 0);
            case 1:
                w1 w1Var = new w1((z1) this.A, dVar, 1);
                w1Var.z = obj;
                return w1Var;
            case 2:
                return new w1((z1) this.z, (String) this.A, dVar, 2);
            case 3:
                w1 w1Var2 = new w1((Application) this.A, dVar, 3);
                w1Var2.z = obj;
                return w1Var2;
            case 4:
                return new w1((e3) this.z, (j4) this.A, dVar, 4);
            case 5:
                return new w1((c3) this.z, (byte[]) this.A, dVar, 5);
            case 6:
                w1 w1Var3 = new w1((com.google.firebase.messaging.o) this.A, dVar, 6);
                w1Var3.z = obj;
                return w1Var3;
            case 7:
                w1 w1Var4 = new w1((com.appsalt.internal.f) this.A, dVar, 7);
                w1Var4.z = obj;
                return w1Var4;
            case 8:
                return new w1((com.google.firebase.datastorage.b) this.z, (kotlin.jvm.functions.l) this.A, dVar, 8);
            case 9:
                return new w1((com.google.firebase.datastorage.b) this.z, (androidx.datastore.preferences.core.d) this.A, dVar, 9);
            case 10:
                return new w1((com.google.firebase.sessions.o) this.z, (com.google.firebase.sessions.y0) this.A, dVar, 10);
            case 11:
                return new w1((com.google.firebase.sessions.e1) this.z, (com.google.firebase.sessions.k0) this.A, dVar, 11);
            case 12:
                w1 w1Var5 = new w1((com.google.firebase.sessions.settings.c) this.A, dVar, 12);
                w1Var5.z = obj;
                return w1Var5;
            default:
                com.i4studio.subslib.model.b bVar = (com.i4studio.subslib.model.b) this.z;
                return new w1(this.y, (com.google.common.util.concurrent.g0) this.A, bVar, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        switch (this.e) {
            case 0:
                return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 2:
                return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                ((Boolean) obj).getClass();
                return new w1((e3) this.z, (j4) this.A, (kotlin.coroutines.d) obj2, 4).invokeSuspend(kotlin.y.a);
            case 5:
                return new w1((c3) this.z, (byte[]) this.A, (kotlin.coroutines.d) obj2, 5).invokeSuspend(kotlin.y.a);
            case 6:
                w1 w1Var = new w1((com.google.firebase.messaging.o) this.A, (kotlin.coroutines.d) obj2, 6);
                w1Var.z = (byte[]) obj;
                return w1Var.invokeSuspend(kotlin.y.a);
            case 7:
                w1 w1Var2 = new w1((com.appsalt.internal.f) this.A, (kotlin.coroutines.d) obj2, 7);
                w1Var2.z = (g2) obj;
                return w1Var2.invokeSuspend(kotlin.y.a);
            case 8:
                return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 11:
                return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 12:
                return ((w1) create((JSONObject) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:311:0x070c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0718  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:312:0x0716 -> B:314:0x071a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
    }
}
