package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BLACKLIST_FIELD_NUMBER = 7;
    public static final int CHUNK_FIELD_NUMBER = 5;
    public static final int CLOSE_FIELD_NUMBER = 3;
    public static final int CONNECT_FIELD_NUMBER = 4;
    private static final s4 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int PING_FIELD_NUMBER = 2;
    public static final int RECONNECT_FIELD_NUMBER = 6;
    private Object message_;
    private int messageCase_ = 0;
    private String id_ = "";

    static {
        s4 s4Var = new s4();
        DEFAULT_INSTANCE = s4Var;
        GeneratedMessageLite.registerDefaultInstance(s4.class, s4Var);
    }

    public static com.google.protobuf.r1 i() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final r2 b() {
        return this.messageCase_ == 7 ? (r2) this.message_ : r2.DEFAULT_INSTANCE;
    }

    public final z2 c() {
        return this.messageCase_ == 5 ? (z2) this.message_ : z2.DEFAULT_INSTANCE;
    }

    public final l3 d() {
        return this.messageCase_ == 3 ? (l3) this.message_ : l3.DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (i2.a[l0Var.ordinal()]) {
            case 1:
                return new s4();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"message_", "messageCase_", "id_", i4.class, l3.class, v3.class, z2.class, o4.class, r2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (s4.class) {
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

    public final v3 e() {
        return this.messageCase_ == 4 ? (v3) this.message_ : v3.DEFAULT_INSTANCE;
    }

    public final String f() {
        return this.id_;
    }

    public final int g() {
        int i = this.messageCase_;
        if (i == 0) {
            return 7;
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }

    public final o4 h() {
        return this.messageCase_ == 6 ? (o4) this.message_ : o4.DEFAULT_INSTANCE;
    }
}
