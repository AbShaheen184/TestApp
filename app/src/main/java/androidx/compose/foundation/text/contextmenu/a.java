package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.data.g;
import androidx.compose.foundation.text.contextmenu.internal.n;
import androidx.compose.foundation.text.contextmenu.provider.e;
import androidx.compose.runtime.r;
import androidx.compose.ui.text.l0;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.jvm.functions.s;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements s {
    public final /* synthetic */ int e;

    @Override // kotlin.jvm.functions.s
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((l0) obj5).a;
                String string = ((CharSequence) obj4).subSequence(l0.f(j), l0.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
            case 1:
                g gVar = (g) obj;
                e eVar = (e) obj2;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj3;
                r rVar = (r) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? rVar.f(gVar) : rVar.h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? rVar.f(eVar) : rVar.h(eVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128;
                }
                if (rVar.T(i & 1, (i & 1171) != 1170)) {
                    n.c(gVar, eVar, aVar, rVar, i & 1022);
                } else {
                    rVar.W();
                }
                break;
            default:
                g gVar2 = (g) obj;
                e eVar2 = (e) obj2;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) obj3;
                r rVar2 = (r) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i2 = ((iIntValue2 & 8) == 0 ? rVar2.f(gVar2) : rVar2.h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? rVar2.f(eVar2) : rVar2.h(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= rVar2.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128;
                }
                if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
                    n.c(gVar2, eVar2, aVar2, rVar2, i2 & 1022);
                } else {
                    rVar2.W();
                }
                break;
        }
        return y.a;
    }
}
