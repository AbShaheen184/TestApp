package org.mozilla.classfile;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final byte[] a;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public c(ClassFileWriter classFileWriter, e eVar, Object... objArr) {
        int iC;
        byte[] bArr = new byte[(objArr.length * 2) + 4];
        this.a = bArr;
        ClassFileWriter.I(bArr, classFileWriter.k.f(eVar), 0);
        ClassFileWriter.I(bArr, objArr.length, 2);
        for (int i = 0; i < objArr.length; i++) {
            h hVar = classFileWriter.k;
            Object obj = objArr[i];
            hVar.getClass();
            if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                iC = hVar.c(((Number) obj).intValue());
            } else if (obj instanceof Character) {
                iC = hVar.c(((Character) obj).charValue());
            } else if (obj instanceof Boolean) {
                iC = hVar.c(((Boolean) obj).booleanValue() ? 1 : 0);
            } else if (obj instanceof Float) {
                float fFloatValue = ((Float) obj).floatValue();
                hVar.j(5);
                byte[] bArr2 = hVar.l;
                int i2 = hVar.h;
                hVar.h = i2 + 1;
                bArr2[i2] = 4;
                hVar.h = ClassFileWriter.J(hVar.l, Float.floatToIntBits(fFloatValue), hVar.h);
                hVar.k.put(Integer.valueOf(hVar.i), (byte) 4);
                int i3 = hVar.i;
                hVar.i = i3 + 1;
                iC = i3;
            } else if (obj instanceof Long) {
                iC = hVar.d(((Long) obj).longValue());
            } else if (obj instanceof Double) {
                iC = hVar.b(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                iC = hVar.e((String) obj);
            } else {
                if (!(obj instanceof e)) {
                    net.luminis.tls.engine.impl.c.o("value ".concat(String.valueOf(obj)));
                    throw null;
                }
                iC = hVar.f((e) obj);
            }
            ClassFileWriter.I(this.a, iC, (i * 2) + 4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return Arrays.equals(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~Arrays.hashCode(this.a);
    }
}
