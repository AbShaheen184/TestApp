package androidx.navigation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends h0 {
    public final Class l;

    public d0(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.l = cls;
        } else {
            com.google.gson.b.e(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // androidx.navigation.h0, androidx.navigation.i0
    public final String b() {
        return this.l.getName();
    }

    @Override // androidx.navigation.h0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        Class cls = this.l;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (kotlin.text.r.I(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Enum value ", str, " not found for type ");
        sbX.append(cls.getName());
        sbX.append('.');
        throw new IllegalArgumentException(sbX.toString());
    }
}
