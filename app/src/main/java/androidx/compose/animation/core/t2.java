package androidx.compose.animation.core;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements o2, com.google.android.gms.dynamite.c {
    public final int e;

    public /* synthetic */ t2(int i) {
        this.e = i;
    }

    public static androidx.media3.exoplayer.upstream.h e(androidx.media3.exoplayer.upstream.g gVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar) {
        IOException iOException = (IOException) lVar.z;
        if (!(iOException instanceof androidx.media3.datasource.t)) {
            return null;
        }
        int i = ((androidx.media3.datasource.t) iOException).z;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (gVar.a(1)) {
            return new androidx.media3.exoplayer.upstream.h(1, 300000L);
        }
        if (gVar.a(2)) {
            return new androidx.media3.exoplayer.upstream.h(2, 60000L);
        }
        return null;
    }

    public static long g(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar) {
        for (Throwable cause = (IOException) lVar.z; cause != null; cause = cause.getCause()) {
            if ((cause instanceof androidx.media3.common.j0) || (cause instanceof FileNotFoundException) || (cause instanceof androidx.media3.datasource.q) || (cause instanceof androidx.media3.exoplayer.upstream.m)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof androidx.media3.datasource.i) && ((androidx.media3.datasource.i) cause).e == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((lVar.y - 1) * 1000, 5000);
    }

    @Override // com.google.android.gms.dynamite.c
    public int c(Context context, String str, boolean z) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.c
    public int d(Context context, String str) {
        return this.e;
    }

    public int f(int i) {
        int i2 = this.e;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    @Override // androidx.compose.animation.core.o2
    public int p() {
        return this.e;
    }

    @Override // androidx.compose.animation.core.m2
    public s t(long j, s sVar, s sVar2, s sVar3) {
        return j < ((long) this.e) * 1000000 ? sVar : sVar2;
    }

    @Override // androidx.compose.animation.core.o2
    public int u() {
        return 0;
    }

    @Override // androidx.compose.animation.core.m2
    public s i(long j, s sVar, s sVar2, s sVar3) {
        return sVar3;
    }
}
