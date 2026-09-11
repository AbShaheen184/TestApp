package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.e;
import com.google.android.datatransport.runtime.r;
import com.google.android.material.textfield.p;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.j;
import com.google.firebase.components.s;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(com.google.android.datatransport.cct.a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(com.google.android.datatransport.cct.a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(com.google.android.datatransport.cct.a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.b> getComponents() {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(e.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(j.b(Context.class));
        aVarB.f = new s(15);
        com.google.firebase.components.b bVarB = aVarB.b();
        com.google.firebase.components.a aVarA = com.google.firebase.components.b.a(new com.google.firebase.components.r(a.class, e.class));
        aVarA.a(j.b(Context.class));
        aVarA.f = new s(16);
        com.google.firebase.components.b bVarB2 = aVarA.b();
        com.google.firebase.components.a aVarA2 = com.google.firebase.components.b.a(new com.google.firebase.components.r(b.class, e.class));
        aVarA2.a(j.b(Context.class));
        aVarA2.f = new s(17);
        return Arrays.asList(bVarB, bVarB2, aVarA2.b(), p.i(LIBRARY_NAME, "19.0.0"));
    }
}
