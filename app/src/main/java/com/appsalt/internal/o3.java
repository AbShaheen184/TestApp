package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int APPLICATION_DATA_FIELD_NUMBER = 6;
    public static final int CID_FIELD_NUMBER = 2;
    private static final o3 DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 10;
    public static final int OPTIONAL_FIELD_NUMBER = 8;
    public static final int OS_DATA_FIELD_NUMBER = 7;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 5;
    public static final int SID_FIELD_NUMBER = 9;
    public static final int UID_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 4;
    private n2 applicationData_;
    private int bitField0_;
    private w2 features_;
    private h3 osData_;
    private int protocol_;
    private MapFieldLite<String, String> optional_ = MapFieldLite.emptyMapField();
    private String uid_ = "";
    private String cid_ = "";
    private String version_ = "";
    private String sid_ = "";

    static {
        o3 o3Var = new o3();
        DEFAULT_INSTANCE = o3Var;
        GeneratedMessageLite.registerDefaultInstance(o3.class, o3Var);
    }

    public static s2 n() {
        return (s2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (v0.a[l0Var.ordinal()]) {
            case 1:
                return new o3();
            case 2:
                return new s2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005\f\u0006ဉ\u0000\u0007ဉ\u0001\b2\tȈ\nဉ\u0002", new Object[]{"bitField0_", "uid_", "cid_", "version_", "protocol_", "applicationData_", "osData_", "optional_", a3.a, "sid_", "features_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (o3.class) {
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
