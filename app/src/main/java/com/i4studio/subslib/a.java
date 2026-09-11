package com.i4studio.subslib;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public Iterator A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ b E;
    public int F;
    public com.i4studio.subslib.model.a e;
    public String y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.E = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(null, this);
    }
}
