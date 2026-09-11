package org.mozilla.javascript.engine;

import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import org.mozilla.javascript.Script;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class RhinoCompiledScript extends CompiledScript {
    private final RhinoScriptEngine engine;
    private final Script script;

    public RhinoCompiledScript(RhinoScriptEngine rhinoScriptEngine, Script script) {
        this.engine = rhinoScriptEngine;
        this.script = script;
    }

    public Object eval(ScriptContext scriptContext) {
        return this.engine.eval(this.script, scriptContext);
    }

    public ScriptEngine getEngine() {
        return this.engine;
    }
}
