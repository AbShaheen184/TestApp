package com.grack.nanojson;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final char[] g = {'n', 'u', 'l', 'l'};
    public static final char[] h = {'t', 'r', 'u', 'e'};
    public static final char[] i = {'f', 'a', 'l', 's', 'e'};
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] k = {'\\', 'u', '0', '0'};
    public static final char[] l = {'\\', 'u'};
    public final StringBuilder a;
    public final StringBuilder b;
    public final BitSet c;
    public int d;
    public boolean e;
    public boolean f;

    public e() {
        StringBuilder sb = new StringBuilder();
        this.c = new BitSet();
        this.d = 0;
        this.e = true;
        this.a = sb;
        this.b = new StringBuilder(10240);
    }

    public final void a(String str) {
        k(str);
        int i2 = this.d;
        this.d = i2 + 1;
        this.c.set(i2, this.f);
        this.f = false;
        this.e = true;
        l('[');
    }

    public final String b() {
        if (this.d > 0) {
            throw new androidx.compose.ui.res.e("Unclosed JSON objects and/or arrays when closing writer", 9);
        }
        if (this.e) {
            throw new androidx.compose.ui.res.e("Nothing was written to the JSON writer", 9);
        }
        e();
        return this.a.toString();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    public final void c(String str) {
        String str2;
        char c;
        l('\"');
        int i2 = 0;
        char c2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\f') {
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"') {
                    l('\\');
                    l(cCharAt);
                } else if (cCharAt != '/') {
                    if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                str2 = "\\b";
                                break;
                            case '\t':
                                str2 = "\\t";
                                break;
                            case '\n':
                                str2 = "\\n";
                                break;
                            default:
                                if (cCharAt < ' ' || ((cCharAt >= 128 && cCharAt < 160) || (cCharAt >= 8192 && cCharAt < 8448))) {
                                    char[] cArr = j;
                                    if (cCharAt < 256) {
                                        n(k);
                                        l(cArr[(cCharAt >> 4) & 15]);
                                        c = cArr[cCharAt & 15];
                                    } else {
                                        n(l);
                                        l(cArr[(cCharAt >> '\f') & 15]);
                                        l(cArr[(cCharAt >> '\b') & 15]);
                                        l(cArr[(cCharAt >> 4) & 15]);
                                        c = cArr[cCharAt & 15];
                                    }
                                    l(c);
                                }
                                break;
                        }
                    } else {
                        l('\\');
                    }
                    l(cCharAt);
                } else {
                    if (c2 == '<') {
                        l('\\');
                    }
                    l(cCharAt);
                }
                i2++;
                c2 = cCharAt;
            } else {
                str2 = "\\r";
            }
            m(str2);
            i2++;
            c2 = cCharAt;
        }
        l('\"');
    }

    public final void d() {
        if (this.d == 0) {
            throw new androidx.compose.ui.res.e("Invalid call to end()", 9);
        }
        l(this.f ? '}' : ']');
        this.e = false;
        int i2 = this.d - 1;
        this.d = i2;
        this.f = this.c.get(i2);
    }

    public final void e() {
        StringBuilder sb = this.b;
        try {
            this.a.append((CharSequence) sb.toString());
            sb.setLength(0);
        } catch (IOException e) {
            throw new androidx.compose.ui.res.e(e, 9);
        }
    }

    public final e f(String str, Map map) {
        if (str == null) {
            g();
        } else {
            h(str);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (!(entry.getKey() instanceof String)) {
                StringBuilder sb = new StringBuilder("Invalid key type for map: ");
                sb.append(entry.getKey() == null ? "null" : entry.getKey().getClass());
                throw new androidx.compose.ui.res.e(sb.toString(), 9);
            }
            String str2 = (String) entry.getKey();
            if (value == null) {
                k(str2);
                n(g);
            } else if (value instanceof String) {
                p(str2, (String) value);
            } else if (value instanceof Number) {
                k(str2);
                m(((Number) value).toString());
            } else if (value instanceof Boolean) {
                q(str2, ((Boolean) value).booleanValue());
            } else {
                if (value instanceof Collection) {
                    Collection collection = (Collection) value;
                    if (str2 == null) {
                        j();
                        int i2 = this.d;
                        this.d = i2 + 1;
                        this.c.set(i2, this.f);
                        this.f = false;
                        this.e = true;
                        l('[');
                    } else {
                        a(str2);
                    }
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        o(it.next());
                    }
                    d();
                } else if (value instanceof Map) {
                    f(str2, (Map) value);
                } else {
                    if (!value.getClass().isArray()) {
                        throw new androidx.compose.ui.res.e("Unable to handle type: " + value.getClass(), 9);
                    }
                    int length = Array.getLength(value);
                    a(str2);
                    for (int i3 = 0; i3 < length; i3++) {
                        o(Array.get(value, i3));
                    }
                    d();
                }
            }
        }
        d();
        return this;
    }

    public final void g() {
        j();
        int i2 = this.d;
        this.d = i2 + 1;
        this.c.set(i2, this.f);
        this.f = true;
        this.e = true;
        l('{');
    }

    public final void h(String str) {
        k(str);
        int i2 = this.d;
        this.d = i2 + 1;
        this.c.set(i2, this.f);
        this.f = true;
        this.e = true;
        l('{');
    }

    public final void i() {
        if (this.e) {
            this.e = false;
        } else {
            if (this.d == 0) {
                throw new androidx.compose.ui.res.e("Invalid call to emit a value in a finished JSON writer", 9);
            }
            l(',');
        }
    }

    public final void j() {
        if (this.f) {
            throw new androidx.compose.ui.res.e("Invalid call to emit a keyless value while writing an object", 9);
        }
        i();
    }

    public final void k(String str) {
        if (!this.f) {
            throw new androidx.compose.ui.res.e("Invalid call to emit a key value while not writing an object", 9);
        }
        i();
        c(str);
        l(':');
    }

    public final void l(char c) {
        StringBuilder sb = this.b;
        sb.append(c);
        if (sb.length() > 10240) {
            e();
        }
    }

    public final void m(String str) {
        StringBuilder sb = this.b;
        sb.append(str);
        if (sb.length() > 10240) {
            e();
        }
    }

    public final void n(char[] cArr) {
        StringBuilder sb = this.b;
        sb.append(cArr);
        if (sb.length() > 10240) {
            e();
        }
    }

    public final void o(Object obj) {
        if (obj == null) {
            j();
            n(g);
            return;
        }
        if (obj instanceof String) {
            j();
            c((String) obj);
            return;
        }
        if (obj instanceof Number) {
            j();
            m(((Number) obj).toString());
            return;
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            j();
            n(zBooleanValue ? h : i);
            return;
        }
        boolean z = obj instanceof Collection;
        BitSet bitSet = this.c;
        if (z) {
            j();
            int i2 = this.d;
            this.d = i2 + 1;
            bitSet.set(i2, this.f);
            this.f = false;
            this.e = true;
            l('[');
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                o(it.next());
            }
            d();
            return;
        }
        if (obj instanceof Map) {
            f(null, (Map) obj);
            return;
        }
        if (!obj.getClass().isArray()) {
            throw new androidx.compose.ui.res.e("Unable to handle type: " + obj.getClass(), 9);
        }
        int length = Array.getLength(obj);
        j();
        int i3 = this.d;
        this.d = i3 + 1;
        bitSet.set(i3, this.f);
        this.f = false;
        this.e = true;
        l('[');
        for (int i4 = 0; i4 < length; i4++) {
            o(Array.get(obj, i4));
        }
        d();
    }

    public final void p(String str, String str2) {
        if (str2 == null) {
            k(str);
            n(g);
        } else {
            k(str);
            c(str2);
        }
    }

    public final void q(String str, boolean z) {
        k(str);
        n(z ? h : i);
    }
}
