package com.app.mlounge.data.iptv;

import android.net.Uri;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ kotlin.jvm.functions.l $onProgress;
    final /* synthetic */ String $uriString;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlin.jvm.functions.l lVar, String str, l lVar2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$onProgress = lVar;
        this.$uriString = str;
        this.this$0 = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new k(this.$onProgress, this.$uriString, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e4 A[LOOP:0: B:26:0x00de->B:28:0x00e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x010d  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        InputStream inputStreamOpenInputStream;
        List arrayList;
        kotlin.jvm.internal.x xVar;
        List list;
        kotlin.jvm.internal.x xVar2;
        l lVar;
        ArrayList arrayList2;
        Iterator it;
        com.app.mlounge.data.local.dao.k kVar;
        kotlin.jvm.internal.x xVar3;
        int i = this.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i == 0) {
            kotlin.a.e(obj);
            this.$onProgress.invoke("Opening local file...");
            inputStreamOpenInputStream = this.this$0.context.getContentResolver().openInputStream(Uri.parse(this.$uriString));
            if (inputStreamOpenInputStream == null) {
                throw new Exception("Could not open local file");
            }
            this.$onProgress.invoke("Parsing channels...");
            kotlin.jvm.internal.x xVar4 = new kotlin.jvm.internal.x();
            arrayList = new ArrayList();
            com.app.mlounge.data.local.dao.k kVar2 = this.this$0.channelDao;
            this.L$0 = null;
            this.L$1 = inputStreamOpenInputStream;
            this.L$2 = xVar4;
            this.L$3 = arrayList;
            this.label = 1;
            if (((com.app.mlounge.data.local.dao.l) kVar2).a(l.SLUG, this) != aVar) {
                xVar = xVar4;
            }
            return aVar;
        }
        if (i == 1) {
            arrayList = (List) this.L$3;
            kotlin.jvm.internal.x xVar5 = (kotlin.jvm.internal.x) this.L$2;
            inputStreamOpenInputStream = (InputStream) this.L$1;
            kotlin.a.e(obj);
            xVar = xVar5;
        } else {
            if (i == 2) {
                list = (List) this.L$3;
                xVar2 = (kotlin.jvm.internal.x) this.L$2;
                kotlin.a.e(obj);
                if (!list.isEmpty()) {
                    lVar = this.this$0;
                    arrayList2 = new ArrayList(kotlin.collections.p.y(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(l.f(lVar, (IptvChannel) it.next()));
                    }
                    kVar = this.this$0.channelDao;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = xVar2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (((com.app.mlounge.data.local.dao.l) kVar).b(arrayList2, this) != aVar) {
                        xVar3 = xVar2;
                    }
                    return aVar;
                }
                kotlin.io.j.B(new File(this.this$0.playlistDir, "custom_channels.json"), "{}");
                kotlin.o oVar = com.app.mlounge.util.a.a;
                return new Integer(xVar2.e);
            }
            if (i != 3) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar3 = (kotlin.jvm.internal.x) this.L$2;
            kotlin.a.e(obj);
        }
        xVar2 = xVar3;
        kotlin.io.j.B(new File(this.this$0.playlistDir, "custom_channels.json"), "{}");
        kotlin.o oVar2 = com.app.mlounge.util.a.a;
        return new Integer(xVar2.e);
        List list2 = arrayList;
        u uVar = u.INSTANCE;
        j jVar = new j(list2, xVar, this.this$0, this.$onProgress, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = xVar;
        this.L$3 = list2;
        this.label = 2;
        if (uVar.a(inputStreamOpenInputStream, l.SLUG, jVar, this) != aVar) {
            list = list2;
            xVar2 = xVar;
            if (!list.isEmpty()) {
                lVar = this.this$0;
                arrayList2 = new ArrayList(kotlin.collections.p.y(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(l.f(lVar, (IptvChannel) it.next()));
                }
                kVar = this.this$0.channelDao;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = xVar2;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (((com.app.mlounge.data.local.dao.l) kVar).b(arrayList2, this) != aVar) {
                    xVar3 = xVar2;
                    xVar2 = xVar3;
                }
            }
            kotlin.io.j.B(new File(this.this$0.playlistDir, "custom_channels.json"), "{}");
            kotlin.o oVar3 = com.app.mlounge.util.a.a;
            return new Integer(xVar2.e);
        }
        return aVar;
    }
}
