package org.jsoup.helper;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends k {
    public static final Pattern d = Pattern.compile("");
    public final com.google.re2j.Pattern c;

    public h(com.google.re2j.Pattern pattern) {
        super(d);
        this.c = pattern;
    }

    public static h c(String str) {
        try {
            return new h(com.google.re2j.Pattern.compile(str));
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new o("Pattern complexity error: " + e.getMessage());
        } catch (RuntimeException e2) {
            throw new o("Pattern syntax error: " + e2.getMessage());
        }
    }

    @Override // org.jsoup.helper.k
    public final j b(String str) {
        return new g(this.c.matcher(str));
    }

    @Override // org.jsoup.helper.k
    public final String toString() {
        return this.c.toString();
    }
}
