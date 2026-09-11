package com.caverock.androidsvg;

import java.util.HashMap;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d2 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(13);
        a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.s(1, map, "bolder", -1, "lighter");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.s(100, map, "100", Context.VERSION_ES6, "200");
        map.put("300", 300);
        map.put("400", 400);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.s(500, map, "500", 600, "600");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.z(map, "700", 700, 800, "800");
        map.put("900", 900);
    }
}
