package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.text.input.internal.k;
import androidx.datastore.preferences.i;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final k a;
    public final i b;
    public final Context c;
    public final String d;
    public final o e;
    public final Set f;

    public c(Context context, String str, Set set, k kVar, i iVar) {
        context.getClass();
        set.getClass();
        a aVar = new a(context, str);
        this.a = kVar;
        this.b = iVar;
        this.c = context;
        this.d = str;
        this.e = new o(aVar);
        this.f = set == d.a ? null : kotlin.collections.o.n0(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, kotlin.coroutines.jvm.internal.c cVar) throws IOException {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.z = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objInvoke = bVar.e;
        int i2 = bVar.z;
        boolean z = true;
        if (i2 == 0) {
            kotlin.a.e(objInvoke);
            bVar.z = 1;
            objInvoke = this.a.invoke(obj, bVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        o oVar = this.e;
        Set set = this.f;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) oVar.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) oVar.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
