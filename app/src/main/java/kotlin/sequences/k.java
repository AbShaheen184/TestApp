package kotlin.sequences;

import com.app.mlounge.ui.screens.player.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.s;
import kotlin.collections.u;
import kotlin.collections.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends com.google.android.material.resources.g {
    public static h n(Iterator it) {
        it.getClass();
        return new a(new s(it, 2));
    }

    public static h o(Object obj, kotlin.jvm.functions.l lVar) {
        if (obj == null) {
            return e.a;
        }
        return new kotlin.io.h(2, new androidx.room.coroutines.d(obj, 21), lVar);
    }

    public static String p(h hVar, String str) {
        hVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : hVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            com.google.android.material.sidesheet.b.c(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static g q(h hVar, kotlin.jvm.functions.l lVar) {
        return new g(new n(hVar, lVar, 1), false, new j0(21));
    }

    public static List r(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return u.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return com.google.common.base.c.p(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set s(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return w.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return com.google.common.base.i.t(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
