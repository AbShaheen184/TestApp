package com.google.common.base;

import com.google.android.gms.measurement.internal.e0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.a0;
import okhttp3.b0;
import okhttp3.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements j {
    public static ArrayList a(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new kotlin.collections.j(objArr, true));
    }

    public static int b(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        u(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iF = com.google.android.material.resources.c.f((Comparable) arrayList.get(i3), comparable);
            if (iF < 0) {
                i2 = i3 + 1;
            } else {
                if (iF <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static kotlin.collections.builders.b c(List list) {
        list.getClass();
        kotlin.collections.builders.b bVar = (kotlin.collections.builders.b) list;
        bVar.h();
        bVar.z = true;
        return bVar.y > 0 ? bVar : kotlin.collections.builders.b.A;
    }

    public static void d(com.grack.nanojson.c cVar) throws org.schabi.newpipe.extractor.exceptions.b {
        if (org.schabi.newpipe.extractor.utils.f.j(cVar.e("error"))) {
            return;
        }
        com.grack.nanojson.c cVarE = cVar.e("error");
        if (cVarE.c("code", 0) != 404) {
            throw new org.schabi.newpipe.extractor.exceptions.b(coil3.compose.internal.f.e("Got error:\"", cVarE.f("status", null), "\": ", cVarE.f("message", null)));
        }
        throw new org.schabi.newpipe.extractor.exceptions.b("This channel doesn't exist.");
    }

    public static void e(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void f(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final long g(long j, kotlin.time.c cVar) {
        long j2;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                com.google.gson.b.u(cVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static kotlin.collections.builders.b h() {
        return new kotlin.collections.builders.b(10);
    }

    public static int k(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0031  */
    public static boolean m(g0 g0Var, b0 b0Var) {
        b0Var.getClass();
        int i = g0Var.A;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i == 307) {
                if (g0.g("Expires", g0Var) == null && g0Var.a().c == -1 && !g0Var.a().f && !g0Var.a().e) {
                    return false;
                }
            } else if (i != 308 && i != 404 && i != 405) {
                switch (i) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (g0.g("Expires", g0Var) == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (g0Var.a().b) {
            return false;
        }
        okhttp3.g gVarY = b0Var.f;
        if (gVarY == null) {
            int i2 = okhttp3.g.n;
            gVarY = a0.y(b0Var.c);
            b0Var.f = gVarY;
        }
        return !gVarY.b;
    }

    public static String o(okhttp3.s sVar) {
        sVar.getClass();
        okio.i iVar = okio.i.A;
        return e0.h(sVar.i).e("MD5").g();
    }

    public static List p(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List q(Object... objArr) {
        if (objArr.length <= 0) {
            return kotlin.collections.u.e;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static ArrayList s(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new kotlin.collections.j(objArr, true));
    }

    public static final List t(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : p(list.get(0));
        }
        return kotlin.collections.u.e;
    }

    public static final void u(int i, int i2) {
        if (i2 < 0) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.p("fromIndex (0) is greater than toIndex (", i2, ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            com.google.gson.b.d(i2, "toIndex (", ") is greater than size (", i);
        }
    }

    public static int v(okio.b0 b0Var) throws IOException {
        try {
            okio.f fVar = b0Var.y;
            b0Var.R(1L);
            long j = 0;
            while (true) {
                long j2 = j + 1;
                if (!b0Var.request(j2)) {
                    break;
                }
                byte bY = fVar.Y(j);
                if ((bY >= 48 && bY <= 57) || (j == 0 && bY == 45)) {
                    j = j2;
                }
                if (j != 0) {
                    break;
                }
                com.google.android.material.shape.e.a(16);
                String string = Integer.toString(bY, 16);
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jE0 = fVar.e0();
            String strS = b0Var.s(Long.MAX_VALUE);
            if (jE0 >= 0 && jE0 <= 2147483647L && strS.length() <= 0) {
                return (int) jE0;
            }
            throw new IOException("expected an int but was \"" + jE0 + strS + '\"');
        } catch (NumberFormatException e) {
            net.luminis.tls.engine.impl.c.t(e.getMessage());
            return 0;
        }
    }

    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static Set x(okhttp3.r rVar) {
        int size = rVar.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(rVar.c(i))) {
                String strF = rVar.f(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = kotlin.text.k.o0(strF, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(kotlin.text.k.A0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? kotlin.collections.w.e : treeSet;
    }

    @Override // com.google.common.base.j
    /* JADX INFO: renamed from: apply */
    public boolean mo13apply(Object obj) {
        return r(((Character) obj).charValue());
    }

    public abstract Method i(Class cls, Field field);

    public abstract Constructor j(Class cls);

    public abstract String[] l(Class cls);

    public abstract boolean n(Class cls);

    public abstract boolean r(char c);
}
