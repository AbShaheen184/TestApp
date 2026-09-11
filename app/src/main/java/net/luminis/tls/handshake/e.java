package net.luminis.tls.handshake;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import net.luminis.tls.extension.j;
import net.luminis.tls.extension.m;
import net.luminis.tls.extension.n;
import net.luminis.tls.extension.o;
import net.luminis.tls.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    /* JADX WARN: Code duplicated, block: B:192:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:202:0x0432 A[LOOP:0: B:6:0x0020->B:202:0x0432, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x03d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0439 A[SYNTHETIC] */
    public static ArrayList c(ByteBuffer byteBuffer, net.luminis.tls.e eVar, l lVar) throws net.luminis.tls.alert.a {
        int i;
        int i2;
        net.luminis.quic.tls.a aVar;
        short s;
        int iPosition;
        net.luminis.tls.e eVar2;
        h hVar;
        int i3;
        int i4 = 2;
        if (byteBuffer.remaining() < 2) {
            net.luminis.tls.engine.impl.c.g("Extension field must be at least 2 bytes long");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        short s2 = 65535;
        int i5 = byteBuffer.getShort() & 65535;
        if (byteBuffer.remaining() < i5) {
            net.luminis.tls.engine.impl.c.g("Extensions too short");
            return null;
        }
        while (true) {
            int i6 = 4;
            if (i5 < 4) {
                return arrayList;
            }
            int i7 = byteBuffer.getShort() & s2;
            int i8 = byteBuffer.getShort() & s2;
            int i9 = i5 - 4;
            if (i8 > i9) {
                net.luminis.tls.engine.impl.c.g("Extension length exceeds extensions length");
                return null;
            }
            int iPosition2 = byteBuffer.position();
            short s3 = net.luminis.tls.d.server_name.e;
            int i10 = 1;
            short s4 = s2;
            int i11 = 0;
            if (i7 == s3) {
                net.luminis.tls.extension.a aVar2 = new net.luminis.tls.extension.a();
                int iB = aVar2.b(byteBuffer, s3, 0);
                if (iB <= 0) {
                    aVar2.b = null;
                } else {
                    if (iB < i4) {
                        net.luminis.tls.engine.impl.c.g("incorrect extension length");
                        return null;
                    }
                    int i12 = byteBuffer.getShort();
                    if (iB != i12 + 2) {
                        net.luminis.tls.engine.impl.c.g("inconsistent length");
                        return null;
                    }
                    while (i12 > 0) {
                        net.luminis.tls.extension.a.c(byteBuffer, i10);
                        if (byteBuffer.get() != 0) {
                            net.luminis.tls.extension.a.c(byteBuffer, i4);
                            i3 = byteBuffer.getShort() & s4;
                            net.luminis.tls.extension.a.c(byteBuffer, i3);
                            if (i3 > byteBuffer.remaining()) {
                                net.luminis.tls.engine.impl.c.g("extension underflow");
                                return null;
                            }
                            byteBuffer.get(new byte[i3]);
                        } else {
                            net.luminis.tls.extension.a.c(byteBuffer, i4);
                            i3 = byteBuffer.getShort() & s4;
                            net.luminis.tls.extension.a.c(byteBuffer, i3);
                            byte[] bArr = new byte[i3];
                            byteBuffer.get(bArr);
                            aVar2.b = new String(bArr, Charset.forName("ASCII"));
                        }
                        i12 -= i3 + 3;
                        i10 = 1;
                    }
                    if (i12 < 0) {
                        net.luminis.tls.engine.impl.c.g("inconsistent length");
                        return null;
                    }
                }
                arrayList.add(aVar2);
            } else {
                if (i7 == net.luminis.tls.d.supported_groups.e) {
                    arrayList.add(new net.luminis.tls.extension.a(byteBuffer, 2));
                } else {
                    net.luminis.tls.d dVar = net.luminis.tls.d.signature_algorithms;
                    if (i7 == dVar.e) {
                        m mVar = new m();
                        mVar.a = new ArrayList();
                        int iB2 = mVar.b(byteBuffer, dVar.e, 4);
                        short s5 = byteBuffer.getShort();
                        if (iB2 != s5 + 2) {
                            net.luminis.tls.engine.impl.c.g("inconsistent length");
                            return null;
                        }
                        if (s5 % 2 != 0) {
                            net.luminis.tls.engine.impl.c.g("invalid group length");
                            return null;
                        }
                        int i13 = 0;
                        while (i13 < s5) {
                            int i14 = byteBuffer.getShort() % s4;
                            h[] hVarArrValues = h.values();
                            int length = hVarArrValues.length;
                            int i15 = i11;
                            while (true) {
                                if (i15 >= length) {
                                    hVar = null;
                                    break;
                                }
                                hVar = hVarArrValues[i15];
                                if (hVar.e == i14) {
                                    break;
                                }
                                i15++;
                            }
                            if (hVar != null) {
                                mVar.a.add(hVar);
                            }
                            i13 += 2;
                            i11 = 0;
                        }
                        arrayList.add(mVar);
                    } else if (i7 == net.luminis.tls.d.application_layer_protocol_negotiation.e) {
                        arrayList.add(new net.luminis.tls.extension.a(byteBuffer, 0));
                    } else {
                        net.luminis.tls.d dVar2 = net.luminis.tls.d.pre_shared_key;
                        short s6 = dVar2.e;
                        if (i7 != s6) {
                            i = i9;
                            short s7 = net.luminis.tls.d.early_data.e;
                            if (i7 == s7) {
                                net.luminis.tls.extension.f fVar = new net.luminis.tls.extension.f();
                                int iB3 = fVar.b(byteBuffer, s7, 0);
                                if (eVar == net.luminis.tls.e.new_session_ticket) {
                                    if (iB3 != 4) {
                                        net.luminis.tls.engine.impl.c.g("invalid extension data length");
                                        return null;
                                    }
                                    fVar.a = Long.valueOf(((long) byteBuffer.getInt()) & 4294967295L);
                                } else if (iB3 != 0) {
                                    net.luminis.tls.engine.impl.c.g("invalid extension data length");
                                    return null;
                                }
                                arrayList.add(fVar);
                            } else if (i7 == net.luminis.tls.d.supported_versions.e) {
                                arrayList.add(new n(byteBuffer, eVar));
                            } else if (i7 == net.luminis.tls.d.psk_key_exchange_modes.e) {
                                arrayList.add(new net.luminis.tls.extension.a(byteBuffer, 1));
                            } else if (i7 == net.luminis.tls.d.certificate_authorities.e) {
                                arrayList.add(new net.luminis.tls.extension.b(byteBuffer));
                            } else {
                                net.luminis.tls.d dVar3 = net.luminis.tls.d.key_share;
                                if (i7 == dVar3.e) {
                                    j jVar = new j();
                                    jVar.b = new ArrayList();
                                    int iB4 = jVar.b(byteBuffer, dVar3.e, 1);
                                    i2 = 2;
                                    if (iB4 < 2) {
                                        net.luminis.tls.engine.impl.c.g("extension underflow");
                                        return null;
                                    }
                                    if (eVar == net.luminis.tls.e.client_hello) {
                                        int iD = byteBuffer.getShort();
                                        if (iB4 != iD + 2) {
                                            net.luminis.tls.engine.impl.c.g("inconsistent length");
                                            return null;
                                        }
                                        while (iD > 0) {
                                            iD -= jVar.d(byteBuffer);
                                        }
                                        if (iD != 0) {
                                            net.luminis.tls.engine.impl.c.g("inconsistent length");
                                            return null;
                                        }
                                    } else {
                                        if (eVar != net.luminis.tls.e.server_hello) {
                                            net.luminis.tls.engine.impl.c.a();
                                            return null;
                                        }
                                        if (iB4 - jVar.d(byteBuffer) != 0) {
                                            net.luminis.tls.engine.impl.c.g("inconsistent length");
                                            return null;
                                        }
                                    }
                                    arrayList.add(jVar);
                                } else {
                                    i2 = 2;
                                    if (lVar != null) {
                                        net.luminis.quic.crypto.f fVar2 = (net.luminis.quic.crypto.f) lVar.y;
                                        short s8 = byteBuffer.getShort();
                                        int i16 = s8 & s4;
                                        int i17 = fVar2.a.a.a;
                                        if (i17 == 1 || i17 == 1798521807 ? i16 != 57 : i16 != 65445) {
                                            aVar = null;
                                        } else {
                                            net.luminis.quic.impl.n nVar = fVar2.a.a;
                                            aVar = new net.luminis.quic.tls.a(nVar);
                                            net.luminis.quic.log.a aVar3 = fVar2.e;
                                            int i18 = byteBuffer.getShort() & s4;
                                            int i19 = nVar.a;
                                            if (i19 == 1 || i19 == 1798521807) {
                                                if (i18 != 57) {
                                                    com.google.gson.b.l();
                                                    return null;
                                                }
                                                s = byteBuffer.getShort();
                                                iPosition = byteBuffer.position();
                                                aVar3.getClass();
                                                while (byteBuffer.position() - iPosition < s) {
                                                    try {
                                                        aVar.e(byteBuffer, aVar3);
                                                    } catch (net.luminis.quic.generic.a unused) {
                                                        net.luminis.tls.engine.impl.c.g("invalid integer encoding in transport parameter extension");
                                                        return null;
                                                    }
                                                }
                                                if (byteBuffer.position() - iPosition != s) {
                                                    net.luminis.tls.engine.impl.c.g("inconsistent size in transport parameter extension");
                                                    return null;
                                                }
                                            } else {
                                                if (i18 != 65445) {
                                                    com.google.gson.b.l();
                                                    return null;
                                                }
                                                s = byteBuffer.getShort();
                                                iPosition = byteBuffer.position();
                                                aVar3.getClass();
                                                while (byteBuffer.position() - iPosition < s) {
                                                    aVar.e(byteBuffer, aVar3);
                                                }
                                                if (byteBuffer.position() - iPosition != s) {
                                                    net.luminis.tls.engine.impl.c.g("inconsistent size in transport parameter extension");
                                                    return null;
                                                }
                                            }
                                        }
                                    } else {
                                        aVar = null;
                                    }
                                    if (aVar != null) {
                                        arrayList.add(aVar);
                                    } else {
                                        o oVar = new o();
                                        if (byteBuffer.remaining() < 4) {
                                            net.luminis.tls.engine.impl.c.g("Extension must be at least 4 bytes long");
                                            return null;
                                        }
                                        byteBuffer.getShort();
                                        int i20 = byteBuffer.getShort() & s4;
                                        if (byteBuffer.remaining() < i20) {
                                            net.luminis.tls.engine.impl.c.g("Invalid extension length");
                                            return null;
                                        }
                                        byteBuffer.get(new byte[i20 + 4]);
                                        arrayList.add(oVar);
                                    }
                                }
                            }
                        } else if (eVar == net.luminis.tls.e.server_hello) {
                            net.luminis.tls.extension.l lVar2 = new net.luminis.tls.extension.l();
                            lVar2.b(byteBuffer, s6, 2);
                            lVar2.a = byteBuffer.getShort();
                            arrayList.add(lVar2);
                        } else {
                            if (eVar != net.luminis.tls.e.client_hello) {
                                for (net.luminis.tls.e eVar3 : net.luminis.tls.e.values()) {
                                    if (eVar3.e == eVar.e) {
                                        eVar2 = eVar3;
                                        throw new net.luminis.tls.alert.a("Extension not allowed in " + eVar2, 5);
                                    }
                                }
                                eVar2 = null;
                                throw new net.luminis.tls.alert.a("Extension not allowed in " + eVar2, 5);
                            }
                            net.luminis.tls.extension.e eVar4 = new net.luminis.tls.extension.e();
                            int iPosition3 = byteBuffer.position();
                            int iB5 = eVar4.b(byteBuffer, dVar2.e, 44);
                            eVar4.a = new ArrayList();
                            int i21 = byteBuffer.getShort() & s4;
                            int i22 = 2;
                            int i23 = iB5 - 2;
                            while (i21 > 0) {
                                if (i23 < i22) {
                                    net.luminis.tls.engine.impl.c.g("Incomplete psk identity");
                                    return null;
                                }
                                int i24 = byteBuffer.getShort() & s4;
                                int i25 = i23 - 2;
                                if (i24 > i25) {
                                    net.luminis.tls.engine.impl.c.g("Incorrect identity length value");
                                    return null;
                                }
                                byte[] bArr2 = new byte[i24];
                                byteBuffer.get(bArr2);
                                int i26 = i25 - i24;
                                if (i26 < i6) {
                                    net.luminis.tls.engine.impl.c.g("Incomplete psk identity");
                                    return null;
                                }
                                eVar4.a.add(new net.luminis.tls.extension.d(byteBuffer.getInt(), bArr2));
                                i21 -= i24 + 6;
                                i23 = i26 - 4;
                                i9 = i9;
                                i6 = 4;
                                i22 = 2;
                            }
                            i = i9;
                            if (i21 != 0) {
                                net.luminis.tls.engine.impl.c.g("Incorrect identities length value");
                                return null;
                            }
                            eVar4.c = byteBuffer.position() - iPosition3;
                            eVar4.b = new ArrayList();
                            if (i23 < 2) {
                                net.luminis.tls.engine.impl.c.g("Incomplete binders");
                                return null;
                            }
                            int i27 = byteBuffer.getShort() & s4;
                            int i28 = i23 - 2;
                            while (i27 > 0) {
                                if (i28 < 1) {
                                    net.luminis.tls.engine.impl.c.g("Incorrect binder value");
                                    return null;
                                }
                                int i29 = byteBuffer.get() & 255;
                                int i30 = i28 - 1;
                                if (i29 > i30) {
                                    net.luminis.tls.engine.impl.c.g("Incorrect binder length value");
                                    return null;
                                }
                                if (i29 < 32) {
                                    net.luminis.tls.engine.impl.c.g("Invalid binder length");
                                    return null;
                                }
                                byte[] bArr3 = new byte[i29];
                                byteBuffer.get(bArr3);
                                i28 = i30 - i29;
                                eVar4.b.add(new net.luminis.tls.extension.c(bArr3));
                                i27 -= i29 + 1;
                            }
                            if (i27 != 0) {
                                net.luminis.tls.engine.impl.c.g("Incorrect binders length value");
                                return null;
                            }
                            if (i28 > 0) {
                                net.luminis.tls.engine.impl.c.g("Incorrect extension data length value");
                                return null;
                            }
                            if (eVar4.a.size() != eVar4.b.size()) {
                                net.luminis.tls.engine.impl.c.g("Inconsistent number of identities vs binders");
                                return null;
                            }
                            if (eVar4.a.size() == 0) {
                                net.luminis.tls.engine.impl.c.g("Empty OfferedPsks");
                                return null;
                            }
                            arrayList.add(eVar4);
                        }
                        i2 = 2;
                    }
                    i = i9;
                    i2 = 2;
                }
                if (byteBuffer.position() - iPosition2 == i8 + 4) {
                    net.luminis.tls.engine.impl.c.g("Incorrect extension length");
                    return null;
                }
                i5 = i - i8;
                i4 = i2;
                s2 = s4;
            }
            i2 = i4;
            i = i9;
            if (byteBuffer.position() - iPosition2 == i8 + 4) {
                net.luminis.tls.engine.impl.c.g("Incorrect extension length");
                return null;
            }
            i5 = i - i8;
            i4 = i2;
            s2 = s4;
        }
    }

    public abstract byte[] a();

    public abstract net.luminis.tls.e b();

    public final int d(ByteBuffer byteBuffer, net.luminis.tls.e eVar, int i) {
        if (byteBuffer.remaining() < 4) {
            net.luminis.tls.engine.impl.c.g("handshake message underflow");
            return 0;
        }
        if ((byteBuffer.get() & 255) != eVar.e) {
            org.mozilla.javascript.c.a();
            return 0;
        }
        int i2 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        if (i2 + 4 >= i) {
            if (byteBuffer.remaining() >= i2) {
                return i2;
            }
            net.luminis.tls.engine.impl.c.g("handshake message underflow");
            return 0;
        }
        throw new net.luminis.tls.alert.a(getClass().getSimpleName() + " can't be less than " + i + " bytes", 2);
    }
}
