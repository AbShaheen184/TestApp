package androidx.compose.foundation.lazy.layout;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import androidx.appcompat.widget.q2;
import androidx.compose.ui.layout.l1;
import com.google.firebase.crashlytics.internal.model.t1;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements androidx.media3.extractor.p {
    public Object A;
    public boolean e;
    public final Object y;
    public Object z;

    public b1(int i) {
        switch (i) {
            case 3:
                this.y = new float[16];
                this.z = new float[16];
                this.A = new androidx.compose.ui.text.android.selection.e();
                break;
            default:
                this.y = new Object();
                this.z = new ArrayList();
                this.A = new ArrayList();
                this.e = true;
                break;
        }
    }

    public static IOException b(b1 b1Var, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            b1Var.r(iOException);
        }
        return ((okhttp3.internal.connection.m) b1Var.y).h(b1Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public static void e(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    public void a() {
        okhttp3.internal.cache.h hVar = (okhttp3.internal.cache.h) this.A;
        synchronized (hVar) {
            try {
                if (this.e) {
                    throw new IllegalStateException("Check failed.");
                }
                if (kotlin.jvm.internal.l.a(((okhttp3.internal.cache.d) this.y).g, this)) {
                    hVar.g(this, false);
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        okhttp3.internal.cache.h hVar = (okhttp3.internal.cache.h) this.A;
        synchronized (hVar) {
            try {
                if (this.e) {
                    throw new IllegalStateException("Check failed.");
                }
                if (kotlin.jvm.internal.l.a(((okhttp3.internal.cache.d) this.y).g, this)) {
                    hVar.g(this, true);
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z) {
        coil3.disk.d dVar = (coil3.disk.d) this.A;
        synchronized (dVar.E) {
            try {
                if (this.e) {
                    throw new IllegalStateException("editor is closed");
                }
                if (kotlin.jvm.internal.l.a(((coil3.disk.a) this.y).g, this)) {
                    coil3.disk.d.a(dVar, this, z);
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        okhttp3.internal.cache.d dVar = (okhttp3.internal.cache.d) this.y;
        if (kotlin.jvm.internal.l.a(dVar.g, this)) {
            okhttp3.internal.cache.h hVar = (okhttp3.internal.cache.h) this.A;
            if (hVar.I) {
                hVar.g(this, false);
            } else {
                dVar.f = true;
            }
        }
    }

    @Override // androidx.media3.extractor.p
    public void g(androidx.media3.extractor.a0 a0Var) {
        ((androidx.media3.extractor.p) this.y).g(a0Var);
    }

    public okio.x h(int i) {
        okio.x xVar;
        coil3.disk.d dVar = (coil3.disk.d) this.A;
        synchronized (dVar.E) {
            if (this.e) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.z)[i] = true;
            Object obj = ((coil3.disk.a) this.y).d.get(i);
            t1.i(dVar.N, (okio.x) obj);
            xVar = (okio.x) obj;
        }
        return xVar;
    }

    public okhttp3.internal.connection.n i() {
        okhttp3.internal.http.d dVarI = ((okhttp3.internal.http.e) this.A).i();
        okhttp3.internal.connection.n nVar = dVarI instanceof okhttp3.internal.connection.n ? (okhttp3.internal.connection.n) dVarI : null;
        if (nVar != null) {
            return nVar;
        }
        net.luminis.tls.engine.impl.c.r("no connection for CONNECT tunnels");
        return null;
    }

    public synchronized void j() {
        try {
            if (this.e) {
                return;
            }
            Boolean boolM = m();
            this.z = boolM;
            if (boolM == null) {
                com.google.firebase.components.s sVar = new com.google.firebase.components.s(22);
                com.google.firebase.components.l lVar = (com.google.firebase.components.l) ((com.google.firebase.events.c) this.y);
                lVar.a(lVar.c, sVar);
            }
            this.e = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean k() {
        Boolean bool;
        try {
            j();
            bool = (Boolean) this.z;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.A).a.h();
    }

    public okio.f0 l(int i) {
        okhttp3.internal.cache.h hVar = (okhttp3.internal.cache.h) this.A;
        synchronized (hVar) {
            try {
                if (this.e) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!kotlin.jvm.internal.l.a(((okhttp3.internal.cache.d) this.y).g, this)) {
                    return new okio.d();
                }
                if (!((okhttp3.internal.cache.d) this.y).e) {
                    boolean[] zArr = (boolean[]) this.z;
                    zArr.getClass();
                    zArr[i] = true;
                }
                okio.x xVar = (okio.x) ((okhttp3.internal.cache.d) this.y).d.get(i);
                try {
                    okhttp3.internal.cache.g gVar = hVar.y;
                    gVar.getClass();
                    xVar.getClass();
                    return new okhttp3.internal.cache.i(gVar.b0(xVar, false), new androidx.datastore.core.t0(23, hVar, this));
                } catch (FileNotFoundException unused) {
                    return new okio.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.google.firebase.g gVar = ((FirebaseMessaging) this.A).a;
        gVar.a();
        Context context = gVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public okhttp3.f0 n(boolean z) throws IOException {
        try {
            okhttp3.f0 f0VarE = ((okhttp3.internal.http.e) this.A).e(z);
            if (f0VarE == null) {
                return f0VarE;
            }
            f0VarE.n = this;
            return f0VarE;
        } catch (IOException e) {
            r(e);
            throw e;
        }
    }

    @Override // androidx.media3.extractor.p
    public void o() {
        SparseArray sparseArray = (SparseArray) this.A;
        ((androidx.media3.extractor.p) this.y).o();
        if (this.e) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((androidx.media3.extractor.text.m) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public void p() {
        if (this.e) {
            ((androidx.media3.common.util.g0) this.A).d(new androidx.activity.l(this, 10));
            this.e = false;
        }
    }

    public boolean q(String str, String str2) {
        synchronized (this) {
            try {
                if (!((com.google.firebase.crashlytics.internal.metadata.e) ((AtomicMarkableReference) this.y).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.y;
                atomicMarkableReference.set((com.google.firebase.crashlytics.internal.metadata.e) atomicMarkableReference.getReference(), true);
                com.google.android.datatransport.runtime.scheduling.jobscheduling.k kVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(this, 7);
                AtomicReference atomicReference = (AtomicReference) this.z;
                while (!atomicReference.compareAndSet(null, kVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((com.google.firebase.crashlytics.internal.concurrency.d) ((q2) this.A).b).b.a(kVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(IOException iOException) {
        this.e = true;
        ((okhttp3.internal.http.e) this.A).i().c((okhttp3.internal.connection.m) this.y, iOException);
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.c s() throws SocketException {
        okhttp3.internal.connection.m mVar = (okhttp3.internal.connection.m) this.y;
        if (mVar.G) {
            net.luminis.tls.engine.impl.c.r("Check failed.");
            return null;
        }
        mVar.G = true;
        mVar.B.j();
        synchronized (mVar) {
            if (mVar.O == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (mVar.K || mVar.L) {
                throw new IllegalStateException("Check failed.");
            }
            if (mVar.I) {
                throw new IllegalStateException("Check failed.");
            }
            if (!mVar.J) {
                throw new IllegalStateException("Check failed.");
            }
            mVar.J = false;
            mVar.K = true;
            mVar.L = true;
        }
        okhttp3.internal.http.d dVarI = ((okhttp3.internal.http.e) this.A).i();
        dVarI.getClass();
        okhttp3.internal.connection.n nVar = (okhttp3.internal.connection.n) dVarI;
        nVar.e.setSoTimeout(0);
        nVar.f();
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(this);
    }

    public String t() {
        if (!this.e) {
            this.e = true;
            com.google.android.gms.measurement.internal.g1 g1Var = (com.google.android.gms.measurement.internal.g1) this.A;
            this.z = g1Var.z().getString((String) this.y, null);
        }
        return (String) this.z;
    }

    @Override // androidx.media3.extractor.p
    public androidx.media3.extractor.h0 u(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.A;
        androidx.media3.extractor.p pVar = (androidx.media3.extractor.p) this.y;
        if (i2 != 3 && i2 != 5) {
            this.e = true;
        }
        if (i2 != 3) {
            return pVar.u(i, i2);
        }
        androidx.media3.extractor.text.m mVar = (androidx.media3.extractor.text.m) sparseArray.get(i);
        if (mVar != null) {
            return mVar;
        }
        androidx.media3.extractor.text.m mVar2 = new androidx.media3.extractor.text.m(pVar.u(i, i2), (androidx.media3.extractor.text.j) this.z);
        sparseArray.put(i, mVar2);
        return mVar2;
    }

    public void v(String str) {
        SharedPreferences.Editor editorEdit = ((com.google.android.gms.measurement.internal.g1) this.A).z().edit();
        editorEdit.putString((String) this.y, str);
        editorEdit.apply();
        this.z = str;
    }

    public b1(com.google.android.gms.measurement.internal.g1 g1Var, String str) {
        this.A = g1Var;
        com.google.android.gms.common.internal.x.d(str);
        this.y = str;
    }

    public b1(androidx.compose.material.ripple.g gVar, androidx.emoji2.text.f fVar, com.google.android.gms.common.d[] dVarArr, boolean z) {
        this.A = gVar;
        this.y = fVar;
        this.z = dVarArr;
        this.e = z;
    }

    public b1(okhttp3.internal.connection.m mVar, okhttp3.internal.connection.g gVar, okhttp3.internal.http.e eVar) {
        gVar.getClass();
        this.y = mVar;
        this.z = gVar;
        this.A = eVar;
    }

    public b1(androidx.media3.extractor.p pVar, androidx.media3.extractor.text.j jVar) {
        this.y = pVar;
        this.z = jVar;
        this.A = new SparseArray();
    }

    public b1(Context context, Looper looper, Looper looper2, androidx.media3.exoplayer.x xVar, androidx.media3.common.util.e0 e0Var) {
        this.y = context.getApplicationContext();
        this.A = e0Var.a(looper, null);
        this.z = new androidx.media3.common.audio.a(this, e0Var.a(looper2, null), xVar);
    }

    public b1(q2 q2Var, boolean z) {
        this.A = q2Var;
        this.z = new AtomicReference(null);
        this.e = z;
        this.y = new AtomicMarkableReference(new com.google.firebase.crashlytics.internal.metadata.e(z ? 8192 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY), false);
    }

    public b1(x xVar, l1 l1Var, c1 c1Var) {
        this.y = xVar;
        this.z = l1Var;
        this.A = c1Var;
        this.e = true;
    }

    public b1(coil3.disk.d dVar, coil3.disk.a aVar) {
        this.A = dVar;
        this.y = aVar;
        this.z = new boolean[2];
    }

    public b1(FirebaseMessaging firebaseMessaging, com.google.firebase.events.c cVar) {
        this.A = firebaseMessaging;
        this.y = cVar;
    }

    public b1(okhttp3.internal.cache.h hVar, okhttp3.internal.cache.d dVar) {
        boolean[] zArr;
        this.A = hVar;
        this.y = dVar;
        if (dVar.e) {
            zArr = null;
        } else {
            hVar.getClass();
            zArr = new boolean[2];
        }
        this.z = zArr;
    }
}
