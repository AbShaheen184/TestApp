package okhttp3.internal.cache;

import androidx.compose.foundation.lazy.layout.b1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import okio.h0;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public b1 g;
    public int h;
    public long i;
    public final /* synthetic */ h j;

    public d(h hVar, String str) {
        str.getClass();
        this.j = hVar;
        this.a = str;
        hVar.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.j.e.g(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.j.e.g(sb.toString()));
            sb.setLength(length);
        }
    }

    public final e a() {
        TimeZone timeZone = okhttp3.internal.g.a;
        if (!this.e) {
            return null;
        }
        h hVar = this.j;
        if (!hVar.I && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                h0 h0VarC0 = hVar.y.c0((x) this.c.get(i));
                if (!hVar.I) {
                    this.h++;
                    h0VarC0 = new c(h0VarC0, hVar, this);
                }
                arrayList.add(h0VarC0);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    okhttp3.internal.e.b((h0) it.next());
                }
                try {
                    hVar.a0(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new e(this.j, this.a, this.i, arrayList, jArr);
    }
}
