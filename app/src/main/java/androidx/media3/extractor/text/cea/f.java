package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.media3.common.util.v;
import androidx.media3.common.util.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    public final w h = new w();
    public final v i = new v();
    public int j = -1;
    public final int k;
    public final e[] l;
    public e m;
    public List n;
    public List o;
    public v p;
    public int q;

    public f(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = androidx.media3.common.util.f.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new e[8];
        int i2 = 0;
        while (true) {
            e[] eVarArr = this.l;
            if (i2 >= 8) {
                this.m = eVarArr[0];
                return;
            } else {
                eVarArr[i2] = new e();
                i2++;
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.h
    public final i f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new i(list);
    }

    @Override // androidx.media3.extractor.text.cea.h, androidx.media3.decoder.b
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // androidx.media3.extractor.text.cea.h
    public final void g(g gVar) {
        ByteBuffer byteBuffer = gVar.B;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        w wVar = this.h;
        wVar.K(bArrArray, iLimit);
        while (wVar.a() >= 3) {
            int iZ = wVar.z();
            int i = iZ & 3;
            boolean z = (iZ & 4) == 4;
            byte bZ = (byte) wVar.z();
            byte bZ2 = (byte) wVar.z();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (bZ & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            androidx.media3.common.util.c.t("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bZ & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        v vVar = new v(i2, i4);
                        this.p = vVar;
                        byte[] bArr = vVar.b;
                        vVar.e = 1;
                        bArr[0] = bZ2;
                    } else {
                        com.google.android.material.motion.a.f(i == 2);
                        v vVar2 = this.p;
                        if (vVar2 == null) {
                            androidx.media3.common.util.c.f("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = vVar2.b;
                            int i5 = vVar2.e;
                            int i6 = i5 + 1;
                            vVar2.e = i6;
                            bArr2[i5] = bZ;
                            vVar2.e = i5 + 2;
                            bArr2[i6] = bZ2;
                        }
                    }
                    v vVar3 = this.p;
                    if (vVar3.e == (vVar3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.h
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    public final void j() {
        char c;
        boolean z;
        v vVar = this.p;
        if (vVar == null) {
            return;
        }
        int i = 2;
        if (vVar.e != (vVar.d * 2) - 1) {
            androidx.media3.common.util.c.e("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        v vVar2 = this.p;
        byte[] bArr = vVar2.b;
        int i2 = vVar2.e;
        v vVar3 = this.i;
        vVar3.l(bArr, i2);
        boolean z2 = false;
        while (vVar3.b() > 0) {
            int i3 = 3;
            int iG = vVar3.g(3);
            int iG2 = vVar3.g(5);
            if (iG == 7) {
                vVar3.o(i);
                iG = vVar3.g(6);
                if (iG < 7) {
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Invalid extended service number: ", iG, "Cea708Decoder");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    androidx.media3.common.util.c.t("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z2) {
                    this.n = k();
                }
                this.p = null;
            }
            if (iG != this.k) {
                vVar3.p(iG2);
            } else {
                int iE = (iG2 * 8) + vVar3.e();
                while (vVar3.e() < iE) {
                    int iG3 = vVar3.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i3) {
                                    this.n = k();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                androidx.media3.common.util.c.t("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                vVar3.o(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Invalid C0 command: ", iG3, "Cea708Decoder");
                                            } else {
                                                androidx.media3.common.util.c.t("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                vVar3.o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            e eVar = this.m;
                            if (iG3 == 127) {
                                eVar.a((char) 9835);
                            } else {
                                eVar.a((char) (iG3 & 255));
                            }
                            z2 = true;
                        } else {
                            if (iG3 <= 159) {
                                e[] eVarArr = this.l;
                                switch (iG3) {
                                    case 128:
                                    case Token.DEFAULT /* 129 */:
                                    case 130:
                                    case Token.DO /* 131 */:
                                    case Token.FOR /* 132 */:
                                    case Token.BREAK /* 133 */:
                                    case Token.CONTINUE /* 134 */:
                                    case Token.VAR /* 135 */:
                                        z = true;
                                        int i4 = iG3 - 128;
                                        if (this.q != i4) {
                                            this.q = i4;
                                            this.m = eVarArr[i4];
                                        }
                                        break;
                                    case Token.WITH /* 136 */:
                                        z = true;
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (vVar3.f()) {
                                                e eVar2 = eVarArr[8 - i5];
                                                eVar2.a.clear();
                                                eVar2.b.clear();
                                                eVar2.o = -1;
                                                eVar2.p = -1;
                                                eVar2.q = -1;
                                                eVar2.s = -1;
                                                eVar2.u = 0;
                                            }
                                        }
                                        break;
                                    case Token.CATCH /* 137 */:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (vVar3.f()) {
                                                eVarArr[8 - i6].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case Token.FINALLY /* 138 */:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (vVar3.f()) {
                                                eVarArr[8 - i7].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case Token.VOID /* 139 */:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (vVar3.f()) {
                                                e eVar3 = eVarArr[8 - i8];
                                                eVar3.d = !eVar3.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (vVar3.f()) {
                                                eVarArr[8 - i9].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case Token.EMPTY /* 141 */:
                                        vVar3.o(8);
                                        z = true;
                                        break;
                                    case Token.COMPUTED_PROPERTY /* 142 */:
                                        z = true;
                                        break;
                                    case Token.BLOCK /* 143 */:
                                        l();
                                        z = true;
                                        break;
                                    case Token.LABEL /* 144 */:
                                        int i10 = i;
                                        if (this.m.c) {
                                            vVar3.g(4);
                                            vVar3.g(i10);
                                            vVar3.g(i10);
                                            boolean zF = vVar3.f();
                                            boolean zF2 = vVar3.f();
                                            i3 = 3;
                                            vVar3.g(3);
                                            vVar3.g(3);
                                            this.m.e(zF, zF2);
                                            z = true;
                                        } else {
                                            vVar3.o(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case Token.TARGET /* 145 */:
                                        if (this.m.c) {
                                            int iC = e.c(vVar3.g(2), vVar3.g(2), vVar3.g(2), vVar3.g(2));
                                            int iC2 = e.c(vVar3.g(2), vVar3.g(2), vVar3.g(2), vVar3.g(2));
                                            vVar3.o(2);
                                            e.c(vVar3.g(2), vVar3.g(2), vVar3.g(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            vVar3.o(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case Token.LOOP /* 146 */:
                                        if (this.m.c) {
                                            vVar3.o(4);
                                            int iG4 = vVar3.g(4);
                                            vVar3.o(2);
                                            vVar3.g(6);
                                            e eVar4 = this.m;
                                            if (eVar4.u != iG4) {
                                                eVar4.a('\n');
                                            }
                                            eVar4.u = iG4;
                                        } else {
                                            vVar3.o(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case Token.EXPR_VOID /* 147 */:
                                    case Token.EXPR_RESULT /* 148 */:
                                    case Token.JSR /* 149 */:
                                    case 150:
                                    default:
                                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Invalid C1 command: ", iG3, "Cea708Decoder");
                                        z = true;
                                        break;
                                    case Token.TYPEOFNAME /* 151 */:
                                        if (this.m.c) {
                                            int iC3 = e.c(vVar3.g(2), vVar3.g(2), vVar3.g(2), vVar3.g(2));
                                            vVar3.g(2);
                                            e.c(vVar3.g(2), vVar3.g(2), vVar3.g(2), 0);
                                            vVar3.f();
                                            vVar3.f();
                                            vVar3.g(2);
                                            vVar3.g(2);
                                            int iG5 = vVar3.g(2);
                                            vVar3.o(8);
                                            e eVar5 = this.m;
                                            eVar5.n = iC3;
                                            eVar5.k = iG5;
                                        } else {
                                            vVar3.o(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case Token.USE_STACK /* 152 */:
                                    case Token.SETPROP_OP /* 153 */:
                                    case Token.SETELEM_OP /* 154 */:
                                    case Token.LOCAL_BLOCK /* 155 */:
                                    case Token.SET_REF_OP /* 156 */:
                                    case Token.DOTDOT /* 157 */:
                                    case Token.COLONCOLON /* 158 */:
                                    case Token.XML /* 159 */:
                                        int i11 = iG3 - 152;
                                        e eVar6 = eVarArr[i11];
                                        vVar3.o(i);
                                        boolean zF3 = vVar3.f();
                                        vVar3.o(i);
                                        int iG6 = vVar3.g(i3);
                                        boolean zF4 = vVar3.f();
                                        int iG7 = vVar3.g(7);
                                        int iG8 = vVar3.g(8);
                                        int iG9 = vVar3.g(4);
                                        int iG10 = vVar3.g(4);
                                        vVar3.o(i);
                                        vVar3.o(6);
                                        vVar3.o(i);
                                        int iG11 = vVar3.g(3);
                                        int iG12 = vVar3.g(3);
                                        ArrayList arrayList = eVar6.a;
                                        eVar6.c = true;
                                        eVar6.d = zF3;
                                        eVar6.e = iG6;
                                        eVar6.f = zF4;
                                        eVar6.g = iG7;
                                        eVar6.h = iG8;
                                        eVar6.i = iG9;
                                        int i12 = iG10 + 1;
                                        if (eVar6.j != i12) {
                                            eVar6.j = i12;
                                            while (true) {
                                                if (arrayList.size() >= eVar6.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && eVar6.l != iG11) {
                                            eVar6.l = iG11;
                                            int i13 = iG11 - 1;
                                            int i14 = e.B[i13];
                                            boolean z3 = e.A[i13];
                                            int i15 = e.y[i13];
                                            int i16 = e.z[i13];
                                            int i17 = e.x[i13];
                                            eVar6.n = i14;
                                            eVar6.k = i17;
                                        }
                                        if (iG12 != 0 && eVar6.m != iG12) {
                                            eVar6.m = iG12;
                                            int i18 = iG12 - 1;
                                            int i19 = e.D[i18];
                                            int i20 = e.C[i18];
                                            eVar6.e(false, false);
                                            eVar6.f(e.v, e.E[i18]);
                                        }
                                        if (this.q != i11) {
                                            this.q = i11;
                                            this.m = eVarArr[i11];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (iG3 <= 255) {
                                    this.m.a((char) (iG3 & 255));
                                } else {
                                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Invalid base command: ", iG3, "Cea708Decoder");
                                }
                                i = 2;
                                c = 7;
                            }
                            z2 = z;
                            i = 2;
                            c = 7;
                        }
                        c = 7;
                    } else {
                        int iG13 = vVar3.g(8);
                        if (iG13 <= 31) {
                            c = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    vVar3.o(8);
                                } else if (iG13 <= 23) {
                                    vVar3.o(16);
                                } else if (iG13 <= 31) {
                                    vVar3.o(24);
                                }
                            }
                        } else {
                            c = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.m.a(' ');
                                } else if (iG13 == 33) {
                                    this.m.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.m.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.m.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.m.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.m.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.m.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.m.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.m.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case Token.THIS /* 48 */:
                                            this.m.a((char) 9608);
                                            break;
                                        case Token.FALSE /* 49 */:
                                            this.m.a((char) 8216);
                                            break;
                                        case Token.TRUE /* 50 */:
                                            this.m.a((char) 8217);
                                            break;
                                        case Token.SHEQ /* 51 */:
                                            this.m.a((char) 8220);
                                            break;
                                        case Token.SHNE /* 52 */:
                                            this.m.a((char) 8221);
                                            break;
                                        case Token.REGEXP /* 53 */:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case Token.AND /* 118 */:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case Token.INC /* 119 */:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case Token.DOT /* 121 */:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case Token.FUNCTION /* 122 */:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case Token.EXPORT /* 123 */:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case Token.IMPORT /* 124 */:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case Token.IF /* 125 */:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case Token.ELSE /* 126 */:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Invalid G2 character: ", iG13, "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (iG13 > 159) {
                                i = 2;
                                if (iG13 <= 255) {
                                    if (iG13 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Invalid G3 character: ", iG13, "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Invalid extended command: ", iG13, "Cea708Decoder");
                                }
                            } else if (iG13 <= 135) {
                                vVar3.o(32);
                            } else if (iG13 <= 143) {
                                vVar3.o(40);
                            } else if (iG13 <= 159) {
                                i = 2;
                                vVar3.o(2);
                                vVar3.o(vVar3.g(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.n = k();
        }
        this.p = null;
    }

    public final List k() {
        d dVar;
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            e[] eVarArr = this.l;
            e eVar = eVarArr[i];
            if (eVar.c && (!eVar.a.isEmpty() || eVar.b.length() != 0)) {
                e eVar2 = eVarArr[i];
                if (eVar2.d) {
                    ArrayList arrayList2 = eVar2.a;
                    if (!eVar2.c || (arrayList2.isEmpty() && eVar2.b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i3 = eVar2.k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.k);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = eVar2.f;
                        int i4 = eVar2.h;
                        int i5 = eVar2.g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = eVar2.i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = eVar2.n;
                        dVar = new d(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != e.w, i11, eVar2.e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((d) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
