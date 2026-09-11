package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface s0 extends s {
    r0 f0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2);

    default r0 q(int i, int i2, Map map, kotlin.jvm.functions.l lVar) {
        return f0(i, i2, map, null, lVar);
    }
}
