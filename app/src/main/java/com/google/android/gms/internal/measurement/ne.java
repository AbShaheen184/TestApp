package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ne implements com.google.common.util.concurrent.z {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.compose.ui.node.a1 b;

    public /* synthetic */ ne(androidx.compose.ui.node.a1 a1Var, int i) {
        this.a = i;
        this.b = a1Var;
    }

    @Override // com.google.common.util.concurrent.z
    public final ListenableFuture apply(Object obj) throws IOException {
        ListenableFuture listenableFuture;
        switch (this.a) {
            case 0:
                androidx.compose.ui.node.a1 a1Var = this.b;
                synchronized (a1Var.i) {
                    listenableFuture = (ListenableFuture) a1Var.k;
                    break;
                }
                return listenableFuture;
            case 1:
                androidx.compose.ui.node.a1 a1Var2 = this.b;
                return com.google.common.util.concurrent.n0.d(a1Var2.l((Uri) com.google.common.util.concurrent.n0.b((ListenableFuture) a1Var2.c)));
            case 2:
                androidx.compose.ui.node.a1 a1Var3 = this.b;
                a1Var3.m((Uri) com.google.common.util.concurrent.n0.b((ListenableFuture) a1Var3.c), obj);
                return com.google.common.util.concurrent.q0.y;
            default:
                androidx.compose.ui.node.a1 a1Var4 = this.b;
                Uri uri = (Uri) obj;
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    td tdVar = (td) a1Var4.f;
                    rd rdVarB = tdVar.b(uriBuild);
                    if (rdVarB.a.b(rdVarB.d)) {
                        rd rdVarB2 = tdVar.b(uriBuild);
                        rd rdVarB3 = tdVar.b(uri);
                        ie ieVar = rdVarB2.a;
                        if (ieVar != rdVarB3.a) {
                            throw new androidx.datastore.preferences.protobuf.i("Cannot rename file across backends");
                        }
                        ieVar.g(rdVarB2.d, rdVarB3.d);
                    }
                    return com.google.common.util.concurrent.q0.y;
                } catch (IOException e) {
                    return com.google.common.util.concurrent.n0.c(e);
                }
        }
    }
}
