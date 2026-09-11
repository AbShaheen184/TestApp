package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends androidx.compose.ui.q {
    public final int L = e1.e(this);
    public androidx.compose.ui.q M;

    @Override // androidx.compose.ui.q
    public final void B0() {
        super.B0();
        for (androidx.compose.ui.q qVar = this.M; qVar != null; qVar = qVar.C) {
            qVar.K0(this.E);
            if (!qVar.K) {
                qVar.B0();
            }
        }
    }

    @Override // androidx.compose.ui.q
    public final void C0() {
        for (androidx.compose.ui.q qVar = this.M; qVar != null; qVar = qVar.C) {
            qVar.C0();
        }
        super.C0();
    }

    @Override // androidx.compose.ui.q
    public final void G0() {
        super.G0();
        for (androidx.compose.ui.q qVar = this.M; qVar != null; qVar = qVar.C) {
            qVar.G0();
        }
    }

    @Override // androidx.compose.ui.q
    public final void H0() {
        for (androidx.compose.ui.q qVar = this.M; qVar != null; qVar = qVar.C) {
            qVar.H0();
        }
        super.H0();
    }

    @Override // androidx.compose.ui.q
    public final void I0() {
        super.I0();
        for (androidx.compose.ui.q qVar = this.M; qVar != null; qVar = qVar.C) {
            qVar.I0();
        }
    }

    @Override // androidx.compose.ui.q
    public final void J0(androidx.compose.ui.q qVar) {
        this.e = qVar;
        for (androidx.compose.ui.q qVar2 = this.M; qVar2 != null; qVar2 = qVar2.C) {
            qVar2.J0(qVar);
        }
    }

    @Override // androidx.compose.ui.q
    public final void K0(d1 d1Var) {
        this.E = d1Var;
        for (androidx.compose.ui.q qVar = this.M; qVar != null; qVar = qVar.C) {
            qVar.K0(d1Var);
        }
    }

    public final i L0(i iVar) {
        androidx.compose.ui.q qVar = ((androidx.compose.ui.q) iVar).e;
        if (qVar != iVar) {
            androidx.compose.ui.q qVar2 = iVar instanceof androidx.compose.ui.q ? (androidx.compose.ui.q) iVar : null;
            androidx.compose.ui.q qVar3 = qVar2 != null ? qVar2.B : null;
            if (qVar != this.e || !kotlin.jvm.internal.l.a(qVar3, this)) {
                net.luminis.tls.engine.impl.c.r("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (qVar.K) {
                androidx.compose.ui.internal.a.b("Cannot delegate to an already attached node");
            }
            qVar.J0(this.e);
            int i = this.z;
            int iF = e1.f(qVar);
            qVar.z = iF;
            int i2 = this.z;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof v)) {
                androidx.compose.ui.internal.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + qVar);
            }
            qVar.C = this.M;
            this.M = qVar;
            qVar.B = this;
            N0(iF | this.z, false);
            if (this.K) {
                if (i3 == 0 || (i & 2) != 0) {
                    K0(this.E);
                } else {
                    a1 a1Var = k.t(this).d0;
                    this.e.K0(null);
                    a1Var.i();
                }
                qVar.B0();
                qVar.H0();
                if (!qVar.K) {
                    androidx.compose.ui.internal.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                e1.a(qVar, -1, 1);
            }
        }
        return iVar;
    }

    public final void M0(i iVar) {
        androidx.compose.ui.q qVar = null;
        for (androidx.compose.ui.q qVar2 = this.M; qVar2 != null; qVar2 = qVar2.C) {
            if (qVar2 == iVar) {
                boolean z = qVar2.K;
                if (z) {
                    androidx.collection.f0 f0Var = e1.a;
                    if (!z) {
                        androidx.compose.ui.internal.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    e1.a(qVar2, -1, 2);
                    qVar2.I0();
                    qVar2.C0();
                }
                qVar2.J0(qVar2);
                qVar2.A = 0;
                androidx.compose.ui.q qVar3 = qVar2.C;
                if (qVar == null) {
                    this.M = qVar3;
                } else {
                    qVar.C = qVar3;
                }
                qVar2.C = null;
                qVar2.B = null;
                int i = this.z;
                int iF = e1.f(this);
                N0(iF, true);
                if (this.K && (i & 2) != 0 && (iF & 2) == 0) {
                    a1 a1Var = k.t(this).d0;
                    this.e.K0(null);
                    a1Var.i();
                    return;
                }
                return;
            }
            qVar = qVar2;
        }
        com.google.gson.b.u(iVar, "Could not find delegate: ");
    }

    public final void N0(int i, boolean z) {
        androidx.compose.ui.q qVar;
        int i2 = this.z;
        this.z = i;
        if (i2 != i) {
            androidx.compose.ui.q qVar2 = this.e;
            if (qVar2 == this) {
                this.A = i;
            }
            if (this.K) {
                androidx.compose.ui.q qVar3 = this;
                while (qVar3 != null) {
                    i |= qVar3.z;
                    qVar3.z = i;
                    if (qVar3 == qVar2) {
                        break;
                    } else {
                        qVar3 = qVar3.B;
                    }
                }
                if (z && qVar3 == qVar2) {
                    i = e1.f(qVar2);
                    qVar2.z = i;
                }
                int i3 = i | ((qVar3 == null || (qVar = qVar3.C) == null) ? 0 : qVar.A);
                while (qVar3 != null) {
                    i3 |= qVar3.z;
                    qVar3.A = i3;
                    qVar3 = qVar3.B;
                }
            }
        }
    }
}
