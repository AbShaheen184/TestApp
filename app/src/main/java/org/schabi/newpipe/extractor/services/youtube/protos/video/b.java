package org.schabi.newpipe.extractor.services.youtube.protos.video;

import com.appsalt.internal.m2;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.i0;
import com.google.protobuf.l0;
import com.google.protobuf.r1;
import com.google.protobuf.t0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final b DEFAULT_INSTANCE;
    private static volatile r1 PARSER = null;
    public static final int XTAGS_FIELD_NUMBER = 1;
    private t0 xtags_ = GeneratedMessageLite.emptyProtobufList();

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
    }

    public static b c(byte[] bArr) {
        return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final t0 b() {
        return this.xtags_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(l0 l0Var, Object obj, Object obj2) {
        r1 i0Var;
        int iOrdinal = l0Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"xtags_", a.class});
        }
        if (iOrdinal == 3) {
            return new b();
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
        synchronized (b.class) {
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
