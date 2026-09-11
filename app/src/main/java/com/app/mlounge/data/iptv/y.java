package com.app.mlounge.data.iptv;

import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new y(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:8:0x0029, B:28:0x0081, B:30:0x0087, B:31:0x00a0, B:33:0x00a6, B:34:0x00b4, B:38:0x00d0, B:15:0x003a, B:27:0x0071, B:16:0x003e, B:22:0x0055, B:24:0x005e, B:19:0x0045), top: B:42:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6 A[Catch: Exception -> 0x002d, LOOP:1: B:31:0x00a0->B:33:0x00a6, LOOP_END, TryCatch #0 {Exception -> 0x002d, blocks: (B:8:0x0029, B:28:0x0081, B:30:0x0087, B:31:0x00a0, B:33:0x00a6, B:34:0x00b4, B:38:0x00d0, B:15:0x003a, B:27:0x0071, B:16:0x003e, B:22:0x0055, B:24:0x005e, B:19:0x0045), top: B:42:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x0081->B:47:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        c0 c0Var;
        int i;
        Iterator it;
        com.app.mlounge.data.local.dao.k kVar;
        ArrayList arrayList;
        Iterator it2;
        int i2 = this.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                EarthCamProvider earthCamProviderG = this.this$0.g();
                this.label = 1;
                obj = earthCamProviderG.fetchFromApi(this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i2 == 1) {
                kotlin.a.e(obj);
            } else if (i2 == 2) {
                list = (List) this.L$0;
                kotlin.a.e(obj);
                ArrayList arrayListF = kotlin.collections.o.F(1000, list);
                list2 = list;
                c0Var = this.this$0;
                i = 0;
                it = arrayListF.iterator();
            } else {
                if (i2 != 3) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                it = (Iterator) this.L$3;
                c0Var = (c0) this.L$2;
                list2 = (List) this.L$0;
                kotlin.a.e(obj);
            }
            while (it.hasNext()) {
                List list3 = (List) it.next();
                kVar = c0Var.channelDao;
                arrayList = new ArrayList(kotlin.collections.p.y(list3, 10));
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(c0.f(c0Var, (IptvChannel) it2.next()));
                }
                this.L$0 = list2;
                this.L$1 = null;
                this.L$2 = c0Var;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 3;
                if (((com.app.mlounge.data.local.dao.l) kVar).b(arrayList, this) == aVar) {
                    return aVar;
                }
            }
            list = list2;
            kotlin.o oVar = com.app.mlounge.util.a.a;
            list.size();
            return new kotlin.k("earthcam", new Integer(list.size()));
            list = (List) obj;
            if (!list.isEmpty()) {
                com.app.mlounge.data.local.dao.k kVar2 = this.this$0.channelDao;
                this.L$0 = list;
                this.label = 2;
                if (((com.app.mlounge.data.local.dao.l) kVar2).a("earthcam", this) != aVar) {
                    ArrayList arrayListF2 = kotlin.collections.o.F(1000, list);
                    list2 = list;
                    c0Var = this.this$0;
                    i = 0;
                    it = arrayListF2.iterator();
                    while (it.hasNext()) {
                        List list4 = (List) it.next();
                        kVar = c0Var.channelDao;
                        arrayList = new ArrayList(kotlin.collections.p.y(list4, 10));
                        it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(c0.f(c0Var, (IptvChannel) it2.next()));
                        }
                        this.L$0 = list2;
                        this.L$1 = null;
                        this.L$2 = c0Var;
                        this.L$3 = it;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.I$0 = i;
                        this.I$1 = 0;
                        this.label = 3;
                        if (((com.app.mlounge.data.local.dao.l) kVar).b(arrayList, this) == aVar) {
                        }
                    }
                    list = list2;
                }
                return aVar;
            }
            kotlin.o oVar2 = com.app.mlounge.util.a.a;
            list.size();
            return new kotlin.k("earthcam", new Integer(list.size()));
        } catch (Exception e) {
            kotlin.o oVar3 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("PlaylistManager", "Failed to regenerate earthcam: " + e.getMessage());
            return new kotlin.k("earthcam", new Integer(0));
        }
    }
}
