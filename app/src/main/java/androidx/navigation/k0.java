package androidx.navigation;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public l a;
    public boolean b;

    public abstract t a();

    public final l b() {
        l lVar = this.a;
        if (lVar != null) {
            return lVar;
        }
        net.luminis.tls.engine.impl.c.r("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, b0 b0Var) {
        kotlin.sequences.f fVar = new kotlin.sequences.f(new kotlin.sequences.g(new kotlin.sequences.n(new kotlin.collections.s(list, 0), new androidx.compose.ui.text.font.e(4, this, b0Var), 1), false, new com.app.mlounge.ui.screens.player.j0(21)));
        while (fVar.hasNext()) {
            b().f((i) fVar.next());
        }
    }

    public void e(i iVar, boolean z) {
        List list = (List) b().e.getValue();
        if (!list.contains(iVar)) {
            androidx.media3.exoplayer.hls.playlist.a.i("popBackStack was called with ", iVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        i iVar2 = null;
        while (f()) {
            iVar2 = (i) listIterator.previous();
            if (kotlin.jvm.internal.l.a(iVar2, iVar)) {
                break;
            }
        }
        if (iVar2 != null) {
            b().d(iVar2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public t c(t tVar) {
        return tVar;
    }
}
