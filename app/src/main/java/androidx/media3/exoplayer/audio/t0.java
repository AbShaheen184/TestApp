package androidx.media3.exoplayer.audio;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import com.google.common.collect.a1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {
    public static final a1 a = com.google.common.collect.h0.s(12);

    public static com.google.common.collect.h0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new f(0)).reversed());
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && androidx.media3.common.util.j0.M(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return com.google.common.collect.h0.o(treeSet);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0182  */
    /* JADX WARN: Code duplicated, block: B:130:0x019f A[RETURN] */
    public static com.google.common.collect.h0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        com.google.common.collect.h0 h0VarA;
        com.google.common.collect.h0 h0VarO;
        int speakerLayoutChannelMask;
        boolean zC = _COROUTINE.a.C(audioDeviceInfo.getType());
        a1 a1Var = a;
        if (!zC) {
            if (audioDeviceInfo.getType() == 1) {
                return com.google.common.collect.h0.s(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return com.google.common.collect.h0.s(Integer.valueOf(speakerLayoutChannelMask));
                }
                androidx.media3.common.util.c.t("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return a1Var;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && audioDeviceInfo.getType() == 10) {
                com.google.common.collect.h0 h0VarA2 = a(audioDeviceInfo);
                if (!h0VarA2.isEmpty()) {
                    return h0VarA2;
                }
                com.google.common.collect.h0 h0VarE = androidx.compose.ui.contentcapture.b.e(audioDeviceInfo.getAudioDescriptors());
                if (!h0VarE.isEmpty()) {
                    return h0VarE;
                }
            } else if (i >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i >= 31 && type2 == 29) {
                    com.google.common.collect.h0 h0VarA3 = a(audioDeviceInfo);
                    if (!h0VarA3.isEmpty()) {
                        return h0VarA3;
                    }
                    List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i >= 34) {
                        if (i < 34 || audioDescriptors == null) {
                            com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                            h0VarO = a1.B;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorA = androidx.media3.exoplayer.analytics.d.a(it.next());
                                if (audioDescriptorA.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorA.getDescriptor();
                                    if (descriptor.length != 3) {
                                        androidx.media3.common.util.c.t("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                    } else {
                                        int i2 = 0;
                                        if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                            byte b = descriptor[0];
                                            i2 = (b & 1) != 0 ? 12 : 0;
                                            if ((b & 2) != 0) {
                                                i2 |= 32;
                                            }
                                            if ((b & 4) != 0) {
                                                i2 |= 16;
                                            }
                                            if ((b & 8) != 0) {
                                                i2 |= 192;
                                            }
                                            if ((b & 16) != 0) {
                                                i2 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                                            }
                                            if ((b & 32) != 0) {
                                                i2 |= 768;
                                            }
                                            if ((b & 128) != 0) {
                                                i2 |= 201326592;
                                            }
                                            byte b2 = descriptor[1];
                                            if ((b2 & 1) != 0) {
                                                i2 |= 81920;
                                            }
                                            if ((b2 & 2) != 0) {
                                                i2 |= 8192;
                                            }
                                            if ((b2 & 4) != 0) {
                                                i2 |= 32768;
                                            }
                                            if ((b2 & 8) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 16) != 0) {
                                                i2 |= 33554432;
                                            }
                                            if ((b2 & 32) != 0) {
                                                i2 |= 262144;
                                            }
                                            if ((b2 & 64) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 128) != 0) {
                                                i2 |= 3145728;
                                            }
                                            byte b3 = descriptor[2];
                                            if ((b3 & 1) != 0) {
                                                i2 |= 655360;
                                            }
                                            if ((b3 & 2) != 0) {
                                                i2 = 8388608 | i2;
                                            }
                                            if ((b3 & 4) != 0) {
                                                i2 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                            arrayList.sort(new androidx.compose.foundation.lazy.layout.a(6));
                            h0VarO = com.google.common.collect.h0.o(arrayList);
                        }
                        if (!h0VarO.isEmpty()) {
                            return h0VarO;
                        }
                    }
                    com.google.common.collect.h0 h0VarE2 = androidx.compose.ui.contentcapture.b.e(audioDescriptors);
                    if (!h0VarE2.isEmpty()) {
                        return h0VarE2;
                    }
                } else if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    h0VarA = a(audioDeviceInfo);
                    if (!h0VarA.isEmpty()) {
                        return h0VarA;
                    }
                }
            } else if (i >= 31) {
                h0VarA = a(audioDeviceInfo);
                if (!h0VarA.isEmpty()) {
                    return h0VarA;
                }
            }
        }
        return a1Var;
    }
}
