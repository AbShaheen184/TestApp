package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class Symbol {
    public final String symbol;

    public Symbol(String str) {
        this.symbol = str;
    }

    public String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("<"), this.symbol, '>');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T unbox(Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }
}
