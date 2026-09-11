package androidx.compose.foundation.text.selection;

import androidx.datastore.preferences.protobuf.o1;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.m2;
import com.google.android.gms.internal.measurement.r1;
import com.google.android.gms.internal.measurement.s1;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.z1;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.a2;
import com.google.protobuf.t2;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public w(com.google.protobuf.t tVar) {
        this.a = 6;
        this.d = 0;
        byte[] bArr = com.google.protobuf.u0.a;
        if (tVar == null) {
            com.google.gson.b.h("input");
            throw null;
        }
        this.e = tVar;
        tVar.c = this;
    }

    public static void W(int i) throws com.google.protobuf.x0 {
        if ((i & 3) != 0) {
            throw com.google.protobuf.x0.f();
        }
    }

    public static void X(int i) throws com.google.protobuf.x0 {
        if ((i & 7) != 0) {
            throw com.google.protobuf.x0.f();
        }
    }

    public static final void t0(int i) throws t1 {
        if ((i & 3) == 0) {
            return;
        }
        androidx.transition.k.q("Failed to parse the message.");
    }

    public static final void u0(int i) throws t1 {
        if ((i & 7) == 0) {
            return;
        }
        androidx.transition.k.q("Failed to parse the message.");
    }

    public void A(List list) throws com.google.protobuf.x0 {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.f0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = tVar.A();
                W(iA);
                int iD = tVar.d() + iA;
                do {
                    list.add(Float.valueOf(tVar.p()));
                } while (tVar.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw com.google.protobuf.x0.c();
            }
            do {
                list.add(Float.valueOf(tVar.p()));
                if (tVar.e()) {
                    return;
                } else {
                    iZ = tVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        com.google.protobuf.f0 f0Var = (com.google.protobuf.f0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iA2 = tVar.A();
            W(iA2);
            int iD2 = tVar.d() + iA2;
            do {
                f0Var.c(tVar.p());
            } while (tVar.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw com.google.protobuf.x0.c();
        }
        do {
            f0Var.c(tVar.p());
            if (tVar.e()) {
                return;
            } else {
                iZ2 = tVar.z();
            }
        } while (iZ2 == this.b);
        this.d = iZ2;
    }

    public void B(androidx.datastore.preferences.protobuf.u uVar) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.A()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iK = w0Var.k() + w0Var.J();
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.A()));
        } while (w0Var.k() < iK);
        T(iK);
    }

    public void C(List list) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.m0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(tVar.q()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iD = tVar.d() + tVar.A();
            do {
                list.add(Integer.valueOf(tVar.q()));
            } while (tVar.d() < iD);
            T(iD);
            return;
        }
        com.google.protobuf.m0 m0Var = (com.google.protobuf.m0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                m0Var.c(tVar.q());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iD2 = tVar.d() + tVar.A();
        do {
            m0Var.c(tVar.q());
        } while (tVar.d() < iD2);
        T(iD2);
    }

    public void D(androidx.datastore.preferences.protobuf.u uVar) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.B()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iK = w0Var.k() + w0Var.J();
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.B()));
        } while (w0Var.k() < iK);
        T(iK);
    }

    public void E(List list) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.d1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(tVar.r()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iD = tVar.d() + tVar.A();
            do {
                list.add(Long.valueOf(tVar.r()));
            } while (tVar.d() < iD);
            T(iD);
            return;
        }
        com.google.protobuf.d1 d1Var = (com.google.protobuf.d1) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                d1Var.c(tVar.r());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iD2 = tVar.d() + tVar.A();
        do {
            d1Var.c(tVar.r());
        } while (tVar.d() < iD2);
        T(iD2);
    }

    public void F(androidx.datastore.preferences.protobuf.u uVar) throws androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iJ = w0Var.J();
            if ((iJ & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.x("Failed to parse the message.");
            }
            int iK = w0Var.k() + iJ;
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.C()));
            } while (w0Var.k() < iK);
            return;
        }
        if (i != 5) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.C()));
            if (w0Var.l()) {
                return;
            } else {
                I = w0Var.I();
            }
        } while (I == this.b);
        this.d = I;
    }

    public void G(List list) throws com.google.protobuf.x0 {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.m0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = tVar.A();
                W(iA);
                int iD = tVar.d() + iA;
                do {
                    list.add(Integer.valueOf(tVar.t()));
                } while (tVar.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw com.google.protobuf.x0.c();
            }
            do {
                list.add(Integer.valueOf(tVar.t()));
                if (tVar.e()) {
                    return;
                } else {
                    iZ = tVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        com.google.protobuf.m0 m0Var = (com.google.protobuf.m0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iA2 = tVar.A();
            W(iA2);
            int iD2 = tVar.d() + iA2;
            do {
                m0Var.c(tVar.t());
            } while (tVar.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw com.google.protobuf.x0.c();
        }
        do {
            m0Var.c(tVar.t());
            if (tVar.e()) {
                return;
            } else {
                iZ2 = tVar.z();
            }
        } while (iZ2 == this.b);
        this.d = iZ2;
    }

    public void H(androidx.datastore.preferences.protobuf.u uVar) throws androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.D()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iJ = w0Var.J();
        if ((iJ & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.x("Failed to parse the message.");
        }
        int iK = w0Var.k() + iJ;
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.D()));
        } while (w0Var.k() < iK);
    }

    public void I(List list) throws com.google.protobuf.x0 {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.d1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(tVar.u()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iA = tVar.A();
            X(iA);
            int iD = tVar.d() + iA;
            do {
                list.add(Long.valueOf(tVar.u()));
            } while (tVar.d() < iD);
            return;
        }
        com.google.protobuf.d1 d1Var = (com.google.protobuf.d1) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                d1Var.c(tVar.u());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iA2 = tVar.A();
        X(iA2);
        int iD2 = tVar.d() + iA2;
        do {
            d1Var.c(tVar.u());
        } while (tVar.d() < iD2);
    }

    public void J(androidx.datastore.preferences.protobuf.u uVar) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.E()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iK = w0Var.k() + w0Var.J();
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.E()));
        } while (w0Var.k() < iK);
        T(iK);
    }

    public void K(List list) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.m0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(tVar.v()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iD = tVar.d() + tVar.A();
            do {
                list.add(Integer.valueOf(tVar.v()));
            } while (tVar.d() < iD);
            T(iD);
            return;
        }
        com.google.protobuf.m0 m0Var = (com.google.protobuf.m0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                m0Var.c(tVar.v());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iD2 = tVar.d() + tVar.A();
        do {
            m0Var.c(tVar.v());
        } while (tVar.d() < iD2);
        T(iD2);
    }

    public void L(androidx.datastore.preferences.protobuf.u uVar) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.F()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iK = w0Var.k() + w0Var.J();
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.F()));
        } while (w0Var.k() < iK);
        T(iK);
    }

    public void M(List list) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.d1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(tVar.w()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iD = tVar.d() + tVar.A();
            do {
                list.add(Long.valueOf(tVar.w()));
            } while (tVar.d() < iD);
            T(iD);
            return;
        }
        com.google.protobuf.d1 d1Var = (com.google.protobuf.d1) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                d1Var.c(tVar.w());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iD2 = tVar.d() + tVar.A();
        do {
            d1Var.c(tVar.w());
        } while (tVar.d() < iD2);
        T(iD2);
    }

    public void N(androidx.datastore.preferences.protobuf.u uVar, boolean z) throws com.google.protobuf.w0, androidx.datastore.preferences.protobuf.w {
        String strG;
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        if ((this.b & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        do {
            if (z) {
                U(2);
                strG = w0Var.H();
            } else {
                U(2);
                strG = w0Var.G();
            }
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(strG);
            if (w0Var.l()) {
                return;
            } else {
                I = w0Var.I();
            }
        } while (I == this.b);
        this.d = I;
    }

    public void O(com.google.protobuf.t0 t0Var, boolean z) throws com.google.protobuf.w0, androidx.datastore.preferences.protobuf.w {
        String strX;
        int iZ;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        if ((this.b & 7) != 2) {
            throw com.google.protobuf.x0.c();
        }
        do {
            if (z) {
                U(2);
                strX = tVar.y();
            } else {
                U(2);
                strX = tVar.x();
            }
            t0Var.add(strX);
            if (tVar.e()) {
                return;
            } else {
                iZ = tVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void P(androidx.datastore.preferences.protobuf.u uVar) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.J()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iK = w0Var.k() + w0Var.J();
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.J()));
        } while (w0Var.k() < iK);
        T(iK);
    }

    public void Q(List list) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.m0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(tVar.A()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iD = tVar.d() + tVar.A();
            do {
                list.add(Integer.valueOf(tVar.A()));
            } while (tVar.d() < iD);
            T(iD);
            return;
        }
        com.google.protobuf.m0 m0Var = (com.google.protobuf.m0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                m0Var.c(tVar.A());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iD2 = tVar.d() + tVar.A();
        do {
            m0Var.c(tVar.A());
        } while (tVar.d() < iD2);
        T(iD2);
    }

    public void R(androidx.datastore.preferences.protobuf.u uVar) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.K()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iK = w0Var.k() + w0Var.J();
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.K()));
        } while (w0Var.k() < iK);
        T(iK);
    }

    public void S(List list) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.d1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(tVar.B()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iD = tVar.d() + tVar.A();
            do {
                list.add(Long.valueOf(tVar.B()));
            } while (tVar.d() < iD);
            T(iD);
            return;
        }
        com.google.protobuf.d1 d1Var = (com.google.protobuf.d1) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                d1Var.c(tVar.B());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iD2 = tVar.d() + tVar.A();
        do {
            d1Var.c(tVar.B());
        } while (tVar.d() < iD2);
        T(iD2);
    }

    public void T(int i) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        switch (this.a) {
            case 4:
                if (((androidx.core.view.w0) this.e).k() != i) {
                    throw androidx.datastore.preferences.protobuf.x.e();
                }
                return;
            default:
                if (((com.google.protobuf.t) this.e).d() != i) {
                    throw com.google.protobuf.x0.g();
                }
                return;
        }
    }

    public void U(int i) throws com.google.protobuf.w0, androidx.datastore.preferences.protobuf.w {
        switch (this.a) {
            case 4:
                if ((this.b & 7) != i) {
                    throw androidx.datastore.preferences.protobuf.x.b();
                }
                return;
            default:
                if ((this.b & 7) != i) {
                    throw com.google.protobuf.x0.c();
                }
                return;
        }
    }

    public boolean V() {
        int i;
        int i2;
        switch (this.a) {
            case 4:
                androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
                if (w0Var.l() || (i = this.b) == this.c) {
                    return false;
                }
                return w0Var.L(i);
            default:
                com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
                if (tVar.e() || (i2 = this.b) == this.c) {
                    return false;
                }
                return tVar.C(i2);
        }
    }

    public void Y(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof x1;
        int i = this.b;
        if (z) {
            x1 x1Var = (x1) r1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE = w0Var.e() + w0Var.A();
                do {
                    x1Var.e(w0Var.r());
                } while (w0Var.e() < iE);
                s0(iE);
                return;
            }
            do {
                x1Var.e(w0Var.r());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE2 = w0Var.e() + w0Var.A();
                do {
                    r1Var.add(Long.valueOf(w0Var.r()));
                } while (w0Var.e() < iE2);
                s0(iE2);
                return;
            }
            do {
                r1Var.add(Long.valueOf(w0Var.r()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public void Z(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof com.google.android.gms.internal.measurement.j1;
        int i = this.b;
        if (z) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) r1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE = w0Var.e() + w0Var.A();
                do {
                    j1Var.e(w0Var.s());
                } while (w0Var.e() < iE);
                s0(iE);
                return;
            }
            do {
                j1Var.e(w0Var.s());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE2 = w0Var.e() + w0Var.A();
                do {
                    r1Var.add(Integer.valueOf(w0Var.s()));
                } while (w0Var.e() < iE2);
                s0(iE2);
                return;
            }
            do {
                r1Var.add(Integer.valueOf(w0Var.s()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public y a(int i) {
        return new y(com.google.android.gms.dynamite.g.s((androidx.compose.ui.text.j0) this.e, i), i, 1L);
    }

    public void a0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof x1;
        int i = this.b;
        if (z) {
            x1 x1Var = (x1) r1Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iA = w0Var.A();
                u0(iA);
                int iE = w0Var.e() + iA;
                do {
                    x1Var.e(w0Var.t());
                } while (w0Var.e() < iE);
                return;
            }
            do {
                x1Var.e(w0Var.t());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iA2 = w0Var.A();
                u0(iA2);
                int iE2 = w0Var.e() + iA2;
                do {
                    r1Var.add(Long.valueOf(w0Var.t()));
                } while (w0Var.e() < iE2);
                return;
            }
            do {
                r1Var.add(Long.valueOf(w0Var.t()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public int b() {
        return this.d - this.c;
    }

    public void b0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof com.google.android.gms.internal.measurement.j1;
        int i = this.b;
        if (z) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) r1Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = w0Var.A();
                t0(iA);
                int iE = w0Var.e() + iA;
                do {
                    j1Var.e(w0Var.u());
                } while (w0Var.e() < iE);
                return;
            }
            if (i2 != 5) {
                androidx.transition.k.p();
                return;
            }
            do {
                j1Var.e(w0Var.u());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = w0Var.A();
                t0(iA2);
                int iE2 = w0Var.e() + iA2;
                do {
                    r1Var.add(Integer.valueOf(w0Var.u()));
                } while (w0Var.e() < iE2);
                return;
            }
            if (i3 != 5) {
                androidx.transition.k.p();
                return;
            }
            do {
                r1Var.add(Integer.valueOf(w0Var.u()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public int c() {
        switch (this.a) {
            case 4:
                int i = this.d;
                if (i != 0) {
                    this.b = i;
                    this.d = 0;
                } else {
                    this.b = ((androidx.core.view.w0) this.e).I();
                }
                int i2 = this.b;
                if (i2 == 0 || i2 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i2 >>> 3;
            default:
                int i3 = this.d;
                if (i3 != 0) {
                    this.b = i3;
                    this.d = 0;
                } else {
                    this.b = ((com.google.protobuf.t) this.e).z();
                }
                int i4 = this.b;
                if (i4 == 0 || i4 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i4 >>> 3;
        }
    }

    public void c0(r1 r1Var) throws t1 {
        int iL;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                r1Var.add(Boolean.valueOf(w0Var.v()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            this.d = iL;
            return;
        }
        if (i != 2) {
            androidx.transition.k.p();
            return;
        }
        int iE = w0Var.e() + w0Var.A();
        do {
            r1Var.add(Boolean.valueOf(w0Var.v()));
        } while (w0Var.e() < iE);
        s0(iE);
    }

    public int d(int i) {
        return ((androidx.compose.runtime.changelist.l0) this.e).n[this.c + i];
    }

    public void d0(r1 r1Var, boolean z) throws s1 {
        String strW;
        int iL;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        if ((this.b & 7) != 2) {
            androidx.transition.k.p();
            return;
        }
        do {
            if (z) {
                o0(2);
                strW = w0Var.x();
            } else {
                o0(2);
                strW = w0Var.w();
            }
            r1Var.add(strW);
            if (w0Var.d()) {
                return;
            } else {
                iL = w0Var.l();
            }
        } while (iL == this.b);
        this.d = iL;
    }

    public Object e(int i) {
        return ((androidx.compose.runtime.changelist.l0) this.e).p[this.d + i];
    }

    public void e0(r1 r1Var, m2 m2Var, com.google.android.gms.internal.measurement.a1 a1Var) throws t1 {
        int iL;
        int i = this.b;
        if ((i & 7) != 2) {
            androidx.transition.k.p();
            return;
        }
        do {
            com.google.android.gms.internal.measurement.i1 i1VarA = m2Var.a();
            p0(i1VarA, m2Var, a1Var);
            m2Var.f(i1VarA);
            r1Var.add(i1VarA);
            com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
            if (w0Var.d() || this.d != 0) {
                return;
            } else {
                iL = w0Var.l();
            }
        } while (iL == i);
        this.d = iL;
    }

    public void f(Object obj, androidx.datastore.preferences.protobuf.u0 u0Var, androidx.datastore.preferences.protobuf.l lVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            u0Var.i(obj, this, lVar);
            if (this.b != this.c) {
                throw new androidx.datastore.preferences.protobuf.x("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public void f0(r1 r1Var, m2 m2Var, com.google.android.gms.internal.measurement.a1 a1Var) throws s1 {
        int iL;
        int i = this.b;
        if ((i & 7) != 3) {
            androidx.transition.k.p();
            return;
        }
        do {
            com.google.android.gms.internal.measurement.i1 i1VarA = m2Var.a();
            q0(i1VarA, m2Var, a1Var);
            m2Var.f(i1VarA);
            r1Var.add(i1VarA);
            com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
            if (w0Var.d() || this.d != 0) {
                return;
            } else {
                iL = w0Var.l();
            }
        } while (iL == i);
        this.d = iL;
    }

    public void g(Object obj, a2 a2Var, com.google.protobuf.a0 a0Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            a2Var.f(obj, this, a0Var);
            if (this.b != this.c) {
                throw com.google.protobuf.x0.f();
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public void g0(r1 r1Var) throws s1 {
        int iL;
        if ((this.b & 7) != 2) {
            androidx.transition.k.p();
            return;
        }
        do {
            r1Var.add(w0());
            com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
            if (w0Var.d()) {
                return;
            } else {
                iL = w0Var.l();
            }
        } while (iL == this.b);
        this.d = iL;
    }

    public void h(Object obj, androidx.datastore.preferences.protobuf.u0 u0Var, androidx.datastore.preferences.protobuf.l lVar) throws androidx.datastore.preferences.protobuf.x {
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int iJ = w0Var.J();
        if (w0Var.y >= 100) {
            throw new androidx.datastore.preferences.protobuf.x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iS = w0Var.s(iJ);
        w0Var.y++;
        u0Var.i(obj, this, lVar);
        w0Var.a(0);
        w0Var.y--;
        w0Var.r(iS);
    }

    public void h0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof com.google.android.gms.internal.measurement.j1;
        int i = this.b;
        if (z) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) r1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE = w0Var.e() + w0Var.A();
                do {
                    j1Var.e(w0Var.A());
                } while (w0Var.e() < iE);
                s0(iE);
                return;
            }
            do {
                j1Var.e(w0Var.A());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE2 = w0Var.e() + w0Var.A();
                do {
                    r1Var.add(Integer.valueOf(w0Var.A()));
                } while (w0Var.e() < iE2);
                s0(iE2);
                return;
            }
            do {
                r1Var.add(Integer.valueOf(w0Var.A()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public void i(Object obj, a2 a2Var, com.google.protobuf.a0 a0Var) throws com.google.protobuf.x0 {
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        int iA = tVar.A();
        if (tVar.a + tVar.b >= 100) {
            throw new com.google.protobuf.x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = tVar.i(iA);
        tVar.a++;
        a2Var.f(obj, this, a0Var);
        tVar.a(0);
        tVar.a--;
        tVar.h(i);
    }

    public void i0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof com.google.android.gms.internal.measurement.j1;
        int i = this.b;
        if (z) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) r1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE = w0Var.e() + w0Var.A();
                do {
                    j1Var.e(w0Var.B());
                } while (w0Var.e() < iE);
                s0(iE);
                return;
            }
            do {
                j1Var.e(w0Var.B());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE2 = w0Var.e() + w0Var.A();
                do {
                    r1Var.add(Integer.valueOf(w0Var.B()));
                } while (w0Var.e() < iE2);
                s0(iE2);
                return;
            }
            do {
                r1Var.add(Integer.valueOf(w0Var.B()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public void j(androidx.datastore.preferences.protobuf.u uVar) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Boolean.valueOf(w0Var.t()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iK = w0Var.k() + w0Var.J();
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Boolean.valueOf(w0Var.t()));
        } while (w0Var.k() < iK);
        T(iK);
    }

    public void j0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof com.google.android.gms.internal.measurement.j1;
        int i = this.b;
        if (z) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) r1Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = w0Var.A();
                t0(iA);
                int iE = w0Var.e() + iA;
                do {
                    j1Var.e(w0Var.C());
                } while (w0Var.e() < iE);
                return;
            }
            if (i2 != 5) {
                androidx.transition.k.p();
                return;
            }
            do {
                j1Var.e(w0Var.C());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = w0Var.A();
                t0(iA2);
                int iE2 = w0Var.e() + iA2;
                do {
                    r1Var.add(Integer.valueOf(w0Var.C()));
                } while (w0Var.e() < iE2);
                return;
            }
            if (i3 != 5) {
                androidx.transition.k.p();
                return;
            }
            do {
                r1Var.add(Integer.valueOf(w0Var.C()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public void k(List list) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.e;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(tVar.j()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iD = tVar.d() + tVar.A();
            do {
                list.add(Boolean.valueOf(tVar.j()));
            } while (tVar.d() < iD);
            T(iD);
            return;
        }
        com.google.protobuf.e eVar = (com.google.protobuf.e) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                eVar.c(tVar.j());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iD2 = tVar.d() + tVar.A();
        do {
            eVar.c(tVar.j());
        } while (tVar.d() < iD2);
        T(iD2);
    }

    public void k0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof x1;
        int i = this.b;
        if (z) {
            x1 x1Var = (x1) r1Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iA = w0Var.A();
                u0(iA);
                int iE = w0Var.e() + iA;
                do {
                    x1Var.e(w0Var.D());
                } while (w0Var.e() < iE);
                return;
            }
            do {
                x1Var.e(w0Var.D());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iA2 = w0Var.A();
                u0(iA2);
                int iE2 = w0Var.e() + iA2;
                do {
                    r1Var.add(Long.valueOf(w0Var.D()));
                } while (w0Var.e() < iE2);
                return;
            }
            do {
                r1Var.add(Long.valueOf(w0Var.D()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public androidx.datastore.preferences.protobuf.f l() throws com.google.protobuf.w0, androidx.datastore.preferences.protobuf.w {
        U(2);
        return ((androidx.core.view.w0) this.e).u();
    }

    public void l0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof com.google.android.gms.internal.measurement.j1;
        int i = this.b;
        if (z) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) r1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE = w0Var.e() + w0Var.A();
                do {
                    j1Var.e(w0Var.E());
                } while (w0Var.e() < iE);
                s0(iE);
                return;
            }
            do {
                j1Var.e(w0Var.E());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE2 = w0Var.e() + w0Var.A();
                do {
                    r1Var.add(Integer.valueOf(w0Var.E()));
                } while (w0Var.e() < iE2);
                s0(iE2);
                return;
            }
            do {
                r1Var.add(Integer.valueOf(w0Var.E()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public ByteString m() throws com.google.protobuf.w0, androidx.datastore.preferences.protobuf.w {
        U(2);
        return ((com.google.protobuf.t) this.e).k();
    }

    public void m0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof x1;
        int i = this.b;
        if (z) {
            x1 x1Var = (x1) r1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE = w0Var.e() + w0Var.A();
                do {
                    x1Var.e(w0Var.F());
                } while (w0Var.e() < iE);
                s0(iE);
                return;
            }
            do {
                x1Var.e(w0Var.F());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE2 = w0Var.e() + w0Var.A();
                do {
                    r1Var.add(Long.valueOf(w0Var.F()));
                } while (w0Var.e() < iE2);
                s0(iE2);
                return;
            }
            do {
                r1Var.add(Long.valueOf(w0Var.F()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public void n(androidx.datastore.preferences.protobuf.u uVar) throws androidx.datastore.preferences.protobuf.w {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        if ((this.b & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(l());
            if (w0Var.l()) {
                return;
            } else {
                I = w0Var.I();
            }
        } while (I == this.b);
        this.d = I;
    }

    public void n0(z1 z1Var, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar, com.google.android.gms.internal.measurement.a1 a1Var) {
        int i;
        int i2;
        o0(2);
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        int iA = w0Var.a(w0Var.A());
        Object obj = cVar.A;
        Object objR0 = "";
        Object objR1 = obj;
        while (true) {
            try {
                int iV0 = v0();
                if (iV0 == Integer.MAX_VALUE || w0Var.d()) {
                    break;
                }
                boolean zN = false;
                if (iV0 == 1) {
                    objR0 = r0((a3) cVar.y, null, null);
                } else if (iV0 != 2) {
                    try {
                        if (!((w0Var.d() || (i2 = this.b) == this.c) ? false : w0Var.n(i2))) {
                            throw new t1("Unable to parse map entry.");
                        }
                    } catch (s1 e) {
                        if (!w0Var.d() && (i = this.b) != this.c) {
                            zN = w0Var.n(i);
                        }
                        if (!zN) {
                            throw new t1("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objR1 = r0((a3) cVar.z, obj.getClass(), a1Var);
                }
            } catch (Throwable th) {
                w0Var.b(iA);
                throw th;
            }
        }
        z1Var.put(objR0, objR1);
        w0Var.b(iA);
    }

    public void o(com.google.protobuf.t0 t0Var) throws com.google.protobuf.w0 {
        int iZ;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        if ((this.b & 7) != 2) {
            throw com.google.protobuf.x0.c();
        }
        do {
            t0Var.add(m());
            if (tVar.e()) {
                return;
            } else {
                iZ = tVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void o0(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        androidx.transition.k.p();
    }

    public void p(androidx.datastore.preferences.protobuf.u uVar) throws androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Double.valueOf(w0Var.v()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iJ = w0Var.J();
        if ((iJ & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.x("Failed to parse the message.");
        }
        int iK = w0Var.k() + iJ;
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Double.valueOf(w0Var.v()));
        } while (w0Var.k() < iK);
    }

    public void p0(Object obj, m2 m2Var, com.google.android.gms.internal.measurement.a1 a1Var) throws t1 {
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        int iA = w0Var.A();
        if (w0Var.a + w0Var.b >= 100) {
            androidx.transition.k.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iA2 = w0Var.a(iA);
        w0Var.a++;
        m2Var.d(obj, this, a1Var);
        w0Var.m(0);
        w0Var.a--;
        w0Var.b(iA2);
    }

    public void q(List list) throws com.google.protobuf.x0 {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.x;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(tVar.l()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iA = tVar.A();
            X(iA);
            int iD = tVar.d() + iA;
            do {
                list.add(Double.valueOf(tVar.l()));
            } while (tVar.d() < iD);
            return;
        }
        com.google.protobuf.x xVar = (com.google.protobuf.x) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                xVar.c(tVar.l());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iA2 = tVar.A();
        X(iA2);
        int iD2 = tVar.d() + iA2;
        do {
            xVar.c(tVar.l());
        } while (tVar.d() < iD2);
    }

    public void q0(Object obj, m2 m2Var, com.google.android.gms.internal.measurement.a1 a1Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            m2Var.d(obj, this, a1Var);
            if (this.b != this.c) {
                throw new t1("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public void r(androidx.datastore.preferences.protobuf.u uVar) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.w()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iK = w0Var.k() + w0Var.J();
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.w()));
        } while (w0Var.k() < iK);
        T(iK);
    }

    public Object r0(a3 a3Var, Class cls, com.google.android.gms.internal.measurement.a1 a1Var) throws t1 {
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        a3 a3Var2 = a3.z;
        switch (a3Var.ordinal()) {
            case 0:
                o0(1);
                return Double.valueOf(w0Var.o());
            case 1:
                o0(5);
                return Float.valueOf(w0Var.p());
            case 2:
                o0(0);
                return Long.valueOf(w0Var.r());
            case 3:
                o0(0);
                return Long.valueOf(w0Var.q());
            case 4:
                o0(0);
                return Integer.valueOf(w0Var.s());
            case 5:
                o0(1);
                return Long.valueOf(w0Var.t());
            case 6:
                o0(5);
                return Integer.valueOf(w0Var.u());
            case 7:
                o0(0);
                return Boolean.valueOf(w0Var.v());
            case 8:
                o0(2);
                return w0Var.x();
            case 9:
            default:
                net.luminis.tls.engine.impl.c.o("unsupported field type.");
                return null;
            case 10:
                o0(2);
                m2 m2VarA = j2.c.a(cls);
                com.google.android.gms.internal.measurement.i1 i1VarA = m2VarA.a();
                p0(i1VarA, m2VarA, a1Var);
                m2VarA.f(i1VarA);
                return i1VarA;
            case 11:
                return w0();
            case 12:
                o0(0);
                return Integer.valueOf(w0Var.A());
            case 13:
                o0(0);
                return Integer.valueOf(w0Var.B());
            case 14:
                o0(5);
                return Integer.valueOf(w0Var.C());
            case 15:
                o0(1);
                return Long.valueOf(w0Var.D());
            case 16:
                o0(0);
                return Integer.valueOf(w0Var.E());
            case 17:
                o0(0);
                return Long.valueOf(w0Var.F());
        }
    }

    public void s(List list) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.x {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.m0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(tVar.m()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iD = tVar.d() + tVar.A();
            do {
                list.add(Integer.valueOf(tVar.m()));
            } while (tVar.d() < iD);
            T(iD);
            return;
        }
        com.google.protobuf.m0 m0Var = (com.google.protobuf.m0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                m0Var.c(tVar.m());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iD2 = tVar.d() + tVar.A();
        do {
            m0Var.c(tVar.m());
        } while (tVar.d() < iD2);
        T(iD2);
    }

    public void s0(int i) throws t1 {
        if (((com.google.android.gms.internal.measurement.w0) this.e).e() == i) {
            return;
        }
        androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public Object t(o1 o1Var, Class cls, androidx.datastore.preferences.protobuf.l lVar) throws com.google.protobuf.w0, androidx.datastore.preferences.protobuf.x {
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        switch (o1Var.ordinal()) {
            case 0:
                U(1);
                return Double.valueOf(w0Var.v());
            case 1:
                U(5);
                return Float.valueOf(w0Var.z());
            case 2:
                U(0);
                return Long.valueOf(w0Var.B());
            case 3:
                U(0);
                return Long.valueOf(w0Var.K());
            case 4:
                U(0);
                return Integer.valueOf(w0Var.A());
            case 5:
                U(1);
                return Long.valueOf(w0Var.y());
            case 6:
                U(5);
                return Integer.valueOf(w0Var.x());
            case 7:
                U(0);
                return Boolean.valueOf(w0Var.t());
            case 8:
                U(2);
                return w0Var.H();
            case 9:
            default:
                net.luminis.tls.engine.impl.c.o("unsupported field type.");
                return null;
            case 10:
                U(2);
                androidx.datastore.preferences.protobuf.u0 u0VarA = androidx.datastore.preferences.protobuf.r0.c.a(cls);
                androidx.datastore.preferences.protobuf.t tVarD = u0VarA.d();
                h(tVarD, u0VarA, lVar);
                u0VarA.b(tVarD);
                return tVarD;
            case 11:
                return l();
            case 12:
                U(0);
                return Integer.valueOf(w0Var.J());
            case 13:
                U(0);
                return Integer.valueOf(w0Var.w());
            case 14:
                U(5);
                return Integer.valueOf(w0Var.C());
            case 15:
                U(1);
                return Long.valueOf(w0Var.D());
            case 16:
                U(0);
                return Integer.valueOf(w0Var.E());
            case 17:
                U(0);
                return Long.valueOf(w0Var.F());
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                androidx.compose.ui.text.j0 j0Var = (androidx.compose.ui.text.j0) this.e;
                sb.append(com.google.android.gms.dynamite.g.s(j0Var, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(com.google.android.gms.dynamite.g.s(j0Var, i2));
                sb.append("), prevOffset=");
                return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.d, ')');
            case 1:
            default:
                return super.toString();
            case 2:
                return "";
        }
    }

    public Object u(t2 t2Var, Class cls, com.google.protobuf.a0 a0Var) throws com.google.protobuf.x0, androidx.datastore.preferences.protobuf.w {
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        switch (t2Var.ordinal()) {
            case 0:
                U(1);
                return Double.valueOf(tVar.l());
            case 1:
                U(5);
                return Float.valueOf(tVar.p());
            case 2:
                U(0);
                return Long.valueOf(tVar.r());
            case 3:
                U(0);
                return Long.valueOf(tVar.B());
            case 4:
                U(0);
                return Integer.valueOf(tVar.q());
            case 5:
                U(1);
                return Long.valueOf(tVar.o());
            case 6:
                U(5);
                return Integer.valueOf(tVar.n());
            case 7:
                U(0);
                return Boolean.valueOf(tVar.j());
            case 8:
                U(2);
                return tVar.y();
            case 9:
            default:
                net.luminis.tls.engine.impl.c.o("unsupported field type.");
                return null;
            case 10:
                U(2);
                a2 a2VarA = com.google.protobuf.t1.c.a(cls);
                GeneratedMessageLite generatedMessageLiteD = a2VarA.d();
                i(generatedMessageLiteD, a2VarA, a0Var);
                a2VarA.b(generatedMessageLiteD);
                return generatedMessageLiteD;
            case 11:
                return m();
            case 12:
                U(0);
                return Integer.valueOf(tVar.A());
            case 13:
                U(0);
                return Integer.valueOf(tVar.m());
            case 14:
                U(5);
                return Integer.valueOf(tVar.t());
            case 15:
                U(1);
                return Long.valueOf(tVar.u());
            case 16:
                U(0);
                return Integer.valueOf(tVar.v());
            case 17:
                U(0);
                return Long.valueOf(tVar.w());
        }
    }

    public void v(androidx.datastore.preferences.protobuf.u uVar) throws androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iJ = w0Var.J();
            if ((iJ & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.x("Failed to parse the message.");
            }
            int iK = w0Var.k() + iJ;
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.x()));
            } while (w0Var.k() < iK);
            return;
        }
        if (i != 5) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Integer.valueOf(w0Var.x()));
            if (w0Var.l()) {
                return;
            } else {
                I = w0Var.I();
            }
        } while (I == this.b);
        this.d = I;
    }

    public int v0() {
        int iL = this.d;
        if (iL != 0) {
            this.b = iL;
            this.d = 0;
        } else {
            iL = ((com.google.android.gms.internal.measurement.w0) this.e).l();
            this.b = iL;
        }
        if (iL == 0 || iL == this.c) {
            return Integer.MAX_VALUE;
        }
        return iL >>> 3;
    }

    public void w(List list) throws com.google.protobuf.x0 {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.m0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = tVar.A();
                W(iA);
                int iD = tVar.d() + iA;
                do {
                    list.add(Integer.valueOf(tVar.n()));
                } while (tVar.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw com.google.protobuf.x0.c();
            }
            do {
                list.add(Integer.valueOf(tVar.n()));
                if (tVar.e()) {
                    return;
                } else {
                    iZ = tVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        com.google.protobuf.m0 m0Var = (com.google.protobuf.m0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iA2 = tVar.A();
            W(iA2);
            int iD2 = tVar.d() + iA2;
            do {
                m0Var.c(tVar.n());
            } while (tVar.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw com.google.protobuf.x0.c();
        }
        do {
            m0Var.c(tVar.n());
            if (tVar.e()) {
                return;
            } else {
                iZ2 = tVar.z();
            }
        } while (iZ2 == this.b);
        this.d = iZ2;
    }

    public com.google.android.gms.internal.measurement.t0 w0() {
        o0(2);
        return ((com.google.android.gms.internal.measurement.w0) this.e).y();
    }

    public void x(androidx.datastore.preferences.protobuf.u uVar) throws androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.y()));
                if (w0Var.l()) {
                    return;
                } else {
                    I = w0Var.I();
                }
            } while (I == this.b);
            this.d = I;
            return;
        }
        if (i != 2) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        int iJ = w0Var.J();
        if ((iJ & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.x("Failed to parse the message.");
        }
        int iK = w0Var.k() + iJ;
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Long.valueOf(w0Var.y()));
        } while (w0Var.k() < iK);
    }

    public void x0(r1 r1Var) throws t1 {
        int iL;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                r1Var.add(Double.valueOf(w0Var.o()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            this.d = iL;
            return;
        }
        if (i != 2) {
            androidx.transition.k.p();
            return;
        }
        int iA = w0Var.A();
        u0(iA);
        int iE = w0Var.e() + iA;
        do {
            r1Var.add(Double.valueOf(w0Var.o()));
        } while (w0Var.e() < iE);
    }

    public void y(List list) throws com.google.protobuf.x0 {
        int iZ;
        int iZ2;
        com.google.protobuf.t tVar = (com.google.protobuf.t) this.e;
        boolean z = list instanceof com.google.protobuf.d1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(tVar.o()));
                    if (tVar.e()) {
                        return;
                    } else {
                        iZ = tVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (i2 != 2) {
                throw com.google.protobuf.x0.c();
            }
            int iA = tVar.A();
            X(iA);
            int iD = tVar.d() + iA;
            do {
                list.add(Long.valueOf(tVar.o()));
            } while (tVar.d() < iD);
            return;
        }
        com.google.protobuf.d1 d1Var = (com.google.protobuf.d1) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                d1Var.c(tVar.o());
                if (tVar.e()) {
                    return;
                } else {
                    iZ2 = tVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (i3 != 2) {
            throw com.google.protobuf.x0.c();
        }
        int iA2 = tVar.A();
        X(iA2);
        int iD2 = tVar.d() + iA2;
        do {
            d1Var.c(tVar.o());
        } while (tVar.d() < iD2);
    }

    public void y0(r1 r1Var) throws t1 {
        int iL;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iA = w0Var.A();
            t0(iA);
            int iE = w0Var.e() + iA;
            do {
                r1Var.add(Float.valueOf(w0Var.p()));
            } while (w0Var.e() < iE);
            return;
        }
        if (i != 5) {
            androidx.transition.k.p();
            return;
        }
        do {
            r1Var.add(Float.valueOf(w0Var.p()));
            if (w0Var.d()) {
                return;
            } else {
                iL = w0Var.l();
            }
        } while (iL == this.b);
        this.d = iL;
    }

    public void z(androidx.datastore.preferences.protobuf.u uVar) throws androidx.datastore.preferences.protobuf.x {
        int I;
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iJ = w0Var.J();
            if ((iJ & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.x("Failed to parse the message.");
            }
            int iK = w0Var.k() + iJ;
            do {
                ((androidx.datastore.preferences.protobuf.s0) uVar).add(Float.valueOf(w0Var.z()));
            } while (w0Var.k() < iK);
            return;
        }
        if (i != 5) {
            throw androidx.datastore.preferences.protobuf.x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) uVar).add(Float.valueOf(w0Var.z()));
            if (w0Var.l()) {
                return;
            } else {
                I = w0Var.I();
            }
        } while (I == this.b);
        this.d = I;
    }

    public void z0(r1 r1Var) throws t1 {
        int iL;
        int iL2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.e;
        boolean z = r1Var instanceof x1;
        int i = this.b;
        if (z) {
            x1 x1Var = (x1) r1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE = w0Var.e() + w0Var.A();
                do {
                    x1Var.e(w0Var.q());
                } while (w0Var.e() < iE);
                s0(iE);
                return;
            }
            do {
                x1Var.e(w0Var.q());
                if (w0Var.d()) {
                    return;
                } else {
                    iL2 = w0Var.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    androidx.transition.k.p();
                    return;
                }
                int iE2 = w0Var.e() + w0Var.A();
                do {
                    r1Var.add(Long.valueOf(w0Var.q()));
                } while (w0Var.e() < iE2);
                s0(iE2);
                return;
            }
            do {
                r1Var.add(Long.valueOf(w0Var.q()));
                if (w0Var.d()) {
                    return;
                } else {
                    iL = w0Var.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public w(com.google.android.gms.internal.measurement.w0 w0Var) {
        this.a = 5;
        this.d = 0;
        this.e = w0Var;
        w0Var.c = this;
    }

    public w(androidx.core.view.w0 w0Var) {
        this.a = 4;
        this.d = 0;
        Charset charset = androidx.datastore.preferences.protobuf.v.a;
        this.e = w0Var;
        w0Var.z = this;
    }

    public /* synthetic */ w() {
        this.a = 2;
    }

    public w(androidx.compose.runtime.changelist.l0 l0Var) {
        this.a = 1;
        this.e = l0Var;
    }

    public w(int i, int i2, int i3, androidx.compose.ui.text.j0 j0Var) {
        this.a = 0;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j0Var;
    }

    public w(int i, Class cls, int i2, int i3) {
        this.a = 3;
        this.b = i;
        this.e = cls;
        this.d = i2;
        this.c = i3;
    }
}
