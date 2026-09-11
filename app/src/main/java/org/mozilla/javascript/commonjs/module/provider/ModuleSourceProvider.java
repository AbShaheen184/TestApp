package org.mozilla.javascript.commonjs.module.provider;

import java.net.URI;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface ModuleSourceProvider {
    public static final ModuleSource NOT_MODIFIED = new ModuleSource(null, null, null, null, null);

    ModuleSource loadSource(String str, Scriptable scriptable, Object obj);

    ModuleSource loadSource(URI uri, URI uri2, Object obj);
}
