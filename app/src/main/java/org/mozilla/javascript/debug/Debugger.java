package org.mozilla.javascript.debug;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface Debugger {
    DebugFrame getFrame(Context context, DebuggableScript debuggableScript);

    void handleCompilationDone(Context context, DebuggableScript debuggableScript, String str);
}
