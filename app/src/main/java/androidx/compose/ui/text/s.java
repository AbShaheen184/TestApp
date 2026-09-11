package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements b {
    public final int a;
    public final int b;
    public final long c;
    public final androidx.compose.ui.text.style.q d;
    public final u e;
    public final androidx.compose.ui.text.style.i f;
    public final int g;
    public final int h;
    public final androidx.compose.ui.text.style.s i;

    public s(int i, int i2, long j, androidx.compose.ui.text.style.q qVar, u uVar, androidx.compose.ui.text.style.i iVar, int i3, int i4, androidx.compose.ui.text.style.s sVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = qVar;
        this.e = uVar;
        this.f = iVar;
        this.g = i3;
        this.h = i4;
        this.i = sVar;
        if (androidx.compose.ui.unit.o.a(j, androidx.compose.ui.unit.o.c) || androidx.compose.ui.unit.o.c(j) >= 0.0f) {
            return;
        }
        androidx.compose.ui.text.internal.a.b("lineHeight can't be negative (" + androidx.compose.ui.unit.o.c(j) + ')');
    }

    public final s a(s sVar) {
        return sVar == null ? this : t.a(this, sVar.a, sVar.b, sVar.c, sVar.d, sVar.e, sVar.f, sVar.g, sVar.h, sVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.b == sVar.b && androidx.compose.ui.unit.o.a(this.c, sVar.c) && kotlin.jvm.internal.l.a(this.d, sVar.d) && kotlin.jvm.internal.l.a(this.e, sVar.e) && kotlin.jvm.internal.l.a(this.f, sVar.f) && this.g == sVar.g && this.h == sVar.h && kotlin.jvm.internal.l.a(this.i, sVar.i);
    }

    public final int hashCode() {
        int iB = androidx.privacysandbox.ads.adservices.java.internal.a.b(this.b, Integer.hashCode(this.a) * 31, 31);
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        int iC = androidx.privacysandbox.ads.adservices.java.internal.a.c(iB, 31, this.c);
        androidx.compose.ui.text.style.q qVar = this.d;
        int iHashCode = (iC + (qVar != null ? qVar.hashCode() : 0)) * 31;
        u uVar = this.e;
        int iHashCode2 = (iHashCode + (uVar != null ? uVar.hashCode() : 0)) * 31;
        androidx.compose.ui.text.style.i iVar = this.f;
        int iB2 = androidx.privacysandbox.ads.adservices.java.internal.a.b(this.h, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        androidx.compose.ui.text.style.s sVar = this.i;
        return iB2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) androidx.compose.ui.text.style.k.a(this.a)) + ", textDirection=" + ((Object) androidx.compose.ui.text.style.m.a(this.b)) + ", lineHeight=" + ((Object) androidx.compose.ui.unit.o.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) androidx.compose.ui.text.style.e.a(this.g)) + ", hyphens=" + ((Object) androidx.compose.ui.text.style.d.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
