package androidx.fragment.app;

import android.content.DialogInterface;
import android.util.Log;
import androidx.appcompat.widget.z0;
import androidx.compose.ui.platform.t1;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c extends d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final b H;
    public final boolean I;
    public int J;
    public boolean K;
    public boolean L;

    public c() {
        new z0(this, 6);
        this.H = new b();
        this.I = true;
        this.J = -1;
        new com.app.mlounge.data.music.e(this, 26);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.K) {
            return;
        }
        if (h.E(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.L) {
            return;
        }
        this.L = true;
        this.K = true;
        if (this.J >= 0) {
            h hVarA = a();
            int i = this.J;
            if (i < 0) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Bad id: "));
                return;
            }
            synchronized (((ArrayList) hVarA.z)) {
            }
            this.J = -1;
            return;
        }
        t1 t1Var = new t1(a());
        i iVar = new i();
        iVar.a = 3;
        iVar.b = this;
        ((ArrayList) t1Var.d).add(iVar);
        iVar.c = 0;
        iVar.d = 0;
        iVar.e = 0;
        iVar.f = 0;
        h hVar = (h) t1Var.e;
        if (t1Var.b) {
            net.luminis.tls.engine.impl.c.r("commit already called");
            return;
        }
        if (h.E(2)) {
            Log.v("FragmentManager", "Commit: " + t1Var);
            PrintWriter printWriter = new PrintWriter(new j());
            ArrayList arrayList = (ArrayList) t1Var.d;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(t1Var.c);
            printWriter.print(" mCommitted=");
            printWriter.println(t1Var.b);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar2 = (i) arrayList.get(i2);
                    switch (iVar2.a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + iVar2.a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(iVar2.b);
                    if (iVar2.c != 0 || iVar2.d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(iVar2.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(iVar2.d));
                    }
                    if (iVar2.e != 0 || iVar2.f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(iVar2.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(iVar2.f));
                    }
                }
            }
            printWriter.close();
        }
        t1Var.b = true;
        t1Var.c = -1;
        synchronized (((ArrayList) hVar.z)) {
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
