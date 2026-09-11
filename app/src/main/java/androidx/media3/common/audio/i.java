package androidx.media3.common.audio;

import com.google.common.collect.h0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final h0 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public i(h0 h0Var) {
        this.a = h0Var;
        j jVar = j.e;
        this.d = false;
    }

    public final void a() {
        k kVar = k.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long jG = kVar.a;
        int i = 0;
        while (true) {
            h0 h0Var = this.a;
            if (i >= h0Var.size()) {
                break;
            }
            m mVar = (m) h0Var.get(i);
            mVar.d(new k(jG));
            if (mVar.isActive()) {
                jG = mVar.g(jG);
                com.google.android.material.motion.a.q(jG >= 0);
                arrayList.add(mVar);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((m) arrayList.get(i2)).b();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((m) this.b.get(b())).a() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= b(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    m mVar = (m) arrayList.get(i);
                    if (!mVar.a()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : m.a;
                        long jRemaining = byteBuffer2.remaining();
                        mVar.c(byteBuffer2);
                        this.c[i] = mVar.b();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((m) arrayList.get(i + 1)).e();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        h0 h0Var = ((i) obj).a;
        h0 h0Var2 = this.a;
        if (h0Var2.size() != h0Var.size()) {
            return false;
        }
        for (int i = 0; i < h0Var2.size(); i++) {
            if (h0Var2.get(i) != h0Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
