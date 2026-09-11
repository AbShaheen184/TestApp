package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k C;
    public int e;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        j jVar = new j(this.C, dVar);
        jVar.B = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((kotlin.sequences.j) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.sequences.j jVar;
        int i;
        int i2;
        int i3;
        String strL;
        int i4;
        int i5;
        String str;
        k kVar = this.C;
        androidx.collection.j0 j0Var = kVar.e;
        androidx.collection.y yVar = kVar.z;
        int i6 = this.A;
        if (i6 == 0) {
            kotlin.a.e(obj);
            jVar = (kotlin.sequences.j) this.B;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.z;
            i2 = this.y;
            i3 = this.e;
            jVar = (kotlin.sequences.j) this.B;
            kotlin.a.e(obj);
        }
        if (i3 >= Math.min(kVar.A + 10, yVar.b)) {
            return kotlin.y.a;
        }
        int i7 = i3 + 1;
        int iC = yVar.c(i3);
        switch (iC) {
            case 0:
                strL = "up";
                break;
            case 1:
                String strO = androidx.privacysandbox.ads.adservices.java.internal.a.o(j0Var.f(i2), "down ");
                i2++;
                strL = strO;
                break;
            case 2:
                strL = "remove " + yVar.c(i7) + ' ' + yVar.c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strL = "move " + yVar.c(i7) + ' ' + yVar.c(i3 + 2) + ' ' + yVar.c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strL = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC2 = yVar.c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC2 + ' ' + j0Var.f(i2);
                int i8 = i4;
                strL = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC3 = yVar.c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iC3 + ' ' + j0Var.f(i2);
                int i9 = i4;
                strL = str;
                i7 = i9;
                i2 = i5;
                break;
            case 7:
                Object objF = j0Var.f(i2);
                objF.getClass();
                kotlin.jvm.internal.c0.c(2, objF);
                i2 += 2;
                strL = "apply " + ((kotlin.jvm.functions.p) objF);
                break;
            case 8:
                strL = "reuse " + kVar.y.f(i);
                i++;
                break;
            case 9:
                strL = "recompose pending";
                break;
            default:
                strL = androidx.privacysandbox.ads.adservices.java.internal.a.l(iC, "unknown op: ");
                break;
        }
        this.B = jVar;
        this.e = i7;
        this.y = i2;
        this.z = i;
        this.A = 1;
        jVar.b(i3 + ": " + strL, this);
        return kotlin.coroutines.intrinsics.a.e;
    }
}
