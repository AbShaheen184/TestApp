package com.app.mlounge.data.download;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final OutputStream a;
    public final String b;

    public a(OutputStream outputStream, String str) {
        this.a = outputStream;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final OutputStream b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OutputResult(outputStream=" + this.a + ", filePath=" + this.b + ")";
    }
}
