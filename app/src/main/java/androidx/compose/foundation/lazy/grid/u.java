package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.b1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import okhttp3.b0;
import okhttp3.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public Object i;

    public u(h hVar) {
        this.g = hVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(0, 0));
        this.a = arrayList;
        this.e = -1;
        this.h = new ArrayList();
        this.i = kotlin.collections.u.e;
    }

    public static u a(u uVar, int i, b1 b1Var, b0 b0Var, int i2) {
        if ((i2 & 1) != 0) {
            i = uVar.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            b1Var = (b1) uVar.h;
        }
        b1 b1Var2 = b1Var;
        if ((i2 & 4) != 0) {
            b0Var = (b0) uVar.i;
        }
        b0 b0Var2 = b0Var;
        int i4 = uVar.c;
        int i5 = uVar.d;
        int i6 = uVar.e;
        b0Var2.getClass();
        return new u((okhttp3.internal.connection.m) uVar.g, uVar.a, i3, b1Var2, b0Var2, i4, i5, i6);
    }

    public int b() {
        return ((int) Math.sqrt((((double) e()) * 1.0d) / ((double) this.f))) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    public t c(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ?? r0;
        ArrayList arrayList = (ArrayList) this.h;
        if (!((h) this.g).d) {
            int i5 = this.f;
            int i6 = i * i5;
            int iE = e() - i6;
            if (i5 > iE) {
                i5 = iE;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == this.i.size()) {
                r0 = this.i;
            } else {
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList2.add(new b(t1.b(1)));
                }
                this.i = arrayList2;
                r0 = arrayList2;
            }
            return new t(i6, r0);
        }
        int iB = i / b();
        ArrayList arrayList3 = this.a;
        int iMin = Math.min(iB, arrayList3.size() - 1);
        int iB2 = b() * iMin;
        int iIntValue = ((r) arrayList3.get(iMin)).a;
        int iG = ((r) arrayList3.get(iMin)).b;
        int i8 = this.b;
        if (iB2 <= i8 && i8 <= i) {
            iIntValue = this.c;
            iG = this.d;
            iB2 = i8;
        } else if (iMin == this.e && (i2 = i - iB2) < arrayList.size()) {
            iIntValue = ((Number) arrayList.get(i2)).intValue();
            iB2 = i;
            iG = 0;
        }
        if (iB2 % b() == 0) {
            int i9 = i - iB2;
            z = 2 <= i9 && i9 < b();
        }
        if (z) {
            this.e = iMin;
            arrayList.clear();
        }
        if (iB2 > i) {
            androidx.compose.foundation.internal.b.c("currentLine (" + iB2 + ") > lineIndex (" + i + ')');
        }
        while (iB2 < i && iIntValue < e()) {
            if (z) {
                arrayList.add(Integer.valueOf(iIntValue));
            }
            int i10 = 0;
            while (i10 < this.f && iIntValue < e()) {
                if (iG == 0) {
                    i4 = iG;
                    iG = g(iIntValue);
                } else {
                    i4 = 0;
                }
                i10 += iG;
                if (i10 > this.f) {
                    break;
                }
                iIntValue++;
                iG = i4;
            }
            iB2++;
            if (iB2 % b() == 0 && iIntValue < e()) {
                if (arrayList3.size() != iB2 / b()) {
                    androidx.compose.foundation.internal.b.c("invalid starting point");
                }
                arrayList3.add(new r(iIntValue, iG));
            }
        }
        this.b = i;
        this.c = iIntValue;
        this.d = iG;
        ArrayList arrayList4 = new ArrayList();
        int i11 = 0;
        int i12 = iIntValue;
        while (i11 < this.f && i12 < e()) {
            if (iG == 0) {
                int i13 = iG;
                iG = g(i12);
                i3 = i13;
            } else {
                i3 = 0;
            }
            i11 += iG;
            if (i11 > this.f) {
                break;
            }
            i12++;
            arrayList4.add(new b(t1.b(iG)));
            iG = i3;
        }
        return new t(iIntValue, arrayList4);
    }

    public int d(int i) {
        int i2;
        if (e() <= 0) {
            return 0;
        }
        if (i >= e()) {
            androidx.compose.foundation.internal.b.a("ItemIndex > total count");
        }
        if (!((h) this.g).d) {
            return i / this.f;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        com.google.common.base.c.u(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int i5 = ((r) arrayList.get(i2)).a - i;
            if (i5 >= 0) {
                if (i5 <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int iB = b() * i2;
        int i6 = ((r) arrayList.get(i2)).a;
        if (i6 > i) {
            androidx.compose.foundation.internal.b.a("currentItemIndex > itemIndex");
        }
        int i7 = 0;
        while (i6 < i) {
            int i8 = i6 + 1;
            int iG = g(i6);
            i7 += iG;
            int i9 = this.f;
            if (i7 >= i9) {
                if (i7 == i9) {
                    iB++;
                    i7 = 0;
                } else {
                    iB++;
                    i7 = iG;
                }
            }
            if (iB % b() == 0 && iB / b() >= arrayList.size()) {
                arrayList.add(new r(i8 - (i7 > 0 ? 1 : 0), 0));
            }
            i6 = i8;
        }
        return g(i) + i7 > this.f ? iB + 1 : iB;
    }

    public int e() {
        return ((h) this.g).c.y;
    }

    public g0 f(b0 b0Var) {
        b1 b1Var = (b1) this.h;
        b0Var.getClass();
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i >= arrayList.size()) {
            net.luminis.tls.engine.impl.c.r("Check failed.");
            return null;
        }
        this.f++;
        if (b1Var != null) {
            okhttp3.internal.connection.o oVarC = ((okhttp3.internal.connection.g) b1Var.z).c();
            okhttp3.s sVar = b0Var.a;
            oVarC.getClass();
            sVar.getClass();
            okhttp3.s sVar2 = oVarC.j.h;
            if (sVar.e != sVar2.e || !kotlin.jvm.internal.l.a(sVar.d, sVar2.d)) {
                androidx.transition.k.l(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.f != 1) {
                androidx.transition.k.l(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        u uVarA = a(this, i2, null, b0Var, 58);
        okhttp3.t tVar = (okhttp3.t) arrayList.get(i);
        g0 g0VarA = tVar.a(uVarA);
        if (g0VarA == null) {
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        if (b1Var == null || i2 >= arrayList.size() || uVarA.f == 1) {
            return g0VarA;
        }
        androidx.transition.k.l(tVar, " must call proceed() exactly once", "network interceptor ");
        return null;
    }

    public int g(int i) {
        s.b = this.f;
        androidx.compose.foundation.lazy.layout.j jVarI = ((h) this.g).c.i(i);
        int i2 = i - jVarI.a;
        return (int) ((b) ((f) jVarI.c).b.invoke(s.a, Integer.valueOf(i2))).a;
    }

    public u(okhttp3.internal.connection.m mVar, ArrayList arrayList, int i, b1 b1Var, b0 b0Var, int i2, int i3, int i4) {
        b0Var.getClass();
        this.g = mVar;
        this.a = arrayList;
        this.b = i;
        this.h = b1Var;
        this.i = b0Var;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
