package com.app.mlounge.data.providers;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$20;
    Object L$21;
    Object L$22;
    Object L$23;
    Object L$24;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, String str, String str2, Integer num, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = vVar;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new u(this.this$0, this.$tmdbId, this.$mediaType, this.$season, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x02ea A[Catch: Exception -> 0x0095, TryCatch #2 {Exception -> 0x0095, blocks: (B:8:0x007f, B:81:0x0353, B:83:0x0359, B:93:0x0411, B:72:0x02e4, B:74:0x02ea, B:76:0x030c, B:78:0x031b, B:80:0x0339, B:38:0x01ab, B:40:0x01b1, B:42:0x01ed, B:44:0x01fc, B:46:0x0206, B:48:0x020e, B:50:0x0212, B:52:0x022c, B:57:0x0262, B:61:0x027d, B:64:0x0286, B:66:0x02a0, B:71:0x02da, B:67:0x02a9, B:68:0x02b1, B:70:0x02ca, B:60:0x026c, B:20:0x012a, B:26:0x014f, B:29:0x0154, B:31:0x015c, B:33:0x017d, B:37:0x019a, B:32:0x0161, B:23:0x0138), top: B:151:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:76:0x030c A[Catch: Exception -> 0x0095, TryCatch #2 {Exception -> 0x0095, blocks: (B:8:0x007f, B:81:0x0353, B:83:0x0359, B:93:0x0411, B:72:0x02e4, B:74:0x02ea, B:76:0x030c, B:78:0x031b, B:80:0x0339, B:38:0x01ab, B:40:0x01b1, B:42:0x01ed, B:44:0x01fc, B:46:0x0206, B:48:0x020e, B:50:0x0212, B:52:0x022c, B:57:0x0262, B:61:0x027d, B:64:0x0286, B:66:0x02a0, B:71:0x02da, B:67:0x02a9, B:68:0x02b1, B:70:0x02ca, B:60:0x026c, B:20:0x012a, B:26:0x014f, B:29:0x0154, B:31:0x015c, B:33:0x017d, B:37:0x019a, B:32:0x0161, B:23:0x0138), top: B:151:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0339 A[Catch: Exception -> 0x0095, TryCatch #2 {Exception -> 0x0095, blocks: (B:8:0x007f, B:81:0x0353, B:83:0x0359, B:93:0x0411, B:72:0x02e4, B:74:0x02ea, B:76:0x030c, B:78:0x031b, B:80:0x0339, B:38:0x01ab, B:40:0x01b1, B:42:0x01ed, B:44:0x01fc, B:46:0x0206, B:48:0x020e, B:50:0x0212, B:52:0x022c, B:57:0x0262, B:61:0x027d, B:64:0x0286, B:66:0x02a0, B:71:0x02da, B:67:0x02a9, B:68:0x02b1, B:70:0x02ca, B:60:0x026c, B:20:0x012a, B:26:0x014f, B:29:0x0154, B:31:0x015c, B:33:0x017d, B:37:0x019a, B:32:0x0161, B:23:0x0138), top: B:151:0x001b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x049e -> B:85:0x038e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x04f9 -> B:149:0x04fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0573 -> B:81:0x0353). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0591 -> B:132:0x058d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0339 -> B:81:0x0353). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.providers.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
