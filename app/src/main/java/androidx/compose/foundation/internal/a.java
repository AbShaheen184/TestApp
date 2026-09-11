package androidx.compose.foundation.internal;

import android.os.Parcel;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.unit.o;
import androidx.compose.ui.unit.p;
import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public Parcel a;

    public long a() {
        int i = t.j;
        long j = this.a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    public long b() {
        long j;
        Parcel parcel = this.a;
        byte b = parcel.readByte();
        if (b == 1) {
            j = 4294967296L;
        } else {
            j = b == 2 ? 8589934592L : 0L;
        }
        return p.a(j, 0L) ? o.c : h1.u(parcel.readFloat(), j);
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long jB = o.b(j);
        byte b = 0;
        if (!p.a(jB, 0L)) {
            if (p.a(jB, 4294967296L)) {
                b = 1;
            } else if (p.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (p.a(o.b(j), 0L)) {
            return;
        }
        d(o.c(j));
    }

    public void f(long j) {
        long j2 = 63 & j;
        if (Long.compare(Long.MIN_VALUE ^ j2, -9223372036854775792L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        this.a.writeLong(j);
    }
}
