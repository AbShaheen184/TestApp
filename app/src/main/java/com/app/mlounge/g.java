package com.app.mlounge;

import android.app.ActivityManager;
import android.content.Context;
import androidx.compose.foundation.s0;
import androidx.room.w;
import com.app.mlounge.data.anime.AnikotoScraper;
import com.app.mlounge.data.iptv.c0;
import com.app.mlounge.data.local.AppDatabase;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.providers.e1;
import com.app.mlounge.data.providers.l1;
import com.app.mlounge.data.providers.s;
import com.app.mlounge.data.remote.api.ChqApi;
import com.app.mlounge.data.remote.api.NtvApi;
import com.app.mlounge.data.remote.api.TmdbApi;
import com.app.mlounge.data.remote.debrid.AllDebridApi;
import com.app.mlounge.data.remote.debrid.AllDebridManager;
import com.app.mlounge.data.remote.debrid.PremiumizeApi;
import com.app.mlounge.data.remote.debrid.PremiumizeManager;
import com.app.mlounge.data.remote.debrid.RealDebridApi;
import com.app.mlounge.data.remote.debrid.RealDebridManager;
import com.app.mlounge.data.remote.debrid.TorBoxApi;
import com.app.mlounge.data.remote.debrid.TorBoxManager;
import com.app.mlounge.data.remote.trakt.TraktApi;
import com.app.mlounge.data.remote.trakt.TraktManager;
import com.app.mlounge.data.remote.trakt.TraktSyncManager;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.data.repository.m0;
import com.app.mlounge.data.repository.q0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.v;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.x;
import okhttp3.y;
import okhttp3.z;
import org.mozilla.javascript.Token;
import retrofit2.t0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements dagger.internal.d {
    public final h a;
    public final int b;

    public g(h hVar, int i) {
        this.a = hVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x06e1 A[LOOP:2: B:131:0x06a3->B:144:0x06e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:284:0x06ec A[SYNTHETIC] */
    @Override // javax.inject.a
    public final Object get() {
        String name;
        androidx.emoji2.text.g gVarC;
        boolean zContainsKey;
        boolean z;
        int i;
        int i2;
        dagger.internal.b bVar;
        okhttp3.logging.a aVar = okhttp3.logging.a.e;
        z zVar = z.HTTP_1_1;
        int i3 = this.b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        androidx.sqlite.db.a aVar2 = null;
        switch (i3) {
            case 0:
                return new PremiumizeManager((PremiumizeApi) this.a.e.get(), (y1) this.a.f.get());
            case 1:
                t0 t0Var = (t0) this.a.d.get();
                t0Var.getClass();
                Object objB = t0Var.b(PremiumizeApi.class);
                objB.getClass();
                return (PremiumizeApi) objB;
            case 2:
                y yVar = (y) this.a.c.get();
                yVar.getClass();
                com.google.firebase.messaging.o oVar = new com.google.firebase.messaging.o(25);
                oVar.j("https://www.premiumize.me/api/");
                oVar.y = yVar;
                oVar.g(retrofit2.converter.gson.a.c());
                return oVar.l();
            case 3:
                Context context = this.a.a.a;
                okhttp3.logging.c cVar = new okhttp3.logging.c();
                cVar.d = aVar;
                okhttp3.f fVar = new okhttp3.f(new File(context.getCacheDir(), "http_cache"));
                List listQ = com.google.common.base.c.q(okhttp3.l.e, okhttp3.l.f, okhttp3.l.g);
                x xVar = new x();
                xVar.b = new com.google.android.material.internal.b(20);
                xVar.b(com.google.common.base.c.p(zVar));
                if (!listQ.equals(xVar.s)) {
                    xVar.E = null;
                }
                xVar.s = okhttp3.internal.g.j(listQ);
                xVar.c.add(new com.app.mlounge.di.a(1));
                xVar.c.add(cVar);
                xVar.l = fVar;
                xVar.a(15L);
                xVar.c(20L);
                timeUnit.getClass();
                xVar.A = okhttp3.internal.g.b("timeout", 20L);
                return new y(xVar);
            case 4:
                return new y1(this.a.a.a);
            case 5:
                return new TorBoxManager((TorBoxApi) this.a.i.get(), (y1) this.a.f.get());
            case 6:
                t0 t0Var2 = (t0) this.a.h.get();
                t0Var2.getClass();
                Object objB2 = t0Var2.b(TorBoxApi.class);
                objB2.getClass();
                return (TorBoxApi) objB2;
            case 7:
                y yVar2 = (y) this.a.c.get();
                yVar2.getClass();
                com.google.firebase.messaging.o oVar2 = new com.google.firebase.messaging.o(25);
                oVar2.j("https://api.torbox.app/");
                oVar2.y = yVar2;
                oVar2.g(retrofit2.converter.gson.a.c());
                return oVar2.l();
            case 8:
                h hVar = this.a;
                Context context2 = hVar.a.a;
                AppDatabase appDatabase = (AppDatabase) hVar.k.get();
                appDatabase.getClass();
                com.app.mlounge.data.local.dao.g gVarK = appDatabase.k();
                com.google.android.material.sidesheet.b.g(gVarK);
                return new com.app.mlounge.data.download.h(context2, gVarK, (y1) this.a.f.get(), (y) this.a.c.get());
            case 9:
                Context context3 = this.a.a.a;
                if (kotlin.text.k.d0("cinemahq_db")) {
                    net.luminis.tls.engine.impl.c.o("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                androidx.collection.internal.b bVar2 = new androidx.collection.internal.b(3);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                ArrayList arrayList3 = new ArrayList();
                kotlin.jvm.internal.e eVarA = a0.a(AppDatabase.class);
                com.app.mlounge.data.local.a[] aVarArr = {AppDatabase.k};
                aVarArr[0].getClass();
                linkedHashSet2.add(7);
                linkedHashSet2.add(8);
                boolean z2 = true;
                for (com.app.mlounge.data.local.a aVar3 : (com.app.mlounge.data.local.a[]) Arrays.copyOf(aVarArr, 1)) {
                    bVar2.c(aVar3);
                }
                androidx.arch.core.executor.a aVar4 = androidx.arch.core.executor.b.n;
                if (!linkedHashSet2.isEmpty()) {
                    Iterator it = linkedHashSet2.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                            return null;
                        }
                    }
                }
                com.google.firebase.heartbeatinfo.e eVar = new com.google.firebase.heartbeatinfo.e();
                Object systemService = context3.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                androidx.room.a aVar5 = new androidx.room.a(context3, "cinemahq_db", eVar, bVar2, arrayList, false, (activityManager == null || activityManager.isLowRamDevice()) ? androidx.room.p.e : androidx.room.p.y, aVar4, aVar4, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
                Class clsA = eVarA.a();
                clsA.getClass();
                Package r4 = clsA.getPackage();
                if (r4 == null || (name = r4.getName()) == null) {
                    name = "";
                }
                String canonicalName = clsA.getCanonicalName();
                canonicalName.getClass();
                if (name.length() != 0) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strReplace = canonicalName.replace('.', '_');
                strReplace.getClass();
                String strConcat = strReplace.concat("_Impl");
                try {
                    Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
                    cls.getClass();
                    androidx.room.q qVar = (androidx.room.q) cls.getDeclaredConstructor(null).newInstance(null);
                    qVar.getClass();
                    qVar.j = true;
                    try {
                        gVarC = qVar.c();
                        gVarC.getClass();
                    } catch (kotlin.j unused) {
                        gVarC = null;
                    }
                    if (gVarC == null) {
                        new androidx.constraintlayout.core.widgets.analyzer.e(aVar5, new androidx.compose.ui.text.y(qVar), new s0(2, qVar, androidx.room.r.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 2));
                        throw null;
                    }
                    qVar.e = new androidx.constraintlayout.core.widgets.analyzer.e(aVar5, gVarC, new s0(2, qVar, androidx.room.r.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3));
                    qVar.f = qVar.b();
                    androidx.collection.internal.b bVar3 = aVar5.d;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Set setE = qVar.e();
                    List list = aVar5.m;
                    int size = list.size();
                    boolean[] zArr = new boolean[size];
                    Iterator it2 = setE.iterator();
                    while (true) {
                        int i4 = -1;
                        if (!it2.hasNext()) {
                            boolean z3 = z2;
                            int size2 = list.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i5 = size2 - 1;
                                    if (size2 >= size || !zArr[size2]) {
                                        net.luminis.tls.engine.impl.c.o("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                        return null;
                                    }
                                    if (i5 >= 0) {
                                        size2 = i5;
                                    }
                                }
                            }
                            for (com.app.mlounge.data.local.a aVar6 : qVar.a(linkedHashMap)) {
                                aVar6.getClass();
                                LinkedHashMap linkedHashMap2 = bVar3.a;
                                if (linkedHashMap2.containsKey(7)) {
                                    Map map = (Map) linkedHashMap2.get(7);
                                    if (map == null) {
                                        map = v.e;
                                    }
                                    zContainsKey = map.containsKey(8);
                                } else {
                                    zContainsKey = false;
                                }
                                if (!zContainsKey) {
                                    bVar3.c(aVar6);
                                }
                            }
                            LinkedHashMap linkedHashMapF = qVar.f();
                            List list2 = aVar5.l;
                            boolean[] zArr2 = new boolean[list2.size()];
                            for (Map.Entry entry : linkedHashMapF.entrySet()) {
                                kotlin.reflect.c cVar2 = (kotlin.reflect.c) entry.getKey();
                                for (kotlin.reflect.c cVar3 : (List) entry.getValue()) {
                                    int size3 = list2.size() - 1;
                                    if (size3 >= 0) {
                                        while (true) {
                                            int i6 = size3 - 1;
                                            if (((kotlin.jvm.internal.e) cVar3).d(list2.get(size3))) {
                                                zArr2[size3] = z3;
                                            } else if (i6 < 0) {
                                                size3 = -1;
                                            } else {
                                                size3 = i6;
                                            }
                                        }
                                    } else {
                                        size3 = -1;
                                    }
                                    if (size3 < 0) {
                                        throw new IllegalArgumentException(("A required type converter (" + ((kotlin.jvm.internal.e) cVar3).b() + ") for " + ((kotlin.jvm.internal.e) cVar2).b() + " is missing in the database configuration.").toString());
                                    }
                                    Object obj = list2.get(size3);
                                    cVar3.getClass();
                                    obj.getClass();
                                    qVar.i.put(cVar3, obj);
                                }
                            }
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i7 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        net.luminis.tls.engine.impl.c.d(list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                        return null;
                                    }
                                    if (i7 >= 0) {
                                        size4 = i7;
                                    }
                                }
                            }
                            qVar.c = aVar5.g;
                            qVar.d = new w(aVar5.h);
                            Executor executor = qVar.c;
                            if (executor == null) {
                                kotlin.jvm.internal.l.f("internalQueryExecutor");
                                throw null;
                            }
                            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executor).plus(SupervisorKt.SupervisorJob$default((Job) null, z3 ? 1 : 0, (Object) null)));
                            qVar.a = CoroutineScope;
                            if (CoroutineScope == null) {
                                kotlin.jvm.internal.l.f("coroutineScope");
                                throw null;
                            }
                            kotlin.coroutines.i coroutineContext = CoroutineScope.getCoroutineContext();
                            w wVar = qVar.d;
                            if (wVar == null) {
                                kotlin.jvm.internal.l.f("internalTransactionExecutor");
                                throw null;
                            }
                            qVar.b = coroutineContext.plus(ExecutorsKt.from(wVar));
                            androidx.constraintlayout.core.widgets.analyzer.e eVar2 = qVar.e;
                            if (eVar2 == null) {
                                kotlin.jvm.internal.l.f("connectionManager");
                                throw null;
                            }
                            androidx.sqlite.db.a delegate = (androidx.sqlite.db.a) eVar2.h;
                            if (delegate == null) {
                                delegate = null;
                            } else {
                                while (!(delegate instanceof androidx.room.support.b)) {
                                    if (delegate instanceof androidx.room.b) {
                                        delegate = ((androidx.room.b) delegate).getDelegate();
                                    } else {
                                        delegate = null;
                                    }
                                }
                            }
                            androidx.constraintlayout.core.widgets.analyzer.e eVar3 = qVar.e;
                            if (eVar3 == null) {
                                kotlin.jvm.internal.l.f("connectionManager");
                                throw null;
                            }
                            androidx.sqlite.db.a delegate2 = (androidx.sqlite.db.a) eVar3.h;
                            if (delegate2 != null) {
                                while (!(delegate2 instanceof androidx.room.support.a)) {
                                    if (delegate2 instanceof androidx.room.b) {
                                        delegate2 = ((androidx.room.b) delegate2).getDelegate();
                                    }
                                }
                                aVar2 = delegate2;
                            }
                            return (AppDatabase) qVar;
                        }
                        kotlin.reflect.c cVar4 = (kotlin.reflect.c) it2.next();
                        int size5 = list.size() - 1;
                        if (size5 >= 0) {
                            while (true) {
                                int i8 = size5;
                                size5 = i8 - 1;
                                i = i4;
                                z = z2;
                                if (((kotlin.jvm.internal.e) cVar4).d(list.get(i8))) {
                                    zArr[i8] = z;
                                    i2 = i8;
                                } else if (size5 >= 0) {
                                    i4 = i;
                                    z2 = z;
                                }
                            }
                            if (i2 >= 0) {
                                androidx.media3.exoplayer.hls.playlist.a.g(((kotlin.jvm.internal.e) cVar4).b(), ") is missing in the database configuration.", "A required auto migration spec (");
                                return null;
                            }
                            linkedHashMap.put(cVar4, list.get(i2));
                            z2 = z;
                        } else {
                            z = z2;
                            i = -1;
                        }
                        i2 = i;
                        if (i2 >= 0) {
                            androidx.media3.exoplayer.hls.playlist.a.g(((kotlin.jvm.internal.e) cVar4).b(), ") is missing in the database configuration.", "A required auto migration spec (");
                            return null;
                        }
                        linkedHashMap.put(cVar4, list.get(i2));
                        z2 = z;
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e3);
                }
                break;
                break;
            case 10:
                h hVar2 = this.a;
                Context context4 = hVar2.a.a;
                y yVar3 = (y) hVar2.c.get();
                com.app.mlounge.data.local.dao.k kVarA = this.a.a();
                yVar3.getClass();
                return new c0(context4, yVar3, kVarA);
            case 11:
                Context context5 = this.a.a.a;
                okhttp3.logging.c cVar5 = new okhttp3.logging.c();
                cVar5.d = aVar;
                okhttp3.f fVar2 = new okhttp3.f(new File(context5.getCacheDir(), "image_http_cache"));
                List listQ2 = com.google.common.base.c.q(okhttp3.l.e, okhttp3.l.f, okhttp3.l.g);
                x xVar2 = new x();
                xVar2.b = new com.google.android.material.internal.b(20);
                xVar2.b(com.google.common.base.c.p(zVar));
                if (!listQ2.equals(xVar2.s)) {
                    xVar2.E = null;
                }
                xVar2.s = okhttp3.internal.g.j(listQ2);
                xVar2.c.add(new com.app.mlounge.di.a(0));
                xVar2.c.add(cVar5);
                xVar2.l = fVar2;
                xVar2.a(15L);
                xVar2.c(20L);
                timeUnit.getClass();
                xVar2.A = okhttp3.internal.g.b("timeout", 20L);
                return new y(xVar2);
            case 12:
                return new com.app.mlounge.data.repository.r((ChqApi) this.a.p.get(), (s) this.a.q.get(), (com.app.mlounge.data.providers.q) this.a.r.get(), (e1) this.a.s.get(), (com.app.mlounge.data.providers.v) this.a.v.get(), (y1) this.a.f.get(), (PremiumizeManager) this.a.g.get(), (TorBoxManager) this.a.j.get(), (AllDebridManager) this.a.y.get(), (RealDebridManager) this.a.B.get(), (AnikotoScraper) this.a.C.get(), (j0) this.a.F.get(), (y) this.a.c.get(), (l1) this.a.u.get(), this.a.a.a);
            case 13:
                t0 t0Var3 = (t0) this.a.o.get();
                t0Var3.getClass();
                Object objB3 = t0Var3.b(ChqApi.class);
                objB3.getClass();
                return (ChqApi) objB3;
            case 14:
                y yVar4 = (y) this.a.c.get();
                yVar4.getClass();
                com.google.firebase.messaging.o oVar3 = new com.google.firebase.messaging.o(25);
                oVar3.j("https://chq-api.ddns.me/");
                oVar3.y = yVar4;
                oVar3.g(retrofit2.converter.gson.a.c());
                return oVar3.l();
            case 15:
                y yVar5 = (y) this.a.c.get();
                yVar5.getClass();
                return new s(yVar5);
            case 16:
                y yVar6 = (y) this.a.c.get();
                yVar6.getClass();
                return new com.app.mlounge.data.providers.q(yVar6);
            case 17:
                y yVar7 = (y) this.a.c.get();
                Context context6 = this.a.a.a;
                yVar7.getClass();
                return new e1(context6, yVar7);
            case 18:
                y yVar8 = (y) this.a.c.get();
                l1 l1Var = (l1) this.a.u.get();
                yVar8.getClass();
                l1Var.getClass();
                return new com.app.mlounge.data.providers.v(yVar8, l1Var);
            case 19:
                y yVar9 = (y) this.a.t.get();
                yVar9.getClass();
                return new l1(yVar9);
            case 20:
                okhttp3.logging.c cVar6 = new okhttp3.logging.c(new androidx.transition.k(8));
                cVar6.d = okhttp3.logging.a.z;
                x xVar3 = new x();
                xVar3.c.add(new com.app.mlounge.di.a(2));
                xVar3.c.add(cVar6);
                xVar3.d.add(new com.app.mlounge.di.a(3));
                xVar3.b(com.google.common.base.c.p(zVar));
                xVar3.a(30L);
                xVar3.c(30L);
                timeUnit.getClass();
                xVar3.A = okhttp3.internal.g.b("timeout", 30L);
                return new y(xVar3);
            case 21:
                return new AllDebridManager((AllDebridApi) this.a.x.get(), (y1) this.a.f.get());
            case 22:
                t0 t0Var4 = (t0) this.a.w.get();
                t0Var4.getClass();
                Object objB4 = t0Var4.b(AllDebridApi.class);
                objB4.getClass();
                return (AllDebridApi) objB4;
            case 23:
                y yVar10 = (y) this.a.c.get();
                yVar10.getClass();
                com.google.firebase.messaging.o oVar4 = new com.google.firebase.messaging.o(25);
                oVar4.j("https://api.alldebrid.com/");
                oVar4.y = yVar10;
                oVar4.g(retrofit2.converter.gson.a.c());
                return oVar4.l();
            case 24:
                return new RealDebridManager((RealDebridApi) this.a.A.get(), (y1) this.a.f.get());
            case 25:
                t0 t0Var5 = (t0) this.a.z.get();
                t0Var5.getClass();
                Object objB5 = t0Var5.b(RealDebridApi.class);
                objB5.getClass();
                return (RealDebridApi) objB5;
            case 26:
                y yVar11 = (y) this.a.c.get();
                yVar11.getClass();
                com.google.firebase.messaging.o oVar5 = new com.google.firebase.messaging.o(25);
                oVar5.j("https://api.real-debrid.com/");
                oVar5.y = yVar11;
                oVar5.g(retrofit2.converter.gson.a.c());
                return oVar5.l();
            case 27:
                y yVar12 = (y) this.a.c.get();
                yVar12.getClass();
                return new AnikotoScraper(yVar12);
            case 28:
                return new j0((TmdbApi) this.a.E.get());
            case 29:
                t0 t0Var6 = (t0) this.a.D.get();
                t0Var6.getClass();
                Object objB6 = t0Var6.b(TmdbApi.class);
                objB6.getClass();
                return (TmdbApi) objB6;
            case 30:
                y yVar13 = (y) this.a.t.get();
                yVar13.getClass();
                com.google.firebase.messaging.o oVar6 = new com.google.firebase.messaging.o(25);
                oVar6.j("https://api.themoviedb.org/3/");
                oVar6.y = yVar13;
                oVar6.g(retrofit2.converter.gson.a.c());
                return oVar6.l();
            case 31:
                return new com.app.mlounge.data.remote.ntv.l((y) this.a.c.get());
            case 32:
                AppDatabase appDatabase2 = (AppDatabase) this.a.k.get();
                appDatabase2.getClass();
                com.app.mlounge.data.local.dao.n nVarP = appDatabase2.p();
                com.google.android.material.sidesheet.b.g(nVarP);
                AppDatabase appDatabase3 = (AppDatabase) this.a.k.get();
                appDatabase3.getClass();
                com.app.mlounge.data.local.dao.j jVarM = appDatabase3.m();
                com.google.android.material.sidesheet.b.g(jVarM);
                dagger.internal.d dVar = this.a.M;
                if (dVar instanceof dagger.internal.b) {
                    bVar = (dagger.internal.b) dVar;
                } else {
                    dVar.getClass();
                    bVar = new dagger.internal.b(dVar);
                }
                return new com.app.mlounge.data.repository.x(nVarP, jVarM, bVar);
            case Token.GETPROP /* 33 */:
                return new TraktSyncManager((TraktManager) this.a.K.get(), (com.app.mlounge.data.repository.x) this.a.L.get(), (j0) this.a.F.get());
            case Token.GETPROPNOWARN /* 34 */:
                return new TraktManager((TraktApi) this.a.J.get(), (y1) this.a.f.get());
            case 35:
                t0 t0Var7 = (t0) this.a.I.get();
                t0Var7.getClass();
                Object objB7 = t0Var7.b(TraktApi.class);
                objB7.getClass();
                return (TraktApi) objB7;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                y yVar14 = (y) this.a.c.get();
                yVar14.getClass();
                x xVarA = yVar14.a();
                xVarA.c.add(new com.app.mlounge.di.a(4));
                y yVar15 = new y(xVarA);
                com.google.firebase.messaging.o oVar7 = new com.google.firebase.messaging.o(25);
                oVar7.j("https://api.trakt.tv/");
                oVar7.y = yVar15;
                oVar7.g(retrofit2.converter.gson.a.c());
                return oVar7.l();
            case Token.SETPROP /* 37 */:
                return new com.app.mlounge.data.local.prefs.a();
            case Token.SETPROP_SUPER /* 38 */:
                return new m0(this.a.b());
            case Token.GETELEM /* 39 */:
                AppDatabase appDatabase4 = (AppDatabase) this.a.k.get();
                appDatabase4.getClass();
                com.app.mlounge.data.local.dao.j jVarM2 = appDatabase4.m();
                com.google.android.material.sidesheet.b.g(jVarM2);
                return new q0(jVarM2, this.a.b());
            case Token.GETELEM_SUPER /* 40 */:
                h hVar3 = this.a;
                Context context7 = hVar3.a.a;
                y yVar16 = (y) hVar3.c.get();
                com.app.mlounge.data.local.dao.k kVarA2 = this.a.a();
                yVar16.getClass();
                return new com.app.mlounge.data.iptv.l(context7, yVar16, kVarA2);
            case Token.SETELEM /* 41 */:
                t0 t0Var8 = (t0) this.a.R.get();
                t0Var8.getClass();
                Object objB8 = t0Var8.b(NtvApi.class);
                objB8.getClass();
                return (NtvApi) objB8;
            case Token.SETELEM_SUPER /* 42 */:
                y yVar17 = (y) this.a.c.get();
                yVar17.getClass();
                com.google.firebase.messaging.o oVar8 = new com.google.firebase.messaging.o(25);
                oVar8.j("https://ntv.cx/");
                oVar8.y = yVar17;
                oVar8.g(retrofit2.converter.gson.a.c());
                return oVar8.l();
            case Token.CALL /* 43 */:
                return new com.app.mlounge.data.music.h();
            case Token.NAME /* 44 */:
                return new com.app.mlounge.data.repository.a0((com.app.mlounge.data.music.c) this.a.U.get(), (com.app.mlounge.data.music.h) this.a.T.get(), (com.app.mlounge.data.repository.x) this.a.L.get());
            case Token.NUMBER /* 45 */:
                return new com.app.mlounge.data.music.c((y) this.a.c.get());
            default:
                throw new AssertionError(i3);
        }
    }
}
