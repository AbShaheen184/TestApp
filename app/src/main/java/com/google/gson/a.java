package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a d = new a("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new a("\n", "  ", true);
    }

    public a(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            net.luminis.tls.engine.impl.c.o("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            net.luminis.tls.engine.impl.c.o("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
