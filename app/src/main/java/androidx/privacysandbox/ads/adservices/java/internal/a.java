package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.appcompat.widget.c2;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.g;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.e;
import androidx.compose.ui.text.m0;
import androidx.transition.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(long j, String str, StringBuilder sb) {
        sb.append((Object) t.i(j));
        sb.append(str);
    }

    public static void B(c2 c2Var, long j) {
        c2Var.w().q();
        c2Var.c0(j);
    }

    public static /* synthetic */ void C(Object obj) {
        if (obj == null) {
            return;
        }
        k.i();
    }

    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int d(int i, int i2, m0 m0Var) {
        return (m0Var.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int f(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static androidx.compose.foundation.interaction.k g(r rVar) {
        androidx.compose.foundation.interaction.k kVar = new androidx.compose.foundation.interaction.k();
        rVar.l0(kVar);
        return kVar;
    }

    public static g h(float f, float f2) {
        g gVar = new g(0);
        gVar.o(f, f2);
        return gVar;
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object j(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String k(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String l(int i, String str) {
        return str + i;
    }

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String n(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String o(Object obj, String str) {
        return str + obj;
    }

    public static String p(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String q(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String r(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String t(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder v(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder w(String str, String str2, int i, String str3, int i2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void y(int i, r rVar, int i2, e eVar) {
        rVar.l0(Integer.valueOf(i));
        rVar.b(Integer.valueOf(i2), eVar);
    }

    public static void z(int i, r rVar, e eVar, r rVar2, d dVar) {
        s.p(rVar, Integer.valueOf(i), eVar);
        s.t(rVar2, dVar);
    }
}
