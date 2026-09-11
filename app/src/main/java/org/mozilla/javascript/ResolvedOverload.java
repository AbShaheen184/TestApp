package org.mozilla.javascript;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class ResolvedOverload {
    final int index;
    final Class<?>[] types;

    public ResolvedOverload(Object[] objArr, int i) {
        this.index = i;
        this.types = new Class[objArr.length];
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object objUnwrap = objArr[i2];
            objUnwrap = objUnwrap instanceof Wrapper ? ((Wrapper) objUnwrap).unwrap() : objUnwrap;
            this.types[i2] = objUnwrap == null ? null : objUnwrap.getClass();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ResolvedOverload)) {
            return false;
        }
        ResolvedOverload resolvedOverload = (ResolvedOverload) obj;
        return Arrays.equals(this.types, resolvedOverload.types) && this.index == resolvedOverload.index;
    }

    public int hashCode() {
        return Arrays.hashCode(this.types);
    }

    public boolean matches(Object[] objArr) {
        if (objArr.length != this.types.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object objUnwrap = objArr[i];
            if (objUnwrap instanceof Wrapper) {
                objUnwrap = ((Wrapper) objUnwrap).unwrap();
            }
            Class<?>[] clsArr = this.types;
            if (objUnwrap == null) {
                if (clsArr[i] != null) {
                    return false;
                }
            } else if (objUnwrap.getClass() != clsArr[i]) {
                return false;
            }
        }
        return true;
    }
}
