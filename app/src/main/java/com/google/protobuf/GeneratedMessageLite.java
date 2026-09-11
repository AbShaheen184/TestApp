package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.h0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends h0> extends b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static final Map<Class<?>, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected f2 unknownFields;

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = f2.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType, BuilderType, T> k0 checkIsLite(y yVar) {
        yVar.getClass();
        return (k0) yVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws x0 {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new x0(t.newUninitializedMessageException().getMessage());
    }

    private int computeSerializedSize(a2 a2Var) {
        if (a2Var != null) {
            return a2Var.i(this);
        }
        t1 t1Var = t1.c;
        t1Var.getClass();
        return t1Var.a(getClass()).i(this);
    }

    public static n0 emptyBooleanList() {
        return e.B;
    }

    public static o0 emptyDoubleList() {
        return x.B;
    }

    public static q0 emptyFloatList() {
        return f0.B;
    }

    public static r0 emptyIntList() {
        return m0.B;
    }

    public static s0 emptyLongList() {
        return d1.B;
    }

    public static <E> t0 emptyProtobufList() {
        return u1.B;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == f2.f) {
            this.unknownFields = new f2();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        Map<Class<?>, GeneratedMessageLite<?, ?>> map = defaultInstanceMap;
        T t = (T) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) l2.b(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            map.put((Class<?>) cls, t2);
            return t2;
        }
        org.mozilla.javascript.c.a();
        return null;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            androidx.media3.exoplayer.hls.playlist.a.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            androidx.media3.exoplayer.hls.playlist.a.j("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(l0.e, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        t1 t1Var = t1.c;
        t1Var.getClass();
        boolean zC = t1Var.a(t.getClass()).c(t);
        if (z) {
            t.dynamicMethod(l0.y, zC ? t : null, null);
        }
        return zC;
    }

    public static r0 mutableCopy(r0 r0Var) {
        m0 m0Var = (m0) r0Var;
        return m0Var.m(m0Var.z * 2);
    }

    public static Object newMessageInfo(l1 l1Var, String str, Object[] objArr) {
        return new v1(l1Var, str, objArr);
    }

    public static <ContainingType extends l1, Type> k0 newRepeatedGeneratedExtension(ContainingType containingtype, l1 l1Var, p0 p0Var, int i, t2 t2Var, boolean z, Class<?> cls) {
        return new k0(containingtype, u1.B, l1Var, new j0(i, t2Var, true, z));
    }

    public static <ContainingType extends l1, Type> k0 newSingularGeneratedExtension(ContainingType containingtype, Type type, l1 l1Var, p0 p0Var, int i, t2 t2Var, Class<?> cls) {
        return new k0(containingtype, type, l1Var, new j0(i, t2Var, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, a0.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, a0 a0Var) {
        r rVarF;
        if (byteBuffer.hasArray()) {
            rVarF = t.f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            rVarF = t.f(bArr, 0, iRemaining, true);
        }
        return (T) checkMessageInitialized(parseFrom(t, rVarF, a0Var));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, a0 a0Var) throws x0 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            t tVarG = t.g(new a(inputStream, t.s(inputStream, i)));
            T t2 = (T) parsePartialFrom(t, tVarG, a0Var);
            tVarG.a(0);
            return t2;
        } catch (x0 e) {
            if (e.e) {
                throw new x0(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new x0(e2.getMessage(), e2);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, t tVar, a0 a0Var) throws x0 {
        T t2 = (T) t.newMutableInstance();
        try {
            t1 t1Var = t1.c;
            t1Var.getClass();
            a2 a2VarA = t1Var.a(t2.getClass());
            androidx.compose.foundation.text.selection.w wVar = tVar.c;
            if (wVar == null) {
                wVar = new androidx.compose.foundation.text.selection.w(tVar);
            }
            a2VarA.f(t2, wVar, a0Var);
            a2VarA.b(t2);
            return t2;
        } catch (e2 e) {
            throw new x0(e.getMessage());
        } catch (x0 e2) {
            if (e2.e) {
                throw new x0(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof x0) {
                throw ((x0) e3.getCause());
            }
            throw new x0(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof x0) {
                throw ((x0) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public final Object buildMessageInfo() {
        return dynamicMethod(l0.z, null, null);
    }

    public final void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public final void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public final int computeHashCode() {
        t1 t1Var = t1.c;
        t1Var.getClass();
        return t1Var.a(getClass()).h(this);
    }

    public final <MessageType2 extends GeneratedMessageLite<MessageType2, BuilderType2>, BuilderType2 extends h0> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(l0.B, null, null);
    }

    public abstract Object dynamicMethod(l0 l0Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t1 t1Var = t1.c;
        t1Var.getClass();
        return t1Var.a(getClass()).j(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(l0.C, null, null);
    }

    public final int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public final int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final r1 getParserForType() {
        return (r1) dynamicMethod(l0.D, null, null);
    }

    @Override // com.google.protobuf.b
    public int getSerializedSize(a2 a2Var) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(a2Var);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.l(iComputeSerializedSize, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(a2Var);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public final boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void makeImmutable() {
        t1 t1Var = t1.c;
        t1Var.getClass();
        t1Var.a(getClass()).b(this);
        markImmutable();
    }

    public final void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        f2 f2Var = this.unknownFields;
        f2Var.a();
        if (i != 0) {
            f2Var.f((i << 3) | 2, byteString);
        } else {
            net.luminis.tls.engine.impl.c.o("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(f2 f2Var) {
        this.unknownFields = f2.e(this.unknownFields, f2Var);
    }

    public final void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        f2 f2Var = this.unknownFields;
        f2Var.a();
        if (i != 0) {
            f2Var.f(i << 3, Long.valueOf(i2));
        } else {
            net.luminis.tls.engine.impl.c.o("Zero is not a valid field number.");
        }
    }

    @Override // com.google.protobuf.l1
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(l0.B, null, null);
    }

    public final MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(l0.A, null, null);
    }

    public final boolean parseUnknownField(int i, t tVar) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.d(i, tVar);
    }

    public final void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    /* JADX INFO: renamed from: toBuilder, reason: merged with bridge method [inline-methods] */
    public final BuilderType m14toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(l0.B, null, null);
        buildertype.d(this);
        return buildertype;
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = m1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        m1.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.protobuf.l1
    public void writeTo(w wVar) {
        t1 t1Var = t1.c;
        t1Var.getClass();
        a2 a2VarA = t1Var.a(getClass());
        f1 f1Var = wVar.a;
        if (f1Var == null) {
            f1Var = new f1(wVar);
        }
        a2VarA.e(this, f1Var);
    }

    public final <MessageType2 extends GeneratedMessageLite<MessageType2, BuilderType2>, BuilderType2 extends h0> BuilderType2 createBuilder(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) createBuilder();
        buildertype2.d(messagetype2);
        return buildertype2;
    }

    public static s0 mutableCopy(s0 s0Var) {
        d1 d1Var = (d1) s0Var;
        return d1Var.m(d1Var.z * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, a0 a0Var) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, a0Var));
    }

    public static q0 mutableCopy(q0 q0Var) {
        f0 f0Var = (f0) q0Var;
        return f0Var.m(f0Var.z * 2);
    }

    public static o0 mutableCopy(o0 o0Var) {
        x xVar = (x) o0Var;
        return xVar.m(xVar.z * 2);
    }

    public static n0 mutableCopy(n0 n0Var) {
        e eVar = (e) n0Var;
        return eVar.m(eVar.z * 2);
    }

    public static <E> t0 mutableCopy(t0 t0Var) {
        return t0Var.m(t0Var.size() * 2);
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, a0.a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) {
        return (T) checkMessageInitialized(parseFrom(t, byteString, a0.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, a0 a0Var) {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, a0Var));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, a0.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, a0 a0Var) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, a0Var));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t, t.g(inputStream), a0.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, a0 a0Var) {
        return (T) checkMessageInitialized(parsePartialFrom(t, t.g(inputStream), a0Var));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, t tVar) {
        return (T) parseFrom(t, tVar, a0.a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, t tVar, a0 a0Var) {
        return (T) checkMessageInitialized(parsePartialFrom(t, tVar, a0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, a0 a0Var) throws x0 {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            t1 t1Var = t1.c;
            t1Var.getClass();
            a2 a2VarA = t1Var.a(t2.getClass());
            com.google.android.gms.internal.measurement.p0 p0Var = new com.google.android.gms.internal.measurement.p0();
            a0Var.getClass();
            a2VarA.g(t2, bArr, i, i + i2, p0Var);
            a2VarA.b(t2);
            return t2;
        } catch (e2 e) {
            throw new x0(e.getMessage());
        } catch (x0 e2) {
            if (e2.e) {
                throw new x0(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof x0) {
                throw ((x0) e3.getCause());
            }
            throw new x0(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw x0.g();
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, t tVar) {
        return (T) parsePartialFrom(t, tVar, a0.a());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, a0 a0Var) {
        t tVarNewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, tVarNewCodedInput, a0Var);
        tVarNewCodedInput.a(0);
        return t2;
    }
}
