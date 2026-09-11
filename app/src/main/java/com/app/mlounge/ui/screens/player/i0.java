package com.app.mlounge.ui.screens.player;

import androidx.compose.animation.core.v1;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.d1;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.u2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.emulator.LibretroCore;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final Object a = kotlin.collections.a0.v(new kotlin.k("en", "English"), new kotlin.k("fr", "French"), new kotlin.k("de", "German"), new kotlin.k("es", "Spanish"), new kotlin.k("it", "Italian"), new kotlin.k("pt", "Portuguese"), new kotlin.k("ru", "Russian"), new kotlin.k("ja", "Japanese"), new kotlin.k("ko", "Korean"), new kotlin.k("zh", "Chinese"), new kotlin.k("ar", "Arabic"), new kotlin.k("hi", "Hindi"), new kotlin.k("nl", "Dutch"), new kotlin.k("pl", "Polish"), new kotlin.k("sv", "Swedish"), new kotlin.k("da", "Danish"), new kotlin.k("fi", "Finnish"), new kotlin.k("no", "Norwegian"), new kotlin.k("cs", "Czech"), new kotlin.k("hu", "Hungarian"), new kotlin.k("ro", "Romanian"), new kotlin.k("vi", "Vietnamese"), new kotlin.k("th", "Thai"), new kotlin.k("tr", "Turkish"), new kotlin.k("el", "Greek"), new kotlin.k("he", "Hebrew"), new kotlin.k("id", "Indonesian"), new kotlin.k("ms", "Malay"), new kotlin.k("uk", "Ukrainian"), new kotlin.k("bg", "Bulgarian"), new kotlin.k("sr", "Serbian"), new kotlin.k("hr", "Croatian"), new kotlin.k("sk", "Slovak"), new kotlin.k("sl", "Slovenian"), new kotlin.k("lt", "Lithuanian"), new kotlin.k("lv", "Latvian"), new kotlin.k("et", "Estonian"), new kotlin.k("ca", "Catalan"), new kotlin.k("gl", "Galician"), new kotlin.k("eu", "Basque"), new kotlin.k("af", "Afrikaans"), new kotlin.k("sw", "Swahili"), new kotlin.k("tl", "Filipino"), new kotlin.k("mn", "Mongolian"), new kotlin.k("ne", "Nepali"), new kotlin.k("sq", "Albanian"), new kotlin.k("hy", "Armenian"), new kotlin.k("ka", "Georgian"), new kotlin.k("fa", "Persian"), new kotlin.k("ur", "Urdu"), new kotlin.k("am", "Amharic"), new kotlin.k("my", "Burmese"), new kotlin.k("km", "Khmer"), new kotlin.k("lo", "Lao"), new kotlin.k("si", "Sinhala"), new kotlin.k("ta", "Tamil"), new kotlin.k("te", "Telugu"), new kotlin.k("kn", "Kannada"), new kotlin.k("ml", "Malayalam"), new kotlin.k("mr", "Marathi"), new kotlin.k("gu", "Gujarati"), new kotlin.k("pa", "Punjabi"), new kotlin.k("bn", "Bengali"), new kotlin.k("bo", "Tibetan"), new kotlin.k("ps", "Pashto"), new kotlin.k("tk", "Turkmen"), new kotlin.k("uz", "Uzbek"), new kotlin.k("kk", "Kazakh"), new kotlin.k("ky", "Kyrgyz"), new kotlin.k("tg", "Tajik"), new kotlin.k("az", "Azerbaijani"), new kotlin.k("be", "Belarusian"), new kotlin.k("is", "Icelandic"), new kotlin.k("ga", "Irish"), new kotlin.k("cy", "Welsh"), new kotlin.k("mt", "Maltese"), new kotlin.k("lb", "Luxembourgish"), new kotlin.k("mk", "Macedonian"), new kotlin.k("bs", "Bosnian"), new kotlin.k("oc", "Occitan"), new kotlin.k("la", "Latin"), new kotlin.k("eo", "Esperanto"));

    public static void a(z0 z0Var, a aVar) {
        aVar.getClass();
        androidx.media3.exoplayer.c0 c0Var = z0Var.g;
        if (c0Var != null) {
            androidx.media3.common.x0 x0Var = new androidx.media3.common.x0(((androidx.media3.common.b1) c0Var.m().a.get(aVar.b)).b, aVar.c);
            androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
            jVar.getClass();
            androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
            iVar.e(x0Var);
            c0Var.O(iVar.a());
        }
        z0Var.j("audio", false);
    }

    public static final void b(List list, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        list.getClass();
        lVar.getClass();
        aVar.getClass();
        rVar.c0(102932368);
        int i2 = (rVar.h(list) ? 4 : 2) | i | (rVar.h(lVar) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            t1.a(aVar, new androidx.compose.ui.window.w(3, false, false), androidx.compose.runtime.internal.k.c(-366070041, new v(aVar, list, lVar), rVar), rVar, ((i2 >> 6) & 14) | 432, 0);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new v(list, lVar, aVar, i, 1);
        }
    }

    public static final void c(final long j, final boolean z, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, final int i) {
        long jB;
        aVar.getClass();
        rVar.c0(-1045678862);
        int i2 = i | (rVar.e(j) ? 4 : 2) | (rVar.g(z) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            androidx.compose.runtime.y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
            androidx.compose.ui.r rVarL = androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, 32);
            androidx.compose.foundation.shape.d dVar = androidx.compose.foundation.shape.e.a;
            androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(rVarL, j, dVar);
            float f = (((Boolean) y0VarG.getValue()).booleanValue() || z) ? 3 : 1;
            if (((Boolean) y0VarG.getValue()).booleanValue()) {
                jB = com.app.mlounge.ui.theme.b.q;
            } else {
                jB = z ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.b(0.3f, androidx.compose.ui.graphics.t.d);
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(androidx.compose.foundation.s.g(rVarF, f, jB, dVar), kVar, null, false, null, aVar, 28), kVar, 1), rVar, 0);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(j, z, aVar, i) { // from class: com.app.mlounge.ui.screens.player.l
                public final /* synthetic */ long e;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ kotlin.jvm.functions.a z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    i0.c(this.e, this.y, this.z, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void d(String str, androidx.compose.ui.graphics.vector.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar2, int i) {
        rVar.getClass();
        aVar.getClass();
        rVar2.c0(2046887946);
        int i2 = i | (rVar2.f(fVar) ? 32 : 16) | (rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar2.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f = 8;
            f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(androidx.compose.foundation.s.g(rVar, 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar2, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f)), kVar, null, false, null, aVar, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(555748943, new androidx.compose.foundation.contextmenu.f(21, fVar, str), rVar2), rVar2, 12583296, 120);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(str, fVar, rVar, aVar, i);
        }
    }

    public static final void e(String str, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        androidx.compose.runtime.r rVar2 = rVar;
        aVar.getClass();
        rVar2.c0(-916936596);
        int i2 = i | (rVar2.h(aVar) ? 32 : 16);
        if (rVar2.T(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.w0.d(androidx.compose.ui.o.b, 1.0f), 16);
            androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.e, androidx.compose.ui.c.H, rVar2, 54);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, t0VarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            p3.b(str, null, androidx.compose.ui.graphics.t.d, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).g, rVar2, 1573254, 0, 131002);
            rVar2 = rVar2;
            f(androidx.room.r.l(), aVar, rVar2, i2 & Token.ASSIGN_MOD);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.v(str, aVar, i, 3);
        }
    }

    public static final void f(androidx.compose.ui.graphics.vector.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        aVar.getClass();
        rVar.c0(-1794377093);
        int i2 = (rVar.f(fVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= rVar.h(aVar) ? 32 : 16;
        }
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            t2.e(aVar, androidx.compose.foundation.s.g(androidx.compose.ui.o.b, 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a), false, null, kVar, null, androidx.compose.runtime.internal.k.c(469856153, new androidx.compose.animation.core.g0(fVar, 21), rVar), rVar, ((i2 >> 3) & 14) | 1597440, 44);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new v1(fVar, aVar, i, 12);
        }
    }

    public static final void g(androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar2, int i) {
        rVar.getClass();
        aVar.getClass();
        rVar2.c0(580592521);
        int i2 = (rVar2.f(rVar) ? 4 : 2) | i | (rVar2.h(aVar) ? 32 : 16);
        if (rVar2.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ = rVar2.Q();
            if (z || objQ == androidx.compose.runtime.m.a) {
                objQ = new j2(12, aVar);
                rVar2.l0(objQ);
            }
            f3.a(androidx.compose.foundation.s.j(rVar, false, null, (kotlin.jvm.functions.a) objQ, 15), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.f, 0L, 0.0f, 6, b.a, rVar2, 12779904, 88);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(rVar, aVar, i, 22);
        }
    }

    public static final void h(String str, androidx.compose.runtime.r rVar, int i) {
        String str2 = str;
        androidx.compose.runtime.r rVar2 = rVar;
        rVar2.c0(-306493835);
        int i2 = i | (rVar2.f(str2) ? 4 : 2);
        if (rVar2.T(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(androidx.compose.foundation.layout.w0.c, androidx.compose.ui.graphics.t.b(0.8f, androidx.compose.ui.graphics.t.b), androidx.compose.ui.graphics.a0.b);
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.compose.runtime.saveable.f(24);
                rVar2.l0(objQ);
            }
            androidx.compose.ui.r rVarJ = androidx.compose.foundation.s.j(rVarF, false, null, (kotlin.jvm.functions.a) objQ, 14);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarJ);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar2, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar2, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar2, 48);
            int iHashCode2 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, oVar);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, vVarA, eVar);
            androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
            androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
            o2.a(androidx.compose.foundation.layout.w0.l(oVar, 48), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar2, 54, 60);
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, 24));
            u2 u2Var = u3.a;
            androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u2Var)).h;
            long j = androidx.compose.ui.graphics.t.d;
            p3.b("Auto-Playing Next Episode", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 390, 0, 131066);
            androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.f(oVar, 8));
            str2 = str;
            p3.b(str2, null, androidx.compose.ui.graphics.t.b(0.7f, j), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).k, rVar, (i2 & 14) | 384, 0, 131066);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.components.s(str2, i, 8);
        }
    }

    public static final void i(String str, androidx.compose.ui.graphics.vector.f fVar, boolean z, String str2, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        String str5;
        String str6;
        androidx.compose.runtime.r rVar2 = rVar;
        aVar.getClass();
        rVar2.c0(1561967658);
        if ((i & 6) == 0) {
            str3 = str;
            i3 = i | (rVar2.f(str3) ? 4 : 2);
        } else {
            str3 = str;
            i3 = i;
        }
        int i5 = i3 | (rVar2.f(fVar) ? 32 : 16) | (rVar2.g(z) ? LibretroCore.SCREEN_WIDTH : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            str4 = str2;
        } else {
            str4 = str2;
            i4 = i5 | (rVar2.f(str4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        int i7 = i4 | (rVar2.h(aVar) ? 16384 : 8192);
        if (rVar2.T(i7 & 1, (i7 & 9363) != 9362)) {
            String str7 = i6 != 0 ? null : str4;
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            androidx.compose.runtime.y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar, 1.0f);
            float f = 2;
            long j = ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
            float f2 = 8;
            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD, f, j, androidx.compose.foundation.shape.e.a(f2)), z ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2)), kVar, null, false, null, aVar, 28), kVar, 1), 16);
            androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar2, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
            float f3 = 20;
            f1.b(fVar, null, androidx.compose.foundation.layout.w0.l(oVar, f3), z ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.b(0.6f, androidx.compose.ui.graphics.t.d), rVar2, ((i7 >> 3) & 14) | 432, 0);
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.p(oVar, 12));
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
            int iHashCode2 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, h0Var);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, vVarA, eVar);
            androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
            androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
            p3.b(str3, null, z ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.d, 0L, z ? androidx.compose.ui.text.font.l.C : androidx.compose.ui.text.font.l.z, 0L, null, 0L, 0, false, 0, 0, null, rVar, i7 & 14, 0, 262074);
            rVar2 = rVar;
            if (str7 != null) {
                rVar2.b0(-453014236);
                String str8 = str7;
                p3.b(str8, null, androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.d), h1.r(11), null, 0L, null, 0L, 0, false, 0, 0, null, rVar, ((i7 >> 9) & 14) | 24960, 0, 262122);
                str6 = str8;
                rVar2 = rVar;
            } else {
                str6 = str7;
                rVar2.b0(-1158477922);
            }
            rVar2.p(false);
            rVar2.p(true);
            if (z) {
                rVar2.b0(-1968044064);
                f1.b(_COROUTINE.a.u(), null, androidx.compose.foundation.layout.w0.l(oVar, f3), com.app.mlounge.ui.theme.b.f, rVar2, 3504, 0);
            } else {
                rVar2.b0(-1967963340);
            }
            rVar2.p(false);
            rVar2.p(true);
            str5 = str6;
        } else {
            rVar2.W();
            str5 = str4;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.components.u(str, fVar, z, str5, aVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void j(final androidx.compose.ui.graphics.vector.f fVar, final String str, float f, long j, androidx.compose.ui.focus.y yVar, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, final int i, final int i2) {
        int i3;
        final float f2;
        int i4;
        long j2;
        int i5;
        int i6;
        androidx.compose.ui.focus.y yVar2;
        int i7;
        boolean z;
        final long j3;
        final androidx.compose.ui.focus.y yVar3;
        q1 q1VarT;
        final float f3;
        final long j4;
        androidx.compose.ui.focus.y yVar4;
        Object objQ;
        androidx.compose.runtime.y0 y0VarG;
        androidx.compose.ui.r rVarK;
        long j5;
        int i8;
        aVar.getClass();
        rVar.c0(-1525533955);
        if ((i & 6) == 0) {
            i3 = (rVar.f(fVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar.f(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= rVar.c(f2) ? LibretroCore.SCREEN_WIDTH : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    j2 = j;
                    if (rVar.e(j2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        yVar2 = yVar;
                        if (rVar.f(yVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) != 0) {
                        if (rVar.h(aVar)) {
                            i8 = 131072;
                        } else {
                            i8 = Parser.ARGC_LIMIT;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (rVar.T(i3 & 1, z)) {
                        if (i9 != 0) {
                            f3 = 44;
                        } else {
                            f3 = f2;
                        }
                        if (i4 != 0) {
                            j4 = androidx.compose.ui.graphics.t.d;
                        } else {
                            j4 = j2;
                        }
                        if (i6 != 0) {
                            yVar4 = null;
                        } else {
                            yVar4 = yVar2;
                        }
                        objQ = rVar.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
                        rVarK = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarL = androidx.compose.foundation.layout.w0.l(rVarK, f3);
                        if (yVar4 != null) {
                            rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                        }
                        androidx.compose.ui.r rVarD = rVarL.d(rVarK);
                        float f4 = 2;
                        if (((Boolean) y0VarG.getValue()).booleanValue()) {
                            j5 = com.app.mlounge.ui.theme.b.q;
                        } else {
                            j5 = androidx.compose.ui.graphics.t.h;
                        }
                        androidx.compose.foundation.shape.d dVar = androidx.compose.foundation.shape.e.a;
                        t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD, f4, j5, dVar), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar), false, null, kVar, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.y
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    f1.b(fVar, str, androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, f3 * 0.6f), j4, rVar2, 0, 0);
                                } else {
                                    rVar2.W();
                                }
                                return kotlin.y.a;
                            }
                        }, rVar), rVar, ((i3 >> 15) & 14) | 1597440, 44);
                        yVar3 = yVar4;
                        f2 = f3;
                        j3 = j4;
                    } else {
                        rVar.W();
                        j3 = j2;
                        yVar3 = yVar2;
                    }
                    q1VarT = rVar.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.z
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                i0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                yVar2 = yVar;
                if ((196608 & i) != 0) {
                    if (rVar.h(aVar)) {
                        i8 = 131072;
                    } else {
                        i8 = Parser.ARGC_LIMIT;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (rVar.T(i3 & 1, z)) {
                    if (i9 != 0) {
                        f3 = 44;
                    } else {
                        f3 = f2;
                    }
                    if (i4 != 0) {
                        j4 = androidx.compose.ui.graphics.t.d;
                    } else {
                        j4 = j2;
                    }
                    if (i6 != 0) {
                        yVar4 = null;
                    } else {
                        yVar4 = yVar2;
                    }
                    objQ = rVar.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ;
                    y0VarG = android.support.v4.media.session.b.g(kVar2, rVar, 6);
                    rVarK = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarL2 = androidx.compose.foundation.layout.w0.l(rVarK, f3);
                    if (yVar4 != null) {
                        rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                    }
                    androidx.compose.ui.r rVarD2 = rVarL2.d(rVarK);
                    float f5 = 2;
                    if (((Boolean) y0VarG.getValue()).booleanValue()) {
                        j5 = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j5 = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                    t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD2, f5, j5, dVar2), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar2), false, null, kVar2, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.y
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                f1.b(fVar, str, androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, f3 * 0.6f), j4, rVar2, 0, 0);
                            } else {
                                rVar2.W();
                            }
                            return kotlin.y.a;
                        }
                    }, rVar), rVar, ((i3 >> 15) & 14) | 1597440, 44);
                    yVar3 = yVar4;
                    f2 = f3;
                    j3 = j4;
                } else {
                    rVar.W();
                    j3 = j2;
                    yVar3 = yVar2;
                }
                q1VarT = rVar.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.z
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            i0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            j2 = j;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    yVar2 = yVar;
                    if (rVar.f(yVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) != 0) {
                    if (rVar.h(aVar)) {
                        i8 = 131072;
                    } else {
                        i8 = Parser.ARGC_LIMIT;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (rVar.T(i3 & 1, z)) {
                    if (i9 != 0) {
                        f3 = 44;
                    } else {
                        f3 = f2;
                    }
                    if (i4 != 0) {
                        j4 = androidx.compose.ui.graphics.t.d;
                    } else {
                        j4 = j2;
                    }
                    if (i6 != 0) {
                        yVar4 = null;
                    } else {
                        yVar4 = yVar2;
                    }
                    objQ = rVar.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ;
                    y0VarG = android.support.v4.media.session.b.g(kVar3, rVar, 6);
                    rVarK = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarL3 = androidx.compose.foundation.layout.w0.l(rVarK, f3);
                    if (yVar4 != null) {
                        rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                    }
                    androidx.compose.ui.r rVarD3 = rVarL3.d(rVarK);
                    float f6 = 2;
                    if (((Boolean) y0VarG.getValue()).booleanValue()) {
                        j5 = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j5 = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.foundation.shape.d dVar3 = androidx.compose.foundation.shape.e.a;
                    t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD3, f6, j5, dVar3), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar3), false, null, kVar3, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.y
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                f1.b(fVar, str, androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, f3 * 0.6f), j4, rVar2, 0, 0);
                            } else {
                                rVar2.W();
                            }
                            return kotlin.y.a;
                        }
                    }, rVar), rVar, ((i3 >> 15) & 14) | 1597440, 44);
                    yVar3 = yVar4;
                    f2 = f3;
                    j3 = j4;
                } else {
                    rVar.W();
                    j3 = j2;
                    yVar3 = yVar2;
                }
                q1VarT = rVar.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.z
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            i0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            yVar2 = yVar;
            if ((196608 & i) != 0) {
                if (rVar.h(aVar)) {
                    i8 = 131072;
                } else {
                    i8 = Parser.ARGC_LIMIT;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (rVar.T(i3 & 1, z)) {
                if (i9 != 0) {
                    f3 = 44;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    j4 = androidx.compose.ui.graphics.t.d;
                } else {
                    j4 = j2;
                }
                if (i6 != 0) {
                    yVar4 = null;
                } else {
                    yVar4 = yVar2;
                }
                objQ = rVar.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                }
                androidx.compose.foundation.interaction.k kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                y0VarG = android.support.v4.media.session.b.g(kVar4, rVar, 6);
                rVarK = androidx.compose.ui.o.b;
                androidx.compose.ui.r rVarL4 = androidx.compose.foundation.layout.w0.l(rVarK, f3);
                if (yVar4 != null) {
                    rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                }
                androidx.compose.ui.r rVarD4 = rVarL4.d(rVarK);
                float f7 = 2;
                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                    j5 = com.app.mlounge.ui.theme.b.q;
                } else {
                    j5 = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.foundation.shape.d dVar4 = androidx.compose.foundation.shape.e.a;
                t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD4, f7, j5, dVar4), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar4), false, null, kVar4, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.y
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            f1.b(fVar, str, androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, f3 * 0.6f), j4, rVar2, 0, 0);
                        } else {
                            rVar2.W();
                        }
                        return kotlin.y.a;
                    }
                }, rVar), rVar, ((i3 >> 15) & 14) | 1597440, 44);
                yVar3 = yVar4;
                f2 = f3;
                j3 = j4;
            } else {
                rVar.W();
                j3 = j2;
                yVar3 = yVar2;
            }
            q1VarT = rVar.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.z
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 384;
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                j2 = j;
                if (rVar.e(j2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    yVar2 = yVar;
                    if (rVar.f(yVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) != 0) {
                    if (rVar.h(aVar)) {
                        i8 = 131072;
                    } else {
                        i8 = Parser.ARGC_LIMIT;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (rVar.T(i3 & 1, z)) {
                    if (i9 != 0) {
                        f3 = 44;
                    } else {
                        f3 = f2;
                    }
                    if (i4 != 0) {
                        j4 = androidx.compose.ui.graphics.t.d;
                    } else {
                        j4 = j2;
                    }
                    if (i6 != 0) {
                        yVar4 = null;
                    } else {
                        yVar4 = yVar2;
                    }
                    objQ = rVar.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                    }
                    androidx.compose.foundation.interaction.k kVar5 = (androidx.compose.foundation.interaction.k) objQ;
                    y0VarG = android.support.v4.media.session.b.g(kVar5, rVar, 6);
                    rVarK = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarL5 = androidx.compose.foundation.layout.w0.l(rVarK, f3);
                    if (yVar4 != null) {
                        rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                    }
                    androidx.compose.ui.r rVarD5 = rVarL5.d(rVarK);
                    float f8 = 2;
                    if (((Boolean) y0VarG.getValue()).booleanValue()) {
                        j5 = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j5 = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.foundation.shape.d dVar5 = androidx.compose.foundation.shape.e.a;
                    t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD5, f8, j5, dVar5), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar5), false, null, kVar5, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.y
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                f1.b(fVar, str, androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, f3 * 0.6f), j4, rVar2, 0, 0);
                            } else {
                                rVar2.W();
                            }
                            return kotlin.y.a;
                        }
                    }, rVar), rVar, ((i3 >> 15) & 14) | 1597440, 44);
                    yVar3 = yVar4;
                    f2 = f3;
                    j3 = j4;
                } else {
                    rVar.W();
                    j3 = j2;
                    yVar3 = yVar2;
                }
                q1VarT = rVar.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.z
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            i0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            yVar2 = yVar;
            if ((196608 & i) != 0) {
                if (rVar.h(aVar)) {
                    i8 = 131072;
                } else {
                    i8 = Parser.ARGC_LIMIT;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (rVar.T(i3 & 1, z)) {
                if (i9 != 0) {
                    f3 = 44;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    j4 = androidx.compose.ui.graphics.t.d;
                } else {
                    j4 = j2;
                }
                if (i6 != 0) {
                    yVar4 = null;
                } else {
                    yVar4 = yVar2;
                }
                objQ = rVar.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                }
                androidx.compose.foundation.interaction.k kVar6 = (androidx.compose.foundation.interaction.k) objQ;
                y0VarG = android.support.v4.media.session.b.g(kVar6, rVar, 6);
                rVarK = androidx.compose.ui.o.b;
                androidx.compose.ui.r rVarL6 = androidx.compose.foundation.layout.w0.l(rVarK, f3);
                if (yVar4 != null) {
                    rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                }
                androidx.compose.ui.r rVarD6 = rVarL6.d(rVarK);
                float f9 = 2;
                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                    j5 = com.app.mlounge.ui.theme.b.q;
                } else {
                    j5 = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.foundation.shape.d dVar6 = androidx.compose.foundation.shape.e.a;
                t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD6, f9, j5, dVar6), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar6), false, null, kVar6, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.y
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            f1.b(fVar, str, androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, f3 * 0.6f), j4, rVar2, 0, 0);
                        } else {
                            rVar2.W();
                        }
                        return kotlin.y.a;
                    }
                }, rVar), rVar, ((i3 >> 15) & 14) | 1597440, 44);
                yVar3 = yVar4;
                f2 = f3;
                j3 = j4;
            } else {
                rVar.W();
                j3 = j2;
                yVar3 = yVar2;
            }
            q1VarT = rVar.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.z
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 3072;
        j2 = j;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                yVar2 = yVar;
                if (rVar.f(yVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) != 0) {
                if (rVar.h(aVar)) {
                    i8 = 131072;
                } else {
                    i8 = Parser.ARGC_LIMIT;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (rVar.T(i3 & 1, z)) {
                if (i9 != 0) {
                    f3 = 44;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    j4 = androidx.compose.ui.graphics.t.d;
                } else {
                    j4 = j2;
                }
                if (i6 != 0) {
                    yVar4 = null;
                } else {
                    yVar4 = yVar2;
                }
                objQ = rVar.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                }
                androidx.compose.foundation.interaction.k kVar7 = (androidx.compose.foundation.interaction.k) objQ;
                y0VarG = android.support.v4.media.session.b.g(kVar7, rVar, 6);
                rVarK = androidx.compose.ui.o.b;
                androidx.compose.ui.r rVarL7 = androidx.compose.foundation.layout.w0.l(rVarK, f3);
                if (yVar4 != null) {
                    rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                }
                androidx.compose.ui.r rVarD7 = rVarL7.d(rVarK);
                float f10 = 2;
                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                    j5 = com.app.mlounge.ui.theme.b.q;
                } else {
                    j5 = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.foundation.shape.d dVar7 = androidx.compose.foundation.shape.e.a;
                t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD7, f10, j5, dVar7), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar7), false, null, kVar7, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.y
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            f1.b(fVar, str, androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, f3 * 0.6f), j4, rVar2, 0, 0);
                        } else {
                            rVar2.W();
                        }
                        return kotlin.y.a;
                    }
                }, rVar), rVar, ((i3 >> 15) & 14) | 1597440, 44);
                yVar3 = yVar4;
                f2 = f3;
                j3 = j4;
            } else {
                rVar.W();
                j3 = j2;
                yVar3 = yVar2;
            }
            q1VarT = rVar.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.z
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 24576;
        yVar2 = yVar;
        if ((196608 & i) != 0) {
            if (rVar.h(aVar)) {
                i8 = 131072;
            } else {
                i8 = Parser.ARGC_LIMIT;
            }
            i3 |= i8;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rVar.T(i3 & 1, z)) {
            if (i9 != 0) {
                f3 = 44;
            } else {
                f3 = f2;
            }
            if (i4 != 0) {
                j4 = androidx.compose.ui.graphics.t.d;
            } else {
                j4 = j2;
            }
            if (i6 != 0) {
                yVar4 = null;
            } else {
                yVar4 = yVar2;
            }
            objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar8 = (androidx.compose.foundation.interaction.k) objQ;
            y0VarG = android.support.v4.media.session.b.g(kVar8, rVar, 6);
            rVarK = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarL8 = androidx.compose.foundation.layout.w0.l(rVarK, f3);
            if (yVar4 != null) {
                rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
            }
            androidx.compose.ui.r rVarD8 = rVarL8.d(rVarK);
            float f11 = 2;
            if (((Boolean) y0VarG.getValue()).booleanValue()) {
                j5 = com.app.mlounge.ui.theme.b.q;
            } else {
                j5 = androidx.compose.ui.graphics.t.h;
            }
            androidx.compose.foundation.shape.d dVar8 = androidx.compose.foundation.shape.e.a;
            t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD8, f11, j5, dVar8), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar8), false, null, kVar8, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.y
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        f1.b(fVar, str, androidx.compose.foundation.layout.w0.l(androidx.compose.ui.o.b, f3 * 0.6f), j4, rVar2, 0, 0);
                    } else {
                        rVar2.W();
                    }
                    return kotlin.y.a;
                }
            }, rVar), rVar, ((i3 >> 15) & 14) | 1597440, 44);
            yVar3 = yVar4;
            f2 = f3;
            j3 = j4;
        } else {
            rVar.W();
            j3 = j2;
            yVar3 = yVar2;
        }
        q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.z
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:160:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:162:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:163:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:166:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:167:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:169:0x0ad7  */
    /* JADX WARN: Code duplicated, block: B:170:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:176:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:179:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:181:0x0b1c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0b28  */
    /* JADX WARN: Code duplicated, block: B:185:0x0b2a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0b3a  */
    public static final void k(String str, final o0 o0Var, androidx.compose.ui.focus.y yVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.a aVar3, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.r rVar, int i) {
        int i2;
        final kotlin.jvm.functions.a aVar4;
        androidx.compose.ui.node.y yVar2;
        androidx.compose.runtime.f fVar;
        int i3;
        androidx.compose.ui.node.y yVar3;
        androidx.compose.runtime.f fVar2;
        final int i4;
        int i5;
        androidx.compose.ui.graphics.vector.f fVarW;
        String str2;
        int i6;
        int i7;
        int i8;
        Object objQ;
        int i9;
        int i10;
        int i11;
        Object objQ2;
        boolean z;
        final o0 o0Var2 = o0Var;
        androidx.compose.runtime.r rVar2 = rVar;
        o0Var2.getClass();
        boolean z2 = o0Var2.a;
        yVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        lVar2.getClass();
        rVar2.c0(-573310636);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(o0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.f(yVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar2.h(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= rVar2.h(lVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= rVar2.h(aVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= rVar2.h(lVar2) ? 8388608 : 4194304;
        }
        if (rVar2.T(i2 & 1, (4793491 & i2) != 4793490)) {
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, a0Var);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar4);
            } else {
                rVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar2, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar2, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarE = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.ui.c.y);
            int i12 = i2;
            long j = androidx.compose.ui.graphics.t.b;
            androidx.compose.ui.graphics.t tVar = new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.8f, j));
            long j2 = androidx.compose.ui.graphics.t.h;
            androidx.compose.ui.r rVarE2 = androidx.compose.foundation.s.e(rVarE, com.google.android.material.shape.g.l(com.google.common.base.c.q(tVar, new androidx.compose.ui.graphics.t(j2)), 0.0f, 0.0f, 14));
            float f = 12;
            float f2 = 40;
            float f3 = 8;
            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(rVarE2, f3, f, f3, f2);
            androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
            androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, iVar, rVar2, 48);
            int iHashCode2 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarR);
            rVar2.e0();
            if (rVar2.S) {
                yVar2 = yVar4;
                rVar2.k(yVar2);
            } else {
                yVar2 = yVar4;
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
            androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
            androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
            androidx.compose.ui.graphics.vector.f fVarP = org.jsoup.helper.n.p();
            boolean z3 = (i12 & 7168) == 2048;
            Object objQ3 = rVar2.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
            if (z3 || objQ3 == fVar3) {
                objQ3 = new j2(13, aVar);
                rVar2.l0(objQ3);
            }
            androidx.compose.ui.node.y yVar5 = yVar2;
            j(fVarP, "Back", 0.0f, 0L, null, (kotlin.jvm.functions.a) objQ3, rVar, 48, 28);
            androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.p(oVar, f3));
            androidx.compose.ui.text.m0 m0Var = ((t3) rVar.j(u3.a)).h;
            long j3 = androidx.compose.ui.graphics.t.d;
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            p3.b(str, new androidx.compose.foundation.layout.h0(1.0f, true), j3, 0L, null, 0L, null, 0L, 0, false, 1, 0, m0Var, rVar, (i12 & 14) | 384, 24576, 114680);
            androidx.compose.runtime.r rVar3 = rVar;
            if (o0Var2.l.size() > 1) {
                rVar3.b0(-651135582);
                androidx.compose.ui.graphics.vector.f fVarO = com.google.firebase.b.o();
                boolean z4 = (i12 & 29360128) == 8388608;
                Object objQ4 = rVar3.Q();
                if (z4 || objQ4 == fVar3) {
                    objQ4 = new d(3, lVar2);
                    rVar3.l0(objQ4);
                }
                kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) objQ4;
                fVar = fVar3;
                j(fVarO, "Audio", 0.0f, 0L, null, aVar5, rVar, 48, 28);
                rVar3 = rVar;
                androidx.compose.foundation.layout.b.d(rVar3, androidx.compose.foundation.layout.w0.p(oVar, 4));
                rVar3.p(false);
            } else {
                fVar = fVar3;
                rVar3.b0(-650991432);
                rVar3.p(false);
            }
            androidx.compose.ui.graphics.vector.f fVarU = !o0Var2.m.isEmpty() ? _COROUTINE.b.u() : android.support.v4.media.session.b.y();
            long j4 = o0Var2.n != null ? com.app.mlounge.ui.theme.b.f : j3;
            int i13 = i12 & 29360128;
            boolean z5 = i13 == 8388608;
            Object objQ5 = rVar3.Q();
            if (z5 || objQ5 == fVar) {
                i3 = 4;
                objQ5 = new d(4, lVar2);
                rVar3.l0(objQ5);
            } else {
                i3 = 4;
            }
            j(fVarU, "Subtitles", 0.0f, j4, null, (kotlin.jvm.functions.a) objQ5, rVar, 48, 20);
            float f4 = i3;
            androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.p(oVar, f4));
            androidx.compose.ui.graphics.vector.f fVarR = t1.r();
            boolean z6 = i13 == 8388608;
            Object objQ6 = rVar.Q();
            if (z6 || objQ6 == fVar) {
                objQ6 = new d(5, lVar2);
                rVar.l0(objQ6);
            }
            j(fVarR, "Settings", 0.0f, 0L, null, (kotlin.jvm.functions.a) objQ6, rVar, 48, 28);
            rVar.p(true);
            float f5 = 16;
            androidx.compose.ui.r rVarR2 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.e(androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.ui.c.E), com.google.android.material.shape.g.l(com.google.common.base.c.q(new androidx.compose.ui.graphics.t(j2), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.8f, j))), 0.0f, 0.0f, 14)), f5, f2, f5, f5);
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
            int iHashCode3 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL3 = rVar.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, rVarR2);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar5);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, vVarA, eVar);
            androidx.compose.runtime.s.x(rVar, jVarL3, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar3, rVar, dVar);
            androidx.compose.runtime.s.x(rVar, rVarC3, eVar4);
            m(o0Var.i, o0Var.j, o0Var.z, lVar, aVar3, rVar, (i12 >> 6) & 64512);
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f4, 0.0f, 2);
            androidx.compose.foundation.layout.t0 t0VarA2 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.e, androidx.compose.ui.c.G, rVar, 6);
            int iHashCode4 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL4 = rVar.l();
            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar, rVarQ);
            rVar.e0();
            if (rVar.S) {
                yVar3 = yVar5;
                rVar.k(yVar3);
            } else {
                yVar3 = yVar5;
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, t0VarA2, eVar);
            androidx.compose.runtime.s.x(rVar, jVarL4, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar, eVar3, rVar, dVar);
            androidx.compose.runtime.s.x(rVar, rVarC4, eVar4);
            String strR = r(o0Var.i);
            androidx.compose.ui.node.y yVar6 = yVar3;
            long jR = h1.r(14);
            androidx.compose.ui.text.font.l lVar3 = androidx.compose.ui.text.font.l.C;
            androidx.compose.runtime.f fVar4 = fVar;
            p3.b(strR, null, j3, jR, lVar3, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
            p3.b(r(o0Var.j), null, j3, h1.r(14), lVar3, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
            rVar2 = rVar;
            rVar2.p(true);
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, f));
            androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar, 1.0f);
            androidx.compose.foundation.layout.t0 t0VarA3 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.d, iVar, rVar2, 54);
            int iHashCode5 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL5 = rVar2.l();
            androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar2, rVarD);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar6);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, t0VarA3, eVar);
            androidx.compose.runtime.s.x(rVar2, jVarL5, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar2, eVar3, rVar2, dVar);
            androidx.compose.runtime.s.x(rVar2, rVarC5, eVar4);
            androidx.compose.ui.graphics.vector.f fVarB = _COROUTINE.b.f;
            if (fVarB == null) {
                androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.Replay30", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i14 = androidx.compose.ui.graphics.vector.h0.a;
                androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(j);
                androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                gVar.o(12.0f, 5.0f);
                gVar.r(1.0f);
                gVar.m(7.0f, 6.0f);
                gVar.n(5.0f, 5.0f);
                gVar.r(7.0f);
                gVar.h(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
                gVar.q(-2.69f, 6.0f, -6.0f, 6.0f);
                gVar.q(-6.0f, -2.69f, -6.0f, -6.0f);
                gVar.k(4.0f);
                gVar.h(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                gVar.q(8.0f, -3.58f, 8.0f, -8.0f);
                gVar.p(16.42f, 5.0f, 12.0f, 5.0f);
                gVar.f();
                androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.a, 0, p0Var);
                androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(j);
                androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                gVar2.o(9.56f, 13.49f);
                gVar2.l(0.45f);
                gVar2.h(0.21f, 0.0f, 0.37f, -0.05f, 0.48f, -0.16f);
                gVar2.q(0.16f, -0.25f, 0.16f, -0.43f);
                gVar2.h(0.0f, -0.08f, -0.01f, -0.15f, -0.04f, -0.22f);
                gVar2.q(-0.06f, -0.12f, -0.11f, -0.17f);
                gVar2.q(-0.11f, -0.09f, -0.18f, -0.11f);
                gVar2.q(-0.16f, -0.04f, -0.25f, -0.04f);
                gVar2.h(-0.08f, 0.0f, -0.15f, 0.01f, -0.22f, 0.03f);
                gVar2.q(-0.13f, 0.05f, -0.18f, 0.1f);
                gVar2.q(-0.09f, 0.09f, -0.12f, 0.15f);
                gVar2.q(-0.05f, 0.13f, -0.05f, 0.2f);
                gVar2.k(8.65f);
                gVar2.h(0.0f, -0.18f, 0.04f, -0.34f, 0.11f, -0.48f);
                gVar2.q(0.17f, -0.27f, 0.3f, -0.37f);
                gVar2.q(0.27f, -0.18f, 0.44f, -0.23f);
                gVar2.q(0.35f, -0.08f, 0.54f, -0.08f);
                gVar2.h(0.21f, 0.0f, 0.41f, 0.03f, 0.59f, 0.08f);
                gVar2.q(0.33f, 0.13f, 0.46f, 0.23f);
                gVar2.q(0.23f, 0.23f, 0.3f, 0.38f);
                gVar2.q(0.11f, 0.33f, 0.11f, 0.53f);
                gVar2.h(0.0f, 0.09f, -0.01f, 0.18f, -0.04f, 0.27f);
                gVar2.q(-0.07f, 0.17f, -0.13f, 0.25f);
                gVar2.q(-0.12f, 0.15f, -0.2f, 0.22f);
                gVar2.q(-0.17f, 0.12f, -0.28f, 0.17f);
                gVar2.h(0.24f, 0.09f, 0.42f, 0.21f, 0.54f, 0.39f);
                gVar2.q(0.18f, 0.38f, 0.18f, 0.61f);
                gVar2.h(0.0f, 0.2f, -0.04f, 0.38f, -0.12f, 0.53f);
                gVar2.q(-0.18f, 0.29f, -0.32f, 0.39f);
                gVar2.q(-0.29f, 0.19f, -0.48f, 0.24f);
                gVar2.q(-0.38f, 0.08f, -0.6f, 0.08f);
                gVar2.h(-0.18f, 0.0f, -0.36f, -0.02f, -0.53f, -0.07f);
                gVar2.q(-0.33f, -0.12f, -0.46f, -0.23f);
                gVar2.q(-0.25f, -0.23f, -0.33f, -0.38f);
                gVar2.q(-0.12f, -0.34f, -0.12f, -0.55f);
                gVar2.l(0.85f);
                gVar2.h(0.0f, 0.08f, 0.02f, 0.15f, 0.05f, 0.22f);
                gVar2.q(0.07f, 0.12f, 0.13f, 0.17f);
                gVar2.q(0.12f, 0.09f, 0.2f, 0.11f);
                gVar2.q(0.16f, 0.04f, 0.25f, 0.04f);
                gVar2.h(0.1f, 0.0f, 0.19f, -0.01f, 0.27f, -0.04f);
                gVar2.q(0.15f, -0.07f, 0.2f, -0.12f);
                gVar2.q(0.1f, -0.11f, 0.13f, -0.18f);
                gVar2.q(0.04f, -0.15f, 0.04f, -0.24f);
                gVar2.h(0.0f, -0.11f, -0.02f, -0.21f, -0.05f, -0.29f);
                gVar2.q(-0.08f, -0.15f, -0.14f, -0.2f);
                gVar2.q(-0.13f, -0.09f, -0.22f, -0.11f);
                gVar2.q(-0.18f, -0.04f, -0.29f, -0.04f);
                gVar2.k(9.56f);
                gVar2.r(13.49f);
                gVar2.f();
                androidx.compose.ui.graphics.vector.e.a(eVar5, gVar2.a, 0, p0Var2);
                androidx.compose.ui.graphics.p0 p0Var3 = new androidx.compose.ui.graphics.p0(j);
                androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(15.3f, 14.24f);
                gVarH.h(0.0f, 0.32f, -0.03f, 0.6f, -0.1f, 0.82f);
                gVarH.q(-0.17f, 0.42f, -0.29f, 0.57f);
                gVarH.q(-0.28f, 0.26f, -0.45f, 0.33f);
                gVarH.q(-0.37f, 0.1f, -0.59f, 0.1f);
                gVarH.q(-0.41f, -0.03f, -0.59f, -0.1f);
                gVarH.q(-0.33f, -0.18f, -0.46f, -0.33f);
                gVarH.q(-0.23f, -0.34f, -0.3f, -0.57f);
                gVarH.q(-0.11f, -0.5f, -0.11f, -0.82f);
                gVarH.r(13.5f);
                gVarH.h(0.0f, -0.32f, 0.03f, -0.6f, 0.1f, -0.82f);
                gVarH.q(0.17f, -0.42f, 0.29f, -0.57f);
                gVarH.q(0.28f, -0.26f, 0.45f, -0.33f);
                gVarH.q(0.37f, -0.1f, 0.59f, -0.1f);
                gVarH.q(0.41f, 0.03f, 0.59f, 0.1f);
                gVarH.q(0.33f, 0.18f, 0.46f, 0.33f);
                gVarH.q(0.23f, 0.34f, 0.3f, 0.57f);
                gVarH.q(0.11f, 0.5f, 0.11f, 0.82f);
                gVarH.r(14.24f);
                gVarH.f();
                gVarH.o(14.45f, 13.38f);
                gVarH.h(0.0f, -0.19f, -0.01f, -0.35f, -0.04f, -0.48f);
                gVarH.h(-0.03f, -0.13f, -0.07f, -0.23f, -0.12f, -0.31f);
                gVarH.q(-0.11f, -0.14f, -0.19f, -0.17f);
                gVarH.q(-0.16f, -0.05f, -0.25f, -0.05f);
                gVarH.q(-0.18f, 0.02f, -0.25f, 0.05f);
                gVarH.q(-0.14f, 0.09f, -0.19f, 0.17f);
                gVarH.q(-0.09f, 0.18f, -0.12f, 0.31f);
                gVarH.q(-0.04f, 0.29f, -0.04f, 0.48f);
                gVarH.s(0.97f);
                gVarH.h(0.0f, 0.19f, 0.01f, 0.35f, 0.04f, 0.48f);
                gVarH.q(0.07f, 0.24f, 0.12f, 0.32f);
                gVarH.q(0.11f, 0.14f, 0.19f, 0.17f);
                gVarH.q(0.16f, 0.05f, 0.25f, 0.05f);
                gVarH.q(0.18f, -0.02f, 0.25f, -0.05f);
                gVarH.q(0.14f, -0.09f, 0.19f, -0.17f);
                gVarH.q(0.09f, -0.19f, 0.11f, -0.32f);
                gVarH.h(0.03f, -0.13f, 0.04f, -0.29f, 0.04f, -0.48f);
                gVarH.r(13.38f);
                gVarH.f();
                androidx.compose.ui.graphics.vector.e.a(eVar5, gVarH.a, 0, p0Var3);
                fVarB = eVar5.b();
                _COROUTINE.b.f = fVarB;
            }
            androidx.compose.ui.graphics.vector.f fVar5 = fVarB;
            float f6 = 48;
            int i15 = i12 & 458752;
            int i16 = i12 & 3670016;
            boolean zH = rVar2.h(o0Var) | (i15 == 131072) | (i16 == 1048576);
            Object objQ7 = rVar2.Q();
            if (zH) {
                fVar2 = fVar4;
            } else {
                fVar2 = fVar4;
                if (objQ7 != fVar2) {
                    i4 = 0;
                }
                i5 = i4;
                aVar4 = aVar3;
                j(fVar5, "Rewind", f6, 0L, null, (kotlin.jvm.functions.a) objQ7, rVar2, 432, 24);
                float f7 = 36;
                androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.p(oVar, f7));
                if (z2) {
                    fVarW = com.google.firebase.b.q();
                } else {
                    fVarW = kotlin.math.a.w();
                }
                if (z2) {
                    str2 = "Pause";
                } else {
                    str2 = "Play";
                }
                float f8 = 56;
                if ((i12 & 57344) == 16384) {
                    i6 = 1;
                } else {
                    i6 = i5;
                }
                if (i16 == 1048576) {
                    i7 = 1;
                } else {
                    i7 = i5;
                }
                i8 = i7 | i6;
                objQ = rVar2.Q();
                if (i8 == 0 || objQ == fVar2) {
                    objQ = new com.app.mlounge.ui.screens.movies.g(7, aVar2, aVar4);
                    rVar2.l0(objQ);
                }
                j(fVarW, str2, f8, 0L, yVar, (kotlin.jvm.functions.a) objQ, rVar2, (57344 & (i12 << 6)) | 384, 8);
                androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.p(oVar, f7));
                androidx.compose.ui.graphics.vector.f fVarV = org.jsoup.helper.n.v();
                if (i15 == 131072) {
                    i9 = 1;
                } else {
                    i9 = i5;
                }
                o0Var2 = o0Var;
                int i17 = (rVar2.h(o0Var2) ? 1 : 0) | i9;
                if (i16 == 1048576) {
                    i10 = 1;
                } else {
                    i10 = i5;
                }
                i11 = i17 | i10;
                objQ2 = rVar2.Q();
                if (i11 == 0 || objQ2 == fVar2) {
                    z = true;
                    final boolean z7 = true ? 1 : 0;
                    objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.s
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (z7) {
                                case 0:
                                    lVar.invoke(Long.valueOf(o0Var2.i - ((long) 30000)));
                                    aVar4.invoke();
                                    break;
                                default:
                                    lVar.invoke(Long.valueOf(o0Var2.i + ((long) 30000)));
                                    aVar4.invoke();
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    rVar2.l0(objQ2);
                } else {
                    z = true;
                }
                j(fVarV, "Forward", f6, 0L, null, (kotlin.jvm.functions.a) objQ2, rVar2, 432, 24);
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar2, z, z, z);
            }
            i4 = 0;
            objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.s
                @Override // kotlin.jvm.functions.a
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            lVar.invoke(Long.valueOf(o0Var.i - ((long) 30000)));
                            aVar3.invoke();
                            break;
                        default:
                            lVar.invoke(Long.valueOf(o0Var.i + ((long) 30000)));
                            aVar3.invoke();
                            break;
                    }
                    return kotlin.y.a;
                }
            };
            rVar2.l0(objQ7);
            i5 = i4;
            aVar4 = aVar3;
            j(fVar5, "Rewind", f6, 0L, null, (kotlin.jvm.functions.a) objQ7, rVar2, 432, 24);
            float f9 = 36;
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.p(oVar, f9));
            if (z2) {
                fVarW = com.google.firebase.b.q();
            } else {
                fVarW = kotlin.math.a.w();
            }
            if (z2) {
                str2 = "Pause";
            } else {
                str2 = "Play";
            }
            float f10 = 56;
            if ((i12 & 57344) == 16384) {
                i6 = 1;
            } else {
                i6 = i5;
            }
            if (i16 == 1048576) {
                i7 = 1;
            } else {
                i7 = i5;
            }
            i8 = i7 | i6;
            objQ = rVar2.Q();
            if (i8 == 0) {
                objQ = new com.app.mlounge.ui.screens.movies.g(7, aVar2, aVar4);
                rVar2.l0(objQ);
            } else {
                objQ = new com.app.mlounge.ui.screens.movies.g(7, aVar2, aVar4);
                rVar2.l0(objQ);
            }
            j(fVarW, str2, f10, 0L, yVar, (kotlin.jvm.functions.a) objQ, rVar2, (57344 & (i12 << 6)) | 384, 8);
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.p(oVar, f9));
            androidx.compose.ui.graphics.vector.f fVarV2 = org.jsoup.helper.n.v();
            if (i15 == 131072) {
                i9 = 1;
            } else {
                i9 = i5;
            }
            o0Var2 = o0Var;
            int i18 = (rVar2.h(o0Var2) ? 1 : 0) | i9;
            if (i16 == 1048576) {
                i10 = 1;
            } else {
                i10 = i5;
            }
            i11 = i18 | i10;
            objQ2 = rVar2.Q();
            if (i11 == 0) {
                z = true;
                final int z8 = true ? 1 : 0;
                objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.s
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (z8) {
                            case 0:
                                lVar.invoke(Long.valueOf(o0Var2.i - ((long) 30000)));
                                aVar4.invoke();
                                break;
                            default:
                                lVar.invoke(Long.valueOf(o0Var2.i + ((long) 30000)));
                                aVar4.invoke();
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                rVar2.l0(objQ2);
            } else {
                z = true;
                final int z9 = true ? 1 : 0;
                objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.s
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (z9) {
                            case 0:
                                lVar.invoke(Long.valueOf(o0Var2.i - ((long) 30000)));
                                aVar4.invoke();
                                break;
                            default:
                                lVar.invoke(Long.valueOf(o0Var2.i + ((long) 30000)));
                                aVar4.invoke();
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                rVar2.l0(objQ2);
            }
            j(fVarV2, "Forward", f6, 0L, null, (kotlin.jvm.functions.a) objQ2, rVar2, 432, 24);
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar2, z, z, z);
        } else {
            aVar4 = aVar3;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.runtime.internal.e(str, o0Var2, yVar, aVar, aVar2, lVar, aVar4, lVar2, i, 1);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 24061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    public static final void l(java.lang.String r39, java.lang.String r40, java.util.Map r41, java.lang.String r42, java.lang.String r43, int r44, int r45, int r46, java.lang.String r47, kotlin.jvm.functions.a r48, kotlin.jvm.functions.r r49, com.app.mlounge.ui.screens.player.z0 r50, androidx.compose.runtime.r r51, int r52) {
        /*
            Method dump skipped, instruction units count: 2406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.player.i0.l(java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, int, int, int, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.r, com.app.mlounge.ui.screens.player.z0, androidx.compose.runtime.r, int):void");
    }

    public static final void m(final long j, final long j2, final boolean z, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, final int i) {
        int i2;
        kotlin.jvm.functions.l lVar2;
        Object e0Var;
        d1 d1Var;
        int i3;
        int i4;
        int i5;
        androidx.compose.runtime.y0 y0Var;
        Object f0Var;
        final boolean z2;
        androidx.compose.ui.o oVar;
        long j3;
        lVar.getClass();
        aVar.getClass();
        rVar.c0(1845836079);
        if ((i & 6) == 0) {
            i2 = (rVar.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.e(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.g(z) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            lVar2 = lVar;
            i2 |= rVar.h(lVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            lVar2 = lVar;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar.h(aVar) ? 16384 : 8192;
        }
        if (rVar.T(i2 & 1, (i2 & 9363) != 9362)) {
            float fB = j2 > 0 ? com.google.android.material.resources.c.b(j / j2, 0.0f, 1.0f) : 0.0f;
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ);
            }
            androidx.compose.runtime.y0 y0Var2 = (androidx.compose.runtime.y0) objQ;
            Object objQ2 = rVar.Q();
            if (objQ2 == fVar) {
                objQ2 = new d1(0.0f);
                rVar.l0(objQ2);
            }
            d1 d1Var2 = (d1) objQ2;
            float fG = ((Boolean) y0Var2.getValue()).booleanValue() ? d1Var2.g() : fB;
            Boolean bool = (Boolean) y0Var2.getValue();
            bool.getClass();
            Float fValueOf = Float.valueOf(d1Var2.g());
            int i6 = i2 & Token.ASSIGN_MOD;
            int i7 = i2 & 896;
            int i8 = i2 & 7168;
            boolean z3 = (i6 == 32) | (i7 == 256) | (i8 == 2048);
            Object objQ3 = rVar.Q();
            if (z3 || objQ3 == fVar) {
                d1Var = d1Var2;
                i3 = i6;
                i4 = i2;
                i5 = LibretroCore.SCREEN_WIDTH;
                e0Var = new e0(j2, z, lVar2, y0Var2, d1Var, null);
                y0Var = y0Var2;
                rVar.l0(e0Var);
            } else {
                i4 = i2;
                e0Var = objQ3;
                i3 = i6;
                i5 = LibretroCore.SCREEN_WIDTH;
                y0Var = y0Var2;
                d1Var = d1Var2;
            }
            androidx.compose.runtime.j0.d(bool, fValueOf, (kotlin.jvm.functions.p) e0Var, rVar);
            Object objQ4 = rVar.Q();
            if (objQ4 == fVar) {
                objQ4 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ4;
            androidx.compose.runtime.y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
            androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
            float f = 32;
            androidx.compose.ui.r rVarF = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar2, 1.0f), f);
            Long lValueOf = Long.valueOf(j2);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i9 = i4 & 57344;
            boolean z4 = (i3 == 32) | (i7 == i5) | (i8 == 2048) | (i9 == 16384);
            Object objQ5 = rVar.Q();
            if (z4 || objQ5 == fVar) {
                z2 = z;
                oVar = oVar2;
                f0Var = new f0(j2, z2, lVar, aVar);
                rVar.l0(f0Var);
            } else {
                oVar = oVar2;
                f0Var = objQ5;
                z2 = z;
            }
            androidx.compose.ui.input.pointer.m mVar = androidx.compose.ui.input.pointer.h0.a;
            androidx.compose.ui.r rVarD = rVarF.d(new androidx.compose.ui.input.pointer.g0(lValueOf, boolValueOf, (PointerInputEventHandler) f0Var, 4));
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.A, false);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarD);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar, rVarC, eVar4);
            androidx.compose.ui.r rVarF2 = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), 4);
            final float f2 = fG;
            boolean zC = (i7 == 256) | rVar.c(f2);
            Object objQ6 = rVar.Q();
            if (zC || objQ6 == fVar) {
                objQ6 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.player.a0
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        long j4;
                        float f3;
                        androidx.compose.ui.graphics.drawscope.d dVar2 = (androidx.compose.ui.graphics.drawscope.d) obj;
                        dVar2.getClass();
                        boolean z5 = z2;
                        if (z5) {
                            j4 = androidx.compose.ui.graphics.t.d;
                            f3 = 0.3f;
                        } else {
                            j4 = androidx.compose.ui.graphics.t.c;
                            f3 = 0.2f;
                        }
                        long jB = androidx.compose.ui.graphics.t.b(f3, j4);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.i0() & 4294967295L)))) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.d() >> 32));
                        dVar2.y(jB, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.i0() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), Float.intBitsToFloat((int) (dVar2.d() & 4294967295L)), (LibretroCore.PSP_SCREEN_WIDTH & 16) != 0 ? 0 : 1);
                        float f4 = f2;
                        if (f4 > 0.0f) {
                            long j5 = z5 ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.c;
                            long j6 = j5;
                            dVar2.y(j6, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.i0() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.d() >> 32)) * f4)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.i0() & 4294967295L)))) & 4294967295L), Float.intBitsToFloat((int) (dVar2.d() & 4294967295L)), (LibretroCore.PSP_SCREEN_WIDTH & 16) != 0 ? 0 : 1);
                        }
                        return kotlin.y.a;
                    }
                };
                rVar.l0(objQ6);
            }
            androidx.compose.foundation.s.b(rVarF2, (kotlin.jvm.functions.l) objQ6, rVar, 6);
            if (f2 < 0.01f) {
                f2 = 0.01f;
            }
            androidx.compose.ui.r rVarF3 = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar, f2), f);
            androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.C, false);
            int iHashCode2 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarF3);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, q0VarD2, eVar);
            androidx.compose.runtime.s.x(rVar, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar);
            androidx.compose.runtime.s.x(rVar, rVarC2, eVar4);
            androidx.compose.ui.r rVarL = androidx.compose.foundation.layout.w0.l(oVar, ((Boolean) y0VarG.getValue()).booleanValue() ? 18 : 16);
            if (z) {
                j3 = ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.d;
            } else {
                j3 = androidx.compose.ui.graphics.t.c;
            }
            androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
            androidx.compose.ui.r rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.g(androidx.compose.foundation.s.f(rVarL, j3, dVar2), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, dVar2), kVar, 1);
            float f3 = fB;
            boolean zC2 = (i9 == 16384) | (i7 == 256) | rVar.c(f3) | (i3 == 32) | (i8 == 2048);
            Object objQ7 = rVar.Q();
            if (zC2 || objQ7 == fVar) {
                objQ7 = new g0(z, aVar, f3, j2, lVar, y0Var, d1Var);
                rVar.l0(objQ7);
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.input.key.c.e(rVarM, (kotlin.jvm.functions.l) objQ7), rVar, 0);
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    i0.m(j, j2, z, lVar, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void n(float f, int i, int i2, long j, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i3) {
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        aVar.getClass();
        rVar.c0(2107898366);
        int i4 = i3 | (rVar.c(f) ? 4 : 2) | (rVar.d(i) ? 32 : 16) | (rVar.d(i2) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.e(j) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar.h(lVar) ? 16384 : 8192) | (rVar.h(lVar2) ? 131072 : Parser.ARGC_LIMIT) | (rVar.h(lVar3) ? 1048576 : 524288) | (rVar.h(lVar4) ? 8388608 : 4194304) | (rVar.h(aVar) ? 67108864 : 33554432);
        if (rVar.T(i4 & 1, (38347923 & i4) != 38347922)) {
            t1.a(aVar, new androidx.compose.ui.window.w(3, false, false), androidx.compose.runtime.internal.k.c(-1518373739, new w(aVar, lVar, f, lVar4, j, i, lVar2, i2, lVar3), rVar), rVar, ((i4 >> 24) & 14) | 432, 0);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new w(f, i, i2, j, lVar, lVar2, lVar3, lVar4, aVar, i3);
        }
    }

    public static final void o(long j, kotlin.jvm.functions.l lVar, androidx.compose.runtime.r rVar, int i) {
        androidx.compose.runtime.r rVar2;
        lVar.getClass();
        rVar.c0(59637880);
        int i2 = (rVar.e(j) ? 4 : 2) | i | (rVar.h(lVar) ? 32 : 16);
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ = rVar.Q();
            if (z || objQ == androidx.compose.runtime.m.a) {
                objQ = new d(6, lVar);
                rVar.l0(objQ);
            }
            rVar2 = rVar;
            t1.a((kotlin.jvm.functions.a) objQ, null, androidx.compose.runtime.internal.k.c(-706254513, new t(j, lVar, 0, (byte) 0), rVar), rVar2, 384, 2);
        } else {
            rVar2 = rVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new t(i, j, lVar);
        }
    }

    public static final void p(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, androidx.compose.runtime.r rVar, int i) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        rVar.c0(-1507009035);
        int i2 = (rVar.h(aVar) ? 4 : 2) | i | (rVar.h(aVar2) ? 32 : 16) | (rVar.h(aVar3) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            t1.a(aVar3, null, androidx.compose.runtime.internal.k.c(1133785470, new u(aVar, aVar2, 0), rVar), rVar, ((i2 >> 6) & 14) | 384, 2);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new w1(aVar, aVar2, aVar3, i, 11);
        }
    }

    public static final void q(final List list, final boolean z, final b1 b1Var, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.a aVar, final kotlin.jvm.functions.a aVar2, final kotlin.jvm.functions.a aVar3, androidx.compose.runtime.r rVar, final int i) {
        list.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        rVar.c0(117735788);
        int i2 = i | (rVar.h(list) ? 4 : 2) | (rVar.g(z) ? 32 : 16) | (rVar.f(b1Var) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar.h(aVar) ? 16384 : 8192) | (rVar.h(aVar2) ? 131072 : Parser.ARGC_LIMIT) | (rVar.h(aVar3) ? 1048576 : 524288);
        if (rVar.T(i2 & 1, (599187 & i2) != 599186)) {
            boolean zF = rVar.f(list);
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            if (zF || objQ == obj) {
                ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b1) it.next()).c);
                }
                List listK0 = kotlin.collections.o.k0(kotlin.collections.o.n0(arrayList));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listK0) {
                    if (!kotlin.text.k.d0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                objQ = kotlin.collections.o.f0(arrayList2, new h0());
                rVar.l0(objQ);
            }
            List list2 = (List) objQ;
            Object objQ2 = rVar.Q();
            if (objQ2 == obj) {
                objQ2 = androidx.compose.runtime.s.r(null);
                rVar.l0(objQ2);
            }
            androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) objQ2;
            Object objQ3 = rVar.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ3);
            }
            androidx.compose.runtime.y0 y0Var2 = (androidx.compose.runtime.y0) objQ3;
            boolean zF2 = rVar.f((String) y0Var.getValue()) | rVar.f(list);
            Object objQ4 = rVar.Q();
            if (zF2 || objQ4 == obj) {
                if (((String) y0Var.getValue()) == null) {
                    objQ4 = list;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list) {
                        if (((b1) obj3).c.equals((String) y0Var.getValue())) {
                            arrayList3.add(obj3);
                        }
                    }
                    objQ4 = arrayList3;
                }
                rVar.l0(objQ4);
            }
            t1.a(aVar3, new androidx.compose.ui.window.w(3, false, false), androidx.compose.runtime.internal.k.c(1088022069, new com.app.mlounge.ui.components.o(z, b1Var, aVar, (List) objQ4, lVar, aVar2, aVar3, y0Var2, list2, y0Var), rVar), rVar, ((i2 >> 18) & 14) | 432, 0);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(list, z, b1Var, lVar, aVar, aVar2, aVar3, i) { // from class: com.app.mlounge.ui.screens.player.r
                public final /* synthetic */ kotlin.jvm.functions.l A;
                public final /* synthetic */ kotlin.jvm.functions.a B;
                public final /* synthetic */ kotlin.jvm.functions.a C;
                public final /* synthetic */ kotlin.jvm.functions.a D;
                public final /* synthetic */ List e;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ b1 z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    i0.q(this.e, this.y, this.z, this.A, this.B, this.C, this.D, (androidx.compose.runtime.r) obj4, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final String r(long j) {
        long j2 = j / ((long) 1000);
        if (j2 < 3600) {
            long j3 = 60;
            return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
        }
        long j4 = 3600;
        long j5 = 60;
        return String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j4), Long.valueOf((j2 % j4) / j5), Long.valueOf(j2 % j5)}, 3));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final String s(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (String) a.get(lowerCase);
        if (str2 == null) {
            return kotlin.text.k.d0(str) ? "Unknown" : str;
        }
        return str2;
    }

    public static final int t(long j) {
        return ((int) ((androidx.compose.ui.graphics.t.e(j) * 255.0f) + 0.5f)) | (((((((int) ((androidx.compose.ui.graphics.t.d(j) * 255.0f) + 0.5f)) << 24) | ((int) ((androidx.compose.ui.graphics.t.h(j) * 255.0f) + 0.5f))) << 16) | ((int) ((androidx.compose.ui.graphics.t.g(j) * 255.0f) + 0.5f))) << 8);
    }
}
