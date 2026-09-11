package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class t extends k {
    @Override // okio.k
    public final List X(x xVar) throws IOException {
        File file = xVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                net.luminis.tls.engine.impl.c.u(xVar, "failed to list ");
                return null;
            }
            net.luminis.tls.engine.impl.c.s(xVar, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(xVar.g(str));
        }
        kotlin.collections.r.A(arrayList);
        return arrayList;
    }

    @Override // okio.k
    public androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar) {
        xVar.getClass();
        File file = xVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new androidx.constraintlayout.core.widgets.analyzer.e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // okio.k
    public final f0 a(x xVar) {
        xVar.getClass();
        return new w(new FileOutputStream(xVar.toFile(), true), new j0());
    }

    @Override // okio.k
    public final s a0(x xVar) {
        return new s(new RandomAccessFile(xVar.toFile(), "r"));
    }

    @Override // okio.k
    public final f0 b0(x xVar, boolean z) throws IOException {
        xVar.getClass();
        if (!z || !N(xVar)) {
            return new w(new FileOutputStream(xVar.toFile(), false), new j0());
        }
        throw new IOException(xVar + " already exists.");
    }

    @Override // okio.k
    public final h0 c0(x xVar) {
        xVar.getClass();
        return new r(new FileInputStream(xVar.toFile()), j0.d);
    }

    @Override // okio.k
    public void g(x xVar, x xVar2) throws IOException {
        xVar.getClass();
        xVar2.getClass();
        if (xVar.toFile().renameTo(xVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + xVar + " to " + xVar2);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.k
    public final void w(x xVar) throws IOException {
        xVar.getClass();
        if (xVar.toFile().mkdir()) {
            return;
        }
        androidx.constraintlayout.core.widgets.analyzer.e eVarZ = Z(xVar);
        if (eVarZ == null || !eVarZ.c) {
            net.luminis.tls.engine.impl.c.u(xVar, "failed to create directory: ");
        }
    }

    @Override // okio.k
    public final void z(x xVar) throws IOException {
        xVar.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = xVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        net.luminis.tls.engine.impl.c.u(xVar, "failed to delete ");
    }
}
