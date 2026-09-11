package coil3.decode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.sync.Semaphore;
import okio.a0;
import okio.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k {
    public final q a;
    public final coil3.request.n b;
    public final Semaphore c;
    public final n d;

    public e(q qVar, coil3.request.n nVar, Semaphore semaphore, n nVar2) {
        this.a = qVar;
        this.b = nVar;
        this.c = semaphore;
        this.d = nVar2;
    }

    public static i b(e eVar) throws Exception {
        l lVar;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i;
        int iMin;
        double dMax;
        int iE;
        int iE2;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        coil3.request.n nVar = eVar.b;
        b bVar = new b(eVar.a.P());
        b0 b0Var = new b0(bVar);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new a0(b0Var.m()), null, options);
        Exception exc = (Exception) bVar.z;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = o.a;
        String str = options.outMimeType;
        eVar.d.getClass();
        if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
            androidx.exifinterface.media.g gVar = new androidx.exifinterface.media.g(new m(new a0(b0Var.m())));
            androidx.exifinterface.media.c cVarC = gVar.c("Orientation");
            if (cVarC == null) {
                iE = 1;
            } else {
                try {
                    iE = cVarC.e(gVar.f);
                } catch (NumberFormatException unused) {
                    iE = 1;
                }
            }
            boolean z2 = iE == 2 || iE == 7 || iE == 4 || iE == 5;
            androidx.exifinterface.media.c cVarC2 = gVar.c("Orientation");
            if (cVarC2 == null) {
                iE2 = 1;
            } else {
                try {
                    iE2 = cVarC2.e(gVar.f);
                } catch (NumberFormatException unused2) {
                    iE2 = 1;
                }
            }
            switch (iE2) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            lVar = new l(i2, z2);
        } else {
            lVar = l.c;
        }
        int i3 = lVar.b;
        boolean z3 = lVar.a;
        Exception exc2 = (Exception) bVar.z;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            coil3.i iVar = coil3.request.i.c;
            if (((ColorSpace) coil3.m.e(nVar, iVar)) != null) {
                options.inPreferredColorSpace = (ColorSpace) coil3.m.e(nVar, iVar);
            }
        }
        boolean zBooleanValue = ((Boolean) coil3.m.e(nVar, coil3.request.i.d)).booleanValue();
        Context context = nVar.a;
        options.inPremultiplied = zBooleanValue;
        Bitmap.Config config = (Bitmap.Config) coil3.m.e(nVar, coil3.request.i.b);
        if ((z3 || i3 > 0) && (config == null || com.google.android.gms.common.wrappers.a.d(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) coil3.m.e(nVar, coil3.request.i.g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.l.a(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i4 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        int i5 = options.outWidth;
        if (i5 <= 0 || (i = options.outHeight) <= 0) {
            options.inSampleSize = 1;
            z = false;
            options.inScaled = false;
        } else {
            int i6 = (i3 == 90 || i3 == 270) ? i : i5;
            if (i3 != 90 && i3 != 270) {
                i5 = i;
            }
            coil3.size.h hVar = nVar.b;
            coil3.size.g gVar2 = nVar.c;
            coil3.i iVar2 = coil3.request.h.b;
            long j = okhttp3.internal.platform.android.g.j(i6, i5, hVar, gVar2, (coil3.size.h) coil3.m.e(nVar, iVar2));
            z3 = z3;
            int i7 = (int) (j >> 32);
            int i8 = (int) (j & 4294967295L);
            int iHighestOneBit = Integer.highestOneBit(i6 / i7);
            int iHighestOneBit2 = Integer.highestOneBit(i5 / i8);
            int iOrdinal = gVar2.ordinal();
            if (iOrdinal == 0) {
                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
            } else {
                if (iOrdinal != 1) {
                    coil3.g.a();
                    return null;
                }
                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
            }
            if (iMin < 1) {
                iMin = 1;
            }
            options.inSampleSize = iMin;
            double d = iMin;
            double d2 = ((double) i6) / d;
            double d3 = ((double) i5) / d;
            coil3.size.h hVar2 = (coil3.size.h) coil3.m.e(nVar, iVar2);
            double d4 = ((double) i7) / d2;
            double d5 = ((double) i8) / d3;
            int iOrdinal2 = gVar2.ordinal();
            if (iOrdinal2 == 0) {
                dMax = Math.max(d4, d5);
            } else {
                if (iOrdinal2 != 1) {
                    coil3.g.a();
                    return null;
                }
                dMax = Math.min(d4, d5);
            }
            coil3.size.c cVar = hVar2.a;
            if (cVar instanceof coil3.size.a) {
                double d6 = ((double) ((coil3.size.a) cVar).a) / d2;
                if (dMax > d6) {
                    dMax = d6;
                }
            }
            coil3.size.c cVar2 = hVar2.b;
            if (cVar2 instanceof coil3.size.a) {
                double d7 = ((double) ((coil3.size.a) cVar2).a) / d3;
                if (dMax > d7) {
                    dMax = d7;
                }
            }
            if (nVar.d == coil3.size.d.y && dMax > 1.0d) {
                dMax = 1.0d;
            }
            boolean z4 = dMax == 1.0d;
            options.inScaled = !z4;
            if (!z4) {
                if (dMax > 1.0d) {
                    options.inDensity = kotlin.math.a.E(((double) Integer.MAX_VALUE) / dMax);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = kotlin.math.a.E(((double) Integer.MAX_VALUE) * dMax);
                }
            }
            z = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new a0(b0Var), null, options);
            b0Var.close();
            Exception exc3 = (Exception) bVar.z;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                net.luminis.tls.engine.impl.c.r("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z3 || i3 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z3) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i3 > 0) {
                    matrix.postRotate(i3, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i3 == 90 || i3 == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, o.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new i(coil3.m.c(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.b.d(b0Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil3.decode.k
    public final Object a(kotlin.coroutines.d dVar) throws Throwable {
        d dVar2;
        Semaphore semaphore;
        Semaphore semaphore2;
        Throwable th;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i = dVar2.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar2.A = i - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, (kotlin.coroutines.jvm.internal.c) dVar);
            }
        } else {
            dVar2 = new d(this, (kotlin.coroutines.jvm.internal.c) dVar);
        }
        Object obj = dVar2.y;
        int i2 = dVar2.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                semaphore = this.c;
                dVar2.e = semaphore;
                dVar2.A = 1;
                if (semaphore.acquire(dVar2) != aVar) {
                }
                return aVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                semaphore2 = dVar2.e;
                try {
                    kotlin.a.e(obj);
                    i iVar = (i) obj;
                    semaphore2.release();
                    return iVar;
                } catch (Throwable th2) {
                    th = th2;
                    semaphore2.release();
                    throw th;
                }
            }
            Semaphore semaphore3 = dVar2.e;
            kotlin.a.e(obj);
            semaphore = semaphore3;
            androidx.room.coroutines.d dVar3 = new androidx.room.coroutines.d(this, 6);
            dVar2.e = semaphore;
            dVar2.A = 2;
            Object objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, dVar3, dVar2, 1, null);
            if (objRunInterruptible$default != aVar) {
                semaphore2 = semaphore;
                obj = objRunInterruptible$default;
                i iVar2 = (i) obj;
                semaphore2.release();
                return iVar2;
            }
            return aVar;
        } catch (Throwable th3) {
            semaphore2 = semaphore;
            th = th3;
            semaphore2.release();
            throw th;
        }
    }
}
