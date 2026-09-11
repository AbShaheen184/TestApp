package net.luminis.tls.alert;

import net.luminis.tls.b;
import net.luminis.tls.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public final b e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, int i) {
        this(str, b.bad_certificate);
        switch (i) {
            case 2:
                this(str, b.decode_error);
                break;
            case 3:
                this(str, b.decrypt_error);
                break;
            case 4:
                this(str, b.handshake_failure);
                break;
            case 5:
                this(str, b.illegal_parameter);
                break;
            case 6:
                this(str, b.internal_error);
                break;
            case 7:
            default:
                break;
            case 8:
                this(str, b.unexpected_message);
                break;
            case 9:
                this(str, b.unsupported_extension);
                break;
        }
    }

    public a(String str, b bVar) {
        super(str);
        this.e = bVar;
    }

    public a() {
        this("missing extension", b.missing_extension);
    }
}
