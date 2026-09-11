package androidx.compose.animation.core;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.widget.Toast;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.emulator.EmulatorActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l0(Float f, h0 h0Var, Float f2, f0 f0Var) {
        this.e = 0;
        this.y = f;
        this.A = h0Var;
        this.z = f2;
        this.B = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Float f = (Float) this.y;
                h0 h0Var = (h0) this.A;
                Float f2 = (Float) this.z;
                f0 f0Var = (f0) this.B;
                if (!f.equals(h0Var.e) || !f2.equals(h0Var.y)) {
                    h0Var.e = f;
                    h0Var.y = f2;
                    h0Var.A = new t1(f0Var, e.j, f, f2, null);
                    h0Var.E.b.setValue(Boolean.TRUE);
                    h0Var.B = false;
                    h0Var.C = true;
                }
                break;
            case 1:
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                EpornerVideoDetail epornerVideoDetail = (EpornerVideoDetail) this.z;
                kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) this.A;
                String str = (String) this.B;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(cVar), null, null, new com.app.mlounge.ui.viewmodel.a(cVar, epornerVideoDetail, null, 0), 3, null);
                String strH = epornerVideoDetail.h();
                if (strH == null) {
                    strH = "";
                }
                qVar.invoke("adult", str, strH);
                break;
            case 2:
                GameDetailResponse gameDetailResponse = (GameDetailResponse) this.y;
                String str2 = (String) this.z;
                com.app.mlounge.ui.viewmodel.s sVar = (com.app.mlounge.ui.viewmodel.s) this.A;
                Context context = (Context) this.B;
                String strJ = gameDetailResponse.j();
                if (strJ != null) {
                    str2 = strJ;
                }
                boolean zE = sVar.e(str2);
                MutableStateFlow mutableStateFlow = sVar.u;
                if (zE) {
                    com.app.mlounge.emulator.k kVar = EmulatorActivity.Companion;
                    GamePlatform gamePlatform = (GamePlatform) mutableStateFlow.getValue();
                    File file = new File(sVar.d.getFilesDir(), "roms");
                    file.mkdirs();
                    String absolutePath = new File(file, androidx.constraintlayout.core.g.c(str2, gamePlatform.g())).getAbsolutePath();
                    absolutePath.getClass();
                    String strD = gameDetailResponse.d();
                    if (strD == null) {
                        strD = "Game";
                    }
                    String strD2 = ((GamePlatform) mutableStateFlow.getValue()).d();
                    kVar.getClass();
                    context.getClass();
                    strD2.getClass();
                    Intent intent = new Intent(context, (Class<?>) EmulatorActivity.class);
                    intent.putExtra("rom_path", absolutePath);
                    intent.putExtra("game_title", strD);
                    intent.putExtra("core_name", strD2);
                    context.startActivity(intent);
                } else {
                    Toast.makeText(context, "Download the game first", 0).show();
                }
                break;
            default:
                androidx.compose.ui.platform.h1 h1Var = (androidx.compose.ui.platform.h1) this.y;
                String str3 = (String) this.z;
                String str4 = (String) this.A;
                Context context2 = (Context) this.B;
                androidx.compose.ui.text.g gVar = new androidx.compose.ui.text.g(str3);
                ClipboardManager clipboardManager = ((androidx.compose.ui.platform.h) h1Var).a;
                List list = kotlin.collections.u.e;
                ArrayList arrayList = gVar.z;
                CharSequence charSequence = str3;
                if (!(arrayList == null ? list : arrayList).isEmpty()) {
                    SpannableString spannableString = new SpannableString(str3);
                    androidx.compose.foundation.internal.a aVar = new androidx.compose.foundation.internal.a();
                    aVar.a = Parcel.obtain();
                    if (arrayList != null) {
                        list = arrayList;
                    }
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        androidx.compose.ui.text.e eVar = (androidx.compose.ui.text.e) list.get(i);
                        androidx.compose.ui.text.e0 e0Var = (androidx.compose.ui.text.e0) eVar.a;
                        int i2 = eVar.b;
                        int i3 = eVar.c;
                        aVar.a.recycle();
                        aVar.a = Parcel.obtain();
                        androidx.compose.ui.text.style.o oVar = e0Var.a;
                        long j = e0Var.l;
                        int i4 = i;
                        long j2 = e0Var.h;
                        int i5 = size;
                        List list2 = list;
                        long j3 = e0Var.b;
                        String str5 = str4;
                        Context context3 = context2;
                        long jB = oVar.b();
                        ClipboardManager clipboardManager2 = clipboardManager;
                        long j4 = androidx.compose.ui.graphics.t.i;
                        if (!androidx.compose.ui.graphics.t.c(jB, j4)) {
                            aVar.c((byte) 1);
                            aVar.f(e0Var.a.b());
                        }
                        long j5 = androidx.compose.ui.unit.o.c;
                        SpannableString spannableString2 = spannableString;
                        boolean zA = androidx.compose.ui.unit.o.a(j3, j5);
                        byte b = 2;
                        if (!zA) {
                            aVar.c((byte) 2);
                            aVar.e(j3);
                        }
                        androidx.compose.ui.text.font.l lVar = e0Var.c;
                        if (lVar != null) {
                            aVar.c((byte) 3);
                            aVar.a.writeInt(lVar.e);
                        }
                        androidx.compose.ui.text.font.j jVar = e0Var.d;
                        if (jVar != null) {
                            int i6 = jVar.a;
                            aVar.c((byte) 4);
                            aVar.c((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                        }
                        androidx.compose.ui.text.font.k kVar2 = e0Var.e;
                        if (kVar2 != null) {
                            int i7 = kVar2.a;
                            aVar.c((byte) 5);
                            if (i7 == 0) {
                                b = 0;
                            } else if (i7 == 65535) {
                                b = 1;
                            } else if (i7 != 1) {
                                if (i7 == 2) {
                                    b = 3;
                                } else {
                                    b = 0;
                                }
                            }
                            aVar.c(b);
                        }
                        String str6 = e0Var.g;
                        if (str6 != null) {
                            aVar.c((byte) 6);
                            aVar.a.writeString(str6);
                        }
                        if (!androidx.compose.ui.unit.o.a(j2, j5)) {
                            aVar.c((byte) 7);
                            aVar.e(j2);
                        }
                        androidx.compose.ui.text.style.a aVar2 = e0Var.i;
                        if (aVar2 != null) {
                            float f3 = aVar2.a;
                            aVar.c((byte) 8);
                            aVar.d(f3);
                        }
                        androidx.compose.ui.text.style.p pVar = e0Var.j;
                        if (pVar != null) {
                            aVar.c((byte) 9);
                            aVar.d(pVar.a);
                            aVar.d(pVar.b);
                        }
                        if (!androidx.compose.ui.graphics.t.c(j, j4)) {
                            aVar.c((byte) 10);
                            aVar.f(j);
                        }
                        androidx.compose.ui.text.style.l lVar2 = e0Var.m;
                        if (lVar2 != null) {
                            aVar.c((byte) 11);
                            aVar.a.writeInt(lVar2.a);
                        }
                        androidx.compose.ui.graphics.m0 m0Var = e0Var.n;
                        if (m0Var != null) {
                            aVar.c((byte) 12);
                            aVar.f(m0Var.a);
                            long j6 = m0Var.b;
                            aVar.d(Float.intBitsToFloat((int) (j6 >> 32)));
                            aVar.d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                            aVar.d(m0Var.c);
                        }
                        spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(aVar.a.marshall(), 0)), i2, i3, 33);
                        i = i4 + 1;
                        spannableString = spannableString2;
                        clipboardManager = clipboardManager2;
                        list = list2;
                        size = i5;
                        str4 = str5;
                        context2 = context3;
                    }
                    charSequence = spannableString;
                }
                String str7 = str4;
                Context context4 = context2;
                clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
                context4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str7)));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }
}
