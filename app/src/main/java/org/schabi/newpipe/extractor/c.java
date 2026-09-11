package org.schabi.newpipe.extractor;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Serializable {
    public final String A;
    public List B = Collections.EMPTY_LIST;
    public final int e;
    public final int y;
    public final String z;

    public c(String str, int i, String str2, int i2) {
        this.e = i;
        this.y = i2;
        this.z = str;
        this.A = str2;
    }

    public String toString() {
        return getClass().getSimpleName() + "[url=\"" + this.z + "\", name=\"" + this.A + "\"]";
    }
}
