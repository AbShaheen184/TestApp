package com.appsalt.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements k3 {
    public final String a;
    public final f2 b;
    public final l2 c;
    public final Object d;
    public final String e;

    public p2(String str, f2 f2Var, l2 l2Var, Map map, String str2) {
        this.a = str;
        this.b = f2Var;
        this.c = l2Var;
        this.d = map;
        this.e = str2;
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
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!this.a.equals(p2Var.a) || !this.b.equals(p2Var.b) || !this.c.equals(p2Var.c) || !this.d.equals(p2Var.d) || !kotlin.jvm.internal.l.a(this.e, p2Var.e)) {
            return false;
        }
        m mVar = m.a;
        return mVar.equals(mVar);
    }

    public final int hashCode() {
        return ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((androidx.constraintlayout.core.g.e(5) + (((((this.a.hashCode() * 31) + 485665020) * 31) - 1924424521) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + 1146009431;
    }

    public final String toString() {
        return "Platform(uid=" + this.a + ", cid=HASDKANKTLKTLWQ251023PA, version=1.5.0-SNAPSHOT, protocol=PROTOCOL_QUIC_MULTI, appData=" + this.b + ", osData=" + this.c + ", optional=" + this.d + ", sessionId=" + this.e + ", features=" + m.a + ')';
    }
}
