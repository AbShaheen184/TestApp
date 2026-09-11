package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final kotlin.coroutines.i _context;
    private transient kotlin.coroutines.d<Object> intercepted;

    public c(kotlin.coroutines.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.i getContext() {
        kotlin.coroutines.i iVar = this._context;
        iVar.getClass();
        return iVar;
    }

    public final kotlin.coroutines.d<Object> intercepted() {
        kotlin.coroutines.d dVarInterceptContinuation = this.intercepted;
        if (dVarInterceptContinuation == null) {
            kotlin.coroutines.f fVar = (kotlin.coroutines.f) getContext().get(kotlin.coroutines.e.e);
            if (fVar == null || (dVarInterceptContinuation = fVar.interceptContinuation(this)) == null) {
                dVarInterceptContinuation = this;
            }
            this.intercepted = dVarInterceptContinuation;
        }
        return dVarInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        kotlin.coroutines.d<Object> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            kotlin.coroutines.g gVar = getContext().get(kotlin.coroutines.e.e);
            gVar.getClass();
            ((kotlin.coroutines.f) gVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = b.e;
    }

    public c(kotlin.coroutines.d dVar, kotlin.coroutines.i iVar) {
        super(dVar);
        this._context = iVar;
    }
}
