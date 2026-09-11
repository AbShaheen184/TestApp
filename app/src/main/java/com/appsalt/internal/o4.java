package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final o4 DEFAULT_INSTANCE;
    public static final int FIRST_HOST_GROUP_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int SECOND_HOST_GROUP_FIELD_NUMBER = 2;
    private com.google.protobuf.t0 firstHostGroup_ = GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.t0 secondHostGroup_ = GeneratedMessageLite.emptyProtobufList();

    static {
        o4 o4Var = new o4();
        DEFAULT_INSTANCE = o4Var;
        GeneratedMessageLite.registerDefaultInstance(o4.class, o4Var);
    }

    public final com.google.protobuf.t0 c() {
        return this.firstHostGroup_;
    }

    public final com.google.protobuf.t0 d() {
        return this.secondHostGroup_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (i2.a[l0Var.ordinal()]) {
            case 1:
                return new o4();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"firstHostGroup_", "secondHostGroup_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (o4.class) {
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
