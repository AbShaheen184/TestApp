package com.app.mlounge.data.local.dao;

import com.google.firebase.crashlytics.internal.model.t1;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ g y;
    public final /* synthetic */ com.app.mlounge.data.local.entity.a z;

    public /* synthetic */ a(g gVar, com.app.mlounge.data.local.entity.a aVar, int i) {
        this.e = i;
        this.y = gVar;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                com.app.mlounge.data.local.entity.a aVar = this.z;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                e eVar = this.y.b;
                androidx.sqlite.c cVarU = aVar2.U("INSERT OR REPLACE INTO `downloads` (`id`,`url`,`fileName`,`title`,`contentType`,`contentId`,`posterPath`,`quality`,`size`,`status`,`progress`,`downloadedBytes`,`totalBytes`,`filePath`,`headers`,`addedAt`,`completedAt`,`tmdbId`,`season`,`episode`,`failureReason`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                try {
                    eVar.g(cVarU, aVar);
                    cVarU.Q();
                    com.google.common.base.i.c(cVarU, null);
                    if (t1.s(aVar2) == 0) {
                        j = -1;
                    } else {
                        androidx.sqlite.c cVarU2 = aVar2.U("SELECT last_insert_rowid()");
                        try {
                            cVarU2.Q();
                            long j2 = cVarU2.getLong(0);
                            com.google.common.base.i.c(cVarU2, null);
                            j = j2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                com.google.common.base.i.c(cVarU2, th);
                                throw th2;
                            }
                        }
                    }
                    return Long.valueOf(j);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        com.google.common.base.i.c(cVarU, th3);
                        throw th4;
                    }
                }
            default:
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                this.y.c.B(aVar3, this.z);
                return y.a;
        }
    }
}
