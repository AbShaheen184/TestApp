package org.schabi.newpipe.extractor.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Serializable {
    public final int A;
    public final org.schabi.newpipe.extractor.i e;
    public final String y;
    public final boolean z;

    public e(String str, boolean z, org.schabi.newpipe.extractor.i iVar, int i) {
        this.y = str;
        this.z = z;
        this.e = iVar;
        this.A = i;
    }

    public static boolean a(e eVar, ArrayList arrayList) {
        if (org.schabi.newpipe.extractor.utils.f.i(arrayList)) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (eVar.b((e) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean b(e eVar) {
        org.schabi.newpipe.extractor.i iVar;
        org.schabi.newpipe.extractor.i iVar2;
        return eVar != null && (iVar = this.e) != null && (iVar2 = eVar.e) != null && iVar.e == iVar2.e && this.A == eVar.A && this.z == eVar.z;
    }
}
