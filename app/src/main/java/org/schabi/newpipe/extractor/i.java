package org.schabi.newpipe.extractor;

import com.app.mlounge.emulator.LibretroCore;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum i {
    MPEG_4("mp4", 0),
    v3GPP("3gp", 16),
    WEBM("webm", 32),
    M4A("m4a", LibretroCore.SCREEN_WIDTH),
    WEBMA("webm", 512),
    MP3("mp3", 768),
    /* JADX INFO: Fake field, exist only in values array */
    MP2("mp2", 784),
    OPUS("opus", LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY),
    OGG("ogg", 1280),
    WEBMA_OPUS("webm", 512),
    /* JADX INFO: Fake field, exist only in values array */
    AIFF("aiff", 1536),
    /* JADX INFO: Fake field, exist only in values array */
    AIF("aif", 1536),
    /* JADX INFO: Fake field, exist only in values array */
    WAV("wav", 1792),
    /* JADX INFO: Fake field, exist only in values array */
    FLAC("flac", 2048),
    /* JADX INFO: Fake field, exist only in values array */
    ALAC("alac", 2304),
    /* JADX INFO: Fake field, exist only in values array */
    VTT("vtt", 4096),
    TTML("ttml", 8192),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSCRIPT1("srv1", 12288),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSCRIPT2("srv2", 16384),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSCRIPT3("srv3", 20480),
    /* JADX INFO: Fake field, exist only in values array */
    SRT("srt", 24576);

    public final int e;
    public final String y;

    i(String str, int i) {
        this.e = i;
        this.y = str;
    }

    public static i a(String str) {
        return (i) Arrays.stream(values()).filter(new h(str, 0)).findFirst().orElse(null);
    }
}
