package org.mozilla.javascript;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class UniqueTag implements Serializable {
    private static final int ID_DOUBLE_MARK = 3;
    private static final int ID_NOT_FOUND = 1;
    private static final int ID_NULL_VALUE = 2;
    private static final long serialVersionUID = -4320556826714577259L;
    private final int tagId;
    public static final UniqueTag NOT_FOUND = new UniqueTag(1);
    public static final UniqueTag NULL_VALUE = new UniqueTag(2);
    public static final UniqueTag DOUBLE_MARK = new UniqueTag(3);

    private UniqueTag(int i) {
        this.tagId = i;
    }

    public Object readResolve() {
        int i = this.tagId;
        if (i == 1) {
            return NOT_FOUND;
        }
        if (i == 2) {
            return NULL_VALUE;
        }
        if (i == 3) {
            return DOUBLE_MARK;
        }
        net.luminis.tls.engine.impl.c.r(String.valueOf(i));
        return null;
    }

    public String toString() {
        String str;
        int i = this.tagId;
        if (i == 1) {
            str = "NOT_FOUND";
        } else if (i == 2) {
            str = "NULL_VALUE";
        } else {
            if (i != 3) {
                throw Kit.codeBug();
            }
            str = "DOUBLE_MARK";
        }
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(super.toString(), ": ", str);
    }
}
