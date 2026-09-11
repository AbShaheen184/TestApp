package retrofit2;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {
    public final /* synthetic */ int e;
    public final Type y;

    public /* synthetic */ i(int i, Type type) {
        this.e = i;
        this.y = type;
    }

    @Override // retrofit2.f
    public final Type a() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y;
    }

    @Override // retrofit2.f
    public final Object h(z zVar) {
        switch (this.e) {
            case 0:
                j jVar = new j(zVar);
                zVar.w(new h(jVar, 0));
                return jVar;
            default:
                j jVar2 = new j(zVar);
                zVar.w(new h(jVar2, 1));
                return jVar2;
        }
    }
}
