package androidx.media3.datasource;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;

    public final l a() {
        com.google.android.material.motion.a.m(this.a, "The uri must be set.");
        return new l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
