package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.ui.input.pointer.k0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements p {
    public final /* synthetic */ l A;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(l lVar, d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        switch (this.e) {
            case 0:
                b bVar = new b(this.A, dVar, 0);
                bVar.z = obj;
                return bVar;
            default:
                b bVar2 = new b(this.A, dVar, 1);
                bVar2.z = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        d dVar = (d) obj2;
        switch (this.e) {
            case 0:
                return ((b) create(k0Var, dVar)).invokeSuspend(y.a);
            default:
                ((b) create(k0Var, dVar)).invokeSuspend(y.a);
                return kotlin.coroutines.intrinsics.a.e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002f -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0031
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.e
            switch(r0) {
                case 0: goto L44;
                default: goto L5;
            }
        L5:
            int r0 = r6.y
            r1 = 1
            if (r0 == 0) goto L1b
            if (r0 != r1) goto L14
            java.lang.Object r0 = r6.z
            androidx.compose.ui.input.pointer.k0 r0 = (androidx.compose.ui.input.pointer.k0) r0
            kotlin.a.e(r7)
            goto L33
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            goto L32
        L1b:
            kotlin.a.e(r7)
            java.lang.Object r7 = r6.z
            androidx.compose.ui.input.pointer.k0 r7 = (androidx.compose.ui.input.pointer.k0) r7
            r0 = r7
        L23:
            r6.z = r0
            r6.y = r1
            androidx.compose.ui.input.pointer.n r7 = androidx.compose.ui.input.pointer.n.e
            java.lang.Object r7 = r0.b(r7, r6)
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.a.e
            if (r7 != r2) goto L33
            r7 = r2
        L32:
            return r7
        L33:
            androidx.compose.ui.input.pointer.m r7 = (androidx.compose.ui.input.pointer.m) r7
            boolean r7 = androidx.datastore.preferences.protobuf.h1.s(r7)
            r7 = r7 ^ r1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            kotlin.jvm.functions.l r2 = r6.A
            r2.invoke(r7)
            goto L23
        L44:
            int r0 = r6.y
            r1 = 2
            r2 = 1
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L63
            if (r0 == r2) goto L5b
            if (r0 != r1) goto L54
            kotlin.a.e(r7)
            goto L95
        L54:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r3 = 0
            goto L9e
        L5b:
            java.lang.Object r0 = r6.z
            androidx.compose.ui.input.pointer.k0 r0 = (androidx.compose.ui.input.pointer.k0) r0
            kotlin.a.e(r7)
            goto L76
        L63:
            kotlin.a.e(r7)
            java.lang.Object r7 = r6.z
            r0 = r7
            androidx.compose.ui.input.pointer.k0 r0 = (androidx.compose.ui.input.pointer.k0) r0
            r6.z = r0
            r6.y = r2
            java.lang.Object r7 = kotlin.math.a.b(r0, r6)
            if (r7 != r3) goto L76
            goto L9e
        L76:
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            r7.a()
            long r4 = r7.c
            androidx.compose.ui.geometry.b r7 = new androidx.compose.ui.geometry.b
            r7.<init>(r4)
            kotlin.jvm.functions.l r2 = r6.A
            r2.invoke(r7)
            r7 = 0
            r6.z = r7
            r6.y = r1
            androidx.compose.ui.input.pointer.n r7 = androidx.compose.ui.input.pointer.n.y
            java.lang.Object r7 = androidx.compose.foundation.gestures.x2.h(r0, r7, r6)
            if (r7 != r3) goto L95
            goto L9e
        L95:
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            if (r7 == 0) goto L9c
            r7.a()
        L9c:
            kotlin.y r3 = kotlin.y.a
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
