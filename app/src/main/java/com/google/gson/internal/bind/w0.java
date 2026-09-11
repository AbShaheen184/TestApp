package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class w0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        boolean zD0;
        BitSet bitSet = new BitSet();
        aVar.a();
        int iN0 = aVar.n0();
        int i = 0;
        while (iN0 != 2) {
            int iE = androidx.constraintlayout.core.g.e(iN0);
            if (iE == 5 || iE == 6) {
                int iF0 = aVar.f0();
                if (iF0 == 0) {
                    zD0 = false;
                } else {
                    if (iF0 != 1) {
                        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Invalid bitset value ", iF0, ", expected 0 or 1; at path ");
                        sbV.append(aVar.Z());
                        throw new com.google.gson.i(sbV.toString(), 8);
                    }
                    zD0 = true;
                }
            } else {
                if (iE != 7) {
                    throw new com.google.gson.i("Invalid bitset value type: " + com.google.android.datatransport.runtime.backends.c.x(iN0) + "; at path " + aVar.X(), 8);
                }
                zD0 = aVar.d0();
            }
            if (zD0) {
                bitSet.set(i);
            }
            i++;
            iN0 = aVar.n0();
        }
        aVar.z();
        return bitSet;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        bVar.g();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            bVar.e0(bitSet.get(i) ? 1L : 0L);
        }
        bVar.z();
    }
}
