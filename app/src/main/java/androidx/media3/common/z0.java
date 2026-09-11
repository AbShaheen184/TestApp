package androidx.media3.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class z0 {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public boolean h = true;
    public com.google.common.collect.h0 i;
    public com.google.common.collect.h0 j;
    public com.google.common.collect.h0 k;
    public com.google.common.collect.h0 l;
    public com.google.common.collect.h0 m;
    public int n;
    public int o;
    public com.google.common.collect.h0 p;
    public y0 q;
    public com.google.common.collect.h0 r;
    public boolean s;
    public com.google.common.collect.h0 t;
    public int u;
    public HashMap v;
    public HashSet w;

    public z0() {
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        this.i = a1Var;
        this.j = a1Var;
        this.k = a1Var;
        this.l = a1Var;
        this.m = a1Var;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.p = a1Var;
        this.q = y0.a;
        this.r = a1Var;
        this.s = true;
        this.t = a1Var;
        this.u = 0;
        this.v = new HashMap();
        this.w = new HashSet();
    }

    public a1 a() {
        return new a1(this);
    }

    public z0 b(int i) {
        Iterator it = this.v.values().iterator();
        while (it.hasNext()) {
            if (((x0) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void c(a1 a1Var) {
        this.a = a1Var.a;
        this.b = a1Var.b;
        this.c = a1Var.c;
        this.d = a1Var.d;
        this.e = a1Var.e;
        this.f = a1Var.f;
        this.g = a1Var.g;
        this.h = a1Var.h;
        this.j = a1Var.j;
        this.i = a1Var.i;
        this.k = a1Var.k;
        this.l = a1Var.l;
        this.m = a1Var.m;
        this.n = a1Var.n;
        this.o = a1Var.o;
        this.p = a1Var.p;
        this.q = a1Var.q;
        this.r = a1Var.r;
        this.s = a1Var.t;
        this.t = a1Var.s;
        this.u = a1Var.u;
        this.w = new HashSet(a1Var.w);
        this.v = new HashMap(a1Var.v);
    }

    public z0 d() {
        this.u = -3;
        return this;
    }

    public z0 e(x0 x0Var) {
        w0 w0Var = x0Var.a;
        b(w0Var.c);
        this.v.put(w0Var, x0Var);
        return this;
    }

    public z0 f(String str) {
        return str == null ? g(new String[0]) : g(str);
    }

    public z0 g(String... strArr) {
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        for (String str : strArr) {
            str.getClass();
            d0VarK.b(androidx.media3.common.util.j0.R(str));
        }
        this.r = d0VarK.g();
        this.s = false;
        return this;
    }

    public z0 h() {
        this.s = false;
        return this;
    }

    public z0 i(int i, boolean z) {
        HashSet hashSet = this.w;
        if (z) {
            hashSet.add(Integer.valueOf(i));
            return this;
        }
        hashSet.remove(Integer.valueOf(i));
        return this;
    }
}
