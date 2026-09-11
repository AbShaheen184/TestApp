package androidx.navigation.internal;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.o;
import androidx.lifecycle.o0;
import androidx.lifecycle.x;
import androidx.navigation.i;
import androidx.navigation.m;
import androidx.navigation.t;
import java.util.Arrays;
import kotlin.jvm.internal.a0;
import kotlin.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final i a;
    public final t b;
    public final Bundle c;
    public o d;
    public final m e;
    public final String f;
    public final Bundle g;
    public final androidx.savedstate.f h;
    public boolean i;
    public final x j;
    public o k;
    public final o0 l;
    public final kotlin.o m;

    public c(i iVar) {
        this.a = iVar;
        this.b = iVar.y;
        this.c = iVar.z;
        this.d = iVar.A;
        this.e = iVar.B;
        this.f = iVar.C;
        this.g = iVar.D;
        this.h = new androidx.savedstate.f(new androidx.savedstate.internal.a(iVar, new androidx.room.coroutines.d(iVar, 2)));
        kotlin.o oVar = new kotlin.o(new androidx.compose.runtime.saveable.f(6));
        this.j = new x(iVar, true);
        this.k = o.y;
        this.l = (o0) oVar.getValue();
        this.m = new kotlin.o(new androidx.compose.runtime.saveable.f(7));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleI = coil3.network.g.i((k[]) Arrays.copyOf(new k[0], 0));
        bundleI.putAll(bundle);
        return bundleI;
    }

    public final void b() {
        if (!this.i) {
            androidx.savedstate.f fVar = this.h;
            fVar.a();
            this.i = true;
            if (this.e != null) {
                l0.c(this.a);
            }
            fVar.b(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.k.ordinal();
        x xVar = this.j;
        if (iOrdinal < iOrdinal2) {
            o oVar = this.d;
            xVar.getClass();
            oVar.getClass();
            xVar.d("setCurrentState");
            xVar.f(oVar);
            return;
        }
        o oVar2 = this.k;
        xVar.getClass();
        oVar2.getClass();
        xVar.d("setCurrentState");
        xVar.f(oVar2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a0.a(i.class).c());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
