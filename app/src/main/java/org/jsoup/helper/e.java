package org.jsoup.helper;

import com.google.common.util.concurrent.g0;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.jsoup.parser.e0;
import org.jsoup.parser.n3;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {
    public static final Pattern q = Pattern.compile("(\\w+)/\\w*\\+?xml.*");
    public int f;
    public ByteBuffer g;
    public org.jsoup.internal.a h;
    public m i;
    public String j;
    public String k;
    public int l;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    public final d p;

    public e(d dVar) {
        this.p = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x026c A[Catch: all -> 0x017e, IOException -> 0x0181, TryCatch #1 {IOException -> 0x0181, blocks: (B:65:0x0157, B:67:0x0166, B:69:0x016a, B:71:0x0170, B:76:0x0185, B:78:0x018f, B:79:0x0193, B:81:0x019e, B:83:0x01a6, B:84:0x01aa, B:87:0x01c5, B:91:0x01cf, B:94:0x01d5, B:96:0x01dd, B:99:0x01e8, B:100:0x01f5, B:102:0x01f8, B:104:0x0202, B:106:0x0206, B:107:0x0219, B:109:0x0225, B:111:0x0229, B:113:0x022d, B:115:0x0235, B:118:0x0244, B:120:0x024c, B:125:0x0266, B:127:0x026c, B:129:0x027c, B:128:0x0271, B:122:0x0253, B:124:0x025b, B:116:0x023a, B:117:0x023f, B:130:0x028c, B:133:0x0298, B:134:0x02a5), top: B:145:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0271 A[Catch: all -> 0x017e, IOException -> 0x0181, TryCatch #1 {IOException -> 0x0181, blocks: (B:65:0x0157, B:67:0x0166, B:69:0x016a, B:71:0x0170, B:76:0x0185, B:78:0x018f, B:79:0x0193, B:81:0x019e, B:83:0x01a6, B:84:0x01aa, B:87:0x01c5, B:91:0x01cf, B:94:0x01d5, B:96:0x01dd, B:99:0x01e8, B:100:0x01f5, B:102:0x01f8, B:104:0x0202, B:106:0x0206, B:107:0x0219, B:109:0x0225, B:111:0x0229, B:113:0x022d, B:115:0x0235, B:118:0x0244, B:120:0x024c, B:125:0x0266, B:127:0x026c, B:129:0x027c, B:128:0x0271, B:122:0x0253, B:124:0x025b, B:116:0x023a, B:117:0x023f, B:130:0x028c, B:133:0x0298, B:134:0x02a5), top: B:145:0x0157 }] */
    public static e f(d dVar, e eVar) {
        String strL;
        m mVar;
        InputStream inflaterInputStream;
        int i;
        org.jsoup.internal.a aVar;
        Constructor constructor;
        String str;
        ReentrantLock reentrantLock = dVar.o;
        ArrayList arrayList = dVar.i;
        n.B("Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads.", reentrantLock.tryLock());
        URL urlE = dVar.e();
        if (urlE == null) {
            throw new o("URL must be specified to connect");
        }
        String protocol = urlE.getProtocol();
        if (!protocol.equals("http") && !protocol.equals("https")) {
            throw new MalformedURLException("Only http & https protocols supported");
        }
        boolean zJ = com.google.android.datatransport.runtime.backends.c.j(dVar.b);
        if (!zJ) {
            switch (dVar.b) {
                case 1:
                    str = "GET";
                    break;
                case 2:
                    str = "POST";
                    break;
                case 3:
                    str = "PUT";
                    break;
                case 4:
                    str = "DELETE";
                    break;
                case 5:
                    str = "PATCH";
                    break;
                case 6:
                    str = "HEAD";
                    break;
                case 7:
                    str = "OPTIONS";
                    break;
                case 8:
                    str = "TRACE";
                    break;
                default:
                    str = "null";
                    break;
            }
            "Cannot set a request body for HTTP method ".concat(str);
        }
        e eVar2 = null;
        InputStream errorStream = null;
        if (!arrayList.isEmpty() && !zJ) {
            g0 g0Var = new g0(dVar.e());
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
            }
            URL urlN = g0Var.n();
            n.I(urlN, "url");
            dVar.a = new g0(urlN).n();
            arrayList.clear();
        } else if (zJ) {
            List listB = dVar.b("Content-Type");
            String strJ = !listB.isEmpty() ? org.jsoup.internal.k.j(listB, ", ") : null;
            if (strJ != null) {
                if (strJ.contains("multipart/form-data") && !strJ.contains("boundary")) {
                    Pattern pattern = b.a;
                    StringBuilder sbB = org.jsoup.internal.k.b();
                    Random random = new Random();
                    for (int i2 = 0; i2 < 32; i2++) {
                        char[] cArr = b.d;
                        sbB.append(cArr[random.nextInt(cArr.length)]);
                    }
                    strL = org.jsoup.internal.k.l(sbB);
                    String strConcat = "multipart/form-data; boundary=".concat(strL);
                    n.G("Content-Type", "name");
                    dVar.d("Content-Type");
                    dVar.a("Content-Type", strConcat);
                }
                dVar.j = strL;
            } else {
                Charset charset = f.c;
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it2);
                }
                String str2 = "application/x-www-form-urlencoded; charset=" + dVar.m;
                n.G("Content-Type", "name");
                dVar.d("Content-Type");
                dVar.a("Content-Type", str2);
            }
            strL = null;
            dVar.j = strL;
        }
        long jNanoTime = System.nanoTime();
        Constructor constructor2 = l.a;
        if (!Boolean.parseBoolean(System.getProperty("jsoup.useHttpClient", "true")) || (constructor = l.a) == null) {
            mVar = new m(dVar, eVar);
        } else {
            try {
                mVar = (m) constructor.newInstance(dVar, eVar);
            } catch (Exception unused) {
                mVar = new m(dVar, eVar);
            }
        }
        try {
            try {
                e eVarB = mVar.b();
                try {
                    n.G("Location", "name");
                    if (!eVarB.b("Location").isEmpty() && dVar.h) {
                        if (eVarB.f != 307) {
                            com.google.android.datatransport.runtime.backends.c.t(1, "method");
                            dVar.b = 1;
                            arrayList.clear();
                            dVar.d("Content-Type");
                        }
                        List listB2 = eVarB.b("Location");
                        String strJ2 = listB2.isEmpty() ? null : org.jsoup.internal.k.j(listB2, ", ");
                        n.H(strJ2);
                        if (strJ2.startsWith("http:/") && strJ2.charAt(6) != '/') {
                            strJ2 = strJ2.substring(6);
                        }
                        dVar.a = new g0(org.jsoup.internal.k.m(dVar.e(), strJ2)).n();
                        e eVarF = f(dVar, eVarB);
                        reentrantLock.unlock();
                        return eVarF;
                    }
                    int i3 = eVarB.f;
                    if (i3 < 200 || i3 >= 400) {
                        throw new androidx.datastore.preferences.protobuf.i(i3, dVar.e().toString());
                    }
                    String str3 = eVarB.k;
                    Pattern pattern2 = q;
                    if (str3 != null && !str3.startsWith("text/") && !pattern2.matcher(str3).matches()) {
                        throw new org.jsoup.a(str3, dVar.e().toString());
                    }
                    if (str3 != null && pattern2.matcher(str3).matches() && !dVar.l) {
                        e0 e0Var = new e0(new n3());
                        e0Var.C = Integer.MAX_VALUE;
                        dVar.k = e0Var;
                        dVar.l = true;
                    }
                    eVarB.j = b.b(eVarB.k);
                    if (eVarB.l == 0 || dVar.b == 6) {
                        eVarB.g = ByteBuffer.allocate(0);
                    } else {
                        HttpURLConnection httpURLConnection = mVar.c;
                        if (httpURLConnection != null) {
                            InputStream errorStream2 = httpURLConnection.getErrorStream();
                            HttpURLConnection httpURLConnection2 = mVar.c;
                            errorStream = errorStream2 != null ? httpURLConnection2.getErrorStream() : httpURLConnection2.getInputStream();
                        } else {
                            net.luminis.tls.engine.impl.c.r("Not yet executed");
                        }
                        if (eVarB.c("gzip")) {
                            inflaterInputStream = new GZIPInputStream(errorStream);
                        } else {
                            if (eVarB.c("deflate")) {
                                inflaterInputStream = new InflaterInputStream(errorStream, new Inflater(true));
                            }
                            i = dVar.g;
                            if (errorStream instanceof org.jsoup.internal.a) {
                                int i4 = org.jsoup.internal.a.G;
                                aVar = (org.jsoup.internal.a) errorStream;
                            } else {
                                aVar = new org.jsoup.internal.a(new org.jsoup.internal.d(errorStream), i);
                            }
                            long j = dVar.f;
                            aVar.z = jNanoTime;
                            aVar.A = j * 1000000;
                            eVarB.h = aVar;
                            int i5 = d.p;
                        }
                        errorStream = inflaterInputStream;
                        i = dVar.g;
                        if (errorStream instanceof org.jsoup.internal.a) {
                            int i6 = org.jsoup.internal.a.G;
                            aVar = (org.jsoup.internal.a) errorStream;
                        } else {
                            aVar = new org.jsoup.internal.a(new org.jsoup.internal.d(errorStream), i);
                        }
                        long j2 = dVar.f;
                        aVar.z = jNanoTime;
                        aVar.A = j2 * 1000000;
                        eVarB.h = aVar;
                        int i7 = d.p;
                    }
                    reentrantLock.unlock();
                    eVarB.m = true;
                    return eVarB;
                } catch (IOException e) {
                    e = e;
                    eVar2 = eVarB;
                    if (eVar2 != null) {
                        eVar2.i();
                    }
                    throw e;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static void g(d dVar, BufferedWriter bufferedWriter, OutputStream outputStream) throws IOException {
        ArrayList arrayList = dVar.i;
        String str = dVar.j;
        if (str == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
            }
            return;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            bufferedWriter.write("--");
            bufferedWriter.write(str);
            bufferedWriter.write("--");
        } else {
            if (it2.next() != null) {
                androidx.transition.k.i();
                return;
            }
            bufferedWriter.write("--");
            bufferedWriter.write(str);
            bufferedWriter.write("\r\n");
            bufferedWriter.write("Content-Disposition: form-data; name=\"");
            throw null;
        }
    }

    public static void j(d dVar, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, dVar.m);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            try {
                g(dVar, bufferedWriter, outputStream);
                bufferedWriter.close();
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void h(LinkedHashMap linkedHashMap, e eVar) {
        LinkedHashMap linkedHashMap2;
        int i;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null && StandardCharsets.ISO_8859_1.newEncoder().canEncode(str2)) {
                        byte[] bytes = str2.getBytes(f.c);
                        boolean z = false;
                        int i2 = (bytes.length >= 3 && (bytes[0] & 255) == 239 && (bytes[1] & 255) == 187 && (bytes[2] & 255) == 191) ? 3 : 0;
                        int length = bytes.length;
                        boolean z2 = false;
                        while (true) {
                            if (i2 >= length) {
                                z = z2;
                                break;
                            }
                            byte b = bytes[i2];
                            if ((b & 128) != 0) {
                                if ((b & 224) == 192) {
                                    i = i2 + 1;
                                } else if ((b & 240) == 224) {
                                    i = i2 + 2;
                                } else if ((b & 248) != 240) {
                                    break;
                                } else {
                                    i = i2 + 3;
                                }
                                if (i >= bytes.length) {
                                    break;
                                }
                                while (i2 < i) {
                                    i2++;
                                    if ((bytes[i2] & 192) != 128) {
                                        break;
                                    }
                                }
                                z2 = true;
                            }
                            i2++;
                        }
                        if (z) {
                            str2 = new String(bytes, b.b);
                        }
                    }
                    a(str, str2);
                }
            }
        }
        URL url = this.a;
        Map map = a.a;
        try {
            this.p.n.put(url.toURI(), linkedHashMap);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                linkedHashMap2 = this.d;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                String str3 = (String) entry2.getKey();
                List<String> list = (List) entry2.getValue();
                if (str3.equalsIgnoreCase("Set-Cookie")) {
                    for (String str4 : list) {
                        if (str4 != null) {
                            org.jsoup.parser.a aVar = new org.jsoup.parser.a(str4);
                            String strTrim = aVar.X('=').trim();
                            aVar.a();
                            String strTrim2 = aVar.X(';').trim();
                            if (!strTrim.isEmpty()) {
                                n.G(strTrim, "name");
                                n.I(strTrim2, ES6Iterator.VALUE_PROPERTY);
                                linkedHashMap2.put(strTrim, strTrim2);
                            }
                            aVar.close();
                        }
                    }
                }
            }
            if (eVar != null) {
                for (Map.Entry entry3 : eVar.d.entrySet()) {
                    String str5 = (String) entry3.getKey();
                    n.G(str5, "name");
                    if (!linkedHashMap2.containsKey(str5)) {
                        String str6 = (String) entry3.getKey();
                        String str7 = (String) entry3.getValue();
                        n.G(str6, "name");
                        n.I(str7, ES6Iterator.VALUE_PROPERTY);
                        linkedHashMap2.put(str6, str7);
                    }
                }
                eVar.i();
                int i3 = eVar.o + 1;
                this.o = i3;
                if (i3 < 20) {
                    return;
                }
                net.luminis.tls.engine.impl.c.q(eVar.e(), "Too many redirects occurred trying to load URL ");
            }
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException(e.getMessage());
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    public final void i() {
        HttpURLConnection httpURLConnection;
        org.jsoup.internal.a aVar = this.h;
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            } finally {
                this.h = null;
            }
        }
        m mVar = this.i;
        if (mVar == null || (httpURLConnection = mVar.c) == null) {
            return;
        }
        httpURLConnection.disconnect();
        mVar.c = null;
    }
}
