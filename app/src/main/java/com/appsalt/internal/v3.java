package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final v3 DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 2;
    public static final int IP_VERSION_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int PORT_FIELD_NUMBER = 3;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    public static final int PROXY_ID_FIELD_NUMBER = 4;
    private int ipVersion_;
    private int port_;
    private int protocol_;
    private String host_ = "";
    private String proxyId_ = "";

    static {
        v3 v3Var = new v3();
        DEFAULT_INSTANCE = v3Var;
        GeneratedMessageLite.registerDefaultInstance(v3.class, v3Var);
    }

    public final String c() {
        return this.host_;
    }

    public final int d() {
        int i = this.ipVersion_;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 3;
            } else {
                i2 = 2;
            }
        }
        if (i2 == 0) {
            return 4;
        }
        return i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (i2.a[l0Var.ordinal()]) {
            case 1:
                return new v3();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u000b\u0004Ȉ\u0005\f", new Object[]{"protocol_", "host_", "port_", "proxyId_", "ipVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (v3.class) {
                    try {
                        i0Var = PARSER;
                        if (i0Var == null) {
                            i0Var = new com.google.protobuf.i0(DEFAULT_INSTANCE);
                            PARSER = i0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return i0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                androidx.transition.k.n();
                return null;
        }
    }

    public final int e() {
        return this.port_;
    }

    public final int f() {
        int i = this.protocol_;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 3;
            } else {
                i2 = 2;
            }
        }
        if (i2 == 0) {
            return 4;
        }
        return i2;
    }

    public final String g() {
        return this.proxyId_;
    }
}
