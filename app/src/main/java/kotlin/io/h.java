package kotlin.io;

import androidx.collection.m0;
import com.app.mlounge.ui.screens.player.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.r;
import kotlin.collections.s;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements kotlin.sequences.h {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public h(File file) {
        this.a = 0;
        file.getClass();
        this.b = file;
        this.c = i.e;
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new f(this);
            case 1:
                return new kotlin.sequences.b(((Iterable) ((s) this.b).b).iterator(), (j0) this.c);
            case 2:
                return new m0(this);
            default:
                kotlin.sequences.h hVar = (kotlin.sequences.h) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = hVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                r.B((Comparator) this.c, arrayList);
                return arrayList.iterator();
        }
    }

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
