package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CONNECTION_INFO_FIELD_NUMBER = 6;
    private static final w2 DEFAULT_INSTANCE;
    public static final int IP_VERSION_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int RECONNECT_FIELD_NUMBER = 5;
    public static final int TARGET_BLACKLIST_FIELD_NUMBER = 2;
    public static final int TCP_FIELD_NUMBER = 3;
    public static final int UDP_FIELD_NUMBER = 4;
    private boolean connectionInfo_;
    private boolean ipVersion_;
    private boolean reconnect_;
    private boolean targetBlacklist_;
    private boolean tcp_;
    private boolean udp_;

    static {
        w2 w2Var = new w2();
        DEFAULT_INSTANCE = w2Var;
        GeneratedMessageLite.registerDefaultInstance(w2.class, w2Var);
    }

    public static u2 h() {
        return (u2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (v0.a[l0Var.ordinal()]) {
            case 1:
                return new w2();
            case 2:
                return new u2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"ipVersion_", "targetBlacklist_", "tcp_", "udp_", "reconnect_", "connectionInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (w2.class) {
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
}
