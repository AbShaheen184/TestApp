package okhttp3.internal;

import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.text.k;
import okhttp3.g0;
import okhttp3.r;
import okhttp3.s;
import okhttp3.y;
import okio.h;
import okio.h0;
import okio.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = k.k0(k.j0(y.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(s sVar, s sVar2) {
        sVar.getClass();
        sVar2.getClass();
        return l.a(sVar.d, sVar2.d) && sVar.e == sVar2.e && l.a(sVar.a, sVar2.a);
    }

    public static final int b(String str, long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        if (j < 0) {
            net.luminis.tls.engine.impl.c.c(str.concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            net.luminis.tls.engine.impl.c.p(str.concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        net.luminis.tls.engine.impl.c.p(str.concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!l.a(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(g0 g0Var) {
        String strB = g0Var.C.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        byte[] bArr = e.a;
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(h hVar, Charset charset) {
        hVar.getClass();
        charset.getClass();
        int iW = hVar.W(e.b);
        if (iW == -1) {
            return charset;
        }
        if (iW == 0) {
            return kotlin.text.a.a;
        }
        if (iW == 1) {
            return kotlin.text.a.b;
        }
        if (iW == 2) {
            Charset charset2 = kotlin.text.a.a;
            Charset charset3 = kotlin.text.a.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            kotlin.text.a.e = charsetForName;
            return charsetForName;
        }
        if (iW == 3) {
            return kotlin.text.a.c;
        }
        if (iW != 4) {
            throw new AssertionError();
        }
        Charset charset4 = kotlin.text.a.a;
        Charset charset5 = kotlin.text.a.f;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        kotlin.text.a.f = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(h0 h0Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = h0Var.e().e() ? h0Var.e().c() - jNanoTime : Long.MAX_VALUE;
        h0Var.e().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            okio.f fVar = new okio.f();
            while (h0Var.K(fVar, 8192L) != -1) {
                fVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                h0Var.e().a();
                return true;
            }
            h0Var.e().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                h0Var.e().a();
                return false;
            }
            h0Var.e().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                h0Var.e().a();
            } else {
                h0Var.e().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final r h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            okhttp3.internal.http2.d dVar = (okhttp3.internal.http2.d) it.next();
            i iVar = dVar.a;
            i iVar2 = dVar.b;
            String strU = iVar.u();
            String strU2 = iVar2.u();
            arrayList.add(strU);
            arrayList.add(k.A0(strU2).toString());
        }
        return new r((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(s sVar, boolean z) {
        int i;
        sVar.getClass();
        int i2 = sVar.e;
        String strK = sVar.d;
        if (k.T(strK, ":", false)) {
            strK = androidx.privacysandbox.ads.adservices.java.internal.a.k(']', "[", strK);
        }
        if (!z) {
            String str = sVar.a;
            str.getClass();
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strK;
            }
        }
        return strK + ':' + i2;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return u.e;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return u.e;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List listAsList = Arrays.asList(objArr2);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
