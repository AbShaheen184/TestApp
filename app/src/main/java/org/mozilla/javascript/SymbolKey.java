package org.mozilla.javascript;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class SymbolKey implements Symbol, Serializable {
    private static final long serialVersionUID = -6019782713330994754L;
    private final String name;
    public static final SymbolKey ITERATOR = new SymbolKey("Symbol.iterator");
    public static final SymbolKey TO_STRING_TAG = new SymbolKey("Symbol.toStringTag");
    public static final SymbolKey SPECIES = new SymbolKey("Symbol.species");
    public static final SymbolKey HAS_INSTANCE = new SymbolKey("Symbol.hasInstance");
    public static final SymbolKey IS_CONCAT_SPREADABLE = new SymbolKey("Symbol.isConcatSpreadable");
    public static final SymbolKey IS_REGEXP = new SymbolKey("Symbol.isRegExp");
    public static final SymbolKey TO_PRIMITIVE = new SymbolKey("Symbol.toPrimitive");
    public static final SymbolKey MATCH = new SymbolKey("Symbol.match");
    public static final SymbolKey MATCH_ALL = new SymbolKey("Symbol.matchAll");
    public static final SymbolKey REPLACE = new SymbolKey("Symbol.replace");
    public static final SymbolKey SEARCH = new SymbolKey("Symbol.search");
    public static final SymbolKey SPLIT = new SymbolKey("Symbol.split");
    public static final SymbolKey UNSCOPABLES = new SymbolKey("Symbol.unscopables");

    public SymbolKey(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SymbolKey) {
            return obj == this;
        }
        return (obj instanceof NativeSymbol) && ((NativeSymbol) obj).getKey() == this;
    }

    public Object getDescription() {
        String str = this.name;
        return str != null ? str : Undefined.instance;
    }

    public String getName() {
        String str = this.name;
        return str != null ? str : "";
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public String toString() {
        String str = this.name;
        return str == null ? "Symbol()" : androidx.privacysandbox.ads.adservices.java.internal.a.q("Symbol(", str, ")");
    }
}
