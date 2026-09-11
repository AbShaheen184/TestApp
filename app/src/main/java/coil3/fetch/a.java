package coil3.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil3.q;
import coil3.request.n;
import coil3.util.m;
import coil3.w;
import java.nio.ByteBuffer;
import kotlin.collections.o;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // coil3.fetch.h
    public final i a(Object obj, n nVar, q qVar) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        switch (this.a) {
            case 0:
                w wVar = (w) obj;
                Bitmap.Config[] configArr = m.a;
                if (l.a(wVar.c, "file") && l.a(o.M(coil3.m.g(wVar)), "android_asset")) {
                    return new b(wVar, nVar, i);
                }
                return null;
            case 1:
                return new c((Bitmap) obj);
            case 2:
                return new d((byte[]) obj, nVar, i);
            case 3:
                return new d((ByteBuffer) obj, nVar, i2);
            case 4:
                w wVar2 = (w) obj;
                if (l.a(wVar2.c, "content")) {
                    return new f(wVar2, nVar);
                }
                return null;
            case 5:
                w wVar3 = (w) obj;
                if (l.a(wVar3.c, "data")) {
                    return new b(wVar3, nVar, i2);
                }
                return null;
            case 6:
                return new d((Drawable) obj, nVar, i3);
            case 7:
                w wVar4 = (w) obj;
                String str = wVar4.c;
                if ((str != null && !str.equals("file")) || wVar4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = m.a;
                if (l.a(wVar4.c, "file") && l.a(o.M(coil3.m.g(wVar4)), "android_asset")) {
                    return null;
                }
                return new b(wVar4, nVar, i3);
            case 8:
                w wVar5 = (w) obj;
                if (l.a(wVar5.c, "jar:file")) {
                    return new b(wVar5, nVar, 3);
                }
                return null;
            default:
                w wVar6 = (w) obj;
                if (l.a(wVar6.c, "android.resource")) {
                    return new b(wVar6, nVar, 4);
                }
                return null;
        }
    }
}
