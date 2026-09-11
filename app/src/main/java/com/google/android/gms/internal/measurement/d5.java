package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface d5 {
    public static final h5 m = new h5();
    public static final b5 n = new b5();
    public static final r2 o = new r2("continue");
    public static final r2 p = new r2("break");
    public static final r2 q = new r2("return");
    public static final b2 r = new b2(Boolean.TRUE);
    public static final b2 s = new b2(Boolean.FALSE);
    public static final g5 t = new g5("");

    Iterator b();

    Boolean c();

    String d();

    Double h();

    d5 j(String str, b7 b7Var, ArrayList arrayList);

    d5 l();
}
