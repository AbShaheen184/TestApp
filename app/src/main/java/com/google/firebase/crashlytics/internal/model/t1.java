package com.google.firebase.crashlytics.internal.model;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {
    public static androidx.compose.ui.graphics.vector.f a = null;
    public static androidx.compose.ui.graphics.vector.f b = null;
    public static androidx.compose.ui.graphics.vector.f c = null;
    public static androidx.compose.ui.graphics.vector.f d = null;
    public static androidx.compose.ui.graphics.vector.f e = null;
    public static androidx.compose.ui.graphics.vector.f f = null;
    public static androidx.compose.ui.graphics.vector.f g = null;
    public static androidx.compose.ui.graphics.vector.f h = null;
    public static boolean i = false;
    public static Method j = null;
    public static boolean k = true;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;

    public static final void A(Spannable spannable, long j2, androidx.compose.ui.unit.c cVar, int i2, int i3) {
        long jB = androidx.compose.ui.unit.o.b(j2);
        if (androidx.compose.ui.unit.p.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(kotlin.math.a.F(cVar.s0(j2)), false), i2, i3, 33);
        } else if (androidx.compose.ui.unit.p.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(androidx.compose.ui.unit.o.c(j2)), i2, i3, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public static final void B(Spannable spannable, androidx.compose.ui.text.intl.b bVar, int i2, int i3) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(kotlin.collections.p.y(bVar, 10));
            Iterator it = bVar.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.compose.ui.text.intl.a) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i2, i3, 33);
        }
    }

    public static void D(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.b.A(viewGroup, z);
        } else if (k) {
            try {
                androidx.compose.ui.platform.coreshims.b.A(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }

    public static String E(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(F(objArr[i2]));
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(F(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String F(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strK = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strK), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(strK.length() + 8 + name2.length() + 1);
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "<", strK, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x013d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void a(kotlin.jvm.functions.a aVar, androidx.compose.ui.window.w wVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i2, int i3) {
        int i4;
        androidx.compose.ui.window.w wVar2;
        int i5;
        boolean z;
        androidx.compose.ui.window.w wVar3;
        androidx.compose.runtime.q1 q1VarT;
        View view;
        androidx.compose.ui.unit.c cVar;
        androidx.compose.ui.unit.m mVar;
        androidx.compose.runtime.p pVarU;
        androidx.compose.runtime.y0 y0VarV;
        Object objQ;
        Object obj;
        UUID uuid;
        boolean zF;
        Object objQ2;
        androidx.compose.ui.window.v vVar;
        androidx.compose.ui.window.x xVar;
        boolean zH;
        Object objQ3;
        boolean z2;
        boolean zD;
        Object objQ4;
        int i6;
        rVar.c0(826668973);
        if ((i2 & 6) == 0) {
            i4 = (rVar.h(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                wVar2 = wVar;
                i4 |= rVar.f(wVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (rVar.h(fVar)) {
                    i6 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i5 = i4;
            if ((i5 & Token.EXPR_VOID) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (rVar.T(i5 & 1, z)) {
                if (i7 != 0) {
                    wVar3 = new androidx.compose.ui.window.w(7, false, false);
                } else {
                    wVar3 = wVar2;
                }
                view = (View) rVar.j(androidx.compose.ui.platform.m0.f);
                cVar = (androidx.compose.ui.unit.c) rVar.j(androidx.compose.ui.platform.l1.h);
                mVar = (androidx.compose.ui.unit.m) rVar.j(androidx.compose.ui.platform.l1.n);
                pVarU = androidx.compose.runtime.s.u(rVar);
                y0VarV = androidx.compose.runtime.s.v(fVar, rVar);
                Object[] objArr = new Object[0];
                objQ = rVar.Q();
                obj = androidx.compose.runtime.m.a;
                if (objQ == obj) {
                    objQ = androidx.compose.ui.window.e.z;
                    rVar.l0(objQ);
                }
                uuid = (UUID) androidx.compose.runtime.saveable.n.e(objArr, (kotlin.jvm.functions.a) objQ, rVar);
                zF = rVar.f(view) | rVar.f(cVar);
                objQ2 = rVar.Q();
                if (zF || objQ2 == obj) {
                    androidx.compose.ui.window.x xVar2 = new androidx.compose.ui.window.x(aVar, wVar3, view, mVar, cVar, uuid);
                    androidx.compose.runtime.internal.f fVar2 = new androidx.compose.runtime.internal.f(346960332, true, new androidx.compose.animation.f(y0VarV, 4));
                    vVar = xVar2.E;
                    vVar.setParentCompositionContext(pVarU);
                    vVar.G.setValue(fVar2);
                    vVar.K = true;
                    if (vVar.A != null && !vVar.isAttachedToWindow()) {
                        net.luminis.tls.engine.impl.c.r("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                        return;
                    } else {
                        vVar.d();
                        rVar.l0(xVar2);
                        objQ2 = xVar2;
                    }
                }
                xVar = (androidx.compose.ui.window.x) objQ2;
                zH = rVar.h(xVar);
                objQ3 = rVar.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new androidx.compose.ui.window.a(xVar, 0);
                    rVar.l0(objQ3);
                }
                androidx.compose.runtime.j0.b(xVar, (kotlin.jvm.functions.l) objQ3, rVar);
                boolean zH2 = rVar.h(xVar);
                if ((i5 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zD = zH2 | z2 | ((i5 & Token.ASSIGN_MOD) == 32) | rVar.d(mVar.ordinal());
                objQ4 = rVar.Q();
                if (zD || objQ4 == obj) {
                    objQ4 = new androidx.compose.ui.window.b(xVar, aVar, wVar3, mVar);
                    rVar.l0(objQ4);
                }
                androidx.compose.runtime.j0.e((kotlin.jvm.functions.a) objQ4, rVar);
            } else {
                rVar.W();
                wVar3 = wVar2;
            }
            q1VarT = rVar.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.ui.window.c(aVar, wVar3, fVar, i2, i3);
            }
        }
        i4 |= 48;
        wVar2 = wVar;
        if ((i2 & 384) == 0) {
            if (rVar.h(fVar)) {
                i6 = LibretroCore.SCREEN_WIDTH;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        i5 = i4;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rVar.T(i5 & 1, z)) {
            if (i7 != 0) {
                wVar3 = new androidx.compose.ui.window.w(7, false, false);
            } else {
                wVar3 = wVar2;
            }
            view = (View) rVar.j(androidx.compose.ui.platform.m0.f);
            cVar = (androidx.compose.ui.unit.c) rVar.j(androidx.compose.ui.platform.l1.h);
            mVar = (androidx.compose.ui.unit.m) rVar.j(androidx.compose.ui.platform.l1.n);
            pVarU = androidx.compose.runtime.s.u(rVar);
            y0VarV = androidx.compose.runtime.s.v(fVar, rVar);
            Object[] objArr2 = new Object[0];
            objQ = rVar.Q();
            obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = androidx.compose.ui.window.e.z;
                rVar.l0(objQ);
            }
            uuid = (UUID) androidx.compose.runtime.saveable.n.e(objArr2, (kotlin.jvm.functions.a) objQ, rVar);
            zF = rVar.f(view) | rVar.f(cVar);
            objQ2 = rVar.Q();
            if (zF) {
                androidx.compose.ui.window.x xVar3 = new androidx.compose.ui.window.x(aVar, wVar3, view, mVar, cVar, uuid);
                androidx.compose.runtime.internal.f fVar3 = new androidx.compose.runtime.internal.f(346960332, true, new androidx.compose.animation.f(y0VarV, 4));
                vVar = xVar3.E;
                vVar.setParentCompositionContext(pVarU);
                vVar.G.setValue(fVar3);
                vVar.K = true;
                if (vVar.A != null) {
                }
                vVar.d();
                rVar.l0(xVar3);
                objQ2 = xVar3;
            } else {
                androidx.compose.ui.window.x xVar4 = new androidx.compose.ui.window.x(aVar, wVar3, view, mVar, cVar, uuid);
                androidx.compose.runtime.internal.f fVar4 = new androidx.compose.runtime.internal.f(346960332, true, new androidx.compose.animation.f(y0VarV, 4));
                vVar = xVar4.E;
                vVar.setParentCompositionContext(pVarU);
                vVar.G.setValue(fVar4);
                vVar.K = true;
                if (vVar.A != null) {
                }
                vVar.d();
                rVar.l0(xVar4);
                objQ2 = xVar4;
            }
            xVar = (androidx.compose.ui.window.x) objQ2;
            zH = rVar.h(xVar);
            objQ3 = rVar.Q();
            if (zH) {
                objQ3 = new androidx.compose.ui.window.a(xVar, 0);
                rVar.l0(objQ3);
            } else {
                objQ3 = new androidx.compose.ui.window.a(xVar, 0);
                rVar.l0(objQ3);
            }
            androidx.compose.runtime.j0.b(xVar, (kotlin.jvm.functions.l) objQ3, rVar);
            boolean zH3 = rVar.h(xVar);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zD = zH3 | z2 | ((i5 & Token.ASSIGN_MOD) == 32) | rVar.d(mVar.ordinal());
            objQ4 = rVar.Q();
            if (zD) {
                objQ4 = new androidx.compose.ui.window.b(xVar, aVar, wVar3, mVar);
                rVar.l0(objQ4);
            } else {
                objQ4 = new androidx.compose.ui.window.b(xVar, aVar, wVar3, mVar);
                rVar.l0(objQ4);
            }
            androidx.compose.runtime.j0.e((kotlin.jvm.functions.a) objQ4, rVar);
        } else {
            rVar.W();
            wVar3 = wVar2;
        }
        q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.ui.window.c(aVar, wVar3, fVar, i2, i3);
        }
    }

    public static final long b(int i2) {
        if (!(i2 > 0)) {
            androidx.compose.foundation.internal.b.a("The span value should be higher than 0");
        }
        return i2;
    }

    public static final void c(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i2) {
        rVar2.c0(-1854833411);
        int i3 = (rVar2.f(rVar) ? 4 : 2) | i2;
        if (rVar2.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.compose.foundation.text.selection.p0.a;
                rVar2.l0(objQ);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ;
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVar);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0Var, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            fVar.invoke(rVar2, 6);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(rVar, fVar, i2, 8);
        }
    }

    public static final void d(androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar2, int i2) {
        int i3;
        rVar2.c0(1090521195);
        if ((i2 & 6) == 0) {
            i3 = (rVar2.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar2.h(pVar) ? 32 : 16;
        }
        if (rVar2.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.compose.ui.window.f.b;
                rVar2.l0(objQ);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ;
            int i4 = ((i3 << 3) & Token.ASSIGN_MOD) | ((i3 >> 3) & 14) | 384;
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVar);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            int i5 = ((i4 << 6) & 896) | 6;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0Var, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            pVar.invoke(rVar2, Integer.valueOf((i5 >> 6) & 14));
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.ui.window.g(rVar, pVar, i2);
        }
    }

    public static final void e(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i2, ", size: ", i3));
        }
    }

    public static final void f(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i2, ", size: ", i3));
        }
    }

    public static final void g(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.w("fromIndex: ", ", toIndex: ", i2, ", size: ", i3), i4);
        } else {
            if (i2 <= i3) {
                return;
            }
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("fromIndex: ", i2, " > toIndex: ", i3));
        }
    }

    public static StaticLayout h(CharSequence charSequence, TextPaint textPaint, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, boolean z, int i7, int i8, int i9, int i10) {
        if (i3 < 0) {
            androidx.compose.ui.text.internal.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            androidx.compose.ui.text.internal.a.a("invalid end value");
        }
        if (i4 < 0) {
            androidx.compose.ui.text.internal.a.a("invalid maxLines value");
        }
        if (i2 < 0) {
            androidx.compose.ui.text.internal.a.a("invalid width value");
        }
        if (i5 < 0) {
            androidx.compose.ui.text.internal.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, i2);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i4);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i5);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i7);
        builderObtain.setHyphenationFrequency(i10);
        builderObtain.setIndents(null, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            com.google.android.gms.common.wrappers.a.m(builderObtain, i6);
        }
        if (i11 >= 28) {
            androidx.compose.foundation.text.selection.s0.v(builderObtain);
        }
        if (i11 >= 33) {
            androidx.compose.ui.text.android.d.o(builderObtain, i8, i9);
        }
        if (i11 >= 35) {
            androidx.compose.ui.text.android.i.a(builderObtain);
        }
        return builderObtain.build();
    }

    public static void i(okio.k kVar, okio.x xVar) {
        if (kVar.N(xVar)) {
            return;
        }
        try {
            kVar.b0(xVar, false).close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final File j(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final void k(okio.k kVar, okio.x xVar) throws IOException {
        try {
            IOException iOException = null;
            for (okio.x xVar2 : kVar.X(xVar)) {
                try {
                    if (kVar.Y(xVar2).c) {
                        k(kVar, xVar2);
                    }
                    kVar.z(xVar2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static boolean l(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = androidx.core.view.s0.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = androidx.core.view.r0.d;
            androidx.core.view.r0 r0Var = (androidx.core.view.r0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (r0Var == null) {
                r0Var = new androidx.core.view.r0();
                r0Var.a = null;
                r0Var.b = null;
                r0Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, r0Var);
            }
            WeakReference weakReference2 = r0Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                r0Var.c = new WeakReference(keyEvent);
                if (r0Var.b == null) {
                    r0Var.b = new SparseArray();
                }
                SparseArray sparseArray = r0Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    androidx.transition.k.i();
                    return false;
                }
            }
        }
        return false;
    }

    public static final long m(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final androidx.compose.ui.graphics.vector.f n() {
        androidx.compose.ui.graphics.vector.f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Description", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(14.0f, 2.0f);
        gVar.m(6.0f, 2.0f);
        gVar.h(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        gVar.m(4.0f, 20.0f);
        gVar.h(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        gVar.m(18.0f, 22.0f);
        gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.m(20.0f, 8.0f);
        gVar.n(-6.0f, -6.0f);
        gVar.f();
        gVar.o(16.0f, 18.0f);
        gVar.m(8.0f, 18.0f);
        gVar.s(-2.0f);
        gVar.l(8.0f);
        gVar.s(2.0f);
        gVar.f();
        gVar.o(16.0f, 14.0f);
        gVar.m(8.0f, 14.0f);
        gVar.s(-2.0f);
        gVar.l(8.0f);
        gVar.s(2.0f);
        gVar.f();
        gVar.o(13.0f, 9.0f);
        gVar.m(13.0f, 3.5f);
        gVar.m(18.5f, 9.0f);
        gVar.m(13.0f, 9.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f o() {
        androidx.compose.ui.graphics.vector.f fVar = c;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.FilterList", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(10.0f, 18.0f);
        gVar.l(4.0f);
        gVar.s(-2.0f);
        gVar.l(-4.0f);
        gVar.s(2.0f);
        gVar.f();
        gVar.o(3.0f, 6.0f);
        gVar.s(2.0f);
        gVar.l(18.0f);
        gVar.m(21.0f, 6.0f);
        gVar.m(3.0f, 6.0f);
        gVar.f();
        gVar.o(6.0f, 13.0f);
        gVar.l(12.0f);
        gVar.s(-2.0f);
        gVar.m(6.0f, 11.0f);
        gVar.s(2.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        c = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f p() {
        androidx.compose.ui.graphics.vector.f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Link", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(3.9f, 12.0f);
        gVarH.h(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        gVarH.l(4.0f);
        gVarH.m(11.0f, 7.0f);
        gVarH.m(7.0f, 7.0f);
        gVarH.h(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        gVarH.q(2.24f, 5.0f, 5.0f, 5.0f);
        gVarH.l(4.0f);
        gVarH.s(-1.9f);
        gVarH.m(7.0f, 15.1f);
        gVarH.h(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        gVarH.f();
        gVarH.o(8.0f, 13.0f);
        gVarH.l(8.0f);
        gVarH.s(-2.0f);
        gVarH.m(8.0f, 11.0f);
        gVarH.s(2.0f);
        gVarH.f();
        gVarH.o(17.0f, 7.0f);
        gVarH.l(-4.0f);
        gVarH.s(1.9f);
        gVarH.l(4.0f);
        gVarH.h(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        gVarH.q(-1.39f, 3.1f, -3.1f, 3.1f);
        gVarH.l(-4.0f);
        gVarH.m(13.0f, 17.0f);
        gVarH.l(4.0f);
        gVarH.h(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        gVarH.q(-2.24f, -5.0f, -5.0f, -5.0f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f q() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(12.0f, 12.0f);
        gVarH.h(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        gVarH.q(-1.79f, -4.0f, -4.0f, -4.0f);
        gVarH.q(-4.0f, 1.79f, -4.0f, 4.0f);
        gVarH.q(1.79f, 4.0f, 4.0f, 4.0f);
        gVarH.f();
        gVarH.o(12.0f, 14.0f);
        gVarH.h(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        gVarH.s(2.0f);
        gVarH.l(16.0f);
        gVarH.s(-2.0f);
        gVarH.h(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f r() {
        androidx.compose.ui.graphics.vector.f fVar = f;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(19.14f, 12.94f);
        gVarH.h(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        gVarH.h(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        gVarH.n(2.03f, -1.58f);
        gVarH.h(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        gVarH.n(-1.92f, -3.32f);
        gVarH.h(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        gVarH.n(-2.39f, 0.96f);
        gVarH.h(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        gVarH.m(14.4f, 2.81f);
        gVarH.h(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        gVarH.l(-3.84f);
        gVarH.h(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        gVarH.m(9.25f, 5.35f);
        gVarH.g(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        gVarH.m(5.24f, 5.33f);
        gVarH.h(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        gVarH.m(2.74f, 8.87f);
        gVarH.g(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        gVarH.n(2.03f, 1.58f);
        gVarH.g(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        gVarH.q(0.02f, 0.64f, 0.07f, 0.94f);
        gVarH.n(-2.03f, 1.58f);
        gVarH.h(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        gVarH.n(1.92f, 3.32f);
        gVarH.h(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        gVarH.n(2.39f, -0.96f);
        gVarH.h(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        gVarH.n(0.36f, 2.54f);
        gVarH.h(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        gVarH.l(3.84f);
        gVarH.h(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        gVarH.n(0.36f, -2.54f);
        gVarH.h(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        gVarH.n(2.39f, 0.96f);
        gVarH.h(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        gVarH.n(1.92f, -3.32f);
        gVarH.h(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        gVarH.m(19.14f, 12.94f);
        gVarH.f();
        gVarH.o(12.0f, 15.6f);
        gVarH.h(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        gVarH.q(1.62f, -3.6f, 3.6f, -3.6f);
        gVarH.q(3.6f, 1.62f, 3.6f, 3.6f);
        gVarH.p(13.98f, 15.6f, 12.0f, 15.6f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        f = fVarB;
        return fVarB;
    }

    public static final int s(androidx.sqlite.a aVar) {
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U("SELECT changes()");
        try {
            cVarU.Q();
            int i2 = (int) cVarU.getLong(0);
            com.google.common.base.i.c(cVarU, null);
            return i2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.i.c(cVarU, th);
                throw th2;
            }
        }
    }

    public static final androidx.compose.ui.graphics.vector.f t() {
        androidx.compose.ui.graphics.vector.f fVar = g;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(21.0f, 3.0f);
        gVar.m(3.0f, 3.0f);
        gVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gVar.s(12.0f);
        gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.l(5.0f);
        gVar.s(2.0f);
        gVar.l(8.0f);
        gVar.s(-2.0f);
        gVar.l(5.0f);
        gVar.h(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        gVar.m(23.0f, 5.0f);
        gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        gVar.f();
        gVar.o(21.0f, 17.0f);
        gVar.m(3.0f, 17.0f);
        gVar.m(3.0f, 5.0f);
        gVar.l(18.0f);
        gVar.s(12.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        g = fVarB;
        return fVarB;
    }

    public static int v(String str) {
        if (str == null) {
            return -1;
        }
        String strP = androidx.media3.common.i0.p(str);
        strP.getClass();
        switch (strP) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/avif":
                return 21;
            case "image/heic":
            case "image/heif":
                return 20;
            case "image/jpeg":
                return 14;
            case "image/webp":
                return 18;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "image/bmp":
                return 19;
            case "image/png":
                return 17;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int w(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final float x(long j2, float f2, androidx.compose.ui.unit.c cVar) {
        float fC;
        long jB = androidx.compose.ui.unit.o.b(j2);
        if (androidx.compose.ui.unit.p.a(jB, 4294967296L)) {
            if (cVar.T() <= 1.05d) {
                return cVar.s0(j2);
            }
            fC = androidx.compose.ui.unit.o.c(j2) / androidx.compose.ui.unit.o.c(cVar.G(f2));
        } else {
            if (!androidx.compose.ui.unit.p.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = androidx.compose.ui.unit.o.c(j2);
        }
        return fC * f2;
    }

    public static androidx.media3.extractor.text.ttml.g y(androidx.media3.extractor.text.ttml.g gVar, String[] strArr, Map map) {
        int i2 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (androidx.media3.extractor.text.ttml.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                androidx.media3.extractor.text.ttml.g gVar2 = new androidx.media3.extractor.text.ttml.g();
                int length = strArr.length;
                while (i2 < length) {
                    gVar2.a((androidx.media3.extractor.text.ttml.g) map.get(strArr[i2]));
                    i2++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((androidx.media3.extractor.text.ttml.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    gVar.a((androidx.media3.extractor.text.ttml.g) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return gVar;
    }

    public static final void z(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            spannable.setSpan(new ForegroundColorSpan(androidx.compose.ui.graphics.a0.y(j2)), i2, i3, 33);
        }
    }

    public abstract void C(com.google.android.material.shape.y yVar, float f2);

    public abstract float u(com.google.android.material.shape.y yVar);
}
