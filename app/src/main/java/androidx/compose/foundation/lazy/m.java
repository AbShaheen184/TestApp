package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.v1;
import androidx.compose.runtime.q1;
import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements androidx.compose.foundation.lazy.layout.y {
    public final z a;
    public final k b;
    public final d c;
    public final androidx.appcompat.widget.x d;

    public m(z zVar, k kVar, d dVar, androidx.appcompat.widget.x xVar) {
        this.a = zVar;
        this.b = kVar;
        this.c = dVar;
        this.d = xVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final int a() {
        return this.b.k().y;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final Object b(int i) {
        androidx.appcompat.widget.x xVar = this.d;
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
        rVar.c0(-462424778);
        int i3 = (rVar.d(i) ? 4 : 2) | i2 | (rVar.h(obj) ? 32 : 16) | (rVar.f(this) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            androidx.compose.foundation.lazy.layout.m.b(obj, i, this.a.r, androidx.compose.runtime.internal.k.c(-824725566, new l(this, i, 0), rVar), rVar, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & Token.ASSIGN_MOD));
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new v1(this, i, obj, i2, 2);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final int e(Object obj) {
        return this.d.k(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.b, ((m) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
