package com.app.mlounge.ui.screens.watchlist;

import com.app.mlounge.data.local.entity.f;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.text.k;
import kotlin.text.r;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ q A;
    public final /* synthetic */ l B;
    public final /* synthetic */ l C;
    public final /* synthetic */ l D;
    public final /* synthetic */ l E;
    public final /* synthetic */ f e;
    public final /* synthetic */ l y;
    public final /* synthetic */ l z;

    public d(f fVar, l lVar, l lVar2, q qVar, l lVar3, l lVar4, l lVar5, l lVar6) {
        this.e = fVar;
        this.y = lVar;
        this.z = lVar2;
        this.A = qVar;
        this.B = lVar3;
        this.C = lVar4;
        this.D = lVar5;
        this.E = lVar6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        Integer numQ;
        Integer numQ2;
        f fVar = this.e;
        String str = fVar.b;
        String strJ0 = fVar.j;
        String str2 = fVar.a;
        switch (str.hashCode()) {
            case 3714:
                if (str.equals("tv") && (numQ = r.Q(k.j0(str2, "tv_"))) != null) {
                    this.z.invoke(numQ);
                }
                break;
            case 92676538:
                if (str.equals("adult")) {
                    if (strJ0 == null) {
                        strJ0 = k.j0(str2, "adult_");
                    }
                    this.E.invoke(strJ0);
                }
                break;
            case 92962932:
                if (str.equals("anime")) {
                    this.B.invoke(k.j0(str2, "anime_"));
                }
                break;
            case 104087344:
                if (str.equals("movie") && (numQ2 = r.Q(k.j0(str2, "movie_"))) != null) {
                    this.y.invoke(numQ2);
                }
                break;
            case 184289973:
                if (str.equals("live_tv")) {
                    if (strJ0 == null) {
                        strJ0 = fVar.k;
                    }
                    String strS0 = k.s0(str2, "_", "");
                    if (strJ0 != null) {
                        this.A.invoke(strJ0, fVar.c, strS0);
                    }
                }
                break;
            case 1505733281:
                if (str.equals("music_artist")) {
                    this.D.invoke(k.j0(str2, "music_artist_"));
                }
                break;
            case 1572397013:
                if (str.equals("music_album")) {
                    this.C.invoke(k.j0(str2, "music_album_"));
                }
                break;
        }
        return y.a;
    }
}
