package okio.internal;

import java.io.IOException;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.z;
import kotlin.y;
import okio.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements p {
    public final /* synthetic */ z A;
    public final /* synthetic */ z B;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ z y;
    public final /* synthetic */ b0 z;

    public /* synthetic */ k(z zVar, b0 b0Var, z zVar2, z zVar3) {
        this.y = zVar;
        this.z = b0Var;
        this.A = zVar2;
        this.B = zVar3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.e;
        int iIntValue = ((Integer) obj).intValue();
        Long l = (Long) obj2;
        switch (i) {
            case 0:
                long jLongValue = l.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue >= 1) {
                        b0 b0Var = this.z;
                        byte b = b0Var.readByte();
                        boolean z = (b & 1) == 1;
                        boolean z2 = (b & 2) == 2;
                        boolean z3 = (b & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (jLongValue >= j) {
                            if (z) {
                                this.y.e = Integer.valueOf(b0Var.w());
                            }
                            if (z2) {
                                this.A.e = Integer.valueOf(b0Var.w());
                            }
                            if (z3) {
                                this.B.e = Integer.valueOf(b0Var.w());
                            }
                        } else {
                            net.luminis.tls.engine.impl.c.t("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        net.luminis.tls.engine.impl.c.t("bad zip: extended timestamp extra too short");
                    }
                    return null;
                }
                return y.a;
            default:
                long jLongValue2 = l.longValue();
                if (iIntValue == 1) {
                    z zVar = this.y;
                    if (zVar.e != null) {
                        net.luminis.tls.engine.impl.c.t("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (jLongValue2 == 24) {
                        b0 b0Var2 = this.z;
                        zVar.e = Long.valueOf(b0Var2.z());
                        this.A.e = Long.valueOf(b0Var2.z());
                        this.B.e = Long.valueOf(b0Var2.z());
                    } else {
                        net.luminis.tls.engine.impl.c.t("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    return null;
                }
                return y.a;
        }
    }

    public /* synthetic */ k(b0 b0Var, z zVar, z zVar2, z zVar3) {
        this.z = b0Var;
        this.y = zVar;
        this.A = zVar2;
        this.B = zVar3;
    }
}
