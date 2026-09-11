package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.core.view.w0 {
    public final y A;

    public z(vg vgVar, int i, y yVar) {
        super(vgVar, i);
        this.A = yVar;
        StringBuilder sb = new StringBuilder("%");
        vgVar.d(sb);
        sb.append(true != vgVar.c() ? 't' : 'T');
        sb.append(yVar.e);
    }

    @Override // androidx.core.view.w0
    public final void O(androidx.emoji2.text.s sVar, Object obj) {
        vg vgVar = (vg) this.z;
        StringBuilder sb = (StringBuilder) sVar.g;
        boolean z = obj instanceof Date;
        y yVar = this.A;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            vgVar.d(sb2);
            sb2.append(true != vgVar.c() ? 't' : 'T');
            sb2.append(yVar.e);
            sb.append(String.format(xg.a, sb2.toString(), obj));
            return;
        }
        char c = yVar.e;
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 2);
        sb3.append("%t");
        sb3.append(c);
        androidx.emoji2.text.s.h(sb, obj, sb3.toString());
    }
}
