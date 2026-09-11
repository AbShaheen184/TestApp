package androidx.media3.ui;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.media3.common.a1;
import androidx.recyclerview.widget.RecyclerView;
import com.app.mlounge.R;
import com.app.mlounge.emulator.EmulatorActivity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ h(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        androidx.recyclerview.widget.v adapter;
        int iD;
        switch (this.e) {
            case 0:
                v vVar = (v) this.y;
                vVar.o(!vVar.O0);
                break;
            case 1:
                v vVar2 = ((j) this.y).g;
                androidx.media3.common.q0 q0Var = vVar2.N0;
                if (q0Var != null && ((androidx.media3.exoplayer.c0) q0Var).u(29)) {
                    a1 a1VarT = ((androidx.media3.exoplayer.c0) vVar2.N0).t();
                    androidx.media3.common.q0 q0Var2 = vVar2.N0;
                    androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) a1VarT;
                    jVar.getClass();
                    androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
                    iVar.b(1);
                    iVar.i(1, false);
                    ((androidx.media3.exoplayer.c0) q0Var2).O(iVar.a());
                    vVar2.J.e[1] = vVar2.getResources().getString(R.string.exo_track_selection_auto);
                    vVar2.O.dismiss();
                    break;
                }
                break;
            case 2:
                p pVar = (p) this.y;
                v vVar3 = pVar.x;
                int i = -1;
                if (pVar.s != null && (recyclerView = pVar.r) != null && (adapter = recyclerView.getAdapter()) != null && (iD = pVar.r.D(pVar)) != -1 && pVar.s == adapter) {
                    i = iD;
                }
                View view2 = vVar3.g0;
                if (i == 0) {
                    n nVar = vVar3.K;
                    view2.getClass();
                    vVar3.e(nVar, view2);
                } else if (i != 1) {
                    vVar3.O.dismiss();
                } else {
                    j jVar2 = vVar3.M;
                    view2.getClass();
                    vVar3.e(jVar2, view2);
                }
                break;
            case 3:
                v vVar4 = ((j) this.y).g;
                androidx.media3.common.q0 q0Var3 = vVar4.N0;
                if (q0Var3 != null && ((androidx.media3.exoplayer.c0) q0Var3).u(29)) {
                    a1 a1VarT2 = ((androidx.media3.exoplayer.c0) vVar4.N0).t();
                    androidx.media3.common.q0 q0Var4 = vVar4.N0;
                    androidx.media3.exoplayer.trackselection.j jVar3 = (androidx.media3.exoplayer.trackselection.j) a1VarT2;
                    jVar3.getClass();
                    androidx.media3.exoplayer.trackselection.i iVar2 = new androidx.media3.exoplayer.trackselection.i(jVar3);
                    iVar2.b(3);
                    iVar2.d();
                    iVar2.f(null);
                    iVar2.h();
                    ((androidx.media3.exoplayer.c0) q0Var4).O(iVar2.a());
                    vVar4.O.dismiss();
                    break;
                }
                break;
            case 4:
                a0 a0Var = (a0) this.y;
                a0Var.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    a0Var.r.start();
                } else if (view.getId() == R.id.exo_overflow_hide) {
                    a0Var.s.start();
                }
                break;
            case 5:
                ((EmulatorActivity) this.y).showMenu();
                break;
            case 6:
                ((AlertDialog) this.y).dismiss();
                break;
            case 7:
                com.google.android.material.textfield.c cVar = (com.google.android.material.textfield.c) this.y;
                EditText editText = cVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    cVar.p();
                    break;
                }
                break;
            case 8:
                ((com.google.android.material.textfield.k) this.y).t();
                break;
            default:
                com.google.android.material.textfield.t tVar = (com.google.android.material.textfield.t) this.y;
                EditText editText2 = tVar.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = tVar.f;
                    boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                    EditText editText4 = tVar.f;
                    if (z) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        tVar.f.setSelection(selectionEnd);
                    }
                    tVar.p();
                    break;
                }
                break;
        }
    }
}
