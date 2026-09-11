package org.schabi.newpipe.extractor.localization;

import com.google.common.util.concurrent.g0;
import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(g0 g0Var, String str, int i) {
        this.a = i;
        this.b = g0Var;
        this.c = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                g0Var.getClass();
                return ((Collection) ((Map.Entry) obj).getValue()).stream().anyMatch(new d(g0Var, this.c, 1));
            default:
                return this.b.D(this.c, (String) obj);
        }
    }
}
