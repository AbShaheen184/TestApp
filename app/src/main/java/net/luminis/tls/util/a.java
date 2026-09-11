package net.luminis.tls.util;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
        Pattern.compile("\\p{XDigit}+");
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != length; i++) {
            byte b = bArr[i];
            stringBuffer.append("0123456789abcdef".charAt((b & 255) >> 4));
            stringBuffer.append("0123456789abcdef".charAt(b & 15));
        }
        return stringBuffer.toString();
    }
}
