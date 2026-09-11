package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class i extends IOException {
    public final int e;

    public i(int i) {
        this.e = i;
    }

    public i(Exception exc, int i) {
        super(exc);
        this.e = i;
    }

    public i(String str, int i) {
        super(str);
        this.e = i;
    }

    public i(String str, Exception exc, int i) {
        super(str, exc);
        this.e = i;
    }
}
