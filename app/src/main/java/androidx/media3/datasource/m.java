package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {
    public p A;
    public b B;
    public e C;
    public h D;
    public b0 E;
    public f F;
    public x G;
    public h H;
    public final Context e;
    public final ArrayList y;
    public final h z;

    public m(Context context, h hVar) {
        this.e = context.getApplicationContext();
        hVar.getClass();
        this.z = hVar;
        this.y = new ArrayList();
    }

    public static void g(h hVar, androidx.media3.exoplayer.upstream.f fVar) {
        if (hVar != null) {
            hVar.c(fVar);
        }
    }

    public final void a(h hVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i >= arrayList.size()) {
                return;
            }
            hVar.c((androidx.media3.exoplayer.upstream.f) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
        fVar.getClass();
        this.z.c(fVar);
        this.y.add(fVar);
        g(this.A, fVar);
        g(this.B, fVar);
        g(this.C, fVar);
        g(this.D, fVar);
        g(this.E, fVar);
        g(this.F, fVar);
        g(this.G, fVar);
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
        h hVar = this.H;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.H = null;
            }
        }
    }

    @Override // androidx.media3.datasource.h
    public final Map k() {
        h hVar = this.H;
        return hVar == null ? Collections.EMPTY_MAP : hVar.k();
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) {
        h hVar = this.H;
        hVar.getClass();
        return hVar.read(bArr, i, i2);
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) {
        com.google.android.material.motion.a.q(this.H == null);
        Uri uri = lVar.a;
        String scheme = uri.getScheme();
        String str = j0.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.e;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.A == null) {
                    p pVar = new p(false);
                    this.A = pVar;
                    a(pVar);
                }
                this.H = this.A;
            } else {
                if (this.B == null) {
                    b bVar = new b(context);
                    this.B = bVar;
                    a(bVar);
                }
                this.H = this.B;
            }
        } else if ("asset".equals(scheme)) {
            if (this.B == null) {
                b bVar2 = new b(context);
                this.B = bVar2;
                a(bVar2);
            }
            this.H = this.B;
        } else if ("content".equals(scheme)) {
            if (this.C == null) {
                e eVar = new e(context);
                this.C = eVar;
                a(eVar);
            }
            this.H = this.C;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.z;
            if (zEquals) {
                if (this.D == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.D = hVar2;
                        a(hVar2);
                    } catch (ClassNotFoundException unused) {
                        androidx.media3.common.util.c.t("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        androidx.media3.exoplayer.hls.playlist.a.j("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.D == null) {
                        this.D = hVar;
                    }
                }
                this.H = this.D;
            } else if ("udp".equals(scheme)) {
                if (this.E == null) {
                    b0 b0Var = new b0();
                    this.E = b0Var;
                    a(b0Var);
                }
                this.H = this.E;
            } else if ("data".equals(scheme)) {
                if (this.F == null) {
                    f fVar = new f(false);
                    this.F = fVar;
                    a(fVar);
                }
                this.H = this.F;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.G == null) {
                    x xVar = new x(context);
                    this.G = xVar;
                    a(xVar);
                }
                this.H = this.G;
            } else {
                this.H = hVar;
            }
        }
        return this.H.t(lVar);
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        h hVar = this.H;
        if (hVar == null) {
            return null;
        }
        return hVar.v();
    }
}
