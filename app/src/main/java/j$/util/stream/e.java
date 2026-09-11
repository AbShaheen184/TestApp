package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Collector {
    public final a a;
    public final b b;
    public final c c;
    public final d d;
    public final Set e;

    public e(a aVar, b bVar, c cVar, d dVar, Set set) {
        this.a = aVar;
        this.b = bVar;
        this.c = cVar;
        this.d = dVar;
        this.e = set;
    }

    @Override // java.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.b;
    }

    @Override // java.util.stream.Collector
    public final Supplier supplier() {
        return this.a;
    }

    @Override // java.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.c;
    }

    @Override // java.util.stream.Collector
    public final Function finisher() {
        return this.d;
    }

    @Override // java.util.stream.Collector
    public final Set characteristics() {
        return this.e;
    }
}
