package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends androidx.compose.ui.node.w0 {
    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
        b1 b1Var = new b1();
        b1Var.L = iVar;
        return b1Var;
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
        if ((obj instanceof a1 ? (a1) obj : null) == null) {
            return false;
        }
        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
        return iVar.equals(iVar);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((b1) qVar).L = androidx.compose.ui.c.H;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f);
    }
}
