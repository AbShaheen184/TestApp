package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum k extends o {
    public k() {
        super("ALWAYS_TRUE", 0);
    }

    @Override // com.google.common.base.j
    /* JADX INFO: renamed from: apply */
    public final boolean mo13apply(Object obj) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Predicates.alwaysTrue()";
    }
}
