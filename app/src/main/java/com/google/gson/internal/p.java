package com.google.gson.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements CharSequence {
    public char[] e;
    public String y;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.e, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.y == null) {
            this.y = new String(this.e);
        }
        return this.y;
    }
}
