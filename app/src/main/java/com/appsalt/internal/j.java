package com.appsalt.internal;

import android.os.Build;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.msgpack.core.buffer.MessageBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = 0;
        }
        a = bArr;
    }

    public static t1 a(c2 c2Var) {
        byte[] bArrE;
        byte b;
        byte b2 = 2;
        if (c2Var instanceof z3) {
            z3 z3Var = (z3) c2Var;
            bArrE = e(d(z3Var.a), (byte) 2, z3Var.b);
        } else if (c2Var instanceof p4) {
            p4 p4Var = (p4) c2Var;
            byte[] bArrD = d(p4Var.a);
            byte[] bArr = p4Var.b;
            int i = p4Var.d;
            int i2 = p4Var.e;
            int iE = androidx.constraintlayout.core.g.e(p4Var.c);
            if (iE == 0) {
                b2 = 1;
            } else if (iE != 1) {
                if (iE == 2) {
                    b2 = 3;
                } else {
                    if (iE != 3) {
                        coil3.g.a();
                        return null;
                    }
                    b2 = 0;
                }
            }
            org.msgpack.core.f fVar = org.msgpack.core.h.b;
            fVar.getClass();
            org.msgpack.core.a aVar = new org.msgpack.core.a(fVar);
            aVar.X(4);
            aVar.Z("ip");
            aVar.z(bArr.length);
            aVar.a(bArr);
            aVar.Z("dns_resolve_type");
            aVar.b0(b2);
            aVar.Z("dns_lookup_time");
            aVar.N(i);
            aVar.Z("connect_time");
            aVar.N(i2);
            bArrE = e(bArrD, (byte) 1, aVar.a0());
        } else if (c2Var instanceof e4) {
            bArrE = e(d(((e4) c2Var).a), (byte) 3, new byte[0]);
        } else if (c2Var instanceof u1) {
            u1 u1Var = (u1) c2Var;
            byte[] bArrD2 = d(u1Var.a);
            byte b3 = u1Var.b;
            byte b4 = u1Var.c;
            byte b5 = u1Var.d;
            byte b6 = u1Var.e;
            byte b7 = (byte) u1Var.f;
            Boolean bool = u1Var.g;
            if (kotlin.jvm.internal.l.a(bool, Boolean.TRUE)) {
                b = 1;
            } else if (kotlin.jvm.internal.l.a(bool, Boolean.FALSE)) {
                b = 0;
            } else {
                if (bool != null) {
                    coil3.g.a();
                    return null;
                }
                b = 2;
            }
            bArrE = e(bArrD2, (byte) 4, new byte[]{0, b3, 0, b4, b5, b6, b7, b, u1Var.h});
        } else if (c2Var instanceof q1) {
            q1 q1Var = (q1) c2Var;
            String str = q1Var.a;
            f1 f1Var = q1Var.b;
            String str2 = f1Var.a;
            String str3 = f1Var.b;
            String str4 = Build.VERSION.RELEASE;
            String str5 = q1Var.d.a;
            org.msgpack.core.f fVar2 = org.msgpack.core.h.b;
            fVar2.getClass();
            org.msgpack.core.a aVar2 = new org.msgpack.core.a(fVar2);
            aVar2.X(8);
            aVar2.Z("version");
            aVar2.Z("1.5.0-SNAPSHOT");
            aVar2.Z("protocol");
            aVar2.N(2);
            aVar2.Z("cid");
            aVar2.Z("HASDKANKTLKTLWQ251023PA");
            aVar2.Z("uid");
            aVar2.Z(str);
            aVar2.Z("app");
            aVar2.X(2);
            aVar2.Z("name");
            aVar2.Z(str2);
            aVar2.Z("package");
            aVar2.Z(str3);
            aVar2.Z("os");
            aVar2.X(2);
            aVar2.Z("name");
            aVar2.Z("android");
            aVar2.Z("version");
            aVar2.Z(str4);
            aVar2.Z("optional");
            aVar2.X(1);
            aVar2.Z("aid");
            aVar2.Z(str5);
            aVar2.Z("features");
            aVar2.X(5);
            aVar2.Z("ip_version");
            aVar2.L();
            aVar2.Z("target_blacklist");
            aVar2.L();
            aVar2.Z("tcp");
            aVar2.L();
            aVar2.Z("udp");
            aVar2.L();
            aVar2.Z("reconnect");
            aVar2.L();
            bArrE = e(a, (byte) 0, aVar2.a0());
        } else {
            bArrE = new byte[0];
        }
        return new t1(bArrE);
    }

    public static c2 b(byte[] bArr) {
        t tVar;
        int i;
        long j;
        int i2;
        MessageBuffer messageBuffer;
        int i3 = 0;
        byte[] bArrZ = new byte[0];
        byte[] bArrZ2 = new byte[0];
        org.msgpack.core.i iVarA = org.msgpack.core.h.a(bArr);
        int iZ = iVarA.Z();
        int i4 = 0;
        byte bY = 0;
        while (true) {
            String str = null;
            if (i4 >= iZ) {
                t tVar2 = t.V4;
                t tVar3 = t.V6;
                if (bY != 1) {
                    if (bY == 2) {
                        return new z3(f(bArrZ), bArrZ2);
                    }
                    if (bY == 3) {
                        return new e4(f(bArrZ));
                    }
                    if (bY == 4) {
                        return new b1(f(bArrZ));
                    }
                    if (bY == 7) {
                        org.msgpack.core.i iVarA2 = org.msgpack.core.h.a(bArrZ2);
                        int iZ2 = iVarA2.Z();
                        List listC = kotlin.collections.u.e;
                        List listC2 = listC;
                        while (i3 < iZ2) {
                            String lowerCase = iVarA2.a0().toLowerCase(Locale.ROOT);
                            if (kotlin.jvm.internal.l.a(lowerCase, "ipv4_range")) {
                                listC = c(iVarA2, tVar2);
                            } else if (kotlin.jvm.internal.l.a(lowerCase, "ipv6_range")) {
                                listC2 = c(iVarA2, tVar3);
                            }
                            i3++;
                        }
                        return new j3(new i(listC, listC2));
                    }
                    if (bY != 8) {
                        return null;
                    }
                    org.msgpack.core.i iVarA3 = org.msgpack.core.h.a(bArrZ2);
                    ArrayList arrayList = new ArrayList();
                    int iZ3 = iVarA3.Z();
                    for (int i5 = 0; i5 < iZ3; i5++) {
                        if (kotlin.jvm.internal.l.a(iVarA3.a0(), "hosts")) {
                            int iN = iVarA3.N();
                            for (int i6 = 0; i6 < iN; i6++) {
                                arrayList.add(iVarA3.a0());
                            }
                        }
                    }
                    return new q2(arrayList);
                }
                String strF = f(bArrZ);
                org.msgpack.core.i iVarA4 = org.msgpack.core.h.a(bArrZ2);
                int iZ4 = iVarA4.Z();
                int i7 = 0;
                byte bY2 = 0;
                String strA0 = "";
                byte bY3 = 0;
                while (i3 < iZ4) {
                    String lowerCase2 = iVarA4.a0().toLowerCase(Locale.ROOT);
                    int iHashCode = lowerCase2.hashCode();
                    if (iHashCode != -1315653184) {
                        if (iHashCode != -989163880) {
                            if (iHashCode != 3208616) {
                                if (iHashCode == 3446913 && lowerCase2.equals("port")) {
                                    byte b = iVarA4.readByte();
                                    int i8 = b & 255;
                                    if (i8 > 127 && i8 < 224) {
                                        i = b;
                                        i = b;
                                        switch (b) {
                                            case -52:
                                                i = iVarA4.readByte() & 255;
                                                break;
                                            case -51:
                                                i = iVarA4.w(2).getShort(iVarA4.H) & 65535;
                                                break;
                                            case -50:
                                                int i9 = iVarA4.w(4).getInt(iVarA4.H);
                                                i = i9;
                                                if (i9 < 0) {
                                                    throw new org.msgpack.core.d(BigInteger.valueOf(((long) (Integer.MAX_VALUE & i9)) + 2147483648L));
                                                }
                                                break;
                                            case -49:
                                                j = iVarA4.w(8).getLong(iVarA4.H);
                                                if (j < 0 || j > 2147483647L) {
                                                    throw new org.msgpack.core.d(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
                                                }
                                                i = (int) j;
                                                break;
                                            case -48:
                                                i = iVarA4.readByte();
                                                break;
                                            case -47:
                                                i = iVarA4.w(2).getShort(iVarA4.H);
                                                break;
                                            case -46:
                                                i = iVarA4.w(4).getInt(iVarA4.H);
                                                break;
                                            case -45:
                                                j = iVarA4.w(8).getLong(iVarA4.H);
                                                if (j < -2147483648L || j > 2147483647L) {
                                                    throw new org.msgpack.core.d(BigInteger.valueOf(j));
                                                }
                                                i = (int) j;
                                                break;
                                            default:
                                                throw org.msgpack.core.i.L("Integer", b);
                                        }
                                    }
                                    i = b;
                                    i = b;
                                    i = b;
                                    i7 = i;
                                }
                            } else if (lowerCase2.equals("host")) {
                                strA0 = iVarA4.a0();
                            }
                        } else if (lowerCase2.equals("protocol")) {
                            bY2 = iVarA4.Y();
                        }
                    } else if (lowerCase2.equals("ip_version")) {
                        bY3 = iVarA4.Y();
                    }
                    i3++;
                    i7 = i7;
                }
                if (bY3 == 1) {
                    tVar = tVar2;
                } else if (bY3 != 2) {
                    tVar2 = t.ANY;
                    tVar = tVar2;
                } else {
                    tVar = tVar3;
                }
                return new j4(strF, strA0, i7 == true ? 1 : 0, bY2, tVar);
            }
            String lowerCase3 = iVarA.a0().toLowerCase(Locale.ROOT);
            while (true) {
                int size = iVarA.E.size();
                i2 = iVarA.F;
                if (size <= i2) {
                    org.msgpack.core.buffer.a aVar = iVarA.D;
                    if (aVar.y) {
                        messageBuffer = null;
                    } else {
                        aVar.y = true;
                        messageBuffer = aVar.e;
                    }
                    if (messageBuffer == null) {
                        throw new org.msgpack.core.c(1);
                    }
                    iVarA.E.size();
                    iVarA.E = messageBuffer;
                    iVarA.F = 0;
                }
            }
            if (iVarA.E.getByte(i2) == -64) {
                iVarA.readByte();
            } else {
                str = lowerCase3;
            }
            if (str != null) {
                int iHashCode2 = str.hashCode();
                if (iHashCode2 != -786701938) {
                    if (iHashCode2 != 3355) {
                        if (iHashCode2 == 3575610 && str.equals("type")) {
                            bY = iVarA.Y();
                        }
                    } else if (str.equals("id")) {
                        bArrZ = iVarA.z(iVarA.X());
                    }
                } else if (str.equals("payload")) {
                    bArrZ2 = iVarA.z(iVarA.X());
                }
            }
            i4++;
        }
    }

    public static ArrayList c(org.msgpack.core.i iVar, t tVar) {
        ArrayList arrayList = new ArrayList();
        int iN = iVar.N();
        for (int i = 0; i < iN; i++) {
            e eVar = new e(new byte[0], tVar);
            e eVar2 = new e(new byte[0], tVar);
            int iZ = iVar.Z();
            for (int i2 = 0; i2 < iZ; i2++) {
                String lowerCase = iVar.a0().toLowerCase(Locale.ROOT);
                if (kotlin.jvm.internal.l.a(lowerCase, "from")) {
                    eVar = new e(iVar.z(iVar.X()), tVar);
                } else if (kotlin.jvm.internal.l.a(lowerCase, "to")) {
                    eVar2 = new e(iVar.z(iVar.X()), tVar);
                }
            }
            arrayList.add(new o(eVar, eVar2));
        }
        return arrayList;
    }

    public static byte[] d(String str) {
        ArrayList<String> arrayListS = kotlin.text.k.S(2, str);
        if (arrayListS.isEmpty() || kotlin.text.k.d0((CharSequence) kotlin.collections.o.K(arrayListS))) {
            arrayListS = null;
        }
        if (arrayListS == null) {
            return new byte[0];
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(arrayListS, 10));
        for (String str2 : arrayListS) {
            com.google.android.material.shape.e.a(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        return kotlin.collections.o.h0(arrayList);
    }

    public static byte[] e(byte[] bArr, byte b, byte[] bArr2) {
        org.msgpack.core.f fVar = org.msgpack.core.h.b;
        fVar.getClass();
        org.msgpack.core.a aVar = new org.msgpack.core.a(fVar);
        aVar.X(3);
        aVar.Z("id");
        aVar.z(bArr.length);
        aVar.a(bArr);
        aVar.Z("type");
        if (b < -32) {
            aVar.c0((byte) -48, b);
        } else {
            aVar.b0(b);
        }
        aVar.Z("payload");
        aVar.z(bArr2.length);
        aVar.a(bArr2);
        return aVar.a0();
    }

    public static String f(byte[] bArr) {
        return kotlin.collections.n.S(bArr, "", new com.app.mlounge.ui.screens.player.j0(14), 30);
    }
}
