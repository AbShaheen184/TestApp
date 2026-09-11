package androidx.media3.exoplayer.dash.manifest;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.s0;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.w0;
import com.google.android.gms.measurement.internal.e2;
import com.google.android.gms.measurement.internal.l1;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.q4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.v0;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements androidx.media3.exoplayer.dash.j, androidx.media3.exoplayer.mediacodec.m, androidx.media3.exoplayer.text.d, androidx.media3.extractor.text.l, w0, androidx.sqlite.b, com.google.android.gms.tasks.d, com.google.android.gms.common.internal.d, com.google.android.gms.common.internal.b, q4, com.google.android.gms.tasks.f, androidx.core.view.accessibility.n {
    public static t z;
    public final /* synthetic */ int e;
    public Object y;

    public t(int i) {
        this.e = i;
        switch (i) {
            case 3:
                this.y = new SparseArray();
                break;
            case 5:
                this.y = new com.google.android.gms.common.internal.k(20);
                break;
            case 9:
                this.y = new w();
                break;
            case 14:
                break;
            case 23:
                this.y = new EnumMap(e2.class);
                break;
            case 28:
                this.y = new com.google.android.gms.tasks.q();
                break;
            default:
                this.y = new androidx.media3.exoplayer.hls.e(5, 1.0f, false, 0);
                break;
        }
    }

    public static t I() {
        if (z == null) {
            z = new t(new androidx.media3.container.a("HmacSHA256", false), 13);
        }
        return z;
    }

    public static void N(String str, coil3.util.h hVar, String str2, Throwable th) {
        if (str2 != null) {
            coil3.util.m.c(hVar, str, str2);
        }
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            string.getClass();
            coil3.util.m.c(hVar, str, string);
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public int A(View view) {
        return view.getBottom() + ((d0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long B(long j) {
        return 1L;
    }

    @Override // androidx.sqlite.b
    public boolean C() {
        return true;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long D(long j, long j2) {
        return 1L;
    }

    public void E(String str) {
        ((SharedPreferences) this.y).edit().putString("apiKey", str).apply();
    }

    public byte[] G(byte[] bArr, byte[] bArr2, int i) {
        androidx.media3.container.a aVar = (androidx.media3.container.a) this.y;
        SecretKeySpec secretKeySpec = (bArr == null || bArr.length <= 0) ? null : new SecretKeySpec(bArr, aVar.e);
        if (i <= 0) {
            net.luminis.tls.engine.impl.c.o("out length bytes must be at least 1");
            return null;
        }
        if (secretKeySpec == null) {
            net.luminis.tls.engine.impl.c.o("provided pseudoRandomKey must not be null");
            return null;
        }
        try {
            Mac macC = aVar.c();
            macC.init(secretKeySpec);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArrDoFinal = new byte[0];
            int iCeil = (int) Math.ceil(((double) i) / ((double) macC.getMacLength()));
            if (iCeil > 255) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.p("out length must be maximal 255 * hash-length; requested: ", i, " bytes"));
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            int i2 = 0;
            while (i2 < iCeil) {
                macC.update(bArrDoFinal);
                macC.update(bArr2);
                i2++;
                macC.update((byte) i2);
                bArrDoFinal = macC.doFinal();
                int iMin = Math.min(i, bArrDoFinal.length);
                byteBufferAllocate.put(bArrDoFinal, 0, iMin);
                i -= iMin;
            }
            return byteBufferAllocate.array();
        } catch (Exception e) {
            throw new IllegalStateException("could not make hmac hasher in hkdf", e);
        }
    }

    public byte[] H(byte[] bArr, byte[] bArr2) {
        androidx.media3.container.a aVar = (androidx.media3.container.a) this.y;
        String str = aVar.e;
        SecretKeySpec secretKeySpec = bArr.length <= 0 ? null : new SecretKeySpec(bArr, str);
        if (secretKeySpec == null) {
            int macLength = aVar.c().getMacLength();
            secretKeySpec = macLength > 0 ? new SecretKeySpec(new byte[macLength], str) : null;
        }
        if (bArr2 == null || bArr2.length <= 0) {
            net.luminis.tls.engine.impl.c.o("provided inputKeyingMaterial must be at least of size 1 and not null");
            return null;
        }
        try {
            Mac macC = aVar.c();
            macC.init(secretKeySpec);
            return macC.doFinal(bArr2);
        } catch (Exception e) {
            throw new IllegalStateException("could not make hmac hasher in hkdf", e);
        }
    }

    public androidx.media3.exoplayer.drm.h J() {
        return null;
    }

    public androidx.media3.exoplayer.drm.b K() {
        return (androidx.media3.exoplayer.drm.b) this.y;
    }

    public UUID L() {
        return androidx.media3.common.g.a;
    }

    public int M() {
        return 1;
    }

    public void P(int i, String str, List list, boolean z2, boolean z3) {
        v0 v0Var;
        l1 l1Var = (l1) this.y;
        int i2 = i - 1;
        if (i2 == 0) {
            x0 x0Var = ((s1) l1Var.e).C;
            s1.m(x0Var);
            v0Var = x0Var.J;
        } else if (i2 != 1) {
            if (i2 == 3) {
                x0 x0Var2 = ((s1) l1Var.e).C;
                s1.m(x0Var2);
                v0Var = x0Var2.K;
            } else if (i2 != 4) {
                x0 x0Var3 = ((s1) l1Var.e).C;
                s1.m(x0Var3);
                v0Var = x0Var3.I;
            } else if (z2) {
                x0 x0Var4 = ((s1) l1Var.e).C;
                s1.m(x0Var4);
                v0Var = x0Var4.G;
            } else if (z3) {
                x0 x0Var5 = ((s1) l1Var.e).C;
                s1.m(x0Var5);
                v0Var = x0Var5.F;
            } else {
                x0 x0Var6 = ((s1) l1Var.e).C;
                s1.m(x0Var6);
                v0Var = x0Var6.H;
            }
        } else if (z2) {
            x0 x0Var7 = ((s1) l1Var.e).C;
            s1.m(x0Var7);
            v0Var = x0Var7.D;
        } else if (z3) {
            x0 x0Var8 = ((s1) l1Var.e).C;
            s1.m(x0Var8);
            v0Var = x0Var8.C;
        } else {
            x0 x0Var9 = ((s1) l1Var.e).C;
            s1.m(x0Var9);
            v0Var = x0Var9.E;
        }
        int size = list.size();
        if (size == 1) {
            v0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            v0Var.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            v0Var.a(str);
        } else {
            v0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void Q(e2 e2Var, int i) {
        com.google.android.gms.measurement.internal.h hVar;
        if (i == -30) {
            hVar = com.google.android.gms.measurement.internal.h.TCF;
        } else if (i == -20) {
            hVar = com.google.android.gms.measurement.internal.h.API;
        } else if (i == -10) {
            hVar = com.google.android.gms.measurement.internal.h.MANIFEST;
        } else if (i != 0) {
            hVar = i != 30 ? com.google.android.gms.measurement.internal.h.UNSET : com.google.android.gms.measurement.internal.h.INITIALIZATION;
        } else {
            hVar = com.google.android.gms.measurement.internal.h.API;
        }
        ((EnumMap) this.y).put(e2Var, hVar);
    }

    public void R(e2 e2Var, com.google.android.gms.measurement.internal.h hVar) {
        ((EnumMap) this.y).put(e2Var, hVar);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long a(long j) {
        return 0L;
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        ((com.google.android.gms.tasks.j) ((androidx.media3.exoplayer.hls.c) this.y).e).a.n();
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void c(int i, androidx.media3.decoder.a aVar, long j, int i2) {
        ((MediaCodec) this.y).queueSecureInputBuffer(i, 0, aVar.i, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void d(Bundle bundle) {
        ((MediaCodec) this.y).setParameters(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.q4
    public void e(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        l4 l4Var = (l4) this.y;
        if (!zIsEmpty) {
            l4Var.e().E(new androidx.appcompat.view.menu.e(this, str, str2, bundle, 10));
            return;
        }
        s1 s1Var = l4Var.I;
        if (s1Var != null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.b(str2, "AppId not known when logging event");
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void f(int i, int i2, int i3, long j) {
        ((MediaCodec) this.y).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.android.gms.common.internal.b
    public void g(int i) {
        ((com.google.android.gms.common.api.g) this.y).g(i);
    }

    @Override // com.google.android.gms.common.internal.b
    public void h() {
        ((com.google.android.gms.common.api.g) this.y).h();
    }

    @Override // com.google.android.gms.common.internal.d
    public void i(com.google.android.gms.common.b bVar) {
        boolean z2 = bVar.y == 0;
        com.google.android.gms.common.internal.e eVar = (com.google.android.gms.common.internal.e) this.y;
        if (z2) {
            eVar.b(null, eVar.s());
            return;
        }
        com.google.android.gms.common.internal.c cVar = eVar.M;
        if (cVar != null) {
            cVar.d(bVar);
        }
    }

    @Override // androidx.core.view.accessibility.n
    public boolean j(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.y;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        int width = (!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth();
        Field field = s0.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // androidx.media3.extractor.text.l
    public void k(byte[] bArr, int i, int i2, androidx.media3.extractor.text.k kVar, androidx.media3.common.util.i iVar) {
        androidx.media3.common.text.b bVarA;
        w wVar = (w) this.y;
        wVar.K(bArr, i + i2);
        wVar.M(i);
        ArrayList arrayList = new ArrayList();
        while (wVar.a() > 0) {
            com.google.android.material.motion.a.e("Incomplete Mp4Webvtt Top Level box header found.", wVar.a() >= 8);
            int iM = wVar.m();
            if (wVar.m() == 1987343459) {
                int i3 = iM - 8;
                CharSequence charSequenceF = null;
                androidx.media3.common.text.a aVarA = null;
                while (i3 > 0) {
                    com.google.android.material.motion.a.e("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM2 = wVar.m();
                    int iM3 = wVar.m();
                    int i4 = iM2 - 8;
                    byte[] bArr2 = wVar.a;
                    int i5 = wVar.b;
                    String str = j0.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    wVar.N(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM3 == 1937011815) {
                        androidx.media3.extractor.text.webvtt.g gVar = new androidx.media3.extractor.text.webvtt.g();
                        androidx.media3.extractor.text.webvtt.h.e(str2, gVar);
                        aVarA = gVar.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = androidx.media3.extractor.text.webvtt.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.a = charSequenceF;
                    aVarA.b = null;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = androidx.media3.extractor.text.webvtt.h.a;
                    androidx.media3.extractor.text.webvtt.g gVar2 = new androidx.media3.extractor.text.webvtt.g();
                    gVar2.c = charSequenceF;
                    bVarA = gVar2.a().a();
                }
                arrayList.add(bVarA);
            } else {
                wVar.N(iM - 8);
            }
        }
        iVar.accept(new androidx.media3.extractor.text.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long m(long j, long j2) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.w0
    public int n(View view) {
        return (view.getTop() - ((d0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).topMargin;
    }

    @Override // com.google.android.gms.tasks.d
    public void onComplete(com.google.android.gms.tasks.i iVar) {
        ((CountDownLatch) this.y).countDown();
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long p(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public j q(long j) {
        return (j) this.y;
    }

    @Override // androidx.recyclerview.widget.w0
    public int r() {
        return ((c0) this.y).F();
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long s(long j, long j2) {
        return 0L;
    }

    @Override // androidx.sqlite.b
    public androidx.sqlite.a t(String str) {
        str.getClass();
        androidx.sqlite.db.a aVar = (androidx.sqlite.db.a) this.y;
        String databaseName = aVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.q("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !kotlin.text.k.r0('/', databaseName, databaseName).equals(kotlin.text.k.r0('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + aVar.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new androidx.sqlite.driver.a(aVar.y());
    }

    public String toString() {
        switch (this.e) {
            case 23:
                StringBuilder sb = new StringBuilder("1");
                for (e2 e2Var : e2.values()) {
                    com.google.android.gms.measurement.internal.h hVar = (com.google.android.gms.measurement.internal.h) ((EnumMap) this.y).get(e2Var);
                    if (hVar == null) {
                        hVar = com.google.android.gms.measurement.internal.h.UNSET;
                    }
                    sb.append(hVar.e);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public int u() {
        c0 c0Var = (c0) this.y;
        return c0Var.n - c0Var.C();
    }

    @Override // androidx.media3.exoplayer.dash.j
    public boolean w() {
        return true;
    }

    @Override // androidx.recyclerview.widget.w0
    public View x(int i) {
        return ((c0) this.y).t(i);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long y() {
        return 0L;
    }

    @Override // androidx.media3.extractor.text.l
    public int z() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void start() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void v() {
    }

    public void F(androidx.media3.exoplayer.drm.d dVar) {
    }

    public void O(androidx.media3.exoplayer.drm.d dVar) {
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long l(long j, long j2) {
        return j2;
    }

    public /* synthetic */ t(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public t(Context context) {
        this.e = 18;
        this.y = context.getSharedPreferences("fg-storage", 0);
    }

    public t(t tVar, androidx.media3.exoplayer.hls.c cVar) {
        this.e = 27;
        this.y = cVar;
        Objects.requireNonNull(tVar);
    }

    public t(com.google.android.gms.common.internal.e eVar) {
        this.e = 21;
        Objects.requireNonNull(eVar);
        this.y = eVar;
    }

    public t(EnumMap enumMap) {
        this.e = 23;
        EnumMap enumMap2 = new EnumMap(e2.class);
        this.y = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public t(androidx.sqlite.db.a aVar) {
        this.e = 12;
        aVar.getClass();
        this.y = aVar;
    }

    public t(androidx.compose.material.ripple.g gVar, com.google.android.gms.common.api.internal.f fVar) {
        this.e = 20;
        this.y = gVar;
    }

    public t(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.e = 8;
        this.y = uuid;
    }
}
