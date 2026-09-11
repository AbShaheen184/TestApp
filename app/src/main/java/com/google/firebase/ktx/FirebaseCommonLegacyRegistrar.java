package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.android.material.textfield.p;
import com.google.common.base.c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return c.p(p.i("fire-core-ktx", "21.0.0"));
    }
}
