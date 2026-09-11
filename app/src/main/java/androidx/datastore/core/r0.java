package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements k0 {
    public final kotlin.coroutines.i a;
    public final File b;
    public final Flow c;
    public final String d;
    public final String e;
    public final String f;
    public final Mutex g;
    public final kotlin.o h;
    public final kotlin.o i;

    public r0(kotlin.coroutines.i iVar, File file) {
        iVar.getClass();
        file.getClass();
        this.a = iVar;
        this.b = file;
        Object obj = u0.b;
        this.c = FlowKt.channelFlow(new androidx.compose.animation.b0(file, (kotlin.coroutines.d) null, 18));
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        final int i = 0;
        final int i2 = 1;
        this.g = MutexKt.Mutex$default(false, 1, null);
        this.h = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.datastore.core.m0
            public final /* synthetic */ r0 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() throws Throwable {
                ParcelFileDescriptor parcelFileDescriptorOpen;
                a1 a1Var;
                switch (i) {
                    case 0:
                        r0 r0Var = this.y;
                        File file2 = new File(r0Var.b.getAbsolutePath() + r0Var.d);
                        r0.f(file2);
                        return file2;
                    default:
                        b1.a.getClass();
                        r0 r0Var2 = this.y;
                        File file3 = new File(r0Var2.b.getAbsolutePath() + r0Var2.e);
                        r0.f(file3);
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptorOpen.getClass();
                                NativeSharedCounter nativeSharedCounter = z0.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            a1Var = new a1(nativeSharedCounter, jNativeCreateSharedCounter);
                                        } else {
                                            net.luminis.tls.engine.impl.c.t("Failed to mmap counter file");
                                        }
                                        parcelFileDescriptorOpen.close();
                                        return a1Var;
                                    }
                                    net.luminis.tls.engine.impl.c.t("Failed to truncate counter file");
                                } else {
                                    net.luminis.tls.engine.impl.c.r("DataStore failed to load the native library to create SharedCounter.");
                                }
                                a1Var = null;
                                parcelFileDescriptorOpen.close();
                                return a1Var;
                            } catch (Throwable th) {
                                th = th;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
        this.i = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.datastore.core.m0
            public final /* synthetic */ r0 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() throws Throwable {
                ParcelFileDescriptor parcelFileDescriptorOpen;
                a1 a1Var;
                switch (i2) {
                    case 0:
                        r0 r0Var = this.y;
                        File file2 = new File(r0Var.b.getAbsolutePath() + r0Var.d);
                        r0.f(file2);
                        return file2;
                    default:
                        b1.a.getClass();
                        r0 r0Var2 = this.y;
                        File file3 = new File(r0Var2.b.getAbsolutePath() + r0Var2.e);
                        r0.f(file3);
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptorOpen.getClass();
                                NativeSharedCounter nativeSharedCounter = z0.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            a1Var = new a1(nativeSharedCounter, jNativeCreateSharedCounter);
                                        } else {
                                            net.luminis.tls.engine.impl.c.t("Failed to mmap counter file");
                                        }
                                        parcelFileDescriptorOpen.close();
                                        return a1Var;
                                    }
                                    net.luminis.tls.engine.impl.c.t("Failed to truncate counter file");
                                } else {
                                    net.luminis.tls.engine.impl.c.r("DataStore failed to load the native library to create SharedCounter.");
                                }
                                a1Var = null;
                                parcelFileDescriptorOpen.close();
                                return a1Var;
                            } catch (Throwable th) {
                                th = th;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
    }

    public static void f(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                net.luminis.tls.engine.impl.c.u(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // androidx.datastore.core.k0
    public final Object a(y yVar) {
        kotlin.o oVar = this.i;
        if (oVar.a()) {
            a1 a1Var = (a1) ((b1) oVar.getValue());
            return new Integer(a1Var.b.nativeIncrementAndGetCounterValue(a1Var.c));
        }
        return BuildersKt.withContext(this.a, new o0(this, null, 1), yVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd A[Catch: all -> 0x00e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:60:0x00dd, B:72:0x00f8, B:73:0x00fb), top: B:83:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:60:0x00dd, B:72:0x00f8, B:73:0x00fb), top: B:83:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.q0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    @Override // androidx.datastore.core.k0
    public final Object b(kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        ?? q0Var;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        Mutex mutex;
        boolean z;
        FileInputStream fileInputStream;
        Mutex mutex2;
        boolean z2;
        ?? r2 = pVar;
        if (cVar instanceof q0) {
            q0 q0Var2 = (q0) cVar;
            int i = q0Var2.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                q0Var2.D = i - Integer.MIN_VALUE;
                q0Var = q0Var2;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object objInvoke = q0Var.B;
        int i2 = q0Var.D;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        z2 = q0Var.A;
                        mutex2 = q0Var.e;
                        kotlin.a.e(objInvoke);
                        if (z2) {
                            mutex2.unlock(null);
                        }
                        return objInvoke;
                    }
                    if (i2 != 2) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = q0Var.A;
                    fileLock = q0Var.z;
                    fileInputStream = q0Var.y;
                    mutex = q0Var.e;
                    try {
                        kotlin.a.e(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        com.google.common.base.b.d(fileInputStream, null);
                        if (z) {
                            mutex.unlock(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                kotlin.a.e(objInvoke);
                Mutex mutex3 = this.g;
                boolean zTryLock = mutex3.tryLock(null);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                try {
                    if (zTryLock) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e) {
                                String message2 = e.getMessage();
                                if ((message2 == null || !kotlin.text.r.O(message2, this.f, false)) && ((message = e.getMessage()) == null || !kotlin.text.r.O(message, "Resource deadlock would occur", false))) {
                                    throw e;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                q0Var.e = mutex3;
                                q0Var.y = fileInputStream2;
                                q0Var.z = fileLockTryLock;
                                q0Var.A = zTryLock;
                                q0Var.D = 2;
                                objInvoke = r2.invoke(boolValueOf, q0Var);
                                if (objInvoke != aVar) {
                                    mutex = mutex3;
                                    z = zTryLock;
                                    fileInputStream = fileInputStream2;
                                    fileLock = fileLockTryLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    com.google.common.base.b.d(fileInputStream, null);
                                    if (z) {
                                        mutex.unlock(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        q0Var.e = mutex3;
                        q0Var.A = zTryLock;
                        q0Var.D = 1;
                        objInvoke = r2.invoke(bool, q0Var);
                        if (objInvoke != aVar) {
                            mutex2 = mutex3;
                            z2 = zTryLock;
                            if (z2) {
                                mutex2.unlock(null);
                            }
                            return objInvoke;
                        }
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th = th4;
                    q0Var = mutex3;
                    r2 = zTryLock;
                    if (r2 != 0) {
                        q0Var.unlock(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            ?? r4 = q0Var;
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    com.google.common.base.b.d(2, th6);
                    throw th7;
                } catch (Throwable th8) {
                    th = th8;
                    r2 = r2;
                    q0Var = r4;
                    if (r2 != 0) {
                        q0Var.unlock(null);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // androidx.datastore.core.k0
    public final Object c(kotlin.coroutines.jvm.internal.c cVar) {
        kotlin.o oVar = this.i;
        if (oVar.a()) {
            a1 a1Var = (a1) ((b1) oVar.getValue());
            return new Integer(a1Var.b.nativeGetCounterValue(a1Var.c));
        }
        return BuildersKt.withContext(this.a, new o0(this, null, 0), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2 A[Catch: all -> 0x00b6, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b6, blocks: (B:41:0x00b2, B:55:0x00cf, B:56:0x00d2), top: B:72:0x0022, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #4 {all -> 0x00b6, blocks: (B:41:0x00b2, B:55:0x00cf, B:56:0x00d2), top: B:72:0x0022, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    @Override // androidx.datastore.core.k0
    public final Object d(kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        p0 p0Var;
        Mutex mutex;
        FileOutputStream fileOutputStream;
        Throwable th;
        kotlin.jvm.functions.l lVar2;
        ?? r9;
        ?? r10;
        FileLock fileLock;
        Closeable closeable;
        FileLock fileLock2;
        Object objInvoke;
        ?? r0;
        ?? r11;
        Closeable closeable2;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i = p0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0Var.C = i - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        ?? r12 = p0Var.A;
        ?? r1 = p0Var.C;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            try {
                try {
                    if (r1 == 0) {
                        kotlin.a.e(r12);
                        p0Var.e = lVar;
                        mutex = this.g;
                        p0Var.y = mutex;
                        p0Var.C = 1;
                        if (mutex.lock(null, p0Var) != aVar) {
                        }
                        r12 = mutex;
                        return aVar;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            if (r1 != 3) {
                                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) p0Var.z;
                            Closeable closeable3 = (Closeable) p0Var.y;
                            Mutex mutex2 = (Mutex) p0Var.e;
                            try {
                                kotlin.a.e(r12);
                                r0 = mutex2;
                                closeable2 = closeable3;
                                r11 = r12;
                                if (fileLock != null) {
                                    closeable2 = closeable;
                                    fileLock.release();
                                }
                                try {
                                    closeable2 = closeable;
                                    com.google.common.base.b.d(closeable2, null);
                                    r0.unlock(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = r0;
                                    r12.unlock(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        Closeable closeable4 = (Closeable) p0Var.z;
                        r9 = (Mutex) p0Var.y;
                        lVar2 = (kotlin.jvm.functions.l) p0Var.e;
                        try {
                            kotlin.a.e(r12);
                            closeable = closeable4;
                            r9 = r9;
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                p0Var.e = r9;
                                p0Var.y = closeable;
                                p0Var.z = fileLock2;
                                p0Var.C = 3;
                                objInvoke = lVar2.invoke(p0Var);
                                if (objInvoke != aVar) {
                                    r0 = r9;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    if (fileLock != null) {
                                        closeable2 = closeable;
                                        fileLock.release();
                                    }
                                    closeable2 = closeable;
                                    com.google.common.base.b.d(closeable2, null);
                                    r0.unlock(null);
                                    return r11;
                                }
                                r12 = mutex;
                                return aVar;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    Mutex mutex3 = (Mutex) p0Var.y;
                    kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) p0Var.e;
                    kotlin.a.e(r12);
                    r12 = mutex3;
                    lVar = lVar3;
                    p0Var.e = lVar;
                    p0Var.y = r12;
                    p0Var.z = fileOutputStream;
                    p0Var.C = 2;
                    Object objA = k1.a(fileOutputStream, p0Var);
                    if (objA != aVar) {
                        lVar2 = lVar;
                        r9 = r12;
                        r10 = objA;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r10;
                        p0Var.e = r9;
                        p0Var.y = closeable;
                        p0Var.z = fileLock2;
                        p0Var.C = 3;
                        objInvoke = lVar2.invoke(p0Var);
                        if (objInvoke != aVar) {
                            r0 = r9;
                            fileLock = fileLock2;
                            r11 = objInvoke;
                            if (fileLock != null) {
                                closeable2 = closeable;
                                fileLock.release();
                            }
                            closeable2 = closeable;
                            com.google.common.base.b.d(closeable2, null);
                            r0.unlock(null);
                            return r11;
                        }
                    }
                    r12 = mutex;
                    return aVar;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                r12 = mutex;
                fileOutputStream = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
                r12.unlock(null);
                throw th;
            }
        } catch (Throwable th8) {
            r12 = p0Var;
            try {
                throw th8;
            } catch (Throwable th9) {
                com.google.common.base.b.d(r1, th8);
                throw th9;
            }
        }
    }

    @Override // androidx.datastore.core.k0
    public final Flow e() {
        return this.c;
    }
}
