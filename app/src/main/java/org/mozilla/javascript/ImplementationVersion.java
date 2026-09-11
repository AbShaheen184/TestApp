package org.mozilla.javascript;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ImplementationVersion {
    private static final ImplementationVersion version = new ImplementationVersion();
    private String versionString;

    private ImplementationVersion() {
        try {
            Enumeration<URL> resources = ImplementationVersion.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                try {
                    InputStream inputStreamOpenStream = resources.nextElement().openStream();
                    try {
                        Attributes mainAttributes = new Manifest(inputStreamOpenStream).getMainAttributes();
                        if ("Mozilla Rhino".equals(mainAttributes.getValue("Implementation-Title"))) {
                            StringBuilder sb = new StringBuilder(23);
                            sb.append("Rhino ");
                            sb.append(mainAttributes.getValue("Implementation-Version"));
                            String value = mainAttributes.getValue("Built-Date");
                            if (value != null) {
                                String strReplaceAll = value.replaceAll("-", " ");
                                sb.append(' ');
                                sb.append(strReplaceAll);
                            }
                            this.versionString = sb.toString();
                            if (inputStreamOpenStream != null) {
                                inputStreamOpenStream.close();
                                return;
                            }
                            return;
                        }
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    continue;
                }
                continue;
            }
            this.versionString = "Rhino Snapshot";
        } catch (IOException unused2) {
        }
    }

    public static String get() {
        return version.versionString;
    }
}
