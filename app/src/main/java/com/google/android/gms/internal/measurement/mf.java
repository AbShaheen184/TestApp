package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mf {
    public static final kf d = new kf();
    public final mf a;
    public final androidx.collection.y0 b;
    public boolean c = false;

    public /* synthetic */ mf(mf mfVar, androidx.collection.y0 y0Var) {
        if (mfVar != null) {
            com.google.android.material.motion.a.f(mfVar.c);
        }
        this.a = mfVar;
        this.b = y0Var;
    }

    public static mf a(mf mfVar, mf mfVar2) {
        mfVar.getClass();
        mf mfVar3 = lf.e;
        if (mfVar == mfVar3) {
            return mfVar2;
        }
        mfVar2.getClass();
        if (mfVar2 == mfVar3) {
            return mfVar;
        }
        com.google.common.collect.k0<mf> k0VarK = com.google.common.collect.k0.k(2, mfVar, mfVar2);
        if (k0VarK.isEmpty()) {
            return mfVar3;
        }
        if (k0VarK.size() == 1) {
            return (mf) k0VarK.iterator().next();
        }
        int i = 0;
        for (mf mfVar4 : k0VarK) {
            do {
                i += mfVar4.b.z;
                mfVar4 = mfVar4.a;
            } while (mfVar4 != null);
        }
        if (i == 0) {
            return lf.e;
        }
        androidx.collection.y0 y0Var = new androidx.collection.y0(i);
        for (mf mfVar5 : k0VarK) {
            do {
                int i2 = 0;
                while (true) {
                    androidx.collection.y0 y0Var2 = mfVar5.b;
                    if (i2 >= y0Var2.z) {
                        break;
                    }
                    com.google.android.material.motion.a.h(y0Var.put((kf) y0Var2.f(i2), y0Var2.i(i2)) == null, "Duplicate bindings: %s", y0Var2.f(i2));
                    i2++;
                }
                mfVar5 = mfVar5.a;
            } while (mfVar5 != null);
        }
        return new lf(null, y0Var).b();
    }

    public final mf b() {
        if (this.c) {
            net.luminis.tls.engine.impl.c.r("Already frozen");
            return null;
        }
        this.c = true;
        mf mfVar = this.a;
        return (mfVar == null || !this.b.isEmpty()) ? this : mfVar;
    }

    public final boolean c() {
        if (this.b.containsKey(d)) {
            return true;
        }
        mf mfVar = this.a;
        return mfVar != null && mfVar.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (mf mfVar = this; mfVar != null; mfVar = mfVar.a) {
            for (int i = 0; i < mfVar.b.z; i++) {
                sb.append("[");
                sb.append(this.b.i(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
