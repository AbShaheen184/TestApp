package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends com.google.gson.n {
    public final y a;

    public w(y yVar) {
        this.a = yVar;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        Object objD = d();
        Map map = this.a.a;
        try {
            aVar.g();
            while (aVar.a0()) {
                v vVar = (v) map.get(aVar.h0());
                if (vVar == null) {
                    aVar.t0();
                } else {
                    f(objD, aVar, vVar);
                }
            }
            aVar.L();
            return e(objD);
        } catch (IllegalAccessException e) {
            com.google.common.base.c cVar = com.google.gson.internal.reflect.c.a;
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new com.google.gson.i(e2, 8);
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.Y();
            return;
        }
        bVar.m();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((v) it.next()).a(bVar, obj);
            }
            bVar.L();
        } catch (IllegalAccessException e) {
            com.google.common.base.c cVar = com.google.gson.internal.reflect.c.a;
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, com.google.gson.stream.a aVar, v vVar);
}
