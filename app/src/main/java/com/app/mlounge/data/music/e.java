package com.app.mlounge.data.music;

import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.i0;
import androidx.compose.animation.b1;
import androidx.compose.animation.c1;
import androidx.compose.animation.core.d0;
import androidx.compose.animation.core.t;
import androidx.compose.animation.g1;
import androidx.compose.foundation.lazy.grid.n;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.layout.m0;
import androidx.compose.runtime.snapshots.r;
import androidx.compose.runtime.v;
import androidx.compose.ui.input.pointer.w;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.v1;
import androidx.compose.ui.platform.u;
import androidx.compose.ui.unit.j;
import androidx.compose.ui.unit.m;
import androidx.compose.ui.unit.p;
import androidx.compose.ui.window.c0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.s;
import androidx.core.view.s0;
import androidx.core.view.w1;
import androidx.core.view.z1;
import androidx.media3.exoplayer.audio.q0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class e implements o, i0, t, c0, androidx.compose.runtime.retain.d, s {
    public final /* synthetic */ int e;
    public Object y;

    public e(int i) {
        this.e = i;
        switch (i) {
            case 16:
                this.y = new androidx.collection.s((Object) null);
                break;
            case 17:
                this.y = new v1(k.a);
                break;
            case 18:
                androidx.compose.runtime.retain.c cVar = new androidx.compose.runtime.retain.c();
                this.y = cVar;
                if (!cVar.y) {
                    if (cVar.z) {
                        androidx.compose.runtime.retain.impl.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.z = true;
                    break;
                }
                break;
            case 19:
                this.y = new Region();
                break;
            case 22:
                if (Build.VERSION.SDK_INT < 26) {
                    this.y = new androidx.core.view.accessibility.e(this);
                } else {
                    this.y = new androidx.core.view.accessibility.f(this);
                }
                break;
            case 27:
                this.y = new HashMap();
                break;
            default:
                this.y = new androidx.compose.runtime.collection.b(new androidx.compose.foundation.gestures.f[16]);
                break;
        }
    }

    public void A() {
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.y;
        kotlin.ranges.d dVarR = com.google.android.material.resources.c.r(0, bVar.z);
        int i = dVarR.e;
        int i2 = dVarR.y;
        if (i <= i2) {
            while (true) {
                ((androidx.compose.foundation.gestures.f) bVar.e[i]).b.resumeWith(y.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        bVar.g();
    }

    public ArrayList B(int i) {
        ArrayList arrayList = new ArrayList();
        x xVar = (x) this.y;
        androidx.compose.runtime.snapshots.f fVarE = r.e();
        l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = r.h(fVarE);
        try {
            n nVar = xVar.b ? xVar.c : (n) xVar.e.getValue();
            if (nVar != null) {
                kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                xVar2.e = 1;
                List list = (List) nVar.k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kotlin.k kVar = (kotlin.k) list.get(i2);
                    m0 m0Var = xVar.o;
                    int iIntValue = ((Number) kVar.e).intValue();
                    long j = ((androidx.compose.ui.unit.a) kVar.y).a;
                    androidx.compose.foundation.text.input.internal.o oVar = x.w;
                    xVar2 = xVar2;
                    arrayList.add(m0Var.a(iIntValue, j, false, new androidx.compose.animation.core.i0((ArrayList) null, xVar2, list, i, nVar)));
                }
            }
            return arrayList;
        } finally {
            r.k(fVarE, fVarH, lVarE);
        }
    }

    @Override // androidx.compose.ui.window.c0
    public long a(androidx.compose.ui.unit.k kVar, long j, m mVar, long j2) {
        long j3 = ((j) ((kotlin.jvm.functions.a) this.y).invoke()).a;
        return (((long) androidx.compose.foundation.contextmenu.c.a(kVar.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), mVar == m.e)) << 32) | (((long) androidx.compose.foundation.contextmenu.c.a(kVar.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L);
    }

    @Override // androidx.appcompat.view.menu.o
    public void b(androidx.appcompat.view.menu.j jVar, boolean z) {
        if (jVar instanceof androidx.appcompat.view.menu.t) {
            ((androidx.appcompat.view.menu.t) jVar).w.j().c(false);
        }
        o oVar = ((androidx.appcompat.widget.j) this.y).B;
        if (oVar != null) {
            oVar.b(jVar, z);
        }
    }

    public void f(f0 f0Var) {
        if (!f0Var.H()) {
            androidx.compose.ui.internal.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((v1) this.y).add(f0Var);
    }

    @Override // androidx.compose.animation.core.t
    public androidx.compose.animation.core.c0 get(int i) {
        switch (this.e) {
            case 6:
                return ((d0[]) this.y)[i];
            default:
                return (androidx.compose.animation.core.c0) this.y;
        }
    }

    public void h(CancellationException cancellationException) {
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.y;
        int i = bVar.z;
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[i];
        for (int i2 = 0; i2 < i; i2++) {
            cancellableContinuationArr[i2] = ((androidx.compose.foundation.gestures.f) bVar.e[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            cancellableContinuationArr[i3].cancel(cancellationException);
        }
        if (bVar.z == 0) {
            return;
        }
        androidx.compose.foundation.internal.b.c("uncancelled requests present");
    }

    @Override // androidx.core.view.s
    public z1 i(View view, z1 z1Var) {
        w1 w1Var = z1Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.y;
        if (!Objects.equals(coordinatorLayout.K, z1Var)) {
            coordinatorLayout.K = z1Var;
            boolean z = z1Var.a() > 0;
            coordinatorLayout.L = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!w1Var.s()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    Field field = s0.a;
                    if (childAt.getFitsSystemWindows() && ((androidx.coordinatorlayout.widget.d) childAt.getLayoutParams()).a != null && w1Var.s()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return z1Var;
    }

    public androidx.core.view.accessibility.d j(int i) {
        return null;
    }

    public void k() {
        ((v) this.y).getClass();
    }

    public void l(byte b) {
        ((Parcel) this.y).writeByte(b);
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean m(androidx.appcompat.view.menu.j jVar) {
        androidx.appcompat.widget.j jVar2 = (androidx.appcompat.widget.j) this.y;
        if (jVar == jVar2.z) {
            return false;
        }
        ((androidx.appcompat.view.menu.t) jVar).x.getClass();
        o oVar = jVar2.B;
        if (oVar != null) {
            return oVar.m(jVar);
        }
        return false;
    }

    public void n(float f) {
        ((Parcel) this.y).writeFloat(f);
    }

    public void o(long j) {
        long jB = androidx.compose.ui.unit.o.b(j);
        byte b = 0;
        if (!p.a(jB, 0L)) {
            if (p.a(jB, 4294967296L)) {
                b = 1;
            } else if (p.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        l(b);
        if (p.a(androidx.compose.ui.unit.o.b(j), 0L)) {
            return;
        }
        n(androidx.compose.ui.unit.o.c(j));
    }

    public androidx.fragment.app.h p(org.schabi.newpipe.extractor.downloader.a aVar) {
        String str = aVar.a;
        String str2 = aVar.b;
        kotlin.o oVar = com.app.mlounge.util.a.a;
        Map map = aVar.c;
        byte[] bArr = aVar.d;
        a0 a0Var = new a0();
        str2.getClass();
        a0Var.d(str2);
        str.getClass();
        okhttp3.d0 d0Var = null;
        if (bArr != null) {
            int i = e0.a;
            int length = bArr.length;
            okhttp3.internal.e.a(bArr.length, 0, length);
            d0Var = new okhttp3.d0(null, length, bArr);
        }
        a0Var.c(str, d0Var);
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            List<String> list = (List) entry.getValue();
            list.getClass();
            for (String str4 : list) {
                str3.getClass();
                str4.getClass();
                a0Var.b(str3, str4);
            }
        }
        g0 g0VarE = new okhttp3.internal.connection.m((okhttp3.y) this.y, new b0(a0Var), false).e();
        return new androidx.fragment.app.h(g0VarE.A, g0VarE.z, g0VarE.C.e(), g0VarE.D.z(), str2);
    }

    public androidx.core.view.accessibility.d q(int i) {
        return null;
    }

    public androidx.fragment.app.h r(String str) {
        org.schabi.newpipe.extractor.localization.c cVar = com.google.android.material.textfield.p.b;
        if (cVar == null) {
            cVar = org.schabi.newpipe.extractor.localization.c.z;
        }
        return t(str, null, cVar);
    }

    public androidx.fragment.app.h s(String str, Map map) {
        org.schabi.newpipe.extractor.localization.c cVar = com.google.android.material.textfield.p.b;
        if (cVar == null) {
            cVar = org.schabi.newpipe.extractor.localization.c.z;
        }
        return t(str, map, cVar);
    }

    public androidx.fragment.app.h t(String str, Map map, org.schabi.newpipe.extractor.localization.c cVar) {
        com.google.android.gms.common.api.internal.m mVar = new com.google.android.gms.common.api.internal.m();
        mVar.y = "GET";
        mVar.z = str;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mVar.A;
        linkedHashMap.clear();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        mVar.C = cVar;
        return p(new org.schabi.newpipe.extractor.downloader.a(mVar));
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return e.class.getSimpleName();
            case 17:
                return ((v1) this.y).toString();
            default:
                return super.toString();
        }
    }

    public void u(Exception exc) {
        androidx.media3.common.util.c.g("MediaCodecAudioRenderer", "Audio sink error", exc);
        androidx.media3.exoplayer.audio.t tVar = ((q0) this.y).g1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new androidx.media3.exoplayer.audio.r(tVar, exc, 6));
        }
    }

    public boolean v(int i, int i2, Bundle bundle) {
        return false;
    }

    public androidx.fragment.app.h w(String str, Map map, byte[] bArr) {
        org.schabi.newpipe.extractor.localization.c cVar = com.google.android.material.textfield.p.b;
        if (cVar == null) {
            cVar = org.schabi.newpipe.extractor.localization.c.z;
        }
        return x(str, map, bArr, cVar);
    }

    public androidx.fragment.app.h x(String str, Map map, byte[] bArr, org.schabi.newpipe.extractor.localization.c cVar) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("Content-Type", Collections.singletonList("application/json"));
        com.google.android.gms.common.api.internal.m mVar = new com.google.android.gms.common.api.internal.m();
        mVar.y = "POST";
        mVar.z = str;
        mVar.B = bArr;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mVar.A;
        linkedHashMap.clear();
        linkedHashMap.putAll(map2);
        mVar.C = cVar;
        return p(new org.schabi.newpipe.extractor.downloader.a(mVar));
    }

    public androidx.compose.foundation.text.selection.q0 y(androidx.compose.foundation.text.input.internal.o oVar, u uVar) {
        long jI;
        long j;
        boolean z;
        androidx.collection.s sVar = (androidx.collection.s) this.y;
        List list = (List) oVar.y;
        androidx.collection.s sVar2 = new androidx.collection.s(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            androidx.compose.ui.input.pointer.x xVar = (androidx.compose.ui.input.pointer.x) list.get(i);
            long j2 = xVar.a;
            w wVar = (w) sVar.b(j2);
            if (wVar == null) {
                j = xVar.b;
                jI = xVar.d;
                z = false;
            } else {
                long j3 = wVar.a;
                boolean z2 = wVar.c;
                jI = uVar.I(wVar.b);
                j = j3;
                z = z2;
            }
            long j4 = xVar.a;
            List list2 = list;
            int i2 = size;
            sVar2.e(j4, new androidx.compose.ui.input.pointer.v(j4, xVar.b, xVar.d, xVar.e, xVar.f, j, jI, z, xVar.g, xVar.i, xVar.j, xVar.k));
            boolean z3 = xVar.e;
            if (z3) {
                sVar.e(j2, new w(xVar.b, xVar.c, z3));
            } else {
                sVar.f(j2);
            }
            i++;
            list = list2;
            size = i2;
        }
        return new androidx.compose.foundation.text.selection.q0(sVar2, oVar);
    }

    public boolean z(f0 f0Var) {
        if (!f0Var.H()) {
            androidx.compose.ui.internal.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((v1) this.y).remove(f0Var);
    }

    public void c(int i) {
    }

    public void d(int i) {
    }

    public void e(int i, float f) {
    }

    public /* synthetic */ e(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public e(androidx.compose.ui.unit.c cVar) {
        this.e = 5;
        float f = g1.a;
        b1 b1Var = new b1();
        b1Var.a = f;
        float fA = cVar.a();
        float f2 = c1.a;
        b1Var.b = fA * 386.0878f * 160.0f * 0.84f;
        this.y = b1Var;
    }

    public e(boolean z) {
        this.e = 24;
        this.y = new AtomicBoolean(z);
    }

    public /* synthetic */ e(int i, boolean z) {
        this.e = i;
    }

    public e(EditText editText) {
        this.e = 25;
        this.y = new androidx.compose.foundation.text.input.internal.o(editText, 28);
    }

    public e(androidx.compose.animation.core.s sVar, float f, float f2) {
        this.e = 6;
        int iB = sVar.b();
        d0[] d0VarArr = new d0[iB];
        for (int i = 0; i < iB; i++) {
            d0VarArr[i] = new d0(f, f2, sVar.a(i));
        }
        this.y = d0VarArr;
    }

    public void g(int i, androidx.core.view.accessibility.d dVar, String str, Bundle bundle) {
    }
}
