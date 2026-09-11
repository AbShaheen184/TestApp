package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NativeCollectionIterator extends ES6Iterator {
    private static final long serialVersionUID = 7094840979404373443L;
    private String className;
    private transient Iterator<Hashtable.Entry> iterator;
    private Type type;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public enum Type {
        KEYS,
        VALUES,
        BOTH
    }

    public NativeCollectionIterator(String str) {
        this.iterator = Collections.emptyIterator();
        this.className = str;
        this.iterator = Collections.emptyIterator();
        this.type = Type.BOTH;
    }

    public static void init(ScriptableObject scriptableObject, String str, boolean z) {
        ES6Iterator.init(scriptableObject, z, new NativeCollectionIterator(str), str);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.className = (String) objectInputStream.readObject();
        this.type = (Type) objectInputStream.readObject();
        this.iterator = Collections.emptyIterator();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.className);
        objectOutputStream.writeObject(this.type);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return this.className;
    }

    @Override // org.mozilla.javascript.ES6Iterator
    public boolean isDone(Context context, Scriptable scriptable) {
        return !this.iterator.hasNext();
    }

    @Override // org.mozilla.javascript.ES6Iterator
    public Object nextValue(Context context, Scriptable scriptable) {
        Hashtable.Entry next = this.iterator.next();
        int iOrdinal = this.type.ordinal();
        if (iOrdinal == 0) {
            return next.key;
        }
        if (iOrdinal == 1) {
            return next.value;
        }
        if (iOrdinal == 2) {
            return context.newArray(scriptable, new Object[]{next.key, next.value});
        }
        throw new AssertionError();
    }

    public NativeCollectionIterator(Scriptable scriptable, String str, Type type, Iterator<Hashtable.Entry> it) {
        super(scriptable, str);
        Collections.emptyIterator();
        this.className = str;
        this.iterator = it;
        this.type = type;
    }
}
