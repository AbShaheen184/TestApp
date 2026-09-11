package androidx.room;

import androidx.compose.foundation.r0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public CoroutineScope a;
    public kotlin.coroutines.i b;
    public Executor c;
    public w d;
    public androidx.constraintlayout.core.widgets.analyzer.e e;
    public f f;
    public final androidx.media3.common.util.b g = new androidx.media3.common.util.b(new r0(0, this, q.class, "onClosed", "onClosed()V", 0, 4));
    public final ThreadLocal h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();
    public boolean j = true;

    public List a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.a0.u(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.reflect.c cVar = (kotlin.reflect.c) entry.getKey();
            cVar.getClass();
            Class clsA = ((kotlin.jvm.internal.d) cVar).a();
            clsA.getClass();
            linkedHashMap2.put(clsA, entry.getValue());
        }
        return kotlin.collections.u.e;
    }

    public abstract f b();

    public androidx.emoji2.text.g c() {
        throw new kotlin.j(0);
    }

    public final f d() {
        f fVar = this.f;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.l.f("internalTracker");
        throw null;
    }

    public Set e() {
        return kotlin.collections.o.o0(new ArrayList(kotlin.collections.p.y(kotlin.collections.w.e, 10)));
    }

    public LinkedHashMap f() {
        int iU = kotlin.collections.a0.u(kotlin.collections.p.y(kotlin.collections.w.e, 10));
        if (iU < 16) {
            iU = 16;
        }
        return new LinkedHashMap(iU);
    }

    public final boolean g() {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.e;
        if (eVar != null) {
            return ((androidx.sqlite.db.a) eVar.h) != null;
        }
        kotlin.jvm.internal.l.f("connectionManager");
        throw null;
    }

    public final boolean h() {
        if (!i()) {
            return false;
        }
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.e;
        if (eVar == null) {
            kotlin.jvm.internal.l.f("connectionManager");
            throw null;
        }
        androidx.sqlite.db.a aVar = (androidx.sqlite.db.a) eVar.h;
        if (aVar != null) {
            return aVar.y().H();
        }
        net.luminis.tls.engine.impl.c.r("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return false;
    }

    public final boolean i() {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.e;
        if (eVar == null) {
            kotlin.jvm.internal.l.f("connectionManager");
            throw null;
        }
        androidx.sqlite.db.framework.b bVar = (androidx.sqlite.db.framework.b) eVar.i;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final Object j(boolean z, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.e;
        if (eVar != null) {
            return ((androidx.room.coroutines.b) eVar.g).D(z, pVar, cVar);
        }
        kotlin.jvm.internal.l.f("connectionManager");
        throw null;
    }
}
