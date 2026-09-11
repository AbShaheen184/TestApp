package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Iterator {
    public final h a;
    public final File[] b;
    public int c = 0;
    public final /* synthetic */ m d;

    public l(m mVar, Path path, h hVar) {
        this.d = mVar;
        File[] fileArrListFiles = path.toFile().listFiles();
        this.b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.a = hVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.c--;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o next() {
        o oVar;
        do {
            int i = this.c;
            File[] fileArr = this.b;
            if (i >= fileArr.length) {
                return null;
            }
            this.c = i + 1;
            File file = fileArr[i];
            i iVar = this.d.d;
            String path = file.getPath();
            m mVar = this.d;
            oVar = new o(iVar, path, mVar.b, mVar.c);
            try {
            } catch (IOException e) {
                throw new DirectoryIteratorException(e);
            }
        } while (!this.a.accept(oVar));
        return oVar;
    }
}
