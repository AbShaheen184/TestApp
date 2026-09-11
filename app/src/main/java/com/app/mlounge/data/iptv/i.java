package com.app.mlounge.data.iptv;

import android.net.Uri;
import java.io.InputStream;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ kotlin.jvm.functions.l $onProgress;
    final /* synthetic */ String $uriString;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.functions.l lVar, String str, l lVar2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$onProgress = lVar;
        this.$uriString = str;
        this.this$0 = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new i(this.$onProgress, this.$uriString, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        if (this.label != 0) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        this.$onProgress.invoke("Opening local EPG...");
        InputStream inputStreamOpenInputStream = this.this$0.context.getContentResolver().openInputStream(Uri.parse(this.$uriString));
        if (inputStreamOpenInputStream == null) {
            throw new Exception("Could not open local EPG file");
        }
        this.$onProgress.invoke("Parsing EPG programs...");
        m.INSTANCE.getClass();
        LinkedHashMap linkedHashMapA = m.a(inputStreamOpenInputStream);
        if (!linkedHashMapA.isEmpty()) {
            this.$onProgress.invoke("Saving EPG (" + linkedHashMapA.size() + " channels)...");
            this.this$0.n(linkedHashMapA);
        }
        kotlin.o oVar = com.app.mlounge.util.a.a;
        linkedHashMapA.size();
        return linkedHashMapA;
    }
}
