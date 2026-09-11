package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends a1 {
    public final int J;
    public final int K;
    public n1 L;
    public androidx.appcompat.view.menu.k M;

    public q1(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.J = 21;
            this.K = 22;
        } else {
            this.J = 22;
            this.K = 21;
        }
    }

    @Override // androidx.appcompat.widget.a1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        androidx.appcompat.view.menu.h hVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.L != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                hVar = (androidx.appcompat.view.menu.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (androidx.appcompat.view.menu.h) adapter;
                headersCount = 0;
            }
            androidx.appcompat.view.menu.k item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= hVar.getCount()) ? null : hVar.getItem(i);
            androidx.appcompat.view.menu.k kVar = this.M;
            if (kVar != item) {
                androidx.appcompat.view.menu.j jVar = hVar.a;
                if (kVar != null) {
                    this.L.e(jVar, kVar);
                }
                this.M = item;
                if (item != null) {
                    this.L.c(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.J) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.K) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.h) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(n1 n1Var) {
        this.L = n1Var;
    }

    @Override // androidx.appcompat.widget.a1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
