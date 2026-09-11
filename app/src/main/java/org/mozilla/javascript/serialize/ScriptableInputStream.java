package org.mozilla.javascript.serialize;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.UniqueTag;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ScriptableInputStream extends ObjectInputStream implements InputStreamRetargetInterface {
    private ClassLoader classLoader;
    private Scriptable scope;

    public ScriptableInputStream(InputStream inputStream, Scriptable scriptable) {
        super(inputStream);
        this.scope = scriptable;
        enableResolveObject(true);
        Context currentContext = Context.getCurrentContext();
        if (currentContext != null) {
            this.classLoader = currentContext.getApplicationClassLoader();
        }
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        String name = objectStreamClass.getName();
        ClassLoader classLoader = this.classLoader;
        if (classLoader != null) {
            try {
                return classLoader.loadClass(name);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.resolveClass(objectStreamClass);
    }

    @Override // java.io.ObjectInputStream
    public Object resolveObject(Object obj) throws IOException {
        if (!(obj instanceof ScriptableOutputStream.PendingLookup)) {
            if (obj instanceof UniqueTag) {
                return ((UniqueTag) obj).readResolve();
            }
            return obj instanceof Undefined ? ((Undefined) obj).readResolve() : obj;
        }
        String name = ((ScriptableOutputStream.PendingLookup) obj).getName();
        Object objLookupQualifiedName = ScriptableOutputStream.lookupQualifiedName(this.scope, name);
        if (objLookupQualifiedName != Scriptable.NOT_FOUND) {
            return objLookupQualifiedName;
        }
        c.t(a.q("Object ", name, " not found upon deserialization."));
        return null;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
