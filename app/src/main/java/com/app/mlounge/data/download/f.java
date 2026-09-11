package com.app.mlounge.data.download;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.x;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p {
    public com.app.mlounge.data.local.dao.g A;
    public g0 B;
    public Object C;
    public y D;
    public com.app.mlounge.data.local.dao.g E;
    public Object F;
    public byte[] G;
    public Closeable H;
    public h I;
    public OutputStream J;
    public Object K;
    public InputStream L;
    public x M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public long T;
    public long U;
    public long V;
    public boolean W;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ h Z;
    public final /* synthetic */ long a0;
    public com.app.mlounge.data.local.entity.a e;
    public Serializable y;
    public a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.Z = hVar;
        this.a0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        f fVar = new f(this.Z, this.a0, dVar);
        fVar.Y = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:609:0x0f20
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 4784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.download.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
