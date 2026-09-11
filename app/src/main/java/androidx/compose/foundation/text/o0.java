package androidx.compose.foundation.text;

import androidx.compose.ui.platform.k2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public final k2 a;
    public p0 b;
    public androidx.compose.ui.focus.l c;

    public o0(k2 k2Var) {
        this.a = k2Var;
    }

    public final p0 a() {
        p0 p0Var = this.b;
        if (p0Var != null) {
            return p0Var;
        }
        kotlin.jvm.internal.l.f("keyboardActions");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0050  */
    /* JADX WARN: Code duplicated, block: B:36:0x0054  */
    /* JADX WARN: Code duplicated, block: B:38:0x005a  */
    /* JADX WARN: Code duplicated, block: B:40:0x005e  */
    public final boolean b(int i) {
        kotlin.jvm.functions.l lVar;
        k2 k2Var;
        androidx.compose.ui.focus.l lVar2;
        androidx.compose.ui.focus.l lVar3;
        if (i != 7 && i != 2 && i != 6 && i != 5) {
            if (i == 3) {
                lVar = a().a;
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                net.luminis.tls.engine.impl.c.r("invalid ImeAction");
                return false;
            }
            if (lVar != null) {
                lVar.invoke(this);
                return true;
            }
            if (i == 6) {
                lVar3 = this.c;
                if (lVar3 != null) {
                    ((androidx.compose.ui.focus.p) lVar3).g(1, true);
                    return true;
                }
                kotlin.jvm.internal.l.f("focusManager");
                throw null;
            }
            if (i == 5) {
                if (i != 7 && (k2Var = this.a) != null) {
                    ((androidx.compose.ui.platform.m1) k2Var).a();
                    return true;
                }
            }
            lVar2 = this.c;
            if (lVar2 != null) {
                ((androidx.compose.ui.focus.p) lVar2).g(2, true);
                return true;
            }
            kotlin.jvm.internal.l.f("focusManager");
            throw null;
        }
        a();
        lVar = null;
        if (lVar != null) {
            lVar.invoke(this);
            return true;
        }
        if (i == 6) {
            lVar3 = this.c;
            if (lVar3 != null) {
                ((androidx.compose.ui.focus.p) lVar3).g(1, true);
                return true;
            }
            kotlin.jvm.internal.l.f("focusManager");
            throw null;
        }
        if (i == 5) {
            return i != 7 ? false : false;
        }
        lVar2 = this.c;
        if (lVar2 != null) {
            ((androidx.compose.ui.focus.p) lVar2).g(2, true);
            return true;
        }
        kotlin.jvm.internal.l.f("focusManager");
        throw null;
    }
}
