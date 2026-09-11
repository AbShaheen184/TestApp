package com.app.mlounge.ui.screens.player;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements okhttp3.t {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public m0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    @Override // okhttp3.t
    public final okhttp3.g0 a(androidx.compose.foundation.lazy.grid.u uVar) {
        String str;
        String str2;
        String str3;
        okhttp3.b0 b0Var = (okhttp3.b0) uVar.i;
        okhttp3.s sVar = b0Var.a;
        String str4 = sVar.d;
        if (kotlin.text.r.H(str4, "googleusercontent.com", false) || kotlin.text.r.H(str4, "googleapis.com", false)) {
            return uVar.f(b0Var);
        }
        okhttp3.a0 a0VarA = b0Var.a();
        String str5 = this.a;
        if (str5.length() <= 0) {
            str5 = "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36";
        }
        a0VarA.b("User-Agent", str5);
        String str6 = this.b;
        if (str6.length() > 0) {
            a0VarA.b("Referer", str6);
        }
        a0VarA.b("X-Requested-With", "com.android.chrome");
        String strX0 = kotlin.text.k.x0(str4, ".");
        boolean z = true;
        if (!kotlin.text.k.T(str4, "vixsrc", true)) {
            List listQ = com.google.common.base.c.q(".ts", ".m3u8", ".m4s", "/key/", "segment");
            if (!listQ.isEmpty()) {
                Iterator it = listQ.iterator();
                do {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                } while (!kotlin.text.k.T(sVar.i, (String) it.next(), false));
            } else {
                z = false;
                break;
            }
        }
        String str7 = this.c;
        if (str7.length() <= 0) {
            str = this.e;
            str.getClass();
            if ((str.length() <= 0 && (str4.equals(str) || kotlin.text.r.H(str4, ".".concat(str), false))) || z) {
                str2 = this.f;
                if (str2.length() > 0) {
                    a0VarA.b("Origin", str2);
                }
                str3 = this.g;
                if (str3.length() > 0) {
                    a0VarA.b("Cookie", str3);
                }
                if (z) {
                    a0VarA.b("Sec-Fetch-Dest", "empty");
                    a0VarA.b("Sec-Fetch-Mode", "cors");
                    a0VarA.b("Sec-Fetch-Site", "cross-site");
                }
            }
        } else {
            if (!str4.equals(str7) && !kotlin.text.r.H(str4, ".".concat(str7), false)) {
                String str8 = this.d;
                if (str8.length() <= 3 || (!strX0.equals(str8) && !kotlin.text.r.H(strX0, ".".concat(str8), false))) {
                    str = this.e;
                    str.getClass();
                    if (str.length() <= 0) {
                    }
                }
            }
            str2 = this.f;
            if (str2.length() > 0) {
                a0VarA.b("Origin", str2);
            }
            str3 = this.g;
            if (str3.length() > 0) {
                a0VarA.b("Cookie", str3);
            }
            if (z) {
                a0VarA.b("Sec-Fetch-Dest", "empty");
                a0VarA.b("Sec-Fetch-Mode", "cors");
                a0VarA.b("Sec-Fetch-Site", "cross-site");
            }
        }
        okhttp3.g0 g0VarF = uVar.f(new okhttp3.b0(a0VarA));
        if (g0VarF.A == 206) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            kotlin.text.k.z0(sVar.i);
            okhttp3.g0.g("Content-Range", g0VarF);
        }
        return g0VarF;
    }
}
