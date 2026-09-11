package com.app.mlounge.data.repository;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public r A;
    public String B;
    public Iterator C;
    public ChqStream D;
    public String E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ r M;
    public final /* synthetic */ String N;
    public final /* synthetic */ String O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;
    public List e;
    public okhttp3.y y;
    public ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, String str, String str2, int i, int i2, String str3, String str4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.M = rVar;
        this.N = str;
        this.O = str2;
        this.P = i;
        this.Q = i2;
        this.R = str3;
        this.S = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        o oVar = new o(this.M, this.N, this.O, this.P, this.Q, this.R, this.S, dVar);
        oVar.L = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ProducerScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0354  */
    /* JADX WARN: Code duplicated, block: B:115:0x035c  */
    /* JADX WARN: Code duplicated, block: B:117:0x036e  */
    /* JADX WARN: Code duplicated, block: B:121:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x03db  */
    /* JADX WARN: Code duplicated, block: B:127:0x03dd A[Catch: Exception -> 0x03e8, PHI: r0 r2 r4 r5 r6 r7 r8 r9 r10 r11 r12 r13 r14 r15 r17 r18 r20
  0x03dd: PHI (r0v32 int) = (r0v28 int), (r0v49 int) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r2v3 kotlinx.coroutines.channels.ProducerScope) = (r2v1 kotlinx.coroutines.channels.ProducerScope), (r2v26 kotlinx.coroutines.channels.ProducerScope) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r4v6 java.lang.String) = (r4v3 java.lang.String), (r4v14 java.lang.String) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r5v12 int) = (r5v6 int), (r5v18 int) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r6v50 okhttp3.y) = (r6v46 okhttp3.y), (r6v59 okhttp3.y) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r7v2 java.lang.Object) = (r7v1 java.lang.Object), (r7v13 java.lang.Object) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r8v25 kotlin.coroutines.intrinsics.a) = (r8v21 kotlin.coroutines.intrinsics.a), (r8v38 kotlin.coroutines.intrinsics.a) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r9v37 ??) = (r9v33 ??), (r9v60 ??) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r10v10 boolean) = (r10v8 boolean), (r10v16 boolean) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r11v15 java.util.Iterator) = (r11v13 java.util.Iterator), (r11v23 java.util.Iterator) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r12v19 com.app.mlounge.data.remote.model.ChqStream) = (r12v16 com.app.mlounge.data.remote.model.ChqStream), (r12v30 com.app.mlounge.data.remote.model.ChqStream) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r13v12 int) = (r13v9 int), (r13v22 int) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r14v22 int) = (r14v19 int), (r14v26 int) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r15v19 com.app.mlounge.data.repository.r) = (r15v16 com.app.mlounge.data.repository.r), (r15v30 com.app.mlounge.data.repository.r) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r17v12 kotlin.y) = (r17v8 kotlin.y), (r17v16 kotlin.y) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r18v8 java.lang.String) = (r18v5 java.lang.String), (r18v11 java.lang.String) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE]
  0x03dd: PHI (r20v9 java.lang.String) = (r20v5 java.lang.String), (r20v18 java.lang.String) binds: [B:21:0x00a5, B:125:0x03d9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {Exception -> 0x03e8, blocks: (B:124:0x03b3, B:127:0x03dd), top: B:197:0x03b3 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0407  */
    /* JADX WARN: Code duplicated, block: B:140:0x040f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0480 A[Catch: Exception -> 0x04b1, TRY_LEAVE, TryCatch #10 {Exception -> 0x04b1, blocks: (B:152:0x047a, B:154:0x0480), top: B:205:0x047a }] */
    /* JADX WARN: Code duplicated, block: B:157:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:160:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x03b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v28, types: [com.app.mlounge.data.remote.model.ChqStream, com.app.mlounge.data.repository.r, java.lang.Object, java.lang.String, java.util.ArrayList, java.util.Iterator, java.util.List, okhttp3.y] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, java.util.ArrayList, java.util.List, okhttp3.y] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.collections.u] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x03e9 -> B:177:0x04fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x04b2 -> B:177:0x04fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x04ba -> B:178:0x0527). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x04ee -> B:178:0x0527). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x04f8 -> B:177:0x04fc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.repository.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
