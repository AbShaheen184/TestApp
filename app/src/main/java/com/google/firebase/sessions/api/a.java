package com.google.firebase.sessions.api;

import com.google.firebase.crashlytics.internal.common.j;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Mutex a;
    public j b;

    public a(Mutex mutex) {
        mutex.getClass();
        this.a = mutex;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && l.a(this.b, aVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        j jVar = this.b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
