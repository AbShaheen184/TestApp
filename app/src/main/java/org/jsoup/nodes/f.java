package org.jsoup.nodes;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Cloneable {
    public k e = k.base;
    public Charset y = org.jsoup.helper.b.b;
    public boolean z = true;
    public final int A = 1;
    public final int B = 30;
    public int C = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            f fVar = (f) super.clone();
            String strName = this.y.name();
            fVar.getClass();
            fVar.y = Charset.forName(strName);
            fVar.e = k.valueOf(this.e.name());
            return fVar;
        } catch (CloneNotSupportedException e) {
            net.luminis.tls.engine.impl.c.k(e);
            return null;
        }
    }
}
