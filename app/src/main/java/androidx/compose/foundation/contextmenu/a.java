package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.r;
import androidx.compose.ui.o;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.v;
import kotlin.y;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements v {
    @Override // kotlin.jvm.functions.v
    public final Object a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, r rVar, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        d dVar = (d) obj2;
        q qVar = (q) obj3;
        kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        o oVar = o.b;
        if (i2 == 0) {
            i = (rVar.f(oVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= rVar.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= rVar.g(zBooleanValue) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= rVar.f(dVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((iIntValue & 24576) == 0) {
            i |= rVar.h(qVar) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= rVar.h(aVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (rVar.T(i & 1, (599187 & i) != 599186)) {
            l.c(str, zBooleanValue, dVar, oVar, qVar, aVar, rVar, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            rVar.W();
        }
        return y.a;
    }
}
