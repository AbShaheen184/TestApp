package org.jsoup.helper;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final Constructor a;

    static {
        try {
            a = Class.forName("org.jsoup.helper.HttpClientExecutor").getConstructor(d.class, e.class);
        } catch (Exception unused) {
        }
    }
}
