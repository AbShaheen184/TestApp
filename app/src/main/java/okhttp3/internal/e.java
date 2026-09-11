package okhttp3.internal;

import com.google.android.gms.measurement.internal.e0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.internal.l;
import okio.h;
import okio.i;
import okio.k;
import okio.v;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final byte[] a = new byte[0];
    public static final v b;

    static {
        i iVar = i.A;
        i[] iVarArr = {e0.g("efbbbf"), e0.g("feff"), e0.g("fffe0000"), e0.g("fffe"), e0.g("0000feff")};
        ArrayList arrayList = new ArrayList(new j(iVarArr, false));
        r.A(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(com.google.common.base.c.b(arrayList, iVarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((i) arrayList.get(0)).f() <= 0) {
            net.luminis.tls.engine.impl.c.o("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            i iVar2 = (i) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                i iVar3 = (i) arrayList.get(i6);
                iVar3.getClass();
                iVar2.getClass();
                if (!iVar3.n(0, iVar2, iVar2.f())) {
                    break;
                }
                if (iVar3.f() == iVar2.f()) {
                    net.luminis.tls.engine.impl.c.n(iVar3, "duplicate option: ");
                    return;
                } else if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        okio.f fVar = new okio.f();
        okio.b.c(0L, fVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (fVar.y / ((long) 4));
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = fVar.readInt();
        }
        b = new v((i[]) Arrays.copyOf(iVarArr, 5), iArr);
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j, "length=", ", offset=");
            sbM.append(j2);
            sbM.append(", count=");
            sbM.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbM.toString());
        }
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void c(k kVar, x xVar) throws IOException {
        kVar.getClass();
        try {
            IOException iOException = null;
            for (x xVar2 : kVar.X(xVar)) {
                try {
                    if (kVar.Y(xVar2).c) {
                        c(kVar, xVar2);
                    }
                    kVar.z(xVar2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(okhttp3.internal.cache.g gVar, x xVar) {
        gVar.getClass();
        xVar.getClass();
        try {
            gVar.z.z(xVar);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, String str2, int i2) {
        str.getClass();
        while (i < i2) {
            if (kotlin.text.k.U(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return e(str, c, i, i2);
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int i(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (l.b(cCharAt, 31) <= 0 || l.b(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int j(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int k(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] l(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean m(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int n(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int o(h hVar) {
        hVar.getClass();
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final int p(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String q(int i, int i2, String str) {
        str.getClass();
        int iJ = j(i, i2, str);
        return str.substring(iJ, k(iJ, i2, str));
    }
}
