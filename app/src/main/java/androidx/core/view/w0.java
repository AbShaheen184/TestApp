package androidx.core.view;

import com.google.android.gms.internal.measurement.vg;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {
    public final /* synthetic */ int e = 1;
    public int y;
    public Object z;

    public w0(vg vgVar, int i) {
        if (vgVar == null) {
            net.luminis.tls.engine.impl.c.o("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.y = i;
        this.z = vgVar;
    }

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract String G();

    public abstract String H();

    public abstract int I();

    public abstract int J();

    public abstract long K();

    public abstract boolean L(int i);

    public void M() throws androidx.datastore.preferences.protobuf.x {
        boolean zL;
        do {
            int I = I();
            if (I == 0) {
                return;
            }
            int i = this.y;
            if (i >= 100) {
                throw new androidx.datastore.preferences.protobuf.x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.y = i + 1;
            zL = L(I);
            this.y--;
        } while (zL);
    }

    public abstract void N();

    public abstract void O(androidx.emoji2.text.s sVar, Object obj);

    public abstract void a(int i);

    public abstract org.schabi.newpipe.extractor.linkhandler.c b();

    public org.schabi.newpipe.extractor.localization.c c() {
        org.schabi.newpipe.extractor.localization.c cVar = com.google.android.material.textfield.p.b;
        org.schabi.newpipe.extractor.localization.c cVar2 = org.schabi.newpipe.extractor.localization.c.z;
        if (cVar == null) {
            cVar = cVar2;
        }
        if (j().contains(cVar)) {
            return cVar;
        }
        for (org.schabi.newpipe.extractor.localization.c cVar3 : j()) {
            if (cVar3.e.equals(cVar.e)) {
                return cVar3;
            }
        }
        return cVar2;
    }

    public abstract org.schabi.newpipe.extractor.playlist.a d(org.schabi.newpipe.extractor.linkhandler.b bVar);

    public abstract org.schabi.newpipe.extractor.linkhandler.c e();

    public abstract org.schabi.newpipe.extractor.f f(org.schabi.newpipe.extractor.linkhandler.a aVar);

    public abstract com.google.common.base.b g();

    public List h() {
        return Collections.singletonList(org.schabi.newpipe.extractor.localization.a.y);
    }

    public List j() {
        return Collections.singletonList(org.schabi.newpipe.extractor.localization.c.z);
    }

    public abstract int k();

    public abstract boolean l();

    public abstract void m(int i, int i2);

    public abstract z1 p(z1 z1Var, List list);

    public abstract androidx.compose.foundation.text.input.internal.o q(f1 f1Var, androidx.compose.foundation.text.input.internal.o oVar);

    public abstract void r(int i);

    public abstract int s(int i);

    public abstract boolean t();

    public String toString() {
        switch (this.e) {
            case 4:
                return this.y + ":" + ((androidx.media3.container.a) this.z).e;
            default:
                return super.toString();
        }
    }

    public abstract androidx.datastore.preferences.protobuf.f u();

    public abstract double v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract float z();

    public void o() {
    }

    public void n(f1 f1Var) {
    }

    public /* synthetic */ w0() {
    }

    public w0(int i, String str) {
        this.y = i;
        this.z = new androidx.media3.container.a(str, false);
    }

    public w0(int i) {
        this.y = i;
    }
}
