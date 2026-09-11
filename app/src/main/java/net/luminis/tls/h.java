package net.luminis.tls;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum h {
    /* JADX INFO: Fake field, exist only in values array */
    rsa_pkcs1_sha256(1025),
    /* JADX INFO: Fake field, exist only in values array */
    rsa_pkcs1_sha384(1281),
    /* JADX INFO: Fake field, exist only in values array */
    rsa_pkcs1_sha512(1537),
    ecdsa_secp256r1_sha256(1027),
    ecdsa_secp384r1_sha384(1283),
    ecdsa_secp521r1_sha512(1539),
    rsa_pss_rsae_sha256(2052),
    rsa_pss_rsae_sha384(2053),
    rsa_pss_rsae_sha512(2054),
    /* JADX INFO: Fake field, exist only in values array */
    ed25519(2055),
    /* JADX INFO: Fake field, exist only in values array */
    ed448(2056),
    /* JADX INFO: Fake field, exist only in values array */
    rsa_pss_pss_sha256(2057),
    /* JADX INFO: Fake field, exist only in values array */
    rsa_pss_pss_sha384(2058),
    /* JADX INFO: Fake field, exist only in values array */
    rsa_pss_pss_sha512(2059),
    /* JADX INFO: Fake field, exist only in values array */
    rsa_pkcs1_sha1(513),
    /* JADX INFO: Fake field, exist only in values array */
    ecdsa_sha1(515);

    public final short e;

    h(int i) {
        this.e = (short) i;
    }
}
