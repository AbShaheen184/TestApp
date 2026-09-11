package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h5 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BLACKLIST_FIELD_NUMBER = 7;
    private static final h5 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int PING_FIELD_NUMBER = 2;
    public static final int RECONNECT_FIELD_NUMBER = 6;
    private Object message_;
    private int messageCase_ = 0;
    private String id_ = "";

    static {
        h5 h5Var = new h5();
        DEFAULT_INSTANCE = h5Var;
        GeneratedMessageLite.registerDefaultInstance(h5.class, h5Var);
    }

    public static com.google.protobuf.r1 f() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final a4 b() {
        return this.messageCase_ == 7 ? (a4) this.message_ : a4.DEFAULT_INSTANCE;
    }

    public final String c() {
        return this.id_;
    }

    public final int d() {
        int i = this.messageCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 6) {
            return i != 7 ? 0 : 3;
        }
        return 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (u3.a[l0Var.ordinal()]) {
            case 1:
                return new h5();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"message_", "messageCase_", "id_", t4.class, c5.class, a4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (h5.class) {
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

    public final c5 e() {
        return this.messageCase_ == 6 ? (c5) this.message_ : c5.DEFAULT_INSTANCE;
    }
}
