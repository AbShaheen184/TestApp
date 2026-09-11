package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public static final l0 A;
    public static final l0 B;
    public static final l0 C;
    public static final l0 D;
    public static final /* synthetic */ l0[] E;
    public static final l0 e;
    public static final l0 y;
    public static final l0 z;

    static {
        l0 l0Var = new l0("GET_MEMOIZED_IS_INITIALIZED", 0);
        e = l0Var;
        l0 l0Var2 = new l0("SET_MEMOIZED_IS_INITIALIZED", 1);
        y = l0Var2;
        l0 l0Var3 = new l0("BUILD_MESSAGE_INFO", 2);
        z = l0Var3;
        l0 l0Var4 = new l0("NEW_MUTABLE_INSTANCE", 3);
        A = l0Var4;
        l0 l0Var5 = new l0("NEW_BUILDER", 4);
        B = l0Var5;
        l0 l0Var6 = new l0("GET_DEFAULT_INSTANCE", 5);
        C = l0Var6;
        l0 l0Var7 = new l0("GET_PARSER", 6);
        D = l0Var7;
        E = new l0[]{l0Var, l0Var2, l0Var3, l0Var4, l0Var5, l0Var6, l0Var7};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) E.clone();
    }
}
