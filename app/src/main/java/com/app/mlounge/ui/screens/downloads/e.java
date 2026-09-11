package com.app.mlounge.ui.screens.downloads;

import android.net.Uri;
import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.ui.screens.player.b1;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.m1;
import com.app.mlounge.ui.viewmodel.r1;
import com.app.mlounge.ui.viewmodel.v;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.text.k;
import kotlin.text.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import okhttp3.internal.http2.o;
import okhttp3.internal.http2.s;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final Object y;
    public final /* synthetic */ Object z;

    public e(o oVar, s sVar) {
        this.e = 9;
        this.z = oVar;
        this.y = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r7v9, types: [okhttp3.internal.http2.o] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws Throwable {
        okhttp3.internal.http2.b bVar;
        int i = this.e;
        ?? r2 = 0;
        r2 = 0;
        int i2 = 1;
        y yVar = y.a;
        Object obj = this.y;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                com.app.mlounge.data.local.entity.a aVar = (com.app.mlounge.data.local.entity.a) obj;
                String string = aVar.n;
                if (string != null) {
                    kotlin.jvm.functions.s sVar = (kotlin.jvm.functions.s) obj2;
                    if (!r.O(string, "content://", false)) {
                        string = Uri.fromFile(new File(string)).toString();
                        string.getClass();
                    }
                    sVar.c(string, aVar.d, Integer.valueOf(aVar.r), Integer.valueOf(aVar.s), Integer.valueOf(aVar.t));
                }
                return yVar;
            case 1:
                a0 a0Var = (a0) obj;
                BuildersKt__Builders_commonKt.launch$default(l0.g(a0Var), null, null, new v(a0Var, (IptvChannel) obj2, r2, i2), 3, null);
                return yVar;
            case 2:
                ((l) obj).invoke((com.app.mlounge.ui.screens.player.a) obj2);
                return yVar;
            case 3:
                ((l) obj).invoke((b1) obj2);
                return yVar;
            case 4:
                IptvChannel iptvChannel = (IptvChannel) obj2;
                ((q) obj).invoke(iptvChannel.f(), iptvChannel.c(), iptvChannel.d());
                return yVar;
            case 5:
                ((l) obj).invoke(((MusicArtist) obj2).c());
                return yVar;
            case 6:
                String strA = ((MusicTrack) obj).a();
                if (strA != null && !k.d0(strA)) {
                    ((l) obj2).invoke(strA);
                }
                return yVar;
            case 7:
                File file = (File) obj;
                if (file.canRead()) {
                    List list = e0.a;
                    ((y0) obj2).setValue(file);
                }
                return yVar;
            case 8:
                r1 r1Var = (r1) obj;
                ChqStream chqStream = (ChqStream) obj2;
                chqStream.getClass();
                kotlin.coroutines.d dVar = null;
                if (kotlin.jvm.internal.l.a(chqStream.n(), Boolean.TRUE) || kotlin.jvm.internal.l.a(chqStream.k(), "torrent") || r.O(chqStream.m(), "magnet:", false) || chqStream.f() != null) {
                    BuildersKt__Builders_commonKt.launch$default(l0.g(r1Var), null, null, new m1(r1Var, chqStream, dVar, 2), 3, null);
                } else if (kotlin.jvm.internal.l.a(r1Var.x, "download")) {
                    BuildersKt__Builders_commonKt.launch$default(l0.g(r1Var), null, null, new com.app.mlounge.ui.screens.adult.e(r1Var, chqStream.m(), chqStream, dVar, 20), 3, null);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(l0.g(r1Var), null, null, new m1(r1Var, chqStream, dVar, i2), 3, null);
                }
                return yVar;
            default:
                ?? r7 = (o) obj2;
                s sVar2 = (s) obj;
                okhttp3.internal.http2.b bVar2 = okhttp3.internal.http2.b.INTERNAL_ERROR;
                try {
                    if (!sVar2.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (sVar2.a(false, this)) {
                    }
                    bVar = okhttp3.internal.http2.b.NO_ERROR;
                    try {
                        try {
                            r7.a(bVar, okhttp3.internal.http2.b.CANCEL, null);
                        } catch (Throwable th) {
                            th = th;
                            r7.a(bVar, bVar2, r2);
                            okhttp3.internal.e.b(sVar2);
                            throw th;
                        }
                    } catch (IOException e) {
                        r2 = e;
                        okhttp3.internal.http2.b bVar3 = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                        r7.a(bVar3, bVar3, r2);
                    }
                    okhttp3.internal.e.b(sVar2);
                    return yVar;
                } catch (IOException e2) {
                    r2 = e2;
                    bVar = bVar2;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    r7.a(bVar, bVar2, r2);
                    okhttp3.internal.e.b(sVar2);
                    throw th;
                }
                break;
        }
    }

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
