package coil3.disk;

import androidx.compose.foundation.lazy.layout.b1;
import java.io.IOException;
import java.util.ArrayList;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public b1 g;
    public int h;
    public final /* synthetic */ d i;

    public a(d dVar, String str) {
        this.i = dVar;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.e.g(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.e.g(sb.toString()));
            sb.setLength(length);
        }
    }

    public final b a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            d dVar = this.i;
            if (i >= size) {
                this.h++;
                return new b(dVar, this);
            }
            if (!dVar.N.N((x) arrayList.get(i))) {
                try {
                    dVar.Y(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
