package androidx.compose.animation.core;

import com.app.mlounge.data.remote.model.MusicGenre;
import com.app.mlounge.data.remote.model.TmdbGenre;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public /* synthetic */ r1(int i, kotlin.jvm.functions.l lVar) {
        this.e = i;
        this.y = lVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.jvm.functions.l lVar = this.y;
                Long l = (Long) obj;
                l.getClass();
                return lVar.invoke(l);
            case 1:
                androidx.compose.runtime.snapshots.f fVar = (androidx.compose.runtime.snapshots.f) this.y.invoke((androidx.compose.runtime.snapshots.l) obj);
                synchronized (androidx.compose.runtime.snapshots.n.c) {
                    androidx.compose.runtime.snapshots.n.d = androidx.compose.runtime.snapshots.n.d.f(fVar.g());
                }
                return fVar;
            case 2:
                kotlin.jvm.functions.l lVar2 = this.y;
                coil3.compose.h hVar = (coil3.compose.h) obj;
                if (!(hVar instanceof coil3.compose.f) && !(hVar instanceof coil3.compose.g)) {
                    if (hVar instanceof coil3.compose.e) {
                        if (lVar2 != null) {
                            lVar2.invoke(hVar);
                        }
                    } else if (!(hVar instanceof coil3.compose.d)) {
                        coil3.g.a();
                        return null;
                    }
                }
                return kotlin.y.a;
            case 3:
                kotlin.jvm.functions.l lVar3 = this.y;
                String str = (String) obj;
                if (str != null) {
                    lVar3.invoke(str);
                }
                return kotlin.y.a;
            case 4:
                kotlin.jvm.functions.l lVar4 = this.y;
                MusicGenre musicGenre = (MusicGenre) obj;
                if (musicGenre != null) {
                    lVar4.invoke(musicGenre);
                }
                return kotlin.y.a;
            case 5:
                kotlin.jvm.functions.l lVar5 = this.y;
                String str2 = (String) obj;
                if (str2 != null) {
                    lVar5.invoke(str2);
                }
                return kotlin.y.a;
            case 6:
                kotlin.jvm.functions.l lVar6 = this.y;
                TmdbGenre tmdbGenre = (TmdbGenre) obj;
                if (tmdbGenre == null) {
                    tmdbGenre = null;
                }
                lVar6.invoke(tmdbGenre);
                return kotlin.y.a;
            case 7:
                kotlin.jvm.functions.l lVar7 = this.y;
                String str3 = (String) obj;
                if (str3 == null) {
                    str3 = null;
                }
                lVar7.invoke(str3);
                return kotlin.y.a;
            case 8:
                kotlin.jvm.functions.l lVar8 = this.y;
                Integer num = (Integer) obj;
                if (num == null) {
                    num = null;
                }
                lVar8.invoke(num);
                return kotlin.y.a;
            default:
                return ExceptionsConstructorKt.safeCtor$lambda$9(this.y, (Throwable) obj);
        }
    }
}
