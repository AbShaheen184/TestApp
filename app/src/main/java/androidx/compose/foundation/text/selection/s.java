package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public long A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ CharSequence D;
    public final /* synthetic */ long E;
    public final /* synthetic */ t F;
    public Mutex e;
    public t y;
    public CharSequence z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j, t tVar, CharSequence charSequence, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = charSequence;
        this.E = j;
        this.F = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        s sVar = new s(this.E, this.F, this.D, dVar);
        sVar.C = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create(androidx.collection.g.c(obj), (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j;
        t tVar;
        TextSelection textSelection;
        CharSequence charSequence;
        Mutex mutex;
        int i = this.B;
        if (i == 0) {
            kotlin.a.e(obj);
            TextClassifier textClassifierC = androidx.collection.g.c(this.C);
            long j2 = this.E;
            int iF = androidx.compose.ui.text.l0.f(j2);
            int iE = androidx.compose.ui.text.l0.e(j2);
            CharSequence charSequence2 = this.D;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iF, iE);
            t tVar2 = this.F;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(tVar2.c());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierC.suggestSelection(defaultLocales.build());
            long jB = androidx.compose.ui.text.d0.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.A = jB;
                this.B = 2;
                if (t.a(this.F, this.D, jB, textClassifierC, this) != aVar) {
                    j = jB;
                }
            } else {
                Mutex mutex2 = tVar2.e;
                this.C = textSelectionSuggestSelection;
                this.e = mutex2;
                this.y = tVar2;
                this.z = charSequence2;
                this.A = jB;
                this.B = 1;
                if (mutex2.lock(null, this) != aVar) {
                    tVar = tVar2;
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    mutex = mutex2;
                    j = jB;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    tVar.g.setValue(new r0(charSequence, j, textClassification));
                }
            }
            return aVar;
        }
        if (i == 1) {
            j = this.A;
            charSequence = this.z;
            tVar = this.y;
            mutex = this.e;
            textSelection = (TextSelection) this.C;
            kotlin.a.e(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                tVar.g.setValue(new r0(charSequence, j, textClassification2));
            } finally {
                mutex.unlock(null);
            }
        } else {
            if (i != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.A;
            kotlin.a.e(obj);
        }
        return new androidx.compose.ui.text.l0(j);
    }
}
