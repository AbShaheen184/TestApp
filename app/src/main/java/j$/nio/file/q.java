package j$.nio.file;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ q(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(j$.desugar.sun.nio.fs.g.f(obj));
                break;
            default:
                this.b.accept(j$.desugar.sun.nio.fs.g.f(obj));
                break;
        }
    }
}
