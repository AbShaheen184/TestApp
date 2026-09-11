package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.data.g;
import androidx.compose.ui.input.pointer.y;
import androidx.compose.ui.text.l0;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ c(long j, boolean z, l lVar, y yVar, kotlin.jvm.functions.a aVar) {
        this.y = j;
        this.z = z;
        this.A = lVar;
        this.B = yVar;
        this.C = aVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                b.b.c((Context) this.A, (ResolveInfo) this.B, Boolean.valueOf(this.z), (String) this.C, new l0(this.y));
                ((g) obj).close();
                break;
            default:
                l lVar = (l) this.A;
                y yVar = (y) this.B;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.C;
                androidx.compose.ui.geometry.b bVar = (androidx.compose.ui.geometry.b) obj;
                long j = this.y;
                if (j > 0 && this.z) {
                    lVar.invoke(Long.valueOf((long) (com.google.android.material.resources.c.b(Float.intBitsToFloat((int) (bVar.a >> 32)) / ((int) (((androidx.compose.ui.input.pointer.l0) yVar).U >> 32)), 0.0f, 1.0f) * j)));
                    aVar.invoke();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ c(Context context, ResolveInfo resolveInfo, boolean z, String str, long j) {
        this.A = context;
        this.B = resolveInfo;
        this.z = z;
        this.C = str;
        this.y = j;
    }
}
