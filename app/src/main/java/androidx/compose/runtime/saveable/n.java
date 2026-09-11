package androidx.compose.runtime.saveable;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.r;
import java.util.Arrays;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final o a = new o(13, new a2(12), new m(0));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final o b(p pVar, kotlin.jvm.functions.l lVar) {
        a aVar = new a(pVar, 0, (byte) 0);
        c0.c(1, lVar);
        return new o(13, aVar, lVar);
    }

    public static final Object c(Object[] objArr, l lVar, kotlin.jvm.functions.a aVar, r rVar, int i) {
        return d(Arrays.copyOf(objArr, objArr.length), lVar, aVar, rVar, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object d(Object[] objArr, l lVar, kotlin.jvm.functions.a aVar, r rVar, int i, int i2) {
        Object[] objArr2;
        l lVar2;
        Object obj;
        Object objC;
        long j = rVar.T;
        com.google.android.material.shape.e.a(36);
        String string = Long.toString(j, 36);
        string.getClass();
        lVar.getClass();
        h hVar = (h) rVar.j(j.a);
        Object objQ = rVar.Q();
        Object obj2 = androidx.compose.runtime.m.a;
        if (objQ == obj2) {
            Object objB = (hVar == null || (objC = hVar.c(string)) == null) ? null : lVar.b(objC);
            if (objB == null) {
                objB = aVar.invoke();
            }
            objArr2 = objArr;
            lVar2 = lVar;
            Object cVar = new c(lVar2, hVar, string, objB, objArr2);
            rVar.l0(cVar);
            objQ = cVar;
        } else {
            objArr2 = objArr;
            lVar2 = lVar;
        }
        c cVar2 = (c) objQ;
        Object objInvoke = Arrays.equals(objArr2, cVar2.B) ? cVar2.A : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zH = rVar.h(cVar2) | ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && rVar.h(lVar2)) || (i & 48) == 32) | rVar.h(hVar) | rVar.f(string) | rVar.h(objInvoke) | rVar.h(objArr2);
        Object objQ2 = rVar.Q();
        if (zH || objQ2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object bVar = new b(cVar2, lVar2, hVar, string, obj, objArr3);
            rVar.l0(bVar);
            objQ2 = bVar;
        } else {
            obj = objInvoke;
        }
        j0.e((kotlin.jvm.functions.a) objQ2, rVar);
        return obj;
    }

    public static final Object e(Object[] objArr, kotlin.jvm.functions.a aVar, r rVar) {
        return d(Arrays.copyOf(objArr, objArr.length), a, aVar, rVar, 3456, 0);
    }

    public static final e f(r rVar) {
        rVar.b0(1967007413);
        Object[] objArr = new Object[0];
        Object objQ = rVar.Q();
        if (objQ == androidx.compose.runtime.m.a) {
            objQ = new f(0);
            rVar.l0(objQ);
        }
        e eVar = (e) c(objArr, e.B, (kotlin.jvm.functions.a) objQ, rVar, 384);
        eVar.z = (h) rVar.j(j.a);
        rVar.p(false);
        return eVar;
    }
}
