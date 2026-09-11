package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CHUNK_FIELD_NUMBER = 6;
    public static final int CLOSE_FIELD_NUMBER = 4;
    public static final int CONNECTED_FIELD_NUMBER = 5;
    private static final b5 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    public static final int PONG_FIELD_NUMBER = 3;
    private Object message_;
    private int messageCase_ = 0;
    private String id_ = "";

    static {
        b5 b5Var = new b5();
        DEFAULT_INSTANCE = b5Var;
        GeneratedMessageLite.registerDefaultInstance(b5.class, b5Var);
    }

    public static a1 e() {
        return (a1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (v0.a[l0Var.ordinal()]) {
            case 1:
                return new b5();
            case 2:
                return new a1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"message_", "messageCase_", "id_", o3.class, x3.class, r1.class, e2.class, h1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (b5.class) {
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
