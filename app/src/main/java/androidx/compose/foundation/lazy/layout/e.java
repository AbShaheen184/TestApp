package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.q {
    public androidx.compose.ui.spatial.d L;
    public final /* synthetic */ f M;

    public e(f fVar) {
        this.M = fVar;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        f fVar = this.M;
        fVar.b = this;
        if (fVar.c != null) {
            L0();
        }
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        f fVar = this.M;
        if (fVar.b == this) {
            fVar.b = null;
        }
        androidx.compose.ui.spatial.d dVar = this.L;
        if (dVar != null) {
            dVar.b();
        }
        this.L = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void L0() {
        androidx.activity.compose.h hVar = new androidx.activity.compose.h(17, this, this.M);
        androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(this);
        int i = f0VarT.y;
        androidx.compose.ui.spatial.b rectManager = ((androidx.compose.ui.platform.u) androidx.compose.ui.node.i0.a(f0VarT)).getRectManager();
        androidx.compose.ui.spatial.e eVar = rectManager.b;
        eVar.getClass();
        androidx.collection.z zVar = eVar.a;
        androidx.compose.ui.spatial.d dVar = new androidx.compose.ui.spatial.d(eVar, i, this, hVar);
        Object objB = zVar.b(i);
        if (objB == null) {
            zVar.h(i, dVar);
            objB = dVar;
        }
        androidx.compose.ui.spatial.d dVar2 = (androidx.compose.ui.spatial.d) objB;
        if (dVar2 != dVar) {
            while (true) {
                androidx.compose.ui.spatial.d dVar3 = dVar2.d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.d = dVar;
        }
        if (androidx.compose.ui.node.k.t(this.e).E) {
            rectManager.a.s(i, true);
        }
        rectManager.d = true;
        rectManager.j();
        this.L = dVar;
    }
}
