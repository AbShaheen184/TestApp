package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final Object s = new Object();
    public static ScheduledExecutorService t;
    public static int u;
    public final AudioTrack a;
    public final p b;
    public final float c;
    public final com.google.firebase.platforminfo.c d;
    public com.google.firebase.messaging.o e;
    public final g0 f;
    public final boolean g;
    public final int h;
    public final c0 i;
    public final androidx.media3.common.util.p j = new androidx.media3.common.util.p(Thread.currentThread());
    public boolean k;
    public long l;
    public long m;
    public long n;
    public ByteBuffer o;
    public int p;
    public int q;
    public int r;

    public d0(AudioTrack audioTrack, p pVar, com.google.firebase.platforminfo.c cVar, float f, androidx.media3.common.util.e0 e0Var) {
        this.a = audioTrack;
        this.b = pVar;
        this.c = f;
        this.d = cVar;
        boolean zM = androidx.media3.common.util.j0.M(pVar.a);
        this.g = zM;
        if (zM) {
            this.h = androidx.media3.common.util.j0.u(pVar.a) * Integer.bitCount(pVar.c);
        } else {
            this.h = -1;
        }
        this.f = new g0(new com.app.mlounge.data.music.e(this, 28), e0Var, audioTrack, pVar.a, this.h, pVar.f);
        if (cVar != null) {
            this.e = new com.google.firebase.messaging.o(audioTrack, cVar);
        }
        this.i = c() ? new c0(this) : null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:101:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:116:0x0307  */
    /* JADX WARN: Code duplicated, block: B:122:0x0311  */
    /* JADX WARN: Code duplicated, block: B:125:0x031f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0354  */
    /* JADX WARN: Code duplicated, block: B:133:0x0357  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:57:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x0202  */
    /* JADX WARN: Code duplicated, block: B:63:0x0209  */
    /* JADX WARN: Code duplicated, block: B:64:0x020e  */
    /* JADX WARN: Code duplicated, block: B:68:0x021a  */
    /* JADX WARN: Code duplicated, block: B:70:0x021d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0220  */
    /* JADX WARN: Code duplicated, block: B:74:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0227  */
    /* JADX WARN: Code duplicated, block: B:78:0x022d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x022f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0235  */
    /* JADX WARN: Code duplicated, block: B:82:0x0238  */
    /* JADX WARN: Code duplicated, block: B:83:0x023d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0241  */
    /* JADX WARN: Code duplicated, block: B:88:0x024a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0273  */
    /* JADX WARN: Code duplicated, block: B:91:0x0278  */
    /* JADX WARN: Code duplicated, block: B:93:0x0282  */
    /* JADX WARN: Code duplicated, block: B:94:0x0287  */
    /* JADX WARN: Code duplicated, block: B:95:0x0292  */
    /* JADX WARN: Code duplicated, block: B:96:0x0297  */
    /* JADX WARN: Code duplicated, block: B:98:0x029c  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0171, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x01bf, please report this as an issue */
    public final long a() {
        androidx.media3.common.util.e0 e0Var;
        long j;
        boolean z;
        long jNanoTime;
        boolean z2;
        g0 g0Var;
        long jB;
        long jK;
        int playState;
        long j2;
        long j3;
        long jB2;
        long j4;
        int i;
        long j5;
        long j6;
        boolean z3;
        float f;
        long jB3;
        x xVar;
        x xVar2;
        int i2;
        AudioTimestamp audioTimestamp;
        boolean timestamp;
        boolean z4;
        AudioTimestamp audioTimestamp2;
        int i3;
        int i4;
        AudioTimestamp audioTimestamp3;
        long j7;
        AudioTimestamp audioTimestamp4;
        long j8;
        long j9;
        com.app.mlounge.data.music.e eVar;
        long j10;
        long jB4;
        long j11;
        long j12;
        Method method;
        Method method2;
        g0 g0Var2 = this.f;
        androidx.media3.common.util.e0 e0Var2 = g0Var2.b;
        y yVar = g0Var2.h;
        AudioTrack audioTrack = g0Var2.d;
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = g0Var2.c;
            e0Var2.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            j = 1000;
            if (jNanoTime2 - g0Var2.l >= 30000) {
                long jW = androidx.media3.common.util.j0.W(g0Var2.e, g0Var2.a());
                if (jW == 0) {
                    g0Var2 = g0Var2;
                    e0Var = e0Var2;
                    yVar = yVar;
                    audioTrack = audioTrack;
                } else {
                    jArr[g0Var2.s] = androidx.media3.common.util.j0.E(g0Var2.i, jW) - jNanoTime2;
                    g0Var2.s = (g0Var2.s + 1) % 10;
                    int i5 = g0Var2.t;
                    if (i5 < 10) {
                        g0Var2.t = i5 + 1;
                    }
                    g0Var2.l = jNanoTime2;
                    g0Var2.k = 0L;
                    int i6 = 0;
                    while (true) {
                        int i7 = g0Var2.t;
                        if (i6 >= i7) {
                            break;
                        }
                        g0Var2.k = (jArr[i6] / ((long) i7)) + g0Var2.k;
                        i6++;
                    }
                    j5 = g0Var2.n;
                    if (g0Var2.g || (method = g0Var2.m) == null) {
                        j6 = 500000;
                    } else {
                        j6 = 500000;
                        if (jNanoTime2 - g0Var2.o >= 500000) {
                            try {
                                Integer num = (Integer) method.invoke(audioTrack, null);
                                String str = androidx.media3.common.util.j0.a;
                                try {
                                    long jIntValue = (((long) num.intValue()) * 1000) - g0Var2.f;
                                    g0Var2.n = jIntValue;
                                    long jMax = Math.max(jIntValue, 0L);
                                    g0Var2.n = jMax;
                                    if (jMax > 10000000) {
                                        androidx.media3.common.util.c.t("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + jMax);
                                        g0Var2.n = 0L;
                                    }
                                } catch (Exception unused) {
                                    method2 = null;
                                    g0Var2.m = method2;
                                }
                            } catch (Exception unused2) {
                                method2 = null;
                            }
                            g0Var2.o = jNanoTime2;
                        }
                    }
                    if (j5 != g0Var2.n) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    f = g0Var2.i;
                    jB3 = g0Var2.b(jNanoTime2);
                    xVar = yVar.a;
                    xVar2 = yVar.a;
                    i2 = yVar.b;
                    if (!z3 || jNanoTime2 - yVar.g >= yVar.f) {
                        yVar.g = jNanoTime2;
                        AudioTrack audioTrack2 = xVar.a;
                        audioTimestamp = xVar.b;
                        timestamp = audioTrack2.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            j11 = audioTimestamp.framePosition;
                            j12 = xVar.d;
                            if (j12 > j11) {
                                e0Var = e0Var2;
                                if (xVar.f) {
                                    xVar.g += j12;
                                    xVar.f = false;
                                } else {
                                    xVar.c++;
                                }
                            } else {
                                e0Var = e0Var2;
                            }
                            xVar.d = j11;
                            xVar.e = j11 + xVar.g + (xVar.c << 32);
                        } else {
                            e0Var = e0Var2;
                        }
                        if (timestamp) {
                            eVar = yVar.c;
                            j10 = audioTimestamp.nanoTime / 1000;
                            z4 = timestamp;
                            audioTimestamp2 = audioTimestamp;
                            jB4 = androidx.media3.common.util.j0.B(f, jNanoTime2 - (xVar2.b.nanoTime / 1000)) + androidx.media3.common.util.j0.W(i2, xVar2.e);
                            if (Math.abs(j10 - jNanoTime2) > 5000000) {
                                long j13 = xVar.e;
                                eVar.getClass();
                                androidx.media3.common.util.c.t("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j13 + ", " + j10 + ", " + jNanoTime2 + ", " + jB3 + ", " + ((d0) eVar.y).b());
                                yVar.a(4);
                            } else {
                                yVar = yVar;
                                if (Math.abs(jB4 - jB3) > 5000000) {
                                    long j14 = xVar.e;
                                    eVar.getClass();
                                    audioTrack = audioTrack;
                                    androidx.media3.common.util.c.t("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j14 + ", " + j10 + ", " + jNanoTime2 + ", " + jB3 + ", " + ((d0) eVar.y).b());
                                    yVar = yVar;
                                    i3 = 4;
                                    yVar.a(4);
                                } else {
                                    audioTrack = audioTrack;
                                    i3 = 4;
                                    if (yVar.d == 4) {
                                        yVar.a(0);
                                    }
                                }
                            }
                            i4 = yVar.d;
                            if (i4 != 0) {
                                audioTimestamp3 = audioTimestamp2;
                                z = false;
                                if (z4) {
                                    j7 = audioTimestamp3.nanoTime;
                                    if (j7 / 1000 >= yVar.e) {
                                        yVar.h = xVar.e;
                                        yVar.i = j7 / 1000;
                                        yVar.a(1);
                                    }
                                } else if (jNanoTime2 - yVar.e > j6) {
                                    yVar.a(3);
                                }
                            } else if (i4 != 1) {
                                audioTimestamp4 = audioTimestamp2;
                                if (z4) {
                                    j8 = xVar.e;
                                    j9 = yVar.h;
                                    if (j8 <= j9) {
                                        if (Math.abs((androidx.media3.common.util.j0.B(f, jNanoTime2 - (xVar2.b.nanoTime / 1000)) + androidx.media3.common.util.j0.W(i2, xVar2.e)) - (androidx.media3.common.util.j0.B(f, jNanoTime2 - yVar.i) + androidx.media3.common.util.j0.W(i2, j9))) < 1000) {
                                            yVar.a(2);
                                        } else if (jNanoTime2 - yVar.e > 2000000) {
                                            yVar.a(3);
                                        } else {
                                            yVar.h = xVar.e;
                                            yVar.i = audioTimestamp4.nanoTime / 1000;
                                        }
                                    } else if (jNanoTime2 - yVar.e > 2000000) {
                                        yVar.a(3);
                                    } else {
                                        yVar.h = xVar.e;
                                        yVar.i = audioTimestamp4.nanoTime / 1000;
                                    }
                                } else {
                                    z = false;
                                    yVar.a(0);
                                }
                            } else if (i4 != 2) {
                                z = false;
                                if (!z4) {
                                    yVar.a(0);
                                }
                            } else if (i4 != 3) {
                                if (i4 != i3) {
                                    org.mozilla.javascript.c.a();
                                    return 0L;
                                }
                            } else if (z4) {
                                z = false;
                                yVar.a(0);
                            }
                        } else {
                            z4 = timestamp;
                            audioTimestamp2 = audioTimestamp;
                        }
                        i3 = 4;
                        i4 = yVar.d;
                        if (i4 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            z = false;
                            if (z4) {
                                j7 = audioTimestamp3.nanoTime;
                                if (j7 / 1000 >= yVar.e) {
                                    yVar.h = xVar.e;
                                    yVar.i = j7 / 1000;
                                    yVar.a(1);
                                }
                            } else if (jNanoTime2 - yVar.e > j6) {
                                yVar.a(3);
                            }
                        } else if (i4 != 1) {
                            audioTimestamp4 = audioTimestamp2;
                            if (z4) {
                                j8 = xVar.e;
                                j9 = yVar.h;
                                if (j8 <= j9) {
                                    if (Math.abs((androidx.media3.common.util.j0.B(f, jNanoTime2 - (xVar2.b.nanoTime / 1000)) + androidx.media3.common.util.j0.W(i2, xVar2.e)) - (androidx.media3.common.util.j0.B(f, jNanoTime2 - yVar.i) + androidx.media3.common.util.j0.W(i2, j9))) < 1000) {
                                        yVar.a(2);
                                    } else if (jNanoTime2 - yVar.e > 2000000) {
                                        yVar.a(3);
                                    } else {
                                        yVar.h = xVar.e;
                                        yVar.i = audioTimestamp4.nanoTime / 1000;
                                    }
                                } else if (jNanoTime2 - yVar.e > 2000000) {
                                    yVar.a(3);
                                } else {
                                    yVar.h = xVar.e;
                                    yVar.i = audioTimestamp4.nanoTime / 1000;
                                }
                            } else {
                                z = false;
                                yVar.a(0);
                            }
                        } else if (i4 != 2) {
                            z = false;
                            if (!z4) {
                                yVar.a(0);
                            }
                        } else if (i4 != 3) {
                            if (i4 != i3) {
                                org.mozilla.javascript.c.a();
                                return 0L;
                            }
                        } else if (z4) {
                            z = false;
                            yVar.a(0);
                        }
                    } else {
                        g0Var2 = g0Var2;
                        e0Var = e0Var2;
                        yVar = yVar;
                        audioTrack = audioTrack;
                    }
                }
            } else {
                j5 = g0Var2.n;
                if (g0Var2.g) {
                    j6 = 500000;
                } else {
                    j6 = 500000;
                }
                if (j5 != g0Var2.n) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                f = g0Var2.i;
                jB3 = g0Var2.b(jNanoTime2);
                xVar = yVar.a;
                xVar2 = yVar.a;
                i2 = yVar.b;
                if (z3) {
                }
                yVar.g = jNanoTime2;
                AudioTrack audioTrack3 = xVar.a;
                audioTimestamp = xVar.b;
                timestamp = audioTrack3.getTimestamp(audioTimestamp);
                if (timestamp) {
                    j11 = audioTimestamp.framePosition;
                    j12 = xVar.d;
                    if (j12 > j11) {
                        e0Var = e0Var2;
                        if (xVar.f) {
                            xVar.g += j12;
                            xVar.f = false;
                        } else {
                            xVar.c++;
                        }
                    } else {
                        e0Var = e0Var2;
                    }
                    xVar.d = j11;
                    xVar.e = j11 + xVar.g + (xVar.c << 32);
                } else {
                    e0Var = e0Var2;
                }
                if (timestamp) {
                    eVar = yVar.c;
                    j10 = audioTimestamp.nanoTime / 1000;
                    z4 = timestamp;
                    audioTimestamp2 = audioTimestamp;
                    jB4 = androidx.media3.common.util.j0.B(f, jNanoTime2 - (xVar2.b.nanoTime / 1000)) + androidx.media3.common.util.j0.W(i2, xVar2.e);
                    if (Math.abs(j10 - jNanoTime2) > 5000000) {
                        long j15 = xVar.e;
                        eVar.getClass();
                        androidx.media3.common.util.c.t("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j15 + ", " + j10 + ", " + jNanoTime2 + ", " + jB3 + ", " + ((d0) eVar.y).b());
                        yVar.a(4);
                    } else {
                        yVar = yVar;
                        if (Math.abs(jB4 - jB3) > 5000000) {
                            long j16 = xVar.e;
                            eVar.getClass();
                            audioTrack = audioTrack;
                            androidx.media3.common.util.c.t("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j16 + ", " + j10 + ", " + jNanoTime2 + ", " + jB3 + ", " + ((d0) eVar.y).b());
                            yVar = yVar;
                            i3 = 4;
                            yVar.a(4);
                        } else {
                            audioTrack = audioTrack;
                            i3 = 4;
                            if (yVar.d == 4) {
                                yVar.a(0);
                            }
                        }
                    }
                    i4 = yVar.d;
                    if (i4 != 0) {
                        audioTimestamp3 = audioTimestamp2;
                        z = false;
                        if (z4) {
                            j7 = audioTimestamp3.nanoTime;
                            if (j7 / 1000 >= yVar.e) {
                                yVar.h = xVar.e;
                                yVar.i = j7 / 1000;
                                yVar.a(1);
                            }
                        } else if (jNanoTime2 - yVar.e > j6) {
                            yVar.a(3);
                        }
                    } else if (i4 != 1) {
                        audioTimestamp4 = audioTimestamp2;
                        if (z4) {
                            j8 = xVar.e;
                            j9 = yVar.h;
                            if (j8 <= j9) {
                                if (Math.abs((androidx.media3.common.util.j0.B(f, jNanoTime2 - (xVar2.b.nanoTime / 1000)) + androidx.media3.common.util.j0.W(i2, xVar2.e)) - (androidx.media3.common.util.j0.B(f, jNanoTime2 - yVar.i) + androidx.media3.common.util.j0.W(i2, j9))) < 1000) {
                                    yVar.a(2);
                                } else if (jNanoTime2 - yVar.e > 2000000) {
                                    yVar.a(3);
                                } else {
                                    yVar.h = xVar.e;
                                    yVar.i = audioTimestamp4.nanoTime / 1000;
                                }
                            } else if (jNanoTime2 - yVar.e > 2000000) {
                                yVar.a(3);
                            } else {
                                yVar.h = xVar.e;
                                yVar.i = audioTimestamp4.nanoTime / 1000;
                            }
                        } else {
                            z = false;
                            yVar.a(0);
                        }
                    } else if (i4 != 2) {
                        z = false;
                        if (!z4) {
                            yVar.a(0);
                        }
                    } else if (i4 != 3) {
                        if (i4 != i3) {
                            org.mozilla.javascript.c.a();
                            return 0L;
                        }
                    } else if (z4) {
                        z = false;
                        yVar.a(0);
                    }
                } else {
                    z4 = timestamp;
                    audioTimestamp2 = audioTimestamp;
                }
                i3 = 4;
                i4 = yVar.d;
                if (i4 != 0) {
                    audioTimestamp3 = audioTimestamp2;
                    z = false;
                    if (z4) {
                        j7 = audioTimestamp3.nanoTime;
                        if (j7 / 1000 >= yVar.e) {
                            yVar.h = xVar.e;
                            yVar.i = j7 / 1000;
                            yVar.a(1);
                        }
                    } else if (jNanoTime2 - yVar.e > j6) {
                        yVar.a(3);
                    }
                } else if (i4 != 1) {
                    audioTimestamp4 = audioTimestamp2;
                    if (z4) {
                        j8 = xVar.e;
                        j9 = yVar.h;
                        if (j8 <= j9) {
                            if (Math.abs((androidx.media3.common.util.j0.B(f, jNanoTime2 - (xVar2.b.nanoTime / 1000)) + androidx.media3.common.util.j0.W(i2, xVar2.e)) - (androidx.media3.common.util.j0.B(f, jNanoTime2 - yVar.i) + androidx.media3.common.util.j0.W(i2, j9))) < 1000) {
                                yVar.a(2);
                            } else if (jNanoTime2 - yVar.e > 2000000) {
                                yVar.a(3);
                            } else {
                                yVar.h = xVar.e;
                                yVar.i = audioTimestamp4.nanoTime / 1000;
                            }
                        } else if (jNanoTime2 - yVar.e > 2000000) {
                            yVar.a(3);
                        } else {
                            yVar.h = xVar.e;
                            yVar.i = audioTimestamp4.nanoTime / 1000;
                        }
                    } else {
                        z = false;
                        yVar.a(0);
                    }
                } else if (i4 != 2) {
                    z = false;
                    if (!z4) {
                        yVar.a(0);
                    }
                } else if (i4 != 3) {
                    if (i4 != i3) {
                        org.mozilla.javascript.c.a();
                        return 0L;
                    }
                } else if (z4) {
                    z = false;
                    yVar.a(0);
                }
            }
            e0Var.getClass();
            jNanoTime = System.nanoTime() / j;
            if (yVar.d == 2) {
                z2 = true;
            } else {
                z2 = z;
            }
            if (z2) {
                g0Var = g0Var2;
                float f2 = g0Var.i;
                x xVar3 = yVar.a;
                jB = androidx.media3.common.util.j0.B(f2, jNanoTime - (xVar3.b.nanoTime / j)) + androidx.media3.common.util.j0.W(yVar.b, xVar3.e);
            } else {
                g0Var = g0Var2;
                jB = g0Var.b(jNanoTime);
            }
            jK = jB;
            playState = audioTrack.getPlayState();
            if (playState == 3) {
                if (z2 || ((i = yVar.d) != 0 && i != 1)) {
                    g0Var.d(jK);
                }
                j2 = g0Var.z;
                if (j2 != -9223372036854775807L) {
                    j3 = jK - g0Var.y;
                    jB2 = androidx.media3.common.util.j0.B(g0Var.i, jNanoTime - j2);
                    j4 = g0Var.y + jB2;
                    long jAbs = Math.abs(j4 - jK);
                    if (j3 != 0 && jAbs < 1000000) {
                        long j17 = (jB2 * 10) / 100;
                        jK = androidx.media3.common.util.j0.k(jK, j4 - j17, j4 + j17);
                    }
                }
                g0Var.z = jNanoTime;
                g0Var.y = jK;
            } else if (playState == 1) {
                g0Var.d(jK);
            }
            return jK;
        }
        g0Var2 = g0Var2;
        e0Var = e0Var2;
        yVar = yVar;
        audioTrack = audioTrack;
        j = 1000;
        z = false;
        e0Var.getClass();
        jNanoTime = System.nanoTime() / j;
        if (yVar.d == 2) {
            z2 = true;
        } else {
            z2 = z;
        }
        if (z2) {
            g0Var = g0Var2;
            float f3 = g0Var.i;
            x xVar4 = yVar.a;
            jB = androidx.media3.common.util.j0.B(f3, jNanoTime - (xVar4.b.nanoTime / j)) + androidx.media3.common.util.j0.W(yVar.b, xVar4.e);
        } else {
            g0Var = g0Var2;
            jB = g0Var.b(jNanoTime);
        }
        jK = jB;
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z2) {
                g0Var.d(jK);
            } else {
                g0Var.d(jK);
            }
            j2 = g0Var.z;
            if (j2 != -9223372036854775807L) {
                j3 = jK - g0Var.y;
                jB2 = androidx.media3.common.util.j0.B(g0Var.i, jNanoTime - j2);
                j4 = g0Var.y + jB2;
                long jAbs2 = Math.abs(j4 - jK);
                if (j3 != 0) {
                    long j18 = (jB2 * 10) / 100;
                    jK = androidx.media3.common.util.j0.k(jK, j4 - j18, j4 + j18);
                }
            }
            g0Var.z = jNanoTime;
            g0Var.y = jK;
        } else if (playState == 1) {
            g0Var.d(jK);
        }
        return jK;
    }

    public final long b() {
        if (!this.g) {
            return this.m;
        }
        long j = this.l;
        long j2 = this.h;
        String str = androidx.media3.common.util.j0.a;
        return ((j + j2) - 1) / j2;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final void d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        g0 g0Var = this.f;
        g0Var.A = true;
        g0Var.h.a.f = true;
    }

    public final void f(androidx.media3.exoplayer.analytics.k kVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdA = kVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.a.setLogSessionId(logSessionIdA);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    public final boolean g(int i, long j, ByteBuffer byteBuffer) {
        int iWrite;
        boolean z;
        com.google.firebase.platforminfo.c cVar;
        f0 f0Var;
        e eVar;
        long j2 = j;
        p pVar = this.b;
        boolean z2 = this.g;
        if (!z2 && this.q == 0) {
            this.q = n0.i(byteBuffer, pVar.a);
        }
        androidx.media3.common.util.p pVar2 = this.j;
        pVar2.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = pVar2.a;
        AudioTrack audioTrack = this.a;
        if (threadCurrentThread == thread) {
            b();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.r;
            this.r = underrunCount;
            if (z3) {
                pVar2.e(-1, new androidx.media3.exoplayer.analytics.d(24));
            }
        }
        int iRemaining = byteBuffer.remaining();
        if (pVar.d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.n;
            } else {
                this.n = j2;
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j2 * 1000);
            } else {
                if (this.o == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.o = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.o.putInt(1431633921);
                }
                if (this.p == 0) {
                    this.o.putInt(4, iRemaining2);
                    this.o.putLong(8, j2 * 1000);
                    this.o.position(0);
                    this.p = iRemaining2;
                }
                int iRemaining3 = this.o.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.p = 0;
                    } else {
                        this.p -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.o, iRemaining3, 1);
                    if (iWrite2 < 0) {
                        this.p = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining3) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.p = 0;
                        } else {
                            this.p -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.l += (long) iWrite;
                return z;
            }
            if (z) {
                this.m = (((long) this.q) * ((long) i)) + this.m;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (cVar = this.d) != null && (eVar = (f0Var = (f0) cVar.e).i) != null) {
            b bVar = b.f;
            f0Var.h = bVar;
            eVar.b(bVar);
        }
        throw new i(iWrite, z);
    }
}
