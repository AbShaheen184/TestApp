package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static final kotlinx.serialization.descriptors.e[] a = new kotlinx.serialization.descriptors.e[0];
    public static final kotlinx.serialization.a[] b = new kotlinx.serialization.a[0];

    public static final x a(String str, kotlinx.serialization.a aVar) {
        return new x(str, new y(aVar));
    }

    public static final Set b(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        if (eVar instanceof j) {
            return ((j) eVar).b();
        }
        HashSet hashSet = new HashSet(eVar.f());
        int iF = eVar.f();
        for (int i = 0; i < iF; i++) {
            hashSet.add(eVar.g(i));
        }
        return hashSet;
    }

    public static final kotlinx.serialization.descriptors.e[] c(List list) {
        kotlinx.serialization.descriptors.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (kotlinx.serialization.descriptors.e[]) list.toArray(new kotlinx.serialization.descriptors.e[0])) == null) ? a : eVarArr;
    }

    public static final int d(kotlinx.serialization.descriptors.e eVar, kotlinx.serialization.descriptors.e[] eVarArr) {
        eVarArr.getClass();
        int iHashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(eVarArr);
        int iF = eVar.f();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i2 = iF - 1;
            int i3 = i * 31;
            String strA = eVar.i(eVar.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iF = i2;
        }
        int iF2 = eVar.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iF2 - 1;
            int i5 = iHashCode3 * 31;
            com.google.android.material.shape.e eVarE = eVar.i(eVar.f() - iF2).e();
            iHashCode3 = i5 + (eVarE != null ? eVarE.hashCode() : 0);
            iF2 = i4;
        }
    }

    public static final void e(int i, int i2, kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(eVar.g(i4));
            }
            i3 >>>= 1;
        }
        throw new kotlinx.serialization.b(eVar.a(), arrayList);
    }

    public static final void f(String str, kotlin.jvm.internal.e eVar) {
        String string;
        String str2 = "in the polymorphic scope of '" + eVar.c() + '\'';
        if (str == null) {
            string = androidx.privacysandbox.ads.adservices.java.internal.a.k('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbO.append(eVar.c());
            sbO.append("' has to be sealed and '@Serializable'.");
            string = sbO.toString();
        }
        throw new kotlinx.serialization.d(string);
    }
}
