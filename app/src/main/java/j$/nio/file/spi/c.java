package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.OpenOption;
import j$.nio.file.Path;
import j$.nio.file.StandardOpenOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.n;
import j$.nio.file.d;
import j$.nio.file.h;
import j$.nio.file.k;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final Set a = g.p(new Object[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE});

    public abstract void A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    public abstract void a(Path path, j$.nio.file.a... aVarArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, FileAttribute... fileAttributeArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, FileAttribute... fileAttributeArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract n h(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract d i(Path path);

    public abstract h j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, FileAttribute... fileAttributeArr);

    public abstract SeekableByteChannel q(Path path, Set set, FileAttribute... fileAttributeArr);

    public abstract DirectoryStream r(Path path, j$.desugar.sun.nio.fs.h hVar);

    public abstract FileChannel s(Path path, Set set, FileAttribute... fileAttributeArr);

    public abstract h u(URI uri, Map map);

    public abstract BasicFileAttributes x(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract Map y(Path path, String str, LinkOption... linkOptionArr);

    public abstract Path z(Path path);

    public c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public h t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public InputStream v(Path path, OpenOption... openOptionArr) {
        Set set;
        if (openOptionArr.length > 0) {
            for (OpenOption openOption : openOptionArr) {
                if (openOption == StandardOpenOption.APPEND || openOption == StandardOpenOption.WRITE) {
                    k.e("'", openOption, "' not allowed");
                    return null;
                }
            }
        }
        int i = Files.a;
        if (openOptionArr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, openOptionArr);
            set = hashSet;
        }
        return Channels.newInputStream(Files.c(path).q(path, set, new FileAttribute[0]));
    }

    public OutputStream w(Path path, OpenOption... openOptionArr) {
        Set set;
        if (openOptionArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (OpenOption openOption : openOptionArr) {
                if (openOption == StandardOpenOption.READ) {
                    k.a("READ not allowed");
                    return null;
                }
                hashSet.add(openOption);
            }
            hashSet.add(StandardOpenOption.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new FileAttribute[0]));
    }
}
