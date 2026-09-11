package androidx.compose.ui.platform;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements androidx.compose.runtime.saveable.h {
    public final /* synthetic */ androidx.compose.runtime.saveable.i e;
    public final o1 y;

    public n1(androidx.compose.runtime.saveable.i iVar, o1 o1Var) {
        this.e = iVar;
        this.y = o1Var;
    }

    @Override // androidx.compose.runtime.saveable.h
    public final boolean a(Object obj) {
        return this.e.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.h
    public final Map b() {
        return this.e.b();
    }

    @Override // androidx.compose.runtime.saveable.h
    public final Object c(String str) {
        return this.e.c(str);
    }

    @Override // androidx.compose.runtime.saveable.h
    public final androidx.compose.runtime.saveable.g d(String str, kotlin.jvm.functions.a aVar) {
        return this.e.d(str, aVar);
    }
}
