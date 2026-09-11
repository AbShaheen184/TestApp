package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {
    public final j a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public h(j jVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = jVar;
        this.f = i;
        a();
    }

    public final void a() {
        j jVar = this.a;
        k kVar = jVar.t;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((k) arrayList.get(i)) == kVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i) {
        ArrayList arrayListK;
        boolean z = this.d;
        j jVar = this.a;
        if (z) {
            jVar.i();
            arrayListK = jVar.j;
        } else {
            arrayListK = jVar.k();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (k) arrayListK.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        boolean z = this.d;
        j jVar = this.a;
        if (z) {
            jVar.i();
            arrayListK = jVar.j;
        } else {
            arrayListK = jVar.k();
        }
        return this.b < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.l() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        q qVar = (q) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
