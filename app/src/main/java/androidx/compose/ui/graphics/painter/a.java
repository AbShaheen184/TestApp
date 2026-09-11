package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.d;
import androidx.compose.ui.graphics.g;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.unit.j;
import kotlin.jvm.internal.l;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public final g C;
    public final long D;
    public int E = 1;
    public final long F;
    public float G;
    public m H;

    public a(g gVar, long j) {
        int i;
        int i2;
        this.C = gVar;
        this.D = j;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > gVar.a.getWidth() || i2 > gVar.a.getHeight()) {
            c.o("Failed requirement.");
            throw null;
        }
        this.F = j;
        this.G = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean d(float f) {
        this.G = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean e(m mVar) {
        this.H = mVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.C, aVar.C) && j.a(0L, 0L) && androidx.compose.ui.unit.l.a(this.D, aVar.D) && this.E == aVar.E;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        return coil3.network.g.x(this.F);
    }

    public final int hashCode() {
        return Integer.hashCode(this.E) + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(this.C.hashCode() * 31, 31, 0L), 31, this.D);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        int iRound = Math.round(Float.intBitsToFloat((int) (bVar.d() >> 32)));
        d.w(h0Var, this.C, this.D, (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32), this.G, this.H, this.E, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.C);
        sb.append(", srcOffset=");
        sb.append((Object) j.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) androidx.compose.ui.unit.l.b(this.D));
        sb.append(", filterQuality=");
        int i = this.E;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
