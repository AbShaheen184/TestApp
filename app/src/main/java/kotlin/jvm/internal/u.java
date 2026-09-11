package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends c implements kotlin.reflect.j {
    private final boolean syntheticJavaProperty;

    public u(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // kotlin.jvm.internal.c
    public kotlin.reflect.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return getOwner().equals(uVar.getOwner()) && getName().equals(uVar.getName()) && getSignature().equals(uVar.getSignature()) && l.a(getBoundReceiver(), uVar.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.j) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.c
    public kotlin.reflect.j getReflected() {
        if (this.syntheticJavaProperty) {
            com.google.gson.b.r("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        kotlin.reflect.b bVarCompute = compute();
        if (bVarCompute != this) {
            return (kotlin.reflect.j) bVarCompute;
        }
        throw new kotlin.jvm.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.j
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.j
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        kotlin.reflect.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
