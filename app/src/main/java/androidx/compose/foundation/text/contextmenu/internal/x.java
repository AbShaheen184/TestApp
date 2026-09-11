package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static void a(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            r.a(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static void b(Menu menu, int i, Context context, TextClassification textClassification, int i2) {
        if (i2 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(textClassification.getIcon());
            menuItemAdd.setOnMenuItemClickListener(new d(1, context, textClassification));
            return;
        }
        boolean z = i2 == 0;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, z ? 16908353 : 0, i, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(z ? 2 : 0);
        if (z || remoteAction.shouldShowIcon()) {
            menuItemAdd2.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.w
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                x.a(remoteAction);
                return true;
            }
        });
    }
}
