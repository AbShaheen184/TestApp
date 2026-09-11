package com.app.mlounge.ui.screens.history;

import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.o;
import kotlin.text.k;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ r A;
    public final /* synthetic */ l B;
    public final /* synthetic */ l C;
    public final /* synthetic */ com.app.mlounge.data.local.entity.c e;
    public final /* synthetic */ l y;
    public final /* synthetic */ l z;

    public d(com.app.mlounge.data.local.entity.c cVar, int i, l lVar, l lVar2, r rVar, l lVar3, l lVar4) {
        this.e = cVar;
        this.y = lVar;
        this.z = lVar2;
        this.A = rVar;
        this.B = lVar3;
        this.C = lVar4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00b7, please report this as an issue */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        o oVar = com.app.mlounge.util.a.a;
        com.app.mlounge.data.local.entity.c cVar = this.e;
        String strJ0 = cVar.l;
        String str = cVar.a;
        String str2 = cVar.b;
        switch (str2) {
            case "anime_tv":
            case "anime_movie":
                if (strJ0 == null) {
                    strJ0 = k.j0(k.j0(str, "anime_movie_"), "anime_tv_");
                }
            case "tv":
                Integer numQ = kotlin.text.r.Q(k.v0(k.j0(str, "tv_"), "_"));
                if (numQ == null) {
                    com.app.mlounge.util.a.f("HistoryClick", "tv id null for contentId=".concat(str));
                } else {
                    this.z.invoke(numQ);
                }
                break;
            case "adult":
                if (strJ0 == null) {
                    strJ0 = k.j0(str, "adult_");
                }
            case "movie":
                Integer numQ2 = kotlin.text.r.Q(k.j0(str, "movie_"));
                if (numQ2 == null) {
                    com.app.mlounge.util.a.f("HistoryClick", "movie id null for contentId=".concat(str));
                } else {
                    this.y.invoke(numQ2);
                }
                break;
            case "live_tv":
                String strS0 = k.s0(str, "_", "");
                if (strJ0 == null) {
                    com.app.mlounge.util.a.f("HistoryClick", "live_tv url null for contentId=".concat(str));
                } else {
                    this.A.invoke(strJ0, cVar.c, null, strS0);
                }
                break;
            default:
                com.app.mlounge.util.a.f("HistoryClick", "UNHANDLED contentType=" + str2 + " contentId=" + str);
                break;
        }
        return y.a;
    }
}
