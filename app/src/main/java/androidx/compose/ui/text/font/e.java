package androidx.compose.ui.text.font;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.compose.runtime.h0;
import androidx.compose.ui.text.input.v;
import androidx.compose.ui.text.input.w;
import androidx.datastore.core.g0;
import androidx.datastore.core.h1;
import androidx.datastore.core.j0;
import androidx.datastore.core.r0;
import androidx.datastore.core.z;
import androidx.lifecycle.l0;
import androidx.media3.exoplayer.c0;
import androidx.navigation.k0;
import com.app.mlounge.MainActivity;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.ui.viewmodel.e0;
import com.app.mlounge.ui.viewmodel.r1;
import com.app.mlounge.ui.viewmodel.x1;
import com.appsalt.internal.f3;
import com.appsalt.internal.z1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.a0;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.future.FutureKt;
import kotlinx.coroutines.tasks.TasksKt;
import kotlinx.serialization.internal.o0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        String strConcat;
        StringBuilder sb;
        int i;
        Bundle bundle;
        ?? r16;
        int i2 = this.e;
        int i3 = 1;
        kotlin.coroutines.d dVar = null;
        y yVar = y.a;
        Object obj2 = this.y;
        switch (i2) {
            case 0:
                t tVar = (t) obj;
                return ((f) obj2).a(new t(null, tVar.b, tVar.c, tVar.d, tVar.e)).e;
            case 1:
                androidx.compose.ui.text.input.g gVar = (androidx.compose.ui.text.input.g) obj;
                String str = ((androidx.compose.ui.text.input.g) obj2) == gVar ? " > " : "   ";
                if (!(gVar instanceof androidx.compose.ui.text.input.a)) {
                    if (gVar instanceof v) {
                        sb = new StringBuilder("SetComposingTextCommand(text.length=");
                        v vVar = (v) gVar;
                        sb.append(vVar.a.y.length());
                        sb.append(", newCursorPosition=");
                        i = vVar.b;
                    } else if (gVar instanceof androidx.compose.ui.text.input.u) {
                        strConcat = ((androidx.compose.ui.text.input.u) gVar).toString();
                    } else if (gVar instanceof androidx.compose.ui.text.input.e) {
                        strConcat = ((androidx.compose.ui.text.input.e) gVar).toString();
                    } else if (gVar instanceof androidx.compose.ui.text.input.f) {
                        strConcat = ((androidx.compose.ui.text.input.f) gVar).toString();
                    } else if (gVar instanceof w) {
                        strConcat = ((w) gVar).toString();
                    } else if (gVar instanceof androidx.compose.ui.text.input.i) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (gVar instanceof androidx.compose.ui.text.input.d) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strC = a0.a(gVar.getClass()).c();
                        if (strC == null) {
                            strC = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strC);
                    }
                    return str.concat(strConcat);
                }
                sb = new StringBuilder("CommitTextCommand(text.length=");
                androidx.compose.ui.text.input.a aVar = (androidx.compose.ui.text.input.a) gVar;
                sb.append(aVar.a.y.length());
                sb.append(", newCursorPosition=");
                i = aVar.b;
                strConcat = androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, i, ')');
                return str.concat(strConcat);
            case 2:
                z zVar = (z) obj2;
                kotlin.o oVar = zVar.j;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    zVar.h.c(new j0(th));
                }
                if (oVar.a()) {
                    ((g0) ((h1) oVar.getValue())).close();
                }
                return yVar;
            case 3:
                File file = (File) obj;
                file.getClass();
                return new r0(((CoroutineScope) obj2).getCoroutineContext(), file);
            case 4:
                k0 k0Var = (k0) obj2;
                androidx.navigation.i iVar = (androidx.navigation.i) obj;
                iVar.getClass();
                androidx.navigation.internal.c cVar = iVar.E;
                androidx.navigation.t tVar2 = iVar.y;
                if (tVar2 == null) {
                    tVar2 = null;
                }
                if (tVar2 != null) {
                    cVar.a();
                    androidx.navigation.t tVarC = k0Var.c(tVar2);
                    if (tVarC != null) {
                        return tVarC.equals(tVar2) ? iVar : k0Var.b().b(tVarC, tVarC.b(cVar.a()));
                    }
                }
                return null;
            case 5:
                Bundle bundle2 = (Bundle) obj;
                androidx.navigation.y yVarJ = coil3.network.g.j((Context) obj2);
                if (bundle2 != null) {
                    bundle2.setClassLoader(yVarJ.a.getClassLoader());
                }
                androidx.navigation.internal.f fVar = yVarJ.b;
                LinkedHashMap linkedHashMap = fVar.n;
                if (bundle2 == null) {
                    r16 = 0;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            android.support.v4.media.session.b.z("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    fVar.d = bundle;
                    fVar.e = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) _COROUTINE.b.t("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            android.support.v4.media.session.b.z("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            android.support.v4.media.session.b.z("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            int i6 = i5 + 1;
                            kotlin.coroutines.d dVar2 = dVar;
                            fVar.m.put(Integer.valueOf(intArray[i4]), !kotlin.jvm.internal.l.a(stringArrayList.get(i5), "") ? (String) stringArrayList.get(i5) : dVar2);
                            i4++;
                            i5 = i6;
                            dVar = dVar2;
                        }
                    }
                    r16 = dVar;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            android.support.v4.media.session.b.z("android-support-nav:controller:backStackStates");
                            throw r16;
                        }
                        for (String str2 : stringArrayList2) {
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                ArrayList arrayListT = _COROUTINE.b.t("android-support-nav:controller:backStackStates:" + str2, bundle2);
                                kotlin.collections.k kVar = new kotlin.collections.k(arrayListT.size());
                                Iterator it = arrayListT.iterator();
                                while (it.hasNext()) {
                                    kVar.addLast(new androidx.navigation.j((Bundle) it.next()));
                                }
                                linkedHashMap.put(str2, kVar);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    ?? ValueOf = (z || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : r16;
                    yVarJ.e = ValueOf != 0 ? ValueOf.booleanValue() : false;
                }
                return yVarJ;
            case 6:
                androidx.sqlite.db.framework.b bVar = (androidx.sqlite.db.framework.b) obj;
                bVar.getClass();
                ((androidx.constraintlayout.core.widgets.analyzer.e) obj2).i = bVar;
                return yVar;
            case 7:
                ((coil3.disk.d) obj2).I = true;
                return yVar;
            case 8:
                final MainActivity mainActivity = (MainActivity) obj2;
                Context context = (Context) obj;
                int i7 = MainActivity.G;
                context.getClass();
                VideoView videoView = new VideoView(context);
                videoView.setVideoURI(Uri.parse("android.resource://" + context.getPackageName() + "/2131820546"));
                videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.app.mlounge.m
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        int i8 = MainActivity.G;
                        MainActivity mainActivity2 = mainActivity;
                        mainActivity2.A.setValue(Boolean.FALSE);
                        mainActivity2.j();
                    }
                });
                videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.app.mlounge.n
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
                        int i10 = MainActivity.G;
                        MainActivity mainActivity2 = mainActivity;
                        mainActivity2.A.setValue(Boolean.FALSE);
                        mainActivity2.j();
                        return true;
                    }
                });
                videoView.start();
                return videoView;
            case 9:
                ((h0) obj).getClass();
                return new androidx.activity.compose.d((com.app.mlounge.ui.viewmodel.c) obj2, 11);
            case 10:
                ((h0) obj).getClass();
                return new androidx.activity.compose.d((com.app.mlounge.ui.viewmodel.g) obj2, 12);
            case 11:
                com.app.mlounge.ui.viewmodel.a0 a0Var = (com.app.mlounge.ui.viewmodel.a0) obj2;
                IptvChannel iptvChannel = (IptvChannel) obj;
                iptvChannel.getClass();
                BuildersKt__Builders_commonKt.launch$default(l0.g(a0Var), null, null, new com.app.mlounge.ui.viewmodel.v(a0Var, iptvChannel, dVar, i3), 3, null);
                return yVar;
            case 12:
                ((h0) obj).getClass();
                return new androidx.activity.compose.d((e0) obj2, 14);
            case 13:
                Context context2 = (Context) obj;
                context2.getClass();
                androidx.media3.ui.h0 h0Var = new androidx.media3.ui.h0(context2);
                h0Var.setPlayer((c0) obj2);
                h0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                h0Var.setUseController(false);
                return h0Var;
            case 14:
                r1 r1Var = (r1) obj2;
                com.app.mlounge.ui.viewmodel.l lVar = (com.app.mlounge.ui.viewmodel.l) obj;
                lVar.getClass();
                MutableStateFlow mutableStateFlow = r1Var.n;
                ChqStream chqStream = ((com.app.mlounge.ui.viewmodel.m) mutableStateFlow.getValue()).e;
                if (chqStream != null) {
                    com.app.mlounge.ui.viewmodel.m mVar = (com.app.mlounge.ui.viewmodel.m) mutableStateFlow.getValue();
                    boolean z2 = mVar.a;
                    String str3 = mVar.b;
                    String str4 = mVar.c;
                    ChqStream chqStream2 = mVar.e;
                    List list = mVar.f;
                    list.getClass();
                    mutableStateFlow.setValue(new com.app.mlounge.ui.viewmodel.m(z2, str3, str4, false, chqStream2, list));
                    BuildersKt__Builders_commonKt.launch$default(l0.g(r1Var), null, null, new com.app.mlounge.ui.screens.adult.e(r1Var, chqStream, lVar, null, 21), 3, null);
                }
                return yVar;
            case 15:
                ((h0) obj).getClass();
                return new androidx.activity.compose.d((x1) obj2, 16);
            case 16:
                com.appsalt.internal.j0 j0Var = (com.appsalt.internal.j0) obj2;
                Throwable th2 = (Throwable) obj;
                ((z1) j0Var.b.get((com.appsalt.internal.g0) j0Var.c)).stop();
                j0Var.g = th2;
                ((kotlin.jvm.functions.l) j0Var.f).invoke(th2);
                return yVar;
            case 17:
                ((f3) obj2).e.invoke((Throwable) obj);
                return yVar;
            case 18:
                com.google.firebase.heartbeatinfo.h hVar = (com.google.firebase.heartbeatinfo.h) obj2;
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) obj;
                androidx.datastore.preferences.core.d dVar3 = com.google.firebase.heartbeatinfo.h.c;
                long j = 0;
                for (Map.Entry entry : aVar2.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        androidx.datastore.preferences.core.d dVar4 = (androidx.datastore.preferences.core.d) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = hVar.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.o(obj3, "duplicate element: "));
                                return null;
                            }
                            aVar2.e(dVar4, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            aVar2.d(dVar4);
                        }
                    }
                }
                if (j == 0) {
                    aVar2.d(dVar3);
                } else {
                    aVar2.e(dVar3, Long.valueOf(j));
                }
                return null;
            case 19:
                androidx.datastore.core.b bVar2 = (androidx.datastore.core.b) obj;
                bVar2.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", bVar2);
                return new com.google.firebase.sessions.k0(((com.google.firebase.sessions.l0) obj2).a.a(null), null, null);
            case 20:
                return obj == ((kotlin.collections.a) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 21:
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b bVar3 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b) obj2;
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry2.getKey();
                sb2.append(key == bVar3 ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry2.getValue();
                sb2.append(value != bVar3 ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 22:
                obj.getClass();
                return ((androidx.activity.compose.b) obj2).invoke();
            case 23:
                return ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.k) obj2).c(((Integer) obj).intValue());
            case 24:
                return FutureKt.asCompletableFuture$lambda$2((CompletableFuture) obj2, (Throwable) obj);
            case 25:
                return TasksKt.asDeferredImpl$lambda$2((com.google.android.gms.tasks.a) obj2, (Throwable) obj);
            case 26:
                kotlinx.serialization.descriptors.f fVar2 = (kotlinx.serialization.descriptors.f) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return fVar2.e[iIntValue] + ": " + fVar2.f[iIntValue].a();
            case 27:
                o0 o0Var = (o0) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return o0Var.e[iIntValue2] + ": " + o0Var.i(iIntValue2).a();
            default:
                ((IOException) obj).getClass();
                TimeZone timeZone = okhttp3.internal.g.a;
                ((okhttp3.internal.cache.h) obj2).H = true;
                return yVar;
        }
    }

    public /* synthetic */ e(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }
}
