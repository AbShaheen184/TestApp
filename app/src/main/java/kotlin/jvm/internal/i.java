package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c implements h, kotlin.reflect.e {
    private final int arity;

    public i(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.c
    public kotlin.reflect.b computeReflected() {
        a0.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && l.a(getBoundReceiver(), iVar.getBoundReceiver()) && l.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof kotlin.reflect.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.c
    public kotlin.reflect.e getReflected() {
        kotlin.reflect.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (kotlin.reflect.e) bVarCompute;
        }
        throw new kotlin.jvm.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.c, kotlin.reflect.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
