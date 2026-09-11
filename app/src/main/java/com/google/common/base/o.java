package com.google.common.base;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements j {
    public static final k e;
    public static final /* synthetic */ o[] y;

    static {
        k kVar = new k();
        e = kVar;
        y = new o[]{kVar, new o() { // from class: com.google.common.base.l
            @Override // com.google.common.base.j
            /* JADX INFO: renamed from: apply */
            public final boolean mo13apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new o() { // from class: com.google.common.base.m
            @Override // com.google.common.base.j
            /* JADX INFO: renamed from: apply */
            public final boolean mo13apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new o() { // from class: com.google.common.base.n
            @Override // com.google.common.base.j
            /* JADX INFO: renamed from: apply */
            public final boolean mo13apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) y.clone();
    }
}
