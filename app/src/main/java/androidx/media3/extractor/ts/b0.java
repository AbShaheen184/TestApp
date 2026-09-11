package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.extractor.h0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final /* synthetic */ int a;
    public final List b;
    public final h0[] c;
    public final androidx.appcompat.widget.o d;

    public b0(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new h0[list.size()];
                androidx.appcompat.widget.o oVar = new androidx.appcompat.widget.o(new androidx.activity.y(this, 25));
                this.d = oVar;
                oVar.l(3);
                break;
            default:
                this.b = list;
                this.c = new h0[list.size()];
                this.d = new androidx.appcompat.widget.o(new androidx.activity.y(this, 24));
                break;
        }
    }

    public void a(long j, androidx.media3.common.util.w wVar) {
        if (wVar.a() < 9) {
            return;
        }
        int iM = wVar.m();
        int iM2 = wVar.m();
        int iZ = wVar.z();
        if (iM == 434 && iM2 == 1195456820 && iZ == 3) {
            this.d.a(j, wVar);
        }
    }

    public final void b(androidx.media3.extractor.p pVar, e0 e0Var) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    h0[] h0VarArr = this.c;
                    if (i < h0VarArr.length) {
                        e0Var.a();
                        e0Var.b();
                        h0 h0VarU = pVar.u(e0Var.d, 3);
                        androidx.media3.common.r rVar = (androidx.media3.common.r) this.b.get(i);
                        String str = rVar.o;
                        com.google.android.material.motion.a.h("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = rVar.a;
                        if (str2 == null) {
                            e0Var.b();
                            str2 = e0Var.e;
                        }
                        androidx.media3.common.q qVar = new androidx.media3.common.q();
                        qVar.a = str2;
                        qVar.m = i0.p("video/mp2t");
                        qVar.n = i0.p(str);
                        qVar.e = rVar.e;
                        qVar.d = rVar.d;
                        qVar.K = rVar.L;
                        qVar.q = rVar.r;
                        h0VarU.e(new androidx.media3.common.r(qVar));
                        h0VarArr[i] = h0VarU;
                        i++;
                    }
                    break;
                }
                break;
            default:
                int i2 = 0;
                while (true) {
                    h0[] h0VarArr2 = this.c;
                    if (i2 < h0VarArr2.length) {
                        e0Var.a();
                        e0Var.b();
                        h0 h0VarU2 = pVar.u(e0Var.d, 3);
                        androidx.media3.common.r rVar2 = (androidx.media3.common.r) this.b.get(i2);
                        String str3 = rVar2.o;
                        com.google.android.material.motion.a.h("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                        e0Var.b();
                        qVar2.a = e0Var.e;
                        qVar2.m = i0.p("video/mp2t");
                        qVar2.n = i0.p(str3);
                        qVar2.e = rVar2.e;
                        qVar2.d = rVar2.d;
                        qVar2.K = rVar2.L;
                        qVar2.q = rVar2.r;
                        h0VarU2.e(new androidx.media3.common.r(qVar2));
                        h0VarArr2[i2] = h0VarU2;
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
