package com.google.android.gms.measurement.internal;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements y, com.google.firebase.events.a, com.google.firebase.crashlytics.internal.settings.b, com.google.firebase.crashlytics.internal.stacktrace.a, okhttp3.logging.b {
    public final /* synthetic */ int e;
    public static final /* synthetic */ f0 y = new f0(0);
    public static final /* synthetic */ f0 z = new f0(1);
    public static final /* synthetic */ f0 A = new f0(2);
    public static final /* synthetic */ f0 B = new f0(3);
    public static final /* synthetic */ f0 C = new f0(4);
    public static final /* synthetic */ f0 D = new f0(5);
    public static final /* synthetic */ f0 E = new f0(6);
    public static final /* synthetic */ f0 F = new f0(8);

    public /* synthetic */ f0(int i) {
        this.e = i;
    }

    public static ArrayList b(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((okhttp3.z) obj) != okhttp3.z.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((okhttp3.z) it.next()).e);
        }
        return arrayList2;
    }

    public static String e(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static byte[] f(List list) {
        list.getClass();
        okio.f fVar = new okio.f();
        for (String str : b(list)) {
            fVar.o0(str.length());
            fVar.u0(str);
        }
        return fVar.d0(fVar.y);
    }

    public static com.google.firebase.crashlytics.internal.settings.a g(f0 f0Var) {
        return new com.google.firebase.crashlytics.internal.settings.a(System.currentTimeMillis() + ((long) 3600000), new androidx.compose.animation.core.t2(8), new androidx.media3.exoplayer.audio.g(true, false, false), 10.0d, 1.2d, 60);
    }

    public static okio.x i(String str) {
        str.getClass();
        okio.i iVar = okio.internal.c.a;
        okio.f fVar = new okio.f();
        fVar.u0(str);
        return okio.internal.c.d(fVar, false);
    }

    public static okio.x j(File file) {
        String str = okio.x.y;
        String string = file.toString();
        string.getClass();
        return i(string);
    }

    public static boolean l(Collection collection, String str) {
        boolean zEquals;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                if (list.get(0).equals(2)) {
                    String str2 = (String) list.get(1);
                    if (str == null || str2 == null || str.trim().isEmpty() || str2.trim().isEmpty()) {
                        net.luminis.tls.engine.impl.c.o("can't be null or empty");
                        return false;
                    }
                    if (str2.startsWith("*.")) {
                        int iIndexOf = str.indexOf(".");
                        zEquals = (iIndexOf > 0 && str.substring(iIndexOf + 1).equals(str2.substring(2))) || str.equals(str2.substring(2));
                    } else {
                        zEquals = str.equals(str2);
                    }
                    if (zEquals) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.y
    public Object a() {
        switch (this.e) {
            case 0:
                List list = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.s3.a.get();
            case 1:
                List list2 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 2:
                List list3 = h0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(1, "measurement.rb.attribution.client2", true).get();
            case 3:
                List list4 = h0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
            case 4:
                List list5 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.l4.b.get();
            case 5:
                List list6 = h0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(0, 10000L, "measurement.ad_id_cache_time").get();
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.d4.a.get()).booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // com.google.firebase.crashlytics.internal.stacktrace.a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // okhttp3.logging.b
    public void d(String str) {
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        okhttp3.internal.platform.e.a.i(4, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    public com.google.gson.internal.o h(com.google.gson.reflect.a aVar, boolean z2) {
        com.google.gson.internal.o oVar;
        final String str;
        com.google.gson.internal.o lVar;
        final Type typeB = aVar.b();
        Class clsA = aVar.a();
        Map map = Collections.EMPTY_MAP;
        com.google.gson.b bVar = null;
        if (map.get(typeB) != null) {
            androidx.transition.k.i();
            return null;
        }
        if (map.get(clsA) != null) {
            androidx.transition.k.i();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        if (EnumSet.class.isAssignableFrom(clsA)) {
            oVar = new com.google.gson.internal.o() { // from class: com.google.gson.internal.b
                @Override // com.google.gson.internal.o
                public final Object a() {
                    switch (i2) {
                        case 0:
                            Type type = typeB;
                            if (type instanceof ParameterizedType) {
                                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                                if (type2 instanceof Class) {
                                    return EnumSet.noneOf((Class) type2);
                                }
                                com.google.gson.b.q(type, "Invalid EnumSet type: ");
                            } else {
                                com.google.gson.b.q(type, "Invalid EnumSet type: ");
                            }
                            return null;
                        default:
                            Type type3 = typeB;
                            if (type3 instanceof ParameterizedType) {
                                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                                if (type4 instanceof Class) {
                                    return new EnumMap((Class) type4);
                                }
                                com.google.gson.b.q(type3, "Invalid EnumMap type: ");
                            } else {
                                com.google.gson.b.q(type3, "Invalid EnumMap type: ");
                            }
                            return null;
                    }
                }
            };
        } else {
            oVar = clsA == EnumMap.class ? new com.google.gson.internal.o() { // from class: com.google.gson.internal.b
                @Override // com.google.gson.internal.o
                public final Object a() {
                    switch (i) {
                        case 0:
                            Type type = typeB;
                            if (type instanceof ParameterizedType) {
                                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                                if (type2 instanceof Class) {
                                    return EnumSet.noneOf((Class) type2);
                                }
                                com.google.gson.b.q(type, "Invalid EnumSet type: ");
                            } else {
                                com.google.gson.b.q(type, "Invalid EnumSet type: ");
                            }
                            return null;
                        default:
                            Type type3 = typeB;
                            if (type3 instanceof ParameterizedType) {
                                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                                if (type4 instanceof Class) {
                                    return new EnumMap((Class) type4);
                                }
                                com.google.gson.b.q(type3, "Invalid EnumMap type: ");
                            } else {
                                com.google.gson.b.q(type3, "Invalid EnumMap type: ");
                            }
                            return null;
                    }
                }
            } : null;
        }
        if (oVar != null) {
            return oVar;
        }
        List list = Collections.EMPTY_LIST;
        com.google.gson.internal.h.e();
        int i3 = 11;
        if (Modifier.isAbstract(clsA.getModifiers())) {
            lVar = null;
        } else {
            try {
                Constructor declaredConstructor = clsA.getDeclaredConstructor(null);
                com.google.common.base.c cVar = com.google.gson.internal.reflect.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + com.google.gson.internal.reflect.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + com.google.gson.internal.reflect.c.e(e);
                }
                lVar = str != null ? new com.google.gson.internal.o() { // from class: com.google.gson.internal.a
                    @Override // com.google.gson.internal.o
                    public final Object a() {
                        switch (i2) {
                            case 0:
                                throw new com.google.gson.i(str, 8);
                            case 1:
                                throw new com.google.gson.i(str, 8);
                            default:
                                throw new com.google.gson.i(str, 8);
                        }
                    }
                } : new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(declaredConstructor, i3);
            } catch (NoSuchMethodException unused) {
                lVar = null;
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (Collection.class.isAssignableFrom(clsA)) {
            if (clsA.isAssignableFrom(ArrayList.class)) {
                bVar = new com.google.gson.b(8);
            } else if (clsA.isAssignableFrom(LinkedHashSet.class)) {
                bVar = new com.google.gson.b(9);
            } else if (clsA.isAssignableFrom(TreeSet.class)) {
                bVar = new com.google.gson.b(10);
            } else if (clsA.isAssignableFrom(ArrayDeque.class)) {
                bVar = new com.google.gson.b(11);
            }
        } else if (Map.class.isAssignableFrom(clsA)) {
            if (clsA.isAssignableFrom(com.google.gson.internal.n.class)) {
                if (typeB instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) typeB).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || com.google.gson.internal.h.g(actualTypeArguments[0]) != String.class) {
                        if (clsA.isAssignableFrom(LinkedHashMap.class)) {
                            bVar = new com.google.gson.b(4);
                        } else if (clsA.isAssignableFrom(TreeMap.class)) {
                            bVar = new com.google.gson.b(5);
                        } else if (clsA.isAssignableFrom(ConcurrentHashMap.class)) {
                            bVar = new com.google.gson.b(6);
                        } else if (clsA.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            bVar = new com.google.gson.b(7);
                        }
                    }
                }
                bVar = new com.google.gson.b(3);
            } else if (clsA.isAssignableFrom(LinkedHashMap.class)) {
                bVar = new com.google.gson.b(4);
            } else if (clsA.isAssignableFrom(TreeMap.class)) {
                bVar = new com.google.gson.b(5);
            } else if (clsA.isAssignableFrom(ConcurrentHashMap.class)) {
                bVar = new com.google.gson.b(6);
            } else if (clsA.isAssignableFrom(ConcurrentSkipListMap.class)) {
                bVar = new com.google.gson.b(7);
            }
        }
        if (bVar != null) {
            return bVar;
        }
        final String strE = e(clsA);
        if (strE != null) {
            return new com.google.gson.internal.o() { // from class: com.google.gson.internal.a
                @Override // com.google.gson.internal.o
                public final Object a() {
                    switch (i) {
                        case 0:
                            throw new com.google.gson.i(strE, 8);
                        case 1:
                            throw new com.google.gson.i(strE, 8);
                        default:
                            throw new com.google.gson.i(strE, 8);
                    }
                }
            };
        }
        if (z2) {
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(clsA, 12);
        }
        final String str2 = "Unable to create instance of " + clsA + "; Register an InstanceCreator or a TypeAdapter for this type.";
        final int i4 = 2;
        return new com.google.gson.internal.o() { // from class: com.google.gson.internal.a
            @Override // com.google.gson.internal.o
            public final Object a() {
                switch (i4) {
                    case 0:
                        throw new com.google.gson.i(str2, 8);
                    case 1:
                        throw new com.google.gson.i(str2, 8);
                    default:
                        throw new com.google.gson.i(str2, 8);
                }
            }
        };
    }

    @Override // com.google.firebase.crashlytics.internal.settings.b
    public com.google.firebase.crashlytics.internal.settings.a k(f0 f0Var, JSONObject jSONObject) {
        return g(f0Var);
    }

    public String toString() {
        switch (this.e) {
            case 12:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }
}
