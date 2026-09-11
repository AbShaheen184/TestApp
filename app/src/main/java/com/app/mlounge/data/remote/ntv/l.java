package com.app.mlounge.data.remote.ntv;

import android.content.Context;
import androidx.compose.foundation.text.u0;
import androidx.room.z;
import kotlin.collections.a0;
import kotlin.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final Object b = a0.v(new kotlin.k("Origin", "https://cdnlivetv.tv"), new kotlin.k("Referer", "https://cdnlivetv.tv/"), new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"));
    public final y a;

    public l(y yVar) {
        yVar.getClass();
        this.a = yVar;
    }

    public static Object a(l lVar, Context context, String str, kotlin.coroutines.jvm.internal.c cVar) {
        z zVar = new z(19);
        lVar.getClass();
        return TimeoutKt.withTimeoutOrNull(25000L, new e(context, str, zVar, null, 1), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, String str, String str2, String str3, kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i = jVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.A = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objWithContext = jVar.y;
        int i2 = jVar.A;
        int i3 = 3;
        kotlin.coroutines.d dVar = null;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(objWithContext);
            if (str3 != null) {
                jVar.e = null;
                jVar.A = 1;
                Object objA = a(this, context, str3, jVar);
                if (objA != aVar) {
                    return objA;
                }
            } else {
                String strE = coil3.compose.internal.f.e("https://ntv.cx/watch/", str, "/", str2);
                o oVar = com.app.mlounge.util.a.a;
                jVar.e = context;
                jVar.A = 2;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new u0(strE, this, dVar, i3), jVar);
                if (objWithContext != aVar) {
                }
            }
        }
        if (i2 == 1) {
            kotlin.a.e(objWithContext);
            return objWithContext;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                kotlin.a.e(objWithContext);
                return objWithContext;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = jVar.e;
        kotlin.a.e(objWithContext);
        String str4 = (String) objWithContext;
        if (str4 == null) {
            return null;
        }
        jVar.e = null;
        jVar.A = 3;
        Object objA2 = a(this, context, str4, jVar);
        return objA2 == aVar ? aVar : objA2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        if (r2 == r11) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, kotlin.coroutines.jvm.internal.c r19) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.ntv.l.c(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
