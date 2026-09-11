package androidx.compose.foundation.gestures;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.media3.ui.SubtitleView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.y0 y;

    public /* synthetic */ h2(androidx.compose.runtime.y0 y0Var, int i) {
        this.e = i;
        this.y = y0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((kotlin.jvm.functions.l) this.y.getValue()).invoke(f)).floatValue());
            case 1:
                ((kotlin.jvm.functions.l) this.y.getValue()).invoke((androidx.compose.ui.geometry.b) obj);
                return kotlin.y.a;
            case 2:
                this.y.setValue((androidx.compose.ui.layout.x) obj);
                return kotlin.y.a;
            case 3:
                this.y.setValue((androidx.compose.ui.layout.x) obj);
                return kotlin.y.a;
            case 4:
                this.y.setValue((androidx.compose.ui.layout.x) obj);
                return kotlin.y.a;
            case 5:
                androidx.compose.ui.focus.c0 c0Var = (androidx.compose.ui.focus.c0) obj;
                c0Var.getClass();
                if (!c0Var.a()) {
                    this.y.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 6:
                androidx.compose.ui.focus.c0 c0Var2 = (androidx.compose.ui.focus.c0) obj;
                c0Var2.getClass();
                if (!c0Var2.a()) {
                    this.y.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 7:
                ((coil3.compose.e) obj).getClass();
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 8:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("fav_", ((com.app.mlounge.data.local.entity.b) ((List) this.y.getValue()).get(((Integer) obj).intValue())).a);
            case 9:
                coil3.compose.h hVar = (coil3.compose.h) obj;
                hVar.getClass();
                if (hVar instanceof coil3.compose.e) {
                    this.y.setValue(Boolean.TRUE);
                }
                return kotlin.y.a;
            case 10:
                androidx.media3.ui.h0 h0Var = (androidx.media3.ui.h0) obj;
                h0Var.getClass();
                SubtitleView subtitleView = h0Var.getSubtitleView();
                if (subtitleView != null) {
                    androidx.compose.runtime.y0 y0Var = this.y;
                    subtitleView.setStyle(new androidx.media3.ui.e(((com.app.mlounge.ui.screens.player.o0) y0Var.getValue()).q, ((com.app.mlounge.ui.screens.player.o0) y0Var.getValue()).r, com.app.mlounge.ui.screens.player.i0.t(androidx.compose.ui.graphics.t.h), 2, com.app.mlounge.ui.screens.player.i0.t(androidx.compose.ui.graphics.t.b), null));
                    float f2 = ((com.app.mlounge.ui.screens.player.o0) y0Var.getValue()).p;
                    Context context = subtitleView.getContext();
                    float fApplyDimension = TypedValue.applyDimension(2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
                    subtitleView.z = 2;
                    subtitleView.A = fApplyDimension;
                    subtitleView.c();
                }
                return kotlin.y.a;
            case 11:
                androidx.compose.ui.focus.c0 c0Var3 = (androidx.compose.ui.focus.c0) obj;
                c0Var3.getClass();
                if (!c0Var3.a()) {
                    this.y.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 12:
                androidx.compose.ui.focus.c0 c0Var4 = (androidx.compose.ui.focus.c0) obj;
                c0Var4.getClass();
                if (!c0Var4.a()) {
                    this.y.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 13:
                String str = (String) obj;
                str.getClass();
                this.y.setValue(str);
                return kotlin.y.a;
            case 14:
                androidx.compose.ui.focus.c0 c0Var5 = (androidx.compose.ui.focus.c0) obj;
                c0Var5.getClass();
                if (!c0Var5.a()) {
                    this.y.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                this.y.setValue(str2);
                return kotlin.y.a;
            case 16:
                androidx.compose.ui.focus.c0 c0Var6 = (androidx.compose.ui.focus.c0) obj;
                c0Var6.getClass();
                if (!c0Var6.a()) {
                    this.y.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 17:
                String str3 = (String) obj;
                str3.getClass();
                this.y.setValue(str3);
                return kotlin.y.a;
            case 18:
                String str4 = (String) obj;
                str4.getClass();
                this.y.setValue(str4);
                return kotlin.y.a;
            default:
                androidx.compose.ui.focus.c0 c0Var7 = (androidx.compose.ui.focus.c0) obj;
                c0Var7.getClass();
                if (!c0Var7.a()) {
                    this.y.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
        }
    }
}
