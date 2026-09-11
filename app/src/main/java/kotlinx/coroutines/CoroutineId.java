package kotlinx.coroutines;

import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.internal.f;
import kotlin.text.k;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@IgnoreJRERequirement
public final class CoroutineId extends kotlin.coroutines.a implements ThreadContextElement<String> {
    public static final Key Key = new Key(null);
    private final long id;

    public CoroutineId(long j) {
        super(Key);
        this.id = j;
    }

    public static /* synthetic */ CoroutineId copy$default(CoroutineId coroutineId, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = coroutineId.id;
        }
        return coroutineId.copy(j);
    }

    public final long component1() {
        return this.id;
    }

    public final CoroutineId copy(long j) {
        return new CoroutineId(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineId) && this.id == ((CoroutineId) obj).id;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(i iVar, String str) {
        Thread.currentThread().setName(str);
    }

    public String toString() {
        return "CoroutineId(" + this.id + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public String updateThreadContext(i iVar) {
        String name;
        CoroutineName coroutineName = (CoroutineName) iVar.get(CoroutineName.Key);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        int iF0 = k.f0(name2, 6, " @");
        if (iF0 < 0) {
            iF0 = name2.length();
        }
        StringBuilder sb = new StringBuilder(name.length() + iF0 + 10);
        sb.append(name2.substring(0, iF0));
        sb.append(" @");
        sb.append(name);
        sb.append('#');
        sb.append(this.id);
        threadCurrentThread.setName(sb.toString());
        return name2;
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Key implements h {
        public /* synthetic */ Key(f fVar) {
            this();
        }

        private Key() {
        }
    }
}
