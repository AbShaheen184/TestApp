package net.luminis.tls.engine.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements NativeTypedArrayView.TypedArrayConstructable, NativeTypedArrayView.RealThis {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void b(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void c(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void d(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(Object obj, String str, int i) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void g(String str) throws net.luminis.tls.alert.a {
        throw new net.luminis.tls.alert.a(str, 2);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void j(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void k(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void l(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void m(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void o(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void p(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void q(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void s(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void t(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void u(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.TypedArrayConstructable
    public NativeTypedArrayView construct(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        switch (this.a) {
            case 27:
                return new NativeFloat32Array(nativeArrayBuffer, i, i2);
            default:
                return new NativeFloat64Array(nativeArrayBuffer, i, i2);
        }
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis
    public NativeTypedArrayView realThis(Scriptable scriptable) {
        return NativeFloat32Array.realThis(scriptable);
    }
}
