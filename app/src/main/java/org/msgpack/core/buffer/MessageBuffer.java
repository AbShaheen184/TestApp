package org.msgpack.core.buffer;

import androidx.constraintlayout.core.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    static final int javaVersion;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:70:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x0136 A[Catch: Exception -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00de, blocks: (B:48:0x00bf, B:49:0x00db, B:71:0x0136, B:58:0x00fa), top: B:75:0x0019 }] */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        Unsafe unsafe2;
        Unsafe unsafe3;
        Constructor<?> declaredConstructor;
        String str = BIGENDIAN_MESSAGE_BUFFER;
        Class cls = Integer.TYPE;
        String str2 = UNIVERSAL_MESSAGE_BUFFER;
        javaVersion = getJavaVersion();
        boolean z2 = false;
        int iArrayBaseOffset = 16;
        try {
            try {
                try {
                    Class.forName("sun.misc.Unsafe");
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                try {
                    try {
                        z2 = Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false")) || System.getProperty("java.runtime.name", "").toLowerCase().contains("android") || (System.getProperty("com.google.appengine.runtime.version") != null) || javaVersion < 7 || !z;
                        if (z2) {
                            unsafe3 = null;
                        } else {
                            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            unsafe3 = (Unsafe) declaredField.get(null);
                            try {
                                if (unsafe3 == null) {
                                    throw new RuntimeException("Unsafe is unavailable");
                                }
                                iArrayBaseOffset = unsafe3.arrayBaseOffset(byte[].class);
                                int iArrayIndexScale = unsafe3.arrayIndexScale(byte[].class);
                                if (iArrayIndexScale != 1) {
                                    throw new IllegalStateException("Byte array index scale must be 1, but is " + iArrayIndexScale);
                                }
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace(System.err);
                                unsafe = unsafe3;
                                ARRAY_BYTE_BASE_OFFSET = 16;
                                isUniversalBuffer = true;
                                if (!DEFAULT_MESSAGE_BUFFER.equals(UNIVERSAL_MESSAGE_BUFFER)) {
                                    Class<?> cls2 = Class.forName(UNIVERSAL_MESSAGE_BUFFER);
                                    Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(byte[].class, cls, cls);
                                    declaredConstructor2.setAccessible(true);
                                    mbArrConstructor = declaredConstructor2;
                                    declaredConstructor = cls2.getDeclaredConstructor(ByteBuffer.class);
                                    declaredConstructor.setAccessible(true);
                                    mbBBConstructor = declaredConstructor;
                                    return;
                                }
                            }
                        }
                        unsafe = unsafe3;
                        ARRAY_BYTE_BASE_OFFSET = iArrayBaseOffset;
                        isUniversalBuffer = z2;
                        if (!z2) {
                            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                                str = DEFAULT_MESSAGE_BUFFER;
                            }
                            str2 = str;
                        }
                        if (!DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                            Class<?> cls3 = Class.forName(str2);
                            Constructor<?> declaredConstructor3 = cls3.getDeclaredConstructor(byte[].class, cls, cls);
                            declaredConstructor3.setAccessible(true);
                            mbArrConstructor = declaredConstructor3;
                            declaredConstructor = cls3.getDeclaredConstructor(ByteBuffer.class);
                            declaredConstructor.setAccessible(true);
                            mbBBConstructor = declaredConstructor;
                            return;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        unsafe3 = null;
                    }
                    mbArrConstructor = null;
                    mbBBConstructor = null;
                } catch (Throwable th) {
                    th = th;
                    unsafe2 = z;
                    unsafe = unsafe2;
                    ARRAY_BYTE_BASE_OFFSET = 16;
                    isUniversalBuffer = z2;
                    if (!z2) {
                        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                            str = DEFAULT_MESSAGE_BUFFER;
                        }
                        str2 = str;
                    }
                    if (DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                        mbArrConstructor = null;
                        mbBBConstructor = null;
                    } else {
                        Class<?> cls4 = Class.forName(str2);
                        Constructor<?> declaredConstructor4 = cls4.getDeclaredConstructor(byte[].class, cls, cls);
                        declaredConstructor4.setAccessible(true);
                        mbArrConstructor = declaredConstructor4;
                        Constructor<?> declaredConstructor5 = cls4.getDeclaredConstructor(ByteBuffer.class);
                        declaredConstructor5.setAccessible(true);
                        mbBBConstructor = declaredConstructor5;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                unsafe2 = 0;
                unsafe = unsafe2;
                ARRAY_BYTE_BASE_OFFSET = 16;
                isUniversalBuffer = z2;
                if (!z2) {
                    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                        str = DEFAULT_MESSAGE_BUFFER;
                    }
                    str2 = str;
                }
                if (DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                    mbArrConstructor = null;
                    mbBBConstructor = null;
                } else {
                    Class<?> cls5 = Class.forName(str2);
                    Constructor<?> declaredConstructor6 = cls5.getDeclaredConstructor(byte[].class, cls, cls);
                    declaredConstructor6.setAccessible(true);
                    mbArrConstructor = declaredConstructor6;
                    Constructor<?> declaredConstructor7 = cls5.getDeclaredConstructor(ByteBuffer.class);
                    declaredConstructor7.setAccessible(true);
                    mbBBConstructor = declaredConstructor7;
                }
                throw th;
            }
        } catch (Exception e3) {
            e3.printStackTrace(System.err);
            net.luminis.tls.engine.impl.c.k(e3);
        }
    }

    public MessageBuffer(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            if (!byteBuffer.hasArray()) {
                net.luminis.tls.engine.impl.c.o("Only the array-backed ByteBuffer or DirectBuffer is supported");
                throw null;
            }
            this.base = byteBuffer.array();
            this.address = byteBuffer.position() + byteBuffer.arrayOffset() + ARRAY_BYTE_BASE_OFFSET;
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        if (isUniversalBuffer) {
            this.base = null;
            this.address = 0L;
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        this.base = null;
        this.address = d.a(byteBuffer) + ((long) byteBuffer.position());
        this.size = byteBuffer.remaining();
        this.reference = byteBuffer;
    }

    public static MessageBuffer allocate(int i) {
        if (i >= 0) {
            return wrap(new byte[i]);
        }
        net.luminis.tls.engine.impl.c.o("size must not be negative");
        return null;
    }

    private static int getJavaVersion() {
        String property = System.getProperty("java.specification.version", "");
        int iIndexOf = property.indexOf(46);
        if (iIndexOf == -1) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException e) {
                e.printStackTrace(System.err);
                return 6;
            }
        }
        try {
            int i = Integer.parseInt(property.substring(0, iIndexOf));
            return i > 1 ? i : Integer.parseInt(property.substring(iIndexOf + 1));
        } catch (NumberFormatException e2) {
            e2.printStackTrace(System.err);
            return 6;
        }
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw new IllegalStateException(e3.getCause());
        }
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i, int i2) {
        bArr.getClass();
        Constructor<?> constructor = mbArrConstructor;
        return constructor != null ? newInstance(constructor, bArr, Integer.valueOf(i), Integer.valueOf(i2)) : new MessageBuffer(bArr, i, i2);
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (isUniversalBuffer || messageBuffer.hasArray()) {
            return;
        }
        if (!d.e.isInstance(messageBuffer.reference)) {
            unsafe.freeMemory(messageBuffer.address);
            return;
        }
        ByteBuffer byteBuffer = messageBuffer.reference;
        try {
            if (javaVersion > 8) {
                d.c.invoke(unsafe, byteBuffer);
            } else {
                d.b.invoke(d.a.invoke(byteBuffer, null), null);
            }
        } catch (Throwable th) {
            net.luminis.tls.engine.impl.c.k(th);
        }
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), messageBuffer.base, ((long) i2) + messageBuffer.address, i3);
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + ((long) i));
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + ((long) i));
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i2) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(sliceAsByteBuffer(i, i2));
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + ((long) i)));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + ((long) i)));
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + ((long) i)));
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + ((long) i), z);
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + ((long) i), b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, d.a(byteBuffer) + ((long) byteBuffer.position()), this.base, this.address + ((long) i), i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), byteBuffer.position() + ARRAY_BYTE_BASE_OFFSET, this.base, this.address + ((long) i), i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        if (hasArray()) {
            byteBuffer.get((byte[]) this.base, i, i2);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            unsafe.putByte(this.base, this.address + ((long) i), byteBuffer.get());
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(bArr, ARRAY_BYTE_BASE_OFFSET + i2, this.base, this.address + ((long) i), i3);
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + ((long) i), Integer.reverseBytes(i2));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, ((long) i) + this.address, Long.reverseBytes(j));
    }

    public void putMessageBuffer(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + ((long) i2), this.base, ((long) i) + this.address, i3);
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + ((long) i), Short.reverseBytes(s));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i + i2 <= size()) {
            return new MessageBuffer(this.base, this.address + ((long) i), i2);
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    public ByteBuffer sliceAsByteBuffer(int i, int i2) {
        if (hasArray()) {
            return ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ((long) ARRAY_BYTE_BASE_OFFSET)) + ((long) i)), i2);
        }
        long j = this.address;
        ByteBuffer byteBuffer = this.reference;
        Constructor constructor = d.d;
        if (constructor == null) {
            net.luminis.tls.engine.impl.c.r("Can't create a new DirectByteBuffer. In JDK17+, two JVM options needs to be set: --add-opens=java.base/java.nio=ALL-UNNAMED and --add-opens=java.base/sun.nio.ch=ALL-UNNAMED");
            return null;
        }
        try {
            int iE = g.e(d.f);
            if (iE == 0) {
                return (ByteBuffer) constructor.newInstance(Long.valueOf(j + ((long) i)), Long.valueOf(i2));
            }
            if (iE == 1) {
                return (ByteBuffer) constructor.newInstance(Long.valueOf(j + ((long) i)), Integer.valueOf(i2), byteBuffer);
            }
            if (iE == 2) {
                return (ByteBuffer) constructor.newInstance(Long.valueOf(j + ((long) i)), Integer.valueOf(i2));
            }
            if (iE == 3) {
                return (ByteBuffer) constructor.newInstance(Integer.valueOf(((int) j) + i), Integer.valueOf(i2));
            }
            if (iE == 4) {
                return (ByteBuffer) constructor.newInstance(d.g.invoke(null, Long.valueOf(j + ((long) i)), Integer.valueOf(i2)), Integer.valueOf(i2), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th) {
            net.luminis.tls.engine.impl.c.k(th);
            return null;
        }
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, ARRAY_BYTE_BASE_OFFSET, size());
        return bArr;
    }

    public String toHexString(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(" ");
            }
            sb.append(String.format("%02x", Byte.valueOf(getByte(i3))));
        }
        return sb.toString();
    }

    public static MessageBuffer wrap(byte[] bArr, int i, int i2) {
        return newMessageBuffer(bArr, i, i2);
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), bArr, ARRAY_BYTE_BASE_OFFSET + i2, i3);
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        Constructor<?> constructor = mbBBConstructor;
        if (constructor != null) {
            return newInstance(constructor, byteBuffer);
        }
        return new MessageBuffer(byteBuffer);
    }

    public MessageBuffer(byte[] bArr, int i, int i2) {
        this.base = bArr;
        this.address = ARRAY_BYTE_BASE_OFFSET + i;
        this.size = i2;
        this.reference = null;
    }

    public MessageBuffer(Object obj, long j, int i) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = null;
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }
}
