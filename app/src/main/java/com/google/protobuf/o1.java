package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements a2 {
    public final l1 a;
    public final g2 b;
    public final b0 c;

    public o1(g2 g2Var, b0 b0Var, l1 l1Var) {
        this.b = g2Var;
        b0Var.getClass();
        this.c = b0Var;
        this.a = l1Var;
    }

    @Override // com.google.protobuf.a2
    public final void a(Object obj, Object obj2) {
        b2.k(this.b, obj, obj2);
    }

    @Override // com.google.protobuf.a2
    public final void b(Object obj) {
        this.b.getClass();
        f2 f2Var = ((GeneratedMessageLite) obj).unknownFields;
        if (f2Var.e) {
            f2Var.e = false;
        }
        this.c.getClass();
        androidx.privacysandbox.ads.adservices.java.internal.a.C(obj);
        throw null;
    }

    @Override // com.google.protobuf.a2
    public final boolean c(Object obj) {
        this.c.getClass();
        androidx.privacysandbox.ads.adservices.java.internal.a.C(obj);
        throw null;
    }

    @Override // com.google.protobuf.a2
    public final GeneratedMessageLite d() {
        l1 l1Var = this.a;
        return l1Var instanceof GeneratedMessageLite ? ((GeneratedMessageLite) l1Var).newMutableInstance() : ((h0) l1Var.newBuilderForType()).b();
    }

    @Override // com.google.protobuf.a2
    public final void e(Object obj, f1 f1Var) {
        this.c.getClass();
        androidx.privacysandbox.ads.adservices.java.internal.a.C(obj);
        throw null;
    }

    @Override // com.google.protobuf.a2
    public final void f(Object obj, androidx.compose.foundation.text.selection.w wVar, a0 a0Var) {
        this.b.getClass();
        g2.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.a2
    public final void g(Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.p0 p0Var) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        if (generatedMessageLite.unknownFields == f2.f) {
            generatedMessageLite.unknownFields = new f2();
        }
        throw androidx.privacysandbox.ads.adservices.java.internal.a.i(obj);
    }

    @Override // com.google.protobuf.a2
    public final int h(GeneratedMessageLite generatedMessageLite) {
        this.b.getClass();
        return generatedMessageLite.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.a2
    public final int i(GeneratedMessageLite generatedMessageLite) {
        this.b.getClass();
        f2 f2Var = generatedMessageLite.unknownFields;
        int i = f2Var.d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < f2Var.a; i2++) {
            int i3 = f2Var.b[i2] >>> 3;
            iB += w.b(3, (ByteString) f2Var.c[i2]) + w.f(i3) + w.e(2) + (w.e(1) * 2);
        }
        f2Var.d = iB;
        return iB;
    }

    @Override // com.google.protobuf.a2
    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        this.b.getClass();
        return generatedMessageLite.unknownFields.equals(generatedMessageLite2.unknownFields);
    }
}
