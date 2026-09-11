package com.google.firebase;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.gestures.l;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.lazy.layout.c0;
import androidx.compose.foundation.lazy.layout.f0;
import androidx.compose.foundation.lazy.layout.g1;
import androidx.compose.foundation.lazy.o;
import androidx.compose.foundation.n;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.graphics.y;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.r;
import androidx.compose.ui.text.l0;
import androidx.media3.extractor.text.k;
import com.app.mlounge.emulator.LibretroCore;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static androidx.compose.ui.graphics.vector.f a;
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    public static final float A(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    public static final int B(float f2, int i2, int i3) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }

    public static void G(androidx.media3.extractor.text.d dVar, int i2, androidx.media3.common.util.i iVar) {
        long jF = dVar.f(i2);
        List listJ = dVar.j(jF);
        if (listJ.isEmpty()) {
            return;
        }
        if (i2 == dVar.k() - 1) {
            org.mozilla.javascript.c.a();
            return;
        }
        long jF2 = dVar.f(i2 + 1) - dVar.f(i2);
        if (jF2 > 0) {
            iVar.accept(new androidx.media3.extractor.text.a(jF, jF2, listJ));
        }
    }

    public static String H(Context context, Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        Exception exc;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                        k(cursorQuery);
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    k(cursorQuery);
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                exc = e2;
                Log.w("DocumentFile", "Failed query: " + exc);
                k(cursorQuery);
                return null;
            }
        } catch (Exception e3) {
            exc = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
        }
        th = th2;
        k(cursorQuery);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void I(androidx.media3.extractor.text.d dVar, k kVar, androidx.media3.common.util.i iVar) {
        int iE;
        boolean z;
        long j2 = kVar.a;
        if (j2 == -9223372036854775807L) {
            iE = 0;
        } else {
            iE = dVar.e(j2);
            if (iE == -1) {
                iE = dVar.k();
            }
            if (iE > 0 && dVar.f(iE - 1) == j2) {
                iE--;
            }
        }
        if (j2 == -9223372036854775807L || iE >= dVar.k()) {
            z = false;
        } else {
            List listJ = dVar.j(j2);
            long jF = dVar.f(iE);
            if (listJ.isEmpty()) {
                z = false;
            } else {
                long j3 = kVar.a;
                if (j3 < jF) {
                    iVar.accept(new androidx.media3.extractor.text.a(j3, jF - j3, listJ));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i2 = iE; i2 < dVar.k(); i2++) {
            G(dVar, i2, iVar);
        }
        if (kVar.b) {
            if (z) {
                iE--;
            }
            for (int i3 = 0; i3 < iE; i3++) {
                G(dVar, i3, iVar);
            }
            if (z) {
                iVar.accept(new androidx.media3.extractor.text.a(dVar.f(iE), j2 - dVar.f(iE), dVar.j(j2)));
            }
        }
    }

    public static final androidx.compose.ui.geometry.c K(x xVar) {
        androidx.compose.ui.geometry.c cVarE = a0.e(xVar, true);
        long jH = xVar.H(cVarE.d());
        float f2 = cVarE.c;
        float f3 = cVarE.d;
        long jH2 = xVar.H((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        return new androidx.compose.ui.geometry.c(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & 4294967295L)), Float.intBitsToFloat((int) (jH2 >> 32)), Float.intBitsToFloat((int) (jH2 & 4294967295L)));
    }

    public static void L(int i2, int i3) {
        String strE;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strE = t1.E("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
                    return;
                }
                strE = t1.E("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    public static void M(int i2, int i3, int i4) {
        String strN;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strN = N(i2, i4, "start index");
            } else {
                strN = (i3 < 0 || i3 > i4) ? N(i3, i4, "end index") : t1.E("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static String N(int i2, int i3, String str) {
        if (i2 < 0) {
            return t1.E("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return t1.E("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x026d  */
    public static final void a(r rVar, androidx.compose.foundation.lazy.grid.x xVar, androidx.compose.foundation.lazy.grid.c cVar, m0 m0Var, l lVar, boolean z, n nVar, androidx.compose.foundation.layout.g gVar, androidx.compose.foundation.layout.e eVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.r rVar2, int i2, int i3) {
        int i4;
        int i5;
        androidx.compose.foundation.lazy.grid.x xVar2;
        boolean z2;
        Object mVar;
        androidx.compose.foundation.lazy.grid.x xVar3;
        boolean z3;
        boolean z4;
        kotlin.reflect.h hVar;
        r rVarM;
        rVar2.c0(708740370);
        if ((i2 & 6) == 0) {
            i4 = (rVar2.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rVar2.f(xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? rVar2.f(cVar) : rVar2.h(cVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= rVar2.f(m0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i4 |= rVar2.g(false) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= rVar2.g(true) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= rVar2.f(lVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= rVar2.g(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= rVar2.f(nVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= rVar2.f(gVar) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (rVar2.f(eVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= rVar2.h(lVar2) ? 32 : 16;
        }
        if (rVar2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            rVar2.Y();
            if ((i2 & 1) != 0 && !rVar2.C()) {
                rVar2.W();
            }
            rVar2.q();
            int i6 = i4 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i5 & Token.ASSIGN_MOD);
            y0 y0VarV = s.v(lVar2, rVar2);
            int i9 = i4;
            boolean z5 = (((i8 & 14) ^ 6) > 4 && rVar2.f(xVar)) || (i8 & 6) == 4;
            Object objQ = rVar2.Q();
            Object obj = m.a;
            if (z5 || objQ == obj) {
                androidx.compose.runtime.f fVar = androidx.compose.runtime.f.B;
                objQ = new o(0, 1, t2.class, s.j(fVar, new androidx.activity.compose.f(5, s.j(fVar, new androidx.compose.foundation.lazy.n(y0VarV, 1)), xVar)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                rVar2.l0(objQ);
            }
            kotlin.reflect.h hVar2 = (kotlin.reflect.h) objQ;
            int i10 = i7 | ((i9 >> 9) & Token.ASSIGN_MOD);
            boolean z6 = ((((i10 & 14) ^ 6) > 4 && rVar2.f(xVar)) || (i10 & 6) == 4) | ((((i10 & Token.ASSIGN_MOD) ^ 48) > 32 && rVar2.g(false)) || (i10 & 48) == 32);
            Object objQ2 = rVar2.Q();
            if (z6 || objQ2 == obj) {
                objQ2 = new androidx.compose.foundation.lazy.grid.a0(xVar);
                rVar2.l0(objQ2);
            }
            androidx.compose.foundation.lazy.grid.a0 a0Var = (androidx.compose.foundation.lazy.grid.a0) objQ2;
            Object objQ3 = rVar2.Q();
            if (objQ3 == obj) {
                objQ3 = j0.f(rVar2);
                rVar2.l0(objQ3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ3;
            y yVar = (y) rVar2.j(l1.g);
            f0 f0Var = !((Boolean) rVar2.j(l1.v)).booleanValue() ? g1.a : null;
            int i11 = (i9 & 524272) | ((i5 << 18) & 3670016) | ((i9 >> 6) & 29360128);
            boolean z7 = ((((i11 & 896) ^ 384) > 256 && rVar2.f(cVar)) || (i11 & 384) == 256) | ((((i11 & Token.ASSIGN_MOD) ^ 48) > 32 && rVar2.f(xVar)) || (i11 & 48) == 32) | ((((i11 & 7168) ^ 3072) > 2048 && rVar2.f(m0Var)) || (i11 & 3072) == 2048);
            if (((57344 & i11) ^ 24576) > 16384 && rVar2.g(false)) {
                z2 = true;
            } else if ((i11 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zF = ((((i11 & 29360128) ^ 12582912) > 8388608 && rVar2.f(gVar)) || (i11 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i11) ^ 196608) > 131072 && rVar2.g(true)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) > 1048576 && rVar2.f(eVar)) || (i11 & 1572864) == 1048576) | rVar2.f(yVar);
            Object objQ4 = rVar2.Q();
            if (zF || objQ4 == obj) {
                xVar3 = xVar;
                z3 = false;
                z4 = true;
                mVar = new androidx.compose.foundation.lazy.grid.m(xVar3, m0Var, hVar2, cVar, gVar, eVar, coroutineScope, yVar, f0Var);
                hVar = hVar2;
                rVar2.l0(mVar);
            } else {
                mVar = objQ4;
                hVar = hVar2;
                z3 = false;
                z4 = true;
                xVar3 = xVar;
            }
            c0 c0Var = (c0) mVar;
            k1 k1Var = k1.e;
            if (z) {
                rVar2.b0(27281635);
                boolean z8 = (((i7 ^ 6) <= 4 || !rVar2.f(xVar3)) && (i6 & 6) != 4) ? z3 : z4;
                Object objQ5 = rVar2.Q();
                if (z8 || objQ5 == obj) {
                    objQ5 = new androidx.compose.foundation.lazy.grid.d(xVar3);
                    rVar2.l0(objQ5);
                }
                rVarM = androidx.compose.foundation.lazy.layout.m.m((androidx.compose.foundation.lazy.grid.d) objQ5, xVar3.n, k1Var);
                rVar2.p(z3);
            } else {
                rVar2.b0(27577840);
                rVar2.p(z3);
                rVarM = androidx.compose.ui.o.b;
            }
            xVar2 = xVar3;
            androidx.compose.foundation.lazy.layout.m.a(hVar, androidx.compose.foundation.s.q(androidx.compose.foundation.lazy.layout.m.n(rVar.d(xVar3.k).d(xVar3.l), hVar, a0Var, k1Var, z).d(rVarM).d(xVar3.m.i), xVar3, k1Var, nVar, z, lVar, xVar3.f), xVar2.o, c0Var, rVar2, 0);
        } else {
            xVar2 = xVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.lazy.grid.e(rVar, xVar2, cVar, m0Var, lVar, z, nVar, gVar, eVar, lVar2, i2, i3);
        }
    }

    public static final androidx.compose.ui.geometry.d b(float f2, float f3, float f4, float f5, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new androidx.compose.ui.geometry.d(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final Object[] c(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        kotlin.collections.n.H(0, i2, 6, objArr, objArr2);
        kotlin.collections.n.D(i2 + 2, i2, objArr.length, objArr, objArr2);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] d(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        kotlin.collections.n.H(0, i2, 6, objArr, objArr2);
        kotlin.collections.n.D(i2, i2 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] e(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.n.H(0, i2, 6, objArr, objArr2);
        kotlin.collections.n.D(i2, i2 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static void f(String str, boolean z) {
        if (z) {
            return;
        }
        net.luminis.tls.engine.impl.c.o(str);
    }

    public static void g(int i2) {
        if (i2 >= 0) {
            return;
        }
        net.luminis.tls.engine.impl.c.a();
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.gson.b.h(str);
    }

    public static void k(Cursor cursor) {
        if (cursor != null) {
            try {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.t(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (okhttp3.internal.platform.android.g.k(r11.getWidth(), r11.getHeight(), (int) (r2 >> 32), (int) (r2 & 4294967295L), r4, r20) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap l(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, coil3.size.h r18, coil3.size.g r19, coil3.size.h r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = com.google.android.gms.common.wrappers.a.d(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = okhttp3.internal.platform.android.g.j(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = okhttp3.internal.platform.android.g.k(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = coil3.util.m.b(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = coil3.util.m.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = okhttp3.internal.platform.android.g.j(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r7 = r11 & r8
            int r3 = (int) r7
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = okhttp3.internal.platform.android.g.k(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = kotlin.math.a.E(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = kotlin.math.a.E(r2)
            if (r17 == 0) goto L9b
            boolean r2 = com.google.android.gms.common.wrappers.a.d(r17)
            if (r2 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9d:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.b.l(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, coil3.size.h, coil3.size.g, coil3.size.h, boolean):android.graphics.Bitmap");
    }

    public static boolean m(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e2) {
            Log.w("DocumentFile", "Failed query: " + e2);
            return false;
        } finally {
            k(cursorQuery);
        }
    }

    public static final float n(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / ((long) 3))) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final androidx.compose.ui.graphics.vector.f o() {
        androidx.compose.ui.graphics.vector.f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Audiotrack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(12.0f, 3.0f);
        gVar.s(9.28f);
        gVar.h(-0.47f, -0.17f, -0.97f, -0.28f, -1.5f, -0.28f);
        gVar.g(8.01f, 12.0f, 6.0f, 14.01f, 6.0f, 16.5f);
        gVar.p(8.01f, 21.0f, 10.5f, 21.0f);
        gVar.h(2.31f, 0.0f, 4.2f, -1.75f, 4.45f, -4.0f);
        gVar.k(15.0f);
        gVar.r(6.0f);
        gVar.l(4.0f);
        gVar.r(3.0f);
        gVar.l(-7.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f p() {
        androidx.compose.ui.graphics.vector.f fVar = c;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.FileOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(14.0f, 2.0f);
        gVar.k(6.0f);
        gVar.g(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        gVar.s(16.0f);
        gVar.h(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        gVar.k(15.0f);
        gVar.s(-8.0f);
        gVar.l(5.0f);
        gVar.r(8.0f);
        gVar.m(14.0f, 2.0f);
        gVar.f();
        gVar.o(13.0f, 9.0f);
        gVar.r(3.5f);
        gVar.m(18.5f, 9.0f);
        gVar.k(13.0f);
        gVar.f();
        gVar.o(17.0f, 21.66f);
        gVar.r(16.0f);
        gVar.l(5.66f);
        gVar.s(2.0f);
        gVar.l(-2.24f);
        gVar.n(2.95f, 2.95f);
        gVar.n(-1.41f, 1.41f);
        gVar.m(19.0f, 19.41f);
        gVar.n(0.0f, 2.24f);
        gVar.k(17.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        c = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f q() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(6.0f, 19.0f);
        gVar.l(4.0f);
        gVar.m(10.0f, 5.0f);
        gVar.m(6.0f, 5.0f);
        gVar.s(14.0f);
        gVar.f();
        gVar.o(14.0f, 5.0f);
        gVar.s(14.0f);
        gVar.l(4.0f);
        gVar.m(18.0f, 5.0f);
        gVar.l(-4.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.text.g r(androidx.compose.ui.text.input.x xVar) {
        androidx.compose.ui.text.g gVar = xVar.a;
        long j2 = xVar.b;
        gVar.getClass();
        return gVar.subSequence(l0.f(j2), l0.e(j2));
    }

    public static final androidx.compose.ui.text.g s(androidx.compose.ui.text.input.x xVar, int i2) {
        androidx.compose.ui.text.g gVar = xVar.a;
        androidx.compose.ui.text.g gVar2 = xVar.a;
        long j2 = xVar.b;
        int iE = l0.e(j2);
        int iE2 = l0.e(j2);
        int length = iE2 + i2;
        if (((i2 ^ length) & (iE2 ^ length)) < 0) {
            length = gVar2.y.length();
        }
        return gVar.subSequence(iE, Math.min(length, gVar2.y.length()));
    }

    public static final androidx.compose.ui.text.g t(androidx.compose.ui.text.input.x xVar, int i2) {
        androidx.compose.ui.text.g gVar = xVar.a;
        long j2 = xVar.b;
        int iF = l0.f(j2);
        int i3 = iF - i2;
        if (((iF ^ i3) & (i2 ^ iF)) < 0) {
            i3 = 0;
        }
        return gVar.subSequence(Math.max(0, i3), l0.f(j2));
    }

    public static final androidx.compose.ui.graphics.vector.f u() {
        androidx.compose.ui.graphics.vector.f fVar = g;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(9.0f, 11.24f);
        gVar.r(7.5f);
        gVar.g(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f);
        gVar.p(14.0f, 6.12f, 14.0f, 7.5f);
        gVar.s(3.74f);
        gVar.h(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        gVar.g(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f);
        gVar.p(7.0f, 5.01f, 7.0f, 7.5f);
        gVar.g(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f);
        gVar.f();
        gVar.o(18.84f, 15.87f);
        gVar.n(-4.54f, -2.26f);
        gVar.h(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f);
        gVar.k(13.0f);
        gVar.s(-6.0f);
        gVar.g(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f);
        gVar.p(10.0f, 6.67f, 10.0f, 7.5f);
        gVar.s(10.74f);
        gVar.h(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f);
        gVar.h(-0.31f, 0.0f, -0.59f, 0.13f, -0.79f, 0.33f);
        gVar.n(-0.79f, 0.8f);
        gVar.n(4.94f, 4.94f);
        gVar.g(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f);
        gVar.l(6.79f);
        gVar.h(0.75f, 0.0f, 1.33f, -0.55f, 1.44f, -1.28f);
        gVar.n(0.75f, -5.27f);
        gVar.h(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f);
        gVar.g(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        g = fVarB;
        return fVarB;
    }

    public static final boolean x(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final int y(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final boolean z(androidx.compose.ui.geometry.d dVar) {
        long j2 = dVar.e;
        return (j2 >>> 32) == (4294967295L & j2) && j2 == dVar.f && j2 == dVar.g && j2 == dVar.h;
    }

    public abstract void D(int i2);

    public abstract void E(View view, int i2, int i3);

    public abstract void F(View view, float f2, float f3);

    public abstract boolean J(View view, int i2);

    public abstract int i(View view, int i2);

    public abstract int j(View view, int i2);

    public int v(View view) {
        return 0;
    }

    public int w() {
        return 0;
    }

    public void C(View view, int i2) {
    }
}
