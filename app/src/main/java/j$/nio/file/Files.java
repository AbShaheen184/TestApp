package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileAttribute;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Files {
    public static final /* synthetic */ int a = 0;

    public static j$.nio.file.spi.c c(Path path) {
        return path.getFileSystem().i();
    }

    static {
        j$.desugar.sun.nio.fs.g.p(new Object[]{StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE});
    }

    public static Path createDirectories(Path path, FileAttribute<?>... fileAttributeArr) throws FileSystemException {
        boolean zIsDirectory;
        boolean zIsDirectory2;
        try {
            try {
                c(path).c(path, fileAttributeArr);
            } catch (IOException unused) {
                try {
                    path = path.toAbsolutePath();
                    e = null;
                } catch (SecurityException e) {
                    e = e;
                }
                Path parent = path.getParent();
                while (parent != null) {
                    try {
                        parent.getFileSystem().i().a(parent, new a[0]);
                        break;
                    } catch (NoSuchFileException unused2) {
                        parent = parent.getParent();
                    }
                }
                if (parent == null) {
                    if (e == null) {
                        throw new FileSystemException(path.toString(), null, "Unable to determine if root directory exists");
                    }
                    throw e;
                }
                Iterator it = parent.K(path).iterator();
                while (it.hasNext()) {
                    parent = parent.t((Path) it.next());
                    try {
                        c(parent).c(parent, fileAttributeArr);
                    } catch (FileAlreadyExistsException e2) {
                        try {
                            zIsDirectory = readAttributes(parent, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS).isDirectory();
                        } catch (IOException unused3) {
                            zIsDirectory = false;
                        }
                        if (!zIsDirectory) {
                            throw e2;
                        }
                    }
                }
                return path;
            }
        } catch (FileAlreadyExistsException e3) {
            try {
                try {
                    zIsDirectory2 = readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS).isDirectory();
                } catch (IOException unused4) {
                    zIsDirectory2 = false;
                }
                if (!zIsDirectory2) {
                    throw e3;
                }
            } catch (FileAlreadyExistsException e4) {
                throw e4;
            }
        }
        return path;
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) {
        j$.nio.file.spi.c cVarC = c(path);
        if (c(path2).equals(cVarC)) {
            cVarC.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    k.e("'", copyOption2, "' is not a recognized copy option");
                    return null;
                }
                z3 = true;
            }
        }
        BasicFileAttributes attributes = readAttributes(path, BasicFileAttributes.class, z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (attributes.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            path2.getFileSystem().i().g(path2);
        } else if (b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (attributes.isDirectory()) {
            c(path2).c(path2, new FileAttribute[0]);
        } else {
            InputStream inputStreamV = path.getFileSystem().i().v(path, new OpenOption[0]);
            try {
                a(inputStreamV, path2, new CopyOption[0]);
                inputStreamV.close();
            } catch (Throwable th) {
                if (inputStreamV != null) {
                    try {
                        inputStreamV.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((j$.nio.file.attribute.d) path2.getFileSystem().i().h(path2, j$.nio.file.attribute.d.class, new LinkOption[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
            } catch (Throwable th3) {
                try {
                    path2.getFileSystem().i().f(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        path.getFileSystem().i().f(path);
        return path2;
    }

    public static Path readSymbolicLink(Path path) {
        return c(path).z(path);
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) c(path).x(path, cls, linkOptionArr);
    }

    public static boolean b(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            c(path);
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                LinkOption linkOption = linkOptionArr[i];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                c(path).a(path, new a[0]);
                return true;
            }
            readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(inputStream);
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(copyOption + " not supported");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                path.getFileSystem().i().g(path);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream outputStreamW = c(path).w(path, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamW);
                } else {
                    DesugarInputStream.transferTo(inputStream, outputStreamW);
                }
                if (outputStreamW != null) {
                    outputStreamW.close();
                }
            } catch (Throwable th) {
                if (outputStreamW != null) {
                    try {
                        outputStreamW.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }

    public static Path write(Path path, Iterable<? extends CharSequence> iterable, OpenOption... openOptionArr) throws IOException {
        j$.sun.nio.cs.h hVar = j$.sun.nio.cs.h.a;
        Objects.requireNonNull(iterable);
        hVar.getClass();
        j$.sun.nio.cs.g gVar = new j$.sun.nio.cs.g(hVar);
        OutputStream outputStreamW = c(path).w(path, openOptionArr);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStreamW, gVar));
            try {
                Iterator<? extends CharSequence> it = iterable.iterator();
                while (it.hasNext()) {
                    bufferedWriter.append(it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                if (outputStreamW != null) {
                    outputStreamW.close();
                }
                return path;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (outputStreamW != null) {
                try {
                    outputStreamW.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
