package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Appendable {
    public final StringBuilder e = new StringBuilder(16);
    public final ArrayList y;

    public d(g gVar) {
        new ArrayList();
        this.y = new ArrayList();
        new ArrayList();
        a(gVar);
    }

    public final void a(g gVar) {
        StringBuilder sb = this.e;
        int length = sb.length();
        sb.append(gVar.y);
        List list = gVar.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                e eVar = (e) list.get(i);
                Object obj = eVar.a;
                this.y.add(new c(eVar.b + length, eVar.d, obj, eVar.c + length));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof g;
        StringBuilder sb = this.e;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        g gVar = (g) charSequence;
        int length = sb.length();
        sb.append((CharSequence) gVar.y, i, i2);
        List listA = h.a(gVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar = (e) listA.get(i3);
                Object obj = eVar.a;
                this.y.add(new c(eVar.b + length, eVar.d, obj, eVar.c + length));
            }
        }
        return this;
    }

    public final g b() {
        StringBuilder sb = this.e;
        String string = sb.toString();
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            int length = sb.length();
            int i2 = cVar.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                androidx.compose.ui.text.internal.a.b("Item.end should be set first");
            }
            arrayList2.add(new e(cVar.b, cVar.d, cVar.a, length));
        }
        return new g(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof g) {
            a((g) charSequence);
            return this;
        }
        this.e.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.e.append(c);
        return this;
    }
}
