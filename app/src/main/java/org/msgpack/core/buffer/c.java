package org.msgpack.core.buffer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ c(ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                ByteBuffer byteBuffer = this.b;
                try {
                    Unsafe unsafe = MessageBuffer.unsafe;
                    Method declaredMethod = unsafe.getClass().getDeclaredMethod("invokeCleaner", ByteBuffer.class);
                    declaredMethod.invoke(unsafe, byteBuffer);
                    return declaredMethod;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    return e;
                }
            case 1:
                ByteBuffer byteBuffer2 = this.b;
                try {
                    Method declaredMethod2 = byteBuffer2.getClass().getDeclaredMethod("cleaner", null);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(byteBuffer2, null);
                    return declaredMethod2;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    return e2;
                }
            default:
                ByteBuffer byteBuffer3 = this.b;
                Method method = d.a;
                try {
                    Method declaredMethod3 = method.getReturnType().getDeclaredMethod("clean", null);
                    Object objInvoke = method.invoke(byteBuffer3, null);
                    declaredMethod3.setAccessible(true);
                    declaredMethod3.invoke(objInvoke, null);
                    return declaredMethod3;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    return e3;
                }
        }
    }
}
