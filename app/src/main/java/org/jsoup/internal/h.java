package org.jsoup.internal;

import java.util.function.BiConsumer;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        j jVar = (j) obj;
        CharSequence charSequence = (CharSequence) obj2;
        n.H(jVar.a);
        if (!jVar.c) {
            jVar.a.append(jVar.b);
        }
        jVar.a.append((Object) charSequence);
        jVar.c = false;
    }
}
