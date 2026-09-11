package retrofit2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z0 {
    public final /* synthetic */ int c;
    public final String d;
    public final a e;
    public final boolean f;

    public c0(int i, String str, boolean z) {
        this.c = i;
        switch (i) {
            case 1:
                a aVar = a.y;
                Objects.requireNonNull(str, "name == null");
                this.d = str;
                this.e = aVar;
                this.f = z;
                break;
            case 2:
                a aVar2 = a.y;
                Objects.requireNonNull(str, "name == null");
                this.d = str;
                this.e = aVar2;
                this.f = z;
                break;
            default:
                a aVar3 = a.y;
                Objects.requireNonNull(str, "name == null");
                this.d = str;
                this.e = aVar3;
                this.f = z;
                break;
        }
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        switch (this.c) {
            case 0:
                if (obj != null) {
                    this.e.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        o0Var.a(this.d, string, this.f);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.e.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        o0Var.b(this.d, string2, this.f);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.e.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        o0Var.d(this.d, string3, this.f);
                        break;
                    }
                }
                break;
        }
    }
}
