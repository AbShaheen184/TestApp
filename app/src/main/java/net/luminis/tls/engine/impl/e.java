package net.luminis.tls.engine.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final e D;
    public static final e E;
    public static final e F;
    public static final e G;
    public static final /* synthetic */ e[] H;
    public static final e e;
    public static final e y;
    public static final e z;

    static {
        e eVar = new e("client_hello", 0);
        e = eVar;
        e eVar2 = new e("server_hello", 1);
        y = eVar2;
        e eVar3 = new e("new_session_ticket", 2);
        e eVar4 = new e("end_of_early_data", 3);
        e eVar5 = new e("encrypted_extensions", 4);
        z = eVar5;
        e eVar6 = new e("certificate", 5);
        e eVar7 = new e("certificate_request", 6);
        A = eVar7;
        e eVar8 = new e("certificate_verify", 7);
        e eVar9 = new e("finished", 8);
        e eVar10 = new e("key_update", 9);
        e eVar11 = new e("server_certificate", 10);
        B = eVar11;
        e eVar12 = new e("server_certificate_verify", 11);
        C = eVar12;
        e eVar13 = new e("server_finished", 12);
        D = eVar13;
        e eVar14 = new e("client_certificate", 13);
        E = eVar14;
        e eVar15 = new e("client_certificate_verify", 14);
        F = eVar15;
        e eVar16 = new e("client_finished", 15);
        G = eVar16;
        H = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) H.clone();
    }
}
