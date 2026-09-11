package com.google.gson.internal.bind;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {
    public static final v0 A;
    public static final h B;
    public static final v0 a;
    public static final v0 b;
    public static final z0 c;
    public static final x0 d;
    public static final x0 e;
    public static final x0 f;
    public static final x0 g;
    public static final v0 h;
    public static final v0 i;
    public static final v0 j;
    public static final d0 k;
    public static final x0 l;
    public static final i0 m;
    public static final j0 n;
    public static final k0 o;
    public static final v0 p;
    public static final v0 q;
    public static final v0 r;
    public static final v0 s;
    public static final v0 t;
    public static final v0 u;
    public static final v0 v;
    public static final v0 w;
    public static final r x;
    public static final v0 y;
    public static final l z;

    static {
        int i2 = 0;
        a = new v0(Class.class, new m0().a(), i2);
        b = new v0(BitSet.class, new w0().a(), i2);
        y0 y0Var = new y0();
        c = new z0();
        d = new x0(Boolean.TYPE, Boolean.class, y0Var);
        e = new x0(Byte.TYPE, Byte.class, new a1());
        f = new x0(Short.TYPE, Short.class, new b1());
        g = new x0(Integer.TYPE, Integer.class, new c1());
        int i3 = 0;
        h = new v0(AtomicInteger.class, new d1().a(), i3);
        i = new v0(AtomicBoolean.class, new e1().a(), i3);
        j = new v0(AtomicIntegerArray.class, new c0().a(), i3);
        k = new d0();
        new e0();
        new f0();
        l = new x0(Character.TYPE, Character.class, new g0());
        h0 h0Var = new h0();
        m = new i0();
        n = new j0();
        o = new k0();
        int i4 = 0;
        p = new v0(String.class, h0Var, i4);
        q = new v0(StringBuilder.class, new l0(), i4);
        r = new v0(StringBuffer.class, new n0(), i4);
        s = new v0(URL.class, new o0(), i4);
        t = new v0(URI.class, new p0(), i4);
        u = new v0(InetAddress.class, new q0(), 1);
        int i5 = 0;
        v = new v0(UUID.class, new r0(), i5);
        w = new v0(Currency.class, new s0().a(), i5);
        x = new r(new t0(), 1);
        y = new v0(Locale.class, new u0(), 0);
        l lVar = l.a;
        z = lVar;
        A = new v0(com.google.gson.h.class, lVar, 1);
        B = i.d;
    }
}
