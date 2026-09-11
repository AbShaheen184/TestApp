package androidx.media3.datasource.cache;

import android.util.SparseArray;
import androidx.media3.common.util.j0;
import com.caverock.androidsvg.y1;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Comparable {
    public static final Pattern D = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern E = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern F = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public final boolean A;
    public final File B;
    public final long C;
    public final String e;
    public final long y;
    public final long z;

    public o(String str, long j, long j2, long j3, File file) {
        this.e = str;
        this.y = j;
        this.z = j2;
        this.A = file != null;
        this.B = file;
        this.C = j3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r2
  0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public static o d(File file, long j, y1 y1Var) {
        File file2;
        String strGroup;
        File fileE;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = E.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                String str = j0.a;
                int length = strGroup.length();
                int iEnd = 0;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (strGroup.charAt(i2) == '%') {
                        i++;
                    }
                }
                if (i != 0) {
                    int i3 = length - (i * 2);
                    StringBuilder sb = new StringBuilder(i3);
                    Matcher matcher2 = j0.f.matcher(strGroup);
                    while (i > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c = (char) Integer.parseInt(strGroup2, 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c);
                        iEnd = matcher2.end();
                        i--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb.length() != i3) {
                        strGroup = null;
                    } else {
                        strGroup = sb.toString();
                    }
                }
            } else {
                matcher = D.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileE = null;
            } else {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                int i4 = y1Var.L(strGroup).a;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileE = e(parentFile, i4, j2, Long.parseLong(strGroup4));
                if (!file.renameTo(fileE)) {
                    fileE = null;
                }
            }
            if (fileE != null) {
                file2 = fileE;
                name = fileE.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher3 = F.matcher(name);
        if (matcher3.matches()) {
            String strGroup5 = matcher3.group(1);
            strGroup5.getClass();
            String str2 = (String) ((SparseArray) y1Var.b).get(Integer.parseInt(strGroup5));
            if (str2 != null) {
                long length2 = j == -1 ? file2.length() : j;
                if (length2 != 0) {
                    String strGroup6 = matcher3.group(2);
                    strGroup6.getClass();
                    long j3 = Long.parseLong(strGroup6);
                    String strGroup7 = matcher3.group(3);
                    strGroup7.getClass();
                    return new o(str2, j3, length2, Long.parseLong(strGroup7), file2);
                }
            }
        }
        return null;
    }

    public static File e(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, androidx.privacysandbox.ads.adservices.java.internal.a.n(j2, ".v3.exo", sb));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o oVar) {
        String str = oVar.e;
        String str2 = this.e;
        if (!str2.equals(str)) {
            return str2.compareTo(oVar.e);
        }
        long j = this.y - oVar.y;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.y);
        sb.append(", ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.z, "]", sb);
    }
}
