package org.msgpack.core;

import java.nio.charset.CodingErrorAction;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Cloneable {
    public int A;
    public int B;
    public CodingErrorAction e;
    public CodingErrorAction y;
    public int z;

    public final Object clone() {
        g gVar = new g();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        gVar.e = codingErrorAction;
        gVar.y = codingErrorAction;
        gVar.z = Integer.MAX_VALUE;
        gVar.A = 8192;
        gVar.B = 8192;
        gVar.e = this.e;
        gVar.y = this.y;
        gVar.z = this.z;
        gVar.A = this.A;
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.e == gVar.e && this.y == gVar.y && this.z == gVar.z && this.B == gVar.B && this.A == gVar.A;
    }

    public final int hashCode() {
        CodingErrorAction codingErrorAction = this.e;
        int iHashCode = (992 + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        CodingErrorAction codingErrorAction2 = this.y;
        return ((((((iHashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.z) * 31) + this.A) * 31) + this.B;
    }
}
