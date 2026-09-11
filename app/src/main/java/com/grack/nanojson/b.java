package com.grack.nanojson;

import java.util.ArrayList;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ArrayList {
    public final c b(int i) {
        c cVar = new c();
        Object obj = get(i);
        return obj instanceof c ? (c) obj : cVar;
    }

    public final Stream c() {
        return stream().filter(new a(0)).map(new androidx.media3.exoplayer.audio.f(1));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < size()) {
            return super.get(i);
        }
        return null;
    }
}
