package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.lazy.layout.m;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.foundation.lazy.layout.y;
import androidx.compose.foundation.text.contextmenu.internal.n;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.s;
import androidx.compose.ui.r;
import androidx.lifecycle.v;
import com.app.mlounge.ui.screens.settings.e0;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j(d dVar, r rVar, androidx.compose.runtime.internal.f fVar, int i) {
        this.e = 1;
        this.y = dVar;
        this.z = rVar;
        this.B = fVar;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                l.b((r) this.z, (d) this.y, (kotlin.jvm.functions.l) this.B, (androidx.compose.runtime.r) obj, s.A(1), this.A);
                break;
            case 1:
                ((Integer) obj2).getClass();
                l.a((d) this.y, (r) this.z, (androidx.compose.runtime.internal.f) this.B, (androidx.compose.runtime.r) obj, s.A(this.A | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA = s.A(1);
                m.d((y) this.z, this.y, this.A, this.B, (androidx.compose.runtime.r) obj, iA);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA2 = s.A(this.A | 1);
                ((w0) this.z).e(this.y, (androidx.compose.runtime.internal.f) this.B, (androidx.compose.runtime.r) obj, iA2);
                break;
            case 4:
                ((Integer) obj2).intValue();
                n.c((androidx.compose.foundation.text.contextmenu.data.g) this.z, (androidx.compose.foundation.text.contextmenu.provider.e) this.y, (kotlin.jvm.functions.a) this.B, (androidx.compose.runtime.r) obj, s.A(this.A | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                okhttp3.internal.platform.android.g.b((r) this.z, (p1) this.y, (androidx.compose.runtime.internal.f) this.B, (androidx.compose.runtime.r) obj, s.A(this.A | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                _COROUTINE.b.c((androidx.compose.foundation.text.selection.m) this.z, (androidx.compose.ui.e) this.y, (androidx.compose.runtime.internal.f) this.B, (androidx.compose.runtime.r) obj, s.A(this.A | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iA3 = s.A(this.A) | 1;
                ((androidx.compose.runtime.internal.f) this.z).g(this.y, this.B, (androidx.compose.runtime.r) obj, iA3);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iA4 = s.A(this.A | 1);
                ((androidx.compose.runtime.saveable.e) this.z).e(this.y, (androidx.compose.runtime.internal.f) this.B, (androidx.compose.runtime.r) obj, iA4);
                break;
            case 9:
                ((Integer) obj2).intValue();
                coil3.network.g.d((v) this.z, (androidx.lifecycle.compose.b) this.y, (kotlin.jvm.functions.l) this.B, (androidx.compose.runtime.r) obj, s.A(this.A | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                e0.j((String) this.z, (androidx.compose.ui.graphics.vector.f) this.y, (kotlin.jvm.functions.a) this.B, (androidx.compose.runtime.r) obj, s.A(this.A | 1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ j(y yVar, Object obj, int i, Object obj2, int i2) {
        this.e = 2;
        this.z = yVar;
        this.y = obj;
        this.A = i;
        this.B = obj2;
    }

    public /* synthetic */ j(r rVar, d dVar, kotlin.jvm.functions.l lVar, int i, int i2) {
        this.e = 0;
        this.z = rVar;
        this.y = dVar;
        this.B = lVar;
        this.A = i2;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = obj2;
        this.B = obj3;
        this.A = i;
    }
}
