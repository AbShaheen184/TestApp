package com.app.mlounge.data.local;

import androidx.room.f;
import com.app.mlounge.data.local.dao.g;
import com.app.mlounge.data.local.dao.i;
import com.app.mlounge.data.local.dao.j;
import com.app.mlounge.data.local.dao.k;
import com.app.mlounge.data.local.dao.l;
import com.app.mlounge.data.local.dao.m;
import com.app.mlounge.data.local.dao.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public final o l;
    public final o m;
    public final o n;
    public final o o;
    public final o p;
    public final o q;

    public AppDatabase_Impl() {
        final int i = 0;
        this.l = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.b
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new n(this.y);
                    case 1:
                        return new j(this.y);
                    case 2:
                        return new g(this.y);
                    case 3:
                        return new i(this.y);
                    case 4:
                        return new m(this.y);
                    default:
                        return new l(this.y);
                }
            }
        });
        final int i2 = 1;
        this.m = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.b
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new n(this.y);
                    case 1:
                        return new j(this.y);
                    case 2:
                        return new g(this.y);
                    case 3:
                        return new i(this.y);
                    case 4:
                        return new m(this.y);
                    default:
                        return new l(this.y);
                }
            }
        });
        final int i3 = 2;
        this.n = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.b
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new n(this.y);
                    case 1:
                        return new j(this.y);
                    case 2:
                        return new g(this.y);
                    case 3:
                        return new i(this.y);
                    case 4:
                        return new m(this.y);
                    default:
                        return new l(this.y);
                }
            }
        });
        final int i4 = 3;
        this.o = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.b
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return new n(this.y);
                    case 1:
                        return new j(this.y);
                    case 2:
                        return new g(this.y);
                    case 3:
                        return new i(this.y);
                    case 4:
                        return new m(this.y);
                    default:
                        return new l(this.y);
                }
            }
        });
        final int i5 = 4;
        this.p = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.b
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new n(this.y);
                    case 1:
                        return new j(this.y);
                    case 2:
                        return new g(this.y);
                    case 3:
                        return new i(this.y);
                    case 4:
                        return new m(this.y);
                    default:
                        return new l(this.y);
                }
            }
        });
        final int i6 = 5;
        this.q = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.b
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return new n(this.y);
                    case 1:
                        return new j(this.y);
                    case 2:
                        return new g(this.y);
                    case 3:
                        return new i(this.y);
                    case 4:
                        return new m(this.y);
                    default:
                        return new l(this.y);
                }
            }
        });
    }

    @Override // androidx.room.q
    public final List a(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.q
    public final f b() {
        return new f(this, new LinkedHashMap(), new LinkedHashMap(), "watchlist", "history", "downloads", "favourite_games", "watch_progress", "iptv_channels");
    }

    @Override // androidx.room.q
    public final androidx.emoji2.text.g c() {
        return new c(this);
    }

    @Override // androidx.room.q
    public final Set e() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.q
    public final LinkedHashMap f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e eVarA = a0.a(n.class);
        u uVar = u.e;
        linkedHashMap.put(eVarA, uVar);
        linkedHashMap.put(a0.a(j.class), uVar);
        linkedHashMap.put(a0.a(g.class), uVar);
        linkedHashMap.put(a0.a(i.class), uVar);
        linkedHashMap.put(a0.a(m.class), uVar);
        linkedHashMap.put(a0.a(k.class), uVar);
        return linkedHashMap;
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final g k() {
        return (g) this.n.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final i l() {
        return (i) this.o.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final j m() {
        return (j) this.m.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final k n() {
        return (k) this.q.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final m o() {
        return (m) this.p.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final n p() {
        return (n) this.l.getValue();
    }
}
