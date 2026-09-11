package com.app.mlounge.ui.screens.movies;

import androidx.activity.compose.t;
import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.ui.viewmodel.b0;
import com.app.mlounge.ui.viewmodel.e0;
import com.app.mlounge.ui.viewmodel.h0;
import com.app.mlounge.ui.viewmodel.w1;
import com.app.mlounge.ui.viewmodel.x0;
import com.app.mlounge.ui.viewmodel.x1;
import com.app.mlounge.ui.viewmodel.y0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.a0;
import kotlin.collections.u;
import kotlin.collections.v;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.o;
import okhttp3.internal.http2.w;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        String[] strArrNames;
        long jA;
        int i = 0;
        int i2 = 1;
        Object[] objArr = 0;
        objArr = 0;
        switch (this.e) {
            case 0:
                e0 e0Var = (e0) this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(e0Var), null, null, new b0(e0Var, (TmdbMovieDetailResponse) this.z, objArr, i2), 3, null);
                return y.a;
            case 1:
                ((l) this.y).invoke(Integer.valueOf(((TmdbMovie) this.z).a()));
                return y.a;
            case 2:
                h0 h0Var = (h0) this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(h0Var), null, null, new androidx.room.coroutines.f(h0Var, (MusicAlbumDetail) this.z, objArr, 26), 3, null);
                return y.a;
            case 3:
                ((l) this.y).invoke((MusicTrack) this.z);
                return y.a;
            case 4:
                h0 h0Var2 = (h0) this.y;
                MusicTrack musicTrack = (MusicTrack) this.z;
                musicTrack.getClass();
                BuildersKt__Builders_commonKt.launch$default(l0.g(h0Var2), null, null, new com.app.mlounge.ui.screens.adult.e(h0Var2, musicTrack, objArr, 13), 3, null);
                return y.a;
            case 5:
                ((l) this.y).invoke(((MusicAlbum) this.z).d());
                return y.a;
            case 6:
                ((l) this.y).invoke(((MusicArtist) this.z).c());
                return y.a;
            case 7:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.y;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) this.z;
                aVar.invoke();
                aVar2.invoke();
                return y.a;
            case 8:
                y0 y0Var = (y0) this.y;
                String str = (String) this.z;
                str.getClass();
                MutableStateFlow mutableStateFlow = y0Var.L;
                if (!kotlin.jvm.internal.l.a(mutableStateFlow.getValue(), str)) {
                    mutableStateFlow.setValue(str);
                    y0Var.d.b(str);
                    String str2 = (String) y0Var.h.getValue();
                    if (str2.length() >= 2 && ((Number) y0Var.H.getValue()).intValue() == 5) {
                        Job job = y0Var.Q;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        y0Var.r.setValue(u.e);
                        y0Var.Q = BuildersKt__Builders_commonKt.launch$default(l0.g(y0Var), null, null, new x0(y0Var, str2, null, 2), 3, null);
                    }
                }
                return y.a;
            case 9:
                y0 y0Var2 = (y0) this.y;
                com.app.mlounge.data.repository.a aVar3 = (com.app.mlounge.data.repository.a) this.z;
                aVar3.getClass();
                MutableStateFlow mutableStateFlow2 = y0Var2.N;
                if (mutableStateFlow2.getValue() != aVar3) {
                    mutableStateFlow2.setValue(aVar3);
                    String str3 = (String) y0Var2.h.getValue();
                    if (str3.length() >= 2 && ((Number) y0Var2.H.getValue()).intValue() == 5) {
                        Job job2 = y0Var2.Q;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                        y0Var2.t.setValue(u.e);
                        y0Var2.Q = BuildersKt__Builders_commonKt.launch$default(l0.g(y0Var2), null, null, new x0(y0Var2, str3, null, 0), 3, null);
                    }
                }
                return y.a;
            case 10:
                t tVar = (t) this.y;
                ((androidx.compose.runtime.y0) this.z).setValue(null);
                tVar.a(null);
                return y.a;
            case 11:
                ((l) this.y).invoke((com.app.mlounge.ui.viewmodel.l) this.z);
                return y.a;
            case 12:
                x1 x1Var = (x1) this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(x1Var), null, null, new w1(x1Var, (TmdbTvDetailResponse) this.z, (kotlin.coroutines.d) objArr, i), 3, null);
                return y.a;
            case 13:
                ((l) this.y).invoke(Integer.valueOf(((TmdbTvShow) this.z).b()));
                return y.a;
            case 14:
                return ((kotlin.text.i) this.y).a((CharSequence) this.z);
            case 15:
                kotlinx.serialization.descriptors.e eVar = (kotlinx.serialization.descriptors.e) this.y;
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) this.z;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.a.getClass();
                kotlinx.serialization.json.internal.i.h(eVar, bVar);
                int iF = eVar.f();
                for (int i3 = 0; i3 < iF; i3++) {
                    List listH = eVar.h(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof o) {
                            arrayList.add(obj);
                        }
                    }
                    o oVar = (o) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (oVar != null && (strArrNames = oVar.names()) != null) {
                        for (String str4 : strArrNames) {
                            String str5 = kotlin.jvm.internal.l.a(eVar.e(), kotlinx.serialization.descriptors.g.z) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str4)) {
                                throw new kotlinx.serialization.e("The suggested name '" + str4 + "' for " + str5 + ' ' + eVar.g(i3) + " is already one of the names for " + str5 + ' ' + eVar.g(((Number) a0.r(str4, linkedHashMap)).intValue()) + " in " + eVar);
                            }
                            linkedHashMap.put(str4, Integer.valueOf(i3));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? v.e : linkedHashMap;
            case 16:
                okhttp3.internal.http2.o oVar2 = (okhttp3.internal.http2.o) this.y;
                w wVar = (w) this.z;
                try {
                    oVar2.e.b(wVar);
                    break;
                } catch (IOException e) {
                    okhttp3.internal.platform.e eVar2 = okhttp3.internal.platform.e.a;
                    okhttp3.internal.platform.e.a.i(4, "Http2Connection.Listener failure for " + oVar2.z, e);
                    try {
                        wVar.e(okhttp3.internal.http2.b.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return y.a;
            case 17:
                com.app.mlounge.ui.screens.downloads.e eVar3 = (com.app.mlounge.ui.screens.downloads.e) this.y;
                okhttp3.internal.http2.a0 a0Var = (okhttp3.internal.http2.a0) this.z;
                z zVar = new z();
                okhttp3.internal.http2.o oVar3 = (okhttp3.internal.http2.o) eVar3.z;
                synchronized (oVar3.U) {
                    synchronized (oVar3) {
                        try {
                            okhttp3.internal.http2.a0 a0Var2 = oVar3.P;
                            okhttp3.internal.http2.a0 a0Var3 = new okhttp3.internal.http2.a0();
                            a0Var2.getClass();
                            for (int i4 = 0; i4 < 10; i4++) {
                                if (((1 << i4) & a0Var2.a) != 0) {
                                    a0Var3.b(i4, a0Var2.b[i4]);
                                }
                            }
                            for (int i5 = 0; i5 < 10; i5++) {
                                if (((1 << i5) & a0Var.a) != 0) {
                                    a0Var3.b(i5, a0Var.b[i5]);
                                }
                            }
                            zVar.e = a0Var3;
                            jA = ((long) a0Var3.a()) - ((long) a0Var2.a());
                            if (jA != 0 && !oVar3.y.isEmpty()) {
                                objArr = (w[]) oVar3.y.values().toArray(new w[0]);
                            }
                            okhttp3.internal.http2.a0 a0Var4 = (okhttp3.internal.http2.a0) zVar.e;
                            a0Var4.getClass();
                            oVar3.P = a0Var4;
                            okhttp3.internal.concurrent.c.c(oVar3.G, oVar3.z + " onSettings", 0L, new g(18, oVar3, zVar), 6);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar3.U.a((okhttp3.internal.http2.a0) zVar.e);
                    } catch (IOException e2) {
                        okhttp3.internal.http2.b bVar2 = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                        oVar3.a(bVar2, bVar2, e2);
                    }
                    break;
                }
                if (objArr != 0) {
                    int length = objArr.length;
                    while (i < length) {
                        w wVar2 = objArr[i];
                        synchronized (wVar2) {
                            wVar2.B += jA;
                            if (jA > 0) {
                                wVar2.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return y.a;
            default:
                okhttp3.internal.http2.o oVar4 = (okhttp3.internal.http2.o) this.y;
                oVar4.e.a(oVar4, (okhttp3.internal.http2.a0) ((z) this.z).e);
                return y.a;
        }
    }

    public /* synthetic */ g(h0 h0Var, Object obj, Object obj2, int i) {
        this.e = i;
        this.y = h0Var;
        this.z = obj;
    }
}
