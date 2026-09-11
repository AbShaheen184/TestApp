package com.app.mlounge.data.iptv;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $slug;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = c0Var;
        this.$slug = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new z(this.this$0, this.$slug, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                c0 c0Var = this.this$0;
                String str = this.$slug;
                this.label = 1;
                obj = c0.b(c0Var, str, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            kotlin.o oVar = com.app.mlounge.util.a.a;
            return new kotlin.k(this.$slug, new Integer(iIntValue));
        } catch (Exception e) {
            kotlin.o oVar2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("PlaylistManager", "Failed to regenerate " + this.$slug + ": " + e.getMessage());
            return new kotlin.k(this.$slug, new Integer(0));
        }
    }
}
