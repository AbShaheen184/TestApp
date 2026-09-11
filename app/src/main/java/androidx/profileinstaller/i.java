package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.l;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final l a = new l();
    public static final Object b = new Object();
    public static com.google.android.material.shape.g c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static com.google.android.material.shape.g b() {
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        c = gVar;
        a.l(gVar);
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    public static void c(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        h hVarA;
        h hVar;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || c == null) {
            synchronized (b) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            hVarA = h.a(file3);
                        } else {
                            hVarA = null;
                        }
                        if (hVarA == null) {
                            if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                        } else if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z) {
                            i = 2;
                        }
                        if (hVarA != null) {
                            i = 3;
                        }
                        hVar = new h(1, i, jA, length);
                        if (hVarA != null) {
                            hVar.b(file3);
                        } else {
                            hVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 28 && i2 != 30) {
                            file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                            long length3 = file.length();
                            if (file.exists() || length3 <= 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file2.length();
                            if (file2.exists() || length <= 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            try {
                                long jA2 = a(context);
                                file3 = new File(context.getFilesDir(), "profileInstalled");
                                if (file3.exists()) {
                                    try {
                                        hVarA = h.a(file3);
                                    } catch (IOException unused) {
                                        b();
                                        return;
                                    }
                                } else {
                                    hVarA = null;
                                }
                                if (hVarA == null && hVarA.c == jA2 && (i3 = hVarA.b) != 2) {
                                    i = i3;
                                } else if (!z2) {
                                    i = 327680;
                                } else if (z3) {
                                    i = 1;
                                } else if (z4) {
                                    i = 2;
                                }
                                if (z && z4 && i != 1) {
                                    i = 2;
                                }
                                if (hVarA != null && hVarA.b == 2 && i == 1 && length3 < hVarA.d) {
                                    i = 3;
                                }
                                hVar = new h(1, i, jA2, length);
                                if (hVarA != null || !hVarA.equals(hVar)) {
                                    try {
                                        hVar.b(file3);
                                    } catch (IOException unused2) {
                                    }
                                }
                                b();
                                return;
                            } catch (PackageManager.NameNotFoundException unused3) {
                                b();
                                return;
                            }
                        }
                        b();
                        return;
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                    z2 = false;
                }
                throw th;
            }
        }
    }
}
