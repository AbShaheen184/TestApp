package com.app.mlounge.data.remote.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicSearchResponse {
    public static final int $stable = 8;
    private final List<MusicAlbum> albums;
    private final List<MusicArtist> artists;
    private final Object nextPageToken;
    private final List<MusicTrack> tracks;

    public MusicSearchResponse(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj, int i) {
        int i2 = i & 1;
        u uVar = u.e;
        List<MusicArtist> list = i2 != 0 ? uVar : arrayList;
        List<MusicAlbum> list2 = (i & 2) != 0 ? uVar : arrayList2;
        List<MusicTrack> list3 = (i & 4) != 0 ? uVar : arrayList3;
        obj = (i & 8) != 0 ? null : obj;
        this.artists = list;
        this.albums = list2;
        this.tracks = list3;
        this.nextPageToken = obj;
    }

    public final List a() {
        return this.albums;
    }

    public final List b() {
        return this.artists;
    }

    public final Object c() {
        return this.nextPageToken;
    }

    public final List d() {
        return this.tracks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicSearchResponse)) {
            return false;
        }
        MusicSearchResponse musicSearchResponse = (MusicSearchResponse) obj;
        return l.a(this.artists, musicSearchResponse.artists) && l.a(this.albums, musicSearchResponse.albums) && l.a(this.tracks, musicSearchResponse.tracks) && l.a(this.nextPageToken, musicSearchResponse.nextPageToken);
    }

    public final int hashCode() {
        int iHashCode = (this.tracks.hashCode() + ((this.albums.hashCode() + (this.artists.hashCode() * 31)) * 31)) * 31;
        Object obj = this.nextPageToken;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "MusicSearchResponse(artists=" + this.artists + ", albums=" + this.albums + ", tracks=" + this.tracks + ", nextPageToken=" + this.nextPageToken + ")";
    }
}
