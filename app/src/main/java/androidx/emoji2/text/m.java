package androidx.emoji2.text;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements i {
    public Context a;

    public m(Context context, int i) {
        switch (i) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            case 2:
            default:
                this.a = context.getApplicationContext();
                break;
            case 3:
                this.a = context;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(androidx.media3.common.r r5) {
        /*
            java.lang.String r0 = r5.o
            r1 = 0
            if (r0 == 0) goto L86
            boolean r0 = androidx.media3.common.i0.m(r0)
            if (r0 != 0) goto Ld
            goto L86
        Ld:
            java.lang.String r5 = r5.o
            java.lang.String r0 = androidx.media3.common.util.j0.a
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r1
        L6b:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L7c;
                default: goto L6e;
            }
        L6e:
            goto L81
        L6f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L81
            goto L7c
        L76:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L81
        L7c:
            int r5 = androidx.media3.exoplayer.a.f(r2, r1, r1, r1)
            return r5
        L81:
            int r5 = androidx.media3.exoplayer.a.f(r3, r1, r1, r1)
            return r5
        L86:
            int r5 = androidx.media3.exoplayer.a.f(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.m.c(androidx.media3.common.r):int");
    }

    @Override // androidx.emoji2.text.i
    public void a(okhttp3.internal.platform.android.g gVar) {
        a aVar = new a("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.compose.foundation.text.contextmenu.internal.g(1, this, gVar, threadPoolExecutor));
    }

    public com.google.android.datatransport.runtime.j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j();
        jVar.e = com.google.android.datatransport.runtime.dagger.internal.a.a(com.google.android.datatransport.runtime.l.a);
        com.google.android.datatransport.runtime.backends.e eVar = new com.google.android.datatransport.runtime.backends.e(context, 1);
        jVar.y = eVar;
        jVar.z = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.backends.g(eVar, new com.google.android.datatransport.runtime.backends.e(eVar, 0), 0));
        com.google.android.datatransport.runtime.backends.e eVar2 = jVar.y;
        jVar.A = new com.google.android.datatransport.runtime.scheduling.persistence.c(eVar2, 1);
        javax.inject.a aVarA = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.backends.g(jVar.A, com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.scheduling.persistence.c(eVar2, 0)), 1));
        jVar.B = aVarA;
        com.google.android.datatransport.runtime.m mVar = new com.google.android.datatransport.runtime.m(1);
        com.google.android.datatransport.runtime.backends.e eVar3 = jVar.y;
        com.google.android.datatransport.runtime.s sVar = new com.google.android.datatransport.runtime.s(eVar3, aVarA, mVar, 1);
        javax.inject.a aVar = jVar.e;
        javax.inject.a aVar2 = jVar.z;
        jVar.C = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.s(new com.google.android.datatransport.runtime.scheduling.b(aVar, aVar2, sVar, aVarA, aVarA), new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(eVar3, aVar2, aVarA, sVar, aVar, aVarA, aVarA), new com.google.android.datatransport.runtime.scheduling.jobscheduling.m(aVar, aVarA, sVar, aVarA), 0));
        return jVar;
    }
}
