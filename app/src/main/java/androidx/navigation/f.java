package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.foundation.text.selection.q0;
import androidx.lifecycle.v0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static String a(androidx.media3.exoplayer.mediacodec.g gVar, int i) {
        gVar.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = gVar.e;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static kotlin.sequences.h b(t tVar) {
        tVar.getClass();
        return kotlin.sequences.k.o(tVar, new androidx.compose.ui.text.y(17));
    }

    public static m c(v0 v0Var) {
        androidx.lifecycle.viewmodel.d dVar = n.a;
        androidx.lifecycle.viewmodel.a aVar = androidx.lifecycle.viewmodel.a.b;
        dVar.getClass();
        aVar.getClass();
        com.google.firebase.messaging.o oVar = new com.google.firebase.messaging.o(v0Var, dVar, aVar);
        kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.a0.a(m.class);
        String strB = eVarA.b();
        if (strB != null) {
            return (m) oVar.y("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVarA);
        }
        net.luminis.tls.engine.impl.c.o("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static String d(Class cls) {
        LinkedHashMap linkedHashMap = l0.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            j0 j0Var = (j0) cls.getAnnotation(j0.class);
            strValue = j0Var != null ? j0Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                net.luminis.tls.engine.impl.c.p("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final ArrayList e(Map map, kotlin.jvm.functions.l lVar) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            g gVar = (g) entry.getValue();
            Boolean bool = gVar != null ? Boolean.FALSE : null;
            bool.getClass();
            if (!bool.booleanValue() && !gVar.b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    public static final e f(String str, kotlin.jvm.functions.l lVar) {
        i0 h0Var;
        Class<?> componentType;
        h hVar = new h();
        lVar.invoke(hVar);
        q0 q0Var = hVar.a;
        i0 i0Var = (i0) q0Var.z;
        if (i0Var == null) {
            Object obj = q0Var.A;
            if (obj instanceof Integer) {
                h0Var = i0.a;
            } else if (obj instanceof int[]) {
                h0Var = i0.b;
            } else if (obj instanceof Long) {
                h0Var = i0.c;
            } else if (obj instanceof long[]) {
                h0Var = i0.d;
            } else if (obj instanceof Float) {
                h0Var = i0.e;
            } else if (obj instanceof float[]) {
                h0Var = i0.f;
            } else if (obj instanceof Boolean) {
                h0Var = i0.g;
            } else if (obj instanceof boolean[]) {
                h0Var = i0.h;
            } else {
                h0Var = ((obj instanceof String) || obj == null) ? i0.i : null;
            }
            if (h0Var != null) {
                i0Var = h0Var;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                i0Var = i0.j;
            } else {
                obj.getClass();
                if (obj.getClass().isArray()) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    componentType2.getClass();
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        componentType3.getClass();
                        h0Var = new e0(componentType3);
                    } else if (obj.getClass().isArray()) {
                        componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            componentType4.getClass();
                            h0Var = new g0(componentType4);
                        } else if (obj instanceof Parcelable) {
                            h0Var = new f0(obj.getClass());
                        } else if (obj instanceof Enum) {
                            h0Var = new d0(obj.getClass());
                        } else {
                            h0Var = new h0(obj.getClass());
                        }
                    } else if (obj instanceof Parcelable) {
                        h0Var = new f0(obj.getClass());
                    } else if (obj instanceof Enum) {
                        h0Var = new d0(obj.getClass());
                    } else {
                        h0Var = new h0(obj.getClass());
                    }
                } else if (obj.getClass().isArray()) {
                    componentType = obj.getClass().getComponentType();
                    componentType.getClass();
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType5 = obj.getClass().getComponentType();
                        componentType5.getClass();
                        h0Var = new g0(componentType5);
                    } else if (obj instanceof Parcelable) {
                        h0Var = new f0(obj.getClass());
                    } else if (obj instanceof Enum) {
                        h0Var = new d0(obj.getClass());
                    } else {
                        h0Var = new h0(obj.getClass());
                    }
                } else if (obj instanceof Parcelable) {
                    h0Var = new f0(obj.getClass());
                } else if (obj instanceof Enum) {
                    h0Var = new d0(obj.getClass());
                } else {
                    h0Var = new h0(obj.getClass());
                }
                i0Var = h0Var;
            }
        }
        return new e(str, new g(i0Var, q0Var.A, q0Var.y));
    }

    public static final b0 g(kotlin.jvm.functions.l lVar) {
        c0 c0Var = new c0();
        lVar.invoke(c0Var);
        boolean z = c0Var.b;
        boolean z2 = c0Var.c;
        String str = c0Var.e;
        a0 a0Var = c0Var.a;
        if (str != null) {
            boolean z3 = c0Var.f;
            boolean z4 = c0Var.g;
            a0Var.b = str;
            a0Var.a = -1;
            a0Var.c = z3;
            a0Var.d = z4;
        } else {
            int i = c0Var.d;
            boolean z5 = c0Var.f;
            boolean z6 = c0Var.g;
            a0Var.a = i;
            a0Var.b = null;
            a0Var.c = z5;
            a0Var.d = z6;
        }
        String str2 = a0Var.b;
        if (str2 == null) {
            return new b0(z, z2, a0Var.a, a0Var.c, a0Var.d, a0Var.e, a0Var.f);
        }
        boolean z7 = a0Var.c;
        boolean z8 = a0Var.d;
        int i2 = a0Var.e;
        int i3 = a0Var.f;
        int i4 = t.B;
        b0 b0Var = new b0(z, z2, "android-app://androidx.navigation/".concat(str2).hashCode(), z7, z8, i2, i3);
        b0Var.h = str2;
        return b0Var;
    }
}
