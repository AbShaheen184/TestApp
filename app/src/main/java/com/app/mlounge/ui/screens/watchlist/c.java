package com.app.mlounge.ui.screens.watchlist;

import com.app.mlounge.data.local.entity.f;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ int e;

    public /* synthetic */ c(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.e) {
            case 0:
                ((Integer) obj).intValue();
                f fVar = (f) obj2;
                fVar.getClass();
                return fVar.a;
            case 1:
                String str = (String) obj;
                g gVar = (g) obj2;
                str.getClass();
                gVar.getClass();
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            case 2:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                iVar.getClass();
                gVar2.getClass();
                i iVarMinusKey = iVar.minusKey(gVar2.getKey());
                j jVar = j.e;
                if (iVarMinusKey == jVar) {
                    return gVar2;
                }
                kotlin.coroutines.e eVar = kotlin.coroutines.e.e;
                kotlin.coroutines.f fVar2 = (kotlin.coroutines.f) iVarMinusKey.get(eVar);
                if (fVar2 == null) {
                    cVar = new kotlin.coroutines.c(iVarMinusKey, gVar2);
                } else {
                    i iVarMinusKey2 = iVarMinusKey.minusKey(eVar);
                    if (iVarMinusKey2 == jVar) {
                        return new kotlin.coroutines.c(gVar2, fVar2);
                    }
                    cVar = new kotlin.coroutines.c(new kotlin.coroutines.c(iVarMinusKey2, gVar2), fVar2);
                }
                return cVar;
            case 3:
                return Boolean.valueOf(CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (g) obj2));
            case 4:
                return CoroutineContextKt.foldCopies$lambda$2((i) obj, (g) obj2);
            case 5:
                return ConcurrentWeakMap._get_keys_$lambda$0(obj, obj2);
            case 6:
                return ConcurrentWeakMap._get_entries_$lambda$1(obj, obj2);
            default:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (g) obj2));
        }
    }
}
