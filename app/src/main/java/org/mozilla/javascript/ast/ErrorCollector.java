package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.EvaluatorException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ErrorCollector implements IdeErrorReporter {
    private List<ParseProblem> errors = new ArrayList();

    @Override // org.mozilla.javascript.ast.IdeErrorReporter
    public void error(String str, String str2, int i, int i2) {
        this.errors.add(new ParseProblem(ParseProblem.Type.Error, str, str2, i, i2));
    }

    public List<ParseProblem> getErrors() {
        return this.errors;
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public EvaluatorException runtimeError(String str, String str2, int i, String str3, int i2) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.errors.size() * 100);
        Iterator<ParseProblem> it = this.errors.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.IdeErrorReporter
    public void warning(String str, String str2, int i, int i2) {
        this.errors.add(new ParseProblem(ParseProblem.Type.Warning, str, str2, i, i2));
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void error(String str, String str2, int i, String str3, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void warning(String str, String str2, int i, String str3, int i2) {
        throw new UnsupportedOperationException();
    }
}
