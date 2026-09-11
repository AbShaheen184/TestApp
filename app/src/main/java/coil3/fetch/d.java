package coil3.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil3.decode.s;
import coil3.request.n;
import coil3.util.m;
import java.nio.ByteBuffer;
import okio.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i {
    public final /* synthetic */ int a;
    public final n b;
    public final Object c;

    public /* synthetic */ d(Object obj, n nVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = nVar;
    }

    @Override // coil3.fetch.i
    public final Object a(coil3.intercept.d dVar) {
        int i = this.a;
        coil3.decode.h hVar = coil3.decode.h.y;
        Object obj = this.c;
        n nVar = this.b;
        switch (i) {
            case 0:
                okio.f fVar = new okio.f();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                fVar.write(bArr, 0, bArr.length);
                return new k(new s(fVar, nVar.f, null), null, hVar);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new k(new s(new b0(new e(byteBuffer)), nVar.f, new coil3.decode.f(byteBuffer)), null, hVar);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = m.a;
                boolean z = bitmapDrawable instanceof VectorDrawable;
                if (z) {
                    bitmapDrawable = new BitmapDrawable(nVar.a.getResources(), com.google.firebase.b.l(bitmapDrawable, coil3.request.i.a(nVar), nVar.b, nVar.c, (coil3.size.h) coil3.m.e(nVar, coil3.request.h.b), nVar.d == coil3.size.d.y));
                }
                return new j(coil3.m.c(bitmapDrawable), z, hVar);
        }
    }
}
