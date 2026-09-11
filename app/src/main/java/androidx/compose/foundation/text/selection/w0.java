package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ c1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(c1 c1Var, kotlin.coroutines.d dVar, int i) {
        super(1, dVar);
        this.e = i;
        this.y = c1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new w0(this.y, dVar, 0);
            case 1:
                return new w0(this.y, dVar, 1);
            case 2:
                return new w0(this.y, dVar, 2);
            default:
                return new w0(this.y, dVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        switch (this.e) {
            case 0:
                w0 w0Var = (w0) create(dVar);
                kotlin.y yVar = kotlin.y.a;
                w0Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                w0 w0Var2 = (w0) create(dVar);
                kotlin.y yVar2 = kotlin.y.a;
                w0Var2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                w0 w0Var3 = (w0) create(dVar);
                kotlin.y yVar3 = kotlin.y.a;
                w0Var3.invokeSuspend(yVar3);
                return yVar3;
            default:
                w0 w0Var4 = (w0) create(dVar);
                kotlin.y yVar4 = kotlin.y.a;
                w0Var4.invokeSuspend(yVar4);
                return yVar4;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                this.y.B = false;
                break;
            case 1:
                kotlin.a.e(obj);
                this.y.f();
                break;
            case 2:
                kotlin.a.e(obj);
                c1 c1Var = this.y;
                c1Var.d(c1Var.B);
                break;
            default:
                kotlin.a.e(obj);
                this.y.p();
                break;
        }
        return kotlin.y.a;
    }
}
