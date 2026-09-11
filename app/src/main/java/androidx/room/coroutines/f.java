package androidx.room.coroutines;

import android.content.Context;
import android.net.Uri;
import androidx.compose.material3.r0;
import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import com.app.mlounge.data.remote.model.HiAnimeAnimeData;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.ui.components.q0;
import com.app.mlounge.ui.screens.player.b1;
import com.app.mlounge.ui.screens.player.k0;
import com.app.mlounge.ui.screens.player.n0;
import com.app.mlounge.ui.screens.player.o0;
import com.app.mlounge.ui.screens.player.z0;
import com.app.mlounge.ui.viewmodel.h0;
import com.app.mlounge.ui.viewmodel.r1;
import com.app.mlounge.ui.viewmodel.x1;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.g0;
import okhttp3.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(kotlin.jvm.functions.p pVar, q qVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 2;
        this.z = (kotlin.coroutines.jvm.internal.i) pVar;
        this.A = qVar;
    }

    private final Object d(Object obj) {
        com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.z;
        MutableStateFlow mutableStateFlow = cVar.q;
        int i = this.y;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                com.app.mlounge.data.repository.r rVar = cVar.b;
                com.app.mlounge.data.repository.a aVar = (com.app.mlounge.data.repository.a) this.A;
                this.y = 1;
                rVar.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new androidx.compose.foundation.text.selection.q(aVar, null, 2), this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            List list = (List) obj;
            cVar.g.setValue(list);
            String str = (String) kotlin.collections.o.M(list);
            if (str != null && mutableStateFlow.getValue() == null) {
                mutableStateFlow.setValue(str);
            }
        } catch (Exception e) {
            com.app.mlounge.util.a.b("AdultViewModel", "loadCategories failed", e);
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r10 == r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.A
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.z
            com.app.mlounge.ui.viewmodel.g r1 = (com.app.mlounge.ui.viewmodel.g) r1
            com.app.mlounge.data.repository.r r2 = r1.b
            kotlinx.coroutines.flow.MutableStateFlow r3 = r1.v
            int r4 = r9.y
            r5 = 2
            r6 = 1
            r7 = 0
            kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.a.e
            if (r4 == 0) goto L2d
            if (r4 == r6) goto L29
            if (r4 != r5) goto L22
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            goto L6c
        L1d:
            r10 = move-exception
            goto L96
        L20:
            r10 = move-exception
            goto L89
        L22:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r10)
            r10 = 0
            return r10
        L29:
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            goto L4b
        L2d:
            kotlin.a.e(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r3.setValue(r10)
            r9.y = r6     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.getClass()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            kotlinx.coroutines.CoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            com.app.mlounge.data.repository.d r4 = new com.app.mlounge.data.repository.d     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r6 = 0
            r4.<init>(r6, r2, r0, r7)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r4, r9)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r10 != r8) goto L4b
            goto L6b
        L4b:
            com.app.mlounge.data.remote.model.HiAnimeResponse r10 = (com.app.mlounge.data.remote.model.HiAnimeResponse) r10     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            kotlinx.coroutines.flow.MutableStateFlow r4 = r1.t     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            java.lang.Object r10 = r10.a()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r4.setValue(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r9.y = r5     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.getClass()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            kotlinx.coroutines.CoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            com.app.mlounge.data.repository.d r4 = new com.app.mlounge.data.repository.d     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r5 = 2
            r4.<init>(r5, r2, r0, r7)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r4, r9)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r10 != r8) goto L6c
        L6b:
            return r8
        L6c:
            com.app.mlounge.data.remote.model.HiAnimeResponse r10 = (com.app.mlounge.data.remote.model.HiAnimeResponse) r10     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            kotlinx.coroutines.flow.MutableStateFlow r0 = r1.x     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            java.lang.Object r10 = r10.a()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            com.app.mlounge.data.remote.model.HiAnimeEpisodesData r10 = (com.app.mlounge.data.remote.model.HiAnimeEpisodesData) r10     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r10 == 0) goto L7e
            java.util.List r10 = r10.a()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r10 != 0) goto L80
        L7e:
            kotlin.collections.u r10 = kotlin.collections.u.e     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
        L80:
            r0.setValue(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
        L83:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r3.setValue(r10)
            goto L93
        L89:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r1.n     // Catch: java.lang.Throwable -> L1d
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L1d
            r0.setValue(r10)     // Catch: java.lang.Throwable -> L1d
            goto L83
        L93:
            kotlin.y r10 = kotlin.y.a
            return r10
        L96:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.f.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c A[PHI: r2 r6
  0x006c: PHI (r2v6 kotlinx.coroutines.flow.MutableStateFlow) = (r2v3 kotlinx.coroutines.flow.MutableStateFlow), (r2v9 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:16:0x0069, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r6v6 java.lang.Object) = (r6v5 java.lang.Object), (r6v0 java.lang.Object) binds: [B:16:0x0069, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[PHI: r2 r6
  0x007f: PHI (r2v10 kotlinx.coroutines.flow.MutableStateFlow) = (r2v7 kotlinx.coroutines.flow.MutableStateFlow), (r2v13 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:19:0x007c, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r6v9 java.lang.Object) = (r6v8 java.lang.Object), (r6v0 java.lang.Object) binds: [B:19:0x007c, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[PHI: r2 r6
  0x0092: PHI (r2v14 kotlinx.coroutines.flow.MutableStateFlow) = (r2v11 kotlinx.coroutines.flow.MutableStateFlow), (r2v17 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:22:0x008f, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r6v12 java.lang.Object) = (r6v11 java.lang.Object), (r6v0 java.lang.Object) binds: [B:22:0x008f, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5 A[PHI: r2 r6
  0x00a5: PHI (r2v18 kotlinx.coroutines.flow.MutableStateFlow) = (r2v15 kotlinx.coroutines.flow.MutableStateFlow), (r2v20 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:25:0x00a2, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r6v15 java.lang.Object) = (r6v14 java.lang.Object), (r6v0 java.lang.Object) binds: [B:25:0x00a2, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (r6 == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object f(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.f.f(java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj) {
        int i = this.y;
        if (i == 0) {
            kotlin.a.e(obj);
            com.app.mlounge.data.repository.x xVar = ((com.app.mlounge.ui.viewmodel.t) this.z).b;
            String str = (String) this.A;
            this.y = 1;
            Object objD = xVar.d(str, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return kotlin.y.a;
    }

    private final Object h(Object obj) {
        int i = this.y;
        kotlin.y yVar = kotlin.y.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.e(obj);
                return yVar;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        y1 y1Var = ((com.app.mlounge.ui.viewmodel.a0) this.z).i;
        String str = (String) this.A;
        this.y = 1;
        Object objS = android.support.v4.media.session.b.s(z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.d(15, str, null), this);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objS != aVar) {
            objS = yVar;
        }
        return objS == aVar ? aVar : yVar;
    }

    private final Object i(Object obj) {
        MusicAlbumDetail musicAlbumDetail = (MusicAlbumDetail) this.A;
        h0 h0Var = (h0) this.z;
        int i = this.y;
        if (i == 0) {
            kotlin.a.e(obj);
            MutableSharedFlow mutableSharedFlow = h0Var.B;
            this.y = 1;
            Object objEmit = mutableSharedFlow.emit("Starting album download...", this);
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
        for (MusicTrack musicTrack : musicAlbumDetail.f()) {
            musicTrack.getClass();
            BuildersKt__Builders_commonKt.launch$default(l0.g(h0Var), null, null, new com.app.mlounge.ui.screens.adult.e(h0Var, musicTrack, null, 13), 3, null);
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146 A[Catch: all -> 0x002e, Exception -> 0x0031, LOOP:0: B:64:0x0140->B:66:0x0146, LOOP_END, TryCatch #1 {Exception -> 0x0031, blocks: (B:7:0x0026, B:56:0x0128, B:59:0x012e, B:61:0x0134, B:63:0x013a, B:64:0x0140, B:66:0x0146, B:67:0x0151, B:68:0x0162, B:70:0x0168, B:74:0x0185, B:77:0x018d, B:81:0x0197, B:82:0x01b4, B:12:0x0034, B:13:0x0039, B:89:0x01e5, B:14:0x0042, B:32:0x0097, B:17:0x0069, B:26:0x0083, B:29:0x008d, B:35:0x00bf, B:38:0x00c9, B:41:0x00d4, B:44:0x00de, B:53:0x00fc, B:49:0x00ef, B:50:0x00f6, B:83:0x01d0, B:86:0x01db), top: B:102:0x0018, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0168 A[Catch: all -> 0x002e, Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:7:0x0026, B:56:0x0128, B:59:0x012e, B:61:0x0134, B:63:0x013a, B:64:0x0140, B:66:0x0146, B:67:0x0151, B:68:0x0162, B:70:0x0168, B:74:0x0185, B:77:0x018d, B:81:0x0197, B:82:0x01b4, B:12:0x0034, B:13:0x0039, B:89:0x01e5, B:14:0x0042, B:32:0x0097, B:17:0x0069, B:26:0x0083, B:29:0x008d, B:35:0x00bf, B:38:0x00c9, B:41:0x00d4, B:44:0x00de, B:53:0x00fc, B:49:0x00ef, B:50:0x00f6, B:83:0x01d0, B:86:0x01db), top: B:102:0x0018, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0182  */
    /* JADX WARN: Code duplicated, block: B:73:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x0196  */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0212, code lost:
    
        if (r0.l(r2, r27) == r12) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.f.j(java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.z;
        int i = this.y;
        if (i == 0) {
            kotlin.a.e(obj);
            x1 x1Var = (x1) this.A;
            StateFlow stateFlow = x1Var.g;
            androidx.compose.foundation.interaction.f fVar = new androidx.compose.foundation.interaction.f(10, x1Var, coroutineScope);
            this.z = null;
            this.y = 1;
            Object objCollect = stateFlow.collect(fVar, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        com.google.gson.b.b();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f((kotlin.jvm.functions.p) this.z, (c0) this.A, dVar, 0);
            case 1:
                return new f((kotlin.jvm.functions.p) this.z, (kotlin.jvm.internal.z) this.A, dVar, 1);
            case 2:
                return new f((kotlin.jvm.functions.p) this.z, (q) this.A, dVar);
            case 3:
                return new f((coil3.q) this.z, (coil3.request.g) this.A, dVar, 3);
            case 4:
                f fVar = new f((coil3.network.n) this.A, dVar, 4);
                fVar.z = obj;
                return fVar;
            case 5:
                return new f((com.app.mlounge.data.local.dao.m) this.z, (String) this.A, dVar, 5);
            case 6:
                return new f((y0) this.z, (y0) this.A, dVar, 6);
            case 7:
                return new f((androidx.compose.foundation.lazy.z) this.z, (com.app.mlounge.ui.viewmodel.g) this.A, dVar, 7);
            case 8:
                return new f((androidx.compose.foundation.lazy.grid.x) this.z, (com.app.mlounge.ui.viewmodel.g) this.A, dVar, 8);
            case 9:
                return new f((com.app.mlounge.ui.viewmodel.a0) this.z, (Context) this.A, dVar, 9);
            case 10:
                return new f((h0) this.z, (Context) this.A, dVar, 10);
            case 11:
                return new f((z0) this.z, (String) this.A, dVar, 11);
            case 12:
                return new f((String) this.z, (Map) this.A, dVar, 12);
            case 13:
                return new f((z0) this.z, (com.app.mlounge.data.local.entity.e) this.A, dVar, 13);
            case 14:
                return new f((b1) this.z, (z0) this.A, dVar, 14);
            case 15:
                return new f((androidx.compose.foundation.lazy.grid.x) this.z, (com.app.mlounge.ui.viewmodel.y0) this.A, dVar, 15);
            case 16:
                return new f((r1) this.z, (kotlin.jvm.functions.w) this.A, dVar, 16);
            case 17:
                return new f((r1) this.z, (Context) this.A, dVar, 17);
            case 18:
                return new f((androidx.compose.foundation.lazy.z) this.z, (x1) this.A, dVar, 18);
            case 19:
                return new f((androidx.compose.foundation.lazy.grid.x) this.z, (com.app.mlounge.ui.viewmodel.z1) this.A, dVar, 19);
            case 20:
                return new f((com.app.mlounge.ui.viewmodel.c) this.z, (com.app.mlounge.data.repository.a) this.A, dVar, 20);
            case 21:
                return new f((com.app.mlounge.ui.viewmodel.g) this.z, (String) this.A, dVar, 21);
            case 22:
                return new f((HiAnimeDetailData) this.z, (com.app.mlounge.ui.viewmodel.g) this.A, dVar, 22);
            case 23:
                return new f((com.app.mlounge.ui.viewmodel.k) this.A, dVar, 23);
            case 24:
                return new f((com.app.mlounge.ui.viewmodel.t) this.z, (String) this.A, dVar, 24);
            case 25:
                return new f((com.app.mlounge.ui.viewmodel.a0) this.z, (String) this.A, dVar, 25);
            case 26:
                return new f((h0) this.z, (MusicAlbumDetail) this.A, dVar, 26);
            case 27:
                return new f((r1) this.A, dVar, 27);
            case 28:
                f fVar2 = new f((x1) this.A, dVar, 28);
                fVar2.z = obj;
                return fVar2;
            default:
                return new f((x1) this.A, dVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws ProtocolException {
        switch (this.e) {
            case 0:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((f) create((coil3.network.q) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 10:
                ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
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
                ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 17:
                ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 18:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 19:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 21:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 22:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 23:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 24:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 25:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 26:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 27:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 28:
                ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            default:
                return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:303:0x057d A[Catch: Exception -> 0x05a1, TryCatch #18 {Exception -> 0x05a1, blocks: (B:301:0x0560, B:303:0x057d, B:304:0x0585, B:306:0x058b, B:309:0x05a4, B:316:0x05c3, B:320:0x05cb, B:322:0x05d3, B:324:0x05dd, B:327:0x05e5, B:329:0x05ed, B:331:0x05f3, B:333:0x05fe, B:335:0x0604, B:344:0x0615, B:314:0x05bd), top: B:522:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:306:0x058b A[Catch: Exception -> 0x05a1, LOOP:4: B:304:0x0585->B:306:0x058b, LOOP_END, TryCatch #18 {Exception -> 0x05a1, blocks: (B:301:0x0560, B:303:0x057d, B:304:0x0585, B:306:0x058b, B:309:0x05a4, B:316:0x05c3, B:320:0x05cb, B:322:0x05d3, B:324:0x05dd, B:327:0x05e5, B:329:0x05ed, B:331:0x05f3, B:333:0x05fe, B:335:0x0604, B:344:0x0615, B:314:0x05bd), top: B:522:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:319:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:322:0x05d3 A[Catch: Exception -> 0x05a1, TryCatch #18 {Exception -> 0x05a1, blocks: (B:301:0x0560, B:303:0x057d, B:304:0x0585, B:306:0x058b, B:309:0x05a4, B:316:0x05c3, B:320:0x05cb, B:322:0x05d3, B:324:0x05dd, B:327:0x05e5, B:329:0x05ed, B:331:0x05f3, B:333:0x05fe, B:335:0x0604, B:344:0x0615, B:314:0x05bd), top: B:522:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:327:0x05e5 A[Catch: Exception -> 0x05a1, TryCatch #18 {Exception -> 0x05a1, blocks: (B:301:0x0560, B:303:0x057d, B:304:0x0585, B:306:0x058b, B:309:0x05a4, B:316:0x05c3, B:320:0x05cb, B:322:0x05d3, B:324:0x05dd, B:327:0x05e5, B:329:0x05ed, B:331:0x05f3, B:333:0x05fe, B:335:0x0604, B:344:0x0615, B:314:0x05bd), top: B:522:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:329:0x05ed A[Catch: Exception -> 0x05a1, TryCatch #18 {Exception -> 0x05a1, blocks: (B:301:0x0560, B:303:0x057d, B:304:0x0585, B:306:0x058b, B:309:0x05a4, B:316:0x05c3, B:320:0x05cb, B:322:0x05d3, B:324:0x05dd, B:327:0x05e5, B:329:0x05ed, B:331:0x05f3, B:333:0x05fe, B:335:0x0604, B:344:0x0615, B:314:0x05bd), top: B:522:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x05f3 A[Catch: Exception -> 0x05a1, TryCatch #18 {Exception -> 0x05a1, blocks: (B:301:0x0560, B:303:0x057d, B:304:0x0585, B:306:0x058b, B:309:0x05a4, B:316:0x05c3, B:320:0x05cb, B:322:0x05d3, B:324:0x05dd, B:327:0x05e5, B:329:0x05ed, B:331:0x05f3, B:333:0x05fe, B:335:0x0604, B:344:0x0615, B:314:0x05bd), top: B:522:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:335:0x0604 A[Catch: Exception -> 0x05a1, TRY_LEAVE, TryCatch #18 {Exception -> 0x05a1, blocks: (B:301:0x0560, B:303:0x057d, B:304:0x0585, B:306:0x058b, B:309:0x05a4, B:316:0x05c3, B:320:0x05cb, B:322:0x05d3, B:324:0x05dd, B:327:0x05e5, B:329:0x05ed, B:331:0x05f3, B:333:0x05fe, B:335:0x0604, B:344:0x0615, B:314:0x05bd), top: B:522:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x060d  */
    /* JADX WARN: Type inference failed for: r0v17, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws ProtocolException {
        coil3.network.q qVar;
        Object objC;
        kotlin.coroutines.d dVar;
        Object objWithContext;
        Object objA;
        Object value;
        k0 k0Var;
        boolean zA;
        HttpURLConnection httpURLConnection;
        int responseCode;
        String contentType;
        String headerField;
        boolean z;
        String headerField2;
        String lowerCase;
        Long lR;
        String lowerCase2;
        String str;
        String strB;
        byte[] bArrA;
        HiAnimeInfo hiAnimeInfoA;
        MutableStateFlow mutableStateFlow;
        Object objE;
        int i = this.e;
        String str2 = "";
        int i2 = 6;
        int i3 = 7;
        int i4 = 2;
        boolean z2 = false;
        kotlin.y yVar = kotlin.y.a;
        Object obj2 = this.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i5 = 1;
        switch (i) {
            case 0:
                int i6 = this.y;
                if (i6 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objInvoke = ((kotlin.jvm.functions.p) this.z).invoke((c0) obj2, this);
                    return objInvoke == aVar ? aVar : objInvoke;
                }
                if (i6 == 1) {
                    kotlin.a.e(obj);
                    return obj;
                }
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.z;
                Object obj3 = ((kotlin.jvm.internal.z) obj2).e;
                this.y = 1;
                Object objInvoke2 = pVar.invoke(obj3, this);
                return objInvoke2 == aVar ? aVar : objInvoke2;
            case 2:
                int i8 = this.y;
                if (i8 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objInvoke3 = ((kotlin.coroutines.jvm.internal.i) this.z).invoke((q) obj2, this);
                    return objInvoke3 == aVar ? aVar : objInvoke3;
                }
                if (i8 == 1) {
                    kotlin.a.e(obj);
                    return obj;
                }
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                this.y = 1;
                int i10 = coil3.q.f;
                Object objA2 = ((coil3.q) this.z).a((coil3.request.g) obj2, 1, this);
                return objA2 == aVar ? aVar : objA2;
            case 4:
                coil3.network.n nVar = (coil3.network.n) obj2;
                int i11 = this.y;
                if (i11 != 0) {
                    if (i11 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qVar = (coil3.network.q) this.z;
                    kotlin.a.e(obj);
                    objC = obj;
                    return new coil3.fetch.k((coil3.decode.q) objC, coil3.network.n.f(nVar.a, qVar.d.a()), coil3.decode.h.A);
                }
                kotlin.a.e(obj);
                qVar = (coil3.network.q) this.z;
                coil3.network.r rVar = qVar.e;
                if (rVar == null) {
                    net.luminis.tls.engine.impl.c.r("body == null");
                    return null;
                }
                this.z = qVar;
                this.y = 1;
                objC = coil3.network.n.c(nVar, rVar, this);
                if (objC == aVar) {
                    return aVar;
                }
                return new coil3.fetch.k((coil3.decode.q) objC, coil3.network.n.f(nVar.a, qVar.d.a()), coil3.decode.h.A);
            case 5:
                int i12 = this.y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.dao.m mVar = (com.app.mlounge.data.local.dao.m) this.z;
                this.y = 1;
                Object objA3 = com.google.android.gms.dynamite.g.A(mVar.a, this, new r0((String) obj2, i3), true, false);
                return objA3 == aVar ? aVar : objA3;
            case 6:
                int i13 = this.y;
                if (i13 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    dVar = null;
                    objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new androidx.activity.compose.n(i4, 3, dVar), this);
                    if (objWithContext == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objWithContext = obj;
                    dVar = null;
                }
                q0 q0Var = (q0) objWithContext;
                ((y0) this.z).setValue(q0Var != null ? q0Var.b : dVar);
                ((y0) obj2).setValue(Boolean.FALSE);
                return yVar;
            case 7:
                int i14 = this.y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowY = androidx.compose.runtime.s.y(new androidx.compose.foundation.lazy.e((androidx.compose.foundation.lazy.z) this.z, 1));
                com.app.mlounge.ui.screens.anime.f fVar = new com.app.mlounge.ui.screens.anime.f((com.app.mlounge.ui.viewmodel.g) obj2, 0);
                this.y = 1;
                return flowY.collect(fVar, this) == aVar ? aVar : yVar;
            case 8:
                int i15 = this.y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowY2 = androidx.compose.runtime.s.y(new com.app.mlounge.ui.screens.adult.d((androidx.compose.foundation.lazy.grid.x) this.z, i5));
                com.app.mlounge.ui.screens.anime.f fVar2 = new com.app.mlounge.ui.screens.anime.f((com.app.mlounge.ui.viewmodel.g) obj2, i5);
                this.y = 1;
                return flowY2.collect(fVar2, this) == aVar ? aVar : yVar;
            case 9:
                int i16 = this.y;
                if (i16 != 0) {
                    if (i16 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        kotlin.a.e(obj);
                    }
                    return null;
                }
                kotlin.a.e(obj);
                SharedFlow sharedFlow = ((com.app.mlounge.ui.viewmodel.a0) this.z).A;
                com.app.mlounge.ui.screens.livetv.g gVar = new com.app.mlounge.ui.screens.livetv.g((Context) obj2, 0);
                this.y = 1;
                if (sharedFlow.collect(gVar, this) == aVar) {
                    return aVar;
                }
                com.google.gson.b.b();
                return null;
            case 10:
                int i17 = this.y;
                if (i17 != 0) {
                    if (i17 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        kotlin.a.e(obj);
                    }
                    return null;
                }
                kotlin.a.e(obj);
                SharedFlow sharedFlow2 = ((h0) this.z).C;
                com.app.mlounge.ui.screens.livetv.g gVar2 = new com.app.mlounge.ui.screens.livetv.g((Context) obj2, 1);
                this.y = 1;
                if (sharedFlow2.collect(gVar2, this) == aVar) {
                    return aVar;
                }
                com.google.gson.b.b();
                return null;
            case 11:
                z0 z0Var = (z0) this.z;
                int i18 = this.y;
                if (i18 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.local.dao.m mVar2 = z0Var.b;
                    this.y = 1;
                    objA = com.google.android.gms.dynamite.g.A(mVar2.a, this, new r0((String) obj2, i3), true, false);
                    if (objA != aVar) {
                    }
                    return aVar;
                }
                if (i18 != 1) {
                    if (i18 == 2) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                objA = obj;
                com.app.mlounge.data.local.entity.e eVar = (com.app.mlounge.data.local.entity.e) objA;
                if (eVar == null || !eVar.b()) {
                    return yVar;
                }
                MutableStateFlow mutableStateFlow2 = z0Var.e;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, o0.a((o0) value, false, false, false, true, false, false, false, false, 0L, 0L, eVar.b, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -1033, 3)));
                MainCoroutineDispatcher main = Dispatchers.getMain();
                androidx.compose.foundation.text.selection.q qVar2 = new androidx.compose.foundation.text.selection.q(z0Var, null, i2);
                this.y = 2;
                if (BuildersKt.withContext(main, qVar2, this) != aVar) {
                    return yVar;
                }
                return aVar;
            case 12:
                int i19 = this.y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                String str3 = (String) this.z;
                Map map = (Map) obj2;
                this.y = 1;
                if (!kotlin.text.k.T(str3, ".m3u8", false)) {
                    if (kotlin.text.k.T(str3, "googleusercontent.com", false) || kotlin.text.k.T(str3, ".workers.dev", false)) {
                        k0Var = new k0(str3, "video/mp4", 0L, false);
                    } else {
                        int i20 = 0;
                        while (true) {
                            long contentLengthLong = -1;
                            if (i20 < 10) {
                                try {
                                    URLConnection uRLConnectionOpenConnection = new URL(str3).openConnection();
                                    uRLConnectionOpenConnection.getClass();
                                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                                    httpURLConnection2.setInstanceFollowRedirects(z2);
                                    httpURLConnection2.setRequestMethod("HEAD");
                                    httpURLConnection2.setConnectTimeout(10000);
                                    httpURLConnection2.setReadTimeout(10000);
                                    if (map != null) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                        }
                                    }
                                    try {
                                        try {
                                            httpURLConnection2.connect();
                                            int responseCode2 = httpURLConnection2.getResponseCode();
                                            String contentType2 = httpURLConnection2.getContentType();
                                            if (contentType2 == null) {
                                                contentType2 = "";
                                            }
                                            long contentLengthLong2 = httpURLConnection2.getContentLengthLong();
                                            String headerField3 = httpURLConnection2.getHeaderField("Accept-Ranges");
                                            if (headerField3 != null) {
                                                lowerCase2 = headerField3.toLowerCase(Locale.ROOT);
                                                lowerCase2.getClass();
                                            } else {
                                                lowerCase2 = null;
                                            }
                                            zA = kotlin.jvm.internal.l.a(lowerCase2, "bytes");
                                            kotlin.o oVar = com.app.mlounge.util.a.a;
                                            if (300 > responseCode2 || responseCode2 >= 400) {
                                                if (200 > responseCode2 || responseCode2 >= 300) {
                                                    zA = false;
                                                } else {
                                                    str2 = contentType2;
                                                    contentLengthLong = contentLengthLong2;
                                                }
                                                httpURLConnection2.disconnect();
                                                if (contentLengthLong <= 0 && !kotlin.text.k.T(str3, ".m3u8", false)) {
                                                    try {
                                                        URLConnection uRLConnectionOpenConnection2 = new URL(str3).openConnection();
                                                        uRLConnectionOpenConnection2.getClass();
                                                        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
                                                        httpURLConnection.setRequestMethod("GET");
                                                        httpURLConnection.setConnectTimeout(10000);
                                                        httpURLConnection.setReadTimeout(10000);
                                                        if (map != null) {
                                                            for (Map.Entry entry2 : map.entrySet()) {
                                                                httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                                            }
                                                        }
                                                        httpURLConnection.setRequestProperty("Range", "bytes=0-0");
                                                        httpURLConnection.connect();
                                                        responseCode = httpURLConnection.getResponseCode();
                                                        if ((200 > responseCode && responseCode < 300) || httpURLConnection.getResponseCode() == 206) {
                                                            contentType = httpURLConnection.getContentType();
                                                            if (contentType != null) {
                                                                str2 = contentType;
                                                            }
                                                            headerField = httpURLConnection.getHeaderField("Content-Range");
                                                            if (headerField != null && (lR = kotlin.text.r.R(kotlin.text.k.s0(headerField, "/", headerField))) != null) {
                                                                contentLengthLong = lR.longValue();
                                                            }
                                                            if (contentLengthLong <= 0) {
                                                                contentLengthLong = httpURLConnection.getContentLengthLong();
                                                            }
                                                            if (zA) {
                                                                z = true;
                                                            } else {
                                                                headerField2 = httpURLConnection.getHeaderField("Accept-Ranges");
                                                                if (headerField2 != null) {
                                                                    lowerCase = headerField2.toLowerCase(Locale.ROOT);
                                                                    lowerCase.getClass();
                                                                } else {
                                                                    lowerCase = null;
                                                                }
                                                                if (!kotlin.jvm.internal.l.a(lowerCase, "bytes") || httpURLConnection.getResponseCode() == 206) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                            }
                                                            try {
                                                                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                                                zA = z;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                zA = z;
                                                                kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                                                coil3.compose.internal.f.i("resolveStreamInfo (GET fallback) error: ", e.getMessage(), "CinemaHQ-Player");
                                                            }
                                                        }
                                                        httpURLConnection.disconnect();
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                    }
                                                }
                                                k0Var = new k0(str3, str2, contentLengthLong, zA);
                                                break;
                                            } else {
                                                String headerField4 = httpURLConnection2.getHeaderField("Location");
                                                if (headerField4 == null) {
                                                    httpURLConnection2.disconnect();
                                                } else {
                                                    if (!kotlin.text.r.O(headerField4, "http", false)) {
                                                        headerField4 = new URL(new URL(str3), headerField4).toString();
                                                        headerField4.getClass();
                                                    }
                                                    str3 = headerField4;
                                                    i20++;
                                                    httpURLConnection2.disconnect();
                                                    z2 = false;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            httpURLConnection2.disconnect();
                                            throw th;
                                        }
                                    } catch (Exception e3) {
                                        kotlin.o oVar4 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("CinemaHQ-Player", "resolveStreamInfo (HEAD) error: " + e3.getMessage());
                                        break;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            zA = false;
                            if (contentLengthLong <= 0) {
                                URLConnection uRLConnectionOpenConnection3 = new URL(str3).openConnection();
                                uRLConnectionOpenConnection3.getClass();
                                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection3;
                                httpURLConnection.setRequestMethod("GET");
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(10000);
                                if (map != null) {
                                    while (r4.hasNext()) {
                                        httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                }
                                httpURLConnection.setRequestProperty("Range", "bytes=0-0");
                                httpURLConnection.connect();
                                responseCode = httpURLConnection.getResponseCode();
                                if (200 > responseCode) {
                                    contentType = httpURLConnection.getContentType();
                                    if (contentType != null) {
                                        str2 = contentType;
                                    }
                                    headerField = httpURLConnection.getHeaderField("Content-Range");
                                    if (headerField != null) {
                                        contentLengthLong = lR.longValue();
                                    }
                                    if (contentLengthLong <= 0) {
                                        contentLengthLong = httpURLConnection.getContentLengthLong();
                                    }
                                    if (zA) {
                                        z = true;
                                    } else {
                                        headerField2 = httpURLConnection.getHeaderField("Accept-Ranges");
                                        if (headerField2 != null) {
                                            lowerCase = headerField2.toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                        } else {
                                            lowerCase = null;
                                        }
                                        if (kotlin.jvm.internal.l.a(lowerCase, "bytes")) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    kotlin.o oVar5 = com.app.mlounge.util.a.a;
                                    zA = z;
                                } else {
                                    contentType = httpURLConnection.getContentType();
                                    if (contentType != null) {
                                        str2 = contentType;
                                    }
                                    headerField = httpURLConnection.getHeaderField("Content-Range");
                                    if (headerField != null) {
                                        contentLengthLong = lR.longValue();
                                    }
                                    if (contentLengthLong <= 0) {
                                        contentLengthLong = httpURLConnection.getContentLengthLong();
                                    }
                                    if (zA) {
                                        z = true;
                                    } else {
                                        headerField2 = httpURLConnection.getHeaderField("Accept-Ranges");
                                        if (headerField2 != null) {
                                            lowerCase = headerField2.toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                        } else {
                                            lowerCase = null;
                                        }
                                        if (kotlin.jvm.internal.l.a(lowerCase, "bytes")) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    kotlin.o oVar6 = com.app.mlounge.util.a.a;
                                    zA = z;
                                }
                                httpURLConnection.disconnect();
                            }
                            k0Var = new k0(str3, str2, contentLengthLong, zA);
                        }
                    }
                    break;
                } else {
                    k0Var = new k0(str3, "application/vnd.apple.mpegurl", 0L, false);
                }
                return k0Var == aVar ? aVar : k0Var;
            case 13:
                z0 z0Var2 = (z0) this.z;
                com.app.mlounge.data.local.dao.m mVar3 = z0Var2.b;
                com.app.mlounge.data.local.entity.e eVar2 = (com.app.mlounge.data.local.entity.e) obj2;
                int i21 = this.y;
                if (i21 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    if (mVar3.a(eVar2, this) != aVar) {
                    }
                    return aVar;
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                if (eVar2.b() || eVar2.a() <= 0.95f) {
                    return yVar;
                }
                String str4 = z0Var2.m;
                this.y = 2;
                Object objA4 = com.google.android.gms.dynamite.g.A(mVar3.a, this, new r0(str4, i2), false, true);
                if (objA4 != aVar) {
                    objA4 = yVar;
                }
                if (objA4 != aVar) {
                    return yVar;
                }
                return aVar;
            case 14:
                z0 z0Var3 = (z0) obj2;
                int i22 = this.y;
                if (i22 != 0) {
                    if (i22 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                b1 b1Var = (b1) this.z;
                String str5 = b1Var.b;
                String str6 = b1Var.c;
                Context context = z0Var3.d;
                context.getClass();
                okhttp3.y yVar2 = z0Var3.r;
                ArrayList arrayList = z0Var3.k;
                this.y = 1;
                try {
                    if (kotlin.text.r.H(str5, ".zip", true)) {
                        okhttp3.a0 a0Var = new okhttp3.a0();
                        a0Var.d(str5);
                        okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                        if (yVar2 == null) {
                            okhttp3.x xVar = new okhttp3.x();
                            xVar.a(15L);
                            yVar2 = new okhttp3.y(xVar);
                        }
                        g0 g0VarE = new okhttp3.internal.connection.m(yVar2, b0Var, false).e();
                        try {
                            j0 j0Var = g0VarE.D;
                            j0Var.getClass();
                            byte[] bArrG = j0Var.g();
                            g0VarE.close();
                            File file = new File(context.getCacheDir(), "subs_" + System.currentTimeMillis());
                            file.mkdirs();
                            if (arrayList != null) {
                                arrayList.add(file);
                            }
                            ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArrG));
                            try {
                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                while (true) {
                                    if (nextEntry != null) {
                                        if (!nextEntry.isDirectory()) {
                                            List listQ = com.google.common.base.c.q(".srt", ".vtt", ".ass", ".ssa", ".sub");
                                            if (!listQ.isEmpty()) {
                                                Iterator it = listQ.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        String str7 = (String) it.next();
                                                        String name = nextEntry.getName();
                                                        name.getClass();
                                                        String lowerCase3 = name.toLowerCase(Locale.ROOT);
                                                        lowerCase3.getClass();
                                                        if (kotlin.text.r.H(lowerCase3, str7, false)) {
                                                            File file2 = new File(file, nextEntry.getName());
                                                            File parentFile = file2.getParentFile();
                                                            if (parentFile != null) {
                                                                parentFile.mkdirs();
                                                            }
                                                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                            try {
                                                                com.google.android.material.textfield.p.h(zipInputStream, fileOutputStream);
                                                                fileOutputStream.close();
                                                                Charset charset = kotlin.text.a.a;
                                                                charset.getClass();
                                                                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
                                                                try {
                                                                    strB = kotlin.collections.a0.B(inputStreamReader);
                                                                    inputStreamReader.close();
                                                                } catch (Throwable th2) {
                                                                    try {
                                                                        throw th2;
                                                                    } catch (Throwable th3) {
                                                                        com.google.common.base.b.d(inputStreamReader, th2);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } catch (Throwable th4) {
                                                                try {
                                                                    throw th4;
                                                                } catch (Throwable th5) {
                                                                    com.google.common.base.b.d(fileOutputStream, th4);
                                                                    throw th5;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                    str = null;
                                                }
                                            }
                                        }
                                        zipInputStream.closeEntry();
                                        nextEntry = zipInputStream.getNextEntry();
                                    } else {
                                        strB = null;
                                    }
                                }
                                zipInputStream.close();
                                str = strB;
                            } catch (Throwable th6) {
                                try {
                                    throw th6;
                                } catch (Throwable th7) {
                                    com.google.common.base.b.d(zipInputStream, th6);
                                    throw th7;
                                }
                            }
                        } catch (Throwable th8) {
                            try {
                                throw th8;
                            } catch (Throwable th9) {
                                com.google.common.base.b.d(g0VarE, th8);
                                throw th9;
                            }
                        }
                    } else {
                        if (kotlin.text.r.O(str5, "content://", false)) {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(str5));
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    bArrA = com.google.android.material.textfield.p.t(inputStreamOpenInputStream);
                                    inputStreamOpenInputStream.close();
                                } catch (Throwable th10) {
                                    try {
                                        throw th10;
                                    } catch (Throwable th11) {
                                        com.google.common.base.b.d(inputStreamOpenInputStream, th10);
                                        throw th11;
                                    }
                                }
                            } else {
                                bArrA = null;
                            }
                        } else if (kotlin.text.r.O(str5, "/", false) || kotlin.text.r.O(str5, "file://", false)) {
                            bArrA = kotlin.io.j.A(new File(kotlin.text.k.j0(str5, "file://")));
                        } else {
                            okhttp3.a0 a0Var2 = new okhttp3.a0();
                            a0Var2.d(str5);
                            okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                            if (yVar2 == null) {
                                okhttp3.x xVar2 = new okhttp3.x();
                                xVar2.a(15L);
                                yVar2 = new okhttp3.y(xVar2);
                            }
                            g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                            try {
                                j0 j0Var2 = g0VarE2.D;
                                bArrA = j0Var2 != null ? j0Var2.g() : null;
                                g0VarE2.close();
                                break;
                            } catch (Throwable th12) {
                                try {
                                    throw th12;
                                } catch (Throwable th13) {
                                    com.google.common.base.b.d(g0VarE2, th12);
                                    throw th13;
                                }
                            }
                        }
                        if (bArrA == null) {
                            str = null;
                        } else {
                            try {
                                CharsetDecoder charsetDecoderNewDecoder = kotlin.text.a.a.newDecoder();
                                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                                strB = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArrA)).toString();
                                str = strB;
                            } catch (Exception unused2) {
                                str = new String(bArrA, n0.e(str6));
                            }
                        }
                    }
                } catch (Exception unused3) {
                }
                return str == aVar ? aVar : str;
            case 15:
                int i23 = this.y;
                if (i23 != 0) {
                    if (i23 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                int i24 = 5;
                Flow flowY3 = androidx.compose.runtime.s.y(new com.app.mlounge.ui.screens.adult.d((androidx.compose.foundation.lazy.grid.x) this.z, i24));
                androidx.compose.foundation.text.input.internal.a aVar2 = new androidx.compose.foundation.text.input.internal.a((com.app.mlounge.ui.viewmodel.y0) obj2, i24);
                this.y = 1;
                return flowY3.collect(aVar2, this) == aVar ? aVar : yVar;
            case 16:
                int i25 = this.y;
                if (i25 != 0) {
                    if (i25 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        kotlin.a.e(obj);
                    }
                    return null;
                }
                kotlin.a.e(obj);
                SharedFlow sharedFlow3 = ((r1) this.z).q;
                androidx.compose.foundation.text.input.internal.a aVar3 = new androidx.compose.foundation.text.input.internal.a((kotlin.jvm.functions.w) obj2, i2);
                this.y = 1;
                if (sharedFlow3.collect(aVar3, this) == aVar) {
                    return aVar;
                }
                com.google.gson.b.b();
                return null;
            case 17:
                int i26 = this.y;
                if (i26 != 0) {
                    if (i26 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        kotlin.a.e(obj);
                    }
                    return null;
                }
                kotlin.a.e(obj);
                SharedFlow sharedFlow4 = ((r1) this.z).z;
                com.app.mlounge.ui.screens.livetv.g gVar3 = new com.app.mlounge.ui.screens.livetv.g((Context) obj2, 2);
                this.y = 1;
                if (sharedFlow4.collect(gVar3, this) == aVar) {
                    return aVar;
                }
                com.google.gson.b.b();
                return null;
            case 18:
                int i27 = this.y;
                if (i27 != 0) {
                    if (i27 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowY4 = androidx.compose.runtime.s.y(new androidx.compose.foundation.lazy.e((androidx.compose.foundation.lazy.z) this.z, 2));
                androidx.compose.foundation.text.input.internal.a aVar4 = new androidx.compose.foundation.text.input.internal.a((x1) obj2, i3);
                this.y = 1;
                return flowY4.collect(aVar4, this) == aVar ? aVar : yVar;
            case 19:
                int i28 = this.y;
                if (i28 != 0) {
                    if (i28 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowY5 = androidx.compose.runtime.s.y(new com.app.mlounge.ui.screens.adult.d((androidx.compose.foundation.lazy.grid.x) this.z, i3));
                androidx.compose.foundation.text.input.internal.a aVar5 = new androidx.compose.foundation.text.input.internal.a((com.app.mlounge.ui.viewmodel.z1) obj2, 8);
                this.y = 1;
                return flowY5.collect(aVar5, this) == aVar ? aVar : yVar;
            case 20:
                return d(obj);
            case 21:
                return e(obj);
            case 22:
                com.app.mlounge.ui.viewmodel.g gVar4 = (com.app.mlounge.ui.viewmodel.g) obj2;
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
                HiAnimeAnimeData hiAnimeAnimeDataA = ((HiAnimeDetailData) this.z).a();
                if (hiAnimeAnimeDataA == null || (hiAnimeInfoA = hiAnimeAnimeDataA.a()) == null) {
                    return yVar;
                }
                String str8 = kotlin.jvm.internal.l.a(gVar4.r.getValue(), "movie") ? "anime_movie" : "anime_tv";
                com.app.mlounge.data.repository.x xVar3 = gVar4.c;
                String strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str8, "_", hiAnimeInfoA.b());
                String strC = hiAnimeInfoA.c();
                com.app.mlounge.data.local.entity.f fVar3 = new com.app.mlounge.data.local.entity.f(strI, str8, strC == null ? "" : strC, hiAnimeInfoA.d(), null, null, null, hiAnimeInfoA.a(), 0L, hiAnimeInfoA.b(), null, 1392);
                this.y = 1;
                return xVar3.f(fVar3, this) == aVar ? aVar : yVar;
            case 23:
                return f(obj);
            case 24:
                return g(obj);
            case 25:
                return h(obj);
            case 26:
                return i(obj);
            case 27:
                return j(obj);
            case 28:
                return k(obj);
            default:
                int i30 = this.y;
                try {
                    if (i30 == 0) {
                        kotlin.a.e(obj);
                        x1 x1Var = (x1) obj2;
                        mutableStateFlow = x1Var.o;
                        com.app.mlounge.data.repository.j0 j0Var3 = x1Var.b;
                        this.z = mutableStateFlow;
                        this.y = 1;
                        objE = j0Var3.e(this);
                        if (objE == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i30 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow = (MutableStateFlow) this.z;
                        kotlin.a.e(obj);
                        objE = obj;
                    }
                    mutableStateFlow.setValue(objE);
                    return yVar;
                } catch (Exception unused4) {
                    return yVar;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
    }
}
