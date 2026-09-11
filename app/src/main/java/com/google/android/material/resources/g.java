package com.google.android.material.resources;

import android.graphics.Typeface;
import com.google.common.util.concurrent.d0;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.h0;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import kotlin.collections.n;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.sequences.i;
import kotlin.text.k;
import kotlinx.serialization.descriptors.h;
import okhttp3.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static kotlinx.serialization.descriptors.f a(String str, com.google.android.material.shape.e eVar, kotlinx.serialization.descriptors.e[] eVarArr) {
        if (k.d0(str)) {
            net.luminis.tls.engine.impl.c.o("Blank serial names are prohibited");
            return null;
        }
        if (eVar.equals(h.y)) {
            net.luminis.tls.engine.impl.c.o("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        kotlinx.serialization.descriptors.a aVar = new kotlinx.serialization.descriptors.a(str);
        return new kotlinx.serialization.descriptors.f(str, eVar, aVar.b.size(), n.V(eVarArr), aVar);
    }

    public static final kotlin.k b(u uVar) {
        Charset charset = kotlin.text.a.a;
        if (uVar != null) {
            Charset charsetA = u.a(uVar);
            if (charsetA == null) {
                try {
                    uVar = c.h(uVar + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    uVar = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return new kotlin.k(charset, uVar);
    }

    public static org.jsoup.helper.f c(String str) {
        org.jsoup.helper.f fVar = new org.jsoup.helper.f();
        org.jsoup.helper.d dVar = new org.jsoup.helper.d();
        fVar.a = dVar;
        org.jsoup.helper.n.G(str, "url");
        try {
            dVar.a = new g0(new URL(str)).n();
            return fVar;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(androidx.privacysandbox.ads.adservices.java.internal.a.q("The supplied URL, '", str, "', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls"), e);
        }
    }

    public static Object d(kotlin.coroutines.g gVar, Object obj, p pVar) {
        pVar.getClass();
        return pVar.invoke(obj, gVar);
    }

    public static Object e(Object obj, Class cls) {
        if (obj instanceof dagger.hilt.internal.a) {
            return cls.cast(obj);
        }
        if (obj instanceof dagger.hilt.internal.b) {
            return e(((dagger.hilt.internal.b) obj).a(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + dagger.hilt.internal.a.class + " or " + dagger.hilt.internal.b.class);
    }

    public static kotlin.coroutines.g f(kotlin.coroutines.g gVar, kotlin.coroutines.h hVar) {
        hVar.getClass();
        if (l.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static i g(p pVar) {
        i iVar = new i();
        iVar.A = com.google.android.material.shape.e.b(pVar, iVar, iVar);
        return iVar;
    }

    public static kotlin.coroutines.i h(kotlin.coroutines.g gVar, kotlin.coroutines.h hVar) {
        hVar.getClass();
        return l.a(gVar.getKey(), hVar) ? j.e : gVar;
    }

    public static kotlin.coroutines.i k(kotlin.coroutines.i iVar, kotlin.coroutines.g gVar) {
        iVar.getClass();
        return iVar == j.e ? gVar : (kotlin.coroutines.i) iVar.fold(gVar, new com.app.mlounge.ui.screens.watchlist.c(2));
    }

    public static Executor m(Executor executor, h0 h0Var) {
        executor.getClass();
        return executor == d0.e ? executor : new androidx.media3.exoplayer.util.a(executor, h0Var, 1);
    }

    public abstract void i(int i);

    public abstract void j(Typeface typeface, boolean z);

    public abstract long l();
}
