package kotlin.random;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    @Override // kotlin.random.d
    public final int a(int i) {
        return ((-i) >> 31) & (f().nextInt() >>> (32 - i));
    }

    @Override // kotlin.random.d
    public final int b() {
        return f().nextInt();
    }

    @Override // kotlin.random.d
    public final long d() {
        return f().nextLong();
    }

    public abstract Random f();

    public final int g(int i) {
        return f().nextInt(i);
    }
}
