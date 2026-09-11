package com.google.firebase.sessions;

import android.os.Build;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.attribute.FileAttribute;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static androidx.datastore.core.z a(androidx.datastore.core.y0 y0Var, androidx.compose.ui.draw.i iVar, CoroutineScope coroutineScope, kotlin.jvm.functions.a aVar) {
        kotlin.collections.u uVar = kotlin.collections.u.e;
        try {
            System.loadLibrary("datastore_shared_counter");
            coroutineScope.getClass();
            return new androidx.datastore.core.z(new androidx.datastore.core.d0(y0Var, new androidx.compose.ui.text.font.e(coroutineScope, 3), aVar), com.google.common.base.c.p(new androidx.activity.compose.p(uVar, (kotlin.coroutines.d) null, 22)), iVar, coroutineScope);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            coroutineScope.getClass();
            return new androidx.datastore.core.z(new androidx.datastore.core.d0(y0Var, new androidx.compose.ui.text.y(11), aVar), com.google.common.base.c.p(new androidx.activity.compose.p(uVar, (kotlin.coroutines.d) null, 22)), iVar, coroutineScope);
        }
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.l.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            net.luminis.tls.engine.impl.c.u(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (parentFile.mkdirs() || parentFile.isDirectory()) {
                return;
            }
            net.luminis.tls.engine.impl.c.u(parentFile, "Failed to create directory: ");
            return;
        }
        try {
            Files.createDirectories(FileRetargetClass.toPath(parentFile), new FileAttribute[0]);
        } catch (Exception e) {
            throw new IOException("Failed to create directory: " + parentFile, e);
        }
    }
}
