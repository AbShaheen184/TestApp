package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.p2;
import com.google.protobuf.c2;
import com.google.protobuf.d2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Iterator {
    public Iterator A;
    public final /* synthetic */ AbstractMap B;
    public final /* synthetic */ int e;
    public int y;
    public boolean z;

    public /* synthetic */ y0(o2 o2Var) {
        this.e = 1;
        Objects.requireNonNull(o2Var);
        this.B = o2Var;
        this.y = -1;
    }

    public Iterator b() {
        switch (this.e) {
            case 0:
                if (this.A == null) {
                    this.A = ((w0) this.B).y.entrySet().iterator();
                }
                break;
            default:
                if (this.A == null) {
                    this.A = ((c2) this.B).z.entrySet().iterator();
                }
                break;
        }
        return this.A;
    }

    public Iterator c() {
        if (this.A == null) {
            this.A = ((o2) this.B).z.entrySet().iterator();
        }
        return this.A;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                int i = this.y + 1;
                w0 w0Var = (w0) this.B;
                if (i >= w0Var.e.size()) {
                    return !w0Var.y.isEmpty() && b().hasNext();
                }
                return true;
            case 1:
                int i2 = this.y + 1;
                o2 o2Var = (o2) this.B;
                if (i2 >= o2Var.y) {
                    return !o2Var.z.isEmpty() && c().hasNext();
                }
                return true;
            default:
                int i3 = this.y + 1;
                c2 c2Var = (c2) this.B;
                if (i3 >= c2Var.y) {
                    return !c2Var.z.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                this.z = true;
                int i = this.y + 1;
                this.y = i;
                w0 w0Var = (w0) this.B;
                return i < w0Var.e.size() ? (Map.Entry) w0Var.e.get(this.y) : (Map.Entry) b().next();
            case 1:
                this.z = true;
                int i2 = this.y + 1;
                this.y = i2;
                o2 o2Var = (o2) this.B;
                return i2 < o2Var.y ? (p2) o2Var.e[i2] : (Map.Entry) c().next();
            default:
                this.z = true;
                int i3 = this.y + 1;
                this.y = i3;
                c2 c2Var = (c2) this.B;
                return i3 < c2Var.y ? (d2) c2Var.e[i3] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.e;
        AbstractMap abstractMap = this.B;
        switch (i) {
            case 0:
                w0 w0Var = (w0) abstractMap;
                if (!this.z) {
                    net.luminis.tls.engine.impl.c.r("remove() was called before next()");
                } else {
                    this.z = false;
                    int i2 = w0.C;
                    w0Var.b();
                    if (this.y >= w0Var.e.size()) {
                        b().remove();
                    } else {
                        int i3 = this.y;
                        this.y = i3 - 1;
                        w0Var.h(i3);
                    }
                }
                break;
            case 1:
                if (!this.z) {
                    net.luminis.tls.engine.impl.c.r("remove() was called before next()");
                } else {
                    this.z = false;
                    o2 o2Var = (o2) abstractMap;
                    o2Var.f();
                    int i4 = this.y;
                    if (i4 >= o2Var.y) {
                        c().remove();
                    } else {
                        this.y = i4 - 1;
                        o2Var.d(i4);
                    }
                }
                break;
            default:
                c2 c2Var = (c2) abstractMap;
                if (!this.z) {
                    net.luminis.tls.engine.impl.c.r("remove() was called before next()");
                } else {
                    this.z = false;
                    int i5 = c2.D;
                    c2Var.b();
                    int i6 = this.y;
                    if (i6 >= c2Var.y) {
                        b().remove();
                    } else {
                        this.y = i6 - 1;
                        c2Var.h(i6);
                    }
                }
                break;
        }
    }

    public /* synthetic */ y0(AbstractMap abstractMap, int i) {
        this.e = i;
        this.B = abstractMap;
        this.y = -1;
    }
}
