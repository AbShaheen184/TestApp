package com.app.mlounge.ui.screens.settings;

import androidx.compose.runtime.y0;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements kotlin.jvm.functions.a {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int y;
    public final /* synthetic */ String z;

    public /* synthetic */ o(int i, File file, String str, y0 y0Var, y0 y0Var2) {
        this.y = i;
        this.B = file;
        this.z = str;
        this.A = y0Var;
        this.C = y0Var2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                File file = (File) this.B;
                y0 y0Var = (y0) this.C;
                if (this.y == 0) {
                    this.A.setValue(file);
                } else {
                    y0Var.setValue(new kotlin.k(file, this.z));
                }
                break;
            default:
                kotlin.jvm.functions.s sVar = (kotlin.jvm.functions.s) this.B;
                TmdbEpisode tmdbEpisode = (TmdbEpisode) this.C;
                this.A.setValue(Boolean.FALSE);
                sVar.c("tv", String.valueOf(this.y), this.z, Integer.valueOf(tmdbEpisode.f()), Integer.valueOf(tmdbEpisode.a()));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ o(kotlin.jvm.functions.s sVar, int i, String str, TmdbEpisode tmdbEpisode, y0 y0Var) {
        this.B = sVar;
        this.y = i;
        this.z = str;
        this.C = tmdbEpisode;
        this.A = y0Var;
    }
}
