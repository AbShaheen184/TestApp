package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final o0 Companion = new o0();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ p0(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            kotlinx.serialization.internal.m0.e(i, 15, n0.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.l.a(this.a, p0Var.a) && kotlin.jvm.internal.l.a(this.b, p0Var.b) && this.c == p0Var.c && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public p0(String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
