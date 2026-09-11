package com.google.protobuf;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum z0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(ByteString.class, ByteString.EMPTY),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object e;

    z0(Class cls, Serializable serializable) {
        this.e = serializable;
    }
}
