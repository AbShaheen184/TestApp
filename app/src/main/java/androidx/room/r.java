package androidx.room;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.DragEvent;
import android.widget.EdgeEffect;
import androidx.compose.foundation.text.n0;
import androidx.compose.foundation.text.selection.q0;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.k0;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.text.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r {
    public static androidx.compose.ui.graphics.vector.f a;
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    public static void A(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iH = H(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        I(parcel, iH);
    }

    public static void B(Parcel parcel, int i2, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iH = H(parcel, i2);
        parcel.writeIntArray(iArr);
        I(parcel, iH);
    }

    public static void C(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iH = H(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        I(parcel, iH);
    }

    public static void D(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int iH = H(parcel, i2);
        parcel.writeString(str);
        I(parcel, iH);
    }

    public static void E(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iH = H(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        I(parcel, iH);
    }

    public static void F(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iH = H(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        I(parcel, iH);
    }

    public static void G(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static int H(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void I(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    public static final androidx.compose.ui.unit.k a(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new androidx.compose.ui.unit.k(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (j3 & 4294967295L)) + i3);
    }

    public static final void b(final boolean z, kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar, int i2) {
        int i3;
        rVar.c0(-642000585);
        if ((i2 & 6) == 0) {
            i3 = (rVar.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar.h(pVar) ? 32 : 16;
        }
        if (rVar.T(i3 & 1, (i3 & 19) != 18)) {
            Object objA = androidx.navigationevent.compose.a.a(rVar);
            if (objA == null) {
                rVar.b0(1512740606);
                objA = androidx.activity.compose.s.a(rVar);
            } else {
                rVar.b0(1512737723);
            }
            rVar.p(false);
            if (objA == null) {
                net.luminis.tls.engine.impl.c.r("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = rVar.f(objA);
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            if (zF || objQ == obj) {
                androidx.navigationevent.d dVar = objA instanceof androidx.navigationevent.d ? (androidx.navigationevent.d) objA : null;
                androidx.navigationevent.c navigationEventDispatcher = dVar != null ? dVar.getNavigationEventDispatcher() : null;
                androidx.activity.e0 e0Var = objA instanceof androidx.activity.e0 ? (androidx.activity.e0) objA : null;
                objQ = new androidx.activity.compose.internal.c(navigationEventDispatcher, e0Var != null ? e0Var.getOnBackPressedDispatcher() : null);
                rVar.l0(objQ);
            }
            Object obj2 = (androidx.activity.compose.internal.c) objQ;
            Object objQ2 = rVar.Q();
            if (objQ2 == obj) {
                objQ2 = j0.f(rVar);
                rVar.l0(objQ2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ2;
            long j2 = rVar.T;
            boolean zF2 = rVar.f(obj2) | rVar.e(j2);
            Object objQ3 = rVar.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new androidx.activity.compose.q(coroutineScope, new androidx.activity.compose.u(j2, objA));
                rVar.l0(objQ3);
            }
            final androidx.activity.compose.q qVar = (androidx.activity.compose.q) objQ3;
            rVar.b0(-348514256);
            boolean zH = rVar.h(qVar) | rVar.h(pVar);
            Object objQ4 = rVar.Q();
            if (zH || objQ4 == obj) {
                objQ4 = new androidx.activity.compose.f(1, qVar, pVar);
                rVar.l0(objQ4);
            }
            j0.e((kotlin.jvm.functions.a) objQ4, rVar);
            int i4 = i3;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = i4 & 14;
            boolean zH2 = rVar.h(qVar) | (i5 == 4);
            Object objQ5 = rVar.Q();
            if (zH2 || objQ5 == obj) {
                objQ5 = new kotlin.jvm.functions.l() { // from class: androidx.activity.compose.v
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj3) {
                        q qVar2 = qVar;
                        qVar2.j(z);
                        return new j((androidx.lifecycle.compose.b) obj3, qVar2, 1);
                    }
                };
                rVar.l0(objQ5);
            }
            coil3.network.g.c(boolValueOf, qVar, null, (kotlin.jvm.functions.l) objQ5, rVar, i5);
            boolean zH3 = rVar.h(obj2) | rVar.h(qVar);
            Object objQ6 = rVar.Q();
            if (zH3 || objQ6 == obj) {
                objQ6 = new androidx.activity.compose.h(1, obj2, qVar);
                rVar.l0(objQ6);
            }
            j0.a(obj2, qVar, (kotlin.jvm.functions.l) objQ6, rVar);
            rVar.p(false);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.components.m(z, pVar, i2);
        }
    }

    public static final androidx.compose.foundation.text.selection.z c(q0 q0Var, androidx.compose.foundation.text.selection.a0 a0Var) {
        androidx.compose.foundation.text.selection.j jVarE = q0Var.e();
        androidx.compose.foundation.text.selection.w wVar = (androidx.compose.foundation.text.selection.w) q0Var.A;
        boolean z = jVarE == androidx.compose.foundation.text.selection.j.e;
        return new androidx.compose.foundation.text.selection.z(e(wVar, z, true, a0Var), e(wVar, z, false, a0Var), z);
    }

    public static final androidx.compose.foundation.text.selection.y d(final q0 q0Var, final androidx.compose.foundation.text.selection.w wVar, androidx.compose.foundation.text.selection.y yVar) {
        androidx.compose.foundation.text.selection.j jVar;
        int i2 = wVar.c;
        int i3 = wVar.b;
        boolean z = q0Var.y;
        final int i4 = z ? i3 : i2;
        androidx.compose.ui.text.j0 j0Var = (androidx.compose.ui.text.j0) wVar.e;
        int i5 = wVar.d;
        androidx.compose.foundation.text.selection.b0 b0Var = new androidx.compose.foundation.text.selection.b0(wVar, i4, 0);
        kotlin.i iVar = kotlin.i.y;
        final kotlin.h hVarC = kotlin.a.c(iVar, b0Var);
        final int i6 = z ? i2 : i3;
        kotlin.h hVarC2 = kotlin.a.c(iVar, new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.c0
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                w wVar2 = wVar;
                androidx.compose.ui.text.j0 j0Var2 = (androidx.compose.ui.text.j0) wVar2.e;
                int iIntValue = ((Number) hVarC.getValue()).intValue();
                q0 q0Var2 = q0Var;
                boolean z2 = q0Var2.y;
                boolean z3 = q0Var2.e() == j.e;
                int i7 = i4;
                long jI = j0Var2.i(i7);
                androidx.compose.ui.text.n nVar = j0Var2.b;
                int i8 = androidx.compose.ui.text.l0.c;
                int iF = (int) (jI >> 32);
                int iD = nVar.d(iF);
                int i9 = nVar.f;
                if (iD != iIntValue) {
                    iF = iIntValue >= i9 ? j0Var2.f(i9 - 1) : j0Var2.f(iIntValue);
                }
                int iC = (int) (jI & 4294967295L);
                if (nVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i9 ? nVar.c(i9 - 1, false) : nVar.c(iIntValue, false);
                }
                int i10 = i6;
                if (iF == i10) {
                    return wVar2.a(iC);
                }
                if (iC == i10) {
                    return wVar2.a(iF);
                }
                if (!(z2 ^ z3) ? i7 >= iF : i7 > iC) {
                    iF = iC;
                }
                return wVar2.a(iF);
            }
        });
        if (1 != yVar.c) {
            return (androidx.compose.foundation.text.selection.y) hVarC2.getValue();
        }
        if (i4 == i5) {
            return yVar;
        }
        if (((Number) hVarC.getValue()).intValue() != j0Var.b.d(i5)) {
            return (androidx.compose.foundation.text.selection.y) hVarC2.getValue();
        }
        int i7 = yVar.b;
        long jI = j0Var.i(i7);
        if (i5 != -1) {
            if (i4 != i5) {
                androidx.compose.foundation.text.selection.j jVar2 = androidx.compose.foundation.text.selection.j.e;
                if (i3 < i2) {
                    jVar = androidx.compose.foundation.text.selection.j.y;
                } else {
                    jVar = i3 > i2 ? jVar2 : androidx.compose.foundation.text.selection.j.z;
                }
                if (((z ? 1 : 0) ^ (jVar == jVar2 ? 1 : 0)) == 0) {
                }
            }
            return wVar.a(i4);
        }
        int i8 = l0.c;
        return (i7 == ((int) (jI >> 32)) || i7 == ((int) (jI & 4294967295L))) ? (androidx.compose.foundation.text.selection.y) hVarC2.getValue() : wVar.a(i4);
    }

    public static final androidx.compose.foundation.text.selection.y e(androidx.compose.foundation.text.selection.w wVar, boolean z, boolean z2, androidx.compose.foundation.text.selection.a0 a0Var) {
        long jB;
        long j2;
        int i2 = z2 ? wVar.b : wVar.c;
        switch (a0Var.a) {
            case 0:
                String str = ((androidx.compose.ui.text.j0) wVar.e).a.a.y;
                jB = androidx.compose.ui.text.d0.b(n0.n(str, i2), n0.m(str, i2));
                break;
            default:
                jB = ((androidx.compose.ui.text.j0) wVar.e).i(i2);
                break;
        }
        if (z ^ z2) {
            int i3 = l0.c;
            j2 = jB >> 32;
        } else {
            int i4 = l0.c;
            j2 = 4294967295L & jB;
        }
        return wVar.a((int) j2);
    }

    public static final androidx.compose.foundation.text.selection.y f(androidx.compose.foundation.text.selection.y yVar, androidx.compose.foundation.text.selection.w wVar, int i2) {
        return new androidx.compose.foundation.text.selection.y(((androidx.compose.ui.text.j0) wVar.e).a(i2), i2, yVar.c);
    }

    public static void g(androidx.navigation.w wVar, String str, List list, androidx.compose.runtime.internal.f fVar, int i2) {
        if ((i2 & 2) != 0) {
            list = kotlin.collections.u.e;
        }
        androidx.navigation.l0 l0Var = wVar.f;
        l0Var.getClass();
        androidx.navigation.compose.j jVar = new androidx.navigation.compose.j((androidx.navigation.compose.i) l0Var.b(androidx.navigation.f.d(androidx.navigation.compose.i.class)), str, fVar);
        for (androidx.navigation.e eVar : list) {
            jVar.c.put(eVar.a, eVar.b);
        }
        wVar.h.add(jVar.a());
    }

    public static final boolean h(androidx.compose.ui.geometry.c cVar, float f2, float f3) {
        float f4 = cVar.a;
        if (f2 > cVar.c || f4 > f2) {
            return false;
        }
        return f3 <= cVar.d && cVar.b <= f3;
    }

    public static final dagger.hilt.android.internal.lifecycle.e i(w0 w0Var, androidx.compose.runtime.r rVar) {
        if (!(w0Var instanceof androidx.lifecycle.j)) {
            rVar.b0(-1968008324);
            rVar.p(false);
            return null;
        }
        rVar.b0(-1968186822);
        Context baseContext = (Context) rVar.j(m0.b);
        s0 defaultViewModelProviderFactory = ((androidx.lifecycle.j) w0Var).getDefaultViewModelProviderFactory();
        baseContext.getClass();
        defaultViewModelProviderFactory.getClass();
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof androidx.activity.p) {
                dagger.hilt.android.internal.lifecycle.e eVarD = dagger.hilt.android.internal.lifecycle.e.d((androidx.activity.p) baseContext, defaultViewModelProviderFactory);
                rVar.p(false);
                return eVarD;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            baseContext.getClass();
        }
        com.google.gson.b.m(baseContext, "Expected an activity context for creating a HiltViewModelFactory but instead found: ");
        return null;
    }

    public static String j(androidx.datastore.preferences.protobuf.f fVar) {
        StringBuilder sb = new StringBuilder(fVar.size());
        for (int i2 = 0; i2 < fVar.size(); i2++) {
            byte b2 = fVar.b(i2);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final Object k(m mVar, String str, kotlin.coroutines.jvm.internal.c cVar) {
        Object objB = mVar.b(str, new androidx.compose.ui.text.y(29), cVar);
        return objB == kotlin.coroutines.intrinsics.a.e ? objB : kotlin.y.a;
    }

    public static final androidx.compose.ui.graphics.vector.f l() {
        androidx.compose.ui.graphics.vector.f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(19.0f, 6.41f);
        gVar.m(17.59f, 5.0f);
        gVar.m(12.0f, 10.59f);
        gVar.m(6.41f, 5.0f);
        gVar.m(5.0f, 6.41f);
        gVar.m(10.59f, 12.0f);
        gVar.m(5.0f, 17.59f);
        gVar.m(6.41f, 19.0f);
        gVar.m(12.0f, 13.41f);
        gVar.m(17.59f, 19.0f);
        gVar.m(19.0f, 17.59f);
        gVar.m(13.41f, 12.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static float m(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Object n(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.compose.ui.text.android.d.d(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (androidx.activity.result.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final long o(com.app.mlounge.data.music.e eVar) {
        DragEvent dragEvent = (DragEvent) eVar.y;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static float p(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.b.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:181:0x043e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0443  */
    /* JADX WARN: Code duplicated, block: B:187:0x045f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x0461  */
    /* JADX WARN: Code duplicated, block: B:189:0x046a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0485 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0487  */
    /* JADX WARN: Code duplicated, block: B:197:0x048f  */
    /* JADX WARN: Code duplicated, block: B:200:0x049f  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:204:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    public static final androidx.compose.ui.graphics.painter.b q(int i2, androidx.compose.runtime.r rVar) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        int i3;
        long jC;
        int i4;
        XmlResourceParser xmlResourceParser;
        int i5;
        TypedArray typedArrayObtainStyledAttributes;
        int i6;
        int i7;
        TypedArray typedArrayObtainStyledAttributes2;
        int i8;
        int i9;
        int i10;
        Shader shader;
        int i11;
        androidx.compose.ui.graphics.p p0Var;
        Shader shader2;
        int i12;
        androidx.compose.ui.graphics.p p0Var2;
        int i13;
        ColorStateList colorStateListA;
        Context context = (Context) rVar.j(m0.b);
        Resources resources = (Resources) rVar.j(m0.c);
        androidx.compose.ui.res.d dVar = (androidx.compose.ui.res.d) rVar.j(m0.e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.a.b(i2);
            i3 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                androidx.collection.z zVar = dVar.a;
                int iD = zVar.d(i2);
                Object[] objArr = zVar.c;
                Object obj = objArr[iD];
                zVar.b[iD] = i2;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !kotlin.text.k.W(charSequence, ".xml")) {
            rVar.b0(-1771643000);
            boolean zF = rVar.f(context.getTheme()) | rVar.f(charSequence) | rVar.d(i2);
            Object objQ = rVar.Q();
            if (zF || objQ == androidx.compose.runtime.m.a) {
                try {
                    Drawable drawable = resources.getDrawable(i2, null);
                    drawable.getClass();
                    objQ = new androidx.compose.ui.graphics.g(((BitmapDrawable) drawable).getBitmap());
                    rVar.l0(objQ);
                } catch (Exception e2) {
                    throw new androidx.compose.ui.res.e(0, "Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            androidx.compose.ui.graphics.g gVar = (androidx.compose.ui.graphics.g) objQ;
            androidx.compose.ui.graphics.painter.a aVar = new androidx.compose.ui.graphics.painter.a(gVar, (((long) gVar.a.getHeight()) & 4294967295L) | (((long) gVar.a.getWidth()) << 32));
            rVar.p(false);
            return aVar;
        }
        rVar.b0(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i14 = typedValue.changingConfigurations;
        androidx.compose.ui.res.c cVar = (androidx.compose.ui.res.c) rVar.j(m0.d);
        androidx.compose.ui.res.b bVar = new androidx.compose.ui.res.b(theme, i2);
        WeakReference weakReference = (WeakReference) cVar.a.get(bVar);
        androidx.compose.ui.res.a aVar2 = weakReference != null ? (androidx.compose.ui.res.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i2);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!kotlin.jvm.internal.l.a(xml.getName(), "vector")) {
                net.luminis.tls.engine.impl.c.o("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            androidx.compose.ui.graphics.vector.compat.a aVar3 = new androidx.compose.ui.graphics.vector.compat.a(xml);
            int[] iArr = androidx.compose.ui.graphics.vector.compat.b.a;
            TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? typedArrayObtainAttributes.getBoolean(5, false) : false;
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            float fB = aVar3.b(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
            float fB2 = aVar3.b(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
            if (fB <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fB2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            if (typedArrayObtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = androidx.compose.ui.graphics.t.i;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArrayObtainAttributes.getValue(1, typedValue3);
                        int i15 = typedValue3.type;
                        if (i15 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i15 < 28 || i15 > 31) {
                            Resources resources2 = typedArrayObtainAttributes.getResources();
                            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = androidx.core.content.res.c.a;
                            try {
                                colorStateListA = androidx.core.content.res.c.a(resources2, resources2.getXml(resourceId), theme);
                            } catch (Exception e3) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                                colorStateListA = null;
                            }
                        } else {
                            colorStateListA = ColorStateList.valueOf(typedValue3.data);
                        }
                    } else {
                        colorStateListA = null;
                    }
                    aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
                    jC = colorStateListA != null ? androidx.compose.ui.graphics.a0.c(colorStateListA.getDefaultColor()) : androidx.compose.ui.graphics.t.i;
                }
            } else {
                jC = androidx.compose.ui.graphics.t.i;
            }
            long j2 = jC;
            int i16 = typedArrayObtainAttributes.getInt(6, -1);
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            if (i16 == -1) {
                i4 = 5;
            } else if (i16 == 3) {
                i4 = 3;
            } else if (i16 == 5) {
                i4 = 5;
            } else if (i16 != 9) {
                switch (i16) {
                    case 14:
                        i4 = 13;
                        break;
                    case 15:
                        i4 = 14;
                        break;
                    case 16:
                        i4 = 12;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
            } else {
                i4 = 9;
            }
            float f2 = dimension / resources.getDisplayMetrics().density;
            float f3 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayObtainAttributes.recycle();
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e(null, f2, f3, fB, fB2, j2, i4, z, 1);
            int i17 = 0;
            for (int i18 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i18); i18 = 3) {
                List listL = kotlin.collections.u.e;
                XmlPullParser xmlPullParser = aVar3.a;
                com.google.firebase.platforminfo.c cVar2 = aVar3.c;
                int i19 = i3;
                int eventType = xmlPullParser.getEventType();
                int i20 = i14;
                if (eventType != 2) {
                    if (eventType != i18) {
                        bVar = bVar;
                        xmlResourceParser = xml;
                        i6 = i19;
                    } else if ("group".equals(xmlPullParser.getName())) {
                        int i21 = i17 + 1;
                        int i22 = 0;
                        while (i22 < i21) {
                            ArrayList arrayList = eVar.i;
                            if (eVar.k) {
                                androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            androidx.compose.ui.graphics.vector.d dVar2 = (androidx.compose.ui.graphics.vector.d) arrayList.remove(arrayList.size() - 1);
                            ((androidx.compose.ui.graphics.vector.d) androidx.privacysandbox.ads.adservices.java.internal.a.j(i19, arrayList)).j.add(new androidx.compose.ui.graphics.vector.g0(dVar2.a, dVar2.b, dVar2.c, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j));
                            i22++;
                            i19 = 1;
                        }
                        bVar = bVar;
                        xmlResourceParser = xml;
                        i6 = 1;
                        i17 = 0;
                    }
                    xmlResourceParser.next();
                    i3 = i6;
                    bVar = bVar;
                    i14 = i20;
                    xml = xmlResourceParser;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            xmlResourceParser = xml;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    int[] iArr2 = androidx.compose.ui.graphics.vector.compat.b.b;
                                    TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                    aVar3.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float fB3 = aVar3.b(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                    float f4 = typedArrayObtainAttributes2.getFloat(1, 0.0f);
                                    aVar3.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float f5 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                    aVar3.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float fB4 = aVar3.b(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                    float fB5 = aVar3.b(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                    float fB6 = aVar3.b(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                    float fB7 = aVar3.b(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                    String string = typedArrayObtainAttributes2.getString(0);
                                    aVar3.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayObtainAttributes2.recycle();
                                    int i23 = androidx.compose.ui.graphics.vector.h0.a;
                                    if (eVar.k) {
                                        androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    eVar.i.add(new androidx.compose.ui.graphics.vector.d(str, fB3, f4, f5, fB4, fB5, fB6, fB7, listL, 512));
                                }
                            } else if (name.equals("path")) {
                                int[] iArr3 = androidx.compose.ui.graphics.vector.compat.b.c;
                                if (theme == null) {
                                    typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                    i7 = 0;
                                } else {
                                    i7 = 0;
                                    typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                }
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    net.luminis.tls.engine.impl.c.o("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayObtainStyledAttributes2.getString(i7);
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayObtainStyledAttributes2.getString(2);
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (string3 == null) {
                                    int i24 = androidx.compose.ui.graphics.vector.h0.a;
                                } else {
                                    listL = com.google.firebase.platforminfo.c.l(cVar2, string3);
                                }
                                List list = listL;
                                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVarA = aVar3.a(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                float fB8 = aVar3.b(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                int i25 = !androidx.core.content.res.b.b(aVar3.a, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i25 == 0) {
                                    i8 = 0;
                                } else if (i25 == 1) {
                                    i8 = 1;
                                } else if (i25 != 2) {
                                    i8 = 0;
                                } else {
                                    i8 = 2;
                                }
                                int i26 = !androidx.core.content.res.b.b(aVar3.a, "strokeLineJoin") ? -1 : typedArrayObtainStyledAttributes2.getInt(9, -1);
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i26 != 0) {
                                    if (i26 == 1) {
                                        i9 = 1;
                                    } else if (i26 == 2) {
                                        i9 = 2;
                                    }
                                    float fB9 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                    androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVarA2 = aVar3.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                    float fB10 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float fB11 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float fB12 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float fB13 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float fB14 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (androidx.core.content.res.b.b(aVar3.a, "fillType")) {
                                        i10 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                    } else {
                                        i10 = 0;
                                    }
                                    aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                    typedArrayObtainStyledAttributes2.recycle();
                                    shader = (Shader) lVarA.z;
                                    i11 = lVarA.y;
                                    if (shader == null && i11 == 0) {
                                        p0Var = null;
                                    } else if (shader != null) {
                                        p0Var = new androidx.compose.ui.graphics.q(shader);
                                    } else {
                                        p0Var = new p0(androidx.compose.ui.graphics.a0.c(i11));
                                    }
                                    shader2 = (Shader) lVarA2.z;
                                    i12 = lVarA2.y;
                                    if (shader2 == null && i12 == 0) {
                                        p0Var2 = null;
                                    } else if (shader2 != null) {
                                        p0Var2 = new androidx.compose.ui.graphics.q(shader2);
                                    } else {
                                        p0Var2 = new p0(androidx.compose.ui.graphics.a0.c(i12));
                                    }
                                    if (i10 == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = 1;
                                    }
                                    if (eVar.k) {
                                        androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((androidx.compose.ui.graphics.vector.d) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, eVar.i)).j.add(new k0(str2, list, i13, p0Var, fB8, p0Var2, fB10, fB11, i8, i9, fB9, fB14, fB12, fB13));
                                    i6 = 1;
                                }
                                i9 = 0;
                                float fB15 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVarA3 = aVar3.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                float fB16 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                float fB17 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                float fB18 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                float fB19 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                float fB110 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                if (androidx.core.content.res.b.b(aVar3.a, "fillType")) {
                                    i10 = 0;
                                } else {
                                    i10 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                }
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                typedArrayObtainStyledAttributes2.recycle();
                                shader = (Shader) lVarA.z;
                                i11 = lVarA.y;
                                if (shader == null) {
                                    p0Var = null;
                                } else if (shader != null) {
                                    p0Var = new androidx.compose.ui.graphics.q(shader);
                                } else {
                                    p0Var = new p0(androidx.compose.ui.graphics.a0.c(i11));
                                }
                                shader2 = (Shader) lVarA3.z;
                                i12 = lVarA3.y;
                                if (shader2 == null) {
                                    p0Var2 = null;
                                } else if (shader2 != null) {
                                    p0Var2 = new androidx.compose.ui.graphics.q(shader2);
                                } else {
                                    p0Var2 = new p0(androidx.compose.ui.graphics.a0.c(i12));
                                }
                                if (i10 == 0) {
                                    i13 = 0;
                                } else {
                                    i13 = 1;
                                }
                                if (eVar.k) {
                                    androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((androidx.compose.ui.graphics.vector.d) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, eVar.i)).j.add(new k0(str2, list, i13, p0Var, fB8, p0Var2, fB16, fB17, i8, i9, fB15, fB110, fB18, fB19));
                                i6 = 1;
                            }
                        } else {
                            bVar = bVar;
                            xmlResourceParser = xml;
                            if (name.equals("clip-path")) {
                                int[] iArr4 = androidx.compose.ui.graphics.vector.compat.b.d;
                                if (theme == null) {
                                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                }
                                aVar3.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String string4 = typedArrayObtainStyledAttributes.getString(i5);
                                aVar3.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i6 = 1;
                                String string5 = typedArrayObtainStyledAttributes.getString(1);
                                aVar3.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                if (string5 == null) {
                                    int i27 = androidx.compose.ui.graphics.vector.h0.a;
                                } else {
                                    listL = com.google.firebase.platforminfo.c.l(cVar2, string5);
                                }
                                List list2 = listL;
                                typedArrayObtainStyledAttributes.recycle();
                                if (eVar.k) {
                                    androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                eVar.i.add(new androidx.compose.ui.graphics.vector.d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i17++;
                            } else {
                                i6 = 1;
                            }
                        }
                        xmlResourceParser.next();
                        i3 = i6;
                        bVar = bVar;
                        i14 = i20;
                        xml = xmlResourceParser;
                    }
                    i6 = 1;
                    xmlResourceParser.next();
                    i3 = i6;
                    bVar = bVar;
                    i14 = i20;
                    xml = xmlResourceParser;
                }
                xmlResourceParser = xml;
                i6 = 1;
                xmlResourceParser.next();
                i3 = i6;
                bVar = bVar;
                i14 = i20;
                xml = xmlResourceParser;
            }
            androidx.compose.ui.res.b bVar2 = bVar;
            aVar2 = new androidx.compose.ui.res.a(eVar.b(), i14 | aVar3.b);
            cVar.a.put(bVar2, new WeakReference(aVar2));
        }
        androidx.compose.ui.graphics.vector.j0 j0VarD = androidx.compose.ui.graphics.vector.b.d(aVar2.a, rVar);
        rVar.p(false);
        return j0VarD;
    }

    public static final void r(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s(coil3.network.r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        coil3.network.internal.c cVar2;
        coil3.network.r rVar2;
        Throwable th;
        okio.f fVar;
        if (cVar instanceof coil3.network.internal.c) {
            cVar2 = (coil3.network.internal.c) cVar;
            int i2 = cVar2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.A = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new coil3.network.internal.c(cVar);
            }
        } else {
            cVar2 = new coil3.network.internal.c(cVar);
        }
        Object obj = cVar2.z;
        int i3 = cVar2.A;
        if (i3 != 0) {
            if (i3 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = cVar2.y;
            rVar2 = cVar2.e;
            try {
                kotlin.a.e(obj);
                com.google.common.base.i.c(rVar2, null);
                return fVar;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    com.google.common.base.i.c(rVar2, th);
                    throw th3;
                }
            }
        }
        kotlin.a.e(obj);
        try {
            okio.f fVar2 = new okio.f();
            cVar2.e = rVar;
            cVar2.y = fVar2;
            cVar2.A = 1;
            rVar.e.O(fVar2);
            kotlin.y yVar = kotlin.y.a;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (yVar == aVar) {
                return aVar;
            }
            rVar2 = rVar;
            fVar = fVar2;
            com.google.common.base.i.c(rVar2, null);
            return fVar;
        } catch (Throwable th4) {
            rVar2 = rVar;
            th = th4;
            throw th;
        }
    }

    public static Uri t(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static final androidx.compose.ui.unit.k u(androidx.compose.ui.geometry.c cVar) {
        return new androidx.compose.ui.unit.k(Math.round(cVar.a), Math.round(cVar.b), Math.round(cVar.c), Math.round(cVar.d));
    }

    public static final void v(androidx.compose.runtime.changelist.l0 l0Var, int i2, Object obj) {
        l0Var.p[(l0Var.q - l0Var.l[l0Var.m - 1].b) + i2] = obj;
    }

    public static final void w(androidx.compose.runtime.changelist.l0 l0Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = l0Var.q - l0Var.l[l0Var.m - 1].b;
        Object[] objArr = l0Var.p;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static void x(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iH = H(parcel, i2);
        parcel.writeBundle(bundle);
        I(parcel, iH);
    }

    public static void y(Parcel parcel, int i2, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iH = H(parcel, i2);
        parcel.writeByteArray(bArr);
        I(parcel, iH);
    }

    public static void z(Parcel parcel, int i2, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iH = H(parcel, i2);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        I(parcel, iH);
    }
}
