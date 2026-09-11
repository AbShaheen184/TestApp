package androidx.activity.compose;

import android.net.Uri;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.gestures.f2;
import androidx.compose.foundation.gestures.j1;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.gestures.w;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.runtime.w1;
import androidx.compose.ui.input.pointer.y;
import androidx.compose.ui.platform.b2;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.platform.v1;
import androidx.compose.ui.window.z;
import androidx.datastore.core.l0;
import androidx.room.i0;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(TextClassifier textClassifier, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 12;
        this.z = textClassifier;
        this.A = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r1v24, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new p((q) this.A, dVar, 0);
            case 1:
                return new p((androidx.compose.foundation.interaction.k) this.z, (androidx.compose.foundation.interaction.h) this.A, dVar, 1);
            case 2:
                return new p((androidx.compose.foundation.interaction.k) this.z, (androidx.compose.foundation.interaction.i) this.A, dVar, 2);
            case 3:
                p pVar = new p((j1) this.A, dVar, 3);
                pVar.z = obj;
                return pVar;
            case 4:
                return new p((m2) this.z, (kotlin.jvm.functions.p) this.A, dVar, 4);
            case 5:
                return new p((w) this.z, (f2) this.A, dVar, 5);
            case 6:
                return new p((Job) this.z, (o1) this.A, dVar, 6);
            case 7:
                return new p((androidx.compose.foundation.relocation.h) this.z, (androidx.compose.foundation.gestures.g) this.A, dVar, 7);
            case 8:
                return new p((y) this.z, (c1) this.A, dVar, 8);
            case 9:
                return new p((androidx.compose.foundation.text.input.internal.c) this.z, (androidx.compose.foundation.text.input.internal.o) this.A, dVar, 9);
            case 10:
                return new p((Job) this.z, (androidx.compose.foundation.text.input.internal.l) this.A, dVar, 10);
            case 11:
                return new p((androidx.compose.foundation.text.input.internal.q) this.z, (androidx.compose.animation.core.f) this.A, dVar, 11);
            case 12:
                return new p((TextClassifier) this.z, (kotlin.jvm.functions.p) this.A, dVar);
            case 13:
                p pVar2 = new p((androidx.compose.material.ripple.a) this.A, dVar, 13);
                pVar2.z = obj;
                return pVar2;
            case 14:
                return new p((androidx.compose.material.ripple.g) this.z, (androidx.compose.animation.core.m) this.A, dVar, 14);
            case 15:
                return new p((Flow) this.z, (androidx.compose.runtime.o1) this.A, dVar, 15);
            case 16:
                p pVar3 = new p((o0) this.A, dVar, 16);
                pVar3.z = obj;
                return pVar3;
            case 17:
                return new p((w1) this.z, (View) this.A, dVar, 17);
            case 18:
                return new p((StateFlow) this.z, (b2) this.A, dVar, 18);
            case 19:
                return new p((androidx.compose.ui.scrollcapture.d) this.z, (Runnable) this.A, dVar, 19);
            case 20:
                return new p((androidx.compose.ui.viewinterop.n) this.z, (androidx.compose.ui.geometry.c) this.A, dVar, 20);
            case 21:
                p pVar4 = new p((z) this.A, dVar, 21);
                pVar4.z = obj;
                return pVar4;
            case 22:
                p pVar5 = new p((List) this.A, dVar, 22);
                pVar5.z = obj;
                return pVar5;
            case 23:
                return new p((androidx.datastore.core.z) this.z, (l0) this.A, dVar, 23);
            case 24:
                return new p((kotlin.jvm.functions.p) this.z, (androidx.datastore.core.c) this.A, dVar);
            case 25:
                p pVar6 = new p((androidx.datastore.core.z) this.A, dVar, 25);
                pVar6.z = obj;
                return pVar6;
            case 26:
                return new p((androidx.datastore.core.c1) this.A, dVar, 26);
            case 27:
                return new p((androidx.privacysandbox.ads.adservices.java.measurement.a) this.z, (Uri) this.A, dVar, 27);
            case 28:
                p pVar7 = new p((kotlin.jvm.functions.l) this.A, dVar, 28);
                pVar7.z = obj;
                return pVar7;
            default:
                return new p((i0) this.z, (kotlin.jvm.functions.a) this.A, dVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.e) {
            case 0:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 11:
                ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 12:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 13:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 14:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 15:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                ((p) create((v1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 17:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 18:
                ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 19:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 21:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 22:
                return ((p) create((androidx.datastore.core.i) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 23:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 24:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 25:
                return ((p) create((l0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 26:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 27:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 28:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:399:0x070a  */
    /* JADX WARN: Code duplicated, block: B:410:0x0732 A[Catch: all -> 0x076f, TryCatch #5 {all -> 0x076f, blocks: (B:408:0x0728, B:410:0x0732, B:414:0x0744), top: B:473:0x0728 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x0740  */
    /* JADX WARN: Code duplicated, block: B:413:0x0741  */
    /* JADX WARN: Code duplicated, block: B:538:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v72, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r13v194, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r13v197, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r13v202, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x026c -> B:147:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:308:0x055b -> B:310:0x055e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f7 -> B:61:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.compose.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(kotlin.jvm.functions.p pVar, androidx.datastore.core.c cVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 24;
        this.z = (kotlin.coroutines.jvm.internal.i) pVar;
        this.A = cVar;
    }
}
