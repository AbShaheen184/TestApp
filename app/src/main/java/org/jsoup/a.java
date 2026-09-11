package org.jsoup;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends IOException {
    public final String e;
    public final String y;

    public a(String str, String str2) {
        super("Unhandled content type. Must be text/*, */xml, or */*+xml");
        this.e = str;
        this.y = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ". Mimetype=" + this.e + ", URL=" + this.y;
    }
}
