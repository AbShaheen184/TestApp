package com.google.gson;

import com.google.gson.internal.bind.f1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public boolean b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final g d() {
        if (this instanceof g) {
            return (g) this;
        }
        b.m(this, "Not a JSON Array: ");
        return null;
    }

    public final k e() {
        if (this instanceof k) {
            return (k) this;
        }
        b.m(this, "Not a JSON Object: ");
        return null;
    }

    public long f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            com.google.gson.stream.b bVar = new com.google.gson.stream.b(new androidx.fragment.app.j(sb));
            bVar.E = 1;
            f1.z.getClass();
            com.google.gson.internal.bind.l.e(this, bVar);
            return sb.toString();
        } catch (IOException e) {
            net.luminis.tls.engine.impl.c.m(e);
            return null;
        }
    }
}
