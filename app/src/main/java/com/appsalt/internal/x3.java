package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BATTERY_LEVEL_FIELD_NUMBER = 5;
    private static final x3 DEFAULT_INSTANCE;
    public static final int IS_IDLE_FIELD_NUMBER = 7;
    public static final int IS_METERED_FIELD_NUMBER = 8;
    public static final int IS_PLUGGED_FIELD_NUMBER = 4;
    public static final int IS_ROAMING_FIELD_NUMBER = 6;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int SIGNAL_STRENGTH_FIELD_NUMBER = 3;
    private int batteryLevel_;
    private int isIdle_;
    private int isMetered_;
    private int isPlugged_;
    private int isRoaming_;
    private int networkType_;
    private int signalStrength_;

    static {
        x3 x3Var = new x3();
        DEFAULT_INSTANCE = x3Var;
        GeneratedMessageLite.registerDefaultInstance(x3.class, x3Var);
    }

    public static s3 i() {
        return (s3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (v0.a[l0Var.ordinal()]) {
            case 1:
                return new x3();
            case 2:
                return new s3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\f\u0003\u0004\u0004\f\u0005\u0004\u0006\f\u0007\f\b\f", new Object[]{"networkType_", "signalStrength_", "isPlugged_", "batteryLevel_", "isRoaming_", "isIdle_", "isMetered_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (x3.class) {
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
