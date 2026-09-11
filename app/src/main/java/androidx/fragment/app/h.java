package androidx.fragment.app;

import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.x;
import androidx.collection.b1;
import androidx.collection.z0;
import androidx.media3.common.util.h0;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.k;
import androidx.media3.common.util.n0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.p;
import androidx.media3.extractor.ts.c0;
import androidx.media3.extractor.ts.d0;
import androidx.media3.extractor.ts.e0;
import androidx.media3.extractor.ts.f0;
import androidx.media3.extractor.ts.z;
import androidx.media3.extractor.y;
import androidx.navigation.s;
import androidx.navigation.t;
import androidx.navigation.v;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.n;
import kotlin.collections.o;
import kotlin.jvm.internal.l;
import kotlin.text.r;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class h implements z {
    public Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    public h(String str, String str2) throws k {
        this.e = 2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.y = iGlCreateProgram;
        androidx.media3.common.util.c.b();
        a(iGlCreateProgram, 35633, str);
        a(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        androidx.media3.common.util.c.c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.B = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.z = new com.google.android.material.shape.g[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.y;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
            ((com.google.android.material.shape.g[]) this.z)[i] = gVar;
            ((HashMap) this.B).put(str3, gVar);
        }
        this.C = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.y, 35718, iArr4, 0);
        this.A = new com.google.firebase.heartbeatinfo.e[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.y;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i8 = 0; i8 < i7; i8++) {
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            com.google.firebase.heartbeatinfo.e eVar = new com.google.firebase.heartbeatinfo.e();
            ((com.google.firebase.heartbeatinfo.e[]) this.A)[i5] = eVar;
            ((HashMap) this.C).put(str4, eVar);
        }
        androidx.media3.common.util.c.b();
    }

    public static boolean E(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean F(d dVar) {
        return dVar == null || dVar.A;
    }

    public static void a(int i, int i2, String str) throws k {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        androidx.media3.common.util.c.c(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        androidx.media3.common.util.c.b();
    }

    public static /* synthetic */ void x(h hVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = hVar.y;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        hVar.w(str, i, str2);
        throw null;
    }

    public t A(String str, boolean z) {
        Object next;
        v vVar;
        t tVar;
        str.getClass();
        z0 z0Var = (z0) this.A;
        z0Var.getClass();
        Iterator it = ((kotlin.sequences.a) kotlin.sequences.k.n(new b1(z0Var, 0))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            tVar = (t) next;
            if (r.I((String) tVar.y.e, str, false)) {
                break;
            }
        } while (tVar.y.g(str) == null);
        t tVar2 = (t) next;
        if (tVar2 != null) {
            return tVar2;
        }
        if (!z || (vVar = ((v) this.z).z) == null) {
            return null;
        }
        h hVar = vVar.C;
        hVar.getClass();
        if (kotlin.text.k.d0(str)) {
            return null;
        }
        return hVar.A(str, true);
    }

    public t B(int i, t tVar, t tVar2, boolean z) {
        v vVar = (v) this.z;
        z0 z0Var = (z0) this.A;
        t tVarB = (t) z0Var.c(i);
        if (tVar2 != null) {
            if (l.a(tVarB, tVar2) && l.a(tVarB.z, tVar2.z)) {
                return tVarB;
            }
            tVarB = null;
        } else if (tVarB != null) {
            return tVarB;
        }
        if (z) {
            Iterator it = ((kotlin.sequences.a) kotlin.sequences.k.n(new b1(z0Var, 0))).iterator();
            do {
                if (!it.hasNext()) {
                    tVarB = null;
                    break;
                }
                t tVar3 = (t) it.next();
                tVarB = (!(tVar3 instanceof v) || tVar3.equals(tVar)) ? null : ((v) tVar3).C.B(i, vVar, tVar2, true);
            } while (tVarB == null);
        }
        if (tVarB != null) {
            return tVarB;
        }
        v vVar2 = vVar.z;
        if (vVar2 == null || vVar2.equals(tVar)) {
            return null;
        }
        v vVar3 = vVar.z;
        vVar3.getClass();
        return vVar3.C.B(i, vVar, tVar2, z);
    }

    public int C(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        x(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public int D(String str) throws k {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.y, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        androidx.media3.common.util.c.b();
        return iGlGetAttribLocation;
    }

    public s G(s sVar, c2 c2Var, boolean z, t tVar) {
        s sVarE;
        v vVar = (v) this.z;
        ArrayList arrayList = new ArrayList();
        Iterator it = vVar.iterator();
        while (true) {
            androidx.navigation.internal.h hVar = (androidx.navigation.internal.h) it;
            sVarE = null;
            if (!hVar.hasNext()) {
                break;
            }
            t tVar2 = (t) hVar.next();
            sVarE = l.a(tVar2, tVar) ? null : tVar2.d(c2Var);
            if (sVarE != null) {
                arrayList.add(sVarE);
            }
        }
        s sVar2 = (s) o.U(arrayList);
        v vVar2 = vVar.z;
        if (vVar2 != null && z && !vVar2.equals(tVar)) {
            sVarE = vVar2.e(c2Var, vVar);
        }
        return (s) o.U(n.N(new s[]{sVar, sVar2, sVarE}));
    }

    public String H(String str) {
        str.getClass();
        int i = this.y;
        try {
            if (h() == 6 && l.a(J(), str)) {
                this.A = null;
                if (h() == 5) {
                    return J();
                }
            }
            return null;
        } finally {
            this.y = i;
            this.A = null;
        }
    }

    public byte I() {
        String str = (String) this.C;
        int i = this.y;
        while (true) {
            int iK = K(i);
            if (iK == -1) {
                this.y = iK;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iK);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.y = iK;
                return kotlinx.serialization.json.internal.i.d(cCharAt);
            }
            i = iK + 1;
        }
    }

    public String J() {
        if (I() != 1) {
            return null;
        }
        String strL = l();
        this.A = strL;
        return strL;
    }

    public int K(int i) {
        if (i < ((String) this.C).length()) {
            return i;
        }
        return -1;
    }

    public int L() {
        char cCharAt;
        int i = this.y;
        if (i == -1) {
            return i;
        }
        String str = (String) this.C;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.y = i;
        return i;
    }

    public boolean M() {
        int iL = L();
        String str = (String) this.C;
        if (iL >= str.length() || iL == -1 || str.charAt(iL) != ',') {
            return false;
        }
        this.y++;
        return true;
    }

    public void N(char c) {
        int i = this.y;
        if (i > 0 && c == '\"') {
            try {
                this.y = i - 1;
                String strM = m();
                this.y = i;
                if (l.a(strM, "null")) {
                    w("Expected string literal but 'null' literal was found", this.y - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.y = i;
                throw th;
            }
        }
        y(kotlinx.serialization.json.internal.i.d(c), true);
        throw null;
    }

    public int b(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.B).append((char) (C(charSequence, i + 3) + (C(charSequence, i) << 12) + (C(charSequence, i + 1) << 8) + (C(charSequence, i + 2) << 4)));
            return i2;
        }
        this.y = i;
        if (i2 < charSequence.length()) {
            return b(charSequence, this.y);
        }
        x(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    @Override // androidx.media3.extractor.ts.z
    public void c(w wVar) {
        h0 h0Var;
        h0 h0Var2;
        SparseArray sparseArray;
        int i;
        androidx.media3.common.util.v vVar;
        char c;
        SparseArray sparseArray2 = (SparseArray) this.A;
        SparseIntArray sparseIntArray = (SparseIntArray) this.B;
        androidx.media3.common.util.v vVar2 = (androidx.media3.common.util.v) this.z;
        c0 c0Var = (c0) this.C;
        SparseArray sparseArray3 = c0Var.h;
        SparseBooleanArray sparseBooleanArray = c0Var.i;
        androidx.compose.foundation.lazy.grid.t tVar = c0Var.f;
        List list = c0Var.c;
        int i2 = c0Var.a;
        if (wVar.z() == 2) {
            if (i2 == 1 || i2 == 2 || c0Var.n == 1) {
                h0Var = (h0) list.get(0);
            } else {
                h0Var = new h0(((h0) list.get(0)).d());
                list.add(h0Var);
            }
            if ((wVar.z() & 128) != 0) {
                wVar.N(1);
                int iG = wVar.G();
                wVar.N(3);
                wVar.k(vVar2.b, 0, 2);
                vVar2.m(0);
                vVar2.o(3);
                c0Var.t = vVar2.g(13);
                wVar.k(vVar2.b, 0, 2);
                vVar2.m(0);
                vVar2.o(4);
                wVar.N(vVar2.g(12));
                if (i2 == 2 && c0Var.r == null) {
                    f0 f0VarA = tVar.a(21, new com.google.android.gms.cloudmessaging.n(21, null, 0, null, j0.b));
                    c0Var.r = f0VarA;
                    if (f0VarA != null) {
                        f0VarA.d(h0Var, c0Var.m, new e0(iG, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int iA = wVar.a();
                while (iA > 0) {
                    wVar.k(vVar2.b, 0, 5);
                    vVar2.m(0);
                    int iG2 = vVar2.g(8);
                    vVar2.o(3);
                    int iG3 = vVar2.g(13);
                    vVar2.o(4);
                    int iG4 = vVar2.g(12);
                    int i3 = wVar.b;
                    int i4 = i3 + iG4;
                    int i5 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int iZ = 0;
                    int i6 = iA;
                    while (true) {
                        if (wVar.b >= i4) {
                            vVar = vVar2;
                            break;
                        }
                        int iZ2 = wVar.z();
                        vVar = vVar2;
                        int iZ3 = wVar.b + wVar.z();
                        if (iZ3 > i4) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (iZ2 == 5) {
                            long jB = wVar.B();
                            if (jB == 1094921523) {
                                i5 = 129;
                            } else if (jB == 1161904947) {
                                i5 = 135;
                            } else if (jB == 1094921524) {
                                i5 = 172;
                            } else if (jB == 1212503619) {
                                i5 = 36;
                            }
                        } else if (iZ2 == 106) {
                            iZ3 = iZ3;
                            i5 = 129;
                        } else if (iZ2 == 122) {
                            i5 = 135;
                            iZ3 = iZ3;
                        } else if (iZ2 == 127) {
                            int iZ4 = wVar.z();
                            if (iZ4 == 21) {
                                i5 = 172;
                            } else if (iZ4 == 14) {
                                i5 = Token.WITH;
                            } else if (iZ4 == 33) {
                                i5 = Token.VOID;
                            }
                        } else if (iZ2 == 123) {
                            i5 = 138;
                        } else if (iZ2 == 10) {
                            strTrim = wVar.x(3, StandardCharsets.UTF_8).trim();
                            iZ = wVar.z();
                        } else if (iZ2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (wVar.b < iZ3) {
                                String strTrim2 = wVar.x(3, StandardCharsets.UTF_8).trim();
                                wVar.z();
                                h0 h0Var3 = h0Var;
                                byte[] bArr = new byte[4];
                                wVar.k(bArr, 0, 4);
                                arrayList2.add(new d0(strTrim2, bArr));
                                h0Var = h0Var3;
                                iZ3 = iZ3;
                                iG = iG;
                            }
                            iZ3 = iZ3;
                            iG = iG;
                            h0Var = h0Var;
                            arrayList = arrayList2;
                            i5 = 89;
                        } else {
                            iZ3 = iZ3;
                            iG = iG;
                            h0Var = h0Var;
                            if (iZ2 == 111) {
                                i5 = 257;
                            }
                        }
                        wVar.N(iZ3 - wVar.b);
                        h0Var = h0Var;
                        vVar2 = vVar;
                        sparseArray3 = sparseArray4;
                        iG = iG;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i7 = iG;
                    h0 h0Var4 = h0Var;
                    wVar.M(i4);
                    com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n(i5, strTrim, iZ, arrayList, Arrays.copyOfRange(wVar.a, i3, i4));
                    if (iG2 == 6 || iG2 == 5) {
                        iG2 = i5;
                    }
                    int i8 = i6 - (iG4 + 5);
                    int i9 = i2 == 2 ? iG2 : iG3;
                    if (sparseBooleanArray.get(i9)) {
                        c = 21;
                    } else {
                        c = 21;
                        f0 f0VarA2 = (i2 == 2 && iG2 == 21) ? c0Var.r : tVar.a(iG2, nVar);
                        if (i2 != 2 || iG3 < sparseIntArray.get(i9, 8192)) {
                            sparseIntArray.put(i9, iG3);
                            sparseArray2.put(i9, f0VarA2);
                        }
                    }
                    iA = i8;
                    h0Var = h0Var4;
                    vVar2 = vVar;
                    sparseArray3 = sparseArray5;
                    iG = i7;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i10 = iG;
                h0 h0Var5 = h0Var;
                int size = sparseIntArray.size();
                int i11 = 0;
                while (i11 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i11);
                    int iValueAt = sparseIntArray.valueAt(i11);
                    sparseBooleanArray.put(iKeyAt, true);
                    c0Var.j.put(iValueAt, true);
                    f0 f0Var = (f0) sparseArray2.valueAt(i11);
                    if (f0Var != null) {
                        if (f0Var != c0Var.r) {
                            i = i10;
                            h0Var2 = h0Var5;
                            f0Var.d(h0Var2, c0Var.m, new e0(i, iKeyAt, 8192));
                        } else {
                            h0Var2 = h0Var5;
                            i = i10;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(iValueAt, f0Var);
                    } else {
                        h0Var2 = h0Var5;
                        sparseArray = sparseArray6;
                        i = i10;
                    }
                    i11++;
                    sparseArray6 = sparseArray;
                    i10 = i;
                    h0Var5 = h0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i2 == 2) {
                    if (c0Var.o) {
                        return;
                    }
                    c0Var.m.o();
                    c0Var.n = 0;
                    c0Var.o = true;
                    return;
                }
                sparseArray7.remove(this.y);
                int i12 = i2 == 1 ? 0 : c0Var.n - 1;
                c0Var.n = i12;
                if (i12 == 0) {
                    c0Var.m.o();
                    c0Var.o = true;
                }
            }
        }
    }

    public boolean e() {
        int i = this.y;
        if (i == -1) {
            return false;
        }
        String str = (String) this.C;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.y = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.y = i;
        return false;
    }

    public void f(int i, String str) {
        String str2 = (String) this.C;
        if (str2.length() - i < str.length()) {
            x(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                x(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.y = str.length() + i;
    }

    public String g() {
        String string;
        StringBuilder sb = (StringBuilder) this.B;
        String str = (String) this.C;
        j('\"');
        int i = this.y;
        int iA0 = kotlin.text.k.a0(str, '\"', i, 4);
        if (iA0 == -1) {
            m();
            y((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iA0) {
            if (str.charAt(i2) == '\\') {
                int iK = this.y;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iK, i2);
                        int iK2 = K(i2 + 1);
                        if (iK2 == -1) {
                            x(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iB = iK2 + 1;
                        char cCharAt2 = str.charAt(iK2);
                        if (cCharAt2 == 'u') {
                            iB = b(str, iB);
                        } else {
                            char c = cCharAt2 < 'u' ? kotlinx.serialization.json.internal.c.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                x(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iK = K(iB);
                        if (iK == -1) {
                            x(this, "Unexpected EOF", iK, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            sb.append((CharSequence) str, iK, i2);
                            iK = K(i2);
                            if (iK == -1) {
                                x(this, "Unexpected EOF", iK, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i2);
                    }
                    i2 = iK;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                if (z) {
                    sb.append((CharSequence) str, iK, i2);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iK, i2).toString();
                }
                this.y = i2 + 1;
                return string;
            }
            i2++;
        }
        this.y = iA0 + 1;
        return str.substring(i, iA0);
    }

    public byte h() {
        String str = (String) this.C;
        int i = this.y;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.y = i2;
                return kotlinx.serialization.json.internal.i.d(cCharAt);
            }
            i = i2;
        }
        this.y = str.length();
        return (byte) 10;
    }

    public byte i(byte b) {
        byte bH = h();
        if (bH == b) {
            return bH;
        }
        y(b, true);
        throw null;
    }

    public void j(char c) {
        int i = this.y;
        if (i == -1) {
            N(c);
            throw null;
        }
        String str = (String) this.C;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.y = i2;
                if (cCharAt == c) {
                    return;
                }
                N(c);
                throw null;
            }
            i = i2;
        }
        this.y = -1;
        N(c);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public long k() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iK = K(L());
        String str = (String) this.C;
        ?? r6 = 0;
        if (iK >= str.length() || iK == -1) {
            x(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iK) == '\"') {
            iK++;
            if (iK == str.length()) {
                x(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iK;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                if (cCharAt == '-' && z4) {
                    if (i == iK) {
                        x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    z2 = z;
                    if (cCharAt != '-') {
                        if (kotlinx.serialization.json.internal.i.d(cCharAt) != 0) {
                            break;
                        }
                        i++;
                        int i2 = cCharAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            x(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * ((long) 10)) + ((long) i2);
                        } else {
                            j3 = (j3 * ((long) 10)) - ((long) i2);
                            if (j3 > 0) {
                                x(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        z = z2;
                    } else {
                        if (i != iK) {
                            x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i++;
                        z = z2;
                        r6 = 0;
                        z5 = true;
                    }
                } else {
                    if (i == iK) {
                        x(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    r6 = 0;
                    z3 = true;
                }
                r6 = 0;
            } else {
                if (i == iK) {
                    x(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r6, 6);
                    throw r6;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iK;
        if (iK == i || (z5 && iK == i - 1)) {
            x(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z2) {
            if (!z6) {
                x(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                x(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i++;
        }
        this.y = i;
        long j4 = j3;
        if (z4) {
            double d = j4;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    coil3.g.a();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                x(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                x(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z5) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        x(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String l() {
        String str = (String) this.A;
        if (str == null) {
            return g();
        }
        str.getClass();
        this.A = null;
        return str;
    }

    public String m() {
        String string;
        StringBuilder sb = (StringBuilder) this.B;
        String str = (String) this.C;
        String str2 = (String) this.A;
        if (str2 != null) {
            str2.getClass();
            this.A = null;
            return str2;
        }
        int iL = L();
        if (iL >= str.length() || iL == -1) {
            x(this, "EOF", iL, null, 4);
            throw null;
        }
        byte bD = kotlinx.serialization.json.internal.i.d(str.charAt(iL));
        if (bD == 1) {
            return l();
        }
        if (bD != 0) {
            x(this, "Expected beginning of the string, but got " + str.charAt(iL), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (kotlinx.serialization.json.internal.i.d(str.charAt(iL)) == 0) {
            iL++;
            if (iL >= str.length()) {
                sb.append((CharSequence) str, this.y, iL);
                int iK = K(iL);
                if (iK == -1) {
                    this.y = iL;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iL = iK;
                z = true;
            }
        }
        int i = this.y;
        if (z) {
            sb.append((CharSequence) str, i, iL);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iL).toString();
        }
        this.y = iL;
        return string;
    }

    public void n(boolean z) {
        for (d dVar : ((androidx.compose.ui.graphics.vector.g) this.B).i()) {
            if (dVar != null && z) {
                dVar.z.n(true);
            }
        }
    }

    public boolean o() {
        if (this.y < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (d dVar : ((androidx.compose.ui.graphics.vector.g) this.B).i()) {
            if (dVar != null && F(dVar) && dVar.z.o()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dVar);
                z = true;
            }
        }
        if (((ArrayList) this.A) != null) {
            for (int i = 0; i < ((ArrayList) this.A).size(); i++) {
                d dVar2 = (d) ((ArrayList) this.A).get(i);
                if (arrayList == null || !arrayList.contains(dVar2)) {
                    dVar2.getClass();
                }
            }
        }
        this.A = arrayList;
        return z;
    }

    public void p(boolean z) {
        for (d dVar : ((androidx.compose.ui.graphics.vector.g) this.B).i()) {
            if (dVar != null && z) {
                dVar.z.p(true);
            }
        }
    }

    public void q(boolean z) {
        for (d dVar : ((androidx.compose.ui.graphics.vector.g) this.B).i()) {
            if (dVar != null && z) {
                dVar.z.q(true);
            }
        }
    }

    public boolean r() {
        if (this.y < 1) {
            return false;
        }
        for (d dVar : ((androidx.compose.ui.graphics.vector.g) this.B).i()) {
            if (dVar != null && dVar.z.r()) {
                return true;
            }
        }
        return false;
    }

    public void s() {
        if (this.y < 1) {
            return;
        }
        for (d dVar : ((androidx.compose.ui.graphics.vector.g) this.B).i()) {
            if (dVar != null) {
                dVar.z.s();
            }
        }
    }

    public void t(boolean z) {
        for (d dVar : ((androidx.compose.ui.graphics.vector.g) this.B).i()) {
            if (dVar != null && z) {
                dVar.z.t(true);
            }
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            case 6:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.C);
                sb2.append("', currentPosition=");
                return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb2, this.y, ')');
            default:
                return super.toString();
        }
    }

    public boolean u() {
        boolean z = false;
        if (this.y < 1) {
            return false;
        }
        for (d dVar : ((androidx.compose.ui.graphics.vector.g) this.B).i()) {
            if (dVar != null && F(dVar) && dVar.z.u()) {
                z = true;
            }
        }
        return z;
    }

    public void v() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public void w(String str, int i, String str2) {
        str2.getClass();
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbD = androidx.constraintlayout.core.g.d(str, " at path: ");
        sbD.append(((x) this.z).l());
        sbD.append(strConcat);
        throw kotlinx.serialization.json.internal.i.b(i, (String) this.C, sbD.toString());
    }

    public void y(byte b, boolean z) {
        String str = (String) this.C;
        String strK = kotlinx.serialization.json.internal.i.k(b);
        int i = this.y;
        int i2 = z ? i - 1 : i;
        x(this, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Expected ", strK, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public t z(int i) {
        return B(i, (v) this.z, null, false);
    }

    @Override // androidx.media3.extractor.ts.z
    public void d(h0 h0Var, p pVar, e0 e0Var) {
    }

    public h(v vVar) {
        this.e = 5;
        this.z = vVar;
        this.A = new z0(0);
    }

    public h(int i, String str, TreeMap treeMap, String str2, String str3) {
        this.e = 7;
        this.y = i;
        this.z = str;
        this.A = treeMap;
        this.B = str2 == null ? "" : str2;
        this.C = str3;
    }

    public h(int i) {
        this.e = i;
        switch (i) {
            case 1:
                break;
            default:
                this.z = new ArrayList();
                this.B = new androidx.compose.ui.graphics.vector.g(1);
                new androidx.activity.d0(this, 2);
                this.C = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new CopyOnWriteArrayList();
                new CopyOnWriteArrayList();
                final int i2 = 0;
                new androidx.core.util.a(this) { // from class: androidx.fragment.app.e
                    public final /* synthetic */ h b;

                    {
                        this.b = this;
                    }

                    @Override // androidx.core.util.a
                    public final void accept(Object obj) {
                        switch (i2) {
                            case 0:
                                this.b.n(false);
                                break;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    this.b.p(false);
                                }
                                break;
                            case 2:
                                boolean z = ((androidx.core.app.c) obj).a;
                                this.b.q(false);
                                break;
                            default:
                                boolean z2 = ((androidx.core.app.k) obj).a;
                                this.b.t(false);
                                break;
                        }
                    }
                };
                final int i3 = 1;
                new androidx.core.util.a(this) { // from class: androidx.fragment.app.e
                    public final /* synthetic */ h b;

                    {
                        this.b = this;
                    }

                    @Override // androidx.core.util.a
                    public final void accept(Object obj) {
                        switch (i3) {
                            case 0:
                                this.b.n(false);
                                break;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    this.b.p(false);
                                }
                                break;
                            case 2:
                                boolean z = ((androidx.core.app.c) obj).a;
                                this.b.q(false);
                                break;
                            default:
                                boolean z2 = ((androidx.core.app.k) obj).a;
                                this.b.t(false);
                                break;
                        }
                    }
                };
                final int i4 = 2;
                new androidx.core.util.a(this) { // from class: androidx.fragment.app.e
                    public final /* synthetic */ h b;

                    {
                        this.b = this;
                    }

                    @Override // androidx.core.util.a
                    public final void accept(Object obj) {
                        switch (i4) {
                            case 0:
                                this.b.n(false);
                                break;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    this.b.p(false);
                                }
                                break;
                            case 2:
                                boolean z = ((androidx.core.app.c) obj).a;
                                this.b.q(false);
                                break;
                            default:
                                boolean z2 = ((androidx.core.app.k) obj).a;
                                this.b.t(false);
                                break;
                        }
                    }
                };
                final int i5 = 3;
                new androidx.core.util.a(this) { // from class: androidx.fragment.app.e
                    public final /* synthetic */ h b;

                    {
                        this.b = this;
                    }

                    @Override // androidx.core.util.a
                    public final void accept(Object obj) {
                        switch (i5) {
                            case 0:
                                this.b.n(false);
                                break;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    this.b.p(false);
                                }
                                break;
                            case 2:
                                boolean z = ((androidx.core.app.c) obj).a;
                                this.b.q(false);
                                break;
                            default:
                                boolean z2 = ((androidx.core.app.k) obj).a;
                                this.b.t(false);
                                break;
                        }
                    }
                };
                new f(this);
                this.y = -1;
                new ArrayDeque();
                new androidx.appcompat.widget.z0(this, 7);
                break;
        }
    }

    public h(String str) {
        this.e = 6;
        str.getClass();
        x xVar = new x(14, (byte) 0);
        xVar.z = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        xVar.A = iArr;
        xVar.y = -1;
        this.z = xVar;
        this.B = new StringBuilder();
        this.C = str;
    }

    public h(y yVar, androidx.media3.exoplayer.dash.manifest.t tVar, byte[] bArr, n0[] n0VarArr, int i) {
        this.e = 3;
        this.z = yVar;
        this.A = tVar;
        this.B = bArr;
        this.C = n0VarArr;
        this.y = i;
    }

    public h(c0 c0Var, int i) {
        this.e = 4;
        this.C = c0Var;
        this.z = new androidx.media3.common.util.v(new byte[5], 5);
        this.A = new SparseArray();
        this.B = new SparseIntArray();
        this.y = i;
    }
}
