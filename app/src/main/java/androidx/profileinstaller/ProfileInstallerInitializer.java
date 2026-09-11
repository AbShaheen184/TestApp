package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import com.google.android.gms.common.internal.k;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements androidx.startup.b {
    @Override // androidx.startup.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.startup.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new d(this, context.getApplicationContext()));
        return new k(22);
    }
}
