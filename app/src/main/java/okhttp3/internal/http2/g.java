package okhttp3.internal.http2;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final d[] a;
    public static final Map b;

    static {
        d dVar = new d(d.i, "");
        okio.i iVar = d.f;
        d dVar2 = new d(iVar, "GET");
        d dVar3 = new d(iVar, "POST");
        okio.i iVar2 = d.g;
        d dVar4 = new d(iVar2, "/");
        d dVar5 = new d(iVar2, "/index.html");
        okio.i iVar3 = d.h;
        d dVar6 = new d(iVar3, "http");
        d dVar7 = new d(iVar3, "https");
        okio.i iVar4 = d.e;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(iVar4, "200"), new d(iVar4, "204"), new d(iVar4, "206"), new d(iVar4, "304"), new d(iVar4, "400"), new d(iVar4, "404"), new d(iVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        a = dVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(dVarArr[i].a)) {
                linkedHashMap.put(dVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(okio.i iVar) throws IOException {
        iVar.getClass();
        int iF = iVar.f();
        for (int i = 0; i < iF; i++) {
            byte bK = iVar.k(i);
            if (65 <= bK && bK < 91) {
                net.luminis.tls.engine.impl.c.t("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.u()));
                return;
            }
        }
    }
}
