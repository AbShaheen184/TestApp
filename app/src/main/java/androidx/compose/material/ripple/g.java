package androidx.compose.material.ripple;

import android.content.Context;
import android.util.SparseArray;
import androidx.appcompat.widget.x;
import androidx.collection.s;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.foundation.text.selection.q0;
import androidx.compose.ui.input.pointer.v;
import androidx.compose.ui.node.p;
import androidx.compose.ui.platform.u;
import androidx.core.view.r;
import androidx.media3.common.util.j0;
import androidx.media3.datasource.cache.i;
import androidx.media3.datasource.cache.l;
import com.caverock.androidsvg.y1;
import com.google.android.gms.internal.measurement.bb;
import com.google.android.gms.internal.measurement.gb;
import com.google.android.gms.internal.measurement.id;
import com.google.android.gms.internal.measurement.jb;
import com.google.android.gms.internal.measurement.kb;
import com.google.android.gms.internal.measurement.kd;
import com.google.android.gms.internal.measurement.mb;
import com.google.common.collect.e0;
import com.google.common.collect.f1;
import com.google.common.collect.h1;
import com.google.common.collect.i1;
import com.google.common.collect.k0;
import com.google.common.collect.l0;
import com.google.common.collect.m0;
import com.google.common.collect.p1;
import com.google.common.collect.q;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.f0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public boolean a = false;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Code duplicated, block: B:110:0x0274  */
    /* JADX WARN: Code duplicated, block: B:111:0x0277  */
    /* JADX WARN: Code duplicated, block: B:114:0x027d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0296  */
    /* JADX WARN: Code duplicated, block: B:118:0x029b  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    public g(mb mbVar, r rVar) throws Throwable {
        f1 f1VarE;
        Throwable th;
        char c;
        long j;
        long j2;
        String str;
        int i = 1;
        kb kbVar = mbVar.a;
        gb gbVar = mbVar.b;
        if (kbVar.a.isEmpty()) {
            gb.B().equals(gbVar);
        }
        this.b = gbVar.u();
        this.c = gbVar.v();
        gbVar.getClass();
        gbVar.getClass();
        Throwable th2 = null;
        Map mapZ = gbVar.y() == 0 ? null : gbVar.z();
        if (mapZ != null) {
            k0.l(mapZ.keySet());
        } else {
            Object[] objArr = h1.F;
        }
        int iY = gbVar.y();
        kb kbVar2 = mbVar.a;
        char c2 = 3;
        if (iY > 0) {
            Collection<bb> collectionValues = gbVar.z().values();
            if (collectionValues == null) {
                f1VarE = f1.D;
            } else {
                x xVarA = f1.a();
                for (bb bbVar : collectionValues) {
                    int I = bbVar.I();
                    int i2 = I - 1;
                    if (I == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        xVarA.q(bbVar.u(), Long.valueOf(bbVar.v()));
                    } else if (i2 == 1) {
                        xVarA.q(bbVar.u(), Boolean.valueOf(bbVar.w()));
                    } else if (i2 == 2) {
                        xVarA.q(bbVar.u(), Double.valueOf(bbVar.x()));
                    } else if (i2 == 3) {
                        xVarA.q(bbVar.u(), bbVar.y());
                    } else {
                        if (i2 != 4) {
                            net.luminis.tls.engine.impl.c.r("Could not serialize Flag for override: ".concat(String.valueOf(bbVar.u())));
                            throw null;
                        }
                        xVarA.q(bbVar.u(), bbVar.z().l());
                    }
                }
                f1VarE = xVarA.e(false);
            }
            if (!f1VarE.isEmpty()) {
                HashMap map = new HashMap(f1VarE);
                m0 m0Var = kbVar2.a;
                l0 l0Var = new l0();
                p1 it = m0Var.iterator();
                while (true) {
                    e0 e0Var = (e0) it;
                    if (!e0Var.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    th = th2;
                                    c = c2;
                                } else {
                                    th = th2;
                                    c = c2;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt <= 9) {
                                            int i3 = i;
                                            while (true) {
                                                if (i3 >= length) {
                                                    j = 0;
                                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                        j2 = jCharAt;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                int iCharAt = str2.charAt(i3) - '0';
                                                j = 0;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i3++;
                                                }
                                            }
                                        }
                                        if (j2 == j) {
                                            str = str2;
                                        } else {
                                            str = th;
                                        }
                                        if (obj instanceof String) {
                                            l0Var.b(new jb(j2, str, 4, 0L, obj));
                                        } else if (obj instanceof byte[]) {
                                            l0Var.b(new jb(j2, str, 5, 0L, obj));
                                        } else if (obj instanceof Boolean) {
                                            l0Var.b(new jb(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                        } else if (obj instanceof Long) {
                                            l0Var.b(new jb(j2, str, 2, ((Long) obj).longValue(), null));
                                        } else {
                                            if (obj instanceof Double) {
                                                String strValueOf = String.valueOf(obj);
                                                net.luminis.tls.engine.impl.c.r(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder(str2.length() + 28 + strValueOf.length()), "Cannot serialize override ", str2, ": ", strValueOf));
                                                throw th;
                                            }
                                            l0Var.b(new jb(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                        }
                                        c2 = c;
                                        th2 = th;
                                        i = 1;
                                    }
                                    j2 = j;
                                    if (j2 == j) {
                                        str = str2;
                                    } else {
                                        str = th;
                                    }
                                    if (obj instanceof String) {
                                        l0Var.b(new jb(j2, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        l0Var.b(new jb(j2, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        l0Var.b(new jb(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        l0Var.b(new jb(j2, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (obj instanceof Double) {
                                            String strValueOf2 = String.valueOf(obj);
                                            net.luminis.tls.engine.impl.c.r(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder(str2.length() + 28 + strValueOf2.length()), "Cannot serialize override ", str2, ": ", strValueOf2));
                                            throw th;
                                        }
                                        l0Var.b(new jb(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c2 = c;
                                    th2 = th;
                                    i = 1;
                                }
                                j = 0;
                                j2 = 0;
                                if (j2 == j) {
                                    str = str2;
                                } else {
                                    str = th;
                                }
                                if (obj instanceof String) {
                                    l0Var.b(new jb(j2, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    l0Var.b(new jb(j2, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    l0Var.b(new jb(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    l0Var.b(new jb(j2, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf3 = String.valueOf(obj);
                                        net.luminis.tls.engine.impl.c.r(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder(str2.length() + 28 + strValueOf3.length()), "Cannot serialize override ", str2, ": ", strValueOf3));
                                        throw th;
                                    }
                                    l0Var.b(new jb(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                th2 = th;
                                i = 1;
                            } else {
                                th = th2;
                                c = c2;
                            }
                            j = 0;
                            j2 = j;
                            if (j2 == j) {
                                str = str2;
                            } else {
                                str = th;
                            }
                            if (obj instanceof String) {
                                l0Var.b(new jb(j2, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                l0Var.b(new jb(j2, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                l0Var.b(new jb(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                l0Var.b(new jb(j2, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf4 = String.valueOf(obj);
                                    net.luminis.tls.engine.impl.c.r(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder(str2.length() + 28 + strValueOf4.length()), "Cannot serialize override ", str2, ": ", strValueOf4));
                                    throw th;
                                }
                                l0Var.b(new jb(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            th2 = th;
                            i = 1;
                        }
                        kbVar2 = new kb(l0Var.h());
                        break;
                    }
                    jb jbVar = (jb) e0Var.next();
                    Object obj2 = jbVar.y;
                    long j3 = jbVar.e;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j3) : obj2);
                    if (objRemove == null) {
                        l0Var.b(jbVar);
                    } else if (objRemove instanceof String) {
                        l0Var.b(new jb(jbVar.e, jbVar.y, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        l0Var.b(new jb(jbVar.e, jbVar.y, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        l0Var.b(new jb(jbVar.e, jbVar.y, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        l0Var.b(new jb(jbVar.e, jbVar.y, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = jbVar.y;
                            string = string == null ? Long.toString(j3) : string;
                            String string2 = objRemove.toString();
                            throw new IllegalStateException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder(String.valueOf(string).length() + 46 + string2.length()), "Cannot serialize override for existing flag ", string, ": ", string2));
                        }
                        l0Var.b(new jb(jbVar.e, jbVar.y, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((i1) kbVar2.a).D.size() + 3;
        q.f(size, "expectedSize");
        x xVar = new x(size);
        p1 it2 = kbVar2.a.iterator();
        while (true) {
            e0 e0Var2 = (e0) it2;
            if (!e0Var2.hasNext()) {
                xVar.q("__phenotype_server_token", gbVar.w());
                xVar.q("__phenotype_snapshot_token", gbVar.u());
                xVar.q("__phenotype_configuration_version", Long.valueOf(gbVar.x()));
                this.d = xVar.e(false);
                this.e = rVar;
                return;
            }
            jb jbVar2 = (jb) e0Var2.next();
            String string3 = jbVar2.y;
            if (string3 == null) {
                string3 = Long.toString(jbVar2.e);
            }
            xVar.q(string3, jbVar2.a());
        }
    }

    public static int c(androidx.media3.datasource.cache.g gVar, int i) {
        int iHashCode = gVar.b.hashCode() + (gVar.a * 31);
        i iVar = gVar.e;
        if (i < 2) {
            long jA = androidx.media3.datasource.cache.h.a(iVar);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return iVar.hashCode() + (iHashCode * 31);
    }

    public static androidx.media3.datasource.cache.g h(int i, DataInputStream dataInputStream) throws IOException {
        i iVar;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            androidx.media3.common.util.b bVar = new androidx.media3.common.util.b(4);
            bVar.n(Long.valueOf(j), "exo_len");
            iVar = i.c.b(bVar);
        } else {
            int i3 = dataInputStream.readInt();
            HashMap map = new HashMap();
            for (int i4 = 0; i4 < i3; i4++) {
                String utf2 = dataInputStream.readUTF();
                int i5 = dataInputStream.readInt();
                if (i5 < 0) {
                    net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i5, "Invalid value size: "));
                    return null;
                }
                int iMin = Math.min(i5, 10485760);
                byte[] bArrCopyOf = j0.b;
                int i6 = 0;
                while (i6 != i5) {
                    int i7 = i6 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                    dataInputStream.readFully(bArrCopyOf, i6, iMin);
                    iMin = Math.min(i5 - i7, 10485760);
                    i6 = i7;
                }
                map.put(utf2, bArrCopyOf);
            }
            iVar = new i(map);
        }
        return new androidx.media3.datasource.cache.g(i2, utf, iVar);
    }

    public void a() {
        synchronized (((okhttp3.f) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            okhttp3.internal.e.b((f0) this.c);
            try {
                ((b1) this.b).a();
            } catch (IOException unused) {
            }
        }
    }

    public boolean b() {
        androidx.media3.common.util.b bVar = (androidx.media3.common.util.b) this.d;
        return ((File) bVar.y).exists() || ((File) bVar.z).exists();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: all -> 0x007e, IOException -> 0x0081, LOOP:0: B:36:0x0093->B:37:0x0095, LOOP_END, TryCatch #4 {IOException -> 0x0081, all -> 0x007e, blocks: (B:13:0x0045, B:18:0x004f, B:24:0x005f, B:25:0x0069, B:26:0x0072, B:33:0x0086, B:34:0x008b, B:35:0x008c, B:37:0x0095, B:38:0x00ab), top: B:61:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    public void e(HashMap map, SparseArray sparseArray) {
        int i;
        int i2;
        int iC;
        int i3;
        com.google.android.material.motion.a.q(!this.a);
        Cipher cipher = (Cipher) this.b;
        androidx.media3.common.util.b bVar = (androidx.media3.common.util.b) this.d;
        File file = (File) bVar.y;
        File file2 = (File) bVar.y;
        File file3 = (File) bVar.z;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i4 = dataInputStream2.readInt();
                    if (i4 >= 0 && i4 <= 2) {
                        if ((dataInputStream2.readInt() & 1) == 0) {
                            i = dataInputStream2.readInt();
                            iC = 0;
                            for (i2 = 0; i2 < i; i2++) {
                                androidx.media3.datasource.cache.g gVarH = h(i4, dataInputStream2);
                                String str = gVarH.b;
                                map.put(str, gVarH);
                                sparseArray.put(gVarH.a, str);
                                iC += c(gVarH, i4);
                            }
                            i3 = dataInputStream2.readInt();
                            boolean z = dataInputStream2.read() == -1;
                            if (i3 == iC && z) {
                                j0.h(dataInputStream2);
                                return;
                            }
                        } else if (cipher != null) {
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.c;
                                String str2 = j0.a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                i = dataInputStream2.readInt();
                                iC = 0;
                                while (i2 < i) {
                                    androidx.media3.datasource.cache.g gVarH2 = h(i4, dataInputStream2);
                                    String str3 = gVarH2.b;
                                    map.put(str3, gVarH2);
                                    sparseArray.put(gVarH2.a, str3);
                                    iC += c(gVarH2, i4);
                                }
                                i3 = dataInputStream2.readInt();
                                if (dataInputStream2.read() == -1) {
                                }
                                if (i3 == iC) {
                                    j0.h(dataInputStream2);
                                    return;
                                }
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                    }
                    j0.h(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        j0.h(dataInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        j0.h(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            map.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    public void f(androidx.media3.datasource.cache.g gVar) {
        this.a = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int g(o oVar, u uVar, boolean z) {
        int i;
        byte b;
        int i2;
        int i3;
        androidx.compose.ui.input.pointer.d dVar = (androidx.compose.ui.input.pointer.d) this.c;
        p pVar = (p) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            q0 q0VarY = ((com.app.mlounge.data.music.e) this.d).y(oVar, uVar);
            s sVar = (s) q0VarY.z;
            int iG = sVar.g();
            while (true) {
                if (i >= iG) {
                    b = true;
                    break;
                }
                v vVar = (v) sVar.h(i);
                i = (vVar.d || vVar.h) ? 0 : i + 1;
                b = false;
                break;
            }
            int iG2 = sVar.g();
            for (int i4 = 0; i4 < iG2; i4++) {
                v vVar2 = (v) sVar.h(i4);
                if (b != false || androidx.compose.ui.input.pointer.u.b(vVar2)) {
                    ((androidx.compose.ui.node.f0) this.b).A(vVar2.c, (p) this.e, vVar2.i, true);
                    if (!pVar.e.h()) {
                        dVar.a(vVar2.a, pVar, androidx.compose.ui.input.pointer.u.b(vVar2));
                        pVar.clear();
                    }
                }
            }
            boolean zB = dVar.b(q0VarY, z);
            if (q0VarY.y) {
                i2 = 0;
                break;
            }
            int iG3 = sVar.g();
            int i5 = 0;
            while (true) {
                if (i5 >= iG3) {
                    i2 = 0;
                    break;
                }
                v vVar3 = (v) sVar.h(i5);
                if (!androidx.compose.ui.geometry.b.b(androidx.compose.ui.input.pointer.u.g(vVar3, true), 0L) && vVar3.b()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iG4 = sVar.g();
            for (int i6 = 0; i6 < iG4; i6++) {
                if (((v) sVar.h(i6)).b()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.a = false;
        }
    }

    public synchronized void i() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((coil3.util.a) this.c).b(context);
                context.unregisterComponentCallbacks((coil3.util.b) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void j(HashMap map) {
        androidx.media3.common.util.b bVar = (androidx.media3.common.util.b) this.d;
        DataOutputStream dataOutputStream = null;
        try {
            androidx.media3.common.util.a aVarH = bVar.H();
            l lVar = (l) this.e;
            if (lVar == null) {
                this.e = new l(aVarH);
            } else {
                lVar.a(aVarH);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((l) this.e);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iC = 0;
                for (androidx.media3.datasource.cache.g gVar : map.values()) {
                    dataOutputStream2.writeInt(gVar.a);
                    dataOutputStream2.writeUTF(gVar.b);
                    y1.h(gVar.e, dataOutputStream2);
                    iC += c(gVar, 2);
                }
                dataOutputStream2.writeInt(iC);
                dataOutputStream2.close();
                ((File) bVar.z).delete();
                String str = j0.a;
                this.a = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                j0.h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void d(long j) {
    }

    public g(id idVar, r rVar) {
        id.B().equals(idVar);
        this.b = idVar.u();
        this.c = idVar.v();
        int i = k0.z;
        Object[] objArr = h1.F;
        int iZ = idVar.z() + 3;
        q.f(iZ, "expectedSize");
        x xVar = new x(iZ);
        for (kd kdVar : idVar.y()) {
            int iH = kdVar.H();
            int i2 = iH - 1;
            if (iH == 0) {
                throw null;
            }
            if (i2 == 0) {
                xVar.q(kdVar.u(), Long.valueOf(kdVar.v()));
            } else if (i2 == 1) {
                xVar.q(kdVar.u(), Boolean.valueOf(kdVar.w()));
            } else if (i2 == 2) {
                xVar.q(kdVar.u(), Double.valueOf(kdVar.x()));
            } else if (i2 == 3) {
                xVar.q(kdVar.u(), kdVar.y());
            } else if (i2 == 4) {
                xVar.q(kdVar.u(), kdVar.z().l());
            }
        }
        xVar.q("__phenotype_server_token", idVar.w());
        xVar.q("__phenotype_snapshot_token", idVar.u());
        xVar.q("__phenotype_configuration_version", Long.valueOf(idVar.x()));
        this.d = xVar.e(false);
        this.e = rVar;
    }
}
