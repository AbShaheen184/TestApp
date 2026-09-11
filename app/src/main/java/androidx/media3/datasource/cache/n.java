package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.util.j0;
import com.caverock.androidsvg.y1;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final HashSet i = new HashSet();
    public final File a;
    public final k b;
    public final y1 c;
    public final HashMap d;
    public final Random e;
    public final boolean f;
    public long g;
    public a h;

    public n(File file, k kVar) {
        boolean zAdd;
        y1 y1Var = new y1();
        y1Var.a = new HashMap();
        y1Var.b = new SparseArray();
        y1Var.c = new SparseBooleanArray();
        y1Var.d = new SparseBooleanArray();
        File file2 = new File(file, "cached_content_index.exi");
        androidx.compose.material.ripple.g gVar = new androidx.compose.material.ripple.g();
        gVar.b = null;
        gVar.c = null;
        gVar.d = new androidx.media3.common.util.b(file2);
        String str = j0.a;
        y1Var.e = gVar;
        y1Var.f = null;
        synchronized (n.class) {
            zAdd = i.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            com.google.gson.b.m(file, "Another SimpleCache instance uses the folder: ");
            throw null;
        }
        this.a = file;
        this.b = kVar;
        this.c = y1Var;
        this.d = new HashMap();
        this.e = new Random();
        this.f = true;
        this.g = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new m(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(n nVar) {
        long j;
        y1 y1Var = nVar.c;
        File file = nVar.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (a e) {
                nVar.h = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            androidx.media3.common.util.c.f("SimpleCache", str);
            nVar.h = new a(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i2];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    androidx.media3.common.util.c.f("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i2++;
        }
        nVar.g = j;
        if (j == -1) {
            try {
                long jNextLong = new SecureRandom().nextLong();
                long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
                File file3 = new File(file, androidx.constraintlayout.core.g.c(Long.toString(jAbs, 16), ".uid"));
                if (!file3.createNewFile()) {
                    net.luminis.tls.engine.impl.c.u(file3, "Failed to create UID file: ");
                    jAbs = 0;
                }
                nVar.g = jAbs;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                androidx.media3.common.util.c.g("SimpleCache", str2, e2);
                nVar.h = new a(str2, e2);
                return;
            }
        }
        try {
            y1Var.O(nVar.g);
            nVar.h(file, true, fileArrListFiles);
            p1 it = k0.l(((HashMap) y1Var.a).keySet()).iterator();
            while (it.hasNext()) {
                y1Var.X((String) it.next());
            }
            try {
                y1Var.p0();
            } catch (IOException e3) {
                androidx.media3.common.util.c.g("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            androidx.media3.common.util.c.g("SimpleCache", str3, e4);
            nVar.h = new a(str3, e4);
        }
    }

    public static void e(File file) throws a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        androidx.media3.common.util.c.f("SimpleCache", str);
        throw new a(str);
    }

    public final void b(o oVar) {
        String str = oVar.e;
        this.c.L(str).c.add(oVar);
        ArrayList arrayList = (ArrayList) this.d.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k) arrayList.get(size)).b(this, oVar);
            }
        }
        this.b.b(this, oVar);
    }

    public final synchronized void c(String str, androidx.media3.common.util.b bVar) {
        d();
        y1 y1Var = this.c;
        g gVarL = y1Var.L(str);
        i iVar = gVarL.e;
        i iVarB = iVar.b(bVar);
        gVarL.e = iVarB;
        if (!iVarB.equals(iVar)) {
            ((androidx.compose.material.ripple.g) y1Var.e).f(gVarL);
        }
        try {
            this.c.p0();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    public final synchronized void d() {
        a aVar = this.h;
        if (aVar != null) {
            throw aVar;
        }
    }

    public final synchronized i f(String str) {
        g gVarI;
        gVarI = this.c.I(str);
        return gVarI != null ? gVarI.e : i.c;
    }

    public final o g(long j, long j2, String str) {
        o oVar;
        long j3;
        g gVarI = this.c.I(str);
        if (gVarI == null) {
            return new o(str, j, j2, -9223372036854775807L, null);
        }
        while (true) {
            o oVar2 = new o(gVarI.b, j, -1L, -9223372036854775807L, null);
            TreeSet treeSet = gVarI.c;
            oVar = (o) treeSet.floor(oVar2);
            if (oVar == null || oVar.y + oVar.z <= j) {
                o oVar3 = (o) treeSet.ceiling(oVar2);
                if (oVar3 != null) {
                    long jMin = oVar3.y - j;
                    if (j2 != -1) {
                        jMin = Math.min(jMin, j2);
                    }
                    j3 = jMin;
                } else {
                    j3 = j2;
                }
                oVar = new o(gVarI.b, j, j3, -9223372036854775807L, null);
            }
            if (!oVar.A) {
                break;
            }
            File file = oVar.B;
            file.getClass();
            if (file.length() == oVar.z) {
                break;
            }
            k();
        }
        return oVar;
    }

    public final void h(File file, boolean z, File[] fileArr) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                h(file2, false, file2.listFiles());
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                o oVarD = o.d(file2, -1L, this.c);
                if (oVarD != null) {
                    b(oVarD);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void i(o oVar) {
        g gVarI = this.c.I(oVar.e);
        gVarI.getClass();
        long j = oVar.y;
        ArrayList arrayList = gVarI.d;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((f) arrayList.get(i2)).a == j) {
                arrayList.remove(i2);
                this.c.X(gVarI.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void j(o oVar) {
        String str = oVar.e;
        long j = oVar.z;
        y1 y1Var = this.c;
        g gVarI = y1Var.I(str);
        if (gVarI == null || !gVarI.c.remove(oVar)) {
            return;
        }
        File file = oVar.B;
        if (file != null) {
            file.delete();
        }
        y1Var.X(gVarI.b);
        ArrayList arrayList = (ArrayList) this.d.get(oVar.e);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                k kVar = (k) arrayList.get(size);
                kVar.a.remove(oVar);
                kVar.b -= j;
            }
        }
        k kVar2 = this.b;
        kVar2.a.remove(oVar);
        kVar2.b -= j;
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            for (o oVar : ((g) it.next()).c) {
                File file = oVar.B;
                file.getClass();
                if (file.length() != oVar.z) {
                    arrayList.add(oVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            j((o) arrayList.get(i2));
        }
    }

    public final synchronized o l(long j, long j2, String str) {
        d();
        o oVarG = g(j, j2, str);
        if (oVarG.A) {
            return m(str, oVarG);
        }
        g gVarL = this.c.L(str);
        long j3 = oVarG.z;
        ArrayList arrayList = gVarL.d;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            f fVar = (f) arrayList.get(i2);
            long j4 = fVar.a;
            if (j4 <= j) {
                long j5 = fVar.b;
                if (j5 == -1 || j4 + j5 > j) {
                    return null;
                }
            } else {
                if (j3 == -1 || j + j3 > j4) {
                    return null;
                }
            }
        }
        arrayList.add(new f(j, j3));
        return oVarG;
    }

    public final o m(String str, o oVar) {
        File file;
        long j = oVar.z;
        File file2 = oVar.B;
        if (!this.f) {
            return oVar;
        }
        file2.getClass();
        file2.getName();
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVarI = this.c.I(str);
        gVarI.getClass();
        TreeSet treeSet = gVarI.c;
        com.google.android.material.motion.a.q(treeSet.remove(oVar));
        file2.getClass();
        File parentFile = file2.getParentFile();
        parentFile.getClass();
        File fileE = o.e(parentFile, gVarI.a, oVar.y, jCurrentTimeMillis);
        if (file2.renameTo(fileE)) {
            file = fileE;
        } else {
            androidx.media3.common.util.c.t("CachedContent", "Failed to rename " + file2 + " to " + fileE);
            file = file2;
        }
        com.google.android.material.motion.a.q(oVar.A);
        o oVar2 = new o(oVar.e, oVar.y, oVar.z, jCurrentTimeMillis, file);
        treeSet.add(oVar2);
        ArrayList arrayList = (ArrayList) this.d.get(oVar.e);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                k kVar = (k) arrayList.get(size);
                kVar.a.remove(oVar);
                kVar.b -= j;
                kVar.b(this, oVar2);
            }
        }
        k kVar2 = this.b;
        kVar2.a.remove(oVar);
        kVar2.b -= j;
        kVar2.b(this, oVar2);
        return oVar2;
    }
}
