package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 implements Cloneable {
    public final i1 e;
    public i1 y;

    public g1(i1 i1Var) {
        this.e = i1Var;
        if (i1Var.g()) {
            net.luminis.tls.engine.impl.c.o("Default instance must be immutable.");
            throw null;
        }
        this.y = i1Var.i();
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.y.g()) {
            return;
        }
        i1 i1VarI = this.e.i();
        j2.c.a(i1VarI.getClass()).c(i1VarI, this.y);
        this.y = i1VarI;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g1 clone() {
        g1 g1Var = (g1) this.e.t(5);
        boolean zG = this.y.g();
        i1 i1Var = this.y;
        if (zG) {
            i1Var.j();
            i1Var = this.y;
        }
        g1Var.y = i1Var;
        return g1Var;
    }

    public final i1 d() {
        boolean zG = this.y.g();
        i1 i1Var = this.y;
        if (zG) {
            i1Var.j();
            i1Var = this.y;
        }
        i1Var.getClass();
        if (i1.r(i1Var, true)) {
            return i1Var;
        }
        throw new q2();
    }

    public final void e(i1 i1Var) {
        i1 i1Var2 = this.e;
        if (i1Var2.equals(i1Var)) {
            return;
        }
        if (!this.y.g()) {
            i1 i1VarI = i1Var2.i();
            j2.c.a(i1VarI.getClass()).c(i1VarI, this.y);
            this.y = i1VarI;
        }
        i1 i1Var3 = this.y;
        j2.c.a(i1Var3.getClass()).c(i1Var3, i1Var);
    }

    public final void f(byte[] bArr, int i, a1 a1Var) throws t1 {
        if (!this.y.g()) {
            i1 i1VarI = this.e.i();
            j2.c.a(i1VarI.getClass()).c(i1VarI, this.y);
            this.y = i1VarI;
        }
        try {
            j2.c.a(this.y.getClass()).h(this.y, bArr, 0, i, new p0(a1Var));
        } catch (t1 e) {
            throw e;
        } catch (IOException e2) {
            androidx.media3.exoplayer.hls.playlist.a.j("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            androidx.transition.k.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
