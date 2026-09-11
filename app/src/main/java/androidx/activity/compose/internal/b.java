package androidx.activity.compose.internal;

import androidx.activity.d0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public Object a;
    public final Object b;

    public b(com.google.firebase.b bVar) {
        this.a = new d0(this, 1);
        this.b = new a(this, bVar);
    }

    public abstract int[] a(int i);

    public int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String c() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        l.f("text");
        throw null;
    }

    public boolean d() {
        return ((d0) this.a).b && ((a) this.b).b;
    }

    public abstract void f();

    public abstract int[] i(int i);

    public b() {
        this.b = new int[2];
    }

    public void e() {
    }

    public void h() {
    }

    public void g(androidx.activity.a aVar) {
    }
}
