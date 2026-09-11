package org.schabi.newpipe.extractor.services.youtube.protos.video;

import com.appsalt.internal.m2;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.i0;
import com.google.protobuf.l0;
import com.google.protobuf.r1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile r1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String key_ = "";
    private String value_ = "";

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
    }

    public final String b() {
        return this.key_;
    }

    public final String c() {
        return this.value_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(l0 l0Var, Object obj, Object obj2) {
        r1 i0Var;
        int iOrdinal = l0Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "key_", "value_"});
        }
        if (iOrdinal == 3) {
            return new a();
        }
        if (iOrdinal == 4) {
            return new m2(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r1 r1Var = PARSER;
        if (r1Var != null) {
            return r1Var;
        }
        synchronized (a.class) {
            try {
                i0Var = PARSER;
                if (i0Var == null) {
                    i0Var = new i0(DEFAULT_INSTANCE);
                    PARSER = i0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i0Var;
    }
}
