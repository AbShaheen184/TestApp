package androidx.compose.ui.semantics;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final kotlin.jvm.functions.a a;
    public final kotlin.jvm.functions.a b;

    public i(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
