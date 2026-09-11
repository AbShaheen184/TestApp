package androidx.datastore.core;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.net.Uri;
import androidx.compose.foundation.gestures.h2;
import androidx.compose.runtime.t2;
import com.app.mlounge.MainActivity;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.appsalt.Appsalt;
import com.appsalt.internal.z1;
import io.hopmonsdk.Hopmn;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ t0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.lifecycle.p lifecycle;
        Object value;
        com.app.mlounge.ui.screens.player.o0 o0Var;
        int i = 11;
        int i2 = 3;
        int i3 = 0;
        kotlin.coroutines.d dVar = null;
        int i4 = 1;
        switch (this.e) {
            case 0:
                File file = (File) this.y;
                ProducerScope producerScope = (ProducerScope) this.z;
                kotlin.y yVar = kotlin.y.a;
                if (kotlin.jvm.internal.l.a((String) obj, file.getName())) {
                    ChannelsKt.trySendBlocking(producerScope, yVar);
                }
                return yVar;
            case 1:
                androidx.navigation.t tVar = (androidx.navigation.t) this.y;
                androidx.navigation.internal.f fVar = ((androidx.navigation.y) this.z).b;
                androidx.navigation.c0 c0Var = (androidx.navigation.c0) obj;
                c0Var.getClass();
                androidx.navigation.a0 a0Var = c0Var.a;
                a0Var.e = 0;
                a0Var.f = 0;
                if (tVar instanceof androidx.navigation.v) {
                    int i5 = androidx.navigation.t.B;
                    for (androidx.navigation.t tVar2 : androidx.navigation.f.b(tVar)) {
                        androidx.navigation.t tVarG = fVar.g();
                        if (kotlin.jvm.internal.l.a(tVar2, tVarG != null ? tVarG.z : null)) {
                        }
                    }
                    int i6 = androidx.navigation.v.D;
                    Iterator it = kotlin.sequences.k.o(fVar.h(), new androidx.compose.ui.text.y(18)).iterator();
                    if (!it.hasNext()) {
                        androidx.transition.k.m("Sequence is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    c0Var.d = ((androidx.navigation.t) next).y.a;
                    c0Var.f = false;
                    c0Var.g = true;
                }
                return kotlin.y.a;
            case 2:
                return new androidx.activity.compose.k(i, (t2) this.y, (androidx.navigation.compose.i) this.z);
            case 3:
                androidx.navigation.y yVar2 = (androidx.navigation.y) this.y;
                androidx.lifecycle.v vVar = (androidx.lifecycle.v) this.z;
                yVar2.getClass();
                vVar.getClass();
                androidx.navigation.internal.f fVar2 = yVar2.b;
                androidx.navigation.internal.d dVar2 = fVar2.s;
                if (!vVar.equals(fVar2.o)) {
                    androidx.lifecycle.v vVar2 = fVar2.o;
                    if (vVar2 != null && (lifecycle = vVar2.getLifecycle()) != null) {
                        lifecycle.b(dVar2);
                    }
                    fVar2.o = vVar;
                    vVar.getLifecycle().a(dVar2);
                }
                return new androidx.navigation.compose.v();
            case 4:
                SharedPreferences sharedPreferences = (SharedPreferences) this.y;
                MainActivity mainActivity = (MainActivity) this.z;
                ((Boolean) obj).getClass();
                int i7 = MainActivity.G;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("consent_asked", true);
                editorEdit.apply();
                mainActivity.B.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 5:
                com.app.mlounge.data.local.dao.i iVar = (com.app.mlounge.data.local.dao.i) this.y;
                com.app.mlounge.data.local.entity.b bVar = (com.app.mlounge.data.local.entity.b) this.z;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                iVar.b.x(aVar, bVar);
                return kotlin.y.a;
            case 6:
                com.app.mlounge.data.local.dao.j jVar = (com.app.mlounge.data.local.dao.j) this.y;
                List list = (List) this.z;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                jVar.b.w(aVar2, list);
                return kotlin.y.a;
            case 7:
                com.app.mlounge.data.local.dao.j jVar2 = (com.app.mlounge.data.local.dao.j) this.y;
                com.app.mlounge.data.local.entity.c cVar = (com.app.mlounge.data.local.entity.c) this.z;
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                jVar2.b.x(aVar3, cVar);
                return kotlin.y.a;
            case 8:
                com.app.mlounge.data.local.dao.l lVar = (com.app.mlounge.data.local.dao.l) this.y;
                List list2 = (List) this.z;
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                lVar.b.w(aVar4, list2);
                return kotlin.y.a;
            case 9:
                com.app.mlounge.data.local.dao.m mVar = (com.app.mlounge.data.local.dao.m) this.y;
                com.app.mlounge.data.local.entity.e eVar = (com.app.mlounge.data.local.entity.e) this.z;
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                androidx.media3.common.util.b bVar2 = mVar.b;
                bVar2.getClass();
                try {
                    ((com.app.mlounge.data.local.dao.e) bVar2.y).x(aVar5, eVar);
                    break;
                } catch (SQLException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        throw e;
                    }
                    if (!kotlin.text.k.T(message, "unique", true) && !kotlin.text.k.T(message, "2067", false) && !kotlin.text.k.T(message, "1555", false)) {
                        throw e;
                    }
                    ((com.app.mlounge.data.local.dao.f) bVar2.z).B(aVar5, eVar);
                }
                return kotlin.y.a;
            case 10:
                com.app.mlounge.data.local.dao.n nVar = (com.app.mlounge.data.local.dao.n) this.y;
                List list3 = (List) this.z;
                androidx.sqlite.a aVar6 = (androidx.sqlite.a) obj;
                aVar6.getClass();
                nVar.b.w(aVar6, list3);
                return kotlin.y.a;
            case 11:
                com.app.mlounge.data.local.dao.n nVar2 = (com.app.mlounge.data.local.dao.n) this.y;
                com.app.mlounge.data.local.entity.f fVar3 = (com.app.mlounge.data.local.entity.f) this.z;
                androidx.sqlite.a aVar7 = (androidx.sqlite.a) obj;
                aVar7.getClass();
                nVar2.b.x(aVar7, fVar3);
                return kotlin.y.a;
            case 12:
                ArrayList arrayList = (ArrayList) this.y;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.z;
                androidx.compose.foundation.lazy.k kVar = (androidx.compose.foundation.lazy.k) obj;
                kVar.getClass();
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (hashSet.add(((HiAnimeItem) obj2).b())) {
                        arrayList2.add(obj2);
                    }
                }
                List listG0 = kotlin.collections.o.g0(15, arrayList2);
                kVar.q(listG0.size(), new androidx.compose.foundation.text.c0(6, new androidx.compose.ui.text.x(28), listG0), new com.app.mlounge.ui.screens.adult.g(2, listG0), new androidx.compose.runtime.internal.f(2039820996, true, new com.app.mlounge.ui.screens.adult.h(listG0, lVar2, i4)));
                return kotlin.y.a;
            case 13:
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) this.y;
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.z;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                hVar.q(((List) y0Var.getValue()).size(), new h2(y0Var, 8), androidx.compose.foundation.lazy.grid.q.e, new androidx.compose.runtime.internal.f(-1388308873, true, new com.app.mlounge.ui.s(i4, pVar, y0Var)));
                return kotlin.y.a;
            case 14:
                com.app.mlounge.ui.viewmodel.a0 a0Var2 = (com.app.mlounge.ui.viewmodel.a0) this.y;
                kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.z;
                IptvChannel iptvChannel = (IptvChannel) obj;
                iptvChannel.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(a0Var2), null, null, new com.app.mlounge.ui.viewmodel.v(a0Var2, iptvChannel, dVar, i3), 3, null);
                rVar.invoke(iptvChannel.f(), iptvChannel.c(), null, null);
                return kotlin.y.a;
            case 15:
                Context context = (Context) this.y;
                com.app.mlounge.ui.screens.player.z0 z0Var = (com.app.mlounge.ui.screens.player.z0) this.z;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        context.getContentResolver().takePersistableUriPermission(uri, 1);
                        break;
                    } catch (Exception unused) {
                    }
                    String string = uri.toString();
                    string.getClass();
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        lastPathSegment = "Custom Subtitle";
                    }
                    com.app.mlounge.ui.screens.player.b1 b1Var = new com.app.mlounge.ui.screens.player.b1(lastPathSegment, string, "en", false, 0, 0, null, 496);
                    MutableStateFlow mutableStateFlow = z0Var.e;
                    do {
                        value = mutableStateFlow.getValue();
                        o0Var = (com.app.mlounge.ui.screens.player.o0) value;
                    } while (!mutableStateFlow.compareAndSet(value, com.app.mlounge.ui.screens.player.o0.a(o0Var, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, kotlin.collections.o.W(o0Var.m, b1Var), null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -4097, 3)));
                    z0Var.h(b1Var);
                    z0Var.j("subtitle", false);
                }
                return kotlin.y.a;
            case 16:
                List list4 = (List) this.y;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.z;
                androidx.compose.foundation.lazy.k kVar2 = (androidx.compose.foundation.lazy.k) obj;
                kVar2.getClass();
                kVar2.q(list4.size(), null, new com.app.mlounge.ui.screens.adult.g(11, list4), new androidx.compose.runtime.internal.f(2039820996, true, new com.app.mlounge.ui.screens.adult.h(list4, lVar3, i2)));
                return kotlin.y.a;
            case 17:
                com.app.mlounge.ui.viewmodel.k1 k1Var = (com.app.mlounge.ui.viewmodel.k1) this.y;
                Context context2 = (Context) this.z;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(k1Var), null, null, new com.app.mlounge.ui.viewmodel.f1(k1Var, zBooleanValue, dVar, 10), 3, null);
                if (!zBooleanValue) {
                    boolean z = com.app.mlounge.util.c.a;
                    Appsalt.Companion.optOut();
                    Context applicationContext = context2.getApplicationContext();
                    applicationContext.getClass();
                    Application application = (Application) applicationContext;
                    com.app.mlounge.util.c.c(application).reportUserConsent(Hopmn.ConsentChoice.NONE);
                    if (com.app.mlounge.util.c.a) {
                        com.app.mlounge.util.c.a = false;
                        try {
                            com.app.mlounge.util.c.c(application).stop();
                            kotlin.o oVar = com.app.mlounge.util.a.a;
                        } catch (Exception e2) {
                            com.app.mlounge.util.a.b("SdkHelper", "Failed to stop Hopmn SDK", e2);
                        }
                    }
                    break;
                } else {
                    com.app.mlounge.util.c.a();
                    Context applicationContext2 = context2.getApplicationContext();
                    applicationContext2.getClass();
                    Application application2 = (Application) applicationContext2;
                    com.app.mlounge.util.c.c(application2).reportUserConsent(Hopmn.ConsentChoice.BANDWIDTH);
                    com.app.mlounge.util.c.f(application2);
                }
                return kotlin.y.a;
            case 18:
                Context context3 = (Context) this.y;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) this.z;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    try {
                        context3.getContentResolver().takePersistableUriPermission(uri2, 3);
                        String string2 = uri2.toString();
                        string2.getClass();
                        lVar4.invoke(string2);
                    } catch (Exception e3) {
                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("Settings", "Failed to take persistable permission: " + e3.getMessage());
                        String string3 = uri2.toString();
                        string3.getClass();
                        lVar4.invoke(string3);
                    }
                    break;
                }
                return kotlin.y.a;
            case 19:
                z1 z1Var = (z1) this.y;
                com.appsalt.internal.j0 j0Var = (com.appsalt.internal.j0) this.z;
                Throwable th = (Throwable) obj;
                z1Var.stop();
                j0Var.g = th;
                ((kotlin.jvm.functions.l) j0Var.f).invoke(th);
                return kotlin.y.a;
            case 20:
                com.google.firebase.heartbeatinfo.h hVar2 = (com.google.firebase.heartbeatinfo.h) this.y;
                String str = (String) this.z;
                androidx.datastore.preferences.core.a aVar8 = (androidx.datastore.preferences.core.a) obj;
                aVar8.e(com.google.firebase.heartbeatinfo.h.d, str);
                hVar2.d(aVar8, str);
                return null;
            case 21:
                return HandlerContext.scheduleResumeAfterDelay$lambda$2((HandlerContext) this.y, (androidx.media3.ui.c0) this.z, (Throwable) obj);
            case 22:
                return FutureKt.asCompletableFuture$lambda$1((CompletableFuture) this.y, (Deferred) this.z, (Throwable) obj);
            default:
                okhttp3.internal.cache.h hVar3 = (okhttp3.internal.cache.h) this.y;
                androidx.compose.foundation.lazy.layout.b1 b1Var2 = (androidx.compose.foundation.lazy.layout.b1) this.z;
                ((IOException) obj).getClass();
                synchronized (hVar3) {
                    b1Var2.f();
                }
                return kotlin.y.a;
        }
    }
}
