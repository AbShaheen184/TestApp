package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cg {
    public static final bg f;
    public static final bg h;
    public static final kg a = new kg("cause", Throwable.class, false, false);
    public static final kg b = new kg("ratelimit_count", Integer.class, false, false);
    public static final kg c = new kg("sampling_count", Integer.class, false, false);
    public static final kg d = new kg("ratelimit_period", wf.class, false, false);
    public static final kg e = new kg("skipped", Integer.class, false, false);
    public static final kg g = new kg("forced", Boolean.class, false, false);
    public static final kg i = new kg("stack_size", rg.class, false, false);

    static {
        boolean z = true;
        f = new bg("group_by", Object.class, z, z, 0);
        h = new bg("tags", x.class, false, z, 1);
    }
}
