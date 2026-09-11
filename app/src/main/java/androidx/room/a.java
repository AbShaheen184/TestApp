package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Context a;
    public final String b;
    public final com.google.firebase.heartbeatinfo.e c;
    public final androidx.collection.internal.b d;
    public final List e;
    public final p f;
    public final Executor g;
    public final Executor h;
    public final boolean i;
    public final boolean j;
    public final Set k;
    public final List l;
    public final List m;
    public final boolean n;
    public final androidx.sqlite.b o;
    public final kotlin.coroutines.i p;

    public a(Context context, String str, com.google.firebase.heartbeatinfo.e eVar, androidx.collection.internal.b bVar, List list, boolean z, p pVar, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, androidx.sqlite.b bVar2, kotlin.coroutines.i iVar) {
        bVar.getClass();
        this.a = context;
        this.b = str;
        this.c = eVar;
        this.d = bVar;
        this.e = list;
        this.f = pVar;
        this.g = executor;
        this.h = executor2;
        this.i = z2;
        this.j = z3;
        this.k = set;
        this.l = list2;
        this.m = list3;
        this.n = z4;
        this.o = bVar2;
        this.p = iVar;
    }
}
