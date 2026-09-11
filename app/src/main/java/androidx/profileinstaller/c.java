package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.compose.foundation.gestures.j1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final com.google.android.material.shape.g a = new com.google.android.material.shape.g();
    public static final byte[] b = {112, 114, 111, 0};
    public static final byte[] c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.g * 2) + 7) & (-8)) / 8) + (aVar.e * 2) + d(aVar.a, aVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f)) {
            int length2 = aVarArr.length;
            while (i2 < length2) {
                a aVar2 = aVarArr[i2];
                q(byteArrayOutputStream, aVar2, d(aVar2.a, aVar2.b, bArr));
                p(byteArrayOutputStream, aVar2);
                i2++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(aVar3.a, aVar3.b, bArr));
            }
            int length3 = aVarArr.length;
            while (i2 < length3) {
                p(byteArrayOutputStream, aVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = c(file2) && z;
        }
        return z;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return androidx.privacysandbox.ads.adservices.java.internal.a.u(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.l(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iM = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i3] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                net.luminis.tls.engine.impl.c.r("Unsupported meta version");
                return null;
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                net.luminis.tls.engine.impl.c.r("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(d, bArr2)) {
            net.luminis.tls.engine.impl.c.r("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            net.luminis.tls.engine.impl.c.r("Unsupported meta version");
            return null;
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            net.luminis.tls.engine.impl.c.r("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i2, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i2 != aVarArr.length) {
            net.luminis.tls.engine.impl.c.r("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            a aVar = aVarArr[i4];
            if (!aVar.b.equals(strArr[i4])) {
                net.luminis.tls.engine.impl.c.r("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            aVar.e = i5;
            aVar.h = g(byteArrayInputStream, i5);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i2 != aVarArr.length) {
            net.luminis.tls.engine.impl.c.r("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < aVarArr.length; i4++) {
                    if (aVarArr[i4].b.equals(strSubstring)) {
                        aVar = aVarArr[i4];
                        break;
                    }
                }
            }
            if (aVar == null) {
                net.luminis.tls.engine.impl.c.r("Missing profile key: ".concat(str));
                return null;
            }
            aVar.d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, h)) {
                aVar.e = iM;
                aVar.h = iArrG;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, e)) {
            net.luminis.tls.engine.impl.c.r("Unsupported version");
            return null;
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            net.luminis.tls.engine.impl.c.r("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i2) throws IOException {
        byte[] bArrF = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrF[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            aVarArr[i4] = new a(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            a aVar = aVarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = aVar.f;
            int i7 = aVar.g;
            TreeMap treeMap = aVar.i;
            int i8 = iAvailable - i6;
            int iM3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iM4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                net.luminis.tls.engine.impl.c.r("Read too much data during profile line parse");
                return null;
            }
            aVar.h = g(byteArrayInputStream, aVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return aVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.i.size() * 4;
                    String strD = d(aVar.a, aVar.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = aVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i3 : aVar.h) {
                        v(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.a;
                TreeMap treeMap = aVar2.i;
                String strD2 = d(str, aVar2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.h.length);
                u(byteArrayOutputStream, aVar2.c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : aVar2.h) {
                    v(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.c, 4);
                u(byteArrayOutputStream2, aVar3.d, 4);
                u(byteArrayOutputStream2, aVar3.g, 4);
                String strD3 = d(aVar3.a, aVar3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < aVarArr.length) {
                try {
                    a aVar4 = aVarArr[i7];
                    v(byteArrayOutputStream3, i7);
                    v(byteArrayOutputStream3, aVar4.e);
                    i8 = i8 + 4 + (aVar4.e * i5);
                    int[] iArr = aVar4.h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    int i10 = i5;
                    int i11 = i9;
                    while (i11 < length3) {
                        int i12 = iArr[i11];
                        v(byteArrayOutputStream3, i12 - i9);
                        i11++;
                        i9 = i12;
                    }
                    i7++;
                    i5 = i10;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i13];
                    Iterator it3 = aVar5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i14 = i15 + length4;
                            i13++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList2.add(jVar3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i16 = 0;
            while (i16 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i16);
                int i17 = jVar4.a;
                byte[] bArr7 = jVar4.b;
                if (i17 == 1) {
                    j2 = 0;
                } else if (i17 == 2) {
                    j2 = 1;
                } else if (i17 == 3) {
                    j2 = 2;
                } else if (i17 == 4) {
                    j2 = 3;
                } else {
                    if (i17 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                u(byteArrayOutputStream, j2, 4);
                u(byteArrayOutputStream, size2, 4);
                if (jVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        s(byteArrayOutputStream, aVar);
        int i2 = aVar.g;
        int[] iArr = aVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            v(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.e);
        u(byteArrayOutputStream, aVar.f, 4);
        u(byteArrayOutputStream, aVar.c, 4);
        u(byteArrayOutputStream, aVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i2, a aVar) throws IOException {
        int i3 = aVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : aVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i2);
                v(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0192 A[Catch: all -> 0x018f, TRY_ENTER, TryCatch #29 {all -> 0x018f, blocks: (B:94:0x016e, B:96:0x017a, B:107:0x0192, B:108:0x0197), top: B:281:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a3 A[Catch: IllegalStateException -> 0x0189, IOException -> 0x018b, FileNotFoundException -> 0x018d, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x018d, IOException -> 0x018b, IllegalStateException -> 0x0189, blocks: (B:92:0x0166, B:97:0x0184, B:115:0x01a3, B:113:0x01a0, B:112:0x019d), top: B:299:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e3 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #13 {all -> 0x01f1, blocks: (B:130:0x01d7, B:132:0x01e3, B:141:0x01f4), top: B:270:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f4 A[Catch: all -> 0x01f1, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x01f1, blocks: (B:130:0x01d7, B:132:0x01e3, B:141:0x01f4), top: B:270:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0211  */
    /* JADX WARN: Code duplicated, block: B:156:0x021b  */
    /* JADX WARN: Code duplicated, block: B:157:0x021f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0241 A[Catch: all -> 0x027f, TryCatch #22 {all -> 0x027f, blocks: (B:164:0x023b, B:166:0x0241, B:167:0x0245, B:169:0x024b), top: B:275:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:169:0x024b A[Catch: all -> 0x027f, TRY_LEAVE, TryCatch #22 {all -> 0x027f, blocks: (B:164:0x023b, B:166:0x0241, B:167:0x0245, B:169:0x024b), top: B:275:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:239:0x02da  */
    /* JADX WARN: Code duplicated, block: B:246:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:267:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0250 A[EDGE_INSN: B:300:0x0250->B:171:0x0250 BREAK  A[LOOP:0: B:167:0x0245->B:301:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #10 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:267:0x0107, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #10 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:267:0x0107, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x017a A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #29 {all -> 0x018f, blocks: (B:94:0x016e, B:96:0x017a, B:107:0x0192, B:108:0x0197), top: B:281:0x016e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static void t(Context context, Executor executor, b bVar, boolean z) {
        boolean z2;
        ?? E;
        byte[] bArr;
        a[] aVarArrL;
        a[] aVarArr;
        b bVar2;
        a[] aVarArr2;
        byte[] bArr2;
        ?? r7;
        byte[] bArr3;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i2;
        ?? r9;
        boolean z4;
        boolean z5;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        j1 j1Var;
        ?? r11;
        String str;
        FileInputStream fileInputStreamE;
        ?? r12;
        ?? r13;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j2 == packageInfo.lastUpdateTime;
                            if (z6) {
                                bVar.j(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    i.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            j1 j1Var2 = new j1(assets, executor, bVar, name, file2);
            byte[] bArr5 = (byte[]) j1Var2.d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            j1Var2.a = true;
                            E = j1Var2.e(assets, "dexopt/baseline.prof");
                            bArr = b;
                            if (E != 0) {
                                if (Arrays.equals(bArr, f(E, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                aVarArrL = l(E, f(E, 4), (String) j1Var2.f);
                                E.close();
                                j1Var2.g = aVarArrL;
                            }
                            aVarArr = (a[]) j1Var2.g;
                            if (aVarArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamE = j1Var2.e(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamE == null) {
                                    if (fileInputStreamE != null) {
                                        fileInputStreamE.close();
                                        r11 = str;
                                    }
                                    j1Var = null;
                                    E = r11;
                                } else {
                                    if (Arrays.equals(c, f(fileInputStreamE, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrF = f(fileInputStreamE, 4);
                                    j1Var2.g = i(fileInputStreamE, bArrF, bArr5, aVarArr);
                                    fileInputStreamE.close();
                                    j1Var = j1Var2;
                                    E = bArrF;
                                }
                                if (j1Var != null) {
                                    j1Var2 = j1Var;
                                }
                            }
                            bVar2 = (b) j1Var2.c;
                            aVarArr2 = (a[]) j1Var2.g;
                            bArr2 = (byte[]) j1Var2.d;
                            r7 = E;
                            r7 = E;
                            if (aVarArr2 != null) {
                                z5 = j1Var2.a;
                                if (z5) {
                                    net.luminis.tls.engine.impl.c.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                    j1Var2.h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    j1Var2.g = null;
                                    r7 = r10;
                                } else {
                                    bVar2.j(5, null);
                                    j1Var2.g = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr3 = (byte[]) j1Var2.h;
                            if (bArr3 != null) {
                                if (j1Var2.a) {
                                    net.luminis.tls.engine.impl.c.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream((File) j1Var2.e);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i2 = byteArrayInputStream.read(bArr4);
                                            if (i2 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i2);
                                        }
                                        r9 = 1;
                                        j1Var2.f(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        j1Var2.h = null;
                                        j1Var2.g = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                e(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            j1Var2.f(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        j1Var2.f(4, null);
                    }
                } else if (file2.canWrite()) {
                    j1Var2.a = true;
                    try {
                        E = j1Var2.e(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        bVar.j(6, e2);
                        E = 0;
                    } catch (IOException e3) {
                        bVar.j(7, e3);
                        E = 0;
                    }
                    bArr = b;
                    try {
                        if (E != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr, f(E, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    aVarArrL = l(E, f(E, 4), (String) j1Var2.f);
                                    try {
                                        E.close();
                                    } catch (IOException e4) {
                                        bVar.j(7, e4);
                                    }
                                    j1Var2.g = aVarArrL;
                                } catch (IllegalStateException e5) {
                                    bVar.j(8, e5);
                                    try {
                                        E.close();
                                    } catch (IOException e6) {
                                        bVar.j(7, e6);
                                    }
                                    aVarArrL = null;
                                }
                            } catch (IOException e7) {
                                bVar.j(7, e7);
                                E.close();
                                aVarArrL = null;
                            }
                        }
                        aVarArr = (a[]) j1Var2.g;
                        if (aVarArr != null && ((E = Build.VERSION.SDK_INT) >= 31 || E == 24 || E == 25)) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamE = j1Var2.e(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamE == null) {
                                    try {
                                        if (Arrays.equals(c, f(fileInputStreamE, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrF2 = f(fileInputStreamE, 4);
                                        j1Var2.g = i(fileInputStreamE, bArrF2, bArr5, aVarArr);
                                        fileInputStreamE.close();
                                        j1Var = j1Var2;
                                        E = bArrF2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamE.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamE != null) {
                                        fileInputStreamE.close();
                                        r11 = str;
                                    }
                                    j1Var = null;
                                    E = r11;
                                }
                            } catch (FileNotFoundException e8) {
                                bVar.j(9, e8);
                                r11 = E;
                            } catch (IOException e9) {
                                bVar.j(7, e9);
                                r11 = E;
                            } catch (IllegalStateException e10) {
                                j1Var2.g = null;
                                bVar.j(8, e10);
                                r11 = E;
                            }
                            if (j1Var != null) {
                                j1Var2 = j1Var;
                            }
                        }
                        bVar2 = (b) j1Var2.c;
                        aVarArr2 = (a[]) j1Var2.g;
                        bArr2 = (byte[]) j1Var2.d;
                        r7 = E;
                        r7 = E;
                        if (aVarArr2 != null && bArr2 != null) {
                            z5 = j1Var2.a;
                            if (z5) {
                                net.luminis.tls.engine.impl.c.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                        bVar2.j(5, null);
                                        j1Var2.g = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        j1Var2.h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        j1Var2.g = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e11) {
                                bVar2.j(7, e11);
                                r10 = z5;
                            } catch (IllegalStateException e12) {
                                bVar2.j(8, e12);
                                r10 = z5;
                            }
                        }
                        bArr3 = (byte[]) j1Var2.h;
                        if (bArr3 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (j1Var2.a) {
                                    net.luminis.tls.engine.impl.c.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) j1Var2.e);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i2 = byteArrayInputStream.read(bArr4);
                                                                                    if (i2 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i2);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                j1Var2.f(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                j1Var2.h = null;
                                                                                j1Var2.g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                }
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                Throwable th14 = th;
                                                                if (channel == null) {
                                                                    throw th14;
                                                                }
                                                                try {
                                                                    channel.close();
                                                                    throw th14;
                                                                } catch (Throwable th15) {
                                                                    th14.addSuppressed(th15);
                                                                    throw th14;
                                                                }
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        j1Var2.f(6, e);
                                        r8 = r7;
                                        j1Var2.h = null;
                                        j1Var2.g = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e14) {
                                        e = e14;
                                        j1Var2.f(7, e);
                                        r8 = r7;
                                        j1Var2.h = null;
                                        j1Var2.g = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    r7 = 1;
                                    j1Var2.f(6, e);
                                    r8 = r7;
                                    j1Var2.h = null;
                                    j1Var2.g = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e16) {
                                    e = e16;
                                    r7 = 1;
                                    j1Var2.f(7, e);
                                    r8 = r7;
                                    j1Var2.h = null;
                                    j1Var2.g = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                j1Var2.h = null;
                                j1Var2.g = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            e(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            E.close();
                            throw th24;
                        } catch (IOException e17) {
                            bVar.j(7, e17);
                            throw th24;
                        }
                    }
                } else {
                    j1Var2.f(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                i.c(context, r13);
            }
            j1Var2.f(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            i.c(context, r13);
        } catch (PackageManager.NameNotFoundException e18) {
            bVar.j(7, e18);
            i.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        u(byteArrayOutputStream, i2, 2);
    }
}
