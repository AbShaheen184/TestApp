package org.schabi.newpipe.extractor.utils;

import androidx.constraintlayout.core.g;
import java.io.Serializable;
import org.jsoup.parser.p0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {
    public final int A;
    public final String e;
    public final int y;
    public final int z;

    public b(int i, String str, int i2, int i3) {
        this.e = str;
        this.y = i;
        this.z = i2;
        g.a(i3, "estimatedResolutionLevel is null");
        this.A = i3;
    }

    public final String toString() {
        return "ImageSuffix {suffix=" + this.e + ", height=" + this.y + ", width=" + this.z + ", resolutionLevel=" + p0.f(this.A) + "}";
    }
}
