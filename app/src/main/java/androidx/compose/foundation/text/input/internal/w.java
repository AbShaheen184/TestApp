package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.ui.platform.p2;
import androidx.compose.ui.text.l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final View a;
    public final o b;
    public r0 e;
    public c1 f;
    public p2 g;
    public Rect l;
    public final s m;
    public kotlin.jvm.functions.l c = new androidx.compose.foundation.lazy.i(16);
    public kotlin.jvm.functions.l d = new androidx.compose.foundation.lazy.i(17);
    public androidx.compose.ui.text.input.x h = new androidx.compose.ui.text.input.x(4, l0.b, "");
    public androidx.compose.ui.text.input.k i = androidx.compose.ui.text.input.k.g;
    public final ArrayList j = new ArrayList();
    public final Object k = kotlin.a.c(kotlin.i.y, new androidx.activity.w(this, 15));

    public w(View view, b bVar, o oVar) {
        this.a = view;
        this.b = oVar;
        this.m = new s(bVar, oVar);
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.List] */
    public final x a(EditorInfo editorInfo) {
        int i;
        int i2;
        androidx.compose.ui.text.input.x xVar = this.h;
        String str = xVar.a.y;
        long j = xVar.b;
        androidx.compose.ui.text.input.k kVar = this.i;
        int i3 = kVar.e;
        int i4 = kVar.d;
        boolean z = kVar.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                net.luminis.tls.engine.impl.c.r("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        androidx.compose.ui.text.intl.b bVar = kVar.f;
        if (kotlin.jvm.internal.l.a(bVar, androidx.compose.ui.text.intl.b.z)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(kotlin.collections.p.y(bVar, 10));
            Iterator it = bVar.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.compose.ui.text.intl.a) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = Token.DEFAULT;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                net.luminis.tls.engine.impl.c.r("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (kVar.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = kVar.b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (kVar.c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = l0.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        androidx.core.view.inputmethod.c.c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!androidx.compose.foundation.text.handwriting.e.a || i4 == 7 || i4 == 8) {
            androidx.core.view.inputmethod.c.d(editorInfo, false);
        } else {
            androidx.core.view.inputmethod.c.d(editorInfo, true);
            j.f(editorInfo);
        }
        u uVar = v.a;
        if (androidx.emoji2.text.j.d()) {
            androidx.emoji2.text.j.a().i(editorInfo);
        }
        x xVar2 = new x(this.h, new com.google.firebase.platforminfo.c(this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(xVar2));
        return xVar2;
    }
}
