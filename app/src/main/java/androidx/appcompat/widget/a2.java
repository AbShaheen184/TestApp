package androidx.appcompat.widget;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public okhttp3.l a() {
        return new okhttp3.l(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(okhttp3.k... kVarArr) {
        if (!this.a) {
            net.luminis.tls.engine.impl.c.o("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (okhttp3.k kVar : kVarArr) {
            arrayList.add(kVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            net.luminis.tls.engine.impl.c.o("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            net.luminis.tls.engine.impl.c.o("At least one cipher suite is required");
        }
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Serializable, java.lang.String[]] */
    public void c(okhttp3.l0... l0VarArr) {
        if (!this.a) {
            net.luminis.tls.engine.impl.c.o("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(l0VarArr.length);
        for (okhttp3.l0 l0Var : l0VarArr) {
            arrayList.add(l0Var.e);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            net.luminis.tls.engine.impl.c.o("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            net.luminis.tls.engine.impl.c.o("At least one TLS version is required");
        }
    }
}
