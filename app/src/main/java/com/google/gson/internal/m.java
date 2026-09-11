package com.google.gson.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Map.Entry {
    public m A;
    public m B;
    public final Object C;
    public final boolean D;
    public Object E;
    public int F;
    public m e;
    public m y;
    public m z;

    public m(boolean z, m mVar, Object obj, m mVar2, m mVar3) {
        this.e = mVar;
        this.C = obj;
        this.D = z;
        this.F = 1;
        this.A = mVar2;
        this.B = mVar3;
        mVar3.A = this;
        mVar2.B = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.C;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.E;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.C;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.E;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.C;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.E;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.D) {
            com.google.gson.b.h("value == null");
            return null;
        }
        Object obj2 = this.E;
        this.E = obj;
        return obj2;
    }

    public final String toString() {
        return this.C + "=" + this.E;
    }

    public m(boolean z) {
        this.C = null;
        this.D = z;
        this.B = this;
        this.A = this;
    }
}
