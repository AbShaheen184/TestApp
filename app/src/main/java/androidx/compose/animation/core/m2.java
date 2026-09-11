package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface m2 {
    boolean a();

    long b(s sVar, s sVar2, s sVar3);

    s i(long j, s sVar, s sVar2, s sVar3);

    default s q(s sVar, s sVar2, s sVar3) {
        return i(b(sVar, sVar2, sVar3), sVar, sVar2, sVar3);
    }

    s t(long j, s sVar, s sVar2, s sVar3);
}
