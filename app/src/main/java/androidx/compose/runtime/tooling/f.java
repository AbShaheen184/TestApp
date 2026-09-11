package androidx.compose.runtime.tooling;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends RuntimeException {
    public final a e;

    public f(a aVar) {
        this.e = aVar;
        if (aVar.a()) {
            return;
        }
        ArrayList arrayListN = okhttp3.internal.platform.android.g.n(aVar);
        int size = arrayListN.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + ((b) arrayListN.get(i)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.e;
        if (!aVar.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        int i = 0;
        if (aVar.a()) {
            kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
            List list = aVar.a;
            list.getClass();
            b0 b0Var = new b0(list);
            int iB = b0Var.b();
            for (int i2 = 0; i2 < iB; i2++) {
                ((b) b0Var.get(i2)).getClass();
            }
            kotlin.collections.builders.b bVarC = com.google.common.base.c.c(bVarH);
            bVarC.getClass();
            b0 b0Var2 = new b0(bVarC);
            int iB2 = b0Var2.b();
            while (i < iB2) {
                String str = (String) b0Var2.get(i);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
                i++;
            }
        } else {
            ArrayList arrayListN = okhttp3.internal.platform.android.g.n(aVar);
            int size = arrayListN.size();
            while (i < size) {
                b bVar = (b) arrayListN.get(i);
                sb.append("\tat $$compose.m$");
                sb.append(bVar.a);
                sb.append("(SourceFile:1)\n");
                i++;
            }
        }
        return sb.toString();
    }
}
