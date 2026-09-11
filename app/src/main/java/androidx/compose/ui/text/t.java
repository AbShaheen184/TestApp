package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        a = androidx.compose.ui.unit.o.c;
    }

    public static final s a(s sVar, int i, int i2, long j, androidx.compose.ui.text.style.q qVar, u uVar, androidx.compose.ui.text.style.i iVar, int i3, int i4, androidx.compose.ui.text.style.s sVar2) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        androidx.compose.ui.text.style.q qVar2 = qVar;
        u uVar2 = uVar;
        androidx.compose.ui.text.style.i iVar2 = iVar;
        int i7 = i3;
        int i8 = i4;
        androidx.compose.ui.text.style.s sVar3 = sVar2;
        if (i5 == 0 || i5 == sVar.a) {
            androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (androidx.compose.ui.unit.o.a(j3, sVar.c)) {
                }
            }
            if ((qVar2 == null || qVar2.equals(sVar.d)) && ((i6 == 0 || i6 == sVar.b) && ((uVar2 == null || uVar2.equals(sVar.e)) && ((iVar2 == null || iVar2.equals(sVar.f)) && ((i7 == 0 || i7 == sVar.g) && ((i8 == 0 || i8 == sVar.h) && (sVar3 == null || sVar3.equals(sVar.i)))))))) {
                return sVar;
            }
        } else {
            j2 = 0;
        }
        androidx.compose.ui.unit.p[] pVarArr2 = androidx.compose.ui.unit.o.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = sVar.c;
        }
        if (qVar2 == null) {
            qVar2 = sVar.d;
        }
        if (i5 == 0) {
            i5 = sVar.a;
        }
        if (i6 == 0) {
            i6 = sVar.b;
        }
        u uVar3 = sVar.e;
        if (uVar3 != null && uVar2 == null) {
            uVar2 = uVar3;
        }
        if (iVar2 == null) {
            iVar2 = sVar.f;
        }
        if (i7 == 0) {
            i7 = sVar.g;
        }
        if (i8 == 0) {
            i8 = sVar.h;
        }
        if (sVar3 == null) {
            sVar3 = sVar.i;
        }
        return new s(i5, i6, j3, qVar2, uVar2, iVar2, i7, i8, sVar3);
    }
}
