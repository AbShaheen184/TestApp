package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.app.mlounge.emulator.LibretroCore;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements androidx.media3.extractor.i {
    public Object A;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    public x(kotlin.ranges.d dVar, androidx.compose.foundation.lazy.layout.m mVar) {
        Object hVar;
        this.e = 2;
        x xVarK = mVar.k();
        int i = dVar.e;
        if (i < 0) {
            androidx.compose.foundation.internal.b.c("negative nearestRange.first");
        }
        int iMin = Math.min(dVar.y, xVarK.y - 1);
        if (iMin < i) {
            androidx.collection.f0 f0Var = androidx.collection.t0.a;
            f0Var.getClass();
            this.z = f0Var;
            this.A = new Object[0];
            this.y = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.A = new Object[i2];
        this.y = i;
        androidx.collection.f0 f0Var2 = new androidx.collection.f0(i2);
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) xVarK.z;
        if (i < 0 || i >= xVarK.y) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Index ", i, ", size ");
            sbV.append(xVarK.y);
            androidx.compose.foundation.internal.b.e(sbV.toString());
        }
        if (iMin < 0 || iMin >= xVarK.y) {
            StringBuilder sbV2 = androidx.privacysandbox.ads.adservices.java.internal.a.v("Index ", iMin, ", size ");
            sbV2.append(xVarK.y);
            androidx.compose.foundation.internal.b.e(sbV2.toString());
        }
        if (iMin < i) {
            androidx.compose.foundation.internal.b.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iE = androidx.compose.foundation.lazy.layout.m.e(i, bVar);
        int i3 = ((androidx.compose.foundation.lazy.layout.j) bVar.e[iE]).a;
        while (i3 <= iMin) {
            androidx.compose.foundation.lazy.layout.j jVar = (androidx.compose.foundation.lazy.layout.j) bVar.e[iE];
            kotlin.jvm.functions.l key = jVar.c.getKey();
            int i4 = jVar.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (jVar.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        hVar = key.invoke(Integer.valueOf(iMax - i4));
                        hVar = hVar == null ? new androidx.compose.foundation.lazy.layout.h(iMax) : hVar;
                    }
                    f0Var2.g(iMax, hVar);
                    ((Object[]) this.A)[iMax - this.y] = hVar;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += jVar.b;
            iE++;
        }
        this.z = f0Var2;
    }

    public static com.google.android.material.internal.b p() {
        return new com.google.android.material.internal.b(com.grack.nanojson.c.class);
    }

    @Override // androidx.media3.extractor.i
    public androidx.media3.extractor.h a(androidx.media3.extractor.o oVar, long j) {
        long j2;
        long position = oVar.getPosition();
        int iMin = (int) Math.min(112800, oVar.getLength() - position);
        androidx.media3.common.util.w wVar = (androidx.media3.common.util.w) this.A;
        wVar.J(iMin);
        oVar.x(wVar.a, 0, iMin);
        int i = wVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (wVar.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = wVar.a;
            int i2 = wVar.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jH = okhttp3.internal.platform.android.g.H(wVar, i2, this.y);
            if (jH != j2) {
                long jB = ((androidx.media3.common.util.h0) this.z).b(jH);
                if (jB > j) {
                    return j5 == j2 ? new androidx.media3.extractor.h(jB, position, -1) : new androidx.media3.extractor.h(-9223372036854775807L, position + j4, 0);
                }
                j5 = jB;
                if (100000 + j5 > j) {
                    return new androidx.media3.extractor.h(-9223372036854775807L, position + ((long) i2), 0);
                }
                j4 = i2;
            }
            wVar.M(i3);
            j3 = i3;
        }
        return j5 != j2 ? new androidx.media3.extractor.h(j5, position + j3, -2) : androidx.media3.extractor.h.d;
    }

    public void b(int i, androidx.compose.foundation.lazy.layout.r rVar) {
        if (i < 0) {
            androidx.compose.foundation.internal.b.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        androidx.compose.foundation.lazy.layout.j jVar = new androidx.compose.foundation.lazy.layout.j(this.y, i, rVar);
        this.y += i;
        ((androidx.compose.runtime.collection.b) this.z).b(jVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:114:0x0156  */
    /* JADX WARN: Code duplicated, block: B:127:0x0170  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c  */
    public int c(boolean z, boolean z2) throws com.grack.nanojson.d {
        int iA;
        int i;
        Object string;
        boolean z3;
        char c;
        char c2;
        char c3;
        char c4;
        int i2;
        int i3;
        boolean z4;
        com.grack.nanojson.f fVar = (com.grack.nanojson.f) this.A;
        StringBuilder sb = fVar.k;
        if (z2) {
            fVar.g--;
        }
        char[] cArr = fVar.i;
        do {
            iA = fVar.a();
        } while (com.grack.nanojson.f.h(iA));
        int i4 = fVar.g;
        fVar.e = ((fVar.c + i4) - fVar.b) - fVar.d;
        int i5 = 0;
        if (iA != -1) {
            char c5 = 'A';
            char c6 = 't';
            char c7 = 'n';
            char c8 = 'f';
            char c9 = '\'';
            char c10 = '\"';
            if (iA == 34 || iA == 39) {
                sb.setLength(0);
                loop5: while (true) {
                    int iF = fVar.f(LibretroCore.SCREEN_WIDTH);
                    if (iF == 0) {
                        throw fVar.e(null, "String was not terminated before end of input", true);
                    }
                    int i6 = 0;
                    while (i6 < iF) {
                        char cJ = fVar.j();
                        if (cJ == iA) {
                            sb.append(cArr, (fVar.g - i6) - 1, i6);
                            break loop5;
                        }
                        char c11 = '\\';
                        if (cJ != '\\') {
                            i6++;
                            c5 = 'A';
                            c6 = 't';
                        } else {
                            sb.append(cArr, (fVar.g - i6) - 1, i6);
                            fVar.g--;
                            loop7: while (true) {
                                int iF2 = fVar.f(LibretroCore.SCREEN_WIDTH);
                                if (iF2 == 0) {
                                    throw fVar.e(null, "String was not terminated before end of input", true);
                                }
                                int i7 = fVar.g + iF2;
                                while (true) {
                                    int i8 = fVar.g;
                                    if (i8 < i7) {
                                        char cJ2 = fVar.j();
                                        if (cJ2 == c10 || cJ2 == c9) {
                                            c = c8;
                                            c2 = c7;
                                            if (cJ2 == iA) {
                                                break loop5;
                                            }
                                            sb.append(cJ2);
                                        } else if (cJ2 != c11) {
                                            sb.append(cJ2);
                                            c = c8;
                                            c2 = c7;
                                        } else {
                                            if (i7 - fVar.g < 5) {
                                                int iF3 = fVar.f(5);
                                                int i9 = fVar.g;
                                                int i10 = i9 + iF3;
                                                if (cArr[i9] == 'u' && iF3 < 5) {
                                                    fVar.g = fVar.j;
                                                    throw fVar.e(null, "EOF encountered in the middle of a string escape", false);
                                                }
                                                i7 = i10;
                                            }
                                            int i11 = fVar.g;
                                            fVar.g = i11 + 1;
                                            char c12 = cArr[i11];
                                            if (c12 == c10 || c12 == c9 || c12 == '/' || c12 == c11) {
                                                c3 = 't';
                                                c = 'f';
                                                c2 = 'n';
                                                sb.append(c12);
                                            } else {
                                                if (c12 == 'b') {
                                                    c4 = '\b';
                                                    c3 = 't';
                                                    c = 'f';
                                                } else if (c12 != 'f') {
                                                    c2 = 'n';
                                                    if (c12 == 'n') {
                                                        c4 = '\n';
                                                        c3 = 't';
                                                        c = 'f';
                                                        sb.append(c4);
                                                    } else if (c12 != 'r') {
                                                        c3 = 't';
                                                        if (c12 == 't') {
                                                            c = 'f';
                                                            sb.append('\t');
                                                        } else {
                                                            if (c12 != 'u') {
                                                                throw fVar.e(null, "Invalid escape: \\" + c12, false);
                                                            }
                                                            int i12 = 0;
                                                            int i13 = 0;
                                                            while (i12 < 4) {
                                                                int i14 = i13 << 4;
                                                                int i15 = fVar.g;
                                                                fVar.g = i15 + 1;
                                                                char c13 = cArr[i15];
                                                                if (c13 < '0' || c13 > '9') {
                                                                    if (c13 >= 'A' && c13 <= 'F') {
                                                                        i3 = c13 - '7';
                                                                    } else {
                                                                        if (c13 < 'a' || c13 > 'f') {
                                                                            StringBuilder sb2 = new StringBuilder("Expected unicode hex escape character: ");
                                                                            sb2.append(c13);
                                                                            sb2.append(" (");
                                                                            sb2.append((int) c13);
                                                                            sb2.append(")");
                                                                            throw fVar.e(null, sb2.toString(), false);
                                                                        }
                                                                        i2 = i14 | (c13 - 'W');
                                                                    }
                                                                    i12++;
                                                                    i13 = i2;
                                                                } else {
                                                                    i3 = c13 - '0';
                                                                }
                                                                i2 = i14 | i3;
                                                                i12++;
                                                                i13 = i2;
                                                            }
                                                            c = 'f';
                                                            sb.append((char) i13);
                                                        }
                                                    } else {
                                                        c3 = 't';
                                                        c = 'f';
                                                        c4 = '\r';
                                                        sb.append(c4);
                                                    }
                                                } else {
                                                    c = 'f';
                                                    c4 = '\f';
                                                    c3 = 't';
                                                }
                                                c2 = 'n';
                                                sb.append(c4);
                                            }
                                        }
                                        c7 = c2;
                                        c10 = '\"';
                                        c9 = '\'';
                                        c8 = c;
                                        c11 = '\\';
                                    } else {
                                        char c14 = c8;
                                        char c15 = c7;
                                        int i16 = fVar.j;
                                        if (i8 > i16) {
                                            fVar.g = i16;
                                            throw fVar.e(null, "EOF encountered in the middle of a string escape", false);
                                        }
                                        c7 = c15;
                                        c10 = '\"';
                                        c9 = '\'';
                                        c8 = c14;
                                        c11 = '\\';
                                    }
                                }
                            }
                        }
                    }
                    sb.append(cArr, fVar.g - iF, iF);
                    c6 = c6;
                    c7 = c7;
                    c8 = c8;
                    c10 = '\"';
                    c9 = '\'';
                }
                fVar.g();
                i = 8;
            } else if (iA == 91) {
                i = 11;
            } else if (iA == 93) {
                i = 4;
            } else if (iA == 102) {
                try {
                    fVar.b((char) iA, com.grack.nanojson.f.n);
                    i = 7;
                } catch (com.grack.nanojson.d e) {
                    if (!z) {
                        throw e;
                    }
                    fVar.g = i4 - 1;
                    fVar.c();
                    i = 12;
                }
            } else if (iA == 110) {
                try {
                    fVar.b((char) iA, com.grack.nanojson.f.o);
                    i = 5;
                } catch (com.grack.nanojson.d e2) {
                    if (!z) {
                        throw e2;
                    }
                    fVar.g = i4 - 1;
                    fVar.c();
                    i = 12;
                }
            } else if (iA == 116) {
                try {
                    fVar.b((char) iA, com.grack.nanojson.f.m);
                    i = 6;
                } catch (com.grack.nanojson.d e3) {
                    if (!z) {
                        throw e3;
                    }
                    fVar.g = i4 - 1;
                    fVar.c();
                    i = 12;
                }
            } else if (iA == 123) {
                i = 10;
            } else if (iA != 125) {
                switch (iA) {
                    case Token.CALL /* 43 */:
                    case Token.STRING /* 46 */:
                        throw fVar.e(null, "Numbers may not start with '" + ((char) iA) + "'", true);
                    case Token.NAME /* 44 */:
                        i = 1;
                        break;
                    default:
                        switch (iA) {
                            case Token.THIS /* 48 */:
                            case Token.FALSE /* 49 */:
                            case Token.TRUE /* 50 */:
                            case Token.SHEQ /* 51 */:
                            case Token.SHNE /* 52 */:
                            case Token.REGEXP /* 53 */:
                            case Token.BINDNAME /* 54 */:
                            case Token.THROW /* 55 */:
                            case Token.RETHROW /* 56 */:
                            case Token.IN /* 57 */:
                                break;
                            case Token.INSTANCEOF /* 58 */:
                                i = 2;
                                break;
                            default:
                                if (!z) {
                                    if ((iA >= 65 && iA <= 90) || (iA >= 97 && iA <= 122)) {
                                        throw fVar.d((char) iA, null, 0);
                                    }
                                    throw fVar.e(null, "Unexpected character: " + ((char) iA), true);
                                }
                                fVar.g = i4 - 1;
                                fVar.c();
                                i = 12;
                                break;
                                break;
                        }
                    case Token.NUMBER /* 45 */:
                        char c16 = (char) iA;
                        sb.setLength(0);
                        sb.append(c16);
                        fVar.l = false;
                        byte b = c16 == '-' ? (byte) 1 : c16 == '0' ? (byte) 3 : (byte) 2;
                        while (true) {
                            int iF4 = fVar.f(LibretroCore.SCREEN_WIDTH);
                            if (iF4 != 0) {
                                int i17 = i5;
                                while (true) {
                                    if (i17 < iF4) {
                                        char c17 = cArr[fVar.g];
                                        if ((c17 >= '0' && c17 <= '9') || c17 == 'e' || c17 == 'E' || c17 == '.' || c17 == '+' || c17 == '-') {
                                            switch (b) {
                                                case 1:
                                                    if (c17 == '0') {
                                                        b = 3;
                                                    } else if (c17 > '0' && c17 <= '9') {
                                                        b = 2;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 2:
                                                case 3:
                                                    z4 = true;
                                                    if (c17 >= '0' && c17 <= '9' && b == 2) {
                                                        b = 2;
                                                    } else if (c17 == '.') {
                                                        fVar.l = true;
                                                        b = 4;
                                                    } else if (c17 == 'e' || c17 == 'E') {
                                                        fVar.l = z4;
                                                        b = 6;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 4:
                                                case 5:
                                                    if (c17 >= '0' && c17 <= '9') {
                                                        b = 5;
                                                    } else if ((c17 == 'e' || c17 == 'E') && b == 5) {
                                                        z4 = true;
                                                        fVar.l = z4;
                                                        b = 6;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 6:
                                                case 7:
                                                    if (c17 == '+' || (c17 == '-' && b == 6)) {
                                                        b = 7;
                                                    } else if (c17 >= '0' && c17 <= '9') {
                                                        b = 8;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 8:
                                                    if (c17 >= '0' && c17 <= '9') {
                                                        b = 8;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                default:
                                                    b = -1;
                                                    break;
                                            }
                                            sb.append(c17);
                                            fVar.g++;
                                            if (b == -1) {
                                                throw fVar.e(null, "Malformed number: " + ((Object) sb), true);
                                            }
                                            i17++;
                                            i5 = 0;
                                        }
                                    }
                                }
                            }
                        }
                        if (b != 2 && b != 3 && b != 5 && b != 8) {
                            throw fVar.e(null, "Malformed number: " + ((Object) sb), true);
                        }
                        if (b == 3 && c16 == '-') {
                            fVar.l = true;
                        }
                        fVar.g();
                        i = 9;
                        break;
                        break;
                }
            } else {
                i = 3;
            }
        } else {
            i = 0;
        }
        this.y = i;
        switch (i) {
            case 5:
                this.z = null;
                return this.y;
            case 6:
                string = Boolean.TRUE;
                this.z = string;
                return this.y;
            case 7:
                string = Boolean.FALSE;
                this.z = string;
                return this.y;
            case 8:
            case 12:
                string = sb.toString();
                this.z = string;
                return this.y;
            case 9:
                String string2 = sb.toString();
                try {
                    if (fVar.l) {
                        string = Double.valueOf(Double.parseDouble(string2));
                    } else if (string2.length() == 1) {
                        string = Integer.valueOf(string2.charAt(0) - '0');
                    } else if (string2.length() == 2 && string2.charAt(0) == '-') {
                        string = Integer.valueOf('0' - string2.charAt(1));
                    } else {
                        int i18 = string2.charAt(0) == '-' ? 1 : 0;
                        int length = i18 != 0 ? string2.length() - 1 : string2.length();
                        string = (length < 10 || (length == 10 && string2.charAt(i18) < '2')) ? Integer.valueOf(Integer.parseInt(string2)) : (length < 19 || (length == 19 && string2.charAt(i18) < '9')) ? Long.valueOf(Long.parseLong(string2)) : new BigInteger(string2);
                    }
                    this.z = string;
                    return this.y;
                } catch (NumberFormatException e4) {
                    throw fVar.e(e4, "Malformed number: ".concat(string2), true);
                }
            case 10:
                com.grack.nanojson.c cVar = new com.grack.nanojson.c();
                if (c(true, false) != 3) {
                    do {
                        int i19 = this.y;
                        if (i19 == 5 || i19 == 6 || i19 == 7) {
                            this.z = ((Serializable) this.z).toString();
                        } else if (i19 != 8 && i19 != 12) {
                            throw fVar.e(null, "Expected STRING, got " + this.y, true);
                        }
                        String str = (String) ((Serializable) this.z);
                        if (this.y == 12) {
                            z3 = false;
                            if (c(false, true) != 2) {
                                throw fVar.e(null, "Expected COLON, got " + this.y, true);
                            }
                        } else {
                            z3 = false;
                            if (c(false, false) != 2) {
                                throw fVar.e(null, "Expected COLON, got " + this.y, true);
                            }
                        }
                        c(z3, z3);
                        cVar.put(str, h());
                        if (c(z3, z3) != 3) {
                            if (this.y != 1) {
                                throw fVar.e(null, "Expected a comma or end of the object instead of " + this.y, true);
                            }
                        }
                    } while (c(true, z3) != 3);
                    throw fVar.e(null, "Trailing object found in array", true);
                }
                this.z = cVar;
                this.y = 10;
                return 10;
            case 11:
                com.grack.nanojson.b bVar = new com.grack.nanojson.b();
                boolean z5 = false;
                if (c(false, false) != 4) {
                    while (true) {
                        bVar.add(h());
                        if (this.y == 12) {
                            throw fVar.e(null, "Semi-string is not allowed in array", true);
                        }
                        if (c(z5, z5) != 4) {
                            if (this.y != 1) {
                                throw fVar.e(null, "Expected a comma or end of the array instead of " + this.y, true);
                            }
                            if (c(z5, z5) == 4) {
                                throw fVar.e(null, "Trailing comma found in array", true);
                            }
                            z5 = false;
                        }
                    }
                }
                this.z = bVar;
                this.y = 11;
                return 11;
            default:
                return this.y;
        }
    }

    public void d() {
        a2 a2Var;
        ImageView imageView = (ImageView) this.z;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            t0.a(drawable);
        }
        if (drawable == null || (a2Var = (a2) this.A) == null) {
            return;
        }
        s.d(drawable, a2Var, imageView.getDrawableState());
    }

    public com.google.common.collect.f1 e(boolean z) {
        com.google.common.collect.i0 i0Var;
        com.google.common.collect.i0 i0Var2;
        if (z && (i0Var2 = (com.google.common.collect.i0) this.A) != null) {
            throw i0Var2.a();
        }
        com.google.common.collect.f1 f1VarC = com.google.common.collect.f1.c(this.y, (Object[]) this.z, this);
        if (!z || (i0Var = (com.google.common.collect.i0) this.A) == null) {
            return f1VarC;
        }
        throw i0Var.a();
    }

    public com.google.firebase.installations.remote.b f() {
        if (!"".isEmpty()) {
            net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(""));
            return null;
        }
        String str = (String) this.z;
        return new com.google.firebase.installations.remote.b(this.y, ((Long) this.A).longValue(), str);
    }

    @Override // androidx.media3.extractor.i
    public void g() {
        androidx.media3.common.util.w wVar = (androidx.media3.common.util.w) this.A;
        byte[] bArr = androidx.media3.common.util.j0.b;
        wVar.getClass();
        wVar.K(bArr, bArr.length);
    }

    public Object h() throws com.grack.nanojson.d {
        if (this.y >= 5) {
            return (Serializable) this.z;
        }
        throw ((com.grack.nanojson.f) this.A).e(null, "Expected JSON value, got " + this.y, true);
    }

    public androidx.compose.foundation.lazy.layout.j i(int i) {
        if (i < 0 || i >= this.y) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Index ", i, ", size ");
            sbV.append(this.y);
            androidx.compose.foundation.internal.b.e(sbV.toString());
        }
        androidx.compose.foundation.lazy.layout.j jVar = (androidx.compose.foundation.lazy.layout.j) this.A;
        if (jVar != null) {
            int i2 = jVar.a;
            if (i < jVar.b + i2 && i2 <= i) {
                return jVar;
            }
        }
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.z;
        androidx.compose.foundation.lazy.layout.j jVar2 = (androidx.compose.foundation.lazy.layout.j) bVar.e[androidx.compose.foundation.lazy.layout.m.e(i, bVar)];
        this.A = jVar2;
        return jVar2;
    }

    public Object j(int i) {
        SparseArray sparseArray = (SparseArray) this.z;
        if (this.y == -1) {
            this.y = 0;
        }
        while (true) {
            int i2 = this.y;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.y--;
        }
        while (this.y < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.y + 1)) {
            this.y++;
        }
        return sparseArray.valueAt(this.y);
    }

    public int k(Object obj) {
        androidx.collection.f0 f0Var = (androidx.collection.f0) this.z;
        int iD = f0Var.d(obj);
        if (iD >= 0) {
            return f0Var.c[iD];
        }
        return -1;
    }

    public String l() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.y + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.z)[i2];
            if (obj instanceof kotlinx.serialization.descriptors.e) {
                kotlinx.serialization.descriptors.e eVar = (kotlinx.serialization.descriptors.e) obj;
                boolean zA = kotlin.jvm.internal.l.a(eVar.e(), kotlinx.serialization.descriptors.h.z);
                int[] iArr = (int[]) this.A;
                if (!zA) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(eVar.g(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.A)[i2]);
                    sb.append("]");
                }
            } else if (obj != kotlinx.serialization.json.internal.j.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void m(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.z;
        int i8 = this.y;
        int i9 = i8 + 3;
        this.y = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.z = Arrays.copyOf(jArr, iMax);
            this.A = Arrays.copyOf((long[]) this.A, iMax);
        }
        long[] jArr2 = (long[]) this.z;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (j & androidx.compose.ui.spatial.a.a) | (((long) Math.min((i8 - i11) / 3, 1023)) << 50);
                return;
            }
        }
    }

    public void o(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.z;
        Context context = imageView.getContext();
        int[] iArr = androidx.appcompat.a.e;
        c2 c2VarS = c2.S(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2VarS.z;
        androidx.core.view.s0.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c2VarS.z, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = coil3.network.g.p(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                t0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c2VarS.z(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(t0.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c2VarS.U();
        }
    }

    public void q(Object obj, Object obj2) {
        int i = (this.y + 1) * 2;
        Object[] objArr = (Object[]) this.z;
        if (i > objArr.length) {
            this.z = Arrays.copyOf(objArr, com.google.common.collect.a0.e(objArr.length, i));
        }
        if (obj == null) {
            com.google.gson.b.h(androidx.privacysandbox.ads.adservices.java.internal.a.o(obj2, "null key in entry: null="));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.z;
        int i2 = this.y;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.y = i2 + 1;
    }

    public void r(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.y) * 2;
            Object[] objArr = (Object[]) this.z;
            if (size > objArr.length) {
                this.z = Arrays.copyOf(objArr, com.google.common.collect.a0.e(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            q(entry.getKey(), entry.getValue());
        }
    }

    public void s(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.z;
        int i3 = this.y;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = z ? 1L : 0L;
                jArr[i5] = (j2 * Long.MIN_VALUE) | (8070450532247928831L & j) | (LockFreeTaskQueueCore.FROZEN_MASK * j2);
                return;
            }
        }
    }

    public void t(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.z;
        long[] jArr2 = (long[]) this.A;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.y : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        jArr2[i4] = (androidx.compose.ui.spatial.a.b & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public String toString() {
        switch (this.e) {
            case 14:
                return l();
            case 15:
                StringBuilder sb = new StringBuilder();
                if (((okhttp3.z) this.z) == okhttp3.z.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.y);
                sb.append(' ');
                sb.append((String) this.A);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, kotlin.jvm.functions.r rVar) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.z;
        int i3 = this.y;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                rVar.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public /* synthetic */ x(int i, String str, Object obj, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
        this.A = str;
    }

    public x(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.e = 5;
        this.z = arrayList;
        this.y = i;
        this.A = motionEvent;
        if (arrayList.isEmpty()) {
            net.luminis.tls.engine.impl.c.o("changes cannot be empty");
            throw null;
        }
    }

    public x(ImageView imageView) {
        this.e = 0;
        this.y = 0;
        this.z = imageView;
    }

    public /* synthetic */ x(int i, byte b) {
        this.e = i;
    }

    public x(androidx.media3.exoplayer.hls.playlist.a aVar) {
        this.e = 9;
        this.z = new SparseArray();
        this.A = aVar;
        this.y = -1;
    }

    public x(int i, androidx.media3.common.util.h0 h0Var) {
        this.e = 10;
        this.y = i;
        this.z = h0Var;
        this.A = new androidx.media3.common.util.w();
    }

    public x() {
        this.e = 1;
        this.z = new androidx.compose.runtime.collection.b(new androidx.compose.foundation.lazy.layout.j[16]);
    }

    public x(androidx.media3.datasource.g gVar) {
        this.e = 8;
        androidx.compose.foundation.gestures.z1 z1Var = new androidx.compose.foundation.gestures.z1();
        z1Var.y = new com.google.android.gms.common.internal.k(20);
        this.A = z1Var;
        this.z = gVar;
        this.y = 1;
    }

    public x(androidx.compose.ui.platform.p2 p2Var) {
        this.e = 3;
        this.z = p2Var;
    }

    public x(int i) {
        this.e = 11;
        this.z = new Object[i * 2];
        this.y = 0;
    }
}
