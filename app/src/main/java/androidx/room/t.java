package androidx.room;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final /* synthetic */ int a;
    public final String b;
    public final boolean c;

    public t(String str, boolean z) {
        this.a = 0;
        this.c = z;
        this.b = str;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String str = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }
}
