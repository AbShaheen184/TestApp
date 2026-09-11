package com.grack.nanojson;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends LinkedHashMap {
    /* JADX WARN: Multi-variable type inference failed */
    public final b a(String str) {
        b bVar = new b();
        V v = get(str);
        return v instanceof b ? (b) v : bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(String str) {
        V v = get(str);
        if (v instanceof Boolean) {
            return ((Boolean) v).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c(String str, int i) {
        V v = get(str);
        return v instanceof Number ? ((Number) v).intValue() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(String str, long j) {
        V v = get(str);
        return v instanceof Number ? ((Number) v).longValue() : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c e(String str) {
        c cVar = new c();
        V v = get(str);
        return v instanceof c ? (c) v : cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f(String str, String str2) {
        V v = get(str);
        return v instanceof String ? (String) v : str2;
    }
}
