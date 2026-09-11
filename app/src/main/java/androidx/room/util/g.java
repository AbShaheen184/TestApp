package androidx.room.util;

import java.util.ArrayList;
import kotlin.collections.o;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public g(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (l.a(this.a, gVar.a) && l.a(this.b, gVar.b) && l.a(this.c, gVar.c) && this.d.equals(gVar.d)) {
            return this.e.equals(gVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return kotlin.text.l.C(kotlin.text.l.E("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + _COROUTINE.a.E(o.e0(this.d)) + "\n            |   referenceColumnNames = {" + _COROUTINE.a.D(o.e0(this.e)) + "\n            |}\n        "));
    }
}
