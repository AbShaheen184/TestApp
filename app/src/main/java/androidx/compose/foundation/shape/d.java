package androidx.compose.foundation.shape;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.unit.m;
import com.google.android.gms.dynamite.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n0 {
    public final a a;
    public final a b;
    public final a c;
    public final a d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public static d b(d dVar, a aVar, a aVar2, a aVar3, a aVar4, int i) {
        if ((i & 1) != 0) {
            aVar = dVar.a;
        }
        if ((i & 2) != 0) {
            aVar2 = dVar.b;
        }
        if ((i & 4) != 0) {
            aVar3 = dVar.c;
        }
        if ((i & 8) != 0) {
            aVar4 = dVar.d;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    @Override // androidx.compose.ui.graphics.n0
    public final a0 a(long j, m mVar, androidx.compose.ui.unit.c cVar) {
        float fA = this.a.a(j, cVar);
        float fA2 = this.b.a(j, cVar);
        float fA3 = this.c.a(j, cVar);
        float fA4 = this.d.a(j, cVar);
        float fC = androidx.compose.ui.geometry.e.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            androidx.compose.foundation.internal.b.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new h0(g.c(0L, j));
        }
        androidx.compose.ui.geometry.c cVarC = g.c(0L, j);
        m mVar2 = m.e;
        float f5 = mVar == mVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (mVar == mVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = mVar == mVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (mVar != mVar2) {
            fA4 = fA3;
        }
        return new i0(new androidx.compose.ui.geometry.d(cVarC.a, cVarC.b, cVarC.c, cVarC.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.a, dVar.a) && l.a(this.b, dVar.b) && l.a(this.c, dVar.c) && l.a(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
