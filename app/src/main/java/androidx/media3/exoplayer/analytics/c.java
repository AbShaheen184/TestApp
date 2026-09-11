package androidx.media3.exoplayer.analytics;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import androidx.appcompat.widget.x;
import androidx.compose.ui.node.a1;
import androidx.media3.common.q0;
import androidx.media3.common.r;
import androidx.media3.common.util.m;
import androidx.media3.common.util.n;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.mediacodec.o;
import androidx.media3.exoplayer.mediacodec.u;
import androidx.media3.exoplayer.mediacodec.v;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.s;
import com.appsalt.internal.j0;
import com.caverock.androidsvg.y1;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.DebugKt;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.optimizer.OptRuntime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n, m, u, androidx.media3.common.util.i, com.google.common.base.j, com.google.android.datatransport.runtime.synchronization.b, com.google.android.datatransport.runtime.scheduling.persistence.e, com.google.firebase.inject.a, com.google.android.gms.tasks.d, com.google.android.gms.tasks.b, com.google.firebase.components.e, ContextAction {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.u
    public int a(Object obj) {
        Context context = (Context) this.y;
        r rVar = (r) this.z;
        o oVar = (o) obj;
        String str = oVar.b;
        return ((str.equals(rVar.o) || str.equals(v.c(rVar))) && oVar.c(context, rVar, false) && oVar.d(rVar)) ? 1 : 0;
    }

    @Override // androidx.media3.common.util.i
    public void accept(Object obj) {
        androidx.media3.exoplayer.drm.d dVar = (androidx.media3.exoplayer.drm.d) this.y;
        ((c0) obj).k(dVar.a, dVar.b, (s) this.z);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public Object apply(Object obj) {
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y;
        com.google.android.datatransport.runtime.i iVar = (com.google.android.datatransport.runtime.i) this.z;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        com.google.android.datatransport.runtime.scheduling.persistence.a aVar = gVar.A;
        ArrayList arrayListW = gVar.w(sQLiteDatabase, iVar, aVar.b);
        for (com.google.android.datatransport.d dVar : com.google.android.datatransport.d.values()) {
            if (dVar != iVar.c) {
                int size = aVar.b - arrayListW.size();
                if (size <= 0) {
                    break;
                }
                arrayListW.addAll(gVar.w(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListW.size(); i++) {
            sb.append(((com.google.android.datatransport.runtime.scheduling.persistence.b) arrayListW.get(i)).a);
            if (i < arrayListW.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", ES6Iterator.VALUE_PROPERTY}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new com.google.android.datatransport.runtime.scheduling.persistence.f(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListW.listIterator();
        while (listIterator.hasNext()) {
            com.google.android.datatransport.runtime.scheduling.persistence.b bVar = (com.google.android.datatransport.runtime.scheduling.persistence.b) listIterator.next();
            long j2 = bVar.a;
            if (map.containsKey(Long.valueOf(j2))) {
                a1 a1VarC = bVar.c.c();
                for (com.google.android.datatransport.runtime.scheduling.persistence.f fVar : (Set) map.get(Long.valueOf(j2))) {
                    a1VarC.b(fVar.a, fVar.b);
                }
                listIterator.set(new com.google.android.datatransport.runtime.scheduling.persistence.b(j2, bVar.b, a1VarC.c()));
            }
        }
        return arrayListW;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // com.google.firebase.components.e
    public Object b(y1 y1Var) {
        String strValueOf;
        switch (this.e) {
            case 11:
                String str = (String) this.y;
                androidx.transition.k kVar = (androidx.transition.k) this.z;
                Context context = (Context) y1Var.a(Context.class);
                switch (kVar.e) {
                    case 25:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 26:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 27:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                        } else if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        } else {
                            strValueOf = "";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new com.google.firebase.platforminfo.a(str, strValueOf);
            default:
                String str2 = (String) this.y;
                com.google.firebase.components.b bVar = (com.google.firebase.components.b) this.z;
                try {
                    Trace.beginSection(str2);
                    return bVar.f.b(y1Var);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // androidx.media3.common.util.n
    public void c(Object obj, androidx.media3.common.o oVar) {
        j jVar = (j) ((b) obj);
        jVar.k((q0) this.z, new androidx.media3.common.util.b(oVar, ((g) this.y).B));
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) {
        com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.y;
        String str = (String) this.z;
        synchronized (gVar) {
            ((androidx.collection.f) gVar.b).remove(str);
        }
        return iVar;
    }

    @Override // com.google.firebase.inject.a
    public void e(com.google.firebase.inject.b bVar) {
        com.google.firebase.inject.a aVar = (com.google.firebase.inject.a) this.y;
        com.google.firebase.inject.a aVar2 = (com.google.firebase.inject.a) this.z;
        aVar.e(bVar);
        aVar2.e(bVar);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object h() {
        switch (this.e) {
            case 5:
                j0 j0Var = (j0) this.y;
                Iterable iterable = (Iterable) this.z;
                com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) j0Var.c;
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in ".concat(com.google.android.datatransport.runtime.scheduling.persistence.g.N(iterable))).execute();
                    break;
                }
                break;
            default:
                j0 j0Var2 = (j0) this.y;
                for (Map.Entry entry : ((HashMap) this.z).entrySet()) {
                    ((com.google.android.datatransport.runtime.scheduling.persistence.g) j0Var2.i).z(((Integer) entry.getValue()).intValue(), com.google.android.datatransport.runtime.firebase.transport.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // androidx.media3.common.util.m
    public void invoke(Object obj) {
        a aVar = (a) this.y;
        s sVar = (s) this.z;
        j jVar = (j) ((b) obj);
        jVar.getClass();
        androidx.media3.exoplayer.source.v vVar = aVar.d;
        if (vVar == null) {
            return;
        }
        r rVar = sVar.c;
        rVar.getClass();
        int i = sVar.d;
        i iVar = jVar.c;
        v0 v0Var = aVar.b;
        vVar.getClass();
        x xVar = new x(i, iVar.c(v0Var, vVar), rVar, 7);
        int i2 = sVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                jVar.q = xVar;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                jVar.r = xVar;
                return;
            }
        }
        jVar.p = xVar;
    }

    @Override // com.google.android.gms.tasks.d
    public void onComplete(com.google.android.gms.tasks.i iVar) {
        ((FirebaseMessagingService) this.y).a((Intent) this.z);
    }

    @Override // org.mozilla.javascript.ContextAction
    public Object run(org.mozilla.javascript.Context context) {
        return OptRuntime.lambda$main$0((String[]) this.y, (Script) this.z, context);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006f A[FALL_THROUGH] */
    @Override // com.google.common.base.j
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public boolean mo13apply(Object obj) {
        Boolean bool;
        androidx.media3.exoplayer.util.d dVar;
        androidx.media3.exoplayer.util.d dVar2;
        androidx.media3.exoplayer.trackselection.o oVar = (androidx.media3.exoplayer.trackselection.o) this.y;
        androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) this.z;
        r rVar = (r) obj;
        oVar.getClass();
        if (jVar.B && ((bool = oVar.j) == null || !bool.booleanValue())) {
            int i = rVar.G;
            if (i != -1 && i > 2) {
                String str = rVar.o;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (dVar2 = oVar.h) != null && dVar2.b) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (dVar = oVar.h) == null || !dVar.b || !dVar.c() || !oVar.h.d() || !oVar.h.a(oVar.i, rVar)) {
                    return false;
                }
            }
        }
        return true;
    }
}
