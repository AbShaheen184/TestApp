package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.w0;
import androidx.compose.runtime.q1;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.window.d0;
import com.app.mlounge.emulator.LibretroCore;
import java.io.IOException;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final d0 a = new d0(14);

    public static final void a(androidx.compose.foundation.text.contextmenu.data.g gVar, androidx.compose.foundation.text.contextmenu.data.c cVar, androidx.compose.runtime.r rVar, int i) {
        androidx.compose.runtime.r rVar2;
        Context context;
        rVar.c0(1904307118);
        int i2 = (rVar.f(gVar) ? 4 : 2) | i | (rVar.h(cVar) ? 32 : 16);
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                rVar.b0(-1009482584);
                context = (Context) rVar.j(m0.b);
                rVar.p(false);
            } else {
                rVar.b0(-1009433480);
                rVar.p(false);
                context = null;
            }
            boolean zH = rVar.h(cVar) | ((i2 & 14) == 4) | rVar.h(context);
            Object objQ = rVar.Q();
            if (zH || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.compose.animation.core.a(6, cVar, context, gVar);
                rVar.l0(objQ);
            }
            rVar2 = rVar;
            androidx.compose.foundation.contextmenu.l.b(null, null, (kotlin.jvm.functions.l) objQ, rVar2, 0, 3);
        } else {
            rVar2 = rVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(gVar, cVar, i, 6);
        }
    }

    public static final void b(final int i, final long j, androidx.compose.runtime.r rVar, final int i2) throws XmlPullParserException, IOException {
        int i3;
        final long j2;
        rVar.c0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (rVar.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar.e(j) ? 32 : 16;
        }
        if (rVar.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) rVar.j(m0.b);
            boolean zF = ((i3 & 14) == 4) | rVar.f(context);
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            if (zF || objQ == obj) {
                objQ = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                rVar.l0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            if (iIntValue == -1) {
                q1 q1VarT = rVar.t();
                if (q1VarT != null) {
                    final int i4 = 1;
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.contextmenu.internal.l
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                            int i5 = i4;
                            androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                            ((Integer) obj3).getClass();
                            switch (i5) {
                                case 0:
                                    n.b(i, j, rVar2, androidx.compose.runtime.s.A(i2 | 1));
                                    break;
                                default:
                                    n.b(i, j, rVar2, androidx.compose.runtime.s.A(i2 | 1));
                                    break;
                            }
                            return y.a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z = true;
            j2 = j;
            androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(iIntValue, rVar);
            if ((i3 & Token.ASSIGN_MOD) != 32) {
                z = false;
            }
            Object objQ2 = rVar.Q();
            if (z || objQ2 == obj) {
                objQ2 = j2 == 16 ? null : new androidx.compose.ui.graphics.m(j2, 5);
                rVar.l0(objQ2);
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.f(w0.l(androidx.compose.ui.o.b, androidx.compose.foundation.contextmenu.h.j), bVarQ, 0.0f, (androidx.compose.ui.graphics.m) objQ2, 22), rVar, 0);
        } else {
            j2 = j;
            rVar.W();
        }
        q1 q1VarT2 = rVar.t();
        if (q1VarT2 != null) {
            final int i5 = 0;
            q1VarT2.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.contextmenu.internal.l
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                    int i6 = i5;
                    androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            n.b(i, j2, rVar2, androidx.compose.runtime.s.A(i2 | 1));
                            break;
                        default:
                            n.b(i, j2, rVar2, androidx.compose.runtime.s.A(i2 | 1));
                            break;
                    }
                    return y.a;
                }
            };
        }
    }

    public static final void c(androidx.compose.foundation.text.contextmenu.data.g gVar, androidx.compose.foundation.text.contextmenu.provider.e eVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        int i2;
        rVar.c0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? rVar.f(gVar) : rVar.h(gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? rVar.f(eVar) : rVar.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        boolean z = false;
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i2 & Token.ASSIGN_MOD) == 32 || ((i2 & 64) != 0 && rVar.f(eVar));
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (z2 || objQ == fVar) {
                objQ = new p(new com.app.mlounge.data.music.e(new androidx.activity.compose.f(9, eVar, aVar), 8));
                rVar.l0(objQ);
            }
            p pVar = (p) objQ;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && rVar.h(gVar))) {
                z = true;
            }
            Object objQ2 = rVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new androidx.activity.w(gVar, 11);
                rVar.l0(objQ2);
            }
            androidx.compose.ui.window.o.a(pVar, (kotlin.jvm.functions.a) objQ2, a, androidx.compose.runtime.internal.k.c(1315155414, new androidx.compose.foundation.contextmenu.f(5, eVar, gVar), rVar), rVar, 3456, 0);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.j(gVar, eVar, aVar, i, 4);
        }
    }

    public static final void d(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(1392105195);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(fVar) ? 32 : 16;
        }
        if (rVar2.T(i2 & 1, (i2 & 19) != 18)) {
            okhttp3.internal.platform.android.g.b(rVar, androidx.compose.foundation.text.contextmenu.provider.g.a, fVar, rVar2, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new j(rVar, fVar, i, 2);
        }
    }
}
