package coil3.compose.internal;

import androidx.compose.runtime.m;
import androidx.compose.runtime.r;
import androidx.compose.ui.layout.j;
import coil3.compose.o;
import coil3.size.i;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final long a = androidx.compose.ui.unit.b.b(0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final i a(j jVar, r rVar) {
        Object obj;
        Object obj2;
        boolean zA = l.a(jVar, androidx.compose.ui.layout.i.d);
        boolean zG = rVar.g(zA);
        Object objQ = rVar.Q();
        if (zG || objQ == m.a) {
            if (zA) {
                obj = i.a;
            } else {
                o oVar = new o();
                oVar.b = a;
                oVar.c = new ArrayList();
                obj = oVar;
            }
            Object obj3 = obj;
            rVar.l0(obj3);
            obj2 = obj3;
        }
        obj2 = objQ;
        return (i) obj2;
    }

    public static final long b(long j) {
        int iF = kotlin.math.a.F(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) kotlin.math.a.F(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iF) << 32);
    }

    public static void c(String str) {
        throw new IllegalArgumentException(f.e("Unsupported type: ", str, ". ", androidx.privacysandbox.ads.adservices.java.internal.a.q("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
