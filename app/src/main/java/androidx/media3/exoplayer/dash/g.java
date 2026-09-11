package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.j0;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.media3.exoplayer.upstream.p {
    public static final Pattern e = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // androidx.media3.exoplayer.upstream.p
    public final Object j(Uri uri, androidx.media3.datasource.j jVar) throws IOException {
        String line = new BufferedReader(new InputStreamReader(jVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = e.matcher(line);
            if (!matcher.matches()) {
                throw j0.b(null, "Couldn't parse timestamp: " + line);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e2) {
            throw j0.b(e2, null);
        }
    }
}
