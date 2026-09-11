package androidx.datastore.core;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements h1 {
    public final File a;
    public final y0 b;
    public final k0 c;
    public final androidx.activity.w d;
    public final AtomicBoolean e;
    public final Mutex f;

    public g0(File file, y0 y0Var, k0 k0Var, androidx.activity.w wVar) {
        y0Var.getClass();
        k0Var.getClass();
        this.a = file;
        this.b = y0Var;
        this.c = k0Var;
        this.d = wVar;
        this.e = new AtomicBoolean(false);
        this.f = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[Catch: all -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:35:0x0072, B:44:0x0082, B:43:0x007f, B:40:0x007a), top: B:53:0x0020, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.l] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final Object a(l lVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        e0 e0Var;
        Throwable th;
        c0 c0Var;
        ?? r9;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i = e0Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0Var.B = i - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object obj = e0Var.z;
        int i2 = e0Var.B;
        Mutex mutex = this.f;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = e0Var.e;
                c0Var = e0Var.y;
                try {
                    kotlin.a.e(obj);
                    r9 = lVar;
                    try {
                        c0Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c0Var.close();
                    } catch (Throwable th4) {
                        kotlin.a.a(th, th4);
                    }
                    throw th;
                }
            }
            kotlin.a.e(obj);
            if (this.e.get()) {
                net.luminis.tls.engine.impl.c.r("StorageConnection has already been disposed.");
                return null;
            }
            boolean zTryLock$default = Mutex.DefaultImpls.tryLock$default(mutex, null, 1, null);
            try {
                c0 c0Var2 = new c0(this.a, this.b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zTryLock$default);
                    e0Var.y = c0Var2;
                    e0Var.e = zTryLock$default;
                    e0Var.B = 1;
                    Object objInvoke = lVar.invoke(c0Var2, boolValueOf, e0Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    obj = objInvoke;
                    r9 = zTryLock$default;
                    c0Var = c0Var2;
                    c0Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    lVar = zTryLock$default;
                    c0Var = c0Var2;
                    c0Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                lVar = zTryLock$default;
                if (lVar != 0) {
                    Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[Catch: all -> 0x00fb, IOException -> 0x00fe, TRY_ENTER, TryCatch #8 {IOException -> 0x00fe, all -> 0x00fb, blocks: (B:42:0x00c4, B:44:0x00ca, B:46:0x00d0, B:50:0x00dc, B:51:0x00fa, B:47:0x00d5, B:58:0x0107, B:65:0x0114, B:64:0x0111, B:61:0x010c), top: B:89:0x0025, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca A[Catch: all -> 0x00fb, IOException -> 0x00fe, TryCatch #8 {IOException -> 0x00fe, all -> 0x00fb, blocks: (B:42:0x00c4, B:44:0x00ca, B:46:0x00d0, B:50:0x00dc, B:51:0x00fa, B:47:0x00d5, B:58:0x0107, B:65:0x0114, B:64:0x0111, B:61:0x010c), top: B:89:0x0025, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[Catch: all -> 0x00fb, IOException -> 0x00fe, TryCatch #8 {IOException -> 0x00fe, all -> 0x00fb, blocks: (B:42:0x00c4, B:44:0x00ca, B:46:0x00d0, B:50:0x00dc, B:51:0x00fa, B:47:0x00d5, B:58:0x0107, B:65:0x0114, B:64:0x0111, B:61:0x010c), top: B:89:0x0025, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5 A[Catch: all -> 0x00fb, IOException -> 0x00fe, TryCatch #8 {IOException -> 0x00fe, all -> 0x00fb, blocks: (B:42:0x00c4, B:44:0x00ca, B:46:0x00d0, B:50:0x00dc, B:51:0x00fa, B:47:0x00d5, B:58:0x0107, B:65:0x0114, B:64:0x0111, B:61:0x010c), top: B:89:0x0025, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: all -> 0x00fb, IOException -> 0x00fe, TryCatch #8 {IOException -> 0x00fe, all -> 0x00fb, blocks: (B:42:0x00c4, B:44:0x00ca, B:46:0x00d0, B:50:0x00dc, B:51:0x00fa, B:47:0x00d5, B:58:0x0107, B:65:0x0114, B:64:0x0111, B:61:0x010c), top: B:89:0x0025, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0107 A[Catch: all -> 0x00fb, IOException -> 0x00fe, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00fe, all -> 0x00fb, blocks: (B:42:0x00c4, B:44:0x00ca, B:46:0x00d0, B:50:0x00dc, B:51:0x00fa, B:47:0x00d5, B:58:0x0107, B:65:0x0114, B:64:0x0111, B:61:0x010c), top: B:89:0x0025, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x011e A[Catch: all -> 0x0115, TryCatch #3 {all -> 0x0115, blocks: (B:69:0x0118, B:71:0x011e, B:72:0x0121, B:32:0x0087, B:33:0x00a1), top: B:83:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00dc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.datastore.core.f0, java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object b(y yVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        ?? f0Var;
        ?? r11;
        ?? r10;
        i0 i0Var;
        Throwable th;
        i0 i0Var2;
        ?? r1;
        ?? r2;
        boolean zRenameTo;
        if (cVar instanceof f0) {
            f0 f0Var2 = (f0) cVar;
            int i = f0Var2.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0Var2.C = i - Integer.MIN_VALUE;
                f0Var = f0Var2;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.A;
        ?? file = f0Var.C;
        File file2 = this.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            try {
                try {
                    try {
                        if (file == 0) {
                            kotlin.a.e(obj);
                            if (this.e.get()) {
                                net.luminis.tls.engine.impl.c.r("StorageConnection has already been disposed.");
                                return null;
                            }
                            File parentFile = file2.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    net.luminis.tls.engine.impl.c.u(file2, "Unable to create parent directories of ");
                                    return null;
                                }
                            }
                            f0Var.e = yVar;
                            ?? r12 = this.f;
                            f0Var.y = r12;
                            f0Var.C = 1;
                            Object objLock = r12.lock(null, f0Var);
                            r10 = yVar;
                            r11 = r12;
                            if (objLock != aVar) {
                            }
                            return aVar;
                        }
                        if (file != 1) {
                            if (file != 2) {
                                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i0Var2 = f0Var.z;
                            file = (File) f0Var.y;
                            f0Var = (Mutex) f0Var.e;
                            try {
                                kotlin.a.e(obj);
                                r1 = f0Var;
                                r2 = file;
                                try {
                                    i0Var2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r2.exists()) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = com.google.android.gms.common.wrappers.a.f(r2, file2);
                                    } else {
                                        zRenameTo = r2.renameTo(file2);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + r2 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                r1.unlock(null);
                                return kotlin.y.a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    i0Var2.close();
                                } catch (Throwable th4) {
                                    kotlin.a.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        Mutex mutex = (Mutex) f0Var.y;
                        kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) f0Var.e;
                        kotlin.a.e(obj);
                        r11 = mutex;
                        r10 = pVar;
                        f0Var.e = r11;
                        f0Var.y = file;
                        f0Var.z = i0Var;
                        f0Var.C = 2;
                        if (r10.invoke(i0Var, f0Var) != aVar) {
                            r1 = r11;
                            i0Var2 = i0Var;
                            r2 = file;
                            i0Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r2.exists()) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = com.google.android.gms.common.wrappers.a.f(r2, file2);
                                } else {
                                    zRenameTo = r2.renameTo(file2);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + r2 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            r1.unlock(null);
                            return kotlin.y.a;
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        f0Var = r11;
                        th = th5;
                        i0Var2 = i0Var;
                        i0Var2.close();
                        throw th;
                    }
                    y0 y0Var = this.b;
                    y0Var.getClass();
                    i0Var = new i0(file, y0Var);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(file2.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r11.unlock(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            r11 = f0Var;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            r11 = f0Var;
            r11.unlock(null);
            throw th;
        }
    }

    @Override // androidx.datastore.core.a
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
