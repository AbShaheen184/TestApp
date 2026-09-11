package org.jsoup.internal;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String[] c = {"input", "keygen", "object", "select", "textarea"};
    public final /* synthetic */ int a;
    public final Appendable b;

    public /* synthetic */ b(Appendable appendable, int i) {
        this.a = i;
        this.b = appendable;
    }

    public static String c(String str) {
        return str != null ? str.toLowerCase(Locale.ROOT) : "";
    }

    public static String d(String str) {
        return c(str).trim();
    }

    public static b e(StringBuilder sb) {
        return sb != null ? new b(sb, 1) : new b(sb, 0);
    }

    public final b a(char c2) {
        switch (this.a) {
            case 0:
                try {
                    this.b.append(c2);
                    return this;
                } catch (IOException e) {
                    throw new androidx.compose.ui.res.e(e, 18);
                }
            default:
                ((StringBuilder) this.b).append(c2);
                return this;
        }
    }

    public final b b(String str) {
        switch (this.a) {
            case 0:
                try {
                    this.b.append(str);
                    return this;
                } catch (IOException e) {
                    throw new androidx.compose.ui.res.e(e, 18);
                }
            default:
                ((StringBuilder) this.b).append((CharSequence) str);
                return this;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((StringBuilder) this.b).toString();
            default:
                return super.toString();
        }
    }
}
