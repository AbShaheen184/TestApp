package com.app.mlounge.di;

import androidx.compose.foundation.lazy.grid.u;
import com.app.mlounge.data.remote.trakt.TraktManager;
import java.io.IOException;
import kotlin.text.k;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.i0;
import okhttp3.j0;
import okhttp3.s;
import okhttp3.t;
import okio.f;
import okio.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // okhttp3.t
    public final g0 a(u uVar) {
        switch (this.a) {
            case 0:
                a0 a0VarA = ((b0) uVar.i).a();
                a0VarA.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                a0VarA.b("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                return uVar.f(new b0(a0VarA));
            case 1:
                a0 a0VarA2 = ((b0) uVar.i).a();
                a0VarA2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                return uVar.f(new b0(a0VarA2));
            case 2:
                b0 b0Var = (b0) uVar.i;
                com.google.android.material.shape.a0 a0VarG = b0Var.a.g();
                a0VarG.a("api_key", "f3c627493095a7e40ceca68355c94c6d");
                s sVarC = a0VarG.c();
                a0 a0VarA3 = b0Var.a();
                a0VarA3.a = sVarC;
                return uVar.f(new b0(a0VarA3));
            case 3:
                g0 g0VarF = uVar.f((b0) uVar.i);
                String strG = g0.g("Content-Encoding", g0VarF);
                if (strG == null || !strG.equalsIgnoreCase("gzip")) {
                    return g0VarF;
                }
                j0 j0Var = g0VarF.D;
                f fVar = new f();
                p pVar = new p(j0Var.P());
                try {
                    try {
                        fVar.n0(pVar);
                        break;
                    } catch (IOException e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        if (!k.T(message, "gzip finished without exhausting source", false)) {
                            throw e;
                        }
                    }
                    pVar.close();
                    f0 f0VarM = g0VarF.m();
                    f0VarM.f.h("Content-Encoding");
                    f0VarM.f.h("Content-Length");
                    i0 i0Var = j0.y;
                    f0VarM.g = new i0(j0Var.w(), fVar.y, fVar);
                    return f0VarM.a();
                } catch (Throwable th) {
                    pVar.close();
                    throw th;
                }
            default:
                a0 a0VarA4 = ((b0) uVar.i).a();
                a0VarA4.a("trakt-api-key", TraktManager.CLIENT_ID);
                a0VarA4.a("trakt-api-version", "2");
                a0VarA4.a("Content-Type", "application/json");
                return uVar.f(new b0(a0VarA4));
        }
    }
}
