package coil3.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil3.decode.s;
import coil3.m;
import coil3.request.n;
import coil3.w;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.o;
import kotlin.jvm.internal.l;
import okio.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {
    public final w a;
    public final n b;

    public f(w wVar, n nVar) {
        this.a = wVar;
        this.b = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    @Override // coil3.fetch.i
    public final Object a(coil3.intercept.d dVar) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listG;
        int size;
        Bundle bundle;
        w wVar = this.a;
        Uri uri = Uri.parse(wVar.a);
        n nVar = this.b;
        ContentResolver contentResolver = nVar.a.getContentResolver();
        String str = wVar.d;
        if (l.a(str, "com.android.contacts") && l.a(o.T(m.g(wVar)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                androidx.transition.k.l(uri, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && l.a(str, "media") && (size = (listG = m.g(wVar)).size()) >= 3 && l.a(listG.get(size - 3), "audio") && l.a(listG.get(size - 2), "albums")) {
            coil3.size.h hVar = nVar.b;
            coil3.size.c cVar = hVar.a;
            coil3.size.a aVar = cVar instanceof coil3.size.a ? (coil3.size.a) cVar : null;
            if (aVar != null) {
                int i = aVar.a;
                coil3.size.c cVar2 = hVar.b;
                coil3.size.a aVar2 = cVar2 instanceof coil3.size.a ? (coil3.size.a) cVar2 : null;
                if (aVar2 != null) {
                    int i2 = aVar2.a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                androidx.transition.k.l(uri, "'.", "Unable to find a music thumbnail associated with '");
                return null;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                androidx.transition.k.l(uri, "'.", "Unable to open '");
                return null;
            }
        }
        return new k(new s(new b0(okio.b.e(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), nVar.f, new coil3.decode.g(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), coil3.decode.h.z);
    }
}
