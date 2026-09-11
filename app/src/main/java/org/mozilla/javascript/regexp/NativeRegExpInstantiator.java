package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NativeRegExpInstantiator {
    private NativeRegExpInstantiator() {
    }

    public static NativeRegExp withLanguageVersion(int i) {
        return i < 200 ? new NativeRegExpCallable() : new NativeRegExp();
    }

    public static NativeRegExp withLanguageVersionScopeCompiled(int i, Scriptable scriptable, RECompiled rECompiled) {
        return i < 200 ? new NativeRegExpCallable(scriptable, rECompiled) : new NativeRegExp(scriptable, rECompiled);
    }
}
