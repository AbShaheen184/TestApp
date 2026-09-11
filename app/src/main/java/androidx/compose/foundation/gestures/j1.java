package androidx.compose.foundation.gestures;

import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Serializable d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable] */
    public j1(AssetManager assetManager, Executor executor, androidx.profileinstaller.b bVar, String str, File file) {
        ?? r1;
        this.a = false;
        this.b = executor;
        this.c = bVar;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    r1 = androidx.profileinstaller.c.h;
                    break;
                case 26:
                    r1 = androidx.profileinstaller.c.g;
                    break;
                case 27:
                    r1 = androidx.profileinstaller.c.f;
                    break;
                case 28:
                case 29:
                case 30:
                    r1 = androidx.profileinstaller.c.e;
                    break;
                default:
                    r1 = 0;
                    break;
            }
        } else {
            r1 = androidx.profileinstaller.c.d;
        }
        this.d = r1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public static final Object a(j1 j1Var, m2 m2Var, c1 c1Var, float f, float f2, kotlin.coroutines.jvm.internal.c cVar) {
        f1 f1Var;
        kotlin.jvm.internal.w wVar;
        float f3;
        m2 m2Var2;
        j1Var.getClass();
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i = f1Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1Var.C = i - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(j1Var, cVar);
            }
        } else {
            f1Var = new f1(j1Var, cVar);
        }
        f1 f1Var2 = f1Var;
        Object obj = f1Var2.A;
        int i2 = f1Var2.C;
        Object obj2 = kotlin.y.a;
        Object obj3 = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
            zVar.e = c1Var;
            j1Var.h(c1Var);
            c1 c1VarG = g((Channel) j1Var.f);
            if (c1VarG != null) {
                j1Var.h(c1VarG);
                zVar.e = ((c1) zVar.e).a(c1VarG);
            }
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            float fG = m2Var.g(m2Var.e(((c1) zVar.e).a));
            wVar2.e = fG;
            if (!b1.a(fG)) {
                kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                zVar2.e = androidx.compose.animation.core.e.b(30, 0.0f);
                g1 g1Var = new g1(wVar2, zVar2, zVar, f, j1Var, f2, m2Var, null);
                f1Var2.e = m2Var;
                f1Var2.y = wVar2;
                f1Var2.z = f2;
                f1Var2.C = 1;
                if (j1Var.i(m2Var, g1Var, f1Var2) != obj3) {
                    wVar = wVar2;
                    f3 = f2;
                    m2Var2 = m2Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(obj);
                return obj2;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = f1Var2.z;
        wVar = f1Var2.y;
        m2Var2 = f1Var2.e;
        kotlin.a.e(obj);
        androidx.compose.foundation.text.input.internal.o oVar = (androidx.compose.foundation.text.input.internal.o) j1Var.h;
        long jD = com.google.android.gms.dynamite.g.d(((androidx.compose.ui.input.pointer.util.e) oVar.y).b(Float.MAX_VALUE), ((androidx.compose.ui.input.pointer.util.e) oVar.z).b(Float.MAX_VALUE));
        if (jD == 0) {
            float fD = m2Var2.d(Math.signum(wVar.e)) * Math.min(Math.abs(wVar.e) / 100, f3) * 1000;
            if (fD == 0.0f) {
                jD = 0;
            } else {
                jD = m2Var2.d == k1.y ? com.google.android.gms.dynamite.g.d(fD, 0.0f) : com.google.android.gms.dynamite.g.d(0.0f, fD);
            }
        }
        b2 b2Var = (b2) j1Var.d;
        f1Var2.e = null;
        f1Var2.y = null;
        f1Var2.C = 2;
        f2 f2Var = (f2) b2Var.e;
        BuildersKt__Builders_commonKt.launch$default(f2Var.h0.c(), null, null, new d2(f2Var, jD, null, 1), 3, null);
        return obj2 == obj3 ? obj3 : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object b(j1 j1Var, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.w wVar, m2 m2Var, kotlin.jvm.internal.z zVar2, long j, kotlin.coroutines.jvm.internal.c cVar) {
        h1 h1Var;
        kotlin.jvm.internal.w wVar2;
        m2 m2Var2;
        kotlin.jvm.internal.z zVar3;
        boolean z;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i = h1Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1Var.D = i - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(cVar);
            }
        } else {
            h1Var = new h1(cVar);
        }
        Object objWithTimeoutOrNull = h1Var.C;
        int i2 = h1Var.D;
        if (i2 == 0) {
            kotlin.a.e(objWithTimeoutOrNull);
            if (j < 0) {
                return Boolean.FALSE;
            }
            androidx.compose.animation.core.c1 c1Var = new androidx.compose.animation.core.c1(j1Var, null, 5);
            h1Var.e = j1Var;
            h1Var.y = zVar;
            h1Var.z = wVar;
            h1Var.A = m2Var;
            h1Var.B = zVar2;
            h1Var.D = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, c1Var, h1Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objWithTimeoutOrNull == aVar) {
                return aVar;
            }
            wVar2 = wVar;
            m2Var2 = m2Var;
            zVar3 = zVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.jvm.internal.z zVar4 = h1Var.B;
            m2 m2Var3 = h1Var.A;
            wVar2 = h1Var.z;
            kotlin.jvm.internal.z zVar5 = h1Var.y;
            j1 j1Var2 = h1Var.e;
            kotlin.a.e(objWithTimeoutOrNull);
            zVar3 = zVar4;
            m2Var2 = m2Var3;
            zVar = zVar5;
            j1Var = j1Var2;
        }
        c1 c1Var2 = (c1) objWithTimeoutOrNull;
        if (c1Var2 != null) {
            boolean z2 = ((c1) zVar.e).c;
            long j2 = c1Var2.a;
            zVar.e = new c1(j2, c1Var2.b, z2);
            wVar2.e = m2Var2.i(m2Var2.e(j2));
            zVar3.e = androidx.compose.animation.core.e.b(30, 0.0f);
            j1Var.h(c1Var2);
            z = !b1.a(wVar2.e);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static c1 g(Channel channel) {
        c1 c1Var = null;
        kotlin.sequences.i iVarG = com.google.android.material.resources.g.g(new o0((Object) new androidx.activity.w(channel, 5), (kotlin.coroutines.d) (0 == true ? 1 : 0), 1));
        while (iVarG.hasNext()) {
            c1 c1VarA = (c1) iVarG.next();
            if (c1Var != null) {
                c1VarA = c1Var.a(c1VarA);
            }
            c1Var = c1VarA;
        }
        return c1Var;
    }

    public float c(l2 l2Var, float f) {
        m2 m2Var = (m2) this.b;
        long jH = m2Var.h(m2Var.d(f));
        m2 m2Var2 = l2Var.a;
        return m2Var.g(m2Var.e(m2Var2.c(m2Var2.k, jH, 1)));
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public boolean d(androidx.compose.ui.input.pointer.m mVar) {
        long j;
        com.google.firebase.platforminfo.c cVar = (com.google.firebase.platforminfo.c) this.c;
        androidx.compose.ui.unit.c cVar2 = (androidx.compose.ui.unit.c) this.e;
        ViewConfiguration viewConfiguration = (ViewConfiguration) cVar.e;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? androidx.media3.common.audio.h.p(viewConfiguration) : cVar2.V(64));
        float f2 = -(i > 26 ? androidx.media3.common.audio.h.m(viewConfiguration) : cVar2.V(64));
        ?? r1 = mVar.a;
        androidx.compose.ui.geometry.b bVar = new androidx.compose.ui.geometry.b(0L);
        int size = r1.size();
        boolean zD = false;
        int i2 = 0;
        while (true) {
            j = bVar.a;
            if (i2 >= size) {
                break;
            }
            bVar = new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(j, ((androidx.compose.ui.input.pointer.v) r1.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        m2 m2Var = (m2) this.b;
        float fI = m2Var.i(m2Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            g2 g2Var = m2Var.a;
            zD = fI > 0.0f ? g2Var.d() : g2Var.b();
        }
        return zD ? ChannelResult.m52isSuccessimpl(((Channel) this.f).mo28trySendJP2dKIU(new c1(jFloatToRawIntBits, ((androidx.compose.ui.input.pointer.v) kotlin.collections.o.K(mVar.a)).b, false))) : this.a;
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((androidx.profileinstaller.b) this.c).i();
            return null;
        }
    }

    public void f(int i, Serializable serializable) {
        ((Executor) this.b).execute(new androidx.activity.n(this, i, serializable, 3));
    }

    public void h(c1 c1Var) {
        androidx.compose.foundation.text.input.internal.o oVar = (androidx.compose.foundation.text.input.internal.o) this.h;
        long j = c1Var.b;
        long j2 = c1Var.a;
        ((androidx.compose.ui.input.pointer.util.e) oVar.y).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((androidx.compose.ui.input.pointer.util.e) oVar.z).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(m2 m2Var, g1 g1Var, kotlin.coroutines.jvm.internal.c cVar) {
        i1 i1Var;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i = i1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                i1Var.z = i - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object obj = i1Var.e;
        int i2 = i1Var.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            this.a = true;
            androidx.activity.compose.p pVar = new androidx.activity.compose.p(m2Var, g1Var, null, 4);
            i1Var.z = 1;
            Object objSupervisorScope = SupervisorKt.supervisorScope(pVar, i1Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objSupervisorScope == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        this.a = false;
        return kotlin.y.a;
    }

    public j1(m2 m2Var, com.google.firebase.platforminfo.c cVar, b2 b2Var, androidx.compose.ui.unit.c cVar2) {
        this.b = m2Var;
        this.c = cVar;
        this.d = b2Var;
        this.e = cVar2;
        this.f = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.h = new androidx.compose.foundation.text.input.internal.o(4);
    }
}
