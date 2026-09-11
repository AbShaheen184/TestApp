package coil3.memory;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.c2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.core.view.s;
import androidx.core.view.w1;
import androidx.core.view.z1;
import androidx.media3.common.audio.m;
import androidx.media3.container.j;
import androidx.media3.exoplayer.audio.l0;
import androidx.media3.exoplayer.audio.n0;
import androidx.media3.exoplayer.audio.q0;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.media3.exoplayer.mediacodec.g;
import androidx.media3.exoplayer.source.r0;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.p;
import coil3.q;
import coil3.request.n;
import com.app.mlounge.R;
import com.app.mlounge.ui.screens.player.a1;
import com.appsalt.internal.g4;
import com.appsalt.internal.w;
import com.appsalt.internal.x;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.cloudmessaging.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.internal.a4;
import com.google.android.gms.measurement.internal.g1;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.k2;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.w3;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.gms.tasks.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.e0;
import com.google.common.util.concurrent.f0;
import com.google.common.util.concurrent.k0;
import com.google.common.util.concurrent.o0;
import com.google.common.util.concurrent.y;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.k;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c implements p, x, com.google.android.gms.tasks.b, com.google.android.gms.tasks.d, k0, s, y {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public c(Context context, int i) {
        this.e = i;
        switch (i) {
            case 6:
                context.getClass();
                this.y = context;
                this.z = new g(context, false);
                break;
            case 13:
                this.z = null;
                this.y = context;
                break;
            case 21:
                com.google.android.gms.common.internal.x.g(context);
                Resources resources = context.getResources();
                this.y = resources;
                this.z = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.z = context;
                this.y = null;
                break;
        }
    }

    @Override // com.appsalt.internal.x
    public List a(int i, String str) {
        List listA = ((w) this.y).a(3, str);
        return !((ArrayList) listA).isEmpty() ? listA : ((w) this.z).a(3, str);
    }

    @Override // com.google.common.util.concurrent.k0
    public void b(Object obj) {
        v2 v2Var = (v2) this.z;
        v2Var.v();
        s1 s1Var = (s1) v2Var.e;
        g1 g1Var = s1Var.B;
        s1.k(g1Var);
        SparseArray sparseArrayB = g1Var.B();
        a4 a4Var = (a4) this.y;
        sparseArrayB.put(a4Var.z, Long.valueOf(a4Var.y));
        g1 g1Var2 = s1Var.B;
        s1.k(g1Var2);
        int[] iArr = new int[sparseArrayB.size()];
        long[] jArr = new long[sparseArrayB.size()];
        for (int i = 0; i < sparseArrayB.size(); i++) {
            iArr[i] = sparseArrayB.keyAt(i);
            jArr[i] = ((Long) sparseArrayB.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        g1Var2.K.I(bundle);
        v2Var.F = false;
        v2Var.G = 1;
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.J.b(a4Var.e, "Successfully registered trigger URI");
        v2Var.U();
    }

    @Override // com.appsalt.internal.x
    public k c(int i, String str) {
        k kVarC = ((w) this.y).c(i, str);
        return kVarC != null ? kVarC : ((w) this.z).c(i, str);
    }

    @Override // com.google.common.util.concurrent.y
    public ListenableFuture call() {
        f0 f0Var = (f0) this.y;
        int i = f0.B;
        if (f0Var.compareAndSet(e0.e, e0.z)) {
            return ((y) this.z).call();
        }
        o0 o0Var = o0.E;
        return o0Var != null ? o0Var : new o0();
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(i iVar) {
        Bundle bundle;
        com.google.android.gms.cloudmessaging.b bVar = (com.google.android.gms.cloudmessaging.b) this.y;
        Bundle bundle2 = (Bundle) this.z;
        bVar.getClass();
        return (iVar.h() && (bundle = (Bundle) iVar.f()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).i(h.z, com.google.android.gms.cloudmessaging.d.A) : iVar;
    }

    @Override // com.appsalt.internal.x
    public void e(com.appsalt.internal.i iVar) {
        ((w) this.y).y = iVar;
        ((w) this.z).y = iVar;
    }

    public void f(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.y).add(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // androidx.media3.extractor.p
    public void g(a0 a0Var) {
        p pVar = (p) this.y;
        a0Var.getClass();
        a1 a1Var = (a1) this.z;
        a1Var.c = a0Var;
        o oVar = com.app.mlounge.util.a.a;
        a0Var.c();
        a0Var.g();
        if (a0Var.c() || a0Var.g() == -9223372036854775807L || a1Var.a <= 0) {
            pVar.g(a0Var);
        } else {
            pVar.g(new com.app.mlounge.ui.screens.player.c(a0Var.g(), a1Var.a));
        }
    }

    public androidx.media3.exoplayer.a[] h(Handler handler, androidx.media3.exoplayer.x xVar, androidx.media3.exoplayer.x xVar2, androidx.media3.exoplayer.x xVar3, androidx.media3.exoplayer.x xVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.y;
        androidx.media3.exoplayer.video.i iVar = new androidx.media3.exoplayer.video.i(context);
        g gVar = (g) this.z;
        iVar.c = gVar;
        iVar.d = 5000L;
        iVar.e = handler;
        iVar.f = xVar;
        iVar.g = 50;
        com.google.android.material.motion.a.q(!iVar.b);
        Handler handler2 = iVar.e;
        com.google.android.material.motion.a.q((handler2 == null && iVar.f == null) || !(handler2 == null || iVar.f == null));
        iVar.b = true;
        arrayList.add(new androidx.media3.exoplayer.video.k(iVar));
        l0 l0Var = new l0(context);
        com.google.android.material.motion.a.q(!l0Var.d);
        l0Var.d = true;
        if (l0Var.c == null) {
            l0Var.c = new c2(new m[0]);
        }
        androidx.media3.exoplayer.audio.f0 f0Var = l0Var.f;
        androidx.dynamicanimation.animation.b bVar = l0Var.g;
        if (f0Var == null) {
            if (bVar == null) {
                l0Var.g = new androidx.dynamicanimation.animation.b(context);
            }
            if (l0Var.e == null) {
                l0Var.e = androidx.media3.exoplayer.audio.o0.a;
            }
            androidx.media3.exoplayer.audio.e0 e0Var = new androidx.media3.exoplayer.audio.e0(context);
            androidx.media3.exoplayer.audio.b bVar2 = context != null ? null : l0Var.b;
            Context context2 = e0Var.a;
            if (context2 == null) {
                e0Var.d = bVar2;
            }
            androidx.dynamicanimation.animation.b bVar3 = l0Var.g;
            e0Var.b = bVar3;
            e0Var.c = l0Var.e;
            if (bVar3 == null) {
                e0Var.b = new androidx.dynamicanimation.animation.b(context2);
            }
            l0Var.f = new androidx.media3.exoplayer.audio.f0(e0Var);
        } else {
            com.google.android.material.motion.a.q(bVar == null);
            com.google.android.material.motion.a.q(l0Var.e == null);
        }
        arrayList.add(new q0((Context) this.y, gVar, handler, xVar2, new n0(l0Var)));
        Looper looper = handler.getLooper();
        context.getClass();
        looper.getClass();
        arrayList.add(new androidx.media3.exoplayer.text.e(xVar3, looper));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof androidx.media3.exoplayer.text.e) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((androidx.media3.exoplayer.text.e) it.next()).i0 = true;
        }
        Looper looper2 = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new androidx.media3.exoplayer.metadata.b(xVar4, looper2));
        }
        arrayList.add(new androidx.media3.exoplayer.video.spherical.b());
        arrayList.add(new androidx.media3.exoplayer.image.g(new androidx.emoji2.text.m(context, 1)));
        return (androidx.media3.exoplayer.a[]) arrayList.toArray(new androidx.media3.exoplayer.a[0]);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    @Override // androidx.core.view.s
    public z1 i(View view, z1 z1Var) {
        boolean z;
        boolean z2;
        androidx.compose.foundation.gestures.z1 z1Var2 = (androidx.compose.foundation.gestures.z1) this.y;
        j jVar = (j) this.z;
        int i = jVar.a;
        int i2 = jVar.b;
        int i3 = jVar.c;
        w1 w1Var = z1Var.a;
        androidx.core.graphics.c cVarI = w1Var.i(519);
        androidx.core.graphics.c cVarI2 = w1Var.i(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) z1Var2.y;
        int i4 = cVarI.b;
        int i5 = cVarI.c;
        int i6 = cVarI.a;
        bottomSheetBehavior.w = i4;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.o;
        if (z4) {
            int i7 = w1Var.n().d;
            bottomSheetBehavior.v = i7;
            paddingBottom = i3 + i7;
        }
        int i8 = paddingBottom;
        if (bottomSheetBehavior.p) {
            paddingLeft = (z3 ? i2 : i) + i6;
        }
        int i9 = paddingLeft;
        if (bottomSheetBehavior.q) {
            if (!z3) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i10 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.u) {
            int i11 = marginLayoutParams.topMargin;
            int i12 = cVarI.b;
            if (i11 != i12) {
                marginLayoutParams.topMargin = i12;
                z2 = true;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(i9, view.getPaddingTop(), i10, i8);
        boolean z5 = z1Var2.e;
        if (z5) {
            bottomSheetBehavior.m = cVarI2.d;
        }
        if (!z4 && !z5) {
            return z1Var;
        }
        bottomSheetBehavior.I();
        return z1Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory j(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.z) == null) {
            Context context = (Context) this.y;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.z = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.z = map;
        }
        String str4 = (String) ((Map) this.z).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    public b k(coil3.request.g gVar, a aVar, coil3.size.h hVar, coil3.size.g gVar2) {
        b bVar;
        boolean z;
        double d;
        int iAbs;
        double d2;
        b bVar2;
        coil3.util.h hVar2 = coil3.util.h.y;
        coil3.request.b bVar3 = gVar.i;
        coil3.size.d dVar = gVar.q;
        Object obj = gVar.b;
        if (bVar3.e) {
            d dVarC = ((q) this.y).c();
            if (dVarC != null) {
                synchronized (dVarC.c) {
                    try {
                        e eVar = (e) ((LinkedHashMap) ((r0) dVarC.a.c).z).get(aVar);
                        bVar = eVar != null ? new b(eVar.a, eVar.b) : null;
                        if (bVar == null) {
                            l lVar = dVarC.b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) lVar.z).get(aVar);
                            if (arrayList == null) {
                                bVar = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        bVar2 = null;
                                        break;
                                    }
                                    f fVar = (f) arrayList.get(i);
                                    coil3.k kVar = (coil3.k) fVar.a.get();
                                    bVar2 = kVar != null ? new b(kVar, fVar.b) : null;
                                    if (bVar2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                lVar.b();
                                bVar = bVar2;
                            }
                        }
                        if (bVar != null && !bVar.a.c()) {
                            synchronized (dVarC.c) {
                                r0 r0Var = (r0) dVarC.a.c;
                                Object objRemove = ((LinkedHashMap) r0Var.z).remove(aVar);
                                if (objRemove != null) {
                                    r0Var.y = r0Var.b() - r0Var.c(aVar, objRemove);
                                    r0Var.a(aVar, objRemove, null);
                                }
                                if (objRemove != null) {
                                }
                                if (((LinkedHashMap) dVarC.b.z).remove(aVar) == null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                bVar = null;
            }
            if (bVar != null) {
                coil3.k kVar2 = bVar.a;
                coil3.a aVar2 = kVar2 instanceof coil3.a ? (coil3.a) kVar2 : null;
                if (aVar2 != null) {
                    Bitmap.Config config = aVar2.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (com.google.android.gms.common.wrappers.a.d(config) && !((Boolean) coil3.m.d(gVar, coil3.request.i.f)).booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                t tVar = (t) this.z;
                if (z) {
                    String str = (String) aVar.b.get("coil#size");
                    if (str != null) {
                        if (!str.equals(hVar.toString())) {
                            if (tVar != null && ((coil3.util.h) tVar.y).compareTo(hVar2) <= 0) {
                                t.N("MemoryCacheService", hVar2, obj + ": Memory cached image's size (" + str + ") does not exactly match the target size (" + hVar + ").", null);
                                return null;
                            }
                        }
                        return bVar;
                    }
                    Object obj2 = bVar.b.get("coil#is_sampled");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    if ((bool != null ? bool.booleanValue() : false) || (!kotlin.jvm.internal.l.a(hVar, coil3.size.h.c) && dVar != coil3.size.d.y)) {
                        int iB = kVar2.b();
                        int iA = kVar2.a();
                        coil3.size.h hVar3 = kVar2 instanceof coil3.a ? (coil3.size.h) coil3.m.d(gVar, coil3.request.h.b) : coil3.size.h.c;
                        coil3.size.c cVar = hVar.a;
                        int i2 = cVar instanceof coil3.size.a ? ((coil3.size.a) cVar).a : Integer.MAX_VALUE;
                        coil3.size.c cVar2 = hVar3.a;
                        int iMin = Math.min(i2, cVar2 instanceof coil3.size.a ? ((coil3.size.a) cVar2).a : Integer.MAX_VALUE);
                        coil3.size.c cVar3 = hVar.b;
                        int i3 = cVar3 instanceof coil3.size.a ? ((coil3.size.a) cVar3).a : Integer.MAX_VALUE;
                        coil3.size.c cVar4 = hVar3.b;
                        int iMin2 = Math.min(i3, cVar4 instanceof coil3.size.a ? ((coil3.size.a) cVar4).a : Integer.MAX_VALUE);
                        double d3 = ((double) iMin) / ((double) iB);
                        double d4 = ((double) iMin2) / ((double) iA);
                        int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? coil3.size.g.y : gVar2).ordinal();
                        if (iOrdinal != 0) {
                            d = d4;
                            if (iOrdinal != 1) {
                                coil3.g.a();
                                return null;
                            }
                            if (d3 < d) {
                                iAbs = Math.abs(iMin - iB);
                                d2 = d3;
                            } else {
                                iAbs = Math.abs(iMin2 - iA);
                                d2 = d;
                            }
                        } else {
                            d = d4;
                            if (d3 > d) {
                                iAbs = Math.abs(iMin - iB);
                                d2 = d3;
                            } else {
                                iAbs = Math.abs(iMin2 - iA);
                                d2 = d;
                            }
                        }
                        if (iAbs > 1) {
                            int iOrdinal2 = dVar.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    coil3.g.a();
                                    return null;
                                }
                                if (d2 > 1.0d) {
                                    if (tVar != null && ((coil3.util.h) tVar.y).compareTo(hVar2) <= 0) {
                                        t.N("MemoryCacheService", hVar2, obj + ": Memory cached image's size (" + iB + ", " + iA + ") is smaller than the target size (" + iMin + ", " + iMin2 + ").", null);
                                        return null;
                                    }
                                }
                            } else if (d2 != 1.0d) {
                                if (tVar != null && ((coil3.util.h) tVar.y).compareTo(hVar2) <= 0) {
                                    t.N("MemoryCacheService", hVar2, obj + ": Memory cached image's size (" + iB + ", " + iA + ") does not exactly match the target size (" + iMin + ", " + iMin2 + ").", null);
                                    return null;
                                }
                            }
                        }
                    }
                    return bVar;
                }
                if (tVar != null && ((coil3.util.h) tVar.y).compareTo(hVar2) <= 0) {
                    t.N("MemoryCacheService", hVar2, obj + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.k0
    public void l(Throwable th) {
        v2 v2Var = (v2) this.z;
        v2Var.v();
        s1 s1Var = (s1) v2Var.e;
        v2Var.F = false;
        v2Var.T().add((a4) this.y);
        if (v2Var.G > ((Integer) h0.v0.a(null)).intValue()) {
            v2Var.G = 1;
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.F.c(x0.D(s1Var.r().B()), x0.D(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        x0 x0Var2 = s1Var.C;
        s1.m(x0Var2);
        x0Var2.F.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", x0.D(s1Var.r().B()), x0.D(String.valueOf(v2Var.G)), x0.D(th.toString()));
        int i = v2Var.G;
        if (v2Var.H == null) {
            v2Var.H = new k2(v2Var, s1Var, 1);
        }
        v2Var.H.b(((long) i) * 1000);
        int i2 = v2Var.G;
        v2Var.G = i2 + i2;
    }

    public String m(String str) {
        String str2 = (String) this.z;
        Resources resources = (Resources) this.y;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    public a n(coil3.request.g gVar, Object obj, n nVar, coil3.f fVar) {
        String str;
        String strF;
        coil3.request.b bVar = gVar.i;
        Map map = gVar.d;
        if (bVar != coil3.request.b.DISABLED) {
            coil3.d dVar = ((q) this.y).d;
            t tVar = (t) this.z;
            List list = dVar.c;
            int size = list.size();
            int i = 0;
            boolean z = false;
            while (true) {
                if (i < size) {
                    k kVar = (k) list.get(i);
                    coil3.key.a aVar = (coil3.key.a) kVar.e;
                    if (((kotlin.jvm.internal.e) ((kotlin.reflect.c) kVar.y)).d(obj)) {
                        aVar.getClass();
                        switch (aVar.a) {
                            case 0:
                                coil3.w wVar = (coil3.w) obj;
                                if (!kotlin.jvm.internal.l.a(wVar.c, "android.resource")) {
                                    str = null;
                                } else {
                                    Configuration configuration = nVar.a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = coil3.util.m.a;
                                    str = wVar + ":" + (configuration.uiMode & 48);
                                }
                                break;
                            case 1:
                                coil3.w wVar2 = (coil3.w) obj;
                                String str2 = wVar2.c;
                                if (!(str2 == null || str2.equals("file")) || wVar2.e == null) {
                                    str = null;
                                } else {
                                    Bitmap.Config[] configArr2 = coil3.util.m.a;
                                    if ((kotlin.jvm.internal.l.a(wVar2.c, "file") && kotlin.jvm.internal.l.a(kotlin.collections.o.M(coil3.m.g(wVar2)), "android_asset")) || !((Boolean) coil3.m.e(nVar, coil3.request.h.c)).booleanValue() || (strF = coil3.m.f(wVar2)) == null) {
                                        str = null;
                                    } else {
                                        okio.k kVar2 = nVar.f;
                                        String str3 = okio.x.y;
                                        str = wVar2 + "-" + ((Long) kVar2.Y(com.google.android.gms.measurement.internal.f0.i(strF)).g);
                                    }
                                }
                                break;
                            default:
                                str = ((coil3.w) obj).a;
                                break;
                        }
                        if (str == null) {
                            z = true;
                        }
                    }
                    i++;
                } else {
                    if (!z && tVar != null) {
                        coil3.util.h hVar = (coil3.util.h) tVar.y;
                        coil3.util.h hVar2 = coil3.util.h.A;
                        if (hVar.compareTo(hVar2) <= 0) {
                            t.N("MemoryCacheService", hVar2, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("No keyer is registered for data with type '", kotlin.jvm.internal.a0.a(obj.getClass()).c(), "'. Register Keyer<", kotlin.jvm.internal.a0.a(obj.getClass()).c(), "> in the component registry to cache the output image in the memory cache."), null);
                        }
                    }
                    str = null;
                }
            }
            if (str != null) {
                if (((List) coil3.m.d(gVar, coil3.request.h.a)).isEmpty()) {
                    return new a(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", nVar.b.toString());
                return new a(str, linkedHashMap);
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.p
    public void o() {
        ((p) this.y).o();
    }

    @Override // com.google.android.gms.tasks.d
    public void onComplete(i iVar) {
        ((Map) ((c) this.z).z).remove((com.google.android.gms.tasks.j) this.y);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 coil3.request.n, still in use, count: 3, list:
          (r1v0 coil3.request.n) from 0x0096: MOVE (r18v0 coil3.request.n) = (r1v0 coil3.request.n) (LINE:151)
          (r1v0 coil3.request.n) from 0x007b: MOVE (r18v3 coil3.request.n) = (r1v0 coil3.request.n) (LINE:124)
          (r1v0 coil3.request.n) from 0x0084: MOVE (r18v5 coil3.request.n) = (r1v0 coil3.request.n) (LINE:133)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public coil3.request.n p(coil3.request.g r20, coil3.size.h r21) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.memory.c.p(coil3.request.g, coil3.size.h):coil3.request.n");
    }

    public n q(n nVar) {
        coil3.j jVar;
        boolean z;
        coil3.j jVar2 = nVar.j;
        coil3.i iVar = coil3.request.i.b;
        if (!com.google.android.gms.common.wrappers.a.d((Bitmap.Config) coil3.m.e(nVar, iVar)) || ((coil3.util.d) this.z).k()) {
            jVar = jVar2;
            z = false;
        } else {
            jVar2.getClass();
            LinkedHashMap linkedHashMapI = kotlin.collections.a0.I(jVar2.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapI.put(iVar, config);
            } else {
                linkedHashMapI.remove(iVar);
            }
            coil3.j jVar3 = new coil3.j(com.google.android.gms.dynamite.g.D(linkedHashMapI));
            z = true;
            jVar = jVar3;
        }
        return z ? new n(nVar.a, nVar.b, nVar.c, nVar.d, nVar.e, nVar.f, nVar.g, nVar.h, nVar.i, jVar) : nVar;
    }

    public void r(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.y)) {
            map = new HashMap((Map) this.y);
        }
        synchronized (((Map) this.z)) {
            map2 = new HashMap((Map) this.z);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                androidx.transition.k.i();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((com.google.android.gms.tasks.j) entry2.getKey()).c(new com.google.android.gms.common.api.d(status));
            }
        }
    }

    public String toString() {
        switch (this.e) {
            case 20:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.z.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.y;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 29:
                return ((y) this.z).toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.media3.extractor.p
    public androidx.media3.extractor.h0 u(int i, int i2) {
        androidx.media3.extractor.h0 h0VarU = ((p) this.y).u(i, i2);
        h0VarU.getClass();
        return h0VarU;
    }

    public /* synthetic */ c(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.z = obj;
        this.y = obj2;
    }

    public /* synthetic */ c(int i, boolean z) {
        this.e = i;
    }

    public c(IBinder iBinder) throws RemoteException {
        this.e = 14;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.y = new Messenger(iBinder);
            this.z = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.z = new com.google.android.gms.cloudmessaging.g(iBinder);
            this.y = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public c(x xVar) {
        this.e = 8;
        com.appsalt.internal.o0 o0Var = new com.appsalt.internal.o0();
        this.y = xVar;
        this.z = o0Var;
    }

    public c(g4 g4Var) {
        this.e = 10;
        this.y = g4Var;
        Math.pow(16.0d, 4);
        this.z = new com.appsalt.internal.o0(g4Var, 1);
    }

    public c(w3 w3Var) {
        this.e = 25;
        this.z = w3Var;
    }

    public /* synthetic */ c(Object obj) {
        this.e = 20;
        this.z = obj;
        this.y = new ArrayList();
    }

    public c(String str, _COROUTINE.a aVar, com.google.firebase.heartbeatinfo.e eVar) {
        this.e = 16;
        this.z = str;
        this.y = aVar;
    }

    public c(c2 c2Var) {
        this.e = 3;
        this.y = c2Var;
    }

    public c(q qVar, c cVar, t tVar) {
        this.e = 0;
        this.y = qVar;
        this.z = tVar;
    }

    public c(q qVar, t tVar) {
        Object n0Var;
        this.e = 2;
        this.y = qVar;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            boolean z = coil3.util.e.a;
        } else {
            if (!coil3.util.e.a) {
                if (i != 26 && i != 27) {
                    n0Var = new androidx.media3.common.util.n0(true);
                } else {
                    n0Var = new androidx.media3.exoplayer.hls.c(tVar);
                }
            }
            this.z = n0Var;
        }
        n0Var = new androidx.media3.common.util.n0(false);
        this.z = n0Var;
    }

    public c(int i) {
        this.e = i;
        switch (i) {
            case 18:
                this.y = Collections.synchronizedMap(new WeakHashMap());
                this.z = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 22:
                com.google.android.gms.common.e eVar = com.google.android.gms.common.e.d;
                this.y = new SparseIntArray();
                this.z = eVar;
                break;
            default:
                this.y = null;
                this.z = null;
                break;
        }
    }

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
