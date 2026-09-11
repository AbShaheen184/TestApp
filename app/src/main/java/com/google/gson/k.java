package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {
    public final com.google.gson.internal.n e = new com.google.gson.internal.n(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof k) && ((k) obj).e.equals(this.e);
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final void i(String str, h hVar) {
        if (hVar == null) {
            hVar = j.e;
        }
        this.e.put(str, hVar);
    }

    public final void j(String str, Boolean bool) {
        i(str, new l(bool));
    }

    public final void k(String str, String str2) {
        i(str, str2 == null ? j.e : new l(str2));
    }

    public final h l(String str) {
        return (h) this.e.get(str);
    }

    public final g n(String str) {
        return (g) this.e.get(str);
    }

    public final k o(String str) {
        return (k) this.e.get(str);
    }
}
