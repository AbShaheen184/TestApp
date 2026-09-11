package com.google.android.material.shape;

import android.view.View;
import android.view.ViewParent;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlinx.serialization.internal.q0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.a {
    public static Thread a;

    public static final kotlin.text.g C(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new kotlin.text.g(matcher, charSequence);
        }
        return null;
    }

    public static void D(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.gson.b.h(str);
    }

    public static org.jsoup.select.e E(org.jsoup.select.p pVar, org.jsoup.nodes.j jVar) {
        Stream streamFilter;
        if (pVar.f()) {
            pVar.e();
            jVar.getClass();
            streamFilter = e.j(jVar, org.jsoup.nodes.j.class).filter(new org.jsoup.select.f(pVar, jVar, 0));
        } else {
            pVar.e();
            jVar.getClass();
            streamFilter = e.j(jVar, org.jsoup.nodes.j.class).filter(new org.jsoup.select.f(pVar, jVar, 1));
        }
        org.jsoup.select.e eVar = (org.jsoup.select.e) streamFilter.collect(Collectors.toCollection(new org.jsoup.internal.c(6)));
        pVar.e();
        return eVar;
    }

    public static e F(int i) {
        if (i != 0) {
            return i != 1 ? new m(0) : new f(0);
        }
        return new m(0);
    }

    public static void G(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        net.luminis.tls.engine.impl.c.u(file, "Unable to create parent directories of ");
    }

    public static final kotlin.enums.b I(Enum[] enumArr) {
        enumArr.getClass();
        return new kotlin.enums.b(enumArr);
    }

    public static void L(View view, j jVar) {
        com.google.android.material.elevation.a aVar = jVar.y.c;
        if (aVar == null || !aVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        h hVar = jVar.y;
        if (hVar.m != elevation) {
            hVar.m = elevation;
            jVar.s();
        }
    }

    @Override // kotlinx.serialization.encoding.b
    public float A() {
        H();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.b
    public double B() {
        H();
        throw null;
    }

    public void H() {
        throw new kotlinx.serialization.d(kotlin.jvm.internal.a0.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract Object J(kotlin.jvm.internal.e eVar);

    public abstract k K(kotlin.jvm.internal.e eVar, Object obj);

    @Override // kotlinx.serialization.encoding.a
    public short a(q0 q0Var, int i) {
        q0Var.getClass();
        return z();
    }

    @Override // kotlinx.serialization.encoding.a
    public float b(q0 q0Var, int i) {
        q0Var.getClass();
        return A();
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean c() {
        H();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a
    public char d(q0 q0Var, int i) {
        q0Var.getClass();
        return e();
    }

    @Override // kotlinx.serialization.encoding.b
    public char e() {
        H();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a
    public long f(kotlinx.serialization.descriptors.e eVar, int i) {
        eVar.getClass();
        return o();
    }

    @Override // kotlinx.serialization.encoding.a
    public byte g(q0 q0Var, int i) {
        q0Var.getClass();
        return y();
    }

    @Override // kotlinx.serialization.encoding.a
    public void h(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
    }

    @Override // kotlinx.serialization.encoding.a
    public boolean i(q0 q0Var, int i) {
        q0Var.getClass();
        return c();
    }

    @Override // kotlinx.serialization.encoding.b
    public abstract int j();

    @Override // kotlinx.serialization.encoding.a
    public int k(kotlinx.serialization.descriptors.e eVar, int i) {
        eVar.getClass();
        return j();
    }

    @Override // kotlinx.serialization.encoding.b
    public String m() {
        H();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.b
    public kotlinx.serialization.encoding.a n(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.b
    public abstract long o();

    @Override // kotlinx.serialization.encoding.b
    public Object p(kotlinx.serialization.a aVar) {
        aVar.getClass();
        return aVar.a(this);
    }

    @Override // kotlinx.serialization.encoding.a
    public String q(kotlinx.serialization.descriptors.e eVar, int i) {
        eVar.getClass();
        return m();
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean r() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.a
    public Object t(kotlinx.serialization.descriptors.e eVar, int i, kotlinx.serialization.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        if (aVar.d().c() || r()) {
            return p(aVar);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.b
    public kotlinx.serialization.encoding.b u(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.a
    public kotlinx.serialization.encoding.b v(q0 q0Var, int i) {
        q0Var.getClass();
        return u(q0Var.i(i));
    }

    @Override // kotlinx.serialization.encoding.a
    public Object w(kotlinx.serialization.descriptors.e eVar, int i, kotlinx.serialization.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        return p(aVar);
    }

    @Override // kotlinx.serialization.encoding.a
    public double x(q0 q0Var, int i) {
        q0Var.getClass();
        return B();
    }

    @Override // kotlinx.serialization.encoding.b
    public abstract byte y();

    @Override // kotlinx.serialization.encoding.b
    public abstract short z();
}
