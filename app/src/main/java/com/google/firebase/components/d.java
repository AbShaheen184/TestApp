package com.google.firebase.components;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements com.google.firebase.inject.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.inject.b
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new m(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new m(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new com.google.firebase.installations.local.c((com.google.firebase.g) this.b);
        }
    }
}
