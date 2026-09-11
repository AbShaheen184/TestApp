package okhttp3.logging;

import androidx.compose.foundation.lazy.grid.u;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.constraintlayout.core.g;
import com.google.android.material.shape.e;
import java.nio.charset.Charset;
import kotlin.collections.w;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.internal.connection.n;
import okhttp3.j0;
import okhttp3.r;
import okhttp3.s;
import okhttp3.t;
import okio.f;
import okio.h;
import okio.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {
    public final b a;
    public volatile w b;
    public volatile w c;
    public volatile a d;

    public c(b bVar) {
        this.a = bVar;
        w wVar = w.e;
        this.b = wVar;
        this.c = wVar;
        this.d = a.e;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0102 A[LOOP:0: B:45:0x0100->B:46:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0225  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0225, please report this as an issue */
    @Override // okhttp3.t
    public final g0 a(u uVar) throws Exception {
        boolean z;
        String str;
        Long lValueOf;
        Charset charsetA;
        int size;
        int i;
        Long lValueOf2;
        Charset charsetA2;
        a aVar = this.d;
        b0 b0Var = (b0) uVar.i;
        if (aVar == a.e) {
            return uVar.f(b0Var);
        }
        boolean z2 = true;
        boolean z3 = aVar == a.z;
        if (!z3 && aVar != a.y) {
            z2 = false;
        }
        e0 e0Var = b0Var.d;
        b1 b1Var = (b1) uVar.h;
        n nVarI = b1Var != null ? b1Var.i() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(b0Var.b);
        sb.append(' ');
        s sVar = b0Var.a;
        sVar.getClass();
        this.c.getClass();
        sb.append(sVar.i);
        String str2 = " ";
        sb.append(nVarI != null ? " " + nVarI.g : "");
        String string = sb.toString();
        if (!z2 && e0Var != null) {
            StringBuilder sbD = g.d(string, " (");
            sbD.append(e0Var.a());
            sbD.append("-byte body)");
            string = sbD.toString();
        }
        this.a.d(string);
        if (z2) {
            r rVar = b0Var.c;
            if (e0Var != null) {
                okhttp3.u uVarB = e0Var.b();
                z = z3;
                if (uVarB != null && rVar.b("Content-Type") == null) {
                    this.a.d("Content-Type: " + uVarB);
                }
                if (e0Var.a() != -1 && rVar.b("Content-Length") == null) {
                    this.a.d("Content-Length: " + e0Var.a());
                }
                size = rVar.size();
                for (i = 0; i < size; i++) {
                    b(rVar, i);
                }
                if (z || e0Var == null) {
                    this.a.d("--> END " + b0Var.b);
                } else {
                    String strB = b0Var.c.b("Content-Encoding");
                    if (strB != null && !strB.equalsIgnoreCase("identity") && !strB.equalsIgnoreCase("gzip")) {
                        this.a.d("--> END " + b0Var.b + " (encoded body omitted)");
                    } else if (e0Var.c()) {
                        this.a.d("--> END " + b0Var.b + " (one-shot body omitted)");
                    } else {
                        f fVar = new f();
                        e0Var.d(fVar);
                        if ("gzip".equalsIgnoreCase(rVar.b("Content-Encoding"))) {
                            lValueOf2 = Long.valueOf(fVar.y);
                            p pVar = new p(fVar);
                            try {
                                fVar = new f();
                                fVar.n0(pVar);
                                pVar.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    com.google.common.base.b.d(pVar, th);
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf2 = null;
                        }
                        okhttp3.u uVarB2 = e0Var.b();
                        if (uVarB2 == null || (charsetA2 = okhttp3.u.a(uVarB2)) == null) {
                            charsetA2 = kotlin.text.a.a;
                        }
                        this.a.d("");
                        boolean zH = e.h(fVar);
                        b bVar = this.a;
                        if (!zH) {
                            bVar.d("--> END " + b0Var.b + " (binary " + e0Var.a() + "-byte body omitted)");
                        } else if (lValueOf2 != null) {
                            bVar.d("--> END " + b0Var.b + " (" + fVar.y + "-byte, " + lValueOf2.longValue() + "-gzipped-byte body)");
                        } else {
                            bVar.d(fVar.B(charsetA2));
                            this.a.d("--> END " + b0Var.b + " (" + e0Var.a() + "-byte body)");
                        }
                    }
                }
            } else {
                z = z3;
                z2 = z2;
                str2 = " ";
            }
            size = rVar.size();
            while (i < size) {
                b(rVar, i);
            }
            if (z) {
                this.a.d("--> END " + b0Var.b);
            } else {
                this.a.d("--> END " + b0Var.b);
            }
        } else {
            z = z3;
            z2 = z2;
            str2 = " ";
        }
        long jNanoTime = System.nanoTime();
        try {
            g0 g0VarF = uVar.f(b0Var);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            j0 j0Var = g0VarF.D;
            j0Var.getClass();
            long jM = j0Var.m();
            String str3 = jM != -1 ? jM + "-byte" : "unknown-length";
            b bVar2 = this.a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- " + g0VarF.A);
            if (g0VarF.z.length() > 0) {
                str = str2;
                sb2.append(str + g0VarF.z);
            } else {
                str = str2;
            }
            StringBuilder sb3 = new StringBuilder(str);
            s sVar2 = g0VarF.e.a;
            sVar2.getClass();
            this.c.getClass();
            sb3.append(sVar2.i);
            sb3.append(" (");
            sb3.append(jNanoTime2);
            sb3.append("ms");
            sb2.append(sb3.toString());
            if (!z2) {
                sb2.append(", " + str3 + " body");
            }
            sb2.append(")");
            bVar2.d(sb2.toString());
            if (z2) {
                r rVar2 = g0VarF.C;
                int size2 = rVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(rVar2, i2);
                }
                if (z && okhttp3.internal.http.f.a(g0VarF)) {
                    String strB2 = g0VarF.C.b("Content-Encoding");
                    if (strB2 != null && !strB2.equalsIgnoreCase("identity") && !strB2.equalsIgnoreCase("gzip")) {
                        this.a.d("<-- END HTTP (encoded body omitted)");
                        return g0VarF;
                    }
                    okhttp3.u uVarW = g0VarF.D.w();
                    if (uVarW != null && uVarW.b.equals("text") && uVarW.c.equals("event-stream")) {
                        this.a.d("<-- END HTTP (streaming)");
                        return g0VarF;
                    }
                    h hVarP = j0Var.P();
                    hVarP.request(Long.MAX_VALUE);
                    long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                    f fVarD = hVarP.d();
                    if ("gzip".equalsIgnoreCase(rVar2.b("Content-Encoding"))) {
                        lValueOf = Long.valueOf(fVarD.y);
                        p pVar2 = new p(fVarD.clone());
                        try {
                            fVarD = new f();
                            fVarD.n0(pVar2);
                            pVar2.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                com.google.common.base.b.d(pVar2, th3);
                                throw th4;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    okhttp3.u uVarW2 = j0Var.w();
                    if (uVarW2 == null || (charsetA = okhttp3.u.a(uVarW2)) == null) {
                        charsetA = kotlin.text.a.a;
                    }
                    if (!e.h(fVarD)) {
                        this.a.d("");
                        b bVar3 = this.a;
                        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(jNanoTime3, "<-- END HTTP (", "ms, binary ");
                        sbM.append(fVarD.y);
                        sbM.append("-byte body omitted)");
                        bVar3.d(sbM.toString());
                        return g0VarF;
                    }
                    if (jM != 0) {
                        this.a.d("");
                        this.a.d(fVarD.clone().B(charsetA));
                    }
                    b bVar4 = this.a;
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sbM2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(jNanoTime3, "<-- END HTTP (", "ms, ");
                    sbM2.append(fVarD.y);
                    sbM2.append("-byte");
                    sb4.append(sbM2.toString());
                    if (lValueOf != null) {
                        sb4.append(", " + lValueOf.longValue() + "-gzipped-byte");
                    }
                    sb4.append(" body)");
                    bVar4.d(sb4.toString());
                    return g0VarF;
                }
                this.a.d("<-- END HTTP");
            }
            return g0VarF;
        } catch (Exception e) {
            long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
            StringBuilder sb5 = new StringBuilder(str2);
            s sVar3 = b0Var.a;
            sVar3.getClass();
            this.c.getClass();
            sb5.append(sVar3.i);
            sb5.append(" (");
            sb5.append(jNanoTime4);
            sb5.append("ms)");
            this.a.d(("<-- HTTP FAILED: " + e + '.').concat(sb5.toString()));
            throw e;
        }
    }

    public final void b(r rVar, int i) {
        w wVar = this.b;
        rVar.c(i);
        wVar.getClass();
        String strF = rVar.f(i);
        this.a.d(rVar.c(i) + ": " + strF);
    }

    public /* synthetic */ c() {
        this(b.x);
    }
}
