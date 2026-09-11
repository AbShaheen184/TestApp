package j$.io;

import j$.nio.file.Path;
import j$.nio.file.j;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FileRetargetClass {
    public static Path toPath(File file) {
        return j.a.b(file.getPath(), new String[0]);
    }
}
