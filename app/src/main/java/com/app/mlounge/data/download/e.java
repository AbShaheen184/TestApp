package com.app.mlounge.data.download;

import com.app.mlounge.data.repository.r;
import com.google.common.util.concurrent.g0;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public Object D;
    public final /* synthetic */ int e = 2;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, String str, int i, String str2, String str3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = rVar;
        this.B = str;
        this.z = i;
        this.C = str2;
        this.D = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new e((h) this.C, dVar);
            case 1:
                return new e((r) this.A, (String) this.B, this.z, (String) this.C, (String) this.D, dVar);
            default:
                com.i4studio.subslib.model.b bVar = (com.i4studio.subslib.model.b) this.C;
                return new e(this.z, (g0) this.D, bVar, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea A[Catch: Exception -> 0x0182, TryCatch #1 {Exception -> 0x0182, blocks: (B:51:0x017b, B:97:0x0273, B:99:0x0277, B:101:0x027e, B:103:0x028d, B:105:0x0295, B:107:0x02a3, B:108:0x02ab, B:111:0x02b1, B:113:0x02c5, B:115:0x02cb, B:117:0x02d1, B:119:0x02d7, B:121:0x02da, B:123:0x02e2, B:125:0x02ec, B:112:0x02b7, B:57:0x019b, B:71:0x01e4, B:73:0x01ea, B:75:0x01f4, B:83:0x0215, B:81:0x020a, B:93:0x0255, B:58:0x01a0, B:64:0x01b9, B:65:0x01c4, B:67:0x01ca, B:69:0x01d4, B:70:0x01d8, B:61:0x01a9), top: B:133:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4 A[Catch: Exception -> 0x0182, TRY_LEAVE, TryCatch #1 {Exception -> 0x0182, blocks: (B:51:0x017b, B:97:0x0273, B:99:0x0277, B:101:0x027e, B:103:0x028d, B:105:0x0295, B:107:0x02a3, B:108:0x02ab, B:111:0x02b1, B:113:0x02c5, B:115:0x02cb, B:117:0x02d1, B:119:0x02d7, B:121:0x02da, B:123:0x02e2, B:125:0x02ec, B:112:0x02b7, B:57:0x019b, B:71:0x01e4, B:73:0x01ea, B:75:0x01f4, B:83:0x0215, B:81:0x020a, B:93:0x0255, B:58:0x01a0, B:64:0x01b9, B:65:0x01c4, B:67:0x01ca, B:69:0x01d4, B:70:0x01d8, B:61:0x01a9), top: B:133:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0206  */
    /* JADX WARN: Code duplicated, block: B:80:0x0208  */
    /* JADX WARN: Code duplicated, block: B:81:0x020a A[Catch: Exception -> 0x0182, TRY_ENTER, TryCatch #1 {Exception -> 0x0182, blocks: (B:51:0x017b, B:97:0x0273, B:99:0x0277, B:101:0x027e, B:103:0x028d, B:105:0x0295, B:107:0x02a3, B:108:0x02ab, B:111:0x02b1, B:113:0x02c5, B:115:0x02cb, B:117:0x02d1, B:119:0x02d7, B:121:0x02da, B:123:0x02e2, B:125:0x02ec, B:112:0x02b7, B:57:0x019b, B:71:0x01e4, B:73:0x01ea, B:75:0x01f4, B:83:0x0215, B:81:0x020a, B:93:0x0255, B:58:0x01a0, B:64:0x01b9, B:65:0x01c4, B:67:0x01ca, B:69:0x01d4, B:70:0x01d8, B:61:0x01a9), top: B:133:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0215 A[Catch: Exception -> 0x0182, TryCatch #1 {Exception -> 0x0182, blocks: (B:51:0x017b, B:97:0x0273, B:99:0x0277, B:101:0x027e, B:103:0x028d, B:105:0x0295, B:107:0x02a3, B:108:0x02ab, B:111:0x02b1, B:113:0x02c5, B:115:0x02cb, B:117:0x02d1, B:119:0x02d7, B:121:0x02da, B:123:0x02e2, B:125:0x02ec, B:112:0x02b7, B:57:0x019b, B:71:0x01e4, B:73:0x01ea, B:75:0x01f4, B:83:0x0215, B:81:0x020a, B:93:0x0255, B:58:0x01a0, B:64:0x01b9, B:65:0x01c4, B:67:0x01ca, B:69:0x01d4, B:70:0x01d8, B:61:0x01a9), top: B:133:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:85:0x023a  */
    /* JADX WARN: Code duplicated, block: B:86:0x023b  */
    /* JADX WARN: Code duplicated, block: B:88:0x023e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0240  */
    /* JADX WARN: Code duplicated, block: B:91:0x024d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0255 A[Catch: Exception -> 0x0182, TryCatch #1 {Exception -> 0x0182, blocks: (B:51:0x017b, B:97:0x0273, B:99:0x0277, B:101:0x027e, B:103:0x028d, B:105:0x0295, B:107:0x02a3, B:108:0x02ab, B:111:0x02b1, B:113:0x02c5, B:115:0x02cb, B:117:0x02d1, B:119:0x02d7, B:121:0x02da, B:123:0x02e2, B:125:0x02ec, B:112:0x02b7, B:57:0x019b, B:71:0x01e4, B:73:0x01ea, B:75:0x01f4, B:83:0x0215, B:81:0x020a, B:93:0x0255, B:58:0x01a0, B:64:0x01b9, B:65:0x01c4, B:67:0x01ca, B:69:0x01d4, B:70:0x01d8, B:61:0x01a9), top: B:133:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:95:0x026f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0271  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0240 -> B:90:0x0245). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.download.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, g0 g0Var, com.i4studio.subslib.model.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = bVar;
        this.D = g0Var;
        this.z = i;
    }
}
