package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class m implements InputConnection {
    public final androidx.compose.animation.e a;
    public androidx.compose.foundation.text.input.internal.x b;

    public m(androidx.compose.foundation.text.input.internal.x xVar, androidx.compose.animation.e eVar) {
        this.a = eVar;
        this.b = xVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            if (xVar != null) {
                xVar.closeConnection();
                this.b = null;
            }
            this.a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.setSelection(i, i2);
        }
        return false;
    }
}
