package org.jsoup.helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final URL e;
    public URL a = e;
    public int b = 1;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    static {
        try {
            e = new URL("http://undefined/");
        } catch (MalformedURLException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void a(String str, String str2) {
        n.G(str, "name");
        if (str2 == null) {
            str2 = "";
        }
        n.G(str, "name");
        List listB = b(str);
        if (listB.isEmpty()) {
            listB = new ArrayList();
            this.c.put(str, listB);
        }
        listB.add(str2);
    }

    public final List b(String str) {
        for (Map.Entry entry : this.c.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (List) entry.getValue();
            }
        }
        return Collections.EMPTY_LIST;
    }

    public final boolean c(String str) {
        n.E("Content-Encoding");
        n.E(str);
        n.G("Content-Encoding", "name");
        Iterator it = b("Content-Encoding").iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void d(String str) {
        Map.Entry entry;
        n.G(str, "name");
        String strC = org.jsoup.internal.b.c(str);
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
        } while (!org.jsoup.internal.b.c((String) entry.getKey()).equals(strC));
        if (entry != null) {
            linkedHashMap.remove(entry.getKey());
        }
    }

    public final URL e() {
        URL url = this.a;
        if (url != e) {
            return url;
        }
        net.luminis.tls.engine.impl.c.o("URL not set. Make sure to call #url(...) before executing the request.");
        return null;
    }
}
