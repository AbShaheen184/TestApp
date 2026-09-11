package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.collections.b {
    public final /* synthetic */ h A;
    public final ArrayDeque z;

    public f(h hVar) {
        this.A = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.z = arrayDeque;
        File file = (File) hVar.b;
        if (file.isDirectory()) {
            arrayDeque.push(c(file));
        } else if (!file.isFile()) {
            this.e = 2;
        } else {
            file.getClass();
            arrayDeque.push(new d(file));
        }
    }

    @Override // kotlin.collections.b
    public final void b() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.z;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            File fileA = gVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(gVar.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(c(fileA));
            }
        }
        if (file == null) {
            this.e = 2;
        } else {
            this.y = file;
            this.e = 1;
        }
    }

    public final b c(File file) {
        int iOrdinal = ((i) this.A.c).ordinal();
        if (iOrdinal == 0) {
            file.getClass();
            return new e(file);
        }
        if (iOrdinal == 1) {
            file.getClass();
            return new c(file);
        }
        coil3.g.a();
        return null;
    }
}
