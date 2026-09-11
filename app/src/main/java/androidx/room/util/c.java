package androidx.room.util;

import androidx.room.coroutines.m;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ Object y;
    public final /* synthetic */ l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.coroutines.d dVar, l lVar) {
        super(2, dVar);
        this.z = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                c cVar = new c(dVar, this.z);
                cVar.y = obj;
                return cVar;
            default:
                c cVar2 = new c(this.z, dVar);
                cVar2.y = obj;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((c) create((m) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            default:
                c cVar = (c) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                y yVar = y.a;
                cVar.invokeSuspend(yVar);
                return yVar;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                m mVar = (m) this.y;
                mVar.getClass();
                return this.z.invoke(mVar.d());
            default:
                kotlin.a.e(obj);
                this.z.invoke((androidx.datastore.preferences.core.a) this.y);
                return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = lVar;
    }
}
