package androidx.compose.animation;

import android.net.Uri;
import android.view.InputEvent;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.j2;
import androidx.compose.foundation.gestures.l2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.gestures.p1;
import androidx.compose.foundation.i1;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.v1;
import com.app.mlounge.data.remote.model.MusicStreamResult;
import com.app.mlounge.data.remote.model.MusicTrack;
import java.io.File;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i, com.app.mlounge.data.repository.r rVar, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 25;
        this.z = rVar;
        this.A = str;
        this.y = i;
        this.B = str2;
    }

    private final Object d(Object obj) {
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.e(obj);
                return obj;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        com.app.mlounge.data.music.d dVar = (com.app.mlounge.data.music.d) ((com.app.mlounge.data.repository.a0) this.z).b.getValue();
        String str = (String) this.A;
        String str2 = (String) this.B;
        this.y = 1;
        Object objA = dVar.a(str, str2, this);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        return objA == aVar ? aVar : objA;
    }

    private final Object e(Object obj) {
        MusicTrack musicTrack = (MusicTrack) this.A;
        int i = this.y;
        if (i == 0) {
            kotlin.a.e(obj);
            com.app.mlounge.ui.viewmodel.h0 h0Var = (com.app.mlounge.ui.viewmodel.h0) this.z;
            String strD = musicTrack.d();
            String strF = musicTrack.f();
            this.y = 1;
            com.app.mlounge.data.repository.a0 a0Var = h0Var.c;
            a0Var.getClass();
            obj = BuildersKt.withContext(Dispatchers.getIO(), new b0(a0Var, strD, strF, (kotlin.coroutines.d) null, 27), this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        MusicStreamResult musicStreamResult = (MusicStreamResult) obj;
        if (musicStreamResult != null) {
            ((kotlin.jvm.functions.w) this.B).b(musicStreamResult.b(), musicTrack.g(), kotlin.collections.a0.v(new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36"), new kotlin.k("Referer", "https://musicmp3.ru/")), "music", musicStreamResult.a(), new Integer(0), new Integer(0), new Integer(0), musicTrack.d());
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.q] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r1v21, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                b0 b0Var = new b0((e2) this.A, (androidx.compose.runtime.y0) this.B, dVar, 0);
                b0Var.z = obj;
                return b0Var;
            case 1:
                return new b0((j2) this.B, dVar, 1);
            case 2:
                return new b0((androidx.compose.foundation.interaction.k) this.z, (androidx.compose.foundation.interaction.l) this.A, (DisposableHandle) this.B, dVar, 2);
            case 3:
                return new b0((androidx.compose.foundation.interaction.k) this.z, (androidx.compose.foundation.interaction.j) this.A, (DisposableHandle) this.B, dVar, 3);
            case 4:
                b0 b0Var2 = new b0((androidx.compose.foundation.gestures.n) this.A, (kotlin.jvm.functions.p) this.B, dVar, 4);
                b0Var2.z = obj;
                return b0Var2;
            case 5:
                return new b0((androidx.compose.foundation.gestures.n) this.z, (i1) this.A, (kotlin.jvm.functions.p) this.B, dVar, 5);
            case 6:
                b0 b0Var3 = new b0((androidx.compose.foundation.gestures.k0) this.A, (m2) this.B, dVar, 6);
                b0Var3.z = obj;
                return b0Var3;
            case 7:
                b0 b0Var4 = new b0((m2) this.A, (kotlin.jvm.functions.p) this.B, dVar, 7);
                b0Var4.z = obj;
                return b0Var4;
            case 8:
                return new b0((kotlin.jvm.functions.q) this.z, (o1) this.A, (androidx.compose.ui.input.pointer.v) this.B, dVar);
            case 9:
                b0 b0Var5 = new b0((Job) this.A, (kotlin.jvm.functions.p) this.B, dVar);
                b0Var5.z = obj;
                return b0Var5;
            case 10:
                return new b0((androidx.compose.foundation.relocation.h) this.z, (androidx.compose.ui.node.d1) this.A, (androidx.compose.ui.draw.b) this.B, dVar, 10);
            case 11:
                return new b0((androidx.compose.foundation.text.contextmenu.modifier.j) this.A, (androidx.compose.foundation.text.contextmenu.provider.f) this.B, dVar, 11);
            case 12:
                b0 b0Var6 = new b0((t2) this.A, (androidx.compose.animation.core.d) this.B, dVar, 12);
                b0Var6.z = obj;
                return b0Var6;
            case 13:
                b0 b0Var7 = new b0((v1) this.A, (androidx.compose.runtime.e) this.B, dVar, 13);
                b0Var7.z = obj;
                return b0Var7;
            case 14:
                b0 b0Var8 = new b0((kotlin.coroutines.i) this.A, (Flow) this.B, dVar, 14);
                b0Var8.z = obj;
                return b0Var8;
            case 15:
                return new b0((Channel) this.B, dVar, 15);
            case 16:
                b0 b0Var9 = new b0((androidx.datastore.core.z) this.B, dVar, 16);
                b0Var9.z = obj;
                return b0Var9;
            case 17:
                b0 b0Var10 = new b0((androidx.datastore.core.z) this.A, (kotlin.jvm.functions.p) this.B, dVar);
                b0Var10.z = obj;
                return b0Var10;
            case 18:
                b0 b0Var11 = new b0((File) this.B, dVar, 18);
                b0Var11.z = obj;
                return b0Var11;
            case 19:
                return new b0(this.z, (androidx.compose.runtime.y0) this.B, (androidx.compose.runtime.y0) this.A, dVar, 19);
            case 20:
                return new b0((androidx.privacysandbox.ads.adservices.java.measurement.a) this.z, (Uri) this.A, (InputEvent) this.B, dVar, 20);
            case 21:
                b0 b0Var12 = new b0((androidx.room.i0) this.B, dVar, 21);
                b0Var12.z = obj;
                return b0Var12;
            case 22:
                return new b0((kotlin.jvm.internal.z) this.A, (androidx.room.coroutines.v) this.B, dVar, 22);
            case 23:
                b0 b0Var13 = new b0((coil3.q) this.A, (coil3.request.g) this.B, dVar, 23);
                b0Var13.z = obj;
                return b0Var13;
            case 24:
                return new b0((coil3.compose.i) this.A, (coil3.compose.c) this.B, dVar, 24);
            case 25:
                return new b0(this.y, (com.app.mlounge.data.repository.r) this.z, (String) this.A, (String) this.B, dVar);
            case 26:
                b0 b0Var14 = new b0((com.app.mlounge.data.providers.k0) this.A, (String) this.B, dVar, 26);
                b0Var14.z = obj;
                return b0Var14;
            case 27:
                return new b0((com.app.mlounge.data.repository.a0) this.z, (String) this.A, (String) this.B, dVar, 27);
            case 28:
                return new b0((com.app.mlounge.ui.viewmodel.h0) this.z, (MusicTrack) this.A, (kotlin.jvm.functions.w) this.B, dVar, 28);
            default:
                return new b0(this.z, (androidx.compose.runtime.y0) this.B, (androidx.compose.runtime.y0) this.A, dVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((b0) create((androidx.compose.runtime.o1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((b0) create((p1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((b0) create((l2) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((b0) create((p1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 11:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 12:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 13:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 14:
                return ((b0) create((androidx.compose.runtime.o1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 15:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                return ((b0) create((FlowCollector) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 17:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 18:
                return ((b0) create((ProducerScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 19:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 21:
                return ((b0) create((androidx.room.y) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 22:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 23:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 24:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 25:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 26:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 27:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 28:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x055d */
    /* JADX WARN: Code duplicated, block: B:289:0x057f  */
    /* JADX WARN: Code duplicated, block: B:292:0x0589 A[Catch: all -> 0x055d, TryCatch #11 {, blocks: (B:280:0x0557, B:290:0x0581, B:292:0x0589, B:293:0x0597, B:301:0x05a8, B:287:0x0572, B:303:0x05ab, B:305:0x05b0, B:306:0x05b1, B:286:0x056e, B:294:0x0598, B:296:0x059e), top: B:582:0x054a, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:296:0x059e A[Catch: all -> 0x05af, TRY_LEAVE, TryCatch #4 {all -> 0x05af, blocks: (B:294:0x0598, B:296:0x059e), top: B:568:0x0598, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x05ab A[Catch: all -> 0x055d, TryCatch #11 {, blocks: (B:280:0x0557, B:290:0x0581, B:292:0x0589, B:293:0x0597, B:301:0x05a8, B:287:0x0572, B:303:0x05ab, B:305:0x05b0, B:306:0x05b1, B:286:0x056e, B:294:0x0598, B:296:0x059e), top: B:582:0x054a, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:426:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:568:0x0598 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Path cross not found for [B:296:0x059e, B:300:0x05a7], limit reached: 633 */
    /* JADX WARN: Type inference failed for: r1v29, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.q] */
    /* JADX WARN: Type inference failed for: r2v35, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r7v26, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:288:0x057d -> B:290:0x0581). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 2732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(androidx.datastore.core.z zVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 17;
        this.A = zVar;
        this.B = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, androidx.compose.runtime.y0 y0Var, androidx.compose.runtime.y0 y0Var2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.B = y0Var;
        this.A = y0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(kotlin.jvm.functions.q qVar, o1 o1Var, androidx.compose.ui.input.pointer.v vVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 8;
        this.z = (kotlin.coroutines.jvm.internal.i) qVar;
        this.A = o1Var;
        this.B = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(Job job, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 9;
        this.A = job;
        this.B = (kotlin.coroutines.jvm.internal.i) pVar;
    }
}
