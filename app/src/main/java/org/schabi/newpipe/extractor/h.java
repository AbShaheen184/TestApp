package org.schabi.newpipe.extractor;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ h(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((i) obj).y.equals(this.b);
            case 1:
                return this.b.equals(((com.grack.nanojson.c) obj).f("type", null));
            case 2:
                return ((com.grack.nanojson.c) obj).containsKey(this.b);
            case 3:
                return ((com.grack.nanojson.c) obj).f("service", "").equals(this.b);
            case 4:
                return ((com.grack.nanojson.c) obj).f("key", "").equals(this.b);
            default:
                return ((com.grack.nanojson.c) obj).containsKey(this.b);
        }
    }
}
