package kotlinx.serialization.json;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlinx.serialization.descriptors.e {
    public static final e b = new e();
    public static final String c = "kotlinx.serialization.json.JsonArray";
    public final /* synthetic */ kotlinx.serialization.internal.b a;

    public e() {
        k kVar = k.a;
        kotlinx.serialization.descriptors.f fVar = k.b;
        fVar.getClass();
        this.a = new kotlinx.serialization.internal.b(fVar);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return c;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final com.google.android.material.shape.e e() {
        this.a.getClass();
        return kotlinx.serialization.descriptors.h.z;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        this.a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        this.a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        this.a.getClass();
        return kotlin.collections.u.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        this.a.h(i);
        return kotlin.collections.u.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        return this.a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        this.a.j(i);
        return false;
    }
}
