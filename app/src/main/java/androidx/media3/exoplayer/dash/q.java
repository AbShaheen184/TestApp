package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.appcompat.widget.c2;
import androidx.media3.common.util.j0;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Handler.Callback {
    public androidx.media3.exoplayer.dash.manifest.c C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final c2 e;
    public final f y;
    public final TreeMap B = new TreeMap();
    public final Handler A = j0.q(this);
    public final androidx.media3.extractor.metadata.dvbsi.b z = new androidx.media3.extractor.metadata.dvbsi.b(1);

    public q(androidx.media3.exoplayer.dash.manifest.c cVar, f fVar, c2 c2Var) {
        this.C = cVar;
        this.y = fVar;
        this.e = c2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.F) {
            if (message.what != 1) {
                return false;
            }
            o oVar = (o) message.obj;
            long j = oVar.a;
            long j2 = oVar.b;
            Long lValueOf = Long.valueOf(j2);
            TreeMap treeMap = this.B;
            Long l = (Long) treeMap.get(lValueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
