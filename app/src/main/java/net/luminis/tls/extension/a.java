package net.luminis.tls.extension;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public final /* synthetic */ int a;
    public Serializable b;

    public a(ByteBuffer byteBuffer, int i) throws net.luminis.tls.alert.a {
        net.luminis.tls.g gVar;
        net.luminis.tls.f fVar;
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayList();
                int iB = b(byteBuffer, net.luminis.tls.d.psk_key_exchange_modes.e, 2);
                byte b = byteBuffer.get();
                if (iB != b + 1) {
                    net.luminis.tls.engine.impl.c.g("inconsistent length");
                    throw null;
                }
                for (int i2 = 0; i2 < b; i2++) {
                    byte b2 = byteBuffer.get();
                    net.luminis.tls.g[] gVarArrValues = net.luminis.tls.g.values();
                    int length = gVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            gVar = gVarArrValues[i3];
                            if (gVar.e != b2) {
                                i3++;
                            }
                        } else {
                            gVar = null;
                        }
                    }
                    if (gVar != null) {
                        ((ArrayList) this.b).add(gVar);
                    }
                }
                return;
            case 2:
                this.b = new ArrayList();
                int iB2 = b(byteBuffer, net.luminis.tls.d.supported_groups.e, 4);
                short s = byteBuffer.getShort();
                if (iB2 != s + 2) {
                    net.luminis.tls.engine.impl.c.g("inconsistent length");
                    throw null;
                }
                if (s % 2 != 0) {
                    net.luminis.tls.engine.impl.c.g("invalid group length");
                    throw null;
                }
                for (int i4 = 0; i4 < s; i4 += 2) {
                    int i5 = byteBuffer.getShort() % 65535;
                    net.luminis.tls.f[] fVarArrValues = net.luminis.tls.f.values();
                    int length2 = fVarArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length2) {
                            fVar = fVarArrValues[i6];
                            if (fVar.e != i5) {
                                i6++;
                            }
                        } else {
                            fVar = null;
                        }
                    }
                    if (fVar != null) {
                        ((ArrayList) this.b).add(fVar);
                    }
                }
                return;
            default:
                int iB3 = b(byteBuffer, net.luminis.tls.d.application_layer_protocol_negotiation.e, 3);
                int i7 = byteBuffer.getShort();
                if (i7 != iB3 - 2) {
                    net.luminis.tls.engine.impl.c.g("inconsistent lengths");
                    throw null;
                }
                this.b = new ArrayList();
                while (i7 > 0) {
                    int i8 = byteBuffer.get() & 255;
                    if (i8 > i7 - 1) {
                        net.luminis.tls.engine.impl.c.g("incorrect length");
                        throw null;
                    }
                    byte[] bArr = new byte[i8];
                    byteBuffer.get(bArr);
                    ((ArrayList) this.b).add(new String(bArr));
                    i7 -= i8 + 1;
                }
                return;
        }
    }

    public static void c(ByteBuffer byteBuffer, int i) throws net.luminis.tls.alert.a {
        if (byteBuffer.remaining() >= i) {
            return;
        }
        net.luminis.tls.engine.impl.c.g("extension underflow");
    }

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                Iterator it = arrayList.iterator();
                int length = 0;
                while (it.hasNext()) {
                    length += ((String) it.next()).getBytes(Charset.forName("UTF-8")).length;
                }
                int size = arrayList.size() + 6 + length;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
                byteBufferAllocate.putShort(net.luminis.tls.d.application_layer_protocol_negotiation.e);
                byteBufferAllocate.putShort((short) (size - 4));
                byteBufferAllocate.putShort((short) (size - 6));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    byte[] bytes = ((String) it2.next()).getBytes(Charset.forName("UTF-8"));
                    byteBufferAllocate.put((byte) bytes.length);
                    byteBufferAllocate.put(bytes);
                }
                return byteBufferAllocate.array();
            case 1:
                ArrayList arrayList2 = (ArrayList) this.b;
                short size2 = (short) (arrayList2.size() + 1);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(size2 + 4);
                byteBufferAllocate2.putShort(net.luminis.tls.d.psk_key_exchange_modes.e);
                byteBufferAllocate2.putShort(size2);
                byteBufferAllocate2.put((byte) arrayList2.size());
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    byteBufferAllocate2.put(((net.luminis.tls.g) it3.next()).e);
                }
                return byteBufferAllocate2.array();
            case 2:
                ArrayList arrayList3 = (ArrayList) this.b;
                int size3 = arrayList3.size() * 2;
                int i = size3 + 2;
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(size3 + 6);
                byteBufferAllocate3.putShort(net.luminis.tls.d.supported_groups.e);
                byteBufferAllocate3.putShort((short) i);
                byteBufferAllocate3.putShort((short) (arrayList3.size() * 2));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    byteBufferAllocate3.putShort(((net.luminis.tls.f) it4.next()).e);
                }
                return byteBufferAllocate3.array();
            default:
                short length2 = (short) ((String) this.b).length();
                short s = (short) (length2 + 5);
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(s + 4);
                byteBufferAllocate4.putShort(net.luminis.tls.d.server_name.e);
                byteBufferAllocate4.putShort(s);
                byteBufferAllocate4.putShort((short) (length2 + 3));
                byteBufferAllocate4.put((byte) 0);
                byteBufferAllocate4.putShort(length2);
                byteBufferAllocate4.put(((String) this.b).getBytes(Charset.forName("ASCII")));
                return byteBufferAllocate4.array();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "AlpnExtension " + ((ArrayList) this.b);
            case 1:
            default:
                return super.toString();
            case 2:
                return "SupportedGroupsExtension" + ((ArrayList) this.b);
        }
    }

    public a(String str) {
        this.a = 0;
        if (str != null && !str.trim().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(str);
            return;
        }
        net.luminis.tls.engine.impl.c.o("protocol cannot be empty");
        throw null;
    }

    public a(net.luminis.tls.f fVar) {
        this.a = 2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(fVar);
    }

    public a(net.luminis.tls.g gVar) {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(gVar);
    }

    public a(net.luminis.tls.g[] gVarArr) {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(Arrays.asList(gVarArr));
    }
}
