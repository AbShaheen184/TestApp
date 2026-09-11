package com.app.mlounge.data.iptv;

import com.app.mlounge.data.remote.model.IptvChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $host;
    final /* synthetic */ kotlin.jvm.functions.l $onProgress;
    final /* synthetic */ String $password;
    final /* synthetic */ String $port;
    final /* synthetic */ String $username;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, String str, String str2, kotlin.jvm.functions.l lVar2, String str3, String str4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = lVar;
        this.$host = str;
        this.$port = str2;
        this.$onProgress = lVar2;
        this.$username = str3;
        this.$password = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new e(this.this$0, this.$host, this.$port, this.$onProgress, this.$username, this.$password, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0220  */
    /* JADX WARN: Code duplicated, block: B:53:0x023f A[LOOP:1: B:51:0x0239->B:53:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:48:0x021a->B:68:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        List list;
        l lVar;
        Iterator it;
        List list2;
        int i;
        com.app.mlounge.data.local.dao.k kVar;
        ArrayList arrayList;
        Iterator it2;
        int i2 = this.label;
        String str = null;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 != 0) {
            if (i2 == 1) {
                list = (List) this.L$4;
                kotlin.a.e(obj);
            } else {
                if (i2 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                it = (Iterator) this.L$7;
                lVar = (l) this.L$6;
                list2 = (List) this.L$4;
                kotlin.a.e(obj);
            }
            while (it.hasNext()) {
                List list3 = (List) it.next();
                kVar = lVar.channelDao;
                arrayList = new ArrayList(kotlin.collections.p.y(list3, 10));
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(l.f(lVar, (IptvChannel) it2.next()));
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = list2;
                this.L$5 = null;
                this.L$6 = lVar;
                this.L$7 = it;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 2;
                if (((com.app.mlounge.data.local.dao.l) kVar).b(arrayList, this) == aVar) {
                    return aVar;
                }
            }
            kotlin.io.j.B(new File(this.this$0.playlistDir, "custom_channels.json"), "{}");
            kotlin.o oVar = com.app.mlounge.util.a.a;
            list2.size();
            return list2;
        }
        kotlin.a.e(obj);
        l lVar2 = this.this$0;
        String str2 = this.$host;
        String str3 = this.$port;
        lVar2.getClass();
        String strG = l.g(str2, str3);
        this.$onProgress.invoke("Connecting to server...");
        this.$onProgress.invoke("Downloading categories...");
        String strE = l.e(this.this$0, strG + "/player_api.php?username=" + this.$username + "&password=" + this.$password + "&action=get_live_categories");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONArray jSONArray = new JSONArray(strE);
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                String strOptString = jSONObject.optString("category_id");
                String strOptString2 = jSONObject.optString("category_name");
                strOptString.getClass();
                if (!kotlin.text.k.d0(strOptString)) {
                    if (kotlin.text.k.d0(strOptString2)) {
                        strOptString2 = "Uncategorized";
                    }
                    linkedHashMap.put(strOptString, strOptString2);
                }
            }
        } catch (Exception unused) {
        }
        kotlin.o oVar2 = com.app.mlounge.util.a.a;
        linkedHashMap.size();
        this.$onProgress.invoke("Downloading channel list...");
        String strE2 = l.e(this.this$0, strG + "/player_api.php?username=" + this.$username + "&password=" + this.$password + "&action=get_live_streams");
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray2 = new JSONArray(strE2);
            this.$onProgress.invoke("Parsing " + jSONArray2.length() + " channels...");
            int length2 = jSONArray2.length();
            int i4 = 0;
            while (i4 < length2) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i4);
                String strOptString3 = jSONObject2.optString("name");
                if (!kotlin.text.k.d0(strOptString3)) {
                    String strOptString4 = jSONObject2.optString("stream_id");
                    if (!kotlin.text.k.d0(strOptString4)) {
                        String str4 = (String) linkedHashMap.get(jSONObject2.optString("category_id"));
                        String str5 = str4 == null ? "Uncategorized" : str4;
                        String strOptString5 = jSONObject2.optString("stream_icon");
                        String str6 = kotlin.text.k.d0(strOptString5) ? str : strOptString5;
                        String strOptString6 = jSONObject2.optString("epg_channel_id");
                        String str7 = kotlin.text.k.d0(strOptString6) ? str : strOptString6;
                        arrayList2.add(new IptvChannel(strOptString3, strG + "/live/" + this.$username + "/" + this.$password + "/" + strOptString4 + ".m3u8", str6, str5, l.SLUG, str7));
                    }
                }
                i4++;
                str = null;
            }
        } catch (Exception unused2) {
        }
        this.$onProgress.invoke("Saving " + arrayList2.size() + " channels to database...");
        com.app.mlounge.data.local.dao.k kVar2 = this.this$0.channelDao;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = arrayList2;
        this.label = 1;
        if (((com.app.mlounge.data.local.dao.l) kVar2).a(l.SLUG, this) != aVar) {
            list = arrayList2;
        }
        return aVar;
        ArrayList arrayListF = kotlin.collections.o.F(1000, list);
        lVar = this.this$0;
        it = arrayListF.iterator();
        list2 = list;
        i = 0;
        while (it.hasNext()) {
            List list4 = (List) it.next();
            kVar = lVar.channelDao;
            arrayList = new ArrayList(kotlin.collections.p.y(list4, 10));
            it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(l.f(lVar, (IptvChannel) it2.next()));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = list2;
            this.L$5 = null;
            this.L$6 = lVar;
            this.L$7 = it;
            this.L$8 = null;
            this.L$9 = null;
            this.I$0 = i;
            this.I$1 = 0;
            this.label = 2;
            if (((com.app.mlounge.data.local.dao.l) kVar).b(arrayList, this) == aVar) {
                return aVar;
            }
        }
        kotlin.io.j.B(new File(this.this$0.playlistDir, "custom_channels.json"), "{}");
        kotlin.o oVar3 = com.app.mlounge.util.a.a;
        list2.size();
        return list2;
    }
}
