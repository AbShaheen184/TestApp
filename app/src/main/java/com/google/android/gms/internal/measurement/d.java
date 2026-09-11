package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final e a;

    static {
        e eVar;
        try {
            eVar = j.a;
        } catch (NoClassDefFoundError unused) {
            eVar = null;
        }
        if (eVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = e.a[i];
                try {
                    eVar = (e) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = eVar;
    }
}
