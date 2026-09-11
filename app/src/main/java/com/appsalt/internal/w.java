package com.appsalt.internal;

import j$.net.URLEncoder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements x {
    public final /* synthetic */ int e;
    public i y;

    public w(int i) {
        this.e = i;
        switch (i) {
            case 1:
                kotlin.collections.u uVar = kotlin.collections.u.e;
                this.y = new i(uVar, uVar);
                break;
        }
    }

    public static ArrayList b(String str) {
        Object lVar;
        JSONObject jSONObject = new JSONObject(str);
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("Answer");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    lVar = Integer.valueOf(jSONArray.getJSONObject(i).getInt("type"));
                } catch (Throwable th) {
                    lVar = new kotlin.l(th);
                }
                if (lVar instanceof kotlin.l) {
                    lVar = null;
                }
                Integer num = (Integer) lVar;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("name");
                if ((num == null || num.intValue() != 1) && num != null) {
                    num.intValue();
                }
                byte[] address = InetAddress.getByName(jSONObject2.getString("data")).getAddress();
                if (num == null || num.intValue() != 1) {
                    if (num != null) {
                        num.intValue();
                    }
                }
                arrayList.add(InetAddress.getByAddress(string, address));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    @Override // com.appsalt.internal.x
    public final List a(int i, String str) {
        List listP;
        Iterable iterableB;
        switch (this.e) {
            case 0:
                InetAddress[] allByName = InetAddress.getAllByName(str);
                ArrayList arrayList = new ArrayList();
                for (InetAddress inetAddress : allByName) {
                    if (!this.y.a(inetAddress.getAddress())) {
                        arrayList.add(inetAddress);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (arrayList2.size() > 1) {
                    kotlin.collections.r.B(new s(i), arrayList2);
                }
                return arrayList2;
            default:
                kotlin.collections.u uVar = kotlin.collections.u.e;
                int iE = androidx.constraintlayout.core.g.e(i);
                if (iE == 0) {
                    listP = com.google.common.base.c.p(1);
                } else if (iE == 1) {
                    listP = com.google.common.base.c.p(28);
                } else {
                    if (iE != 2) {
                        coil3.g.a();
                        return null;
                    }
                    listP = com.google.common.base.c.q(1, 28);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("name=", URLEncoder.encode(str, "UTF-8"), "&do=false&ct=", URLEncoder.encode("application/dns-json", "UTF-8"), "&type=");
                    sbO.append(iIntValue);
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URI("https://cloudflare-dns.com/dns-query?".concat(sbO.toString())).toURL().openConnection();
                        httpURLConnection.setConnectTimeout(1000);
                        httpURLConnection.setReadTimeout(1000);
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setRequestProperty("Accept", "application/dns-json");
                        httpURLConnection.connect();
                        iterableB = httpURLConnection.getResponseCode() != 200 ? uVar : b(kotlin.collections.a0.B(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), kotlin.text.a.a), 8192)));
                    } catch (Throwable th) {
                        Object lVar = new kotlin.l(th);
                        if (kotlin.m.a(lVar) != null) {
                            lVar = uVar;
                        }
                        iterableB = (List) lVar;
                    }
                    kotlin.collections.o.C(arrayList3, iterableB);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (!this.y.a(((InetAddress) obj).getAddress())) {
                        arrayList4.add(obj);
                    }
                }
                return arrayList4;
        }
    }

    @Override // com.appsalt.internal.x
    public final kotlin.k c(int i, String str) {
        Object lVar;
        Object lVar2;
        switch (this.e) {
            case 0:
                long jB = kotlin.time.e.b();
                try {
                    lVar = (InetAddress) kotlin.collections.o.K(a(i, str));
                    break;
                } catch (Throwable th) {
                    lVar = new kotlin.l(th);
                }
                if (lVar instanceof kotlin.l) {
                    lVar = null;
                }
                InetAddress inetAddress = (InetAddress) lVar;
                int iF = (int) kotlin.time.a.f(kotlin.time.f.a(jB));
                if (inetAddress == null) {
                    return null;
                }
                return new kotlin.k(inetAddress, new e0(2, iF));
            default:
                long jB2 = kotlin.time.e.b();
                try {
                    lVar2 = (InetAddress) kotlin.collections.o.K(a(i, str));
                    break;
                } catch (Throwable th2) {
                    lVar2 = new kotlin.l(th2);
                }
                if (lVar2 instanceof kotlin.l) {
                    lVar2 = null;
                }
                InetAddress inetAddress2 = (InetAddress) lVar2;
                int iF2 = (int) kotlin.time.a.f(kotlin.time.f.a(jB2));
                if (inetAddress2 == null) {
                    return null;
                }
                return new kotlin.k(inetAddress2, new e0(1, iF2));
        }
    }

    @Override // com.appsalt.internal.x
    public final void e(i iVar) {
        switch (this.e) {
            case 0:
                this.y = iVar;
                break;
            default:
                this.y = iVar;
                break;
        }
    }
}
