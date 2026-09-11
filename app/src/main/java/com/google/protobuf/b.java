package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements l1 {
    protected int memoizedHashCode;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = u0.a;
        iterable.getClass();
        if (iterable instanceof a1) {
            List listG = ((a1) iterable).g();
            if (list != null) {
                androidx.transition.k.i();
                return;
            }
            list.size();
            Iterator it = listG.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof ByteString) {
                    throw null;
                }
                if (next instanceof byte[]) {
                    ByteString.copyFrom((byte[]) next);
                    throw null;
                }
                throw null;
            }
            return;
        }
        if (iterable instanceof s1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof u1) {
                u1 u1Var = (u1) list;
                int i = u1Var.z + size;
                Object[] objArr = u1Var.y;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        u1Var.y = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10);
                        }
                        u1Var.y = Arrays.copyOf(u1Var.y, length);
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    h0.f(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            _COROUTINE.a aVar = (Object) list2.get(i2);
            if (aVar == null) {
                h0.f(size2, list);
                throw null;
            }
            list.add(aVar);
        }
    }

    public static void checkByteStringIsUtf8(ByteString byteString) {
        if (byteString.isValidUtf8()) {
            return;
        }
        net.luminis.tls.engine.impl.c.o("Byte string is not UTF-8.");
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(a2 a2Var);

    public e2 newUninitializedMessageException() {
        return new e2();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            boolean z = w.b;
            u uVar = new u(bArr, serializedSize);
            writeTo(uVar);
            if (uVar.A() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (uVar.A() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            androidx.media3.exoplayer.hls.playlist.a.j(a("byte array"), e);
            return null;
        }
    }

    public ByteString toByteString() {
        try {
            n nVarNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(nVarNewCodedBuilder.a);
            u uVar = nVarNewCodedBuilder.a;
            if (uVar.A() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (uVar.A() >= 0) {
                return new p(nVarNewCodedBuilder.b);
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            androidx.media3.exoplayer.hls.playlist.a.j(a("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iF = w.f(serializedSize) + serializedSize;
        if (iF > 4096) {
            iF = 4096;
        }
        v vVar = new v(outputStream, iF);
        vVar.x(serializedSize);
        writeTo(vVar);
        if (vVar.e > 0) {
            vVar.F();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        boolean z = w.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        v vVar = new v(outputStream, serializedSize);
        writeTo(vVar);
        if (vVar.e > 0) {
            vVar.F();
        }
    }
}
