package com.app.mlounge.data.repository;

import com.app.mlounge.data.remote.model.MusicGenre;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static final List e;
    public final x a;
    public final MutableStateFlow b;
    public final MutableStateFlow c;
    public final List d;

    static {
        kotlin.collections.u uVar = kotlin.collections.u.e;
        e = com.google.common.base.c.q(new MusicGenre("all", "All Genres", uVar), new MusicGenre("0", "World", com.google.common.base.c.q(new MusicGenre("3", "Celtic", uVar), new MusicGenre("14", "Jewish", uVar), new MusicGenre("79", "Arabic", uVar), new MusicGenre("169", "Chinese", uVar), new MusicGenre("179", "Japanese", uVar), new MusicGenre("194", "Korean", uVar))), new MusicGenre("313", "Classical", uVar), new MusicGenre("355", "Metal", uVar), new MusicGenre("408", "Alternative", uVar), new MusicGenre("473", "Rock", uVar), new MusicGenre("517", "R&B", uVar), new MusicGenre("539", "Dance", uVar), new MusicGenre("558", "Pop", uVar), new MusicGenre("596", "Jazz", uVar), new MusicGenre("623", "Hip Hop", uVar), new MusicGenre("654", "Electronic", uVar), new MusicGenre("750", "Country", uVar), new MusicGenre("774", "Blues", uVar), new MusicGenre("0", "Soundtracks", com.google.common.base.c.q(new MusicGenre("789", "Movie Soundtracks", uVar), new MusicGenre("792", "TV Soundtracks", uVar), new MusicGenre("794", "Game Soundtracks", uVar))));
    }

    public a0(com.app.mlounge.data.music.c cVar, com.app.mlounge.data.music.h hVar, x xVar) {
        cVar.getClass();
        hVar.getClass();
        xVar.getClass();
        this.a = xVar;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(cVar);
        this.b = MutableStateFlow;
        this.c = MutableStateFlow;
        this.d = com.google.common.base.c.q(cVar, hVar);
    }

    public final Object a(String str, String str2, Object obj, kotlin.coroutines.jvm.internal.c cVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new z(this, str, str2, obj, null, 3), cVar);
    }

    public final void b(String str) {
        Object next;
        str.getClass();
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.app.mlounge.data.music.d) next).getName().equals(str));
        com.app.mlounge.data.music.d dVar = (com.app.mlounge.data.music.d) next;
        if (dVar != null) {
            this.b.setValue(dVar);
        }
    }
}
