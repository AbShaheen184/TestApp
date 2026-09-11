package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final a4 DEFAULT_INSTANCE;
    public static final int IPV4_RANGE_FIELD_NUMBER = 1;
    public static final int IPV6_RANGE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.r1 PARSER;
    private com.google.protobuf.t0 ipv4Range_ = GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.t0 ipv6Range_ = GeneratedMessageLite.emptyProtobufList();

    static {
        a4 a4Var = new a4();
        DEFAULT_INSTANCE = a4Var;
        GeneratedMessageLite.registerDefaultInstance(a4.class, a4Var);
    }

    public final com.google.protobuf.t0 c() {
        return this.ipv4Range_;
    }

    public final com.google.protobuf.t0 d() {
        return this.ipv6Range_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (u3.a[l0Var.ordinal()]) {
            case 1:
                return new a4();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"ipv4Range_", k4.class, "ipv6Range_", k4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (a4.class) {
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
