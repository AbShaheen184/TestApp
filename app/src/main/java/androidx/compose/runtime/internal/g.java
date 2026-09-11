package androidx.compose.runtime.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int iHashCode = hashCode();
        com.google.android.material.shape.e.a(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }
}
