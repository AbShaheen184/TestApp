package com.google.android.material.shape;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public final /* synthetic */ int e;

    public /* synthetic */ e(int i) {
        this.e = i;
    }

    public static void a(int i) {
        if (2 > i || i >= 37) {
            com.google.gson.b.k(androidx.privacysandbox.ads.adservices.java.internal.a.v("radix ", i, " was not in valid range "), new kotlin.ranges.d(2, 36, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kotlin.coroutines.d b(kotlin.jvm.functions.p pVar, Object obj, kotlin.coroutines.d dVar) {
        pVar.getClass();
        dVar.getClass();
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(obj, dVar);
        }
        kotlin.coroutines.i context = dVar.getContext();
        return context == kotlin.coroutines.j.e ? new kotlin.coroutines.intrinsics.d(pVar, obj, dVar) : new kotlin.coroutines.intrinsics.e(dVar, context, pVar, obj);
    }

    public static void c(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (com.google.firebase.components.h hVar : (Set) it2.next()) {
                        for (com.google.firebase.components.j jVar : hVar.a.c) {
                            if (jVar.c == 0) {
                                Set<com.google.firebase.components.h> set = (Set) map.get(new com.google.firebase.components.i(jVar.a, jVar.b == 2));
                                if (set != null) {
                                    for (com.google.firebase.components.h hVar2 : set) {
                                        hVar.b.add(hVar2);
                                        hVar2.c.add(hVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<com.google.firebase.components.h> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (com.google.firebase.components.h hVar3 : hashSet) {
                    if (hVar3.c.isEmpty()) {
                        hashSet2.add(hVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    com.google.firebase.components.h hVar4 = (com.google.firebase.components.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar4);
                    i++;
                    for (com.google.firebase.components.h hVar5 : hVar4.b) {
                        hVar5.c.remove(hVar4);
                        if (hVar5.c.isEmpty()) {
                            hashSet2.add(hVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (com.google.firebase.components.h hVar6 : hashSet) {
                    if (!hVar6.c.isEmpty() && !hVar6.b.isEmpty()) {
                        arrayList2.add(hVar6.a);
                    }
                }
                throw new com.google.firebase.components.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 7);
            }
            com.google.firebase.components.b bVar = (com.google.firebase.components.b) it.next();
            com.google.firebase.components.h hVar7 = new com.google.firebase.components.h(bVar);
            for (com.google.firebase.components.r rVar : bVar.b) {
                boolean z = bVar.e == 0;
                com.google.firebase.components.i iVar = new com.google.firebase.components.i(rVar, !z);
                if (!map.containsKey(iVar)) {
                    map.put(iVar, new HashSet());
                }
                Set set2 = (Set) map.get(iVar);
                if (!set2.isEmpty() && z) {
                    net.luminis.tls.engine.impl.c.d(rVar, ".", "Multiple components provide ");
                    return;
                }
                set2.add(hVar7);
            }
        }
    }

    public static final boolean d(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static Application e(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        com.google.gson.b.m(context, "Could not find an Application in the given context: ");
        return null;
    }

    public static kotlin.coroutines.d g(kotlin.coroutines.d dVar) {
        kotlin.coroutines.d<Object> dVarIntercepted;
        dVar.getClass();
        kotlin.coroutines.jvm.internal.c cVar = dVar instanceof kotlin.coroutines.jvm.internal.c ? (kotlin.coroutines.jvm.internal.c) dVar : null;
        return (cVar == null || (dVarIntercepted = cVar.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static final boolean h(okio.f fVar) {
        fVar.getClass();
        try {
            okio.b0 b0Var = new okio.b0(new okio.y(fVar));
            for (long j = 0; j < 16 && !b0Var.a(); j++) {
                b0Var.R(1L);
                okio.f fVar2 = b0Var.y;
                byte bY = fVar2.Y(0L);
                if ((bY & 224) == 192) {
                    b0Var.R(2L);
                } else if ((bY & 240) == 224) {
                    b0Var.R(3L);
                } else if ((bY & 248) == 240) {
                    b0Var.R(4L);
                }
                int iJ0 = fVar2.j0();
                if (Character.isISOControl(iJ0) && !Character.isWhitespace(iJ0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean i(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static Stream j(org.jsoup.nodes.j jVar, Class cls) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new org.jsoup.nodes.p(jVar, cls), 273), false);
    }

    public static Object k(kotlin.jvm.functions.p pVar, Object obj, kotlin.coroutines.d dVar) {
        pVar.getClass();
        dVar.getClass();
        kotlin.coroutines.i context = dVar.getContext();
        Object fVar = context == kotlin.coroutines.j.e ? new kotlin.coroutines.intrinsics.f(dVar) : new kotlin.coroutines.intrinsics.g(dVar, context);
        kotlin.jvm.internal.c0.c(2, pVar);
        return pVar.invoke(obj, fVar);
    }

    public abstract void f(x xVar, float f, float f2);

    public int hashCode() {
        switch (this.e) {
            case 6:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.e) {
            case 6:
                String strC = kotlin.jvm.internal.a0.a(getClass()).c();
                strC.getClass();
                return strC;
            default:
                return super.toString();
        }
    }
}
