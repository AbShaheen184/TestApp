package com.app.mlounge.data.providers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements k0 {
    public static final int $stable = 8;
    private static final String VIDNEST_ALPHABET = "RB0fpH8ZEyVLkv7c2i6MAJ5u3IKFDxlS1NTsnGaqmXYdUrtzjwObCgQP94hoeW+/=";
    private final okhttp3.y client;
    private final com.google.gson.f gson;
    private final String name;
    public static final v1 Companion = new v1();
    private static final List<String> BACKENDS = com.google.common.base.c.q("moviesapi", "hollymoviehd", "allmovies", "vidlink", "klikxxi", "movies4f", "moviebox", "videasy", "movies5f");

    public z1(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.name = "VidNest";
        this.gson = new com.google.gson.f();
    }

    public static final com.google.gson.k b(z1 z1Var, String str) {
        String strSubstring;
        z1Var.getClass();
        try {
            ArrayList arrayList = new ArrayList(65);
            int i = 0;
            int i2 = 0;
            while (i < 65) {
                arrayList.add(new kotlin.k(Character.valueOf(VIDNEST_ALPHABET.charAt(i)), Integer.valueOf(i2)));
                i++;
                i2++;
            }
            Map mapG = kotlin.collections.a0.G(arrayList);
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            while (i3 < str.length()) {
                int i4 = i3 + 4;
                if (i4 <= str.length()) {
                    strSubstring = str.substring(i3, i4);
                } else {
                    strSubstring = str.substring(i3) + kotlin.text.r.L(4 - (str.length() - i3), "=");
                }
                ArrayList arrayList3 = new ArrayList(strSubstring.length());
                int i5 = 0;
                while (true) {
                    int iIntValue = 64;
                    if (i5 >= strSubstring.length()) {
                        break;
                    }
                    Integer num = (Integer) mapG.get(Character.valueOf(strSubstring.charAt(i5)));
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    arrayList3.add(Integer.valueOf(iIntValue));
                    i5++;
                }
                if (arrayList3.size() >= 4) {
                    arrayList2.add(Byte.valueOf((byte) ((((Number) arrayList3.get(0)).intValue() << 2) | (((Number) arrayList3.get(1)).intValue() >> 4))));
                    if (((Number) arrayList3.get(2)).intValue() != 64) {
                        arrayList2.add(Byte.valueOf((byte) (((((Number) arrayList3.get(1)).intValue() & 15) << 4) | (((Number) arrayList3.get(2)).intValue() >> 2))));
                    }
                    if (((Number) arrayList3.get(3)).intValue() != 64) {
                        arrayList2.add(Byte.valueOf((byte) (((Number) arrayList3.get(3)).intValue() | ((((Number) arrayList3.get(2)).intValue() & 3) << 6))));
                    }
                }
                i3 = i4;
            }
            String str2 = new String(kotlin.collections.o.h0(arrayList2), kotlin.text.a.a);
            try {
                return (com.google.gson.k) z1Var.gson.d(com.google.gson.k.class, str2);
            } catch (Exception unused) {
                Pattern patternCompile = Pattern.compile("\\{.*}", 32);
                patternCompile.getClass();
                Matcher matcher = patternCompile.matcher(str2);
                matcher.getClass();
                kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, str2);
                if (gVarC == null) {
                    return null;
                }
                com.google.gson.f fVar = z1Var.gson;
                String strGroup = gVarC.a.group();
                strGroup.getClass();
                return (com.google.gson.k) fVar.d(com.google.gson.k.class, strGroup);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0209  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0106  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    public static final String c(z1 z1Var, com.google.gson.k kVar) {
        com.google.gson.k kVarE;
        com.google.gson.g gVarD;
        String strH;
        String strH2;
        String strH3;
        Integer numQ;
        com.google.gson.k kVarE2;
        com.google.gson.g gVarD2;
        int iC;
        String strH4;
        String strH5;
        com.google.gson.g gVarD3;
        String strH6;
        z1Var.getClass();
        Iterator it = com.google.common.base.c.q("sources", "streams").iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                com.google.gson.h hVarL = kVar.l("data");
                if (hVarL == null) {
                    kVarE = null;
                } else {
                    if (!(hVarL instanceof com.google.gson.k)) {
                        hVarL = null;
                    }
                    if (hVarL != null) {
                        kVarE = hVarL.e();
                    } else {
                        kVarE = null;
                    }
                }
                if (kVarE != null) {
                    com.google.gson.h hVarL2 = kVarE.l("stream");
                    if (hVarL2 == null) {
                        kVarE2 = null;
                    } else {
                        if (!(hVarL2 instanceof com.google.gson.k)) {
                            hVarL2 = null;
                        }
                        if (hVarL2 != null) {
                            kVarE2 = hVarL2.e();
                        } else {
                            kVarE2 = null;
                        }
                    }
                    if (kVarE2 != null) {
                        com.google.gson.h hVarL3 = kVarE2.l("url");
                        if (hVarL3 == null || (strH5 = hVarL3.h()) == null) {
                            com.google.gson.h hVarL4 = kVarE2.l("playlist");
                            strH5 = hVarL4 != null ? hVarL4.h() : null;
                            if (strH5 == null) {
                                com.google.gson.h hVarL5 = kVarE2.l("file");
                                strH5 = hVarL5 != null ? hVarL5.h() : null;
                            }
                        }
                        if (strH5 != null) {
                            return kotlin.text.r.O(strH5, "//", false) ? "https:".concat(strH5) : strH5;
                        }
                    }
                    com.google.gson.h hVarL6 = kVarE.l("downloads");
                    if (hVarL6 == null) {
                        gVarD2 = null;
                    } else {
                        if (!(hVarL6 instanceof com.google.gson.g)) {
                            hVarL6 = null;
                        }
                        if (hVarL6 != null) {
                            gVarD2 = hVarL6.d();
                        } else {
                            gVarD2 = null;
                        }
                    }
                    if (gVarD2 != null) {
                        Iterator it2 = gVarD2.e.iterator();
                        it2.getClass();
                        int i = 0;
                        String str = null;
                        while (it2.hasNext()) {
                            com.google.gson.h hVar = (com.google.gson.h) it2.next();
                            hVar.getClass();
                            if (hVar instanceof com.google.gson.k) {
                                com.google.gson.k kVarE3 = hVar.e();
                                com.google.gson.h hVarL7 = kVarE3.l("resolution");
                                if (hVarL7 == null) {
                                    iC = 0;
                                } else {
                                    if (!(hVarL7 instanceof com.google.gson.l)) {
                                        hVarL7 = null;
                                    }
                                    if (hVarL7 != null) {
                                        iC = hVarL7.c();
                                    } else {
                                        iC = 0;
                                    }
                                }
                                com.google.gson.h hVarL8 = kVarE3.l("url");
                                if (hVarL8 != null && (strH4 = hVarL8.h()) != null && iC > i) {
                                    str = strH4;
                                    i = iC;
                                }
                            }
                        }
                        if (str != null) {
                            return kotlin.text.r.O(str, "//", false) ? "https:".concat(str) : str;
                        }
                    }
                }
                com.google.gson.h hVarL9 = kVar.l("url");
                if (hVarL9 == null) {
                    gVarD = null;
                } else {
                    if (!(hVarL9 instanceof com.google.gson.g)) {
                        hVarL9 = null;
                    }
                    if (hVarL9 != null) {
                        gVarD = hVarL9.d();
                    } else {
                        gVarD = null;
                    }
                }
                if (gVarD != null) {
                    Iterator it3 = gVarD.e.iterator();
                    it3.getClass();
                    int i2 = 0;
                    String str2 = null;
                    while (it3.hasNext()) {
                        com.google.gson.h hVar2 = (com.google.gson.h) it3.next();
                        hVar2.getClass();
                        if (hVar2 instanceof com.google.gson.k) {
                            com.google.gson.k kVarE4 = hVar2.e();
                            com.google.gson.h hVarL10 = kVarE4.l("link");
                            if (hVarL10 == null || (strH2 = hVarL10.h()) == null) {
                                com.google.gson.h hVarL11 = kVarE4.l("url");
                                strH2 = hVarL11 != null ? hVarL11.h() : null;
                                if (strH2 == null) {
                                }
                            }
                            com.google.gson.h hVarL12 = kVarE4.l("resolution");
                            if (hVarL12 == null || (strH3 = hVarL12.h()) == null) {
                                strH3 = "";
                            }
                            kotlin.text.g gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("(\\d+)", 0, strH3, strH3);
                            int iIntValue = (gVarQ == null || (numQ = kotlin.text.r.Q((String) ((kotlin.collections.b0) gVarQ.a()).get(1))) == null) ? 0 : numQ.intValue();
                            if (iIntValue > i2 || str2 == null) {
                                i2 = iIntValue;
                                str2 = strH2;
                            }
                        }
                    }
                    if (str2 != null) {
                        return kotlin.text.r.O(str2, "//", false) ? "https:".concat(str2) : str2;
                    }
                }
                com.google.gson.h hVarL13 = kVar.l("url");
                if (hVarL13 == null) {
                    strH = null;
                } else {
                    if (!(hVarL13 instanceof com.google.gson.l)) {
                        hVarL13 = null;
                    }
                    if (hVarL13 != null) {
                        strH = hVarL13.h();
                    } else {
                        strH = null;
                    }
                }
                if (strH != null) {
                    return kotlin.text.r.O(strH, "//", false) ? "https:".concat(strH) : strH;
                }
                return null;
            }
            com.google.gson.h hVarL14 = kVar.l((String) it.next());
            if (hVarL14 == null) {
                gVarD3 = null;
            } else {
                if (!(hVarL14 instanceof com.google.gson.g)) {
                    hVarL14 = null;
                }
                if (hVarL14 != null) {
                    gVarD3 = hVarL14.d();
                } else {
                    gVarD3 = null;
                }
            }
            if (gVarD3 != null) {
                Iterator it4 = gVarD3.e.iterator();
                it4.getClass();
                while (it4.hasNext()) {
                    com.google.gson.h hVar3 = (com.google.gson.h) it4.next();
                    hVar3.getClass();
                    if (hVar3 instanceof com.google.gson.k) {
                        com.google.gson.k kVarE5 = hVar3.e();
                        com.google.gson.h hVarL15 = kVarE5.l("url");
                        if (hVarL15 != null && (strH6 = hVarL15.h()) != null) {
                            break loop0;
                        }
                        com.google.gson.h hVarL16 = kVarE5.l("link");
                        strH6 = hVarL16 != null ? hVarL16.h() : null;
                        if (strH6 != null) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return kotlin.text.r.O(strH6, "//", false) ? "https:".concat(strH6) : strH6;
    }

    @Override // com.app.mlounge.data.providers.k0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new y1(this, num, num2, str2, str, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.k0
    public final String getName() {
        return this.name;
    }
}
