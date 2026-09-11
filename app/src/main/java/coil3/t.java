package coil3;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final q a(Context context) {
        q qVar;
        q qVar2;
        s sVar;
        s sVar2;
        s sVar3;
        s sVar4;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        q qVar3 = obj instanceof q ? (q) obj : null;
        if (qVar3 != null) {
            return qVar3;
        }
        q qVarB = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof q) {
                qVar = (q) obj2;
                qVar2 = qVarB;
            } else {
                if (qVarB == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (obj2 instanceof s) {
                        sVar4 = (s) obj2;
                    } else {
                        sVar = null;
                    }
                    if (sVar != null) {
                        sVar = sVar4;
                        qVarB = sVar.b(applicationContext);
                    } else {
                        if (applicationContext instanceof s) {
                            sVar3 = (s) applicationContext;
                        } else {
                            sVar2 = null;
                        }
                        if (sVar2 != null) {
                            sVar = sVar4;
                            sVar = sVar4;
                            sVar2 = sVar3;
                            qVarB = sVar2.b(applicationContext);
                        } else {
                            sVar = sVar4;
                            sVar = sVar4;
                            sVar2 = sVar3;
                            qVarB = v.a.b(applicationContext);
                        }
                    }
                }
                qVar = qVarB;
                qVar2 = qVar;
            }
            while (!atomicReference.compareAndSet(obj2, qVar)) {
                if (atomicReference.get() != obj2) {
                    qVarB = qVar2;
                }
            }
            return qVar;
        }
    }
}
