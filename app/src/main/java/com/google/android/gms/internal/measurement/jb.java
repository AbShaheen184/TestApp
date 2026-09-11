package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class jb implements Comparable {
    public final long A;
    public final Object B;
    public final RuntimeException C;
    public final long e;
    public final String y;
    public final int z;

    public jb(long j, String str, int i, long j2, Object obj) {
        com.google.android.material.motion.a.f(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.e = j;
        this.y = str;
        this.z = i;
        this.A = j2;
        this.B = obj;
        if (i != 5) {
            this.C = null;
            return;
        }
        if (obj == null) {
            this.C = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof t0)) {
            this.C = null;
        } else {
            this.C = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i = this.z;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.A;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.B;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            net.luminis.tls.engine.impl.c.m("Impossible, this was validated when parsed or created");
            return null;
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((t0) obj).l();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.C;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jb jbVar = (jb) obj;
        long j = jbVar.e;
        long j2 = this.e;
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.y;
        str.getClass();
        String str2 = jbVar.y;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb)) {
            return false;
        }
        jb jbVar = (jb) obj;
        return this.e == jbVar.e && Objects.equals(this.y, jbVar.y);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.e), this.y);
    }

    public final String toString() {
        String string = this.y;
        if (string == null) {
            string = Long.toString(this.e);
        }
        String strValueOf = String.valueOf(a());
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }
}
