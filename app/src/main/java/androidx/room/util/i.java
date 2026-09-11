package androidx.room.util;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.o;
import kotlin.collections.u;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;
    public final Object b;
    public final Set c;
    public final Set d;

    public i(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.a) || !this.b.equals(iVar.b) || !l.a(this.c, iVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = iVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(_COROUTINE.a.t(o.f0(this.b.values(), new androidx.constraintlayout.core.e(5))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(_COROUTINE.a.t(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(_COROUTINE.a.t(set != null ? o.f0(set, new androidx.constraintlayout.core.e(6)) : u.e));
        sb.append("\n            |}\n        ");
        return kotlin.text.l.E(sb.toString());
    }
}
