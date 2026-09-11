package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import androidx.collection.o0;
import androidx.collection.w0;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.media3.exoplayer.hls.playlist.n;
import androidx.media3.exoplayer.hls.playlist.q;
import androidx.media3.exoplayer.hls.playlist.u;
import androidx.media3.exoplayer.upstream.k;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.p;
import androidx.navigation.i;
import androidx.navigation.m;
import androidx.navigation.t;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.measurement.internal.y;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements androidx.lifecycle.viewmodel.b, u, k, p, androidx.profileinstaller.b, kotlin.coroutines.h, com.google.android.gms.dynamite.d, com.google.android.gms.measurement.internal.f, y {
    public static e e;
    public static final /* synthetic */ e y = new e();
    public static final /* synthetic */ e z = new e();

    public e(int i) {
        switch (i) {
            case 13:
                if (Build.VERSION.SDK_INT >= 35) {
                }
                break;
            default:
                new androidx.collection.u(16);
                long[] jArr = w0.a;
                new o0();
                break;
        }
    }

    public static u0 f(androidx.lifecycle.w0 w0Var, s0 s0Var, int i) {
        if ((i & 2) != 0) {
            s0Var = w0Var instanceof j ? ((j) w0Var).getDefaultViewModelProviderFactory() : androidx.lifecycle.viewmodel.internal.b.a;
        }
        androidx.lifecycle.viewmodel.c defaultViewModelCreationExtras = w0Var instanceof j ? ((j) w0Var).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b;
        s0Var.getClass();
        defaultViewModelCreationExtras.getClass();
        return new u0(w0Var.getViewModelStore(), s0Var, defaultViewModelCreationExtras);
    }

    public static i k(androidx.media3.exoplayer.mediacodec.g gVar, t tVar, Bundle bundle, o oVar, m mVar) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        tVar.getClass();
        oVar.getClass();
        return new i(gVar, tVar, bundle, oVar, mVar, string, null);
    }

    public static byte[] l(h0 h0Var, long j) {
        androidx.media3.common.p pVar = new androidx.media3.common.p(13);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(h0Var.size());
        Iterator<E> it = h0Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) pVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override // com.google.android.gms.measurement.internal.y
    public Object a() {
        return new Boolean(((Boolean) m3.a.get()).booleanValue());
    }

    @Override // androidx.media3.exoplayer.hls.playlist.u
    public androidx.media3.exoplayer.upstream.p b(q qVar, n nVar) {
        return new androidx.media3.exoplayer.hls.playlist.t(qVar, nVar);
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public void c() {
        synchronized (androidx.media3.exoplayer.util.b.a) {
            Object obj = androidx.media3.exoplayer.util.b.b;
            synchronized (obj) {
                if (androidx.media3.exoplayer.util.b.c) {
                    return;
                }
                long jA = androidx.media3.exoplayer.util.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    androidx.media3.exoplayer.util.b.d = jA;
                    androidx.media3.exoplayer.util.b.c = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.f
    public /* synthetic */ String d(String str, String str2) {
        return null;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.u
    public androidx.media3.exoplayer.upstream.p h() {
        return new androidx.media3.exoplayer.hls.playlist.t(q.l, null);
    }

    @Override // androidx.profileinstaller.b
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // androidx.profileinstaller.b
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.d
    public androidx.media3.container.j n(Context context, String str, com.google.android.gms.dynamite.c cVar) {
        androidx.media3.container.j jVar = new androidx.media3.container.j();
        jVar.a = cVar.d(context, str);
        int i = 1;
        int iC = cVar.c(context, str, true);
        jVar.b = iC;
        int i2 = jVar.a;
        if (i2 == 0) {
            i2 = 0;
            if (iC == 0) {
                i = 0;
            } else if (i2 >= iC) {
                i = -1;
            }
        } else if (i2 >= iC) {
            i = -1;
        }
        jVar.c = i;
        return jVar;
    }

    @Override // androidx.media3.extractor.p
    public androidx.media3.extractor.h0 u(int i, int i2) {
        return new androidx.media3.extractor.m();
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public void e() {
    }

    @Override // androidx.media3.extractor.p
    public void o() {
    }

    @Override // androidx.media3.extractor.p
    public void g(a0 a0Var) {
    }
}
