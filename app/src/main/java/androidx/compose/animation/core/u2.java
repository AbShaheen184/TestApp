package androidx.compose.animation.core;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 implements o2, androidx.compose.ui.text.input.q, androidx.compose.runtime.c, androidx.media3.extractor.mp4.c {
    public int e;
    public int y;
    public final Object z;

    public u2(Context context, XmlResourceParser xmlResourceParser) {
        this.z = new ArrayList();
        this.y = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.r.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.y);
                this.y = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new androidx.constraintlayout.widget.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.compose.runtime.c
    public void c(int i, Object obj) {
        ((androidx.compose.runtime.c) this.z).c(i + (this.y == 0 ? this.e : 0), obj);
    }

    @Override // androidx.compose.runtime.c
    public void d(Object obj) {
        this.y++;
        ((androidx.compose.runtime.c) this.z).d(obj);
    }

    @Override // androidx.compose.runtime.c
    public void e() {
        ((androidx.compose.runtime.c) this.z).e();
    }

    @Override // androidx.compose.runtime.c
    public void f(int i, int i2, int i3) {
        int i4 = this.y == 0 ? this.e : 0;
        ((androidx.compose.runtime.c) this.z).f(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.c
    public void g(int i, int i2) {
        ((androidx.compose.runtime.c) this.z).g(i + (this.y == 0 ? this.e : 0), i2);
    }

    @Override // androidx.media3.extractor.mp4.c
    public int h() {
        return this.e;
    }

    @Override // androidx.compose.animation.core.m2
    public s i(long j, s sVar, s sVar2, s sVar3) {
        return ((com.google.firebase.messaging.o) this.z).i(j, sVar, sVar2, sVar3);
    }

    @Override // androidx.compose.ui.text.input.q
    public int j(int i) {
        int iJ = ((androidx.compose.ui.text.input.q) this.z).j(i);
        if (i >= 0 && i <= this.y) {
            androidx.compose.foundation.text.m1.c(iJ, this.e, i);
        }
        return iJ;
    }

    @Override // androidx.compose.runtime.c
    public void k() {
        if (this.y <= 0) {
            androidx.compose.runtime.t.a("OffsetApplier up called with no corresponding down");
        }
        this.y--;
        ((androidx.compose.runtime.c) this.z).k();
    }

    @Override // androidx.compose.runtime.c
    public void l(Object obj, kotlin.jvm.functions.p pVar) {
        ((androidx.compose.runtime.c) this.z).l(obj, pVar);
    }

    @Override // androidx.compose.runtime.c
    public void m(int i, Object obj) {
        ((androidx.compose.runtime.c) this.z).m(i + (this.y == 0 ? this.e : 0), obj);
    }

    @Override // androidx.compose.runtime.c
    public Object o() {
        return ((androidx.compose.runtime.c) this.z).o();
    }

    @Override // androidx.compose.animation.core.o2
    public int p() {
        return this.y;
    }

    @Override // androidx.media3.extractor.mp4.c
    public int r() {
        return this.y;
    }

    @Override // androidx.media3.extractor.mp4.c
    public int s() {
        int i = this.e;
        return i == -1 ? ((androidx.media3.common.util.w) this.z).D() : i;
    }

    @Override // androidx.compose.animation.core.m2
    public s t(long j, s sVar, s sVar2, s sVar3) {
        return ((com.google.firebase.messaging.o) this.z).t(j, sVar, sVar2, sVar3);
    }

    @Override // androidx.compose.animation.core.o2
    public int u() {
        return this.e;
    }

    @Override // androidx.compose.ui.text.input.q
    public int v(int i) {
        int iV = ((androidx.compose.ui.text.input.q) this.z).v(i);
        if (i >= 0 && i <= this.e) {
            androidx.compose.foundation.text.m1.b(iV, this.y, i);
        }
        return iV;
    }

    public synchronized int w() {
        PackageInfo packageInfoC;
        if (this.e == 0) {
            try {
                packageInfoC = com.google.android.gms.common.wrappers.b.a((Context) this.z).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoC = null;
            }
            if (packageInfoC != null) {
                this.e = packageInfoC.versionCode;
            }
        }
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0027, B:14:0x0032, B:16:0x0039, B:18:0x004b, B:26:0x006c, B:21:0x0052, B:23:0x0065, B:29:0x0070, B:33:0x007f), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    public synchronized int x() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i = this.y;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.z;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) com.google.android.gms.common.wrappers.b.a(context).a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (com.google.android.gms.common.util.b.a()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != com.google.android.gms.common.util.b.a()) {
                i2 = 2;
            }
            this.y = i2;
            return i2;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != com.google.android.gms.common.util.b.a()) {
                    i2 = 2;
                }
                this.y = i2;
                return i2;
            }
            i2 = 2;
        }
        this.y = i2;
        return i2;
    }

    public u2(View view) {
        this.z = view;
    }

    public u2(androidx.compose.ui.text.input.q qVar, int i, int i2) {
        this.z = qVar;
        this.e = i;
        this.y = i2;
    }

    public u2(Context context) {
        this.y = 0;
        this.z = context;
    }

    public u2(androidx.compose.runtime.c cVar, int i) {
        this.z = cVar;
        this.e = i;
    }

    public u2() {
        this.z = new u2[LibretroCore.SCREEN_WIDTH];
        this.e = 0;
        this.y = 0;
    }

    public u2(int i, int i2) {
        this.z = null;
        this.e = i;
        int i3 = i2 & 7;
        this.y = i3 == 0 ? 8 : i3;
    }

    public u2(int i, int i2, z zVar) {
        this.e = i;
        this.y = i2;
        this.z = new com.google.firebase.messaging.o(new e0(i, i2, zVar));
    }

    public u2(int i, int i2, SparseArray sparseArray) {
        this.e = i;
        this.y = i2;
        this.z = sparseArray;
    }

    public u2(androidx.media3.container.e eVar, androidx.media3.common.r rVar) {
        androidx.media3.common.util.w wVar = eVar.z;
        this.z = wVar;
        wVar.M(12);
        int iD = wVar.D();
        if ("audio/raw".equals(rVar.o)) {
            int iU = androidx.media3.common.util.j0.u(rVar.I) * rVar.G;
            if (iD % iU != 0) {
                androidx.media3.common.util.c.t("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iU + ", stsz sample size: " + iD);
                iD = iU;
            }
        }
        this.e = iD == 0 ? -1 : iD;
        this.y = wVar.D();
    }
}
