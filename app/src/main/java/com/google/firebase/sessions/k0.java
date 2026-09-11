package com.google.firebase.sessions;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public static final j0 Companion = new j0();
    public static final kotlinx.serialization.a[] d;
    public final p0 a;
    public final i1 b;
    public final Map c;

    static {
        kotlinx.serialization.internal.y0 y0Var = kotlinx.serialization.internal.y0.a;
        d = new kotlinx.serialization.a[]{null, null, new kotlinx.serialization.internal.d0(b0.a)};
    }

    public /* synthetic */ k0(int i, p0 p0Var, i1 i1Var, Map map) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.m0.e(i, 1, i0.a.d());
            throw null;
        }
        this.a = p0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = i1Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static k0 a(k0 k0Var, p0 p0Var, i1 i1Var, Map map, int i) {
        if ((i & 1) != 0) {
            p0Var = k0Var.a;
        }
        if ((i & 2) != 0) {
            i1Var = k0Var.b;
        }
        if ((i & 4) != 0) {
            map = k0Var.c;
        }
        k0Var.getClass();
        p0Var.getClass();
        return new k0(p0Var, i1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.l.a(this.a, k0Var.a) && kotlin.jvm.internal.l.a(this.b, k0Var.b) && kotlin.jvm.internal.l.a(this.c, k0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        i1 i1Var = this.b;
        int iHashCode2 = (iHashCode + (i1Var == null ? 0 : Long.hashCode(i1Var.a))) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public k0(p0 p0Var, i1 i1Var, Map map) {
        p0Var.getClass();
        this.a = p0Var;
        this.b = i1Var;
        this.c = map;
    }
}
