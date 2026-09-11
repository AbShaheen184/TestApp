package kotlinx.serialization.json.internal;

import com.google.android.gms.measurement.internal.c0;
import kotlin.r;
import kotlin.t;
import kotlin.w;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.google.android.material.shape.k {
    public final androidx.fragment.app.h b;
    public final c0 c;

    public f(androidx.fragment.app.h hVar, kotlinx.serialization.json.b bVar) {
        bVar.getClass();
        this.b = hVar;
        this.c = bVar.b;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final int j() {
        androidx.fragment.app.h hVar = this.b;
        String strM = hVar.m();
        try {
            strM.getClass();
            r rVarW = com.google.android.material.textfield.p.w(strM);
            if (rVarW != null) {
                return rVarW.e;
            }
            kotlin.text.r.J(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Failed to parse type 'UInt' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a
    public final c0 l() {
        return this.c;
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final long o() {
        androidx.fragment.app.h hVar = this.b;
        String strM = hVar.m();
        try {
            strM.getClass();
            t tVarX = com.google.android.material.textfield.p.x(strM);
            if (tVarX != null) {
                return tVarX.e;
            }
            kotlin.text.r.J(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Failed to parse type 'ULong' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a
    public final int s(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final byte y() {
        kotlin.p pVar;
        androidx.fragment.app.h hVar = this.b;
        String strM = hVar.m();
        try {
            strM.getClass();
            r rVarW = com.google.android.material.textfield.p.w(strM);
            if (rVarW != null) {
                int i = rVarW.e;
                pVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new kotlin.p((byte) i);
            }
            if (pVar != null) {
                return pVar.e;
            }
            kotlin.text.r.J(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Failed to parse type 'UByte' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // com.google.android.material.shape.k, kotlinx.serialization.encoding.b
    public final short z() {
        w wVar;
        androidx.fragment.app.h hVar = this.b;
        String strM = hVar.m();
        try {
            strM.getClass();
            r rVarW = com.google.android.material.textfield.p.w(strM);
            if (rVarW != null) {
                int i = rVarW.e;
                wVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new w((short) i);
            }
            if (wVar != null) {
                return wVar.e;
            }
            kotlin.text.r.J(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.k('\'', "Failed to parse type 'UShort' for input '", strM), 0, null, 6);
            throw null;
        }
    }
}
