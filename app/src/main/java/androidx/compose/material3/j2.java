package androidx.compose.material3;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j2 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;

    public /* synthetic */ j2(int i, kotlin.jvm.functions.a aVar) {
        this.e = i;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                float fFloatValue = ((Number) this.y.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
            case 1:
                this.y.invoke();
                break;
            case 2:
                this.y.invoke();
                break;
            case 3:
                this.y.invoke();
                break;
            case 4:
                this.y.invoke();
                break;
            case 5:
                this.y.invoke();
                break;
            case 6:
                this.y.invoke();
                break;
            case 7:
                this.y.invoke();
                break;
            case 8:
                this.y.invoke();
                break;
            case 9:
                this.y.invoke();
                break;
            case 10:
                this.y.invoke();
                break;
            case 11:
                this.y.invoke();
                break;
            case 12:
                this.y.invoke();
                break;
            case 13:
                this.y.invoke();
                break;
            case 14:
                this.y.invoke();
                break;
            case 15:
                this.y.invoke();
                break;
            case 16:
                this.y.invoke();
                break;
            case 17:
                this.y.invoke();
                break;
            case 18:
                this.y.invoke();
                break;
            case 19:
                this.y.invoke();
                break;
            case 20:
                this.y.invoke();
                break;
            default:
                try {
                    return (List) this.y.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return kotlin.collections.u.e;
                }
        }
        return kotlin.y.a;
    }
}
