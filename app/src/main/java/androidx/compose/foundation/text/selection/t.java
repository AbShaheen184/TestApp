package androidx.compose.foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.u2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n {
    public final kotlin.coroutines.i a;
    public final Context b;
    public final x c;
    public final androidx.compose.ui.text.intl.b d;
    public TextClassifier f;
    public final Mutex e = MutexKt.Mutex$default(false, 1, null);
    public final androidx.compose.runtime.h1 g = androidx.compose.runtime.s.r(null);
    public final Object h = new Object();

    public t(kotlin.coroutines.i iVar, Context context, x xVar, androidx.compose.ui.text.intl.b bVar) {
        this.a = iVar;
        this.b = context;
        this.c = xVar;
        this.d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object a(t tVar, CharSequence charSequence, long j, TextClassifier textClassifier, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        o oVar;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        Mutex mutex;
        Object obj;
        Object obj2;
        TextClassification textClassificationClassifyText;
        Object obj3;
        long j3;
        CharSequence charSequence3;
        Mutex mutex2 = tVar.e;
        androidx.compose.runtime.h1 h1Var = tVar.g;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i = oVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.D = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(tVar, cVar);
            }
        } else {
            oVar = new o(tVar, cVar);
        }
        Object obj4 = oVar.B;
        int i2 = oVar.D;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j2 = oVar.A;
                    mutex = oVar.z;
                    textClassifier2 = (TextClassifier) oVar.y;
                    charSequence2 = oVar.e;
                    kotlin.a.e(obj4);
                } else {
                    if (i2 != 2) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = oVar.A;
                    mutex2 = oVar.z;
                    textClassificationClassifyText = (TextClassification) oVar.y;
                    charSequence3 = oVar.e;
                    kotlin.a.e(obj4);
                    obj3 = null;
                }
                try {
                    h1Var.setValue(new r0(charSequence3, j3, textClassificationClassifyText));
                    return yVar;
                } finally {
                    mutex2.unlock(obj3);
                }
            }
            kotlin.a.e(obj4);
            oVar.e = charSequence;
            oVar.y = textClassifier;
            oVar.z = mutex2;
            j2 = j;
            oVar.A = j2;
            oVar.D = 1;
            if (mutex2.lock(null, oVar) == aVar) {
                return aVar;
            }
            charSequence2 = charSequence;
            textClassifier2 = textClassifier;
            mutex = mutex2;
            r0 r0Var = (r0) h1Var.getValue();
            if (r0Var != null) {
                try {
                    u2 u2Var = v.a;
                    if (androidx.compose.ui.text.l0.b(j2, r0Var.b) && kotlin.jvm.internal.l.a(charSequence2, r0Var.a)) {
                        mutex.unlock(null);
                        return yVar;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    mutex.unlock(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            mutex.unlock(obj2);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, androidx.compose.ui.text.l0.f(j2), androidx.compose.ui.text.l0.e(j2)).setDefaultLocales(tVar.c()).build());
            oVar.e = charSequence2;
            oVar.y = textClassificationClassifyText;
            oVar.z = mutex2;
            oVar.A = j2;
            oVar.D = 2;
            obj3 = null;
            if (mutex2.lock(null, oVar) == aVar) {
                return aVar;
            }
            j3 = j2;
            charSequence3 = charSequence2;
            h1Var.setValue(new r0(charSequence3, j3, textClassificationClassifyText));
            return yVar;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final void b(androidx.compose.foundation.text.contextmenu.builder.a aVar, String str, long j, androidx.compose.animation.core.a aVar2) throws Throwable {
        Mutex mutex = this.e;
        TextClassification textClassification = null;
        if (Mutex.DefaultImpls.tryLock$default(mutex, null, 1, null)) {
            r0 r0Var = (r0) this.g.getValue();
            TextClassification textClassification2 = (r0Var != null && androidx.compose.ui.text.l0.b(j, r0Var.b) && kotlin.jvm.internal.l.a(str, r0Var.a)) ? r0Var.c : null;
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            aVar2.invoke(aVar);
            return;
        }
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.h;
        if (!zIsEmpty) {
            aVar.a.a(new androidx.compose.foundation.text.contextmenu.data.h(obj, textClassification, 0));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            aVar.a.a(new androidx.compose.foundation.text.contextmenu.data.h(obj, textClassification, -1));
        }
        aVar2.invoke(aVar);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                aVar.a.a(new androidx.compose.foundation.text.contextmenu.data.h(obj, textClassification, i));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final LocaleList c() {
        androidx.compose.ui.text.intl.b bVar = this.d;
        if (bVar == null) {
            return new LocaleList(((androidx.compose.ui.text.intl.a) androidx.compose.ui.text.intl.c.a.A().e.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(bVar, 10));
        Iterator it = bVar.e.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.compose.ui.text.intl.a) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
