package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes2.dex */
public final class DesugarCollectors {
    public static final Set a = Collections.EMPTY_SET;

    static {
        Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.UNORDERED));
    }

    public static <T> Collector<T, ?, List<T>> toUnmodifiableList() {
        return new e(new a(), new b(), new c(), new d(), a);
    }
}
