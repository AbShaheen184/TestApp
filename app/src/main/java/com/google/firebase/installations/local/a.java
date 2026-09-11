package com.google.firebase.installations.local;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public String a;
    public int b;
    public String c;
    public String d;
    public Long e;
    public Long f;
    public String g;

    public final b a() {
        String strConcat = this.b == 0 ? " registrationStatus" : "";
        if (this.e == null) {
            strConcat = strConcat.concat(" expiresInSecs");
        }
        if (this.f == null) {
            strConcat = strConcat.concat(" tokenCreationEpochInSecs");
        }
        if (strConcat.isEmpty()) {
            return new b(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
        }
        net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(strConcat));
        return null;
    }
}
