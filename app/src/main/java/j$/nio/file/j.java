package j$.nio.file;

import java.net.URI;
import java.security.AccessController;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final h a = ((j$.nio.file.spi.c) AccessController.doPrivileged(new i(0))).j(URI.create("file:///"));
}
