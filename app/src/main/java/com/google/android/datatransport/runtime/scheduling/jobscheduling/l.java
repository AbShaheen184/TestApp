package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.r;
import com.appsalt.internal.j0;
import com.caverock.androidsvg.y1;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.gms.measurement.internal.f0;
import com.google.common.util.concurrent.g0;
import com.google.firebase.components.p;
import com.google.firebase.components.s;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.internal.common.q;
import com.google.firebase.crashlytics.internal.common.v;
import com.google.firebase.messaging.x;
import com.google.gson.internal.o;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.tasks.TasksKt;
import org.jsoup.select.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements com.google.android.datatransport.runtime.synchronization.b, com.google.firebase.components.e, com.google.firebase.inject.a, com.google.android.gms.tasks.b, com.google.android.gms.tasks.d, o, u {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ l(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // com.google.gson.internal.o
    public Object a() {
        int i = this.e;
        Object obj = this.y;
        switch (i) {
            case 11:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    com.google.common.base.c cVar = com.google.gson.internal.reflect.c.a;
                    androidx.media3.exoplayer.hls.playlist.a.j("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + com.google.gson.internal.reflect.c.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    androidx.media3.exoplayer.hls.playlist.a.j("Failed to invoke constructor '" + com.google.gson.internal.reflect.c.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return com.google.gson.internal.u.a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:102:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:103:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:109:0x0485  */
    /* JADX WARN: Code duplicated, block: B:111:0x048c  */
    /* JADX WARN: Code duplicated, block: B:128:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:131:0x0506  */
    /* JADX WARN: Code duplicated, block: B:133:0x0511  */
    /* JADX WARN: Code duplicated, block: B:134:0x0516  */
    /* JADX WARN: Code duplicated, block: B:155:0x064e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0657  */
    /* JADX WARN: Code duplicated, block: B:161:0x0676  */
    /* JADX WARN: Code duplicated, block: B:170:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:172:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:183:0x04a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x029d  */
    /* JADX WARN: Code duplicated, block: B:72:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0302  */
    /* JADX WARN: Code duplicated, block: B:82:0x037f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0387  */
    /* JADX WARN: Code duplicated, block: B:85:0x0390  */
    /* JADX WARN: Code duplicated, block: B:89:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:96:0x03cc A[LOOP:3: B:94:0x03c6->B:96:0x03cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x03e3  */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x06dd, please report this as an issue */
    @Override // com.google.firebase.components.e
    public Object b(y1 y1Var) {
        Boolean boolValueOf;
        q qVar;
        com.google.firebase.crashlytics.internal.concurrency.d dVar;
        String str;
        int i;
        Throwable th;
        String strH;
        String str2;
        com.google.firebase.crashlytics.b bVar;
        long jCurrentTimeMillis;
        String str3;
        String str4;
        String strD;
        f0 f0Var;
        int iD;
        String string;
        String[] strArr;
        ArrayList arrayList;
        int i2;
        StringBuilder sb;
        Iterator it;
        String string2;
        f0 f0Var2;
        String strH2;
        int i3;
        q qVar2;
        com.google.firebase.crashlytics.internal.concurrency.d dVar2;
        j0 j0Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        com.google.firebase.crashlytics.internal.settings.a aVarA;
        com.google.android.gms.common.api.internal.m mVar;
        com.google.android.gms.tasks.q qVarI;
        Context context;
        boolean z;
        String str5;
        boolean zExists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        com.google.firebase.crashlytics.internal.settings.a aVarA2;
        String str6;
        String string3;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.y;
        int i4 = CrashlyticsRegistrar.d;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        com.google.firebase.g gVar = (com.google.firebase.g) y1Var.a(com.google.firebase.g.class);
        com.google.firebase.installations.d dVar3 = (com.google.firebase.installations.d) y1Var.a(com.google.firebase.installations.d.class);
        p pVarK = y1Var.K(com.google.firebase.crashlytics.internal.a.class);
        p pVarK2 = y1Var.K(com.google.firebase.analytics.connector.a.class);
        p pVarK3 = y1Var.K(com.google.firebase.remoteconfig.interop.a.class);
        ExecutorService executorService = (ExecutorService) y1Var.f(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) y1Var.f(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) y1Var.f(crashlyticsRegistrar.c);
        gVar.a();
        Context context2 = gVar.a;
        String packageName = context2.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.5 for " + packageName, null);
        com.google.firebase.crashlytics.internal.concurrency.d dVar4 = new com.google.firebase.crashlytics.internal.concurrency.d(executorService, executorService2);
        com.google.firebase.crashlytics.internal.persistence.c cVar = new com.google.firebase.crashlytics.internal.persistence.c(context2);
        com.google.android.gms.common.api.internal.m mVar2 = new com.google.android.gms.common.api.internal.m();
        mVar2.z = new Object();
        mVar2.A = new com.google.android.gms.tasks.j();
        mVar2.e = false;
        mVar2.C = new com.google.android.gms.tasks.j();
        gVar.a();
        Context context3 = gVar.a;
        mVar2.y = gVar;
        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            mVar2.e = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context3.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context3.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (boolValueOf2 == null) {
                mVar2.e = false;
                boolValueOf3 = null;
            } else {
                mVar2.e = true;
                boolValueOf3 = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
            boolValueOf = boolValueOf3;
        }
        mVar2.B = boolValueOf;
        synchronized (mVar2.z) {
            try {
                if (mVar2.a()) {
                    ((com.google.android.gms.tasks.j) mVar2.A).d(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v vVar = new v(context2, packageName, dVar3, mVar2);
        com.google.firebase.crashlytics.internal.a aVar = new com.google.firebase.crashlytics.internal.a(pVarK);
        com.google.firebase.crashlytics.internal.breadcrumbs.b bVar2 = new com.google.firebase.crashlytics.internal.breadcrumbs.b();
        c0 c0Var = new c0(9);
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f();
        fVar.c = bVar2;
        fVar.a = new ArrayList();
        fVar.b = c0Var;
        pVarK2.a(new com.google.firebase.crashlytics.a(fVar));
        com.google.firebase.crashlytics.internal.common.j jVar = new com.google.firebase.crashlytics.internal.common.j(mVar2, cVar);
        com.google.firebase.sessions.api.c cVar2 = com.google.firebase.sessions.api.c.a;
        com.google.firebase.sessions.api.d dVar5 = com.google.firebase.sessions.api.d.e;
        com.google.firebase.sessions.api.c cVar3 = com.google.firebase.sessions.api.c.a;
        com.google.firebase.sessions.api.a aVarA3 = com.google.firebase.sessions.api.c.a(dVar5);
        if (aVarA3.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + dVar5 + " already registered.");
        } else {
            aVarA3.b = jVar;
            Log.d("FirebaseSessions", "Subscriber " + dVar5 + " registered.");
            Mutex.DefaultImpls.unlock$default(aVarA3.a, null, 1, null);
        }
        q qVar3 = new q(gVar, vVar, aVar, mVar2, new com.google.firebase.crashlytics.a(fVar), new com.google.firebase.crashlytics.a(fVar), cVar, jVar, new com.google.android.material.internal.b(pVarK3), dVar4);
        com.google.firebase.crashlytics.internal.concurrency.d dVar6 = qVar3.o;
        gVar.a();
        String str7 = gVar.c.b;
        int iD2 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iD2 == 0) {
            iD2 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.crashlytics.android.build_id", "string");
        }
        String string4 = iD2 != 0 ? context2.getResources().getString(iD2) : null;
        ArrayList<com.google.firebase.crashlytics.internal.common.d> arrayList2 = new ArrayList();
        int iD3 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iD4 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iD5 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        try {
            try {
                try {
                    if (iD3 == 0 || iD4 == 0 || iD5 == 0) {
                        qVar = qVar3;
                        dVar = dVar6;
                        str = str7;
                        String str8 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iD3), Integer.valueOf(iD4), Integer.valueOf(iD5));
                        i = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            th = null;
                            Log.d("FirebaseCrashlytics", str8, null);
                        }
                        strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Mapping file ID is: ", string4);
                        if (Log.isLoggable("FirebaseCrashlytics", i)) {
                            Log.d("FirebaseCrashlytics", strH, th);
                        }
                        for (com.google.firebase.crashlytics.internal.common.d dVar7 : arrayList2) {
                            String str9 = dVar7.a;
                            String str10 = dVar7.b;
                            String str11 = dVar7.c;
                            StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("Build id for ", str9, " on ", str10, ": ");
                            sbO.append(str11);
                            string3 = sbO.toString();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", string3, null);
                            }
                        }
                        String str12 = str;
                        com.google.firebase.crashlytics.internal.common.a aVarA4 = com.google.firebase.crashlytics.internal.common.a.a(context2, vVar, str12, string4, arrayList2, new g0(context2));
                        str4 = "Installer package name is: " + aVarA4.d;
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", str4, null);
                        }
                        new e0(10);
                        String str13 = aVarA4.f;
                        String str14 = aVarA4.g;
                        strD = vVar.d();
                        f0Var = new f0(9);
                        com.google.android.material.shape.c0 c0Var2 = new com.google.android.material.shape.c0(f0Var);
                        com.google.android.material.shape.c0 c0Var3 = new com.google.android.material.shape.c0();
                        c0Var3.e = new File((File) cVar.c, "com.crashlytics.settings.json");
                        Locale locale = Locale.US;
                        String strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str12, "/settings");
                        r rVar = new r();
                        rVar.e = strQ;
                        String str15 = Build.MANUFACTURER;
                        String str16 = v.h;
                        String strI = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str15.replaceAll(str16, ""), "/", Build.MODEL.replaceAll(str16, ""));
                        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str16, "");
                        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str16, "");
                        iD = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                        if (iD == 0) {
                            iD = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.crashlytics.android.build_id", "string");
                        }
                        if (iD != 0) {
                            string = context2.getResources().getString(iD);
                        } else {
                            string = null;
                        }
                        strArr = new String[]{string, str12, str14, str13};
                        arrayList = new ArrayList();
                        i2 = 0;
                        while (i2 < 4) {
                            str6 = strArr[i2];
                            int i5 = i2;
                            if (str6 != null) {
                                arrayList.add(str6.replace("-", "").toLowerCase(Locale.US));
                            }
                            i2 = i5 + 1;
                        }
                        Collections.sort(arrayList);
                        sb = new StringBuilder();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                        }
                        string2 = sb.toString();
                        if (string2.length() > 0) {
                            strH2 = com.google.firebase.crashlytics.internal.common.g.h(string2);
                            f0Var2 = f0Var;
                        } else {
                            f0Var2 = f0Var;
                            strH2 = null;
                        }
                        if (strD != null) {
                            i3 = 4;
                        } else {
                            i3 = 1;
                        }
                        f0 f0Var3 = f0Var2;
                        qVar2 = qVar;
                        dVar2 = dVar;
                        com.google.firebase.crashlytics.internal.settings.c cVar4 = new com.google.firebase.crashlytics.internal.settings.c(str12, strI, strReplaceAll, strReplaceAll2, vVar, strH2, str14, str13, com.google.android.datatransport.runtime.backends.c.k(i3));
                        j0Var = new j0();
                        AtomicReference atomicReference3 = new AtomicReference();
                        j0Var.h = atomicReference3;
                        j0Var.i = new AtomicReference(new com.google.android.gms.tasks.j());
                        j0Var.a = context2;
                        j0Var.b = cVar4;
                        j0Var.d = f0Var3;
                        j0Var.c = c0Var2;
                        j0Var.e = c0Var3;
                        j0Var.f = rVar;
                        j0Var.g = mVar2;
                        atomicReference3.set(f0.g(f0Var3));
                        atomicReference = (AtomicReference) j0Var.i;
                        atomicReference2 = (AtomicReference) j0Var.h;
                        if (((Context) j0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((com.google.firebase.crashlytics.internal.settings.c) j0Var.b).f) || (aVarA2 = j0Var.a(1)) == null) {
                            aVarA = j0Var.a(3);
                            if (aVarA != null) {
                                atomicReference2.set(aVarA);
                                ((com.google.android.gms.tasks.j) atomicReference.get()).d(aVarA);
                            }
                            mVar = (com.google.android.gms.common.api.internal.m) j0Var.g;
                            com.google.android.gms.tasks.q qVar4 = ((com.google.android.gms.tasks.j) mVar.C).a;
                            synchronized (mVar.z) {
                                com.google.android.gms.tasks.q qVar5 = ((com.google.android.gms.tasks.j) mVar.A).a;
                            }
                            qVarI = com.google.firebase.crashlytics.internal.concurrency.a.a(qVar4, qVar5).i(dVar4.a, new g0(7, j0Var, dVar4));
                        } else {
                            atomicReference2.set(aVarA2);
                            ((com.google.android.gms.tasks.j) atomicReference.get()).d(aVarA2);
                            qVarI = kotlin.math.a.t(null);
                        }
                        int i6 = 5;
                        qVarI.b(executorService3, new s(i6));
                        com.google.firebase.crashlytics.internal.persistence.c cVar5 = qVar2.i;
                        context = qVar2.a;
                        if (context != null || (resources = context.getResources()) == null) {
                            z = true;
                        } else {
                            int iD6 = com.google.firebase.crashlytics.internal.common.g.d(context, "com.crashlytics.RequireBuildId", "bool");
                            if (iD6 > 0) {
                                z = resources.getBoolean(iD6);
                            } else {
                                int iD7 = com.google.firebase.crashlytics.internal.common.g.d(context, "com.crashlytics.RequireBuildId", "string");
                                if (iD7 > 0) {
                                    z = Boolean.parseBoolean(context.getString(iD7));
                                } else {
                                    z = true;
                                }
                            }
                        }
                        str5 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04fe: IGET (r9v11 'str5' java.lang.String) = (r29v1 ?? I:??[OBJECT, ARRAY]) (LINE:1279) com.google.firebase.crashlytics.internal.common.a.b java.lang.String in method: com.google.android.datatransport.runtime.scheduling.jobscheduling.l.b(com.caverock.androidsvg.y1):java.lang.Object, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v1 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1790
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.l.b(com.caverock.androidsvg.y1):java.lang.Object");
                    }

                    @Override // com.google.android.gms.tasks.b
                    public Object d(com.google.android.gms.tasks.i iVar) {
                        switch (this.e) {
                            case 5:
                                ((CountDownLatch) this.y).countDown();
                                return null;
                            case 6:
                                return (com.google.android.gms.tasks.i) ((com.google.firebase.crashlytics.internal.common.k) this.y).call();
                            default:
                                ((Runnable) this.y).run();
                                return kotlin.math.a.t(null);
                        }
                    }

                    @Override // com.google.firebase.inject.a
                    public void e(com.google.firebase.inject.b bVar) {
                        com.google.firebase.crashlytics.internal.a aVar = (com.google.firebase.crashlytics.internal.a) this.y;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                        }
                        aVar.b.set((com.google.firebase.crashlytics.internal.a) bVar.get());
                    }

                    @Override // org.jsoup.select.u
                    public void f(org.jsoup.nodes.o oVar, int i) {
                        StringBuilder sb = (StringBuilder) this.y;
                        if (oVar instanceof org.jsoup.nodes.e) {
                            sb.append(((org.jsoup.nodes.e) oVar).J());
                        } else if (oVar instanceof org.jsoup.nodes.d) {
                            sb.append(((org.jsoup.nodes.d) oVar).J());
                        } else if (oVar instanceof org.jsoup.nodes.c) {
                            sb.append(((org.jsoup.nodes.c) oVar).J());
                        }
                    }

                    @Override // com.google.android.datatransport.runtime.synchronization.b
                    public Object h() {
                        com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.y;
                        Iterator it = ((Iterable) ((com.google.android.datatransport.runtime.scheduling.persistence.g) oVar.z).m(new androidx.transition.k(15))).iterator();
                        while (it.hasNext()) {
                            ((c) oVar.A).t((com.google.android.datatransport.runtime.i) it.next(), 1, false);
                        }
                        return null;
                    }

                    @Override // com.google.android.gms.tasks.d
                    public void onComplete(com.google.android.gms.tasks.i iVar) {
                        switch (this.e) {
                            case 8:
                                com.google.firebase.messaging.v.c((Intent) this.y);
                                break;
                            case 9:
                                ((x) this.y).b.d(null);
                                break;
                            case 10:
                                ((ScheduledFuture) this.y).cancel(false);
                                break;
                            default:
                                TasksKt.asDeferredImpl$lambda$1((CompletableDeferred) this.y, iVar);
                                break;
                        }
                    }
                }
