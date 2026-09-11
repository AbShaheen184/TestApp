package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ o y;
    public final /* synthetic */ int z;

    public /* synthetic */ k(o oVar, int i, List list, boolean z) {
        this.e = 2;
        this.y = oVar;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                o oVar = this.y;
                int i = this.z;
                oVar.H.getClass();
                try {
                    oVar.U.N(i, b.CANCEL);
                    synchronized (oVar) {
                        oVar.W.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return kotlin.y.a;
            case 1:
                o oVar2 = this.y;
                int i2 = this.z;
                oVar2.H.getClass();
                synchronized (oVar2) {
                    oVar2.W.remove(Integer.valueOf(i2));
                }
                return kotlin.y.a;
            default:
                o oVar3 = this.y;
                int i3 = this.z;
                oVar3.H.getClass();
                try {
                    oVar3.U.N(i3, b.CANCEL);
                    synchronized (oVar3) {
                        oVar3.W.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ k(o oVar, int i, Object obj, int i2) {
        this.e = i2;
        this.y = oVar;
        this.z = i;
    }
}
