package androidx.room.coroutines;

import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.measurement.internal.l1;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.x0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.collection.u {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l1 l1Var) {
        super(20);
        this.i = l1Var;
    }

    @Override // androidx.collection.u
    public final Object c(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.h) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((j) this.i).e.U(str);
            default:
                String str2 = (String) obj;
                com.google.android.gms.common.internal.x.d(str2);
                l1 l1Var = (l1) this.i;
                l1Var.w();
                com.google.android.gms.common.internal.x.d(str2);
                com.google.android.gms.measurement.internal.m mVar = l1Var.y.z;
                l4.U(mVar);
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVarD0 = mVar.D0(str2);
                if (cVarD0 == null) {
                    return null;
                }
                x0 x0Var = ((s1) l1Var.e).C;
                s1.m(x0Var);
                x0Var.K.b(str2, "Populate EES config from database on cache miss. appId");
                l1Var.D(str2, l1Var.E(str2, (byte[]) cVarD0.y));
                i iVar = l1Var.H;
                synchronized (((com.google.android.material.shape.g) iVar.g)) {
                    Set setEntrySet = ((androidx.collection.internal.b) iVar.f).a.entrySet();
                    setEntrySet.getClass();
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = ((androidx.collection.internal.b) iVar.f).a.entrySet();
                    setEntrySet2.getClass();
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (t5) linkedHashMap.get(str2);
        }
    }

    @Override // androidx.collection.u
    public void d(Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.h) {
            case 0:
                ((String) obj).getClass();
                ((androidx.sqlite.c) obj2).close();
                break;
            default:
                super.d(obj, obj2, obj3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(25);
        this.i = jVar;
    }
}
