package com.google.firebase.crashlytics.internal.persistence;

import android.util.Log;
import com.appsalt.internal.j0;
import com.google.firebase.crashlytics.internal.common.h;
import com.google.firebase.crashlytics.internal.common.j;
import com.google.firebase.crashlytics.internal.model.j2;
import io.hopmonsdk.Hopmn;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final com.google.firebase.crashlytics.internal.model.serialization.a g = new com.google.firebase.crashlytics.internal.model.serialization.a();
    public static final androidx.compose.foundation.lazy.layout.a h = new androidx.compose.foundation.lazy.layout.a(26);
    public static final h i = new h(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final c b;
    public final j0 c;
    public final j d;

    public a(c cVar, j0 j0Var, j jVar) {
        this.b = cVar;
        this.c = j0Var;
        this.d = jVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.b;
        arrayList.addAll(c.k(((File) cVar.f).listFiles()));
        arrayList.addAll(c.k(((File) cVar.g).listFiles()));
        androidx.compose.foundation.lazy.layout.a aVar = h;
        Collections.sort(arrayList, aVar);
        List listK = c.k(((File) cVar.e).listFiles());
        Collections.sort(listK, aVar);
        arrayList.addAll(listK);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.k(((File) this.b.d).list())).descendingSet();
    }

    public final void d(j2 j2Var, String str, boolean z) {
        c cVar = this.b;
        int i2 = this.c.b().a.e;
        g.getClass();
        try {
            f(cVar.f(str, androidx.privacysandbox.ads.adservices.java.internal.a.q(Hopmn.EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), com.google.firebase.crashlytics.internal.model.serialization.a.a.c(j2Var));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        h hVar = new h(3);
        cVar.getClass();
        File file = new File((File) cVar.d, str);
        file.mkdirs();
        List<File> listK = c.k(file.listFiles(hVar));
        Collections.sort(listK, new androidx.compose.foundation.lazy.layout.a(27));
        int size = listK.size();
        for (File file2 : listK) {
            if (size <= i2) {
                return;
            }
            c.j(file2);
            size--;
        }
    }
}
