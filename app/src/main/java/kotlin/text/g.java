package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final Matcher a;
    public final CharSequence b;
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.k c;
    public b0 d;

    public g(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.k(this, 1);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new b0(this);
        }
        b0 b0Var = this.d;
        b0Var.getClass();
        return b0Var;
    }

    public final kotlin.ranges.d b() {
        Matcher matcher = this.a;
        return com.google.android.material.resources.c.r(matcher.start(), matcher.end());
    }

    public final g c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return com.google.android.material.shape.k.C(matcher2, iEnd, charSequence);
    }
}
