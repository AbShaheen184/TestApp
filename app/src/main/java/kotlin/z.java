package kotlin;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements h, Serializable {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public z(int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = new ArrayList();
                this.z = new ArrayList();
                break;
        }
    }

    @Override // kotlin.h
    public Object getValue() {
        if (this.z == v.a) {
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.y;
            aVar.getClass();
            this.z = aVar.invoke();
            this.y = null;
        }
        return this.z;
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return this.z != v.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
            default:
                return super.toString();
        }
    }
}
