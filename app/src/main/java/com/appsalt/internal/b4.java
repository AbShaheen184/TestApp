package com.appsalt.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final b4 DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int TO_FIELD_NUMBER = 2;
    private ByteString from_;
    private ByteString to_;

    static {
        b4 b4Var = new b4();
        DEFAULT_INSTANCE = b4Var;
        GeneratedMessageLite.registerDefaultInstance(b4.class, b4Var);
    }

    public b4() {
        ByteString byteString = ByteString.EMPTY;
        this.from_ = byteString;
        this.to_ = byteString;
    }

    public final ByteString b() {
        return this.from_;
    }

    public final ByteString c() {
        return this.to_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (i2.a[l0Var.ordinal()]) {
            case 1:
                return new b4();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"from_", "to_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (b4.class) {
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
