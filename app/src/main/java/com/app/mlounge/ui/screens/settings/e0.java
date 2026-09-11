package com.app.mlounge.ui.screens.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import android.widget.Toast;
import androidx.compose.animation.core.c1;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.gestures.h2;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.lazy.layout.x0;
import androidx.compose.foundation.text.q0;
import androidx.compose.material3.c2;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.j3;
import androidx.compose.material3.k3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.e1;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.m0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.l0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.n0;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static final List a = com.google.common.base.c.q(new kotlin.k(30000L, "30s"), new kotlin.k(60000L, "1m"), new kotlin.k(90000L, "1m 30s"), new kotlin.k(120000L, "2m"), new kotlin.k(300000L, "5m"));
    public static final List b = com.google.common.base.c.q(new f0("internal", "Built-in Player"), new f0("com.mxtech.videoplayer.ad", "MX Player"), new f0("com.mxtech.videoplayer.pro", "MX Player Pro"), new f0("org.videolan.vlc", "VLC"), new f0("com.brouken.player", "Just (Video) Player"), new f0("com.hbplayer.HBvideoplayer", "HB Video Player"), new f0("com.player.bear", "Bear/Fluid Video Player"));
    public static final List c = com.google.common.base.c.q(new f0("internal", "Built-in Downloader"), new f0("com.dv.adm", "ADM"), new f0("idm.internet.download.manager", "1DM"), new f0("idm.internet.download.manager.plus", "1DM+"));

    public static void a(y0 y0Var, y0 y0Var2) {
        if (Build.VERSION.SDK_INT < 30) {
            y0Var.setValue(Boolean.TRUE);
        } else if (Environment.isExternalStorageManager()) {
            y0Var.setValue(Boolean.TRUE);
        } else {
            y0Var2.setValue(Boolean.TRUE);
        }
    }

    public static void b(Context context, androidx.activity.compose.t tVar, androidx.activity.compose.t tVar2, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, e1 e1Var) throws Exception {
        String string = kotlin.text.k.A0((String) y0Var.getValue()).toString();
        if (string.length() > 0) {
            File file = new File((File) y0Var2.getValue(), string);
            if (file.mkdirs() || file.isDirectory()) {
                y0Var2.setValue(file);
                e1Var.h(e1Var.g() + 1);
            } else {
                y0Var3.setValue(string);
                if (Build.VERSION.SDK_INT < 30) {
                    tVar2.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else if (!Environment.isExternalStorageManager()) {
                    try {
                        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                        intent.setData(Uri.parse("package:" + context.getPackageName()));
                        tVar.a(intent);
                    } catch (Exception unused) {
                        tVar.a(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
                    }
                }
            }
        }
        y0Var4.setValue(Boolean.FALSE);
    }

    public static void c(Context context, y0 y0Var, y0 y0Var2, e1 e1Var, androidx.activity.result.a aVar) {
        aVar.getClass();
        if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
            Toast.makeText(context, "Storage permission required to create folders", 0).show();
            y0Var.setValue("");
        } else if (((String) y0Var.getValue()).length() > 0) {
            File file = new File((File) y0Var2.getValue(), (String) y0Var.getValue());
            if (file.mkdirs() || file.isDirectory()) {
                y0Var2.setValue(file);
                e1Var.h(e1Var.g() + 1);
            } else {
                Toast.makeText(context, "Could not create folder", 0).show();
            }
            y0Var.setValue("");
        }
    }

    public static final void d(String str, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(-649355299);
        int i2 = i | (rVar.f(str) ? 4 : 2) | (rVar.h(lVar) ? 32 : 16);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            List listQ = com.google.common.base.c.q(new kotlin.k("fit", "Fit to Screen"), new kotlin.k("4:3", "4:3 (Original)"), new kotlin.k("16:9", "16:9 (Widescreen)"), new kotlin.k("stretch", "Stretch to Fill"));
            t2.a(aVar, androidx.compose.runtime.internal.k.c(-1015995867, new com.app.mlounge.ui.components.h(3, aVar), rVar), null, null, b.f, androidx.compose.runtime.internal.k.c(-1405947222, new w1(14, listQ, lVar, str), rVar), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, rVar, 1769526, 0, 16028);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new w1(str, lVar, aVar, i, 15);
        }
    }

    public static final void e(final com.app.mlounge.ui.viewmodel.k kVar, androidx.compose.runtime.r rVar, int i) {
        int i2;
        rVar.c0(-602393566);
        if ((i & 6) == 0) {
            i2 = i | (rVar.h(kVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            final Context context = (Context) rVar.j(m0.b);
            final y0 y0VarG = androidx.compose.runtime.s.g(kVar.d, rVar);
            final y0 y0VarG2 = androidx.compose.runtime.s.g(kVar.f, rVar);
            final y0 y0VarG3 = androidx.compose.runtime.s.g(kVar.h, rVar);
            final y0 y0VarG4 = androidx.compose.runtime.s.g(kVar.j, rVar);
            final y0 y0VarG5 = androidx.compose.runtime.s.g(kVar.l, rVar);
            final y0 y0VarG6 = androidx.compose.runtime.s.g(kVar.n, rVar);
            final y0 y0VarG7 = androidx.compose.runtime.s.g(kVar.p, rVar);
            final y0 y0VarG8 = androidx.compose.runtime.s.g(kVar.q, rVar);
            final y0 y0VarG9 = androidx.compose.runtime.s.g(kVar.r, rVar);
            final y0 y0VarG10 = androidx.compose.runtime.s.g(kVar.s, rVar);
            final y0 y0VarG11 = androidx.compose.runtime.s.g(kVar.x, rVar);
            final y0 y0VarG12 = androidx.compose.runtime.s.g(kVar.z, rVar);
            final y0 y0VarG13 = androidx.compose.runtime.s.g(kVar.B, rVar);
            final y0 y0VarG14 = androidx.compose.runtime.s.g(kVar.v, rVar);
            final y0 y0VarG15 = androidx.compose.runtime.s.g(kVar.t, rVar);
            final y0 y0VarG16 = androidx.compose.runtime.s.g(kVar.u, rVar);
            String str = ((Number) y0VarG9.getValue()).longValue() > 0 ? new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(((Number) y0VarG9.getValue()).longValue())) : "Never";
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = new androidx.compose.ui.focus.y();
                rVar.l0(objQ);
            }
            final androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) objQ;
            Object objQ2 = rVar.Q();
            if (objQ2 == obj) {
                objQ2 = new androidx.compose.ui.focus.y();
                rVar.l0(objQ2);
            }
            final androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) objQ2;
            androidx.activity.result.contract.b bVar = new androidx.activity.result.contract.b(0);
            boolean zH = rVar.h(context) | rVar.h(kVar);
            Object objQ3 = rVar.Q();
            if (zH || objQ3 == obj) {
                final int i3 = 0;
                objQ3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.y
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        int i4 = i3;
                        kotlin.y yVar3 = kotlin.y.a;
                        com.app.mlounge.ui.viewmodel.k kVar2 = kVar;
                        Context context2 = context;
                        Uri uri = (Uri) obj2;
                        switch (i4) {
                            case 0:
                                if (uri != null) {
                                    try {
                                        context2.getContentResolver().takePersistableUriPermission(uri, 1);
                                        String string = uri.toString();
                                        string.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string, null, 2), 3, null);
                                    } catch (Exception e) {
                                        kotlin.o oVar = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("Settings", "Failed to take M3U permission: " + e.getMessage());
                                        String string2 = uri.toString();
                                        string2.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string2, null, 2), 3, null);
                                    }
                                }
                                break;
                            default:
                                if (uri != null) {
                                    try {
                                        context2.getContentResolver().takePersistableUriPermission(uri, 1);
                                        String string3 = uri.toString();
                                        string3.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string3, null, 1), 3, null);
                                    } catch (Exception e2) {
                                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("Settings", "Failed to take EPG permission: " + e2.getMessage());
                                        String string4 = uri.toString();
                                        string4.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string4, null, 1), 3, null);
                                    }
                                }
                                break;
                        }
                        return yVar3;
                        return yVar3;
                    }
                };
                rVar.l0(objQ3);
            }
            final androidx.activity.compose.t tVarD = _COROUTINE.b.D(bVar, (kotlin.jvm.functions.l) objQ3, rVar, 0);
            androidx.activity.result.contract.b bVar2 = new androidx.activity.result.contract.b(0);
            boolean zH2 = rVar.h(context) | rVar.h(kVar);
            Object objQ4 = rVar.Q();
            if (zH2 || objQ4 == obj) {
                final int i4 = 1;
                objQ4 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.y
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        int i5 = i4;
                        kotlin.y yVar3 = kotlin.y.a;
                        com.app.mlounge.ui.viewmodel.k kVar2 = kVar;
                        Context context2 = context;
                        Uri uri = (Uri) obj2;
                        switch (i5) {
                            case 0:
                                if (uri != null) {
                                    try {
                                        context2.getContentResolver().takePersistableUriPermission(uri, 1);
                                        String string = uri.toString();
                                        string.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string, null, 2), 3, null);
                                    } catch (Exception e) {
                                        kotlin.o oVar = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("Settings", "Failed to take M3U permission: " + e.getMessage());
                                        String string2 = uri.toString();
                                        string2.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string2, null, 2), 3, null);
                                    }
                                }
                                break;
                            default:
                                if (uri != null) {
                                    try {
                                        context2.getContentResolver().takePersistableUriPermission(uri, 1);
                                        String string3 = uri.toString();
                                        string3.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string3, null, 1), 3, null);
                                    } catch (Exception e2) {
                                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("Settings", "Failed to take EPG permission: " + e2.getMessage());
                                        String string4 = uri.toString();
                                        string4.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string4, null, 1), 3, null);
                                    }
                                }
                                break;
                        }
                        return yVar3;
                        return yVar3;
                    }
                };
                rVar.l0(objQ4);
            }
            final androidx.activity.compose.t tVarD2 = _COROUTINE.b.D(bVar2, (kotlin.jvm.functions.l) objQ4, rVar, 0);
            final String str2 = str;
            q("Custom IPTV Provider", true, androidx.compose.runtime.internal.k.c(-582480857, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.settings.z
                /* JADX WARN: Code duplicated, block: B:103:0x077e  */
                /* JADX WARN: Code duplicated, block: B:107:0x0797  */
                /* JADX WARN: Code duplicated, block: B:110:0x099f  */
                /* JADX WARN: Code duplicated, block: B:111:0x09a3  */
                /* JADX WARN: Code duplicated, block: B:114:0x09f7  */
                /* JADX WARN: Code duplicated, block: B:115:0x09fb  */
                /* JADX WARN: Code duplicated, block: B:118:0x0a84  */
                /* JADX WARN: Code duplicated, block: B:119:0x0a87  */
                /* JADX WARN: Code duplicated, block: B:122:0x0ad9  */
                /* JADX WARN: Code duplicated, block: B:125:0x0ade  */
                /* JADX WARN: Code duplicated, block: B:130:0x0b80  */
                /* JADX WARN: Code duplicated, block: B:131:0x0b84  */
                /* JADX WARN: Code duplicated, block: B:134:0x0c07  */
                /* JADX WARN: Code duplicated, block: B:136:0x0c35  */
                /* JADX WARN: Code duplicated, block: B:137:0x0c39  */
                /* JADX WARN: Code duplicated, block: B:139:0x0cc3  */
                /* JADX WARN: Code duplicated, block: B:141:0x0cf6  */
                /* JADX WARN: Code duplicated, block: B:142:0x0cfa  */
                /* JADX WARN: Code duplicated, block: B:145:0x0d4d  */
                /* JADX WARN: Code duplicated, block: B:146:0x0d51  */
                /* JADX WARN: Code duplicated, block: B:149:0x0d89  */
                /* JADX WARN: Code duplicated, block: B:151:0x0d8e  */
                /* JADX WARN: Code duplicated, block: B:154:0x0d9d  */
                /* JADX WARN: Code duplicated, block: B:158:0x0dbc  */
                /* JADX WARN: Code duplicated, block: B:161:0x0ddb  */
                /* JADX WARN: Code duplicated, block: B:164:0x0ded  */
                /* JADX WARN: Code duplicated, block: B:166:0x0e06  */
                /* JADX WARN: Code duplicated, block: B:169:0x0e21  */
                /* JADX WARN: Code duplicated, block: B:170:0x0e74  */
                /* JADX WARN: Code duplicated, block: B:173:0x0e8c  */
                /* JADX WARN: Code duplicated, block: B:174:0x0edd  */
                /* JADX WARN: Code duplicated, block: B:182:0x0f18  */
                /* JADX WARN: Code duplicated, block: B:184:0x0f63  */
                /* JADX WARN: Code duplicated, block: B:185:0x0f67  */
                /* JADX WARN: Code duplicated, block: B:188:0x0fd2  */
                /* JADX WARN: Code duplicated, block: B:189:0x0fd6  */
                /* JADX WARN: Code duplicated, block: B:192:0x1047  */
                /* JADX WARN: Code duplicated, block: B:193:0x104a  */
                /* JADX WARN: Code duplicated, block: B:94:0x066e  */
                /* JADX WARN: Code duplicated, block: B:97:0x0680  */
                /* JADX WARN: Code duplicated, block: B:99:0x068a  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Object obj5;
                    final int i5;
                    Object obj6;
                    char c2;
                    char c3;
                    boolean z;
                    int i6;
                    float f;
                    androidx.compose.ui.focus.y yVar3;
                    androidx.compose.ui.focus.y yVar4;
                    Object obj7;
                    Object obj8;
                    boolean zH3;
                    Object obj9;
                    androidx.compose.ui.graphics.vector.f fVarB;
                    char c4;
                    char c5;
                    int i7;
                    int i8;
                    boolean zH4;
                    Object obj10;
                    androidx.compose.ui.graphics.vector.f fVarB2;
                    kotlin.jvm.functions.a aVarB;
                    kotlin.jvm.functions.a aVarB2;
                    float f2;
                    Object obj11;
                    androidx.compose.ui.i iVar;
                    androidx.compose.runtime.t2 t2Var;
                    String str3;
                    boolean zH5;
                    Object objQ5;
                    Object obj12;
                    com.app.mlounge.ui.viewmodel.k kVar2;
                    Object obj13;
                    String strS0;
                    String strS1;
                    androidx.compose.ui.focus.y yVar5;
                    Object obj14;
                    androidx.compose.ui.focus.y yVar6;
                    androidx.compose.runtime.r rVar2;
                    androidx.compose.ui.o oVar;
                    float f3;
                    androidx.compose.foundation.layout.c cVar;
                    kotlin.jvm.functions.a aVarB3;
                    Object obj15;
                    androidx.compose.ui.h hVar;
                    androidx.compose.runtime.r rVar3;
                    boolean zBooleanValue;
                    androidx.compose.runtime.t2 t2Var2;
                    androidx.compose.runtime.t2 t2Var3;
                    androidx.compose.runtime.t2 t2Var4;
                    kotlin.jvm.functions.a aVarB4;
                    kotlin.jvm.functions.a aVarB5;
                    String str4;
                    Object objQ6;
                    Object obj16;
                    final com.app.mlounge.ui.viewmodel.k kVar3;
                    boolean zH6;
                    Object obj17;
                    final int i9;
                    androidx.compose.ui.o oVar2;
                    int i10;
                    androidx.compose.runtime.r rVar4;
                    androidx.compose.runtime.t2 t2Var5;
                    androidx.compose.ui.o oVar3;
                    androidx.compose.runtime.r rVar5;
                    boolean zH7;
                    Object objQ7;
                    Object obj18;
                    androidx.compose.runtime.r rVar6;
                    kotlin.jvm.functions.a aVarB6;
                    androidx.compose.runtime.r rVar7;
                    kotlin.jvm.functions.a aVarB7;
                    String str5;
                    kotlin.jvm.functions.a aVarB8;
                    androidx.compose.runtime.r rVar8;
                    com.app.mlounge.ui.viewmodel.k kVar4;
                    androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    androidx.compose.ui.i iVar2 = androidx.compose.ui.c.H;
                    ((androidx.compose.foundation.layout.w) obj2).getClass();
                    if (rVar9.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        float f4 = 16;
                        float f5 = 12;
                        androidx.compose.ui.o oVar4 = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(oVar4, f4, f5);
                        androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.h.c;
                        androidx.compose.ui.h hVar2 = androidx.compose.ui.c.J;
                        androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(cVar2, hVar2, rVar9, 0);
                        int iHashCode = Long.hashCode(rVar9.T);
                        androidx.compose.runtime.internal.j jVarL = rVar9.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar9, rVarP);
                        androidx.compose.ui.node.g.b.getClass();
                        kotlin.jvm.functions.a aVar = androidx.compose.ui.node.f.b;
                        rVar9.e0();
                        if (rVar9.S) {
                            rVar9.k(aVar);
                        } else {
                            rVar9.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                        androidx.compose.runtime.s.x(rVar9, vVarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                        androidx.compose.runtime.s.x(rVar9, jVarL, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                        androidx.compose.runtime.s.p(rVar9, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                        androidx.compose.runtime.s.t(rVar9, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                        androidx.compose.runtime.s.x(rVar9, rVarC, eVar4);
                        float f6 = 8;
                        androidx.compose.foundation.layout.c cVar3 = cVar2;
                        androidx.compose.ui.i iVar3 = iVar2;
                        androidx.compose.ui.o oVar5 = oVar4;
                        androidx.compose.ui.h hVar3 = hVar2;
                        p3.b("Source Type", androidx.compose.foundation.layout.b.s(oVar4, 0.0f, 0.0f, 0.0f, f6, 7), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, t2.n(rVar9).n, rVar9, 54, 0, 131064);
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f6);
                        androidx.compose.ui.i iVar4 = androidx.compose.ui.c.G;
                        t0 t0VarA = r0.a(fVarG, iVar4, rVar9, 6);
                        int iHashCode2 = Long.hashCode(rVar9.T);
                        androidx.compose.runtime.internal.j jVarL2 = rVar9.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar9, oVar5);
                        rVar9.e0();
                        if (rVar9.S) {
                            rVar9.k(aVar);
                        } else {
                            rVar9.o0();
                        }
                        androidx.compose.runtime.s.x(rVar9, t0VarA, eVar);
                        androidx.compose.runtime.s.x(rVar9, jVarL2, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar9, eVar3, rVar9, dVar);
                        androidx.compose.runtime.s.x(rVar9, rVarC2, eVar4);
                        androidx.compose.runtime.t2 t2Var6 = y0VarG;
                        boolean zA = kotlin.jvm.internal.l.a((String) t2Var6.getValue(), "m3u");
                        final com.app.mlounge.ui.viewmodel.k kVar5 = kVar;
                        boolean zH8 = rVar9.h(kVar5);
                        Object objQ8 = rVar9.Q();
                        Object obj19 = androidx.compose.runtime.m.a;
                        if (zH8 || objQ8 == obj19) {
                            final int i11 = 0;
                            Object obj20 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.i
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            kVar5.h("m3u");
                                            break;
                                        case 1:
                                            kVar5.h("xtream");
                                            break;
                                        case 2:
                                            kVar5.h("local");
                                            break;
                                        case 3:
                                            com.app.mlounge.ui.viewmodel.k kVar6 = kVar5;
                                            kVar6.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(kVar6), null, null, new com.app.mlounge.ui.viewmodel.i(kVar6, null), 3, null);
                                            break;
                                        default:
                                            com.app.mlounge.ui.viewmodel.k kVar7 = kVar5;
                                            kVar7.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(kVar7), null, null, new c1(kVar7, null, 20), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            rVar9.l0(obj20);
                            obj5 = obj20;
                        } else {
                            obj5 = objQ8;
                        }
                        e0.k("M3U Playlist", zA, null, (kotlin.jvm.functions.a) obj5, rVar9, 6, 4);
                        boolean zA2 = kotlin.jvm.internal.l.a((String) t2Var6.getValue(), "xtream");
                        boolean zH9 = rVar9.h(kVar5);
                        Object objQ9 = rVar9.Q();
                        if (zH9 || objQ9 == obj19) {
                            i5 = 1;
                            Object obj21 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.i
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            kVar5.h("m3u");
                                            break;
                                        case 1:
                                            kVar5.h("xtream");
                                            break;
                                        case 2:
                                            kVar5.h("local");
                                            break;
                                        case 3:
                                            com.app.mlounge.ui.viewmodel.k kVar6 = kVar5;
                                            kVar6.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(kVar6), null, null, new com.app.mlounge.ui.viewmodel.i(kVar6, null), 3, null);
                                            break;
                                        default:
                                            com.app.mlounge.ui.viewmodel.k kVar7 = kVar5;
                                            kVar7.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(kVar7), null, null, new c1(kVar7, null, 20), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            rVar9.l0(obj21);
                            obj6 = obj21;
                        } else {
                            i5 = 1;
                            obj6 = objQ9;
                        }
                        boolean z2 = i5;
                        e0.k("Xtream Codes", zA2, null, (kotlin.jvm.functions.a) obj6, rVar9, 6, 4);
                        boolean zA3 = kotlin.jvm.internal.l.a((String) t2Var6.getValue(), "local");
                        boolean zH10 = rVar9.h(kVar5);
                        Object objQ10 = rVar9.Q();
                        final int i12 = 2;
                        Object obj22 = objQ10;
                        if (zH10 || objQ10 == obj19) {
                            Object obj23 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.i
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            kVar5.h("m3u");
                                            break;
                                        case 1:
                                            kVar5.h("xtream");
                                            break;
                                        case 2:
                                            kVar5.h("local");
                                            break;
                                        case 3:
                                            com.app.mlounge.ui.viewmodel.k kVar6 = kVar5;
                                            kVar6.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(kVar6), null, null, new com.app.mlounge.ui.viewmodel.i(kVar6, null), 3, null);
                                            break;
                                        default:
                                            com.app.mlounge.ui.viewmodel.k kVar7 = kVar5;
                                            kVar7.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(kVar7), null, null, new c1(kVar7, null, 20), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            rVar9.l0(obj23);
                            obj22 = obj23;
                        }
                        e0.k("Local File", zA3, null, (kotlin.jvm.functions.a) obj22, rVar9, 6, 4);
                        rVar9.p(z2);
                        rVar9.p(z2);
                        t2.d(null, 0.0f, androidx.compose.ui.graphics.t.b(0.08f, androidx.compose.ui.graphics.t.d), rVar9, 384, 3);
                        boolean zA4 = kotlin.jvm.internal.l.a((String) t2Var6.getValue(), "m3u");
                        androidx.compose.ui.focus.y yVar7 = yVar2;
                        androidx.compose.ui.focus.y yVar8 = yVar;
                        if (zA4) {
                            rVar9.b0(-1018547986);
                            String str6 = (String) y0VarG2.getValue();
                            boolean zH11 = rVar9.h(kVar5);
                            Object objQ11 = rVar9.Q();
                            if (zH11 || objQ11 == obj19) {
                                kVar4 = kVar5;
                                objQ11 = new androidx.compose.foundation.c(1, kVar4, com.app.mlounge.ui.viewmodel.k.class, "setM3uUrl", "setM3uUrl(Ljava/lang/String;)V", 0, 16);
                                rVar9.l0(objQ11);
                            } else {
                                kVar4 = kVar5;
                            }
                            com.app.mlounge.ui.viewmodel.k kVar6 = kVar4;
                            yVar6 = yVar8;
                            e0.s("M3U Playlist URL", str6, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ11), t1.p(), androidx.compose.foundation.layout.b.q(oVar5, f4, 0.0f, 2), "http://example.com/playlist.m3u", null, new q0(5, Token.EXPORT), rVar9, 12804102, 64);
                            String str7 = (String) y0VarG3.getValue();
                            boolean zH12 = rVar9.h(kVar6);
                            Object objQ12 = rVar9.Q();
                            if (zH12 || objQ12 == obj19) {
                                objQ12 = new androidx.compose.foundation.c(1, kVar6, com.app.mlounge.ui.viewmodel.k.class, "setEpgUrl", "setEpgUrl(Ljava/lang/String;)V", 0, 17);
                                rVar9.l0(objQ12);
                            }
                            e0.s("EPG URL (optional)", str7, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ12), t1.n(), androidx.compose.foundation.layout.b.q(oVar5, f4, 0.0f, 2), "http://example.com/epg.xml.gz", null, new q0(5, Token.EXPORT), rVar9, 12804102, 64);
                            androidx.compose.runtime.r rVar10 = rVar9;
                            rVar10.p(false);
                            f2 = f4;
                            kVar2 = kVar6;
                            obj13 = obj19;
                            obj11 = "local";
                            iVar = iVar4;
                            yVar3 = yVar7;
                            rVar8 = rVar10;
                        } else {
                            final int i13 = 0;
                            if (kotlin.jvm.internal.l.a((String) t2Var6.getValue(), "local")) {
                                rVar9.b0(-1017616839);
                                androidx.compose.runtime.t2 t2Var7 = y0VarG15;
                                if (kotlin.text.k.d0((String) t2Var7.getValue())) {
                                    strS0 = "Choose .m3u file";
                                } else {
                                    String str8 = (String) t2Var7.getValue();
                                    strS0 = kotlin.text.k.s0(str8, "%2F", str8);
                                }
                                String str9 = strS0;
                                androidx.compose.ui.graphics.vector.f fVarP = com.google.firebase.b.p();
                                final androidx.activity.compose.t tVar = tVarD;
                                boolean zH13 = rVar9.h(tVar);
                                Object objQ13 = rVar9.Q();
                                Object obj24 = objQ13;
                                if (zH13 || objQ13 == obj19) {
                                    Object obj25 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.k
                                        @Override // kotlin.jvm.functions.a
                                        public final Object invoke() throws Exception {
                                            switch (i13) {
                                                case 0:
                                                    tVar.a(new String[]{"*/*"});
                                                    break;
                                                default:
                                                    tVar.a(new String[]{"*/*"});
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    rVar9.l0(obj25);
                                    obj24 = obj25;
                                }
                                e0.o("Select Local M3U", str9, fVarP, null, (kotlin.jvm.functions.a) obj24, rVar9, 6, 8);
                                androidx.compose.runtime.t2 t2Var8 = y0VarG16;
                                if (kotlin.text.k.d0((String) t2Var8.getValue())) {
                                    strS1 = "Choose .xml or .gz file";
                                } else {
                                    String str10 = (String) t2Var8.getValue();
                                    strS1 = kotlin.text.k.s0(str10, "%2F", str10);
                                }
                                String str11 = strS1;
                                androidx.compose.ui.graphics.vector.f fVarN = t1.n();
                                androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(oVar5, yVar7);
                                Object objQ14 = rVar9.Q();
                                if (objQ14 == obj19) {
                                    yVar5 = yVar8;
                                    Object n0Var = new n0(yVar5, z2 ? 1 : 0);
                                    rVar9.l0(n0Var);
                                    obj14 = n0Var;
                                } else {
                                    yVar5 = yVar8;
                                    obj14 = objQ14;
                                }
                                androidx.compose.ui.r rVarI = androidx.compose.ui.focus.d.i(rVarK, (kotlin.jvm.functions.l) obj14);
                                final androidx.activity.compose.t tVar2 = tVarD2;
                                boolean zH14 = rVar9.h(tVar2);
                                Object objQ15 = rVar9.Q();
                                Object obj26 = objQ15;
                                if (zH14 || objQ15 == obj19) {
                                    final int i14 = z2 ? 1 : 0;
                                    Object obj27 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.k
                                        @Override // kotlin.jvm.functions.a
                                        public final Object invoke() throws Exception {
                                            switch (i14) {
                                                case 0:
                                                    tVar2.a(new String[]{"*/*"});
                                                    break;
                                                default:
                                                    tVar2.a(new String[]{"*/*"});
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    rVar9.l0(obj27);
                                    obj26 = obj27;
                                }
                                yVar6 = yVar5;
                                e0.o("Select Local EPG (optional)", str11, fVarN, rVarI, (kotlin.jvm.functions.a) obj26, rVar9, 6, 0);
                                androidx.compose.runtime.r rVar11 = rVar9;
                                rVar11.p(false);
                                yVar3 = yVar7;
                                obj11 = "local";
                                f2 = f4;
                                kVar2 = kVar5;
                                obj13 = obj19;
                                iVar = iVar4;
                                rVar8 = rVar11;
                            } else {
                                rVar9.b0(-1016681786);
                                String str12 = (String) y0VarG4.getValue();
                                boolean zH15 = rVar9.h(kVar5);
                                Object objQ16 = rVar9.Q();
                                if (zH15 || objQ16 == obj19) {
                                    objQ16 = new androidx.compose.foundation.c(1, kVar5, com.app.mlounge.ui.viewmodel.k.class, "setXtreamHost", "setXtreamHost(Ljava/lang/String;)V", 0, 18);
                                    rVar9.l0(objQ16);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ16);
                                androidx.compose.ui.graphics.vector.f fVarB3 = okhttp3.internal.platform.android.g.y;
                                if (fVarB3 != null) {
                                    c3 = 0;
                                    c2 = 0;
                                    z = false;
                                    i6 = 2;
                                    f = 0.0f;
                                } else {
                                    androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.Dns", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i15 = h0.a;
                                    p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                                    androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar.o(20.0f, 13.0f);
                                    gVar.k(4.0f);
                                    gVar.h(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                                    gVar.s(6.0f);
                                    gVar.h(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                                    gVar.l(16.0f);
                                    gVar.h(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                                    gVar.s(-6.0f);
                                    gVar.h(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                                    gVar.f();
                                    gVar.o(7.0f, 19.0f);
                                    gVar.h(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                                    gVar.q(0.9f, -2.0f, 2.0f, -2.0f);
                                    gVar.q(2.0f, 0.9f, 2.0f, 2.0f);
                                    gVar.q(-0.9f, 2.0f, -2.0f, 2.0f);
                                    gVar.f();
                                    gVar.o(20.0f, 3.0f);
                                    gVar.k(4.0f);
                                    gVar.h(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                                    gVar.s(6.0f);
                                    gVar.h(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                                    gVar.l(16.0f);
                                    gVar.h(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                                    gVar.r(4.0f);
                                    gVar.h(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                                    gVar.f();
                                    c2 = 0;
                                    gVar.o(7.0f, 9.0f);
                                    gVar.h(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                                    c3 = 0;
                                    gVar.q(0.9f, -2.0f, 2.0f, -2.0f);
                                    gVar.q(2.0f, 0.9f, 2.0f, 2.0f);
                                    gVar.q(-0.9f, 2.0f, -2.0f, 2.0f);
                                    gVar.f();
                                    z = false;
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.a, 0, p0Var);
                                    fVarB3 = eVar5.b();
                                    okhttp3.internal.platform.android.g.y = fVarB3;
                                    i6 = 2;
                                    f = 0.0f;
                                }
                                yVar3 = yVar7;
                                yVar4 = yVar8;
                                e0.s("Server Host", str12, lVar, fVarB3, androidx.compose.foundation.layout.b.q(oVar5, f4, f, i6), "http://yourserver.com", null, new q0(5, Token.EXPORT), 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05a0: INVOKE 
                                      ("Server Host")
                                      (r3v17 'str12' java.lang.String)
                                      (r4v19 'lVar' kotlin.jvm.functions.l)
                                      (r5v18 'fVarB3' androidx.compose.ui.graphics.vector.f)
                                      (wrap androidx.compose.ui.r:0x0574: INVOKE (r0v1 'oVar5' androidx.compose.ui.o), (r1v7 'f4' float), (r9v12 'f' float), (r2v36 'i6' int) STATIC call: androidx.compose.foundation.layout.b.q(androidx.compose.ui.r, float, float, int):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float, float, int):androidx.compose.ui.r (m), WRAPPED] (LINE:1397))
                                      ("http://yourserver.com")
                                      (null androidx.compose.ui.text.input.g0)
                                      (wrap androidx.compose.foundation.text.q0:0x057f: CONSTRUCTOR (5 int), (wrap int:SGET  A[WRAPPED] org.mozilla.javascript.Token.EXPORT int) A[MD:(int, int):void (m), WRAPPED] (LINE:1408) call: androidx.compose.foundation.text.q0.<init>(int, int):void type: CONSTRUCTOR)
                                      (r6v3 ?? I:??[OBJECT, ARRAY])
                                      (12804102 int)
                                      (64 int)
                                     STATIC call: com.app.mlounge.ui.screens.settings.e0.s(java.lang.String, java.lang.String, kotlin.jvm.functions.l, androidx.compose.ui.graphics.vector.f, androidx.compose.ui.r, java.lang.String, androidx.compose.ui.text.input.g0, androidx.compose.foundation.text.q0, androidx.compose.runtime.r, int, int):void A[MD:(java.lang.String, java.lang.String, kotlin.jvm.functions.l, androidx.compose.ui.graphics.vector.f, androidx.compose.ui.r, java.lang.String, androidx.compose.ui.text.input.g0, androidx.compose.foundation.text.q0, androidx.compose.runtime.r, int, int):void (m)] (LINE:1441) in method: com.app.mlounge.ui.screens.settings.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v3 ??
                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                    */
                                /*
                                    Method dump skipped, instruction units count: 4239
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.settings.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, rVar), rVar, 438, 0);
                    } else {
                        rVar.W();
                    }
                    q1 q1VarT = rVar.t();
                    if (q1VarT != null) {
                        q1VarT.d = new androidx.compose.foundation.lazy.l(kVar, i, 2);
                    }
                }

                public static final void f(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
                    rVar.c0(367734490);
                    int i2 = i | (rVar.h(pVar) ? 4 : 2);
                    if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
                        Context context = (Context) rVar.j(m0.b);
                        PackageManager packageManager = context.getPackageManager();
                        Object objQ = rVar.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            List list = b;
                            ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((f0) it.next()).a);
                            }
                            Set setO0 = kotlin.collections.o.o0(arrayList);
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setType("video/*");
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setType("video/*");
                            intent2.setData(Uri.parse("https://example.com/video.m3u8"));
                            Intent intent3 = new Intent("android.intent.action.VIEW");
                            intent3.setType("video/*");
                            intent3.setData(Uri.parse("file:///sdcard/video.mp4"));
                            List listQ = com.google.common.base.c.q(intent, intent2, intent3);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = listQ.iterator();
                            while (it2.hasNext()) {
                                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities((Intent) it2.next(), 0);
                                listQueryIntentActivities.getClass();
                                ArrayList arrayList3 = new ArrayList();
                                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                                    String str = resolveInfo.activityInfo.packageName;
                                    kotlin.k kVar = (setO0.contains(str) || kotlin.jvm.internal.l.a(str, context.getPackageName())) ? null : new kotlin.k(str, resolveInfo.loadLabel(packageManager).toString());
                                    if (kVar != null) {
                                        arrayList3.add(kVar);
                                    }
                                }
                                kotlin.collections.o.C(arrayList2, arrayList3);
                            }
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : arrayList2) {
                                if (hashSet.add((String) ((kotlin.k) obj).e)) {
                                    arrayList4.add(obj);
                                }
                            }
                            objQ = kotlin.collections.o.f0(arrayList4, new androidx.constraintlayout.core.e(15));
                            rVar.l0(objQ);
                        }
                        t2.a(aVar, androidx.compose.runtime.internal.k.c(-506329310, new com.app.mlounge.ui.components.h(5, aVar), rVar), null, null, b.l, androidx.compose.runtime.internal.k.c(843571047, new androidx.compose.foundation.contextmenu.f(26, (List) objQ, pVar), rVar), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, rVar, 1769526, 0, 16028);
                    } else {
                        rVar.W();
                    }
                    q1 q1VarT = rVar.t();
                    if (q1VarT != null) {
                        q1VarT.d = new w(pVar, aVar, i, 0);
                    }
                }

                public static final void g(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
                    rVar.c0(943054088);
                    int i2 = i | (rVar.h(pVar) ? 4 : 2);
                    if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
                        Context context = (Context) rVar.j(m0.b);
                        PackageManager packageManager = context.getPackageManager();
                        t2.a(aVar, androidx.compose.runtime.internal.k.c(576413520, new com.app.mlounge.ui.components.h(7, aVar), rVar), null, null, b.n, androidx.compose.runtime.internal.k.c(186462165, new w1(17, pVar, packageManager, context), rVar), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, rVar, 1769526, 0, 16028);
                    } else {
                        rVar.W();
                    }
                    q1 q1VarT = rVar.t();
                    if (q1VarT != null) {
                        q1VarT.d = new w(pVar, aVar, i, 1);
                    }
                }

                public static final void h(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, androidx.compose.runtime.r rVar, int i) {
                    rVar.c0(-1638198208);
                    int i2 = i | (rVar.h(pVar) ? 4 : 2);
                    if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                        Context context = (Context) rVar.j(m0.b);
                        PackageManager packageManager = context.getPackageManager();
                        t2.a(aVar2, androidx.compose.runtime.internal.k.c(1670889608, new com.app.mlounge.ui.components.h(6, aVar2), rVar), null, null, b.j, androidx.compose.runtime.internal.k.c(-2091230899, new androidx.compose.foundation.text.contextmenu.provider.d(aVar, pVar, packageManager, context, 6), rVar), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, rVar, 1769526, 0, 16028);
                    } else {
                        rVar.W();
                    }
                    q1 q1VarT = rVar.t();
                    if (q1VarT != null) {
                        q1VarT.d = new w1(pVar, aVar, aVar2, i, 16);
                    }
                }

                public static final void i(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
                    androidx.compose.runtime.r rVar2;
                    Object obj;
                    boolean z;
                    Context context;
                    androidx.compose.runtime.f fVar;
                    androidx.compose.runtime.r rVar3;
                    y0 y0Var;
                    File externalStorageDirectory;
                    File[] fileArrListFiles;
                    File file;
                    rVar.c0(-1623262251);
                    int i2 = i | (rVar.h(lVar) ? 4 : 2);
                    if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
                        final Context context2 = (Context) rVar.j(m0.b);
                        Object objQ = rVar.Q();
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                        if (objQ == fVar2) {
                            ArrayList arrayList = new ArrayList();
                            File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
                            if (externalStorageDirectory2.exists()) {
                                obj = objQ;
                                arrayList.add(new kotlin.k(externalStorageDirectory2, "Internal"));
                            }
                            obj = objQ;
                            Object systemService = context2.getSystemService("storage");
                            systemService.getClass();
                            List<StorageVolume> storageVolumes = ((StorageManager) systemService).getStorageVolumes();
                            storageVolumes.getClass();
                            for (StorageVolume storageVolume : storageVolumes) {
                                if (!storageVolume.isPrimary()) {
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        file = storageVolume.getDirectory();
                                    } else {
                                        try {
                                            Object objInvoke = storageVolume.getClass().getMethod("getPath", null).invoke(storageVolume, null);
                                            objInvoke.getClass();
                                            file = new File((String) objInvoke);
                                        } catch (Exception unused) {
                                            file = null;
                                        }
                                    }
                                    if (file != null && file.exists() && file.canRead()) {
                                        String description = storageVolume.getDescription(context2);
                                        if (description == null) {
                                            description = "External Drive";
                                        }
                                        if (!arrayList.isEmpty()) {
                                            Iterator it = arrayList.iterator();
                                            do {
                                                if (it.hasNext()) {
                                                }
                                            } while (!kotlin.jvm.internal.l.a(((File) ((kotlin.k) it.next()).e).getAbsolutePath(), file.getAbsolutePath()));
                                        }
                                        arrayList.add(new kotlin.k(file, description));
                                        break;
                                    }
                                }
                            }
                            if (arrayList.size() <= 1 && (fileArrListFiles = new File("/storage").listFiles()) != null) {
                                for (File file2 : fileArrListFiles) {
                                    if (file2.isDirectory() && file2.canRead() && !kotlin.jvm.internal.l.a(file2.getName(), "emulated") && !kotlin.jvm.internal.l.a(file2.getName(), "self")) {
                                        if (arrayList.isEmpty()) {
                                            arrayList.add(new kotlin.k(file2, file2.getName()));
                                            break;
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        do {
                                            if (!it2.hasNext()) {
                                                arrayList.add(new kotlin.k(file2, file2.getName()));
                                                break;
                                                break;
                                            }
                                        } while (!kotlin.jvm.internal.l.a(((File) ((kotlin.k) it2.next()).e).getAbsolutePath(), file2.getAbsolutePath()));
                                    }
                                }
                            }
                            rVar.l0(arrayList);
                            obj = arrayList;
                        }
                        obj = objQ;
                        List list = (List) obj;
                        Object objQ2 = rVar.Q();
                        if (objQ2 == fVar2) {
                            kotlin.k kVar = (kotlin.k) kotlin.collections.o.M(list);
                            if (kVar == null || (externalStorageDirectory = (File) kVar.e) == null) {
                                externalStorageDirectory = Environment.getExternalStorageDirectory();
                            }
                            objQ2 = androidx.compose.runtime.s.r(externalStorageDirectory);
                            rVar.l0(objQ2);
                        }
                        final y0 y0Var2 = (y0) objQ2;
                        Object objQ3 = rVar.Q();
                        if (objQ3 == fVar2) {
                            objQ3 = androidx.compose.runtime.s.r(kotlin.collections.u.e);
                            rVar.l0(objQ3);
                        }
                        y0 y0Var3 = (y0) objQ3;
                        Object objQ4 = rVar.Q();
                        if (objQ4 == fVar2) {
                            objQ4 = new e1(0);
                            rVar.l0(objQ4);
                        }
                        final e1 e1Var = (e1) objQ4;
                        Object objQ5 = rVar.Q();
                        if (objQ5 == fVar2) {
                            objQ5 = androidx.compose.runtime.s.r(Boolean.FALSE);
                            rVar.l0(objQ5);
                        }
                        y0 y0Var4 = (y0) objQ5;
                        Object objQ6 = rVar.Q();
                        if (objQ6 == fVar2) {
                            objQ6 = androidx.compose.runtime.s.r("");
                            rVar.l0(objQ6);
                        }
                        final y0 y0Var5 = (y0) objQ6;
                        Object objQ7 = rVar.Q();
                        if (objQ7 == fVar2) {
                            objQ7 = androidx.compose.runtime.s.r(null);
                            rVar.l0(objQ7);
                        }
                        y0 y0Var6 = (y0) objQ7;
                        androidx.activity.result.contract.b bVar = new androidx.activity.result.contract.b(3);
                        boolean zH = rVar.h(context2);
                        Object objQ8 = rVar.Q();
                        if (zH || objQ8 == fVar2) {
                            final int i3 = 0;
                            kotlin.jvm.functions.l lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.c0
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    switch (i3) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                            Context context3 = context2;
                                            y0 y0Var7 = y0Var5;
                                            if (zBooleanValue && ((String) y0Var7.getValue()).length() > 0) {
                                                y0 y0Var8 = y0Var2;
                                                File file3 = new File((File) y0Var8.getValue(), (String) y0Var7.getValue());
                                                if (file3.mkdirs() || file3.isDirectory()) {
                                                    y0Var8.setValue(file3);
                                                    e1 e1Var2 = e1Var;
                                                    e1Var2.h(e1Var2.g() + 1);
                                                } else {
                                                    Toast.makeText(context3, "Could not create folder", 0).show();
                                                }
                                                y0Var7.setValue("");
                                            } else if (!zBooleanValue) {
                                                Toast.makeText(context3, "Storage permission required to create folders", 0).show();
                                                y0Var7.setValue("");
                                            }
                                            break;
                                        default:
                                            e0.c(context2, y0Var5, y0Var2, e1Var, (androidx.activity.result.a) obj2);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            rVar.l0(lVar2);
                            objQ8 = lVar2;
                        }
                        androidx.activity.compose.t tVarD = _COROUTINE.b.D(bVar, (kotlin.jvm.functions.l) objQ8, rVar, 0);
                        androidx.activity.result.contract.b bVar2 = new androidx.activity.result.contract.b(4);
                        boolean zH2 = rVar.h(context2);
                        Object objQ9 = rVar.Q();
                        if (zH2 || objQ9 == fVar2) {
                            final int i4 = 1;
                            objQ9 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.c0
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    switch (i4) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                            Context context3 = context2;
                                            y0 y0Var7 = y0Var5;
                                            if (zBooleanValue && ((String) y0Var7.getValue()).length() > 0) {
                                                y0 y0Var8 = y0Var2;
                                                File file3 = new File((File) y0Var8.getValue(), (String) y0Var7.getValue());
                                                if (file3.mkdirs() || file3.isDirectory()) {
                                                    y0Var8.setValue(file3);
                                                    e1 e1Var2 = e1Var;
                                                    e1Var2.h(e1Var2.g() + 1);
                                                } else {
                                                    Toast.makeText(context3, "Could not create folder", 0).show();
                                                }
                                                y0Var7.setValue("");
                                            } else if (!zBooleanValue) {
                                                Toast.makeText(context3, "Storage permission required to create folders", 0).show();
                                                y0Var7.setValue("");
                                            }
                                            break;
                                        default:
                                            e0.c(context2, y0Var5, y0Var2, e1Var, (androidx.activity.result.a) obj2);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            rVar.l0(objQ9);
                        }
                        androidx.activity.compose.t tVarD2 = _COROUTINE.b.D(bVar2, (kotlin.jvm.functions.l) objQ9, rVar, 0);
                        androidx.activity.result.contract.b bVar3 = new androidx.activity.result.contract.b(1);
                        boolean zH3 = ((i2 & 14) == 4) | rVar.h(context2);
                        Object objQ10 = rVar.Q();
                        if (zH3 || objQ10 == fVar2) {
                            objQ10 = new androidx.datastore.core.t0(18, context2, lVar);
                            rVar.l0(objQ10);
                        }
                        androidx.activity.compose.t tVarD3 = _COROUTINE.b.D(bVar3, (kotlin.jvm.functions.l) objQ10, rVar, 0);
                        File file3 = (File) y0Var2.getValue();
                        Integer numValueOf = Integer.valueOf(e1Var.g());
                        Object objQ11 = rVar.Q();
                        if (objQ11 == fVar2) {
                            objQ11 = new androidx.compose.foundation.text.input.internal.k(y0Var2, y0Var3, null, 12);
                            rVar.l0(objQ11);
                        }
                        j0.d(file3, numValueOf, (kotlin.jvm.functions.p) objQ11, rVar);
                        boolean zF = rVar.f((File) y0Var2.getValue());
                        Object objQ12 = rVar.Q();
                        if (zF || objQ12 == fVar2) {
                            try {
                                StatFs statFs = new StatFs(((File) y0Var2.getValue()).getAbsolutePath());
                                long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                                objQ12 = availableBlocksLong < 1048576 ? (availableBlocksLong / ((long) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) + " KB free" : availableBlocksLong < 1073741824 ? String.format(Locale.US, "%.1f MB free", Arrays.copyOf(new Object[]{Double.valueOf(availableBlocksLong / 1048576.0d)}, 1)) : String.format(Locale.US, "%.1f GB free", Arrays.copyOf(new Object[]{Double.valueOf(availableBlocksLong / 1.073741824E9d)}, 1));
                            } catch (Exception unused2) {
                                objQ12 = "";
                            }
                            rVar.l0(objQ12);
                        }
                        androidx.compose.runtime.r rVar4 = rVar;
                        t1.a(aVar, new androidx.compose.ui.window.w(3, false, false), androidx.compose.runtime.internal.k.c(1667885598, new com.app.mlounge.ui.components.j0((String) objQ12, list, aVar, y0Var4, y0Var2, y0Var6, y0Var3, lVar), rVar), rVar4, 438, 0);
                        if (((kotlin.k) y0Var6.getValue()) != null) {
                            rVar4.b0(-1552940510);
                            kotlin.k kVar2 = (kotlin.k) y0Var6.getValue();
                            kVar2.getClass();
                            long j = com.app.mlounge.ui.theme.b.d;
                            Object objQ13 = rVar4.Q();
                            if (objQ13 == fVar2) {
                                objQ13 = new q(y0Var6, 14);
                                rVar4.l0(objQ13);
                            }
                            context = context2;
                            fVar = fVar2;
                            t2.a((kotlin.jvm.functions.a) objQ13, androidx.compose.runtime.internal.k.c(-999182302, new androidx.compose.foundation.contextmenu.f(28, tVarD3, y0Var6), rVar4), null, androidx.compose.runtime.internal.k.c(1507915172, new androidx.compose.material3.m(y0Var6, 10), rVar4), b.v, androidx.compose.runtime.internal.k.c(-1173889561, new g0(kVar2, 22), rVar4), null, j, 0L, 0L, 0L, 0.0f, null, rVar, 1772598, 0, 16020);
                            androidx.compose.runtime.r rVar5 = rVar;
                            z = false;
                            rVar5.p(false);
                            rVar3 = rVar5;
                        } else {
                            z = false;
                            context = context2;
                            fVar = fVar2;
                            rVar4.b0(-1551945875);
                            rVar4.p(false);
                            rVar3 = rVar4;
                        }
                        if (((Boolean) y0Var4.getValue()).booleanValue()) {
                            rVar3.b0(-1551861834);
                            Object objQ14 = rVar3.Q();
                            androidx.compose.runtime.f fVar3 = fVar;
                            if (objQ14 == fVar3) {
                                objQ14 = androidx.compose.runtime.s.r("");
                                rVar3.l0(objQ14);
                            }
                            y0 y0Var7 = (y0) objQ14;
                            long j2 = com.app.mlounge.ui.theme.b.b;
                            Object objQ15 = rVar3.Q();
                            if (objQ15 == fVar3) {
                                y0Var = y0Var4;
                                objQ15 = new q(y0Var, 15);
                                rVar3.l0(objQ15);
                            } else {
                                y0Var = y0Var4;
                            }
                            t2.a((kotlin.jvm.functions.a) objQ15, androidx.compose.runtime.internal.k.c(-1516001141, new com.app.mlounge.ui.components.j0(context, tVarD2, tVarD, y0Var7, y0Var2, y0Var5, y0Var, e1Var), rVar3), null, androidx.compose.runtime.internal.k.c(-1671981683, new androidx.compose.material3.m(y0Var, 8), rVar3), b.y, androidx.compose.runtime.internal.k.c(-1905952496, new androidx.compose.material3.m(y0Var7, 9), rVar3), null, j2, 0L, 0L, 0L, 0.0f, null, rVar, 1772598, 0, 16020);
                            androidx.compose.runtime.r rVar6 = rVar;
                            rVar6.p(false);
                            rVar2 = rVar6;
                        } else {
                            rVar3.b0(-1550209875);
                            rVar3.p(z);
                            rVar2 = rVar3;
                        }
                    } else {
                        androidx.compose.runtime.r rVar7 = rVar;
                        rVar7.W();
                        rVar2 = rVar7;
                    }
                    q1 q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, aVar, i, 27);
                    }
                }

                public static final void j(String str, androidx.compose.ui.graphics.vector.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
                    int i2;
                    androidx.compose.runtime.r rVar2 = rVar;
                    rVar2.c0(1083507135);
                    if ((i & 6) == 0) {
                        i2 = (rVar2.f(str) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    int i3 = i2 | (rVar2.f(fVar) ? 32 : 16);
                    if ((i & 384) == 0) {
                        i3 |= rVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128;
                    }
                    if (rVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                        Object objQ = rVar2.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        float f = 12;
                        androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(androidx.compose.foundation.s.g(w0.d(oVar, 1.0f), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8)), kVar, null, false, null, aVar, 28), kVar, 1), f, 10);
                        t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
                        int iHashCode = Long.hashCode(rVar2.T);
                        androidx.compose.runtime.internal.j jVarL = rVar2.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(yVar);
                        } else {
                            rVar2.o0();
                        }
                        androidx.compose.runtime.s.x(rVar2, t0VarA, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                        f1.b(fVar, null, w0.l(oVar, 22), com.app.mlounge.ui.theme.b.f, rVar2, ((i3 >> 3) & 14) | 432, 0);
                        androidx.compose.foundation.layout.b.d(rVar2, w0.p(oVar, f));
                        p3.b(str, null, androidx.compose.ui.graphics.t.d, h1.r(14), null, 0L, null, 0L, 0, false, 1, 0, null, rVar, (i3 & 14) | 24960, 24576, 245738);
                        rVar2 = rVar;
                        rVar2.p(true);
                    } else {
                        rVar2.W();
                    }
                    q1 q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new androidx.compose.foundation.contextmenu.j(str, fVar, aVar, i, 10);
                    }
                }

                public static final void k(final String str, final boolean z, androidx.compose.ui.r rVar, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar2, final int i, final int i2) {
                    int i3;
                    androidx.compose.ui.r rVar3;
                    int i4;
                    final androidx.compose.ui.r rVar4;
                    long j;
                    rVar2.c0(418683773);
                    if ((i & 6) == 0) {
                        i3 = i | (rVar2.f(str) ? 4 : 2);
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= rVar2.g(z) ? 32 : 16;
                    }
                    int i5 = i2 & 4;
                    if (i5 != 0) {
                        i4 = i3 | 384;
                        rVar3 = rVar;
                    } else {
                        rVar3 = rVar;
                        i4 = i3 | (rVar2.f(rVar3) ? LibretroCore.SCREEN_WIDTH : 128);
                    }
                    int i6 = i4 | (rVar2.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                    if (rVar2.T(i6 & 1, (i6 & 1171) != 1170)) {
                        androidx.compose.ui.r rVar5 = i5 != 0 ? androidx.compose.ui.o.b : rVar3;
                        Object objQ = rVar2.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        float f = 2;
                        if (((Boolean) android.support.v4.media.session.b.g(kVar, rVar2, 6).getValue()).booleanValue()) {
                            j = com.app.mlounge.ui.theme.b.q;
                        } else {
                            j = z ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.h;
                        }
                        float f2 = 8;
                        f3.b(aVar, androidx.compose.foundation.s.g(rVar5, f, j, androidx.compose.foundation.shape.e.a(f2)), false, androidx.compose.foundation.shape.e.a(f2), z ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, null, kVar, androidx.compose.runtime.internal.k.c(1584325778, new com.app.mlounge.ui.screens.adult.b(3, str, z), rVar2), rVar2, ((i6 >> 9) & 14) | 805306368, 484);
                        rVar4 = rVar5;
                    } else {
                        rVar2.W();
                        rVar4 = rVar3;
                    }
                    q1 q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.p
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                e0.k(str, z, rVar4, aVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }

                /* JADX WARN: Code duplicated, block: B:110:0x03d3  */
                /* JADX WARN: Code duplicated, block: B:112:0x03d9  */
                /* JADX WARN: Code duplicated, block: B:115:0x03f6  */
                /* JADX WARN: Code duplicated, block: B:116:0x03fe  */
                /* JADX WARN: Code duplicated, block: B:118:0x0480  */
                /* JADX WARN: Code duplicated, block: B:120:0x048a  */
                /* JADX WARN: Code duplicated, block: B:125:0x04d9  */
                /* JADX WARN: Code duplicated, block: B:128:0x04ed  */
                /* JADX WARN: Code duplicated, block: B:129:0x04ef  */
                /* JADX WARN: Code duplicated, block: B:135:0x04fc  */
                /* JADX WARN: Code duplicated, block: B:138:0x053a  */
                /* JADX WARN: Code duplicated, block: B:139:0x053e  */
                /* JADX WARN: Code duplicated, block: B:143:0x055a  */
                /* JADX WARN: Code duplicated, block: B:145:0x05ed  */
                /* JADX WARN: Code duplicated, block: B:147:0x05f2  */
                public static final void l(final com.app.mlounge.ui.navigation.w wVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final kotlin.jvm.functions.a aVar, final kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, androidx.compose.runtime.r rVar, final int i) {
                    kotlin.jvm.functions.a aVar4;
                    androidx.compose.runtime.r rVar2;
                    boolean z5;
                    androidx.compose.runtime.r rVar3;
                    long j;
                    androidx.compose.ui.node.e eVar;
                    boolean z6;
                    androidx.compose.runtime.f fVar;
                    androidx.compose.ui.graphics.vector.f fVarB;
                    char c2;
                    char c3;
                    long jB;
                    long j2;
                    long j3;
                    boolean z7;
                    Object objQ;
                    androidx.compose.ui.graphics.vector.f fVarB2;
                    long jB2;
                    rVar.c0(2024860169);
                    int i2 = i | (rVar.f(wVar) ? 4 : 2) | (rVar.g(z) ? 32 : 16) | (rVar.g(z2) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.g(z3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar.g(z4) ? 16384 : 8192) | (rVar.h(aVar) ? 131072 : Parser.ARGC_LIMIT) | (rVar.h(aVar2) ? 1048576 : 524288) | (rVar.h(aVar3) ? 8388608 : 4194304);
                    if (rVar.T(i2 & 1, (i2 & 4793491) != 4793490)) {
                        Object objQ2 = rVar.Q();
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                        if (objQ2 == fVar2) {
                            objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
                        y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
                        Object objQ3 = rVar.Q();
                        if (objQ3 == fVar2) {
                            objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                        }
                        androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ3;
                        y0 y0VarG2 = android.support.v4.media.session.b.g(kVar2, rVar, 6);
                        Object objQ4 = rVar.Q();
                        if (objQ4 == fVar2) {
                            objQ4 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                        }
                        androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ4;
                        y0 y0VarG3 = android.support.v4.media.session.b.g(kVar3, rVar, 6);
                        float f = (!z2 || z) ? 1.0f : 0.4f;
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        float f2 = 4;
                        androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(w0.d(oVar, 1.0f), 16, f2);
                        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                        androidx.compose.foundation.layout.a aVar5 = androidx.compose.foundation.layout.h.a;
                        t0 t0VarA = r0.a(aVar5, iVar, rVar, 48);
                        int iHashCode = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL = rVar.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarP);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(yVar);
                        } else {
                            rVar.o0();
                        }
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.e;
                        androidx.compose.runtime.s.x(rVar, t0VarA, eVar2);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.d;
                        androidx.compose.runtime.s.x(rVar, jVarL, eVar3);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.f;
                        androidx.compose.runtime.s.p(rVar, numValueOf, eVar4);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                        androidx.compose.runtime.s.t(rVar, dVar);
                        androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.c;
                        androidx.compose.runtime.s.x(rVar, rVarC, eVar5);
                        float f3 = 2;
                        float f4 = 8;
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(u0.a(1.0f), f3, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f4));
                        boolean z8 = (i2 & 458752) == 131072;
                        Object objQ5 = rVar.Q();
                        if (z8 || objQ5 == fVar2) {
                            objQ5 = new j2(16, aVar);
                            rVar.l0(objQ5);
                        }
                        androidx.compose.ui.r rVarP2 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.l(androidx.compose.foundation.s.i(rVarG, kVar, null, z2, null, (kotlin.jvm.functions.a) objQ5, 24), z2, kVar), f4, f4);
                        t0 t0VarA2 = r0.a(aVar5, iVar, rVar, 48);
                        int iHashCode2 = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarP2);
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(yVar);
                        } else {
                            rVar.o0();
                        }
                        androidx.compose.runtime.s.x(rVar, t0VarA2, eVar2);
                        androidx.compose.runtime.s.x(rVar, jVarL2, eVar3);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar4, rVar, dVar);
                        androidx.compose.runtime.s.x(rVar, rVarC2, eVar5);
                        androidx.compose.ui.graphics.vector.f fVar3 = wVar.c;
                        long j4 = com.app.mlounge.ui.theme.b.m;
                        float f5 = f;
                        float f6 = 20;
                        f1.b(fVar3, null, w0.l(oVar, f6), androidx.compose.ui.graphics.t.b(f5, j4), rVar, 432, 0);
                        androidx.compose.foundation.layout.b.d(rVar, w0.p(oVar, 12));
                        androidx.compose.ui.r rVarA = u0.a(1.0f);
                        androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
                        int iHashCode3 = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL3 = rVar.l();
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, rVarA);
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(yVar);
                        } else {
                            rVar.o0();
                        }
                        androidx.compose.runtime.s.x(rVar, vVarA, eVar2);
                        androidx.compose.runtime.s.x(rVar, jVarL3, eVar3);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar4, rVar, dVar);
                        androidx.compose.runtime.s.x(rVar, rVarC3, eVar5);
                        String str = wVar.b;
                        u2 u2Var = u3.a;
                        p3.b(str, null, androidx.compose.ui.graphics.t.b(f5, com.app.mlounge.ui.theme.b.l), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).k, rVar, 0, 0, 131066);
                        androidx.compose.runtime.r rVar4 = rVar;
                        if (z2) {
                            rVar4.b0(-241003836);
                            p3.b("Show in sidebar", null, androidx.compose.ui.graphics.t.b(f5, j4), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).l, rVar, 6, 0, 131066);
                            rVar4 = rVar;
                            z5 = false;
                            rVar4.p(false);
                        } else {
                            z5 = false;
                            rVar4.b0(-240783209);
                            rVar4.p(false);
                        }
                        rVar4.p(true);
                        if (z2) {
                            rVar4.b0(-1844454645);
                            long j5 = com.app.mlounge.ui.theme.b.f;
                            j = j4;
                            rVar3 = rVar;
                            z6 = z5;
                            eVar = eVar5;
                            j3.a(z, null, null, false, t2.k(j5, androidx.compose.ui.graphics.t.b(0.3f, j5), com.app.mlounge.ui.theme.b.n, com.app.mlounge.ui.theme.b.c, 0L, 0L, 0L, 0L, rVar, 65484), rVar3, ((i2 >> 3) & 14) | 48, 92);
                            rVar3.p(z6);
                        } else {
                            rVar3 = rVar4;
                            j = j4;
                            eVar = eVar5;
                            z6 = z5;
                            rVar3.b0(-1844002975);
                            rVar3.p(z6);
                        }
                        rVar3.p(true);
                        androidx.compose.foundation.layout.b.d(rVar3, w0.p(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x034c: INVOKE 
                              (r7v30 'rVar3' androidx.compose.runtime.r)
                              (wrap androidx.compose.ui.r:0x0348: INVOKE (r46v0 ?? I:??[OBJECT, ARRAY]), (r5v2 'f2' float) STATIC call: androidx.compose.foundation.layout.w0.p(androidx.compose.ui.r, float):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float):androidx.compose.ui.r (m), WRAPPED] (LINE:841))
                             STATIC call: androidx.compose.foundation.layout.b.d(androidx.compose.runtime.r, androidx.compose.ui.r):void A[MD:(androidx.compose.runtime.r, androidx.compose.ui.r):void (m)] (LINE:845) in method: com.app.mlounge.ui.screens.settings.e0.l(com.app.mlounge.ui.navigation.w, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.r, int):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r46v0 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1589
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.settings.e0.l(com.app.mlounge.ui.navigation.w, boolean, boolean, boolean, boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.r, int):void");
                    }

                    public static final void m(float f, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
                        Object obj;
                        androidx.compose.runtime.r rVar2 = rVar;
                        rVar2.c0(851347622);
                        int i2 = i | (rVar2.c(f) ? 4 : 2) | (rVar2.h(lVar) ? 32 : 16);
                        if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                            List listQ = com.google.common.base.c.q(new kotlin.k(Float.valueOf(0.1f), "Very Low (10%)"), new kotlin.k(Float.valueOf(0.25f), "Low (25%)"), new kotlin.k(Float.valueOf(0.4f), "Medium-Low (40%)"), new kotlin.k(Float.valueOf(0.5f), "Medium (50%)"), new kotlin.k(Float.valueOf(0.65f), "Medium-High (65%)"), new kotlin.k(Float.valueOf(0.8f), "High (80%)"), new kotlin.k(Float.valueOf(1.0f), "Full (100%)"));
                            Iterator it = listQ.iterator();
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (it.hasNext()) {
                                    float fAbs = Math.abs(((Number) ((kotlin.k) next).e).floatValue() - f);
                                    while (true) {
                                        Object next2 = it.next();
                                        float fAbs2 = Math.abs(((Number) ((kotlin.k) next2).e).floatValue() - f);
                                        if (Float.compare(fAbs, fAbs2) > 0) {
                                            next = next2;
                                            fAbs = fAbs2;
                                        }
                                        if (!it.hasNext()) {
                                            break;
                                        } else {
                                            rVar2 = rVar;
                                        }
                                    }
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            kotlin.k kVar = (kotlin.k) obj;
                            float fFloatValue = kVar != null ? ((Number) kVar.e).floatValue() : 0.5f;
                            t2.a(aVar, androidx.compose.runtime.internal.k.c(-474826402, new com.app.mlounge.ui.components.h(4, aVar), rVar2), null, null, b.h, androidx.compose.runtime.internal.k.c(-1577588295, new v(listQ, lVar, fFloatValue), rVar2), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, rVar, 1769526, 0, 16028);
                        } else {
                            rVar.W();
                        }
                        q1 q1VarT = rVar.t();
                        if (q1VarT != null) {
                            q1VarT.d = new v(f, lVar, aVar, i);
                        }
                    }

                    public static final void n(String str, String str2, androidx.compose.ui.graphics.vector.f fVar, List list, String str3, kotlin.jvm.functions.l lVar, androidx.compose.runtime.r rVar, int i) {
                        String str4;
                        androidx.compose.runtime.r rVar2 = rVar;
                        rVar2.c0(131670199);
                        int i2 = (rVar2.f(fVar) ? LibretroCore.SCREEN_WIDTH : 128) | i;
                        if ((i & 3072) == 0) {
                            i2 |= rVar2.h(list) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        int i3 = i2 | (rVar2.f(str3) ? 16384 : 8192) | (rVar2.h(lVar) ? 131072 : Parser.ARGC_LIMIT);
                        if (rVar2.T(i3 & 1, (74899 & i3) != 74898)) {
                            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                            float f = 12;
                            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(w0.d(oVar, 1.0f), 16, f);
                            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
                            int iHashCode = Long.hashCode(rVar2.T);
                            androidx.compose.runtime.internal.j jVarL = rVar2.l();
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
                            androidx.compose.ui.node.g.b.getClass();
                            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(yVar);
                            } else {
                                rVar2.o0();
                            }
                            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                            androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
                            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                            androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                            androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
                            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                            androidx.compose.runtime.s.t(rVar2, dVar);
                            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                            androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
                            long j = com.app.mlounge.ui.theme.b.m;
                            f1.b(fVar, null, w0.l(oVar, 20), j, rVar2, ((i3 >> 6) & 14) | 432, 0);
                            androidx.compose.foundation.layout.b.d(rVar2, w0.p(oVar, f));
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
                            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                            int iHashCode2 = Long.hashCode(rVar2.T);
                            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, h0Var);
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(yVar);
                            } else {
                                rVar2.o0();
                            }
                            androidx.compose.runtime.s.x(rVar2, vVarA, eVar);
                            androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
                            androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
                            u2 u2Var = u3.a;
                            boolean z = true;
                            p3.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).k, rVar, 6, 0, 131066);
                            p3.b(str2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).l, rVar, 6, 0, 131066);
                            rVar2 = rVar;
                            rVar2.p(true);
                            int i4 = 6;
                            t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.G, rVar2, 6);
                            int iHashCode3 = Long.hashCode(rVar2.T);
                            androidx.compose.runtime.internal.j jVarL3 = rVar2.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, oVar);
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(yVar);
                            } else {
                                rVar2.o0();
                            }
                            androidx.compose.runtime.s.x(rVar2, t0VarA2, eVar);
                            androidx.compose.runtime.s.x(rVar2, jVarL3, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar2, eVar3, rVar2, dVar);
                            androidx.compose.runtime.s.x(rVar2, rVarC3, eVar4);
                            rVar2.b0(1929706138);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str5 = (String) it.next();
                                boolean zA = kotlin.jvm.internal.l.a(str5, str3);
                                Object objQ = rVar2.Q();
                                androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                if (objQ == fVar2) {
                                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                                }
                                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                                y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, i4);
                                float f2 = 8;
                                int i5 = i4;
                                androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(f2);
                                long j2 = zA ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.c;
                                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(oVar, 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
                                boolean zF = ((i3 & 458752) == 131072) | rVar2.f(str5);
                                Object objQ2 = rVar2.Q();
                                if (zF || objQ2 == fVar2) {
                                    objQ2 = new com.app.mlounge.ui.components.l0(lVar, str5, 1);
                                    rVar2.l0(objQ2);
                                }
                                f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), dVarA, j2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-105591980, new com.app.mlounge.ui.screens.adult.b(2, str5, zA), rVar2), rVar, 12582912, 120);
                                i4 = i5;
                                rVar2 = rVar;
                                z = true;
                            }
                            str4 = str3;
                            boolean z2 = z;
                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar2, false, z2, z2);
                        } else {
                            str4 = str3;
                            rVar2.W();
                        }
                        q1 q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            q1VarT.d = new androidx.compose.runtime.internal.d(str, str2, fVar, list, str4, lVar, i, 2);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
                    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
                    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
                    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
                    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
                    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
                    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
                    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
                    /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
                    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
                    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
                    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
                    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
                    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
                    /* JADX WARN: Code duplicated, block: B:81:0x024a  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0268  */
                    /* JADX WARN: Code duplicated, block: B:84:0x027a  */
                    /* JADX WARN: Code duplicated, block: B:87:0x0284  */
                    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
                    public static final void o(String str, String str2, androidx.compose.ui.graphics.vector.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar2, int i, int i2) {
                        int i3;
                        androidx.compose.ui.r rVar3;
                        int i4;
                        kotlin.jvm.functions.a aVar2;
                        int i5;
                        boolean z;
                        kotlin.jvm.functions.a aVar3;
                        q1 q1VarT;
                        androidx.compose.ui.o oVar;
                        androidx.compose.ui.r rVar4;
                        Object objQ;
                        androidx.compose.runtime.f fVar2;
                        androidx.compose.foundation.interaction.k kVar;
                        y0 y0VarG;
                        androidx.compose.ui.r rVarM;
                        androidx.compose.ui.node.y yVar;
                        long j;
                        float f;
                        kotlin.jvm.functions.a aVar4;
                        long j2;
                        boolean z2;
                        Object objQ2;
                        rVar2.c0(-251330597);
                        if ((i & 48) == 0) {
                            i3 = (rVar2.f(str2) ? 32 : 16) | i;
                        } else {
                            i3 = i;
                        }
                        int i6 = i3 | (rVar2.f(fVar) ? LibretroCore.SCREEN_WIDTH : 128);
                        int i7 = i2 & 8;
                        if (i7 != 0) {
                            i4 = i6 | 3072;
                            rVar3 = rVar;
                        } else {
                            rVar3 = rVar;
                            i4 = i6 | (rVar2.f(rVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                        }
                        int i8 = i2 & 16;
                        if (i8 == 0) {
                            if ((i & 24576) == 0) {
                                aVar2 = aVar;
                                i4 |= rVar2.h(aVar2) ? 16384 : 8192;
                            }
                            i5 = i4;
                            if ((i5 & 9363) != 9362) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (rVar2.T(i5 & 1, z)) {
                                oVar = androidx.compose.ui.o.b;
                                if (i7 != 0) {
                                    rVar4 = oVar;
                                } else {
                                    rVar4 = rVar3;
                                }
                                if (i8 != 0) {
                                    aVar2 = null;
                                }
                                objQ = rVar2.Q();
                                fVar2 = androidx.compose.runtime.m.a;
                                if (objQ == fVar2) {
                                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                                }
                                kVar = (androidx.compose.foundation.interaction.k) objQ;
                                y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
                                float f2 = 12;
                                androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(w0.d(rVar4, 1.0f), 16, f2);
                                if (aVar2 != null) {
                                    rVar2.b0(-1010514709);
                                    float f3 = 2;
                                    if (((Boolean) y0VarG.getValue()).booleanValue()) {
                                        j2 = com.app.mlounge.ui.theme.b.q;
                                    } else {
                                        j2 = androidx.compose.ui.graphics.t.h;
                                    }
                                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(oVar, f3, j2, androidx.compose.foundation.shape.e.a(8));
                                    if ((57344 & i5) == 16384) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    objQ2 = rVar2.Q();
                                    if (z2 || objQ2 == fVar2) {
                                        objQ2 = new j2(15, aVar2);
                                        rVar2.l0(objQ2);
                                    }
                                    rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1);
                                    rVar2.p(false);
                                } else {
                                    rVar2.b0(-1010512765);
                                    rVar2.p(false);
                                    rVarM = oVar;
                                }
                                androidx.compose.ui.r rVarD = rVarP.d(rVarM);
                                t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
                                int iHashCode = Long.hashCode(rVar2.T);
                                androidx.compose.runtime.internal.j jVarL = rVar2.l();
                                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarD);
                                androidx.compose.ui.node.g.b.getClass();
                                yVar = androidx.compose.ui.node.f.b;
                                rVar2.e0();
                                if (rVar2.S) {
                                    rVar2.k(yVar);
                                } else {
                                    rVar2.o0();
                                }
                                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                                androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
                                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                                androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                                androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
                                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                                androidx.compose.runtime.s.t(rVar2, dVar);
                                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                                androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
                                j = com.app.mlounge.ui.theme.b.m;
                                f = 20;
                                aVar4 = aVar2;
                                androidx.compose.ui.r rVar5 = rVar4;
                                f1.b(fVar, null, w0.l(oVar, f), j, rVar2, ((i5 >> 6) & 14) | 432, 0);
                                androidx.compose.foundation.layout.b.d(rVar2, w0.p(oVar, f2));
                                if (1.0f <= 0.0d) {
                                    androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                                }
                                androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
                                androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                                int iHashCode2 = Long.hashCode(rVar2.T);
                                androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, h0Var);
                                rVar2.e0();
                                if (rVar2.S) {
                                    rVar2.k(yVar);
                                } else {
                                    rVar2.o0();
                                }
                                androidx.compose.runtime.s.x(rVar2, vVarA, eVar);
                                androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
                                androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
                                u2 u2Var = u3.a;
                                p3.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).k, rVar2, 6, 0, 131066);
                                p3.b(str2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, (i5 >> 3) & 14, 0, 131066);
                                rVar2.p(true);
                                if (aVar4 != null) {
                                    rVar2.b0(1759166143);
                                    f1.b(_COROUTINE.b.p(), null, w0.l(oVar, f), j, rVar2, 432, 0);
                                    rVar2.p(false);
                                } else {
                                    rVar2.b0(1759272163);
                                    rVar2.p(false);
                                }
                                rVar2.p(true);
                                rVar3 = rVar5;
                                aVar3 = aVar4;
                            } else {
                                rVar2.W();
                                aVar3 = aVar2;
                            }
                            q1VarT = rVar2.t();
                            if (q1VarT != null) {
                                q1VarT.d = new androidx.compose.material3.c0(str, str2, fVar, rVar3, aVar3, i, i2);
                            }
                        }
                        i4 |= 24576;
                        aVar2 = aVar;
                        i5 = i4;
                        if ((i5 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (rVar2.T(i5 & 1, z)) {
                            oVar = androidx.compose.ui.o.b;
                            if (i7 != 0) {
                                rVar4 = oVar;
                            } else {
                                rVar4 = rVar3;
                            }
                            if (i8 != 0) {
                                aVar2 = null;
                            }
                            objQ = rVar2.Q();
                            fVar2 = androidx.compose.runtime.m.a;
                            if (objQ == fVar2) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                            }
                            kVar = (androidx.compose.foundation.interaction.k) objQ;
                            y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
                            float f4 = 12;
                            androidx.compose.ui.r rVarP2 = androidx.compose.foundation.layout.b.p(w0.d(rVar4, 1.0f), 16, f4);
                            if (aVar2 != null) {
                                rVar2.b0(-1010514709);
                                float f5 = 2;
                                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                                    j2 = com.app.mlounge.ui.theme.b.q;
                                } else {
                                    j2 = androidx.compose.ui.graphics.t.h;
                                }
                                androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(oVar, f5, j2, androidx.compose.foundation.shape.e.a(8));
                                if ((57344 & i5) == 16384) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objQ2 = rVar2.Q();
                                if (z2) {
                                    objQ2 = new j2(15, aVar2);
                                    rVar2.l0(objQ2);
                                } else {
                                    objQ2 = new j2(15, aVar2);
                                    rVar2.l0(objQ2);
                                }
                                rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG2, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1);
                                rVar2.p(false);
                            } else {
                                rVar2.b0(-1010512765);
                                rVar2.p(false);
                                rVarM = oVar;
                            }
                            androidx.compose.ui.r rVarD2 = rVarP2.d(rVarM);
                            t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
                            int iHashCode3 = Long.hashCode(rVar2.T);
                            androidx.compose.runtime.internal.j jVarL3 = rVar2.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, rVarD2);
                            androidx.compose.ui.node.g.b.getClass();
                            yVar = androidx.compose.ui.node.f.b;
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(yVar);
                            } else {
                                rVar2.o0();
                            }
                            androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.e;
                            androidx.compose.runtime.s.x(rVar2, t0VarA2, eVar5);
                            androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.d;
                            androidx.compose.runtime.s.x(rVar2, jVarL3, eVar6);
                            Integer numValueOf2 = Integer.valueOf(iHashCode3);
                            androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.f;
                            androidx.compose.runtime.s.p(rVar2, numValueOf2, eVar7);
                            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
                            androidx.compose.runtime.s.t(rVar2, dVar2);
                            androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.f.c;
                            androidx.compose.runtime.s.x(rVar2, rVarC3, eVar8);
                            j = com.app.mlounge.ui.theme.b.m;
                            f = 20;
                            aVar4 = aVar2;
                            androidx.compose.ui.r rVar6 = rVar4;
                            f1.b(fVar, null, w0.l(oVar, f), j, rVar2, ((i5 >> 6) & 14) | 432, 0);
                            androidx.compose.foundation.layout.b.d(rVar2, w0.p(oVar, f4));
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.h0 h0Var2 = new androidx.compose.foundation.layout.h0(1.0f, true);
                            androidx.compose.foundation.layout.v vVarA2 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                            int iHashCode4 = Long.hashCode(rVar2.T);
                            androidx.compose.runtime.internal.j jVarL4 = rVar2.l();
                            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar2, h0Var2);
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(yVar);
                            } else {
                                rVar2.o0();
                            }
                            androidx.compose.runtime.s.x(rVar2, vVarA2, eVar5);
                            androidx.compose.runtime.s.x(rVar2, jVarL4, eVar6);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar2, eVar7, rVar2, dVar2);
                            androidx.compose.runtime.s.x(rVar2, rVarC4, eVar8);
                            u2 u2Var2 = u3.a;
                            p3.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var2)).k, rVar2, 6, 0, 131066);
                            p3.b(str2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var2)).l, rVar2, (i5 >> 3) & 14, 0, 131066);
                            rVar2.p(true);
                            if (aVar4 != null) {
                                rVar2.b0(1759166143);
                                f1.b(_COROUTINE.b.p(), null, w0.l(oVar, f), j, rVar2, 432, 0);
                                rVar2.p(false);
                            } else {
                                rVar2.b0(1759272163);
                                rVar2.p(false);
                            }
                            rVar2.p(true);
                            rVar3 = rVar6;
                            aVar3 = aVar4;
                        } else {
                            rVar2.W();
                            aVar3 = aVar2;
                        }
                        q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            q1VarT.d = new androidx.compose.material3.c0(str, str2, fVar, rVar3, aVar3, i, i2);
                        }
                    }

                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26981. Try increasing type updates limit count.
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                        */
                    public static final void p(com.app.mlounge.ui.viewmodel.k1 r71, com.app.mlounge.ui.viewmodel.k r72, androidx.compose.runtime.r r73, int r74) {
                        /*
                            Method dump skipped, instruction units count: 2698
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.settings.e0.p(com.app.mlounge.ui.viewmodel.k1, com.app.mlounge.ui.viewmodel.k, androidx.compose.runtime.r, int):void");
                    }

                    public static final void q(final String str, boolean z, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, final int i, final int i2) {
                        boolean z2;
                        int i3;
                        androidx.compose.runtime.internal.f fVar2;
                        final boolean z3;
                        y0 y0Var;
                        androidx.compose.ui.o oVar;
                        boolean z4;
                        androidx.compose.ui.o oVar2;
                        boolean z5;
                        androidx.compose.ui.graphics.vector.f fVarB;
                        androidx.compose.runtime.r rVar2 = rVar;
                        rVar2.c0(-119636697);
                        int i4 = i2 & 2;
                        if (i4 != 0) {
                            i3 = i | 48;
                            z2 = z;
                        } else if ((i & 48) == 0) {
                            z2 = z;
                            i3 = i | (rVar2.g(z2) ? 32 : 16);
                        } else {
                            z2 = z;
                            i3 = i;
                        }
                        if (rVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                            boolean z6 = i4 != 0 ? false : z2;
                            Object objQ = rVar2.Q();
                            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                            if (objQ == fVar3) {
                                objQ = androidx.compose.runtime.s.r(Boolean.valueOf(!z6));
                                rVar2.l0(objQ);
                            }
                            y0 y0Var2 = (y0) objQ;
                            Object objQ2 = rVar2.Q();
                            if (objQ2 == fVar3) {
                                objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                            }
                            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
                            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
                            androidx.compose.ui.o oVar3 = androidx.compose.ui.o.b;
                            if (z6) {
                                rVar2.b0(726384286);
                                float f = 8;
                                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.b.p(w0.d(oVar3, 1.0f), 16, f), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f));
                                Object objQ3 = rVar2.Q();
                                if (objQ3 == fVar3) {
                                    objQ3 = new androidx.compose.foundation.lazy.n(y0Var2, 20);
                                    rVar2.l0(objQ3);
                                }
                                androidx.compose.ui.r rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar, 1);
                                t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
                                int iHashCode = Long.hashCode(rVar2.T);
                                androidx.compose.runtime.internal.j jVarL = rVar2.l();
                                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarM);
                                androidx.compose.ui.node.g.b.getClass();
                                androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                                rVar2.e0();
                                if (rVar2.S) {
                                    rVar2.k(yVar);
                                } else {
                                    rVar2.o0();
                                }
                                androidx.compose.runtime.s.x(rVar2, t0VarA, androidx.compose.ui.node.f.e);
                                androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                                androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                                androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                                androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                                androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u3.a)).i;
                                long j = com.app.mlounge.ui.theme.b.f;
                                y0Var = y0Var2;
                                p3.b(str, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 6, 0, 131066);
                                rVar2 = rVar;
                                if (1.0f <= 0.0d) {
                                    androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                                }
                                androidx.compose.foundation.layout.b.d(rVar2, new androidx.compose.foundation.layout.h0(1.0f, true));
                                if (((Boolean) y0Var.getValue()).booleanValue()) {
                                    fVarB = androidx.room.r.c;
                                    if (fVarB != null) {
                                        z5 = false;
                                    } else {
                                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                        int i5 = h0.a;
                                        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                                        ArrayList arrayList = new ArrayList(32);
                                        arrayList.add(new androidx.compose.ui.graphics.vector.o(12.0f, 8.0f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.v(-6.0f, 6.0f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.v(1.41f, 1.41f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.n(12.0f, 10.83f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.v(4.59f, 4.58f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.n(18.0f, 14.0f));
                                        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
                                        z5 = false;
                                        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
                                        fVarB = eVar.b();
                                        androidx.room.r.c = fVarB;
                                    }
                                } else {
                                    z5 = false;
                                    fVarB = coil3.network.g.c;
                                    if (fVarB == null) {
                                        androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                        int i6 = h0.a;
                                        p0 p0Var2 = new p0(androidx.compose.ui.graphics.t.b);
                                        ArrayList arrayList2 = new ArrayList(32);
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.o(16.59f, 8.59f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.n(12.0f, 13.17f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.n(7.41f, 8.59f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.n(6.0f, 10.0f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.v(6.0f, 6.0f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.v(6.0f, -6.0f));
                                        arrayList2.add(androidx.compose.ui.graphics.vector.k.c);
                                        androidx.compose.ui.graphics.vector.e.a(eVar2, arrayList2, 0, p0Var2);
                                        fVarB = eVar2.b();
                                        coil3.network.g.c = fVarB;
                                    }
                                }
                                f1.b(fVarB, ((Boolean) y0Var.getValue()).booleanValue() ? "Collapse" : "Expand", w0.l(oVar3, 20), j, rVar2, 384, 0);
                                rVar2.p(true);
                                rVar2.p(z5);
                                oVar = oVar3;
                                z4 = z5;
                            } else {
                                y0Var = y0Var2;
                                rVar2.b0(727293888);
                                oVar = oVar3;
                                p3.b(str, androidx.compose.foundation.layout.b.p(oVar3, 16, 8), com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).i, rVar, 54, 0, 131064);
                                rVar2 = rVar;
                                z4 = false;
                                rVar2.p(false);
                            }
                            if (((Boolean) y0Var.getValue()).booleanValue()) {
                                rVar2.b0(727484321);
                                oVar2 = oVar;
                                fVar2 = fVar;
                                f3.a(androidx.compose.foundation.layout.b.q(w0.d(oVar2, 1.0f), 16, 0.0f, 2), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-166577830, new x0(fVar2), rVar2), rVar, 12582918, 120);
                                rVar2 = rVar;
                                rVar2.p(z4);
                            } else {
                                fVar2 = fVar;
                                oVar2 = oVar;
                                rVar2.b0(727669019);
                                rVar2.p(z4);
                            }
                            androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar2, 8));
                            z3 = z6;
                        } else {
                            fVar2 = fVar;
                            rVar2.W();
                            z3 = z2;
                        }
                        q1 q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            final androidx.compose.runtime.internal.f fVar4 = fVar2;
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.c
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    e0.q(str, z3, fVar4, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }

                    public static final void r(final String str, final String str2, final boolean z, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.graphics.vector.f fVar, boolean z2, androidx.compose.runtime.r rVar, final int i, final int i2) {
                        int i3;
                        boolean z3;
                        int i4;
                        final boolean z4;
                        androidx.compose.runtime.r rVar2;
                        androidx.compose.runtime.r rVar3 = rVar;
                        rVar3.c0(-549654010);
                        if ((i & 6) == 0) {
                            i3 = i | (rVar3.f(str) ? 4 : 2);
                        } else {
                            i3 = i;
                        }
                        if ((i & 48) == 0) {
                            i3 |= rVar3.f(str2) ? 32 : 16;
                        }
                        int i5 = i3 | (rVar3.g(z) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar3.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar3.f(fVar) ? 16384 : 8192);
                        int i6 = i2 & 32;
                        if (i6 != 0) {
                            i4 = i5 | 196608;
                            z3 = z2;
                        } else {
                            z3 = z2;
                            i4 = i5 | (rVar3.g(z3) ? 131072 : Parser.ARGC_LIMIT);
                        }
                        int i7 = i4;
                        if (rVar3.T(i7 & 1, (74899 & i7) != 74898)) {
                            boolean z5 = i6 != 0 ? true : z3;
                            Object objQ = rVar3.Q();
                            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                            if (objQ == fVar2) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar3);
                            }
                            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar3, 6);
                            float f = z5 ? 1.0f : 0.4f;
                            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                            float f2 = 12;
                            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.b.p(w0.d(oVar, 1.0f), 16, f2), 2, (((Boolean) y0VarG.getValue()).booleanValue() && z5) ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                            boolean z6 = ((i7 & 7168) == 2048) | ((i7 & 896) == 256);
                            Object objQ2 = rVar.Q();
                            if (z6 || objQ2 == fVar2) {
                                objQ2 = new androidx.compose.foundation.selection.f(lVar, z, 2);
                                rVar2 = rVar;
                                rVar2.l0(objQ2);
                            } else {
                                rVar2 = rVar;
                            }
                            boolean z7 = z5;
                            androidx.compose.ui.r rVarL = androidx.compose.foundation.s.l(androidx.compose.foundation.s.i(rVarG, kVar, null, z5, null, (kotlin.jvm.functions.a) objQ2, 24), z7, kVar);
                            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
                            int iHashCode = Long.hashCode(rVar2.T);
                            androidx.compose.runtime.internal.j jVarL = rVar2.l();
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarL);
                            androidx.compose.ui.node.g.b.getClass();
                            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(yVar);
                            } else {
                                rVar2.o0();
                            }
                            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                            androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
                            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                            androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                            androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
                            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                            androidx.compose.runtime.s.t(rVar2, dVar);
                            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                            androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
                            long j = com.app.mlounge.ui.theme.b.m;
                            f1.b(fVar, null, w0.l(oVar, 20), androidx.compose.ui.graphics.t.b(f, j), rVar2, ((i7 >> 12) & 14) | 432, 0);
                            androidx.compose.foundation.layout.b.d(rVar2, w0.p(oVar, f2));
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
                            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                            int iHashCode2 = Long.hashCode(rVar2.T);
                            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, h0Var);
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(yVar);
                            } else {
                                rVar2.o0();
                            }
                            androidx.compose.runtime.s.x(rVar2, vVarA, eVar);
                            androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
                            androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
                            u2 u2Var = u3.a;
                            p3.b(str, null, androidx.compose.ui.graphics.t.b(f, com.app.mlounge.ui.theme.b.l), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).k, rVar, i7 & 14, 0, 131066);
                            int i8 = i7 >> 3;
                            p3.b(str2, null, androidx.compose.ui.graphics.t.b(f, j), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).l, rVar, i8 & 14, 0, 131066);
                            rVar.p(true);
                            long j2 = com.app.mlounge.ui.theme.b.f;
                            long jB = androidx.compose.ui.graphics.t.b(0.3f, j2);
                            long j3 = com.app.mlounge.ui.theme.b.n;
                            long j4 = com.app.mlounge.ui.theme.b.c;
                            j3.a(z, lVar, null, z7, t2.k(j2, jB, j3, j4, androidx.compose.ui.graphics.t.b(0.4f, j2), androidx.compose.ui.graphics.t.b(0.12f, j2), androidx.compose.ui.graphics.t.b(0.4f, j3), androidx.compose.ui.graphics.t.b(0.4f, j4), rVar, 52428), rVar, ((i7 >> 6) & Token.ELSE) | (i8 & 57344), 76);
                            rVar3 = rVar;
                            rVar3.p(true);
                            z4 = z7;
                        } else {
                            rVar3.W();
                            z4 = z3;
                        }
                        q1 q1VarT = rVar3.t();
                        if (q1VarT != null) {
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.m
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    e0.r(str, str2, z, lVar, fVar, z4, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
                    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0094 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
                    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
                    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
                    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
                    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:57:0x00c7  */
                    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
                    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
                    /* JADX WARN: Code duplicated, block: B:70:0x0152  */
                    /* JADX WARN: Code duplicated, block: B:73:0x01b5  */
                    /* JADX WARN: Code duplicated, block: B:74:0x01c2  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0211  */
                    /* JADX WARN: Code duplicated, block: B:82:0x022e  */
                    /* JADX WARN: Code duplicated, block: B:85:0x0243  */
                    /* JADX WARN: Code duplicated, block: B:87:0x02ac  */
                    /* JADX WARN: Code duplicated, block: B:90:0x02b9  */
                    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
                    public static final void s(String str, final String str2, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.graphics.vector.f fVar, final androidx.compose.ui.r rVar, final String str3, androidx.compose.ui.text.input.g0 g0Var, q0 q0Var, androidx.compose.runtime.r rVar2, final int i, final int i2) {
                        androidx.compose.ui.text.input.g0 g0Var2;
                        int i3;
                        q0 q0Var2;
                        boolean z;
                        final String str4;
                        final androidx.compose.ui.text.input.g0 g0Var3;
                        final q0 q0Var3;
                        q1 q1VarT;
                        androidx.compose.ui.text.input.g0 g0Var4;
                        q0 q0Var4;
                        Object objQ;
                        androidx.compose.runtime.f fVar2;
                        y0 y0Var;
                        k2 k2Var;
                        Object objQ2;
                        androidx.compose.foundation.interaction.k kVar;
                        androidx.compose.ui.focus.l lVar2;
                        boolean zF;
                        Object objQ3;
                        kotlin.coroutines.d dVar;
                        Object objQ4;
                        androidx.compose.ui.node.y yVar;
                        androidx.compose.runtime.internal.f fVar3;
                        boolean zF2;
                        Object objQ5;
                        Object objQ6;
                        androidx.compose.runtime.r rVar3 = rVar2;
                        rVar3.c0(-1257614323);
                        int i4 = (rVar3.f(str2) ? 32 : 16) | i | (rVar3.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar3.f(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                        if ((i & 24576) == 0) {
                            i4 |= rVar3.f(rVar) ? 16384 : 8192;
                        }
                        int i5 = i2 & 64;
                        if (i5 != 0) {
                            i3 = i4 | 1572864;
                            g0Var2 = g0Var;
                        } else {
                            g0Var2 = g0Var;
                            i3 = i4 | (rVar3.f(g0Var2) ? 1048576 : 524288);
                        }
                        int i6 = i2 & 128;
                        if (i6 == 0) {
                            if ((i & 12582912) == 0) {
                                q0Var2 = q0Var;
                                i3 |= rVar3.f(q0Var2) ? 8388608 : 4194304;
                            }
                            if ((4793491 & i3) != 4793490) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (rVar3.T(i3 & 1, z)) {
                                if (i5 != 0) {
                                    g0Var4 = androidx.compose.ui.text.input.f0.e;
                                } else {
                                    g0Var4 = g0Var2;
                                }
                                if (i6 != 0) {
                                    q0Var4 = q0.c;
                                } else {
                                    q0Var4 = q0Var2;
                                }
                                objQ = rVar3.Q();
                                fVar2 = androidx.compose.runtime.m.a;
                                if (objQ == fVar2) {
                                    objQ = androidx.compose.runtime.s.r(Boolean.FALSE);
                                    rVar3.l0(objQ);
                                }
                                y0Var = (y0) objQ;
                                k2Var = (k2) rVar3.j(l1.p);
                                objQ2 = rVar3.Q();
                                if (objQ2 == fVar2) {
                                    objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar3);
                                }
                                kVar = (androidx.compose.foundation.interaction.k) objQ2;
                                lVar2 = (androidx.compose.ui.focus.l) rVar3.j(l1.i);
                                Boolean boolValueOf = Boolean.valueOf(((Boolean) y0Var.getValue()).booleanValue());
                                zF = rVar3.f(k2Var);
                                objQ3 = rVar3.Q();
                                if (!zF || objQ3 == fVar2) {
                                    dVar = null;
                                    objQ3 = new com.app.mlounge.ui.components.w(k2Var, y0Var, null, 6);
                                    rVar3.l0(objQ3);
                                } else {
                                    dVar = null;
                                }
                                j0.c(rVar3, boolValueOf, (kotlin.jvm.functions.p) objQ3);
                                objQ4 = rVar3.Q();
                                if (objQ4 == fVar2) {
                                    objQ4 = new androidx.compose.foundation.interaction.g(kVar, y0Var, dVar, 7);
                                    rVar3.l0(objQ4);
                                }
                                j0.c(rVar3, kVar, (kotlin.jvm.functions.p) objQ4);
                                androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(w0.d(rVar, 1.0f), 0.0f, 8, 1);
                                t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar3, 48);
                                int iHashCode = Long.hashCode(rVar3.T);
                                androidx.compose.runtime.internal.j jVarL = rVar3.l();
                                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, rVarQ);
                                androidx.compose.ui.node.g.b.getClass();
                                yVar = androidx.compose.ui.node.f.b;
                                rVar3.e0();
                                int i7 = i3;
                                if (rVar3.S) {
                                    rVar3.k(yVar);
                                } else {
                                    rVar3.o0();
                                }
                                androidx.compose.runtime.s.x(rVar3, t0VarA, androidx.compose.ui.node.f.e);
                                androidx.compose.runtime.s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                                androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                                androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                                androidx.compose.runtime.s.x(rVar3, rVarC, androidx.compose.ui.node.f.c);
                                long j = com.app.mlounge.ui.theme.b.m;
                                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                f1.b(fVar, null, w0.l(oVar, 20), j, rVar3, ((i7 >> 9) & 14) | 432, 0);
                                androidx.compose.foundation.layout.b.d(rVar3, w0.p(oVar, 12));
                                boolean z2 = !((Boolean) y0Var.getValue()).booleanValue();
                                if (str3 == null) {
                                    rVar3.b0(1931428682);
                                    rVar3.p(false);
                                    fVar3 = null;
                                } else {
                                    rVar3.b0(1931428683);
                                    androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-616702814, new com.app.mlounge.ui.components.s(str3, 11), rVar3);
                                    rVar3.p(false);
                                    fVar3 = fVarC;
                                }
                                androidx.compose.material3.w1 w1Var = androidx.compose.material3.w1.a;
                                long j2 = com.app.mlounge.ui.theme.b.f;
                                long j3 = com.app.mlounge.ui.theme.b.e;
                                long j4 = com.app.mlounge.ui.theme.b.l;
                                k3 k3VarC = androidx.compose.material3.w1.c(j4, j4, j2, j2, j3, 0L, 0L, rVar2, 2147477244);
                                if (1.0f <= 0.0d) {
                                    androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                                }
                                androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
                                zF2 = rVar2.f(k2Var) | rVar2.h(lVar2);
                                objQ5 = rVar2.Q();
                                if (zF2 || objQ5 == fVar2) {
                                    objQ5 = new com.app.mlounge.ui.screens.search.h(k2Var, lVar2, y0Var, 4);
                                    rVar2.l0(objQ5);
                                }
                                androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(h0Var, (kotlin.jvm.functions.l) objQ5);
                                objQ6 = rVar2.Q();
                                if (objQ6 == fVar2) {
                                    objQ6 = new h2(y0Var, 19);
                                    rVar2.l0(objQ6);
                                }
                                androidx.compose.ui.r rVarT = androidx.compose.ui.focus.d.t(rVarE, (kotlin.jvm.functions.l) objQ6);
                                str4 = str;
                                int i8 = i7 >> 3;
                                int i9 = i7 >> 6;
                                androidx.compose.ui.text.input.g0 g0Var5 = g0Var4;
                                q0 q0Var5 = q0Var4;
                                c2.a(str2, lVar, rVarT, false, z2, null, androidx.compose.runtime.internal.k.c(-630482737, new com.app.mlounge.ui.components.s(str4, 12), rVar2), fVar3, null, null, g0Var5, q0Var5, null, true, 0, 0, kVar, null, k3VarC, rVar2, (i8 & Token.ASSIGN_MOD) | (i8 & 14) | 1572864, (57344 & i9) | 12582912 | (i9 & 458752), 6, 2965288);
                                rVar3 = rVar2;
                                rVar3.p(true);
                                g0Var3 = g0Var5;
                                q0Var3 = q0Var5;
                            } else {
                                str4 = str;
                                rVar3.W();
                                g0Var3 = g0Var2;
                                q0Var3 = q0Var2;
                            }
                            q1VarT = rVar3.t();
                            if (q1VarT != null) {
                                q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.n
                                    @Override // kotlin.jvm.functions.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        e0.s(str4, str2, lVar, fVar, rVar, str3, g0Var3, q0Var3, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                                        return kotlin.y.a;
                                    }
                                };
                            }
                        }
                        i3 |= 12582912;
                        q0Var2 = q0Var;
                        if ((4793491 & i3) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (rVar3.T(i3 & 1, z)) {
                            if (i5 != 0) {
                                g0Var4 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var4 = g0Var2;
                            }
                            if (i6 != 0) {
                                q0Var4 = q0.c;
                            } else {
                                q0Var4 = q0Var2;
                            }
                            objQ = rVar3.Q();
                            fVar2 = androidx.compose.runtime.m.a;
                            if (objQ == fVar2) {
                                objQ = androidx.compose.runtime.s.r(Boolean.FALSE);
                                rVar3.l0(objQ);
                            }
                            y0Var = (y0) objQ;
                            k2Var = (k2) rVar3.j(l1.p);
                            objQ2 = rVar3.Q();
                            if (objQ2 == fVar2) {
                                objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar3);
                            }
                            kVar = (androidx.compose.foundation.interaction.k) objQ2;
                            lVar2 = (androidx.compose.ui.focus.l) rVar3.j(l1.i);
                            Boolean boolValueOf2 = Boolean.valueOf(((Boolean) y0Var.getValue()).booleanValue());
                            zF = rVar3.f(k2Var);
                            objQ3 = rVar3.Q();
                            if (zF) {
                                dVar = null;
                                objQ3 = new com.app.mlounge.ui.components.w(k2Var, y0Var, null, 6);
                                rVar3.l0(objQ3);
                            } else {
                                dVar = null;
                                objQ3 = new com.app.mlounge.ui.components.w(k2Var, y0Var, null, 6);
                                rVar3.l0(objQ3);
                            }
                            j0.c(rVar3, boolValueOf2, (kotlin.jvm.functions.p) objQ3);
                            objQ4 = rVar3.Q();
                            if (objQ4 == fVar2) {
                                objQ4 = new androidx.compose.foundation.interaction.g(kVar, y0Var, dVar, 7);
                                rVar3.l0(objQ4);
                            }
                            j0.c(rVar3, kVar, (kotlin.jvm.functions.p) objQ4);
                            androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(w0.d(rVar, 1.0f), 0.0f, 8, 1);
                            t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar3, 48);
                            int iHashCode2 = Long.hashCode(rVar3.T);
                            androidx.compose.runtime.internal.j jVarL2 = rVar3.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, rVarQ2);
                            androidx.compose.ui.node.g.b.getClass();
                            yVar = androidx.compose.ui.node.f.b;
                            rVar3.e0();
                            int i10 = i3;
                            if (rVar3.S) {
                                rVar3.k(yVar);
                            } else {
                                rVar3.o0();
                            }
                            androidx.compose.runtime.s.x(rVar3, t0VarA2, androidx.compose.ui.node.f.e);
                            androidx.compose.runtime.s.x(rVar3, jVarL2, androidx.compose.ui.node.f.d);
                            androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                            androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                            androidx.compose.runtime.s.x(rVar3, rVarC2, androidx.compose.ui.node.f.c);
                            long j5 = com.app.mlounge.ui.theme.b.m;
                            androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                            f1.b(fVar, null, w0.l(oVar2, 20), j5, rVar3, ((i10 >> 9) & 14) | 432, 0);
                            androidx.compose.foundation.layout.b.d(rVar3, w0.p(oVar2, 12));
                            boolean z3 = !((Boolean) y0Var.getValue()).booleanValue();
                            if (str3 == null) {
                                rVar3.b0(1931428682);
                                rVar3.p(false);
                                fVar3 = null;
                            } else {
                                rVar3.b0(1931428683);
                                androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(-616702814, new com.app.mlounge.ui.components.s(str3, 11), rVar3);
                                rVar3.p(false);
                                fVar3 = fVarC2;
                            }
                            androidx.compose.material3.w1 w1Var2 = androidx.compose.material3.w1.a;
                            long j6 = com.app.mlounge.ui.theme.b.f;
                            long j7 = com.app.mlounge.ui.theme.b.e;
                            long j8 = com.app.mlounge.ui.theme.b.l;
                            k3 k3VarC2 = androidx.compose.material3.w1.c(j8, j8, j6, j6, j7, 0L, 0L, rVar2, 2147477244);
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.h0 h0Var2 = new androidx.compose.foundation.layout.h0(1.0f, true);
                            zF2 = rVar2.f(k2Var) | rVar2.h(lVar2);
                            objQ5 = rVar2.Q();
                            if (zF2) {
                                objQ5 = new com.app.mlounge.ui.screens.search.h(k2Var, lVar2, y0Var, 4);
                                rVar2.l0(objQ5);
                            } else {
                                objQ5 = new com.app.mlounge.ui.screens.search.h(k2Var, lVar2, y0Var, 4);
                                rVar2.l0(objQ5);
                            }
                            androidx.compose.ui.r rVarE2 = androidx.compose.ui.input.key.c.e(h0Var2, (kotlin.jvm.functions.l) objQ5);
                            objQ6 = rVar2.Q();
                            if (objQ6 == fVar2) {
                                objQ6 = new h2(y0Var, 19);
                                rVar2.l0(objQ6);
                            }
                            androidx.compose.ui.r rVarT2 = androidx.compose.ui.focus.d.t(rVarE2, (kotlin.jvm.functions.l) objQ6);
                            str4 = str;
                            int i11 = i10 >> 3;
                            int i12 = i10 >> 6;
                            androidx.compose.ui.text.input.g0 g0Var6 = g0Var4;
                            q0 q0Var6 = q0Var4;
                            c2.a(str2, lVar, rVarT2, false, z3, null, androidx.compose.runtime.internal.k.c(-630482737, new com.app.mlounge.ui.components.s(str4, 12), rVar2), fVar3, null, null, g0Var6, q0Var6, null, true, 0, 0, kVar, null, k3VarC2, rVar2, (i11 & Token.ASSIGN_MOD) | (i11 & 14) | 1572864, (57344 & i12) | 12582912 | (i12 & 458752), 6, 2965288);
                            rVar3 = rVar2;
                            rVar3.p(true);
                            g0Var3 = g0Var6;
                            q0Var3 = q0Var6;
                        } else {
                            str4 = str;
                            rVar3.W();
                            g0Var3 = g0Var2;
                            q0Var3 = q0Var2;
                        }
                        q1VarT = rVar3.t();
                        if (q1VarT != null) {
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.n
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    e0.s(str4, str2, lVar, fVar, rVar, str3, g0Var3, q0Var3, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }

                    public static final long t(File file) {
                        long length = 0;
                        if (file != null && file.exists()) {
                            kotlin.sequences.f fVar = new kotlin.sequences.f(new kotlin.sequences.g(new kotlin.io.h(file), true, new com.app.mlounge.ui.screens.player.j0(3)));
                            while (fVar.hasNext()) {
                                length += ((File) fVar.next()).length();
                            }
                        }
                        return length;
                    }

                    public static final String u(Context context) {
                        long jT = 0;
                        try {
                            jT = t(context.getCacheDir());
                            File externalCacheDir = context.getExternalCacheDir();
                            if (externalCacheDir != null) {
                                jT += t(externalCacheDir);
                            }
                        } catch (Exception unused) {
                        }
                        if (jT < 1024) {
                            return jT + " B";
                        }
                        if (jT >= 1048576) {
                            return jT < 1073741824 ? String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(jT / 1048576.0d)}, 1)) : String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(jT / 1.073741824E9d)}, 1));
                        }
                        return (jT / ((long) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) + " KB";
                    }

                    public static final String v(Uri uri) {
                        try {
                            String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
                            treeDocumentId.getClass();
                            List listP0 = kotlin.text.k.p0(new String[]{":"}, treeDocumentId, 6);
                            if (listP0.size() != 2) {
                                return null;
                            }
                            String str = (String) listP0.get(0);
                            String str2 = (String) listP0.get(1);
                            if (!"primary".equalsIgnoreCase(str)) {
                                return "/storage/" + str + "/" + str2;
                            }
                            return Environment.getExternalStorageDirectory() + "/" + str2;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                }
