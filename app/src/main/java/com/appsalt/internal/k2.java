package com.appsalt.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int e = 0;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(i3 i3Var, j4 j4Var, e3 e3Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = i3Var;
        this.F = j4Var;
        this.G = e3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new k2((i3) this.D, (j4) this.F, (e3) this.G, dVar);
            default:
                return new k2((com.google.firebase.sessions.t0) this.F, (com.google.firebase.sessions.p0) this.G, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((k2) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x0240  */
    /* JADX WARN: Code duplicated, block: B:77:0x026d A[PHI: r0 r2
  0x026d: PHI (r0v22 kotlinx.coroutines.channels.ChannelIterator) = 
  (r0v15 kotlinx.coroutines.channels.ChannelIterator)
  (r0v21 kotlinx.coroutines.channels.ChannelIterator)
  (r0v24 kotlinx.coroutines.channels.ChannelIterator)
 binds: [B:76:0x0264, B:83:0x0298, B:51:0x0158] A[DONT_GENERATE, DONT_INLINE]
  0x026d: PHI (r2v30 com.appsalt.internal.i3) = (r2v22 com.appsalt.internal.i3), (r2v29 com.appsalt.internal.i3), (r2v32 com.appsalt.internal.i3) binds: [B:76:0x0264, B:83:0x0298, B:51:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x027f A[PHI: r0 r2 r3
  0x027f: PHI (r0v21 kotlinx.coroutines.channels.ChannelIterator) = (r0v20 kotlinx.coroutines.channels.ChannelIterator), (r0v22 kotlinx.coroutines.channels.ChannelIterator) binds: [B:52:0x0165, B:78:0x027c] A[DONT_GENERATE, DONT_INLINE]
  0x027f: PHI (r2v29 com.appsalt.internal.i3) = (r2v27 com.appsalt.internal.i3), (r2v30 com.appsalt.internal.i3) binds: [B:52:0x0165, B:78:0x027c] A[DONT_GENERATE, DONT_INLINE]
  0x027f: PHI (r3v20 java.lang.Object) = (r3v19 java.lang.Object), (r3v27 java.lang.Object) binds: [B:52:0x0165, B:78:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0287  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:96:0x020d A[EXC_TOP_SPLITTER, PHI: r0 r2 r3 r4 r6
  0x020d: PHI (r0v5 com.appsalt.internal.i3) = (r0v2 com.appsalt.internal.i3), (r0v9 com.appsalt.internal.i3) binds: [B:63:0x0209, B:55:0x01a1] A[DONT_GENERATE, DONT_INLINE]
  0x020d: PHI (r2v12 com.appsalt.internal.m4) = (r2v8 com.appsalt.internal.m4), (r2v16 com.appsalt.internal.m4) binds: [B:63:0x0209, B:55:0x01a1] A[DONT_GENERATE, DONT_INLINE]
  0x020d: PHI (r3v4 com.appsalt.internal.e3) = (r3v1 com.appsalt.internal.e3), (r3v8 com.appsalt.internal.e3) binds: [B:63:0x0209, B:55:0x01a1] A[DONT_GENERATE, DONT_INLINE]
  0x020d: PHI (r4v5 kotlinx.coroutines.sync.Mutex) = (r4v4 kotlinx.coroutines.sync.Mutex), (r4v11 kotlinx.coroutines.sync.Mutex) binds: [B:63:0x0209, B:55:0x01a1] A[DONT_GENERATE, DONT_INLINE]
  0x020d: PHI (r6v2 com.appsalt.internal.j4) = (r6v1 com.appsalt.internal.j4), (r6v4 com.appsalt.internal.j4) binds: [B:63:0x0209, B:55:0x01a1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0298 -> B:77:0x026d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.google.firebase.sessions.t0 t0Var, com.google.firebase.sessions.p0 p0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.F = t0Var;
        this.G = p0Var;
    }
}
