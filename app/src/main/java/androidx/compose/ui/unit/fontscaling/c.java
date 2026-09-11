package androidx.compose.ui.unit.fontscaling;

import com.google.android.gms.common.internal.k;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    public final float[] a;
    public final float[] b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            net.luminis.tls.engine.impl.c.o("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // androidx.compose.ui.unit.fontscaling.a
    public final float a(float f) {
        return k.s(f, this.b, this.a);
    }

    @Override // androidx.compose.ui.unit.fontscaling.a
    public final float b(float f) {
        return k.s(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.a, cVar.a) && Arrays.equals(this.b, cVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
