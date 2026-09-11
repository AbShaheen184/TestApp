package androidx.compose.material3;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.snapshots.q y;

    public /* synthetic */ s(androidx.compose.runtime.snapshots.q qVar, int i) {
        this.e = i;
        this.y = qVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
                boolean z = jVar instanceof androidx.compose.foundation.interaction.h;
                androidx.compose.runtime.snapshots.q qVar = this.y;
                if (z) {
                    qVar.add(jVar);
                } else if (jVar instanceof androidx.compose.foundation.interaction.i) {
                    qVar.remove(((androidx.compose.foundation.interaction.i) jVar).a);
                } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                    qVar.add(jVar);
                } else if (jVar instanceof androidx.compose.foundation.interaction.e) {
                    qVar.remove(((androidx.compose.foundation.interaction.e) jVar).a);
                } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                    qVar.add(jVar);
                } else if (jVar instanceof androidx.compose.foundation.interaction.n) {
                    qVar.remove(((androidx.compose.foundation.interaction.n) jVar).a);
                } else if (jVar instanceof androidx.compose.foundation.interaction.l) {
                    qVar.remove(((androidx.compose.foundation.interaction.l) jVar).a);
                }
                break;
            default:
                androidx.compose.foundation.interaction.j jVar2 = (androidx.compose.foundation.interaction.j) obj;
                boolean z2 = jVar2 instanceof androidx.compose.foundation.interaction.h;
                androidx.compose.runtime.snapshots.q qVar2 = this.y;
                if (z2) {
                    qVar2.add(jVar2);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.i) {
                    qVar2.remove(((androidx.compose.foundation.interaction.i) jVar2).a);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.d) {
                    qVar2.add(jVar2);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.e) {
                    qVar2.remove(((androidx.compose.foundation.interaction.e) jVar2).a);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.m) {
                    qVar2.add(jVar2);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.n) {
                    qVar2.remove(((androidx.compose.foundation.interaction.n) jVar2).a);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.l) {
                    qVar2.remove(((androidx.compose.foundation.interaction.l) jVar2).a);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.b) {
                    qVar2.add(jVar2);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.c) {
                    qVar2.remove(((androidx.compose.foundation.interaction.c) jVar2).a);
                } else if (jVar2 instanceof androidx.compose.foundation.interaction.a) {
                    qVar2.remove(((androidx.compose.foundation.interaction.a) jVar2).a);
                }
                break;
        }
        return kotlin.y.a;
    }
}
