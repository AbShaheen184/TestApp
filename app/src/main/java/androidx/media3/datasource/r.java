package androidx.media3.datasource;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class r extends i {
    public final int y;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(IOException iOException, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.y = i2;
    }

    public static r a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !com.google.common.base.b.w(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new q("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new r(iOException, i2, i);
    }

    public r(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.y = 1;
    }

    public r(int i) {
        super(i == 2000 ? 2001 : i);
        this.y = 1;
    }

    public r(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.y = 1;
    }
}
