package dagger.hilt.android.internal.managers;

import androidx.emoji2.text.m;
import androidx.media3.exoplayer.dash.manifest.t;
import com.app.mlounge.CinemaHQApp;
import com.app.mlounge.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements dagger.hilt.internal.b {
    public volatile h e;
    public final Object y = new Object();
    public final t z;

    public g(t tVar) {
        this.z = tVar;
    }

    @Override // dagger.hilt.internal.b
    public final Object a() {
        if (this.e == null) {
            synchronized (this.y) {
                try {
                    if (this.e == null) {
                        this.e = new h(new m((CinemaHQApp) this.z.y, 3));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }
}
