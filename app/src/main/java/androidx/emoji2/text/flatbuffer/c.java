package androidx.emoji2.text.flatbuffer;

import androidx.collection.g;
import com.google.firebase.heartbeatinfo.e;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public Object A;
    public int e;
    public int y;
    public int z;

    public c() {
        if (e.e == null) {
            e.e = new e();
        }
    }

    public int b(int i) {
        if (i < this.z) {
            return ((ByteBuffer) this.A).getShort(this.y + i);
        }
        return 0;
    }

    public void c() {
        if (((kotlin.collections.builders.e) this.A).E == this.z) {
            return;
        }
        g.d();
    }

    public void d() {
        while (true) {
            int i = this.e;
            kotlin.collections.builders.e eVar = (kotlin.collections.builders.e) this.A;
            if (i >= eVar.C || eVar.z[i] >= 0) {
                return;
            } else {
                this.e = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.e < ((kotlin.collections.builders.e) this.A).C;
    }

    public void remove() {
        kotlin.collections.builders.e eVar = (kotlin.collections.builders.e) this.A;
        c();
        if (this.y == -1) {
            net.luminis.tls.engine.impl.c.r("Call next() before removing element from the iterator.");
            return;
        }
        eVar.c();
        eVar.k(this.y);
        this.y = -1;
        this.z = eVar.E;
    }
}
