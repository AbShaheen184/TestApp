package androidx.compose.ui.text.input;

import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.media3.extractor.mp4.c {
    public int A;
    public int B;
    public Object C;
    public final /* synthetic */ int e = 1;
    public int y;
    public int z;

    public h(androidx.compose.ui.text.g gVar, long j) {
        String str = gVar.y;
        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(1, (byte) 0);
        eVar.d = str;
        eVar.b = -1;
        eVar.c = -1;
        this.C = eVar;
        this.y = l0.f(j);
        this.z = l0.e(j);
        this.A = -1;
        this.B = -1;
        int iF = l0.f(j);
        int iE = l0.e(j);
        if (iF < 0 || iF > str.length()) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("start (", iF, ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("end (", iE, ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Do not set reversed range: ", iF, " > ", iE));
        throw null;
    }

    public void a(int i, int i2) {
        long jB = androidx.compose.ui.text.d0.b(i, i2);
        ((androidx.compose.ui.text.android.selection.e) this.C).O(i, i2, "");
        long jB2 = coil3.network.g.B(androidx.compose.ui.text.d0.b(this.y, this.z), jB);
        j(l0.f(jB2));
        i(l0.e(jB2));
        int i3 = this.A;
        if (i3 != -1) {
            long jB3 = coil3.network.g.B(androidx.compose.ui.text.d0.b(i3, this.B), jB);
            if (l0.c(jB3)) {
                this.A = -1;
                this.B = -1;
            } else {
                this.A = l0.f(jB3);
                this.B = l0.e(jB3);
            }
        }
    }

    public char b(int i) {
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) this.C;
        androidx.compose.foundation.text.selection.w wVar = (androidx.compose.foundation.text.selection.w) eVar.e;
        if (wVar == null) {
            return ((String) eVar.d).charAt(i);
        }
        if (i < eVar.b) {
            return ((String) eVar.d).charAt(i);
        }
        int iB = wVar.b - wVar.b();
        int i2 = eVar.b;
        if (i >= iB + i2) {
            return ((String) eVar.d).charAt(i - ((iB - eVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = wVar.c;
        char[] cArr = (char[]) wVar.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + wVar.d];
    }

    public l0 c() {
        int i = this.A;
        if (i != -1) {
            return new l0(androidx.compose.ui.text.d0.b(i, this.B));
        }
        return null;
    }

    public long d() {
        int i = this.A;
        if (i == 0) {
            org.mozilla.javascript.typedarrays.c.a();
            return 0L;
        }
        long[] jArr = (long[]) this.C;
        int i2 = this.y;
        long j = jArr[i2];
        this.y = this.B & (i2 + 1);
        this.A = i - 1;
        return j;
    }

    public void e(int i, int i2, String str) {
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) this.C;
        if (i < 0 || i > eVar.s()) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("start (", i, ") offset is outside of text region "), eVar.s());
            return;
        }
        if (i2 < 0 || i2 > eVar.s()) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("end (", i2, ") offset is outside of text region "), eVar.s());
            return;
        }
        if (i > i2) {
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Do not set reversed range: ", i, " > ", i2));
            return;
        }
        eVar.O(i, i2, str);
        j(str.length() + i);
        i(str.length() + i);
        this.A = -1;
        this.B = -1;
    }

    public void f(int i, int i2) {
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) this.C;
        if (i < 0 || i > eVar.s()) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("start (", i, ") offset is outside of text region "), eVar.s());
            return;
        }
        if (i2 < 0 || i2 > eVar.s()) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("end (", i2, ") offset is outside of text region "), eVar.s());
        } else if (i >= i2) {
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Do not set reversed or empty range: ", i, " > ", i2));
        } else {
            this.A = i;
            this.B = i2;
        }
    }

    public void g(int i, int i2) {
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) this.C;
        if (i < 0 || i > eVar.s()) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("start (", i, ") offset is outside of text region "), eVar.s());
            return;
        }
        if (i2 < 0 || i2 > eVar.s()) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("end (", i2, ") offset is outside of text region "), eVar.s());
        } else if (i > i2) {
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Do not set reversed range: ", i, " > ", i2));
        } else {
            j(i);
            i(i2);
        }
    }

    @Override // androidx.media3.extractor.mp4.c
    public int h() {
        return -1;
    }

    public void i(int i) {
        if (!(i >= 0)) {
            androidx.compose.ui.text.internal.a.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.z = i;
    }

    public void j(int i) {
        if (!(i >= 0)) {
            androidx.compose.ui.text.internal.a.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.y = i;
    }

    @Override // androidx.media3.extractor.mp4.c
    public int r() {
        return this.y;
    }

    @Override // androidx.media3.extractor.mp4.c
    public int s() {
        androidx.media3.common.util.w wVar = (androidx.media3.common.util.w) this.C;
        int i = this.z;
        if (i == 8) {
            return wVar.z();
        }
        if (i == 16) {
            return wVar.G();
        }
        int i2 = this.A;
        this.A = i2 + 1;
        if (i2 % 2 != 0) {
            return this.B & 15;
        }
        int iZ = wVar.z();
        this.B = iZ;
        return (iZ & 240) >> 4;
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return ((androidx.compose.ui.text.android.selection.e) this.C).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h() {
    }

    public h(androidx.media3.container.e eVar) {
        androidx.media3.common.util.w wVar = eVar.z;
        this.C = wVar;
        wVar.M(12);
        this.z = wVar.D() & 255;
        this.y = wVar.D();
    }
}
