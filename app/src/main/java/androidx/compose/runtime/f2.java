package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements androidx.compose.runtime.tooling.c, Iterable, kotlin.jvm.internal.markers.a {
    public int A;
    public int B;
    public boolean D;
    public int E;
    public HashMap G;
    public androidx.collection.z H;
    public int y;
    public int[] e = new int[0];
    public Object[] z = new Object[0];
    public final Object C = new Object();
    public ArrayList F = new ArrayList();

    public final int b(a aVar) {
        if (this.D) {
            t.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            n1.a("Anchor refers to a group that was removed");
        }
        return aVar.a;
    }

    public final void c() {
        this.G = new HashMap();
    }

    public final e2 d() {
        if (this.D) {
            net.luminis.tls.engine.impl.c.r("Cannot read while a writer is pending");
            return null;
        }
        this.B++;
        return new e2(this);
    }

    public final i2 e() {
        if (this.D) {
            t.a("Cannot start a writer when another writer is pending");
        }
        if (this.B > 0) {
            t.a("Cannot start a writer when a reader is pending");
        }
        this.D = true;
        this.E++;
        return new i2(this);
    }

    public final boolean f(a aVar) {
        int iD;
        return aVar.a() && (iD = h2.d(this.F, aVar.a, this.y)) >= 0 && kotlin.jvm.internal.l.a(this.F.get(iD), aVar);
    }

    public final n0 h(int i) {
        int i2;
        ArrayList arrayList;
        int iD;
        HashMap map = this.G;
        if (map != null) {
            if (this.D) {
                t.a("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i < 0 || i >= (i2 = this.y) || (iD = h2.d((arrayList = this.F), i, i2)) < 0) ? null : (a) arrayList.get(iD);
            if (aVar != null) {
                return (n0) map.get(aVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new m0(this, 0, this.y);
    }
}
