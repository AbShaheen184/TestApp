package com.app.mlounge.emulator;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;
    public final Bitmap b;
    public final RectF c;

    public a(int i, Bitmap bitmap, RectF rectF) {
        this.a = i;
        this.b = bitmap;
        this.c = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "TouchButton(id=" + this.a + ", bitmap=" + this.b + ", rect=" + this.c + ")";
    }
}
