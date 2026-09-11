package com.caverock.androidsvg;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(9);
        a = map;
        map.put("xx-small", new d0(7, 0.694f));
        map.put("x-small", new d0(7, 0.833f));
        map.put("small", new d0(7, 10.0f));
        map.put("medium", new d0(7, 12.0f));
        map.put("large", new d0(7, 14.4f));
        map.put("x-large", new d0(7, 17.3f));
        map.put("xx-large", new d0(7, 20.7f));
        map.put("smaller", new d0(9, 83.33f));
        map.put("larger", new d0(9, 120.0f));
    }
}
