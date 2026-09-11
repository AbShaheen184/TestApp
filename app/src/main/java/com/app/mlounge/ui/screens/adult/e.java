package com.app.mlounge.ui.screens.adult;

import android.content.SharedPreferences;
import androidx.compose.animation.core.z0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.text.u0;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import androidx.datastore.core.t0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.l0;
import androidx.media3.exoplayer.dash.manifest.t;
import com.app.mlounge.data.local.dao.k;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.data.remote.model.HiAnimeAnimeData;
import com.app.mlounge.data.remote.model.HiAnimeCategoryData;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeResponse;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import com.app.mlounge.data.remote.model.MusicStreamResult;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.data.repository.b0;
import com.app.mlounge.data.repository.r;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.e0;
import com.app.mlounge.ui.viewmodel.e1;
import com.app.mlounge.ui.viewmodel.h0;
import com.app.mlounge.ui.viewmodel.k1;
import com.app.mlounge.ui.viewmodel.l;
import com.app.mlounge.ui.viewmodel.m1;
import com.app.mlounge.ui.viewmodel.q;
import com.app.mlounge.ui.viewmodel.r1;
import com.app.mlounge.ui.viewmodel.s;
import com.app.mlounge.ui.viewmodel.x1;
import com.appsalt.internal.e3;
import com.appsalt.internal.j0;
import com.appsalt.internal.j4;
import com.appsalt.internal.n4;
import com.appsalt.internal.z1;
import com.appsalt.internal.z3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.o;
import kotlin.collections.u;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044 A[PHI: r1 r7
  0x0044: PHI (r1v3 kotlinx.coroutines.channels.ChannelIterator) = 
  (r1v8 kotlinx.coroutines.channels.ChannelIterator)
  (r1v9 kotlinx.coroutines.channels.ChannelIterator)
  (r1v10 kotlinx.coroutines.channels.ChannelIterator)
  (r1v11 kotlinx.coroutines.channels.ChannelIterator)
  (r1v12 kotlinx.coroutines.channels.ChannelIterator)
  (r1v13 kotlinx.coroutines.channels.ChannelIterator)
 binds: [B:13:0x0036, B:33:0x0092, B:35:0x00a2, B:30:0x008d, B:25:0x0076, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r7v3 kotlinx.coroutines.CoroutineScope) = 
  (r7v1 kotlinx.coroutines.CoroutineScope)
  (r7v2 kotlinx.coroutines.CoroutineScope)
  (r7v2 kotlinx.coroutines.CoroutineScope)
  (r7v2 kotlinx.coroutines.CoroutineScope)
  (r7v2 kotlinx.coroutines.CoroutineScope)
  (r7v7 kotlinx.coroutines.CoroutineScope)
 binds: [B:13:0x0036, B:33:0x0092, B:35:0x00a2, B:30:0x008d, B:25:0x0076, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[PHI: r1 r7 r10
  0x0051: PHI (r1v2 kotlinx.coroutines.channels.ChannelIterator) = (r1v14 kotlinx.coroutines.channels.ChannelIterator), (r1v15 kotlinx.coroutines.channels.ChannelIterator) binds: [B:15:0x004e, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r7v2 kotlinx.coroutines.CoroutineScope) = (r7v3 kotlinx.coroutines.CoroutineScope), (r7v5 kotlinx.coroutines.CoroutineScope) binds: [B:15:0x004e, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r10v3 java.lang.Object) = (r10v17 java.lang.Object), (r10v0 java.lang.Object) binds: [B:15:0x004e, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:14:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008d -> B:14:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0092 -> B:14:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a2 -> B:14:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object d(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.B
            com.appsalt.internal.e3 r0 = (com.appsalt.internal.e3) r0
            int r1 = r9.y
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L36
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L17
            goto L1e
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r10)
            r10 = 0
            return r10
        L1e:
            java.lang.Object r1 = r9.z
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r7 = r9.A
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlin.a.e(r10)
            goto L44
        L2a:
            java.lang.Object r1 = r9.z
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r7 = r9.A
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlin.a.e(r10)
            goto L51
        L36:
            kotlin.a.e(r10)
            java.lang.Object r10 = r9.A
            r7 = r10
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlinx.coroutines.channels.Channel r10 = r0.h
            kotlinx.coroutines.channels.ChannelIterator r1 = r10.iterator()
        L44:
            r9.A = r7
            r9.z = r1
            r9.y = r5
            java.lang.Object r10 = r1.hasNext(r9)
            if (r10 != r6) goto L51
            goto La4
        L51:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La5
            java.lang.Object r10 = r1.next()
            com.appsalt.internal.c2 r10 = (com.appsalt.internal.c2) r10
            boolean r8 = kotlinx.coroutines.CoroutineScopeKt.isActive(r7)
            if (r8 != 0) goto L66
            goto La5
        L66:
            boolean r8 = r10 instanceof com.appsalt.internal.j4
            if (r8 == 0) goto L79
            com.appsalt.internal.j4 r10 = (com.appsalt.internal.j4) r10
            r9.A = r7
            r9.z = r1
            r9.y = r4
            java.lang.Object r10 = com.appsalt.internal.e3.a(r0, r10, r9)
            if (r10 != r6) goto L44
            goto La4
        L79:
            boolean r8 = r10 instanceof com.appsalt.internal.z3
            if (r8 == 0) goto L90
            com.appsalt.internal.z3 r10 = (com.appsalt.internal.z3) r10
            java.lang.String r8 = r10.a
            byte[] r10 = r10.b
            r9.A = r7
            r9.z = r1
            r9.y = r3
            java.lang.Object r10 = com.appsalt.internal.e3.c(r0, r8, r10, r9)
            if (r10 != r6) goto L44
            goto La4
        L90:
            boolean r8 = r10 instanceof com.appsalt.internal.e4
            if (r8 == 0) goto L44
            com.appsalt.internal.e4 r10 = (com.appsalt.internal.e4) r10
            java.lang.String r10 = r10.a
            r9.A = r7
            r9.z = r1
            r9.y = r2
            java.lang.Object r10 = com.appsalt.internal.e3.b(r0, r10, r9)
            if (r10 != r6) goto L44
        La4:
            return r6
        La5:
            kotlin.y r10 = kotlin.y.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.adult.e.d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0018, B:18:0x0041, B:20:0x0049, B:22:0x0053, B:23:0x0057, B:14:0x0032, B:25:0x005b, B:32:0x007b, B:34:0x0081, B:35:0x0084, B:31:0x0075, B:13:0x002c, B:28:0x0061), top: B:46:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0018, B:18:0x0041, B:20:0x0049, B:22:0x0053, B:23:0x0057, B:14:0x0032, B:25:0x005b, B:32:0x007b, B:34:0x0081, B:35:0x0084, B:31:0x0075, B:13:0x002c, B:28:0x0061), top: B:46:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x005b A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0018, B:18:0x0041, B:20:0x0049, B:22:0x0053, B:23:0x0057, B:14:0x0032, B:25:0x005b, B:32:0x007b, B:34:0x0081, B:35:0x0084, B:31:0x0075, B:13:0x002c, B:28:0x0061), top: B:46:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0018, B:18:0x0041, B:20:0x0049, B:22:0x0053, B:23:0x0057, B:14:0x0032, B:25:0x005b, B:32:0x007b, B:34:0x0081, B:35:0x0084, B:31:0x0075, B:13:0x002c, B:28:0x0061), top: B:46:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object e(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.B
            com.appsalt.internal.n4 r0 = (com.appsalt.internal.n4) r0
            kotlinx.coroutines.channels.Channel r1 = r0.i
            int r2 = r10.y
            r3 = 0
            kotlin.y r4 = kotlin.y.a
            r5 = 1
            if (r2 == 0) goto L25
            if (r2 != r5) goto L1f
            java.lang.Object r2 = r10.z
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r10.A
            com.appsalt.internal.n4 r6 = (com.appsalt.internal.n4) r6
            kotlin.a.e(r11)     // Catch: java.lang.Throwable -> L1c
            goto L41
        L1c:
            r11 = move-exception
            goto L8a
        L1f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r11)
            return r3
        L25:
            kotlin.a.e(r11)
            java.lang.Object r11 = r10.A
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            kotlinx.coroutines.channels.ChannelIterator r11 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
            r2 = r11
            r6 = r0
        L32:
            r10.A = r6     // Catch: java.lang.Throwable -> L1c
            r10.z = r2     // Catch: java.lang.Throwable -> L1c
            r10.y = r5     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r2.hasNext(r10)     // Catch: java.lang.Throwable -> L1c
            kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.e
            if (r11 != r7) goto L41
            return r7
        L41:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L88
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L1c
            com.appsalt.internal.y1 r11 = (com.appsalt.internal.y1) r11     // Catch: java.lang.Throwable -> L1c
            boolean r7 = r11 instanceof com.appsalt.internal.p1     // Catch: java.lang.Throwable -> L1c
            if (r7 == 0) goto L57
            r6.a()     // Catch: java.lang.Throwable -> L1c
            goto L88
        L57:
            boolean r7 = r11 instanceof com.appsalt.internal.t1     // Catch: java.lang.Throwable -> L1c
            if (r7 == 0) goto L32
            okhttp3.internal.ws.e r7 = r6.e     // Catch: java.lang.Throwable -> L1c
            com.appsalt.internal.g4 r8 = r6.a
            if (r7 == 0) goto L32
            okio.i r9 = okio.i.A     // Catch: java.lang.Throwable -> L74
            com.appsalt.internal.t1 r11 = (com.appsalt.internal.t1) r11     // Catch: java.lang.Throwable -> L74
            byte[] r11 = r11.a     // Catch: java.lang.Throwable -> L74
            okio.i r11 = com.google.android.gms.measurement.internal.e0.i(r11)     // Catch: java.lang.Throwable -> L74
            boolean r11 = r7.f(r11)     // Catch: java.lang.Throwable -> L74
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L74
            goto L7b
        L74:
            r11 = move-exception
            kotlin.l r7 = new kotlin.l     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r11 = r7
        L7b:
            java.lang.Throwable r11 = kotlin.m.a(r11)     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L84
            r8.getClass()     // Catch: java.lang.Throwable -> L1c
        L84:
            r8.getClass()     // Catch: java.lang.Throwable -> L1c
            goto L32
        L88:
            r2 = r4
            goto L8f
        L8a:
            kotlin.l r2 = new kotlin.l
            r2.<init>(r11)
        L8f:
            java.lang.Throwable r11 = kotlin.m.a(r2)
            if (r11 == 0) goto L9a
            com.appsalt.internal.g4 r11 = r0.a
            r11.getClass()
        L9a:
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r1, r3, r5, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.adult.e.e(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new e((x) this.z, (com.app.mlounge.ui.viewmodel.c) this.A, (t2) this.B, dVar, 0);
            case 1:
                return new e((com.app.mlounge.ui.viewmodel.g) this.z, (y) this.A, (y0) this.B, dVar, 1);
            case 2:
                return new e((com.app.mlounge.ui.viewmodel.g) this.z, (Map) this.A, (y0) this.B, dVar, 2);
            case 3:
                return new e((x) this.z, (e0) this.A, (t2) this.B, dVar, 3);
            case 4:
                return new e((x) this.z, (h0) this.A, (t2) this.B, dVar, 4);
            case 5:
                return new e((x1) this.z, (y) this.A, (y0) this.B, dVar, 5);
            case 6:
                return new e((x) this.z, (x1) this.A, (t2) this.B, dVar, 6);
            case 7:
                return new e((HiAnimeDetailData) this.z, (com.app.mlounge.ui.viewmodel.g) this.A, (String) this.B, dVar, 7);
            case 8:
                return new e((com.app.mlounge.ui.viewmodel.g) this.z, (String) this.A, (String) this.B, dVar, 8);
            case 9:
                return new e((s) this.A, (String) this.B, dVar, 9);
            case 10:
                return new e((GameDetailResponse) this.z, (s) this.A, (String) this.B, dVar, 10);
            case 11:
                return new e((s) this.z, (String) this.A, (String) this.B, dVar, 11);
            case 12:
                return new e((a0) this.z, (String) this.A, (String) this.B, dVar, 12);
            case 13:
                return new e((h0) this.A, (MusicTrack) this.B, dVar, 13);
            case 14:
                return new e((h0) this.z, (String) this.A, (MusicAlbumDetail) this.B, dVar, 14);
            case 15:
                return new e((h0) this.z, (String) this.A, (MusicArtistDetail) this.B, dVar, 15);
            case 16:
                return new e((e1) this.z, (String) this.A, (String) this.B, dVar, 16);
            case 17:
                return new e((k1) this.z, (com.app.mlounge.ui.screens.settings.d) this.A, (String) this.B, dVar, 17);
            case 18:
                e eVar = new e((ArrayList) this.A, (r1) this.B, dVar, 18);
                eVar.z = obj;
                return eVar;
            case 19:
                e eVar2 = new e((b0) this.A, (r1) this.B, dVar, 19);
                eVar2.z = obj;
                return eVar2;
            case 20:
                return new e((r1) this.z, (String) this.A, (ChqStream) this.B, dVar, 20);
            case 21:
                return new e((r1) this.z, (ChqStream) this.A, (l) this.B, dVar, 21);
            case 22:
                return new e((z1) this.z, (z1) this.A, (j0) this.B, dVar, 22);
            case 23:
                e eVar3 = new e((e3) this.A, (j4) this.B, dVar, 23);
                eVar3.z = obj;
                return eVar3;
            case 24:
                e eVar4 = new e((e3) this.B, dVar, 24);
                eVar4.A = obj;
                return eVar4;
            case 25:
                e eVar5 = new e((n4) this.B, dVar, 25);
                eVar5.A = obj;
                return eVar5;
            default:
                return new e((com.google.firebase.datastorage.b) this.z, (androidx.datastore.preferences.core.d) this.A, (Long) this.B, dVar, 26);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 11:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 12:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 13:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 14:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 15:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 17:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 18:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 19:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 21:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 22:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 23:
                return ((e) create((byte[]) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 24:
                e eVar = new e((e3) this.B, (kotlin.coroutines.d) obj2, 24);
                eVar.A = (CoroutineScope) obj;
                return eVar.invokeSuspend(kotlin.y.a);
            case 25:
                e eVar2 = new e((n4) this.B, (kotlin.coroutines.d) obj2, 25);
                eVar2.A = (CoroutineScope) obj;
                return eVar2.invokeSuspend(kotlin.y.a);
            default:
                return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0469  */
    /* JADX WARN: Code duplicated, block: B:179:0x048a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0496  */
    /* JADX WARN: Code duplicated, block: B:182:0x0499  */
    /* JADX WARN: Code duplicated, block: B:450:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v77, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HiAnimeInfo hiAnimeInfoA;
        Object objWithContext;
        List listA;
        Boolean boolB;
        MutableStateFlow mutableStateFlow;
        Object gameDetail;
        Object objA;
        Object objWithContext2;
        MusicStreamResult musicStreamResult;
        Object objFirst;
        String str;
        String str2;
        String strC;
        Object objFirst2;
        Object objAwaitAll;
        String strJ;
        Object objAwaitAll2;
        Object objFirst3;
        int i = this.e;
        int i2 = 5;
        kotlin.time.c cVar = kotlin.time.c.MILLISECONDS;
        int i3 = 3;
        int i4 = 4;
        boolean zBooleanValue = false;
        zBooleanValue = false;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        Object obj2 = this.B;
        int i5 = 1;
        kotlin.coroutines.d dVar = null;
        switch (i) {
            case 0:
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowY = androidx.compose.runtime.s.y(new d((x) this.z, zBooleanValue ? 1 : 0));
                androidx.compose.foundation.interaction.f fVar = new androidx.compose.foundation.interaction.f(i4, (com.app.mlounge.ui.viewmodel.c) this.A, (t2) obj2);
                this.y = 1;
                return flowY.collect(fVar, this) == aVar ? aVar : yVar;
            case 1:
                int i7 = this.y;
                if (i7 == 0) {
                    kotlin.a.e(obj);
                    if (((HiAnimeDetailData) ((y0) obj2).getValue()) == null || ((com.app.mlounge.ui.viewmodel.g) this.z).E.g() != 0) {
                        return yVar;
                    }
                    kotlin.time.g gVar = kotlin.time.a.y;
                    long jU = com.google.common.base.b.u(300, cVar);
                    this.y = 1;
                    if (DelayKt.m17delayVtjQ1oo(jU, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                try {
                    y.a((y) this.A);
                    return yVar;
                } catch (Exception unused) {
                    return yVar;
                }
            case 2:
                androidx.compose.runtime.e1 e1Var = ((com.app.mlounge.ui.viewmodel.g) this.z).D;
                int i8 = this.y;
                if (i8 == 0) {
                    kotlin.a.e(obj);
                    if (((List) ((y0) obj2).getValue()).isEmpty() || e1Var.g() <= 0) {
                        return yVar;
                    }
                    kotlin.time.g gVar2 = kotlin.time.a.y;
                    long jU2 = com.google.common.base.b.u(500, cVar);
                    this.y = 1;
                    if (DelayKt.m17delayVtjQ1oo(jU2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                y yVar2 = (y) ((Map) this.A).get(new Integer(e1Var.g()));
                if (yVar2 == null) {
                    return yVar;
                }
                y.a(yVar2);
                return yVar;
            case 3:
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowY2 = androidx.compose.runtime.s.y(new d((x) this.z, i3));
                androidx.compose.foundation.interaction.f fVar2 = new androidx.compose.foundation.interaction.f(i2, (e0) this.A, (t2) obj2);
                this.y = 1;
                return flowY2.collect(fVar2, this) == aVar ? aVar : yVar;
            case 4:
                int i10 = this.y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowY3 = androidx.compose.runtime.s.y(new d((x) this.z, i4));
                androidx.compose.foundation.interaction.f fVar3 = new androidx.compose.foundation.interaction.f(6, (h0) this.A, (t2) obj2);
                this.y = 1;
                return flowY3.collect(fVar3, this) == aVar ? aVar : yVar;
            case 5:
                int i11 = this.y;
                if (i11 == 0) {
                    kotlin.a.e(obj);
                    if (((TmdbTvDetailResponse) ((y0) obj2).getValue()) == null || ((x1) this.z).k.g() != 0) {
                        return yVar;
                    }
                    kotlin.time.g gVar3 = kotlin.time.a.y;
                    long jU3 = com.google.common.base.b.u(300, cVar);
                    this.y = 1;
                    if (DelayKt.m17delayVtjQ1oo(jU3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                try {
                    y.a((y) this.A);
                    return yVar;
                } catch (Exception unused2) {
                    return yVar;
                }
            case 6:
                int i12 = this.y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowY4 = androidx.compose.runtime.s.y(new d((x) this.z, 6));
                androidx.compose.foundation.interaction.f fVar4 = new androidx.compose.foundation.interaction.f(7, (x1) this.A, (t2) obj2);
                this.y = 1;
                return flowY4.collect(fVar4, this) == aVar ? aVar : yVar;
            case 7:
                com.app.mlounge.ui.viewmodel.g gVar4 = (com.app.mlounge.ui.viewmodel.g) this.A;
                int i13 = this.y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                HiAnimeAnimeData hiAnimeAnimeDataA = ((HiAnimeDetailData) this.z).a();
                if (hiAnimeAnimeDataA == null || (hiAnimeInfoA = hiAnimeAnimeDataA.a()) == null) {
                    return yVar;
                }
                String str3 = kotlin.jvm.internal.l.a(gVar4.r.getValue(), "movie") ? "anime_movie" : "anime_tv";
                com.app.mlounge.data.repository.x xVar = gVar4.c;
                String strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str3, "_", hiAnimeInfoA.b());
                String strC2 = hiAnimeInfoA.c();
                com.app.mlounge.data.local.entity.c cVar2 = new com.app.mlounge.data.local.entity.c(strI, str3, strC2 == null ? "" : strC2, hiAnimeInfoA.d(), null, null, null, hiAnimeInfoA.a(), 0L, hiAnimeInfoA.b(), null, null, (String) obj2, 14192);
                this.y = 1;
                return xVar.a(cVar2, this) == aVar ? aVar : yVar;
            case 8:
                com.app.mlounge.ui.viewmodel.g gVar5 = (com.app.mlounge.ui.viewmodel.g) this.z;
                MutableStateFlow mutableStateFlow2 = gVar5.l;
                int i14 = this.y;
                try {
                    if (i14 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow2.setValue(Boolean.TRUE);
                        r rVar = gVar5.b;
                        String str4 = (String) this.A;
                        this.y = 1;
                        rVar.getClass();
                        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new androidx.compose.animation.b0(gVar5.G + 1, rVar, str4, (String) obj2, (kotlin.coroutines.d) null), this);
                        if (objWithContext == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objWithContext = obj;
                    }
                    HiAnimeResponse hiAnimeResponse = (HiAnimeResponse) objWithContext;
                    MutableStateFlow mutableStateFlow3 = gVar5.f;
                    Collection collection = (Collection) mutableStateFlow3.getValue();
                    HiAnimeCategoryData hiAnimeCategoryData = (HiAnimeCategoryData) hiAnimeResponse.a();
                    if (hiAnimeCategoryData == null || (listA = hiAnimeCategoryData.a()) == null) {
                        listA = u.e;
                    }
                    mutableStateFlow3.setValue(o.X(collection, listA));
                    HiAnimeCategoryData hiAnimeCategoryData2 = (HiAnimeCategoryData) hiAnimeResponse.a();
                    if (hiAnimeCategoryData2 != null && (boolB = hiAnimeCategoryData2.b()) != null) {
                        zBooleanValue = boolB.booleanValue();
                    }
                    gVar5.H = zBooleanValue;
                    gVar5.G++;
                    break;
                } catch (Exception unused3) {
                } finally {
                    mutableStateFlow2.setValue(Boolean.FALSE);
                }
                return yVar;
            case 9:
                s sVar = (s) this.A;
                MutableStateFlow mutableStateFlow4 = sVar.o;
                int i15 = this.y;
                try {
                    if (i15 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        mutableStateFlow = sVar.m;
                        r rVar2 = sVar.b;
                        this.z = mutableStateFlow;
                        this.y = 1;
                        gameDetail = rVar2.a.getGameDetail(((GamePlatform) sVar.u.getValue()).a(), (String) obj2, this);
                        if (gameDetail == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i15 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow = (MutableStateFlow) this.z;
                        kotlin.a.e(obj);
                        gameDetail = obj;
                    }
                    mutableStateFlow.setValue(gameDetail);
                    break;
                } catch (Exception e) {
                    sVar.k.setValue(e.getMessage());
                    break;
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return yVar;
            case 10:
                String str5 = (String) obj2;
                s sVar2 = (s) this.A;
                GameDetailResponse gameDetailResponse = (GameDetailResponse) this.z;
                int i16 = this.y;
                if (i16 != 0) {
                    if (i16 == 1 || i16 == 2) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                String strJ2 = gameDetailResponse.j();
                boolean zBooleanValue2 = ((Boolean) sVar2.J.getValue()).booleanValue();
                com.app.mlounge.data.local.dao.i iVar = sVar2.c;
                if (zBooleanValue2) {
                    this.y = 1;
                    Object objA2 = com.google.android.gms.dynamite.g.A(iVar.a, this, new com.app.mlounge.data.local.dao.h(strJ2, str5, zBooleanValue ? 1 : 0), false, true);
                    if (objA2 != aVar) {
                        objA2 = yVar;
                    }
                    if (objA2 != aVar) {
                        return yVar;
                    }
                } else {
                    com.app.mlounge.data.local.entity.b bVar = new com.app.mlounge.data.local.entity.b(strJ2, str5, gameDetailResponse.d(), gameDetailResponse.f(), gameDetailResponse.k(), System.currentTimeMillis());
                    this.y = 2;
                    Object objA3 = com.google.android.gms.dynamite.g.A(iVar.a, this, new t0(i2, iVar, bVar), false, true);
                    if (objA3 != aVar) {
                        objA3 = yVar;
                    }
                    if (objA3 != aVar) {
                        return yVar;
                    }
                }
                return aVar;
            case 11:
                s sVar3 = (s) this.z;
                int i17 = this.y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.dao.i iVar2 = sVar3.c;
                iVar2.getClass();
                androidx.room.coroutines.l lVarI = h1.i(iVar2.a, new String[]{"favourite_games"}, new com.app.mlounge.data.local.dao.h((String) this.A, (String) obj2, i5));
                androidx.compose.foundation.text.input.internal.a aVar2 = new androidx.compose.foundation.text.input.internal.a(sVar3, 9);
                this.y = 1;
                return lVarI.collect(aVar2, this) == aVar ? aVar : yVar;
            case 12:
                String str6 = (String) obj2;
                String str7 = (String) this.A;
                a0 a0Var = (a0) this.z;
                MutableStateFlow mutableStateFlow5 = a0Var.q;
                int i18 = this.y;
                try {
                    if (i18 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow5.setValue(Boolean.TRUE);
                        k kVar = a0Var.h;
                        this.y = 1;
                        objA = com.google.android.gms.dynamite.g.A(((com.app.mlounge.data.local.dao.l) kVar).a, this, new com.app.mlounge.data.local.dao.h(str7, str6, i3), true, false);
                        if (objA == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i18 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objA = obj;
                    }
                    Iterable<com.app.mlounge.data.local.entity.d> iterable = (Iterable) objA;
                    ArrayList arrayList = new ArrayList(kotlin.collections.p.y(iterable, 10));
                    for (com.app.mlounge.data.local.entity.d dVar2 : iterable) {
                        arrayList.add(new IptvChannel(dVar2.b, dVar2.c, dVar2.d, dVar2.e, dVar2.f, dVar2.g));
                    }
                    a0Var.j.setValue(arrayList);
                    if (kotlin.jvm.internal.l.a(str7, com.app.mlounge.data.iptv.l.SLUG) && str6 != null) {
                        a0.e(a0Var);
                        break;
                    }
                    mutableStateFlow5.setValue(Boolean.FALSE);
                    return yVar;
                } catch (Throwable th) {
                    mutableStateFlow5.setValue(Boolean.FALSE);
                    throw th;
                }
            case 13:
                h0 h0Var = (h0) this.A;
                MutableSharedFlow mutableSharedFlow = h0Var.B;
                MusicTrack musicTrack = (MusicTrack) obj2;
                int i19 = this.y;
                kotlin.coroutines.d dVar3 = null;
                if (i19 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.repository.a0 a0Var2 = h0Var.c;
                    String strD = musicTrack.d();
                    String strF = musicTrack.f();
                    this.y = 1;
                    a0Var2.getClass();
                    objWithContext2 = BuildersKt.withContext(Dispatchers.getIO(), new androidx.compose.animation.b0(a0Var2, strD, strF, dVar3, 27), this);
                    if (objWithContext2 != aVar) {
                    }
                    return aVar;
                }
                if (i19 != 1) {
                    if (i19 != 2) {
                        if (i19 == 3) {
                            musicStreamResult = (MusicStreamResult) this.z;
                            kotlin.a.e(obj);
                            objFirst = obj;
                            dVar3 = dVar3;
                        } else if (i19 != 4) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.a.e(obj);
                    return yVar;
                }
                kotlin.a.e(obj);
                objWithContext2 = obj;
                str = (String) objFirst;
                if (str != null) {
                    BuildersKt__Builders_commonKt.launch$default(l0.g(h0Var), null, null, new androidx.compose.animation.core.f(h0Var, str, musicStreamResult.b(), musicTrack.g(), null, 18), 3, null);
                    return yVar;
                }
                if (kotlin.jvm.internal.l.a(musicStreamResult.a(), "aac")) {
                    str2 = ".m4a";
                } else {
                    str2 = ".mp3";
                }
                com.app.mlounge.data.download.h.i(h0Var.d, musicStreamResult.b(), musicTrack.b() + " - " + musicTrack.g() + str2, musicTrack.g(), "music", musicTrack.d(), musicTrack.e(), "HQ", null, null, 0, 0, 0, 3584);
                strC = androidx.constraintlayout.core.g.c(musicTrack.g(), " started");
                this.z = dVar3;
                this.y = 4;
                if (mutableSharedFlow.emit(strC, this) != aVar) {
                    return yVar;
                }
                return aVar;
                musicStreamResult = (MusicStreamResult) objWithContext2;
                if (musicStreamResult == null) {
                    this.z = dVar3;
                    this.y = 2;
                    if (mutableSharedFlow.emit("Failed to resolve download link", this) != aVar) {
                        return yVar;
                    }
                } else {
                    Flow flow = h0Var.e.L;
                    this.z = musicStreamResult;
                    this.y = 3;
                    objFirst = FlowKt.first(flow, this);
                    if (objFirst != aVar) {
                        str = (String) objFirst;
                        if (str != null) {
                            BuildersKt__Builders_commonKt.launch$default(l0.g(h0Var), null, null, new androidx.compose.animation.core.f(h0Var, str, musicStreamResult.b(), musicTrack.g(), null, 18), 3, null);
                            return yVar;
                        }
                        if (kotlin.jvm.internal.l.a(musicStreamResult.a(), "aac")) {
                            str2 = ".m4a";
                        } else {
                            str2 = ".mp3";
                        }
                        com.app.mlounge.data.download.h.i(h0Var.d, musicStreamResult.b(), musicTrack.b() + " - " + musicTrack.g() + str2, musicTrack.g(), "music", musicTrack.d(), musicTrack.e(), "HQ", null, null, 0, 0, 0, 3584);
                        strC = androidx.constraintlayout.core.g.c(musicTrack.g(), " started");
                        this.z = dVar3;
                        this.y = 4;
                        if (mutableSharedFlow.emit(strC, this) != aVar) {
                            return yVar;
                        }
                    }
                }
                return aVar;
            case 14:
                String str8 = (String) this.A;
                h0 h0Var2 = (h0) this.z;
                MusicAlbumDetail musicAlbumDetail = (MusicAlbumDetail) obj2;
                int i20 = this.y;
                if (i20 != 0) {
                    if (i20 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.repository.a0 a0Var3 = h0Var2.c;
                com.app.mlounge.data.local.entity.f fVar5 = new com.app.mlounge.data.local.entity.f("music_album_".concat(str8), "music_album", musicAlbumDetail.e(), musicAlbumDetail.d(), null, null, null, musicAlbumDetail.a(), 0L, str8, (String) h0Var2.r.getValue(), 368);
                this.y = 1;
                return a0Var3.a.f(fVar5, this) == aVar ? aVar : yVar;
            case 15:
                String str9 = (String) this.A;
                MusicArtistDetail musicArtistDetail = (MusicArtistDetail) obj2;
                h0 h0Var3 = (h0) this.z;
                int i21 = this.y;
                if (i21 != 0) {
                    if (i21 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.repository.a0 a0Var4 = h0Var3.c;
                com.app.mlounge.data.local.entity.f fVar6 = new com.app.mlounge.data.local.entity.f("music_artist_".concat(str9), "music_artist", musicArtistDetail.d(), musicArtistDetail.c(), null, null, null, "Artist", 0L, str9, (String) h0Var3.r.getValue(), 368);
                this.y = 1;
                return a0Var4.a.f(fVar6, this) == aVar ? aVar : yVar;
            case 16:
                String str10 = (String) this.A;
                e1 e1Var2 = (e1) this.z;
                int i22 = this.y;
                if (i22 == 0) {
                    kotlin.a.e(obj);
                    y1 y1Var = e1Var2.b;
                    this.y = 1;
                    Object objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.f(str10, (String) obj2, dVar, zBooleanValue ? 1 : 0), this);
                    if (objS != aVar) {
                        objS = yVar;
                    }
                    if (objS == aVar) {
                        return aVar;
                    }
                } else {
                    if (i22 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                e1Var2.q.setValue(new q(str10, 10));
                return yVar;
            case 17:
                int i23 = this.y;
                if (i23 == 0) {
                    kotlin.a.e(obj);
                    Flow flow2 = ((k1) this.z).b.d;
                    this.y = 1;
                    objFirst2 = FlowKt.first(flow2, this);
                    if (objFirst2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i23 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objFirst2 = obj;
                }
                ((com.app.mlounge.ui.screens.settings.d) this.A).invoke(Boolean.valueOf(kotlin.jvm.internal.l.a((String) objFirst2, (String) obj2)));
                return yVar;
            case 18:
                r1 r1Var = (r1) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) this.z;
                int i24 = this.y;
                if (i24 == 0) {
                    kotlin.a.e(obj);
                    ArrayList arrayList2 = (ArrayList) this.A;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.p.y(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new z0(r1Var, (ChqStream) it.next(), (kotlin.coroutines.d) null), 3, null));
                    }
                    this.z = null;
                    this.y = 1;
                    objAwaitAll = AwaitKt.awaitAll(arrayList3, this);
                    if (objAwaitAll == aVar) {
                        return aVar;
                    }
                } else {
                    if (i24 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objAwaitAll = obj;
                }
                Map mapG = kotlin.collections.a0.G(o.I((Iterable) objAwaitAll));
                if (mapG.isEmpty()) {
                    return yVar;
                }
                MutableStateFlow mutableStateFlow6 = r1Var.h;
                Iterable<ChqStream> iterable2 = (Iterable) mutableStateFlow6.getValue();
                ArrayList arrayList4 = new ArrayList(kotlin.collections.p.y(iterable2, 10));
                for (ChqStream chqStreamA : iterable2) {
                    String str11 = (String) mapG.get(chqStreamA.m());
                    if (str11 != null && ((strJ = chqStreamA.j()) == null || kotlin.text.k.d0(strJ))) {
                        chqStreamA = ChqStream.a(chqStreamA, str11);
                    }
                    arrayList4.add(chqStreamA);
                }
                mutableStateFlow6.setValue(arrayList4);
                return yVar;
            case 19:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.z;
                int i25 = this.y;
                if (i25 == 0) {
                    kotlin.a.e(obj);
                    List list = ((b0) this.A).b;
                    r1 r1Var2 = (r1) obj2;
                    ArrayList arrayList5 = new ArrayList(kotlin.collections.p.y(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new m1(r1Var2, (ChqStream) it2.next(), dVar, zBooleanValue ? 1 : 0), 3, null));
                    }
                    this.z = null;
                    this.y = 1;
                    objAwaitAll2 = AwaitKt.awaitAll(arrayList5, this);
                    if (objAwaitAll2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i25 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objAwaitAll2 = obj;
                }
                return o.I((Iterable) objAwaitAll2);
            case 20:
                ChqStream chqStream = (ChqStream) obj2;
                r1 r1Var3 = (r1) this.z;
                String str12 = r1Var3.u;
                int i26 = this.y;
                if (i26 == 0) {
                    kotlin.a.e(obj);
                    Flow flow3 = r1Var3.d.L;
                    this.y = 1;
                    objFirst3 = FlowKt.first(flow3, this);
                    if (objFirst3 != aVar) {
                    }
                    return aVar;
                }
                if (i26 != 1) {
                    if (i26 == 2) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                objFirst3 = obj;
                String str13 = (String) objFirst3;
                if (str13 != null) {
                    BuildersKt__Builders_commonKt.launch$default(l0.g(r1Var3), null, null, new androidx.compose.animation.core.f(r1Var3, str13, (String) this.A, (ChqStream) obj2, null, 19), 3, null);
                    return yVar;
                }
                String strH = chqStream.h();
                if (strH == null) {
                    strH = "";
                }
                com.app.mlounge.data.download.h.i(r1Var3.e, (String) this.A, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str12, strH.length() > 0 ? androidx.privacysandbox.ads.adservices.java.internal.a.q(" [", strH, "]") : "", ".mp4"), r1Var3.u, r1Var3.r, r1Var3.s, null, chqStream.h(), chqStream.j(), chqStream.e(), r1Var3.t, r1Var3.v, r1Var3.w, 32);
                MutableSharedFlow mutableSharedFlow2 = r1Var3.y;
                this.y = 2;
                if (mutableSharedFlow2.emit(str12, this) != aVar) {
                    return yVar;
                }
                return aVar;
            case 21:
                int i27 = this.y;
                if (i27 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    return r1.k((r1) this.z, (ChqStream) this.A, (l) obj2, this) == aVar ? aVar : yVar;
                }
                if (i27 == 1) {
                    kotlin.a.e(obj);
                    return yVar;
                }
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                z1 z1Var = (z1) this.A;
                int i28 = this.y;
                if (i28 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    if (DelayKt.delay(500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i28 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                if (((z1) this.z).isRunning() || z1Var.isRunning()) {
                    return yVar;
                }
                z1Var.start(((SharedPreferences) ((t) ((j0) obj2).d).y).getString("apiKey", ""));
                return yVar;
            case 23:
                int i29 = this.y;
                if (i29 != 0) {
                    if (i29 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                byte[] bArr = (byte[]) this.z;
                ?? r3 = ((e3) this.A).g;
                z3 z3Var = new z3(((j4) obj2).a, bArr);
                this.y = 1;
                return r3.invoke(z3Var, this) == aVar ? aVar : yVar;
            case 24:
                return d(obj);
            case 25:
                return e(obj);
            default:
                int i30 = this.y;
                if (i30 != 0) {
                    if (i30 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                androidx.datastore.core.e eVar = ((com.google.firebase.datastorage.b) this.z).c;
                u0 u0Var = new u0((androidx.datastore.preferences.core.d) this.A, (Long) obj2, dVar, 13);
                this.y = 1;
                Object objS2 = android.support.v4.media.session.b.s(eVar, u0Var, this);
                return objS2 == aVar ? aVar : objS2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
    }
}
