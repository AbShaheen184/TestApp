package okio.internal;

import com.google.android.gms.measurement.internal.e0;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.collections.o;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final okio.i a;
    public static final okio.i b;
    public static final okio.i c;
    public static final okio.i d;
    public static final okio.i e;

    static {
        okio.i iVar = okio.i.A;
        a = e0.h("/");
        b = e0.h("\\");
        c = e0.h("/\\");
        d = e0.h(".");
        e = e0.h("..");
    }

    public static final int a(x xVar) {
        okio.i iVar = xVar.e;
        if (iVar.f() != 0) {
            if (iVar.k(0) != 47) {
                if (iVar.k(0) == 92) {
                    if (iVar.f() > 2 && iVar.k(1) == 92) {
                        okio.i iVar2 = b;
                        iVar2.getClass();
                        int iH = iVar.h(iVar2.j(), 2);
                        return iH == -1 ? iVar.f() : iH;
                    }
                } else if (iVar.f() > 2 && iVar.k(1) == 58 && iVar.k(2) == 92) {
                    char cK = (char) iVar.k(0);
                    if ('a' <= cK && cK < '{') {
                        return 3;
                    }
                    if ('A' <= cK && cK < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final x b(x xVar, x xVar2, boolean z) {
        xVar2.getClass();
        if (a(xVar2) != -1 || xVar2.h() != null) {
            return xVar2;
        }
        okio.i iVarC = c(xVar);
        if (iVarC == null && (iVarC = c(xVar2)) == null) {
            iVarC = f(x.y);
        }
        okio.f fVar = new okio.f();
        fVar.m0(xVar.e);
        if (fVar.y > 0) {
            fVar.m0(iVarC);
        }
        fVar.m0(xVar2.e);
        return d(fVar, z);
    }

    public static final okio.i c(x xVar) {
        okio.i iVar = xVar.e;
        okio.i iVar2 = a;
        if (okio.i.i(iVar, iVar2) != -1) {
            return iVar2;
        }
        okio.i iVar3 = xVar.e;
        okio.i iVar4 = b;
        if (okio.i.i(iVar3, iVar4) != -1) {
            return iVar4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fe A[SYNTHETIC] */
    public static final x d(okio.f fVar, boolean z) throws EOFException {
        okio.i iVar;
        long j;
        char cY;
        boolean z2;
        ArrayList arrayList;
        boolean zX;
        okio.i iVar2;
        int size;
        int i;
        long jA0;
        okio.i iVarK;
        okio.i iVar3;
        okio.f fVar2 = new okio.f();
        okio.i iVarE = null;
        int i2 = 0;
        while (true) {
            if (!fVar.A(0L, a)) {
                iVar = b;
                if (!fVar.A(0L, iVar)) {
                    break;
                }
            }
            byte b2 = fVar.readByte();
            if (iVarE == null) {
                iVarE = e(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && kotlin.jvm.internal.l.a(iVarE, iVar);
        okio.i iVar4 = c;
        if (z3) {
            iVarE.getClass();
            fVar2.m0(iVarE);
            fVar2.m0(iVarE);
        } else {
            if (i2 <= 0) {
                long jA1 = fVar.a0(iVar4);
                if (iVarE == null) {
                    iVarE = jA1 == -1 ? f(x.y) : e(fVar.Y(jA1));
                }
                if (kotlin.jvm.internal.l.a(iVarE, iVar) && fVar.y >= 2) {
                    j = -1;
                    if (fVar.Y(1L) == 58 && (('a' <= (cY = (char) fVar.Y(0L)) && cY < '{') || ('A' <= cY && cY < '['))) {
                        if (jA1 == 2) {
                            fVar2.E(fVar, 3L);
                        } else {
                            fVar2.E(fVar, 2L);
                        }
                    }
                }
                if (fVar2.y > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zX = fVar.X();
                    iVar2 = d;
                    if (!zX) {
                        break;
                    }
                    jA0 = fVar.a0(iVar4);
                    if (jA0 == j) {
                        iVarK = fVar.k(fVar.y);
                    } else {
                        iVarK = fVar.k(jA0);
                        fVar.readByte();
                    }
                    iVar3 = e;
                    if (kotlin.jvm.internal.l.a(iVarK, iVar3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || kotlin.jvm.internal.l.a(o.S(arrayList), iVar3)))) {
                                arrayList.add(iVarK);
                            } else if (!z3 || arrayList.size() != 1) {
                                o.c0(arrayList);
                            }
                        }
                    } else if (kotlin.jvm.internal.l.a(iVarK, iVar2) && !kotlin.jvm.internal.l.a(iVarK, okio.i.A)) {
                        arrayList.add(iVarK);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        fVar2.m0(iVarE);
                    }
                    fVar2.m0((okio.i) arrayList.get(i));
                }
                if (fVar2.y == 0) {
                    fVar2.m0(iVar2);
                }
                return new x(fVar2.k(fVar2.y));
            }
            iVarE.getClass();
            fVar2.m0(iVarE);
        }
        j = -1;
        if (fVar2.y > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zX = fVar.X();
            iVar2 = d;
            if (!zX) {
                break;
                break;
            }
            jA0 = fVar.a0(iVar4);
            if (jA0 == j) {
                iVarK = fVar.k(fVar.y);
            } else {
                iVarK = fVar.k(jA0);
                fVar.readByte();
            }
            iVar3 = e;
            if (kotlin.jvm.internal.l.a(iVarK, iVar3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(iVarK);
            } else if (kotlin.jvm.internal.l.a(iVarK, iVar2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                fVar2.m0(iVarE);
            }
            fVar2.m0((okio.i) arrayList.get(i));
        }
        if (fVar2.y == 0) {
            fVar2.m0(iVar2);
        }
        return new x(fVar2.k(fVar2.y));
    }

    public static final okio.i e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(b2, "not a directory separator: "));
        return null;
    }

    public static final okio.i f(String str) {
        if (kotlin.jvm.internal.l.a(str, "/")) {
            return a;
        }
        if (kotlin.jvm.internal.l.a(str, "\\")) {
            return b;
        }
        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("not a directory separator: ", str));
        return null;
    }
}
