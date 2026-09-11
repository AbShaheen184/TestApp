package com.app.mlounge.emulator;

import android.content.Context;
import android.media.AudioTrack;
import java.io.File;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class LibretroCore {
    public static final int $stable = 8;
    private static final int AUDIO_CHANNELS = 12;
    private static final int AUDIO_FORMAT = 2;
    private static final int AUDIO_SAMPLE_RATE = 32040;
    public static final int BUTTON_A = 8;
    public static final int BUTTON_B = 0;
    public static final int BUTTON_DOWN = 5;
    public static final int BUTTON_L = 10;
    public static final int BUTTON_LEFT = 6;
    public static final int BUTTON_R = 11;
    public static final int BUTTON_RIGHT = 7;
    public static final int BUTTON_SELECT = 2;
    public static final int BUTTON_START = 3;
    public static final int BUTTON_UP = 4;
    public static final int BUTTON_X = 9;
    public static final int BUTTON_Y = 1;
    public static final n Companion = new n();
    public static final int PSP_SCREEN_HEIGHT = 272;
    public static final int PSP_SCREEN_WIDTH = 480;
    public static final int SCREEN_HEIGHT = 224;
    public static final int SCREEN_WIDTH = 256;
    private static final String TAG = "LibretroCore";
    private static boolean nativeAvailable;
    private String activeCorePath;
    private short[] audioBuffer;
    private AudioTrack audioTrack;
    private double coreFps;
    private boolean coreLoaded;
    private double coreSampleRate;
    private boolean gameLoaded;
    private final String saveDir;
    private final String systemDir;
    private int[] videoBuffer;
    private int videoHeight;
    private int videoWidth;

    static {
        try {
            System.loadLibrary("retrowrapper");
            nativeAvailable = true;
            o oVar = com.app.mlounge.util.a.a;
        } catch (UnsatisfiedLinkError e) {
            o oVar2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.f(TAG, "retrowrapper not available: " + e.getMessage());
        }
    }

    public LibretroCore(Context context) {
        context.getClass();
        this.videoBuffer = new int[57344];
        this.videoWidth = SCREEN_WIDTH;
        this.videoHeight = SCREEN_HEIGHT;
        this.audioBuffer = new short[2136];
        this.coreFps = 60.0d;
        this.coreSampleRate = 32040.0d;
        File filesDir = context.getFilesDir();
        File file = new File(filesDir, "system");
        file.mkdirs();
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        this.systemDir = absolutePath;
        File file2 = new File(filesDir, "saves");
        file2.mkdirs();
        String absolutePath2 = file2.getAbsolutePath();
        absolutePath2.getClass();
        this.saveDir = absolutePath2;
    }

    private final void initAudio() {
        int iC = com.google.android.material.resources.c.c((int) this.coreSampleRate, 8000, 48000);
        AudioTrack audioTrack = new AudioTrack(3, iC, 12, 2, Math.max(AudioTrack.getMinBufferSize(iC, 12, 2), ((int) ((((double) iC) / this.coreFps) * ((double) 2))) * 16), 1);
        audioTrack.play();
        this.audioTrack = audioTrack;
    }

    private final native void nativeDeinitCore();

    private final native int nativeGetAudioBuffer(short[] sArr);

    private final native int[] nativeGetCurrentDimensions();

    private final native int[] nativeGetGameDimensions();

    private final native int nativeGetHwTextureId();

    private final native byte[] nativeGetSRAM();

    private final native int nativeGetSaveStateSize();

    private final native double[] nativeGetTiming();

    private final native void nativeGetVideoBuffer(int[] iArr);

    private final native boolean nativeInitCore(String str, String str2, String str3);

    private final native boolean nativeIsHwFrameReady();

    private final native boolean nativeIsHwRender();

    private final native boolean nativeLoadGame(String str);

    private final native boolean nativeLoadState(byte[] bArr);

    private final native void nativeOnGlContextReady();

    private final native void nativeReset();

    private final native void nativeRunFrame();

    private final native boolean nativeSaveState(byte[] bArr);

    private final native void nativeSetInputState(int i);

    private final native void nativeSetSRAM(byte[] bArr);

    private final native void nativeUnloadGame();

    private final boolean queryInput(int i, int i2, int i3, int i4) {
        return false;
    }

    public final double getCoreFps() {
        return this.coreFps;
    }

    public final double getCoreSampleRate() {
        return this.coreSampleRate;
    }

    public final boolean getGameLoaded() {
        return this.gameLoaded;
    }

    public final int getHwTextureId() {
        if (nativeAvailable) {
            return nativeGetHwTextureId();
        }
        return 0;
    }

    public final byte[] getSRAM() {
        if (this.gameLoaded) {
            return nativeGetSRAM();
        }
        return null;
    }

    public final int[] getVideoBuffer() {
        return this.videoBuffer;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final boolean initCore(String str) {
        str.getClass();
        if (!nativeAvailable) {
            return false;
        }
        try {
            initAudio();
            this.activeCorePath = str;
            boolean zNativeInitCore = nativeInitCore(str, this.systemDir, this.saveDir);
            this.coreLoaded = zNativeInitCore;
            o oVar = com.app.mlounge.util.a.a;
            return zNativeInitCore;
        } catch (Exception e) {
            com.app.mlounge.util.a.b(TAG, "Error initializing core", e);
            return false;
        }
    }

    public final boolean isHwFrameReady() {
        return nativeAvailable && nativeIsHwFrameReady();
    }

    public final boolean isHwRender() {
        return nativeAvailable && nativeIsHwRender();
    }

    public final boolean loadGame(String str) {
        int i;
        int i2;
        str.getClass();
        if (!this.coreLoaded) {
            return false;
        }
        boolean zNativeLoadGame = nativeLoadGame(str);
        this.gameLoaded = zNativeLoadGame;
        if (zNativeLoadGame) {
            String str2 = this.activeCorePath;
            boolean z = str2 != null && kotlin.text.k.T(str2, "ppsspp", true);
            int[] iArrNativeGetGameDimensions = nativeGetGameDimensions();
            if (iArrNativeGetGameDimensions != null) {
                if (iArrNativeGetGameDimensions.length >= 2 && (i = iArrNativeGetGameDimensions[0]) > 0 && (i2 = iArrNativeGetGameDimensions[1]) > 0) {
                    this.videoWidth = i;
                    this.videoHeight = i2;
                    this.videoBuffer = new int[i * i2];
                } else if (z) {
                    this.videoWidth = PSP_SCREEN_WIDTH;
                    this.videoHeight = PSP_SCREEN_HEIGHT;
                    this.videoBuffer = new int[PSP_SCREEN_WIDTH * PSP_SCREEN_HEIGHT];
                }
            }
            double[] dArrNativeGetTiming = nativeGetTiming();
            if (dArrNativeGetTiming != null && dArrNativeGetTiming.length >= 2) {
                this.coreFps = dArrNativeGetTiming[0];
                this.coreSampleRate = dArrNativeGetTiming[1];
                o oVar = com.app.mlounge.util.a.a;
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null) {
                    audioTrack.stop();
                    audioTrack.release();
                }
                initAudio();
                this.audioBuffer = new short[((int) (this.coreSampleRate / this.coreFps)) * 8];
            }
            o oVar2 = com.app.mlounge.util.a.a;
        }
        return this.gameLoaded;
    }

    public final boolean loadState(byte[] bArr) {
        bArr.getClass();
        if (this.gameLoaded) {
            return nativeLoadState(bArr);
        }
        return false;
    }

    public final void onGlContextReady() {
        if (nativeAvailable) {
            nativeOnGlContextReady();
        }
    }

    public final void reset() {
        if (this.gameLoaded) {
            nativeReset();
        }
    }

    public final void runFrame() {
        AudioTrack audioTrack;
        int i;
        int i2;
        if (this.gameLoaded) {
            nativeRunFrame();
            int[] iArrNativeGetCurrentDimensions = nativeGetCurrentDimensions();
            if (iArrNativeGetCurrentDimensions != null && iArrNativeGetCurrentDimensions.length >= 2 && (i = iArrNativeGetCurrentDimensions[0]) > 0 && (i2 = iArrNativeGetCurrentDimensions[1]) > 0 && (i != this.videoWidth || i2 != this.videoHeight)) {
                this.videoWidth = i;
                this.videoHeight = i2;
                this.videoBuffer = new int[i * i2];
                o oVar = com.app.mlounge.util.a.a;
            }
            if (this.videoBuffer.length == 0) {
                this.videoWidth = SCREEN_WIDTH;
                this.videoHeight = SCREEN_HEIGHT;
                this.videoBuffer = new int[SCREEN_WIDTH * SCREEN_HEIGHT];
            }
            nativeGetVideoBuffer(this.videoBuffer);
            int iNativeGetAudioBuffer = nativeGetAudioBuffer(this.audioBuffer);
            if (iNativeGetAudioBuffer <= 0 || (audioTrack = this.audioTrack) == null) {
                return;
            }
            audioTrack.write(this.audioBuffer, 0, iNativeGetAudioBuffer * 2, 0);
        }
    }

    public final byte[] saveState() {
        int iNativeGetSaveStateSize;
        if (!this.gameLoaded || (iNativeGetSaveStateSize = nativeGetSaveStateSize()) <= 0) {
            return null;
        }
        byte[] bArr = new byte[iNativeGetSaveStateSize];
        if (nativeSaveState(bArr)) {
            return bArr;
        }
        return null;
    }

    public final void setInput(int i) {
        nativeSetInputState(i);
    }

    public final void setSRAM(byte[] bArr) {
        bArr.getClass();
        if (this.gameLoaded) {
            nativeSetSRAM(bArr);
        }
    }

    public final void shutdown() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            audioTrack.release();
        }
        this.audioTrack = null;
        if (this.gameLoaded) {
            nativeUnloadGame();
            this.gameLoaded = false;
        }
        if (this.coreLoaded) {
            nativeDeinitCore();
            this.coreLoaded = false;
        }
    }
}
