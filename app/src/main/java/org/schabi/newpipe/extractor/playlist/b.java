package org.schabi.newpipe.extractor.playlist;

import androidx.core.view.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.schabi.newpipe.extractor.e;
import org.schabi.newpipe.extractor.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public String F;
    public List G;

    public static b b(w0 w0Var, String str) {
        e eVarP;
        a aVarD = w0Var.d(w0Var.e().i(str));
        aVarD.b();
        int i = aVarD.a.y;
        org.schabi.newpipe.extractor.linkhandler.a aVar = aVarD.b;
        b bVar = new b(i, (org.schabi.newpipe.extractor.linkhandler.b) aVar, aVarD.v());
        bVar.F = "";
        bVar.G = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        try {
            bVar.A = aVar.e;
        } catch (Exception e) {
            bVar.a(e);
        }
        try {
            aVarD.b0();
        } catch (Exception e2) {
            bVar.a(e2);
        }
        try {
            aVarD.h();
        } catch (Exception e3) {
            bVar.a(e3);
        }
        try {
            bVar.G = aVarD.J();
        } catch (Exception e4) {
            bVar.a(e4);
        }
        try {
            aVarD.R();
        } catch (Exception e5) {
            arrayList.add(e5);
        }
        try {
            bVar.F = aVarD.P();
        } catch (Exception e6) {
            arrayList.add(e6);
        }
        try {
            aVarD.O();
        } catch (Exception e7) {
            arrayList.add(e7);
        }
        try {
            aVarD.E();
        } catch (Exception e8) {
            arrayList.add(e8);
        }
        try {
            aVarD.D();
        } catch (Exception e9) {
            arrayList.add(e9);
        }
        try {
            aVarD.C();
        } catch (Exception e10) {
            arrayList.add(e10);
        }
        try {
            List list = Collections.EMPTY_LIST;
        } catch (Exception e11) {
            bVar.a(e11);
        }
        try {
            aVarD.Z();
        } catch (Exception e12) {
            bVar.a(e12);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = bVar.C;
        if (!zIsEmpty && (!arrayList2.isEmpty() || arrayList.size() < 3)) {
            arrayList2.addAll(arrayList);
        }
        try {
            eVarP = aVarD.p();
            arrayList2.addAll(eVarP.c);
        } catch (Exception e13) {
            bVar.a(e13);
            eVarP = e.d;
        }
        bVar.D = eVarP.a;
        bVar.E = eVarP.b;
        return bVar;
    }
}
