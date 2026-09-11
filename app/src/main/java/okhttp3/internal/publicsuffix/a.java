package okhttp3.internal.publicsuffix;

import com.caverock.androidsvg.y1;
import com.google.android.gms.measurement.internal.e0;
import com.google.common.base.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.o;
import kotlin.collections.s;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.sequences.d;
import kotlin.sequences.h;
import kotlin.text.k;
import okio.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final i b = new i(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = c.p("*");
    public static final a d = new a(new y1(11));
    public final y1 a;

    public a(y1 y1Var) {
        this.a = y1Var;
    }

    public static List b(String str) {
        List listO0 = k.o0(str, new char[]{'.'});
        if (!l.a(o.S(listO0), "")) {
            return listO0;
        }
        int size = listO0.size() - 1;
        return o.g0(size >= 0 ? size : 0, listO0);
    }

    public final String a(String str) {
        String strD;
        String strD2;
        String strD3;
        List listO0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        y1 y1Var = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) y1Var.a;
        int i = 0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) y1Var.b).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        y1Var.b0();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        y1Var.e = e;
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (((i) y1Var.c) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(y1Var.f);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) y1Var.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        i[] iVarArr = new i[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            i iVar = i.A;
            iVarArr[i2] = e0.h((String) listB.get(i2));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strD = null;
                break;
            }
            i iVar2 = (i) y1Var.c;
            if (iVar2 == null) {
                l.f("bytes");
                throw null;
            }
            strD = e0.d(iVar2, iVarArr, i3);
            if (strD != null) {
                break;
            }
            i3++;
        }
        if (size3 <= 1) {
            strD2 = null;
            break;
        }
        i[] iVarArr2 = (i[]) iVarArr.clone();
        int length = iVarArr2.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strD2 = null;
                break;
            }
            iVarArr2[i4] = b;
            i iVar3 = (i) y1Var.c;
            if (iVar3 == null) {
                l.f("bytes");
                throw null;
            }
            strD2 = e0.d(iVar3, iVarArr2, i4);
            if (strD2 != null) {
                break;
            }
            i4++;
        }
        if (strD2 == null) {
            strD3 = null;
            break;
        }
        int i5 = size3 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                strD3 = null;
                break;
            }
            i iVar4 = (i) y1Var.d;
            if (iVar4 == null) {
                l.f("exceptionBytes");
                throw null;
            }
            strD3 = e0.d(iVar4, iVarArr, i6);
            if (strD3 != null) {
                break;
            }
            i6++;
        }
        if (strD3 != null) {
            listO0 = k.o0("!".concat(strD3), new char[]{'.'});
        } else if (strD == null && strD2 == null) {
            listO0 = c;
        } else {
            List listO1 = u.e;
            List listO2 = strD != null ? k.o0(strD, new char[]{'.'}) : listO1;
            if (strD2 != null) {
                listO1 = k.o0(strD2, new char[]{'.'});
            }
            listO0 = listO2.size() > listO1.size() ? listO2 : listO1;
        }
        if (listB.size() == listO0.size() && ((String) listO0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listO0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listO0.size();
        } else {
            size = listB.size();
            size2 = listO0.size() + 1;
        }
        int i7 = size - size2;
        h sVar = new s(b(str), i);
        if (i7 < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Requested element count ", i7, " is less than zero."));
            return null;
        }
        if (i7 != 0) {
            sVar = sVar instanceof d ? ((d) sVar).a(i7) : new kotlin.sequences.c(sVar, i7);
        }
        return kotlin.sequences.k.p(sVar, ".");
    }
}
