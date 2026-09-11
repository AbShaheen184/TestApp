package org.schabi.newpipe.extractor.services.youtube.protos.playlist;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.i0;
import com.google.protobuf.l0;
import com.google.protobuf.r1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final d DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 80226972;
    private static volatile r1 PARSER;
    private int bitField0_;
    private b parameters_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
    }

    public static void b(d dVar, b bVar) {
        dVar.getClass();
        dVar.parameters_ = bVar;
        dVar.bitField0_ |= 1;
    }

    public static c c() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(l0 l0Var, Object obj, Object obj2) {
        r1 i0Var;
        int iOrdinal = l0Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\uea9c♁\uea9c♁\u0001\u0000\u0000\u0000\uea9c♁ဉ\u0000", new Object[]{"bitField0_", "parameters_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        if (iOrdinal == 4) {
            return new c(DEFAULT_INSTANCE);
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
        synchronized (d.class) {
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
