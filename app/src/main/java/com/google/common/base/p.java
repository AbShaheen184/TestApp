package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends h {
    public final Object e;

    public p(Object obj) {
        this.e = obj;
    }

    @Override // com.google.common.base.h
    public final Object a() {
        return this.e;
    }

    @Override // com.google.common.base.h
    public final boolean b() {
        return true;
    }

    @Override // com.google.common.base.h
    public final Object c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.e.equals(((p) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.e + ")";
    }
}
