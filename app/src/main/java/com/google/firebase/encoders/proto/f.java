package com.google.firebase.encoders.proto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.google.firebase.encoders.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final com.google.firebase.encoders.c g = new com.google.firebase.encoders.c("key", coil3.compose.internal.f.h(coil3.compose.internal.f.g(e.class, new a(1))));
    public static final com.google.firebase.encoders.c h = new com.google.firebase.encoders.c(ES6Iterator.VALUE_PROPERTY, coil3.compose.internal.f.h(coil3.compose.internal.f.g(e.class, new a(2))));
    public static final com.google.firebase.encoders.json.a i = new com.google.firebase.encoders.json.a(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final com.google.firebase.encoders.d d;
    public final h e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, com.google.firebase.encoders.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = dVar;
    }

    public static int k(com.google.firebase.encoders.c cVar) {
        e eVar = (e) ((Annotation) cVar.b.get(e.class));
        if (eVar != null) {
            return eVar.tag();
        }
        throw new com.google.firebase.encoders.b("Field has no @Protobuf config");
    }

    @Override // com.google.firebase.encoders.e
    public final com.google.firebase.encoders.e a(com.google.firebase.encoders.c cVar, boolean z) {
        f(cVar, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    public final com.google.firebase.encoders.e b(com.google.firebase.encoders.c cVar, long j) throws IOException {
        h(cVar, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    public final com.google.firebase.encoders.e c(com.google.firebase.encoders.c cVar, int i2) {
        f(cVar, i2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    public final com.google.firebase.encoders.e d(com.google.firebase.encoders.c cVar, double d) throws IOException {
        e(cVar, d, true);
        return this;
    }

    public final void e(com.google.firebase.encoders.c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        l((k(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void f(com.google.firebase.encoders.c cVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.b.get(e.class));
        if (eVar == null) {
            throw new com.google.firebase.encoders.b("Field has no @Protobuf config");
        }
        int iOrdinal = eVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(eVar.tag() << 3);
            l(i2);
        } else if (iOrdinal == 1) {
            l(eVar.tag() << 3);
            l((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((eVar.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    @Override // com.google.firebase.encoders.e
    public final com.google.firebase.encoders.e g(com.google.firebase.encoders.c cVar, Object obj) {
        i(cVar, obj, true);
        return this;
    }

    public final void h(com.google.firebase.encoders.c cVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.b.get(e.class));
        if (eVar == null) {
            throw new com.google.firebase.encoders.b("Field has no @Protobuf config");
        }
        int iOrdinal = eVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(eVar.tag() << 3);
            m(j);
        } else if (iOrdinal == 1) {
            l(eVar.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((eVar.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(com.google.firebase.encoders.c cVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            e(cVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            l((k(cVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(cVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            f(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(cVar) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        com.google.firebase.encoders.d dVar = (com.google.firebase.encoders.d) this.b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z);
            return;
        }
        com.google.firebase.encoders.f fVar = (com.google.firebase.encoders.f) this.c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.e;
            hVar.a = false;
            hVar.c = cVar;
            hVar.b = z;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            f(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            f(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z);
        }
    }

    public final void j(com.google.firebase.encoders.d dVar, com.google.firebase.encoders.c cVar, Object obj, boolean z) throws IOException {
        b bVar = new b();
        bVar.e = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = bVar;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j = bVar.e;
                bVar.close();
                if (z && j == 0) {
                    return;
                }
                l((k(cVar) << 3) | 2);
                m(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
