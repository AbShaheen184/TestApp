package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 implements k1 {
    public final GeneratedMessageLite e;
    public GeneratedMessageLite y;

    public h0(GeneratedMessageLite generatedMessageLite) {
        this.e = generatedMessageLite;
        if (generatedMessageLite.isMutable()) {
            net.luminis.tls.engine.impl.c.o("Default instance must be immutable.");
            throw null;
        }
        this.y = generatedMessageLite.newMutableInstance();
    }

    public static void e(Object obj, Object obj2) {
        t1 t1Var = t1.c;
        t1Var.getClass();
        t1Var.a(obj.getClass()).a(obj, obj2);
    }

    public static void f(int i, List list) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public final GeneratedMessageLite a() {
        GeneratedMessageLite generatedMessageLiteB = b();
        if (generatedMessageLiteB.isInitialized()) {
            return generatedMessageLiteB;
        }
        throw new e2();
    }

    public final GeneratedMessageLite b() {
        boolean zIsMutable = this.y.isMutable();
        GeneratedMessageLite generatedMessageLite = this.y;
        if (!zIsMutable) {
            return generatedMessageLite;
        }
        generatedMessageLite.makeImmutable();
        return this.y;
    }

    public final void c() {
        if (this.y.isMutable()) {
            return;
        }
        GeneratedMessageLite generatedMessageLiteNewMutableInstance = this.e.newMutableInstance();
        e(generatedMessageLiteNewMutableInstance, this.y);
        this.y = generatedMessageLiteNewMutableInstance;
    }

    public final Object clone() {
        h0 h0VarNewBuilderForType = this.e.newBuilderForType();
        h0VarNewBuilderForType.y = b();
        return h0VarNewBuilderForType;
    }

    public final void d(GeneratedMessageLite generatedMessageLite) {
        if (this.e.equals(generatedMessageLite)) {
            return;
        }
        c();
        e(this.y, generatedMessageLite);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final l1 getDefaultInstanceForType() {
        return this.e;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return GeneratedMessageLite.isInitialized(this.y, false);
    }
}
