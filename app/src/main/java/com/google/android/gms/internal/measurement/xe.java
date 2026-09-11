package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class xe {
    public final com.google.common.collect.a1 a;
    public final com.google.common.collect.a1 b;
    public final UUID c;

    public xe(com.google.common.collect.a1 a1Var, com.google.common.collect.a1 a1Var2, UUID uuid) {
        this.a = a1Var;
        this.b = a1Var2;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return this.a.equals(xeVar.a) && this.b.equals(xeVar.b) && this.c.equals(xeVar.c);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (-4294967296L));
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }
}
