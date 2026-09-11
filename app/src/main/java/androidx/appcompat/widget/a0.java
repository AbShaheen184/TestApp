package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        androidx.core.view.c iVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                iVar = new androidx.compose.ui.scrollcapture.i(clipData, 3);
            } else {
                androidx.core.view.d dVar = new androidx.core.view.d();
                dVar.b = clipData;
                dVar.c = 3;
                iVar = dVar;
            }
            androidx.core.view.s0.i(textView, iVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        androidx.core.view.c iVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new androidx.compose.ui.scrollcapture.i(clipData, 3);
        } else {
            androidx.core.view.d dVar = new androidx.core.view.d();
            dVar.b = clipData;
            dVar.c = 3;
            iVar = dVar;
        }
        androidx.core.view.s0.i(view, iVar.build());
        return true;
    }
}
