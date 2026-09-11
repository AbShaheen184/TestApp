package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    @Override // retrofit2.a
    public final List a(Executor executor) {
        return Arrays.asList(new k(), new o(executor));
    }

    @Override // retrofit2.a
    public final List b() {
        return Collections.singletonList(new b(1));
    }
}
