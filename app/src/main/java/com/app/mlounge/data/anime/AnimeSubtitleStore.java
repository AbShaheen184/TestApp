package com.app.mlounge.data.anime;

import com.app.mlounge.data.remote.model.HiAnimeTrack;
import java.util.List;
import kotlin.collections.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AnimeSubtitleStore {
    public static final AnimeSubtitleStore INSTANCE = new AnimeSubtitleStore();
    private static volatile List<HiAnimeTrack> tracks = u.e;
    public static final int $stable = 8;

    private AnimeSubtitleStore() {
    }

    public final List<HiAnimeTrack> consume() {
        List<HiAnimeTrack> list = tracks;
        tracks = u.e;
        return list;
    }

    public final void set(List<HiAnimeTrack> list) {
        list.getClass();
        tracks = list;
    }
}
