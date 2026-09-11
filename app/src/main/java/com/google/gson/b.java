package com.google.gson;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements com.google.gson.internal.o {
    public final /* synthetic */ int e;

    public static /* synthetic */ void b() {
        throw new androidx.compose.ui.res.e(10);
    }

    public static /* synthetic */ void c(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void d(int i, String str, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void e(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void j(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void l() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void n(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p() throws net.luminis.quic.impl.e {
        throw new net.luminis.quic.impl.e();
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new i(str + ((Object) obj.toString()), 8);
    }

    public static /* synthetic */ void r(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    @Override // com.google.gson.internal.o
    public Object a() {
        switch (this.e) {
            case 3:
                return new com.google.gson.internal.n(true);
            case 4:
                return new LinkedHashMap();
            case 5:
                return new TreeMap();
            case 6:
                return new ConcurrentHashMap();
            case 7:
                return new ConcurrentSkipListMap();
            case 8:
                return new ArrayList();
            case 9:
                return new LinkedHashSet();
            case 10:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }
}
