package com.google.android.gms.measurement.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Runnable {
    public final String A;
    public final Map B;
    public final Object C;
    public final /* synthetic */ androidx.compose.animation.core.j2 D;
    public final /* synthetic */ int e = 0;
    public final URL y;
    public final byte[] z;

    public a1(b1 b1Var, String str, URL url, byte[] bArr, Map map, z0 z0Var) {
        Objects.requireNonNull(b1Var);
        this.D = b1Var;
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.g(url);
        this.y = url;
        this.z = bArr;
        this.C = z0Var;
        this.A = str;
        this.B = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        p1 p1Var = ((s1) ((y2) this.D).e).D;
        s1.m(p1Var);
        p1Var.E(new com.app.mlounge.data.remote.ntv.g(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.measurement.internal.a1] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        OutputStream outputStream5;
        Throwable th2;
        OutputStream outputStream6;
        IOException iOException2;
        ?? r9;
        OutputStream outputStream7;
        ?? r10;
        OutputStream outputStream8;
        InputStream inputStream2;
        boolean zHasNext;
        switch (this.e) {
            case 0:
                String str = this.A;
                b1 b1Var = (b1) this.D;
                s1 s1Var = (s1) b1Var.e;
                s1 s1Var2 = (s1) b1Var.e;
                p1 p1Var = s1Var.D;
                s1.m(p1Var);
                p1Var.z();
                int i = 0;
                OutputStream outputStream9 = null;
                try {
                    URLConnection uRLConnectionOpenConnection = this.y.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    s1Var2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        Map map5 = this.B;
                        if (map5 != null) {
                            for (Map.Entry entry : map5.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        byte[] bArr = this.z;
                        if (bArr != null) {
                            n4 n4Var = b1Var.y.D;
                            l4.U(n4Var);
                            byte[] bArrF0 = n4Var.f0(bArr);
                            x0 x0Var = s1Var2.C;
                            s1.m(x0Var);
                            v0 v0Var = x0Var.K;
                            int length = bArrF0.length;
                            v0Var.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream10 = httpURLConnection.getOutputStream();
                            try {
                                outputStream10.write(bArrF0);
                                outputStream10.close();
                            } catch (IOException e) {
                                iOException = e;
                                responseCode = 0;
                                map2 = null;
                                outputStream9 = outputStream10;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e2) {
                                        x0 x0Var2 = s1Var2.C;
                                        s1.m(x0Var2);
                                        x0Var2.C.c(x0.D(str), e2, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                z0 z0Var = (z0) this.C;
                                p1 p1Var2 = s1Var2.D;
                                s1.m(p1Var2);
                                p1Var2.E(new u0(this.A, z0Var, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                map = null;
                                outputStream9 = outputStream10;
                                th = th;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e3) {
                                        x0 x0Var3 = s1Var2.C;
                                        s1.m(x0Var3);
                                        x0Var3.C.c(x0.D(str), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                z0 z0Var2 = (z0) this.C;
                                p1 p1Var3 = s1Var2.D;
                                s1.m(p1Var3);
                                p1Var3.E(new u0(this.A, z0Var2, i, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        }
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        byte[] bArr2 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                                        while (true) {
                                            int i2 = inputStream.read(bArr2);
                                            if (i2 <= 0) {
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                inputStream.close();
                                                httpURLConnection.disconnect();
                                                z0 z0Var3 = (z0) this.C;
                                                p1 p1Var4 = s1Var2.D;
                                                s1.m(p1Var4);
                                                p1Var4.E(new u0(this.A, z0Var3, responseCode, (IOException) null, byteArray, headerFields));
                                                return;
                                            }
                                            byteArrayOutputStream.write(bArr2, 0, i2);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream = null;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                map2 = null;
                                iOException = e;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                z0 z0Var4 = (z0) this.C;
                                p1 p1Var5 = s1Var2.D;
                                s1.m(p1Var5);
                                p1Var5.E(new u0(this.A, z0Var4, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                map = null;
                                i = responseCode;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                z0 z0Var5 = (z0) this.C;
                                p1 p1Var6 = s1Var2.D;
                                s1.m(p1Var6);
                                p1Var6.E(new u0(this.A, z0Var5, i, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            map2 = map4;
                            iOException = e;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            z0 z0Var6 = (z0) this.C;
                            p1 p1Var7 = s1Var2.D;
                            s1.m(p1Var7);
                            p1Var7.E(new u0(this.A, z0Var6, responseCode, iOException, (byte[]) null, map2));
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            i = responseCode;
                            map = map3;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            z0 z0Var7 = (z0) this.C;
                            p1 p1Var8 = s1Var2.D;
                            s1.m(p1Var8);
                            p1Var8.E(new u0(this.A, z0Var7, i, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        responseCode = 0;
                        map2 = null;
                    } catch (Throwable th8) {
                        th = th8;
                        map = null;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    responseCode = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection = null;
                    map = null;
                }
                break;
            default:
                String str2 = this.A;
                y2 y2Var = (y2) this.D;
                s1 s1Var3 = (s1) y2Var.e;
                s1 s1Var4 = (s1) y2Var.e;
                p1 p1Var9 = s1Var3.D;
                s1.m(p1Var9);
                p1Var9.z();
                int responseCode2 = 0;
                try {
                    URLConnection uRLConnectionOpenConnection2 = this.y.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    s1Var4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map6 = this.B;
                            if (map6 != null) {
                                Iterator it = map6.entrySet().iterator();
                                while (true) {
                                    zHasNext = it.hasNext();
                                    if (zHasNext) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                }
                            }
                            byte[] bArr3 = this.z;
                            ?? r8 = zHasNext;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    x0 x0Var4 = s1Var4.C;
                                    s1.m(x0Var4);
                                    v0 v0Var2 = x0Var4.K;
                                    int length2 = byteArray2.length;
                                    v0Var2.b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    OutputStream outputStream11 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream11.write(byteArray2);
                                        outputStream11.close();
                                        r8 = outputStream11;
                                    } catch (IOException e8) {
                                        e = e8;
                                        responseCode2 = 0;
                                        outputStream4 = null;
                                        outputStream6 = outputStream11;
                                        iOException2 = e;
                                        outputStream8 = outputStream6;
                                        r10 = outputStream4;
                                        if (outputStream8 != null) {
                                            try {
                                                outputStream8.close();
                                            } catch (IOException e9) {
                                                x0 x0Var5 = s1Var4.C;
                                                s1.m(x0Var5);
                                                x0Var5.C.c(x0.D(str2), e9, "Error closing HTTP compressed POST connection output stream. appId");
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, iOException2, null, r10);
                                        return;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        responseCode2 = 0;
                                        outputStream3 = null;
                                        outputStream5 = outputStream11;
                                        th2 = th;
                                        outputStream7 = outputStream5;
                                        r9 = outputStream3;
                                        if (outputStream7 != null) {
                                            try {
                                                outputStream7.close();
                                            } catch (IOException e10) {
                                                x0 x0Var6 = s1Var4.C;
                                                s1.m(x0Var6);
                                                x0Var6.C.c(x0.D(str2), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, null, null, r9);
                                        throw th2;
                                    }
                                } catch (IOException e11) {
                                    x0 x0Var7 = s1Var4.C;
                                    s1.m(x0Var7);
                                    x0Var7.C.b(e11, "Failed to gzip post request content");
                                    throw e11;
                                }
                            }
                            responseCode2 = httpURLConnection2.getResponseCode();
                            try {
                                try {
                                    Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                        inputStream2 = httpURLConnection2.getInputStream();
                                        try {
                                            byte[] bArr4 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                                            while (true) {
                                                int i3 = inputStream2.read(bArr4);
                                                if (i3 <= 0) {
                                                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                                    inputStream2.close();
                                                    httpURLConnection2.disconnect();
                                                    a(responseCode2, null, byteArray3, headerFields2);
                                                    return;
                                                }
                                                byteArrayOutputStream3.write(bArr4, 0, i3);
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        inputStream2 = null;
                                    }
                                } catch (IOException e12) {
                                    iOException2 = e12;
                                    outputStream8 = null;
                                    r10 = 0;
                                    if (outputStream8 != null) {
                                        outputStream8.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, iOException2, null, r10);
                                    return;
                                } catch (Throwable th13) {
                                    th2 = th13;
                                    outputStream7 = null;
                                    r9 = 0;
                                    if (outputStream7 != null) {
                                        outputStream7.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, null, null, r9);
                                    throw th2;
                                }
                            } catch (IOException e13) {
                                iOException2 = e13;
                                r10 = r8;
                                outputStream8 = null;
                                if (outputStream8 != null) {
                                    outputStream8.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r10);
                                return;
                            } catch (Throwable th14) {
                                th2 = th14;
                                r9 = r8;
                                outputStream7 = null;
                                if (outputStream7 != null) {
                                    outputStream7.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r9);
                                throw th2;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            outputStream = null;
                            outputStream3 = outputStream;
                            outputStream5 = outputStream;
                            th2 = th;
                            outputStream7 = outputStream5;
                            r9 = outputStream3;
                            if (outputStream7 != null) {
                                outputStream7.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, null, null, r9);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        outputStream2 = null;
                        outputStream4 = outputStream2;
                        outputStream6 = outputStream2;
                        iOException2 = e;
                        outputStream8 = outputStream6;
                        r10 = outputStream4;
                        if (outputStream8 != null) {
                            outputStream8.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, iOException2, null, r10);
                        return;
                    }
                } catch (IOException e15) {
                    e = e15;
                    httpURLConnection2 = null;
                    outputStream2 = null;
                } catch (Throwable th16) {
                    th = th16;
                    httpURLConnection2 = null;
                    outputStream = null;
                }
                break;
        }
    }

    public a1(y2 y2Var, String str, URL url, byte[] bArr, HashMap map, x2 x2Var) {
        Objects.requireNonNull(y2Var);
        this.D = y2Var;
        com.google.android.gms.common.internal.x.d(str);
        this.y = url;
        this.z = bArr;
        this.C = x2Var;
        this.A = str;
        this.B = map;
    }
}
