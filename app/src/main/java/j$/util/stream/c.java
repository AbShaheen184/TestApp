package j$.util.stream;

import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        Set set = DesugarCollectors.a;
        list.addAll((List) obj2);
        return list;
    }
}
