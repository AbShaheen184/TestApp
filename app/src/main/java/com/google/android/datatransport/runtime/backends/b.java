package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final Context a;
    public final com.google.android.datatransport.runtime.time.a b;
    public final com.google.android.datatransport.runtime.time.a c;
    public final String d;

    public b(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        if (context == null) {
            com.google.gson.b.h("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (aVar == null) {
            com.google.gson.b.h("Null wallClock");
            throw null;
        }
        this.b = aVar;
        if (aVar2 == null) {
            com.google.gson.b.h("Null monotonicClock");
            throw null;
        }
        this.c = aVar2;
        if (str != null) {
            this.d = str;
        } else {
            com.google.gson.b.h("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            b bVar = (b) ((d) obj);
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, this.d, "}");
    }
}
