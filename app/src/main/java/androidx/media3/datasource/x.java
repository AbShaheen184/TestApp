package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.j0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends c {
    public final Context B;
    public l C;
    public AssetFileDescriptor D;
    public FileInputStream E;
    public long F;
    public boolean G;

    public x(Context context) {
        super(false);
        this.B = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // androidx.media3.datasource.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.C = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.E     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.E = r0
            android.content.res.AssetFileDescriptor r3 = r5.D     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.D = r0
            boolean r0 = r5.G
            if (r0 == 0) goto L2b
            r5.G = r2
            r5.g()
        L2b:
            return
        L2c:
            androidx.media3.datasource.w r4 = new androidx.media3.datasource.w     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.D = r0
            boolean r0 = r5.G
            if (r0 == 0) goto L3d
            r5.G = r2
            r5.g()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.w r4 = new androidx.media3.datasource.w     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.E = r0
            android.content.res.AssetFileDescriptor r4 = r5.D     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.D = r0
            boolean r0 = r5.G
            if (r0 == 0) goto L5d
            r5.G = r2
            r5.g()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.w r4 = new androidx.media3.datasource.w     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.D = r0
            boolean r0 = r5.G
            if (r0 == 0) goto L6f
            r5.G = r2
            r5.g()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.x.close():void");
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) throws w {
        if (i2 == 0) {
            return 0;
        }
        long j = this.F;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new w(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.E;
            String str = j0.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            long j2 = this.F;
            if (i3 != -1) {
                if (j2 != -1) {
                    this.F = j2 - ((long) i3);
                }
                a(i3);
                return i3;
            }
            if (j2 != -1) {
                throw new w("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws w {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.C = lVar;
        l();
        Uri uri = lVar.a;
        long j = lVar.g;
        long j2 = lVar.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.B;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new w("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new w("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new w("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new w("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new w("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new w("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new w("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.D = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.D.getFileDescriptor());
            this.E = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new w(null, null, 2008);
                }
                long startOffset = this.D.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new w(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.F = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.F = size;
                        if (size < 0) {
                            throw new w(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.F = j3;
                    if (j3 < 0) {
                        throw new i(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.F;
                    this.F = j4 == -1 ? j : Math.min(j4, j);
                }
                this.G = true;
                m(lVar);
                return j != -1 ? j : this.F;
            } catch (w e2) {
                throw e2;
            } catch (IOException e3) {
                throw new w(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new w(null, e4, 2005);
        }
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        l lVar = this.C;
        if (lVar != null) {
            return lVar.a;
        }
        return null;
    }
}
