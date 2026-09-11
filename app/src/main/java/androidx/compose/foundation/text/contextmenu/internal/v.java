package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.runtime.q1;
import androidx.compose.ui.platform.m0;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final v a = new v();

    public static String a(TextClassification textClassification, androidx.compose.runtime.r rVar) {
        rVar.b0(950061013);
        String strValueOf = String.valueOf(textClassification.getLabel());
        rVar.p(false);
        return strValueOf;
    }

    public static void b(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            r.a(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static String c(RemoteAction remoteAction, androidx.compose.runtime.r rVar) {
        rVar.b0(-1376593684);
        String string = remoteAction.getTitle().toString();
        rVar.p(false);
        return string;
    }

    public static void f(androidx.compose.foundation.contextmenu.g gVar, Context context, androidx.compose.foundation.text.contextmenu.data.h hVar) {
        if (context == null) {
            return;
        }
        int i = hVar.c;
        TextClassification textClassification = hVar.b;
        if (i < 0) {
            g0 g0Var = new g0(textClassification, 7);
            Drawable icon = textClassification.getIcon();
            androidx.compose.foundation.contextmenu.g.b(gVar, g0Var, icon != null ? new androidx.compose.runtime.internal.f(-1123224187, true, new m(icon, 1)) : null, new androidx.activity.compose.f(11, context, textClassification), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            androidx.compose.foundation.contextmenu.g.b(gVar, new g0(remoteAction, 8), ((i == 0) || remoteAction.shouldShowIcon()) ? new androidx.compose.runtime.internal.f(-1261173016, true, new u(remoteAction)) : null, new androidx.activity.w(remoteAction, 12), 6);
        }
    }

    public final void d(Drawable drawable, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(257732500);
        int i2 = (rVar.h(drawable) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.r rVarL = w0.l(androidx.compose.ui.o.b, androidx.compose.foundation.contextmenu.h.j);
            boolean zH = rVar.h(drawable);
            Object objQ = rVar.Q();
            if (zH || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.activity.compose.g(drawable, 18);
                rVar.l0(objQ);
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.c(rVarL, (kotlin.jvm.functions.l) objQ), rVar, 0);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(this, drawable, i, 7);
        }
    }

    public final void e(final Icon icon, androidx.compose.runtime.r rVar, final int i) {
        q1 q1VarT;
        kotlin.jvm.functions.p pVar;
        rVar.c0(2116504409);
        int i2 = (rVar.h(icon) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) rVar.j(m0.b);
            boolean zF = rVar.f(icon) | rVar.f(context);
            Object objQ = rVar.Q();
            if (zF || objQ == androidx.compose.runtime.m.a) {
                objQ = icon.loadDrawable(context);
                rVar.l0(objQ);
            }
            Drawable drawable = (Drawable) objQ;
            if (drawable == null) {
                q1VarT = rVar.t();
                if (q1VarT == null) {
                    return;
                }
                final int i3 = 0;
                pVar = new kotlin.jvm.functions.p(this, icon, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.internal.t
                    public final /* synthetic */ int e;
                    public final /* synthetic */ v y;
                    public final /* synthetic */ Icon z;

                    {
                        this.e = i3;
                        this.y = this;
                    }

                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = this.e;
                        androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                this.y.e(this.z, rVar2, androidx.compose.runtime.s.A(49));
                                break;
                            default:
                                this.y.e(this.z, rVar2, androidx.compose.runtime.s.A(49));
                                break;
                        }
                        return y.a;
                    }
                };
            } else {
                d(drawable, rVar, 48);
            }
            q1VarT.d = pVar;
        }
        rVar.W();
        q1VarT = rVar.t();
        if (q1VarT != null) {
            final int i4 = 1;
            pVar = new kotlin.jvm.functions.p(this, icon, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.internal.t
                public final /* synthetic */ int e;
                public final /* synthetic */ v y;
                public final /* synthetic */ Icon z;

                {
                    this.e = i4;
                    this.y = this;
                }

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.e;
                    androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            this.y.e(this.z, rVar2, androidx.compose.runtime.s.A(49));
                            break;
                        default:
                            this.y.e(this.z, rVar2, androidx.compose.runtime.s.A(49));
                            break;
                    }
                    return y.a;
                }
            };
            q1VarT.d = pVar;
        }
    }
}
