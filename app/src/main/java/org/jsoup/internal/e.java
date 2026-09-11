package org.jsoup.internal;

import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Reader {
    public final a e;
    public final CharsetDecoder y;
    public ByteBuffer z;

    public e(a aVar, Charset charset) {
        this.e = aVar;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.y = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) d.D.m());
        this.z = byteBufferWrap;
        byteBufferWrap.flip();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ByteBuffer byteBuffer = this.z;
        if (byteBuffer == null) {
            return;
        }
        d.D.z(byteBuffer.array());
        this.z = null;
        this.e.close();
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws CharacterCodingException {
        CharsetDecoder charsetDecoder;
        n.H(this.z);
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z = false;
        while (true) {
            ByteBuffer byteBuffer = this.z;
            charsetDecoder = this.y;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBufferWrap, z);
            if (coderResultDecode.isUnderflow()) {
                if (z || !charBufferWrap.hasRemaining()) {
                    break;
                }
                int iPosition = charBufferWrap.position();
                a aVar = this.e;
                if (iPosition > 0) {
                    try {
                        if (aVar.available() <= 0) {
                            break;
                        }
                    } catch (IOException unused) {
                    }
                }
                this.z.compact();
                try {
                    int iPosition2 = this.z.position();
                    int iRemaining = aVar.read(this.z.array(), this.z.arrayOffset() + iPosition2, this.z.limit() - iPosition2);
                    if (iRemaining < 0) {
                        this.z.flip();
                    } else {
                        if (iRemaining == 0) {
                            throw new IOException("Underlying input stream returned zero bytes");
                        }
                        this.z.position(iPosition2 + iRemaining);
                        this.z.flip();
                        iRemaining = this.z.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBufferWrap.position() == 0 && !this.z.hasRemaining()) {
                            z = true;
                            break;
                        }
                        z = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    this.z.flip();
                    throw th;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z) {
            charsetDecoder.reset();
        }
        if (charBufferWrap.position() == 0) {
            return z ? -1 : 0;
        }
        return charBufferWrap.position();
    }
}
