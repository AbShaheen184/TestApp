package org.mozilla.javascript.engine;

import javax.script.Bindings;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class BindingsObject extends ScriptableObject {
    private final Bindings bindings;

    public BindingsObject(Bindings bindings) {
        if (bindings != null) {
            this.bindings = bindings;
        } else {
            c.o("Bindings must not be null");
            throw null;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(String str) {
        this.bindings.remove(str);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        return !this.bindings.containsKey(str) ? Scriptable.NOT_FOUND : Context.jsToJava(this.bindings.get(str), Object.class);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "BindingsObject";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        return this.bindings.keySet().toArray();
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return this.bindings.containsKey(str);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        this.bindings.put(str, Context.javaToJS(obj, scriptable));
    }
}
