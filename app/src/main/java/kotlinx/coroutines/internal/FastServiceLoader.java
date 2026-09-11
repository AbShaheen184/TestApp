package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.jvm.functions.l;
import kotlin.text.k;
import kotlin.text.r;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FastServiceLoader {
    public static final FastServiceLoader INSTANCE = new FastServiceLoader();
    private static final String PREFIX = "META-INF/services/";

    private FastServiceLoader() {
    }

    private final MainDispatcherFactory createInstanceOf(Class<MainDispatcherFactory> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S getProviderInstance(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
        }
        c.h("Expected service of class ", cls, ", but found ", cls2);
        return null;
    }

    private final <S> List<S> load(Class<S> cls, ClassLoader classLoader) {
        try {
            return loadProviders$kotlinx_coroutines_core(cls, classLoader);
        } catch (Throwable unused) {
            return o.k0(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> parse(URL url) throws IOException {
        String string = url.toString();
        if (!r.O(string, "jar", false)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> file = INSTANCE.parseFile(bufferedReader);
                bufferedReader.close();
                return file;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.b.d(bufferedReader, th);
                    throw th2;
                }
            }
        }
        String strU0 = k.u0(k.q0(string, "jar:file:", string), '!');
        String strQ0 = k.q0(string, "!/", string);
        JarFile jarFile = new JarFile(strU0, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strQ0)), "UTF-8"));
            try {
                List<String> file2 = INSTANCE.parseFile(bufferedReader2);
                bufferedReader2.close();
                jarFile.close();
                return file2;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    com.google.common.base.b.d(bufferedReader2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                try {
                    jarFile.close();
                    throw th6;
                } catch (Throwable th7) {
                    kotlin.a.a(th5, th7);
                    throw th5;
                }
            }
        }
    }

    private final List<String> parseFile(BufferedReader bufferedReader) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return o.k0(linkedHashSet);
            }
            String string = k.A0(k.v0(line, "#")).toString();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    c.p("Illegal service provider class name: ".concat(string));
                    return null;
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    private final <R> R use(JarFile jarFile, l lVar) throws IOException {
        try {
            R r = (R) lVar.invoke(jarFile);
            jarFile.close();
            return r;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarFile.close();
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.a.a(th, th3);
                    throw th;
                }
            }
        }
    }

    public final List<MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!FastServiceLoaderKt.getANDROID_DETECTED()) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> loadProviders$kotlinx_coroutines_core(Class<S> cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(PREFIX.concat(cls.getName())));
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o.C(arrayList, INSTANCE.parse((URL) it.next()));
        }
        Set setO0 = o.o0(arrayList);
        if (setO0.isEmpty()) {
            c.o("No providers were loaded with FastServiceLoader");
            return null;
        }
        Set set = setO0;
        ArrayList arrayList2 = new ArrayList(p.y(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(INSTANCE.getProviderInstance((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
