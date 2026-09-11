package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class bg extends kg {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bg(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // com.google.android.gms.internal.measurement.kg
    public void a(Iterator it, wg wgVar) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.a;
                    if (!zHasNext) {
                        wgVar.a(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        wgVar.a(sb.toString(), str);
                    }
                }
                break;
            default:
                super.a(it, wgVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.kg
    public void b(Object obj, wg wgVar) {
        switch (this.f) {
            case 1:
                x xVar = (x) obj;
                if (xVar != null) {
                    v vVar = xVar.a.z;
                    vVar.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < vVar.c() - vVar.b())) {
                            break;
                        } else if (i >= vVar.c() - vVar.b()) {
                            org.mozilla.javascript.typedarrays.c.a();
                            break;
                        } else {
                            w wVar = vVar.y;
                            int iB = vVar.b() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) wVar.e[iB];
                            if (((Set) entry.getValue()).isEmpty()) {
                                wgVar.a(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    wgVar.a(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.b(obj, wgVar);
                break;
        }
    }
}
