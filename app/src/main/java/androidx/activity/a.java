package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public a(androidx.navigationevent.b bVar) {
        bVar.getClass();
        float f = bVar.c;
        float f2 = bVar.d;
        float f3 = bVar.b;
        int i = bVar.a;
        long j = bVar.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
