package androidx.media3.exoplayer.hls;

import android.app.ActivityManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.h0;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.util.w;
import androidx.media3.exoplayer.source.i1;
import androidx.media3.exoplayer.source.x0;
import androidx.media3.exoplayer.source.y0;
import androidx.media3.extractor.g0;
import androidx.media3.ui.p0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.w0;
import com.app.mlounge.R;
import com.appsalt.internal.n4;
import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.f2;
import com.google.android.gms.measurement.internal.g1;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.q4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.w3;
import com.google.android.gms.measurement.internal.z0;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.DebugKt;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements x0, p0, androidx.profileinstaller.b, w0, coil3.util.d, okhttp3.n, okhttp3.o, com.google.android.gms.common.api.internal.h, com.google.android.gms.common.internal.c, q4, z0, com.google.android.gms.tasks.f, com.google.android.gms.tasks.e, com.google.android.gms.tasks.c, com.google.android.material.button.b {
    public Object e;

    public c(int i) {
        switch (i) {
            case 4:
                this.e = new w(10);
                break;
            case 15:
                this.e = new LinkedHashMap();
                break;
            case 18:
                this.e = Collections.synchronizedMap(new androidx.collection.f(0));
                break;
            case 26:
                this.e = new CountDownLatch(1);
                break;
            default:
                this.e = new CopyOnWriteArrayList();
                break;
        }
    }

    public static c H(String str) {
        return new c((TextUtils.isEmpty(str) || str.length() > 1) ? c2.UNINITIALIZED : f2.e(str.charAt(0)));
    }

    @Override // androidx.recyclerview.widget.w0
    public int A(View view) {
        return view.getRight() + ((d0) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).rightMargin;
    }

    public void B() {
        l lVar = (l) this.e;
        int i = lVar.O - 1;
        lVar.O = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (r rVar : lVar.Q) {
            rVar.b();
            i2 += rVar.f0.a;
        }
        androidx.media3.common.w0[] w0VarArr = new androidx.media3.common.w0[i2];
        int i3 = 0;
        for (r rVar2 : lVar.Q) {
            rVar2.b();
            int i4 = rVar2.f0.a;
            int i5 = 0;
            while (i5 < i4) {
                rVar2.b();
                w0VarArr[i3] = rVar2.f0.a(i5);
                i5++;
                i3++;
            }
        }
        lVar.P = new i1(w0VarArr);
        lVar.N.m(lVar);
    }

    public h0 C(androidx.media3.extractor.o oVar, androidx.media3.exoplayer.hls.playlist.a aVar, int i) {
        int i2;
        w wVar = (w) this.e;
        h0 h0VarG = null;
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = wVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    oVar.x(wVar.a, i6 - i7, i7);
                    wVar.M(i5);
                    wVar.L(i6);
                    if (wVar.a() < 3) {
                        androidx.media3.exoplayer.hls.playlist.a.d(wVar.b, wVar.c);
                        return null;
                    }
                    int iC = wVar.C();
                    i2 = wVar.b - 3;
                    wVar.b = i2;
                    if (iC == 4801587) {
                        break;
                    }
                    if (androidx.media3.extractor.b.h(wVar.i()) == -1) {
                        if (i4 == 0) {
                            wVar.c(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    oVar.n();
                    oVar.h(i3);
                    return h0VarG;
                } catch (EOFException unused) {
                }
            }
            wVar.N(6);
            int iY = wVar.y();
            int i8 = iY + 10;
            if (h0VarG == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(wVar.a, i2, bArr2, 0, 10);
                oVar.x(bArr2, 10, iY);
                h0VarG = new androidx.media3.extractor.metadata.id3.h(aVar).G(bArr2, i8);
            } else {
                oVar.h(iY);
            }
            i3 += i8;
        }
    }

    public void D(long j, long j2, int i) throws j0 {
        androidx.media3.extractor.mkv.e eVar = (androidx.media3.extractor.mkv.e) this.e;
        eVar.j0.getClass();
        if (i == 160) {
            eVar.Y = false;
            eVar.Z = 0L;
            return;
        }
        if (i == 174) {
            androidx.media3.extractor.mkv.d dVar = new androidx.media3.extractor.mkv.d();
            dVar.n = -1;
            dVar.o = -1;
            dVar.p = -1;
            dVar.q = -1;
            dVar.r = -1;
            dVar.s = 0;
            dVar.t = -1;
            dVar.u = 0.0f;
            dVar.v = 0.0f;
            dVar.w = 0.0f;
            dVar.x = null;
            dVar.y = -1;
            dVar.z = false;
            dVar.A = -1;
            dVar.B = -1;
            dVar.C = -1;
            dVar.D = 1000;
            dVar.E = Context.VERSION_ES6;
            dVar.F = -1.0f;
            dVar.G = -1.0f;
            dVar.H = -1.0f;
            dVar.I = -1.0f;
            dVar.J = -1.0f;
            dVar.K = -1.0f;
            dVar.L = -1.0f;
            dVar.M = -1.0f;
            dVar.N = -1.0f;
            dVar.O = -1.0f;
            dVar.Q = 1;
            dVar.R = -1;
            dVar.S = 8000;
            dVar.T = 0L;
            dVar.U = 0L;
            dVar.W = false;
            dVar.Y = true;
            dVar.Z = "eng";
            eVar.y = dVar;
            dVar.a = eVar.w;
            return;
        }
        if (i == 183) {
            if (eVar.z) {
                return;
            }
            eVar.f(i);
            eVar.F = -1;
            eVar.G = -1L;
            eVar.H = -1L;
            return;
        }
        if (i == 187) {
            if (eVar.z) {
                return;
            }
            eVar.f(i);
            eVar.E = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            eVar.A = -1;
            eVar.B = -1L;
            return;
        }
        if (i == 20533) {
            eVar.g(i);
            eVar.y.i = true;
            return;
        }
        if (i == 21968) {
            eVar.g(i);
            eVar.y.z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = eVar.s;
            if (j3 != -1 && j3 != j) {
                throw j0.a(null, "Multiple Segment elements not supported");
            }
            eVar.s = j;
            eVar.r = j2;
            return;
        }
        if (i == 475249515) {
            if (eVar.z) {
                return;
            }
            eVar.D = true;
        } else if (i == 524531317 && !eVar.z) {
            if (eVar.d && eVar.K != -1) {
                eVar.J = true;
            } else {
                eVar.j0.g(new androidx.media3.extractor.s(eVar.v));
                eVar.z = true;
            }
        }
    }

    public void E(int i, String str) throws j0 {
        androidx.media3.extractor.mkv.e eVar = (androidx.media3.extractor.mkv.e) this.e;
        if (i == 134) {
            eVar.g(i);
            eVar.y.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                eVar.w = str.equals("webm");
                return;
            }
            throw j0.a(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            eVar.g(i);
            eVar.y.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            eVar.g(i);
            eVar.y.Z = str;
        }
    }

    public void F() {
        w3 w3Var = (w3) this.e;
        w3Var.v();
        s1 s1Var = (s1) w3Var.e;
        g1 g1Var = s1Var.B;
        s1.k(g1Var);
        s1Var.H.getClass();
        if (g1Var.E(System.currentTimeMillis())) {
            g1 g1Var2 = s1Var.B;
            s1.k(g1Var2);
            g1Var2.I.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                com.google.android.gms.measurement.internal.x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.K.a("Detected application was in foreground");
                I(System.currentTimeMillis(), s1Var.A.G(null, com.google.android.gms.measurement.internal.h0.e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    public void G(long j, long j2) {
        w3 w3Var = (w3) this.e;
        w3Var.v();
        w3Var.z();
        s1 s1Var = (s1) w3Var.e;
        g1 g1Var = s1Var.B;
        s1.k(g1Var);
        if (g1Var.E(j)) {
            s1.k(g1Var);
            g1Var.I.b(true);
            s1Var.r().A();
        }
        s1.k(g1Var);
        g1Var.M.h(j);
        if (g1Var.I.a()) {
            I(j, j2);
        }
    }

    public void I(long j, long j2) {
        w3 w3Var = (w3) this.e;
        w3Var.v();
        s1 s1Var = (s1) w3Var.e;
        if (s1Var.d()) {
            g1 g1Var = s1Var.B;
            s1.k(g1Var);
            g1Var.M.h(j);
            s1Var.H.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            com.google.android.gms.measurement.internal.x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.K.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            v2 v2Var = s1Var.J;
            s1.l(v2Var);
            v2Var.G(j, lValueOf, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid");
            s1.k(g1Var);
            g1Var.N.h(j3);
            g1Var.I.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            s1.l(v2Var);
            v2Var.D(j, j2, bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s");
            String strT = g1Var.S.t();
            if (TextUtils.isEmpty(strT)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strT);
            s1.l(v2Var);
            v2Var.D(j, j2, bundle2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr");
        }
    }

    @Override // com.google.android.gms.measurement.internal.z0
    public /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((l4) this.e).B(str, i, th, bArr, map);
    }

    @Override // com.google.android.gms.common.api.internal.h
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) obj2;
        com.google.android.gms.common.internal.service.a aVar = (com.google.android.gms.common.internal.service.a) ((com.google.android.gms.common.internal.service.d) obj).t();
        com.google.android.gms.common.internal.m mVar = (com.google.android.gms.common.internal.m) this.e;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f);
        int i = com.google.android.gms.internal.base.c.a;
        if (mVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            mVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            jVar.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        ((CountDownLatch) this.e).countDown();
    }

    @Override // coil3.util.d
    public boolean c(coil3.size.h hVar) {
        coil3.size.c cVar = hVar.a;
        if ((cVar instanceof coil3.size.a ? ((coil3.size.a) cVar).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        coil3.size.c cVar2 = hVar.b;
        return (cVar2 instanceof coil3.size.a ? ((coil3.size.a) cVar2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // com.google.android.gms.common.internal.c
    public void d(com.google.android.gms.common.b bVar) {
        ((com.google.android.gms.common.api.h) this.e).d(bVar);
    }

    @Override // com.google.android.gms.measurement.internal.q4
    public void e(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        v2 v2Var = (v2) this.e;
        if (zIsEmpty) {
            v2Var.z(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        } else {
            v2Var.getClass();
            net.luminis.tls.engine.impl.c.r("Unexpected call on client side");
        }
    }

    @Override // okhttp3.o
    public List f(String str) {
        return ((n4) this.e).b.a(3, str);
    }

    @Override // okhttp3.n
    public void g(okhttp3.s sVar, List list) {
        sVar.getClass();
        ((LinkedHashMap) this.e).put(sVar.d, list);
    }

    @Override // okhttp3.n
    public List h(okhttp3.s sVar) {
        sVar.getClass();
        List list = (List) ((LinkedHashMap) this.e).get(sVar.d);
        return list == null ? kotlin.collections.u.e : list;
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
        ((ProfileInstallReceiver) this.e).setResultCode(i);
    }

    @Override // coil3.util.d
    public boolean k() {
        boolean z;
        coil3.util.c cVar = coil3.util.c.a;
        androidx.media3.exoplayer.dash.manifest.t tVar = (androidx.media3.exoplayer.dash.manifest.t) this.e;
        synchronized (cVar) {
            try {
                int i = coil3.util.c.c;
                coil3.util.c.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > coil3.util.c.d + ((long) 30000)) {
                    coil3.util.c.c = 0;
                    coil3.util.c.d = SystemClock.uptimeMillis();
                    String[] list = coil3.util.c.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    int length = list.length;
                    boolean z2 = length < 800;
                    coil3.util.c.e = z2;
                    if (!z2 && tVar != null) {
                        coil3.util.h hVar = coil3.util.h.A;
                        if (((coil3.util.h) tVar.y).compareTo(hVar) <= 0) {
                            androidx.media3.exoplayer.dash.manifest.t.N("FileDescriptorCounter", hVar, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                        }
                    }
                }
                z = coil3.util.c.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.c
    public void l() {
        ((CountDownLatch) this.e).countDown();
    }

    @Override // androidx.recyclerview.widget.w0
    public int n(View view) {
        return (view.getLeft() - ((d0) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public void o(y0 y0Var) {
        l lVar = (l) this.e;
        lVar.N.o(lVar);
    }

    public com.google.android.material.shape.d p(com.google.android.material.shape.d dVar) {
        return dVar instanceof com.google.android.material.shape.l ? dVar : new com.google.android.material.shape.b(-((com.google.android.material.shape.j) this.e).i(), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02a7  */
    public void q(int i, int i2, androidx.media3.extractor.o oVar) throws j0 {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        androidx.media3.extractor.mkv.e eVar = (androidx.media3.extractor.mkv.e) this.e;
        androidx.media3.extractor.mkv.f fVar = eVar.b;
        SparseArray sparseArray = eVar.c;
        w wVar = eVar.k;
        w wVar2 = eVar.i;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (eVar.O != 2) {
                    return;
                }
                androidx.media3.extractor.mkv.d dVar = (androidx.media3.extractor.mkv.d) sparseArray.get(eVar.U);
                int i16 = eVar.X;
                w wVar3 = eVar.p;
                if (i16 != 4 || !"V_VP9".equals(dVar.c)) {
                    oVar.r(i2);
                    return;
                } else {
                    wVar3.J(i2);
                    oVar.readFully(wVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                eVar.g(i);
                androidx.media3.extractor.mkv.d dVar2 = eVar.y;
                int i17 = dVar2.h;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    oVar.r(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                dVar2.P = bArr;
                oVar.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                eVar.g(i);
                byte[] bArr2 = new byte[i2];
                eVar.y.j = bArr2;
                oVar.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                oVar.readFully(bArr3, 0, i2);
                eVar.g(i);
                eVar.y.k = new g0(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(wVar.a, (byte) 0);
                oVar.readFully(wVar.a, 4 - i2, i2);
                wVar.M(0);
                eVar.A = (int) wVar.B();
                return;
            }
            if (i == 25506) {
                eVar.g(i);
                byte[] bArr4 = new byte[i2];
                eVar.y.l = bArr4;
                oVar.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw j0.a(null, "Unexpected id: " + i);
            }
            eVar.g(i);
            byte[] bArr5 = new byte[i2];
            eVar.y.x = bArr5;
            oVar.readFully(bArr5, 0, i2);
            return;
        }
        if (eVar.O == 0) {
            eVar.U = (int) fVar.b(oVar, false, true, 8);
            eVar.V = fVar.c;
            eVar.Q = -9223372036854775807L;
            eVar.O = 1;
            wVar2.J(0);
        }
        androidx.media3.extractor.mkv.d dVar3 = (androidx.media3.extractor.mkv.d) sparseArray.get(eVar.U);
        if (dVar3 == null) {
            oVar.r(i2 - eVar.V);
            eVar.O = 0;
            return;
        }
        dVar3.a0.getClass();
        if (eVar.O == 1) {
            eVar.k(oVar, 3);
            int i18 = (wVar2.a[2] & 6) >> 1;
            byte b = 255;
            if (i18 == 0) {
                eVar.S = 1;
                int[] iArr2 = eVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                eVar.T = iArr2;
                iArr2[0] = (i2 - eVar.V) - 3;
            } else {
                eVar.k(oVar, 4);
                int i19 = (wVar2.a[3] & 255) + 1;
                eVar.S = i19;
                int[] iArr3 = eVar.T;
                if (iArr3 == null) {
                    iArr3 = new int[i19];
                } else if (iArr3.length < i19) {
                    iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                }
                eVar.T = iArr3;
                if (i18 == 2) {
                    int i20 = (i2 - eVar.V) - 4;
                    int i21 = eVar.S;
                    Arrays.fill(iArr3, 0, i21, i20 / i21);
                } else {
                    if (i18 == 1) {
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 4;
                        while (true) {
                            i9 = eVar.S - 1;
                            iArr = eVar.T;
                            if (i22 >= i9) {
                                break;
                            }
                            iArr[i22] = 0;
                            while (true) {
                                i10 = i24 + 1;
                                eVar.k(oVar, i10);
                                int i25 = wVar2.a[i24] & 255;
                                int[] iArr4 = eVar.T;
                                i11 = iArr4[i22] + i25;
                                iArr4[i22] = i11;
                                if (i25 != 255) {
                                    break;
                                } else {
                                    i24 = i10;
                                }
                            }
                            i23 += i11;
                            i22++;
                            i24 = i10;
                        }
                        iArr[i9] = ((i2 - eVar.V) - i24) - i23;
                    } else {
                        if (i18 != 3) {
                            throw j0.a(null, "Unexpected lacing value: " + i18);
                        }
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 4;
                        while (true) {
                            int i29 = eVar.S - i15;
                            int[] iArr5 = eVar.T;
                            if (i26 >= i29) {
                                i3 = i13;
                                i4 = i14;
                                i5 = i15;
                                iArr5[i29] = ((i2 - eVar.V) - i28) - i27;
                                break;
                            }
                            iArr5[i26] = i14;
                            int i30 = i28 + 1;
                            eVar.k(oVar, i30);
                            if (wVar2.a[i28] == 0) {
                                throw j0.a(null, "No valid varint length mask found");
                            }
                            int i31 = i14;
                            while (true) {
                                if (i31 >= 8) {
                                    i6 = i13;
                                    i7 = i15;
                                    j = 0;
                                    i8 = i30;
                                    break;
                                }
                                int i32 = i15 << (7 - i31);
                                i6 = i13;
                                if ((wVar2.a[i28] & i32) != 0) {
                                    int i33 = i30 + i31;
                                    eVar.k(oVar, i33);
                                    i7 = i15;
                                    j = wVar2.a[i28] & b & (~i32);
                                    while (i30 < i33) {
                                        j = (j << 8) | ((long) (wVar2.a[i30] & b));
                                        i30++;
                                        i33 = i33;
                                        b = 255;
                                    }
                                    i8 = i33;
                                    if (i26 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i31 * 7) + 6)) - 1;
                                    break;
                                }
                                i31++;
                                i13 = i6;
                                b = 255;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw j0.a(null, "EBML lacing sample size out of range.");
                            }
                            int i34 = (int) j;
                            int[] iArr6 = eVar.T;
                            if (i26 != 0) {
                                i34 += iArr6[i26 - 1];
                            }
                            iArr6[i26] = i34;
                            i27 += i34;
                            i26++;
                            i14 = i31;
                            i13 = i6;
                            i15 = i7;
                            i28 = i8;
                            b = 255;
                        }
                    }
                    byte[] bArr6 = wVar2.a;
                    eVar.P = eVar.m((bArr6[i5] & 255) | (bArr6[i4] << 8)) + eVar.M;
                    if (dVar3.e != i5 || (i == 163 && (wVar2.a[i3] & 128) == 128)) {
                        i12 = 1;
                    } else {
                        i12 = i4;
                    }
                    eVar.W = i12;
                    eVar.O = i3;
                    eVar.R = i4;
                }
            }
            i3 = 2;
            i4 = 0;
            i5 = 1;
            byte[] bArr7 = wVar2.a;
            eVar.P = eVar.m((bArr7[i5] & 255) | (bArr7[i4] << 8)) + eVar.M;
            if (dVar3.e != i5) {
                i12 = 1;
            } else {
                i12 = 1;
            }
            eVar.W = i12;
            eVar.O = i3;
            eVar.R = i4;
        }
        if (i == 163) {
            while (true) {
                int i35 = eVar.R;
                if (i35 >= eVar.S) {
                    eVar.O = 0;
                    return;
                }
                eVar.h(dVar3, ((long) ((eVar.R * dVar3.f) / 1000)) + eVar.P, eVar.W, eVar.n(oVar, dVar3, eVar.T[i35], false), 0);
                eVar.R++;
            }
        } else {
            while (true) {
                int i36 = eVar.R;
                if (i36 >= eVar.S) {
                    return;
                }
                int[] iArr7 = eVar.T;
                iArr7[i36] = eVar.n(oVar, dVar3, iArr7[i36], true);
                eVar.R++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public int r() {
        return ((c0) this.e).D();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public String s(androidx.media3.common.r rVar) {
        String displayName;
        String str = rVar.d;
        String str2 = rVar.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = androidx.media3.common.util.j0.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strY = y(displayName, t(rVar));
        if (!TextUtils.isEmpty(strY)) {
            return strY;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public String t(androidx.media3.common.r rVar) {
        Resources resources = (Resources) this.e;
        int i = rVar.f;
        int i2 = rVar.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = y(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = y(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? y(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // androidx.recyclerview.widget.w0
    public int u() {
        c0 c0Var = (c0) this.e;
        return c0Var.m - c0Var.E();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public String v(androidx.media3.common.r rVar) {
        String strS;
        String string;
        Resources resources = (Resources) this.e;
        String str = rVar.o;
        int i = rVar.j;
        int i2 = rVar.G;
        int i3 = rVar.w;
        int i4 = rVar.v;
        String str2 = rVar.k;
        int i5 = i0.i(str);
        if (i5 == -1) {
            if (i0.j(str2) != null) {
                i5 = 2;
            } else if (i0.b(str2) != null) {
                i5 = 1;
            } else if (i4 != -1 || i3 != -1) {
                i5 = 2;
            } else if (i2 == -1 && rVar.H == -1) {
                i5 = -1;
            } else {
                i5 = 1;
            }
        }
        if (i5 == 2) {
            strS = y(t(rVar), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (i5 == 1) {
            String strS2 = s(rVar);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i2 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strS = y(strS2, string, i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            strS = s(rVar);
        }
        if (!strS.isEmpty()) {
            return strS;
        }
        String str3 = rVar.d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    public void w(int i, long j) throws j0 {
        androidx.media3.extractor.mkv.e eVar = (androidx.media3.extractor.mkv.e) this.e;
        if (i == 240) {
            if (eVar.z) {
                return;
            }
            eVar.f(i);
            if (eVar.H == -1) {
                eVar.H = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (eVar.z) {
                return;
            }
            eVar.f(i);
            if (eVar.G == -1) {
                eVar.G = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw j0.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw j0.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case Token.DO /* 131 */:
                int i2 = (int) j;
                if (i2 == 1) {
                    eVar.g(i);
                    eVar.y.e = 2;
                    return;
                }
                if (i2 == 2) {
                    eVar.g(i);
                    eVar.y.e = 1;
                    return;
                } else if (i2 == 17) {
                    eVar.g(i);
                    eVar.y.e = 3;
                    return;
                } else if (i2 != 33) {
                    eVar.g(i);
                    eVar.y.e = -1;
                    return;
                } else {
                    eVar.g(i);
                    eVar.y.e = 5;
                    return;
                }
            case Token.WITH /* 136 */:
                eVar.g(i);
                eVar.y.Y = j == 1;
                return;
            case Token.LOCAL_BLOCK /* 155 */:
                eVar.Q = eVar.m(j);
                return;
            case Token.XML /* 159 */:
                eVar.g(i);
                eVar.y.Q = (int) j;
                return;
            case Token.GENEXPR /* 176 */:
                eVar.g(i);
                eVar.y.n = (int) j;
                return;
            case Token.YIELD_STAR /* 179 */:
                if (eVar.z) {
                    return;
                }
                eVar.f(i);
                eVar.E = eVar.m(j);
                return;
            case Token.QUESTION_DOT /* 186 */:
                eVar.g(i);
                eVar.y.o = (int) j;
                return;
            case 215:
                eVar.g(i);
                eVar.y.d = (int) j;
                return;
            case 231:
                eVar.M = eVar.m(j);
                return;
            case 238:
                eVar.X = (int) j;
                return;
            case 247:
                if (eVar.z) {
                    return;
                }
                eVar.f(i);
                eVar.F = (int) j;
                return;
            case 251:
                eVar.Y = true;
                return;
            case 16871:
                eVar.g(i);
                eVar.y.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw j0.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw j0.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw j0.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw j0.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw j0.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                eVar.B = j + eVar.s;
                return;
            case 21432:
                int i3 = (int) j;
                eVar.g(i);
                if (i3 == 0) {
                    eVar.y.y = 0;
                    return;
                }
                if (i3 == 1) {
                    eVar.y.y = 2;
                    return;
                } else if (i3 == 3) {
                    eVar.y.y = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    eVar.y.y = 3;
                    return;
                }
            case 21680:
                eVar.g(i);
                eVar.y.q = (int) j;
                return;
            case 21682:
                eVar.g(i);
                eVar.y.s = (int) j;
                return;
            case 21690:
                eVar.g(i);
                eVar.y.r = (int) j;
                return;
            case 21930:
                eVar.g(i);
                eVar.y.X = j == 1;
                return;
            case 21938:
                eVar.g(i);
                androidx.media3.extractor.mkv.d dVar = eVar.y;
                dVar.z = true;
                dVar.p = (int) j;
                return;
            case 21998:
                eVar.g(i);
                eVar.y.g = (int) j;
                return;
            case 22186:
                eVar.g(i);
                eVar.y.T = j;
                return;
            case 22203:
                eVar.g(i);
                eVar.y.U = j;
                return;
            case 25188:
                eVar.g(i);
                eVar.y.R = (int) j;
                return;
            case 30114:
                eVar.Z = j;
                return;
            case 30321:
                eVar.g(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    eVar.y.t = 0;
                    return;
                }
                if (i4 == 1) {
                    eVar.y.t = 1;
                    return;
                } else if (i4 == 2) {
                    eVar.y.t = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    eVar.y.t = 3;
                    return;
                }
            case 2352003:
                eVar.g(i);
                eVar.y.f = (int) j;
                return;
            case 2807729:
                eVar.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        eVar.g(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            eVar.y.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            eVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        eVar.g(i);
                        int iG = androidx.media3.common.h.g((int) j);
                        if (iG != -1) {
                            eVar.y.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        eVar.g(i);
                        eVar.y.z = true;
                        int iF = androidx.media3.common.h.f((int) j);
                        if (iF != -1) {
                            eVar.y.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        eVar.g(i);
                        eVar.y.D = (int) j;
                        return;
                    case 21949:
                        eVar.g(i);
                        eVar.y.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public View x(int i) {
        return ((c0) this.e).t(i);
    }

    public String y(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.e).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // com.google.android.gms.tasks.e
    public void z(Exception exc) {
        ((CountDownLatch) this.e).countDown();
    }

    public c(Resources resources) {
        resources.getClass();
        this.e = resources;
    }

    public /* synthetic */ c(Object obj) {
        this.e = obj;
    }
}
