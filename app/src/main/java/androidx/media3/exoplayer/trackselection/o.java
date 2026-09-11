package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.a1;
import androidx.media3.common.util.j0;
import androidx.media3.common.w0;
import androidx.media3.common.x0;
import androidx.media3.exoplayer.k0;
import androidx.media3.exoplayer.source.i1;
import com.google.common.collect.h0;
import com.google.common.collect.v;
import com.google.common.collect.y;
import com.google.common.collect.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final z0 k = new v(new androidx.compose.foundation.lazy.layout.a(10));
    public k0 a;
    public androidx.media3.exoplayer.upstream.f b;
    public final Object c;
    public final Context d;
    public final com.google.android.material.shape.g e;
    public j f;
    public Thread g;
    public androidx.media3.exoplayer.util.d h;
    public androidx.media3.common.e i;
    public Boolean j;

    public o(Context context) {
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        j jVar = j.G;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = gVar;
        if (jVar != null) {
            this.f = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.c(jVar);
            this.f = new j(iVar);
        }
        this.i = androidx.media3.common.e.b;
        if (this.f.B && context == null) {
            androidx.media3.common.util.c.t("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(androidx.media3.common.r rVar, h0 h0Var) {
        for (int i = 0; i < h0Var.size(); i++) {
            for (int i2 = 0; i2 < rVar.c.size(); i2++) {
                if (((androidx.media3.common.t) rVar.c.get(i2)).b.equals(h0Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void b(s sVar, j jVar, p[] pVarArr) {
        int i = sVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            i1 i1Var = sVar.c[i2];
            Map map = (Map) jVar.E.get(i2);
            if (map != null && map.containsKey(i1Var)) {
                Map map2 = (Map) jVar.E.get(i2);
                if (map2 != null && map2.get(i1Var) != null) {
                    androidx.transition.k.i();
                    return;
                }
                pVarArr[i2] = null;
            }
        }
    }

    public static void c(s sVar, j jVar, p[] pVarArr) {
        for (int i = 0; i < sVar.a; i++) {
            int i2 = sVar.b[i];
            if (jVar.F.get(i) || jVar.w.contains(Integer.valueOf(i2))) {
                pVarArr[i] = null;
            }
        }
    }

    public static void d(s sVar, j jVar, p[] pVarArr) {
        int i = sVar.a;
        i1[] i1VarArr = sVar.c;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            e(i1VarArr[i2], jVar, map);
        }
        e(sVar.f, jVar, map);
        for (int i3 = 0; i3 < i; i3++) {
            x0 x0Var = (x0) map.get(Integer.valueOf(sVar.b[i3]));
            if (x0Var != null) {
                w0 w0Var = x0Var.a;
                h0 h0Var = x0Var.b;
                pVarArr[i3] = (h0Var.isEmpty() || i1VarArr[i3].b(w0Var) == -1) ? null : new p(0, w0Var, a0.F(h0Var));
            }
        }
    }

    public static void e(i1 i1Var, a1 a1Var, HashMap map) {
        for (int i = 0; i < i1Var.a; i++) {
            x0 x0Var = (x0) a1Var.v.get(i1Var.a(i));
            if (x0Var != null) {
                w0 w0Var = x0Var.a;
                x0 x0Var2 = (x0) map.get(Integer.valueOf(w0Var.c));
                if (x0Var2 == null || (x0Var2.b.isEmpty() && !x0Var.b.isEmpty())) {
                    map.put(Integer.valueOf(w0Var.c), x0Var);
                }
            }
        }
    }

    public static Pair f(p[] pVarArr, int i) {
        for (int i2 = 0; i2 < pVarArr.length; i2++) {
            p pVar = pVarArr[i2];
            if (pVar != null && pVar.a.c == i) {
                return Pair.create(pVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int g(androidx.media3.common.r rVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(rVar.d)) {
            return 4;
        }
        String strJ = j(str);
        String strJ2 = j(rVar.d);
        if (strJ2 == null || strJ == null) {
            return (z && strJ2 == null) ? 1 : 0;
        }
        if (strJ2.startsWith(strJ) || strJ.startsWith(strJ2)) {
            return 3;
        }
        String str2 = j0.a;
        return strJ2.split("-", 2)[0].equals(strJ.split("-", 2)[0]) ? 2 : 0;
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    public static p l(i1 i1Var, int[][] iArr, j jVar) {
        jVar.q.getClass();
        w0 w0Var = null;
        h hVar = null;
        int i = 0;
        for (int i2 = 0; i2 < i1Var.a; i2++) {
            w0 w0VarA = i1Var.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < w0VarA.a; i3++) {
                if (androidx.media3.exoplayer.a.n(iArr2[i3], jVar.C)) {
                    h hVar2 = new h(w0VarA.d[i3], iArr2[i3]);
                    if (hVar != null) {
                        if (y.a.c(hVar2.y, hVar.y).c(hVar2.e, hVar.e).e() > 0) {
                            w0Var = w0VarA;
                            i = i3;
                            hVar = hVar2;
                        }
                    } else {
                        w0Var = w0VarA;
                        i = i3;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (w0Var == null) {
            return null;
        }
        return new p(0, w0Var, new int[]{i});
    }

    public static Pair m(int i, s sVar, int[][][] iArr, l lVar, Comparator comparator) {
        int i2;
        RandomAccess randomAccessS;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        int i3 = sVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == sVar2.b[i4]) {
                i1 i1Var = sVar2.c[i4];
                for (int i5 = 0; i5 < i1Var.a; i5++) {
                    w0 w0VarA = i1Var.a(i5);
                    com.google.common.collect.a1 a1VarA = lVar.a(i4, w0VarA, iArr[i4][i5]);
                    int i6 = w0VarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        m mVar = (m) a1VarA.get(i7);
                        int iA = mVar.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessS = h0.s(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    m mVar2 = (m) a1VarA.get(i8);
                                    int i9 = i3;
                                    if (mVar2.a() == 2 && mVar.d(mVar2)) {
                                        arrayList2.add(mVar2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessS = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessS);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            sVar2 = sVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((m) list.get(i10)).z;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(0, mVar3.y, iArr2), Integer.valueOf(mVar3.e));
    }

    public final j h() {
        j jVar;
        synchronized (this.c) {
            jVar = this.f;
        }
        return jVar;
    }

    public final void i() {
        boolean z;
        k0 k0Var;
        androidx.media3.exoplayer.util.d dVar;
        synchronized (this.c) {
            try {
                z = this.f.B && Build.VERSION.SDK_INT >= 32 && (dVar = this.h) != null && dVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (k0Var = this.a) == null) {
            return;
        }
        k0Var.E.f(10);
    }

    public final void k() {
        androidx.media3.exoplayer.util.d dVar;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    com.google.android.material.motion.a.p("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.h) != null) {
            dVar.e();
            this.h = null;
        }
        this.a = null;
        this.b = null;
    }

    public final void n(a1 a1Var) {
        if (a1Var instanceof j) {
            o((j) a1Var);
        }
        i iVar = new i(h());
        iVar.c(a1Var);
        o(new j(iVar));
    }

    public final void o(j jVar) {
        boolean zEquals;
        synchronized (this.c) {
            zEquals = this.f.equals(jVar);
            this.f = jVar;
        }
        if (zEquals) {
            return;
        }
        if (jVar.B && this.d == null) {
            androidx.media3.common.util.c.t("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        k0 k0Var = this.a;
        if (k0Var != null) {
            k0Var.E.f(10);
        }
    }
}
