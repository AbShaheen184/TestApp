package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public int a;
    public final Object b;
    public final Object c;

    public g(int i) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = i;
    }

    public static g d(c0 c0Var, int i) {
        if (i == 0) {
            return new androidx.recyclerview.widget.s(c0Var, 0);
        }
        if (i == 1) {
            return new androidx.recyclerview.widget.s(c0Var, 1);
        }
        net.luminis.tls.engine.impl.c.o("invalid orientation");
        return null;
    }

    public void a(Exception exc) {
        ((ArrayList) this.c).add(exc);
    }

    public void b(org.schabi.newpipe.extractor.d dVar) {
        try {
            ((ArrayList) this.b).add((org.schabi.newpipe.extractor.c) f(dVar));
        } catch (org.schabi.newpipe.extractor.exceptions.e unused) {
        } catch (org.schabi.newpipe.extractor.exceptions.f e) {
            a(e);
        }
    }

    public abstract void c(androidx.sqlite.a aVar);

    public abstract void e(androidx.sqlite.a aVar);

    public abstract Object f(org.schabi.newpipe.extractor.d dVar);

    public abstract int g(View view);

    public abstract int h(View view);

    public abstract int i(View view);

    public abstract int j(View view);

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public List n() {
        return Collections.unmodifiableList((ArrayList) this.c);
    }

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s(View view);

    public abstract int t(View view);

    public abstract void u(int i);

    public abstract void v(androidx.sqlite.a aVar);

    public abstract void w(androidx.sqlite.a aVar);

    public abstract void x(androidx.sqlite.a aVar);

    public abstract void y(androidx.sqlite.a aVar);

    public abstract androidx.room.t z(androidx.sqlite.a aVar);

    public g(c0 c0Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = c0Var;
    }

    public g(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public g(i iVar) {
        this.a = 0;
        this.c = new d();
        this.b = iVar;
    }
}
