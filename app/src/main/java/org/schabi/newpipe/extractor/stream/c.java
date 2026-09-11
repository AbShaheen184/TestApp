package org.schabi.newpipe.extractor.stream;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {
    public static final c z = new c("", 3);
    public final String e;
    public final int y;

    public c(String str, int i) {
        this.y = i;
        this.e = str == null ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.y == cVar.y && this.e.equals(cVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(this.y));
    }
}
