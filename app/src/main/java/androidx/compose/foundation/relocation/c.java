package androidx.compose.foundation.relocation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final androidx.compose.runtime.collection.b a = new androidx.compose.runtime.collection.b(new e[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:19:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(androidx.compose.ui.geometry.c r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.relocation.b
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.relocation.b r0 = (androidx.compose.foundation.relocation.b) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.b r0 = new androidx.compose.foundation.relocation.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.B
            int r1 = r0.D
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r9 = r0.A
            int r1 = r0.z
            java.lang.Object[] r3 = r0.y
            androidx.compose.ui.geometry.c r4 = r0.e
            kotlin.a.e(r10)
            r10 = r4
            goto L64
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L35:
            kotlin.a.e(r10)
            androidx.compose.runtime.collection.b r10 = r8.a
            java.lang.Object[] r1 = r10.e
            int r10 = r10.z
            r3 = 0
            r7 = r10
            r10 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r7
        L45:
            if (r1 >= r9) goto L66
            r4 = r3[r1]
            androidx.compose.foundation.relocation.e r4 = (androidx.compose.foundation.relocation.e) r4
            androidx.activity.w r5 = new androidx.activity.w
            r6 = 6
            r5.<init>(r10, r6)
            r0.e = r10
            r0.y = r3
            r0.z = r1
            r0.A = r9
            r0.D = r2
            java.lang.Object r4 = android.support.v4.media.session.b.e(r4, r5, r0)
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r4 != r5) goto L64
            return r5
        L64:
            int r1 = r1 + r2
            goto L45
        L66:
            kotlin.y r9 = kotlin.y.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.c.a(androidx.compose.ui.geometry.c, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
