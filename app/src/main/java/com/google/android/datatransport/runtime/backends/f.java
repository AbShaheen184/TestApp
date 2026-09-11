package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.appcompat.widget.c2;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final coil3.memory.c a;
    public final c2 b;
    public final HashMap c;

    public f(Context context, c2 c2Var) {
        coil3.memory.c cVar = new coil3.memory.c(context, 13);
        this.c = new HashMap();
        this.a = cVar;
        this.b = c2Var;
    }

    public final synchronized h a(String str) {
        if (this.c.containsKey(str)) {
            return (h) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryJ = this.a.j(str);
        if (cctBackendFactoryJ == null) {
            return null;
        }
        c2 c2Var = this.b;
        h hVarCreate = cctBackendFactoryJ.create(new b((Context) c2Var.y, (com.google.android.datatransport.runtime.time.a) c2Var.z, (com.google.android.datatransport.runtime.time.a) c2Var.A, str));
        this.c.put(str, hVarCreate);
        return hVarCreate;
    }
}
