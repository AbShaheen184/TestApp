package j$.time.format;

import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.Token;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final c0 a = new c0();

    public final int hashCode() {
        return Token.TEMPLATE_LITERAL_SUBST;
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c0);
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
