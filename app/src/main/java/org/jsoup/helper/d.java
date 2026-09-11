package org.jsoup.helper;

import java.net.CookieManager;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.jsoup.parser.e0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public static final /* synthetic */ int p = 0;
    public String j;
    public e0 k;
    public final CookieManager n;
    public boolean l = false;
    public final String m = b.c;
    public final ReentrantLock o = new ReentrantLock();
    public int f = 30000;
    public final int g = 2097152;
    public final boolean h = true;
    public final ArrayList i = new ArrayList();

    static {
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
    }

    public d() {
        this.b = 1;
        a("Accept-Encoding", "gzip");
        a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        this.k = new e0(new org.jsoup.parser.b());
        this.n = new CookieManager();
    }
}
