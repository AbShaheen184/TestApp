package androidx.media3.exoplayer.image;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.decoder.h;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    public final Context n;
    public final int o;

    public b(Context context) {
        super(new androidx.media3.decoder.e[1], new a[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // androidx.media3.decoder.h
    public final androidx.media3.decoder.e f() {
        return new androidx.media3.decoder.e(1);
    }

    @Override // androidx.media3.decoder.h
    public final androidx.media3.decoder.f g() {
        return new a(this);
    }

    @Override // androidx.media3.decoder.h
    public final androidx.media3.decoder.c h(Throwable th) {
        return new c("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.h
    public final androidx.media3.decoder.c i(androidx.media3.decoder.e eVar, androidx.media3.decoder.f fVar, boolean z) {
        a aVar = (a) fVar;
        ByteBuffer byteBuffer = eVar.B;
        byteBuffer.getClass();
        com.google.android.material.motion.a.q(byteBuffer.hasArray());
        com.google.android.material.motion.a.f(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointY = j0.y(context);
                    int i = pointY.x;
                    int i2 = pointY.y;
                    r rVar = eVar.z;
                    if (rVar != null) {
                        int i3 = rVar.N;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = rVar.O;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            aVar.B = okhttp3.internal.platform.android.g.l(byteBuffer.array(), byteBuffer.remaining(), iMax);
            aVar.z = eVar.D;
            return null;
        } catch (androidx.media3.common.j0 e) {
            return new c("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new c(e2);
        }
    }
}
