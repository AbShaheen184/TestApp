package org.jsoup.parser;

import com.app.mlounge.emulator.LibretroCore;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Cloneable {
    public int A = 0;
    public final String e;
    public String y;
    public final String z;

    public f0(String str, String str2, String str3) {
        this.y = str;
        this.z = str2;
        this.e = str3;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f0 clone() {
        try {
            return (f0) super.clone();
        } catch (CloneNotSupportedException e) {
            net.luminis.tls.engine.impl.c.k(e);
            return null;
        }
    }

    public final boolean b(int i) {
        return (i & this.A) != 0;
    }

    public final boolean c() {
        return (this.A & 2) != 0;
    }

    public final boolean d() {
        int i = this.A;
        return ((i & 16) == 0 && (i & 2) == 0) ? false : true;
    }

    public final void e(int i) {
        this.A = i | this.A | 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Objects.equals(this.y, f0Var.y) && Objects.equals(this.e, f0Var.e) && Objects.equals(this.z, f0Var.z) && this.A == f0Var.A;
    }

    public final l3 f() {
        if (b(128)) {
            return l3.z;
        }
        if (b(LibretroCore.SCREEN_WIDTH)) {
            return l3.B;
        }
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.y, this.e);
    }

    public final String toString() {
        return this.y;
    }
}
