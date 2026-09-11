package androidx.compose.foundation.text.input.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.Choreographer;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.collection.o0;
import androidx.collection.t0;
import androidx.compose.runtime.changelist.k0;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.i2;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.b0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.l0;
import androidx.core.view.d1;
import androidx.emoji2.text.y;
import androidx.emoji2.text.z;
import com.app.mlounge.emulator.LibretroCore;
import io.hopmonsdk.Hopmn;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements androidx.compose.runtime.g, k0, androidx.compose.runtime.saveable.l, androidx.compose.ui.text.android.selection.d, androidx.emoji2.text.p {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public o(int i) {
        this.e = i;
        switch (i) {
            case 9:
                this.y = new LinkedHashMap();
                this.z = new LinkedHashMap();
                break;
            case 10:
                this.y = new o0();
                this.z = new o0();
                break;
            case 17:
                this.y = new androidx.compose.runtime.collection.b(new f0[16]);
                break;
            case 18:
                this.y = new androidx.compose.runtime.collection.b(new Reference[16]);
                this.z = new ReferenceQueue();
                break;
            case 20:
                this.y = new com.google.firebase.heartbeatinfo.e();
                this.z = new androidx.collection.u(16);
                break;
            case 26:
                this.y = Choreographer.getInstance();
                this.z = Looper.myLooper();
                break;
            default:
                this.y = new androidx.compose.ui.input.pointer.util.e(0);
                this.z = new androidx.compose.ui.input.pointer.util.e(0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void k(f0 f0Var) {
        if (f0Var.n0 > 0) {
            if (f0Var.e0.d == b0.B && !f0Var.q() && !f0Var.r() && !f0Var.o0 && f0Var.I()) {
                androidx.compose.ui.q qVar = (androidx.compose.ui.q) f0Var.d0.g;
                if ((qVar.A & LibretroCore.SCREEN_WIDTH) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & LibretroCore.SCREEN_WIDTH) != 0) {
                            ?? E = qVar;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof androidx.compose.ui.node.n) {
                                    androidx.compose.ui.node.n nVar = (androidx.compose.ui.node.n) E;
                                    nVar.u0(androidx.compose.ui.node.k.r(nVar, LibretroCore.SCREEN_WIDTH));
                                } else if ((E.z & LibretroCore.SCREEN_WIDTH) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                    int i = 0;
                                    E = E;
                                    bVar = bVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.z & LibretroCore.SCREEN_WIDTH) != 0) {
                                            i++;
                                            if (i == 1) {
                                                bVar = bVar;
                                                E = qVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                        if ((qVar.A & LibretroCore.SCREEN_WIDTH) == 0) {
                            break;
                        } else {
                            qVar = qVar.C;
                        }
                    }
                }
            }
            f0Var.m0 = false;
            androidx.compose.runtime.collection.b bVarZ = f0Var.z();
            Object[] objArr = bVarZ.e;
            int i2 = bVarZ.z;
            for (int i3 = 0; i3 < i2; i3++) {
                k((f0) objArr[i3]);
            }
        }
    }

    @Override // androidx.compose.runtime.saveable.l
    public Object a(androidx.compose.runtime.saveable.c cVar, Object obj) {
        return ((kotlin.jvm.functions.p) this.y).invoke(cVar, obj);
    }

    @Override // androidx.compose.runtime.saveable.l
    public Object b(Object obj) {
        return ((kotlin.jvm.functions.l) this.z).invoke(obj);
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int c(int i) {
        CharSequence charSequence = (CharSequence) this.y;
        do {
            i = ((androidx.compose.ui.text.android.selection.e) this.z).A(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // androidx.compose.runtime.g
    public void cancel() {
        if (((androidx.compose.runtime.internal.a) this.z).compareAndSet(1, 1)) {
            return;
        }
        ((androidx.compose.foundation.gestures.g) this.y).invoke();
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int d(int i) {
        do {
            i = ((androidx.compose.ui.text.android.selection.e) this.z).N(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.y).charAt(i - 1)));
        return i;
    }

    @Override // androidx.emoji2.text.p
    public Object e() {
        return (androidx.emoji2.text.b0) this.y;
    }

    @Override // androidx.emoji2.text.p
    public boolean f(CharSequence charSequence, int i, int i2, y yVar) {
        if ((yVar.c & 4) > 0) {
            return true;
        }
        if (((androidx.emoji2.text.b0) this.y) == null) {
            this.y = new androidx.emoji2.text.b0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((com.google.firebase.heartbeatinfo.e) this.z).getClass();
        ((androidx.emoji2.text.b0) this.y).setSpan(new z(yVar), i, i2, 33);
        return true;
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int g(int i) {
        do {
            i = ((androidx.compose.ui.text.android.selection.e) this.z).N(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.y).charAt(i)));
        return i;
    }

    @Override // androidx.compose.runtime.changelist.k0
    public List h(Integer num) {
        List listH = ((k0) this.y).h(null);
        i2 i2Var = (i2) this.z;
        int i = i2Var.v;
        return i < 0 ? listH : kotlin.collections.o.X(kotlin.math.a.k(i2Var, num, i, Integer.valueOf(i2Var.E(i, i2Var.b))), listH);
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int i(int i) {
        do {
            i = ((androidx.compose.ui.text.android.selection.e) this.z).A(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.y).charAt(i - 1)));
        return i;
    }

    public androidx.compose.ui.text.input.x j(List list) {
        androidx.compose.ui.text.input.g gVar;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            gVar = null;
            while (i < size) {
                try {
                    androidx.compose.ui.text.input.g gVar2 = (androidx.compose.ui.text.input.g) list.get(i);
                    try {
                        gVar2.a((androidx.compose.ui.text.input.h) this.z);
                        i++;
                        gVar = gVar2;
                    } catch (Exception e2) {
                        e = e2;
                        gVar = gVar2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((androidx.compose.ui.text.android.selection.e) ((androidx.compose.ui.text.input.h) this.z).C).s());
                        sb2.append(", composition=");
                        sb2.append(((androidx.compose.ui.text.input.h) this.z).c());
                        sb2.append(", selection=");
                        androidx.compose.ui.text.input.h hVar = (androidx.compose.ui.text.input.h) this.z;
                        sb2.append((Object) l0.h(d0.b(hVar.y, hVar.z)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        kotlin.collections.o.Q(list, sb, new androidx.compose.ui.text.font.e(1, gVar, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            androidx.compose.ui.text.input.h hVar2 = (androidx.compose.ui.text.input.h) this.z;
            hVar2.getClass();
            androidx.compose.ui.text.g gVar3 = new androidx.compose.ui.text.g(((androidx.compose.ui.text.android.selection.e) hVar2.C).toString());
            androidx.compose.ui.text.input.h hVar3 = (androidx.compose.ui.text.input.h) this.z;
            long jB = d0.b(hVar3.y, hVar3.z);
            l0 l0Var = l0.g(((androidx.compose.ui.text.input.x) this.y).b) ? null : new l0(jB);
            androidx.compose.ui.text.input.x xVar = new androidx.compose.ui.text.input.x(gVar3, l0Var != null ? l0Var.a : d0.b(l0.e(jB), l0.f(jB)), ((androidx.compose.ui.text.input.h) this.z).c());
            this.y = xVar;
            return xVar;
        } catch (Exception e4) {
            gVar = null;
            e = e4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.h] */
    public InputMethodManager l() {
        return (InputMethodManager) this.z.getValue();
    }

    public KeyListener m(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((o) ((com.app.mlounge.data.music.e) this.z).y).getClass();
        if (keyListener instanceof androidx.emoji2.viewsintegration.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new androidx.emoji2.viewsintegration.e(keyListener);
    }

    public q0 n() {
        return (q0) ((h1) this.z).getValue();
    }

    public void o(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.y).getContext().obtainStyledAttributes(attributeSet, androidx.appcompat.a.g, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            s(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void p(androidx.core.provider.g gVar) {
        androidx.core.provider.l lVar = (androidx.core.provider.l) this.z;
        com.google.firebase.platforminfo.c cVar = (com.google.firebase.platforminfo.c) this.y;
        int i = gVar.b;
        if (i != 0) {
            lVar.execute(new androidx.core.provider.a(cVar, i, 0));
        } else {
            lVar.execute(new com.google.common.util.concurrent.l0(2, cVar, gVar.a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void q(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.n nVar = new androidx.constraintlayout.widget.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    androidx.constraintlayout.widget.i iVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (iVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        iVarD.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (iVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        iVarD.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        iVarD = androidx.constraintlayout.widget.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (iVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        iVarD.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (iVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        iVarD.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        iVarD = androidx.constraintlayout.widget.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        iVarD.d.a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (iVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        androidx.constraintlayout.widget.b.a(context, xmlResourceParser, iVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        iVarD = androidx.constraintlayout.widget.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        iVarD.d.g0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (iVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        androidx.constraintlayout.widget.b.a(context, xmlResourceParser, iVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        iVarD = androidx.constraintlayout.widget.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        nVar.c.put(Integer.valueOf(iVarD.a), iVarD);
                                        iVarD = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        nVar.c.put(Integer.valueOf(iVarD.a), iVarD);
                                        iVarD = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        nVar.c.put(Integer.valueOf(iVarD.a), iVarD);
                                        iVarD = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.z).put(identifier, nVar);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.z).put(identifier, nVar);
                return;
            }
        }
    }

    public void r() {
        if (((androidx.compose.ui.input.indirect.b) this.z) != null) {
            this.z = null;
            ((androidx.compose.foundation.j) this.y).S0(true);
        }
    }

    public void s(boolean z) {
        androidx.emoji2.viewsintegration.i iVar = (androidx.emoji2.viewsintegration.i) ((o) ((com.app.mlounge.data.music.e) this.z).y).z;
        if (iVar.z != z) {
            if (iVar.y != null) {
                androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
                androidx.emoji2.viewsintegration.h hVar = iVar.y;
                jVarA.getClass();
                com.google.firebase.b.h(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.z = z;
            if (z) {
                androidx.emoji2.viewsintegration.i.a(iVar.e, androidx.emoji2.text.j.a().c());
            }
        }
    }

    public String toString() {
        switch (this.e) {
            case 22:
                String string = "[ ";
                if (((androidx.constraintlayout.core.h) this.y) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(string);
                        sbN.append(((androidx.constraintlayout.core.h) this.y).E[i]);
                        sbN.append(" ");
                        string = sbN.toString();
                    }
                }
                StringBuilder sbD = androidx.constraintlayout.core.g.d(string, "] ");
                sbD.append((androidx.constraintlayout.core.h) this.y);
                return sbD.toString();
            case 25:
                return "Bounds{lower=" + ((androidx.core.graphics.c) this.y) + " upper=" + ((androidx.core.graphics.c) this.z) + "}";
            case 29:
                StringBuilder sb = new StringBuilder(128);
                sb.append("Receiver{");
                sb.append((Hopmn) this.z);
                sb.append(" filter=");
                sb.append((IntentFilter) this.y);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o(int i, boolean z) {
        this.e = i;
    }

    public o(f0 f0Var, q0 q0Var) {
        this.e = 15;
        this.y = f0Var;
        this.z = androidx.compose.runtime.s.r(q0Var);
    }

    public o(androidx.compose.foundation.gestures.g gVar) {
        this.e = 11;
        this.y = gVar;
        this.z = new androidx.compose.runtime.internal.a(0);
    }

    public o(androidx.constraintlayout.core.f fVar) {
        this.e = 22;
        this.z = fVar;
    }

    public o(EditText editText, int i) {
        this.e = i;
        switch (i) {
            case 28:
                this.y = editText;
                androidx.emoji2.viewsintegration.i iVar = new androidx.emoji2.viewsintegration.i(editText);
                this.z = iVar;
                editText.addTextChangedListener(iVar);
                if (androidx.emoji2.viewsintegration.a.b == null) {
                    synchronized (androidx.emoji2.viewsintegration.a.a) {
                        try {
                            if (androidx.emoji2.viewsintegration.a.b == null) {
                                androidx.emoji2.viewsintegration.a aVar = new androidx.emoji2.viewsintegration.a();
                                try {
                                    androidx.emoji2.viewsintegration.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, androidx.emoji2.viewsintegration.a.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                androidx.emoji2.viewsintegration.a.b = aVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(androidx.emoji2.viewsintegration.a.b);
                return;
            default:
                this.y = editText;
                this.z = new com.app.mlounge.data.music.e(editText);
                return;
        }
    }

    public o(View view) {
        this.e = 0;
        this.y = view;
        this.z = kotlin.a.c(kotlin.i.y, new androidx.activity.w(this, 14));
    }

    public o(androidx.compose.foundation.lazy.layout.x xVar) {
        this.e = 6;
        this.y = xVar;
        androidx.collection.f0 f0Var = t0.a;
        this.z = new androidx.collection.f0();
    }

    public o(WindowInsetsAnimation.Bounds bounds) {
        this.e = 25;
        this.y = d1.g(bounds);
        this.z = d1.f(bounds);
    }

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    public o(androidx.compose.foundation.j jVar) {
        this.e = 3;
        this.y = jVar;
    }
}
