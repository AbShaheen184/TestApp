package net.luminis.quic.packet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final Long c;

    public f(f fVar, boolean z) {
        this.c = fVar.c;
        this.b = fVar.b;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(this.c.toString());
                sb.append(" (in ");
                int i = this.b;
                if (i == 1) {
                    str = "Initial";
                } else if (i != 2) {
                    str = i != 3 ? "null" : "App";
                } else {
                    str = "Handshake";
                }
                sb.append(str);
                sb.append(")");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f(Long l, int i) {
        this.c = l;
        this.b = i;
    }

    public f(int i, Long l) {
        this.b = i;
        this.c = l;
    }
}
