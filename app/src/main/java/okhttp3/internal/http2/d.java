package okhttp3.internal.http2;

import com.google.android.gms.measurement.internal.e0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final okio.i d;
    public static final okio.i e;
    public static final okio.i f;
    public static final okio.i g;
    public static final okio.i h;
    public static final okio.i i;
    public final okio.i a;
    public final okio.i b;
    public final int c;

    static {
        okio.i iVar = okio.i.A;
        d = e0.h(":");
        e = e0.h(":status");
        f = e0.h(":method");
        g = e0.h(":path");
        h = e0.h(":scheme");
        i = e0.h(":authority");
    }

    public d(okio.i iVar, okio.i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        this.a = iVar;
        this.b = iVar2;
        this.c = iVar2.f() + iVar.f() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.a, dVar.a) && kotlin.jvm.internal.l.a(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.u() + ": " + this.b.u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(e0.h(str), e0.h(str2));
        okio.i iVar = okio.i.A;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(okio.i iVar, String str) {
        this(iVar, e0.h(str));
        iVar.getClass();
        str.getClass();
        okio.i iVar2 = okio.i.A;
    }
}
