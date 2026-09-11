package com.google.firebase.messaging;

import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.collection.y0;
import androidx.compose.animation.a1;
import androidx.compose.animation.b1;
import androidx.compose.animation.core.c0;
import androidx.compose.animation.core.p2;
import androidx.compose.foundation.text.selection.q0;
import androidx.compose.foundation.text.selection.s0;
import androidx.compose.ui.input.pointer.a0;
import androidx.compose.ui.input.pointer.z;
import androidx.core.graphics.drawable.IconCompat;
import androidx.datastore.core.x0;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.source.i1;
import com.app.mlounge.ui.viewmodel.w1;
import com.appsalt.internal.c3;
import com.appsalt.internal.i0;
import com.appsalt.internal.x4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.measurement.internal.g1;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.s1;
import com.google.common.collect.e0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okio.f0;
import okio.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.k0;
import retrofit2.t0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements p2, androidx.media3.extractor.text.l, g0 {
    public static o C;
    public Object A;
    public Object B;
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public o(androidx.core.app.h hVar) {
        int i;
        ArrayList arrayList;
        int i2;
        this.e = 6;
        this.B = new Bundle();
        this.A = hVar;
        Context context = hVar.a;
        ArrayList arrayList2 = hVar.t;
        ArrayList arrayList3 = hVar.c;
        ArrayList arrayList4 = hVar.d;
        this.y = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.z = androidx.media3.common.audio.h.g(context, hVar.q);
        } else {
            this.z = new Notification.Builder(context);
        }
        Notification notification = hVar.s;
        Context context2 = null;
        int i3 = 0;
        ((Notification.Builder) this.z).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(hVar.e).setContentText(hVar.f).setContentInfo(null).setContentIntent(hVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(hVar.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.z;
        IconCompat iconCompat = hVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.z).setSubText(null).setUsesChronometer(false).setPriority(hVar.j);
        for (androidx.core.app.d dVar : hVar.b) {
            if (dVar.b == null && (i2 = dVar.e) != 0) {
                dVar.b = IconCompat.b(i2);
            }
            IconCompat iconCompat2 = dVar.b;
            boolean z = dVar.c;
            Bundle bundle = dVar.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, dVar.f, dVar.g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                s0.u(builder2);
            }
            if (i4 >= 29) {
                androidx.compose.ui.platform.coreshims.b.w(builder2);
            }
            if (i4 >= 31) {
                androidx.compose.ui.contentcapture.b.i(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", dVar.d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.z).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle3 = hVar.n;
        if (bundle3 != null) {
            ((Bundle) this.B).putAll(bundle3);
        }
        ((Notification.Builder) this.z).setShowWhen(hVar.k);
        ((Notification.Builder) this.z).setLocalOnly(hVar.m);
        ((Notification.Builder) this.z).setGroup(null);
        ((Notification.Builder) this.z).setSortKey(null);
        ((Notification.Builder) this.z).setGroupSummary(false);
        ((Notification.Builder) this.z).setCategory(null);
        ((Notification.Builder) this.z).setColor(hVar.o);
        ((Notification.Builder) this.z).setVisibility(hVar.p);
        ((Notification.Builder) this.z).setPublicVersion(null);
        ((Notification.Builder) this.z).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    androidx.collection.h hVar2 = new androidx.collection.h(arrayList2.size() + arrayList.size());
                    hVar2.addAll(arrayList);
                    hVar2.addAll(arrayList2);
                    arrayList2 = new ArrayList(hVar2);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) this.z).addPerson((String) it2.next());
            }
        }
        if (arrayList4.size() > 0) {
            if (hVar.n == null) {
                hVar.n = new Bundle();
            }
            Bundle bundle4 = hVar.n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList4.size()) {
                String string = Integer.toString(i5);
                androidx.core.app.d dVar2 = (androidx.core.app.d) arrayList4.get(i5);
                Bundle bundle7 = new Bundle();
                if (dVar2.b == null && (i = dVar2.e) != 0) {
                    dVar2.b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = dVar2.b;
                Bundle bundle8 = dVar2.a;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i3);
                bundle7.putCharSequence("title", dVar2.f);
                bundle7.putParcelable("actionIntent", dVar2.g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", dVar2.c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", dVar2.d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i5++;
                i3 = 0;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (hVar.n == null) {
                hVar.n = new Bundle();
            }
            hVar.n.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.B).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.z).setExtras(hVar.n);
        ((Notification.Builder) this.z).setRemoteInputHistory(null);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            androidx.media3.common.audio.h.s((Notification.Builder) this.z);
            androidx.media3.common.audio.h.u((Notification.Builder) this.z);
            androidx.media3.common.audio.h.v((Notification.Builder) this.z);
            androidx.media3.common.audio.h.w((Notification.Builder) this.z);
            androidx.media3.common.audio.h.t((Notification.Builder) this.z);
            if (!TextUtils.isEmpty(hVar.q)) {
                ((Notification.Builder) this.z).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i6 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it3);
            }
        }
        if (i6 >= 29) {
            androidx.compose.ui.platform.coreshims.b.t((Notification.Builder) this.z, hVar.r);
            androidx.compose.ui.platform.coreshims.b.v((Notification.Builder) this.z);
        }
        if (i6 >= 36) {
            androidx.core.app.i.f((Notification.Builder) this.z);
        }
    }

    public static void C(o oVar, okhttp3.internal.connection.j jVar, okhttp3.internal.connection.m mVar, okhttp3.internal.connection.j jVar2, int i) {
        androidx.media3.extractor.text.cea.i iVar;
        okhttp3.internal.connection.j jVarV;
        if ((i & 1) != 0) {
            jVar = null;
        }
        if ((i & 2) != 0) {
            mVar = null;
        }
        if ((i & 4) != 0) {
            jVar2 = null;
        }
        oVar.getClass();
        TimeZone timeZone = okhttp3.internal.g.a;
        boolean zIsShutdown = ((ThreadPoolExecutor) oVar.s()).isShutdown();
        synchronized (oVar) {
            if (mVar != null) {
                try {
                    if (!((ArrayDeque) oVar.A).remove(mVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (jVar2 != null) {
                jVar2.y.decrementAndGet();
                if (!((ArrayDeque) oVar.z).remove(jVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (jVar != null) {
                ((ArrayDeque) oVar.B).add(jVar);
                okhttp3.internal.connection.m mVar2 = jVar.z;
                if (!mVar2.z && (jVarV = oVar.v(mVar2.y.a.d)) != null) {
                    jVar.y = jVarV.y;
                }
            }
            if ((mVar != null || jVar2 != null) && (zIsShutdown || ((ArrayDeque) oVar.z).isEmpty())) {
                ((ArrayDeque) oVar.A).isEmpty();
            }
            if (zIsShutdown) {
                List listK0 = kotlin.collections.o.k0((ArrayDeque) oVar.B);
                ((ArrayDeque) oVar.B).clear();
                iVar = new androidx.media3.extractor.text.cea.i(listK0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) oVar.B).iterator();
                it.getClass();
                while (it.hasNext()) {
                    okhttp3.internal.connection.j jVar3 = (okhttp3.internal.connection.j) it.next();
                    if (((ArrayDeque) oVar.z).size() >= 64) {
                        break;
                    }
                    if (jVar3.y.get() < 5) {
                        it.remove();
                        jVar3.y.incrementAndGet();
                        arrayList.add(jVar3);
                        ((ArrayDeque) oVar.z).add(jVar3);
                    }
                }
                iVar = new androidx.media3.extractor.text.cea.i(arrayList);
            }
        }
        int size = iVar.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            okhttp3.internal.connection.j jVar4 = (okhttp3.internal.connection.j) iVar.e.get(i2);
            if (jVar4 != jVar) {
                okhttp3.internal.connection.m mVar3 = jVar4.z;
            }
            if (zIsShutdown) {
                jVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                okhttp3.internal.connection.m mVar4 = jVar4.z;
                mVar4.i(interruptedIOException);
                jVar4.e.f(mVar4, interruptedIOException);
            } else {
                ExecutorService executorServiceS = oVar.s();
                jVar4.getClass();
                okhttp3.internal.connection.m mVar5 = jVar4.z;
                mVar5.e.a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceS).execute(jVar4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        okhttp3.internal.connection.m mVar6 = jVar4.z;
                        mVar6.i(interruptedIOException2);
                        jVar4.e.f(mVar6, interruptedIOException2);
                        o oVar2 = mVar5.e.a;
                        oVar2.getClass();
                        C(oVar2, null, null, jVar4, 3);
                    }
                } catch (Throwable th2) {
                    o oVar3 = mVar5.e.a;
                    oVar3.getClass();
                    C(oVar3, null, null, jVar4, 3);
                    throw th2;
                }
            }
        }
    }

    public static void D(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static synchronized o w() {
        try {
            if (C == null) {
                C = new o(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return C;
    }

    public boolean A(Context context) {
        if (((Boolean) this.A) == null) {
            this.A = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.z).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.A).booleanValue();
    }

    public boolean B(Context context) {
        if (((Boolean) this.z) == null) {
            this.z = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.z).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.z).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object E(kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        x0 x0Var;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        CompletableDeferred completableDeferred = (CompletableDeferred) this.z;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i = x0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0Var.A = i - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object obj = x0Var.y;
        int i2 = x0Var.A;
        kotlin.y yVar = kotlin.y.a;
        Object obj2 = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                if (completableDeferred.isCompleted()) {
                    return yVar;
                }
                mutex = (Mutex) this.y;
                x0Var.e = mutex;
                x0Var.A = 1;
                if (mutex.lock(null, x0Var) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = x0Var.e;
                try {
                    kotlin.a.e(obj);
                    completableDeferred.complete(yVar);
                    mutex2.unlock(null);
                    return yVar;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = x0Var.e;
            kotlin.a.e(obj);
            mutex = mutex3;
            if (completableDeferred.isCompleted()) {
                mutex.unlock(null);
                return yVar;
            }
            x0Var.e = mutex;
            x0Var.A = 2;
            if (r(x0Var) != obj2) {
                mutex2 = mutex;
                completableDeferred.complete(yVar);
                mutex2.unlock(null);
                return yVar;
            }
            return obj2;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }

    public androidx.media3.exoplayer.dash.manifest.b F(List list) {
        androidx.media3.exoplayer.dash.manifest.b bVar;
        HashMap map = (HashMap) this.A;
        ArrayList arrayListH = h(list);
        if (arrayListH.size() < 2) {
            return (androidx.media3.exoplayer.dash.manifest.b) com.google.common.collect.q.j(arrayListH, null);
        }
        Collections.sort(arrayListH, new androidx.compose.foundation.lazy.layout.a(7));
        ArrayList arrayList = new ArrayList();
        int i = ((androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(0)).c;
        for (int i2 = 0; i2 < arrayListH.size(); i2++) {
            androidx.media3.exoplayer.dash.manifest.b bVar2 = (androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(i2);
            if (i != bVar2.c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(0);
            }
            arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
        }
        androidx.media3.exoplayer.dash.manifest.b bVar3 = (androidx.media3.exoplayer.dash.manifest.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListH.subList(0, arrayList.size());
        int i3 = 0;
        for (int i4 = 0; i4 < listSubList.size(); i4++) {
            i3 += ((androidx.media3.exoplayer.dash.manifest.b) listSubList.get(i4)).d;
        }
        int iNextInt = ((Random) this.B).nextInt(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < listSubList.size(); i6++) {
            bVar = (androidx.media3.exoplayer.dash.manifest.b) listSubList.get(i6);
            i5 += bVar.d;
            if (iNextInt < i5) {
                map.put(arrayList, bVar);
                return bVar;
            }
        }
        bVar = (androidx.media3.exoplayer.dash.manifest.b) com.google.common.collect.q.k(listSubList);
        map.put(arrayList, bVar);
        return bVar;
    }

    public void G(androidx.compose.ui.input.pointer.m mVar) {
        if (((z) this.z) == z.y) {
            androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.y;
            if (xVar == null) {
                net.luminis.tls.engine.impl.c.r("layoutCoordinates not set");
                return;
            }
            androidx.compose.ui.input.pointer.u.h(mVar, xVar.W(0L), new androidx.compose.animation.e((a0) this.B, 8), true);
        }
        this.z = z.z;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    public Bundle H() {
        g1 g1Var = (g1) this.B;
        if (((Bundle) this.A) == null) {
            String str = (String) this.y;
            SharedPreferences sharedPreferencesZ = g1Var.z();
            s1 s1Var = (s1) g1Var.e;
            String string = sharedPreferencesZ.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                g4.a();
                                                if (s1Var.A.G(null, h0.P0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                com.google.android.gms.measurement.internal.x0 x0Var = s1Var.C;
                                                s1.m(x0Var);
                                                x0Var.C.b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            g4.a();
                                            if (s1Var.A.G(null, h0.P0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            com.google.android.gms.measurement.internal.x0 x0Var2 = s1Var.C;
                                            s1.m(x0Var2);
                                            x0Var2.C.b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        com.google.android.gms.measurement.internal.x0 x0Var3 = s1Var.C;
                                        s1.m(x0Var3);
                                        x0Var3.C.b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    com.google.android.gms.measurement.internal.x0 x0Var4 = s1Var.C;
                                    s1.m(x0Var4);
                                    x0Var4.C.b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                com.google.android.gms.measurement.internal.x0 x0Var5 = s1Var.C;
                                s1.m(x0Var5);
                                x0Var5.C.b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            com.google.android.gms.measurement.internal.x0 x0Var6 = s1Var.C;
                            s1.m(x0Var6);
                            x0Var6.C.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.A = bundle;
                } catch (JSONException unused2) {
                    com.google.android.gms.measurement.internal.x0 x0Var7 = s1Var.C;
                    s1.m(x0Var7);
                    x0Var7.C.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.A) == null) {
                this.A = (Bundle) this.z;
            }
        }
        Bundle bundle2 = (Bundle) this.A;
        com.google.android.gms.common.internal.x.g(bundle2);
        return new Bundle(bundle2);
    }

    public void I(Bundle bundle) {
        g1 g1Var = (g1) this.B;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesZ = g1Var.z();
        s1 s1Var = (s1) g1Var.e;
        SharedPreferences.Editor editorEdit = sharedPreferencesZ.edit();
        int size = bundle2.size();
        String str = (String) this.y;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        g4.a();
                        if (s1Var.A.G(null, h0.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                com.google.android.gms.measurement.internal.x0 x0Var = s1Var.C;
                                s1.m(x0Var);
                                x0Var.C.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                com.google.android.gms.measurement.internal.x0 x0Var2 = s1Var.C;
                                s1.m(x0Var2);
                                x0Var2.C.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.measurement.internal.x0 x0Var3 = s1Var.C;
                        s1.m(x0Var3);
                        x0Var3.C.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.A = bundle2;
    }

    @Override // androidx.compose.animation.core.m2
    public long b(androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2, androidx.compose.animation.core.s sVar3) {
        int iB = sVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((androidx.compose.animation.core.t) this.y).get(i).c(sVar.a(i), sVar2.a(i), sVar3.a(i)));
        }
        return jMax;
    }

    @Override // okio.g0
    public okio.h0 c() {
        return (okio.internal.e) this.A;
    }

    @Override // okio.g0
    public void cancel() throws IOException {
        ((Socket) this.y).close();
    }

    @Override // okio.g0
    public f0 d() {
        return (okio.internal.d) this.B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable e(kotlin.coroutines.jvm.internal.c cVar) {
        x4 x4Var;
        o oVar;
        Object objDoSelect;
        kotlin.coroutines.intrinsics.a aVar;
        if (cVar instanceof x4) {
            x4Var = (x4) cVar;
            int i = x4Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                x4Var.A = i - Integer.MIN_VALUE;
            } else {
                x4Var = new x4(this, cVar);
            }
        } else {
            x4Var = new x4(this, cVar);
        }
        Object obj = x4Var.y;
        int i2 = x4Var.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            oVar = this;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar = x4Var.e;
            try {
                kotlin.a.e(obj);
            } catch (Throwable th) {
                return new kotlin.l(th);
            }
        }
        do {
            SelectImplementation selectImplementation = new SelectImplementation(x4Var.getContext());
            selectImplementation.invoke(((c3) oVar.y).e.getOnReceive(), new w1(oVar, null, 6));
            x4Var.e = oVar;
            x4Var.A = 1;
            objDoSelect = selectImplementation.doSelect(x4Var);
            aVar = kotlin.coroutines.intrinsics.a.e;
        } while (objDoSelect != aVar);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x002c, B:25:0x0052, B:29:0x0066, B:32:0x0071, B:34:0x0086, B:36:0x008d, B:37:0x0093, B:39:0x00a0, B:41:0x00a6, B:47:0x00bc, B:18:0x003e, B:24:0x004d), top: B:60:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x002c, B:25:0x0052, B:29:0x0066, B:32:0x0071, B:34:0x0086, B:36:0x008d, B:37:0x0093, B:39:0x00a0, B:41:0x00a6, B:47:0x00bc, B:18:0x003e, B:24:0x004d), top: B:60:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x002c, B:25:0x0052, B:29:0x0066, B:32:0x0071, B:34:0x0086, B:36:0x008d, B:37:0x0093, B:39:0x00a0, B:41:0x00a6, B:47:0x00bc, B:18:0x003e, B:24:0x004d), top: B:60:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x002c, B:25:0x0052, B:29:0x0066, B:32:0x0071, B:34:0x0086, B:36:0x008d, B:37:0x0093, B:39:0x00a0, B:41:0x00a6, B:47:0x00bc, B:18:0x003e, B:24:0x004d), top: B:60:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x002c, B:25:0x0052, B:29:0x0066, B:32:0x0071, B:34:0x0086, B:36:0x008d, B:37:0x0093, B:39:0x00a0, B:41:0x00a6, B:47:0x00bc, B:18:0x003e, B:24:0x004d), top: B:60:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc A[Catch: all -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x002c, B:25:0x0052, B:29:0x0066, B:32:0x0071, B:34:0x0086, B:36:0x008d, B:37:0x0093, B:39:0x00a0, B:41:0x00a6, B:47:0x00bc, B:18:0x003e, B:24:0x004d), top: B:60:0x0020, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00b7, blocks: (B:42:0x00b3, B:52:0x00ee, B:56:0x00f4, B:57:0x00f7, B:23:0x0048, B:13:0x002c, B:25:0x0052, B:29:0x0066, B:32:0x0071, B:34:0x0086, B:36:0x008d, B:37:0x0093, B:39:0x00a0, B:41:0x00a6, B:47:0x00bc, B:18:0x003e, B:24:0x004d, B:54:0x00f2), top: B:60:0x0020, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a4 -> B:46:0x00b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object f(kotlin.coroutines.jvm.internal.c r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.o.f(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public void g(retrofit2.converter.gson.a aVar) {
        ((ArrayList) this.A).add(aVar);
    }

    public ArrayList h(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.y;
        D(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.z;
        D(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.b bVar = (androidx.media3.exoplayer.dash.manifest.b) list.get(i);
            if (!map.containsKey(bVar.b) && !map2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // androidx.compose.animation.core.m2
    public androidx.compose.animation.core.s i(long j, androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2, androidx.compose.animation.core.s sVar3) {
        if (((androidx.compose.animation.core.s) this.A) == null) {
            this.A = sVar3.c();
        }
        androidx.compose.animation.core.s sVar4 = (androidx.compose.animation.core.s) this.A;
        if (sVar4 == null) {
            kotlin.jvm.internal.l.f("velocityVector");
            throw null;
        }
        int iB = sVar4.b();
        int i = 0;
        while (true) {
            androidx.compose.animation.core.s sVar5 = (androidx.compose.animation.core.s) this.A;
            if (i >= iB) {
                if (sVar5 != null) {
                    return sVar5;
                }
                kotlin.jvm.internal.l.f("velocityVector");
                throw null;
            }
            if (sVar5 == null) {
                kotlin.jvm.internal.l.f("velocityVector");
                throw null;
            }
            sVar5.e(i, ((androidx.compose.animation.core.t) this.y).get(i).b(j, sVar.a(i), sVar2.a(i), sVar3.a(i)));
            i++;
        }
    }

    public void j(String str) {
        com.google.android.material.shape.a0 a0Var = new com.google.android.material.shape.a0(1);
        a0Var.f(null, str);
        okhttp3.s sVarC = a0Var.c();
        ArrayList arrayList = sVarC.f;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.z = sVarC;
        } else {
            com.google.gson.b.g(sVarC, "baseUrl must end in /: ");
        }
    }

    @Override // androidx.media3.extractor.text.l
    public void k(byte[] bArr, int i, int i2, androidx.media3.extractor.text.k kVar, androidx.media3.common.util.i iVar) {
        androidx.media3.common.text.b bVar;
        int i3;
        int i4;
        int iZ;
        int i5;
        int i6;
        int iC;
        androidx.media3.extractor.text.pgs.a aVar = (androidx.media3.extractor.text.pgs.a) this.A;
        androidx.media3.common.util.w wVar = (androidx.media3.common.util.w) this.z;
        androidx.media3.common.util.w wVar2 = (androidx.media3.common.util.w) this.y;
        wVar2.K(bArr, i + i2);
        wVar2.M(i);
        if (((Inflater) this.B) == null) {
            this.B = new Inflater();
        }
        Inflater inflater = (Inflater) this.B;
        String str = j0.a;
        if (wVar2.a() > 0 && wVar2.j() == 120 && j0.J(wVar2, wVar, inflater)) {
            wVar2.K(wVar.a, wVar.c);
        }
        int i7 = 0;
        aVar.d = 0;
        int[] iArr = aVar.b;
        androidx.media3.common.util.w wVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        wVar3.J(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (wVar2.a() >= 3) {
            int i8 = wVar2.c;
            int iZ2 = wVar2.z();
            int iG = wVar2.G();
            int i9 = wVar2.b + iG;
            if (i9 > i8) {
                wVar2.M(i8);
                i3 = i7;
                bVar = null;
            } else {
                char c = 128;
                if (iZ2 != 128) {
                    switch (iZ2) {
                        case 20:
                            if (iG % 5 == 2) {
                                wVar2.N(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iG / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iZ3 = wVar2.z();
                                    char c2 = c;
                                    double dZ = wVar2.z();
                                    double dZ2 = wVar2.z() - 128;
                                    double dZ3 = wVar2.z() - 128;
                                    iArr[iZ3] = j0.j((int) ((dZ3 * 1.772d) + dZ), 0, 255) | (wVar2.z() << 24) | (j0.j((int) ((1.402d * dZ2) + dZ), 0, 255) << 16) | (j0.j((int) ((dZ - (0.34414d * dZ3)) - (dZ2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    aVar = aVar;
                                }
                                aVar.c = true;
                            }
                            break;
                        case 21:
                            if (iG >= 4) {
                                wVar2.N(3);
                                int i12 = iG - 4;
                                if (((128 & wVar2.z()) != 0 ? 1 : i7) == 0) {
                                    i5 = wVar3.b;
                                    i6 = wVar3.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        wVar2.k(wVar3.a, i5, iMin);
                                        wVar3.M(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iC = wVar2.C()) >= 4) {
                                    aVar.h = wVar2.G();
                                    aVar.i = wVar2.G();
                                    wVar3.J(iC - 4);
                                    i12 = iG - 11;
                                    i5 = wVar3.b;
                                    i6 = wVar3.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        wVar2.k(wVar3.a, i5, iMin2);
                                        wVar3.M(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iG >= 19) {
                                aVar.d = wVar2.G();
                                aVar.e = wVar2.G();
                                wVar2.N(11);
                                aVar.f = wVar2.G();
                                aVar.g = wVar2.G();
                            }
                            break;
                    }
                    i3 = 0;
                    bVar = null;
                } else {
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i4 = wVar3.c) == 0 || wVar3.b != i4 || !aVar.c) {
                        bVar = null;
                    } else {
                        wVar3.M(0);
                        int i13 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iZ4 = wVar3.z();
                            if (iZ4 != 0) {
                                iZ = i14 + 1;
                                iArr2[i14] = iArr[iZ4];
                            } else {
                                int iZ5 = wVar3.z();
                                if (iZ5 != 0) {
                                    iZ = ((iZ5 & 64) == 0 ? iZ5 & 63 : ((iZ5 & 63) << 8) | wVar3.z()) + i14;
                                    Arrays.fill(iArr2, i14, iZ, (iZ5 & 128) == 0 ? iArr[0] : iArr[wVar3.z()]);
                                }
                            }
                            i14 = iZ;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f = aVar.f;
                        float f2 = aVar.d;
                        float f3 = f / f2;
                        float f4 = aVar.g;
                        float f5 = aVar.e;
                        bVar = new androidx.media3.common.text.b(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f2, aVar.i / f5, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    wVar3.J(0);
                    aVar.c = false;
                }
                wVar2.M(i9);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i7 = i3;
        }
        iVar.accept(new androidx.media3.extractor.text.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public t0 l() {
        ArrayList arrayList = (ArrayList) this.A;
        if (((okhttp3.s) this.z) == null) {
            net.luminis.tls.engine.impl.c.r("Base URL required.");
            return null;
        }
        okhttp3.y yVar = (okhttp3.y) this.y;
        if (yVar == null) {
            yVar = new okhttp3.y();
        }
        androidx.core.provider.l lVar = k0.a;
        retrofit2.a aVar = k0.c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.B);
        List listA = aVar.a(lVar);
        arrayList2.addAll(listA);
        List listB = aVar.b();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listB.size());
        arrayList3.add(new retrofit2.b(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listB);
        okhttp3.s sVar = (okhttp3.s) this.z;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        listA.size();
        return new t0(yVar, sVar, listUnmodifiableList, listUnmodifiableList2);
    }

    public void m(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            org.mozilla.javascript.c.b("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((y0) this.z).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void n(androidx.compose.ui.input.pointer.m mVar, boolean z) {
        a0 a0Var = (a0) this.B;
        ?? r1 = mVar.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((androidx.compose.ui.input.pointer.v) r1.get(i)).b()) {
                G(mVar);
                return;
            }
        }
        androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.y;
        if (xVar == null) {
            net.luminis.tls.engine.impl.c.r("layoutCoordinates not set");
            return;
        }
        androidx.compose.ui.input.pointer.u.h(mVar, xVar.W(0L), new androidx.compose.animation.c(3, this, a0Var), false);
        if (((z) this.z) == z.y) {
            if (z) {
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((androidx.compose.ui.input.pointer.v) r1.get(i2)).a();
                }
            }
            q0 q0Var = mVar.b;
            if (q0Var != null) {
                q0Var.y = !a0Var.d;
            }
        }
    }

    @Override // androidx.compose.animation.core.m2
    public androidx.compose.animation.core.s q(androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2, androidx.compose.animation.core.s sVar3) {
        if (((androidx.compose.animation.core.s) this.B) == null) {
            this.B = sVar3.c();
        }
        androidx.compose.animation.core.s sVar4 = (androidx.compose.animation.core.s) this.B;
        if (sVar4 == null) {
            kotlin.jvm.internal.l.f("endVelocityVector");
            throw null;
        }
        int iB = sVar4.b();
        int i = 0;
        while (true) {
            androidx.compose.animation.core.s sVar5 = (androidx.compose.animation.core.s) this.B;
            if (i >= iB) {
                if (sVar5 != null) {
                    return sVar5;
                }
                kotlin.jvm.internal.l.f("endVelocityVector");
                throw null;
            }
            if (sVar5 == null) {
                kotlin.jvm.internal.l.f("endVelocityVector");
                throw null;
            }
            sVar5.e(i, ((androidx.compose.animation.core.t) this.y).get(i).d(sVar.a(i), sVar2.a(i), sVar3.a(i)));
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r(kotlin.coroutines.jvm.internal.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.B
            androidx.datastore.core.z r0 = (androidx.datastore.core.z) r0
            boolean r1 = r7 instanceof androidx.datastore.core.g
            if (r1 == 0) goto L17
            r1 = r7
            androidx.datastore.core.g r1 = (androidx.datastore.core.g) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.z = r2
            goto L1c
        L17:
            androidx.datastore.core.g r1 = new androidx.datastore.core.g
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.e
            int r2 = r1.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            kotlin.a.e(r7)
            goto L5c
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L33:
            kotlin.a.e(r7)
            goto L69
        L37:
            kotlin.a.e(r7)
            java.lang.Object r7 = r6.A
            java.util.List r7 = (java.util.List) r7
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.a.e
            if (r7 == 0) goto L5f
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            goto L5f
        L49:
            androidx.datastore.core.k0 r7 = r0.i()
            androidx.datastore.core.j r4 = new androidx.datastore.core.j
            r5 = 0
            r4.<init>(r0, r6, r5)
            r1.z = r3
            java.lang.Object r7 = r7.d(r4, r1)
            if (r7 != r2) goto L5c
            goto L68
        L5c:
            androidx.datastore.core.c r7 = (androidx.datastore.core.c) r7
            goto L6b
        L5f:
            r1.z = r4
            r7 = 0
            java.lang.Object r7 = androidx.datastore.core.z.h(r0, r7, r1)
            if (r7 != r2) goto L69
        L68:
            return r2
        L69:
            androidx.datastore.core.c r7 = (androidx.datastore.core.c) r7
        L6b:
            androidx.datastore.core.a0 r0 = r0.h
            r0.c(r7)
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.o.r(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public synchronized ExecutorService s() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.y) == null) {
                this.y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new okhttp3.internal.f(okhttp3.internal.g.b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.y;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    @Override // androidx.compose.animation.core.m2
    public androidx.compose.animation.core.s t(long j, androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2, androidx.compose.animation.core.s sVar3) {
        if (((androidx.compose.animation.core.s) this.z) == null) {
            this.z = sVar.c();
        }
        androidx.compose.animation.core.s sVar4 = (androidx.compose.animation.core.s) this.z;
        if (sVar4 == null) {
            kotlin.jvm.internal.l.f("valueVector");
            throw null;
        }
        int iB = sVar4.b();
        int i = 0;
        while (true) {
            androidx.compose.animation.core.s sVar5 = (androidx.compose.animation.core.s) this.z;
            if (i >= iB) {
                if (sVar5 != null) {
                    return sVar5;
                }
                kotlin.jvm.internal.l.f("valueVector");
                throw null;
            }
            if (sVar5 == null) {
                kotlin.jvm.internal.l.f("valueVector");
                throw null;
            }
            sVar5.e(i, ((androidx.compose.animation.core.t) this.y).get(i).e(j, sVar.a(i), sVar2.a(i), sVar3.a(i)));
            i++;
        }
    }

    public String toString() {
        switch (this.e) {
            case 24:
                String string = ((Socket) this.y).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    public okhttp3.internal.connection.j v(String str) {
        Iterator it = ((ArrayDeque) this.z).iterator();
        it.getClass();
        while (it.hasNext()) {
            okhttp3.internal.connection.j jVar = (okhttp3.internal.connection.j) it.next();
            if (kotlin.jvm.internal.l.a(jVar.z.y.a.d, str)) {
                return jVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.B).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            okhttp3.internal.connection.j jVar2 = (okhttp3.internal.connection.j) it2.next();
            if (kotlin.jvm.internal.l.a(jVar2.z.y.a.d, str)) {
                return jVar2;
            }
        }
        return null;
    }

    public androidx.compose.animation.core.s x(long j, androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2) {
        if (((androidx.compose.animation.core.s) this.A) == null) {
            this.A = sVar.c();
        }
        androidx.compose.animation.core.s sVar3 = (androidx.compose.animation.core.s) this.A;
        if (sVar3 == null) {
            kotlin.jvm.internal.l.f("velocityVector");
            throw null;
        }
        int iB = sVar3.b();
        int i = 0;
        while (true) {
            androidx.compose.animation.core.s sVar4 = (androidx.compose.animation.core.s) this.A;
            if (i >= iB) {
                if (sVar4 != null) {
                    return sVar4;
                }
                kotlin.jvm.internal.l.f("velocityVector");
                throw null;
            }
            if (sVar4 == null) {
                kotlin.jvm.internal.l.f("velocityVector");
                throw null;
            }
            com.app.mlounge.data.music.e eVar = (com.app.mlounge.data.music.e) this.y;
            sVar.getClass();
            long j2 = j / 1000000;
            a1 a1VarA = ((b1) eVar.y).a(sVar2.a(i));
            long j3 = a1VarA.c;
            sVar4.e(i, (((Math.signum(a1VarA.a) * androidx.compose.animation.b.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a1VarA.b) / j3) * 1000.0f);
            i++;
        }
    }

    public androidx.lifecycle.q0 y(String str, kotlin.jvm.internal.e eVar) {
        androidx.lifecycle.q0 q0Var;
        androidx.lifecycle.q0 q0VarA;
        synchronized (((androidx.lifecycle.viewmodel.internal.c) this.B)) {
            try {
                v0 v0Var = (v0) this.y;
                v0Var.getClass();
                q0Var = (androidx.lifecycle.q0) v0Var.a.get(str);
                if (eVar.d(q0Var)) {
                    androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) this.z;
                    if (s0Var instanceof o0) {
                        o0 o0Var = (o0) s0Var;
                        q0Var.getClass();
                        androidx.lifecycle.p pVar = o0Var.d;
                        if (pVar != null) {
                            androidx.savedstate.e eVar2 = o0Var.e;
                            eVar2.getClass();
                            l0.a(q0Var, eVar2, pVar);
                        }
                    }
                    q0Var.getClass();
                } else {
                    androidx.lifecycle.viewmodel.e eVar3 = new androidx.lifecycle.viewmodel.e((androidx.lifecycle.viewmodel.c) this.A);
                    eVar3.a.put(u0.b, str);
                    androidx.lifecycle.s0 s0Var2 = (androidx.lifecycle.s0) this.z;
                    s0Var2.getClass();
                    try {
                        try {
                            q0VarA = s0Var2.c(eVar, eVar3);
                        } catch (AbstractMethodError unused) {
                            Class clsA = eVar.a();
                            clsA.getClass();
                            q0VarA = s0Var2.a(clsA);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class clsA2 = eVar.a();
                        clsA2.getClass();
                        q0VarA = s0Var2.b(clsA2, eVar3);
                    }
                    q0Var = q0VarA;
                    v0 v0Var2 = (v0) this.y;
                    v0Var2.getClass();
                    q0Var.getClass();
                    androidx.lifecycle.q0 q0Var2 = (androidx.lifecycle.q0) v0Var2.a.put(str, q0Var);
                    if (q0Var2 != null) {
                        q0Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q0Var;
    }

    @Override // androidx.media3.extractor.text.l
    public int z() {
        return 2;
    }

    public /* synthetic */ o(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    public o(c3 c3Var, Channel channel, com.appsalt.internal.o0 o0Var, boolean z, int i) {
        i0 i0Var;
        this.e = i;
        switch (i) {
            case 17:
                this.y = c3Var;
                this.z = channel;
                this.A = o0Var;
                this.B = z ? i0.c : i0.b;
                break;
            default:
                this.y = c3Var;
                this.z = channel;
                this.A = o0Var;
                if (z) {
                    i0Var = i0.e;
                } else {
                    i0Var = i0.d;
                }
                this.B = i0Var;
                break;
        }
    }

    public o(g1 g1Var, String str) {
        this.e = 21;
        this.B = g1Var;
        com.google.android.gms.common.internal.x.d(str);
        this.y = str;
        this.z = new Bundle();
    }

    public o(v0 v0Var, androidx.lifecycle.s0 s0Var, androidx.lifecycle.viewmodel.c cVar) {
        this.e = 9;
        v0Var.getClass();
        s0Var.getClass();
        cVar.getClass();
        this.y = v0Var;
        this.z = s0Var;
        this.A = cVar;
        this.B = new androidx.lifecycle.viewmodel.internal.c();
    }

    public o(Socket socket) {
        this.e = 24;
        this.y = socket;
        this.z = new AtomicInteger();
        this.A = new okio.internal.e(this);
        this.B = new okio.internal.d(this);
    }

    public o(a0 a0Var) {
        this.e = 4;
        this.B = a0Var;
        this.z = z.e;
    }

    public /* synthetic */ o(int i, boolean z) {
        this.e = i;
    }

    public o(Typeface typeface, androidx.emoji2.text.flatbuffer.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.e = 8;
        this.B = typeface;
        this.y = bVar;
        this.A = new androidx.emoji2.text.v(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int iB = bVar.b(6);
        if (iB != 0) {
            int i5 = iB + bVar.e;
            i = ((ByteBuffer) bVar.A).getInt(((ByteBuffer) bVar.A).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.z = new char[i * 2];
        int iB2 = bVar.b(6);
        if (iB2 != 0) {
            int i6 = iB2 + bVar.e;
            i2 = ((ByteBuffer) bVar.A).getInt(((ByteBuffer) bVar.A).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            androidx.emoji2.text.y yVar = new androidx.emoji2.text.y(this, i7);
            androidx.emoji2.text.flatbuffer.a aVarB = yVar.b();
            int iB3 = aVarB.b(4);
            Character.toChars(iB3 != 0 ? ((ByteBuffer) aVarB.A).getInt(iB3 + aVarB.e) : 0, (char[]) this.z, i7 * 2);
            androidx.emoji2.text.flatbuffer.a aVarB2 = yVar.b();
            int iB4 = aVarB2.b(16);
            if (iB4 != 0) {
                int i8 = iB4 + aVarB2.e;
                i3 = ((ByteBuffer) aVarB2.A).getInt(((ByteBuffer) aVarB2.A).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            com.google.firebase.b.f("invalid metadata codepoint length", i3 > 0);
            androidx.emoji2.text.v vVar = (androidx.emoji2.text.v) this.A;
            androidx.emoji2.text.flatbuffer.a aVarB3 = yVar.b();
            int iB5 = aVarB3.b(16);
            if (iB5 != 0) {
                int i9 = iB5 + aVarB3.e;
                i4 = ((ByteBuffer) aVarB3.A).getInt(((ByteBuffer) aVarB3.A).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            vVar.a(yVar, 0, i4 - 1);
        }
    }

    public o(int i) {
        this.e = i;
        switch (i) {
            case 5:
                this.y = new androidx.constraintlayout.core.d(10);
                this.z = new y0(0);
                this.A = new ArrayList();
                this.B = new HashSet();
                break;
            case 12:
                Random random = new Random();
                this.A = new HashMap();
                this.B = random;
                this.y = new HashMap();
                this.z = new HashMap();
                break;
            case 14:
                this.y = new androidx.media3.common.util.w();
                this.z = new androidx.media3.common.util.w();
                this.A = new androidx.media3.extractor.text.pgs.a();
                break;
            case 15:
                this.y = new androidx.collection.f(0);
                this.z = new SparseArray();
                this.A = new androidx.collection.s((Object) null);
                this.B = new androidx.collection.f(0);
                break;
            case 23:
                this.B = new ArrayDeque();
                this.z = new ArrayDeque();
                this.A = new ArrayDeque();
                break;
            case 25:
                this.A = new ArrayList();
                this.B = new ArrayList();
                break;
            default:
                this.y = null;
                this.z = null;
                this.A = null;
                this.B = new ArrayDeque();
                break;
        }
    }

    public o(com.google.common.collect.a1 a1Var, androidx.media3.container.l lVar, androidx.media3.container.l lVar2, androidx.media3.container.l lVar3) {
        Object objO;
        this.e = 10;
        if (a1Var != null) {
            objO = com.google.common.collect.h0.o(a1Var);
        } else {
            e0 e0Var = com.google.common.collect.h0.y;
            objO = com.google.common.collect.a1.B;
        }
        this.y = objO;
        this.z = lVar;
        this.A = lVar2;
        this.B = lVar3;
    }

    public o(androidx.datastore.core.z zVar, List list) {
        this.e = 7;
        this.B = zVar;
        this.y = MutexKt.Mutex$default(false, 1, null);
        this.z = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.A = kotlin.collections.o.k0(list);
    }

    public o(AudioTrack audioTrack, com.google.firebase.platforminfo.c cVar) {
        this.e = 11;
        this.y = audioTrack;
        this.z = cVar;
        Handler handlerQ = j0.q(null);
        this.A = handlerQ;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.z
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                com.google.firebase.messaging.o oVar = this.a;
                if (((z) oVar.B) == null) {
                    return;
                }
                androidx.media3.common.util.c.h().execute(new androidx.activity.c(17, oVar, audioRouting));
            }
        };
        this.B = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerQ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(c0 c0Var) {
        this(new com.app.mlounge.data.music.e(c0Var, 7), 1);
        this.e = 1;
    }

    public o(i1 i1Var, boolean[] zArr) {
        this.e = 13;
        this.y = i1Var;
        this.z = zArr;
        int i = i1Var.a;
        this.A = new boolean[i];
        this.B = new boolean[i];
    }
}
