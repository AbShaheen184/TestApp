package com.app.mlounge.ui.screens.player;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements okhttp3.t {
    @Override // okhttp3.t
    public final okhttp3.g0 a(androidx.compose.foundation.lazy.grid.u uVar) {
        okhttp3.u uVarH;
        okhttp3.b0 b0Var = (okhttp3.b0) uVar.i;
        okhttp3.g0 g0VarF = uVar.f(b0Var);
        String strG = okhttp3.g0.g("Content-Type", g0VarF);
        if (strG == null) {
            strG = "";
        }
        String str = b0Var.a.i;
        okhttp3.j0 j0Var = g0VarF.D;
        if (j0Var == null || j0Var.m() >= 1048576) {
            return g0VarF;
        }
        if (!kotlin.text.k.T(strG, "mpegurl", true) && !kotlin.text.k.T(str, ".m3u8", false)) {
            return g0VarF;
        }
        String strZ = j0Var.z();
        if (kotlin.text.k.T(strZ, "#EXT-X-STREAM-INF", false)) {
            strZ = kotlin.collections.o.R(kotlin.text.k.g0(strZ), "\n", null, null, new com.app.mlounge.ui.q(29), 30);
        }
        if (kotlin.text.k.T(strG, "octet-stream", false)) {
            strG = "application/vnd.apple.mpegurl";
        }
        okhttp3.f0 f0VarM = g0VarF.m();
        com.caverock.androidsvg.m mVar = f0VarM.f;
        mVar.getClass();
        com.google.android.material.textfield.p.n("Content-Type");
        com.google.android.material.textfield.p.o(strG, "Content-Type");
        mVar.h("Content-Type");
        com.google.android.material.textfield.p.f(mVar, "Content-Type", strG);
        okhttp3.i0 i0Var = okhttp3.j0.y;
        kotlin.text.i iVar = okhttp3.u.e;
        try {
            uVarH = com.google.android.material.resources.c.h(strG);
        } catch (IllegalArgumentException unused) {
            uVarH = null;
        }
        kotlin.k kVarB = com.google.android.material.resources.g.b(uVarH);
        Charset charset = (Charset) kVarB.e;
        okhttp3.u uVar2 = (okhttp3.u) kVarB.y;
        okio.f fVar = new okio.f();
        charset.getClass();
        int length = strZ.length();
        strZ.getClass();
        charset.getClass();
        if (length < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("endIndex < beginIndex: ", length, " < ", 0));
        } else if (length > strZ.length()) {
            net.luminis.tls.engine.impl.c.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("endIndex > string.length: ", length, " > "), strZ.length());
        } else if (charset.equals(kotlin.text.a.a)) {
            fVar.t0(0, length, strZ);
        } else {
            byte[] bytes = strZ.substring(0, length).getBytes(charset);
            bytes.getClass();
            fVar.write(bytes, 0, bytes.length);
        }
        f0VarM.g = new okhttp3.i0(uVar2, fVar.y, fVar);
        return f0VarM.a();
    }
}
