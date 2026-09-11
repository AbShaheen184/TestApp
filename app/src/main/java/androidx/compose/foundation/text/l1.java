package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public androidx.compose.foundation.text.input.internal.o a;
    public androidx.compose.foundation.text.input.internal.o b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    public final void a(androidx.compose.ui.text.input.x xVar) {
        androidx.compose.foundation.text.input.internal.o oVar;
        androidx.compose.ui.text.g gVar = xVar.a;
        this.e = false;
        androidx.compose.foundation.text.input.internal.o oVar2 = this.a;
        if (xVar.equals(oVar2 != null ? (androidx.compose.ui.text.input.x) oVar2.z : null)) {
            return;
        }
        String str = gVar.y;
        androidx.compose.foundation.text.input.internal.o oVar3 = this.a;
        boolean zA = kotlin.jvm.internal.l.a(str, oVar3 != null ? ((androidx.compose.ui.text.input.x) oVar3.z).a.y : null);
        androidx.compose.foundation.text.input.internal.o oVar4 = this.a;
        if (zA) {
            if (oVar4 != null) {
                oVar4.z = xVar;
                return;
            }
            return;
        }
        this.a = new androidx.compose.foundation.text.input.internal.o(7, oVar4, xVar);
        this.b = null;
        int length = gVar.y.length() + this.c;
        this.c = length;
        if (length > 100000) {
            androidx.compose.foundation.text.input.internal.o oVar5 = this.a;
            if ((oVar5 != null ? (androidx.compose.foundation.text.input.internal.o) oVar5.y : null) == null) {
                return;
            }
            while (true) {
                if (oVar5 == null) {
                    oVar = null;
                } else {
                    androidx.compose.foundation.text.input.internal.o oVar6 = (androidx.compose.foundation.text.input.internal.o) oVar5.y;
                    if (oVar6 != null) {
                        oVar = (androidx.compose.foundation.text.input.internal.o) oVar6.y;
                    } else {
                        oVar = null;
                    }
                }
                if (oVar == null) {
                    break;
                } else {
                    oVar5 = (androidx.compose.foundation.text.input.internal.o) oVar5.y;
                }
            }
            if (oVar5 != null) {
                oVar5.y = null;
            }
        }
    }
}
