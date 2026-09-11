package androidx.media3.decoder;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super("ExoPlayer:SimpleDecoder");
        this.y = hVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                    break;
                } while (((h) this.y).j());
                return;
            default:
                HashMap map = (HashMap) this.y;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
                            sb.append("Received non-success response code ");
                            sb.append(responseCode);
                            sb.append(" from pinging URL: ");
                            sb.append(string);
                            Log.w("HttpUrlPinger", sb.toString());
                            break;
                        }
                        return;
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (IOException e2) {
                    e = e2;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                    sb2.append("Error while pinging URL: ");
                    sb2.append(string);
                    sb2.append(". ");
                    sb2.append(message);
                    Log.w("HttpUrlPinger", sb2.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e3) {
                    String message2 = e3.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb3.append("Error while parsing ping URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message2);
                    Log.w("HttpUrlPinger", sb3.toString(), e3);
                    return;
                } catch (RuntimeException e4) {
                    e = e4;
                    String message3 = e.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
                    sb4.append("Error while pinging URL: ");
                    sb4.append(string);
                    sb4.append(". ");
                    sb4.append(message3);
                    Log.w("HttpUrlPinger", sb4.toString(), e);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    public g(HashMap map) {
        this.y = map;
    }
}
