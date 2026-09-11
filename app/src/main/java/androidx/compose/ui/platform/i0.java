package androidx.compose.ui.platform;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 implements o2 {
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(androidx.compose.ui.semantics.p pVar) {
        return !pVar.k().e.c(androidx.compose.ui.semantics.t.i);
    }

    public static final boolean c(androidx.compose.ui.semantics.p pVar, Resources resources) {
        Object objG = pVar.d.e.g(androidx.compose.ui.semantics.t.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !androidx.compose.ui.semantics.s.e(pVar) && (pVar.d.z || (pVar.n() && ((list != null ? (String) kotlin.collections.o.M(list) : null) != null || i(pVar) != null || h(pVar, resources) != null || g(pVar))));
    }

    public static final void d(androidx.compose.ui.semantics.p pVar, androidx.core.view.accessibility.d dVar) {
        androidx.compose.ui.semantics.l lVar = pVar.d;
        androidx.collection.o0 o0Var = lVar.e;
        Object objG = lVar.e.g(androidx.compose.ui.semantics.t.y);
        if (objG == null) {
            objG = null;
        }
        androidx.compose.ui.semantics.h hVar = (androidx.compose.ui.semantics.h) objG;
        if (b(pVar)) {
            if (hVar != null && hVar.a == 8) {
                return;
            }
            Object objG2 = o0Var.g(androidx.compose.ui.semantics.k.y);
            if (objG2 == null) {
                objG2 = null;
            }
            androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) objG2;
            if (aVar != null) {
                dVar.b(new androidx.core.view.accessibility.b(R.id.accessibilityActionPageUp, aVar.a));
            }
            Object objG3 = o0Var.g(androidx.compose.ui.semantics.k.A);
            if (objG3 == null) {
                objG3 = null;
            }
            androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) objG3;
            if (aVar2 != null) {
                dVar.b(new androidx.core.view.accessibility.b(R.id.accessibilityActionPageDown, aVar2.a));
            }
            Object objG4 = o0Var.g(androidx.compose.ui.semantics.k.z);
            if (objG4 == null) {
                objG4 = null;
            }
            androidx.compose.ui.semantics.a aVar3 = (androidx.compose.ui.semantics.a) objG4;
            if (aVar3 != null) {
                dVar.b(new androidx.core.view.accessibility.b(R.id.accessibilityActionPageLeft, aVar3.a));
            }
            Object objG5 = o0Var.g(androidx.compose.ui.semantics.k.B);
            androidx.compose.ui.semantics.a aVar4 = (androidx.compose.ui.semantics.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                dVar.b(new androidx.core.view.accessibility.b(R.id.accessibilityActionPageRight, aVar4.a));
            }
        }
    }

    public static final boolean e(Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.o) {
            androidx.compose.runtime.snapshots.o oVar = (androidx.compose.runtime.snapshots.o) obj;
            if (oVar.a() == androidx.compose.runtime.f.A || oVar.a() == androidx.compose.runtime.f.D || oVar.a() == androidx.compose.runtime.f.B) {
                Object value = oVar.getValue();
                if (value == null) {
                    return true;
                }
                return e(value);
            }
        } else {
            if ((obj instanceof kotlin.d) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float f(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final boolean g(androidx.compose.ui.semantics.p pVar) {
        Object objG = pVar.d.e.g(androidx.compose.ui.semantics.t.J);
        if (objG == null) {
            objG = null;
        }
        androidx.compose.ui.state.a aVar = (androidx.compose.ui.state.a) objG;
        androidx.collection.o0 o0Var = pVar.d.e;
        Object objG2 = o0Var.g(androidx.compose.ui.semantics.t.y);
        if (objG2 == null) {
            objG2 = null;
        }
        androidx.compose.ui.semantics.h hVar = (androidx.compose.ui.semantics.h) objG2;
        boolean z = aVar != null;
        Object objG3 = o0Var.g(androidx.compose.ui.semantics.t.I);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (hVar != null && hVar.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String h(androidx.compose.ui.semantics.p pVar, Resources resources) {
        int iC;
        androidx.compose.ui.semantics.l lVar = pVar.d;
        androidx.compose.ui.semantics.l lVar2 = pVar.d;
        Object objG = lVar.e.g(androidx.compose.ui.semantics.t.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        androidx.collection.o0 o0Var = lVar2.e;
        Object objG2 = o0Var.g(androidx.compose.ui.semantics.t.J);
        if (objG2 == null) {
            objG2 = null;
        }
        androidx.compose.ui.state.a aVar = (androidx.compose.ui.state.a) objG2;
        Object objG3 = o0Var.g(androidx.compose.ui.semantics.t.y);
        if (objG3 == null) {
            objG3 = null;
        }
        androidx.compose.ui.semantics.h hVar = (androidx.compose.ui.semantics.h) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(com.app.mlounge.R.string.indeterminate);
                    }
                } else if (hVar != null && hVar.a == 2 && objG == null) {
                    objG = resources.getString(com.app.mlounge.R.string.state_off);
                }
            } else if (hVar != null && hVar.a == 2 && objG == null) {
                objG = resources.getString(com.app.mlounge.R.string.state_on);
            }
        }
        Object objG4 = o0Var.g(androidx.compose.ui.semantics.t.I);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((hVar == null || hVar.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(com.app.mlounge.R.string.selected) : resources.getString(com.app.mlounge.R.string.not_selected);
            }
        }
        Object objG5 = o0Var.g(androidx.compose.ui.semantics.t.c);
        if (objG5 == null) {
            objG5 = null;
        }
        androidx.compose.ui.semantics.g gVar = (androidx.compose.ui.semantics.g) objG5;
        if (gVar != null) {
            if (gVar != androidx.compose.ui.semantics.g.c) {
                if (objG == null) {
                    float f = gVar.b.a;
                    float f2 = f - 0.0f == 0.0f ? 0.0f : (gVar.a - 0.0f) / (f - 0.0f);
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (f2 == 0.0f) {
                        iC = 0;
                    } else {
                        iC = f2 == 1.0f ? 100 : com.google.android.material.resources.c.c(Math.round(f2 * 100), 1, 99);
                    }
                    objG = resources.getString(com.app.mlounge.R.string.template_percent, Integer.valueOf(iC));
                }
            } else if (objG == null) {
                objG = resources.getString(com.app.mlounge.R.string.in_progress);
            }
        }
        androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.F;
        if (o0Var.c(wVar)) {
            androidx.collection.o0 o0Var2 = new androidx.compose.ui.semantics.p(pVar.a, true, pVar.c, lVar2).k().e;
            Object objG6 = o0Var2.g(androidx.compose.ui.semantics.t.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = o0Var2.g(androidx.compose.ui.semantics.t.B);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = o0Var2.g(wVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.app.mlounge.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final androidx.compose.ui.text.g i(androidx.compose.ui.semantics.p pVar) {
        Object objG = pVar.d.e.g(androidx.compose.ui.semantics.t.F);
        if (objG == null) {
            objG = null;
        }
        androidx.compose.ui.text.g gVar = (androidx.compose.ui.text.g) objG;
        Object objG2 = pVar.d.e.g(androidx.compose.ui.semantics.t.B);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return gVar == null ? list != null ? (androidx.compose.ui.text.g) kotlin.collections.o.M(list) : null : gVar;
    }

    public static boolean j() {
        try {
            if (u.h1 == null) {
                u.h1 = Class.forName("android.os.SystemProperties");
            }
            if (u.i1 == null) {
                Class cls = u.h1;
                u.i1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = u.i1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return kotlin.jvm.internal.l.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final androidx.compose.ui.text.j0 k(androidx.compose.ui.semantics.l lVar) {
        kotlin.jvm.functions.l lVar2;
        ArrayList arrayList = new ArrayList();
        Object objG = lVar.e.g(androidx.compose.ui.semantics.k.a);
        if (objG == null) {
            objG = null;
        }
        androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) objG;
        if (aVar == null || (lVar2 = (kotlin.jvm.functions.l) aVar.b) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (androidx.compose.ui.text.j0) arrayList.get(0);
    }

    public static final boolean l(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final boolean m(float f, float f2, androidx.compose.ui.graphics.j jVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        androidx.compose.ui.graphics.j jVarA = androidx.compose.ui.graphics.l.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            androidx.compose.ui.graphics.l.b("Invalid rectangle, make sure no value is NaN");
        }
        if (jVarA.b == null) {
            jVarA.b = new RectF();
        }
        RectF rectF = jVarA.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = jVarA.a;
        RectF rectF2 = jVarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        androidx.compose.ui.graphics.j jVarA2 = androidx.compose.ui.graphics.l.a();
        jVarA2.d(jVar, jVarA, 1);
        boolean zIsEmpty = jVarA2.a.isEmpty();
        jVarA2.e();
        jVarA.e();
        return !zIsEmpty;
    }

    public static final boolean n(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void o(float[] fArr, float[] fArr2) {
        float f = f(0, 0, fArr2, fArr);
        float f2 = f(0, 1, fArr2, fArr);
        float f3 = f(0, 2, fArr2, fArr);
        float f4 = f(0, 3, fArr2, fArr);
        float f5 = f(1, 0, fArr2, fArr);
        float f6 = f(1, 1, fArr2, fArr);
        float f7 = f(1, 2, fArr2, fArr);
        float f8 = f(1, 3, fArr2, fArr);
        float f9 = f(2, 0, fArr2, fArr);
        float f10 = f(2, 1, fArr2, fArr);
        float f11 = f(2, 2, fArr2, fArr);
        float f12 = f(2, 3, fArr2, fArr);
        float f13 = f(3, 0, fArr2, fArr);
        float f14 = f(3, 1, fArr2, fArr);
        float f15 = f(3, 2, fArr2, fArr);
        float f16 = f(3, 3, fArr2, fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        fArr[9] = f10;
        fArr[10] = f11;
        fArr[11] = f12;
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static final androidx.compose.ui.viewinterop.h p(x0 x0Var, int i) {
        Object next;
        Iterator<T> it = x0Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((androidx.compose.ui.node.f0) ((Map.Entry) next).getKey()).y != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.h) entry.getValue();
        }
        return null;
    }

    public static final String q(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String r(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
