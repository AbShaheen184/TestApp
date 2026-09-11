package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public Set a;
    public Map b;
    public boolean c;

    public final boolean b(String str) {
        return this.c || ((HashSet) this.a).contains(str);
    }

    public final void a(String str, Object obj) {
        ((HashMap) this.b).put(str, obj);
    }
}
