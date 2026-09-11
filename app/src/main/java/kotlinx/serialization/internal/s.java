package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final long[] e = new long[0];
    public final kotlinx.serialization.descriptors.e a;
    public final androidx.compose.foundation.s0 b;
    public long c;
    public final long[] d;

    public s(kotlinx.serialization.descriptors.e eVar, androidx.compose.foundation.s0 s0Var) {
        eVar.getClass();
        this.a = eVar;
        this.b = s0Var;
        int iF = eVar.f();
        if (iF <= 64) {
            this.c = iF != 64 ? (-1) << iF : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            jArr[i - 1] = (-1) << iF;
        }
        this.d = jArr;
    }
}
