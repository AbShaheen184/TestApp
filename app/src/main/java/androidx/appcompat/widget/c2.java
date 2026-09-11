package androidx.appcompat.widget;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.LocaleList;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.gestures.y2;
import androidx.recyclerview.widget.RecyclerView;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements androidx.compose.runtime.saveable.g, androidx.core.view.inputmethod.g, androidx.media3.extractor.text.d, androidx.media3.extractor.ts.z, com.google.common.util.concurrent.k0 {
    public Object A;
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public c2(int i) {
        this.e = i;
        switch (i) {
            case 3:
                this.y = new AtomicReference(androidx.compose.runtime.internal.k.b);
                this.z = new Object();
                break;
            case 6:
                this.y = new com.app.mlounge.data.music.e(17);
                this.z = new com.app.mlounge.data.music.e(17);
                this.A = new com.app.mlounge.data.music.e(17);
                break;
            case 8:
                this.A = new com.google.firebase.heartbeatinfo.e();
                break;
            case 10:
                this.y = new WeakHashMap();
                this.z = new WeakHashMap();
                this.A = new WeakHashMap();
                break;
            default:
                long[] jArr = androidx.collection.w0.a;
                this.y = new androidx.collection.o0();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.caverock.androidsvg.x0 E(com.caverock.androidsvg.v0 v0Var, String str) {
        com.caverock.androidsvg.x0 x0VarE;
        com.caverock.androidsvg.x0 x0Var = (com.caverock.androidsvg.x0) v0Var;
        if (str.equals(x0Var.c)) {
            return x0Var;
        }
        for (Object obj : v0Var.getChildren()) {
            if (obj instanceof com.caverock.androidsvg.x0) {
                com.caverock.androidsvg.x0 x0Var2 = (com.caverock.androidsvg.x0) obj;
                if (str.equals(x0Var2.c)) {
                    return x0Var2;
                }
                if ((obj instanceof com.caverock.androidsvg.v0) && (x0VarE = E((com.caverock.androidsvg.v0) obj, str)) != null) {
                    return x0VarE;
                }
            }
        }
        return null;
    }

    public static c2 S(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new c2(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static boolean t(Editable editable, KeyEvent keyEvent, boolean z) {
        androidx.emoji2.text.z[] zVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (zVarArr = (androidx.emoji2.text.z[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.z.class)) != null && zVarArr.length > 0) {
                for (androidx.emoji2.text.z zVar : zVarArr) {
                    int spanStart = editable.getSpanStart(zVar);
                    int spanEnd = editable.getSpanEnd(zVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public androidx.compose.ui.text.intl.b A() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((com.google.firebase.heartbeatinfo.e) this.A)) {
            try {
                androidx.compose.ui.text.intl.b bVar = (androidx.compose.ui.text.intl.b) this.z;
                if (bVar != null && localeList == ((LocaleList) this.y)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new androidx.compose.ui.text.intl.a(localeList.get(i)));
                }
                androidx.compose.ui.text.intl.b bVar2 = new androidx.compose.ui.text.intl.b(arrayList);
                this.y = localeList;
                this.z = bVar2;
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long B() {
        androidx.media3.extractor.k kVar = (androidx.media3.extractor.k) this.A;
        if (kVar != null) {
            return kVar.A;
        }
        return -1L;
    }

    public androidx.compose.ui.geometry.a C() {
        int i;
        float fC;
        int i2;
        com.caverock.androidsvg.s0 s0Var = (com.caverock.androidsvg.s0) this.y;
        com.caverock.androidsvg.d0 d0Var = s0Var.r;
        com.caverock.androidsvg.d0 d0Var2 = s0Var.s;
        if (d0Var == null || d0Var.g() || (i = d0Var.y) == 9 || i == 2 || i == 3) {
            return new androidx.compose.ui.geometry.a(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = d0Var.c();
        if (d0Var2 == null) {
            androidx.compose.ui.geometry.a aVar = ((com.caverock.androidsvg.s0) this.y).o;
            fC = aVar != null ? (aVar.e * fC2) / aVar.d : fC2;
        } else {
            if (d0Var2.g() || (i2 = d0Var2.y) == 9 || i2 == 2 || i2 == 3) {
                return new androidx.compose.ui.geometry.a(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = d0Var2.c();
        }
        return new androidx.compose.ui.geometry.a(0.0f, 0.0f, fC2, fC);
    }

    public Drawable D(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.z;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : coil3.network.g.p((Context) this.y, resourceId);
    }

    public Typeface F(int i, int i2, c0 c0Var) {
        int resourceId = ((TypedArray) this.z).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.A) == null) {
            this.A = new TypedValue();
        }
        Context context = (Context) this.y;
        TypedValue typedValue = (TypedValue) this.A;
        ThreadLocal threadLocal = androidx.core.content.res.j.a;
        if (context.isRestricted()) {
            return null;
        }
        return androidx.core.content.res.j.a(context, resourceId, typedValue, i2, c0Var, true, false);
    }

    public int G(int i) {
        y2 y2Var = (y2) this.z;
        if (i < 0) {
            return -1;
        }
        int childCount = ((androidx.recyclerview.widget.u) this.y).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iE = i - (i2 - y2Var.E(i2));
            if (iE == 0) {
                while (y2Var.G(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iE;
        }
        return -1;
    }

    public long H() {
        return ((androidx.compose.ui.graphics.drawscope.b) this.A).e.d;
    }

    public View I(int i) {
        return ((androidx.recyclerview.widget.u) this.y).a.getChildAt(i);
    }

    public int J() {
        return ((androidx.recyclerview.widget.u) this.y).a.getChildCount();
    }

    public boolean K(CharSequence charSequence, int i, int i2, androidx.emoji2.text.y yVar) {
        if ((yVar.c & 3) == 0) {
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) this.A;
            androidx.emoji2.text.flatbuffer.a aVarB = yVar.b();
            int iB = aVarB.b(8);
            if (iB != 0) {
                ((ByteBuffer) aVarB.A).getShort(iB + aVarB.e);
            }
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = dVar.a.hasGlyph(sb.toString());
            int i3 = yVar.c & 4;
            yVar.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (yVar.c & 3) == 2;
    }

    public boolean L() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.z;
        if (((String) this.A) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.A = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.y).readLine();
                this.A = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.A = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public void M(View view) {
        ((ArrayList) this.A).add(view);
        androidx.recyclerview.widget.u uVar = (androidx.recyclerview.widget.u) this.y;
        androidx.recyclerview.widget.p0 p0VarG = RecyclerView.G(view);
        if (p0VarG != null) {
            View view2 = p0VarG.a;
            RecyclerView recyclerView = uVar.a;
            int i = p0VarG.q;
            if (i != -1) {
                p0VarG.p = i;
            } else {
                Field field = androidx.core.view.s0.a;
                p0VarG.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.J()) {
                p0VarG.q = 4;
                recyclerView.N0.add(p0VarG);
            } else {
                Field field2 = androidx.core.view.s0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public void N(androidx.media3.datasource.h hVar, Uri uri, Map map, long j, long j2, androidx.media3.exoplayer.source.o0 o0Var) throws androidx.media3.exoplayer.source.j1 {
        androidx.media3.extractor.k kVar = new androidx.media3.extractor.k(hVar, j, j2);
        this.A = kVar;
        if (((androidx.media3.extractor.n) this.z) != null) {
            return;
        }
        androidx.media3.extractor.n[] nVarArrB = ((androidx.media3.extractor.q) this.y).b(uri, map);
        com.google.common.collect.d0 d0VarL = com.google.common.collect.h0.l(nVarArrB.length);
        boolean z = true;
        if (nVarArrB.length == 1) {
            this.z = nVarArrB[0];
        } else {
            for (androidx.media3.extractor.n nVar : nVarArrB) {
                try {
                    if (nVar.a(kVar)) {
                        this.z = nVar;
                        kVar.C = 0;
                        break;
                    }
                    d0VarL.c(nVar.e());
                    boolean z2 = ((androidx.media3.extractor.n) this.z) != null || kVar.A == j;
                    com.google.android.material.motion.a.q(z2);
                    kVar.C = 0;
                } catch (EOFException unused) {
                    if (((androidx.media3.extractor.n) this.z) != null || kVar.A == j) {
                    }
                } catch (Throwable th) {
                    if (((androidx.media3.extractor.n) this.z) == null && kVar.A != j) {
                        z = false;
                    }
                    com.google.android.material.motion.a.q(z);
                    kVar.C = 0;
                    throw th;
                }
                com.google.android.material.motion.a.q(z2);
                kVar.C = 0;
            }
            if (((androidx.media3.extractor.n) this.z) == null) {
                String str = "None of the available extractors (" + new androidx.media3.container.a(", ").d(com.google.common.collect.q.w(com.google.common.collect.h0.p(nVarArrB), new androidx.media3.common.p(5))) + ") could read the stream.";
                uri.getClass();
                throw new androidx.media3.exoplayer.source.j1(str, d0VarL.g());
            }
        }
        ((androidx.media3.extractor.n) this.z).d(o0Var);
    }

    public boolean O() {
        return !(((androidx.compose.ui.node.v1) ((com.app.mlounge.data.music.e) this.y).y).isEmpty() && ((androidx.compose.ui.node.v1) ((com.app.mlounge.data.music.e) this.A).y).isEmpty() && ((androidx.compose.ui.node.v1) ((com.app.mlounge.data.music.e) this.z).y).isEmpty());
    }

    public boolean P() {
        if (((androidx.compose.runtime.t2) this.y).getValue() != this.A) {
            return true;
        }
        c2 c2Var = (c2) this.z;
        return c2Var != null && c2Var.P();
    }

    public boolean Q(int i, androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.f fVar) {
        androidx.constraintlayout.core.widgets.analyzer.b bVar = (androidx.constraintlayout.core.widgets.analyzer.b) this.z;
        int[] iArr = dVar.o0;
        int[] iArr2 = dVar.s;
        bVar.a = iArr[0];
        bVar.b = iArr[1];
        bVar.c = dVar.n();
        bVar.d = dVar.k();
        bVar.i = false;
        bVar.j = i;
        boolean z = bVar.a == 3;
        boolean z2 = bVar.b == 3;
        boolean z3 = z && dVar.V > 0.0f;
        boolean z4 = z2 && dVar.V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            bVar.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            bVar.b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.J(bVar.e);
        dVar.G(bVar.f);
        dVar.D = bVar.h;
        dVar.D(bVar.g);
        bVar.j = 0;
        return bVar.i;
    }

    public String R() {
        if (!L()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        String str = (String) this.A;
        this.A = null;
        return str;
    }

    public Object T(CharSequence charSequence, int i, int i2, int i3, boolean z, androidx.emoji2.text.p pVar) {
        int i4;
        char c;
        androidx.emoji2.text.s sVar = new androidx.emoji2.text.s((androidx.emoji2.text.v) ((com.google.firebase.messaging.o) this.z).A);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zF = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zF) {
                    SparseArray sparseArray = ((androidx.emoji2.text.v) sVar.f).a;
                    androidx.emoji2.text.v vVar = sparseArray == null ? null : (androidx.emoji2.text.v) sparseArray.get(iCodePointAt);
                    if (sVar.b == 2) {
                        if (vVar != null) {
                            sVar.f = vVar;
                            sVar.d++;
                        } else {
                            if (iCodePointAt == 65038) {
                                sVar.a();
                            } else if (iCodePointAt != 65039) {
                                androidx.emoji2.text.v vVar2 = (androidx.emoji2.text.v) sVar.f;
                                if (vVar2.b != null) {
                                    if (sVar.d != 1) {
                                        sVar.g = vVar2;
                                        sVar.a();
                                    } else if (sVar.b()) {
                                        sVar.g = (androidx.emoji2.text.v) sVar.f;
                                        sVar.a();
                                    } else {
                                        sVar.a();
                                    }
                                    c = 3;
                                } else {
                                    sVar.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (vVar == null) {
                        sVar.a();
                        c = 1;
                    } else {
                        sVar.b = 2;
                        sVar.f = vVar;
                        sVar.d = 1;
                        c = 2;
                    }
                    sVar.c = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && K(charSequence, i4, iCharCount, ((androidx.emoji2.text.v) sVar.g).b)) {
                            break;
                        }
                        zF = pVar.f(charSequence, i4, iCharCount, ((androidx.emoji2.text.v) sVar.g).b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (sVar.b == 2 && ((androidx.emoji2.text.v) sVar.f).b != null && ((sVar.d > 1 || sVar.b()) && i5 < i3 && zF && (z || !K(charSequence, i4, iCharCount, ((androidx.emoji2.text.v) sVar.f).b)))) {
            pVar.f(charSequence, i4, iCharCount, ((androidx.emoji2.text.v) sVar.f).b);
        }
        return pVar.e();
    }

    public void U() {
        ((TypedArray) this.z).recycle();
    }

    public void V(androidx.media3.exoplayer.upstream.a aVar) {
        androidx.media3.exoplayer.analytics.k kVar = (androidx.media3.exoplayer.analytics.k) ((HashMap) this.y).remove(aVar);
        kVar.getClass();
        androidx.media3.exoplayer.f fVar = (androidx.media3.exoplayer.f) ((androidx.media3.exoplayer.g) this.A).q.get(kVar);
        if (fVar != null) {
            synchronized (fVar) {
                fVar.d--;
            }
        }
    }

    public com.caverock.androidsvg.x0 W(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#")) {
            return null;
        }
        String strSubstring = strReplace.substring(1);
        HashMap map = (HashMap) this.A;
        if (strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(((com.caverock.androidsvg.s0) this.y).c)) {
            return (com.caverock.androidsvg.s0) this.y;
        }
        if (map.containsKey(strSubstring)) {
            return (com.caverock.androidsvg.x0) map.get(strSubstring);
        }
        com.caverock.androidsvg.x0 x0VarE = E((com.caverock.androidsvg.s0) this.y, strSubstring);
        map.put(strSubstring, x0VarE);
        return x0VarE;
    }

    public void X(Object obj) {
        long jB = androidx.compose.runtime.internal.k.b();
        if (jB == androidx.compose.runtime.internal.n.a) {
            this.A = obj;
            return;
        }
        synchronized (this.z) {
            androidx.compose.runtime.internal.m mVar = (androidx.compose.runtime.internal.m) ((AtomicReference) this.y).get();
            int iA = mVar.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.y).set(mVar.b(jB, obj));
            } else {
                mVar.c[iA] = obj;
            }
        }
    }

    public void Y(String str) {
        if (str != null) {
            this.y = str;
        } else {
            com.google.gson.b.h("Null backendName");
        }
    }

    public void Z(androidx.compose.ui.graphics.r rVar) {
        ((androidx.compose.ui.graphics.drawscope.b) this.A).e.c = rVar;
    }

    @Override // androidx.core.view.inputmethod.g
    public ClipDescription a() {
        return (ClipDescription) this.z;
    }

    public void a0(androidx.compose.ui.unit.c cVar) {
        ((androidx.compose.ui.graphics.drawscope.b) this.A).e.a = cVar;
    }

    @Override // com.google.common.util.concurrent.k0
    public void b(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = (ViewGroup) this.z;
        View view2 = (View) this.y;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            net.luminis.tls.engine.impl.c.r("The media route button placeholder missing layout params.");
            return;
        }
        view.setId(R.id.exo_media_route_button_placeholder);
        view.setLayoutParams(layoutParams);
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeView(view2);
        viewGroup.addView(view, iIndexOfChild);
        view.setVisibility(0);
        ((androidx.media3.ui.v) this.A).e.h(view, true);
    }

    public void b0(androidx.compose.ui.unit.m mVar) {
        ((androidx.compose.ui.graphics.drawscope.b) this.A).e.b = mVar;
    }

    @Override // androidx.media3.extractor.ts.z
    public void c(androidx.media3.common.util.w wVar) {
        long jD;
        long j;
        ((androidx.media3.common.util.h0) this.z).getClass();
        String str = androidx.media3.common.util.j0.a;
        androidx.media3.common.util.h0 h0Var = (androidx.media3.common.util.h0) this.z;
        synchronized (h0Var) {
            try {
                long j2 = h0Var.c;
                jD = j2 != -9223372036854775807L ? j2 + h0Var.b : h0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        androidx.media3.common.util.h0 h0Var2 = (androidx.media3.common.util.h0) this.z;
        synchronized (h0Var2) {
            j = h0Var2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.y;
        if (j != rVar.t) {
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.s = j;
            androidx.media3.common.r rVar2 = new androidx.media3.common.r(qVarA);
            this.y = rVar2;
            ((androidx.media3.extractor.h0) this.A).e(rVar2);
        }
        int iA = wVar.a();
        ((androidx.media3.extractor.h0) this.A).f(iA, wVar);
        ((androidx.media3.extractor.h0) this.A).g(jD, 1, iA, 0, null);
    }

    public void c0(long j) {
        ((androidx.compose.ui.graphics.drawscope.b) this.A).e.d = j;
    }

    @Override // androidx.media3.extractor.ts.z
    public void d(androidx.media3.common.util.h0 h0Var, androidx.media3.extractor.p pVar, androidx.media3.extractor.ts.e0 e0Var) {
        this.z = h0Var;
        e0Var.a();
        e0Var.b();
        androidx.media3.extractor.h0 h0VarU = pVar.u(e0Var.d, 5);
        this.A = h0VarU;
        h0VarU.e((androidx.media3.common.r) this.y);
    }

    public void d0(androidx.constraintlayout.core.widgets.e eVar, int i, int i2, int i3) {
        int i4 = eVar.a0;
        int i5 = eVar.b0;
        eVar.a0 = 0;
        eVar.b0 = 0;
        eVar.J(i2);
        eVar.G(i3);
        if (i4 < 0) {
            eVar.a0 = 0;
        } else {
            eVar.a0 = i4;
        }
        if (i5 < 0) {
            eVar.b0 = 0;
        } else {
            eVar.b0 = i5;
        }
        androidx.constraintlayout.core.widgets.e eVar2 = (androidx.constraintlayout.core.widgets.e) this.A;
        eVar2.s0 = i;
        eVar2.P();
    }

    @Override // androidx.media3.extractor.text.d
    public int e(long j) {
        long[] jArr = (long[]) this.A;
        int iB = androidx.media3.common.util.j0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void e0(View view) {
        if (((ArrayList) this.A).remove(view)) {
            androidx.recyclerview.widget.u uVar = (androidx.recyclerview.widget.u) this.y;
            androidx.recyclerview.widget.p0 p0VarG = RecyclerView.G(view);
            if (p0VarG != null) {
                RecyclerView recyclerView = uVar.a;
                int i = p0VarG.p;
                if (recyclerView.J()) {
                    p0VarG.q = i;
                    recyclerView.N0.add(p0VarG);
                } else {
                    View view2 = p0VarG.a;
                    Field field = androidx.core.view.s0.a;
                    view2.setImportantForAccessibility(i);
                }
                p0VarG.p = 0;
            }
        }
    }

    @Override // androidx.media3.extractor.text.d
    public long f(int i) {
        long[] jArr = (long[]) this.A;
        com.google.android.material.motion.a.f(i >= 0);
        com.google.android.material.motion.a.f(i < jArr.length);
        return jArr[i];
    }

    public void f0() {
        androidx.collection.o0 o0Var = (androidx.collection.o0) this.y;
        String str = (String) this.z;
        List list = (List) o0Var.k(str);
        if (list != null) {
            list.remove((kotlin.jvm.functions.a) this.A);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.m(str, list);
    }

    @Override // androidx.core.view.inputmethod.g
    public Uri g() {
        return (Uri) this.y;
    }

    public void g0(androidx.constraintlayout.core.widgets.e eVar) {
        ArrayList arrayList = (ArrayList) this.y;
        arrayList.clear();
        int size = eVar.p0.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) eVar.p0.get(i);
            int[] iArr = dVar.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.r0.b = true;
    }

    @Override // androidx.core.view.inputmethod.g
    public Uri i() {
        return (Uri) this.A;
    }

    @Override // androidx.media3.extractor.text.d
    public List j(long j) {
        List list = (List) this.y;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.z;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                androidx.media3.extractor.text.webvtt.c cVar = (androidx.media3.extractor.text.webvtt.c) list.get(i);
                androidx.media3.common.text.b bVar = cVar.a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new androidx.compose.foundation.lazy.layout.a(21));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            androidx.media3.common.text.a aVarA = ((androidx.media3.extractor.text.webvtt.c) arrayList2.get(i3)).a.a();
            aVarA.e = (-1) - i3;
            aVarA.f = 1;
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    @Override // androidx.media3.extractor.text.d
    public int k() {
        return ((long[]) this.A).length;
    }

    @Override // com.google.common.util.concurrent.k0
    public void l(Throwable th) {
        ((View) this.y).setVisibility(8);
    }

    @Override // androidx.core.view.inputmethod.g
    public Object m() {
        return null;
    }

    public void n(androidx.compose.ui.node.f0 f0Var, androidx.compose.ui.node.s sVar) {
        com.app.mlounge.data.music.e eVar = (com.app.mlounge.data.music.e) this.y;
        com.app.mlounge.data.music.e eVar2 = (com.app.mlounge.data.music.e) this.z;
        com.app.mlounge.data.music.e eVar3 = (com.app.mlounge.data.music.e) this.A;
        int iOrdinal = sVar.ordinal();
        if (iOrdinal == 0) {
            eVar.f(f0Var);
            eVar3.f(f0Var);
            return;
        }
        if (iOrdinal == 1) {
            eVar2.f(f0Var);
            eVar3.f(f0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (f0Var.F != null) {
                eVar3.f(f0Var);
                return;
            } else {
                eVar.f(f0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            coil3.g.a();
        } else if (f0Var.F != null) {
            eVar3.f(f0Var);
        } else {
            eVar2.f(f0Var);
        }
    }

    public void o(View view, int i, boolean z) {
        RecyclerView recyclerView = ((androidx.recyclerview.widget.u) this.y).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : G(i);
        ((y2) this.z).H(childCount, z);
        if (z) {
            M(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.G(view);
    }

    public void p(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((androidx.recyclerview.widget.u) this.y).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : G(i);
        ((y2) this.z).H(childCount, z);
        if (z) {
            M(view);
        }
        androidx.recyclerview.widget.p0 p0VarG = RecyclerView.G(view);
        if (p0VarG != null) {
            if (!p0VarG.j() && !p0VarG.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(p0VarG);
                com.google.gson.b.k(sb, recyclerView.w());
                return;
            }
            p0VarG.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public com.google.android.datatransport.runtime.i q() {
        String strConcat = ((String) this.y) == null ? " backendName" : "";
        if (((com.google.android.datatransport.d) this.A) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new com.google.android.datatransport.runtime.i((String) this.y, (byte[]) this.z, (com.google.android.datatransport.d) this.A);
        }
        net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(strConcat));
        return null;
    }

    public String r(String str, long j, int i, long j2) {
        ArrayList arrayList = (ArrayList) this.A;
        ArrayList arrayList2 = (ArrayList) this.z;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) this.y;
            if (i2 >= size) {
                sb.append((String) arrayList3.get(arrayList2.size()));
                return sb.toString();
            }
            sb.append((String) arrayList3.get(i2));
            if (((Integer) arrayList2.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) arrayList2.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j)));
            } else if (((Integer) arrayList2.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Integer.valueOf(i)));
            } else if (((Integer) arrayList2.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j2)));
            }
            i2++;
        }
    }

    public boolean s(androidx.compose.ui.node.f0 f0Var) {
        return !(f0Var.F == null) && (((androidx.compose.ui.node.v1) ((com.app.mlounge.data.music.e) this.y).y).contains(f0Var) || ((androidx.compose.ui.node.v1) ((com.app.mlounge.data.music.e) this.z).y).contains(f0Var));
    }

    public String toString() {
        switch (this.e) {
            case 23:
                String str = (String) this.A;
                String str2 = (String) this.z;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.y;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            case 24:
                return ((y2) this.z).toString() + ", hidden list:" + ((ArrayList) this.A).size();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        androidx.recyclerview.widget.p0 p0VarG;
        int iG = G(i);
        ((y2) this.z).J(iG);
        RecyclerView recyclerView = ((androidx.recyclerview.widget.u) this.y).a;
        View childAt = recyclerView.getChildAt(iG);
        if (childAt != null && (p0VarG = RecyclerView.G(childAt)) != null) {
            if (p0VarG.j() && !p0VarG.o()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(p0VarG);
                com.google.gson.b.k(sb, recyclerView.w());
                return;
            }
            p0VarG.a(LibretroCore.SCREEN_WIDTH);
        }
        recyclerView.detachViewFromParent(iG);
    }

    public Object v() {
        long jB = androidx.compose.runtime.internal.k.b();
        if (jB == androidx.compose.runtime.internal.n.a) {
            return this.A;
        }
        androidx.compose.runtime.internal.m mVar = (androidx.compose.runtime.internal.m) ((AtomicReference) this.y).get();
        int iA = mVar.a(jB);
        if (iA >= 0) {
            return mVar.c[iA];
        }
        return null;
    }

    public androidx.compose.ui.graphics.r w() {
        return ((androidx.compose.ui.graphics.drawscope.b) this.A).e.c;
    }

    public View x(int i) {
        return ((androidx.recyclerview.widget.u) this.y).a.getChildAt(G(i));
    }

    public int y() {
        return ((androidx.recyclerview.widget.u) this.y).a.getChildCount() - ((ArrayList) this.A).size();
    }

    public ColorStateList z(int i) {
        int resourceId;
        ColorStateList colorStateListT;
        TypedArray typedArray = (TypedArray) this.z;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListT = org.jsoup.helper.n.t((Context) this.y, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListT;
    }

    @Override // androidx.core.view.inputmethod.g
    public void h() {
    }

    public /* synthetic */ c2(int i, boolean z) {
        this.e = i;
    }

    public c2(androidx.compose.runtime.r1 r1Var) {
        this.e = 2;
        this.y = new androidx.compose.runtime.internal.a(0);
        this.z = new androidx.compose.runtime.internal.c();
        this.A = new androidx.activity.compose.f(14, this, r1Var);
    }

    public c2(ArrayList arrayList) {
        this.e = 20;
        this.y = Collections.unmodifiableList(new ArrayList(arrayList));
        this.z = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            androidx.media3.extractor.text.webvtt.c cVar = (androidx.media3.extractor.text.webvtt.c) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.z;
            jArr[i2] = cVar.b;
            jArr[i2 + 1] = cVar.c;
        }
        long[] jArr2 = (long[]) this.z;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.A = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public c2(androidx.recyclerview.widget.u uVar) {
        this.e = 24;
        this.y = uVar;
        this.z = new y2();
        this.A = new ArrayList();
    }

    public c2(String str) {
        this.e = 21;
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.m = androidx.media3.common.i0.p("video/mp2t");
        qVar.n = androidx.media3.common.i0.p(str);
        this.y = new androidx.media3.common.r(qVar);
    }

    public c2(View view) {
        this.e = 7;
        this.y = view;
        this.z = kotlin.a.c(kotlin.i.y, new androidx.compose.animation.z(this, 12));
        this.A = new com.google.firebase.platforminfo.c(view);
    }

    public c2(androidx.media3.extractor.q qVar) {
        this.e = 19;
        this.y = qVar;
    }

    public c2(androidx.compose.ui.graphics.drawscope.b bVar) {
        this.e = 5;
        this.A = bVar;
        this.y = new com.google.firebase.platforminfo.c(this);
    }

    public c2(Context context, TypedArray typedArray) {
        this.e = 0;
        this.y = context;
        this.z = typedArray;
    }

    public c2(androidx.constraintlayout.core.widgets.e eVar) {
        this.e = 12;
        this.y = new ArrayList();
        this.z = new androidx.constraintlayout.core.widgets.analyzer.b();
        this.A = eVar;
    }

    public c2(com.google.firebase.messaging.o oVar, com.google.firebase.heartbeatinfo.e eVar, androidx.emoji2.text.d dVar, Set set) {
        this.e = 14;
        this.y = eVar;
        this.z = oVar;
        this.A = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            T(str, 0, str.length(), 1, true, new androidx.emoji2.text.r(str));
        }
    }

    public c2(androidx.media3.common.audio.m[] mVarArr) {
        this.e = 16;
        androidx.media3.exoplayer.audio.s0 s0Var = new androidx.media3.exoplayer.audio.s0();
        androidx.media3.common.audio.s sVar = new androidx.media3.common.audio.s();
        sVar.c = 1.0f;
        sVar.d = 1.0f;
        androidx.media3.common.audio.j jVar = androidx.media3.common.audio.j.e;
        sVar.e = jVar;
        sVar.f = jVar;
        sVar.g = jVar;
        sVar.h = jVar;
        ByteBuffer byteBuffer = androidx.media3.common.audio.m.a;
        sVar.k = byteBuffer;
        sVar.l = byteBuffer;
        sVar.b = -1;
        androidx.media3.common.audio.m[] mVarArr2 = new androidx.media3.common.audio.m[mVarArr.length + 2];
        this.y = mVarArr2;
        System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
        this.z = s0Var;
        this.A = sVar;
        mVarArr2[mVarArr.length] = s0Var;
        mVarArr2[mVarArr.length + 1] = sVar;
    }

    public c2(androidx.compose.ui.text.font.u uVar, c2 c2Var) {
        this.e = 9;
        this.y = uVar;
        this.z = c2Var;
        this.A = uVar.e;
    }

    public /* synthetic */ c2(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public c2(androidx.media3.exoplayer.g gVar, androidx.media3.exoplayer.analytics.k kVar) {
        this.e = 15;
        this.A = gVar;
        this.y = new HashMap();
        this.z = kVar;
    }

    public c2(androidx.media3.ui.v vVar, View view, ViewGroup viewGroup) {
        this.e = 22;
        this.A = vVar;
        this.y = view;
        this.z = viewGroup;
    }

    public c2(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.e = 18;
        this.z = arrayDeque;
        this.y = bufferedReader;
    }
}
