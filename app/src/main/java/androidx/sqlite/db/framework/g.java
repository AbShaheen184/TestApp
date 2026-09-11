package androidx.sqlite.db.framework;

import android.content.Context;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.sqlite.db.a {
    public final o A;
    public boolean B;
    public final Context e;
    public final String y;
    public final l z;

    public g(Context context, String str, l lVar) {
        lVar.getClass();
        this.e = context;
        this.y = str;
        this.z = lVar;
        this.A = new o(new androidx.room.coroutines.d(this, 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o oVar = this.A;
        if (oVar.a()) {
            ((f) oVar.getValue()).close();
        }
    }

    @Override // androidx.sqlite.db.a
    public final String getDatabaseName() {
        return this.y;
    }

    @Override // androidx.sqlite.db.a
    public final void setWriteAheadLoggingEnabled(boolean z) {
        o oVar = this.A;
        if (oVar.a()) {
            ((f) oVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.B = z;
    }

    @Override // androidx.sqlite.db.a
    public final b y() {
        return ((f) this.A.getValue()).a(true);
    }
}
