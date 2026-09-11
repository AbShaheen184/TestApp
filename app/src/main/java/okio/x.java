package okio;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Comparable {
    public static final String y;
    public final i e;

    static {
        String str = File.separator;
        str.getClass();
        y = str;
    }

    public x(i iVar) {
        iVar.getClass();
        this.e = iVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = okio.internal.c.a(this);
        i iVar = this.e;
        if (iA == -1) {
            iA = 0;
        } else if (iA < iVar.f() && iVar.k(iA) == 92) {
            iA++;
        }
        int iF = iVar.f();
        int i = iA;
        while (iA < iF) {
            if (iVar.k(iA) == 47 || iVar.k(iA) == 92) {
                arrayList.add(iVar.q(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < iVar.f()) {
            arrayList.add(iVar.q(i, iVar.f()));
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        xVar.getClass();
        return this.e.compareTo(xVar.e);
    }

    public final String d() {
        i iVar = okio.internal.c.a;
        i iVarR = this.e;
        int iM = i.m(iVarR, iVar);
        if (iM == -1) {
            iM = i.m(iVarR, okio.internal.c.b);
        }
        if (iM != -1) {
            iVarR = i.r(iVarR, iM + 1, 0, 2);
        } else if (h() != null && iVarR.f() == 2) {
            iVarR = i.A;
        }
        return iVarR.u();
    }

    public final x e() {
        i iVar = okio.internal.c.d;
        i iVar2 = this.e;
        if (kotlin.jvm.internal.l.a(iVar2, iVar)) {
            return null;
        }
        i iVar3 = okio.internal.c.a;
        if (kotlin.jvm.internal.l.a(iVar2, iVar3)) {
            return null;
        }
        i iVar4 = okio.internal.c.b;
        if (kotlin.jvm.internal.l.a(iVar2, iVar4)) {
            return null;
        }
        i iVar5 = okio.internal.c.e;
        iVar2.getClass();
        iVar5.getClass();
        int iF = iVar2.f();
        byte[] bArr = iVar5.e;
        if (iVar2.n(iF - bArr.length, iVar5, bArr.length) && (iVar2.f() == 2 || iVar2.n(iVar2.f() - 3, iVar3, 1) || iVar2.n(iVar2.f() - 3, iVar4, 1))) {
            return null;
        }
        int iM = i.m(iVar2, iVar3);
        if (iM == -1) {
            iM = i.m(iVar2, iVar4);
        }
        if (iM == 2 && h() != null) {
            if (iVar2.f() == 3) {
                return null;
            }
            return new x(i.r(iVar2, 0, 3, 1));
        }
        if (iM == 1) {
            iVar4.getClass();
            if (iVar2.n(0, iVar4, iVar4.f())) {
                return null;
            }
        }
        if (iM != -1 || h() == null) {
            if (iM == -1) {
                return new x(iVar);
            }
            return iM == 0 ? new x(i.r(iVar2, 0, 1, 1)) : new x(i.r(iVar2, 0, iM, 1));
        }
        if (iVar2.f() == 2) {
            return null;
        }
        return new x(i.r(iVar2, 0, 2, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && kotlin.jvm.internal.l.a(((x) obj).e, this.e);
    }

    public final x f(x xVar) {
        xVar.getClass();
        i iVar = xVar.e;
        int iA = okio.internal.c.a(this);
        i iVar2 = this.e;
        x xVar2 = iA == -1 ? null : new x(iVar2.q(0, iA));
        int iA2 = okio.internal.c.a(xVar);
        if (!kotlin.jvm.internal.l.a(xVar2, iA2 != -1 ? new x(iVar.q(0, iA2)) : null)) {
            net.luminis.tls.engine.impl.c.h("Paths of different roots cannot be relative to each other: ", this, " and ", xVar);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = xVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && kotlin.jvm.internal.l.a(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && iVar2.f() == iVar.f()) {
            return com.google.android.gms.measurement.internal.f0.i(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(okio.internal.c.e) != -1) {
            net.luminis.tls.engine.impl.c.h("Impossible relative path to resolve: ", this, " and ", xVar);
            return null;
        }
        if (kotlin.jvm.internal.l.a(iVar, okio.internal.c.d)) {
            return this;
        }
        f fVar = new f();
        i iVarC = okio.internal.c.c(xVar);
        if (iVarC == null && (iVarC = okio.internal.c.c(this)) == null) {
            iVarC = okio.internal.c.f(y);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            fVar.m0(okio.internal.c.e);
            fVar.m0(iVarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            fVar.m0((i) arrayListA.get(i));
            fVar.m0(iVarC);
            i++;
        }
        return okio.internal.c.d(fVar, false);
    }

    public final x g(String str) {
        str.getClass();
        f fVar = new f();
        fVar.u0(str);
        return okio.internal.c.b(this, okio.internal.c.d(fVar, false), false);
    }

    public final Character h() {
        i iVar = okio.internal.c.a;
        i iVar2 = this.e;
        if (i.i(iVar2, iVar) != -1 || iVar2.f() < 2 || iVar2.k(1) != 58) {
            return null;
        }
        char cK = (char) iVar2.k(0);
        if (('a' > cK || cK >= '{') && ('A' > cK || cK >= '[')) {
            return null;
        }
        return Character.valueOf(cK);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final File toFile() {
        return new File(this.e.u());
    }

    public final String toString() {
        return this.e.u();
    }
}
