package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text.r0;
import androidx.compose.runtime.h1;
import androidx.compose.ui.text.input.d0;
import androidx.compose.ui.text.l0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ i y;

    public /* synthetic */ h(i iVar, androidx.compose.ui.semantics.x xVar) {
        this.e = 3;
        this.y = iVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        boolean z = true;
        i iVar = this.y;
        switch (i) {
            case 0:
                h1 h1Var = iVar.P.t;
                Boolean bool = Boolean.TRUE;
                h1Var.setValue(bool);
                iVar.P.s.setValue(bool);
                r0 r0Var = iVar.P;
                CharSequence charSequenceB = ((androidx.compose.ui.autofill.g) ((androidx.compose.ui.autofill.q) obj)).b();
                charSequenceB.getClass();
                i.O0(r0Var, (String) charSequenceB, iVar.Q, iVar.R);
                return bool;
            case 1:
                List list = (List) obj;
                if (iVar.P.d() != null) {
                    k1 k1VarD = iVar.P.d();
                    k1VarD.getClass();
                    list.add(k1VarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                i.O0(iVar.P, ((androidx.compose.ui.text.g) obj).y, iVar.Q, iVar.R);
                return Boolean.TRUE;
            default:
                androidx.compose.ui.text.g gVar = (androidx.compose.ui.text.g) obj;
                if (iVar.Q || !iVar.R) {
                    z = false;
                } else {
                    d0 d0Var = iVar.P.e;
                    StringBuilder sb = null;
                    if (d0Var != null) {
                        List listQ = com.google.common.base.c.q(new androidx.compose.ui.text.input.i(), new androidx.compose.ui.text.input.a(gVar, 1));
                        r0 r0Var2 = iVar.P;
                        o oVar = r0Var2.d;
                        androidx.compose.foundation.text.s sVar = r0Var2.v;
                        androidx.compose.ui.text.input.x xVarJ = oVar.j(listQ);
                        d0Var.a(null, xVarJ);
                        sVar.invoke(xVarJ);
                    } else {
                        androidx.compose.ui.text.input.x xVar = iVar.O;
                        String str = xVar.a.y;
                        long j = xVar.b;
                        int i2 = l0.c;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        gVar.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) gVar);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            com.google.gson.b.d(i4, "End index (", ") is less than start index (", i3);
                        }
                        String string = sb.toString();
                        int length = gVar.y.length() + ((int) (iVar.O.b >> 32));
                        iVar.P.v.invoke(new androidx.compose.ui.text.input.x(4, androidx.compose.ui.text.d0.b(length, length), string));
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ h(i iVar, int i) {
        this.e = i;
        this.y = iVar;
    }
}
