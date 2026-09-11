package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface o2 extends p2 {
    @Override // androidx.compose.animation.core.m2
    default long b(s sVar, s sVar2, s sVar3) {
        return ((long) (u() + p())) * 1000000;
    }

    int p();

    int u();
}
