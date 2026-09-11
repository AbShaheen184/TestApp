package androidx.sqlite.driver;

import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements androidx.sqlite.c {
    public final androidx.sqlite.db.framework.b e;
    public final String y;
    public boolean z;

    public f(androidx.sqlite.db.framework.b bVar, String str) {
        this.e = bVar;
        this.y = str;
    }

    public final void a() {
        if (this.z) {
            h1.y(21, "statement is closed");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public void j() {
        a();
    }

    @Override // androidx.sqlite.c
    public void reset() {
        a();
    }
}
