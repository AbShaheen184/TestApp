package com.google.firebase.sessions.api;

import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {
    public Mutex A;
    public Map B;
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ c E;
    public int F;
    public Map e;
    public Iterator y;
    public d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.E = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(this);
    }
}
