package androidx.compose.foundation.text;

import android.database.SQLException;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ r(androidx.room.coroutines.g gVar, boolean z) {
        this.z = gVar;
        this.y = z;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        MutableSharedFlow mutableSharedFlowJ;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.text.input.internal.t tVar = (androidx.compose.foundation.text.input.internal.t) this.z;
                boolean z = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (z && (mutableSharedFlowJ = ((androidx.compose.foundation.text.input.internal.c) tVar).j()) != null) {
                    mutableSharedFlowJ.tryEmit(yVar);
                }
                return yVar;
            default:
                androidx.room.coroutines.g gVar = (androidx.room.coroutines.g) this.z;
                String str = this.y ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                gVar.y.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                gVar.e.d(sb);
                try {
                    androidx.datastore.preferences.protobuf.h1.y(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i = gVar.D;
                    if (i == 1) {
                        throw e;
                    }
                    if (i == 2) {
                        e.printStackTrace();
                    }
                    return kotlin.y.a;
                }
        }
    }

    public /* synthetic */ r(boolean z, androidx.compose.foundation.text.input.internal.t tVar) {
        this.y = z;
        this.z = tVar;
    }
}
