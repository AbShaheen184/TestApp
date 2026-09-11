package androidx.compose.material3.internal;

import androidx.compose.runtime.t2;
import androidx.compose.ui.graphics.k0;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ t2 y;

    public /* synthetic */ u(t2 t2Var, int i) {
        this.e = i;
        this.y = t2Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((k0) obj).c(((Number) this.y.getValue()).floatValue());
                return kotlin.y.a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                return "game_" + ((Game) ((List) this.y.getValue()).get(iIntValue)).c() + "_" + iIntValue;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("movie_", ((TmdbMovie) ((List) this.y.getValue()).get(iIntValue2)).a(), "_", iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj).intValue();
                Object obj2 = ((List) this.y.getValue()).get(iIntValue3);
                if (obj2 instanceof MusicAlbum) {
                    return "album_" + ((MusicAlbum) obj2).d() + "_" + iIntValue3;
                }
                if (!(obj2 instanceof MusicArtist)) {
                    return String.valueOf(iIntValue3);
                }
                return "artist_" + ((MusicArtist) obj2).c() + "_" + iIntValue3;
            default:
                int iIntValue4 = ((Integer) obj).intValue();
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("tv_", ((TmdbTvShow) ((List) this.y.getValue()).get(iIntValue4)).b(), "_", iIntValue4);
        }
    }
}
