package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.v1;
import androidx.compose.runtime.q1;
import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.compose.foundation.lazy.layout.y {
    public final x a;
    public final h b;
    public final androidx.appcompat.widget.x c;

    public i(x xVar, h hVar, androidx.appcompat.widget.x xVar2) {
        this.a = xVar;
        this.b = hVar;
        this.c = xVar2;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final int a() {
        return this.b.k().y;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final Object b(int i) {
        androidx.appcompat.widget.x xVar = this.c;
        Object[] objArr = (Object[]) xVar.A;
        int i2 = i - xVar.y;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.l(i) : obj;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final Object c(int i) {
        return this.b.j(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final void d(int i, Object obj, androidx.compose.runtime.r rVar, int i2) {
        rVar.c0(1493551140);
        int i3 = (rVar.d(i) ? 4 : 2) | i2 | (rVar.h(obj) ? 32 : 16) | (rVar.f(this) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            androidx.compose.foundation.lazy.layout.m.b(obj, i, this.a.q, androidx.compose.runtime.internal.k.c(726189336, new androidx.compose.foundation.lazy.l(this, i, 1), rVar), rVar, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & Token.ASSIGN_MOD));
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new v1(this, i, obj, i2, 3);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final int e(Object obj) {
        return this.c.k(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.b, ((i) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
