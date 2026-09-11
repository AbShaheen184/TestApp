package org.mozilla.javascript;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((Hashtable.Entry) obj).clear();
    }
}
