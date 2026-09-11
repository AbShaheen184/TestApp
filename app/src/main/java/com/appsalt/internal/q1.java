package com.appsalt.internal;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements c2 {
    public final String a;
    public final f1 b;
    public final m1 c;
    public final j1 d;

    public q1(String str, f1 f1Var, m1 m1Var, j1 j1Var) {
        this.a = str;
        this.b = f1Var;
        this.c = m1Var;
        this.d = j1Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        if (!this.a.equals(q1Var.a) || !this.b.equals(q1Var.b) || !this.c.equals(q1Var.c) || !this.d.equals(q1Var.d)) {
            return false;
        }
        m mVar = m.a;
        return mVar.equals(mVar);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + (((Build.VERSION.RELEASE.hashCode() - 933324943) + ((this.b.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e((((Integer.hashCode(2) + 472381993) * 31) + 485665020) * 31, 31, this.a)) * 31)) * 31)) * 31) + 1146009431;
    }

    public final String toString() {
        return "Platform(version=1.5.0-SNAPSHOT, protocol=2, cid=HASDKANKTLKTLWQ251023PA, uid=" + this.a + ", app=" + this.b + ", os=" + this.c + ", optional=" + this.d + ", features=" + m.a + ')';
    }
}
