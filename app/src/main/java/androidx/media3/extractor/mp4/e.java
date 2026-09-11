package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.compose.animation.core.u2;
import androidx.media3.common.g0;
import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.exoplayer.source.r0;
import androidx.media3.exoplayer.video.v;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final byte[] a;

    static {
        String str = j0.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(w wVar) {
        int i = wVar.b;
        wVar.N(4);
        if (wVar.m() != 1751411826) {
            i += 4;
        }
        wVar.M(i);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:274:0x0598  */
    /* JADX WARN: Code duplicated, block: B:286:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:292:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:369:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0178  */
    public static void b(w wVar, int i, int i2, int i3, int i4, String str, boolean z, androidx.media3.common.m mVar, androidx.compose.ui.text.android.selection.e eVar, int i5) throws androidx.media3.common.j0 {
        int iG;
        int i6;
        int i7;
        int iG2;
        int iM;
        int i8;
        int i9;
        int i10;
        androidx.media3.common.m mVarA;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        int iD;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean zF;
        int iG3;
        int iG4;
        int i23;
        int i24;
        boolean z2;
        boolean zF2;
        int i25;
        int iG5;
        boolean z3;
        String str3;
        w wVar2 = wVar;
        int iIntValue = i;
        int i26 = i3;
        int[] iArr = androidx.media3.extractor.b.f;
        int[] iArr2 = androidx.media3.extractor.b.d;
        wVar2.M(i2 + 16);
        if (z) {
            iG = wVar2.G();
            wVar2.N(6);
        } else {
            wVar2.N(8);
            iG = 0;
        }
        if (iG == 0 || iG == 1) {
            i6 = 2;
            i7 = 4;
            iG2 = wVar2.G();
            wVar2.N(6);
            int iA = wVar2.A();
            wVar2.M(wVar2.b - 4);
            iM = wVar2.m();
            if (iG == 1) {
                wVar2.N(16);
            }
            i8 = iA;
            i9 = -1;
        } else {
            if (iG != 2) {
                return;
            }
            wVar2.N(16);
            i6 = 2;
            int iRound = (int) Math.round(Double.longBitsToDouble(wVar2.t()));
            int iD2 = wVar2.D();
            wVar2.N(4);
            i7 = 4;
            int iD3 = wVar2.D();
            int iD4 = wVar2.D();
            boolean z4 = (iD4 & 1) != 0;
            boolean z5 = (iD4 & 2) != 0;
            if (z4) {
                if (z5 || iD3 != 32) {
                    i9 = -1;
                } else {
                    i9 = 4;
                }
            } else if (iD3 == 8) {
                i9 = 3;
            } else if (iD3 == 16) {
                i9 = z5 ? 268435456 : 2;
            } else if (iD3 == 24) {
                i9 = z5 ? 1342177280 : 21;
            } else if (iD3 == 32) {
                i9 = z5 ? 1610612736 : 22;
            } else {
                i9 = -1;
            }
            wVar2.N(8);
            i8 = iRound;
            iG2 = iD2;
            iM = 0;
        }
        if (iIntValue == 1767992678) {
            iG2 = -1;
            i8 = -1;
        } else {
            if (iIntValue != 1935764850) {
                i10 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            i8 = i10;
            iG2 = 1;
        }
        int i27 = wVar2.b;
        if (iIntValue == 1701733217) {
            Pair pairH = h(wVar2, i2, i26);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                mVarA = mVar == null ? null : mVar.a(((s) pairH.second).b);
                ((s[]) eVar.d)[i5] = (s) pairH.second;
            } else {
                mVarA = mVar;
            }
            wVar2.M(i27);
        } else {
            mVarA = mVar;
        }
        String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == 1936684916) {
            i9 = i6;
            str2 = "audio/raw";
        } else if (iIntValue == 1953984371) {
            str2 = "audio/raw";
            i9 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i9 == -1) {
                i9 = i6;
            }
            str2 = "audio/raw";
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = "audio/mpeg";
        } else if (iIntValue == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str2 = "audio/alac";
        } else if (iIntValue == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue == 1332770163) {
            str2 = "audio/opus";
        } else if (iIntValue == 1716281667) {
            str2 = "audio/flac";
        } else if (iIntValue == 1835823201) {
            str2 = "audio/true-hd";
        } else {
            str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
        }
        r0 r0VarC = null;
        String strI = null;
        List listS = null;
        v vVar = null;
        while (i27 - i2 < i26) {
            wVar2.M(i27);
            int iM2 = wVar2.m();
            int i28 = i9;
            androidx.media3.extractor.b.b("childAtomSize must be positive", iM2 > 0);
            int iM3 = wVar2.m();
            strI = strI;
            if (iM3 == 1835557187) {
                wVar2.M(i27 + 8);
                wVar2.N(1);
                int iZ = wVar2.z();
                wVar2.N(1);
                String str5 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(iZ)) : String.format("mha1.%02X", Integer.valueOf(iZ));
                int iG6 = wVar2.G();
                byte[] bArr = new byte[iG6];
                String str6 = str5;
                wVar2.k(bArr, 0, iG6);
                strI = str6;
                listS = listS == null ? h0.s(bArr) : h0.t(bArr, (byte[]) listS.get(0));
            } else if (iM3 == 1835557200) {
                wVar2.M(i27 + 8);
                int iZ2 = wVar2.z();
                if (iZ2 > 0) {
                    byte[] bArr2 = new byte[iZ2];
                    wVar2.k(bArr2, 0, iZ2);
                    listS = listS == null ? h0.s(bArr2) : h0.t((byte[]) listS.get(0), bArr2);
                }
                listS = listS;
                strI = strI;
            } else {
                if (iM3 == 1702061171 || (z && iM3 == 2002876005)) {
                    String str7 = str2;
                    listS = listS;
                    int i29 = iM2;
                    int i30 = i27;
                    int i31 = iG2;
                    str4 = str4;
                    i11 = iIntValue;
                    if (iM3 == 1702061171) {
                        i13 = i29;
                        i12 = i30;
                        i27 = i12;
                    } else {
                        i12 = wVar2.b;
                        i27 = i30;
                        androidx.media3.extractor.b.b(null, i12 >= i27);
                        while (true) {
                            i13 = i29;
                            if (i12 - i27 < i13) {
                                wVar2.M(i12);
                                int iM4 = wVar2.m();
                                androidx.media3.extractor.b.b("childAtomSize must be positive", iM4 > 0);
                                if (wVar2.m() != 1702061171) {
                                    i12 += iM4;
                                    i29 = i13;
                                }
                            } else {
                                i12 = -1;
                            }
                        }
                    }
                    if (i12 != -1) {
                        r0VarC = c(i12, wVar2);
                        String str8 = (String) r0VarC.z;
                        byte[] bArr3 = (byte[]) r0VarC.A;
                        if (bArr3 == null) {
                            iM2 = i13;
                        } else if ("audio/vorbis".equals(str8)) {
                            w wVar3 = new w(bArr3);
                            wVar3.N(1);
                            int i32 = 0;
                            while (wVar3.a() > 0 && wVar3.j() == 255) {
                                i32 += 255;
                                wVar3.N(1);
                            }
                            int iZ3 = wVar3.z() + i32;
                            int i33 = 0;
                            while (true) {
                                if (wVar3.a() > 0) {
                                    iM2 = i13;
                                    if (wVar3.j() == 255) {
                                        i33 += 255;
                                        wVar3.N(1);
                                        i13 = iM2;
                                    }
                                } else {
                                    iM2 = i13;
                                }
                            }
                            int iZ4 = wVar3.z() + i33;
                            byte[] bArr4 = new byte[iZ3];
                            int i34 = wVar3.b;
                            System.arraycopy(bArr3, i34, bArr4, 0, iZ3);
                            int i35 = i34 + iZ3 + iZ4;
                            int length = bArr3.length - i35;
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(bArr3, i35, bArr5, 0, length);
                            listS = h0.t(bArr4, bArr5);
                        } else {
                            iM2 = i13;
                            if ("audio/mp4a-latm".equals(str8)) {
                                androidx.media3.extractor.a aVarN = androidx.media3.extractor.b.n(new androidx.media3.common.util.v(bArr3, bArr3.length), false);
                                i8 = aVarN.b;
                                iG2 = aVarN.c;
                                strI = aVarN.a;
                            } else {
                                iG2 = i31;
                                strI = strI;
                            }
                            listS = h0.s(bArr3);
                            str2 = str8;
                        }
                        str2 = str8;
                        iG2 = i31;
                        strI = strI;
                    } else {
                        iM2 = i13;
                        r0VarC = r0VarC;
                        iG2 = i31;
                        strI = strI;
                        str2 = str7;
                    }
                } else if (iM3 == 1651798644) {
                    wVar2.M(i27 + 8);
                    wVar2.N(i7);
                    vVar = new v(wVar2.B(), wVar2.B());
                    listS = listS;
                    strI = strI;
                    str2 = str2;
                } else {
                    str2 = str2;
                    str4 = str4;
                    if (iM3 == 1684103987) {
                        wVar2.M(i27 + 8);
                        String string = Integer.toString(i4);
                        androidx.media3.common.util.v vVar2 = new androidx.media3.common.util.v();
                        vVar2.k(wVar2);
                        int i36 = iArr2[vVar2.g(i6)];
                        vVar2.o(8);
                        int i37 = iArr[vVar2.g(3)];
                        if (vVar2.g(1) != 0) {
                            i37++;
                        }
                        int i38 = androidx.media3.extractor.b.g[vVar2.g(5)] * 1000;
                        vVar2.c();
                        wVar2.M(vVar2.d());
                        androidx.media3.common.q qVar = new androidx.media3.common.q();
                        qVar.a = string;
                        qVar.n = i0.p("audio/ac3");
                        qVar.F = i37;
                        qVar.G = i36;
                        qVar.r = mVarA;
                        qVar.d = str;
                        qVar.h = i38;
                        qVar.i = i38;
                        eVar.e = new androidx.media3.common.r(qVar);
                        listS = listS;
                        iM2 = iM2;
                        i27 = i27;
                        i14 = iG2;
                        i11 = iIntValue;
                    } else if (iM3 == 1684366131) {
                        wVar2.M(i27 + 8);
                        String string2 = Integer.toString(i4);
                        androidx.media3.common.util.v vVar3 = new androidx.media3.common.util.v();
                        vVar3.k(wVar2);
                        int iG7 = vVar3.g(13) * 1000;
                        vVar3.o(3);
                        int i39 = iArr2[vVar3.g(2)];
                        vVar3.o(10);
                        int i40 = iArr[vVar3.g(3)];
                        if (vVar3.g(1) != 0) {
                            i40++;
                        }
                        int i41 = i40;
                        vVar3.o(3);
                        int iG8 = vVar3.g(4);
                        vVar3.o(1);
                        if (iG8 > 0) {
                            vVar3.o(6);
                            if (vVar3.g(1) != 0) {
                                i41 += 2;
                            }
                            vVar3.o(1);
                        }
                        int i42 = i41;
                        iM2 = iM2;
                        if (vVar3.b() > 7) {
                            vVar3.o(7);
                            if (vVar3.g(1) != 0) {
                                str3 = "audio/eac3-joc";
                            } else {
                                str3 = "audio/eac3";
                            }
                        } else {
                            str3 = "audio/eac3";
                        }
                        vVar3.c();
                        wVar2.M(vVar3.d());
                        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                        qVar2.a = string2;
                        qVar2.n = i0.p(str3);
                        qVar2.F = i42;
                        qVar2.G = i39;
                        qVar2.r = mVarA;
                        qVar2.d = str;
                        qVar2.i = iG7;
                        eVar.e = new androidx.media3.common.r(qVar2);
                        i11 = iIntValue;
                        i14 = iG2;
                    } else {
                        listS = listS;
                        iM2 = iM2;
                        if (iM3 == 1684103988) {
                            wVar2.M(i27 + 8);
                            String string3 = Integer.toString(i4);
                            androidx.media3.common.util.v vVar4 = new androidx.media3.common.util.v();
                            vVar4.k(wVar2);
                            int iB = vVar4.b();
                            int iG9 = vVar4.g(3);
                            if (iG9 > 1) {
                                throw androidx.media3.common.j0.c("Unsupported AC-4 DSI version: " + iG9);
                            }
                            int iG10 = vVar4.g(7);
                            int i43 = vVar4.f() ? 48000 : 44100;
                            vVar4.o(4);
                            int iG11 = vVar4.g(9);
                            if (iG10 > 1) {
                                if (iG9 == 0) {
                                    throw androidx.media3.common.j0.c("Invalid AC-4 DSI version: " + iG9);
                                }
                                if (vVar4.f()) {
                                    vVar4.o(16);
                                    if (vVar4.f()) {
                                        vVar4.o(128);
                                    }
                                }
                            }
                            if (iG9 == 1) {
                                if (vVar4.b() < 66) {
                                    throw androidx.media3.common.j0.c("Invalid AC-4 DSI bitrate.");
                                }
                                vVar4.o(66);
                                vVar4.c();
                            }
                            androidx.media3.extractor.c cVar = new androidx.media3.extractor.c();
                            cVar.a = true;
                            cVar.b = -1;
                            cVar.c = -1;
                            cVar.d = true;
                            cVar.e = 2;
                            cVar.f = 1;
                            cVar.g = 0;
                            int i44 = 0;
                            while (true) {
                                if (i44 < iG11) {
                                    if (iG9 == 0) {
                                        i18 = i8;
                                        zF = vVar4.f();
                                        iG3 = vVar4.g(5);
                                        iG4 = vVar4.g(5);
                                        i23 = 0;
                                        i24 = 0;
                                        z2 = false;
                                    } else {
                                        int i45 = iG11;
                                        int iG12 = vVar4.g(8);
                                        i18 = i8;
                                        int iG13 = vVar4.g(8);
                                        int iG14 = iG13 == 255 ? vVar4.g(16) + iG13 : iG13;
                                        if (iG12 > 2) {
                                            vVar4.o(iG14 * 8);
                                            i44++;
                                            iG11 = i45;
                                            i8 = i18;
                                        } else {
                                            int iB2 = (iB - vVar4.b()) / 8;
                                            int iG15 = vVar4.g(5);
                                            i24 = iB2;
                                            z2 = iG15 == 31;
                                            zF = false;
                                            iG4 = iG12;
                                            iG3 = iG15;
                                            i23 = iG14;
                                        }
                                    }
                                    cVar.f = iG4;
                                    i17 = iG2;
                                    if (zF || z2 || iG3 != 6) {
                                        cVar.g = vVar4.g(3);
                                        if (vVar4.f()) {
                                            vVar4.o(5);
                                        }
                                        vVar4.o(2);
                                        int i46 = 1;
                                        if (iG9 == 1 && (iG4 == 1 || iG4 == 2)) {
                                            vVar4.o(2);
                                        }
                                        vVar4.o(5);
                                        vVar4.o(10);
                                        if (iG9 == 1) {
                                            if (iG4 > 0) {
                                                cVar.a = vVar4.f();
                                            }
                                            if (cVar.a) {
                                                if (iG4 != 1) {
                                                    i25 = 2;
                                                    if (iG4 == 2) {
                                                        iG5 = vVar4.g(5);
                                                        if (iG5 >= 0 && iG5 <= 15) {
                                                            cVar.b = iG5;
                                                        }
                                                        if (iG5 >= 11 || iG5 > 14) {
                                                            i25 = 2;
                                                        } else {
                                                            cVar.d = vVar4.f();
                                                            i25 = 2;
                                                            cVar.e = vVar4.g(2);
                                                        }
                                                    }
                                                } else {
                                                    iG5 = vVar4.g(5);
                                                    if (iG5 >= 0) {
                                                        cVar.b = iG5;
                                                    }
                                                    if (iG5 >= 11) {
                                                        i25 = 2;
                                                    } else {
                                                        i25 = 2;
                                                    }
                                                }
                                                vVar4.o(24);
                                                i46 = 1;
                                            } else {
                                                i25 = 2;
                                            }
                                            if (iG4 == i46 || iG4 == i25) {
                                                if (vVar4.f() && vVar4.f()) {
                                                    vVar4.o(i25);
                                                }
                                                if (vVar4.f()) {
                                                    vVar4.n();
                                                    int i47 = 8;
                                                    int iG16 = vVar4.g(8);
                                                    int i48 = 0;
                                                    while (i48 < iG16) {
                                                        vVar4.o(i47);
                                                        i48++;
                                                        i47 = 8;
                                                    }
                                                }
                                            }
                                        }
                                        if (!zF && !z2) {
                                            vVar4.n();
                                            if (iG3 == 0 || iG3 == 1 || iG3 == 2) {
                                                if (iG4 == 0) {
                                                    for (int i49 = 0; i49 < 2; i49++) {
                                                        androidx.media3.extractor.b.o(vVar4, cVar);
                                                    }
                                                } else {
                                                    for (int i50 = 0; i50 < 2; i50++) {
                                                        androidx.media3.extractor.b.p(vVar4, cVar);
                                                    }
                                                }
                                            } else if (iG3 == 3 || iG3 == 4) {
                                                if (iG4 == 0) {
                                                    for (int i51 = 0; i51 < 3; i51++) {
                                                        androidx.media3.extractor.b.o(vVar4, cVar);
                                                    }
                                                } else {
                                                    for (int i52 = 0; i52 < 3; i52++) {
                                                        androidx.media3.extractor.b.p(vVar4, cVar);
                                                    }
                                                }
                                            } else if (iG3 != 5) {
                                                int iG17 = vVar4.g(7);
                                                for (int i53 = 0; i53 < iG17; i53++) {
                                                    vVar4.o(8);
                                                }
                                            } else if (iG4 == 0) {
                                                androidx.media3.extractor.b.o(vVar4, cVar);
                                            } else {
                                                int iG18 = vVar4.g(3);
                                                for (int i54 = 0; i54 < iG18 + 2; i54++) {
                                                    androidx.media3.extractor.b.p(vVar4, cVar);
                                                }
                                            }
                                        } else if (iG4 == 0) {
                                            androidx.media3.extractor.b.o(vVar4, cVar);
                                        } else {
                                            androidx.media3.extractor.b.p(vVar4, cVar);
                                        }
                                        vVar4.n();
                                        zF2 = vVar4.f();
                                    } else {
                                        iG4 = iG4;
                                        zF2 = true;
                                    }
                                    if (zF2) {
                                        int iG19 = vVar4.g(7);
                                        for (int i55 = 0; i55 < iG19; i55++) {
                                            vVar4.o(15);
                                        }
                                    }
                                    if (iG4 <= 0) {
                                        i19 = 8;
                                    } else {
                                        if (vVar4.f()) {
                                            if (vVar4.b() < 66) {
                                                z3 = false;
                                            } else {
                                                vVar4.o(66);
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                throw androidx.media3.common.j0.c("Can't parse bitrate DSI.");
                                            }
                                        }
                                        if (vVar4.f()) {
                                            vVar4.c();
                                            vVar4.p(vVar4.g(16));
                                            int iG20 = vVar4.g(5);
                                            for (int i56 = 0; i56 < iG20; i56++) {
                                                vVar4.o(3);
                                                vVar4.o(8);
                                            }
                                            i19 = 8;
                                        } else {
                                            i19 = 8;
                                        }
                                    }
                                    vVar4.c();
                                    if (iG9 == 1) {
                                        int iB3 = ((iB - vVar4.b()) / 8) - i24;
                                        if (i23 < iB3) {
                                            throw androidx.media3.common.j0.c("pres_bytes is smaller than presentation bytes read.");
                                        }
                                        vVar4.p(i23 - iB3);
                                    }
                                    if (cVar.a && cVar.b == -1) {
                                        throw androidx.media3.common.j0.c("Can't determine channel mode of presentation " + i44);
                                    }
                                } else {
                                    iIntValue = iIntValue;
                                    i17 = iG2;
                                    i18 = i8;
                                    i19 = 8;
                                }
                                if (cVar.a) {
                                    int i57 = cVar.b;
                                    boolean z6 = cVar.d;
                                    int i58 = cVar.e;
                                    switch (i57) {
                                        case 0:
                                            i21 = 11;
                                            i22 = 1;
                                            break;
                                        case 1:
                                            i21 = 11;
                                            i22 = 2;
                                            break;
                                        case 2:
                                            i21 = 11;
                                            i22 = 3;
                                            break;
                                        case 3:
                                            i21 = 11;
                                            i22 = 5;
                                            break;
                                        case 4:
                                            i21 = 11;
                                            i22 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i21 = 11;
                                            i22 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i22 = i19;
                                            i21 = 11;
                                            break;
                                        case 11:
                                            i21 = 11;
                                            i22 = 11;
                                            break;
                                        case 12:
                                            i22 = 12;
                                            i21 = 11;
                                            break;
                                        case 13:
                                            i21 = 11;
                                            i22 = 13;
                                            break;
                                        case 14:
                                            i21 = 11;
                                            i22 = 14;
                                            break;
                                        case 15:
                                            i21 = 11;
                                            i22 = 24;
                                            break;
                                        default:
                                            i21 = 11;
                                            i22 = -1;
                                            break;
                                    }
                                    if (i57 == i21 || i57 == 12 || i57 == 13 || i57 == 14) {
                                        if (!z6) {
                                            i22 -= 2;
                                        }
                                        if (i58 == 0) {
                                            i22 -= 4;
                                        } else if (i58 == 1) {
                                            i22 -= 2;
                                        }
                                    }
                                    i20 = i22;
                                } else {
                                    int i59 = cVar.c;
                                    int i60 = cVar.g;
                                    if (i59 > 0) {
                                        i20 = i59 + 1;
                                        if (i60 == 4 && i20 == 17) {
                                            i20 = 21;
                                        }
                                    } else if (i60 == 0) {
                                        i20 = 2;
                                    } else if (i60 == 1) {
                                        i20 = 6;
                                    } else if (i60 == 2) {
                                        i20 = i19;
                                    } else if (i60 == 3) {
                                        i20 = 10;
                                    } else if (i60 != 4) {
                                        androidx.media3.common.util.c.t("Ac4Util", "AC-4 level " + cVar.g + " has not been defined.");
                                        i20 = 2;
                                    } else {
                                        i20 = 12;
                                    }
                                }
                                if (i20 <= 0) {
                                    throw androidx.media3.common.j0.c("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(iG10), Integer.valueOf(cVar.f), Integer.valueOf(cVar.g)};
                                String str9 = j0.a;
                                String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                androidx.media3.common.q qVar3 = new androidx.media3.common.q();
                                qVar3.a = string3;
                                qVar3.n = i0.p("audio/ac4");
                                qVar3.F = i20;
                                qVar3.G = i43;
                                qVar3.r = mVarA;
                                qVar3.d = str;
                                qVar3.j = str10;
                                eVar.e = new androidx.media3.common.r(qVar3);
                                i8 = i18;
                                i14 = i17;
                                i11 = iIntValue;
                            }
                        } else {
                            i11 = iIntValue;
                            i27 = i27;
                            int i61 = iG2;
                            int i62 = i8;
                            if (iM3 == 1684892784) {
                                if (iM <= 0) {
                                    throw androidx.media3.common.j0.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM);
                                }
                                i8 = iM;
                                iG2 = 2;
                            } else if (iM3 == 1684305011 || iM3 == 1969517683) {
                                i11 = i11;
                                androidx.media3.common.q qVar4 = new androidx.media3.common.q();
                                qVar4.a = Integer.toString(i4);
                                qVar4.n = i0.p(str2);
                                i14 = i61;
                                qVar4.F = i14;
                                i8 = i62;
                                qVar4.G = i8;
                                qVar4.r = mVarA;
                                qVar4.d = str;
                                eVar.e = new androidx.media3.common.r(qVar4);
                            } else if (iM3 == 1682927731) {
                                int i63 = iM2 - 8;
                                byte[] bArr6 = a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i63);
                                wVar2.M(i27 + 8);
                                wVar2.k(bArrCopyOf, bArr6.length, i63);
                                listS = androidx.media3.container.r.a(bArrCopyOf);
                                i8 = i62;
                                iG2 = i61;
                            } else {
                                if (iM3 == 1684425825) {
                                    byte[] bArr7 = new byte[iM2 - 8];
                                    bArr7[0] = 102;
                                    bArr7[1] = 76;
                                    bArr7[2] = 97;
                                    bArr7[3] = 67;
                                    wVar2.M(i27 + 12);
                                    wVar2.k(bArr7, 4, iM2 - 12);
                                    listS = h0.s(bArr7);
                                    strI = strI;
                                } else if (iM3 == 1634492771) {
                                    int i64 = iM2 - 12;
                                    byte[] bArr8 = new byte[i64];
                                    wVar2.M(i27 + 12);
                                    wVar2.k(bArr8, 0, i64);
                                    byte[] bArr9 = androidx.media3.common.util.f.a;
                                    w wVar4 = new w(bArr8);
                                    wVar4.M(5);
                                    int iZ5 = wVar4.z();
                                    wVar4.M(9);
                                    int iZ6 = wVar4.z();
                                    wVar4.M(20);
                                    int[] iArr3 = {wVar4.D(), iZ6, iZ5};
                                    int i65 = iArr3[0];
                                    int i66 = iArr3[1];
                                    int i67 = iArr3[2];
                                    String str11 = j0.a;
                                    int iD5 = j0.D(i67, ByteOrder.LITTLE_ENDIAN);
                                    listS = h0.s(bArr8);
                                    i28 = iD5;
                                    i8 = i65;
                                    iG2 = i66;
                                    strI = strI;
                                    str2 = str2;
                                    i27 = i27;
                                    i11 = i11;
                                    r0VarC = r0VarC;
                                } else if (iM3 == 1767990114) {
                                    wVar2.M(i27 + 9);
                                    int iE = wVar2.E();
                                    byte[] bArr10 = new byte[iE];
                                    wVar2.k(bArr10, 0, iE);
                                    byte[] bArr11 = androidx.media3.common.util.f.a;
                                    w wVar5 = new w(bArr10);
                                    String str12 = null;
                                    String strX = null;
                                    while (wVar5.a() > 0 && (str12 == null || strX == null)) {
                                        int iZ7 = wVar5.z();
                                        int i68 = iZ7 >> 3;
                                        boolean z7 = (iZ7 & 2) != 0;
                                        boolean z8 = (iZ7 & 1) != 0;
                                        int iE2 = wVar5.E();
                                        if (i68 > 4 && i68 < 24 && z7) {
                                            do {
                                            } while ((wVar5.z() & 128) != 0);
                                            for (i16 = 128; (wVar5.z() & i16) != 0; i16 = 128) {
                                            }
                                        }
                                        if (z8) {
                                            wVar5.N(wVar5.E());
                                        }
                                        int i69 = wVar5.b + iE2;
                                        if (i68 == 31) {
                                            wVar5.N(4);
                                            Object[] objArr2 = {Integer.valueOf(wVar5.z()), Integer.valueOf(wVar5.z())};
                                            String str13 = j0.a;
                                            str12 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                        } else {
                                            if (i68 == 0) {
                                                while ((wVar5.z() & 128) != 0) {
                                                }
                                                strX = wVar5.x(4, StandardCharsets.UTF_8);
                                                if (strX.equals("mp4a")) {
                                                    while ((wVar5.z() & 128) != 0) {
                                                    }
                                                    wVar5.N(2);
                                                    androidx.media3.common.util.v vVar5 = new androidx.media3.common.util.v();
                                                    vVar5.k(wVar5);
                                                    int iG21 = vVar5.g(5);
                                                    if (iG21 == 31) {
                                                        iG21 = vVar5.g(6) + 32;
                                                    }
                                                    strX = strX + ".40." + iG21;
                                                }
                                            }
                                            wVar5.M(i69);
                                        }
                                        wVar5.M(i69);
                                    }
                                    strI = (str12 == null || strX == null) ? null : androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(str12, ".", strX);
                                    listS = h0.s(bArr10);
                                } else if (iM3 == 1885564227) {
                                    wVar2.M(i27 + 12);
                                    ByteOrder byteOrder = (wVar2.z() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int iZ8 = wVar2.z();
                                    i11 = i11;
                                    if (i11 == 1768973165) {
                                        iD = j0.D(iZ8, byteOrder);
                                        i15 = -1;
                                    } else {
                                        iD = (i11 == 1718641517 && iZ8 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i28;
                                        i15 = -1;
                                    }
                                    r0VarC = r0VarC;
                                    i28 = iD;
                                    strI = strI;
                                    str2 = iD != i15 ? "audio/raw" : str2;
                                    i27 = i27;
                                    i8 = i62;
                                    iG2 = i61;
                                } else {
                                    i11 = i11;
                                    i8 = i62;
                                    i14 = i61;
                                }
                                str2 = str2;
                                i27 = i27;
                                i8 = i62;
                                iG2 = i61;
                                i11 = i11;
                            }
                        }
                    }
                    r0VarC = r0VarC;
                    iG2 = i14;
                    strI = strI;
                    str2 = str2;
                    i27 = i27;
                }
                i27 += iM2;
                i7 = 4;
                i6 = 2;
                wVar2 = wVar;
                i26 = i3;
                iIntValue = i11;
                r0VarC = r0VarC;
                i9 = i28;
                str4 = str4;
                listS = listS;
            }
            r0VarC = r0VarC;
            i11 = iIntValue;
            i27 += iM2;
            i7 = 4;
            i6 = 2;
            wVar2 = wVar;
            i26 = i3;
            iIntValue = i11;
            r0VarC = r0VarC;
            i9 = i28;
            str4 = str4;
            listS = listS;
        }
        String str14 = strI;
        String str15 = str2;
        List list = listS;
        int i70 = iG2;
        int i71 = i9;
        if (((androidx.media3.common.r) eVar.e) != null || str15 == null) {
            return;
        }
        androidx.media3.common.q qVar5 = new androidx.media3.common.q();
        qVar5.a = Integer.toString(i4);
        qVar5.n = i0.p(str15);
        qVar5.j = str14;
        qVar5.F = i70;
        qVar5.G = i8;
        qVar5.H = i71;
        qVar5.q = list;
        qVar5.r = mVarA;
        qVar5.d = str;
        if (r0VarC != null) {
            r0 r0Var = r0VarC;
            qVar5.h = a0.C(r0Var.e);
            qVar5.i = a0.C(r0Var.y);
        } else {
            v vVar6 = vVar;
            if (vVar6 != null) {
                qVar5.h = a0.C(vVar6.a);
                qVar5.i = a0.C(vVar6.b);
            }
        }
        eVar.e = new androidx.media3.common.r(qVar5);
    }

    public static r0 c(int i, w wVar) {
        wVar.M(i + 12);
        wVar.N(1);
        d(wVar);
        wVar.N(2);
        int iZ = wVar.z();
        if ((iZ & 128) != 0) {
            wVar.N(2);
        }
        if ((iZ & 64) != 0) {
            wVar.N(wVar.z());
        }
        if ((iZ & 32) != 0) {
            wVar.N(2);
        }
        wVar.N(1);
        d(wVar);
        String strF = i0.f(wVar.z());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new r0(strF, null, -1L, -1L);
        }
        wVar.N(4);
        long jB = wVar.B();
        long jB2 = wVar.B();
        wVar.N(1);
        int iD = d(wVar);
        long j = jB2;
        byte[] bArr = new byte[iD];
        wVar.k(bArr, 0, iD);
        if (j <= 0) {
            j = -1;
        }
        return new r0(strF, bArr, j, jB > 0 ? jB : -1L);
    }

    public static int d(w wVar) {
        int iZ = wVar.z();
        int i = iZ & 127;
        while ((iZ & 128) == 128) {
            iZ = wVar.z();
            i = (i << 7) | (iZ & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static androidx.media3.common.h0 f(androidx.media3.container.d dVar) {
        androidx.media3.container.b bVar;
        androidx.media3.container.e eVarP = dVar.p(1751411826);
        androidx.media3.container.e eVarP2 = dVar.p(1801812339);
        androidx.media3.container.e eVarP3 = dVar.p(1768715124);
        if (eVarP == null || eVarP2 == null || eVarP3 == null) {
            return null;
        }
        w wVar = eVarP.z;
        wVar.M(16);
        if (wVar.m() != 1835299937) {
            return null;
        }
        w wVar2 = eVarP2.z;
        wVar2.M(12);
        int iM = wVar2.m();
        String[] strArr = new String[iM];
        for (int i = 0; i < iM; i++) {
            int iM2 = wVar2.m();
            wVar2.N(4);
            strArr[i] = wVar2.x(iM2 - 8, StandardCharsets.UTF_8);
        }
        w wVar3 = eVarP3.z;
        wVar3.M(8);
        ArrayList arrayList = new ArrayList();
        while (wVar3.a() > 8) {
            int i2 = wVar3.b;
            int iM3 = wVar3.m();
            int iM4 = wVar3.m() - 1;
            if (iM4 < 0 || iM4 >= iM) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Skipped metadata with unknown key index: ", iM4, "BoxParsers");
            } else {
                String str = strArr[iM4];
                int i3 = i2 + iM3;
                while (true) {
                    int i4 = wVar3.b;
                    if (i4 < i3) {
                        int iM5 = wVar3.m();
                        if (wVar3.m() == 1684108385) {
                            int iM6 = wVar3.m();
                            int iM7 = wVar3.m();
                            int i5 = iM5 - 16;
                            byte[] bArr = new byte[i5];
                            wVar3.k(bArr, 0, i5);
                            try {
                                bVar = new androidx.media3.container.b(str, bArr, iM7, iM6);
                                break;
                            } catch (Exception unused) {
                                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.x("Failed to parse metadata entry with key: ", str, "MetadataUtil");
                                bVar = null;
                                break;
                            }
                        }
                        wVar3.M(i4 + iM5);
                    }
                    bVar = null;
                    break;
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            wVar3.M(i2 + iM3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.h0(arrayList);
    }

    public static androidx.media3.container.h g(w wVar) {
        long jT;
        long jT2;
        wVar.M(8);
        if (e(wVar.m()) == 0) {
            jT = wVar.B();
            jT2 = wVar.B();
        } else {
            jT = wVar.t();
            jT2 = wVar.t();
        }
        return new androidx.media3.container.h(jT, jT2, wVar.B());
    }

    public static Pair h(w wVar, int i, int i2) throws androidx.media3.common.j0 {
        s sVar;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = wVar.b;
        while (i5 - i < i2) {
            wVar.M(i5);
            int iM = wVar.m();
            androidx.media3.extractor.b.b("childAtomSize must be positive", iM > 0);
            if (wVar.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strX = null;
                while (i6 - i5 < iM) {
                    wVar.M(i6);
                    int iM2 = wVar.m();
                    int iM3 = wVar.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(wVar.m());
                    } else if (iM3 == 1935894637) {
                        wVar.N(4);
                        strX = wVar.x(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i8 = i6;
                        i7 = iM2;
                    }
                    i6 += iM2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strX) || "cbc1".equals(strX) || "cens".equals(strX) || "cbcs".equals(strX)) {
                    androidx.media3.extractor.b.b("frma atom is mandatory", numValueOf != null);
                    androidx.media3.extractor.b.b("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            sVar = null;
                            break;
                        }
                        wVar.M(i9);
                        int iM4 = wVar.m();
                        if (wVar.m() == 1952804451) {
                            int iE = e(wVar.m());
                            wVar.N(1);
                            if (iE == 0) {
                                wVar.N(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iZ = wVar.z();
                                i3 = iZ & 15;
                                i4 = (iZ & 240) >> 4;
                            }
                            boolean z = wVar.z() == 1;
                            int iZ2 = wVar.z();
                            byte[] bArr2 = new byte[16];
                            wVar.k(bArr2, 0, 16);
                            if (z && iZ2 == 0) {
                                int iZ3 = wVar.z();
                                byte[] bArr3 = new byte[iZ3];
                                wVar.k(bArr3, 0, iZ3);
                                bArr = bArr3;
                            }
                            sVar = new s(z, strX, iZ2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iM4;
                    }
                    androidx.media3.extractor.b.b("tenc atom is mandatory", sVar != null);
                    String str = j0.a;
                    pairCreate = Pair.create(numValueOf, sVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:441:0x0933  */
    /* JADX WARN: Code duplicated, block: B:443:0x0953  */
    /* JADX WARN: Code duplicated, block: B:445:0x0959  */
    /* JADX WARN: Code duplicated, block: B:446:0x0968  */
    /* JADX WARN: Code duplicated, block: B:451:0x098a  */
    /* JADX WARN: Code duplicated, block: B:453:0x0998  */
    /* JADX WARN: Code duplicated, block: B:454:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:456:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:457:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:459:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:460:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:462:0x09db  */
    /* JADX WARN: Code duplicated, block: B:464:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:468:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:469:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:472:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:475:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:476:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:478:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a47 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:490:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:496:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a6f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:503:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:506:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:509:0x0a97  */
    /* JADX WARN: Code duplicated, block: B:676:0x09ea A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:441:0x0933, please report this as an issue */
    public static androidx.compose.ui.text.android.selection.e i(w wVar, d dVar, String str, androidx.media3.common.m mVar, boolean z) throws androidx.media3.common.j0 {
        int i;
        androidx.media3.common.m mVar2;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        int iG;
        int i5;
        String str5;
        int i6;
        int i7;
        int i8;
        byte[] bArrCopyOfRange;
        int i9;
        int i10;
        int i11;
        int iG2;
        boolean zF;
        int iG3;
        int i12;
        int iG4;
        int i13;
        int i14;
        boolean zF2;
        int i15;
        int iG5;
        boolean z2;
        int i16;
        int iG6;
        androidx.media3.common.h hVar;
        int iG7;
        int i17;
        androidx.media3.common.h hVar2;
        int i18;
        androidx.media3.exoplayer.dash.manifest.t tVar;
        int i19;
        int iZ;
        int iZ2;
        String str6;
        androidx.media3.common.m mVarA;
        int i20;
        String str7;
        a1 a1VarS;
        long j;
        w wVar2 = wVar;
        d dVar2 = dVar;
        String str8 = str;
        int i21 = dVar2.a;
        wVar2.M(12);
        int iM = wVar2.m();
        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(iM);
        int i22 = 0;
        while (i22 < iM) {
            int i23 = wVar2.b;
            int iM2 = wVar2.m();
            String str9 = "childAtomSize must be positive";
            androidx.media3.extractor.b.b("childAtomSize must be positive", iM2 > 0);
            int iM3 = wVar2.m();
            int i24 = 8;
            byte b = 3;
            String str10 = null;
            if (iM3 == 1635148593 || iM3 == 1635148595 || iM3 == 1701733238 || iM3 == 1831958048 || iM3 == 1836070006 || iM3 == 1752589105 || iM3 == 1751479857 || iM3 == 1987470129 || iM3 == 1987471665 || iM3 == 1932670515 || iM3 == 1211250227 || iM3 == 1748121139 || iM3 == 1987063864 || iM3 == 1987063865 || iM3 == 1635135537 || iM3 == 1685479798 || iM3 == 1685479729 || iM3 == 1685481573 || iM3 == 1685481521 || iM3 == 1634760241 || iM3 == 1684108849) {
                int i25 = dVar2.c;
                wVar2.M(i23 + 16);
                wVar2.N(16);
                int iG8 = wVar2.G();
                int iG9 = wVar2.G();
                wVar2.N(50);
                int i26 = wVar2.b;
                i = i22;
                if (iM3 == 1701733238) {
                    Pair pairH = h(wVar2, i23, iM2);
                    if (pairH != null) {
                        iM3 = ((Integer) pairH.first).intValue();
                        mVarA = mVar == null ? null : mVar.a(((s) pairH.second).b);
                        ((s[]) eVar.d)[i] = (s) pairH.second;
                    } else {
                        i23 = i23;
                        mVarA = mVar;
                    }
                    wVar2.M(i26);
                    mVar2 = mVarA;
                } else {
                    i23 = i23;
                    mVar2 = mVar;
                }
                if (iM3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM3 == 1211250227 ? "video/3gpp" : null;
                }
                androidx.media3.common.m mVar3 = mVar2;
                i2 = i21;
                i3 = iM;
                int i27 = i26;
                int i28 = 8;
                List listS = null;
                com.google.firebase.messaging.o oVar = null;
                ByteBuffer byteBufferOrder = null;
                String string = null;
                byte[] bArr = null;
                androidx.media3.container.a aVarE = null;
                v vVar = null;
                r0 r0Var = null;
                String str11 = str2;
                float fD = 1.0f;
                int i29 = -1;
                int i30 = -1;
                int i31 = -1;
                int iF = -1;
                boolean z3 = false;
                int i32 = -1;
                int i33 = -1;
                int i34 = -1;
                int i35 = -1;
                int i36 = 8;
                while (i27 - i23 < iM2) {
                    wVar2.M(i27);
                    int i37 = wVar2.b;
                    int i38 = i27;
                    int iM4 = wVar2.m();
                    if (iM4 == 0 && wVar2.b - i23 == iM2) {
                        break;
                    }
                    androidx.media3.extractor.b.b(str9, iM4 > 0);
                    int iM5 = wVar2.m();
                    int i39 = iM2;
                    if (iM5 == 1635148611) {
                        androidx.media3.extractor.b.b(str10, str11 == null);
                        wVar2.M(i37 + 8);
                        androidx.media3.extractor.d dVarA = androidx.media3.extractor.d.a(wVar2);
                        listS = dVarA.a;
                        eVar.b = dVarA.b;
                        float f = !z3 ? dVarA.k : fD;
                        str6 = dVarA.l;
                        int i40 = dVarA.j;
                        int i41 = dVarA.g;
                        int i42 = dVarA.h;
                        int i43 = dVarA.i;
                        int i44 = dVarA.e;
                        i28 = dVarA.f;
                        i7 = iM3;
                        iG = i43;
                        fD = f;
                        i33 = i40;
                        i6 = i44;
                        oVar = oVar;
                        iF = i41;
                        i31 = i42;
                        str11 = "video/avc";
                    } else {
                        int i45 = iM3;
                        if (iM5 == 1752589123) {
                            androidx.media3.extractor.b.b(null, str11 == null);
                            wVar2.M(i37 + 8);
                            androidx.media3.extractor.w wVarA = androidx.media3.extractor.w.a(wVar2, false, null);
                            listS = wVarA.a;
                            eVar.b = wVarA.b;
                            float f2 = !z3 ? wVarA.l : fD;
                            int i46 = wVarA.m;
                            int i47 = wVarA.c;
                            str6 = wVarA.n;
                            int i48 = wVarA.k;
                            if (i48 != -1) {
                                i29 = i48;
                            }
                            int i49 = wVarA.d;
                            int i50 = wVarA.e;
                            int i51 = wVarA.h;
                            int i52 = wVarA.i;
                            int i53 = wVarA.j;
                            int i54 = wVarA.f;
                            i28 = wVarA.g;
                            oVar = wVarA.o;
                            i34 = i50;
                            i35 = i49;
                            fD = f2;
                            i31 = i52;
                            iG = i53;
                            i6 = i54;
                            i7 = i45;
                            str11 = "video/hevc";
                            i33 = i46;
                            iF = i51;
                            i32 = i47;
                        } else {
                            int i55 = i29;
                            if (iM5 == 1818785347) {
                                androidx.media3.extractor.b.b("lhvC must follow hvcC atom", "video/hevc".equals(str11));
                                androidx.media3.extractor.b.b("must have at least two layers", oVar != null && ((h0) oVar.y).size() >= 2);
                                wVar2.M(i37 + 8);
                                oVar.getClass();
                                androidx.media3.extractor.w wVarA2 = androidx.media3.extractor.w.a(wVar2, true, oVar);
                                androidx.media3.extractor.b.b("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", eVar.b == wVarA2.b);
                                int i56 = wVarA2.h;
                                if (i56 != -1) {
                                    androidx.media3.extractor.b.b("colorSpace must be the same for both views", iF == i56);
                                }
                                int i57 = wVarA2.i;
                                if (i57 != -1) {
                                    androidx.media3.extractor.b.b("colorRange must be the same for both views", i31 == i57);
                                }
                                int i58 = wVarA2.j;
                                if (i58 != -1) {
                                    androidx.media3.extractor.b.b("colorTransfer must be the same for both views", i30 == i58);
                                }
                                androidx.media3.extractor.b.b("bitdepthLuma must be the same for both views", i36 == wVarA2.f);
                                androidx.media3.extractor.b.b("bitdepthChroma must be the same for both views", i28 == wVarA2.g);
                                if (listS != null) {
                                    d0 d0VarK = h0.k();
                                    d0VarK.c(listS);
                                    d0VarK.c(wVarA2.a);
                                    listS = d0VarK.g();
                                } else {
                                    androidx.media3.extractor.b.b("initializationData must be already set from hvcC atom", false);
                                }
                                string = wVarA2.n;
                                str11 = "video/mv-hevc";
                                iG = i30;
                                str9 = str9;
                                i6 = i36;
                                oVar = oVar;
                                i24 = i24;
                                i7 = i45;
                                i29 = i55;
                            } else {
                                int i59 = 7;
                                if (iM5 == 1987470147) {
                                    androidx.media3.extractor.b.b(null, str11 == null);
                                    wVar2.M(i37 + 8);
                                    try {
                                        if (wVar2.m() != 0) {
                                            throw androidx.media3.common.j0.a(null, "Unsupported VVC version");
                                        }
                                        int iZ3 = wVar2.z();
                                        int i60 = (iZ3 >> 1) & 3;
                                        boolean z4 = (iZ3 & 1) != 0;
                                        int i61 = i60 + 1;
                                        String str12 = "L";
                                        if (z4) {
                                            wVar2.N(1);
                                            int iZ4 = (wVar2.z() >> 4) & 7;
                                            iZ = (wVar2.z() >> 5) & 7;
                                            int iZ5 = wVar2.z() & 63;
                                            int iZ6 = wVar2.z();
                                            int i62 = (iZ6 >> 1) & 127;
                                            str12 = (iZ6 & 1) != 0 ? "H" : "L";
                                            iZ2 = wVar2.z();
                                            wVar2.N(iZ5);
                                            int i63 = 1;
                                            if (iZ4 > 1) {
                                                int iZ7 = wVar2.z();
                                                int i64 = 0;
                                                while (i64 < iZ4 - 1) {
                                                    if (((iZ7 >> (7 - i64)) & i63) != 0) {
                                                        wVar2.N(i63);
                                                    }
                                                    i64++;
                                                    i63 = 1;
                                                }
                                            }
                                            wVar2.N(wVar2.z() * 4);
                                            wVar2.N(6);
                                            i19 = i62;
                                        } else {
                                            i19 = 0;
                                            iZ = 0;
                                            iZ2 = 0;
                                        }
                                        int iZ8 = wVar2.z();
                                        int i65 = wVar2.b;
                                        int i66 = iZ;
                                        int i67 = 0;
                                        int i68 = 0;
                                        while (i68 < iZ8) {
                                            int i69 = i31;
                                            int iZ9 = wVar2.z() & 31;
                                            int i70 = i68;
                                            int iG10 = (iZ9 == 13 || iZ9 == 12) ? 1 : wVar2.G();
                                            int i71 = 0;
                                            while (i71 < iG10) {
                                                int i72 = i67;
                                                int iG11 = wVar2.G();
                                                wVar2.N(iG11);
                                                i71++;
                                                i67 = iG11 + 4 + i72;
                                            }
                                            i68 = i70 + 1;
                                            i31 = i69;
                                        }
                                        int i73 = i31;
                                        wVar2.M(i65);
                                        byte[] bArr2 = new byte[i67];
                                        int i74 = 0;
                                        int i75 = 0;
                                        while (i74 < iZ8) {
                                            int iZ10 = wVar2.z() & 31;
                                            int i76 = iZ8;
                                            int iG12 = (iZ10 == 13 || iZ10 == 12) ? 1 : wVar2.G();
                                            int i77 = 0;
                                            while (i77 < iG12) {
                                                int i78 = iG12;
                                                int iG13 = wVar2.G();
                                                System.arraycopy(androidx.media3.container.r.a, 0, bArr2, i75, 4);
                                                int i79 = i75 + 4;
                                                wVar2.k(bArr2, i79, iG13);
                                                i75 = i79 + iG13;
                                                i77++;
                                                iG12 = i78;
                                                i74 = i74;
                                                i30 = i30;
                                            }
                                            i74++;
                                            iZ8 = i76;
                                        }
                                        iG = i30;
                                        Locale locale = Locale.US;
                                        String str13 = "vvc1." + i19 + "." + str12 + iZ2;
                                        listS = h0.s(bArr2);
                                        int i80 = i66 + 8;
                                        eVar.b = i61;
                                        string = str13;
                                        str11 = "video/vvc";
                                        str9 = str9;
                                        i28 = i80;
                                        i6 = i28;
                                        oVar = oVar;
                                        i24 = i24;
                                        i7 = i45;
                                        i29 = i55;
                                        i31 = i73;
                                        i33 = 16;
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        throw androidx.media3.common.j0.a(e, "Error parsing VVC configuration");
                                    }
                                } else {
                                    iG = i30;
                                    int i81 = i31;
                                    if (iM5 == 1986361461) {
                                        wVar2.M(i37 + 8);
                                        int i82 = wVar2.b;
                                        androidx.media3.exoplayer.dash.manifest.t tVar2 = null;
                                        while (i82 - i37 < iM4) {
                                            wVar2.M(i82);
                                            int iM6 = wVar2.m();
                                            androidx.media3.extractor.b.b(str9, iM6 > 0);
                                            if (wVar2.m() == 1702454643) {
                                                wVar2.M(i82 + 8);
                                                int i83 = wVar2.b;
                                                while (true) {
                                                    if (i83 - i82 >= iM6) {
                                                        tVar = null;
                                                        break;
                                                    }
                                                    wVar2.M(i83);
                                                    int iM7 = wVar2.m();
                                                    androidx.media3.extractor.b.b(str9, iM7 > 0);
                                                    if (wVar2.m() == 1937011305) {
                                                        wVar2.N(4);
                                                        int iZ11 = wVar2.z();
                                                        tVar = new androidx.media3.exoplayer.dash.manifest.t(new androidx.media3.exoplayer.audio.g((iZ11 & 1) == 1, (iZ11 & 2) == 2, (iZ11 & 8) == i24), i59);
                                                        break;
                                                    }
                                                    i83 += iM7;
                                                    i24 = 8;
                                                    i59 = 7;
                                                }
                                                tVar2 = tVar;
                                            } else {
                                                i28 = i28;
                                                i82 = i82;
                                            }
                                            i82 += iM6;
                                            i28 = i28;
                                            i24 = 8;
                                            i59 = 7;
                                        }
                                        i5 = i28;
                                        androidx.media3.exoplayer.hls.c cVar = tVar2 == null ? null : new androidx.media3.exoplayer.hls.c(tVar2);
                                        if (cVar != null) {
                                            androidx.media3.exoplayer.audio.g gVar = (androidx.media3.exoplayer.audio.g) ((androidx.media3.exoplayer.dash.manifest.t) cVar.e).y;
                                            boolean z5 = gVar.c;
                                            if (oVar == null || ((h0) oVar.y).size() < 2) {
                                                i18 = i55;
                                                if (i18 == -1) {
                                                    i29 = z5 ? 5 : 4;
                                                } else {
                                                    i29 = i18;
                                                }
                                            } else {
                                                androidx.media3.extractor.b.b("both eye views must be marked as available", gVar.a && gVar.b);
                                                androidx.media3.extractor.b.b("for MV-HEVC, eye_views_reversed must be set to false", !z5);
                                                i18 = i55;
                                                i29 = i18;
                                            }
                                        } else {
                                            i18 = i55;
                                            i29 = i18;
                                        }
                                        str9 = str9;
                                        i6 = i36;
                                        oVar = oVar;
                                        i7 = i45;
                                    } else {
                                        i5 = i28;
                                        i29 = i55;
                                        if (iM5 == 1685480259 || iM5 == 1685485123 || iM5 == 1685485379) {
                                            str9 = str9;
                                            str5 = str11;
                                            i6 = i36;
                                            oVar = oVar;
                                            i7 = i45;
                                            i24 = 8;
                                            iG = iG;
                                            aVarE = androidx.media3.container.a.e(wVar2);
                                        } else if (iM5 == 1987076931) {
                                            androidx.media3.extractor.b.b(null, str11 == null);
                                            str11 = i45 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            wVar2.M(i37 + 12);
                                            byte bZ = (byte) wVar2.z();
                                            byte bZ2 = (byte) wVar2.z();
                                            int iZ12 = wVar2.z();
                                            int i84 = iZ12 >> 4;
                                            byte b2 = (byte) ((iZ12 >> 1) & 7);
                                            if (str11.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr3 = androidx.media3.common.util.f.a;
                                                byte[] bArr4 = new byte[12];
                                                bArr4[0] = 1;
                                                bArr4[1] = 1;
                                                bArr4[2] = bZ;
                                                bArr4[b] = 2;
                                                bArr4[4] = 1;
                                                bArr4[5] = bZ2;
                                                bArr4[6] = b;
                                                bArr4[7] = 1;
                                                bArr4[8] = (byte) i84;
                                                bArr4[9] = 4;
                                                bArr4[10] = 1;
                                                bArr4[11] = b2;
                                                listS = h0.s(bArr4);
                                            }
                                            boolean z6 = (iZ12 & 1) != 0;
                                            int iZ13 = wVar2.z();
                                            int iZ14 = wVar2.z();
                                            iF = androidx.media3.common.h.f(iZ13);
                                            int i85 = z6 ? 1 : 2;
                                            iG = androidx.media3.common.h.g(iZ14);
                                            i6 = i84;
                                            i7 = i45;
                                            i31 = i85;
                                            i24 = 8;
                                            i28 = i6;
                                        } else {
                                            int i86 = 11;
                                            if (iM5 == 1635135811) {
                                                int i87 = iM4 - 8;
                                                byte[] bArr5 = new byte[i87];
                                                wVar2.k(bArr5, 0, i87);
                                                listS = h0.s(bArr5);
                                                wVar2.M(i37 + 8);
                                                byte[] bArr6 = wVar2.a;
                                                androidx.media3.common.util.v vVar2 = new androidx.media3.common.util.v(bArr6, bArr6.length);
                                                vVar2.m(wVar2.b * 8);
                                                vVar2.p(1);
                                                int iG14 = vVar2.g(b);
                                                vVar2.o(6);
                                                boolean zF3 = vVar2.f();
                                                boolean zF4 = vVar2.f();
                                                int i88 = -1;
                                                if (iG14 == 2 && zF3) {
                                                    int i89 = zF4 ? 12 : 10;
                                                    i11 = zF4 ? 12 : 10;
                                                    i9 = i89;
                                                } else {
                                                    if (iG14 <= 2) {
                                                        int i90 = zF3 ? 10 : 8;
                                                        i11 = zF3 ? 10 : 8;
                                                        i9 = i90;
                                                    } else {
                                                        i9 = -1;
                                                        i10 = -1;
                                                    }
                                                    vVar2.o(13);
                                                    vVar2.n();
                                                    iG2 = vVar2.g(4);
                                                    if (iG2 != 1) {
                                                        androidx.media3.common.util.c.k("BoxParsers", "Unsupported obu_type: " + iG2);
                                                        hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                    } else if (vVar2.f()) {
                                                        androidx.media3.common.util.c.k("BoxParsers", "Unsupported obu_extension_flag");
                                                        hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                    } else {
                                                        zF = vVar2.f();
                                                        vVar2.n();
                                                        if (zF || vVar2.g(8) <= 127) {
                                                            iG3 = vVar2.g(3);
                                                            vVar2.n();
                                                            if (vVar2.f()) {
                                                                androidx.media3.common.util.c.k("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                            } else if (vVar2.f()) {
                                                                androidx.media3.common.util.c.k("BoxParsers", "Unsupported timing_info_present_flag");
                                                                hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                            } else {
                                                                if (vVar2.f()) {
                                                                    androidx.media3.common.util.c.k("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                    hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                                } else {
                                                                    i12 = 5;
                                                                    iG4 = vVar2.g(5);
                                                                    i13 = 0;
                                                                    while (i13 <= iG4) {
                                                                        vVar2.o(12);
                                                                        if (vVar2.g(i12) > 7) {
                                                                            vVar2.n();
                                                                        }
                                                                        i13++;
                                                                        i12 = 5;
                                                                    }
                                                                    int iG15 = vVar2.g(4);
                                                                    int iG16 = vVar2.g(4);
                                                                    vVar2.o(iG15 + 1);
                                                                    vVar2.o(iG16 + 1);
                                                                    if (vVar2.f()) {
                                                                        i14 = 7;
                                                                        vVar2.o(7);
                                                                    } else {
                                                                        i14 = 7;
                                                                    }
                                                                    vVar2.o(i14);
                                                                    zF2 = vVar2.f();
                                                                    if (zF2) {
                                                                        vVar2.o(2);
                                                                    }
                                                                    if (vVar2.f()) {
                                                                        iG5 = 2;
                                                                        i15 = 1;
                                                                    } else {
                                                                        i15 = 1;
                                                                        iG5 = vVar2.g(1);
                                                                    }
                                                                    if (iG5 > 0 && !vVar2.f()) {
                                                                        vVar2.o(i15);
                                                                    }
                                                                    if (zF2) {
                                                                        vVar2.o(3);
                                                                    }
                                                                    vVar2.o(3);
                                                                    boolean zF5 = vVar2.f();
                                                                    if (iG3 == 2 && zF5) {
                                                                        vVar2.n();
                                                                    }
                                                                    if (iG3 == 1 && vVar2.f()) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    if (vVar2.f()) {
                                                                        int iG17 = vVar2.g(8);
                                                                        int iG18 = vVar2.g(8);
                                                                        int iG19 = vVar2.g(8);
                                                                        if (z2 && iG17 == 1 && iG18 == 13 && iG19 == 0) {
                                                                            iG7 = 1;
                                                                        } else {
                                                                            iG7 = vVar2.g(1);
                                                                        }
                                                                        int iF2 = androidx.media3.common.h.f(iG17);
                                                                        if (iG7 == 1) {
                                                                            i17 = 1;
                                                                        } else {
                                                                            i17 = 2;
                                                                        }
                                                                        i16 = iF2;
                                                                        iG6 = androidx.media3.common.h.g(iG18);
                                                                        i88 = i17;
                                                                    } else {
                                                                        i16 = -1;
                                                                        iG6 = -1;
                                                                    }
                                                                    hVar = new androidx.media3.common.h(i16, i88, iG6, null, i9, i10);
                                                                }
                                                                int i91 = hVar.e;
                                                                int i92 = hVar.f;
                                                                iF = hVar.a;
                                                                int i93 = hVar.b;
                                                                iG = hVar.c;
                                                                i7 = i45;
                                                                i31 = i93;
                                                                i6 = i91;
                                                                i24 = 8;
                                                                str11 = "video/av01";
                                                                i28 = i92;
                                                            }
                                                        } else {
                                                            androidx.media3.common.util.c.k("BoxParsers", "Excessive obu_size");
                                                            hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                        }
                                                    }
                                                    hVar = hVar2;
                                                    int i94 = hVar.e;
                                                    int i95 = hVar.f;
                                                    iF = hVar.a;
                                                    int i96 = hVar.b;
                                                    iG = hVar.c;
                                                    i7 = i45;
                                                    i31 = i96;
                                                    i6 = i94;
                                                    i24 = 8;
                                                    str11 = "video/av01";
                                                    i28 = i95;
                                                }
                                                i10 = i11;
                                                vVar2.o(13);
                                                vVar2.n();
                                                iG2 = vVar2.g(4);
                                                if (iG2 != 1) {
                                                    androidx.media3.common.util.c.k("BoxParsers", "Unsupported obu_type: " + iG2);
                                                    hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                } else if (vVar2.f()) {
                                                    androidx.media3.common.util.c.k("BoxParsers", "Unsupported obu_extension_flag");
                                                    hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                } else {
                                                    zF = vVar2.f();
                                                    vVar2.n();
                                                    if (zF) {
                                                        iG3 = vVar2.g(3);
                                                        vVar2.n();
                                                        if (vVar2.f()) {
                                                            androidx.media3.common.util.c.k("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                        } else if (vVar2.f()) {
                                                            androidx.media3.common.util.c.k("BoxParsers", "Unsupported timing_info_present_flag");
                                                            hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                        } else if (vVar2.f()) {
                                                            androidx.media3.common.util.c.k("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                        } else {
                                                            i12 = 5;
                                                            iG4 = vVar2.g(5);
                                                            i13 = 0;
                                                            while (i13 <= iG4) {
                                                                vVar2.o(12);
                                                                if (vVar2.g(i12) > 7) {
                                                                    vVar2.n();
                                                                }
                                                                i13++;
                                                                i12 = 5;
                                                            }
                                                            int iG110 = vVar2.g(4);
                                                            int iG111 = vVar2.g(4);
                                                            vVar2.o(iG110 + 1);
                                                            vVar2.o(iG111 + 1);
                                                            if (vVar2.f()) {
                                                                i14 = 7;
                                                                vVar2.o(7);
                                                            } else {
                                                                i14 = 7;
                                                            }
                                                            vVar2.o(i14);
                                                            zF2 = vVar2.f();
                                                            if (zF2) {
                                                                vVar2.o(2);
                                                            }
                                                            if (vVar2.f()) {
                                                                iG5 = 2;
                                                                i15 = 1;
                                                            } else {
                                                                i15 = 1;
                                                                iG5 = vVar2.g(1);
                                                            }
                                                            if (iG5 > 0) {
                                                                vVar2.o(i15);
                                                            }
                                                            if (zF2) {
                                                                vVar2.o(3);
                                                            }
                                                            vVar2.o(3);
                                                            boolean zF6 = vVar2.f();
                                                            if (iG3 == 2) {
                                                                vVar2.n();
                                                            }
                                                            if (iG3 == 1) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (vVar2.f()) {
                                                                int iG112 = vVar2.g(8);
                                                                int iG113 = vVar2.g(8);
                                                                int iG114 = vVar2.g(8);
                                                                if (z2) {
                                                                    iG7 = vVar2.g(1);
                                                                } else {
                                                                    iG7 = vVar2.g(1);
                                                                }
                                                                int iF3 = androidx.media3.common.h.f(iG112);
                                                                if (iG7 == 1) {
                                                                    i17 = 1;
                                                                } else {
                                                                    i17 = 2;
                                                                }
                                                                i16 = iF3;
                                                                iG6 = androidx.media3.common.h.g(iG113);
                                                                i88 = i17;
                                                            } else {
                                                                i16 = -1;
                                                                iG6 = -1;
                                                            }
                                                            hVar = new androidx.media3.common.h(i16, i88, iG6, null, i9, i10);
                                                        }
                                                    } else {
                                                        iG3 = vVar2.g(3);
                                                        vVar2.n();
                                                        if (vVar2.f()) {
                                                            androidx.media3.common.util.c.k("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                        } else if (vVar2.f()) {
                                                            androidx.media3.common.util.c.k("BoxParsers", "Unsupported timing_info_present_flag");
                                                            hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                        } else if (vVar2.f()) {
                                                            androidx.media3.common.util.c.k("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            hVar2 = new androidx.media3.common.h(-1, -1, -1, null, i9, i10);
                                                        } else {
                                                            i12 = 5;
                                                            iG4 = vVar2.g(5);
                                                            i13 = 0;
                                                            while (i13 <= iG4) {
                                                                vVar2.o(12);
                                                                if (vVar2.g(i12) > 7) {
                                                                    vVar2.n();
                                                                }
                                                                i13++;
                                                                i12 = 5;
                                                            }
                                                            int iG115 = vVar2.g(4);
                                                            int iG116 = vVar2.g(4);
                                                            vVar2.o(iG115 + 1);
                                                            vVar2.o(iG116 + 1);
                                                            if (vVar2.f()) {
                                                                i14 = 7;
                                                                vVar2.o(7);
                                                            } else {
                                                                i14 = 7;
                                                            }
                                                            vVar2.o(i14);
                                                            zF2 = vVar2.f();
                                                            if (zF2) {
                                                                vVar2.o(2);
                                                            }
                                                            if (vVar2.f()) {
                                                                iG5 = 2;
                                                                i15 = 1;
                                                            } else {
                                                                i15 = 1;
                                                                iG5 = vVar2.g(1);
                                                            }
                                                            if (iG5 > 0) {
                                                                vVar2.o(i15);
                                                            }
                                                            if (zF2) {
                                                                vVar2.o(3);
                                                            }
                                                            vVar2.o(3);
                                                            boolean zF7 = vVar2.f();
                                                            if (iG3 == 2) {
                                                                vVar2.n();
                                                            }
                                                            if (iG3 == 1) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (vVar2.f()) {
                                                                int iG117 = vVar2.g(8);
                                                                int iG118 = vVar2.g(8);
                                                                int iG119 = vVar2.g(8);
                                                                if (z2) {
                                                                    iG7 = vVar2.g(1);
                                                                } else {
                                                                    iG7 = vVar2.g(1);
                                                                }
                                                                int iF4 = androidx.media3.common.h.f(iG117);
                                                                if (iG7 == 1) {
                                                                    i17 = 1;
                                                                } else {
                                                                    i17 = 2;
                                                                }
                                                                i16 = iF4;
                                                                iG6 = androidx.media3.common.h.g(iG118);
                                                                i88 = i17;
                                                            } else {
                                                                i16 = -1;
                                                                iG6 = -1;
                                                            }
                                                            hVar = new androidx.media3.common.h(i16, i88, iG6, null, i9, i10);
                                                        }
                                                    }
                                                    int i97 = hVar.e;
                                                    int i98 = hVar.f;
                                                    iF = hVar.a;
                                                    int i99 = hVar.b;
                                                    iG = hVar.c;
                                                    i7 = i45;
                                                    i31 = i99;
                                                    i6 = i97;
                                                    i24 = 8;
                                                    str11 = "video/av01";
                                                    i28 = i98;
                                                }
                                                hVar = hVar2;
                                                int i910 = hVar.e;
                                                int i911 = hVar.f;
                                                iF = hVar.a;
                                                int i912 = hVar.b;
                                                iG = hVar.c;
                                                i7 = i45;
                                                i31 = i912;
                                                i6 = i910;
                                                i24 = 8;
                                                str11 = "video/av01";
                                                i28 = i911;
                                            } else {
                                                if (iM5 == 1668050025) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferOrder;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(wVar2.w());
                                                    byteBuffer.putShort(wVar2.w());
                                                    byteBufferOrder = byteBuffer;
                                                    i7 = i45;
                                                    str9 = str9;
                                                    i6 = i36;
                                                    oVar = oVar;
                                                } else if (iM5 == 1835295606) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBufferOrder;
                                                    short sW = wVar2.w();
                                                    short sW2 = wVar2.w();
                                                    short sW3 = wVar2.w();
                                                    short sW4 = wVar2.w();
                                                    i7 = i45;
                                                    short sW5 = wVar2.w();
                                                    str9 = str9;
                                                    short sW6 = wVar2.w();
                                                    String str14 = str11;
                                                    short sW7 = wVar2.w();
                                                    i6 = i36;
                                                    short sW8 = wVar2.w();
                                                    long jB = wVar2.B();
                                                    long jB2 = wVar2.B();
                                                    oVar = oVar;
                                                    byteBuffer2.position(1);
                                                    byteBuffer2.putShort(sW5);
                                                    byteBuffer2.putShort(sW6);
                                                    byteBuffer2.putShort(sW);
                                                    byteBuffer2.putShort(sW2);
                                                    byteBuffer2.putShort(sW3);
                                                    byteBuffer2.putShort(sW4);
                                                    byteBuffer2.putShort(sW7);
                                                    byteBuffer2.putShort(sW8);
                                                    byteBuffer2.putShort((short) (jB / 10000));
                                                    byteBuffer2.putShort((short) (jB2 / 10000));
                                                    byteBufferOrder = byteBuffer2;
                                                    str11 = str14;
                                                } else {
                                                    i7 = i45;
                                                    str9 = str9;
                                                    str5 = str11;
                                                    i6 = i36;
                                                    oVar = oVar;
                                                    if (iM5 == 1681012275) {
                                                        androidx.media3.extractor.b.b(null, str5 == null);
                                                        i29 = i29;
                                                        str11 = "video/3gpp";
                                                    } else if (iM5 == 1702061171) {
                                                        androidx.media3.extractor.b.b(null, str5 == null);
                                                        r0 r0VarC = c(i37, wVar2);
                                                        String str15 = (String) r0VarC.z;
                                                        byte[] bArr7 = (byte[]) r0VarC.A;
                                                        if (bArr7 != null) {
                                                            listS = h0.s(bArr7);
                                                        }
                                                        r0Var = r0VarC;
                                                        str11 = str15;
                                                    } else {
                                                        if (iM5 == 1651798644) {
                                                            wVar2.M(i37 + 8);
                                                            wVar2.N(4);
                                                            i29 = i29;
                                                            vVar = new v(wVar2.B(), wVar2.B());
                                                        } else {
                                                            if (iM5 == 1885434736) {
                                                                wVar2.M(i37 + 8);
                                                                fD = wVar2.D() / wVar2.D();
                                                                str11 = str5;
                                                                i31 = i81;
                                                                i24 = 8;
                                                                z3 = true;
                                                            } else if (iM5 == 1937126244) {
                                                                int i100 = i37 + 8;
                                                                while (true) {
                                                                    if (i100 - i37 >= iM4) {
                                                                        bArrCopyOfRange = null;
                                                                        break;
                                                                    }
                                                                    wVar2.M(i100);
                                                                    int iM8 = wVar2.m();
                                                                    if (wVar2.m() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(wVar2.a, i100, iM8 + i100);
                                                                        break;
                                                                    }
                                                                    i100 += iM8;
                                                                }
                                                                i29 = i29;
                                                                bArr = bArrCopyOfRange;
                                                            } else if (iM5 == 1936995172) {
                                                                int iZ15 = wVar2.z();
                                                                wVar2.N(3);
                                                                if (iZ15 == 0) {
                                                                    int iZ16 = wVar2.z();
                                                                    if (iZ16 == 0) {
                                                                        i29 = 0;
                                                                    } else if (iZ16 == 1) {
                                                                        i29 = 1;
                                                                    } else if (iZ16 == 2) {
                                                                        i29 = 2;
                                                                    } else if (iZ16 == 3) {
                                                                        i29 = 3;
                                                                    }
                                                                }
                                                                i29 = i29;
                                                            } else if (iM5 == 1634760259) {
                                                                int i101 = iM4 - 12;
                                                                byte[] bArr8 = new byte[i101];
                                                                wVar2.M(i37 + 12);
                                                                wVar2.k(bArr8, 0, i101);
                                                                byte[] bArr9 = androidx.media3.common.util.f.a;
                                                                com.google.android.material.motion.a.c(i101, "Invalid APV CSD length: %s", i101 >= 17);
                                                                byte b3 = bArr8[0];
                                                                com.google.android.material.motion.a.c(b3, "Invalid APV CSD version: %s", b3 == 1);
                                                                int i102 = bArr8[5] & 255;
                                                                int i103 = bArr8[6] & 255;
                                                                int i104 = bArr8[7] & 255;
                                                                String str16 = j0.a;
                                                                Locale locale2 = Locale.US;
                                                                StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("apv1.apvf", ".apvl", i102, ".apvb", i103);
                                                                sbW.append(i104);
                                                                string = sbW.toString();
                                                                listS = h0.s(bArr8);
                                                                w wVar3 = new w(bArr8);
                                                                androidx.media3.common.util.v vVar3 = new androidx.media3.common.util.v(bArr8, i101);
                                                                i24 = 8;
                                                                vVar3.m(wVar3.b * 8);
                                                                vVar3.p(1);
                                                                int iG20 = vVar3.g(8);
                                                                int i105 = 0;
                                                                int i106 = -1;
                                                                int i107 = -1;
                                                                int i108 = -1;
                                                                int i109 = -1;
                                                                int i110 = -1;
                                                                while (i105 < iG20) {
                                                                    vVar3.p(1);
                                                                    int iG21 = vVar3.g(8);
                                                                    int i111 = i110;
                                                                    int i112 = i109;
                                                                    int iG22 = i108;
                                                                    int iG23 = i107;
                                                                    int i113 = i106;
                                                                    int i114 = 0;
                                                                    while (i114 < iG21) {
                                                                        vVar3.o(6);
                                                                        boolean zF8 = vVar3.f();
                                                                        vVar3.n();
                                                                        vVar3.p(i86);
                                                                        vVar3.o(4);
                                                                        iG22 = vVar3.g(4) + 8;
                                                                        vVar3.p(1);
                                                                        if (zF8) {
                                                                            int iG24 = vVar3.g(8);
                                                                            int iG25 = vVar3.g(8);
                                                                            vVar3.p(1);
                                                                            boolean zF9 = vVar3.f();
                                                                            int iF5 = androidx.media3.common.h.f(iG24);
                                                                            i112 = zF9 ? 1 : 2;
                                                                            iG23 = androidx.media3.common.h.g(iG25);
                                                                            i111 = iF5;
                                                                        }
                                                                        i114++;
                                                                        i113 = iG22;
                                                                        i86 = 11;
                                                                    }
                                                                    i105++;
                                                                    i106 = i113;
                                                                    i107 = iG23;
                                                                    i108 = iG22;
                                                                    i109 = i112;
                                                                    i110 = i111;
                                                                    i86 = 11;
                                                                }
                                                                str11 = "video/apv";
                                                                iG = i107;
                                                                i6 = i108;
                                                                i31 = i109;
                                                                iF = i110;
                                                                i29 = i29;
                                                                i28 = i106;
                                                            } else {
                                                                i24 = 8;
                                                                if (iM5 == 1668246642) {
                                                                    i8 = iG;
                                                                    if (iF == -1 && i8 == -1) {
                                                                        int iM9 = wVar2.m();
                                                                        if (iM9 == 1852009592 || iM9 == 1852009571) {
                                                                            int iG26 = wVar2.G();
                                                                            int iG27 = wVar2.G();
                                                                            wVar2.N(2);
                                                                            boolean z7 = iM4 == 19 && (wVar2.z() & 128) != 0;
                                                                            iF = androidx.media3.common.h.f(iG26);
                                                                            i31 = z7 ? 1 : 2;
                                                                            iG = androidx.media3.common.h.g(iG27);
                                                                            str11 = str5;
                                                                        } else {
                                                                            androidx.media3.common.util.c.t("BoxParsers", "Unsupported color type: ".concat(androidx.media3.container.f.d(iM9)));
                                                                        }
                                                                    }
                                                                } else {
                                                                    i8 = iG;
                                                                }
                                                                iG = i8;
                                                            }
                                                            i29 = i29;
                                                            i28 = i5;
                                                        }
                                                        str11 = str5;
                                                    }
                                                }
                                                i31 = i81;
                                                i24 = 8;
                                                i29 = i29;
                                                i28 = i5;
                                            }
                                        }
                                        str11 = str5;
                                        i31 = i81;
                                        i28 = i5;
                                    }
                                    i31 = i81;
                                    i28 = i5;
                                    i24 = 8;
                                }
                            }
                        }
                        i27 = i38 + iM4;
                        i24 = i24;
                        iM3 = i7;
                        iM2 = i39;
                        str9 = str9;
                        i30 = iG;
                        i36 = i6;
                        oVar = oVar;
                        b = 3;
                        str10 = null;
                    }
                    string = str6;
                    i27 = i38 + iM4;
                    i24 = i24;
                    iM3 = i7;
                    iM2 = i39;
                    str9 = str9;
                    i30 = iG;
                    i36 = i6;
                    oVar = oVar;
                    b = 3;
                    str10 = null;
                }
                int i115 = i28;
                int i116 = i29;
                i4 = iM2;
                String str17 = str11;
                int i117 = i36;
                int i118 = i31;
                int i119 = i30;
                if (aVarE != null) {
                    str3 = aVarE.e;
                    str4 = "video/dolby-vision";
                } else {
                    str3 = string;
                    str4 = str17;
                }
                if (str4 == null) {
                    str8 = str;
                } else {
                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                    qVar.a = Integer.toString(i2);
                    qVar.n = i0.p(str4);
                    qVar.j = str3;
                    qVar.u = iG8;
                    qVar.v = iG9;
                    qVar.w = i35;
                    qVar.x = i34;
                    qVar.A = fD;
                    qVar.z = i25;
                    qVar.B = bArr;
                    qVar.C = i116;
                    qVar.q = listS;
                    qVar.p = i33;
                    qVar.E = i32;
                    qVar.r = mVar3;
                    str8 = str;
                    qVar.d = str8;
                    qVar.D = new androidx.media3.common.h(iF, i118, i119, byteBufferOrder != null ? byteBufferOrder.array() : null, i117, i115);
                    v vVar4 = vVar;
                    if (vVar4 != null) {
                        qVar.h = a0.C(vVar4.a);
                        qVar.i = a0.C(vVar4.b);
                    } else {
                        r0 r0Var2 = r0Var;
                        if (r0Var2 != null) {
                            qVar.h = a0.C(r0Var2.e);
                            qVar.i = a0.C(r0Var2.y);
                        }
                    }
                    eVar.e = new androidx.media3.common.r(qVar);
                }
            } else {
                if (iM3 == 1836069985 || iM3 == 1701733217 || iM3 == 1633889587 || iM3 == 1700998451 || iM3 == 1633889588 || iM3 == 1835823201 || iM3 == 1685353315 || iM3 == 1685353317 || iM3 == 1685353320 || iM3 == 1685353324 || iM3 == 1685353336 || iM3 == 1935764850 || iM3 == 1935767394 || iM3 == 1819304813 || iM3 == 1936684916 || iM3 == 1953984371 || iM3 == 778924082 || iM3 == 778924083 || iM3 == 1835557169 || iM3 == 1835560241 || iM3 == 1634492771 || iM3 == 1634492791 || iM3 == 1970037111 || iM3 == 1332770163 || iM3 == 1716281667 || iM3 == 1767992678 || iM3 == 1768973165 || iM3 == 1718641517) {
                    wVar2 = wVar;
                    i23 = i23;
                    b(wVar2, iM3, i23, iM2, dVar2.a, str8, z, mVar, eVar, i22);
                    str8 = str;
                } else if (iM3 == 1414810956 || iM3 == 1954034535 || iM3 == 2004251764 || iM3 == 1937010800 || iM3 == 1664495672 || iM3 == 1836070003) {
                    wVar2.M(i23 + 16);
                    String str18 = "application/ttml+xml";
                    long j2 = Long.MAX_VALUE;
                    if (iM3 != 1414810956) {
                        if (iM3 == 1954034535) {
                            int i120 = iM2 - 16;
                            byte[] bArr10 = new byte[i120];
                            wVar2.k(bArr10, 0, i120);
                            a1VarS = h0.s(bArr10);
                            str18 = "application/x-quicktime-tx3g";
                            i20 = i23;
                        } else {
                            if (iM3 == 2004251764) {
                                str18 = "application/x-mp4-vtt";
                            } else if (iM3 == 1937010800) {
                                j2 = 0;
                            } else if (iM3 == 1664495672) {
                                eVar.c = 1;
                                str18 = "application/x-mp4-cea-608";
                            } else {
                                if (iM3 != 1836070003) {
                                    org.mozilla.javascript.c.a();
                                    return null;
                                }
                                int i121 = wVar2.b;
                                wVar2.N(4);
                                if (wVar2.m() == 1702061171) {
                                    byte[] bArr11 = (byte[]) c(i121, wVar2).A;
                                    if (bArr11 == null || bArr11.length != 64) {
                                        i20 = i23;
                                    } else {
                                        int i122 = dVar2.d;
                                        int i123 = dVar2.e;
                                        com.google.android.material.motion.a.q(bArr11.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i124 = 0;
                                        while (i124 < bArr11.length - 3) {
                                            byte[] bArr12 = bArr11;
                                            int iP = a0.p(bArr11[i124], bArr11[i124 + 1], bArr11[i124 + 2], bArr12[i124 + 3]);
                                            int i125 = (iP >> 16) & 255;
                                            int i126 = ((iP >> 8) & 255) - 128;
                                            int i127 = (iP & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(j0.j(((i127 * 17790) / 10000) + i125, 0, 255) | (j0.j((i125 - ((i127 * 3455) / 10000)) - ((i126 * 7169) / 10000), 0, 255) << 8) | (j0.j(((i126 * 14075) / 10000) + i125, 0, 255) << 16))));
                                            i124 += 4;
                                            bArr11 = bArr12;
                                            i23 = i23;
                                        }
                                        i20 = i23;
                                        StringBuilder sbW2 = androidx.privacysandbox.ads.adservices.java.internal.a.w("size: ", "x", i122, "\npalette: ", i123);
                                        sbW2.append(new androidx.media3.container.a(", ").d(arrayList));
                                        sbW2.append("\n");
                                        String string2 = sbW2.toString();
                                        String str19 = j0.a;
                                        a1VarS = h0.s(string2.getBytes(StandardCharsets.UTF_8));
                                        str7 = "application/vobsub";
                                    }
                                } else {
                                    i20 = i23;
                                    str7 = null;
                                    a1VarS = null;
                                }
                                str18 = str7;
                            }
                            i20 = i23;
                            a1VarS = null;
                        }
                        j = j2;
                        if (str18 != null) {
                            androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                            qVar2.a = Integer.toString(i21);
                            qVar2.n = i0.p(str18);
                            qVar2.d = str8;
                            qVar2.s = j;
                            qVar2.q = a1VarS;
                            eVar.e = new androidx.media3.common.r(qVar2);
                        }
                    } else {
                        i20 = i23;
                        a1VarS = null;
                        j = j2;
                        if (str18 != null) {
                            androidx.media3.common.q qVar3 = new androidx.media3.common.q();
                            qVar3.a = Integer.toString(i21);
                            qVar3.n = i0.p(str18);
                            qVar3.d = str8;
                            qVar3.s = j;
                            qVar3.q = a1VarS;
                            eVar.e = new androidx.media3.common.r(qVar3);
                        }
                    }
                    wVar2 = wVar;
                    i4 = iM2;
                    i = i22;
                    i2 = i21;
                    i3 = iM;
                    i23 = i20;
                } else if (iM3 == 1835365492) {
                    wVar2.M(i23 + 16);
                    if (iM3 == 1835365492) {
                        wVar2.u();
                        String strU = wVar2.u();
                        if (strU != null) {
                            androidx.media3.common.q qVar4 = new androidx.media3.common.q();
                            qVar4.a = Integer.toString(i21);
                            qVar4.n = i0.p(strU);
                            eVar.e = new androidx.media3.common.r(qVar4);
                        }
                    }
                } else if (iM3 == 1667329389) {
                    androidx.media3.common.q qVar5 = new androidx.media3.common.q();
                    qVar5.a = Integer.toString(i21);
                    qVar5.n = i0.p("application/x-camera-motion");
                    eVar.e = new androidx.media3.common.r(qVar5);
                }
                i23 = i23;
                i4 = iM2;
                i = i22;
                i2 = i21;
                i3 = iM;
            }
            wVar2.M(i23 + i4);
            i22 = i + 1;
            dVar2 = dVar;
            i21 = i2;
            iM = i3;
        }
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f7 A[EDGE_INSN: B:106:0x01f7->B:105:0x01f4 BREAK  A[LOOP:18: B:96:0x01d7->B:107:0x0203]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0203 A[LOOP:18: B:96:0x01d7->B:107:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0230  */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:123:0x025a  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0303  */
    /* JADX WARN: Code duplicated, block: B:157:0x030d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0321  */
    /* JADX WARN: Code duplicated, block: B:214:0x049b  */
    /* JADX WARN: Code duplicated, block: B:217:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:220:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:223:0x04b6 A[LOOP:1: B:221:0x04b0->B:223:0x04b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x04c9 A[LOOP:2: B:225:0x04c7->B:226:0x04c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:231:0x04fe A[LOOP:4: B:230:0x04fc->B:231:0x04fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x0541  */
    /* JADX WARN: Code duplicated, block: B:237:0x0545  */
    /* JADX WARN: Code duplicated, block: B:239:0x0549  */
    /* JADX WARN: Code duplicated, block: B:241:0x054d  */
    /* JADX WARN: Code duplicated, block: B:244:0x055e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0561  */
    /* JADX WARN: Code duplicated, block: B:247:0x0564  */
    /* JADX WARN: Code duplicated, block: B:250:0x056a  */
    /* JADX WARN: Code duplicated, block: B:251:0x056d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0573  */
    /* JADX WARN: Code duplicated, block: B:255:0x0576  */
    /* JADX WARN: Code duplicated, block: B:258:0x057c  */
    /* JADX WARN: Code duplicated, block: B:259:0x057f  */
    /* JADX WARN: Code duplicated, block: B:262:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:264:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:266:0x05aa A[LOOP:14: B:263:0x05a2->B:266:0x05aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x05c8 A[EDGE_INSN: B:271:0x05c8->B:303:0x067f BREAK  A[LOOP:13: B:261:0x059e->B:301:0x0661]] */
    /* JADX WARN: Code duplicated, block: B:272:0x05e3 A[EDGE_INSN: B:272:0x05e3->B:303:0x067f BREAK  A[LOOP:13: B:261:0x059e->B:301:0x0661]] */
    /* JADX WARN: Code duplicated, block: B:273:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:275:0x05f1 A[ADDED_TO_REGION, LOOP:15: B:275:0x05f1->B:277:0x05f5, LOOP_START, PHI: r3 r23 r24
  0x05f1: PHI (r3v14 int) = (r3v12 int), (r3v15 int) binds: [B:274:0x05ef, B:277:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x05f1: PHI (r23v10 int) = (r23v8 int), (r23v12 int) binds: [B:274:0x05ef, B:277:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x05f1: PHI (r24v8 int) = (r24v4 int), (r24v9 int) binds: [B:274:0x05ef, B:277:0x05f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x060f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0612  */
    /* JADX WARN: Code duplicated, block: B:285:0x0620  */
    /* JADX WARN: Code duplicated, block: B:286:0x0622  */
    /* JADX WARN: Code duplicated, block: B:289:0x0627  */
    /* JADX WARN: Code duplicated, block: B:290:0x0633  */
    /* JADX WARN: Code duplicated, block: B:295:0x063e  */
    /* JADX WARN: Code duplicated, block: B:296:0x064a  */
    /* JADX WARN: Code duplicated, block: B:305:0x0684 A[DONT_INVERT, LOOP:16: B:305:0x0684->B:309:0x068e, LOOP_START, PHI: r24
  0x0684: PHI (r24v5 int) = (r24v4 int), (r24v6 int) binds: [B:304:0x0682, B:309:0x068e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:306:0x0686  */
    /* JADX WARN: Code duplicated, block: B:309:0x068e A[LOOP:16: B:305:0x0684->B:309:0x068e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:310:0x0694 A[EDGE_INSN: B:310:0x0694->B:311:0x0695 BREAK  A[LOOP:16: B:305:0x0684->B:309:0x068e]] */
    /* JADX WARN: Code duplicated, block: B:317:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:319:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:320:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:325:0x0700  */
    /* JADX WARN: Code duplicated, block: B:332:0x0742 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x0744  */
    /* JADX WARN: Code duplicated, block: B:336:0x0756  */
    /* JADX WARN: Code duplicated, block: B:338:0x075c  */
    /* JADX WARN: Code duplicated, block: B:344:0x077d  */
    /* JADX WARN: Code duplicated, block: B:347:0x0784  */
    /* JADX WARN: Code duplicated, block: B:349:0x078a  */
    /* JADX WARN: Code duplicated, block: B:353:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:382:0x0867  */
    /* JADX WARN: Code duplicated, block: B:385:0x0873  */
    /* JADX WARN: Code duplicated, block: B:394:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:395:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:399:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:401:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:404:0x0909  */
    /* JADX WARN: Code duplicated, block: B:406:0x090f  */
    /* JADX WARN: Code duplicated, block: B:407:0x0911  */
    /* JADX WARN: Code duplicated, block: B:414:0x0925  */
    /* JADX WARN: Code duplicated, block: B:420:0x0938  */
    /* JADX WARN: Code duplicated, block: B:425:0x0946  */
    /* JADX WARN: Code duplicated, block: B:430:0x095c  */
    /* JADX WARN: Code duplicated, block: B:431:0x095e  */
    /* JADX WARN: Code duplicated, block: B:433:0x0966  */
    /* JADX WARN: Code duplicated, block: B:437:0x0984  */
    /* JADX WARN: Code duplicated, block: B:438:0x0986  */
    /* JADX WARN: Code duplicated, block: B:441:0x098c  */
    /* JADX WARN: Code duplicated, block: B:442:0x098f  */
    /* JADX WARN: Code duplicated, block: B:444:0x0992  */
    /* JADX WARN: Code duplicated, block: B:445:0x0995  */
    /* JADX WARN: Code duplicated, block: B:447:0x0998  */
    /* JADX WARN: Code duplicated, block: B:449:0x099c  */
    /* JADX WARN: Code duplicated, block: B:450:0x099f  */
    /* JADX WARN: Code duplicated, block: B:452:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:453:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:457:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:459:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:462:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:464:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:467:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a0b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:479:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:499:0x078d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x091b A[EDGE_INSN: B:505:0x091b->B:411:0x091b BREAK  A[LOOP:8: B:402:0x0906->B:410:0x0918], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0918 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0932 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0953 A[ADDED_TO_REGION, EDGE_INSN: B:510:0x0953->B:428:0x0953 BREAK  A[LOOP:10: B:423:0x0940->B:427:0x094c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0a1c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0672 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x05c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x05bb A[EDGE_INSN: B:524:0x05bb->B:267:0x05bb BREAK  A[LOOP:14: B:263:0x05a2->B:266:0x05aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0694 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x068c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    public static ArrayList j(androidx.media3.container.d dVar, androidx.media3.extractor.v vVar, long j, androidx.media3.common.m mVar, boolean z, boolean z2, com.google.common.base.f fVar, boolean z3) {
        int i;
        int i2;
        long j2;
        long jY;
        long jB;
        ArrayList arrayList;
        int i3;
        d dVar2;
        long j3;
        long j4;
        long j5;
        long jY2;
        w wVar;
        int iE;
        int i4;
        long jB2;
        int i5;
        int i6;
        int i7;
        long j6;
        char[] cArr;
        int i8;
        String str;
        androidx.media3.container.e eVarP;
        androidx.compose.ui.text.android.selection.e eVarI;
        long[] jArr;
        long[] jArr2;
        androidx.media3.common.r rVar;
        int i9;
        androidx.media3.common.r rVar2;
        r rVar3;
        androidx.media3.container.c cVar;
        androidx.media3.common.h0 h0Var;
        androidx.media3.common.h0 h0Var2;
        androidx.media3.container.d dVarO;
        Pair pairCreate;
        char c;
        long jF;
        long j7;
        c hVar;
        boolean z4;
        int iD;
        int iD2;
        int iD3;
        int iH;
        w wVar2;
        boolean z5;
        ArrayList arrayList2;
        boolean z6;
        long[] jArr3;
        c cVar2;
        int[] iArr;
        long[] jArr4;
        int[] iArrCopyOf;
        int i10;
        int i11;
        int i12;
        long j8;
        long j9;
        long j10;
        int i13;
        int iM;
        int i14;
        int iD4;
        int iM2;
        int iD5;
        int iD6;
        w wVar3;
        int i15;
        int i16;
        long[] jArr5;
        long[] jArrCopyOf;
        int i17;
        int[] iArr2;
        boolean z7;
        String str2;
        int i18;
        int i19;
        int[] iArr3;
        long j11;
        long j12;
        boolean zA;
        int i20;
        int iS;
        int[] iArr4;
        int i21;
        long[] jArr6;
        int i22;
        int i23;
        long[] jArr7;
        int[] iArr5;
        long[] jArr8;
        long j13;
        int i24;
        long j14;
        androidx.media3.common.r rVar4;
        long[] jArr9;
        long[] jArr10;
        long jY3;
        int[] iArrF;
        long[] jArr11;
        ArrayList arrayList3;
        long j15;
        int[] iArr6;
        int i25;
        boolean z8;
        int[] iArr7;
        int[] iArr8;
        ArrayList arrayList4;
        int i26;
        int i27;
        int i28;
        boolean z9;
        int[] iArr9;
        long[] jArr12;
        boolean z10;
        boolean z11;
        long[] jArr13;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList5;
        long[] jArr14;
        int i29;
        boolean z12;
        int i30;
        long j16;
        androidx.media3.common.r rVar5;
        u uVar;
        long j17;
        int i31;
        boolean z13;
        int i32;
        int i33;
        int i34;
        long jY4;
        int[] iArr12;
        int i35;
        long j18;
        int[] iArr13;
        long jY5;
        int iB;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z14;
        int i41;
        u uVar2;
        long j19;
        int i42;
        long jY6;
        long jY7;
        int i43;
        long[] jArr15;
        int[] iArr14;
        long j20;
        int i44;
        int i45;
        int iG;
        int[] iArr15;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        long j21;
        int iMax;
        int i51;
        int i52;
        androidx.media3.container.d dVar3 = dVar;
        ArrayList arrayList6 = new ArrayList();
        int i53 = 0;
        for (ArrayList arrayList7 = dVar3.B; i53 < arrayList7.size(); arrayList7 = arrayList) {
            androidx.media3.container.d dVar4 = (androidx.media3.container.d) arrayList7.get(i53);
            if (dVar4.y != 1953653099) {
                arrayList = arrayList7;
                arrayList6 = arrayList6;
                i2 = i53;
            } else {
                androidx.media3.container.e eVarP2 = dVar3.p(1836476516);
                eVarP2.getClass();
                androidx.media3.container.d dVarO2 = dVar4.o(1835297121);
                dVarO2.getClass();
                androidx.media3.container.e eVarP3 = dVarO2.p(1751411826);
                eVarP3.getClass();
                w wVar4 = eVarP3.z;
                wVar4.M(16);
                int iM3 = wVar4.m();
                if (iM3 == 1936684398) {
                    i = 1;
                } else if (iM3 == 1986618469) {
                    i = 2;
                } else if (iM3 == 1952807028 || iM3 == 1935832172 || iM3 == 1937072756 || iM3 == 1668047728 || iM3 == 1937072752) {
                    i = 3;
                } else {
                    i = iM3 == 1835365473 ? 5 : -1;
                }
                int i54 = 1;
                i2 = i53;
                if (i == -1) {
                    arrayList = arrayList7;
                    rVar3 = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    androidx.media3.container.e eVarP4 = dVar4.p(1953196132);
                    eVarP4.getClass();
                    w wVar5 = eVarP4.z;
                    wVar5.M(8);
                    int iE2 = e(wVar5.m());
                    wVar5.N(iE2 != 0 ? 16 : 8);
                    int iM4 = wVar5.m();
                    wVar5.N(4);
                    int i55 = wVar5.b;
                    int i56 = iE2 == 0 ? 4 : 8;
                    int i57 = 0;
                    while (true) {
                        jY = -9223372036854775807L;
                        if (i57 >= i56) {
                            wVar5.N(i56);
                        } else {
                            if (wVar5.a[i55 + i57] != -1) {
                                jB = iE2 == 0 ? wVar5.B() : wVar5.F();
                                if (jB != 0) {
                                    break;
                                }
                                break;
                            }
                            i57++;
                        }
                        jB = -9223372036854775807L;
                        break;
                    }
                    wVar5.N(10);
                    int iG2 = wVar5.G();
                    wVar5.N(4);
                    int iM5 = wVar5.m();
                    int iM6 = wVar5.m();
                    wVar5.N(4);
                    int iM7 = wVar5.m();
                    int iM8 = wVar5.m();
                    if (iM5 == 0 && iM6 == 65536) {
                        arrayList = arrayList7;
                        if ((iM7 == -65536 || iM7 == 65536) && iM8 == 0) {
                            i3 = 90;
                        }
                        wVar5.N(16);
                        short sW = wVar5.w();
                        wVar5.N(2);
                        short sW2 = wVar5.w();
                        dVar2 = new d();
                        dVar2.a = iM4;
                        dVar2.b = iG2;
                        dVar2.c = i3;
                        dVar2.d = sW;
                        dVar2.e = sW2;
                        if (j == -9223372036854775807L) {
                            j3 = jB;
                        } else {
                            j3 = j;
                        }
                        j4 = g(eVarP2.z).c;
                        if (j3 == -9223372036854775807L) {
                            j5 = j4;
                            jY2 = -9223372036854775807L;
                        } else {
                            String str3 = j0.a;
                            j5 = j4;
                            jY2 = j0.Y(j3, 1000000L, j5, RoundingMode.DOWN);
                        }
                        androidx.media3.container.d dVarO3 = dVarO2.o(1835626086);
                        dVarO3.getClass();
                        androidx.media3.container.d dVarO4 = dVarO3.o(1937007212);
                        dVarO4.getClass();
                        androidx.media3.container.e eVarP5 = dVarO2.p(1835296868);
                        eVarP5.getClass();
                        wVar = eVarP5.z;
                        wVar.M(8);
                        iE = e(wVar.m());
                        if (iE == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        wVar.N(i4);
                        jB2 = wVar.B();
                        i5 = wVar.b;
                        if (iE == 0) {
                            i6 = 4;
                        } else {
                            i6 = 8;
                        }
                        i7 = 0;
                        while (true) {
                            if (i7 < i6) {
                                wVar.N(i6);
                                break;
                            }
                            if (wVar.a[i5 + i7] != -1) {
                                if (iE == 0) {
                                    jF = wVar.B();
                                } else {
                                    jF = wVar.F();
                                }
                                j7 = jF;
                                if (j7 != 0) {
                                    break;
                                }
                                String str4 = j0.a;
                                jY = j0.Y(j7, 1000000L, jB2, RoundingMode.DOWN);
                                break;
                            }
                            i7++;
                        }
                        j6 = jY;
                        int iG3 = wVar.G();
                        cArr = new char[]{(char) (((iG3 >> 10) & 31) + 96), (char) (((iG3 >> 5) & 31) + 96), (char) ((iG3 & 31) + 96)};
                        i8 = 0;
                        while (true) {
                            if (i8 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c = cArr[i8];
                            if (c >= 'a' || c > 'z') {
                                str = null;
                                break;
                            }
                            i8++;
                        }
                        eVarP = dVarO4.p(1937011556);
                        if (eVarP == null) {
                            androidx.media3.common.util.c.t("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            eVarI = i(eVarP.z, dVar2, str, mVar, z2);
                            if (!z || (dVarO = dVar4.o(1701082227)) == null) {
                                jArr = null;
                                jArr2 = null;
                            } else {
                                androidx.media3.container.e eVarP6 = dVarO.p(1701606260);
                                if (eVarP6 == null) {
                                    pairCreate = null;
                                } else {
                                    w wVar6 = eVarP6.z;
                                    wVar6.M(8);
                                    int iE3 = e(wVar6.m());
                                    int iD7 = wVar6.D();
                                    long[] jArr16 = new long[iD7];
                                    long[] jArr17 = new long[iD7];
                                    int i58 = 0;
                                    while (i58 < iD7) {
                                        int i59 = i54;
                                        jArr16[i58] = iE3 == i59 ? wVar6.F() : wVar6.B();
                                        jArr17[i58] = iE3 == i59 ? wVar6.t() : wVar6.m();
                                        if (wVar6.w() != 1) {
                                            net.luminis.tls.engine.impl.c.o("Unsupported media rate.");
                                            return null;
                                        }
                                        wVar6.N(2);
                                        i58++;
                                        i54 = 1;
                                    }
                                    pairCreate = Pair.create(jArr16, jArr17);
                                }
                                if (pairCreate != null) {
                                    long[] jArr18 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr18;
                                } else {
                                    jArr = null;
                                    jArr2 = null;
                                }
                            }
                            rVar = (androidx.media3.common.r) eVarI.e;
                            if (rVar == null) {
                                i9 = dVar2.b;
                                if (i9 != 0) {
                                    cVar = new androidx.media3.container.c(i9);
                                    androidx.media3.common.q qVarA = rVar.a();
                                    h0Var = ((androidx.media3.common.r) eVarI.e).l;
                                    if (h0Var != null) {
                                        h0Var2 = h0Var.a(cVar);
                                    } else {
                                        h0Var2 = new androidx.media3.common.h0(cVar);
                                    }
                                    qVarA.k = h0Var2;
                                    rVar2 = new androidx.media3.common.r(qVarA);
                                } else {
                                    rVar2 = rVar;
                                }
                                rVar3 = new r(dVar2.a, i, jB2, j5, jY2, j6, rVar2, eVarI.c, (s[]) eVarI.d, eVarI.b, jArr, jArr2);
                            }
                        }
                        rVar3 = null;
                    } else {
                        arrayList = arrayList7;
                    }
                    i3 = (iM5 == 0 && iM6 == -65536 && (iM7 == 65536 || iM7 == -65536) && iM8 == 0) ? 270 : ((iM5 == -65536 || iM5 == 65536) && iM6 == 0 && iM7 == 0 && iM8 == -65536) ? 180 : 0;
                    wVar5.N(16);
                    short sW3 = wVar5.w();
                    wVar5.N(2);
                    short sW4 = wVar5.w();
                    dVar2 = new d();
                    dVar2.a = iM4;
                    dVar2.b = iG2;
                    dVar2.c = i3;
                    dVar2.d = sW3;
                    dVar2.e = sW4;
                    if (j == -9223372036854775807L) {
                        j3 = jB;
                    } else {
                        j3 = j;
                    }
                    j4 = g(eVarP2.z).c;
                    if (j3 == -9223372036854775807L) {
                        j5 = j4;
                        jY2 = -9223372036854775807L;
                    } else {
                        String str5 = j0.a;
                        j5 = j4;
                        jY2 = j0.Y(j3, 1000000L, j5, RoundingMode.DOWN);
                    }
                    androidx.media3.container.d dVarO5 = dVarO2.o(1835626086);
                    dVarO5.getClass();
                    androidx.media3.container.d dVarO6 = dVarO5.o(1937007212);
                    dVarO6.getClass();
                    androidx.media3.container.e eVarP7 = dVarO2.p(1835296868);
                    eVarP7.getClass();
                    wVar = eVarP7.z;
                    wVar.M(8);
                    iE = e(wVar.m());
                    if (iE == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    wVar.N(i4);
                    jB2 = wVar.B();
                    i5 = wVar.b;
                    if (iE == 0) {
                        i6 = 4;
                    } else {
                        i6 = 8;
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < i6) {
                            wVar.N(i6);
                            break;
                        }
                        if (wVar.a[i5 + i7] != -1) {
                            if (iE == 0) {
                                jF = wVar.B();
                            } else {
                                jF = wVar.F();
                            }
                            j7 = jF;
                            if (j7 != 0) {
                                break;
                            }
                            String str6 = j0.a;
                            jY = j0.Y(j7, 1000000L, jB2, RoundingMode.DOWN);
                            break;
                        }
                        i7++;
                    }
                    j6 = jY;
                    int iG4 = wVar.G();
                    cArr = new char[]{(char) (((iG4 >> 10) & 31) + 96), (char) (((iG4 >> 5) & 31) + 96), (char) ((iG4 & 31) + 96)};
                    i8 = 0;
                    while (true) {
                        if (i8 < 3) {
                            c = cArr[i8];
                            if (c >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i8++;
                    }
                    eVarP = dVarO6.p(1937011556);
                    if (eVarP == null) {
                        androidx.media3.common.util.c.t("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        eVarI = i(eVarP.z, dVar2, str, mVar, z2);
                        if (z) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                        rVar = (androidx.media3.common.r) eVarI.e;
                        if (rVar == null) {
                            i9 = dVar2.b;
                            if (i9 != 0) {
                                cVar = new androidx.media3.container.c(i9);
                                androidx.media3.common.q qVarA2 = rVar.a();
                                h0Var = ((androidx.media3.common.r) eVarI.e).l;
                                if (h0Var != null) {
                                    h0Var2 = h0Var.a(cVar);
                                } else {
                                    h0Var2 = new androidx.media3.common.h0(cVar);
                                }
                                qVarA2.k = h0Var2;
                                rVar2 = new androidx.media3.common.r(qVarA2);
                            } else {
                                rVar2 = rVar;
                            }
                            rVar3 = new r(dVar2.a, i, jB2, j5, jY2, j6, rVar2, eVarI.c, (s[]) eVarI.d, eVarI.b, jArr, jArr2);
                        }
                    }
                    rVar3 = null;
                }
                r rVarA = (r) fVar.apply(rVar3);
                if (rVarA == null) {
                    arrayList6 = arrayList6;
                } else {
                    androidx.media3.common.r rVar6 = rVarA.g;
                    androidx.media3.container.d dVarO7 = dVar4.o(1835297121);
                    dVarO7.getClass();
                    androidx.media3.container.d dVarO8 = dVarO7.o(1835626086);
                    dVarO8.getClass();
                    androidx.media3.container.d dVarO9 = dVarO8.o(1937007212);
                    dVarO9.getClass();
                    androidx.media3.container.e eVarP8 = dVarO9.p(1937011578);
                    if (eVarP8 != null) {
                        hVar = new u2(eVarP8, rVar6);
                    } else {
                        androidx.media3.container.e eVarP9 = dVarO9.p(1937013298);
                        if (eVarP9 == null) {
                            throw androidx.media3.common.j0.a(null, "Track has no sample table size information");
                        }
                        hVar = new androidx.compose.ui.text.input.h(eVarP9);
                    }
                    int iR = hVar.r();
                    if (iR == 0) {
                        uVar = new u(rVarA, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (rVarA.b == 2) {
                            long j22 = rVarA.f;
                            if (j22 > j2) {
                                androidx.media3.common.q qVarA3 = rVar6.a();
                                qVarA3.y = iR / (j22 / 1000000.0f);
                                rVarA = rVarA.a(new androidx.media3.common.r(qVarA3));
                            }
                        }
                        androidx.media3.common.r rVar7 = rVarA.g;
                        androidx.media3.container.e eVarP10 = dVarO9.p(1937007471);
                        if (eVarP10 == null) {
                            eVarP10 = dVarO9.p(1668232756);
                            eVarP10.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        w wVar7 = eVarP10.z;
                        androidx.media3.container.e eVarP11 = dVarO9.p(1937011555);
                        eVarP11.getClass();
                        w wVar8 = eVarP11.z;
                        androidx.media3.container.e eVarP12 = dVarO9.p(1937011827);
                        eVarP12.getClass();
                        w wVar9 = eVarP12.z;
                        androidx.media3.container.e eVarP13 = dVarO9.p(1937011571);
                        w wVar10 = eVarP13 != null ? eVarP13.z : null;
                        androidx.media3.container.e eVarP14 = dVarO9.p(1668576371);
                        w wVar11 = eVarP14 != null ? eVarP14.z : null;
                        b bVar = new b(wVar8, wVar7, z4);
                        wVar9.M(12);
                        int iD8 = wVar9.D() - 1;
                        int iD9 = wVar9.D();
                        int iD10 = wVar9.D();
                        if (wVar11 != null) {
                            wVar11.M(12);
                            iD = wVar11.D();
                        } else {
                            iD = 0;
                        }
                        if (wVar10 != null) {
                            wVar10.M(12);
                            iD2 = wVar10.D();
                            if (iD2 > 0) {
                                iD3 = wVar10.D() - 1;
                            } else {
                                wVar10 = null;
                            }
                            iH = hVar.h();
                            wVar2 = wVar11;
                            String str7 = rVar7.o;
                            if (iH == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && iD8 == 0 && iD == 0 && iD2 == 0)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (wVar10 == null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                                i43 = bVar.a;
                                jArr15 = new long[i43];
                                iArr14 = new int[i43];
                                while (bVar.a()) {
                                    int i60 = bVar.b;
                                    jArr15[i60] = bVar.d;
                                    iArr14[i60] = bVar.c;
                                }
                                j20 = iD10;
                                i44 = 8192 / iH;
                                iG = 0;
                                for (i45 = 0; i45 < i43; i45++) {
                                    iG += j0.g(iArr14[i45], i44);
                                }
                                jArr5 = new long[iG];
                                iArr2 = new int[iG];
                                jArrCopyOf = new long[iG];
                                iArr15 = new int[iG];
                                i46 = 0;
                                i47 = 0;
                                i48 = 0;
                                i49 = 0;
                                i50 = 0;
                                while (i46 < i43) {
                                    int i61 = iArr14[i46];
                                    j21 = jArr15[i46];
                                    int i62 = i50;
                                    int i63 = i46;
                                    iMax = i49;
                                    i51 = i62;
                                    int i64 = i43;
                                    i52 = i61;
                                    while (i52 > 0) {
                                        int iMin = Math.min(i44, i52);
                                        jArr5[i51] = j21;
                                        int i65 = i52;
                                        int i66 = iH * iMin;
                                        iArr2[i51] = i66;
                                        iMax = Math.max(iMax, i66);
                                        long j23 = j20;
                                        jArrCopyOf[i51] = j23 * ((long) i47);
                                        iArr15[i51] = 1;
                                        j21 += (long) iArr2[i51];
                                        i47 += iMin;
                                        i51++;
                                        i48 += i66;
                                        i52 = i65 - iMin;
                                        j20 = j23;
                                    }
                                    int i67 = i63 + 1;
                                    i50 = i51;
                                    i49 = iMax;
                                    i46 = i67;
                                    i43 = i64;
                                }
                                j12 = ((long) i47) * j20;
                                j11 = i48;
                                if (z3) {
                                    jArr5 = new long[0];
                                }
                                if (z3) {
                                    iArr2 = new int[0];
                                }
                                if (z3) {
                                    jArrCopyOf = new long[0];
                                }
                                if (z3) {
                                    iArr15 = new int[0];
                                }
                                i19 = iG;
                                iArr3 = iArr15;
                                i18 = i49;
                            } else {
                                if (z3) {
                                    jArr3 = new long[0];
                                } else {
                                    jArr3 = new long[iR];
                                }
                                cVar2 = hVar;
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iR];
                                }
                                int i68 = iD2;
                                if (z3) {
                                    jArr4 = new long[0];
                                } else {
                                    jArr4 = new long[iR];
                                }
                                if (z3) {
                                    iArrCopyOf = new int[0];
                                } else {
                                    iArrCopyOf = new int[iR];
                                }
                                i10 = iD;
                                i11 = i68;
                                i12 = iD8;
                                j8 = j2;
                                j9 = j8;
                                j10 = j9;
                                i13 = 0;
                                iM = 0;
                                i14 = 0;
                                iD4 = 0;
                                iM2 = iD10;
                                iD5 = iD9;
                                iD6 = iD3;
                                wVar3 = wVar10;
                                i15 = 0;
                                while (true) {
                                    if (i15 < iR) {
                                        i16 = i11;
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        i17 = i14;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    zA = true;
                                    while (i14 == 0) {
                                        zA = bVar.a();
                                        if (zA) {
                                            break;
                                        }
                                        j10 = bVar.d;
                                        i14 = bVar.c;
                                        i11 = i11;
                                        iM = iM;
                                    }
                                    i20 = iM;
                                    i16 = i11;
                                    if (!zA) {
                                        androidx.media3.common.util.c.t("BoxParsers", "Unexpected end of chunk data");
                                        if (z3) {
                                            long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i15);
                                            int[] iArrCopyOf2 = Arrays.copyOf(iArr, i15);
                                            jArr5 = jArrCopyOf2;
                                            jArrCopyOf = Arrays.copyOf(jArr4, i15);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                            iR = i15;
                                            i17 = i14;
                                            iArr2 = iArrCopyOf2;
                                            iM = i20;
                                            break;
                                        }
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        iR = i15;
                                        i17 = i14;
                                        iM = i20;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    iM = i20;
                                    if (wVar2 != null) {
                                        while (iD4 == 0 && i10 > 0) {
                                            iD4 = wVar2.D();
                                            iM = wVar2.m();
                                            i10--;
                                        }
                                        iD4--;
                                    }
                                    iS = cVar2.s();
                                    int i69 = iR;
                                    iArr4 = iArr;
                                    long j24 = iS;
                                    j9 += j24;
                                    if (iS > i13) {
                                        i13 = iS;
                                    }
                                    if (z3) {
                                        i21 = i13;
                                        jArr6 = jArr3;
                                    } else {
                                        jArr3[i15] = j10;
                                        iArr4[i15] = iS;
                                        i21 = i13;
                                        jArr6 = jArr3;
                                        jArr4[i15] = j8 + ((long) iM);
                                        if (wVar3 == null) {
                                            i23 = 1;
                                        } else {
                                            i23 = 0;
                                        }
                                        iArrCopyOf[i15] = i23;
                                        if (i15 == iD6) {
                                            iArrCopyOf[i15] = 1;
                                            arrayList2.add(Integer.valueOf(i15));
                                        }
                                    }
                                    if (wVar3 != null && i15 == iD6) {
                                        i22 = i16 - 1;
                                        if (i22 > 0) {
                                            i16 = i22;
                                            iD6 = wVar3.D() - 1;
                                        } else {
                                            i16 = i22;
                                        }
                                    }
                                    j8 += (long) iM2;
                                    iD5--;
                                    if (iD5 != 0 && i12 > 0) {
                                        i12--;
                                        iD5 = wVar9.D();
                                        iM2 = wVar9.m();
                                    }
                                    j10 += j24;
                                    i14--;
                                    i15++;
                                    jArr3 = jArr6;
                                    iR = i69;
                                    i11 = i16;
                                    i13 = i21;
                                    iArr = iArr4;
                                }
                                long j25 = j8 + ((long) iM);
                                if (wVar2 != null) {
                                    z7 = true;
                                    break;
                                }
                                while (true) {
                                    if (i10 > 0) {
                                        z7 = true;
                                        break;
                                    }
                                    if (wVar2.D() != 0) {
                                        z7 = false;
                                        break;
                                    }
                                    wVar2.m();
                                    i10--;
                                }
                                if (i16 == 0 || iD5 != 0 || i17 != 0 || i12 != 0 || iD4 != 0 || !z7) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    sb.append(rVarA.a);
                                    sb.append(": remainingSynchronizationSamples ");
                                    sb.append(i16);
                                    sb.append(", remainingSamplesAtTimestampDelta ");
                                    sb.append(iD5);
                                    sb.append(", remainingSamplesInChunk ");
                                    sb.append(i17);
                                    sb.append(", remainingTimestampDeltaChanges ");
                                    sb.append(i12);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(iD4);
                                    if (z7) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb.append(str2);
                                    androidx.media3.common.util.c.t("BoxParsers", sb.toString());
                                }
                                i18 = i13;
                                i19 = iR;
                                iArr3 = iArrCopyOf;
                                j11 = j9;
                                j12 = j25;
                            }
                            jArr7 = jArr5;
                            iArr5 = iArr2;
                            jArr8 = jArrCopyOf;
                            j13 = rVarA.f;
                            if (j13 > j2) {
                                jY7 = j0.Y(j11 * 8, 1000000L, j13, RoundingMode.HALF_DOWN);
                                if (jY7 > j2 && jY7 < 2147483647L) {
                                    androidx.media3.common.q qVarA4 = rVar7.a();
                                    qVarA4.h = (int) jY7;
                                    rVarA = rVarA.a(new androidx.media3.common.r(qVarA4));
                                }
                            }
                            i24 = rVarA.b;
                            j14 = rVarA.c;
                            rVar4 = rVarA.g;
                            jArr9 = rVarA.j;
                            jArr10 = rVarA.i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jY3 = j0.Y(j12, 1000000L, j14, roundingMode);
                            iArrF = a0.F(arrayList2);
                            if (jArr10 == null) {
                                if (!z3) {
                                    j0.X(jArr8, j14);
                                }
                                uVar2 = new u(rVarA, jArr7, iArr5, i18, jArr8, iArr3, iArrF, z6, jY3, i19);
                            } else if (z3) {
                                jArr9.getClass();
                                if (jArr10.length == 1 || jArr10[0] != j2) {
                                    j19 = j2;
                                    for (i42 = 0; i42 < jArr10.length; i42++) {
                                        if (jArr9[i42] != -1) {
                                            j19 += jArr10[i42];
                                        }
                                    }
                                    jY6 = j0.Y(j19, 1000000L, rVarA.d, RoundingMode.DOWN);
                                } else {
                                    jY6 = j0.Y(j12 - jArr9[0], 1000000L, rVarA.c, roundingMode);
                                }
                                uVar2 = new u(rVarA, jArr7, iArr5, i18, jArr8, iArr3, iArrF, z6, jY6, i19);
                            } else {
                                jArr11 = jArr9;
                                if (jArr10.length == 1 || i24 != 1 || jArr8.length < 2) {
                                    arrayList3 = arrayList2;
                                    j15 = -1;
                                } else {
                                    jArr11.getClass();
                                    long j26 = jArr11[0];
                                    j15 = -1;
                                    arrayList3 = arrayList2;
                                    long jY8 = j26 + j0.Y(jArr10[0], rVarA.c, rVarA.d, roundingMode);
                                    int length = jArr8.length - 1;
                                    if (jArr8[0] <= j26 && j26 < jArr8[j0.j(4, 0, length)] && jArr8[j0.j(jArr8.length + (-4), 0, length)] < jY8 && jY8 <= 2 + j12) {
                                        long jMax = Math.max(j2, j12 - jY8);
                                        long jY9 = j0.Y(j26 - jArr8[0], rVar4.H, rVarA.c, roundingMode);
                                        j12 = j12;
                                        long jY10 = j0.Y(jMax, rVar4.H, rVarA.c, roundingMode);
                                        if (!(jY9 == j2 && jY10 == j2) && jY9 <= 2147483647L && jY10 <= 2147483647L) {
                                            vVar.a = (int) jY9;
                                            vVar.b = (int) jY10;
                                            j0.X(jArr8, j14);
                                            uVar2 = new u(rVarA, jArr7, iArr5, i18, jArr8, iArr3, iArrF, z6, j0.Y(jArr10[0], 1000000L, rVarA.d, roundingMode), i19);
                                        } else {
                                            if (jArr10.length == 1 || jArr10[0] != 0) {
                                                iArr6 = iArr3;
                                                i25 = i19;
                                                if (i24 == 1) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                iArr7 = new int[jArr10.length];
                                                iArr8 = new int[jArr10.length];
                                                jArr11.getClass();
                                                arrayList4 = arrayList3;
                                                i26 = 0;
                                                i27 = 0;
                                                i28 = 0;
                                                z9 = false;
                                                while (i28 < jArr10.length) {
                                                    iArr12 = iArr8;
                                                    i35 = i28;
                                                    j18 = jArr11[i35];
                                                    if (j18 != j15) {
                                                        boolean z15 = z9;
                                                        jY5 = j0.Y(jArr10[i35], rVarA.c, rVarA.d, RoundingMode.DOWN) + j18;
                                                        iArr13 = iArr12;
                                                        iArr7[i35] = j0.f(jArr8, j18, true);
                                                        iB = j0.b(jArr8, jY5, z8) - 1;
                                                        i37 = 0;
                                                        for (i36 = r5; i36 < jArr8.length; i36++) {
                                                            if (jArr8[i36] < jY5) {
                                                                i37++;
                                                                if (i37 > rVar4.q) {
                                                                    break;
                                                                }
                                                            } else {
                                                                iB = i36;
                                                            }
                                                        }
                                                        iArr13[i35] = iB + 1;
                                                        i38 = iArr7[i35];
                                                        while (true) {
                                                            i39 = iArr7[i35];
                                                            if (i39 > 0 || (iArr6[i39] & 1) != 0) {
                                                                break;
                                                                break;
                                                            }
                                                            iArr7[i35] = i39 - 1;
                                                        }
                                                        if (i39 == 0 && (iArr6[0] & 1) == 0) {
                                                            iArr7[i35] = i38;
                                                            while (true) {
                                                                i41 = iArr7[i35];
                                                                if (i41 >= iArr13[i35] || (iArr6[i41] & 1) != 0) {
                                                                    break;
                                                                }
                                                                iArr7[i35] = i41 + 1;
                                                            }
                                                        }
                                                        int i70 = iArr13[i35];
                                                        i40 = iArr7[i35];
                                                        int i71 = (i70 - i40) + i26;
                                                        if (i27 != i40) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        z9 = z15 | z14;
                                                        i27 = i70;
                                                        i26 = i71;
                                                    } else {
                                                        iArr13 = iArr12;
                                                    }
                                                    i28 = i35 + 1;
                                                    jArr11 = jArr11;
                                                    iArr8 = iArr13;
                                                    z8 = z8;
                                                }
                                                iArr9 = iArr8;
                                                jArr12 = jArr11;
                                                boolean z16 = z9;
                                                if (i26 != i25) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                z11 = z16 | z10;
                                                if (z11) {
                                                    jArr13 = new long[i26];
                                                } else {
                                                    jArr13 = jArr7;
                                                }
                                                if (z11) {
                                                    iArr10 = new int[i26];
                                                } else {
                                                    iArr10 = iArr5;
                                                }
                                                if (z11) {
                                                    i18 = 0;
                                                }
                                                if (z11) {
                                                    iArr11 = new int[i26];
                                                } else {
                                                    iArr11 = iArr6;
                                                }
                                                if (z11) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList4;
                                                }
                                                jArr14 = new long[i26];
                                                i29 = 0;
                                                z12 = false;
                                                i30 = 0;
                                                j16 = 0;
                                                while (i29 < jArr10.length) {
                                                    j17 = jArr12[i29];
                                                    i31 = iArr7[i29];
                                                    z13 = z11;
                                                    i32 = iArr9[i29];
                                                    androidx.media3.common.r rVar8 = rVar4;
                                                    if (z13) {
                                                        int i72 = i32 - i31;
                                                        System.arraycopy(jArr7, i31, jArr13, i30, i72);
                                                        System.arraycopy(iArr5, i31, iArr10, i30, i72);
                                                        System.arraycopy(iArr6, i31, iArr11, i30, i72);
                                                    }
                                                    i33 = i18;
                                                    while (i31 < i32) {
                                                        i34 = i31;
                                                        int i73 = i32;
                                                        long j27 = rVarA.d;
                                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                        long jY11 = j0.Y(j16, 1000000L, j27, roundingMode2);
                                                        jY4 = j0.Y(jArr8[i34] - j17, 1000000L, rVarA.c, roundingMode2);
                                                        if (jY4 < 0) {
                                                            z12 = true;
                                                        }
                                                        jArr14[i30] = jY11 + jY4;
                                                        if (z13 && iArr10[i30] > i33) {
                                                            i33 = iArr5[i34];
                                                        }
                                                        if (!z13 && !z6 && (iArr11[i30] & 1) != 0) {
                                                            arrayList5.add(Integer.valueOf(i30));
                                                        }
                                                        i30++;
                                                        i31 = i34 + 1;
                                                        i32 = i73;
                                                    }
                                                    j16 += jArr10[i29];
                                                    i29++;
                                                    i18 = i33;
                                                    z11 = z13;
                                                    rVar4 = rVar8;
                                                }
                                                rVar5 = rVar4;
                                                long jY12 = j0.Y(j16, 1000000L, rVarA.d, RoundingMode.DOWN);
                                                if (z12) {
                                                    androidx.media3.common.q qVarA5 = rVar5.a();
                                                    qVarA5.t = true;
                                                    rVarA = rVarA.a(new androidx.media3.common.r(qVarA5));
                                                }
                                                uVar = new u(rVarA, jArr13, iArr10, i18, jArr14, iArr11, a0.F(arrayList5), z6, jY12, jArr13.length);
                                                arrayList6 = arrayList6;
                                            } else {
                                                jArr11.getClass();
                                                long j28 = jArr11[0];
                                                for (int i74 = 0; i74 < jArr8.length; i74++) {
                                                    jArr8[i74] = j0.Y(jArr8[i74] - j28, 1000000L, rVarA.c, RoundingMode.DOWN);
                                                }
                                                uVar2 = new u(rVarA, jArr7, iArr5, i18, jArr8, iArr3, iArrF, z6, j0.Y(j12 - j28, 1000000L, rVarA.c, RoundingMode.DOWN), i19);
                                            }
                                            arrayList6.add(uVar);
                                        }
                                    }
                                }
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i25 = i19;
                                if (i24 == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i26 = 0;
                                i27 = 0;
                                i28 = 0;
                                z9 = false;
                                while (i28 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i35 = i28;
                                    j18 = jArr11[i35];
                                    if (j18 != j15) {
                                        boolean z17 = z9;
                                        jY5 = j0.Y(jArr10[i35], rVarA.c, rVarA.d, RoundingMode.DOWN) + j18;
                                        iArr13 = iArr12;
                                        iArr7[i35] = j0.f(jArr8, j18, true);
                                        iB = j0.b(jArr8, jY5, z8) - 1;
                                        i37 = 0;
                                        while (i36 < jArr8.length) {
                                            if (jArr8[i36] < jY5) {
                                                i37++;
                                                if (i37 > rVar4.q) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i36;
                                            }
                                        }
                                        iArr13[i35] = iB + 1;
                                        i38 = iArr7[i35];
                                        while (true) {
                                            i39 = iArr7[i35];
                                            if (i39 > 0) {
                                                break;
                                            }
                                            iArr7[i35] = i39 - 1;
                                        }
                                        if (i39 == 0) {
                                            iArr7[i35] = i38;
                                            while (true) {
                                                i41 = iArr7[i35];
                                                if (i41 >= iArr13[i35]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i35] = i41 + 1;
                                            }
                                        }
                                        int i75 = iArr13[i35];
                                        i40 = iArr7[i35];
                                        int i76 = (i75 - i40) + i26;
                                        if (i27 != i40) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z9 = z17 | z14;
                                        i27 = i75;
                                        i26 = i76;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i28 = i35 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z8 = z8;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z18 = z9;
                                if (i26 != i25) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z18 | z10;
                                if (z11) {
                                    jArr13 = new long[i26];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z11) {
                                    iArr10 = new int[i26];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i18 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i26];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z11) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i26];
                                i29 = 0;
                                z12 = false;
                                i30 = 0;
                                j16 = 0;
                                while (i29 < jArr10.length) {
                                    j17 = jArr12[i29];
                                    i31 = iArr7[i29];
                                    z13 = z11;
                                    i32 = iArr9[i29];
                                    androidx.media3.common.r rVar9 = rVar4;
                                    if (z13) {
                                        int i77 = i32 - i31;
                                        System.arraycopy(jArr7, i31, jArr13, i30, i77);
                                        System.arraycopy(iArr5, i31, iArr10, i30, i77);
                                        System.arraycopy(iArr6, i31, iArr11, i30, i77);
                                    }
                                    i33 = i18;
                                    while (i31 < i32) {
                                        i34 = i31;
                                        int i78 = i32;
                                        long j29 = rVarA.d;
                                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                                        long jY13 = j0.Y(j16, 1000000L, j29, roundingMode3);
                                        jY4 = j0.Y(jArr8[i34] - j17, 1000000L, rVarA.c, roundingMode3);
                                        if (jY4 < 0) {
                                            z12 = true;
                                        }
                                        jArr14[i30] = jY13 + jY4;
                                        if (z13) {
                                            i33 = iArr5[i34];
                                        }
                                        if (!z13) {
                                        }
                                        i30++;
                                        i31 = i34 + 1;
                                        i32 = i78;
                                    }
                                    j16 += jArr10[i29];
                                    i29++;
                                    i18 = i33;
                                    z11 = z13;
                                    rVar4 = rVar9;
                                }
                                rVar5 = rVar4;
                                long jY14 = j0.Y(j16, 1000000L, rVarA.d, RoundingMode.DOWN);
                                if (z12) {
                                    androidx.media3.common.q qVarA6 = rVar5.a();
                                    qVarA6.t = true;
                                    rVarA = rVarA.a(new androidx.media3.common.r(qVarA6));
                                }
                                uVar = new u(rVarA, jArr13, iArr10, i18, jArr14, iArr11, a0.F(arrayList5), z6, jY14, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(uVar);
                            }
                            uVar = uVar2;
                        } else {
                            iD2 = 0;
                        }
                        iD3 = -1;
                        iH = hVar.h();
                        wVar2 = wVar11;
                        String str8 = rVar7.o;
                        if (iH == -1) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (wVar10 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5) {
                            i43 = bVar.a;
                            jArr15 = new long[i43];
                            iArr14 = new int[i43];
                            while (bVar.a()) {
                                int i610 = bVar.b;
                                jArr15[i610] = bVar.d;
                                iArr14[i610] = bVar.c;
                            }
                            j20 = iD10;
                            i44 = 8192 / iH;
                            iG = 0;
                            while (i45 < i43) {
                                iG += j0.g(iArr14[i45], i44);
                            }
                            jArr5 = new long[iG];
                            iArr2 = new int[iG];
                            jArrCopyOf = new long[iG];
                            iArr15 = new int[iG];
                            i46 = 0;
                            i47 = 0;
                            i48 = 0;
                            i49 = 0;
                            i50 = 0;
                            while (i46 < i43) {
                                int i611 = iArr14[i46];
                                j21 = jArr15[i46];
                                int i612 = i50;
                                int i613 = i46;
                                iMax = i49;
                                i51 = i612;
                                int i614 = i43;
                                i52 = i611;
                                while (i52 > 0) {
                                    int iMin2 = Math.min(i44, i52);
                                    jArr5[i51] = j21;
                                    int i615 = i52;
                                    int i616 = iH * iMin2;
                                    iArr2[i51] = i616;
                                    iMax = Math.max(iMax, i616);
                                    long j210 = j20;
                                    jArrCopyOf[i51] = j210 * ((long) i47);
                                    iArr15[i51] = 1;
                                    j21 += (long) iArr2[i51];
                                    i47 += iMin2;
                                    i51++;
                                    i48 += i616;
                                    i52 = i615 - iMin2;
                                    j20 = j210;
                                }
                                int i617 = i613 + 1;
                                i50 = i51;
                                i49 = iMax;
                                i46 = i617;
                                i43 = i614;
                            }
                            j12 = ((long) i47) * j20;
                            j11 = i48;
                            if (z3) {
                                jArr5 = new long[0];
                            }
                            if (z3) {
                                iArr2 = new int[0];
                            }
                            if (z3) {
                                jArrCopyOf = new long[0];
                            }
                            if (z3) {
                                iArr15 = new int[0];
                            }
                            i19 = iG;
                            iArr3 = iArr15;
                            i18 = i49;
                        } else {
                            if (z3) {
                                jArr3 = new long[0];
                            } else {
                                jArr3 = new long[iR];
                            }
                            cVar2 = hVar;
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iR];
                            }
                            int i618 = iD2;
                            if (z3) {
                                jArr4 = new long[0];
                            } else {
                                jArr4 = new long[iR];
                            }
                            if (z3) {
                                iArrCopyOf = new int[0];
                            } else {
                                iArrCopyOf = new int[iR];
                            }
                            i10 = iD;
                            i11 = i618;
                            i12 = iD8;
                            j8 = j2;
                            j9 = j8;
                            j10 = j9;
                            i13 = 0;
                            iM = 0;
                            i14 = 0;
                            iD4 = 0;
                            iM2 = iD10;
                            iD5 = iD9;
                            iD6 = iD3;
                            wVar3 = wVar10;
                            i15 = 0;
                            while (true) {
                                if (i15 < iR) {
                                    i16 = i11;
                                    jArr5 = jArr3;
                                    jArrCopyOf = jArr4;
                                    i17 = i14;
                                    iArr2 = iArr;
                                    break;
                                }
                                zA = true;
                                while (i14 == 0) {
                                    zA = bVar.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    j10 = bVar.d;
                                    i14 = bVar.c;
                                    i11 = i11;
                                    iM = iM;
                                }
                                i20 = iM;
                                i16 = i11;
                                if (!zA) {
                                    androidx.media3.common.util.c.t("BoxParsers", "Unexpected end of chunk data");
                                    if (z3) {
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        iR = i15;
                                        i17 = i14;
                                        iM = i20;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i15);
                                    int[] iArrCopyOf3 = Arrays.copyOf(iArr, i15);
                                    jArr5 = jArrCopyOf3;
                                    jArrCopyOf = Arrays.copyOf(jArr4, i15);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                    iR = i15;
                                    i17 = i14;
                                    iArr2 = iArrCopyOf3;
                                    iM = i20;
                                    break;
                                }
                                iM = i20;
                                if (wVar2 != null) {
                                    while (iD4 == 0) {
                                        iD4 = wVar2.D();
                                        iM = wVar2.m();
                                        i10--;
                                    }
                                    iD4--;
                                }
                                iS = cVar2.s();
                                int i619 = iR;
                                iArr4 = iArr;
                                long j211 = iS;
                                j9 += j211;
                                if (iS > i13) {
                                    i13 = iS;
                                }
                                if (z3) {
                                    jArr3[i15] = j10;
                                    iArr4[i15] = iS;
                                    i21 = i13;
                                    jArr6 = jArr3;
                                    jArr4[i15] = j8 + ((long) iM);
                                    if (wVar3 == null) {
                                        i23 = 1;
                                    } else {
                                        i23 = 0;
                                    }
                                    iArrCopyOf[i15] = i23;
                                    if (i15 == iD6) {
                                        iArrCopyOf[i15] = 1;
                                        arrayList2.add(Integer.valueOf(i15));
                                    }
                                } else {
                                    i21 = i13;
                                    jArr6 = jArr3;
                                }
                                if (wVar3 != null) {
                                    i22 = i16 - 1;
                                    if (i22 > 0) {
                                        i16 = i22;
                                        iD6 = wVar3.D() - 1;
                                    } else {
                                        i16 = i22;
                                    }
                                }
                                j8 += (long) iM2;
                                iD5--;
                                if (iD5 != 0) {
                                }
                                j10 += j211;
                                i14--;
                                i15++;
                                jArr3 = jArr6;
                                iR = i619;
                                i11 = i16;
                                i13 = i21;
                                iArr = iArr4;
                            }
                            long j212 = j8 + ((long) iM);
                            if (wVar2 != null) {
                                z7 = true;
                                break;
                            }
                            while (true) {
                                if (i10 > 0) {
                                    z7 = true;
                                    break;
                                }
                                if (wVar2.D() != 0) {
                                    z7 = false;
                                    break;
                                }
                                wVar2.m();
                                i10--;
                            }
                            if (i16 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                sb2.append(rVarA.a);
                                sb2.append(": remainingSynchronizationSamples ");
                                sb2.append(i16);
                                sb2.append(", remainingSamplesAtTimestampDelta ");
                                sb2.append(iD5);
                                sb2.append(", remainingSamplesInChunk ");
                                sb2.append(i17);
                                sb2.append(", remainingTimestampDeltaChanges ");
                                sb2.append(i12);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(iD4);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb2.append(str2);
                                androidx.media3.common.util.c.t("BoxParsers", sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                sb3.append(rVarA.a);
                                sb3.append(": remainingSynchronizationSamples ");
                                sb3.append(i16);
                                sb3.append(", remainingSamplesAtTimestampDelta ");
                                sb3.append(iD5);
                                sb3.append(", remainingSamplesInChunk ");
                                sb3.append(i17);
                                sb3.append(", remainingTimestampDeltaChanges ");
                                sb3.append(i12);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iD4);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                androidx.media3.common.util.c.t("BoxParsers", sb3.toString());
                            }
                            i18 = i13;
                            i19 = iR;
                            iArr3 = iArrCopyOf;
                            j11 = j9;
                            j12 = j212;
                        }
                        jArr7 = jArr5;
                        iArr5 = iArr2;
                        jArr8 = jArrCopyOf;
                        j13 = rVarA.f;
                        if (j13 > j2) {
                            jY7 = j0.Y(j11 * 8, 1000000L, j13, RoundingMode.HALF_DOWN);
                            if (jY7 > j2) {
                                androidx.media3.common.q qVarA7 = rVar7.a();
                                qVarA7.h = (int) jY7;
                                rVarA = rVarA.a(new androidx.media3.common.r(qVarA7));
                            }
                        }
                        i24 = rVarA.b;
                        j14 = rVarA.c;
                        rVar4 = rVarA.g;
                        jArr9 = rVarA.j;
                        jArr10 = rVarA.i;
                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                        jY3 = j0.Y(j12, 1000000L, j14, roundingMode4);
                        iArrF = a0.F(arrayList2);
                        if (jArr10 == null) {
                            if (!z3) {
                                j0.X(jArr8, j14);
                            }
                            uVar2 = new u(rVarA, jArr7, iArr5, i18, jArr8, iArr3, iArrF, z6, jY3, i19);
                        } else if (z3) {
                            jArr9.getClass();
                            if (jArr10.length == 1) {
                                j19 = j2;
                                while (i42 < jArr10.length) {
                                    if (jArr9[i42] != -1) {
                                        j19 += jArr10[i42];
                                    }
                                }
                                jY6 = j0.Y(j19, 1000000L, rVarA.d, RoundingMode.DOWN);
                            } else {
                                j19 = j2;
                                while (i42 < jArr10.length) {
                                    if (jArr9[i42] != -1) {
                                        j19 += jArr10[i42];
                                    }
                                }
                                jY6 = j0.Y(j19, 1000000L, rVarA.d, RoundingMode.DOWN);
                            }
                            uVar2 = new u(rVarA, jArr7, iArr5, i18, jArr8, iArr3, iArrF, z6, jY6, i19);
                        } else {
                            jArr11 = jArr9;
                            if (jArr10.length == 1) {
                                arrayList3 = arrayList2;
                                j15 = -1;
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i25 = i19;
                                if (i24 == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i26 = 0;
                                i27 = 0;
                                i28 = 0;
                                z9 = false;
                                while (i28 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i35 = i28;
                                    j18 = jArr11[i35];
                                    if (j18 != j15) {
                                        boolean z19 = z9;
                                        jY5 = j0.Y(jArr10[i35], rVarA.c, rVarA.d, RoundingMode.DOWN) + j18;
                                        iArr13 = iArr12;
                                        iArr7[i35] = j0.f(jArr8, j18, true);
                                        iB = j0.b(jArr8, jY5, z8) - 1;
                                        i37 = 0;
                                        while (i36 < jArr8.length) {
                                            if (jArr8[i36] < jY5) {
                                                i37++;
                                                if (i37 > rVar4.q) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i36;
                                            }
                                        }
                                        iArr13[i35] = iB + 1;
                                        i38 = iArr7[i35];
                                        while (true) {
                                            i39 = iArr7[i35];
                                            if (i39 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i35] = i39 - 1;
                                        }
                                        if (i39 == 0) {
                                            iArr7[i35] = i38;
                                            while (true) {
                                                i41 = iArr7[i35];
                                                if (i41 >= iArr13[i35]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i35] = i41 + 1;
                                            }
                                        }
                                        int i79 = iArr13[i35];
                                        i40 = iArr7[i35];
                                        int i710 = (i79 - i40) + i26;
                                        if (i27 != i40) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z9 = z19 | z14;
                                        i27 = i79;
                                        i26 = i710;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i28 = i35 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z8 = z8;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z110 = z9;
                                if (i26 != i25) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z110 | z10;
                                if (z11) {
                                    jArr13 = new long[i26];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z11) {
                                    iArr10 = new int[i26];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i18 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i26];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z11) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i26];
                                i29 = 0;
                                z12 = false;
                                i30 = 0;
                                j16 = 0;
                                while (i29 < jArr10.length) {
                                    j17 = jArr12[i29];
                                    i31 = iArr7[i29];
                                    z13 = z11;
                                    i32 = iArr9[i29];
                                    androidx.media3.common.r rVar10 = rVar4;
                                    if (z13) {
                                        int i711 = i32 - i31;
                                        System.arraycopy(jArr7, i31, jArr13, i30, i711);
                                        System.arraycopy(iArr5, i31, iArr10, i30, i711);
                                        System.arraycopy(iArr6, i31, iArr11, i30, i711);
                                    }
                                    i33 = i18;
                                    while (i31 < i32) {
                                        i34 = i31;
                                        int i712 = i32;
                                        long j213 = rVarA.d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jY15 = j0.Y(j16, 1000000L, j213, roundingMode5);
                                        jY4 = j0.Y(jArr8[i34] - j17, 1000000L, rVarA.c, roundingMode5);
                                        if (jY4 < 0) {
                                            z12 = true;
                                        }
                                        jArr14[i30] = jY15 + jY4;
                                        if (z13) {
                                            i33 = iArr5[i34];
                                        }
                                        if (!z13) {
                                        }
                                        i30++;
                                        i31 = i34 + 1;
                                        i32 = i712;
                                    }
                                    j16 += jArr10[i29];
                                    i29++;
                                    i18 = i33;
                                    z11 = z13;
                                    rVar4 = rVar10;
                                }
                                rVar5 = rVar4;
                                long jY16 = j0.Y(j16, 1000000L, rVarA.d, RoundingMode.DOWN);
                                if (z12) {
                                    androidx.media3.common.q qVarA8 = rVar5.a();
                                    qVarA8.t = true;
                                    rVarA = rVarA.a(new androidx.media3.common.r(qVarA8));
                                }
                                uVar = new u(rVarA, jArr13, iArr10, i18, jArr14, iArr11, a0.F(arrayList5), z6, jY16, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(uVar);
                            } else {
                                arrayList3 = arrayList2;
                                j15 = -1;
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i25 = i19;
                                if (i24 == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i26 = 0;
                                i27 = 0;
                                i28 = 0;
                                z9 = false;
                                while (i28 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i35 = i28;
                                    j18 = jArr11[i35];
                                    if (j18 != j15) {
                                        boolean z111 = z9;
                                        jY5 = j0.Y(jArr10[i35], rVarA.c, rVarA.d, RoundingMode.DOWN) + j18;
                                        iArr13 = iArr12;
                                        iArr7[i35] = j0.f(jArr8, j18, true);
                                        iB = j0.b(jArr8, jY5, z8) - 1;
                                        i37 = 0;
                                        while (i36 < jArr8.length) {
                                            if (jArr8[i36] < jY5) {
                                                i37++;
                                                if (i37 > rVar4.q) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i36;
                                            }
                                        }
                                        iArr13[i35] = iB + 1;
                                        i38 = iArr7[i35];
                                        while (true) {
                                            i39 = iArr7[i35];
                                            if (i39 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i35] = i39 - 1;
                                        }
                                        if (i39 == 0) {
                                            iArr7[i35] = i38;
                                            while (true) {
                                                i41 = iArr7[i35];
                                                if (i41 >= iArr13[i35]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i35] = i41 + 1;
                                            }
                                        }
                                        int i713 = iArr13[i35];
                                        i40 = iArr7[i35];
                                        int i714 = (i713 - i40) + i26;
                                        if (i27 != i40) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        z9 = z111 | z14;
                                        i27 = i713;
                                        i26 = i714;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i28 = i35 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z8 = z8;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z112 = z9;
                                if (i26 != i25) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z112 | z10;
                                if (z11) {
                                    jArr13 = new long[i26];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z11) {
                                    iArr10 = new int[i26];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i18 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i26];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z11) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i26];
                                i29 = 0;
                                z12 = false;
                                i30 = 0;
                                j16 = 0;
                                while (i29 < jArr10.length) {
                                    j17 = jArr12[i29];
                                    i31 = iArr7[i29];
                                    z13 = z11;
                                    i32 = iArr9[i29];
                                    androidx.media3.common.r rVar11 = rVar4;
                                    if (z13) {
                                        int i715 = i32 - i31;
                                        System.arraycopy(jArr7, i31, jArr13, i30, i715);
                                        System.arraycopy(iArr5, i31, iArr10, i30, i715);
                                        System.arraycopy(iArr6, i31, iArr11, i30, i715);
                                    }
                                    i33 = i18;
                                    while (i31 < i32) {
                                        i34 = i31;
                                        int i716 = i32;
                                        long j214 = rVarA.d;
                                        RoundingMode roundingMode6 = RoundingMode.DOWN;
                                        long jY17 = j0.Y(j16, 1000000L, j214, roundingMode6);
                                        jY4 = j0.Y(jArr8[i34] - j17, 1000000L, rVarA.c, roundingMode6);
                                        if (jY4 < 0) {
                                            z12 = true;
                                        }
                                        jArr14[i30] = jY17 + jY4;
                                        if (z13) {
                                            i33 = iArr5[i34];
                                        }
                                        if (!z13) {
                                        }
                                        i30++;
                                        i31 = i34 + 1;
                                        i32 = i716;
                                    }
                                    j16 += jArr10[i29];
                                    i29++;
                                    i18 = i33;
                                    z11 = z13;
                                    rVar4 = rVar11;
                                }
                                rVar5 = rVar4;
                                long jY18 = j0.Y(j16, 1000000L, rVarA.d, RoundingMode.DOWN);
                                if (z12) {
                                    androidx.media3.common.q qVarA9 = rVar5.a();
                                    qVarA9.t = true;
                                    rVarA = rVarA.a(new androidx.media3.common.r(qVarA9));
                                }
                                uVar = new u(rVarA, jArr13, iArr10, i18, jArr14, iArr11, a0.F(arrayList5), z6, jY18, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(uVar);
                            }
                        }
                        uVar = uVar2;
                    }
                    arrayList6.add(uVar);
                }
            }
            i53 = i2 + 1;
            dVar3 = dVar;
            arrayList6 = arrayList6;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0351  */
    /* JADX WARN: Code duplicated, block: B:205:0x0356 A[EDGE_INSN: B:205:0x0356->B:208:0x0376 BREAK  A[LOOP:4: B:166:0x02e2->B:206:0x0368]] */
    public static androidx.media3.common.h0 k(androidx.media3.container.e eVar) {
        int i;
        boolean z;
        androidx.media3.common.h0 h0Var;
        androidx.media3.common.h0 h0Var2;
        int iA;
        androidx.media3.common.h0 h0Var3;
        Object objI;
        w wVar = eVar.z;
        int i2 = 8;
        wVar.M(8);
        boolean z2 = false;
        androidx.media3.common.h0 h0Var4 = new androidx.media3.common.h0(new g0[0]);
        while (wVar.a() >= i2) {
            int i3 = wVar.b;
            int iM = wVar.m();
            int iM2 = wVar.m();
            String str = null;
            if (iM2 == 1835365473) {
                wVar.M(i3);
                int i4 = i3 + iM;
                wVar.N(i2);
                a(wVar);
                while (true) {
                    int i5 = wVar.b;
                    if (i5 < i4) {
                        int iM3 = wVar.m();
                        if (wVar.m() == 1768715124) {
                            wVar.M(i5);
                            int i6 = i5 + iM3;
                            wVar.N(i2);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i7 = wVar.b;
                                if (i7 >= i6) {
                                    break;
                                }
                                int iM4 = wVar.m() + i7;
                                int iM5 = wVar.m();
                                int i8 = (iM5 >> 24) & 255;
                                if (i8 == 169 || i8 == 253) {
                                    int i9 = 16777215 & iM5;
                                    if (i9 == 6516084) {
                                        int iM6 = wVar.m();
                                        if (wVar.m() == 1684108385) {
                                            wVar.N(8);
                                            String strV = wVar.v(iM6 - 16);
                                            objI = new androidx.media3.extractor.metadata.id3.e("und", strV, strV);
                                        } else {
                                            androidx.media3.common.util.c.t("MetadataUtil", "Failed to parse comment attribute: ".concat(androidx.media3.container.f.d(iM5)));
                                            objI = null;
                                        }
                                    } else if (i9 == 7233901 || i9 == 7631467) {
                                        objI = q.i(iM5, wVar, "TIT2");
                                    } else if (i9 == 6516589 || i9 == 7828084) {
                                        objI = q.i(iM5, wVar, "TCOM");
                                    } else if (i9 == 6578553) {
                                        objI = q.i(iM5, wVar, "TDRC");
                                    } else if (i9 == 4280916) {
                                        objI = q.i(iM5, wVar, "TPE1");
                                    } else if (i9 == 7630703) {
                                        objI = q.i(iM5, wVar, "TSSE");
                                    } else if (i9 == 6384738) {
                                        objI = q.i(iM5, wVar, "TALB");
                                    } else if (i9 == 7108978) {
                                        objI = q.i(iM5, wVar, "USLT");
                                    } else if (i9 == 6776174) {
                                        objI = q.i(iM5, wVar, "TCON");
                                    } else if (i9 == 6779504) {
                                        objI = q.i(iM5, wVar, "TIT1");
                                    } else if (i9 == 7173742) {
                                        objI = q.i(iM5, wVar, "MVNM");
                                    } else if (i9 == 7173737) {
                                        Object objG = q.g(iM5, "MVIN", wVar, true, false);
                                        wVar.M(iM4);
                                        objI = objG;
                                    } else {
                                        androidx.media3.common.util.c.e("MetadataUtil", "Skipped unknown metadata entry: ".concat(androidx.media3.container.f.d(iM5)));
                                        wVar.M(iM4);
                                        objI = null;
                                    }
                                    wVar.M(iM4);
                                } else {
                                    if (iM5 == 1735291493) {
                                        try {
                                            String strA = androidx.media3.extractor.metadata.id3.j.a(q.f(wVar) - 1);
                                            if (strA != null) {
                                                objI = new androidx.media3.extractor.metadata.id3.n("TCON", str, h0.s(strA));
                                            } else {
                                                androidx.media3.common.util.c.t("MetadataUtil", "Failed to parse standard genre code");
                                                objI = str;
                                            }
                                        } catch (Throwable th) {
                                            wVar.M(iM4);
                                            throw th;
                                        }
                                    } else if (iM5 == 1684632427) {
                                        objI = q.e(iM5, wVar, "TPOS");
                                    } else if (iM5 == 1953655662) {
                                        objI = q.e(iM5, wVar, "TRCK");
                                    } else if (iM5 == 1953329263) {
                                        objI = q.g(iM5, "TBPM", wVar, true, z2);
                                    } else if (iM5 == 1668311404) {
                                        objI = q.g(iM5, "TCMP", wVar, true, true);
                                    } else if (iM5 == 1668249202) {
                                        objI = q.d(wVar);
                                    } else if (iM5 == 1631670868) {
                                        objI = q.i(iM5, wVar, "TPE2");
                                    } else if (iM5 == 1936682605) {
                                        objI = q.i(iM5, wVar, "TSOT");
                                    } else if (iM5 == 1936679276) {
                                        objI = q.i(iM5, wVar, "TSOA");
                                    } else if (iM5 == 1936679282) {
                                        objI = q.i(iM5, wVar, "TSOP");
                                    } else if (iM5 == 1936679265) {
                                        objI = q.i(iM5, wVar, "TSO2");
                                    } else if (iM5 == 1936679791) {
                                        objI = q.i(iM5, wVar, "TSOC");
                                    } else if (iM5 == 1920233063) {
                                        objI = q.g(iM5, "ITUNESADVISORY", wVar, z2, z2);
                                    } else if (iM5 == 1885823344) {
                                        objI = q.g(iM5, "ITUNESGAPLESS", wVar, z2, true);
                                    } else if (iM5 == 1936683886) {
                                        objI = q.i(iM5, wVar, "TVSHOWSORT");
                                    } else if (iM5 == 1953919848) {
                                        objI = q.i(iM5, wVar, "TVSHOW");
                                    } else if (iM5 == 757935405) {
                                        String strV2 = str;
                                        String strV3 = strV2;
                                        int i10 = -1;
                                        int i11 = -1;
                                        while (true) {
                                            int i12 = wVar.b;
                                            if (i12 >= iM4) {
                                                break;
                                            }
                                            int iM7 = wVar.m();
                                            int iM8 = wVar.m();
                                            wVar.N(4);
                                            if (iM8 == 1835360622) {
                                                strV2 = wVar.v(iM7 - 12);
                                            } else if (iM8 == 1851878757) {
                                                strV3 = wVar.v(iM7 - 12);
                                            } else {
                                                if (iM8 == 1684108385) {
                                                    i10 = i12;
                                                    i11 = iM7;
                                                }
                                                wVar.N(iM7 - 12);
                                            }
                                        }
                                        if (strV2 == null || strV3 == null || i10 == -1) {
                                            objI = null;
                                        } else {
                                            wVar.M(i10);
                                            wVar.N(16);
                                            objI = new androidx.media3.extractor.metadata.id3.k(strV2, strV3, wVar.v(i11 - 16));
                                        }
                                        wVar.M(iM4);
                                    } else {
                                        androidx.media3.common.util.c.e("MetadataUtil", "Skipped unknown metadata entry: ".concat(androidx.media3.container.f.d(iM5)));
                                        wVar.M(iM4);
                                        objI = null;
                                    }
                                    wVar.M(iM4);
                                }
                                if (objI != null) {
                                    arrayList.add(objI);
                                }
                                z2 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                h0Var3 = new androidx.media3.common.h0(arrayList);
                                break;
                            }
                            break;
                        }
                        wVar.M(i5 + iM3);
                        i2 = 8;
                        z2 = false;
                        str = null;
                    }
                    h0Var3 = null;
                    break;
                }
                h0Var4 = h0Var4.b(h0Var3);
                i = 8;
            } else if (iM2 == 1936553057) {
                wVar.M(i3);
                int i13 = i3 + iM;
                wVar.N(12);
                while (true) {
                    int i14 = wVar.b;
                    if (i14 < i13) {
                        int iM9 = wVar.m();
                        if (wVar.m() == 1935766900) {
                            if (iM9 >= 16) {
                                wVar.N(4);
                                int i15 = -1;
                                int i16 = 0;
                                for (int i17 = 0; i17 < 2; i17++) {
                                    int iZ = wVar.z();
                                    int iZ2 = wVar.z();
                                    if (iZ == 0) {
                                        i15 = iZ2;
                                    } else if (iZ == 1) {
                                        i16 = iZ2;
                                    }
                                }
                                if (i15 != 12) {
                                    if (i15 != 13) {
                                        if (i15 != 21) {
                                            iA = -2147483647;
                                        } else {
                                            i = 8;
                                            if (wVar.a() < 8 || wVar.b + 8 > i13) {
                                                iA = -2147483647;
                                            } else {
                                                int iM10 = wVar.m();
                                                int iM11 = wVar.m();
                                                if (iM10 < 12 || iM11 != 1936877170) {
                                                    iA = -2147483647;
                                                } else {
                                                    iA = wVar.A();
                                                }
                                            }
                                        }
                                        if (iA == -2147483647) {
                                            h0Var2 = new androidx.media3.common.h0(new androidx.media3.extractor.metadata.mp4.c(i16, iA));
                                            break;
                                        }
                                        break;
                                    }
                                    iA = 120;
                                } else {
                                    iA = 240;
                                }
                                i = 8;
                                if (iA == -2147483647) {
                                    h0Var2 = new androidx.media3.common.h0(new androidx.media3.extractor.metadata.mp4.c(i16, iA));
                                    break;
                                }
                                break;
                            }
                            h0Var2 = null;
                            i = 8;
                            break;
                        }
                        wVar.M(i14 + iM9);
                    } else {
                        i = 8;
                    }
                    h0Var2 = null;
                    break;
                }
                h0Var4 = h0Var4.b(h0Var2);
            } else {
                i = 8;
                if (iM2 == -1451722374) {
                    short sW = wVar.w();
                    wVar.N(2);
                    String strX = wVar.x(sW, StandardCharsets.UTF_8);
                    int iMax = Math.max(strX.lastIndexOf(43), strX.lastIndexOf(45));
                    try {
                        try {
                            androidx.media3.container.g gVar = new androidx.media3.container.g(Float.parseFloat(strX.substring(0, iMax)), Float.parseFloat(strX.substring(iMax, strX.length() - 1)));
                            g0[] g0VarArr = new g0[1];
                            z = false;
                            try {
                                g0VarArr[0] = gVar;
                                h0Var = new androidx.media3.common.h0(g0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                h0Var = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    h0Var4 = h0Var4.b(h0Var);
                }
                wVar.M(i3 + iM);
                i2 = i;
                z2 = z;
            }
            z = false;
            wVar.M(i3 + iM);
            i2 = i;
            z2 = z;
        }
        return h0Var4;
    }
}
