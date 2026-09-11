package androidx.media3.extractor.metadata.icy;

import androidx.media3.common.h0;
import com.google.android.gms.dynamite.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public static final Pattern r = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder p = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder q = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // com.google.android.gms.dynamite.g
    public final h0 j(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.q;
        CharsetDecoder charsetDecoder2 = this.p;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new h0(new c(null, null, bArr));
        }
        Matcher matcher = r.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strW = com.google.common.base.b.w(strGroup);
                strW.getClass();
                if (strW.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strW.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new h0(new c(str, str2, bArr));
    }
}
