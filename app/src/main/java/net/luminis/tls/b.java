package net.luminis.tls;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    inappropriate_fallback(0),
    unexpected_message(10),
    /* JADX INFO: Fake field, exist only in values array */
    bad_record_mac(20),
    /* JADX INFO: Fake field, exist only in values array */
    user_canceled(22),
    handshake_failure(40),
    bad_certificate(42),
    /* JADX INFO: Fake field, exist only in values array */
    unsupported_certificate(43),
    /* JADX INFO: Fake field, exist only in values array */
    certificate_revoked(44),
    /* JADX INFO: Fake field, exist only in values array */
    certificate_expired(45),
    certificate_unknown(46),
    illegal_parameter(47),
    /* JADX INFO: Fake field, exist only in values array */
    unknown_ca(48),
    /* JADX INFO: Fake field, exist only in values array */
    access_denied(49),
    decode_error(50),
    decrypt_error(51),
    /* JADX INFO: Fake field, exist only in values array */
    user_canceled(70),
    /* JADX INFO: Fake field, exist only in values array */
    inappropriate_fallback(71),
    internal_error(80),
    /* JADX INFO: Fake field, exist only in values array */
    inappropriate_fallback(86),
    /* JADX INFO: Fake field, exist only in values array */
    user_canceled(90),
    missing_extension(Token.ASSIGN_SUB),
    unsupported_extension(110),
    /* JADX INFO: Fake field, exist only in values array */
    unrecognized_name(Token.ASSIGN_MOD),
    /* JADX INFO: Fake field, exist only in values array */
    bad_certificate_status_response(Token.ASSIGN_EXP),
    /* JADX INFO: Fake field, exist only in values array */
    unknown_psk_identity(Token.HOOK),
    /* JADX INFO: Fake field, exist only in values array */
    certificate_required(Token.COLON),
    /* JADX INFO: Fake field, exist only in values array */
    no_application_protocol(120);

    public final byte e;

    b(int i) {
        this.e = (byte) i;
    }
}
