package com.appsalt.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final Object a;
    public final Object b;

    public i(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    public final boolean a(byte[] bArr) {
        ?? r0 = this.a;
        if (!r0.isEmpty()) {
            for (o oVar : r0) {
                if (oVar.a.a(bArr) <= 0 && oVar.b.a(bArr) >= 0) {
                    return true;
                }
            }
        }
        ?? r1 = this.b;
        if (r1.isEmpty()) {
            return false;
        }
        for (o oVar2 : r1) {
            if (oVar2.a.a(bArr) <= 0 && oVar2.b.a(bArr) >= 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IpConstraint(ipV4=" + this.a + ", ipV6=" + this.b + ')';
    }
}
