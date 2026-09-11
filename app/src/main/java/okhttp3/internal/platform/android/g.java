package okhttp3.internal.platform.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import android.view.InputEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.input.pointer.v;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.r;
import androidx.datastore.core.b0;
import androidx.media3.common.util.w;
import com.app.mlounge.emulator.LibretroCore;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements androidx.compose.ui.text.android.selection.d {
    public static androidx.compose.ui.graphics.vector.f A;
    public static androidx.compose.ui.graphics.vector.f B;
    public static androidx.compose.ui.graphics.vector.f C;
    public static androidx.compose.ui.graphics.vector.f D;
    public static androidx.compose.ui.graphics.vector.f E;
    public static final /* synthetic */ int F = 0;
    public static final /* synthetic */ int G = 0;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f y;
    public static androidx.compose.ui.graphics.vector.f z;

    public static final void D(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            androidx.compose.ui.internal.a.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fM = m(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fM);
                }
            }
            float fSqrt = (float) Math.sqrt(m(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : m(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM2 = m(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM2 / fArr11[i14];
        }
    }

    public static final List F(androidx.sqlite.c cVar) {
        int iP = kotlin.math.a.p(cVar, "id");
        int iP2 = kotlin.math.a.p(cVar, "seq");
        int iP3 = kotlin.math.a.p(cVar, "from");
        int iP4 = kotlin.math.a.p(cVar, "to");
        kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
        while (cVar.Q()) {
            bVarH.add(new androidx.room.util.e(cVar.F(iP3), (int) cVar.getLong(iP), cVar.F(iP4), (int) cVar.getLong(iP2)));
        }
        return kotlin.collections.o.e0(com.google.common.base.c.c(bVarH));
    }

    public static final androidx.room.util.h G(androidx.sqlite.a aVar, String str, boolean z2) {
        androidx.sqlite.c cVarU = aVar.U("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iP = kotlin.math.a.p(cVarU, "seqno");
            int iP2 = kotlin.math.a.p(cVarU, "cid");
            int iP3 = kotlin.math.a.p(cVarU, "name");
            int iP4 = kotlin.math.a.p(cVarU, "desc");
            if (iP != -1 && iP2 != -1 && iP3 != -1 && iP4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarU.Q()) {
                    if (((int) cVarU.getLong(iP2)) >= 0) {
                        int i = (int) cVarU.getLong(iP);
                        String strF = cVarU.F(iP3);
                        String str2 = cVarU.getLong(iP4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strF);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listF0 = kotlin.collections.o.f0(linkedHashMap.entrySet(), new androidx.constraintlayout.core.e(3));
                ArrayList arrayList = new ArrayList(p.y(listF0, 10));
                Iterator it = listF0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listK0 = kotlin.collections.o.k0(arrayList);
                List listF1 = kotlin.collections.o.f0(linkedHashMap2.entrySet(), new androidx.constraintlayout.core.e(4));
                ArrayList arrayList2 = new ArrayList(p.y(listF1, 10));
                Iterator it2 = listF1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                androidx.room.util.h hVar = new androidx.room.util.h(str, listK0, kotlin.collections.o.k0(arrayList2), z2);
                com.google.common.base.i.c(cVarU, null);
                return hVar;
            }
            com.google.common.base.i.c(cVarU, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.i.c(cVarU, th);
                throw th2;
            }
        }
    }

    public static long H(w wVar, int i, int i2) {
        wVar.M(i);
        if (wVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = wVar.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || wVar.z() < 7 || wVar.a() < 7 || (wVar.z() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        wVar.k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static int K(coil3.size.c cVar, coil3.size.g gVar) {
        if (cVar instanceof coil3.size.a) {
            return ((coil3.size.a) cVar).a;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        coil3.g.a();
        return 0;
    }

    public static final boolean L(Throwable th, kotlin.jvm.functions.a aVar) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = kotlin.internal.jdk7.a.a;
        androidx.compose.runtime.tooling.f fVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = kotlin.internal.a.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = u.e;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof androidx.compose.runtime.tooling.f) {
                return false;
            }
        }
        try {
            androidx.compose.runtime.tooling.a aVar2 = (androidx.compose.runtime.tooling.a) aVar.invoke();
            if (aVar2 != null && !aVar2.a.isEmpty()) {
                z2 = true;
            }
            if (z2) {
                aVar2.getClass();
                fVar = new androidx.compose.runtime.tooling.f(aVar2);
            }
        } catch (Throwable th2) {
            fVar = th2;
        }
        if (fVar != null) {
            kotlin.a.a(th, fVar);
        }
        return z2;
    }

    public static final Exception M(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            kotlin.a.a(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new b0(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final androidx.compose.ui.unit.e a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        androidx.compose.ui.unit.fontscaling.a aVarA = androidx.compose.ui.unit.fontscaling.b.a(f);
        if (aVarA == null) {
            aVarA = new androidx.compose.ui.unit.n(f);
        }
        return new androidx.compose.ui.unit.e(f2, f, aVarA);
    }

    public static final void b(r rVar, p1 p1Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(-714464401);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(p1Var) ? 32 : 16;
        }
        int i3 = i & 384;
        androidx.compose.runtime.internal.f fVar2 = androidx.compose.foundation.text.contextmenu.internal.k.a;
        if (i3 == 0) {
            i2 |= rVar2.h(fVar2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.h(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                Object h1Var = new h1(null, androidx.compose.runtime.f.A);
                rVar2.l0(h1Var);
                objQ = h1Var;
            }
            androidx.compose.foundation.text.contextmenu.provider.c cVarH = h(fVar2, rVar2, (i2 >> 6) & 14);
            s.a(p1Var.a(cVarH), androidx.compose.runtime.internal.k.c(274270255, new androidx.compose.foundation.text.contextmenu.provider.d(rVar, (y0) objQ, fVar, cVarH, 0), rVar2), rVar2, 56);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.j(rVar, p1Var, fVar, i, 5);
        }
    }

    public static final void e(com.google.firebase.platforminfo.c cVar, v vVar, long j) {
        androidx.compose.ui.input.pointer.util.b bVar = (androidx.compose.ui.input.pointer.util.b) cVar.e;
        bVar.getClass();
        androidx.compose.ui.input.pointer.util.e eVar = (androidx.compose.ui.input.pointer.util.e) bVar.c;
        androidx.compose.ui.input.pointer.util.e eVar2 = (androidx.compose.ui.input.pointer.util.e) bVar.b;
        boolean zB = androidx.compose.ui.input.pointer.u.b(vVar);
        long j2 = vVar.b;
        if (zB) {
            androidx.compose.ui.input.pointer.util.a[] aVarArr = eVar2.d;
            kotlin.collections.n.K(0, aVarArr.length, null, aVarArr);
            eVar2.e = 0;
            androidx.compose.ui.input.pointer.util.a[] aVarArr2 = eVar.d;
            kotlin.collections.n.K(0, aVarArr2.length, null, aVarArr2);
            eVar.e = 0;
            bVar.a = 0L;
        }
        if (!androidx.compose.ui.input.pointer.u.d(vVar)) {
            List list = vVar.k;
            if (list == null) {
                list = u.e;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                androidx.compose.ui.input.pointer.c cVar2 = (androidx.compose.ui.input.pointer.c) list.get(i);
                bVar.a(cVar2.a, androidx.compose.ui.geometry.b.e(cVar2.c, j));
                i++;
            }
            bVar.a(j2, androidx.compose.ui.geometry.b.e(vVar.l, j));
        }
        if (androidx.compose.ui.input.pointer.u.d(vVar) && j2 - bVar.a > 40) {
            androidx.compose.ui.input.pointer.util.a[] aVarArr3 = eVar2.d;
            kotlin.collections.n.K(0, aVarArr3.length, null, aVarArr3);
            eVar2.e = 0;
            androidx.compose.ui.input.pointer.util.a[] aVarArr4 = eVar.d;
            kotlin.collections.n.K(0, aVarArr4.length, null, aVarArr4);
            eVar.e = 0;
            bVar.a = 0L;
        }
        bVar.a = j2;
    }

    public static final com.app.mlounge.data.repository.a f(String str) {
        str.getClass();
        if (kotlin.text.r.O(str, "eporner_", false)) {
            return com.app.mlounge.data.repository.a.y;
        }
        return kotlin.text.r.O(str, "noodle_", false) ? com.app.mlounge.data.repository.a.z : com.app.mlounge.data.repository.a.e;
    }

    public static final androidx.compose.foundation.text.contextmenu.provider.c h(androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        boolean z2 = (((i & 14) ^ 6) > 4 && rVar.f(fVar)) || (i & 6) == 4;
        Object objQ = rVar.Q();
        Object obj = androidx.compose.runtime.m.a;
        if (z2 || objQ == obj) {
            objQ = new androidx.compose.foundation.text.contextmenu.provider.c(fVar);
            rVar.l0(objQ);
        }
        androidx.compose.foundation.text.contextmenu.provider.c cVar = (androidx.compose.foundation.text.contextmenu.provider.c) objQ;
        boolean zF = rVar.f(cVar);
        Object objQ2 = rVar.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new androidx.activity.compose.g(cVar, 22);
            rVar.l0(objQ2);
        }
        j0.b(cVar, (kotlin.jvm.functions.l) objQ2, rVar);
        return cVar;
    }

    public static final long j(int i, int i2, coil3.size.h hVar, coil3.size.g gVar, coil3.size.h hVar2) {
        int i3;
        int i4;
        if (!kotlin.jvm.internal.l.a(hVar, coil3.size.h.c)) {
            i = K(hVar.a, gVar);
            i2 = K(hVar.b, gVar);
        }
        coil3.size.c cVar = hVar2.a;
        coil3.size.c cVar2 = hVar2.b;
        if ((cVar instanceof coil3.size.a) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((coil3.size.a) cVar).a)) {
            i = i4;
        }
        if ((cVar2 instanceof coil3.size.a) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((coil3.size.a) cVar2).a)) {
            i2 = i3;
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final double k(int i, int i2, int i3, int i4, coil3.size.g gVar, coil3.size.h hVar) {
        double dMax;
        double d = i;
        double d2 = ((double) i3) / d;
        double d3 = i2;
        double d4 = ((double) i4) / d3;
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d2, d4);
        } else {
            if (iOrdinal != 1) {
                coil3.g.a();
                return 0.0d;
            }
            dMax = Math.min(d2, d4);
        }
        coil3.size.c cVar = hVar.a;
        if (cVar instanceof coil3.size.a) {
            double d5 = ((double) ((coil3.size.a) cVar).a) / d;
            if (dMax > d5) {
                dMax = d5;
            }
        }
        coil3.size.c cVar2 = hVar.b;
        if (cVar2 instanceof coil3.size.a) {
            double d6 = ((double) ((coil3.size.a) cVar2).a) / d3;
            if (dMax > d6) {
                return d6;
            }
        }
        return dMax;
    }

    public static Bitmap l(byte[] bArr, int i, int i2) throws IOException {
        BitmapFactory.Options options;
        int i3 = 0;
        int iE = 1;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw androidx.media3.common.j0.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            androidx.exifinterface.media.g gVar = new androidx.exifinterface.media.g(byteArrayInputStream);
            byteArrayInputStream.close();
            androidx.exifinterface.media.c cVarC = gVar.c("Orientation");
            if (cVarC != null) {
                try {
                    iE = cVarC.e(gVar.f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (iE) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static final float m(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final ArrayList n(androidx.compose.runtime.tooling.a aVar) {
        int[] iArr = {201, 202, 204, 206, 207, Token.IF, -127, 126665345, org.mozilla.javascript.Context.VERSION_ES6};
        List list = aVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            androidx.compose.runtime.tooling.b bVar = (androidx.compose.runtime.tooling.b) list.get(i);
            if (!kotlin.collections.n.z(bVar.a, iArr)) {
                if (bVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((androidx.compose.runtime.tooling.b) list.get(i3)).a == 1000) {
                        break;
                    }
                    kotlin.collections.o.c0(arrayList);
                } else {
                    arrayList.add(bVar);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final androidx.compose.ui.graphics.vector.f o() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Cancel", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(12.0f, 2.0f);
        gVarH.g(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        gVarH.q(4.47f, 10.0f, 10.0f, 10.0f);
        gVarH.q(10.0f, -4.47f, 10.0f, -10.0f);
        gVarH.p(17.53f, 2.0f, 12.0f, 2.0f);
        gVarH.f();
        gVarH.o(17.0f, 15.59f);
        gVarH.m(15.59f, 17.0f);
        gVarH.m(12.0f, 13.41f);
        gVarH.m(8.41f, 17.0f);
        gVarH.m(7.0f, 15.59f);
        gVarH.m(10.59f, 12.0f);
        gVarH.m(7.0f, 8.41f);
        gVarH.m(8.41f, 7.0f);
        gVarH.m(12.0f, 10.59f);
        gVarH.m(15.59f, 7.0f);
        gVarH.m(17.0f, 8.41f);
        gVarH.m(13.41f, 12.0f);
        gVarH.m(17.0f, 15.59f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f p() {
        androidx.compose.ui.graphics.vector.f fVar = A;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.LiveTv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(21.0f, 6.0f);
        gVar.l(-7.59f);
        gVar.n(3.29f, -3.29f);
        gVar.m(16.0f, 2.0f);
        gVar.n(-4.0f, 4.0f);
        gVar.n(-4.0f, -4.0f);
        gVar.n(-0.71f, 0.71f);
        gVar.m(10.59f, 6.0f);
        gVar.m(3.0f, 6.0f);
        gVar.h(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        gVar.s(12.0f);
        gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.l(18.0f);
        gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.m(23.0f, 8.0f);
        gVar.h(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        gVar.f();
        gVar.o(21.0f, 20.0f);
        gVar.m(3.0f, 20.0f);
        gVar.m(3.0f, 8.0f);
        gVar.l(18.0f);
        gVar.s(12.0f);
        gVar.f();
        gVar.o(9.0f, 10.0f);
        gVar.s(8.0f);
        gVar.n(7.0f, -4.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        A = fVarB;
        return fVarB;
    }

    public static Intent r(Context context, ComponentName componentName) {
        String strS = s(context, componentName);
        if (strS == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strS);
        return s(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String s(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final androidx.compose.ui.graphics.vector.f t() {
        androidx.compose.ui.graphics.vector.f fVar = B;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.PlayCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(12.0f, 2.0f);
        gVarH.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        gVarH.q(4.48f, 10.0f, 10.0f, 10.0f);
        gVarH.q(10.0f, -4.48f, 10.0f, -10.0f);
        gVarH.p(17.52f, 2.0f, 12.0f, 2.0f);
        gVarH.f();
        gVarH.o(9.5f, 16.5f);
        gVarH.s(-9.0f);
        gVarH.n(7.0f, 4.5f);
        gVarH.m(9.5f, 16.5f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        B = fVarB;
        return fVarB;
    }

    public static int x(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final boolean y(c1 c1Var, boolean z2) {
        x xVarC;
        r0 r0Var = c1Var.d;
        if (r0Var == null || (xVarC = r0Var.c()) == null) {
            return false;
        }
        androidx.compose.ui.geometry.c cVarK = com.google.firebase.b.K(xVarC);
        long jL = c1Var.l(z2);
        float f = cVarK.a;
        float f2 = cVarK.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = cVarK.b;
        float f4 = cVarK.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static String z(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            net.luminis.tls.engine.impl.c.o("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public abstract int A(int i);

    public abstract void B(Throwable th);

    public abstract void C(com.google.firebase.messaging.o oVar);

    public abstract int E(int i);

    public abstract Object I(Uri uri, InputEvent inputEvent, kotlin.coroutines.d dVar);

    public abstract Object J(Uri uri, kotlin.coroutines.d dVar);

    @Override // androidx.compose.ui.text.android.selection.d
    public int c(int i) {
        int iA = A(i);
        if (iA == -1 || A(iA) == -1) {
            return -1;
        }
        return iA;
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int d(int i) {
        int iE = E(i);
        if (iE == -1 || E(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int g(int i) {
        return E(i);
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int i(int i) {
        return A(i);
    }

    public abstract Object q(kotlin.coroutines.d dVar);

    public abstract int u(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int v();

    public abstract ViewPropertyAnimator w(View view, int i);
}
