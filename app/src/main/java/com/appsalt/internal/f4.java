package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 implements CharSequence {
    public final String e;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f4) {
            return kotlin.jvm.internal.l.a(this.e, ((f4) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.e.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.k(')', "MessageId(value=", this.e);
    }
}
