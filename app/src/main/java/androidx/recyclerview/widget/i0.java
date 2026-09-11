package androidx.recyclerview.widget;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.gestures.y2;
import androidx.datastore.preferences.protobuf.h1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public h0 g;
    public final /* synthetic */ RecyclerView h;

    public i0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(p0 p0Var, boolean z) {
        RecyclerView.g(p0Var);
        View view = p0Var.a;
        RecyclerView recyclerView = this.h;
        r0 r0Var = recyclerView.H0;
        if (r0Var != null) {
            q0 q0Var = r0Var.B;
            androidx.core.view.s0.m(view, q0Var != null ? (androidx.core.view.b) q0Var.B.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.K;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                androidx.transition.k.i();
                return;
            } else if (recyclerView.A0 != null) {
                recyclerView.D.G(p0Var);
            }
        }
        p0Var.s = null;
        p0Var.r = null;
        h0 h0VarC = c();
        h0VarC.getClass();
        int i = p0Var.f;
        ArrayList arrayList2 = h0VarC.a(i).a;
        if (((g0) h0VarC.a.get(i)).b <= arrayList2.size()) {
            h1.f(view);
        } else {
            p0Var.m();
            arrayList2.add(p0Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        l0 l0Var = recyclerView.A0;
        if (i >= 0 && i < l0Var.b()) {
            return !l0Var.g ? i : recyclerView.B.t(i, 0);
        }
        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("invalid position ", i, ". State item count is ");
        sbV.append(l0Var.b());
        sbV.append(recyclerView.w());
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    public final h0 c() {
        if (this.g == null) {
            h0 h0Var = new h0();
            h0Var.a = new SparseArray();
            h0Var.b = 0;
            h0Var.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = h0Var;
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        RecyclerView recyclerView;
        v vVar;
        h0 h0Var = this.g;
        if (h0Var == null || (vVar = (recyclerView = this.h).I) == null || !recyclerView.O) {
            return;
        }
        h0Var.c.add(vVar);
    }

    public final void f(v vVar, boolean z) {
        h0 h0Var = this.g;
        if (h0Var != null) {
            SparseArray sparseArray = h0Var.a;
            Set set = h0Var.c;
            set.remove(vVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((g0) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    h1.f(((p0) arrayList.get(i2)).a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.W0) {
            androidx.media3.common.util.e eVar = this.h.z0;
            int[] iArr = eVar.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            eVar.d = 0;
        }
    }

    public final void h(int i) {
        ArrayList arrayList = this.c;
        a((p0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        p0 p0VarG = RecyclerView.G(view);
        boolean zJ = p0VarG.j();
        RecyclerView recyclerView = this.h;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (p0VarG.i()) {
            p0VarG.n.m(p0VarG);
        } else if (p0VarG.p()) {
            p0VarG.j &= -33;
        }
        j(p0VarG);
        if (recyclerView.j0 == null || p0VarG.g()) {
            return;
        }
        recyclerView.j0.d(p0VarG);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[LOOP:2: B:44:0x0087->B:48:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0095 A[EDGE_INSN: B:75:0x0095->B:49:0x0095 BREAK  A[LOOP:1: B:40:0x0074->B:47:0x008f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0095 A[EDGE_INSN: B:76:0x0095->B:49:0x0095 BREAK  A[LOOP:1: B:40:0x0074->B:47:0x008f, LOOP_LABEL: LOOP:1: B:40:0x0074->B:47:0x008f], SYNTHETIC] */
    public final void j(p0 p0Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.h;
        androidx.media3.common.util.e eVar = recyclerView.z0;
        boolean zI = p0Var.i();
        View view = p0Var.a;
        boolean z3 = false;
        boolean z4 = true;
        if (zI || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(p0Var.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.w());
            throw new IllegalArgumentException(sb.toString());
        }
        if (p0Var.j()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(p0Var);
            com.google.gson.b.k(sb2, recyclerView.w());
            return;
        }
        if (p0Var.o()) {
            net.luminis.tls.engine.impl.c.o("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.w()));
            return;
        }
        if ((p0Var.j & 16) == 0) {
            Field field = androidx.core.view.s0.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (p0Var.g()) {
            if (this.f <= 0 || (p0Var.j & 526) != 0) {
                z2 = false;
            } else {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                if (size >= this.f && size > 0) {
                    h(0);
                    size--;
                }
                if (RecyclerView.W0 && size > 0) {
                    int i5 = p0Var.c;
                    if (eVar.c != null) {
                        int i6 = eVar.d * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((p0) arrayList.get(i)).c;
                                    if (eVar.c != null) {
                                        break;
                                    }
                                    i3 = eVar.d * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (eVar.c[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (eVar.c[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((p0) arrayList.get(i)).c;
                            if (eVar.c != null) {
                                break;
                                break;
                            }
                            i3 = eVar.d * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (eVar.c[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, p0Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(p0Var, true);
            }
            z3 = z2;
        } else {
            z4 = false;
        }
        recyclerView.D.G(p0Var);
        if (z3 || z4 || !z) {
            return;
        }
        h1.f(view);
        p0Var.s = null;
        p0Var.r = null;
    }

    public final void k(View view) {
        z zVar;
        p0 p0VarG = RecyclerView.G(view);
        int i = p0VarG.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && p0VarG.k() && (zVar = recyclerView.j0) != null) {
            h hVar = (h) zVar;
            if (p0VarG.c().isEmpty() && hVar.g && !p0VarG.f()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                p0VarG.n = this;
                p0VarG.o = true;
                this.b.add(p0VarG);
                return;
            }
        }
        if (p0VarG.f() && !p0VarG.h() && !recyclerView.I.b) {
            net.luminis.tls.engine.impl.c.o("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.w()));
            return;
        }
        p0VarG.n = this;
        p0VarG.o = false;
        this.a.add(p0VarG);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0193  */
    /* JADX WARN: Code duplicated, block: B:102:0x0196  */
    /* JADX WARN: Code duplicated, block: B:110:0x01af  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x020b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0216  */
    /* JADX WARN: Code duplicated, block: B:132:0x021e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0228  */
    /* JADX WARN: Code duplicated, block: B:136:0x0233  */
    /* JADX WARN: Code duplicated, block: B:138:0x023f  */
    /* JADX WARN: Code duplicated, block: B:154:0x029e  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:170:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ff A[LOOP:3: B:173:0x02ea->B:177:0x02ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0302 A[EDGE_INSN: B:178:0x0302->B:179:0x0303 BREAK  A[LOOP:3: B:173:0x02ea->B:177:0x02ff]] */
    /* JADX WARN: Code duplicated, block: B:180:0x0305  */
    /* JADX WARN: Code duplicated, block: B:183:0x030d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0315  */
    /* JADX WARN: Code duplicated, block: B:191:0x0329  */
    /* JADX WARN: Code duplicated, block: B:193:0x032d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:198:0x0347 A[Catch: all -> 0x0379, TRY_LEAVE, TryCatch #0 {all -> 0x0379, blocks: (B:196:0x0334, B:198:0x0347, B:211:0x037b, B:212:0x0382), top: B:321:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x036f  */
    /* JADX WARN: Code duplicated, block: B:211:0x037b A[Catch: all -> 0x0379, TRY_ENTER, TryCatch #0 {all -> 0x0379, blocks: (B:196:0x0334, B:198:0x0347, B:211:0x037b, B:212:0x0382), top: B:321:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:224:0x03be  */
    /* JADX WARN: Code duplicated, block: B:225:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:227:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:229:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:235:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:237:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:239:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:240:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:242:0x0401  */
    /* JADX WARN: Code duplicated, block: B:246:0x040d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0422  */
    /* JADX WARN: Code duplicated, block: B:250:0x042e  */
    /* JADX WARN: Code duplicated, block: B:254:0x043c  */
    /* JADX WARN: Code duplicated, block: B:255:0x043f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0442  */
    /* JADX WARN: Code duplicated, block: B:259:0x0448  */
    /* JADX WARN: Code duplicated, block: B:263:0x0467  */
    /* JADX WARN: Code duplicated, block: B:265:0x046b  */
    /* JADX WARN: Code duplicated, block: B:268:0x047c  */
    /* JADX WARN: Code duplicated, block: B:273:0x049b  */
    /* JADX WARN: Code duplicated, block: B:276:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:279:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:281:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:283:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:287:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:289:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:292:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:294:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:295:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:297:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:303:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:307:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:308:0x0504  */
    /* JADX WARN: Code duplicated, block: B:310:0x050a  */
    /* JADX WARN: Code duplicated, block: B:311:0x0514  */
    /* JADX WARN: Code duplicated, block: B:314:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:316:0x051e  */
    /* JADX WARN: Code duplicated, block: B:328:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:77:0x012d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0136 A[EDGE_INSN: B:80:0x0136->B:98:0x018b BREAK  A[LOOP:1: B:43:0x008e->B:55:0x00ba]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x016a  */
    /* JADX WARN: Code duplicated, block: B:99:0x018d  */
    public final p0 l(int i, long j) {
        p0 p0VarD;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        long j2;
        long j3;
        View view;
        int iT;
        androidx.core.view.b bVar;
        int i2;
        v vVar;
        boolean z3;
        long nanoTime;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z4;
        boolean z5;
        boolean z6;
        r0 r0Var;
        q0 q0Var;
        View.AccessibilityDelegate accessibilityDelegateC;
        ArrayList arrayList3;
        ViewGroup.LayoutParams layoutParams;
        long j5;
        boolean z7;
        ViewGroup.LayoutParams layoutParams2;
        d0 d0Var;
        int i3;
        boolean z8;
        int iT2;
        v vVar2;
        long nanoTime2;
        View view2;
        long nanoTime3;
        long j6;
        RecyclerView recyclerViewB;
        long j7;
        boolean z9;
        g0 g0Var;
        p0 p0Var;
        ArrayList arrayList4;
        int size;
        long jB;
        int size2;
        int i4;
        int size3;
        p0 p0Var2;
        long j8;
        int size4;
        int i5;
        ArrayList arrayList5;
        int size5;
        int i6;
        View view3;
        int size6;
        int i7;
        p0 p0Var3;
        p0 p0VarG;
        c2 c2Var;
        y2 y2Var;
        int iIndexOfChild;
        y2 y2Var2;
        int iIndexOfChild2;
        int iE;
        p0 p0VarG2;
        int i8;
        v vVar3;
        boolean z10;
        p0 p0Var4;
        int size7;
        int iT3;
        RecyclerView recyclerView = this.h;
        l0 l0Var = recyclerView.A0;
        if (i < 0 || i >= l0Var.b()) {
            StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Invalid item position ", "(", i, "). Item count:", i);
            sbW.append(l0Var.b());
            sbW.append(recyclerView.w());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (l0Var.g) {
            ArrayList arrayList6 = this.b;
            if (arrayList6 != null && (size7 = arrayList6.size()) != 0) {
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        if (recyclerView.I.b && (iT3 = recyclerView.B.t(i, 0)) > 0 && iT3 < recyclerView.I.a()) {
                            long jB2 = recyclerView.I.b(iT3);
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size7) {
                                    p0VarD = null;
                                    break;
                                }
                                p0 p0Var5 = (p0) this.b.get(i10);
                                if (!p0Var5.p() && p0Var5.e == jB2) {
                                    p0Var5.a(32);
                                    p0VarD = p0Var5;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            p0VarD = null;
                            break;
                        }
                    } else {
                        p0VarD = (p0) this.b.get(i9);
                        if (!p0VarD.p() && p0VarD.b() == i) {
                            p0VarD.a(32);
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                p0VarD = null;
                break;
            }
            if (p0VarD != null) {
                z = true;
            }
            arrayList = this.a;
            arrayList2 = this.c;
            if (p0VarD == null) {
                size4 = arrayList.size();
                i5 = 0;
                while (true) {
                    if (i5 < size4) {
                        arrayList5 = (ArrayList) recyclerView.C.A;
                        size5 = arrayList5.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size5) {
                                z2 = true;
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList5.get(i6);
                            p0VarG2 = RecyclerView.G(view3);
                            z2 = true;
                            if (p0VarG2.b() != i && !p0VarG2.f() && !p0VarG2.h()) {
                                break;
                            }
                            i6++;
                        }
                        if (view3 != null) {
                            size6 = arrayList2.size();
                            i7 = 0;
                            while (true) {
                                if (i7 < size6) {
                                    p0VarD = null;
                                    break;
                                }
                                p0Var3 = (p0) arrayList2.get(i7);
                                if (p0Var3.f() && p0Var3.b() == i && !p0Var3.d()) {
                                    arrayList2.remove(i7);
                                    p0VarD = p0Var3;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            p0VarG = RecyclerView.G(view3);
                            c2Var = recyclerView.C;
                            y2Var = (y2) c2Var.z;
                            iIndexOfChild = ((u) c2Var.y).a.indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                com.google.gson.b.g(view3, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (y2Var.G(iIndexOfChild)) {
                                com.google.gson.b.t(view3, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            y2Var.C(iIndexOfChild);
                            c2Var.e0(view3);
                            c2 c2Var2 = recyclerView.C;
                            y2Var2 = (y2) c2Var2.z;
                            iIndexOfChild2 = ((u) c2Var2.y).a.indexOfChild(view3);
                            if (iIndexOfChild2 == -1 && !y2Var2.G(iIndexOfChild2)) {
                                iE = iIndexOfChild2 - y2Var2.E(iIndexOfChild2);
                            } else {
                                iE = -1;
                            }
                            if (iE != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(p0VarG);
                                androidx.media3.exoplayer.hls.playlist.a.k(sb, recyclerView.w());
                                return null;
                            }
                            recyclerView.C.u(iE);
                            k(view3);
                            p0VarG.a(8224);
                            p0VarD = p0VarG;
                            break;
                        }
                    } else {
                        p0Var4 = (p0) arrayList.get(i5);
                        if (p0Var4.p() && p0Var4.b() == i && !p0Var4.f() && (l0Var.g || !p0Var4.h())) {
                            p0Var4.a(32);
                            p0VarD = p0Var4;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (p0VarD != null) {
                    if (!p0VarD.h()) {
                        z10 = l0Var.g;
                    } else {
                        i8 = p0VarD.c;
                        if (i8 >= 0 || i8 >= recyclerView.I.a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + p0VarD + recyclerView.w());
                        }
                        if (l0Var.g) {
                            vVar3 = recyclerView.I;
                            if (vVar3.b) {
                            }
                            z10 = z2;
                        } else {
                            recyclerView.I.getClass();
                            if (p0VarD.f != 0) {
                                z10 = false;
                            } else {
                                vVar3 = recyclerView.I;
                                if (vVar3.b || p0VarD.e == vVar3.b(p0VarD.c)) {
                                    z10 = z2;
                                } else {
                                    z10 = false;
                                }
                            }
                        }
                    }
                    if (z10) {
                        z = z2;
                    } else {
                        p0VarD.a(4);
                        if (p0VarD.i()) {
                            recyclerView.removeDetachedView(p0VarD.a, false);
                            p0VarD.n.m(p0VarD);
                        } else if (p0VarD.p()) {
                            p0VarD.j &= -33;
                        }
                        j(p0VarD);
                        p0VarD = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (p0VarD == null) {
                iT2 = recyclerView.B.t(i, 0);
                if (iT2 >= 0) {
                    j2 = 3;
                    if (iT2 < recyclerView.I.a()) {
                        recyclerView.I.getClass();
                        vVar2 = recyclerView.I;
                        if (vVar2.b) {
                            jB = vVar2.b(iT2);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    i4 = iT2;
                                    j3 = 4;
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            p0Var2 = (p0) arrayList2.get(size3);
                                            if (p0Var2.e == jB || p0Var2.d()) {
                                                size3--;
                                            } else {
                                                if (p0Var2.f == 0) {
                                                    arrayList2.remove(size3);
                                                    p0VarD = p0Var2;
                                                    break;
                                                }
                                                h(size3);
                                            }
                                        }
                                        p0VarD = null;
                                        break;
                                    }
                                }
                                j3 = 4;
                                p0 p0Var6 = (p0) arrayList.get(size2);
                                i4 = iT2;
                                j8 = p0Var6.e;
                                View view4 = p0Var6.a;
                                if (j8 != jB && !p0Var6.p()) {
                                    if (p0Var6.f == 0) {
                                        p0Var6.a(32);
                                        if (p0Var6.h() && !l0Var.g) {
                                            p0Var6.j = (p0Var6.j & (-15)) | 2;
                                        }
                                        p0VarD = p0Var6;
                                        break;
                                    }
                                    arrayList.remove(size2);
                                    recyclerView.removeDetachedView(view4, false);
                                    p0 p0VarG3 = RecyclerView.G(view4);
                                    p0VarG3.n = null;
                                    p0VarG3.o = false;
                                    p0VarG3.j &= -33;
                                    j(p0VarG3);
                                }
                                size2--;
                                iT2 = i4;
                            }
                            if (p0VarD != null) {
                                p0VarD.c = i4;
                                z = z2;
                            }
                        } else {
                            j3 = 4;
                        }
                        if (p0VarD == null) {
                            g0Var = (g0) c().a.get(0);
                            if (g0Var != null) {
                                p0Var = null;
                                break;
                            }
                            arrayList4 = g0Var.a;
                            if (arrayList4.isEmpty()) {
                                size = arrayList4.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        p0Var = null;
                                        break;
                                    }
                                    if (!((p0) arrayList4.get(size)).d()) {
                                        p0Var = (p0) arrayList4.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                p0Var = null;
                                break;
                            }
                            if (p0Var != null) {
                                p0Var.m();
                                int[] iArr = RecyclerView.T0;
                            }
                            p0VarD = p0Var;
                        }
                        if (p0VarD == null) {
                            nanoTime2 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.g.a(0).c;
                                if (j7 != 0 || j7 + nanoTime2 < j) {
                                    z9 = z2;
                                } else {
                                    z9 = false;
                                }
                                if (!z9) {
                                    return null;
                                }
                            }
                            v vVar4 = recyclerView.I;
                            vVar4.getClass();
                            try {
                                int i11 = androidx.core.os.e.a;
                                Trace.beginSection("RV CreateView");
                                p0VarD = vVar4.d(recyclerView);
                                view2 = p0VarD.a;
                                if (view2.getParent() == null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                p0VarD.f = 0;
                                Trace.endSection();
                                if (RecyclerView.W0 && (recyclerViewB = RecyclerView.B(view2)) != null) {
                                    p0VarD.b = new WeakReference(recyclerViewB);
                                }
                                nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                                g0 g0VarA = this.g.a(0);
                                j6 = g0VarA.c;
                                if (j6 != 0) {
                                    nanoTime3 = (nanoTime3 / j3) + ((j6 / j3) * 3);
                                }
                                g0VarA.c = nanoTime3;
                            } catch (Throwable th) {
                                int i12 = androidx.core.os.e.a;
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                StringBuilder sbW2 = androidx.privacysandbox.ads.adservices.java.internal.a.w("Inconsistency detected. Invalid item position ", "(offset:", i, ").state:", iT2);
                sbW2.append(l0Var.b());
                sbW2.append(recyclerView.w());
                throw new IndexOutOfBoundsException(sbW2.toString());
            }
            j2 = 3;
            j3 = 4;
            view = p0VarD.a;
            if (z && !l0Var.g) {
                i3 = p0VarD.j;
                if ((i3 & 8192) != 0) {
                    z8 = z2;
                } else {
                    z8 = false;
                }
                if (z8) {
                    p0VarD.j = i3 & (-8193);
                    if (l0Var.j) {
                        z.b(p0VarD);
                        z zVar = recyclerView.j0;
                        p0VarD.c();
                        zVar.getClass();
                        androidx.core.view.r rVar = new androidx.core.view.r();
                        rVar.b(p0VarD);
                        recyclerView.Q(p0VarD, rVar);
                    }
                }
            }
            if (l0Var.g || !p0VarD.e()) {
                if (p0VarD.e()) {
                    if ((p0VarD.j & 2) != 0) {
                        z7 = z2;
                    } else {
                        z7 = false;
                    }
                    if (z7 || p0VarD.f()) {
                        iT = recyclerView.B.t(i, 0);
                        bVar = null;
                        p0VarD.s = null;
                        p0VarD.r = recyclerView;
                        i2 = p0VarD.f;
                        long nanoTime4 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j5 = this.g.a(i2).d;
                            if (j5 != 0) {
                            }
                        }
                        vVar = recyclerView.I;
                        vVar.getClass();
                        if (p0VarD.s == null) {
                            z3 = z2;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            p0VarD.c = iT;
                            if (vVar.b) {
                                p0VarD.e = vVar.b(iT);
                            }
                            p0VarD.j = (p0VarD.j & (-520)) | 1;
                            int i13 = androidx.core.os.e.a;
                            Trace.beginSection("RV OnBindView");
                        }
                        p0VarD.s = vVar;
                        p0VarD.c();
                        vVar.c(p0VarD, iT);
                        if (z3) {
                            arrayList3 = p0VarD.k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            p0VarD.j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof d0) {
                                ((d0) layoutParams).c = z2;
                            }
                            int i14 = androidx.core.os.e.a;
                            Trace.endSection();
                        }
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        g0 g0VarA2 = this.g.a(p0VarD.f);
                        j4 = g0VarA2.d;
                        if (j4 != 0) {
                            nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                        }
                        g0VarA2.d = nanoTime;
                        accessibilityManager = recyclerView.W;
                        if (accessibilityManager == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            Field field = androidx.core.view.s0.a;
                            z5 = true;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            r0Var = recyclerView.H0;
                            if (r0Var != null) {
                                q0Var = r0Var.B;
                                if (q0Var != null) {
                                    accessibilityDelegateC = androidx.core.view.s0.c(view);
                                    if (accessibilityDelegateC != null) {
                                        if (accessibilityDelegateC instanceof androidx.core.view.a) {
                                            bVar = ((androidx.core.view.a) accessibilityDelegateC).a;
                                        } else {
                                            bVar = new androidx.core.view.b(accessibilityDelegateC);
                                        }
                                    }
                                    if (bVar != null) {
                                        q0Var.B.put(view, bVar);
                                    }
                                }
                                androidx.core.view.s0.m(view, q0Var);
                            }
                        } else {
                            z5 = true;
                        }
                        if (l0Var.g) {
                            p0VarD.g = i;
                        }
                        z6 = z5;
                    }
                } else {
                    iT = recyclerView.B.t(i, 0);
                    bVar = null;
                    p0VarD.s = null;
                    p0VarD.r = recyclerView;
                    i2 = p0VarD.f;
                    long nanoTime5 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.g.a(i2).d;
                        if (j5 != 0 || j5 + nanoTime5 < j) {
                        }
                    }
                    vVar = recyclerView.I;
                    vVar.getClass();
                    if (p0VarD.s == null) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        p0VarD.c = iT;
                        if (vVar.b) {
                            p0VarD.e = vVar.b(iT);
                        }
                        p0VarD.j = (p0VarD.j & (-520)) | 1;
                        int i15 = androidx.core.os.e.a;
                        Trace.beginSection("RV OnBindView");
                    }
                    p0VarD.s = vVar;
                    p0VarD.c();
                    vVar.c(p0VarD, iT);
                    if (z3) {
                        arrayList3 = p0VarD.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        p0VarD.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof d0) {
                            ((d0) layoutParams).c = z2;
                        }
                        int i16 = androidx.core.os.e.a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime5;
                    g0 g0VarA3 = this.g.a(p0VarD.f);
                    j4 = g0VarA3.d;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    g0VarA3.d = nanoTime;
                    accessibilityManager = recyclerView.W;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        Field field2 = androidx.core.view.s0.a;
                        z5 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        r0Var = recyclerView.H0;
                        if (r0Var != null) {
                            q0Var = r0Var.B;
                            if (q0Var != null) {
                                accessibilityDelegateC = androidx.core.view.s0.c(view);
                                if (accessibilityDelegateC != null) {
                                    if (accessibilityDelegateC instanceof androidx.core.view.a) {
                                        bVar = ((androidx.core.view.a) accessibilityDelegateC).a;
                                    } else {
                                        bVar = new androidx.core.view.b(accessibilityDelegateC);
                                    }
                                }
                                if (bVar != null && bVar != q0Var) {
                                    q0Var.B.put(view, bVar);
                                }
                            }
                            androidx.core.view.s0.m(view, q0Var);
                        }
                    } else {
                        z5 = true;
                    }
                    if (l0Var.g) {
                        p0VarD.g = i;
                    }
                    z6 = z5;
                }
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    d0Var = (d0) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(d0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    d0Var = (d0) layoutParams2;
                } else {
                    d0Var = (d0) recyclerView.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(d0Var);
                }
                d0Var.a = p0VarD;
                if (z || !z6) {
                    z5 = false;
                }
                d0Var.d = z5;
                return p0VarD;
            }
            p0VarD.g = i;
            z6 = false;
            z5 = z2;
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                d0Var = (d0) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(d0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                d0Var = (d0) recyclerView.generateLayoutParams(layoutParams2);
                view.setLayoutParams(d0Var);
            } else {
                d0Var = (d0) layoutParams2;
            }
            d0Var.a = p0VarD;
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            d0Var.d = z5;
            return p0VarD;
        }
        p0VarD = null;
        z = false;
        arrayList = this.a;
        arrayList2 = this.c;
        if (p0VarD == null) {
            size4 = arrayList.size();
            i5 = 0;
            while (true) {
                if (i5 < size4) {
                    arrayList5 = (ArrayList) recyclerView.C.A;
                    size5 = arrayList5.size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size5) {
                            z2 = true;
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList5.get(i6);
                        p0VarG2 = RecyclerView.G(view3);
                        z2 = true;
                        if (p0VarG2.b() != i) {
                        }
                        i6++;
                    }
                    if (view3 != null) {
                        size6 = arrayList2.size();
                        i7 = 0;
                        while (true) {
                            if (i7 < size6) {
                                p0VarD = null;
                                break;
                            }
                            p0Var3 = (p0) arrayList2.get(i7);
                            if (p0Var3.f()) {
                            }
                            i7++;
                        }
                    } else {
                        p0VarG = RecyclerView.G(view3);
                        c2Var = recyclerView.C;
                        y2Var = (y2) c2Var.z;
                        iIndexOfChild = ((u) c2Var.y).a.indexOfChild(view3);
                        if (iIndexOfChild >= 0) {
                            com.google.gson.b.g(view3, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (y2Var.G(iIndexOfChild)) {
                            com.google.gson.b.t(view3, "trying to unhide a view that was not hidden");
                            return null;
                        }
                        y2Var.C(iIndexOfChild);
                        c2Var.e0(view3);
                        c2 c2Var3 = recyclerView.C;
                        y2Var2 = (y2) c2Var3.z;
                        iIndexOfChild2 = ((u) c2Var3.y).a.indexOfChild(view3);
                        if (iIndexOfChild2 == -1) {
                            iE = -1;
                        } else {
                            iE = iIndexOfChild2 - y2Var2.E(iIndexOfChild2);
                        }
                        if (iE != -1) {
                            StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb2.append(p0VarG);
                            androidx.media3.exoplayer.hls.playlist.a.k(sb2, recyclerView.w());
                            return null;
                        }
                        recyclerView.C.u(iE);
                        k(view3);
                        p0VarG.a(8224);
                        p0VarD = p0VarG;
                        break;
                    }
                } else {
                    p0Var4 = (p0) arrayList.get(i5);
                    if (p0Var4.p()) {
                    }
                    i5++;
                }
            }
            if (p0VarD != null) {
                if (!p0VarD.h()) {
                    i8 = p0VarD.c;
                    if (i8 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + p0VarD + recyclerView.w());
                }
                z10 = l0Var.g;
                if (z10) {
                    p0VarD.a(4);
                    if (p0VarD.i()) {
                        recyclerView.removeDetachedView(p0VarD.a, false);
                        p0VarD.n.m(p0VarD);
                    } else if (p0VarD.p()) {
                        p0VarD.j &= -33;
                    }
                    j(p0VarD);
                    p0VarD = null;
                } else {
                    z = z2;
                }
            }
        } else {
            z2 = true;
        }
        if (p0VarD == null) {
            iT2 = recyclerView.B.t(i, 0);
            if (iT2 >= 0) {
                j2 = 3;
                if (iT2 < recyclerView.I.a()) {
                    recyclerView.I.getClass();
                    vVar2 = recyclerView.I;
                    if (vVar2.b) {
                        jB = vVar2.b(iT2);
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                i4 = iT2;
                                j3 = 4;
                                size3 = arrayList2.size() - 1;
                                while (true) {
                                    if (size3 >= 0) {
                                        p0Var2 = (p0) arrayList2.get(size3);
                                        if (p0Var2.e == jB) {
                                        }
                                        size3--;
                                    }
                                    p0VarD = null;
                                    break;
                                }
                            }
                            j3 = 4;
                            p0 p0Var7 = (p0) arrayList.get(size2);
                            i4 = iT2;
                            j8 = p0Var7.e;
                            View view5 = p0Var7.a;
                            if (j8 != jB) {
                            }
                            size2--;
                            iT2 = i4;
                        }
                        if (p0VarD != null) {
                            p0VarD.c = i4;
                            z = z2;
                        }
                    } else {
                        j3 = 4;
                    }
                    if (p0VarD == null) {
                        g0Var = (g0) c().a.get(0);
                        if (g0Var != null) {
                            p0Var = null;
                            break;
                        }
                        arrayList4 = g0Var.a;
                        if (arrayList4.isEmpty()) {
                            p0Var = null;
                            break;
                        }
                        size = arrayList4.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                p0Var = null;
                                break;
                            }
                            if (!((p0) arrayList4.get(size)).d()) {
                                p0Var = (p0) arrayList4.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (p0Var != null) {
                            p0Var.m();
                            int[] iArr2 = RecyclerView.T0;
                        }
                        p0VarD = p0Var;
                    }
                    if (p0VarD == null) {
                        nanoTime2 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j7 = this.g.a(0).c;
                            if (j7 != 0) {
                                z9 = z2;
                            } else {
                                z9 = z2;
                            }
                            if (!z9) {
                                return null;
                            }
                        }
                        v vVar5 = recyclerView.I;
                        vVar5.getClass();
                        int i17 = androidx.core.os.e.a;
                        Trace.beginSection("RV CreateView");
                        p0VarD = vVar5.d(recyclerView);
                        view2 = p0VarD.a;
                        if (view2.getParent() == null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        p0VarD.f = 0;
                        Trace.endSection();
                        if (RecyclerView.W0) {
                            p0VarD.b = new WeakReference(recyclerViewB);
                        }
                        nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        g0 g0VarA4 = this.g.a(0);
                        j6 = g0VarA4.c;
                        if (j6 != 0) {
                            nanoTime3 = (nanoTime3 / j3) + ((j6 / j3) * 3);
                        }
                        g0VarA4.c = nanoTime3;
                    }
                }
            }
            StringBuilder sbW3 = androidx.privacysandbox.ads.adservices.java.internal.a.w("Inconsistency detected. Invalid item position ", "(offset:", i, ").state:", iT2);
            sbW3.append(l0Var.b());
            sbW3.append(recyclerView.w());
            throw new IndexOutOfBoundsException(sbW3.toString());
        }
        j2 = 3;
        j3 = 4;
        view = p0VarD.a;
        if (z) {
            i3 = p0VarD.j;
            if ((i3 & 8192) != 0) {
                z8 = z2;
            } else {
                z8 = false;
            }
            if (z8) {
                p0VarD.j = i3 & (-8193);
                if (l0Var.j) {
                    z.b(p0VarD);
                    z zVar2 = recyclerView.j0;
                    p0VarD.c();
                    zVar2.getClass();
                    androidx.core.view.r rVar2 = new androidx.core.view.r();
                    rVar2.b(p0VarD);
                    recyclerView.Q(p0VarD, rVar2);
                }
            }
        }
        if (l0Var.g) {
            if (p0VarD.e()) {
                iT = recyclerView.B.t(i, 0);
                bVar = null;
                p0VarD.s = null;
                p0VarD.r = recyclerView;
                i2 = p0VarD.f;
                long nanoTime6 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(i2).d;
                    if (j5 != 0) {
                    }
                }
                vVar = recyclerView.I;
                vVar.getClass();
                if (p0VarD.s == null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                    p0VarD.c = iT;
                    if (vVar.b) {
                        p0VarD.e = vVar.b(iT);
                    }
                    p0VarD.j = (p0VarD.j & (-520)) | 1;
                    int i18 = androidx.core.os.e.a;
                    Trace.beginSection("RV OnBindView");
                }
                p0VarD.s = vVar;
                p0VarD.c();
                vVar.c(p0VarD, iT);
                if (z3) {
                    arrayList3 = p0VarD.k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    p0VarD.j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof d0) {
                        ((d0) layoutParams).c = z2;
                    }
                    int i19 = androidx.core.os.e.a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime6;
                g0 g0VarA5 = this.g.a(p0VarD.f);
                j4 = g0VarA5.d;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                g0VarA5.d = nanoTime;
                accessibilityManager = recyclerView.W;
                if (accessibilityManager == null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z4) {
                    Field field3 = androidx.core.view.s0.a;
                    z5 = true;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    r0Var = recyclerView.H0;
                    if (r0Var != null) {
                        q0Var = r0Var.B;
                        if (q0Var != null) {
                            accessibilityDelegateC = androidx.core.view.s0.c(view);
                            if (accessibilityDelegateC != null) {
                                if (accessibilityDelegateC instanceof androidx.core.view.a) {
                                    bVar = ((androidx.core.view.a) accessibilityDelegateC).a;
                                } else {
                                    bVar = new androidx.core.view.b(accessibilityDelegateC);
                                }
                            }
                            if (bVar != null) {
                                q0Var.B.put(view, bVar);
                            }
                        }
                        androidx.core.view.s0.m(view, q0Var);
                    }
                } else {
                    z5 = true;
                }
                if (l0Var.g) {
                    p0VarD.g = i;
                }
                z6 = z5;
            } else {
                if ((p0VarD.j & 2) != 0) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                if (z7) {
                    iT = recyclerView.B.t(i, 0);
                    bVar = null;
                    p0VarD.s = null;
                    p0VarD.r = recyclerView;
                    i2 = p0VarD.f;
                    long nanoTime7 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.g.a(i2).d;
                        if (j5 != 0) {
                        }
                    }
                    vVar = recyclerView.I;
                    vVar.getClass();
                    if (p0VarD.s == null) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        p0VarD.c = iT;
                        if (vVar.b) {
                            p0VarD.e = vVar.b(iT);
                        }
                        p0VarD.j = (p0VarD.j & (-520)) | 1;
                        int i110 = androidx.core.os.e.a;
                        Trace.beginSection("RV OnBindView");
                    }
                    p0VarD.s = vVar;
                    p0VarD.c();
                    vVar.c(p0VarD, iT);
                    if (z3) {
                        arrayList3 = p0VarD.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        p0VarD.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof d0) {
                            ((d0) layoutParams).c = z2;
                        }
                        int i111 = androidx.core.os.e.a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime7;
                    g0 g0VarA6 = this.g.a(p0VarD.f);
                    j4 = g0VarA6.d;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    g0VarA6.d = nanoTime;
                    accessibilityManager = recyclerView.W;
                    if (accessibilityManager == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        Field field4 = androidx.core.view.s0.a;
                        z5 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        r0Var = recyclerView.H0;
                        if (r0Var != null) {
                            q0Var = r0Var.B;
                            if (q0Var != null) {
                                accessibilityDelegateC = androidx.core.view.s0.c(view);
                                if (accessibilityDelegateC != null) {
                                    if (accessibilityDelegateC instanceof androidx.core.view.a) {
                                        bVar = ((androidx.core.view.a) accessibilityDelegateC).a;
                                    } else {
                                        bVar = new androidx.core.view.b(accessibilityDelegateC);
                                    }
                                }
                                if (bVar != null) {
                                    q0Var.B.put(view, bVar);
                                }
                            }
                            androidx.core.view.s0.m(view, q0Var);
                        }
                    } else {
                        z5 = true;
                    }
                    if (l0Var.g) {
                        p0VarD.g = i;
                    }
                    z6 = z5;
                } else {
                    iT = recyclerView.B.t(i, 0);
                    bVar = null;
                    p0VarD.s = null;
                    p0VarD.r = recyclerView;
                    i2 = p0VarD.f;
                    long nanoTime8 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.g.a(i2).d;
                        if (j5 != 0) {
                        }
                    }
                    vVar = recyclerView.I;
                    vVar.getClass();
                    if (p0VarD.s == null) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        p0VarD.c = iT;
                        if (vVar.b) {
                            p0VarD.e = vVar.b(iT);
                        }
                        p0VarD.j = (p0VarD.j & (-520)) | 1;
                        int i112 = androidx.core.os.e.a;
                        Trace.beginSection("RV OnBindView");
                    }
                    p0VarD.s = vVar;
                    p0VarD.c();
                    vVar.c(p0VarD, iT);
                    if (z3) {
                        arrayList3 = p0VarD.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        p0VarD.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof d0) {
                            ((d0) layoutParams).c = z2;
                        }
                        int i113 = androidx.core.os.e.a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime8;
                    g0 g0VarA7 = this.g.a(p0VarD.f);
                    j4 = g0VarA7.d;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                    }
                    g0VarA7.d = nanoTime;
                    accessibilityManager = recyclerView.W;
                    if (accessibilityManager == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        Field field5 = androidx.core.view.s0.a;
                        z5 = true;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        r0Var = recyclerView.H0;
                        if (r0Var != null) {
                            q0Var = r0Var.B;
                            if (q0Var != null) {
                                accessibilityDelegateC = androidx.core.view.s0.c(view);
                                if (accessibilityDelegateC != null) {
                                    if (accessibilityDelegateC instanceof androidx.core.view.a) {
                                        bVar = ((androidx.core.view.a) accessibilityDelegateC).a;
                                    } else {
                                        bVar = new androidx.core.view.b(accessibilityDelegateC);
                                    }
                                }
                                if (bVar != null) {
                                    q0Var.B.put(view, bVar);
                                }
                            }
                            androidx.core.view.s0.m(view, q0Var);
                        }
                    } else {
                        z5 = true;
                    }
                    if (l0Var.g) {
                        p0VarD.g = i;
                    }
                    z6 = z5;
                }
            }
        } else if (p0VarD.e()) {
            iT = recyclerView.B.t(i, 0);
            bVar = null;
            p0VarD.s = null;
            p0VarD.r = recyclerView;
            i2 = p0VarD.f;
            long nanoTime9 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.g.a(i2).d;
                if (j5 != 0) {
                }
            }
            vVar = recyclerView.I;
            vVar.getClass();
            if (p0VarD.s == null) {
                z3 = z2;
            } else {
                z3 = false;
            }
            if (z3) {
                p0VarD.c = iT;
                if (vVar.b) {
                    p0VarD.e = vVar.b(iT);
                }
                p0VarD.j = (p0VarD.j & (-520)) | 1;
                int i114 = androidx.core.os.e.a;
                Trace.beginSection("RV OnBindView");
            }
            p0VarD.s = vVar;
            p0VarD.c();
            vVar.c(p0VarD, iT);
            if (z3) {
                arrayList3 = p0VarD.k;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                p0VarD.j &= -1025;
                layoutParams = view.getLayoutParams();
                if (layoutParams instanceof d0) {
                    ((d0) layoutParams).c = z2;
                }
                int i115 = androidx.core.os.e.a;
                Trace.endSection();
            }
            nanoTime = recyclerView.getNanoTime() - nanoTime9;
            g0 g0VarA8 = this.g.a(p0VarD.f);
            j4 = g0VarA8.d;
            if (j4 != 0) {
                nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
            }
            g0VarA8.d = nanoTime;
            accessibilityManager = recyclerView.W;
            if (accessibilityManager == null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                Field field6 = androidx.core.view.s0.a;
                z5 = true;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                r0Var = recyclerView.H0;
                if (r0Var != null) {
                    q0Var = r0Var.B;
                    if (q0Var != null) {
                        accessibilityDelegateC = androidx.core.view.s0.c(view);
                        if (accessibilityDelegateC != null) {
                            if (accessibilityDelegateC instanceof androidx.core.view.a) {
                                bVar = ((androidx.core.view.a) accessibilityDelegateC).a;
                            } else {
                                bVar = new androidx.core.view.b(accessibilityDelegateC);
                            }
                        }
                        if (bVar != null) {
                            q0Var.B.put(view, bVar);
                        }
                    }
                    androidx.core.view.s0.m(view, q0Var);
                }
            } else {
                z5 = true;
            }
            if (l0Var.g) {
                p0VarD.g = i;
            }
            z6 = z5;
        } else {
            if ((p0VarD.j & 2) != 0) {
                z7 = z2;
            } else {
                z7 = false;
            }
            if (z7) {
                iT = recyclerView.B.t(i, 0);
                bVar = null;
                p0VarD.s = null;
                p0VarD.r = recyclerView;
                i2 = p0VarD.f;
                long nanoTime10 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(i2).d;
                    if (j5 != 0) {
                    }
                }
                vVar = recyclerView.I;
                vVar.getClass();
                if (p0VarD.s == null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                    p0VarD.c = iT;
                    if (vVar.b) {
                        p0VarD.e = vVar.b(iT);
                    }
                    p0VarD.j = (p0VarD.j & (-520)) | 1;
                    int i116 = androidx.core.os.e.a;
                    Trace.beginSection("RV OnBindView");
                }
                p0VarD.s = vVar;
                p0VarD.c();
                vVar.c(p0VarD, iT);
                if (z3) {
                    arrayList3 = p0VarD.k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    p0VarD.j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof d0) {
                        ((d0) layoutParams).c = z2;
                    }
                    int i117 = androidx.core.os.e.a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime10;
                g0 g0VarA9 = this.g.a(p0VarD.f);
                j4 = g0VarA9.d;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                g0VarA9.d = nanoTime;
                accessibilityManager = recyclerView.W;
                if (accessibilityManager == null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z4) {
                    Field field7 = androidx.core.view.s0.a;
                    z5 = true;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    r0Var = recyclerView.H0;
                    if (r0Var != null) {
                        q0Var = r0Var.B;
                        if (q0Var != null) {
                            accessibilityDelegateC = androidx.core.view.s0.c(view);
                            if (accessibilityDelegateC != null) {
                                if (accessibilityDelegateC instanceof androidx.core.view.a) {
                                    bVar = ((androidx.core.view.a) accessibilityDelegateC).a;
                                } else {
                                    bVar = new androidx.core.view.b(accessibilityDelegateC);
                                }
                            }
                            if (bVar != null) {
                                q0Var.B.put(view, bVar);
                            }
                        }
                        androidx.core.view.s0.m(view, q0Var);
                    }
                } else {
                    z5 = true;
                }
                if (l0Var.g) {
                    p0VarD.g = i;
                }
                z6 = z5;
            } else {
                iT = recyclerView.B.t(i, 0);
                bVar = null;
                p0VarD.s = null;
                p0VarD.r = recyclerView;
                i2 = p0VarD.f;
                long nanoTime11 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(i2).d;
                    if (j5 != 0) {
                    }
                }
                vVar = recyclerView.I;
                vVar.getClass();
                if (p0VarD.s == null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                    p0VarD.c = iT;
                    if (vVar.b) {
                        p0VarD.e = vVar.b(iT);
                    }
                    p0VarD.j = (p0VarD.j & (-520)) | 1;
                    int i118 = androidx.core.os.e.a;
                    Trace.beginSection("RV OnBindView");
                }
                p0VarD.s = vVar;
                p0VarD.c();
                vVar.c(p0VarD, iT);
                if (z3) {
                    arrayList3 = p0VarD.k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    p0VarD.j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof d0) {
                        ((d0) layoutParams).c = z2;
                    }
                    int i119 = androidx.core.os.e.a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime11;
                g0 g0VarA10 = this.g.a(p0VarD.f);
                j4 = g0VarA10.d;
                if (j4 != 0) {
                    nanoTime = (nanoTime / j3) + ((j4 / j3) * j2);
                }
                g0VarA10.d = nanoTime;
                accessibilityManager = recyclerView.W;
                if (accessibilityManager == null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z4) {
                    Field field8 = androidx.core.view.s0.a;
                    z5 = true;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    r0Var = recyclerView.H0;
                    if (r0Var != null) {
                        q0Var = r0Var.B;
                        if (q0Var != null) {
                            accessibilityDelegateC = androidx.core.view.s0.c(view);
                            if (accessibilityDelegateC != null) {
                                if (accessibilityDelegateC instanceof androidx.core.view.a) {
                                    bVar = ((androidx.core.view.a) accessibilityDelegateC).a;
                                } else {
                                    bVar = new androidx.core.view.b(accessibilityDelegateC);
                                }
                            }
                            if (bVar != null) {
                                q0Var.B.put(view, bVar);
                            }
                        }
                        androidx.core.view.s0.m(view, q0Var);
                    }
                } else {
                    z5 = true;
                }
                if (l0Var.g) {
                    p0VarD.g = i;
                }
                z6 = z5;
            }
        }
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            d0Var = (d0) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(d0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            d0Var = (d0) recyclerView.generateLayoutParams(layoutParams2);
            view.setLayoutParams(d0Var);
        } else {
            d0Var = (d0) layoutParams2;
        }
        d0Var.a = p0VarD;
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        d0Var.d = z5;
        return p0VarD;
    }

    public final void m(p0 p0Var) {
        if (p0Var.o) {
            this.b.remove(p0Var);
        } else {
            this.a.remove(p0Var);
        }
        p0Var.n = null;
        p0Var.o = false;
        p0Var.j &= -33;
    }

    public final void n() {
        c0 c0Var = this.h.J;
        this.f = this.e + (c0Var != null ? c0Var.i : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
